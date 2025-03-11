package org.example.creational.FactoryMethod.FactoryMethod1;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory =  createDeveloperFacroryBySpecialty("Cpp");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFacroryBySpecialty(String srecialty) {
        if (srecialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if (srecialty.equalsIgnoreCase("Cpp"))
            return new CppDeveloperFactory();
        else {
            throw new RuntimeException(srecialty + "is unknown spesialty.");
        }
    }
}
