import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormat {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(numberFormat.format(1.2345));
        System.out.println(numberFormat.format(15.67890));
    }
}
