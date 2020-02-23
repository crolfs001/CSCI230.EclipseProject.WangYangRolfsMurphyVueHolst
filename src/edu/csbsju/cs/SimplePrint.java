/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author dmurphy001
 *
 */
public class SimplePrint {
	private String pName;
	private int pAge;
	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Devin Murphy\nFue Vue");
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[ " + i + " ] = " + args[i]);
		}
		System.out.println("HIHI");
	}

	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the pAge
	 */
	public int getpAge() {
		return pAge;
	}

	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

}
