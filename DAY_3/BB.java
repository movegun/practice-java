class 식당 
{
	String 메뉴; //멤버변수
	int 가격;  //멤버변수
	식당(){
		메뉴 = "라면";
		가격 = 5000;
	}
	식당(String 메뉴, int 가격){
		this.메뉴 = 메뉴;
		this.가격 = 가격;
	}
	void 배부르게한다(){
		System.out.println("배부르게한다");
	}
}
class 사장
{
	int 나이 = 26; //멤버변수
	String 성별 = "남성"; // 멤버변수
	식당 식사1, 식사2; // 멤버변수 멤버변수

	사장(){
		System.out.println("성별이 "+ 성별 +"이고, 나이가 "+나이+"살인 사장이 ");
	}
	void 만든다(){
		식사1 = new 식당();
		식사2 = new 식당("김밥", 1000);
		System.out.println("메뉴가 "+ 식사1.메뉴 +"이고, 가격이 " + 식사1.가격 +"원인 점심과 ");
		System.out.println("메뉴가 "+ 식사2.메뉴 +"이고, 가격이 " + 식사2.가격 +"원인 저녁을 만들었어요");
	}
	void 판다(식당 식사){
		System.out.println("메뉴가 "+식사.메뉴 +"이고, 가격이 " + 식사.가격 +"원인 메뉴를 팔았어요");
	}
}

class 대기업
{
	public static void main(String args[]){
		사장 사 = new 사장();
		System.out.println();
		사.만든다();
		System.out.println();
		사.판다(사.식사1);
		사.판다(사.식사2);
	}
}

