package Veterinaria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

	public class Mascota {
	
		//ATRIBUTOS
			private String mascota;
			private String salud;
			private String tratamiento;
			private LocalDate fecha;
			private int valor;
			private String enfermedad;
			
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
	public void setSalud() {
		LocalDate hoy= LocalDate.now();
		if (fecha.equals(hoy)) {
			this.enfermedad=validarCaracteres("ingrese la enfermedad del animalito");
			this.valor=validarNumeros("ingrese la gravedad de la enfermedad del 1 al 100");
			this.salud=this.salud+"Enfermedad: "+this.enfermedad+" Gravedad: "+this.valor+"\n";
		} else if (hoy.isBefore(fecha)) {
			JOptionPane.showMessageDialog(null, "usted tiene que esperar a que sea el turno: "+fecha);
		} else {
			JOptionPane.showMessageDialog(null, "usted se paso de fecha, tiene que sacar otro turno, valla a resepcion, tiene que tocar salir");
		}

		}
		
		

	//GETYSET TRATAMIENTO
	public String getTratamiento(){
		return this.tratamiento;
		}
	public void setTratamiento() {
		if (this.valor<50) {
			this.tratamiento=this.tratamiento+"Enfermedad: "+this.enfermedad+" (no nesesita tratamiento)"+"\n";
		} else {
			this.tratamiento=this.tratamiento+"Enfermedad: "+this.enfermedad+" (nesesita tratamiento, vaya a la clinica veterinaria)"+"\n";
		}
		}
	
	//GETYSET FECHA
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setFecha(LocalDate a) {
		this.fecha=a;
	}
	
	//GETYSET VALOR
	public int getValor() {
		return this.valor;
	}
	public void setValor(int a) {
		this.valor=a;
	}
	
	//GETYSET ENFERMEDAD
	public String getEnfermedad() {
		return this.enfermedad;
	}
	public void setEnfermedad(String a) {
		this.enfermedad=a;
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
