public class Hewan extends MakhlukHidup {
    private String kakiEmpat, kakiDua ;
    public Hewan(String kakiEmpat, String kakiDua){
        this.kakiEmpat = kakiEmpat;
        this.kakiDua   = kakiDua;
    }
    
    public void berdiri (){
        System.out.println("Kerbau berdiri menggunakan :  " +kakiEmpat);
        System.out.println("Bebek berdiri menggunakan    :  " + kakiDua);
    }    
}