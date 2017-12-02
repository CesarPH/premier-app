package view;

public class TeamView {
    public void header(String name, String code, String shortName) {
        System.out.printf("%s(%s)  \n", name, code);
        System.out.printf("Nombre abrevidado: %s\n", shortName);
    }
}
