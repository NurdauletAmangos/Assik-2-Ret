public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing MyArrayList ===");
        testMyArrayList();

        System.out.println("\n=== Testing MyLinkedList ===");
        testMyLinkedList();

        System.out.println("\n=== Testing MyStack ===");
        testMyStack();

        System.out.println("\n=== Testing MyQueue ===");
        testMyQueue();

        System.out.println("\n=== Testing MyMinHeap ===");
        testMyMinHeap();
    }

    private static void testMyArrayList() {
        MyArrayList<Integer> list = new MyArrayList<>();

        // Добавление элементов
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add: " + arrayToString(list.toArray()));

        // Добавление по индексу
        list.add(1, 15);
        System.out.println("After add at index 1: " + arrayToString(list.toArray()));

        // Получение элементов
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Удаление элементов
        list.remove(2);
        System.out.println("After remove at index 2: " + arrayToString(list.toArray()));

        // Проверка существования элемента
        System.out.println("Exists 20? " + list.exists(20));
        System.out.println("Exists 25? " + list.exists(25));

        // Сортировка
        list.add(5);
        list.add(25);
        System.out.println("Before sort: " + arrayToString(list.toArray()));
        list.sort();
        System.out.println("After sort: " + arrayToString(list.toArray()));
    }

    private static void testMyLinkedList() {
        MyLinkedList<String> list = new MyLinkedList<>();

        // Добавление элементов
        list.add("Apple");
        list.add("Banana");
        list.addFirst("Apricot");
        list.addLast("Cherry");
        System.out.println("After adds: " + arrayToString(list.toArray()));

        // Добавление по индексу
        list.add(2, "Blueberry");
        System.out.println("After add at index 2: " + arrayToString(list.toArray()));

        // Получение элементов
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Удаление элементов
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println("After removes: " + arrayToString(list.toArray()));

        // Проверка индексов
        System.out.println("Index of 'Banana': " + list.indexOf("Banana"));
        System.out.println("Last index of 'Blueberry': " + list.lastIndexOf("Blueberry"));
    }

    private static void testMyStack() {
        MyStack<Integer> stack = new MyStack<>();

        // Добавление элементов
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack size: " + stack.size());

        // Просмотр и извлечение
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack size after pops: " + stack.size());

        // Проверка пустоты
        System.out.println("Is empty? " + stack.isEmpty());
        stack.pop();
        System.out.println("Is empty after last pop? " + stack.isEmpty());
    }

    private static void testMyQueue() {
        MyQueue<String> queue = new MyQueue<>();

        // Добавление элементов
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        System.out.println("Queue size: " + queue.size());

        // Просмотр и извлечение
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue size after dequeues: " + queue.size());

        // Проверка пустоты
        System.out.println("Is empty? " + queue.isEmpty());
        queue.dequeue();
        System.out.println("Is empty after last dequeue? " + queue.isEmpty());
    }

    private static void testMyMinHeap() {
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        // Добавление элементов
        heap.insert(30);
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);
        System.out.println("Heap size: " + heap.size());

        // Извлечение минимального элемента
        System.out.println("Min element: " + heap.getMin());
        System.out.println("Extracted min: " + heap.extractMin());
        System.out.println("Extracted min: " + heap.extractMin());
        System.out.println("Heap size after extracts: " + heap.size());

        // Проверка пустоты
        System.out.println("Is empty? " + heap.isEmpty());
    }

    private static String arrayToString(Object[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}