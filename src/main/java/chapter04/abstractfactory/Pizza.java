package chapter04.abstractfactory;

import chapter04.abstractfactory.cheese.Cheese;
import chapter04.abstractfactory.clams.Clams;
import chapter04.abstractfactory.dough.Dough;
import chapter04.abstractfactory.pepperoni.Pepperoni;
import chapter04.abstractfactory.sauce.Sauce;
import chapter04.abstractfactory.veggies.Veggies;

public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	/**
	 * 이 부분에서 피자를 만드는 데 필요한 재료들을 가져온다.
	 */
	abstract void prepare();

	public void bake() {
		System.out.println("175도에서 25분 간 굽기");
	}

	public void cut() {
		System.out.println("피자를 사선으로 자르기");
	}

	public void box() {
		System.out.println("상자에 피자 담기");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("---- ").append(name).append(" ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
