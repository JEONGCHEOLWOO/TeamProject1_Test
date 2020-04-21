
/**
 * Write a description of class RobotWalk here.
 *
 * @author (2018315034 정철우, 2018315038 이혜인)
 * @version (2020/04/07)
 */
public class Robot
{
    String TL; //Traffic Light
    double sp = 5; //Speed
    
    public void setTL(String TL){
        this.TL = TL;
    }
    public String getTL(){
        return this.TL;
    }
    
    public void setsp(double sp){
        this.sp = sp;
    }
    public double getsp(){
        return this.sp;
    }
    
    public void RobotWalk(){
        if(TL == "green"){
        }
        else if(TL == "yellow"){
            sp = sp * 1.2;
        }
        else{
            sp = 0;
        }
        System.out.println("속도: " + (int)sp + "km/h");
    } 
    
    public Robot(String TL, double sp){
        //setTL(TL);
        //setsp(sp);
        //RobotWalk();
    }
    
       
}