class  ºØ¾î»§Æ²
{
	String ³»¿ë¹°; //¸â¹öº¯¼ö
	int °¡°Ý;
	ºØ¾î»§Æ²(){
		³»¿ë¹° = "ÆÏ";
		°¡°Ý = 500;
	}
	ºØ¾î»§Æ²(String ³»¿ë¹°, int °¡°Ý){
		this.³»¿ë¹° = ³»¿ë¹°;
		this. °¡°Ý = °¡°Ý;
	}
	void ¹èºÎ¸£°ÔÇÑ´Ù(){
		System.out.println("¹èºÎ¸£°ÔÇÑ´Ù");
	}
}
class ÁÖÀÎ
{
}
class ½Å
{	
	public static void main(String[] args) {
		ºØ¾î»§Æ² ºØ¾î»§ = new ºØ¾î»§Æ²();

		System.out.println(ºØ¾î»§.³»¿ë¹°+ºØ¾î»§.°¡°Ý);
	}
}