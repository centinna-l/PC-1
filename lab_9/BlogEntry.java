package lab_9;

public class BlogEntry {
    public String username;
    public String entry;
    public Date date;

    BlogEntry(String username, String entry, Date date) {
        this.username = username;
        this.entry = entry;
        this.date = new Date(date);
    }

    public void DisplayEntry() {
        System.out.println("Username " + username);
        System.out.println("Entry " + entry);
        System.out.println("Date " + date);
    }

    public void getSummary() {
        String[] words = entry.split(" ");
        System.out.println("The Summary of the text ");
        if (words.length >= 10) {
            for (int i = 0; i < 10; i++) {
                System.out.println(words[i]);
            }
        } else {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        BlogEntry blogEntry = new BlogEntry("Bluedevil",
                "Doremon is called a Nile Badwe in hindi, urshil is a nila badwa. I am a good developer.",
                new Date(02, 11, 2022));
        blogEntry.DisplayEntry();
        blogEntry.getSummary();
    }
}
