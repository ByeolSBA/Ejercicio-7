public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base * altura;
    }
    public double calcularPerimetro(){
        return 2*(base + altura);
    }
    public double getBase(){
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public static void main (String [] args){
        Rectangulo rectangulo= new Rectangulo(5,10);
        System.out.println("Área: "+rectangulo.calcularArea());
        System.out.println("Perimetro: "+rectangulo.calcularPerimetro());
    }
}

