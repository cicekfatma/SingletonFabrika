public class DersKitabi implements IKitap{
    private String KitapAdi;
    private String KitapOzeti;

    @Override
    public String getAd(){
       return this.KitapAdi;
    }

    @Override
    public String getOzet() {
        return this.KitapOzeti;
    }

    @Override
    public void setAd(String KitapAdi) {
        this.KitapAdi= KitapAdi;
    }

    @Override
    public void setOzet(String KitapOzeti) {
        this.KitapOzeti=KitapOzeti;
    }
}
