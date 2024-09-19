package Veterinaria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

	public class Mascota {
	
		//ATRIBUTOS
			private String mascota;
			private String salud;
			private String tratamiento;
			private LocalDate fecha;
			
	//CONSTRUCTORES
	public  Mascota (String a, String b, String c, LocalDate d) {
		this.mascota=a;
		this.salud=b;
		this.tratamiento=c;
		this.fecha=d;
		}
	public  Mascota () {
		this.mascota="";
		this.salud="";
		this.tratamiento="";
		this.fecha= null;
		}
	
	//GETYSET MASCOTA

	public String getMascota() {
		return this.mascota;
		}
	public void setMascota() {
		
		
			JOptionPane.showMessageDialog(null, "genial, vino en el dia del turno");
			String nombre=validarCaracteres("ingrese el nombre del animal.");
			String nombredueño=validarCaracteres("ingrese el nombre del dueño.");
			String tipo=validarCaracteres("ingrese que animal es: ");
			int edad=validarNumeros("ingrese la edad del animal (en numero)");
			int peso=validarNumeros("ingrese el peso del animal (en numero)");
			int año=validarNumeros("ingrese el año del turno");
			int mes=validarNumeros("ingrese el mes del turno");
			int dia=validarNumeros("ingrese el dia del turno");
			this.fecha= LocalDate.of(año, mes, dia);
			this.mascota="nombre de la mascota: "+nombre+"\n Nombre del dueño: "+nombredueño+"\n Tipo de animal: "+tipo+"\n Edad del animal: "+edad+"\n Peso: "+peso +"\n Turno: "+fecha ;
		}
	
	//GETYSET SALUD
	public String getSalud(){
		return this.salud;
		}
	public void setSalud(String a, int b) {
		LocalDate hoy= LocalDate.now();
		if (hoy.equals(fecha)) {
			this.salud=this.salud+"Enfermedad: "+a+" Gravedad: "+b+"\n";
		} else if (hoy.isBefore(fecha)) {
			JOptionPane.showMessageDialog(null, "usted tiene que esperar a que sea el turno: "+fecha);
		} else {
			JOptionPane.showMessageDialog(null, "usted se paso de fecha, tiene que sacar otro turno, valla a resepcion");
		}

		}
		
		

	//GETYSET TRATAMIENTO
	public String getTratamiento(){
		return this.tratamiento;
		}
	public void setTratamiento(int a, String b) {
		if (a<50) {
			this.tratamiento=this.tratamiento+"Enfermedad: "+b+" (no nesesita tratamiento)"+"\n";
		} else {
			this.tratamiento=this.tratamiento+"Enfermedad: "+b+" (nesesita tratamiento, vaya a la clinica veterinaria)"+"\n";
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
