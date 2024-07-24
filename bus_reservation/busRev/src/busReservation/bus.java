package busReservation;

public class bus {
   private int busNo;
   private boolean ac;
   private int capacity;
     bus(int busNo,boolean ac,int capacity){
        this.busNo=busNo;
        this.ac=ac;
        this.capacity=capacity;
    }
    //getter get the value
    public int getCapacity(){
         return capacity;
    }
    public int getBusNo(){
        return busNo;
    }
    public boolean getAc(){
        return ac;
    }

    //setter set the give value


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setBusNo(int busNo){
         this.busNo=busNo;
    }
    public void setAc(boolean ac){
         this.ac=ac;
    }
    void displayBus(){
         System.out.println("BusNO:"+busNo+ "ac:"+ac+" Capacity:"+capacity);
    }
}
