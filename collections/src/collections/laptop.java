package collections;

public class laptop {
	private String company;
	private String model;
	private String operatingSystem;
	private String Processor;

	public laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		Processor = processor;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return Processor;
	}

	public void setProcessor(String processor) {
		Processor = processor;
	}

	@Override
	public String toString() {
		return "laptop [company=" + getCompany() + ",model=" + getModel() + "operatingSystem=" + getOperatingSystem()
				+ "Processor=" + getProcessor() + "]";
	}
}
