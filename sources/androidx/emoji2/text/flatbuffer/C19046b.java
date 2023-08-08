package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* renamed from: androidx.emoji2.text.flatbuffer.b */
public class C19046b {

    /* renamed from: a */
    public int f48477a;

    /* renamed from: b */
    public int f48478b;

    /* renamed from: c */
    public int f48479c;

    /* renamed from: d */
    public ByteBuffer f48480d;

    /* renamed from: a */
    public int mo56078a(int i) {
        return this.f48477a + (i * this.f48479c);
    }

    /* renamed from: b */
    public void mo56079b(int i, int i2, ByteBuffer byteBuffer) {
        this.f48480d = byteBuffer;
        if (byteBuffer != null) {
            this.f48477a = i;
            this.f48478b = byteBuffer.getInt(i - 4);
            this.f48479c = i2;
            return;
        }
        this.f48477a = 0;
        this.f48478b = 0;
        this.f48479c = 0;
    }

    /* renamed from: c */
    public int mo56080c() {
        return this.f48477a;
    }

    /* renamed from: d */
    public int mo56081d() {
        return this.f48478b;
    }

    /* renamed from: e */
    public void mo56082e() {
        mo56079b(0, 0, (ByteBuffer) null);
    }
}
