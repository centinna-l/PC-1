public class PigLatin {
    public static void main(String[] args) {
        String first = "walt";
        String last = "savitch";
        String temp = first.substring(1) + first.charAt(0) + "ay"; // Change to pig latin
        System.out.print(temp.toUpperCase().substring(0, 1) + temp.substring(1) + " ");
        temp = last.substring(1) + last.charAt(0) + "ay"; // Change to pig latin
        System.out.print(temp.toUpperCase().substring(0, 1) + temp.substring(1) + " ");

    }
}
