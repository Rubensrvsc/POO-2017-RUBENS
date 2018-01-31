package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OrdenarArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList();
		Random rm=new Random();
		for (int i = 0; i < 1000; i++) {
			int num=rm.nextInt(1000);
			l.add(num);
		}
		Collections.sort(l);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

}
