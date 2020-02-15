import java.io.*;

public class Pokemon{
    private String name;
    private String type;
    private String sex;
    private int maxHp;
    private int currentHp;
    private int maxExp;
    private int currentExp;
    private int maxPp;
    private int currentPp;
    private int Attack;
    private int s_Attack;
    private int Def;
    private int s_Def;
    private int Speed;
    private int number;
    private int currentLvl;
    private int maxLvl;

    private int burn;           //ลดเลือดทุกรอบ
    private int freeze;         //มีโอกาศตีไม่ออก
    private int poison;         //ลดเลือดทุกรอบ
    private int badlypoison;    //ลดเลือดทุกรอบ
    private int sleep;          //หลับ
    private int confusion;      //ตีตัวเอง
    private int flinch;         //
    private int seeding;        //ฝังเมล็ดดูเลือด
    private int taunt;          //ใช้ท่าไม่ได้

    //Defult Constructor
    public Pokemon(){
        
    }
    
}

public class potion{
    private int hpPotion;
    private int ppPotion;
}

public class ball{
    private String pokeboll;   //x1
    private String masterball; //maximum
    private String greatball;  //x1.5
    private String ultraball;  //x2
}

