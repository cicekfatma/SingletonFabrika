//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        YayinEviSingleton yes= YayinEviSingleton.getInstance();
        IKitapFabrikasi ikf= yes.getFabrika("Ders Kitabi");

        IKitap kitap1= ikf.KitapBas();
        System.out.println(kitap1.toString());



    }}
