package FirstTask;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class FirstTask {

    public static void evaluateExpression(String expression) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        if(engine!=null){
            try{
                System.out.println(engine.eval(expression));
        }catch (ScriptException e){
                e.printStackTrace();
            }
        }
        else System.err.println("ScriptEngine not available");

        }
    }