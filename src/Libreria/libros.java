package Libreria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class libros {

	private String cliente;
	private boolean libro1;
	private boolean libro2;
	private boolean libro3;
	private String estado;
	private String prestamo;
	private String devolucion;
	private LocalDate fecha;
	
	public libros (String a, boolean b, boolean c, boolean d, String e, String f, String g, LocalDate h) {
		this.cliente=a;
		this.libro1=b;
		this.libro2=c;
		this.libro3=d;
		this.estado=e;
		this.prestamo=f;
		this.devolucion=g;
		this.fecha=h;
	}
	
	public libros () {
		this.cliente="";
		this.libro1=true;
		this.libro2=true;
		this.libro3=true;
		this.estado="";
		this.prestamo="";
		this.devolucion="";
		this.fecha=LocalDate.now();
	}
	
	public String getCliente(){
		return this.cliente;
			}
	
	public void setCliente() {
		String nombre=validarCaracteres("ingrese el nombre del cliente");
	}
	
	public boolean getLibro1() {
		return this.libro1;
	}
	public void setLibro1(boolean a) {
		this.libro1=a;
	}
	
	public boolean getLibro2() {
		return this.libro2;
	}
	public void setLibro2(boolean a) {
		this.libro2=a;
	}
	
	public boolean getLibro3() {
		return this.libro3;
	}
	public void setLibro3(boolean a) {
		this.libro3=a;
	}
	
	public String getPrestamo() {
		return this.prestamo;
	}
	public void setPrestamo() {
		if (this.libro1==false && this.libro2==false && this.libro3==false) {
			JOptionPane.showMessageDialog(null, "lo sentimos no tenemos libros disponibles en este momento");
		}
		String [] opciones= {"El quijote", "Percy Jackson", "Dracula"};
		int opcion=JOptionPane.showOptionDialog(null, "Elija que libro quiere qie le prestemos", "libros", 0, 0, null, opciones, opciones[0]);
		switch (opcion) {
		case 0:
			if (this.libro1==true) {
				this.libro1=false;
				this.prestamo=this.prestamo+"le quijote fue rentado por: "+this.cliente+ " el: "+ this.fecha;
			}else {
				JOptionPane.showMessageDialog(null, "lo sentimos este libro no esta disponible");
			}
			break;
		case 1:
			if (this.libro2==true) {
				this.libro2=false;
				this.prestamo=this.prestamo+"Percy Jackson fue rentado por: "+this.cliente+ " el: "+ this.fecha;
			}else {
				JOptionPane.showMessageDialog(null, "lo sentimos este libro no esta disponible");
				
			}
			
			break;
		case 2:
			if (this.libro3==true) {
				this.libro3=false;
				this.prestamo=this.prestamo+"Dracula fue rentado por: "+this.cliente+ " el: "+ this.fecha;
			}else {
				JOptionPane.showMessageDialog(null, "lo sentimos este libro no esta disponible");
			}
			break;
		}
		}
		public String getDevolucion() {
			return this.devolucion;
		}
		public void setDevolucion() {
			if (this.libro1==true && this.libro2==true && this.libro3==true) {
				JOptionPane.showMessageDialog(null, "lo sentimos todos los libros ya fueron debueltos");
			}
			String [] opciones= {"El quijote", "Percy Jackson", "Dracula"};
			int opcion=JOptionPane.showOptionDialog(null, "Elija que libro quiere quiere", "libros", 0, 0, null, opciones, opciones[0]);
			switch (opcion) {
			case 0:
				if (this.libro1==false) {
					this.libro1=true;
					this.devolucion=this.devolucion+"le quijote fue debuelto por: "+this.cliente+ " el: "+ this.fecha;
				}else {
					JOptionPane.showMessageDialog(null, "lo sentimos este libro no fue rentado");
				}
				break;
			case 1:
				if (this.libro2==false) {
					this.libro2=true;
					this.prestamo=this.prestamo+"Percy Jackson fue rentado por: "+this.cliente+ " el: "+ this.fecha;
				}else {
					JOptionPane.showMessageDialog(null, "lo sentimos este libro no fue rentado");
					
				}
				
				break;
			case 2:
				if (this.libro3==true) {
					this.libro3=false;
					this.prestamo=this.prestamo+"Dracula fue rentado por: "+this.cliente+ " el: "+ this.fecha;
				}else {
					JOptionPane.showMessageDialog(null, "lo sentimos este libro no fue rentado");
				}
				break;
			
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
