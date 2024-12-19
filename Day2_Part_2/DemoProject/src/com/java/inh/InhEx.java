package com.java.inh;

class Training {
	void show() {
		System.out.println("Training Demo");
	}
}

class JavaTraining extends Training {
	void show() {
		System.out.println("Java Training");
	}
}

class SqlTraining extends Training {
	void show() {
		System.out.println("Sql Trainnig");
	}
}
public class InhEx {

	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new JavaTraining(), new SqlTraining(), new JavaTraining(), new JavaTraining(),
			new SqlTraining(), new JavaTraining(),new SqlTraining(),new SqlTraining()
		};
		
		for (Training training : arr) {
			if (training instanceof JavaTraining) {
				training.show();
			}
		}
	}
}
