package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import okio.ByteString;
import okio.C12471f0;
import okio.C12500m;
import okio.C12507o;

public abstract class JsonReader implements Closeable {

    /* renamed from: a */
    public int f86846a;

    /* renamed from: b */
    public int[] f86847b;

    /* renamed from: c */
    public String[] f86848c;

    /* renamed from: d */
    public int[] f86849d;

    /* renamed from: e */
    public boolean f86850e;

    /* renamed from: f */
    public boolean f86851f;

    /* renamed from: g */
    public Map<Class<?>, Object> f86852g;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* renamed from: com.squareup.moshi.JsonReader$a */
    public static /* synthetic */ class C35350a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86864a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.moshi.JsonReader$Token[] r0 = com.squareup.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f86864a = r0
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f86864a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f86864a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f86864a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f86864a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f86864a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.JsonReader.C35350a.<clinit>():void");
        }
    }

    /* renamed from: com.squareup.moshi.JsonReader$b */
    public static final class C35351b {

        /* renamed from: a */
        public final String[] f86865a;

        /* renamed from: b */
        public final C12471f0 f86866b;

        public C35351b(String[] strArr, C12471f0 f0Var) {
            this.f86865a = strArr;
            this.f86866b = f0Var;
        }

        @CheckReturnValue
        /* renamed from: a */
        public static C35351b m145735a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C12500m mVar = new C12500m();
                for (int i = 0; i < strArr.length; i++) {
                    C35400m.m145865P(mVar, strArr[i]);
                    mVar.readByte();
                    byteStringArr[i] = mVar.mo27301n3();
                }
                return new C35351b((String[]) strArr.clone(), C12471f0.m50529H(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: b */
        public List<String> mo105896b() {
            return Collections.unmodifiableList(Arrays.asList(this.f86865a));
        }
    }

    public JsonReader() {
        this.f86847b = new int[32];
        this.f86848c = new String[32];
        this.f86849d = new int[32];
    }

    @CheckReturnValue
    /* renamed from: r */
    public static JsonReader m145704r(C12507o oVar) {
        return new C35399l(oVar);
    }

    /* renamed from: B */
    public final void mo105865B(boolean z) {
        this.f86850e = z;
    }

    /* renamed from: C */
    public final <T> void mo105866C(Class<T> cls, T t) {
        if (cls.isAssignableFrom(t.getClass())) {
            if (this.f86852g == null) {
                this.f86852g = new LinkedHashMap();
            }
            this.f86852g.put(cls, t);
            return;
        }
        throw new IllegalArgumentException("Tag value must be of type " + cls.getName());
    }

    /* renamed from: D */
    public abstract void mo105867D() throws IOException;

    /* renamed from: E */
    public abstract void mo105868E() throws IOException;

    /* renamed from: F */
    public final JsonEncodingException mo105869F(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    @CheckReturnValue
    @Nullable
    /* renamed from: G */
    public final <T> T mo105870G(Class<T> cls) {
        Map<Class<?>, Object> map = this.f86852g;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    /* renamed from: I */
    public final JsonDataException mo105871I(@Nullable Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    /* renamed from: a */
    public abstract void mo105872a() throws IOException;

    /* renamed from: b */
    public abstract void mo105873b() throws IOException;

    /* renamed from: c */
    public abstract void mo105874c() throws IOException;

    /* renamed from: d */
    public abstract void mo105875d() throws IOException;

    @CheckReturnValue
    /* renamed from: f */
    public final boolean mo105876f() {
        return this.f86851f;
    }

    @CheckReturnValue
    /* renamed from: g */
    public abstract boolean mo105877g() throws IOException;

    @CheckReturnValue
    public final String getPath() {
        return C35398k.m145828a(this.f86846a, this.f86847b, this.f86848c, this.f86849d);
    }

    @CheckReturnValue
    /* renamed from: i */
    public final boolean mo105879i() {
        return this.f86850e;
    }

    /* renamed from: j */
    public abstract boolean mo105880j() throws IOException;

    /* renamed from: k */
    public abstract double mo105881k() throws IOException;

    /* renamed from: l */
    public abstract int mo105882l() throws IOException;

    /* renamed from: m */
    public abstract long mo105883m() throws IOException;

    @CheckReturnValue
    /* renamed from: n */
    public abstract String mo105884n() throws IOException;

    @Nullable
    /* renamed from: o */
    public abstract <T> T mo105885o() throws IOException;

    /* renamed from: p */
    public abstract C12507o mo105886p() throws IOException;

    /* renamed from: q */
    public abstract String mo105887q() throws IOException;

    @CheckReturnValue
    /* renamed from: s */
    public abstract Token mo105888s() throws IOException;

    @CheckReturnValue
    /* renamed from: t */
    public abstract JsonReader mo105889t();

    /* renamed from: u */
    public abstract void mo105890u() throws IOException;

    /* renamed from: v */
    public final void mo105891v(int i) {
        int i2 = this.f86846a;
        int[] iArr = this.f86847b;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f86847b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f86848c;
                this.f86848c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f86849d;
                this.f86849d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f86847b;
        int i3 = this.f86846a;
        this.f86846a = i3 + 1;
        iArr3[i3] = i;
    }

    @Nullable
    /* renamed from: w */
    public final Object mo105892w() throws IOException {
        switch (C35350a.f86864a[mo105888s().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                mo105872a();
                while (mo105877g()) {
                    arrayList.add(mo105892w());
                }
                mo105874c();
                return arrayList;
            case 2:
                LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
                mo105873b();
                while (mo105877g()) {
                    String n = mo105884n();
                    Object w = mo105892w();
                    Object put = linkedHashTreeMap.put(n, w);
                    if (put != null) {
                        throw new JsonDataException("Map key '" + n + "' has multiple values at path " + getPath() + ": " + put + " and " + w);
                    }
                }
                mo105875d();
                return linkedHashTreeMap;
            case 3:
                return mo105887q();
            case 4:
                return Double.valueOf(mo105881k());
            case 5:
                return Boolean.valueOf(mo105880j());
            case 6:
                return mo105885o();
            default:
                throw new IllegalStateException("Expected a value but was " + mo105888s() + " at path " + getPath());
        }
    }

    @CheckReturnValue
    /* renamed from: x */
    public abstract int mo105893x(C35351b bVar) throws IOException;

    @CheckReturnValue
    /* renamed from: y */
    public abstract int mo105894y(C35351b bVar) throws IOException;

    /* renamed from: z */
    public final void mo105895z(boolean z) {
        this.f86851f = z;
    }

    public JsonReader(JsonReader jsonReader) {
        this.f86846a = jsonReader.f86846a;
        this.f86847b = (int[]) jsonReader.f86847b.clone();
        this.f86848c = (String[]) jsonReader.f86848c.clone();
        this.f86849d = (int[]) jsonReader.f86849d.clone();
        this.f86850e = jsonReader.f86850e;
        this.f86851f = jsonReader.f86851f;
    }
}
