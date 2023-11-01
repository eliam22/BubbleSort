/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_10;

/**
 *
 * @author eliamyaet
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        // Insertar elementos en el árbol.
        avlTree.root = avlTree.insert(avlTree.root, 10);
        avlTree.root = avlTree.insert(avlTree.root, 20);
        avlTree.root = avlTree.insert(avlTree.root, 30);
        avlTree.root = avlTree.insert(avlTree.root, 40);
        avlTree.root = avlTree.insert(avlTree.root, 50);
        avlTree.root = avlTree.insert(avlTree.root, 25);

        // Realizar un recorrido inorden para mostrar los elementos en orden.
        StringBuilder inOrderResult = new StringBuilder("Recorrido inorden del árbol AVL:\n");
        inOrder(avlTree.root, inOrderResult);
        JOptionPane.showMessageDialog(null, inOrderResult.toString());

        // Eliminar un elemento del árbol.
        avlTree.root = avlTree.delete(avlTree.root, 30);

        // Realizar un recorrido inorden nuevamente después de la eliminación.
        StringBuilder inOrderAfterDeletionResult = new StringBuilder("Recorrido inorden después de eliminar 30:\n");
        inOrder(avlTree.root, inOrderAfterDeletionResult);
        JOptionPane.showMessageDialog(null, inOrderAfterDeletionResult.toString());
    }

    // Función para realizar un recorrido inorden y construir una cadena.
    public static void inOrder(TreeNode node, StringBuilder result) {
        if (node != null) {
            inOrder(node.left, result);
            result.append(node.data).append(" ");
            inOrder(node.right, result);
        }
    }
}


