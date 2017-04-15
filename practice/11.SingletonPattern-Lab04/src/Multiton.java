import java.util.HashMap;

public class Multiton {
	
	
	//있으면 빼서 주야죈다. 
	//검색에서 해쉬맵이 가장 빠르다고 생각하면된다 항상 o1이니깐 이다.
	//보통 해쉬맵의 자료구조를 생각했을때는 충돌이 많이 나면 해쉬맵이 그 성능을 발휘 못할수 있다.
	//기본적인 해쉬맵 구성에 있어서 그렇단다. 
	// 맵. 셋, 리스트는 기본적으로 잘 기본적으로 잘 활용할수 있어야한다. 여러가지 문제 풀때 맵 셋 리스트 많이 쓴다. 
	//중복 방지 할때 쓴다. 똑같은 키를 가지면 안될때. 이것을 쓰면 똑같은 키를 가진것을 만들지 못하낟.
	//특정 키의 객체는 하나만 존재해야한다. 그때 쓸수 잇는게 해쉬맵

	
	private static final HashMap<String,Multiton> registory = new HashMap<>();

	
	
	private static final int NUMBEROFINSTANCE = 3;
	private Multiton(){}
	
	
	public static Multiton getInstance(String key){
		
		if( registory.containsKey(key) )
			return registory.get(key);
		
		else{
			
			if( registory.size() <= 2){
				
				Multiton o = new Multiton();
				registory.put( key, o);
				
				return o;		
				
			}
			else{
				throw new  IllegalArgumentException("객체를 3개 초과할수 없습니다");
			}
			
			
		}
	}
}
