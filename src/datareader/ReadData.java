package datareader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadData {
    public static void main(String[] args) {
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;

        String filePath="C:\\Users\\hassa\\IdeaProjects\\LearnJava_WeekendMorningSeleniumNY_Winter2020\\DataTest\\Sample.txt";

        try{
            fileReader=new FileReader(filePath);
            bufferedReader=new BufferedReader(fileReader);
            String data;

            while ((data=bufferedReader.readLine()) !=null){
                System.out.println(data);
            }

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("File Not Found");
        } finally {
            // Finally Is A Block Which Will Execute Must.
            try{
                fileReader.close();
                bufferedReader.close();
            } catch (Exception e){
                e.printStackTrace();
                System.out.println("File Already Close");
            }


        }







    }



}
