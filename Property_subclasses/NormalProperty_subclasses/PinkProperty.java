public class PinkProperty extends NormalProperty{
   
    //default constructor
    public PinkProperty(){
    	super();
    	setInfo();
    }

    //overloaded constructor
    public PinkProperty(String name, String initials, String coordinate, boolean expensive){
    	super(name, initials, coordinate, expensive);
    	setInfo();
    }

    //set rent prices, buy prices, house costs, and mortgage values
    public void setInfo(){
	// set rent prices, index corresponds w/ # of houses
    	_rent1 = {10, 50, 150, 450, 625, 750}; //virginia ave | states ave
	_rent2 = {12, 60, 180, 500, 700, 900}; //st. charles place
	    
	// set buy prices
    	_buyPrice1 = 140; 
    	_buyPrice2 = 160; 
	    
	//set house cost and mortgage value
    	_houseCost = 100;
    	_mortgageValue1 = (int) (.5 * _buyPrice1);
    	_mortgageValue2 = (int) (.5 * _buyPrice2);

    }
}
