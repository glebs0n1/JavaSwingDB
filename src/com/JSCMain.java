package com;


import com.repository.ObjectRepository;
import com.ui.JSCFrame;

public class JSCMain {

    public static void main(String[] args) {

        try {
            JSCFrame frame = new JSCFrame(new ObjectRepository<>("contacts.dat"));
            frame.setVisible(true);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

    }

}