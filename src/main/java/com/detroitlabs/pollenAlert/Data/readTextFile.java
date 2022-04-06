package com.detroitlabs.pollenAlert.Data;

import com.fasterxml.jackson.datatype.jsr310.ser.DurationSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readTextFile {
    File file = new File("resources/static/cities");
    Scanner lat = new Scanner(file);
    Scanner usrInput = new Scanner(System.in);

    public readTextFile() throws FileNotFoundException {
        int num = usrInput.nextInt();
        System.out.println("this is the first number " + num);

    }
}
