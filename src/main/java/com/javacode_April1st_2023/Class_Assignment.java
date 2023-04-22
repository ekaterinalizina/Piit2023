package com.javacode_April1st_2023;

public class Class_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] str = {{"Name", "Last Name", "Phone", "DBO", "Eyes color"},
							{"Kate", "Lizina", "202-677-1779", "12/14/1987", "Green"},
							{"Nik", "Lavrenyuk", "619-343-3979", "09/25/1984", "Blue"}
							};
		
			for(int i= 0; i <str.length; i++) {
			
			for(int j= 0; j <str[i].length; j++) {
				System.out.print(str[i][j] + "\t\t\t" + "");
			}
			System.out.println();
		}
			
			String[][] str1 = new String[3][5];
			
			str1[0][0]  = "Name";
			str1[0][1] = "Last Name";
			str1[0][2] = "Phone";
			str1[0][3] = "DBO";
			str1[0][4] = "Eye color";
			
	}

}
