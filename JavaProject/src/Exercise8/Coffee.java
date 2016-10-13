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

public class Coffee extends Product {
    private String origin;
    private String roast;
    private String flavor;
    private String aroma;
    private String acidity;
    private String body;

    public Coffee(String var1, String var2, double var3, String var5, String var6, String var7, String var8, String var9, String var10) {
        super(var1, var2, var3);
        this.origin = var5;
        this.roast = var6;
        this.flavor = var7;
        this.aroma = var8;
        this.acidity = var9;
        this.body = var10;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getRoast() {
        return this.roast;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public String getAroma() {
        return this.aroma;
    }

    public String getAcidity() {
        return this.acidity;
    }

    public String getBody() {
        return this.body;
    }

    public String toString() {
        return super.toString() + "_" + this.getOrigin() + "_" + this.getRoast() + "_" + this.getFlavor() + "_" + this.getAroma() + "_" + this.getAcidity() + "_" + this.getBody();
    }

    public JPanel getPanel() {
        JPanel var1 = new JPanel(new BorderLayout());
        JTextField var2 = new JTextField(this.getCode(), 17);
        JTextField var3 = new JTextField(this.getDescription(), 17);
        JTextField var4 = new JTextField(Double.toString(this.getPrice()), 17);
        JTextField var5 = new JTextField(this.getOrigin(), 17);
        JTextField var6 = new JTextField(this.getRoast(), 17);
        JTextField var7 = new JTextField(this.getFlavor(), 17);
        JTextField var8 = new JTextField(this.getAroma(), 17);
        JTextField var9 = new JTextField(this.getAcidity(), 17);
        JTextField var10 = new JTextField(this.getBody(), 17);
        var2.setEditable(false);
        var3.setEditable(false);
        var4.setEditable(false);
        var5.setEditable(false);
        var6.setEditable(false);
        var7.setEditable(false);
        var8.setEditable(false);
        var9.setEditable(false);
        var10.setEditable(false);
        JPanel var11 = new JPanel(new GridLayout(9, 1));
        var11.add(new JLabel("Code:"));
        var11.add(new JLabel("Description: "));
        var11.add(new JLabel("Price:"));
        var11.add(new JLabel("Origin:"));
        var11.add(new JLabel("Roast:"));
        var11.add(new JLabel("Flavor:"));
        var11.add(new JLabel("Aroma:"));
        var11.add(new JLabel("Acidity:"));
        var11.add(new JLabel("Body:"));
        JPanel var12 = new JPanel(new GridLayout(9, 1));
        var12.add(var2);
        var12.add(var3);
        var12.add(var4);
        var12.add(var5);
        var12.add(var6);
        var12.add(var7);
        var12.add(var8);
        var12.add(var9);
        var12.add(var10);
        var1.add(var11, "West");
        var1.add(var12, "Center");
        return var1;
    }
}

