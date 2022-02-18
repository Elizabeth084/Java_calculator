/*Передавать в качестве параметров двa целочисленных числa. Bывести на экран как сами значения? так и их сумму (“3 + 2 = 5”). Если количество параметров не равно 2, вывести сообщение “Неверное количество пaрaметров”.*/	
package task3;
	
	public class Main {
		public static void main(String[] args) {
	       if (args.length == 2) {
	    	   System.out.println(args[0] + "+" + args[1] + "=" + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
	       } else {
	    	   System.out.println("Неверное количество параметров");
	       }
	    }
	}
