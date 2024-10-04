package src;

import javax.swing.*;

public class Uppgift1 {
    public static void main(String[] args) {

        String height = JOptionPane.showInputDialog("Vad är höjden?");
        String width = JOptionPane.showInputDialog("Vad är bredden?");
        String price = JOptionPane.showInputDialog("Vad är priset per kvadratmeter?");
        String discount ;

        double heightDouble = Double.parseDouble(height);
        double widthDouble = Double.parseDouble(width);
        double priceDouble = Double.parseDouble(price);

        double totalPrice = heightDouble * widthDouble * priceDouble;
        double priceAfterDiscount = 1000;

        if (totalPrice>5000) {
            priceAfterDiscount = totalPrice * 0.75;
            discount = "25%";
        } else if (totalPrice>2500) {
            priceAfterDiscount = totalPrice * 0.9;
            discount = "10%";
        } else if (totalPrice>1500) {
            priceAfterDiscount = totalPrice * 0.95;
            discount = "5%";
        } else {
            priceAfterDiscount = totalPrice;
            discount = "0";
        }

        JOptionPane.showMessageDialog ( null,"Fönstrets höjd:" + height + "\nFönstretsbredd:" + width + "\nPris per kvadratmeter:" + price + "kr" +
                "\nUrsprunglig kostnad:" + totalPrice + "kr" + "\nRabatt:" + discount + "\nSlutkostnad:" + priceAfterDiscount + "kr");

}

}
