package com.company;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Linereader {

    public static ArrayList<String> string(String arg) throws Exception
    {
        // pass the path to the file as a parameter
        if(!Files.exists(FileSystems.getDefault().getPath("pliki"))){
        try{
            Files.createDirectories(FileSystems.getDefault().getPath("pliki"));
        }catch (IOException e){
            e.printStackTrace();
        }
        }
        Path path = FileSystems.getDefault().getPath("pliki", arg+".txt");
        File bazanazw = new File(String.valueOf(path));
        bazanazw.createNewFile();
        Scanner sc = new Scanner(bazanazw);
        ArrayList<String> listanazw = new ArrayList();

        while (sc.hasNextLine())
            listanazw.add(sc.nextLine());

        return listanazw;
    }
}
