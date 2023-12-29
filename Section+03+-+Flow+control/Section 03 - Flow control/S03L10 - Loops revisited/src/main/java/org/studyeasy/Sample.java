package org.studyeasy;

public class Sample {
    public static void main(String[] args) {

        for (int i=0; i <10;i++){
            System.out.println("Before continue");
            if(i==5){
                continue;
            }
            System.out.println(i);
        }



    }

}