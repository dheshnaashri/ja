public class Department {
    static class Department extend College {
        Department() {
            System.out.println("CT Have opened");
        }
        @Override
        public void close() throws Exception {
            System.out.println("CT Has Closed");
        }
    }
}
