package devopsPratique;

import calcul.Employe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe employe = new Employe("Oussama Amari", 31, "0616400633", "78 Rue Jean Jaures 59000 Lille") ;
		
		System.out.println(employe.getName()+ "--" +employe.getAge()+"--"+ employe.getTel()+ "--"+ employe.getAddress());
	}

}
