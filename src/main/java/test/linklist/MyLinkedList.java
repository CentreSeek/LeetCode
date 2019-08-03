package test.linklist;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedList<AnyType> implements Iterable<AnyType> {


    @Override
    public Iterator<AnyType> iterator() {
        return null;
    }


    private static class Noode<AnyType> {
        public Noode<AnyType> prev;
        public Noode<AnyType> next;
        public Object data;
        Noode(Noode<AnyType> prev,Noode<AnyType> next,Object data){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
