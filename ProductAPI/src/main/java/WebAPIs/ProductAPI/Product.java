package WebAPIs.ProductAPI;

public class Product {
	
private String Id;
	
public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getPrice() {
	return Price;
}

public void setPrice(String price) {
	Price = price;
}

public String getCategory() {
	return Category;
}

public void setCategory(String category) {
	Category = category;
}

public String getManufacturer() {
	return Manufacturer;
}

public void setManufacturer(String manufacturer) {
	Manufacturer = manufacturer;
}

private String Price;

private String Category;

private String Manufacturer;




}
