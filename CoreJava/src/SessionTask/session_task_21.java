package SessionTask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class session_task_21 {

	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		ScriptEngine engine=new ScriptEngineManager().getEngineByName("nashorn");
		 engine.eval(new FileReader("Resources2/calci.js"));
		 Bindings bind=engine.getBindings(ScriptContext.ENGINE_SCOPE);
		 int a,b;
		 Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter number 1: ");
		 a=sc.nextInt();
		 System.out.println("Enter number 2: ");
		 b=sc.nextInt();
		 //bind.put("msg1", a);
		 //bind.put("msg2", b);
		 
		 
		
		 Invocable invocable=(Invocable) engine;
	     invocable.invokeFunction("add",a,b);
	     invocable.invokeFunction("sub",a,b);
	     invocable.invokeFunction("div",a,b);
	     invocable.invokeFunction("mult",a,b);
		 
		 

	}
}
