package org.example;

import java.util.*;

public class Alumno {
    private int no_cuenta;
    private String nombre;
    private int edad;
    private String mail;
    private int semestre;
    private String[] materias;
    private double grade;

    public Alumno() {
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "no_cuenta=" + no_cuenta +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", mail='" + mail + '\'' +
                ", semestre=" + semestre +
                ", materias=" + Arrays.toString(materias) +
                ", grade=" + grade +
                '}';
    }

    public void setNo_cuenta(int no_cuenta) {
        this.no_cuenta = no_cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getNo_cuenta() {
        return no_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMail() {
        return mail;
    }

    public int getSemestre() {
        return semestre;
    }

    public String[] getMaterias() {
        return materias;
    }

    public double getGrade() {
        return grade;
    }

    public Alumno(int no_cuenta, String nombre, int edad, String mail, int semestre, String[] materias, double grade) {
        this.no_cuenta = no_cuenta;
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.semestre = semestre;
        this.materias = materias;
        this.grade = grade;
    }

    //Metodo para generar el promedio aleatorio
    public void generarGradeAleatorio() {
        Random random = new Random();
        this.grade = 6.0 + (random.nextDouble() * 4.0);
        this.grade = Math.round(this.grade * 10.0) / 10.0;
    }
    //Metodo para generar el numero de cuenta aleatorio
    public void generarCuentaAleatoria() {
        Random random = new Random();
        this.no_cuenta = 400000000 + random.nextInt(100000000);
    }
    //Metodo para generar la edad aleatoria
    public void generarEdadAleatoria() {
        Random random = new Random();
        this.edad = 18 + random.nextInt(11);
    }
    //Metodo para generar el semeste aleatorio
    public void generarSemestreAleatorio() {
        Random random = new Random();
        this.semestre = random.nextInt(9) + 1;
    }
    //Metodo para generar las materias aleatorias con usos de Hash para evitar repeticiones
    public void generarMateriasAleatorias(){
        Random random = new Random();
        String[] materias = {"GEOMETRIA ANALITICA", "CALCULO DIFERENCIAL E INTEGRAL", "ALGEBRA", "COMPUTADORAS Y PROGRAMACION", "INTROD. A LA INGENIERIA COMPUTACION",
                "ALGEBRA LINEAL", "CALCULO VECTORIAL", "PROGRAMACION ORIENTADA A OBJETOS", "COMUNICACION", "EMPRENDIMIENTO 1", "TALLER DE CREATIVIDAD E INNOVACION",
                "ELECTRICIDAD Y MAGNETISMO (L)", "ESTRUCTURA DE DATOS", "METODOS NUMERICOS", "ECUACIONES DIFERENCIALES", "EMPRENDIMIENTO 2", "PROBABILIDAD Y ESTADISTICA",
                "BASES DE DATOS 1", "EMPRENDIMIENTO 3", "MATEMATICAS DISCRETAS", "DISPOSITIVOS ELECTRONICOS (L)", "LENGUAJES FORMALES-AUTOMATAS", "DISEÑO Y ANALISIS DE ALGORITMOS",
                "ADMINISTRACION DE PROYECTOS", "PROGRAMACION WEB 1", "DISEÑO LOGICO (L)", "COMPILADORES", "SISTEMAS OPERATIVOS", "DISEÑO DE SISTEMAS DIGITALES (L)",
                "INGENIERIA DE SOFTWARE", "SISTEMAS DE INFORMACION", "PROGRAMACION WEB 2", "BASES DE DATOS 2", "PROGRAMACION MOVIL 1", "REDES DE COMPUTADORAS 2",
                "HABILIDADES DIRECTIVAS", "INTELIGENCIA ARTIFICIAL", "SEGURIDAD INFORMATICA", "MINERIA DE DATOS"};

        Set<String> materiasSeleccionadas = new HashSet<>();

        while (materiasSeleccionadas.size() < 5) {
            String materiaAleatoria = materias[random.nextInt(materias.length)];
            materiasSeleccionadas.add(materiaAleatoria);
        }

        this.materias = materiasSeleccionadas.toArray(new String[0]);
    }
    //Metodo para generar el nombre y correo(el correo se genera en base al nombre y un numero aleatorio)
    public void generarNombreyCorreo() {

        String[] nombres = {"SOFIA", "SEBASTIAN", "MARISA", "LEONARDO", "VALENTINA", "REGINA", "XIMENA", "MATIAS", "CAMILA", "EMILIANO",
                "DIEGO", "MARIA", "MIGUEL", "DANIEL", "VALERIA", "RENATA", "VICTORIA", "ALEXANDER", "ALEJANDRO", "GAEL", "JESUS",
                "NATALIA", "DANIELA", "ISABELLA", "ROMINA", "ANGEL", "DAVID", "LUIS", "FERNANDO", "EMMANUEL", "MARIA", "MAXIMILIANO",
                "FERNANDA", "JOSELIN", "ALEXA", "RODRIGO", "ANA", "ANDREA", "EDUARDO", "JASIEL", "JUAN PABLO", "GABRIEL", "SAMANTHA",
                "DYLAN", "GUADALUPE", "JUAN", "TADEO", "MELISSA", "AXEL", "RAFAEL", "JOSE", "ISAAC", "ALEXIS", "ELIZABETH", "RICARDO",
                "SAMUEL", "IKER", "JONATHAN", "LEONEL", "MARIANA", "AITANA", "DAMIAN", "EMILIO", "YAMILETH", "ALAN"};

        String[] apellidos = {"RODRIGUEZ", "SANCHEZ", "RAMIREZ", "CRUZ", "GOMEZ", "FLORES", "MORALES", "VAZQUEZ",
                "JIMENEZ", "REYES", "DIAZ", "TORRES", "GUTIERREZ", "RUIZ", "MENDOZA", "AGUILAR",
                "MENDEZ", "MORENO", "ORTIZ", "JUAREZ", "CASTILLO", "ALVAREZ", "ROMERO", "RAMOS",
                "RIVERA", "CHAVEZ", "DE LA CRUZ", "DOMINGUEZ", "GUZMAN", "VELAZQUEZ", "SANTIAGO",
                "HERRERA", "CASTRO", "VARGAS", "MEDINA", "ROJAS", "MUÑOZ", "LUNA", "CONTRERAS",
                "BAUTISTA", "SALAZAR", "ORTEGA", "GUERRERO", "ESTRADA", "CORTES", "ESPINOZA",
                "SOTO", "ALVARADO", "LARA", "CARRILLO", "AVILA", "CERVANTES", "SILVA", "RIOS",
                "SANTOS", "MARQUEZ", "MEJIA", "VEGA", "SANDOVAL", "DELGADO", "NUÑEZ", "IBARRA"};


        Random random = new Random();

        String nombreAleatorio = nombres[random.nextInt(nombres.length)];
        String apellidoAleatorio = apellidos[random.nextInt(apellidos.length)];
        String apellidoAleatorio2 = apellidos[random.nextInt(apellidos.length)];
        int numero  = random.nextInt(20);

        this.nombre = nombreAleatorio + " " + apellidoAleatorio+ " " +apellidoAleatorio2;
        this.mail = nombreAleatorio.toLowerCase()+apellidoAleatorio.toLowerCase()+ numero + "@aragon.unam.mx";
    }



}
