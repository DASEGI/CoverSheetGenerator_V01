package enums;

/**
 *
 * @author arnel
 */
public class State {
    
    private String name;
    private String abbreviation;
    
    private StateAbbreviation abbreviationEnum;
    private StateName nameEnum;
    
    State(StateAbbreviation sa){
        this.abbreviationEnum = sa;
        this.abbreviation = sa.toString();
        getStateNameEnum(sa);
    }
    
    State(StateName sn){
        this.nameEnum = sn;
    }
    
    private StateName getStateNameEnum(StateAbbreviation sa) {
        
        String stateName;        

        switch (sa) {
            case AL:
                this.nameEnum = nameEnum.ALABAMA;
                break;

            case AK:
                this.nameEnum = nameEnum.ALASKA;
                break;

            case AZ:
                this.nameEnum = nameEnum.ARIZONA;
                break;

            case AR:
                this.nameEnum = nameEnum.ARKANSAS;
                break;

            case CA:
                this.nameEnum = nameEnum.CALIFORNIA;
                break;

            case CO:
                this.nameEnum = nameEnum.COLORADO;
                break;

            case CT:
                this.nameEnum = nameEnum.CONNECTICUT;
                break;

            case DE:
                this.nameEnum = nameEnum.DELAWARE;
                break;

            case FL:
                this.nameEnum = nameEnum.FLORIDA;
                break;

            case GA:
                this.nameEnum = nameEnum.GEORGIA;
                break;

            case HI:
                this.nameEnum = nameEnum.HAWAII;
                break;

            case ID:
                this.nameEnum = nameEnum.IDAHO;
                break;

            case IL:
                this.nameEnum = nameEnum.ILLINOIS;
                break;

            case IN:
                this.nameEnum = nameEnum.INDIANA;
                break;

            case IA:
                this.nameEnum = nameEnum.IOWA;
                break;

            case KS:
                this.nameEnum = nameEnum.KANSAS;
                break;

            case KY:
                this.nameEnum = nameEnum.KENTUCKY;
                break;

            case LA:
                this.nameEnum = nameEnum.LOUISIANA;
                break;

            case ME:
                this.nameEnum = nameEnum.MAINE;
                break;

            case MD:
                this.nameEnum = nameEnum.MARYLAND;
                break;

            case MA:
                this.nameEnum = nameEnum.MASSACHUSETTS;
                break;

            case MI:
                this.nameEnum = nameEnum.MICHIGAN;
                break;

            case MN:
                this.nameEnum = nameEnum.MINNESOTA;
                break;

            case MS:
                this.nameEnum = nameEnum.MISSISSIPPI;
                break;

            case MO:
                this.nameEnum = nameEnum.MISSOURI;
                break;

            case MT:
                this.nameEnum = nameEnum.MONTANA;
                break;

            case NE:
                this.nameEnum = nameEnum.NEBRASKA;
                break;

            case NV:
                this.nameEnum = nameEnum.NEVADA;
                break;

            case NH:
                this.nameEnum = nameEnum.NEW_HAMPSHIRE;
                break;

            case NJ:
                this.nameEnum = nameEnum.NEW_JERSEY;
                break;

            case NM:
                this.nameEnum = nameEnum.NEW_MEXICO;
                break;

            case NY:
                this.nameEnum = nameEnum.NEW_YORK;
                break;

            case NC:
                this.nameEnum = nameEnum.NORTH_CAROLINA;
                break;

            case ND:
                this.nameEnum = nameEnum.NORTH_DAKOTA;
                break;

            case OH:
                this.nameEnum = nameEnum.OHIO;
                break;

            case OK:
                this.nameEnum = nameEnum.OKLAHOMA;
                break;

            case OR:
                this.nameEnum = nameEnum.OREGON;
                break;

            case PA:
                this.nameEnum = nameEnum.PENNSYLVANIA;
                break;

            case RI:
                this.nameEnum = nameEnum.RHODE_ISLAND;
                break;

            case SC:
                this.nameEnum = nameEnum.SOUTH_CAROLINA;
                break;

            case SD:
                this.nameEnum = nameEnum.SOUTH_DAKOTA;
                break;

            case TN:
                this.nameEnum = nameEnum.TENNESSEE;
                break;

            case TX:
                this.nameEnum = nameEnum.TEXAS;
                break;

            case UT:
                this.nameEnum = nameEnum.UTAH;
                break;

            case VT:
                this.nameEnum = nameEnum.VERMONT;
                break;

            case VA:
                this.nameEnum = nameEnum.VIRGINIA;
                break;

            case WA:
                this.nameEnum = nameEnum.WASHINGTON;
                break;

            case WV:
                this.nameEnum = nameEnum.WEST_VIRGINIA;
                break;

            case WI:
                this.nameEnum = nameEnum.WISCONSIN;
                break;

            case WY:
                this.nameEnum = nameEnum.WYOMING;
                break;

            default:
                nameEnum = nameEnum.WISCONSIN;
        }
        
        stateName = nameEnum.toString();
        stateName = stateName.substring(0,1).toUpperCase() + stateName.substring(1).toLowerCase();
        this.name = stateName;
        return nameEnum;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public StateAbbreviation getAbbreviationEnum() {
        return abbreviationEnum;
    }

    public void setAbbreviationEnum(StateAbbreviation abbreviationEnum) {
        this.abbreviationEnum = abbreviationEnum;
    }

    public StateName getNameEnum() {
        return nameEnum;
    }

    public void setNameEnum(StateName nameEnum) {
        this.nameEnum = nameEnum;
    }

    
    
    


    public static void main(String[] args) {
        // TODO code application logic here
        
        StateAbbreviation sa = StateAbbreviation.WI;
        
        State state = new State(sa);
        
        System.out.println(state.getNameEnum().toString());
        System.out.println(state.getName());
        System.out.println(state.getAbbreviation());
        
    }
    
}


