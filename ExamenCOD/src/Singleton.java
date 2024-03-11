public class Singleton {
    private Singleton(){

    }

    private int numeroAleatorio;

    private int numeroPropuesto;

    private int intentosMax;

    private int puntuacion;

    private String alias;

    private int rondasPartida;

    private int rondaActual;

    private int fallos;

    public Singleton(int numeroAleatorio, int numeroPropuesto, int intentosMax, int puntuacion, String alias, int rondasPartida, int rondaActual, int fallos) {
        this.numeroAleatorio = numeroAleatorio;
        this.numeroPropuesto = numeroPropuesto;
        this.intentosMax = intentosMax;
        this.puntuacion = puntuacion;
        this.alias = alias;
        this.rondasPartida = rondasPartida;
        this.rondaActual = rondaActual;
        this.fallos = fallos;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public int getNumeroPropuesto() {
        return numeroPropuesto;
    }

    public void setNumeroPropuesto(int numeroPropuesto) {
        this.numeroPropuesto = numeroPropuesto;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getRondasPartida() {
        return rondasPartida;
    }

    public void setRondasPartida(int rondasPartida) {
        this.rondasPartida = rondasPartida;
    }

    public int getRondaActual() {
        return rondaActual;
    }

    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }
    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}