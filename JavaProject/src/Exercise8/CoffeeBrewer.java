package Exercise8;

/**
 * Created by HZzone on 16/6/5.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CoffeeBrewer extends Product {
    private String model;
    private String waterSupply;
    private int numberOfCups;

    public CoffeeBrewer(String var1, String var2, double var3, String var5, String var6, int var7) {
        super(var1, var2, var3);
        this.model = var5;
        this.waterSupply = var6;
        this.numberOfCups = var7;
    }

    public String getModel() {
        return this.model;
    }

    public String getWaterSupply() {
        return this.waterSupply;
    }

    public int getNumberOfCups() {
        return this.numberOfCups;
    }

    public String toString() {
        return super.toString() + "_" + this.getModel() + "_" + this.getWaterSupply() + "_" + this.getNumberOfCups();
    }

    public JPanel getPanel() {
        JPanel var1 = new JPanel(new BorderLayout());
        JTextField var2 = new JTextField(this.getCode(), 17);
        JTextField var3 = new JTextField(this.getDescription(), 17);
        JTextField var4 = new JTextField(Double.toString(this.getPrice()), 17);
        JTextField var5 = new JTextField(this.getModel(), 17);
        JTextField var6 = new JTextField(this.getWaterSupply(), 17);
        JTextField var7 = new JTextField(Integer.toString(this.getNumberOfCups()), 17);
        var2.setEditable(false);
        var3.setEditable(false);
        var4.setEditable(false);
        var5.setEditable(false);
        var6.setEditable(false);
        var7.setEditable(false);
        JPanel var8 = new JPanel(new GridLayout(6, 1));
        var8.add(new JLabel("Code:"));
        var8.add(new JLabel("Description: "));
        var8.add(new JLabel("Price:"));
        var8.add(new JLabel("Model:"));
        var8.add(new JLabel("Water supply:"));
        var8.add(new JLabel("Number of cups:"));
        JPanel var9 = new JPanel(new GridLayout(6, 1));
        var9.add(var2);
        var9.add(var3);
        var9.add(var4);
        var9.add(var5);
        var9.add(var6);
        var9.add(var7);
        var1.add(var8, "West");
        var1.add(var9, "Center");
        return var1;
    }
}

