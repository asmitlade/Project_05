class Student {
	static String institute = "NIT";
	int sno;
	String sname;
	String[] course;
	double fee;
	Marks marks;
	Student(int sno, String sname, String[] course, double fee){
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	void display(){
		System.out.println("Institute Name :"+ this.institute);
		System.out.println("Student Number :"+ this.sno);
		System.out.println("Student Name :"+ this.sname);
		System.out.println("Course :"+ java.util.Arrays.toString(this.course));
		System.out.println("Fee :"+ this.fee);
		System.out.println("Total Marks :");
		if(marks == null){
			System.out.println("Marks Not Enter Yet..");
		}else{
			this.marks.display();
		}
	}
}