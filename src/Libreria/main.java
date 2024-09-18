package Libreria;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		libros primero =new libros();
		String [] menu= {"Registrarse", "Prestamo","Ver prestamos", "Devolucion","Ver devoluciones", "Ver estado", "Salir"};
		int opcion=0;
		do {
			opcion=JOptionPane.showOptionDialog(null, "elija una opcion", "menu", JOptionPane.DEFAULT_OPTION, 0, new ImageIcon(main.class.getResource("/img/Libreria.jpg")), menu, menu[0]);
			
			switch (opcion) {
			case 0:
				if (primero.getCliente()=="") {
					primero.setCliente();
				} else {
					JOptionPane.showMessageDialog(null, "Usted ya esta registrado");
				}
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				if (primero.getCliente()=="") {
					JOptionPane.showMessageDialog(null, "primero debe registrarse");
				} else {
					primero.setDevolucion();
				}
				break;
			case 4:
				if (primero.getDevolucion()=="") {
					JOptionPane.showMessageDialog(null, "primero debe realizar una devolucion");
				} else {
					JOptionPane.showMessageDialog(null, primero.getDevolucion());
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, primero.getEstado());
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "ok nos vemos otro dia");
				break;

			
			}
		} while (opcion!=6);
	}

}
