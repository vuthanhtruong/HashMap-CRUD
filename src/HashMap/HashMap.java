package HashMap;



public class HashMap {
	int Max=5;
	int Start=-1;
	int Keys[]=new int[Max];
	int Values[]=new int[Max];


	public HashMap() {
		super();
		this.Max = 5;
		this.Start = -1;
		this.Keys = new int[Max];
		this.Values = new int[Max];
	}

	public HashMap(int max, int start, int[] keys, int[] values) {
		super();
		Max = max;
		Start = start;
		Keys = keys;
		Values = values;
	}

	public void Put(int Key, int Value) {
		
		if(this.Start+1==this.Max) {
			this.Max*=2;
			int NewKeys[]=new int [this.Max];
			int NewValues[]=new int [this.Max];
			for(int i=0;i<Size();i++) {
				NewKeys[i]=this.Keys[i];
				NewValues[i]=this.Values[i];
			}
			this.Keys=NewKeys;
			this.Values=NewValues;
			if(ContainKey(Key)==true) {
				System.out.println("Đã có Key này rồi");
			}
			else {
				this.Start++;
				this.Keys[this.Start]=Key;
				this.Values[this.Start]=Value;
			}
		}
		else {
			
			if(ContainKey(Key)==true) {
				System.out.println("Đã có Key này rồi");
			}
			else {
				this.Start++;
				this.Keys[this.Start]=Key;
				this.Values[this.Start]=Value;
			}

		}
	}
	public void PutFirt(int Key, int Value) {
		if(this.Start+1==this.Max) {
			this.Max*=2;
			int NewKeys[]=new int [this.Max];
			int NewValues[]=new int [this.Max];
			for(int i=0;i<Keys.length;i++) {
				NewKeys[i]=this.Keys[i];
				NewValues[i]=this.Values[i];
			}
			this.Keys=NewKeys;
			this.Values=NewValues;
			if(ContainKey(Key)==true) {
				System.out.println("Đã có Key này rồi");
			}
			else {
				this.Start++;
				for(int i=Size()-1;i>=0;i--) {
					this.Keys[i+1]=this.Keys[i];
					this.Values[i+1]=this.Values[i];
					if(i==0) {
						this.Keys[i]=Key;
						this.Values[i]=Value;
					}
				}
			}
		}
		else {
			if(ContainKey(Key)==true) {
				System.out.println("Đã có Key này rồi");
			}
			else {
				this.Start++;
				for(int i=Size()-1;i>=0;i--) {
					this.Keys[i+1]=this.Keys[i];
					this.Values[i+1]=this.Values[i];
					if(i==0) {
						this.Keys[i]=Key;
						this.Values[i]=Value;
					}
				}
			}
		}
	
	}
	public void PutByIndex(int Index, int Key, int Value) {
		if(Index == 0) {
			PutFirt(Key, Value);
		}
		else if (Index == Size()) {
			Put(Key, Value);
		}
		else if (Index < 0 || Index>Size()-1) {
			System.out.println("Bạn Nhập Index lỗi rồi");
		}
		else {
			if(this.Start+1==this.Max) {
				this.Max*=2;
				int NewKeys[]=new int [this.Max];
				int NewValues[]=new int [this.Max];
				for(int i=0;i<Keys.length;i++) {
					NewKeys[i]=this.Keys[i];
					NewValues[i]=this.Values[i];
				}
				this.Keys=NewKeys;
				this.Values=NewValues;
				if(ContainKey(Key)==true) {
					System.out.println("Đã có Key này rồi");
				}
				else {
					this.Start++;
					for(int i=this.Start;i>=0;i--) {
						if(i!=Index) {
							this.Keys[i]=this.Keys[i-1];
							this.Values[i]=this.Values[i-1];
						}
						else {
							this.Keys[i]=Key;
							this.Values[i]=Value;
							break;
						}		
					}
					
				}
			}
			else {
				if(ContainKey(Key)==true) {
					System.out.println("Đã có Key này rồi");
				}
				else {
					this.Start++;
					for(int i=this.Start;i>=0;i--) {
						if(i!=Index) {
							this.Keys[i]=this.Keys[i-1];
							this.Values[i]=this.Values[i-1];
						}
						else {
							this.Keys[i]=Key;
							this.Values[i]=Value;
							break;
						}		
					}
					
				}
			}
			
		}
	}
	public void RemoveByKey(int Key) {
		if(ContainKey(Key)==true) {
			int NewKeys[]=new int[this.Max];
			int NewValues[]=new int[this.Max];
			int count=0;
			for(int i=0;i<Size();i++) {
				if(this.Keys[i]!=Key) {
					NewKeys[count]=this.Keys[i];
					NewValues[count]=this.Values[i];
					count++;
				}
			}
			this.Start--;
			this.Keys=NewKeys;
			this.Values=NewValues;
		}
		else {
			System.out.println("Không có Key này để xóa");
		}
		
	}
	public void RemoveByValue(int Value) {
		if(ContainValue(Value)==true) {
			for(int i=0;i<Size();i++) {
				if(this.Values[i]==Value) {
					RemoveByIndex(i);
				}
			}
		}
		else {
			System.out.println("Không có giá trị này để xóa");
		}
	}
	public void RemoveByIndex(int Index) {
		if(Index<0 || Index>Size()-1) {
			System.out.println("Bạn nhập vị trí lỗi rồi");
		}
		else {
			int NewKeys[]=new int[this.Max];
			int NewValues[]=new int[this.Max];
			int count=0;
			for(int i=0;i<Size();i++) {
				if(i != Index) {
					NewKeys[count]=this.Keys[i];
					NewValues[count]=this.Values[i];
					count++;
				}
			}
			this.Start--;
			this.Keys=NewKeys;
			this.Values=NewValues;
		}
	}
	public void UpdateByKey(int Key, int NewKey) {
		if(ContainKey(Key)==true) {
			for(int i=0;i<Size();i++) {
				if(this.Keys[i]==Key) {
					this.Keys[i]=NewKey;
					break;
				}
				
			}
		}
		else {
			System.out.println("Không có Key này dể sửa");
		}
	}
	public void UpdateByValue(int Value, int NewValue) {
		if(ContainValue(Value)) {
			for(int i=0;i<Size();i++) {
				if(this.Values[i]==Value) {
					this.Values[i]=NewValue;
				}
			}
		}
	}
	public void UpdateKeyIndex(int Index, int Key) {
		if(Index<0 || Index>Size()-1) {
			System.out.println("Bạn nhập vị trí lỗi rồi");
		}
		else {
			for(int i=0;i<Size();i++) {
				if(i==Index) {
					this.Keys[i]=Key;
					break;
				}
			}
		}
	}
	public void UpdateValueIndex(int Index, int Value) {
		if(Index<0 || Index>Size()-1) {
			System.out.println("Bạn nhập vị trí lỗi rồi");
		}
		else {
			for(int i=0;i<Size();i++) {
				if(i==Index) {
					this.Values[i]=Value;
					break;
				}
			}
		}
	}
	public HashMap FindTheLocationOfValues(int Value) {
		HashMap Location =new HashMap();
		int count=0;
		for(int i=0;i<Size();i++) {
			if(this.Values[i]==Value) {
				Location.Put(count, i);
				count++;
			}
		}
		return Location;
	}
	public Boolean ContainKey(int Key) {
		for(int i=0;i<Size();i++) {
			if(this.Keys[i]==Key) {
				return true;
			}
		}
		return false;
	}
	public Boolean ContainValue(int Value) {
		for(int i=0;i<Size();i++) {
			if(this.Values[i]==Value) {
				return true;
			}
		}
		return false;
	}
	
	public void Print() {
		for(int i=0;i<=this.Start;i++) {
			System.out.println(this.Keys[i] + " " + this.Values[i]);
		}
	}
	public void GetKeys() {
		for(int i=0;i<Size();i++) {
			System.out.println(this.Keys[i]);
		}
	}
	public void GetValues() {
		for(int i=0;i<Size();i++) {
			System.out.println(this.Values[i]);
		}
	}
	public int Size() {
		int count=0;
		for(int i=0;i<=this.Start;i++) {
			count++;
		}
		return count;
	}

}
