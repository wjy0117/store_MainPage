package DataClass;

public class reviewData {
	public int index;
	public String index2;
	public String storeCode;
	public String userID;
	public String contents;
	public String date;
	public String rating;
	public String display;
	public String anonymous;
	public String photoPath;

	public reviewData() {

	}
	
	// DB디폴트 내용
	// DB에서 가져와서 사용할 때를 위해 생성.
	public void setIndex(int _index) {
		index = _index;
	}
	// 입력할 내용
	public void setStoreCode(String _storeCode) {
		storeCode = _storeCode;
	}

	public void setUserId(String _userID) {
		userID = _userID;
	}

	public void setContents(String _contents) {
		contents = _contents;
	}

	public void setRating(String _rating) {
		rating = _rating;
	}
	

	public void setDate(String _date) {
		date = _date;
	}

	public void setDisplay(String _display) {
		display = _display;
	}

	public void setAnonymous(String _anonymous) {
		anonymous = _anonymous;
	}

	// 사진 등록 문제가 해결되지 않았음으로 디폴트 null로 설정.
	public void setPhotoPath(String _photoPath) {
		// photoPath = _photoPath;
		photoPath = null;
	}
	

	//Get메소드
	public int getIndex() {
		return index;
	}
	
	// 입력할 내용
	public String getStoreCode() {
		return storeCode;
	}

	public String getUserId() {
		return userID;
	}

	public String getContents() {
		return contents;
	}

	public String getRating() {
		return rating;
	}
	

	public String getDate() {
		return date;
	}

	public String getDisplay() {
		return display;
	}

	public String getAnonymous() {
		return anonymous;
	}

	// 사진 등록 문제가 해결되지 않았음으로 디폴트 null로 설정.
	public String getPhotoPath(String _photoPath) {
		// photoPath = _photoPath;
		return photoPath = null;
	}
}
