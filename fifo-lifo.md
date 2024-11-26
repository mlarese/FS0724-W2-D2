

### **FIFO (Queue)**

Puoi utilizzare la classe `LinkedList` o `ArrayDeque`, che implementano l'interfaccia `Queue`.

#### Utilizzo di `LinkedList` o `ArrayDeque`
```java
import java.util.LinkedList;
import java.util.Queue;

public class FifoExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>(); // Oppure usa ArrayDeque<String>();
        
        // Aggiunta di elementi (enqueue)
        queue.add("A");
        queue.add("B");
        queue.add("C");

        // Rimozione di elementi (dequeue)
        System.out.println(queue.poll()); // Stampa "A"
        System.out.println(queue.poll()); // Stampa "B"
        System.out.println(queue.poll()); // Stampa "C"
    }
}
```

---

### **LIFO (Stack)**

Puoi utilizzare la classe `Stack` oppure l'implementazione moderna con `Deque`.

#### Utilizzo di `Stack` (deprecato in contesti moderni ma funzionale)
```java
import java.util.Stack;

public class LifoExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        // Aggiunta di elementi (push)
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Rimozione di elementi (pop)
        System.out.println(stack.pop()); // Stampa "C"
        System.out.println(stack.pop()); // Stampa "B"
        System.out.println(stack.pop()); // Stampa "A"
    }
}
```

#### Utilizzo di `ArrayDeque` come Stack
```java
import java.util.ArrayDeque;
import java.util.Deque;

public class LifoExampleWithDeque {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        
        // Aggiunta di elementi (push)
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Rimozione di elementi (pop)
        System.out.println(stack.pop()); // Stampa "C"
        System.out.println(stack.pop()); // Stampa "B"
        System.out.println(stack.pop()); // Stampa "A"
    }
}
```
