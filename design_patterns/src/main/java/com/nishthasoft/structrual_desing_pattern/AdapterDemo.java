package com.nishthasoft.structrual_desing_pattern;

import java.util.Arrays;

interface IspeakEnglish{
    public void speakEnglish();

}

interface IspeakFrench{
    public  void speakFrench();

}

class FrenchPerson implements IspeakFrench{

    @Override
    public void speakFrench() {
        System.out.println("French French");
    }
}

class EnglishPerson implements IspeakEnglish{

    @Override
    public void speakEnglish() {
        System.out.println("English English");

    }
}

class FrenchEnglishAdapter implements IspeakEnglish{


    IspeakFrench french;
    public FrenchEnglishAdapter(IspeakFrench french) {
        this.french = french;

    }

    @Override
    public void speakEnglish() {
        this.french.speakFrench();
        System.out.println("conveting into the Brain");
        System.out.println("English English");

    }
}



public class AdapterDemo {

    public static void main(String[] args) {
        FrenchEnglishAdapter translator = new FrenchEnglishAdapter(new FrenchPerson());
        translator.speakEnglish();;


    }






}
