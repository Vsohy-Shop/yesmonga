package androidx.camera.core.impl.utils;

import androidx.annotation.C0359n0;
import androidx.camera.core.impl.utils.ExifData;
import androidx.core.util.C18001r;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import kotlin.C11679z1;

/* renamed from: androidx.camera.core.impl.utils.f */
public final class C1539f extends FilterOutputStream {

    /* renamed from: E0 */
    public static final byte f4404E0 = 42;

    /* renamed from: F0 */
    public static final int f4405F0 = 8;

    /* renamed from: X */
    public static final byte[] f4406X = DefaultImageHeaderParser.f57420h.getBytes(C1522e.f4347g);

    /* renamed from: Y */
    public static final short f4407Y = 18761;

    /* renamed from: Z */
    public static final short f4408Z = 19789;

    /* renamed from: g */
    public static final String f4409g = "ExifOutputStream";

    /* renamed from: v */
    public static final boolean f4410v = false;

    /* renamed from: w */
    public static final int f4411w = 65536;

    /* renamed from: x */
    public static final int f4412x = 0;

    /* renamed from: y */
    public static final int f4413y = 1;

    /* renamed from: z */
    public static final int f4414z = 2;

    /* renamed from: a */
    public final ExifData f4415a;

    /* renamed from: b */
    public final byte[] f4416b = new byte[1];

    /* renamed from: c */
    public final ByteBuffer f4417c = ByteBuffer.allocate(4);

    /* renamed from: d */
    public int f4418d = 0;

    /* renamed from: e */
    public int f4419e;

    /* renamed from: f */
    public int f4420f;

    /* renamed from: androidx.camera.core.impl.utils.f$a */
    public static final class C1540a {

        /* renamed from: a */
        public static final short f4421a = -40;

        /* renamed from: b */
        public static final short f4422b = -31;

        /* renamed from: c */
        public static final short f4423c = -39;

        /* renamed from: d */
        public static final short f4424d = -64;

        /* renamed from: e */
        public static final short f4425e = -49;

        /* renamed from: f */
        public static final short f4426f = -60;

        /* renamed from: g */
        public static final short f4427g = -56;

        /* renamed from: h */
        public static final short f4428h = -52;

        /* renamed from: a */
        public static boolean m6457a(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }
    }

