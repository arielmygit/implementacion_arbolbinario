package org.example;

public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // Insertar un alumno al árbol
    public void insertar(Alumno alumno) {
        raiz = insertarRecursivo(raiz, alumno);
    }

    private Nodo insertarRecursivo(Nodo nodo, Alumno alumno) {
        if (nodo == null) {
            nodo = new Nodo(alumno);
            return nodo;
        }
        if (alumno.getNo_cuenta() < nodo.alumno.getNo_cuenta()) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, alumno);
        } else if (alumno.getNo_cuenta() > nodo.alumno.getNo_cuenta()) {
            nodo.derecho = insertarRecursivo(nodo.derecho, alumno);
        }
        return nodo;
    }

    // Buscar alumno por número de cuenta
    public Alumno buscar(int noCuenta) {
        return buscarRecursivo(raiz, noCuenta);
    }

    private Alumno buscarRecursivo(Nodo nodo, int noCuenta) {
        if (nodo == null) {
            return null;
        }
        if (noCuenta == nodo.alumno.getNo_cuenta()) {
            return nodo.alumno;
        }
        if (noCuenta < nodo.alumno.getNo_cuenta()) {
            return buscarRecursivo(nodo.izquierdo, noCuenta);
        } else {
            return buscarRecursivo(nodo.derecho, noCuenta);
        }
    }

    // Mostrar todos los alumnos en orden
    public void mostrarEnOrden() {
        mostrarInOrdenRecursivo(raiz);
    }

    private void mostrarInOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            mostrarInOrdenRecursivo(nodo.izquierdo);
            System.out.println(nodo.alumno);
            mostrarInOrdenRecursivo(nodo.derecho);
        }
    }

}
