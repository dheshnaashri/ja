public class day15threads {
    static void main() throws InterruptedException {
        Runnable chefTask = () -> {
           String[] items = {"Dosa","Parrotta","Coffee"};
           for (int i = 0; i < items.length; i++){
               System.out.println("Cooking Item: "+ items[i]);
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException e){
                   throw new RuntimeException(e);
               }
            }
        };
        Thread chefThread = new Thread(chefTask, "chef-thread");
        chefThread.start();
        chefThread.join();
    }
}