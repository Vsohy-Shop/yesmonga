package com.contentsquare.android.sdk;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.contentsquare.android.sdk.t0 */
public abstract class C14719t0 implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final C14719t0 f36442b = new C14729j(C14566o3.f36059d);

    /* renamed from: c */
    public static final C14725f f36443c = (C14615p9.m62951c() ? new C14730k((C14720a) null) : new C14723d((C14720a) null));

    /* renamed from: d */
    public static final Comparator<C14719t0> f36444d = new C14721b();

    /* renamed from: a */
    public int f36445a = 0;

    /* renamed from: com.contentsquare.android.sdk.t0$a */
    public class C14720a extends C14722c {

        /* renamed from: a */
        public int f36446a = 0;

        /* renamed from: b */
        public final int f36447b;

        public C14720a() {
            this.f36447b = C14719t0.this.size();
        }

        /* renamed from: a */
        public byte mo36445a() {
            int i = this.f36446a;
            if (i < this.f36447b) {
                this.f36446a = i + 1;
                return C14719t0.this.mo36431f0(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f36446a < this.f36447b;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t0$b */
    public static class C14721b implements Comparator<C14719t0> {
        /* renamed from: a */
        public int compare(C14719t0 t0Var, C14719t0 t0Var2) {
            C14726g m0 = t0Var.iterator();
            C14726g m02 = t0Var2.iterator();
            while (m0.hasNext() && m02.hasNext()) {
                int compareTo = Integer.valueOf(C14719t0.m63428H(m0.mo36445a())).compareTo(Integer.valueOf(C14719t0.m63428H(m02.mo36445a())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(t0Var.size()).compareTo(Integer.valueOf(t0Var2.size()));
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t0$c */
    public static abstract class C14722c implements C14726g {
        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(mo36445a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t0$d */
    public static final class C14723d implements C14725f {
        public C14723d() {
        }

        /* renamed from: a */
        public byte[] mo36452a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ C14723d(C14720a aVar) {
            this();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t0$e */
    public static final class C14724e extends C14729j {

        /* renamed from: f */
        public final int f36449f;

        /* renamed from: g */
        public final int f36450g;

        public C14724e(byte[] bArr, int i, int i2) {
            super(bArr);
            C14719t0.m63432h(i, i + i2, bArr.length);
            this.f36449f = i;
            this.f36450g = i2;
        }

        /* renamed from: A */
        public void mo36425A(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f36453e, mo36453u0() + i, bArr, i2, i3);
        }

        /* renamed from: e0 */
        public byte mo36429e0(int i) {
            C14719t0.m63437w(i, size());
            return this.f36453e[this.f36449f + i];
        }

        /* renamed from: f0 */
        public byte mo36431f0(int i) {
            return this.f36453e[this.f36449f + i];
        }

        public int size() {
            return this.f36450g;
        }

        /* renamed from: u0 */
        public int mo36453u0() {
            return this.f36449f;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t0$f */
    public interface C14725f {
        /* renamed from: a */
        byte[] mo36452a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.contentsquare.android.sdk.t0$g */
    public interface C14726g extends Iterator<Byte> {
        /* renamed from: a */
        byte mo36445a();
    }

    /* renamed from: com.contentsquare.android.sdk.t0$h */
    public static final class C14727h {

        /* renamed from: a */
        public final C14235c1 f36451a;

        /* renamed from: b */
        public final byte[] f36452b;

        public C14727h(int i) {
            byte[] bArr = new byte[i];
            this.f36452b = bArr;
            this.f36451a = C14235c1.m61161J(bArr);
        }

        /* renamed from: a */
        public C14719t0 mo36454a() {
            this.f36451a.mo34781L();
            return new C14729j(this.f36452b);
        }

        /* renamed from: b */
        public C14235c1 mo36455b() {
            return this.f36451a;
        }

        public /* synthetic */ C14727h(int i, C14720a aVar) {
            this(i);
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t0$i */
    public static abstract class C14728i extends C14719t0 {
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C14719t0.super.iterator();
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t0$j */
    public static class C14729j extends C14728i {

        /* renamed from: e */
        public final byte[] f36453e;

        public C14729j(byte[] bArr) {
            bArr.getClass();
            this.f36453e = bArr;
        }

        /* renamed from: A */
        public void mo36425A(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f36453e, i, bArr, i2, i3);
        }

        /* renamed from: M */
        public final int mo36426M(int i, int i2, int i3) {
            return C14566o3.m62799a(i, this.f36453e, mo36453u0() + i2, i3);
        }

        /* renamed from: Q */
        public final C14719t0 mo36427Q(int i, int i2) {
            int h = C14719t0.m63432h(i, i2, size());
            return h == 0 ? C14719t0.f36442b : new C14724e(this.f36453e, mo36453u0() + i, h);
        }

        /* renamed from: Y */
        public final String mo36428Y(Charset charset) {
            return new String(this.f36453e, mo36453u0(), size(), charset);
        }

        /* renamed from: e0 */
        public byte mo36429e0(int i) {
            return this.f36453e[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C14719t0) || size() != ((C14719t0) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C14729j)) {
                return obj.equals(this);
            }
            C14729j jVar = (C14729j) obj;
            int o0 = mo36437o0();
            int o02 = jVar.mo36437o0();
            if (o0 == 0 || o02 == 0 || o0 == o02) {
                return mo36456t0(jVar, 0, size());
            }
            return false;
        }

        /* renamed from: f0 */
        public byte mo36431f0(int i) {
            return this.f36453e[i];
        }

        /* renamed from: l0 */
        public final boolean mo36434l0() {
            int u0 = mo36453u0();
            return C14553ne.m62727n(this.f36453e, u0, size() + u0);
        }

        /* renamed from: n0 */
        public final C14231c mo36436n0() {
            return C14231c.m61080e(this.f36453e, mo36453u0(), size(), true);
        }

        public int size() {
            return this.f36453e.length;
        }

        /* renamed from: t0 */
        public final boolean mo36456t0(C14719t0 t0Var, int i, int i2) {
            if (i2 <= t0Var.size()) {
                int i3 = i + i2;
                if (i3 > t0Var.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + t0Var.size());
                } else if (!(t0Var instanceof C14729j)) {
                    return t0Var.mo36427Q(i, i3).equals(mo36427Q(0, i2));
                } else {
                    C14729j jVar = (C14729j) t0Var;
                    byte[] bArr = this.f36453e;
                    byte[] bArr2 = jVar.f36453e;
                    int u0 = mo36453u0() + i2;
                    int u02 = mo36453u0();
                    int u03 = jVar.mo36453u0() + i;
                    while (u02 < u0) {
                        if (bArr[u02] != bArr2[u03]) {
                            return false;
                        }
                        u02++;
                        u03++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* renamed from: u0 */
        public int mo36453u0() {
            return 0;
        }

        /* renamed from: y */
        public final void mo36444y(C14307eb ebVar) {
            ebVar.mo34797a(this.f36453e, mo36453u0(), size());
        }
    }

    /* renamed from: com.contentsquare.android.sdk.t0$k */
    public static final class C14730k implements C14725f {
        public C14730k() {
        }

        /* renamed from: a */
        public byte[] mo36452a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ C14730k(C14720a aVar) {
            this();
        }
    }

    /* renamed from: H */
    public static int m63428H(byte b) {
        return b & 255;
    }

    /* renamed from: W */
    public static C14719t0 m63429W(byte[] bArr) {
        return new C14729j(bArr);
    }

    /* renamed from: X */
    public static C14719t0 m63430X(byte[] bArr, int i, int i2) {
        return new C14724e(bArr, i, i2);
    }

    /* renamed from: h */
    public static int m63432h(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: i */
    public static C14719t0 m63433i(String str) {
        return new C14729j(str.getBytes(C14566o3.f36057b));
    }

    /* renamed from: k */
    public static C14719t0 m63434k(byte[] bArr) {
        return m63436q(bArr, 0, bArr.length);
    }

    /* renamed from: k0 */
    public static C14727h m63435k0(int i) {
        return new C14727h(i, (C14720a) null);
    }

    /* renamed from: q */
    public static C14719t0 m63436q(byte[] bArr, int i, int i2) {
        m63432h(i, i + i2, bArr.length);
        return new C14729j(f36443c.mo36452a(bArr, i, i2));
    }

    /* renamed from: w */
    public static void m63437w(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: A */
    public abstract void mo36425A(byte[] bArr, int i, int i2, int i3);

    /* renamed from: M */
    public abstract int mo36426M(int i, int i2, int i3);

    /* renamed from: Q */
    public abstract C14719t0 mo36427Q(int i, int i2);

    /* renamed from: Y */
    public abstract String mo36428Y(Charset charset);

    /* renamed from: e0 */
    public abstract byte mo36429e0(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f0 */
    public abstract byte mo36431f0(int i);

    public final int hashCode() {
        int i = this.f36445a;
        if (i == 0) {
            int size = size();
            i = mo36426M(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f36445a = i;
        }
        return i;
    }

    /* renamed from: l0 */
    public abstract boolean mo36434l0();

    /* renamed from: m0 */
    public C14726g iterator() {
        return new C14720a();
    }

    /* renamed from: n0 */
    public abstract C14231c mo36436n0();

    /* renamed from: o0 */
    public final int mo36437o0() {
        return this.f36445a;
    }

    /* renamed from: p0 */
    public final byte[] mo36438p0() {
        int size = size();
        if (size == 0) {
            return C14566o3.f36059d;
        }
        byte[] bArr = new byte[size];
        mo36425A(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: r */
    public final String mo36439r(Charset charset) {
        return size() == 0 ? "" : mo36428Y(charset);
    }

    /* renamed from: r0 */
    public final String mo36440r0() {
        return mo36439r(C14566o3.f36057b);
    }

    /* renamed from: s0 */
    public final String mo36441s0() {
        if (size() <= 50) {
            return C14701s9.m63396b(this);
        }
        return C14701s9.m63396b(mo36427Q(0, 47)) + "...";
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), mo36441s0()});
    }

    /* renamed from: y */
    public abstract void mo36444y(C14307eb ebVar);
}
