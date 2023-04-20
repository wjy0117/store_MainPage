package DataClass;

public class menuData {
	int storeCode;
	int foodCode;
	String foodName;
	int price;

	public menuData() {
		
	}
	
	public menuData(int _storeCode, int _foodCode, String _foodName, int _price) {
		storeCode = _storeCode;
		foodCode = _foodCode;
		foodName = _foodName;
		price = _price;
	}

	public int getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(int storeCode) {
		this.storeCode = storeCode;
	}

	public int getFoodCode() {
		return foodCode;
	}

	public void setFoodCode(int foodCode) {
		this.foodCode = foodCode;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
