public class Number {
	Number next;
	int value;

	public Number(int value, Number next) {
		this.value = value;
		this.next = next;
	}
	
	public void setNext(Number obj) {
		this.next = obj;
	}
}