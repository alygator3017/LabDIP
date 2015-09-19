
package changecase;

/**
 *
 * @author Alyson
 */
public class LowerCaseFormatter implements CaseFormatter {
    @Override
    public String changeCase(String origString){
        return origString.toLowerCase();
    }
}
