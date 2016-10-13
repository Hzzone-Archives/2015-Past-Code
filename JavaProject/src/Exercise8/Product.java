package Exercise8;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Product {
    private String code;
    private String description;
    private double price;

    public Product(String var1, String var2, double var3) {
        this.code = var1;
        this.description = var2;
        this.price = var3;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean equals(Object var1) {
        return var1 instanceof Product && this.getCode().equals(((Product)var1).getCode());
    }

    public String toString() {
        return this.getCode() + "_" + this.getDescription() + "_" + this.getPrice();
    }

    public JPanel getPanel() {
        JPanel var1 = new JPanel(new BorderLayout());
        JTextField var2 = new JTextField(this.getCode(), 17);
        JTextField var3 = new JTextField(this.getDescription(), 17);
        JTextField var4 = new JTextField(Double.toString(this.getPrice()), 17);
        var2.setEditable(false);
        var3.setEditable(false);
        var4.setEditable(false);
        JPanel var5 = new JPanel(new GridLayout(3, 1));
        var5.add(new JLabel("Code:"));
        var5.add(new JLabel("Description: "));
        var5.add(new JLabel("Price:"));
        JPanel var6 = new JPanel(new GridLayout(3, 1));
        var6.add(var2);
        var6.add(var3);
        var6.add(var4);
        var1.add(var5, "West");
        var1.add(var6, "Center");
        return var1;
    }
}
