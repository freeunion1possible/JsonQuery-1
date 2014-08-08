//import com.google.gson.internal.LazilyParsedNumber;


@SuppressWarnings("serial")
public class JsonQueryNumber extends Number{
	
	private transient Number n;
    public JsonQueryNumber(Number n){
    	this.n = n;
    }
    
    public String toString(){
    	return n.toString();
    }

	@Override
	public double doubleValue() {
		return n.doubleValue();
	}

	@Override
	public float floatValue() {
		return n.floatValue();
	}

	@Override
	public int intValue() {
		return n.intValue();
	}

	@Override
	public long longValue() {
		return n.longValue();
	}
}
