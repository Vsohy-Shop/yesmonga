package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.C11679z1;

/* renamed from: androidx.emoji2.text.flatbuffer.r */
public final class C19069r extends C19046b {
    /* renamed from: f */
    public C19069r mo56230f(int i, ByteBuffer byteBuffer) {
        mo56079b(i, 2, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public short mo56231g(int i) {
        return this.f48480d.getShort(mo56078a(i));
    }

    /* renamed from: h */
    public int mo56232h(int i) {
        return mo56231g(i) & C11679z1.f28988d;
    }
}
