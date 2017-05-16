package com.devix.company;

import static com.devix.company.Main.Program.getValue;

public class Main {

    public static void main(String[] args) {

        String name = "A";
        int result = getValue(name);
        System.out.println(result);
        System.out.println(getValue("B"));
    }

    public static class Program {
        static int getValue(String name) {
            switch (name) {
                case "A":
                    return 1;
                case "B":
                    return 2;
            }
            return 0;
        }
    }
}
