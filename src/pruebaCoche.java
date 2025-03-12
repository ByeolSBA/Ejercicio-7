public class pruebaCoche {
    public static void main(String[]args){
        Coche coche1 = new Coche("Rojo", "Toyota", "Corolla", 200, 4, "EUW-123");
        Coche coche2 = new Coche("Azul","Honda","Civic",140,4,"ZKW-468");
        Coche coche3 = new Coche("Verde","Ford","Focus",200,4,"MFH-915");

        coche1.mostrarInfo();
        System.out.println();
        coche2.mostrarInfo();
        System.out.println();
        coche3.mostrarInfo();
        System.out.println();

    }
}
