public class Coche {
    private String color;
    private String marca;
    private String modelo;
    private int caballos;
    private int puertas;
    private String matricula;

    public Coche (String color, String marca, String modelo, int caballos, int puertas, String matricula){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
        this.puertas = puertas;
        this.matricula = matricula;
    }
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCaballos() {
        return caballos;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getMatricula() {
        return matricula;
    }
    public void mostrarInfo(){
        System.out.println("Marca: "+marca+",Modelo: "+modelo+",Color: "+color);
        System.out.println("Caballos: "+caballos+",Puertas: "+puertas+"Matricula: "+matricula);
    }
}


