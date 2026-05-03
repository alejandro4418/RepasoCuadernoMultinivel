public class PersonaAcademica {
    private String codigo;
    private String nombre;
    private int edad;

    public PersonaAcademica(String codigo, String nombre, int edad){
        setCodigo(codigo);
        setNombre(nombre);
        setEdad(edad);
    }

    public void setCodigo(String codigo){
        if (codigo.isEmpty()){
            System.out.println("Codigo no puede estar vacio");
            System.exit(1);
        } else {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre){
        if (nombre.isEmpty()){
            System.out.println("Nombre no puede estar vacio");
            System.exit(1);
        } else {
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad){
        if (edad >= 18){
            this.edad = edad;
        } else {
            System.out.println("Edad debe ser mayor o igual a 18");
            System.exit(1);
        }
    }

    public String getCodigo(){ return codigo; }

    public String getNombre(){ return nombre; }

    public int getEdad(){ return edad; }

    public void descubrirRol(){}
    public double calcularPago(){ return 0; }
    public void mostrarDatos(){
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Edad: "+getEdad());
    }
}
