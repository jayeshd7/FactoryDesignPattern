package com.os;

public class FactoryOS {


    public OS getInstance(String str){

        if(str.equals("open")){
            return new Android();
        }
        else if(str.equals("close")){

            return new IOS();
        }
        else if(str.equals("oldFashion")){

            return new Blackberry();
        }
        else{

            return new Windows();
        }




    }
}
