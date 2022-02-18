/*Написать программу, получающую на вход в качестве аргумента несколько пaрaметров. B программе вывести “Вы ввели” + N (количество пaрaметров) + “пa- рaметров”. Если параметры не передавались, вывести ”Вы не передaвaли пaрaмет- ров”.*/
package task2;

public class Main {
	public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Вы не передавали параметров");
        } else {
            System.out.println("Вы ввели " + args.length + " параметров");
        }
    }
}
