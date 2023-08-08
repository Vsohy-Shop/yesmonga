package kotlin.p010io.encoding;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11143f
/* renamed from: kotlin.io.encoding.d */
public final class C11141d extends InputStream {
    @C12579k

    /* renamed from: a */
    public final InputStream f28317a;
    @C12579k

    /* renamed from: b */
    public final C11137a f28318b;

    /* renamed from: c */
    public boolean f28319c;

    /* renamed from: d */
    public boolean f28320d;
    @C12579k

    /* renamed from: e */
    public final byte[] f28321e = new byte[1];
    @C12579k

    /* renamed from: f */
    public final byte[] f28322f = new byte[1024];
    @C12579k

    /* renamed from: g */
    public final byte[] f28323g = new byte[1024];

    /* renamed from: v */
    public int f28324v;

    /* renamed from: w */
    public int f28325w;

    public C11141d(@C12579k InputStream inputStream, @C12579k C11137a aVar) {
        Intrinsics.checkNotNullParameter(inputStream, "input");
        Intrinsics.checkNotNullParameter(aVar, "base64");
        this.f28317a = inputStream;
        this.f28318b = aVar;
    }

    /* renamed from: a */
    public final void mo22585a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f28323g;
        int i3 = this.f28324v;
        C10956m.m41147W0(bArr2, bArr, i, i3, i3 + i2);
        this.f28324v += i2;
        mo22591g();
    }

    /* renamed from: b */
    public final int mo22586b(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f28325w;
        this.f28325w = i4 + this.f28318b.mo22574n(this.f28322f, this.f28323g, i4, 0, i3);
        int min = Math.min(mo22587c(), i2 - i);
        mo22585a(bArr, i, min);
        mo22592i();
        return min;
    }

    /* renamed from: c */
    public final int mo22587c() {
        return this.f28325w - this.f28324v;
    }

    public void close() {
        if (!this.f28319c) {
            this.f28319c = true;
            this.f28317a.close();
        }
    }

    /* renamed from: d */
    public final int mo22589d(int i) {
        this.f28322f[i] = C11137a.f28305h;
        if ((i & 3) != 2) {
            return i + 1;
        }
        int f = mo22590f();
        if (f >= 0) {
            this.f28322f[i + 1] = (byte) f;
        }
        return i + 2;
    }

    /* renamed from: f */
    public final int mo22590f() {
        int read;
        if (!this.f28318b.mo22563D()) {
            return this.f28317a.read();
        }
        do {
            read = this.f28317a.read();
            if (read == -1 || C11140c.m43025i(read)) {
                return read;
            }
            read = this.f28317a.read();
            break;
        } while (C11140c.m43025i(read));
        return read;
    }

    /* renamed from: g */
    public final void mo22591g() {
        if (this.f28324v == this.f28325w) {
            this.f28324v = 0;
            this.f28325w = 0;
        }
    }

    /* renamed from: i */
    public final void mo22592i() {
        byte[] bArr = this.f28323g;
        int length = bArr.length;
        int i = this.f28325w;
        if ((this.f28322f.length / 4) * 3 > length - i) {
            C10956m.m41147W0(bArr, bArr, 0, this.f28324v, i);
            this.f28325w -= this.f28324v;
            this.f28324v = 0;
        }
    }

    public int read() {
        int i = this.f28324v;
        if (i < this.f28325w) {
            byte b = this.f28323g[i] & 255;
            this.f28324v = i + 1;
            mo22591g();
            return b;
        }
        int read = read(this.f28321e, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.f28321e[0] & 255;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    public int read(@C12579k byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, FirebaseAnalytics.C32532b.f78977z);
        if (i < 0 || i2 < 0 || (i3 = i + i2) > bArr.length) {
            throw new IndexOutOfBoundsException("offset: " + i + ", length: " + i2 + ", buffer size: " + bArr.length);
        } else if (this.f28319c) {
            throw new IOException("The input stream is closed.");
        } else if (this.f28320d) {
            return -1;
        } else {
            if (i2 == 0) {
                return 0;
            }
            if (mo22587c() >= i2) {
                mo22585a(bArr, i, i2);
                return i2;
            }
            int c = ((((i2 - mo22587c()) + 3) - 1) / 3) * 4;
            int i4 = i;
            while (true) {
                boolean z2 = this.f28320d;
                if (!z2 && c > 0) {
                    int min = Math.min(this.f28322f.length, c);
                    int i5 = 0;
                    while (true) {
                        z = this.f28320d;
                        if (!z && i5 < min) {
                            int f = mo22590f();
                            if (f == -1) {
                                this.f28320d = true;
                            } else if (f != 61) {
                                this.f28322f[i5] = (byte) f;
                                i5++;
                            } else {
                                i5 = mo22589d(i5);
                                this.f28320d = true;
                            }
                        }
                    }
                    if (!z || i5 == min) {
                        c -= i5;
                        i4 += mo22586b(bArr, i4, i3, i5);
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else if (i4 == i || !z2) {
                    return i4 - i;
                } else {
                    return -1;
                }
            }
            if (i4 == i) {
            }
            return i4 - i;
        }
    }
}
