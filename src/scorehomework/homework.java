/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorehomework;

/**
 *
 * @author Administrator
 */
public class homework {
    // Field
    private String nHW;
    private String score = "-";

    // Constructor
    public homework(String name, String initscore) {
        nHW = name;
        score = initscore;
    }
    public homework(String name) {
        nHW = name;
    }

    // Method
    public boolean isAlready(String hwName) {
        return nHW.equals(hwName);
    }
    public void setScore(String initscore) {
        score = initscore;
    }
    public String getHomewrk() {
        return nHW;
    }
    public String getScore() {
        return this.score;
    }
    @Override
    public String toString() {
        System.out.print(nHW + " ");
        return "";
    }
}
