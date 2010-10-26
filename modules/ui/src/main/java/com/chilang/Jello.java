package com.chilang;

import com.chilang.Core;

public class Jello {
    public static void main(String[] args) {
        Core printer = new Core() {
            @Override
            public String sayHello(Named named) {
                return "Jello "+named.name();
            }
        };

        String out = printer.sayHello(new Named() {
            @Override
            public String name() {
                return "via Scala";
            }
        });
        System.out.println(out);
    }
}
