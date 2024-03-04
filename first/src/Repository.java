class Repositoryy {
    static String getCountryName(String countryCode) throws InvalidCodeException {
       
            int code = Integer.parseInt(countryCode);
            if (code >= 70 && code <= 99) {
                return "India";
            } else if (code == 908) {
                return "USA";
            } else if (code == 11) { // Remove leading 0
                return "Dial somewhere outside of USA";
            } else {
                throw new InvalidCodeException("No country with the given code found");
            }
       
    }
}

class RepositoryImplementation {
    public static String getCountry(String countryCode) throws InvalidCodeException {
        if (countryCode.length()> 3 || countryCode.length()<2) {
            throw new InvalidCodeException("Invalid code length");
        } else {
            return Repositoryy.getCountryName(countryCode);
        }
    }
}

class InvalidCodeException extends Exception {
    public InvalidCodeException(String msg) {
        super(msg);
    }
}

public class Repository {
    public static void main(String[] args) {
        RepositoryImplementation r = new RepositoryImplementation();
        try {
            System.out.println(r.getCountry("908"));
        } catch (InvalidCodeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
