class College {
	public static void main(String[] args){
		Student s1 = new Student(101,"Asmit",new String[]{"Core Java","Adv. Java"},2000);
		s1.display();
		Marks marks = new Marks();
		marks.setS1(78);
		marks.setS2(56);
		marks.setS3(45);
		marks.setS4(55);
		marks.setS5(67);
		marks.setS6(91);
		s1.setMarks(marks);
		s1.display();
	}
}
