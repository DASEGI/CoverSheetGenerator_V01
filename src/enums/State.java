package enums;

/**
 *
 * @author arnel
 */
public class State {
    
    String name;
    String abbreviation;
    
    StateAbbreviation sa;
    StateName sn;
    
    State(StateAbbreviation sa){
        this.sa = sa;
    }
    
    State(StateName sn){
        this.sn = sn;
    }
    
    private StateName getStateNameEnum(StateAbbreviation sa){
        
        switch (sa){
            case AL:
                this.sn = sn.WISCONSIN;
                break;
            case AK:
                this.sn = sn.WISCONSIN;
                break;
            case WI:
                this.sn = sn.WISCONSIN;
                break;
            default: sn = sn.WISCONSIN;
        }
        
        return sn;
    }
    
    
    
}
