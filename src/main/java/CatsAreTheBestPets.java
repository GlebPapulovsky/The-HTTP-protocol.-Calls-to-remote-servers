import com.fasterxml.jackson.annotation.JsonProperty;

public class CatsAreTheBestPets {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;


    public CatsAreTheBestPets(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes
    ) {
        this.user = user;
        this.text = text;
        this.id = id;
        this.type = type;
        this.upvotes = upvotes;
    }


    // … все getters


    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }
    @Override
    public String toString() {
        return "CatsAreTheBestPets" +
                "\n id = " + this.id +
                "\n text = " + this.text +
                "\n type = " + this.type +
                "\n user = " + this.user +
                "\n upvotes = " + this.upvotes;
    }
}

