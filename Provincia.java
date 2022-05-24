package medioCurso.Pregunta4;

public class Provincia {

    private String nombrePr;

    private Distrito[] distrito;

    private int contador;

    public Provincia(String nombrePr)
    {
        this.nombrePr = nombrePr;

        this.distrito = new Distrito[5];

        this.contador = 0;
    }

    public String getNombrePr() {
        return nombrePr;
    }

    public void agregarDistrito(Distrito distrito)
    {
        this.distrito[this.contador] = distrito;

        this.contador ++;
    }

    public Distrito[] listarDistrito()
    {
        return this.distrito;
    }
}
