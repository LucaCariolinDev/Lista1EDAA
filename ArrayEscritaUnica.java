public class ArrayEscritaUnica {
	private boolean readOnly;
	private double value;
	
	public ArrayEscritaUnica(double value) {
		this.value = value;
		readOnly = false;
	}
	
	public void setValue(double value) {
		if(readOnly == false) {
			this.value = value;
			this.readOnly = true;
		}
	}
	
	public double getValue() {
		return this.value;
	}
}
