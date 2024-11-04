public class EdebiEserFabrikasi implements IKitapFabrikasi{
    @Override
    public IKitap KitapBas(){
        return new EdebiEser();
    }
}
