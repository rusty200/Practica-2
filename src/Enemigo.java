
public class Enemigo {

    private String nombreEnemi;
    private int hpActual;
    private int hpMaximo;
    private int danoBaseEnemi;

    // Constructor
    public Enemigo(String nombre, int hpMaximo, int danoBase) {
        this.nombreEnemi = nombre;
        this.hpMaximo = hpMaximo;
        this.hpActual = hpMaximo;
        this.danoBaseEnemi = danoBase;
    }

    // Recibir daño
    public void recibirDano(int danio) {
        hpActual -= Math.max(0, danio);
        if (hpActual < 0) {
            hpActual = 0;
        }
    }

    // Comprobar si está derrotado
    public boolean estaDerrotado() {
        return hpActual <= 0;
    }

    // Getters
    public String getNombre() {
        return nombreEnemi;
    }

    public int getHpActual() {
        return hpActual;
    }

    public int getHpMaximo() {
        return hpMaximo;
    }

    public int getDanoBase() {
        return danoBaseEnemi;
    }

    // Setters
    public void setNombreEnemi(String Nombre) {
        this.nombreEnemi = Nombre;
    }

    public void setDanoBaseEnemi(int danoBase) {
        this.danoBaseEnemi = Math.max(0, danoBase);
    }


}
