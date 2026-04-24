import java.util.*;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addFirst(3);
        list.addFirst(4);
        list.add(44);
        list.add(22);
        list.add(2,50);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        list.remove(2);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);

        System.out.println(list.size());

    }
}
