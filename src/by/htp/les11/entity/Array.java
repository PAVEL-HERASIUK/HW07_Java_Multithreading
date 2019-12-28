package by.htp.les11.entity;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Array {
	private int[][] array;
	private int length;
	private Lock lock;

	public Array(int length) {
		array = new int[length][length];
		this.length = length;
		lock = new ReentrantLock();
	}

	public void add(int num) {
		for (int i = 0; i < length; i++) {
			if (array[i][i] == 0) {
				array[i][i] = num;
				System.out.println(" Array [ " + i + " ] [ " + i + " ] = " + num);
				break;
			}
		}
	}

	public int[][] getArray() {
		return array;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(array);
		result = prime * result + length;
		result = prime * result + ((lock == null) ? 0 : lock.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		if (!Arrays.deepEquals(array, other.array))
			return false;
		if (length != other.length)
			return false;
		if (lock == null) {
			if (other.lock != null)
				return false;
		} else if (!lock.equals(other.lock))
			return false;
		return true;
	}

	public int getLast() {
		// TODO Auto-generated method stub
		return 0;
	}
}
