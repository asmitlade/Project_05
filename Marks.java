class Marks {
	int s1;
	int s2;
	int s3;
	int s4;
	int s5;
	int s6;
	Marks(){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
	}
	void setS1(int s1){
		this.s1 = s1;
	}
	void setS2(int s2){
		this.s2 = s2;
	}
	void setS3(int s3){
		this.s3 = s3;
	}
	void setS4(int s4){
		this.s4 = s4;
	}
	void setS5(int s5){
		this.s5 = s5;
	}
	void setS6(int s6){
		this.s6 = s6;
	}
	int getS1(){
		return this.s1;
	}
	int getS2(){
		return this.s2;
	}
	int getS3(){
		return this.s3;
	}
	int getS4(){
		return this.s4;
	}
	int getS5(){
		return this.s5;
	}
	int getS6(){
		return this.s6;
	}
	void display(){
		System.out.println("Total Marks :"+(this.s1+this.s2+this.s3+this.s4+this.s5+this.s6));
	}
}