package medioCurso.Pregunta4;

public class Departamento {

    private  String nombreDe;

    private Provincia[] provincia;

    private int contadores;

    public Departamento(String nombreDe)
    {
        this.nombreDe = nombreDe;

        this.provincia = new Provincia[3];

        this.contadores = 0;
    }

    public String getNombreDe() {
        return nombreDe;
    }

    public void agregarProvincia(Provincia provincia)
    {
        this.provincia[this.contadores] = provincia;

        this.contadores ++;
    }

    private Provincia[] listarProvincia()
    {
        return this.provincia;
    }
}
