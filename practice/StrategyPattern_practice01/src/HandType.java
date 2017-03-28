
public enum HandType {
	
	GAWI{
		@Override
		public String toString(){ return "����";}
		@Override
		public HandType winValueOf(){
			return BAWI;
		}
	}, 
	BAWI{
		@Override
		public String toString(){ return "����";}
		@Override
		public HandType winValueOf(){
			return BO;
		}
	}, 
	BO{
		@Override
		public String toString(){ return "��";}
		@Override
		public HandType winValueOf(){
			return GAWI;
		}
	};
	public abstract HandType winValueOf();
	
	public static HandType valueOf(int n){
		return HandType.values()[n];
	}
	
}
