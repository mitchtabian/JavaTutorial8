package Inheritance;

public class Tree {
	
	public int age;

	public static void main(String[] args) {
		AppleTree tree1 = new AppleTree();
		PearTree tree2 = new PearTree();
		
		tree1.setApples(50);
		tree1.setBranches(76);
		tree1.setAge(46);
		
		tree2.setPears(79);
		tree2.setBranches(85);
		tree2.setAge(120);
		
		System.out.println("Tree1 is a " + tree1.getType() + " tree. It has " + tree1.getBranches() + 
				" branches and " + tree1.getApples() + " fruit.");
		System.out.println("Tree1 has a yield of " + tree1.yield() + "% and is " + tree1.getAge() + 
				" years old.");
		
		System.out.println();
		
		System.out.println("Tree2 is a " + tree2.getType() + " tree. It has " + tree2.getBranches() + 
				" branches and " + tree2.getPears() + " fruit.");
		System.out.println("Tree2 has a yield of " + tree2.yield() + "% and is " + tree2.getAge() + 
				" years old.");

	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

}
