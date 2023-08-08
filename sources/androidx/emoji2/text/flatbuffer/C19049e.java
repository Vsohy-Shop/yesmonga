package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* renamed from: androidx.emoji2.text.flatbuffer.e */
public class C19049e {
    /* renamed from: a */
    public static int m89083a(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    /* renamed from: b */
    public static ByteBuffer m89084b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}
