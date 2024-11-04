public class YayinEviSingleton {
    private static YayinEviSingleton instance;

    private YayinEviSingleton() {

    }

    public static YayinEviSingleton getInstance(){
        if(instance==null)
            return new YayinEviSingleton();
        else
            return instance;
    }
    public IKitapFabrikasi getFabrika(String kitapTuru){
        if(kitapTuru=="Edebi Eser"){
            IKitapFabrikasi ikf= new EdebiEserFabrikasi();
            return ikf;
        }
        else if(kitapTuru=="Ders Kitabi"){
            IKitapFabrikasi ikf=new DersKitabiFabrikasi();
            return ikf;
        }
        else
        return null;
    }
}
