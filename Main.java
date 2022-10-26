public class Main {
    public static void main(String[] args) {
        String name = "Vanier College";
        System.out.println(name.substring(0, 6));
        System.out.println(name.compareTo("Vanier"));
        System.out.println(name.indexOf("j") >= 0 ? true : false);
        System.out.println(name.equalsIgnoreCase("VANIER COllege"));

        System.out.println("New \"stuff\"");
        System.out.println("ϼϼ");
    }
}
