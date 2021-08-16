package programmers;

public class WeeklyChallenge1 {

	public static void main(String[] args) {
		
		// 테스트 하기위한 메소드 호출
		WeeklyChallenge1 sol = new WeeklyChallenge1();
		
		System.out.println(sol.solution(20, 30, 3));
		

	}
    public long solution(int price, int money, int count) {
        long answer = -1;
       long temp=0;
		long finalSum=0;
        for(int i=0;i<=
        		count;i++){
        
           temp=price*i;
           finalSum+=temp;
       
        }
  
        if(finalSum>money){
            answer = finalSum-money;
        }else{
            answer = 0;
        }
        return answer;
    }

}
