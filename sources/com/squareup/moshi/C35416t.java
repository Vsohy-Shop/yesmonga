package com.squareup.moshi;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35393c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.squareup.moshi.t */
public final class C35416t {

    /* renamed from: a */
    public static final C35384h.C35389e f87070a = new C35419c();

    /* renamed from: b */
    public static final String f87071b = "Expected %s but was %s at path %s";

    /* renamed from: c */
    public static final C35384h<Boolean> f87072c = new C35420d();

    /* renamed from: d */
    public static final C35384h<Byte> f87073d = new C35421e();

    /* renamed from: e */
    public static final C35384h<Character> f87074e = new C35422f();

    /* renamed from: f */
    public static final C35384h<Double> f87075f = new C35423g();

    /* renamed from: g */
    public static final C35384h<Float> f87076g = new C35424h();

    /* renamed from: h */
    public static final C35384h<Integer> f87077h = new C35425i();

    /* renamed from: i */
    public static final C35384h<Long> f87078i = new C35426j();

    /* renamed from: j */
    public static final C35384h<Short> f87079j = new C35427k();

    /* renamed from: k */
    public static final C35384h<String> f87080k = new C35417a();

    /* renamed from: com.squareup.moshi.t$a */
    public class C35417a extends C35384h<String> {
        /* renamed from: a */
        public String fromJson(JsonReader jsonReader) throws IOException {
            return jsonReader.mo105887q();
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, String str) throws IOException {
            qVar.mo106030E(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* renamed from: com.squareup.moshi.t$b */
    public static /* synthetic */ class C35418b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87081a;

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
                f87081a = r0
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f87081a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f87081a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f87081a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f87081a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f87081a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C35416t.C35418b.<clinit>():void");
        }
    }

