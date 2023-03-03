
public record RecordEx(int ID, String name, String surname) {
    public RecordEx {
        if (ID < 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
    }
}
    
