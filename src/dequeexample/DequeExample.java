/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequeexample;

import doublylinkedlist.DNode;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enubs
 */
public class DequeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        DNode<String> node1 = new DNode<>(null, "node1", null);
        DNode<String> node2 = new DNode<>(null, "node2", null);
        DNode<String> node3 = new DNode<>(null, "node3", null);
        DNode<String> node4 = new DNode<>(null, "node4", null);
        DNode<String> node5 = new DNode<>(null, "node5", null);

        DequeList<DNode> list = new DequeList<>();
        list.addFirst(node1);
        list.addFirst(node2);
        list.addFirst(node3);
        list.addFirst(node4);
        list.addLast(node5);

        try {
            System.out.println("Before Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove First: " + list.removeFirst().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();

            System.out.println();
            System.out.println("Remove Last: " + list.removeLast().getElement());
            System.out.print("After Remove: ");
            list.showDeque();
        } catch (EmptyDequeException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
