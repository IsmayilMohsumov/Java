package InnerClasses;

import java.util.HashSet;
import java.util.TreeSet;

class BClass {

    int num = 1;

    public void b() {

    }

    class BInnerClass {

    // inner class oz sahibi oldugu classin attributunu return ede veya istifade ede biler
        public int bInner() { // bu methodda olundugu kimi
             return num; 
        }
    }
    
    private class BInnerClass2 {
        } // private olanda heccure obj yaratmaq olmur basqa normal klasslari private etmek olmur
    
    static class InnerClassStatic { // objectini yaradanda public classin obyektini yaratmaga ehyiyac yoxdur 
        int y = 5;  //        BClass.InnerClassStatic inner = new BClass.InnerClassStatic();
    }
}

public class AClass {

    public static void main(String[] args) {
        BClass b = new BClass();
        BClass.InnerClassStatic inner = new BClass.InnerClassStatic();
        BClass.BInnerClass bInner = b.new BInnerClass();
        
        
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(3);
        tree.add(2);
        tree.add(2);
        System.out.println(tree);
        
        HashSet<Integer> hash = new HashSet<>();
        hash.add(2);
        hash.add(2);
        hash.add(4);
        hash.add(5);
        hash.add(1);
        System.out.println(hash);
    }

}
