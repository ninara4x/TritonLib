package triton.model.global;

public class UserScaleAllNotes {
    public int unpack (byte[] data, int offset) {
        System.arraycopy(data, offset, _data, 0, BYTE_SIZE);
        offset += BYTE_SIZE;
        return offset;
    }

    public int pack (byte[] data, int offset) {
        System.arraycopy(_data, 0, data, offset, BYTE_SIZE);
        offset += BYTE_SIZE;
        return offset;
    }
    
    private byte[] _data = new byte[BYTE_SIZE];
    
    public static final int BYTE_SIZE = 128;
}
