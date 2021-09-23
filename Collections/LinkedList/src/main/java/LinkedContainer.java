public class LinkedContainer<E> implements Linked<E>{

    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size;

    @Override
    public void addLast(E e) {
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<>(null, prev, null);
        prev.setNextElement(lstNode);
        size++;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getByIndex(int index) {
         Node<E> target = fstNode.getNextElement();
         for (int i = 0; i < index; i++){
             target = getNextElement(target);
         }
         return target.getCurrentElement();
    }

    private Node<E> getNextElement(Node<E> current){
        return current.getNextElement();
    }

    private class Node<E>{
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }


}

