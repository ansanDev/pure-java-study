package catsbi.me.recursive;

public class LinkedListApplication {

    public static void main(String[] args) {
        ListNodeStack nodeStack = new ListNodeStack();

        nodeStack.push(1);
        nodeStack.push(2);
        nodeStack.push(3);

        while (nodeStack.hasNext()) {
            System.out.println(nodeStack.pop());
        }

    }
}
