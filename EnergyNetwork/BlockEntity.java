import java.util.UUID;

public class BlockEntity {
    public String name;
    private UUID id;

    public BlockEntity(String name) {
        this.name = name;
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
