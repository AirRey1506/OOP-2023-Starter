package ie.tudublin;

import java.util.ArrayList;

public class Word extends Follow
{
    Follow wrd;

    //making Array list
    //Follow  <ArrayList> = new Follow <ArrayList>;

    public void Word(Follow wrd)
    {
        this.wrd = wrd;

    }

    String[] str;

    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) 
    {
        this.str = str;
    }

   

    

    
}
