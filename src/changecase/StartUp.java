
package changecase;

/**
 *
 * @author Alyson
 */
public class StartUp {
    public static void main(String[] args) {
        CaseFormatter f = new LowerCaseFormatter();
        
        TextCaseService srv = new TextCaseService();
        
        srv.setFormatter(f);
        
        String s = srv.changeCase("HELLO WORLD");
        System.out.println(s);
    }
}
