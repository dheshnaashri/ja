public class Year{
static class Year extends Department{
    Department(){
        System.out.println("I-Year Have opened");
    }
    @Override
    public void close() throws Exception {
        System.out.println("I-Year Has Closed");
    }
}

    }