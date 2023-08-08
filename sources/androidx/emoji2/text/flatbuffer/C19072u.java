package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.emoji2.text.flatbuffer.u */
public class C19072u {

    /* renamed from: a */
    public int f48535a;

    /* renamed from: b */
    public ByteBuffer f48536b;

    /* renamed from: c */
    public int f48537c;

    /* renamed from: d */
    public int f48538d;

    /* renamed from: e */
    public Utf8 f48539e = Utf8.m89009d();

    /* renamed from: androidx.emoji2.text.flatbuffer.u$a */
    public class C19073a implements Comparator<Integer> {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f48540a;

        public C19073a(ByteBuffer byteBuffer) {
            this.f48540a = byteBuffer;
        }

        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            return C19072u.this.mo56248s(num, num2, this.f48540a);
        }
    }

    /* renamed from: a */
    public static boolean m89312a(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i = 0; i < 4; i++) {
                if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    /* renamed from: c */
    public static int m89313c(int i, ByteBuffer byteBuffer) {
        return i + byteBuffer.getInt(i);
    }

    /* renamed from: e */
    public static int m89314e(int i, int i2, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    /* renamed from: i */
    public static String m89315i(int i, ByteBuffer byteBuffer, Utf8 utf8) {
        int i2 = i + byteBuffer.getInt(i);
        return utf8.mo56047a(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    /* renamed from: k */
    public static C19072u m89316k(C19072u uVar, int i, ByteBuffer byteBuffer) {
        uVar.mo56240g(m89313c(i, byteBuffer), byteBuffer);
        return uVar;
    }

    /* renamed from: p */
    public static int m89317p(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = i + byteBuffer.getInt(i);
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int min = Math.min(i5, i6);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    /* renamed from: q */
    public static int m89318q(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int min = Math.min(i3, length);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    /* renamed from: b */
    public int mo56237b(int i) {
        return i + this.f48536b.getInt(i);
    }

    /* renamed from: d */
    public int mo56238d(int i) {
        if (i < this.f48538d) {
            return this.f48536b.getShort(this.f48537c + i);
        }
        return 0;
    }

    /* renamed from: f */
    public void mo56239f() {
        mo56240g(0, (ByteBuffer) null);
    }

    /* renamed from: g */
    public void mo56240g(int i, ByteBuffer byteBuffer) {
        this.f48536b = byteBuffer;
        if (byteBuffer != null) {
            this.f48535a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f48537c = i2;
            this.f48538d = this.f48536b.getShort(i2);
            return;
        }
        this.f48535a = 0;
        this.f48537c = 0;
        this.f48538d = 0;
    }

    /* renamed from: h */
    public String mo56241h(int i) {
        return m89315i(i, this.f48536b, this.f48539e);
    }

    /* renamed from: j */
    public C19072u mo56242j(C19072u uVar, int i) {
        return m89316k(uVar, i, this.f48536b);
    }

    /* renamed from: l */
    public int mo56243l(int i) {
        int i2 = i + this.f48535a;
        return i2 + this.f48536b.getInt(i2) + 4;
    }

    /* renamed from: m */
    public ByteBuffer mo56244m(int i, int i2) {
        int d = mo56238d(i);
        if (d == 0) {
            return null;
        }
        ByteBuffer order = this.f48536b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int l = mo56243l(d);
        order.position(l);
        order.limit(l + (mo56246o(d) * i2));
        return order;
    }

    /* renamed from: n */
    public ByteBuffer mo56245n(ByteBuffer byteBuffer, int i, int i2) {
        int d = mo56238d(i);
        if (d == 0) {
            return null;
        }
        int l = mo56243l(d);
        byteBuffer.rewind();
        byteBuffer.limit((mo56246o(d) * i2) + l);
        byteBuffer.position(l);
        return byteBuffer;
    }

    /* renamed from: o */
    public int mo56246o(int i) {
        int i2 = i + this.f48535a;
        return this.f48536b.getInt(i2 + this.f48536b.getInt(i2));
    }

    /* renamed from: r */
    public ByteBuffer mo56247r() {
        return this.f48536b;
    }

    /* renamed from: s */
    public int mo56248s(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    /* renamed from: t */
    public void mo56249t(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new C19073a(byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }
}
