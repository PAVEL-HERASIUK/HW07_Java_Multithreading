package by.htp.les11.main;

import by.htp.les11.entity.Array;
import by.htp.les11.logic.ArrayLogic;
import by.htp.les11.view.ArrayPrinter;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		int length = 3;
		Array array = new Array(length);
		Thread thr1 = new Thread(new ArrayLogic(array, 1));
		Thread thr2 = new Thread(new ArrayLogic(array, 2));
		Thread thr3 = new Thread(new ArrayLogic(array, 3));
		Thread thr4 = new Thread(new ArrayLogic(array, 4));
		Thread thr5 = new Thread(new ArrayLogic(array, 5));

		thr1.start();
		thr2.start();
		thr3.start();
		thr4.start();
		thr5.start();

		Thread.sleep(100);
		ArrayPrinter printer = new ArrayPrinter();
		printer.print(array);
	}
}
