package com.gameapp.utility;

import com.gameapp.model.Question;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReaderUtility {

    public static void main(String[] args) throws Exception {
        FileReaderUtility fru = new FileReaderUtility();
        List<Question> result = fru.loadQuestions(ConstantsUtility.QUESTIONS_FILE_PATH);
    }

    public List<Question> loadQuestions(String path) {
        try {
            URL url = new File(ConstantsUtility.QUESTIONS_FILE_PATH).toURI().toURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(FileReaderUtility.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<String> data = loadFile(path);
        List<Question> questionsTmp = castToQuestions(data);
        return questionsTmp;
    }

    private List<String> loadFile(String path) {
        List<String> data = new ArrayList<>();

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(new File(path));
            br = new BufferedReader(fr);
            String linea;
            boolean primerRenglón = true;
            while ((linea = br.readLine()) != null) {
                if (primerRenglón) {
                    primerRenglón = false; // titles
                } else {
                    data.add(linea);
                }
            }
            fr.close();
            br.close();

        } catch (Exception ex) {
            Logger.getLogger(FileReaderUtility.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(FileReaderUtility.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return data;
    }

    public void saveFile(String data) {

    }

    private List<Question> castToQuestions(List<String> data) {

        int numero = 0;
        float score = 0;
        
        List<Integer> flags = new ArrayList<>();
        
        List<Question> questionsTmp = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(i<6){
                numero = (int)(Math.random()*(ConstantsUtility.UMBRAL_HARD_QUESTIONS));
            }else{
                numero = (int)(Math.random()*(data.size()-1-ConstantsUtility.UMBRAL_HARD_QUESTIONS)+ConstantsUtility.UMBRAL_HARD_QUESTIONS);
            }
            if(flags.contains(numero)){
                i-=1;
                continue;
            }else{
                flags.add(numero);
            }
            String[] splited = data.get(numero).split(";");
          
            String[] options = new String[4];
            options[0] = splited[1].trim();
            options[1] = splited[2].trim();
            options[2] = splited[3].trim();
            options[3] = splited[4].trim();
            if(i<2){
                score = 100;
            }else{
                score = 2*score;
            }

            Question tmp = new Question(i, splited[0].trim(), options, Integer.parseInt(splited[5].trim()),
                    score);
            questionsTmp.add(tmp);
        }
        return questionsTmp;
    }

}
