//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Codigo: ");
    String codigo = sc.nextLine();
    System.out.println("Nombre: ");
    String nombre = sc.nextLine();
    System.out.println("Edad: ");
    int edad = sc.nextInt();
    System.out.println("Horas de clase: ");
    int horasClase = sc.nextInt();
    System.out.println("Valor por hora: ");
    double valorHora = sc.nextDouble();
    System.out.println("Publicaciones: ");
    int publicaciones = sc.nextInt();


    DocenteInvestigador d1 = new DocenteInvestigador(codigo, nombre, edad, horasClase, valorHora, publicaciones);

    PersonaAcademica p1 = d1;

    p1.mostrarDatos();
    p1.descubrirRol();
    System.out.println("Pago final: $"+p1.calcularPago());
    System.out.println("Pago con bono extra: $"+d1.calcularPago(50));
}
