package Veterinaria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

	public class Mascotas {
	
		//ATRIBUTOS
			private String mascota;
			private String salud;
			private String tratamiento;
			
	//CONSTRUCTORES
	public  Mascotas (String a, String b, String c) {
		this.mascota=a;
		this.salud=b;
		this.tratamiento=c;
		}
	public  Mascotas () {
		this.mascota="";
		this.salud="";
		this.tratamiento="";
		}
	
	//GETYSET MASCOTA

	public String getMascota() {
		return this.mascota;
		}
	public void setMascota() {
		String nombre=validarCaracteres("ingrese el nombre del animal.");
		String nombredueño=validarCaracteres("ingrese el nombre del dueño.");
		String tipo=validarCaracteres("ingrese que animal es: ");
		int edad=validarNumeros("ingrese la edad del animal (en numero)");
		int peso=validarNumeros("ingrese el peso del animal (en numero)");
		LocalDate turno=LocalDate.of(validarNumeros("ingrese el año del turno (en numero"), validarNumeros("ingrese el mes del turno (en numero"), validarNumeros("ingrese el dia del turno (en numero"));
		this.mascota="nombre de la mascota: "+nombre+"\n Nombre del dueño: "+nombredueño+"\n Tipo de animal: "+tipo+"\n Edad del animal: "+edad+"\n Peso: "+peso +"\n Turno: "+turno ;
		}
	
	//GETYSET SALUD
	public String getSalud(){
		return this.salud;
		}
	public void setSalud(String a, int b) {
		this.salud=this.salud+"Enfermedad: "+a+" Gravedad: "+b+"\n";
		}

	//GETYSET TRATAMIENTO
	public String getTratamiento(){
		return this.tratamiento;
		}
	public void setTratamiento(int a) {
		if (a<50) {
			this.tratamiento=this.salud+" (no nesesita tratamiento)"+"\n";
		} else {
			this.tratamiento=this.salud+" (nesesita tratamiento, vaya a la clinica veterinaria)"+"\n";
		}
		}

	//VALIDACIONES
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

	public String validarCaracteres(String mensaeje) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaeje);
		}
		return palabra;
	}

}
