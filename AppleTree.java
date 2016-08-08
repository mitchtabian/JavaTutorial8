package Inheritance;

public class AppleTree extends Tree{
	private int numBranches;
	private int numApples;
	private String treeType = "Apple";
	
	public int getApples(){
		return numApples;
	}

	public int getBranches(){
		return numBranches;
	}
	public String getType(){
		return treeType;
	}
	public void setApples(int numApples){
		this.numApples = numApples;
	}
	
	public void setBranches(int numBranches){
		this.numBranches = numBranches;
	}
	
	public double yield(){
		return Math.round(100.0*(double)numApples/(double)numBranches);
	}

}
