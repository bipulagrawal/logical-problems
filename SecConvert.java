public class SecConvert {
	public static void main(String[] args) {
		System.out.println("test");
		SecConvert sec = new SecConvert();
		sec.convert((3600*24+361)*9);
	}
	public void convert(int num) {
		int sec = num%60;
		int min = num/60;
		int hour = min/60;
		int day = hour/24;
		
		min = min%60;
		hour = hour%24;
		day = day%24;
		
		System.out.println("day :"+day);
		System.out.println("hour :"+hour);
		System.out.println("min :"+min);
		System.out.println("sec :"+sec);
	}
}
