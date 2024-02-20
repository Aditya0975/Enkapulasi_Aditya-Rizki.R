package enkapsulasi_user;


public class Enkapsulasi_User {

    
    public static void main(String[] args) {
        
        User Adit = new User("APA","OPO",0,false);
        
        
        Adit.setUsername("Adit021007");
        Adit.setPassword("DendamMembara");
        Adit.setid(02102007);
        Adit.setstatus(false);
        
        System.out.println("Username: " + Adit.getUsername());
        System.out.println("Password: " + Adit.getPassword());
        System.out.println("Id: " + Adit.getid());
        System.out.println("Status: " + Adit.getstatus());
        
       
    }
    
}
