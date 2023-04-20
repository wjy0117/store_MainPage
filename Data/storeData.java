package DataClass;

public class storeData{
	private int storeCode;
	private String storeName;
	private int cateCode;
	private String openAt;
	private String closeAt;
	private String offDays;
	private String lastOrder;
	private String phone;
	private String addr;
	private String parking;
	private String storeImgPath;
	private String web;
	private String breakStart;
	private String breakEnd;
	
	public storeData() {
		
	}

	public int getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(int storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getCateCode() {
		return cateCode;
	}

	public void setCateCode(int cateCode) {
		this.cateCode = cateCode;
	}

	public String getOpenAt() {
		return openAt;
	}

	public void setOpenAt(String openAt) {
		this.openAt = openAt;
	}

	public String getCloseAt() {
		return closeAt;
	}

	public void setCloseAt(String closeAt) {
		this.closeAt = closeAt;
	}

	public String getOffDays() {
		return offDays;
	}

	public void setOffDays(String offDays) {
		this.offDays = offDays;
	}

	public String getLastOrder() {
		return lastOrder;
	}

	public void setLastOrder(String lastOrder) {
		this.lastOrder = lastOrder;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getStoreImgPath() {
		return storeImgPath;
	}

	public void setStoreImgPath(String storeImgPath) {
		this.storeImgPath = storeImgPath;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getBreakStart() {
		return breakStart;
	}

	public void setBreakStart(String breakStart) {
		this.breakStart = breakStart;
	}

	public String getBreakEnd() {
		return breakEnd;
	}

	public void setBreakEnd(String breakEnd) {
		this.breakEnd = breakEnd;
	}

	public storeData(int _storeCode, String _storeName, int _cateCode, String _openAt, String _closeAt, String _offDays,
			String _lastOrder, String _phone, String _addr, String _parking, String _storeImgPath, String _web,
			String _breakStart, String _breakEnd) {

		storeCode = _storeCode;
		storeName = _storeName;
		cateCode = _cateCode;
		openAt = _openAt;
		closeAt = _closeAt;
		offDays = _offDays;
		lastOrder = _lastOrder;
		phone = _phone;
		addr = _addr;
		parking = _parking;
		storeImgPath = _storeImgPath;
		web = _web;
		breakStart = _breakStart;
		breakEnd = _breakEnd;
	}
}
