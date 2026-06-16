public class day9 {
LinkedList<String> queue() {

// Add 5 names
    queue.add("Alice");
    queue.add("Bob");
    queue.add("Charlie");
    queue.add("David");
    queue.add("Emma");

    process(queue)
    {
        queue.removeFirst()
    }
}
// Repeat until queue is empty
while (queue is not empty)
        {
process(queue)
}