package app;
public class Alumno {
    private String nombre = "Karen";
    public static String nombre2 = "carlos";

    public static int a;
    public int b;

    // primero estaticos
    static {
        a = 15;
    }
    // segundo instancias
    {
        b = a * 2;
    }
    // tercero constructores
    public Alumno() {
        nombre = "Amy";
    }
    public static void main(String args) {
        
       System.out.println(Alumno.a);

       Alumno al = new Alumno();
       System.out.println(al.b);

       Persona persona = new Persona("Juan");
       System.out.println(persona.nombreP);

       persona.nombreP = "pedro";
       System.out.println(persona.nombreP);

    }
}

class Persona {
    public String nombreP;

    public Persona(String nombre){
        nombreP = nombre;
    }
}

class ClaseInstanciados {
    public void metodoInstancia() {
        System.out.println("soy un metodo de instancia");
    }
}