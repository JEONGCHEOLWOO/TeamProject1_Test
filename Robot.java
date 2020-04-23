
/**
 * Write a description of class RobotWalk here.
 *
 * @author (2018315034 정철우, 2018315038 이혜인)
 * @version (2020/04/07)
 */
public class Robot
{
    public double RobotWalk(String TL,double sp){
        if(TL == "green"){
            return sp;
        }
        else if(TL == "yellow"){
            return sp = sp * 1.2;
        }
        else{
            return 0;
        }
    }   
}