package Class.nested;

public class JavaHouseNested {

	private String address;
	private LivingRoom livingRoom;

	public JavaHouseNested(String address) {
		this.address = address;
		this.livingRoom = new LivingRoom(10);
	}

	public LivingRoom getLivingRoom() {
		return livingRoom;
	}


	public class LivingRoom {
		private double area;

		public LivingRoom(double area) {
			this.area = area;
		}

		public String getAddress() {
			return JavaHouseNested.this.address;
		}

	}
}

// 사용 시
// JavaHouse house = new JavaHouse("제주도");
// System.out.println(house.getLivingRoom().getAddress());
