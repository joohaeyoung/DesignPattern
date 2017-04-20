
public class MultitonV2 {
	
	//키없이 갯수만 제한할때.   해쉬맵을 구지 만들지 않았다.
	//배열로 해도되고 리스트로 해도되고. 그냥 갯수만 제한할때는 이렇게 쓴다. 
	public static final int NUMBEROFINSTANCES = 3;
	
	private static MultitonV2[] pool = new MultitonV2[NUMBEROFINSTANCES ];
	
	static int number = 0;
	static int number2 = 0;

	public static MultitonV2 getInstance(){
		
		if( number < NUMBEROFINSTANCES ){
			
			MultitonV2 o = new MultitonV2();
			pool[number]= o;
			number++;
			
			System.out.println(number);
			
			
			return pool[number-1];
		}
		else{
			
			if(number2 == 3)
				number2=0;
			
			number2++;
			return pool[number2-1];
		
		}
					
	}
}
