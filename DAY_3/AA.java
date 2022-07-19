class 贺绢户撇 
{
   String 居部; 
   int 啊拜;
   贺绢户撇(){
      居部 = "葡";
      啊拜 = 500;
   }
   贺绢户撇(String 居部, int 啊拜){ 
      this.居部 = 居部;
      this.啊拜 = 啊拜; 
   }
   void 硅何福霸茄促(){ 
      System.out.println("硅何福霸茄促");
   }
}
class 林牢 
{
   int 唱捞 = 50;
   String 己喊 = "咯己";
   贺绢户撇 贺绢户1, 贺绢户2;

    林牢(){
      pln("己喊捞 "+ 己喊 + "捞绊, 楷技啊 " + 唱捞 + "技牢 林牢捞 ");
   }
   void 绷绰促(){
      贺绢户1 = new 贺绢户撇(); 
      贺绢户2 = new 贺绢户撇("汲帕", 800);
      pln("居部啊 "+贺绢户1.居部 +"捞绊, 啊拜捞 " +  贺绢户1.啊拜 + "盔牢 贺绢户苞 ");
      pln("居部啊 "+贺绢户2.居部 +"捞绊, 啊拜捞 " +  贺绢户2.啊拜 + "盔牢 贺绢户阑 备奎绢夸");
   }
   void 魄促(贺绢户撇 贺绢户){
      pln("居部啊 "+贺绢户.居部 +"捞绊, 啊拜捞 " +  贺绢户.啊拜 + "盔牢 贺绢户阑 迫疽绢夸");
   }
   void pln(String str){
      System.out.println(str);
   }
}
class 脚
{
   public static void main(String args[]){
      林牢 林 = new 林牢();
      System.out.println();
      林.绷绰促();
      System.out.println();
      林.魄促(林.贺绢户1);
      林.魄促(林.贺绢户2);
   }
}