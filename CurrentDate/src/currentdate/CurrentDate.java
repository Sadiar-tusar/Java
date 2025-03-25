
package currentdate;


public class CurrentDate {

    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        System.out.println(time);
        long totalSecond=time / 1000;
        long hours=totalSecond / 3600;
        long remainingSecond=totalSecond % 3600;
        long minutes=remainingSecond / 60;
        long seconds=remainingSecond % 60;
        long currentHoure=((hours+6)%24);
        
        System.out.println(currentHoure+"hours, "+ minutes +"minutes, "+ seconds +"seconds BD");
    }
    
}
