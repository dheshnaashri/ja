import java.util.LinkedList;
import java.util.Queue;
public class day10link {
    static void main() {
        LinkedList<String>queue = new LinkedList<String>();
            queue.add("Dhuvan");
            queue.add("Shreyas");
            queue.add("Ashhmi");
            queue.add("rithanya");
            queue.add("suvetha");
        while(!queue.isEmpty()) {
            process(queue);
        }
        }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
    }
