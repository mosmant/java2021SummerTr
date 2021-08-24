package day38_overrding_exceptions;

public class Overriding_Overloading_Repeat {
	 /*
    
    Overriding;
    
    Parent class' daki bir method' u child class' a gore ozellestirilerek kullanmanin adidir
        
    Overriding Kurallari;
    
    1) Overriding creat edilirken " method signature " (name + parameters)
    TRICK ===> Kesinlikle ve asla degistirilemez
    
    2) Overriding creat edilirken " access modifier " belirli kurallara gore degistirilebilir
    
    3) Overriding creat edilirken " return type " belirli kurallara gore degistirilebilir
    
    4) Overriding creat edilirken " method body " %99 degistirilir ama degistirilmezse CTE vermez
    (amelelik olur overriding amaci body creat etmek)
    
    5) Overriding creat edilirken " parent-child " relationship sarttir
    TRICK ===> inheritance olmadan overriding olmaz olamaz!!!
    
    6) " Overridden method " = Parent class' taki method' tur (zavalli ezilen)
       " Overriding method " = Child class' taki method' tur (ezen)
         
    7) " Overriding method " yani (child)' in Access Modifier' i ",
    Overridden method " (parent)' in Access Modifier ile ayni ya da daha genis olmali.
    Evlat babanin erisimini daraltamaz ama genisletebilir SubAccMod >= SuperAccMod
    
    8) " Overriding method " yani (child)' in return type' i void ise,
    " Overridden method " (parent) return type' i void olmalidir, kendinden olmayani kabul etmez
    
    9) " Overriding method " yani (child)' in return type' i Wrapper Class' indan ise,
    " Overridden method " (parent)' in return type' i Wrapper Class' dan olmalidir, kendinden
    olmayani kabul etmez
    
    10) " Overriding method " yani (child)' in return type' i ile " Overridden method " (parent)
    return arasinda is-A (child ===> parent relationship) iliskisi olmalidir
    
    11) Static method' lar overriding edilemezler
    
    12) Private method' lar overriding edilemezler ===> Neden, cunku private :))
    
    13) Final method' lar overriding edilemezler ===> Neden, final son hali artik degistirilemez
    
    14) " Polymorphism " = " Overloading " ve " Overriding "' ten olusan yapiya denir.
    
    " Overloading " ===> public void yemek () {...}
    
                         public void yemek (String tatli) {...}
                         
                         public void yemek (String tatli, int ucret) {...}
    
    " Overriding " ===> public void icmek () { syso (gazoz) }
    
                         public void icmek () { syso (dark ve sek bir kahve) }
                         
                         public void icmek () { syso (ucret) }
    
    " Overloading " ile " Overriding " arasindaki farklar;
    
    a) " Overloading "' de method signature (name + parametre) degistirilir (parametre degisir)
       " Overriding "' de method signature (name + parametre) asla degistirilemez
    
    b) " Overloading "' de inheritance gerekmez
       " Overriding "' de inheritance olmadan overriding yapilamaz
    
    c) " Overloading "' de body genellikle degistirilmeden kullanilir
       " Overriding "' de body hemen hemen her zaman degistirilir
    
    d) Static method' lar overriding edilemezler ama overloading edilebilirler
       Private method' lar overriding edilemezler ama overloading edilebilirler
       
    e) " Overloading " = CompileTime Polymorphism' dir ===> static
       " Overriding "    = RunTime Polymorphism' dir ===> dinamik
        
   */
}
