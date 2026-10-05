import java.util.Scanner;

public class whilefinal {
    public static void main(String[] args) {
        String opcion = "0";
        Scanner scanner = new Scanner(System.in);

        while (!opcion.equals("6")) {
            System.out.println("""
                        
                        Proyecto Final de la asignatura
                        Hecho por Israel Moreno Lopez
                        Version 0.1
                        Menu Principal
                        1. if - Triangulos
                        2. for - Padovan
                        3. while - Sumatoria de 1/1+1/2...+1/n
                        4. Do - Conjetura de Collatz
                        5. Arreglos - Rotar un arreglo a la derecha
                        6. bye          
                    """);
            System.out.print("\nQue quieres hacer: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Triangulos");
                    System.out.println("Presione enter para continuar");
                    scanner.nextLine();
                    triangulos();
                    break;

                case "2":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Padovan");
                    System.out.println("Presione enter para continuar");
                    scanner.nextLine();
                    Padovan();
                    break;

                case "3":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Sumatoria 1/n");
                    System.out.println("Presione enter para continuar");
                    scanner.nextLine();
                    while4();
                    break;

                case "4":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Colatz");
                    System.out.println("Presione enter para continuar");
                    scanner.nextLine();
                    collatz();
                    break;

                case "5":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Rotar a la derecha");
                    System.out.println("Presione enter para continuar");
                    scanner.nextLine();
                    arreglos8();
                    break;

                case "6":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Salir del programa.......");
                    System.out.println("Presione enter para continuar");
                    scanner.nextLine();
                    break;

                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println(opcion + " no disponible (opciones del 1 al 6)");
                    System.out.println("Presione enter para continuar");
                    scanner.nextLine();
                    break;
            }
        }
        scanner.close();
    }

    public static void triangulos() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sistema para determinar qué tipo de triángulo es");
            System.out.println("Desarrollado por Israel");
            String opc = "s";

            while (opc.equals("s")) {
                try {
                    System.out.print("Ingrese lado 1: ");
                    float lado1 = scanner.nextFloat();
                    if (lado1 > 0) {
                        System.out.print("Ingrese lado 2: ");
                        float lado2 = scanner.nextFloat();
                        if (lado2 > 0) {
                            System.out.print("Ingrese lado 3: ");
                            float lado3 = scanner.nextFloat();
                            if (lado3 > 0) {
                                float mayor = Math.max(lado1, Math.max(lado2, lado3));
                                System.out.println("El lado mayor es: " + mayor);
                                if (mayor <= lado1 + lado2 + lado3 - mayor) {
                                    System.out.println("Es un triángulo");
                                    if (lado1 == lado2 && lado2 == lado3) {
                                        System.out.println("El triángulo es equilátero");
                                    } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                                        System.out.println("Es un triángulo escaleno");
                                    } else {
                                        System.out.println("Es un triángulo isósceles");
                                    }
                                } else {
                                    System.out.println("No es un triángulo");
                                }
                            } else {
                                System.out.println("Error en la longitud del lado 3");
                            }
                        } else {
                            System.out.println("Error en la longitud del lado 2");
                        }
                    } else {
                        System.out.println("Error en la longitud del lado 1");
                    }
                } catch (Exception e) {
                    System.out.println("Error: Entrada inválida. Asegúrese de ingresar un número válido.");
                    scanner.nextLine();
                }
                System.out.print("Otra vez (s/n): ");
                opc = scanner.next();
            }
        } catch (Exception e) {
            System.out.println("Error inesperado en Triángulos: " + e.getMessage());
        }
    }

    public static void Padovan() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Secuencia de Padovan");
            System.out.println("Desarrollado por Israel Moreno Lopez");
            String opc = "s";

            while (opc.equals("s")) {
                try {
                    System.out.print("Ingrese el límite: ");
                    int limite = scanner.nextInt();
                    System.out.println("Límite = " + limite);

                    int p0 = 1, p1 = 1, p2 = 1;
                    System.out.print(p0 + ", " + p1 + ", " + p2);

                    int siguiente;
                    while (true) {
                        siguiente = p0 + p1;
                        if (siguiente > limite) {
                            break;
                        }
                        System.out.print(", " + siguiente);
                        p0 = p1;
                        p1 = p2;
                        p2 = siguiente;
                    }
                    System.out.println("\nOtra vez (s/n): ");
                    opc = scanner.next();
                } catch (Exception e) {
                    System.out.println("Error: Entrada inválida. Asegúrese de ingresar un número entero.");
                    scanner.nextLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Error inesperado en Padovan: " + e.getMessage());
        }
    }
    
    public static void while4() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hecho por Israel Moreno Lopez");
            System.out.println("Sumatoria de 1/n");
            String opc = "s";

            while (opc.equals("s")) {
                try {
                    System.out.print("Da el número de la sumatoria: ");
                    int limite = scanner.nextInt();
                    double suma = 0.0;

                    System.out.print("La serie es: ");
                    for (int divisor = 1; divisor <= limite; divisor++) {
                        suma += 1.0 / divisor;
                        System.out.print("1/" + divisor);
                        if (divisor < limite) {
                            System.out.print(" + ");
                        }
                    }
                    System.out.printf("\nResultado: %.2f\n", suma);
                } catch (Exception e) {
                    System.out.println("Error: Entrada inválida. Asegúrese de ingresar un número entero.");
                    scanner.nextLine();
                }
                System.out.print("\n¿Otra vez (s/n)?: ");
                opc = scanner.next();
            }
        } catch (Exception e) {
            System.out.println("Error inesperado en Sumatoria 1/n: " + e.getMessage());
        }
    }

    public static void collatz() {
        try {
            Scanner scanner = new Scanner(System.in);
            String opcion;

            System.out.println("Conjetura de Collatz");
            System.out.println("Desarrollado por: Israel Moreno Lopez");
            do {
                int numero;
                do {
                    try {
                        System.out.print("Ingrese un número entero positivo: ");
                        numero = Integer.parseInt(scanner.nextLine());

                        if (numero <= 0) {
                            System.out.println("Error: Por favor, ingrese un número mayor a 0.");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Solo se permiten números enteros.");
                    }
                } while (true);

                System.out.println("\nSecuencia de Collatz para el número " + numero + ":");
                do {
                    System.out.print(numero + " ");
                    if (numero % 2 == 0) {
                        numero /= 2; 
                    } else {
                        numero = numero * 3 + 1; 
                    }
                } while (numero != 1);

                System.out.print(numero + "\n");

                System.out.print("\nOtra vez? (s/n): ");
                opcion = scanner.nextLine();

            } while (opcion.equalsIgnoreCase("s"));

            System.out.println("\nPrograma finalizado.");
        } catch (Exception e) {
            System.out.println("Error inesperado en Conjetura de Collatz: " + e.getMessage());
        }
    }

    public static void arreglos8() {
        try {
            Scanner scanner = new Scanner(System.in); 
            System.out.println("Rotar a la derecha");
            System.out.println("Desarrollado por: Israel Moreno Lopez");

            String opc = "s"; 

            while (opc.equalsIgnoreCase("s")) {
                int k = 0;
                int[] arreglo = new int[10]; 

                for (int i = 0; i < 10; i++) {
                    while (true) {
                        try {
                            System.out.print("Arreglo [" + i + "] = ");
                            arreglo[i] = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Solo números enteros, por favor.");
                        }
                    }
                }
                System.out.println("\nArreglo antes del desplazamiento:");
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("Arreglo [" + i + "] = " + arreglo[i]);
                }
                while (true) {
                    try {
                        System.out.print("Número de desplazamientos: ");
                        k = Integer.parseInt(scanner.nextLine());
                        if (k < 0) {
                            System.out.println("Error: Solo números iguales o mayores a 0.");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Solo números iguales o mayores a 0, por favor.");
                    }
                }
                k %= 10;

                for (int j = 0; j < k; j++) {
                    int ultimo = arreglo[arreglo.length - 1]; 

                    for (int i = arreglo.length - 1; i > 0; i--) {
                        arreglo[i] = arreglo[i - 1]; 
                    }
                    arreglo[0] = ultimo; 
                }
                System.out.println("\nArreglo después del desplazamiento:");
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("Arreglo [" + i + "] = " + arreglo[i]);
                }
                System.out.print("\n¿Otra vez (s/n)?: ");
                opc = scanner.nextLine();
            }

            System.out.println("Se acabó.");
        } catch (Exception e) {
            System.out.println("Error inesperado en Rotar a la derecha: " + e.getMessage());
        }
    }
}