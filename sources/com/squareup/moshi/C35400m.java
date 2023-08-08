package com.squareup.moshi;

import com.carrefour.fid.android.airship.util.C13758b;
import com.google.firebase.installations.C33124s;
import java.io.IOException;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.C12361b;
import okio.C12465c0;
import okio.C12500m;
import okio.C12505n;
import okio.C12506n0;
import okio.C12516r0;

/* renamed from: com.squareup.moshi.m */
public final class C35400m extends C35407q {

    /* renamed from: Y */
    public static final String[] f87010Y = new String[128];

    /* renamed from: X */
    public String f87011X;

    /* renamed from: y */
    public final C12505n f87012y;

    /* renamed from: z */
    public String f87013z = C33124s.f80355c;

    /* renamed from: com.squareup.moshi.m$a */
    public class C35401a implements C12506n0 {
        public C35401a() {
        }

        public void close() {
            if (C35400m.this.mo106074q() == 9) {
                C35400m mVar = C35400m.this;
                int i = mVar.f87037a - 1;
                mVar.f87037a = i;
                int[] iArr = mVar.f87040d;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
                return;
            }
            throw new AssertionError();
        }

        public void flush() throws IOException {
            C35400m.this.f87012y.flush();
        }

        public C12516r0 timeout() {
            return C12516r0.NONE;
        }

