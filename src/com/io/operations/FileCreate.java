package com.io.operations;

import java.io.File;
import java.io.FileDescriptor;

public class FileCreate {

    public static void main(String[] args) throws Exception {


        /**
         *   FILE operations
         */

        // create new path
        FileDescriptor fileDescriptor = new FileDescriptor();
        File newFile = new File("/Users/Avvarus/Desktop/core/myFile.txt");

        if (newFile.createNewFile()) {
            System.out.println("File created sucessfully !!");

        }
        if (newFile.exists()) {
            System.out.println("File already exists !!");
        } else {
            System.out.println("Execution not sucesss!! ");
        }

    }
}
