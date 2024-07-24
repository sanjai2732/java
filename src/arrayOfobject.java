import java.util.Scanner;

class student{
    private int rollNo; String name;

    public student(int rollNo,String name ){
        this.rollNo=rollNo;
        this.name=name;
    }
    void print(){
        System.out.println("RollNO: "+rollNo );
        System.out.println("Name: "+name);
        System.out.println("---------------------------");
    }


}




public class arrayOfobject {
    public static void main(String[]args){
        student [] o=new student[5];
        o[0]=new student(20,"sanjai");
        o[1]=new student(20,"sanjai");
        o[2]=new student(20,"sanjai");
        o[3]=new student(20,"sanjai");
        o[4]=new student(20,"sanjai");
        for (int i=0;i<o.length;i++){
            o[i].print();
        }


            }
        }

