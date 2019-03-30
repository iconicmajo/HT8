/**
 * Maria Jose Castro Lemus 
 * 181202
 * Estructura de datos
 * Lab 8
 */

/**
 * @author Majo!
 *
 */
public class Paciente implements Comparable<Paciente> {
	
	private String name;
	private String sick;
	private String code;
	/**
	 * @param name
	 * @param sick
	 * @param code
	 */
	public Paciente(String name, String sick, String code) {
		this.name = name;
		this.sick = sick;
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sick
	 */
	public String getSick() {
		return sick;
	}
	/**
	 * @param sick the sick to set
	 */
	public void setSick(String sick) {
		this.sick = sick;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Paciente [name=" + name + ", sick=" + sick + ", code=" + code + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Paciente arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

