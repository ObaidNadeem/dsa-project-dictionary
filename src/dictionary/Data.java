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
    private String name, num;

    public Data(String name, String num) {
        this.name = name;
        this.num = num;
    }
    
    /**
     * @return the name
     */
    public String getname() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setname(String name) {
        this.name = name;
    }

    /**
     * @return the num
     */
    public String getnum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setnum(String num) {
        this.num = num;
    }
}
