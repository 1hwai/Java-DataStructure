import java.util.HashMap;
import java.util.UUID;

public class SourceBlockEntity extends BlockEntity {

    private final HashMap<UUID, BlockEntity> load = new HashMap<>();

    public SourceBlockEntity(String name) {
        super(name);        //TODO Auto-generated constructor stub
    }

    public void checkIn(UUID id, BlockEntity be) {
        load.put(id, be);
    }

    public void checkOut(UUID id) {
        load.remove(id);
    }

    public HashMap<UUID, BlockEntity> getLoad() {
        return load;
    }

    public void update() {
        
    }

}
