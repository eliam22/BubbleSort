/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_9;
import javax.swing.JOptionPane;
/**
 *
 * @author eliamyaet
 */
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }
}

public class Arbol{
    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        return raiz;
    }

    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private Nodo eliminarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = eliminarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = eliminarRec(raiz.derecho, valor);
        } else {
            if (raiz.izquierdo == null) {
                return raiz.derecho;
            } else if (raiz.derecho == null) {
                return raiz.izquierdo;
            }

            raiz.valor = encontrarMinimoValor(raiz.derecho);
            raiz.derecho = eliminarRec(raiz.derecho, raiz.valor);
        }

        return raiz;
    }

    private int encontrarMinimoValor(Nodo raiz) {
        int minimoValor = raiz.valor;
        while (raiz.izquierdo != null) {
            minimoValor = raiz.izquierdo.valor;
            raiz = raiz.izquierdo;
        }
        return minimoValor;
    }

    public void imprimirEnOrden() {
        imprimirEnOrdenRec(raiz);
    }

    private void imprimirEnOrdenRec(Nodo raiz) {
        if (raiz != null) {
            imprimirEnOrdenRec(raiz.izquierdo);
            JOptionPane.showMessageDialog(null, raiz.valor + " ");
            imprimirEnOrdenRec(raiz.derecho);
        }
    }

    public static void main(String[] args) {
        Arbol ar = new Arbol();
        ar.insertar(10);
        ar.insertar(9);
        ar.insertar(6);
        ar.insertar(8);
        ar.insertar(7);
        ar.insertar(5);
        ar.insertar(3);
        ar.insertar(2);
        ar.insertar(4);
        ar.insertar(1);

        JOptionPane.showMessageDialog(null, "Árbol en orden");
        ar.imprimirEnOrden();

        JOptionPane.showMessageDialog(null, "Eliminar 10:");
        ar.eliminar(10);
        ar.imprimirEnOrden();

        JOptionPane.showMessageDialog(null, "Eliminar 1:");
        ar.eliminar(1);
        ar.imprimirEnOrden();
    }
}
