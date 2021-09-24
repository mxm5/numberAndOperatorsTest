package com.company;

import java.io.*;

public class FileIo {
    public static String fileName = "myFile.txt";
    public static String fileName2 = "second.exe";

    public static void main(String[] args) throws IOException {
//        recreate();
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile("this.txt", "rw");
            System.out.println("file accessed");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        byte[] bytes = ;
//        randomAccessFile.write(bytes);
    }

    private static void recreate() throws IOException {
        File file = new File(fileName);
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());
        System.out.println(file.getTotalSpace());
        if (file.createNewFile()) {
            System.out.println("new file created");
        } else {
            System.out.println("file already exists");
        }
    }

    private static void readCharacter() throws IOException {
        FileReader fileReader = new FileReader(fileName);
        FileWriter fileWriter = new FileWriter(fileName, true);
        fileWriter.append("moahammad\n");
        fileWriter.append("ali\n");
        fileWriter.append("hossein\n");
        int charRead;
        while (-1 != (charRead = fileReader.read())) {
            System.out.print(((char) charRead));
        }

        fileReader.close();
        fileWriter.close();
    }
}
