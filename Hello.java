public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0]);

        String ambiente = args[0];

        if (ambiente.equalsIgnoreCase("bruno")) {
            
            System.out.println(ambiente);
        }
    }
}