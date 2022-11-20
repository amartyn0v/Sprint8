public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if ((name.length()>2) && (name.length()<20) && (name.indexOf(' ')!=-1) && (name.indexOf(' ')==name.lastIndexOf(' ') && (!name.startsWith(" ")) && (!name.endsWith(" ")))){
            return true;
        } else return false;
    }

} 