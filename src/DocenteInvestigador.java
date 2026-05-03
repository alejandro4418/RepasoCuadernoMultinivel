public class DocenteInvestigador extends Docente{
    private int publicaciones;

    public DocenteInvestigador(String codigo,
                               String nombre,
                               int edad,
                               int horasClase,
                               double valorHora,
                               int publicaciones){
        super(codigo, nombre, edad, horasClase, valorHora);
        setPublicaciones(publicaciones);
    }

    public void setPublicaciones(int publicaciones){
        if (publicaciones >= 0){
            this.publicaciones = publicaciones;
        } else {
            System.out.println("Las publicaciones deben ser mayores o iguales a cero");
            System.exit(1);
        }
    }

    public int getPublicaciones(){ return publicaciones; }

    @Override
    public double calcularPago(){
        return ((getHorasClase() * getValorHora()) + (getPublicaciones() * 20));
    }

    public double calcularPago(double bonoExtra){
        double pagoBono = calcularPago() + bonoExtra;
        return pagoBono;
    }

    @Override
    public void descubrirRol(){
        System.out.println("Rol: Docente investigador con produccion academica");
    }
}
