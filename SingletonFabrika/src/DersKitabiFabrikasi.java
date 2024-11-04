public class DersKitabiFabrikasi implements IKitapFabrikasi{
    @Override
    public IKitap KitapBas(){
        return new DersKitabi();
    }
}
