package Inheritance;

public class PearTree extends Tree {
	private int numBranches;
	private int numPears;
	private String treeType = "Pear";
	
	public int getPears(){
		return numPears;
	}

	public int getBranches(){
		return numBranches;
	}
	public String getType(){
		return treeType;
	}
	
	public void setPears(int numPears){
		this.numPears = numPears;
	}
	
	public void setBranches(int numBranches){
		this.numBranches = numBranches;
	}
	public double yield(){
		return Math.round(100.0*(double)numPears/(double)numBranches);
	}

}