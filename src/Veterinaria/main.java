package Veterinaria;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascotas peludo=new Mascotas();
		String [] menu= {"Refustrar mascota","Ver el registro", "Registrar su salud","revisar su salud", "Revisar el tratamiento", "salir" };
		int opcion=0;
		int valor=0;
		String enfermedad="";
		do {
			opcion=JOptionPane.showOptionDialog(null, "Elija una opcion", "menu", JOptionPane.DEFAULT_OPTION, 0, new ImageIcon(main.class.getResource("/img/veterinaria.png")), menu, menu[0]);
			
			switch (opcion) {
			case 0:
				if (peludo.getMascota()=="") {
					peludo.setMascota();
					
				}else {
					JOptionPane.showMessageDialog(null, "usted ya registro a la mascota");
				}
				break;
			case 1:
				if (peludo.getMascota()=="") {
					JOptionPane.showMessageDialog(null, "usted no registro a la mascora");
					
				}else {
					peludo.getMascota();
				}
				break;
			case 2:
				if (peludo.getMascota()=="") {
					JOptionPane.showMessageDialog(null, "usted no registro a la mascora");
					
				}else {
					enfermedad=validarCaracteres("ingrese algun problema que tenga su animalito");
					valor=validarNumeros("ingrese que tan grave es la enfermedad, del 1 al 100");
					peludo.setSalud(enfermedad, valor);
				}
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "nos vemos otro dia");
				break;

			
			}
			
			
		} while (opcion!=4);
	}
	
	public static int validarNumeros(String mensaje) {
		boolean flag ;
		String num ="" ;
		do {
			flag =true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty()) {
				num = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if (!Character.isDigit(num.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		
		return Integer.parseInt(num);
	}

	public static String validarCaracteres(String mensaej) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaej);
		}
		return palabra;
	}

}
