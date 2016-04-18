
public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public int getNumStrings() {
		return numStrings;
	}
	
	@Override
	public boolean equals(Object object) {
		GuitarSpec searchSpec = (GuitarSpec) object;
		if(searchSpec.builder != builder)
			return false;
		if((model != null) && (!model.equals("")) && (!model.toLowerCase().equals(searchSpec.model.toLowerCase())))
			return false;
		if(searchSpec.type != type)
			return false;
		if(searchSpec.backWood != backWood)
			return false;
		if(searchSpec.topWood != topWood)
			return false;
		if(searchSpec.numStrings != numStrings)
			return false;
		return true;
	}
}
