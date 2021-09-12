package e.io;

import java.io.File;

public class FileCrawl {
    public static void main(String[] args) {
        FileCrawl sample = new FileCrawl();
        String pathName = File.separator+"Users"+File.separator+"haesoljang";
        sample.checkList(pathName);
    }
    public void checkList(String pathName){
        File file;
        try{
            file = new File(pathName);
            File[] maiinFileList = file.listFiles(new JPEGFileFilter());
            for(File tempFile:maiinFileList){
                System.out.println(tempFile.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
