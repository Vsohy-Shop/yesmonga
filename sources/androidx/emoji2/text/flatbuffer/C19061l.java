package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* renamed from: androidx.emoji2.text.flatbuffer.l */
public final class C19061l extends C19046b {
    /* renamed from: f */
    public C19061l mo56194f(int i, ByteBuffer byteBuffer) {
        mo56079b(i, 4, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public int mo56195g(int i) {
        return this.f48480d.getInt(mo56078a(i));
    }

    /* renamed from: h */
    public long mo56196h(int i) {
        return ((long) mo56195g(i)) & 4294967295L;
    }
}
