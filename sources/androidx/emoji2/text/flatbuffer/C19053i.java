package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: androidx.emoji2.text.flatbuffer.i */
public class C19053i {

    /* renamed from: o */
    public static final /* synthetic */ boolean f48490o = false;

    /* renamed from: a */
    public ByteBuffer f48491a;

    /* renamed from: b */
    public int f48492b;

    /* renamed from: c */
    public int f48493c;

    /* renamed from: d */
    public int[] f48494d;

    /* renamed from: e */
    public int f48495e;

    /* renamed from: f */
    public boolean f48496f;

    /* renamed from: g */
    public boolean f48497g;

    /* renamed from: h */
    public int f48498h;

    /* renamed from: i */
    public int[] f48499i;

    /* renamed from: j */
    public int f48500j;

    /* renamed from: k */
    public int f48501k;

    /* renamed from: l */
    public boolean f48502l;

    /* renamed from: m */
    public C19055b f48503m;

    /* renamed from: n */
    public final Utf8 f48504n;

    /* renamed from: androidx.emoji2.text.flatbuffer.i$a */
    public static class C19054a extends InputStream {

        /* renamed from: a */
        public ByteBuffer f48505a;

        public C19054a(ByteBuffer byteBuffer) {
            this.f48505a = byteBuffer;
        }

