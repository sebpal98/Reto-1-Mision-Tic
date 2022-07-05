package view;

import javax.swing.JOptionPane;

import model.Calculadora;

public class view {

	private static final String MAIN_MENU = "Seleccione una opcion \n1.) Realizar una operacion\n2.) Salir";
	private static final String OPERATION_MENU = "Seleccione una operacion \n" + "1.) Suma" + "\n2.) Resta"
			+ "\n3.) Multiplicacion" + "\n4.) Division" + "\n5.) Potencia" + "\n6.) Raiz Cuadrada" + "\n7.) Salir";

	private Calculadora calc;
	private JOptionPane mainMenu;

	public view() {

		initComponents();
	}

	private void initComponents() {
		String opcion = "";
		opcion = JOptionPane.showInputDialog(MAIN_MENU);

		switch (opcion) {
		case "1":
			menuOperaciones();
			break;
		case "2":
			break;
		default:
			JOptionPane.showInternalMessageDialog(null, "Ingrese una opcion valida");
			initComponents();
		}
	}

	private void menuOperaciones() {
		String opcion = "";
		opcion = JOptionPane.showInputDialog(OPERATION_MENU);
		String numbers = JOptionPane.showInputDialog(
				"Ingrese los dos numeros separados por un guion '-'\n En el caso de raiz cuadrada solo ingrese un numero");
		if (opcion.equals("6")) {
			calc = new Calculadora(Double.parseDouble(numbers));
		} else {
			String[] splitedNumbers = numbers.split("-");
			if (Double.parseDouble(splitedNumbers[1]) == 0 && opcion.equals("4")) {
				JOptionPane.showMessageDialog(mainMenu, "No se puede, division por cero");
				menuOperaciones();
			}
			calc = new Calculadora(Double.parseDouble(splitedNumbers[0]), Double.parseDouble(splitedNumbers[1]));
		}

		switch (opcion) {
		case "1":
			JOptionPane.showMessageDialog(null, calc.sum());
			break;
		case "2":
			JOptionPane.showMessageDialog(null, calc.sustrain());
			break;
		case "3":
			JOptionPane.showMessageDialog(null, calc.multiply());
			break;
		case "4":
			JOptionPane.showMessageDialog(null, calc.divide());
			break;
		case "5":
			JOptionPane.showMessageDialog(null, calc.pow());
			break;
		case "6":
			JOptionPane.showMessageDialog(null, calc.squareRoot());
			break;

		default:
			JOptionPane.showInternalMessageDialog(null, "Ingrese una opcion valida");
			menuOperaciones();
		}
	}

	public static void main(String[] args) {
		new view();
	}
}
