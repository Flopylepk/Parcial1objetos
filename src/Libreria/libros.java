package Libreria;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class libros {

	//ATRIBUTOS
	private String cliente;
	private boolean libro1;
	private boolean libro2;
	private boolean libro3;
	private String estado;
	private String prestamo;
	private String devolucion;
	private LocalDate fecha;
	
	
	//CONSTRUCTORES
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
	
	//GET Y SET CLIENTE
	
	public String getCliente(){
		return this.cliente;
			}
	
	public void setCliente() {
		String nombre=validarCaracteres("Ingrese el nombre del cliente");
		this.cliente=nombre;
	}
	
	//GET Y SET LIBRO1
	public boolean getLibro1() {
		return this.libro1;
	}
	public void setLibro1(boolean a) {
		this.libro1=a;
	}
	
	
	//GET Y SET LIBRO2
	public boolean getLibro2() {
		return this.libro2;
	}
	public void setLibro2(boolean a) {
		this.libro2=a;
	}
	
	
	//GET Y SET LIBRO3
	public boolean getLibro3() {
		return this.libro3;
	}
	public void setLibro3(boolean a) {
		this.libro3=a;
	}
	
	
	//GET Y SET PRESTAMO
	public String getPrestamo() {
		return this.prestamo;
	}
	public void setPrestamo() {
		if (this.libro1==false && this.libro2==false && this.libro3==false) {
			JOptionPane.showMessageDialog(null, "Lo sentimos no tenemos libros disponibles en este momento");
		}else {
			String [] opciones= {"El Quijote", "Percy Jackson", "Dracula"};
			int opcion=JOptionPane.showOptionDialog(null, "Elija que libro quiere que le prestemos", "Libros", 0, 0, null, opciones, opciones[0]);
			switch (opcion) {
			case 0:
				if (this.libro1==true) {
					this.libro1=false;
					this.prestamo=this.prestamo+"El Quijote fue rentado por: "+this.cliente+ " el: "+ this.fecha+"\n";
				}else {
					JOptionPane.showMessageDialog(null, "Lo sentimos este libro ya fue rentado por usted");
				}
				break;
			case 1:
				if (this.libro2==true) {
					this.libro2=false;
					this.prestamo=this.prestamo+"Percy Jackson fue rentado por: "+this.cliente+ " el: "+ this.fecha+"\n";
				}else {
					JOptionPane.showMessageDialog(null, "Lo sentimos este libro ya fue rentado por usted");
					
				}
				
				break;
			case 2:
				if (this.libro3==true) {
					this.libro3=false;
					this.prestamo=this.prestamo+"Dracula fue rentado por: "+this.cliente+ " el: "+ this.fecha+"\n";
				}else {
					JOptionPane.showMessageDialog(null, "Lo sentimos este libro ya fue rentado por usted");
				}
				break;
			}
		}
		
		}
	
	
	//GET Y SET DEVOLUCION
		public String getDevolucion() {
			return this.devolucion;
		}
		public void setDevolucion() {
			if (this.libro1==true && this.libro2==true && this.libro3==true) {
				JOptionPane.showMessageDialog(null, "Lo sentimos todos los libros ya fueron debueltos");
			}else {
				String [] opciones= {"El Quijote", "Percy Jackson", "Dracula"};
				int opcion=JOptionPane.showOptionDialog(null, "Elija que libro quiere debolver", "libros", 0, 0, null, opciones, opciones[0]);
				switch (opcion) {
				case 0:
					if (this.libro1==false) {
						this.libro1=true;
						this.devolucion=this.devolucion+"El Quijote fue debuelto por: "+this.cliente+ " el: "+ this.fecha +"\n";
					}else {
						JOptionPane.showMessageDialog(null, "Lo sentimos este libro no fue rentado por usted");
					}
					break;
				case 1:
					if (this.libro2==false) {
						this.libro2=true;
						this.devolucion=this.devolucion+"Percy Jackson fue debuelto por: "+this.cliente+ " el: "+ this.fecha+"\n";
					}else {
						JOptionPane.showMessageDialog(null, "Lo sentimos este libro no fue rentado por usted");
						
					}
					
					break;
				case 2:
					if (this.libro3==false) {
						this.libro3=true;
						this.devolucion=this.devolucion+"Dracula fue debuelto por: "+this.cliente+ " el: "+ this.fecha+"\n";
					}else {
						JOptionPane.showMessageDialog(null, "Lo sentimos este libro no fue rentado por usted");
					}
					break;
				
				}
			}
			
			
			}
		
		//GET Y SET ESTADO
		public String getEstado() {
			return this.estado;	
	}
		public void setEstado() {
			String [] opciones= {"El Quijote", "Percy Jackson", "Dracula"};
			int opcion=JOptionPane.showOptionDialog(null, "Elija que libro quiere ver el estado", "libros", 0, 0, null, opciones, opciones[0]);
			switch (opcion) {
			case 0:
				if (libro1) {
					this.estado="El quijote esta disponible";
				}else {
					this.estado="El quijote no esta disponible";
				}
				break;
			case 1:
				if (libro2) {
					this.estado="Percy Jackson esta disponible";
				}else {
					this.estado="Percy Jackson no esta disponible";
					
				}
				
				break;
			case 2:
				if (libro3) {
					this.estado="Dracula esta disponible";
				}else {
					this.estado="Dracula no esta disponible";
					
				}
				break;
			
			}
		}	
		
		
		//GET Y SET FECHA
		public LocalDate getFecha() {
			return this.fecha;
		}
		public void setFecha(LocalDate a) {
			this.fecha=a;
		}
	
	
	
	
	
	//VALIDACIONES
		public String validarCaracteres(String mensaeje) {
			String palabra = "";
			while (palabra.equals("")) {
				palabra = JOptionPane.showInputDialog(mensaeje);
			}
			return palabra;
		}
	}
