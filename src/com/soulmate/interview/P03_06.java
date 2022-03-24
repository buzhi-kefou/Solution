package com.soulmate.interview;

import java.util.LinkedList;

public class P03_06 {

    class Node {
        int id;
        int category;

        public Node() {

        }

        public Node(int id, int category) {
            this.id = id;
            this.category = category;
        }
    }

    class AnimalShelf {
        LinkedList<Node> queue;
        int dog = 0, cat = 0;

        public AnimalShelf() {
            queue = new LinkedList<Node>();
        }

        public void enqueue(int[] animal) {
            if (animal[1] == 1)
                dog++;
            else
                cat++;
            queue.addLast(new Node(animal[0], animal[1]));
        }

        public int[] dequeueAny() {
            if (queue.isEmpty())
                return new int[]{-1, -1};
            Node node = queue.removeFirst();
            if (node.category == 1)
                dog--;
            else
                cat--;
            return new int[]{node.id, node.category};
        }

        public int[] dequeueDog() {
            if (queue.isEmpty() || dog == 0)
                return new int[]{-1, -1};
            dog--;
            for (int i = 0; i < queue.size(); i++) {
                Node node = queue.get(i);
                if (node.category == 1) {
                    queue.remove(i);
                    return new int[]{node.id, node.category};
                }
            }
            return null;
        }

        public int[] dequeueCat() {
            if (queue.isEmpty() || cat == 0)
                return new int[]{-1, -1};
            cat--;
            for (int i = 0; i < queue.size(); i++) {
                Node node = queue.get(i);
                if (node.category == 0) {
                    queue.remove(i);
                    return new int[]{node.id, node.category};
                }
            }
            return null;
        }
    }
}
