//constructor
//default_constructor
class student
{
	private String name;
	private int rollno;
	private String branch;

	public student()
	{
		rollno=99;
		name="sejal";
		branch="ETC";
	}
	public void showdata()
	{
		System.out.println("student roll no is:"+rollno);
		System.out.println("student name is:"+name);
		System.out.println("student branch is:"+branch);
	}
}
class stest
{
	public static void main(String[]args)
	{
		student s1;
		s1=new student();
		s1.showdata();
	}
}