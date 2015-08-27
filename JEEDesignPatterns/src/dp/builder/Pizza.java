package dp.builder;

/** "Product" */
public class Pizza {

	private String dough;
	private String sauce;
	private String topping;
	
	public void setDough(String dough) {
		this.dough = dough;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	public String description(){
		return "Pizza Characteristics: \n" 
							+ dough + ", " 
							+ sauce + ", "
							+ topping;
	}
	
}