    public C1539f(@C0359n0 OutputStream outputStream, @C0359n0 ExifData exifData) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f4415a = exifData;
    }

    /* renamed from: a */
    public final int mo5469a(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.f4417c.position());
        this.f4417c.put(bArr, i2, min);
        return min;
    }

    /* renamed from: b */
    public final void mo5470b(@C0359n0 C1514b bVar) throws IOException {
        short s;
        C1563g[][] gVarArr = ExifData.f4299o;
        int[] iArr = new int[gVarArr.length];
        int[] iArr2 = new int[gVarArr.length];
        for (C1563g gVar : ExifData.f4297m) {
            for (int i = 0; i < ExifData.f4299o.length; i++) {
                this.f4415a.mo5336c(i).remove(gVar.f4463b);
            }
        }
        if (!this.f4415a.mo5336c(1).isEmpty()) {
            this.f4415a.mo5336c(0).put(ExifData.f4297m[1].f4463b, C1522e.m6425i(0, this.f4415a.mo5337d()));
        }
        if (!this.f4415a.mo5336c(2).isEmpty()) {
            this.f4415a.mo5336c(0).put(ExifData.f4297m[2].f4463b, C1522e.m6425i(0, this.f4415a.mo5337d()));
        }
        if (!this.f4415a.mo5336c(3).isEmpty()) {
            this.f4415a.mo5336c(1).put(ExifData.f4297m[3].f4463b, C1522e.m6425i(0, this.f4415a.mo5337d()));
        }
        for (int i2 = 0; i2 < ExifData.f4299o.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C1522e> value : this.f4415a.mo5336c(i2).entrySet()) {
                int s2 = ((C1522e) value.getValue()).mo5432s();
                if (s2 > 4) {
                    i3 += s2;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < ExifData.f4299o.length; i5++) {
            if (!this.f4415a.mo5336c(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f4415a.mo5336c(i5).size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.f4415a.mo5336c(1).isEmpty()) {
            this.f4415a.mo5336c(0).put(ExifData.f4297m[1].f4463b, C1522e.m6425i((long) iArr[1], this.f4415a.mo5337d()));
        }
        if (!this.f4415a.mo5336c(2).isEmpty()) {
            this.f4415a.mo5336c(0).put(ExifData.f4297m[2].f4463b, C1522e.m6425i((long) iArr[2], this.f4415a.mo5337d()));
        }
        if (!this.f4415a.mo5336c(3).isEmpty()) {
            this.f4415a.mo5336c(1).put(ExifData.f4297m[3].f4463b, C1522e.m6425i((long) iArr[3], this.f4415a.mo5337d()));
        }
        bVar.mo5391g(i6);
        bVar.write(f4406X);
        if (this.f4415a.mo5337d() == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        bVar.mo5389d(s);
        bVar.mo5386a(this.f4415a.mo5337d());
        bVar.mo5391g(42);
        bVar.mo5390f(8);
        for (int i7 = 0; i7 < ExifData.f4299o.length; i7++) {
            if (!this.f4415a.mo5336c(i7).isEmpty()) {
                bVar.mo5391g(this.f4415a.mo5336c(i7).size());
                int size = iArr[i7] + 2 + (this.f4415a.mo5336c(i7).size() * 12) + 4;
                for (Map.Entry next : this.f4415a.mo5336c(i7).entrySet()) {
                    int i8 = ((C1563g) C18001r.m81776m((C1563g) ExifData.C1509b.f4317g.get(i7).get(next.getKey()), "Tag not supported: " + ((String) next.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f4462a;
                    C1522e eVar = (C1522e) next.getValue();
                    int s3 = eVar.mo5432s();
                    bVar.mo5391g(i8);
                    bVar.mo5391g(eVar.f4363a);
                    bVar.mo5388c(eVar.f4364b);
                    if (s3 > 4) {
                        bVar.mo5390f((long) size);
                        size += s3;
                    } else {
                        bVar.write(eVar.f4366d);
                        if (s3 < 4) {
                            while (s3 < 4) {
                                bVar.mo5387b(0);
                                s3++;
                            }
                        }
                    }
                }
                bVar.mo5390f(0);
                for (Map.Entry<String, C1522e> value2 : this.f4415a.mo5336c(i7).entrySet()) {
                    byte[] bArr = ((C1522e) value2.getValue()).f4366d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.mo5386a(ByteOrder.BIG_ENDIAN);
    }

    public void write(@C0359n0 byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            int i3 = this.f4419e;
            if ((i3 > 0 || this.f4420f > 0 || this.f4418d != 2) && i2 > 0) {
                if (i3 > 0) {
                    int min = Math.min(i2, i3);
                    i2 -= min;
                    this.f4419e -= min;
                    i += min;
                }
                int i4 = this.f4420f;
                if (i4 > 0) {
                    int min2 = Math.min(i2, i4);
                    this.out.write(bArr, i, min2);
                    i2 -= min2;
                    this.f4420f -= min2;
                    i += min2;
                }
                if (i2 != 0) {
                    int i5 = this.f4418d;
                    if (i5 == 0) {
                        int a = mo5469a(2, bArr, i, i2);
                        i += a;
                        i2 -= a;
                        if (this.f4417c.position() >= 2) {
                            this.f4417c.rewind();
                            if (this.f4417c.getShort() == -40) {
                                this.out.write(this.f4417c.array(), 0, 2);
                                this.f4418d = 1;
                                this.f4417c.rewind();
                                C1514b bVar = new C1514b(this.out, ByteOrder.BIG_ENDIAN);
                                bVar.mo5389d(-31);
                                mo5470b(bVar);
                            } else {
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                        } else {
                            return;
                        }
                    } else if (i5 != 1) {
                        continue;
                    } else {
                        int a2 = mo5469a(4, bArr, i, i2);
                        i += a2;
                        i2 -= a2;
                        if (this.f4417c.position() == 2 && this.f4417c.getShort() == -39) {
                            this.out.write(this.f4417c.array(), 0, 2);
                            this.f4417c.rewind();
                        }
                        if (this.f4417c.position() >= 4) {
                            this.f4417c.rewind();
                            short s = this.f4417c.getShort();
                            if (s == -31) {
                                this.f4419e = (this.f4417c.getShort() & C11679z1.f28988d) - 2;
                                this.f4418d = 2;
                            } else if (!C1540a.m6457a(s)) {
                                this.out.write(this.f4417c.array(), 0, 4);
                                this.f4420f = (this.f4417c.getShort() & C11679z1.f28988d) - 2;
                            } else {
                                this.out.write(this.f4417c.array(), 0, 4);
                                this.f4418d = 2;
                            }
                            this.f4417c.rewind();
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        if (i2 > 0) {
            this.out.write(bArr, i, i2);
        }
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f4416b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    public void write(@C0359n0 byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
