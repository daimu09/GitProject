class CarSpeed{
	String speed;
}
class CarSpeeedImplementation{
	public String setCarSpeed(CarSpeed sp, int spd) {
		try {
			if(spd<30 || spd>90) {
				throw new SpeedInvalidException("Exception in Speed Validation");
			}
			else {
				sp.speed="Valid";
			}
		}
		catch(SpeedInvalidException se){
			return se.getMessage();
		}
		return sp.speed;
	}
}
class SpeedInvalidException extends Exception{
	public SpeedInvalidException(String msg) {
		super(msg);
	}
}
public class speed {
	public static void main(String[] args) {
		CarSpeed s= new CarSpeed();
		CarSpeeedImplementation csi= new CarSpeeedImplementation();
		System.out.println(csi.setCarSpeed(s,25));
		
	}
}
