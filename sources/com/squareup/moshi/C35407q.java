package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import okio.C12505n;
import okio.C12507o;

/* renamed from: com.squareup.moshi.q */
public abstract class C35407q implements Closeable, Flushable {

    /* renamed from: a */
    public int f87037a = 0;

    /* renamed from: b */
    public int[] f87038b = new int[32];

    /* renamed from: c */
    public String[] f87039c = new String[32];

    /* renamed from: d */
    public int[] f87040d = new int[32];

    /* renamed from: e */
    public String f87041e;

    /* renamed from: f */
    public boolean f87042f;

    /* renamed from: g */
    public boolean f87043g;

    /* renamed from: v */
    public boolean f87044v;

    /* renamed from: w */
    public int f87045w = -1;

    /* renamed from: x */
    public Map<Class<?>, Object> f87046x;

    @CheckReturnValue
    /* renamed from: p */
    public static C35407q m145929p(C12505n nVar) {
        return new C35400m(nVar);
    }

    /* renamed from: B */
    public abstract C35407q mo106027B(long j) throws IOException;

    /* renamed from: C */
    public abstract C35407q mo106028C(@Nullable Boolean bool) throws IOException;

    /* renamed from: D */
    public abstract C35407q mo106029D(@Nullable Number number) throws IOException;

    /* renamed from: E */
    public abstract C35407q mo106030E(@Nullable String str) throws IOException;

    /* renamed from: F */
    public final C35407q mo106065F(C12507o oVar) throws IOException {
        if (!this.f87044v) {
            C12505n I = mo106032I();
            try {
                oVar.mo27276M3(I);
                if (I != null) {
                    I.close();
                }
                return this;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        throw th;
    }

    /* renamed from: G */
    public abstract C35407q mo106031G(boolean z) throws IOException;

    @CheckReturnValue
    /* renamed from: I */
    public abstract C12505n mo106032I() throws IOException;

    /* renamed from: a */
    public abstract C35407q mo106039a() throws IOException;

    @CheckReturnValue
    /* renamed from: b */
    public final int mo106066b() {
        int q = mo106074q();
        if (q == 5 || q == 3 || q == 2 || q == 1) {
            int i = this.f87045w;
            this.f87045w = this.f87037a;
            return i;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: c */
    public abstract C35407q mo106040c() throws IOException;

    /* renamed from: d */
    public final boolean mo106067d() {
        int i = this.f87037a;
        int[] iArr = this.f87038b;
        if (i != iArr.length) {
            return false;
        }
        if (i != 256) {
            this.f87038b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f87039c;
            this.f87039c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f87040d;
            this.f87040d = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (!(this instanceof C35405p)) {
                return true;
            }
            C35405p pVar = (C35405p) this;
            Object[] objArr = pVar.f87033y;
            pVar.f87033y = Arrays.copyOf(objArr, objArr.length * 2);
            return true;
        }
        throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
    }

    /* renamed from: f */
    public abstract C35407q mo106042f() throws IOException;

    /* renamed from: g */
    public final void mo106068g(int i) {
        this.f87045w = i;
    }

    @CheckReturnValue
    public final String getPath() {
        return C35398k.m145828a(this.f87037a, this.f87038b, this.f87039c, this.f87040d);
    }

    /* renamed from: i */
    public abstract C35407q mo106044i() throws IOException;

    @CheckReturnValue
    /* renamed from: j */
    public final String mo106070j() {
        String str = this.f87041e;
        return str != null ? str : "";
    }

    @CheckReturnValue
    /* renamed from: k */
    public final boolean mo106071k() {
        return this.f87043g;
    }

    @CheckReturnValue
    /* renamed from: l */
    public final boolean mo106072l() {
        return this.f87042f;
    }

    /* renamed from: m */
    public final C35407q mo106073m(@Nullable Object obj) throws IOException {
        String str;
        if (obj instanceof Map) {
            mo106040c();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    if (key == null) {
                        str = "Map keys must be non-null";
                    } else {
                        str = "Map keys must be of type String: " + key.getClass().getName();
                    }
                    throw new IllegalArgumentException(str);
                }
                mo106045n((String) key);
                mo106073m(entry.getValue());
            }
            mo106044i();
        } else if (obj instanceof List) {
            mo106039a();
            for (Object m : (List) obj) {
                mo106073m(m);
            }
            mo106042f();
        } else if (obj instanceof String) {
            mo106030E((String) obj);
        } else if (obj instanceof Boolean) {
            mo106031G(((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            mo106048z(((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            mo106027B(((Long) obj).longValue());
        } else if (obj instanceof Number) {
            mo106029D((Number) obj);
        } else if (obj == null) {
            mo106046o();
        } else {
            throw new IllegalArgumentException("Unsupported type: " + obj.getClass().getName());
        }
        return this;
    }

    /* renamed from: n */
    public abstract C35407q mo106045n(String str) throws IOException;

    /* renamed from: o */
    public abstract C35407q mo106046o() throws IOException;

    /* renamed from: q */
    public final int mo106074q() {
        int i = this.f87037a;
        if (i != 0) {
            return this.f87038b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: r */
    public final void mo106075r() throws IOException {
        int q = mo106074q();
        if (q == 5 || q == 3) {
            this.f87044v = true;
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: s */
    public final void mo106076s(int i) {
        int[] iArr = this.f87038b;
        int i2 = this.f87037a;
        this.f87037a = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: t */
    public final void mo106077t(int i) {
        this.f87038b[this.f87037a - 1] = i;
    }

    /* renamed from: u */
    public void mo106047u(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f87041e = str;
    }

    /* renamed from: v */
    public final void mo106078v(boolean z) {
        this.f87042f = z;
    }

    /* renamed from: w */
    public final void mo106079w(boolean z) {
        this.f87043g = z;
    }

    /* renamed from: x */
    public final <T> void mo106080x(Class<T> cls, T t) {
        if (cls.isAssignableFrom(t.getClass())) {
            if (this.f87046x == null) {
                this.f87046x = new LinkedHashMap();
            }
            this.f87046x.put(cls, t);
            return;
        }
        throw new IllegalArgumentException("Tag value must be of type " + cls.getName());
    }

    @CheckReturnValue
    @Nullable
    /* renamed from: y */
    public final <T> T mo106081y(Class<T> cls) {
        Map<Class<?>, Object> map = this.f87046x;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    /* renamed from: z */
    public abstract C35407q mo106048z(double d) throws IOException;
}
