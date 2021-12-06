/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dictionary;

/**
 *
 * @author ishay
 */
public class Data {
    private String text, dec;

    public Data(String text, String dec) {
        this.text = text;
        this.dec = dec;
    }
    
    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the dec
     */
    public String getDec() {
        return dec;
    }

    /**
     * @param dec the dec to set
     */
    public void setDec(String dec) {
        this.dec = dec;
    }
}
