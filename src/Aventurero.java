
public class Aventurero {

    private String nombreAventu;
    private int HpActual;
    private int HpMaximo;
    private int danioBaseAventu;
    private int pociones;
    private static final int CURACION_POCION = 20;

    // Constructor
    public Aventurero(String nombre, int hpMaximo,
                      int danioBase, int pociones) {
        this.nombreAventu = nombre;
        this.HpMaximo = hpMaximo;
        this.HpActual = hpMaximo;
        this.danioBaseAventu = danioBase;
        this.pociones = pociones;
    }

    // Atacar a un enemigo
    public void atacar(Enemigo objetivo) {
        objetivo.recibirDano(danioBaseAventu);
    }

    // Beber una poción
    public void beberPocion() {
        if (pociones > 0) {
            pociones--;
            HpActual += CURACION_POCION;
            if (HpActual > HpMaximo) {
                HpActual = HpMaximo;
            }
            System.out.println("Has bebido una poción.");
            System.out.println("Vida actual: " + HpActual);
        } else {
            System.out.println("No te quedan pociones.");
        }
    }

    // Recibir daño
    public void recibirDano(int danio) {
        HpActual -= Math.max(0, danio);
        if (HpActual < 0) {
            HpActual = 0;
        }
    }

    // Comprobar si está derrotado
    public boolean estaCaido() {
        return HpActual <= 0;
    }

    // Getters
    public String getNombre() {
        return nombreAventu;
    }

    public int getHpActual() {
        return HpActual;
    }

    public int getHpMaximo() {
        return HpMaximo;
    }

    public int getDanioBase() {
        return danioBaseAventu;
    }

    public int getPociones() {
        return pociones;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombreAventu = nombre;
    }

    public void setDanioBase(int danioBase) {
        this.danioBaseAventu = Math.max(0, danioBase);
    }

}
