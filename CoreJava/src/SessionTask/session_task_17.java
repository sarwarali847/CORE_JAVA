/* 17. Object cloning:  
Create 5 clones of a Pulsor bike. Store all these objects in to a file.
Read them back on console.*/

package SessionTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class session_task_17 {

	public static void main(String[] args) throws CloneNotSupportedException {
		pulsar P1=new pulsar(46, 55, 175, 44.5, "Red");
		pulsar pulsar_1=(pulsar) P1.clone();
		pulsar pulsar_2=(pulsar) P1.clone();
		pulsar pulsar_3=(pulsar) P1.clone();
		pulsar pulsar_4=(pulsar) P1.clone();
		pulsar pulsar_5=(pulsar) P1.clone();
        
		String inputfile="Resources2/myobject.txt";
		String outputfile="Resources2/myobject.txt";
		try {
			FileOutputStream fo=new FileOutputStream(new File(outputfile));
			ObjectOutputStream oos=new ObjectOutputStream(fo);
			oos.writeObject(P1);
			oos.writeObject(pulsar_1);
			oos.writeObject(pulsar_2);
			oos.writeObject(pulsar_3);
			oos.writeObject(pulsar_4);
			oos.writeObject(pulsar_5);
			
			oos.close();
			fo.close();
			
		FileInputStream fi=new FileInputStream(new File(inputfile));
		ObjectInputStream ois=new ObjectInputStream(fi);
			
		pulsar pl1=(pulsar) ois.readObject();
		System.out.println(pl1.toString());
		pulsar_1=(pulsar) pl1.clone();
		pulsar_2=(pulsar) pl1.clone();
		pulsar_3=(pulsar) pl1.clone();
		pulsar_4=(pulsar) pl1.clone();
		pulsar_5=(pulsar) pl1.clone();
		System.out.println(pulsar_1.toString());
		System.out.println(pulsar_2.toString());
		System.out.println(pulsar_3.toString());
		System.out.println(pulsar_4.toString());
		System.out.println(pulsar_5.toString());
		
		
		ois.close();
		fi.close();
					
		}catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class pulsar implements Cloneable, Serializable{
	private double width;
	private double height;
	private double weight;
	private double milaege;
	private String color;
	public pulsar(double width, double height, double weight, double milaege, String color) {
		super();
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.milaege = milaege;
		this.color = color;
	}
	
	
	
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

    public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getMilaege() {
		return milaege;
	}

	public void setMilaege(double milaege) {
		this.milaege = milaege;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}





	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Width:"+width+", Height:"+height+", Weight:"+weight+", Mialege:"+milaege+", Color:"+color;
	}
}
