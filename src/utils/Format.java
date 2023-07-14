package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Format {
    public static String formatRupiah(Double amount) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setCurrencySymbol("Rp ");
        symbols.setGroupingSeparator('.');
        symbols.setMonetaryDecimalSeparator(',');

        DecimalFormat rupiahFormat = new DecimalFormat("Rp # , #,##0.00", symbols);
        return rupiahFormat.format(amount);
    }
}
