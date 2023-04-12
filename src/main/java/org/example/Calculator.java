package org.example;

public class Calculator {

    public int add(int x, int y){
        return x + y;
    }

    public int square(int x){
        return x * x;
    }

    public String intToRoman(int x)
    {

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(x >= values[i])
            {
                x = x - values[i];
                roman.append(romanNumerals[i]);
            }
        }
         return roman.toString();
    }



}
