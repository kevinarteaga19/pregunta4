package medioCurso.Pregunta4;

public class Main4 {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("Huanuco");

        System.out.println("NOMBRE DEL DEPARTAMENTO: "+ departamento.getNombreDe());

        departamento.agregarProvincia(new Provincia("Huanuco"));
        departamento.agregarProvincia(new Provincia("Ambo"));
        departamento.agregarProvincia(new Provincia("Lauricocha"));

        for ( Provincia provincia: departamento.))
        {
            System.out.println();
        }
    }
}
