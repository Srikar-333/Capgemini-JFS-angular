package spel_Assign7thAssi;

public class Example {
	private boolean greater;
	private boolean lesser;
	private boolean greaterEqual;
	private boolean lesserEqual;
	private String addString;
	
	
	
	public boolean isGreater() {
		return greater;
	}



	public void setGreater(boolean greater) {
		this.greater = greater;
	}



	public boolean isLesser() {
		return lesser;
	}



	public void setLesser(boolean lesser) {
		this.lesser = lesser;
	}



	public boolean isGreaterEqual() {
		return greaterEqual;
	}



	public void setGreaterEqual(boolean greaterEqual) {
		this.greaterEqual = greaterEqual;
	}



	public boolean isLesserEqual() {
		return lesserEqual;
	}



	public void setLesserEqual(boolean lesserEqual) {
		this.lesserEqual = lesserEqual;
	}



	public String getAddString() {
		return addString;
	}



	public void setAddString(String addString) {
		this.addString = addString;
	}



	public String toString()
	{
		return (this.isGreater()+"\n"+this.isLesser()+"\n"+this.isGreaterEqual()+"\n"+this.isLesserEqual()+"\n"+this.getAddString());
	}

}