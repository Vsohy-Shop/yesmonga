package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* renamed from: androidx.emoji2.text.flatbuffer.a */
public class C19045a implements C19068q {

    /* renamed from: a */
    public byte[] f48475a;

    /* renamed from: b */
    public int f48476b;

    public C19045a() {
        this(10);
    }

    /* renamed from: B */
    public void mo56050B(int i, double d) {
        mo56055c(i + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) doubleToRawLongBits;
        byte[] bArr = this.f48475a;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >> 24) & 255);
        int i7 = (int) (doubleToRawLongBits >> 32);
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >> 8) & 255);
        bArr[i9] = (byte) ((i7 >> 16) & 255);
        bArr[i9 + 1] = (byte) ((i7 >> 24) & 255);
    }

    /* renamed from: C */
    public boolean mo56051C(int i) {
        return this.f48475a[i] != 0;
    }

    /* renamed from: F */
    public void mo56052F(int i, long j) {
        mo56055c(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.f48475a;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >> 24) & 255);
        int i7 = (int) (j >> 32);
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >> 8) & 255);
        bArr[i9] = (byte) ((i7 >> 16) & 255);
        bArr[i9 + 1] = (byte) ((i7 >> 24) & 255);
    }

    /* renamed from: a */
    public void mo56053a(int i, byte[] bArr, int i2, int i3) {
        mo56055c((i3 - i2) + i);
        System.arraycopy(bArr, i2, this.f48475a, i, i3);
    }

    /* renamed from: b */
    public void mo56054b(double d) {
        mo56050B(this.f48476b, d);
        this.f48476b += 8;
    }

    /* renamed from: c */
    public boolean mo56055c(int i) {
        byte[] bArr = this.f48475a;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.f48475a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    /* renamed from: d */
    public void mo56056d(int i, byte b) {
        mo56055c(i + 1);
        this.f48475a[i] = b;
    }

    /* renamed from: e */
    public byte[] mo56057e() {
        return this.f48475a;
    }

    /* renamed from: f */
    public String mo56058f(int i, int i2) {
        return Utf8Safe.m89026g(this.f48475a, i, i2);
    }

    /* renamed from: g */
    public int mo56059g() {
        return this.f48476b;
    }

    public byte get(int i) {
        return this.f48475a[i];
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        byte[] bArr = this.f48475a;
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << DateTimeFieldType.f30603E0) | ((bArr[i + 1] & 255) << 8);
    }

    public long getLong(int i) {
        byte[] bArr = this.f48475a;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((255 & ((long) bArr[i7])) << 48) | (((long) bArr[i7 + 1]) << 56);
    }

    public short getShort(int i) {
        byte[] bArr = this.f48475a;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    /* renamed from: h */
    public void mo56066h(float f) {
        mo56076t(this.f48476b, f);
        this.f48476b += 4;
    }

    /* renamed from: i */
    public void mo56067i(byte b) {
        mo56056d(this.f48476b, b);
        this.f48476b++;
    }

    /* renamed from: j */
    public void mo56068j(short s) {
        mo56069k(this.f48476b, s);
        this.f48476b += 2;
    }

    /* renamed from: k */
    public void mo56069k(int i, short s) {
        mo56055c(i + 2);
        byte[] bArr = this.f48475a;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    /* renamed from: l */
    public void mo56070l(boolean z) {
        mo56077u(this.f48476b, z);
        this.f48476b++;
    }

    public int limit() {
        return this.f48476b;
    }

    /* renamed from: m */
    public void mo56072m(int i) {
        mo56074o(this.f48476b, i);
        this.f48476b += 4;
    }

    /* renamed from: n */
    public void mo56073n(byte[] bArr, int i, int i2) {
        mo56053a(this.f48476b, bArr, i, i2);
        this.f48476b += i2;
    }

    /* renamed from: o */
    public void mo56074o(int i, int i2) {
        mo56055c(i + 4);
        byte[] bArr = this.f48475a;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        bArr[i4 + 1] = (byte) ((i2 >> 24) & 255);
    }

    /* renamed from: p */
    public void mo56075p(long j) {
        mo56052F(this.f48476b, j);
        this.f48476b += 8;
    }

    /* renamed from: t */
    public void mo56076t(int i, float f) {
        mo56055c(i + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.f48475a;
        int i2 = i + 1;
        bArr[i] = (byte) (floatToRawIntBits & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i3] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i3 + 1] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    /* renamed from: u */
    public void mo56077u(int i, boolean z) {
        mo56056d(i, z ? (byte) 1 : 0);
    }

    public C19045a(int i) {
        this(new byte[i]);
    }

    public C19045a(byte[] bArr) {
        this.f48475a = bArr;
        this.f48476b = 0;
    }

    public C19045a(byte[] bArr, int i) {
        this.f48475a = bArr;
        this.f48476b = i;
    }
}