        public int read() throws IOException {
            try {
                return this.f48505a.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.i$b */
    public static abstract class C19055b {
        /* renamed from: a */
        public abstract ByteBuffer mo56149a(int i);

        /* renamed from: b */
        public void mo56150b(ByteBuffer byteBuffer) {
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.i$c */
    public static final class C19056c extends C19055b {

        /* renamed from: a */
        public static final C19056c f48506a = new C19056c();

        /* renamed from: a */
        public ByteBuffer mo56149a(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public C19053i(int i, C19055b bVar) {
        this(i, bVar, (ByteBuffer) null, Utf8.m89009d());
    }

    /* renamed from: N */
    public static ByteBuffer m89091N(ByteBuffer byteBuffer, C19055b bVar) {
        int i;
        int capacity = byteBuffer.capacity();
        if ((-1073741824 & capacity) == 0) {
            if (capacity == 0) {
                i = 1;
            } else {
                i = capacity << 1;
            }
            byteBuffer.position(0);
            ByteBuffer a = bVar.mo56149a(i);
            a.position(a.clear().capacity() - capacity);
            a.put(byteBuffer);
            return a;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    /* renamed from: P */
    public static boolean m89092P(C19072u uVar, int i) {
        return uVar.mo56238d(i) != 0;
    }

    /* renamed from: A */
    public int mo56090A(int[] iArr) {
        mo56104Q();
        mo56129h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            mo56135n(iArr[length]);
        }
        return mo56094E();
    }

    /* renamed from: B */
    public ByteBuffer mo56091B() {
        mo56101L();
        return this.f48491a;
    }

    @Deprecated
    /* renamed from: C */
    public final int mo56092C() {
        mo56101L();
        return this.f48492b;
    }

    /* renamed from: D */
    public int mo56093D() {
        int i;
        int i2;
        if (this.f48494d == null || !this.f48496f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        mo56131j(0);
        int R = mo56105R();
        int i3 = this.f48495e - 1;
        while (i3 >= 0 && this.f48494d[i3] == 0) {
            i3--;
        }
        int i4 = i3 + 1;
        while (i3 >= 0) {
            int i5 = this.f48494d[i3];
            if (i5 != 0) {
                i2 = R - i5;
            } else {
                i2 = 0;
            }
            mo56138q((short) i2);
            i3--;
        }
        mo56138q((short) (R - this.f48498h));
        mo56138q((short) ((i4 + 2) * 2));
        int i6 = 0;
        loop2:
        while (true) {
            if (i6 >= this.f48500j) {
                i = 0;
                break;
            }
            int capacity = this.f48491a.capacity() - this.f48499i[i6];
            int i7 = this.f48492b;
            short s = this.f48491a.getShort(capacity);
            if (s == this.f48491a.getShort(i7)) {
                int i8 = 2;
                while (i8 < s) {
                    if (this.f48491a.getShort(capacity + i8) == this.f48491a.getShort(i7 + i8)) {
                        i8 += 2;
                    }
                }
                i = this.f48499i[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int capacity2 = this.f48491a.capacity() - R;
            this.f48492b = capacity2;
            this.f48491a.putInt(capacity2, i - R);
        } else {
            int i9 = this.f48500j;
            int[] iArr = this.f48499i;
            if (i9 == iArr.length) {
                this.f48499i = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f48499i;
            int i10 = this.f48500j;
            this.f48500j = i10 + 1;
            iArr2[i10] = mo56105R();
            ByteBuffer byteBuffer = this.f48491a;
            byteBuffer.putInt(byteBuffer.capacity() - R, mo56105R() - R);
        }
        this.f48496f = false;
        return R;
    }

    /* renamed from: E */
    public int mo56094E() {
        if (this.f48496f) {
            this.f48496f = false;
            mo56112Y(this.f48501k);
            return mo56105R();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    /* renamed from: F */
    public void mo56095F(int i) {
        mo56098I(i, false);
    }

    /* renamed from: G */
    public void mo56096G(int i, String str) {
        mo56097H(i, str, false);
    }

    /* renamed from: H */
    public void mo56097H(int i, String str, boolean z) {
        int i2;
        int i3 = this.f48493c;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        mo56107T(i3, i2 + 8);
        if (str.length() == 4) {
            for (int i4 = 3; i4 >= 0; i4--) {
                mo56120d((byte) str.charAt(i4));
            }
            mo56098I(i, z);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    /* renamed from: I */
    public void mo56098I(int i, boolean z) {
        int i2;
        int i3 = this.f48493c;
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        mo56107T(i3, i2 + 4);
        mo56135n(i);
        if (z) {
            mo56131j(this.f48491a.capacity() - this.f48492b);
        }
        this.f48491a.position(this.f48492b);
        this.f48497g = true;
    }

    /* renamed from: J */
    public void mo56099J(int i) {
        mo56098I(i, true);
    }

    /* renamed from: K */
    public void mo56100K(int i, String str) {
        mo56097H(i, str, true);
    }

    /* renamed from: L */
    public void mo56101L() {
        if (!this.f48497g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    /* renamed from: M */
    public C19053i mo56102M(boolean z) {
        this.f48502l = z;
        return this;
    }

    /* renamed from: O */
    public C19053i mo56103O(ByteBuffer byteBuffer, C19055b bVar) {
        this.f48503m = bVar;
        this.f48491a = byteBuffer;
        byteBuffer.clear();
        this.f48491a.order(ByteOrder.LITTLE_ENDIAN);
        this.f48493c = 1;
        this.f48492b = this.f48491a.capacity();
        this.f48495e = 0;
        this.f48496f = false;
        this.f48497g = false;
        this.f48498h = 0;
        this.f48500j = 0;
        this.f48501k = 0;
        return this;
    }

    /* renamed from: Q */
    public void mo56104Q() {
        if (this.f48496f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    /* renamed from: R */
    public int mo56105R() {
        return this.f48491a.capacity() - this.f48492b;
    }

    /* renamed from: S */
    public void mo56106S(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f48491a;
            int i3 = this.f48492b - 1;
            this.f48492b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    /* renamed from: T */
    public void mo56107T(int i, int i2) {
        if (i > this.f48493c) {
            this.f48493c = i;
        }
        int i3 = ((~((this.f48491a.capacity() - this.f48492b) + i2)) + 1) & (i - 1);
        while (this.f48492b < i3 + i + i2) {
            int capacity = this.f48491a.capacity();
            ByteBuffer byteBuffer = this.f48491a;
            ByteBuffer N = m89091N(byteBuffer, this.f48503m);
            this.f48491a = N;
            if (byteBuffer != N) {
                this.f48503m.mo56150b(byteBuffer);
            }
            this.f48492b += this.f48491a.capacity() - capacity;
        }
        mo56106S(i3);
    }

    /* renamed from: U */
    public void mo56108U(boolean z) {
        ByteBuffer byteBuffer = this.f48491a;
        int i = this.f48492b - 1;
        this.f48492b = i;
        byteBuffer.put(i, z ? (byte) 1 : 0);
    }

    /* renamed from: V */
    public void mo56109V(byte b) {
        ByteBuffer byteBuffer = this.f48491a;
        int i = this.f48492b - 1;
        this.f48492b = i;
        byteBuffer.put(i, b);
    }

    /* renamed from: W */
    public void mo56110W(double d) {
        ByteBuffer byteBuffer = this.f48491a;
        int i = this.f48492b - 8;
        this.f48492b = i;
        byteBuffer.putDouble(i, d);
    }

    /* renamed from: X */
    public void mo56111X(float f) {
        ByteBuffer byteBuffer = this.f48491a;
        int i = this.f48492b - 4;
        this.f48492b = i;
        byteBuffer.putFloat(i, f);
    }

    /* renamed from: Y */
    public void mo56112Y(int i) {
        ByteBuffer byteBuffer = this.f48491a;
        int i2 = this.f48492b - 4;
        this.f48492b = i2;
        byteBuffer.putInt(i2, i);
    }

    /* renamed from: Z */
    public void mo56113Z(long j) {
        ByteBuffer byteBuffer = this.f48491a;
        int i = this.f48492b - 8;
        this.f48492b = i;
        byteBuffer.putLong(i, j);
    }

    /* renamed from: a */
    public void mo56114a(int i) {
        if (i != mo56105R()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    /* renamed from: a0 */
    public void mo56115a0(short s) {
        ByteBuffer byteBuffer = this.f48491a;
        int i = this.f48492b - 2;
        this.f48492b = i;
        byteBuffer.putShort(i, s);
    }

    /* renamed from: b */
    public void mo56116b(int i, boolean z, boolean z2) {
        if (this.f48502l || z != z2) {
            mo56118c(z);
            mo56125f0(i);
        }
    }

    /* renamed from: b0 */
    public void mo56117b0(int i, int i2) {
        boolean z;
        int capacity = this.f48491a.capacity() - i;
        if (this.f48491a.getShort((capacity - this.f48491a.getInt(capacity)) + i2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new AssertionError("FlatBuffers: field " + i2 + " must be set");
        }
    }

    /* renamed from: c */
    public void mo56118c(boolean z) {
        mo56107T(1, 0);
        mo56108U(z);
    }

    /* renamed from: c0 */
    public byte[] mo56119c0() {
        return mo56121d0(this.f48492b, this.f48491a.capacity() - this.f48492b);
    }

    /* renamed from: d */
    public void mo56120d(byte b) {
        mo56107T(1, 0);
        mo56109V(b);
    }

    /* renamed from: d0 */
    public byte[] mo56121d0(int i, int i2) {
        mo56101L();
        byte[] bArr = new byte[i2];
        this.f48491a.position(i);
        this.f48491a.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    public void mo56122e(int i, byte b, int i2) {
        if (this.f48502l || b != i2) {
            mo56120d(b);
            mo56125f0(i);
        }
    }

    /* renamed from: e0 */
    public InputStream mo56123e0() {
        mo56101L();
        ByteBuffer duplicate = this.f48491a.duplicate();
        duplicate.position(this.f48492b);
        duplicate.limit(this.f48491a.capacity());
        return new C19054a(duplicate);
    }

    /* renamed from: f */
    public void mo56124f(double d) {
        mo56107T(8, 0);
        mo56110W(d);
    }

    /* renamed from: f0 */
    public void mo56125f0(int i) {
        this.f48494d[i] = mo56105R();
    }

    /* renamed from: g */
    public void mo56126g(int i, double d, double d2) {
        if (this.f48502l || d != d2) {
            mo56124f(d);
            mo56125f0(i);
        }
    }

    /* renamed from: g0 */
    public void mo56127g0(int i) {
        mo56104Q();
        int[] iArr = this.f48494d;
        if (iArr == null || iArr.length < i) {
            this.f48494d = new int[i];
        }
        this.f48495e = i;
        Arrays.fill(this.f48494d, 0, i, 0);
        this.f48496f = true;
        this.f48498h = mo56105R();
    }

    /* renamed from: h */
    public void mo56128h(float f) {
        mo56107T(4, 0);
        mo56111X(f);
    }

    /* renamed from: h0 */
    public void mo56129h0(int i, int i2, int i3) {
        mo56104Q();
        this.f48501k = i2;
        int i4 = i * i2;
        mo56107T(4, i4);
        mo56107T(i3, i4);
        this.f48496f = true;
    }

    /* renamed from: i */
    public void mo56130i(int i, float f, double d) {
        if (this.f48502l || ((double) f) != d) {
            mo56128h(f);
            mo56125f0(i);
        }
    }

    /* renamed from: j */
    public void mo56131j(int i) {
        mo56107T(4, 0);
        mo56112Y(i);
    }

    /* renamed from: k */
    public void mo56132k(int i, int i2, int i3) {
        if (this.f48502l || i2 != i3) {
            mo56131j(i2);
            mo56125f0(i);
        }
    }

    /* renamed from: l */
    public void mo56133l(int i, long j, long j2) {
        if (this.f48502l || j != j2) {
            mo56134m(j);
            mo56125f0(i);
        }
    }

    /* renamed from: m */
    public void mo56134m(long j) {
        mo56107T(8, 0);
        mo56113Z(j);
    }

    /* renamed from: n */
    public void mo56135n(int i) {
        mo56107T(4, 0);
        mo56112Y((mo56105R() - i) + 4);
    }

    /* renamed from: o */
    public void mo56136o(int i, int i2, int i3) {
        if (this.f48502l || i2 != i3) {
            mo56135n(i2);
            mo56125f0(i);
        }
    }

    /* renamed from: p */
    public void mo56137p(int i, short s, int i2) {
        if (this.f48502l || s != i2) {
            mo56138q(s);
            mo56125f0(i);
        }
    }

    /* renamed from: q */
    public void mo56138q(short s) {
        mo56107T(2, 0);
        mo56115a0(s);
    }

    /* renamed from: r */
    public void mo56139r(int i, int i2, int i3) {
        if (i2 != i3) {
            mo56114a(i2);
            mo56125f0(i);
        }
    }

    /* renamed from: s */
    public void mo56140s() {
        this.f48492b = this.f48491a.capacity();
        this.f48491a.clear();
        this.f48493c = 1;
        while (true) {
            int i = this.f48495e;
            if (i > 0) {
                int[] iArr = this.f48494d;
                int i2 = i - 1;
                this.f48495e = i2;
                iArr[i2] = 0;
            } else {
                this.f48495e = 0;
                this.f48496f = false;
                this.f48497g = false;
                this.f48498h = 0;
                this.f48500j = 0;
                this.f48501k = 0;
                return;
            }
        }
    }

    /* renamed from: t */
    public int mo56141t(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo56129h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f48491a;
        int i = this.f48492b - remaining;
        this.f48492b = i;
        byteBuffer2.position(i);
        this.f48491a.put(byteBuffer);
        return mo56094E();
    }

    /* renamed from: u */
    public int mo56142u(byte[] bArr) {
        int length = bArr.length;
        mo56129h0(1, length, 1);
        ByteBuffer byteBuffer = this.f48491a;
        int i = this.f48492b - length;
        this.f48492b = i;
        byteBuffer.position(i);
        this.f48491a.put(bArr);
        return mo56094E();
    }

    /* renamed from: v */
    public int mo56143v(byte[] bArr, int i, int i2) {
        mo56129h0(1, i2, 1);
        ByteBuffer byteBuffer = this.f48491a;
        int i3 = this.f48492b - i2;
        this.f48492b = i3;
        byteBuffer.position(i3);
        this.f48491a.put(bArr, i, i2);
        return mo56094E();
    }

    /* renamed from: w */
    public <T extends C19072u> int mo56144w(T t, int[] iArr) {
        t.mo56249t(iArr, this.f48491a);
        return mo56090A(iArr);
    }

    /* renamed from: x */
    public int mo56145x(CharSequence charSequence) {
        int c = this.f48504n.mo56049c(charSequence);
        mo56120d((byte) 0);
        mo56129h0(1, c, 1);
        ByteBuffer byteBuffer = this.f48491a;
        int i = this.f48492b - c;
        this.f48492b = i;
        byteBuffer.position(i);
        this.f48504n.mo56048b(charSequence, this.f48491a);
        return mo56094E();
    }

    /* renamed from: y */
    public int mo56146y(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo56120d((byte) 0);
        mo56129h0(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f48491a;
        int i = this.f48492b - remaining;
        this.f48492b = i;
        byteBuffer2.position(i);
        this.f48491a.put(byteBuffer);
        return mo56094E();
    }

    /* renamed from: z */
    public ByteBuffer mo56147z(int i, int i2, int i3) {
        int i4 = i * i2;
        mo56129h0(i, i2, i3);
        ByteBuffer byteBuffer = this.f48491a;
        int i5 = this.f48492b - i4;
        this.f48492b = i5;
        byteBuffer.position(i5);
        ByteBuffer order = this.f48491a.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i4);
        return order;
    }

    public C19053i(int i, C19055b bVar, ByteBuffer byteBuffer, Utf8 utf8) {
        this.f48493c = 1;
        this.f48494d = null;
        this.f48495e = 0;
        this.f48496f = false;
        this.f48497g = false;
        this.f48499i = new int[16];
        this.f48500j = 0;
        this.f48501k = 0;
        this.f48502l = false;
        i = i <= 0 ? 1 : i;
        this.f48503m = bVar;
        if (byteBuffer != null) {
            this.f48491a = byteBuffer;
            byteBuffer.clear();
            this.f48491a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f48491a = bVar.mo56149a(i);
        }
        this.f48504n = utf8;
        this.f48492b = this.f48491a.capacity();
    }

    public C19053i(int i) {
        this(i, C19056c.f48506a, (ByteBuffer) null, Utf8.m89009d());
    }

    public C19053i() {
        this(1024);
    }

    public C19053i(ByteBuffer byteBuffer, C19055b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, Utf8.m89009d());
    }

    public C19053i(ByteBuffer byteBuffer) {
        this(byteBuffer, (C19055b) new C19056c());
    }
}
