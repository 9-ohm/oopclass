/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokemon;

import java.util.ArrayList;

/**
 *
 * @author ASUS ZenBook
 */
public class Trainer extends Trainers {
    
    private ArrayList<String> bag;
    private String[] berry;
    private int[] num;
    private int[] value;
    private String result;
    public Trainer(String name) {
        super(name);
        berry = new String[2];
        num = new int[berry.length];
        value = new int[berry.length];
        berry[0] = "potion";
        berry[1] = "hyper-potion";
        num[0] = 5;
        num[1] = 0;
        value[0] = 10;
        value[1] = 10;
    }
    
    public int UseBerry(String berry){
        for (int i = 0; i < berry.length(); i++) {
            if(this.berry[i].equals(berry)){
                if(num[i] != 0){
                    num[i]--;
                    return value[i];                     
                }
                return 0;
            }
        }
        return 0;
    }
    
    public String getBerry(String berry){
        for (int i = 0; i < berry.length(); i++) {
            if(this.berry[i].equals(berry)){
                if(num[i] != 0){
                    result = berry + " : " + Integer.toString(num[i]);
                    return result;                    
                }
                return "ไม่มีโว้ย";
            }
        }
        return "ไม่มีโว้ย";        
    }
    
}
