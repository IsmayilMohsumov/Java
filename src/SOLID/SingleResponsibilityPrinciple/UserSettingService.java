package SOLID.SingleResponsibilityPrinciple;

public class UserSettingService {
//A good role of SRP is if your description of a class has the word 'and' then it may need to be refactored.

    String email;
    String username;

    public void changeEmail(String email) {
        if (checkAccesUser(username)) {
            this.email = email;
        }
    }

    public boolean checkAccesUser(String username) {

        //Verify if the user is valid.
        return true; // if valid
    }
    /*
     All looks good, until you would want to reuse the checkAccess 
     code at some other place OR you want to make changes to the way checkAccess is being done
     OR you want to make change to the way email changes are being approved. 
     In all the later 2 cases you would end up changing the same class 
     and in the first case you would have to use UserSettingService to check for access as well, which is unnecessary.

     One way to correct this is to decompose the UserSettingService into UserSettingService and SecurityService.
     And move the checkAccess code into SecurityService.
     */

}

class UserSettingServiceGood {

    String email;
    String username;

    public void changeEmail(String email) {
        if (SecurityService.checkAccess(username)) {
            this.email = email;
        }
    }

}

class SecurityService {

    public static boolean checkAccess(String username) {
        //check the access.
        return true; // if valid
    }
}
