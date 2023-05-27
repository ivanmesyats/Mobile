package org.example;

public class Main {
    public static void main(String[] args) {

        Model newPhone = new Model();
        Model secondPhone = new Model();

        Apple newApple = new Apple();

        //newPhone.modelName = "Apple";
        newPhone.modelName = "Iphone XS";
        //secondPhone.modelName = "Samsung";
        secondPhone.modelName = "Galaxy S20+";

        newPhone.print();
        secondPhone.print();

        newApple.print();

        }
    }
