package parctice3.controller;

import parctice3.model.vo.*;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] arr = new Animal[5];
		arr[0] = new Dog("초코", "말티즈", 5);
		arr[1] = new Cat("나비", "말티즈", "주차장", "검은색");
		arr[2] = new Dog("모찌", "말티즈", 5);
		arr[3] = new Dog("댕댕이", "말티즈", 5);
		arr[4] = new Cat("냥이", "말티즈", "공원", "갈색");
		
		for(Animal a : arr) {
			if(a instanceof Dog) {
				((Dog)a).speak();
			} else {
				((Cat)a).speak();
			}
		}
	}
}