    /* renamed from: com.squareup.moshi.t$c */
    public class C35419c implements C35384h.C35389e {
        /* renamed from: a */
        public C35384h<?> mo105947a(Type type, Set<? extends Annotation> set, C35410s sVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C35416t.f87072c;
            }
            if (type == Byte.TYPE) {
                return C35416t.f87073d;
            }
            if (type == Character.TYPE) {
                return C35416t.f87074e;
            }
            if (type == Double.TYPE) {
                return C35416t.f87075f;
            }
            if (type == Float.TYPE) {
                return C35416t.f87076g;
            }
            if (type == Integer.TYPE) {
                return C35416t.f87077h;
            }
            if (type == Long.TYPE) {
                return C35416t.f87078i;
            }
            if (type == Short.TYPE) {
                return C35416t.f87079j;
            }
            if (type == Boolean.class) {
                return C35416t.f87072c.nullSafe();
            }
            if (type == Byte.class) {
                return C35416t.f87073d.nullSafe();
            }
            if (type == Character.class) {
                return C35416t.f87074e.nullSafe();
            }
            if (type == Double.class) {
                return C35416t.f87075f.nullSafe();
            }
            if (type == Float.class) {
                return C35416t.f87076g.nullSafe();
            }
            if (type == Integer.class) {
                return C35416t.f87077h.nullSafe();
            }
            if (type == Long.class) {
                return C35416t.f87078i.nullSafe();
            }
            if (type == Short.class) {
                return C35416t.f87079j.nullSafe();
            }
            if (type == String.class) {
                return C35416t.f87080k.nullSafe();
            }
            if (type == Object.class) {
                return new C35429m(sVar).nullSafe();
            }
            Class<?> j = C35431v.m146023j(type);
            C35384h<?> f = C35393c.m145807f(sVar, type, j);
            if (f != null) {
                return f;
            }
            if (j.isEnum()) {
                return new C35428l(j).nullSafe();
            }
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.t$d */
    public class C35420d extends C35384h<Boolean> {
        /* renamed from: a */
        public Boolean fromJson(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.mo105880j());
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, Boolean bool) throws IOException {
            qVar.mo106031G(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* renamed from: com.squareup.moshi.t$e */
    public class C35421e extends C35384h<Byte> {
        /* renamed from: a */
        public Byte fromJson(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) C35416t.m145991a(jsonReader, "a byte", -128, 255));
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, Byte b) throws IOException {
            qVar.mo106027B((long) (b.intValue() & 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* renamed from: com.squareup.moshi.t$f */
    public class C35422f extends C35384h<Character> {
        /* renamed from: a */
        public Character fromJson(JsonReader jsonReader) throws IOException {
            String q = jsonReader.mo105887q();
            if (q.length() <= 1) {
                return Character.valueOf(q.charAt(0));
            }
            throw new JsonDataException(String.format(C35416t.f87071b, new Object[]{"a char", '\"' + q + '\"', jsonReader.getPath()}));
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, Character ch) throws IOException {
            qVar.mo106030E(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* renamed from: com.squareup.moshi.t$g */
    public class C35423g extends C35384h<Double> {
        /* renamed from: a */
        public Double fromJson(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.mo105881k());
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, Double d) throws IOException {
            qVar.mo106048z(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* renamed from: com.squareup.moshi.t$h */
    public class C35424h extends C35384h<Float> {
        /* renamed from: a */
        public Float fromJson(JsonReader jsonReader) throws IOException {
            float k = (float) jsonReader.mo105881k();
            if (jsonReader.mo105879i() || !Float.isInfinite(k)) {
                return Float.valueOf(k);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + k + " at path " + jsonReader.getPath());
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, Float f) throws IOException {
            f.getClass();
            qVar.mo106029D(f);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* renamed from: com.squareup.moshi.t$i */
    public class C35425i extends C35384h<Integer> {
        /* renamed from: a */
        public Integer fromJson(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.mo105882l());
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, Integer num) throws IOException {
            qVar.mo106027B((long) num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* renamed from: com.squareup.moshi.t$j */
    public class C35426j extends C35384h<Long> {
        /* renamed from: a */
        public Long fromJson(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.mo105883m());
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, Long l) throws IOException {
            qVar.mo106027B(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* renamed from: com.squareup.moshi.t$k */
    public class C35427k extends C35384h<Short> {
        /* renamed from: a */
        public Short fromJson(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) C35416t.m145991a(jsonReader, "a short", -32768, 32767));
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, Short sh) throws IOException {
            qVar.mo106027B((long) sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* renamed from: com.squareup.moshi.t$l */
    public static final class C35428l<T extends Enum<T>> extends C35384h<T> {

        /* renamed from: a */
        public final Class<T> f87082a;

        /* renamed from: b */
        public final String[] f87083b;

        /* renamed from: c */
        public final T[] f87084c;

        /* renamed from: d */
        public final JsonReader.C35351b f87085d;

        public C35428l(Class<T> cls) {
            String str;
            this.f87082a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.f87084c = tArr;
                this.f87083b = new String[tArr.length];
                int i = 0;
                while (true) {
                    T[] tArr2 = this.f87084c;
                    if (i < tArr2.length) {
                        T t = tArr2[i];
                        C35383g gVar = (C35383g) cls.getField(t.name()).getAnnotation(C35383g.class);
                        if (gVar != null) {
                            str = gVar.name();
                        } else {
                            str = t.name();
                        }
                        this.f87083b[i] = str;
                        i++;
                    } else {
                        this.f87085d = JsonReader.C35351b.m145735a(this.f87083b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in " + cls.getName(), e);
            }
        }

        /* renamed from: a */
        public T fromJson(JsonReader jsonReader) throws IOException {
            int y = jsonReader.mo105894y(this.f87085d);
            if (y != -1) {
                return this.f87084c[y];
            }
            String path = jsonReader.getPath();
            String q = jsonReader.mo105887q();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f87083b) + " but was " + q + " at path " + path);
        }

        /* renamed from: b */
        public void toJson(C35407q qVar, T t) throws IOException {
            qVar.mo106030E(this.f87083b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f87082a.getName() + ")";
        }
    }

    /* renamed from: com.squareup.moshi.t$m */
    public static final class C35429m extends C35384h<Object> {

        /* renamed from: a */
        public final C35410s f87086a;

        /* renamed from: b */
        public final C35384h<List> f87087b;

        /* renamed from: c */
        public final C35384h<Map> f87088c;

        /* renamed from: d */
        public final C35384h<String> f87089d;

        /* renamed from: e */
        public final C35384h<Double> f87090e;

        /* renamed from: f */
        public final C35384h<Boolean> f87091f;

        public C35429m(C35410s sVar) {
            this.f87086a = sVar;
            this.f87087b = sVar.mo106085c(List.class);
            this.f87088c = sVar.mo106085c(Map.class);
            this.f87089d = sVar.mo106085c(String.class);
            this.f87090e = sVar.mo106085c(Double.class);
            this.f87091f = sVar.mo106085c(Boolean.class);
        }

        /* renamed from: a */
        public final Class<?> mo106138a(Class<?> cls) {
            Class<Map> cls2 = Map.class;
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
            Class<Collection> cls3 = Collection.class;
            if (cls3.isAssignableFrom(cls)) {
                return cls3;
            }
            return cls;
        }

        public Object fromJson(JsonReader jsonReader) throws IOException {
            switch (C35418b.f87081a[jsonReader.mo105888s().ordinal()]) {
                case 1:
                    return this.f87087b.fromJson(jsonReader);
                case 2:
                    return this.f87088c.fromJson(jsonReader);
                case 3:
                    return this.f87089d.fromJson(jsonReader);
                case 4:
                    return this.f87090e.fromJson(jsonReader);
                case 5:
                    return this.f87091f.fromJson(jsonReader);
                case 6:
                    return jsonReader.mo105885o();
                default:
                    throw new IllegalStateException("Expected a value but was " + jsonReader.mo105888s() + " at path " + jsonReader.getPath());
            }
        }

        public void toJson(C35407q qVar, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                qVar.mo106040c();
                qVar.mo106044i();
                return;
            }
            this.f87086a.mo106088f(mo106138a(cls), C35393c.f86950a).toJson(qVar, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    public static int m145991a(JsonReader jsonReader, String str, int i, int i2) throws IOException {
        int l = jsonReader.mo105882l();
        if (l >= i && l <= i2) {
            return l;
        }
        throw new JsonDataException(String.format(f87071b, new Object[]{str, Integer.valueOf(l), jsonReader.getPath()}));
    }
}
