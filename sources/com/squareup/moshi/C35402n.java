package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import okio.C12500m;
import okio.C12507o;

/* renamed from: com.squareup.moshi.n */
public final class C35402n extends JsonReader {

    /* renamed from: w */
    public static final Object f87015w = new Object();

    /* renamed from: v */
    public Object[] f87016v;

    /* renamed from: com.squareup.moshi.n$a */
    public static final class C35403a implements Iterator<Object>, Cloneable {

        /* renamed from: a */
        public final JsonReader.Token f87017a;

        /* renamed from: b */
        public final Object[] f87018b;

        /* renamed from: c */
        public int f87019c;

        public C35403a(JsonReader.Token token, Object[] objArr, int i) {
            this.f87017a = token;
            this.f87018b = objArr;
            this.f87019c = i;
        }

        /* renamed from: b */
        public C35403a clone() {
            return new C35403a(this.f87017a, this.f87018b, this.f87019c);
        }

        public boolean hasNext() {
            return this.f87019c < this.f87018b.length;
        }

        public Object next() {
            Object[] objArr = this.f87018b;
            int i = this.f87019c;
            this.f87019c = i + 1;
            return objArr[i];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C35402n(Object obj) {
        int[] iArr = this.f86847b;
        int i = this.f86846a;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        this.f87016v = objArr;
        this.f86846a = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: D */
    public void mo105867D() throws IOException {
        if (!this.f86851f) {
            this.f87016v[this.f86846a - 1] = ((Map.Entry) mo106051L(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.f86848c[this.f86846a - 2] = "null";
            return;
        }
        JsonReader.Token s = mo105888s();
        mo105884n();
        throw new JsonDataException("Cannot skip unexpected " + s + " at " + getPath());
    }

    /* renamed from: E */
    public void mo105868E() throws IOException {
        Object obj;
        if (!this.f86851f) {
            int i = this.f86846a;
            if (i > 1) {
                this.f86848c[i - 2] = "null";
            }
            if (i != 0) {
                obj = this.f87016v[i - 1];
            } else {
                obj = null;
            }
            if (obj instanceof C35403a) {
                throw new JsonDataException("Expected a value but was " + mo105888s() + " at path " + getPath());
            } else if (obj instanceof Map.Entry) {
                Object[] objArr = this.f87016v;
                objArr[i - 1] = ((Map.Entry) objArr[i - 1]).getValue();
            } else if (i > 0) {
                mo106050K();
            } else {
                throw new JsonDataException("Expected a value but was " + mo105888s() + " at path " + getPath());
            }
        } else {
            throw new JsonDataException("Cannot skip unexpected " + mo105888s() + " at " + getPath());
        }
    }

    /* renamed from: J */
    public final void mo106049J(Object obj) {
        int i = this.f86846a;
        if (i == this.f87016v.length) {
            if (i != 256) {
                int[] iArr = this.f86847b;
                this.f86847b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f86848c;
                this.f86848c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f86849d;
                this.f86849d = Arrays.copyOf(iArr2, iArr2.length * 2);
                Object[] objArr = this.f87016v;
                this.f87016v = Arrays.copyOf(objArr, objArr.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        Object[] objArr2 = this.f87016v;
        int i2 = this.f86846a;
        this.f86846a = i2 + 1;
        objArr2[i2] = obj;
    }

    /* renamed from: K */
    public final void mo106050K() {
        int i = this.f86846a - 1;
        this.f86846a = i;
        Object[] objArr = this.f87016v;
        objArr[i] = null;
        this.f86847b[i] = 0;
        if (i > 0) {
            int[] iArr = this.f86849d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            Object obj = objArr[i - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    mo106049J(it.next());
                }
            }
        }
    }

    @Nullable
    /* renamed from: L */
    public final <T> T mo106051L(Class<T> cls, JsonReader.Token token) throws IOException {
        Object obj;
        int i = this.f86846a;
        if (i != 0) {
            obj = this.f87016v[i - 1];
        } else {
            obj = null;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == JsonReader.Token.NULL) {
            return null;
        }
        if (obj == f87015w) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw mo105871I(obj, token);
    }

    /* renamed from: M */
    public final String mo106052M(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw mo105871I(key, JsonReader.Token.NAME);
    }

    /* renamed from: a */
    public void mo105872a() throws IOException {
        List list = (List) mo106051L(List.class, JsonReader.Token.BEGIN_ARRAY);
        C35403a aVar = new C35403a(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f87016v;
        int i = this.f86846a;
        objArr[i - 1] = aVar;
        this.f86847b[i - 1] = 1;
        this.f86849d[i - 1] = 0;
        if (aVar.hasNext()) {
            mo106049J(aVar.next());
        }
    }

    /* renamed from: b */
    public void mo105873b() throws IOException {
        Map map = (Map) mo106051L(Map.class, JsonReader.Token.BEGIN_OBJECT);
        C35403a aVar = new C35403a(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f87016v;
        int i = this.f86846a;
        objArr[i - 1] = aVar;
        this.f86847b[i - 1] = 3;
        if (aVar.hasNext()) {
            mo106049J(aVar.next());
        }
    }

    /* renamed from: c */
    public void mo105874c() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        C35403a aVar = (C35403a) mo106051L(C35403a.class, token);
        if (aVar.f87017a != token || aVar.hasNext()) {
            throw mo105871I(aVar, token);
        }
        mo106050K();
    }

    public void close() throws IOException {
        Arrays.fill(this.f87016v, 0, this.f86846a, (Object) null);
        this.f87016v[0] = f87015w;
        this.f86847b[0] = 8;
        this.f86846a = 1;
    }

    /* renamed from: d */
    public void mo105875d() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        C35403a aVar = (C35403a) mo106051L(C35403a.class, token);
        if (aVar.f87017a != token || aVar.hasNext()) {
            throw mo105871I(aVar, token);
        }
        this.f86848c[this.f86846a - 1] = null;
        mo106050K();
    }

    /* renamed from: g */
    public boolean mo105877g() throws IOException {
        int i = this.f86846a;
        if (i == 0) {
            return false;
        }
        Object obj = this.f87016v[i - 1];
        if (!(obj instanceof Iterator) || ((Iterator) obj).hasNext()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo105880j() throws IOException {
        mo106050K();
        return ((Boolean) mo106051L(Boolean.class, JsonReader.Token.BOOLEAN)).booleanValue();
    }

    /* renamed from: k */
    public double mo105881k() throws IOException {
        double d;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object L = mo106051L(Object.class, token);
        if (L instanceof Number) {
            d = ((Number) L).doubleValue();
        } else if (L instanceof String) {
            try {
                d = Double.parseDouble((String) L);
            } catch (NumberFormatException unused) {
                throw mo105871I(L, JsonReader.Token.NUMBER);
            }
        } else {
            throw mo105871I(L, token);
        }
        if (this.f86850e || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            mo106050K();
            return d;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + getPath());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw mo105871I(r1, com.squareup.moshi.JsonReader.Token.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r1).intValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo105882l() throws java.io.IOException {
        /*
            r3 = this;
            com.squareup.moshi.JsonReader$Token r0 = com.squareup.moshi.JsonReader.Token.NUMBER
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r1 = r3.mo106051L(r1, r0)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L_0x0013
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            goto L_0x002b
        L_0x0013:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0036
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x001f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            int r0 = r0.intValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.mo106050K()
            return r0
        L_0x002f:
            com.squareup.moshi.JsonReader$Token r0 = com.squareup.moshi.JsonReader.Token.NUMBER
            com.squareup.moshi.JsonDataException r0 = r3.mo105871I(r1, r0)
            throw r0
        L_0x0036:
            com.squareup.moshi.JsonDataException r0 = r3.mo105871I(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C35402n.mo105882l():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw mo105871I(r1, com.squareup.moshi.JsonReader.Token.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r1).longValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo105883m() throws java.io.IOException {
        /*
            r3 = this;
            com.squareup.moshi.JsonReader$Token r0 = com.squareup.moshi.JsonReader.Token.NUMBER
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r1 = r3.mo106051L(r1, r0)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L_0x0013
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            goto L_0x002b
        L_0x0013:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0036
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x001f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            long r0 = r0.longValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.mo106050K()
            return r0
        L_0x002f:
            com.squareup.moshi.JsonReader$Token r0 = com.squareup.moshi.JsonReader.Token.NUMBER
            com.squareup.moshi.JsonDataException r0 = r3.mo105871I(r1, r0)
            throw r0
        L_0x0036:
            com.squareup.moshi.JsonDataException r0 = r3.mo105871I(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C35402n.mo105883m():long");
    }

    /* renamed from: n */
    public String mo105884n() throws IOException {
        Map.Entry entry = (Map.Entry) mo106051L(Map.Entry.class, JsonReader.Token.NAME);
        String M = mo106052M(entry);
        this.f87016v[this.f86846a - 1] = entry.getValue();
        this.f86848c[this.f86846a - 2] = M;
        return M;
    }

    @Nullable
    /* renamed from: o */
    public <T> T mo105885o() throws IOException {
        mo106051L(Void.class, JsonReader.Token.NULL);
        mo106050K();
        return null;
    }

    /* renamed from: p */
    public C12507o mo105886p() throws IOException {
        Object w = mo105892w();
        C12500m mVar = new C12500m();
        C35407q p = C35407q.m145929p(mVar);
        try {
            p.mo106073m(w);
            p.close();
            return mVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: q */
    public String mo105887q() throws IOException {
        String str;
        int i = this.f86846a;
        if (i != 0) {
            str = this.f87016v[i - 1];
        } else {
            str = null;
        }
        if (str instanceof String) {
            mo106050K();
            return str;
        } else if (str instanceof Number) {
            mo106050K();
            return str.toString();
        } else if (str == f87015w) {
            throw new IllegalStateException("JsonReader is closed");
        } else {
            throw mo105871I(str, JsonReader.Token.STRING);
        }
    }

    /* renamed from: s */
    public JsonReader.Token mo105888s() throws IOException {
        int i = this.f86846a;
        if (i == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.f87016v[i - 1];
        if (obj instanceof C35403a) {
            return ((C35403a) obj).f87017a;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj == f87015w) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw mo105871I(obj, "a JSON value");
    }

    /* renamed from: t */
    public JsonReader mo105889t() {
        return new C35402n(this);
    }

    /* renamed from: u */
    public void mo105890u() throws IOException {
        if (mo105877g()) {
            mo106049J(mo105884n());
        }
    }

    /* renamed from: x */
    public int mo105893x(JsonReader.C35351b bVar) throws IOException {
        Map.Entry entry = (Map.Entry) mo106051L(Map.Entry.class, JsonReader.Token.NAME);
        String M = mo106052M(entry);
        int length = bVar.f86865a.length;
        for (int i = 0; i < length; i++) {
            if (bVar.f86865a[i].equals(M)) {
                this.f87016v[this.f86846a - 1] = entry.getValue();
                this.f86848c[this.f86846a - 2] = M;
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo105894y(com.squareup.moshi.JsonReader.C35351b r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f86846a
            if (r0 == 0) goto L_0x000b
            java.lang.Object[] r1 = r5.f87016v
            int r0 = r0 + -1
            r0 = r1[r0]
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            boolean r1 = r0 instanceof java.lang.String
            r2 = -1
            if (r1 != 0) goto L_0x001e
            java.lang.Object r6 = f87015w
            if (r0 == r6) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "JsonReader is closed"
            r6.<init>(r0)
            throw r6
        L_0x001e:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r1 = r6.f86865a
            int r1 = r1.length
            r3 = 0
        L_0x0024:
            if (r3 >= r1) goto L_0x0037
            java.lang.String[] r4 = r6.f86865a
            r4 = r4[r3]
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r5.mo106050K()
            return r3
        L_0x0034:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C35402n.mo105894y(com.squareup.moshi.JsonReader$b):int");
    }

    public C35402n(C35402n nVar) {
        super(nVar);
        this.f87016v = (Object[]) nVar.f87016v.clone();
        for (int i = 0; i < this.f86846a; i++) {
            Object[] objArr = this.f87016v;
            Object obj = objArr[i];
            if (obj instanceof C35403a) {
                objArr[i] = ((C35403a) obj).clone();
            }
        }
    }
}
