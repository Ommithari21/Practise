package restapi.example.practise.versioning;

public class Data {
    private Name name;

    public Data(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
