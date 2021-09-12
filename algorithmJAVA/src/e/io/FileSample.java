package e.io;

import java.io.File;
import java.io.FileFilter;

public class FileSample {
    public static void main(String[] args) {
        FileSample fileSample = new FileSample();
        String pathName = File.separator + "Users" + File.separator+"haesoljang"+File.separator+"text.txt";
        fileSample.checkPath(pathName);
        JPEGFileFilter getFilter = new JPEGFileFilter();
        File file = new File(pathName);
        System.out.println(getFilter.accept(file));
    }
    public void checkPath(String pathName){
        File file = new File(pathName);
        System.out.println(pathName+"is exits? = " + file.exists());
//        if(!file.exists()){
//            file.mkdir();
//        }

        System.out.println(file.getParent());


    }
}
class JPEGFileFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        if (file.isFile()) {
            String fileName = file.getName();
            if (fileName.endsWith(".jpeg")) return true;
        }
        return false;
    }
}