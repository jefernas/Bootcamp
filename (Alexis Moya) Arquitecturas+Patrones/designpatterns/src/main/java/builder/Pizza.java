package builder;

public class Pizza {
	private String masa = "";
	private String salsa ="";
	private String relleno = "";
	
	public void setMasa(String masa) {
		this.masa = masa;
	}
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}
	@Override
	public String toString() {
		return "La pizza tiene [masa=" + masa + ", salsa=" + salsa + ", relleno=" + relleno + "]";
	}
	
	
	

}
