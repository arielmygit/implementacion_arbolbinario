package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        for (int i = 0; i < 100; i++) {
            Alumno alumno = new Alumno();

            alumno.generarCuentaAleatoria();
            alumno.generarEdadAleatoria();
            alumno.generarNombreyCorreo();
            alumno.generarSemestreAleatorio();
            alumno.generarMateriasAleatorias();
            alumno.generarGradeAleatorio();

            arbol.insertar(alumno);
        }

        arbol.mostrarEnOrden();

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n------------MENU--------------");
            System.out.println("1. Insertar un nuevo alumno aleatorio");
            System.out.println("2. Buscar un alumno por número de cuenta");
            System.out.println("3. Salir");
            System.out.print("Eliga una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Alumno nuevoAlumno = new Alumno();
                    nuevoAlumno.generarCuentaAleatoria();
                    nuevoAlumno.generarEdadAleatoria();
                    nuevoAlumno.generarNombreyCorreo();
                    nuevoAlumno.generarSemestreAleatorio();
                    nuevoAlumno.generarMateriasAleatorias();
                    nuevoAlumno.generarGradeAleatorio();

                    arbol.insertar(nuevoAlumno);
                    System.out.println("Nuevo alumno insertado correctamente.");
                    System.out.println(nuevoAlumno);
                    break;

                case 2:
                    System.out.print("Ingrese el número de cuenta del alumno a buscar: ");
                    int noCuenta = scanner.nextInt();

                    Alumno encontrado = arbol.buscar(noCuenta);

                    if (encontrado != null) {
                        System.out.println("Alumno encontrado:");
                        System.out.println("Nombre: " + encontrado.getNombre());
                        System.out.println("Materias: ");
                        for (String materia : encontrado.getMaterias()) {
                            System.out.println("- " + materia);
                        }
                        System.out.println("Promedio: " + encontrado.getGrade());
                    } else {
                        System.out.println("Alumno no encontrado con el número de cuenta " + noCuenta);
                    }
                    break;

                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}