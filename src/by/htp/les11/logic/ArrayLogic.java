package by.htp.les11.logic;

import java.util.ArrayList;
import by.htp.les11.entity.Array;

public class ArrayLogic implements Runnable {

	private Array array;
	private int number;

	public ArrayLogic(Array array, int number) {
		this.array = array;
		this.number = number;
	}

	@Override
	public void run() {
		int value = 0;
		while (number == 0) {
			array.getLock().lock();
			value = array.getLast();
			array.add(number);
			array.getLock().lock();
		}
	}
}
