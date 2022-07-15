public class ejercicio4 {
    public static void main(String[] args) {
        int numeroif = 0;
        if (numeroif < 0) {
            System.out.println("Es negativo");
        }
        if (numeroif > 0) {
            System.out.println("Es positivo");
        }
        if (numeroif == 0) {
            System.out.println("Es 0");
        }

        int numeroWhile = -5;

        while (numeroWhile < 3);{
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        do{
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;}
        while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3;numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }
        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es Verano");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;
            case "otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("no hay estacion");
        }
    }
}
