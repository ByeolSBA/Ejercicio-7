import java.text.DecimalFormat;
import java.util.Scanner;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private DecimalFormat formato;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.formato = new DecimalFormat("#.##");
    }

    public String consultarSaldo() {
        return "Cuenta N°: " + numeroCuenta + " - Saldo disponible: " + formato.format(saldo) + " pesos";
    }

    public String recibirAbono(double monto) {
        if (monto > 0) {
            saldo += monto;
            return "Cuenta N°: " + numeroCuenta + " - Se han abonado " + formato.format(monto) + " pesos. " + consultarSaldo();
        } else {
            return "El monto del abono debe ser mayor a cero.";
        }
    }

    public String pagarRecibo(double monto) {
        if (monto > 0) {
            if (saldo >= monto) {
                saldo -= monto;
                return "Cuenta N°: " + numeroCuenta + " - Se ha pagado el recibo de " + formato.format(monto) + " pesos. " + consultarSaldo();
            } else {
                return "Cuenta N°: " + numeroCuenta + " - Saldo insuficiente para realizar el pago.";
            }
        } else {
            return "El monto del recibo debe ser mayor a cero.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta("123456789", 1000);

        System.out.println("Bienvenido a la gestión de su cuenta bancaria.");
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Recibir abono");
            System.out.println("3. Pagar recibo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(cuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese el monto a abonar: ");
                    double abono = scanner.nextDouble();
                    System.out.println(cuenta.recibirAbono(abono));
                    break;
                case 3:
                    System.out.print("Ingrese el monto del recibo a pagar: ");
                    double pago = scanner.nextDouble();
                    System.out.println(cuenta.pagarRecibo(pago));
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
            }
        }

        scanner.close();
    }
}
