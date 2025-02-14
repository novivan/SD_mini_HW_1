package no_group;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import no_group.di.SimpleContainer;
import no_group.model.animals.Monkey;
import no_group.model.animals.Rabbit;
import no_group.model.animals.Tiger;
import no_group.model.animals.Wolf;
import no_group.model.places.Zoo;


public class Main {
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleContainer container = new SimpleContainer();
        try {
            container.register(Zoo.class);

            Zoo zoo = container.get(Zoo.class);

            System.out.println("Добро пожаловать в наш зоопарк! Вот все опции, которые у нас есть:");

            System.out.println("1. Добавить животное. Команда выглядит так: \'add <тип животного> <все \"поля\" этого типа животного через пробел в порядке описания в тз>\'");
            System.out.println("\tПримеры:");
            System.out.println("\t\t add Monkey 5 3");
            System.out.println("(сначала кол-во потребляемой еды в кг, потом безобидность (от 0 дло 10, иначе она будет выставлена автоматически))");
            System.out.println("\t\t add Rabbit 5 3");
            System.out.println("\t\t add Tiger 3");
            System.out.println("\t\t add Wolf 3");

            System.out.println("2. Получить отчет по кол-ву животных. Команда: \'amount of animals\'");
            System.out.println("3. Получить отчет по кол-ву еды, потребляемой животными. Команда: \'consumption\'");
            System.out.println("4. Получить списки тех животных, которые могут быть помещены в контактный зоопарк. Команда: \'safe\'"); 
            System.out.println("5. Получить общий отчет по всему \"инвентарю\". Команда: \'full inventory\'");


            System.out.println("n. Выход из программы. Команда: \'exit\'");

            System.out.println("Названия команд и типы животных пишутся строго, как в инструкции выше!!!");


            while (true) {
                System.out.println("Введите вашу команду:");
                List<String> input = Arrays.asList(scanner.nextLine().split(" "));

                if (input.size() == 1) {
                    if (input.get(0).equals("consumption")) {
                        zoo.consumptionReport();
                    } else if (input.get(0).equals("safe")) {
                        zoo.listSafeAnimals();
                    } else if (input.get(0).equals("exit")) {
                        break;
                    } else {
                        System.out.println("Неверный формат команды");
                    }
                } else if (input.size() == 2) {
                    if (input.get(0).equals("full") && input.get(1).equals("inventory")) {
                        zoo.listAllInventoried();
                    } else {
                        System.out.println("Неверный формат команды");
                    }
                } else if (input.size() == 3) {
                    if (input.get(0).equals("amount")) {
                        if (input.get(1).equals("of") && input.get(2).equals("animals")) {
                            zoo.amountAnimalsReport();
                        } else {
                            System.out.println("Неверный формат команды");
                        }
                    } else if (input.get(0).equals("add")) {
                        if (input.get(1).equals("Tiger")) {
                            if (isInteger(input.get(2))) {
                                zoo.addAnimal(new Tiger(Integer.parseInt(input.get(2))));
                            } else {
                                System.out.println("Неверный формат команды");
                            }
                        } else if (input.get(1).equals("Wolf")) {
                            if (isInteger(input.get(2))) {
                                zoo.addAnimal(new Wolf(Integer.parseInt(input.get(2))));
                            } else {
                                System.out.println("Неверный формат команды");
                            }
                        } else {
                            System.out.println("Неверный формат команды");
                        }
                    } else {
                        System.out.println("Неверный формат команды");
                    }
                } else if (input.size() == 4) {
                    if (input.get(0).equals("add")) {
                        if (isInteger(input.get(2)) && isInteger(input.get(3))) {
                            if (input.get(1).equals("Monkey")) {
                                zoo.addAnimal(new Monkey(Integer.parseInt(input.get(2)), Integer.parseInt(input.get(3))));
                            } else if (input.get(1).equals("Rabbit")) {
                                zoo.addAnimal(new Rabbit(Integer.parseInt(input.get(2)), Integer.parseInt(input.get(3))));
                            } else {
                                System.out.println("Неверный формат команды");
                            }
                        } else {
                            System.out.println("Неверный формат команды");
                        }
                    } else {
                        System.out.println("Неверный формат команды");
                    }
                } else {
                    System.out.println("Неверный формат команды");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }           
    }
}