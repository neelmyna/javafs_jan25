package pizza;

public class Pizza {
	private String id;
	private String name;
	private byte size;
	private float price;

	public Pizza() {
		super();
	}

	public Pizza(String name, byte size, float price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getSize() {
		return size;
	}

	public void setSize(byte size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", size=" + size + ", price=" + price + "]";
	}

}
