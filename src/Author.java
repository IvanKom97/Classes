import javax.xml.namespace.QName;
import java.security.PublicKey;

public class Author {
    private String name;
    private String secondName;

    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String getName() {
        return this.name;
    }
}
