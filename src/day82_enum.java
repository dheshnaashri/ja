public class day82_enum {
    enum LANGUAGES{
        EN("English"),
        GR("German"),
        JP("Japanese"),
        TA("Tamil");

        String description;

        LANGUAGES(String description) {
            this.description = description;
        }
    }
    static void main() {
        System.out.println(LANGUAGES.TA.description);
    }
}