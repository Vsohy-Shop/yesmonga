package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* renamed from: androidx.emoji2.text.flatbuffer.f */
public final class C19050f extends C19046b {
    /* renamed from: f */
    public C19050f mo56085f(int i, ByteBuffer byteBuffer) {
        mo56079b(i, 1, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public byte mo56086g(int i) {
        return this.f48480d.get(mo56078a(i));
    }

    /* renamed from: h */
    public int mo56087h(int i) {
        return mo56086g(i) & 255;
    }
}
