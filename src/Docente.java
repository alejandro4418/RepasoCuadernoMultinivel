public class Docente extends PersonaAcademica{
    private int horasClase;
    private double valorHora;

    public Docente(String codigo, String nombre, int edad, int horasClase, double valorHora){
        super(codigo, nombre, edad);
        setHorasClase(horasClase);
        setValorHora(valorHora);
    }

    public void setHorasClase(int horasClase){
        if (horasClase >= 1 && horasClase <= 40){
            this.horasClase = horasClase;
        } else{
            System.out.println("Horas de clase deben estar entre 1 a 40");
            System.exit(1);
        }
    }

    public void setValorHora(double valorHora){
        if (valorHora > 0){
            this.valorHora = valorHora;
        } else {
            System.out.println("Valor por hora debe ser mayor a cero");
            System.exit(1);
        }
    }

    public int getHorasClase(){ return horasClase; }

    public double getValorHora(){ return valorHora; }

    @Override
    public void descubrirRol(){
        System.out.println("Rol: Docente Academico");
    }

    @Override
    public double calcularPago(){
        return getHorasClase() * getValorHora();
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Horas de clase: "+getHorasClase());
        System.out.println("Valor por hora: "+getValorHora());
    }
}