        public void write(C12500m mVar, long j) throws IOException {
            C35400m.this.f87012y.write(mVar, j);
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f87010Y[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f87010Y;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C35400m(C12505n nVar) {
        if (nVar != null) {
            this.f87012y = nVar;
            mo106076s(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: P */
    public static void m145865P(C12505n nVar, String str) throws IOException {
        String str2;
        String[] strArr = f87010Y;
        nVar.mo27225K2(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                nVar.mo27242v1(str, i, i2);
            }
            nVar.mo27236l1(str2);
            i = i2 + 1;
        }
        if (i < length) {
            nVar.mo27242v1(str, i, length);
        }
        nVar.mo27225K2(34);
    }

    /* renamed from: B */
    public C35407q mo106027B(long j) throws IOException {
        if (this.f87044v) {
            this.f87044v = false;
            return mo106045n(Long.toString(j));
        }
        mo106038Q();
        mo106034L();
        this.f87012y.mo27236l1(Long.toString(j));
        int[] iArr = this.f87040d;
        int i = this.f87037a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: C */
    public C35407q mo106028C(Boolean bool) throws IOException {
        if (bool == null) {
            return mo106046o();
        }
        return mo106031G(bool.booleanValue());
    }

    /* renamed from: D */
    public C35407q mo106029D(@Nullable Number number) throws IOException {
        if (number == null) {
            return mo106046o();
        }
        String obj = number.toString();
        if (!this.f87042f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f87044v) {
            this.f87044v = false;
            return mo106045n(obj);
        } else {
            mo106038Q();
            mo106034L();
            this.f87012y.mo27236l1(obj);
            int[] iArr = this.f87040d;
            int i = this.f87037a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: E */
    public C35407q mo106030E(String str) throws IOException {
        if (str == null) {
            return mo106046o();
        }
        if (this.f87044v) {
            this.f87044v = false;
            return mo106045n(str);
        }
        mo106038Q();
        mo106034L();
        m145865P(this.f87012y, str);
        int[] iArr = this.f87040d;
        int i = this.f87037a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: G */
    public C35407q mo106031G(boolean z) throws IOException {
        String str;
        if (!this.f87044v) {
            mo106038Q();
            mo106034L();
            C12505n nVar = this.f87012y;
            if (z) {
                str = C13758b.f33436b;
            } else {
                str = C13758b.f33438c;
            }
            nVar.mo27236l1(str);
            int[] iArr = this.f87040d;
            int i = this.f87037a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: I */
    public C12505n mo106032I() throws IOException {
        if (!this.f87044v) {
            mo106038Q();
            mo106034L();
            mo106076s(9);
            return C12465c0.m50480c(new C35401a());
        }
        throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: K */
    public final void mo106033K() throws IOException {
        int q = mo106074q();
        if (q == 5) {
            this.f87012y.mo27225K2(44);
        } else if (q != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        mo106036N();
        mo106077t(4);
    }

    /* renamed from: L */
    public final void mo106034L() throws IOException {
        int q = mo106074q();
        int i = 2;
        if (q != 1) {
            if (q != 2) {
                if (q == 4) {
                    this.f87012y.mo27236l1(this.f87013z);
                    i = 5;
                } else if (q != 9) {
                    i = 7;
                    if (q != 6) {
                        if (q != 7) {
                            throw new IllegalStateException("Nesting problem.");
                        } else if (!this.f87042f) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    }
                } else {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                mo106077t(i);
            }
            this.f87012y.mo27225K2(44);
        }
        mo106036N();
        mo106077t(i);
    }

    /* renamed from: M */
    public final C35407q mo106035M(int i, int i2, char c) throws IOException {
        int q = mo106074q();
        if (q != i2 && q != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f87011X == null) {
            int i3 = this.f87037a;
            int i4 = this.f87045w;
            if (i3 == (~i4)) {
                this.f87045w = ~i4;
                return this;
            }
            int i5 = i3 - 1;
            this.f87037a = i5;
            this.f87039c[i5] = null;
            int[] iArr = this.f87040d;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (q == i2) {
                mo106036N();
            }
            this.f87012y.mo27225K2(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f87011X);
        }
    }

    /* renamed from: N */
    public final void mo106036N() throws IOException {
        if (this.f87041e != null) {
            this.f87012y.mo27225K2(10);
            int i = this.f87037a;
            for (int i2 = 1; i2 < i; i2++) {
                this.f87012y.mo27236l1(this.f87041e);
            }
        }
    }

    /* renamed from: O */
    public final C35407q mo106037O(int i, int i2, char c) throws IOException {
        int i3 = this.f87037a;
        int i4 = this.f87045w;
        if (i3 == i4) {
            int[] iArr = this.f87038b;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.f87045w = ~i4;
                return this;
            }
        }
        mo106034L();
        mo106067d();
        mo106076s(i);
        this.f87040d[this.f87037a - 1] = 0;
        this.f87012y.mo27225K2(c);
        return this;
    }

    /* renamed from: Q */
    public final void mo106038Q() throws IOException {
        if (this.f87011X != null) {
            mo106033K();
            m145865P(this.f87012y, this.f87011X);
            this.f87011X = null;
        }
    }

    /* renamed from: a */
    public C35407q mo106039a() throws IOException {
        if (!this.f87044v) {
            mo106038Q();
            return mo106037O(1, 2, C12361b.f30260k);
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: c */
    public C35407q mo106040c() throws IOException {
        if (!this.f87044v) {
            mo106038Q();
            return mo106037O(3, 5, C12361b.f30258i);
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public void close() throws IOException {
        this.f87012y.close();
        int i = this.f87037a;
        if (i > 1 || (i == 1 && this.f87038b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f87037a = 0;
    }

    /* renamed from: f */
    public C35407q mo106042f() throws IOException {
        return mo106035M(1, 2, C12361b.f30261l);
    }

    public void flush() throws IOException {
        if (this.f87037a != 0) {
            this.f87012y.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: i */
    public C35407q mo106044i() throws IOException {
        this.f87044v = false;
        return mo106035M(3, 5, C12361b.f30259j);
    }

    /* renamed from: n */
    public C35407q mo106045n(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f87037a != 0) {
            int q = mo106074q();
            if ((q == 3 || q == 5) && this.f87011X == null && !this.f87044v) {
                this.f87011X = str;
                this.f87039c[this.f87037a - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: o */
    public C35407q mo106046o() throws IOException {
        if (!this.f87044v) {
            if (this.f87011X != null) {
                if (this.f87043g) {
                    mo106038Q();
                } else {
                    this.f87011X = null;
                    return this;
                }
            }
            mo106034L();
            this.f87012y.mo27236l1("null");
            int[] iArr = this.f87040d;
            int i = this.f87037a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: u */
    public void mo106047u(String str) {
        String str2;
        super.mo106047u(str);
        if (!str.isEmpty()) {
            str2 = ": ";
        } else {
            str2 = C33124s.f80355c;
        }
        this.f87013z = str2;
    }

    /* renamed from: z */
    public C35407q mo106048z(double d) throws IOException {
        if (!this.f87042f && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f87044v) {
            this.f87044v = false;
            return mo106045n(Double.toString(d));
        } else {
            mo106038Q();
            mo106034L();
            this.f87012y.mo27236l1(Double.toString(d));
            int[] iArr = this.f87040d;
            int i = this.f87037a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }
}
