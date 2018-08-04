package collections;

public class School {
	// instance members
	private String name;
	private String city;
	private String scoolDistrict;
	private int greatSchoolRanking;

	// constructor
	public School(String name, String city, String scoolDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.scoolDistrict = scoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getScoolDistrict() {
		return scoolDistrict;
	}

	public void setScoolDistrict(String scoolDistrict) {
		this.scoolDistrict = scoolDistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

	// override hashcode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + greatSchoolRanking;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((scoolDistrict == null) ? 0 : scoolDistrict.hashCode());
		return result;
	}

	// overrides equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (greatSchoolRanking != other.greatSchoolRanking)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (scoolDistrict == null) {
			if (other.scoolDistrict != null)
				return false;
		} else if (!scoolDistrict.equals(other.scoolDistrict))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "School[name=" + getName() + ",city=" + getCity() + "scoolDistrict=" + getScoolDistrict()
				+ "GreatSchoolRanking=" + getGreatSchoolRanking() + "]";
	}
}
