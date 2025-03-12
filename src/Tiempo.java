public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor con hora, minuto y segundo
    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = validarHora(hora);
        this.minuto = validarMinuto(minuto);
        this.segundo = validarSegundo(segundo);
    }

    public Tiempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Tiempo(int hora) {
        this(hora, 0, 0);
    }

    public void setHora(int hora) {
        this.hora = validarHora(hora);
    }

    public void setMinuto(int minuto) {
        this.minuto = validarMinuto(minuto);
    }

    public void setSegundo(int segundo) {
        this.segundo = validarSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void mostrarTiempo() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }

    private int validarHora(int hora) {
        return (hora >= 0 && hora < 24) ? hora : 0;
    }

    private int validarMinuto(int minuto) {
        return (minuto >= 0 && minuto < 60) ? minuto : 0;
    }

    private int validarSegundo(int segundo) {
        return (segundo >= 0 && segundo < 60) ? segundo : 0;
    }
}
