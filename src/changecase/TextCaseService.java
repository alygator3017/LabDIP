
package changecase;

/**
 *
 * @author Alyson
 */
public class TextCaseService {
    //abstraction of low level object
   private CaseFormatter formatter; 
   
   //method that gives order
   
   public String changeCase(String origString){
       return formatter.changeCase(origString);
   }

    public CaseFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(CaseFormatter formatter) {
        this.formatter = formatter;
    }
   
   
    
}
