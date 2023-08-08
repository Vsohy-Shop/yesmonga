package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import okio.C12465c0;
import okio.C12500m;
import okio.C12505n;
import okio.C12506n0;
import okio.C12521t;

/* renamed from: com.squareup.moshi.p */
public final class C35405p extends C35407q {

    /* renamed from: y */
    public Object[] f87033y = new Object[32];
    @Nullable

    /* renamed from: z */
    public String f87034z;

    /* renamed from: com.squareup.moshi.p$a */
    public class C35406a extends C12521t {

        /* renamed from: a */
        public final /* synthetic */ C12500m f87035a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35406a(C12506n0 n0Var, C12500m mVar) {
            super(n0Var);
            this.f87035a = mVar;
        }

        /* JADX INFO: finally extract failed */
        public void close() throws IOException {
            if (C35405p.this.mo106074q() == 9) {
                C35405p pVar = C35405p.this;
                Object[] objArr = pVar.f87033y;
                int i = pVar.f87037a;
                if (objArr[i] == null) {
                    pVar.f87037a = i - 1;
                    Object w = JsonReader.m145704r(this.f87035a).mo105892w();
                    C35405p pVar2 = C35405p.this;
                    boolean z = pVar2.f87043g;
                    pVar2.f87043g = true;
                    try {
                        C35405p unused = pVar2.mo106061K(w);
                        C35405p pVar3 = C35405p.this;
                        pVar3.f87043g = z;
                        int[] iArr = pVar3.f87040d;
                        int i2 = pVar3.f87037a - 1;
                        iArr[i2] = iArr[i2] + 1;
                        return;
                    } catch (Throwable th) {
                        C35405p.this.f87043g = z;
                        throw th;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public C35405p() {
        mo106076s(6);
    }

    /* renamed from: B */
    public C35407q mo106027B(long j) throws IOException {
        if (this.f87044v) {
            this.f87044v = false;
            return mo106045n(Long.toString(j));
        }
        mo106061K(Long.valueOf(j));
        int[] iArr = this.f87040d;
        int i = this.f87037a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: C */
    public C35407q mo106028C(@Nullable Boolean bool) throws IOException {
        if (!this.f87044v) {
            mo106061K(bool);
            int[] iArr = this.f87040d;
            int i = this.f87037a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: D */
    public C35407q mo106029D(@Nullable Number number) throws IOException {
        BigDecimal bigDecimal;
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return mo106027B(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return mo106048z(number.doubleValue());
        }
        if (number == null) {
            return mo106046o();
        }
        if (number instanceof BigDecimal) {
            bigDecimal = (BigDecimal) number;
        } else {
            bigDecimal = new BigDecimal(number.toString());
        }
        if (this.f87044v) {
            this.f87044v = false;
            return mo106045n(bigDecimal.toString());
        }
        mo106061K(bigDecimal);
        int[] iArr = this.f87040d;
        int i = this.f87037a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: E */
    public C35407q mo106030E(@Nullable String str) throws IOException {
        if (this.f87044v) {
            this.f87044v = false;
            return mo106045n(str);
        }
        mo106061K(str);
        int[] iArr = this.f87040d;
        int i = this.f87037a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: G */
    public C35407q mo106031G(boolean z) throws IOException {
        if (!this.f87044v) {
            mo106061K(Boolean.valueOf(z));
            int[] iArr = this.f87040d;
            int i = this.f87037a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: I */
    public C12505n mo106032I() {
        if (this.f87044v) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        } else if (mo106074q() != 9) {
            mo106076s(9);
            C12500m mVar = new C12500m();
            return C12465c0.m50480c(new C35406a(mVar, mVar));
        } else {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
    }

    /* renamed from: K */
    public final C35405p mo106061K(@Nullable Object obj) {
        String str;
        Object put;
        int q = mo106074q();
        int i = this.f87037a;
        if (i == 1) {
            if (q == 6) {
                this.f87038b[i - 1] = 7;
                this.f87033y[i - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (q != 3 || (str = this.f87034z) == null) {
            if (q == 1) {
                ((List) this.f87033y[i - 1]).add(obj);
            } else if (q == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if ((obj != null || this.f87043g) && (put = ((Map) this.f87033y[i - 1]).put(str, obj)) != null) {
            throw new IllegalArgumentException("Map key '" + this.f87034z + "' has multiple values at path " + getPath() + ": " + put + " and " + obj);
        } else {
            this.f87034z = null;
        }
        return this;
    }

    /* renamed from: L */
    public Object mo106062L() {
        int i = this.f87037a;
        if (i <= 1 && (i != 1 || this.f87038b[i - 1] == 7)) {
            return this.f87033y[0];
        }
        throw new IllegalStateException("Incomplete document");
    }

    /* renamed from: a */
    public C35407q mo106039a() throws IOException {
        if (!this.f87044v) {
            int i = this.f87037a;
            int i2 = this.f87045w;
            if (i == i2 && this.f87038b[i - 1] == 1) {
                this.f87045w = ~i2;
                return this;
            }
            mo106067d();
            ArrayList arrayList = new ArrayList();
            mo106061K(arrayList);
            Object[] objArr = this.f87033y;
            int i3 = this.f87037a;
            objArr[i3] = arrayList;
            this.f87040d[i3] = 0;
            mo106076s(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: c */
    public C35407q mo106040c() throws IOException {
        if (!this.f87044v) {
            int i = this.f87037a;
            int i2 = this.f87045w;
            if (i == i2 && this.f87038b[i - 1] == 3) {
                this.f87045w = ~i2;
                return this;
            }
            mo106067d();
            LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
            mo106061K(linkedHashTreeMap);
            this.f87033y[this.f87037a] = linkedHashTreeMap;
            mo106076s(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public void close() throws IOException {
        int i = this.f87037a;
        if (i > 1 || (i == 1 && this.f87038b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f87037a = 0;
    }

    /* renamed from: f */
    public C35407q mo106042f() throws IOException {
        if (mo106074q() == 1) {
            int i = this.f87037a;
            int i2 = this.f87045w;
            if (i == (~i2)) {
                this.f87045w = ~i2;
                return this;
            }
            int i3 = i - 1;
            this.f87037a = i3;
            this.f87033y[i3] = null;
            int[] iArr = this.f87040d;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public void flush() throws IOException {
        if (this.f87037a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: i */
    public C35407q mo106044i() throws IOException {
        if (mo106074q() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f87034z == null) {
            int i = this.f87037a;
            int i2 = this.f87045w;
            if (i == (~i2)) {
                this.f87045w = ~i2;
                return this;
            }
            this.f87044v = false;
            int i3 = i - 1;
            this.f87037a = i3;
            this.f87033y[i3] = null;
            this.f87039c[i3] = null;
            int[] iArr = this.f87040d;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f87034z);
        }
    }

    /* renamed from: n */
    public C35407q mo106045n(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f87037a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (mo106074q() == 3 && this.f87034z == null && !this.f87044v) {
            this.f87034z = str;
            this.f87039c[this.f87037a - 1] = str;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: o */
    public C35407q mo106046o() throws IOException {
        if (!this.f87044v) {
            mo106061K((Object) null);
            int[] iArr = this.f87040d;
            int i = this.f87037a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: z */
    public C35407q mo106048z(double d) throws IOException {
        if (!this.f87042f && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f87044v) {
            this.f87044v = false;
            return mo106045n(Double.toString(d));
        } else {
            mo106061K(Double.valueOf(d));
            int[] iArr = this.f87040d;
            int i = this.f87037a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }
}
