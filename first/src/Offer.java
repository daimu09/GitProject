import java.util.List;
import java.util.stream.Collectors;

class Model{
	String modelName;
	int carSpeed;
	public Model(String modelName, int carSpeed) {
		this.carSpeed=carSpeed;
		this.modelName=modelName;
	}
	public String getModelName(){
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName=modelName;
	}
	public int getCarSpeed() {
		return carSpeed;
	}
	public void setCarSpeed(int carSpeed) {
		this.carSpeed=carSpeed;
	}
}
class Implementation{
	public List<String> getModelName(List<Model> list){
		return list.stream().map(m->m.getModelName()).collect(Collectors.toList());
	}
	public Model getModelInfo(List<Model> list, String model, int speed) {
		return list.stream().filter(m->m.getModelName()==model && m.getCarSpeed()==speed).findFirst().get();
	}
}
public class Offer {
	public static void main(String[] args) {
		List<Model> list= new ArrayList<>();
		list.add(new Model("abc"))
	}
}
