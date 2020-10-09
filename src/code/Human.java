package code;

public class Human {
	public int id;
	public final int MAX_YEAR = 20;
	public int workYear = 0;
	public long money = 1000000;
	public final long MAXMONEY = 20000000;

	public Human(int x) {
		this.workYear = x;
	}
	
	public Human(int id, int workYear, Long money) {
		this.id = id;
		this.workYear = workYear;
		this.money = money;
	}
	
	public int increaseWorkYear(int x)  {
		if (x < 0) {
			return -1;
		}
		
		if (x >= MAX_YEAR) {
			return -2;
		}
		
		this.workYear += x;
		return this.workYear;
	}
	public long increaseMoney (long y) {
		if (y < 0) {
			return -1;
		}
		
		if (y >= MAXMONEY) {
			return -2;
		}
		
		this.money += y;
		return this.money;
	}
}
