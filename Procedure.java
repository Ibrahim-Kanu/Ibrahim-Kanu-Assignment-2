
public class Procedure {
	
	private String procedure;
	private String date;
	private String practitioner;
	private double charges;
	
	public Procedure()
	{
		procedure = "";
		date = "";
		practitioner = "";
		charges = 0;
	}
	
	public Procedure(String procedure, String date)
	{
		this.procedure = procedure;
		this.date = date;
	}
	
	public Procedure(String procedure, String date, String practitioner, double charges)
	{
		this.procedure = procedure;
		this.date = date;
		this.practitioner = practitioner;
		this.charges = charges;
	}
	
	public void setProcedure(String procedure)
	{
		this.procedure = procedure;
	}
	
	public String getProcedure()
	{
		return procedure;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setPractitioner(String practitioner)
	{
		this.practitioner = practitioner;
	}
	
	public String getPractitioner()
	{
		return practitioner;
	}
	
	public void setCharges(double charges)
	{
		this.charges = charges;
	}
	public double getCharges()
	{
		return charges;
	}
	
	public String toString()
	{
		return this.procedure + " " + this.date + " " + this.practitioner + " " + this.charges;
	}

}
