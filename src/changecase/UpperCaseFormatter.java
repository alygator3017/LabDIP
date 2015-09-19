
package changecase;

/**
 *
 * @author Alyson
 */
public class UpperCaseFormatter implements CaseFormatter{
    //create method to change to uppercase
    //changeCase because it's usable throughout all low level modules
    @Override
    public String changeCase(String origString){
        return origString.toUpperCase();
    }
}
