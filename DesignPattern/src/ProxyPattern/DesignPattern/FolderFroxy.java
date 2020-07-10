package DesignPattern;

public class FolderFroxy implements IFolder{

    User user;
    Folder folder;
    
    public FolderFroxy(User user) {
        this.user = user;
    }
    
    @Override
    public void performOperations() {
        if(user.getUsername().equalsIgnoreCase("leman") && user.getPassword().equals("password")){
            folder = new Folder();
            folder.performOperations();
        }else{
            System.out.println("Kamu tidak diberi ijin untuk mengakses folder ini ....");
        }
    }
    
}
