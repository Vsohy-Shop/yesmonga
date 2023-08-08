package kotlin.p010io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11143f
/* renamed from: kotlin.io.encoding.e */
public final class C11142e extends OutputStream {
    @C12579k

    /* renamed from: a */
    public final OutputStream f28326a;
    @C12579k

    /* renamed from: b */
    public final C11137a f28327b;

    /* renamed from: c */
    public boolean f28328c;

    /* renamed from: d */
    public int f28329d;
    @C12579k

    /* renamed from: e */
    public final byte[] f28330e;
    @C12579k

    /* renamed from: f */
    public final byte[] f28331f;

    /* renamed from: g */
    public int f28332g;

    public C11142e(@C12579k OutputStream outputStream, @C12579k C11137a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(outputStream, "output");
        Intrinsics.checkNotNullParameter(aVar, "base64");
        this.f28326a = outputStream;
        this.f28327b = aVar;
        if (aVar.mo22563D()) {
            i = 76;
        } else {
            i = -1;
        }
        this.f28329d = i;
        this.f28330e = new byte[1024];
        this.f28331f = new byte[3];
    }

    /* renamed from: a */
    public final void mo22595a() {
        if (this.f28328c) {
            throw new IOException("The output stream is closed.");
        }
    }

    /* renamed from: b */
    public final int mo22596b(byte[] bArr, int i, int i2) {
        int min = Math.min(3 - this.f28332g, i2 - i);
        C10956m.m41147W0(bArr, this.f28331f, this.f28332g, i, i + min);
        int i3 = this.f28332g + min;
        this.f28332g = i3;
        if (i3 == 3) {
            mo22597c();
        }
        return min;
    }

    /* renamed from: c */
    public final void mo22597c() {
        boolean z;
        if (mo22599d(this.f28331f, 0, this.f28332g) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f28332g = 0;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void close() {
        if (!this.f28328c) {
            this.f28328c = true;
            if (this.f28332g != 0) {
                mo22597c();
            }
            this.f28326a.close();
        }
    }

    /* renamed from: d */
    public final int mo22599d(byte[] bArr, int i, int i2) {
        boolean z;
        int t = this.f28327b.mo22577t(bArr, this.f28330e, 0, i, i2);
        if (this.f28329d == 0) {
            this.f28326a.write(C11137a.f28300c.mo22583H());
            this.f28329d = 76;
            if (t <= 76) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.f28326a.write(this.f28330e, 0, t);
        this.f28329d -= t;
        return t;
    }

    public void flush() {
        mo22595a();
        this.f28326a.flush();
    }

    public void write(int i) {
        mo22595a();
        byte[] bArr = this.f28331f;
        int i2 = this.f28332g;
        int i3 = i2 + 1;
        this.f28332g = i3;
        bArr[i2] = (byte) i;
        if (i3 == 3) {
            mo22597c();
        }
    }

    public void write(@C12579k byte[] bArr, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(bArr, "source");
        mo22595a();
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", source size: " + bArr.length);
        } else if (i2 != 0) {
            int i4 = this.f28332g;
            if (i4 < 3) {
                if (i4 != 0) {
                    i += mo22596b(bArr, i, i3);
                    if (this.f28332g != 0) {
                        return;
                    }
                }
                while (i + 3 <= i3) {
                    int min = Math.min((this.f28327b.mo22563D() ? this.f28329d : this.f28330e.length) / 4, (i3 - i) / 3);
                    int i5 = (min * 3) + i;
                    if (mo22599d(bArr, i, i5) == min * 4) {
                        i = i5;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                C10956m.m41147W0(bArr, this.f28331f, 0, i, i3);
                this.f28332g = i3 - i;
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
