class Solution 
{
    public Node flatten(Node head) 
    {

        if (head == null) 
        {
            return null;
        }

        Node current = head;

        while (current != null) {

            if (current.child != null) {

                Node nextNode = current.next;
                Node childNode = current.child;

                current.next = childNode;
                childNode.prev = current;

                current.child = null;

                Node tail = childNode;

                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = nextNode;

                if (nextNode != null) {
                    nextNode.prev = tail;
                }
            }

            current = current.next;
        }

        return head;
    }
}
