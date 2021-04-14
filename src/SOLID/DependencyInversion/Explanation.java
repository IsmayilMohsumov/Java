
package SOLID.DependencyInversion;

class SpellCheckerException extends Exception{

    public SpellCheckerException(String message) {
        System.out.println(message);
        }
}
interface ISpellChecker{
void check() throws SpellCheckerException;
}
class SpellChecker implements ISpellChecker{

    @Override
    public void check() throws SpellCheckerException {
        throw new SpellCheckerException("Yazim xetasi bash verdi "); //To change body of generated methods, choose Tools | Templates.
    }
}
class GreekSpellChecker implements ISpellChecker{

    @Override
    public void check() throws SpellCheckerException {
        throw new SpellCheckerException("Greek yazim xetasi ");
    }
    
}
public class Explanation {

    public static void main(String[] args) throws SpellCheckerException {
     ISpellChecker defaultSpell = new SpellChecker();
     ISpellChecker greekSpell = new GreekSpellChecker();
     new Emailer(greekSpell).checkEmail();
     
        
    }
    
}
class Emailer{
    private ISpellChecker spellChecker;    
    public Emailer(ISpellChecker sc) {
        this.spellChecker = sc;  
    }
    public void checkEmail() throws SpellCheckerException {
        this.spellChecker.check();
    }
}
