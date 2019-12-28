package by.htp.les11.view;

import by.htp.les11.entity.Array;

public class ArrayPrinter {

	public void print(Array array) {
		for (int i = 0; i < array.getLength(); i++) {
			for (int j = 0; j < array.getLength(); j++) {
				System.out.print(array.getValue(i, j) + " \t ");
			}
			System.out.println();
		}
	}
}
