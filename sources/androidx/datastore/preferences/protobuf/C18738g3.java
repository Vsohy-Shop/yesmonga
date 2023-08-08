package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.g3 */
public final class C18738g3 extends GeneratedMessageLite<C18738g3, C18740b> implements C18746h3 {
    /* access modifiers changed from: private */
    public static final C18738g3 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile C18841p2<C18738g3> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.m85107i();

    /* renamed from: androidx.datastore.preferences.protobuf.g3$a */
    public static /* synthetic */ class C18739a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47853a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47853a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47853a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47853a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47853a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47853a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47853a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47853a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18738g3.C18739a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g3$b */
    public static final class C18740b extends GeneratedMessageLite.C18634b<C18738g3, C18740b> implements C18746h3 {
        public /* synthetic */ C18740b(C18739a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18740b mo54623E0() {
            mo54025u0();
            ((C18738g3) this.f47641b).mo54615f1().clear();
            return this;
        }

        /* renamed from: F0 */
        public C18740b mo54624F0(Map<String, Value> map) {
            mo54025u0();
            ((C18738g3) this.f47641b).mo54615f1().putAll(map);
            return this;
        }

        /* renamed from: G0 */
        public C18740b mo54625G0(String str, Value value) {
            str.getClass();
            value.getClass();
            mo54025u0();
            ((C18738g3) this.f47641b).mo54615f1().put(str, value);
            return this;
        }

        /* renamed from: H0 */
        public C18740b mo54626H0(String str) {
            str.getClass();
            mo54025u0();
            ((C18738g3) this.f47641b).mo54615f1().remove(str);
            return this;
        }

        public boolean containsFields(String str) {
            str.getClass();
            return ((C18738g3) this.f47641b).getFieldsMap().containsKey(str);
        }

        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        public int getFieldsCount() {
            return ((C18738g3) this.f47641b).getFieldsMap().size();
        }

        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((C18738g3) this.f47641b).getFieldsMap());
        }

        public Value getFieldsOrThrow(String str) {
            str.getClass();
            Map<String, Value> fieldsMap = ((C18738g3) this.f47641b).getFieldsMap();
            if (fieldsMap.containsKey(str)) {
                return fieldsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: j */
        public Value mo54622j(String str, Value value) {
            str.getClass();
            Map<String, Value> fieldsMap = ((C18738g3) this.f47641b).getFieldsMap();
            if (fieldsMap.containsKey(str)) {
                return fieldsMap.get(str);
            }
            return value;
        }

        public C18740b() {
            super(C18738g3.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g3$c */
    public static final class C18741c {

        /* renamed from: a */
        public static final C18868t1<String, Value> f47854a = C18868t1.m87468f(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.m85267D1());
    }

    static {
        C18738g3 g3Var = new C18738g3();
        DEFAULT_INSTANCE = g3Var;
        GeneratedMessageLite.m84965a1(C18738g3.class, g3Var);
    }

    /* renamed from: e1 */
    public static C18738g3 m86040e1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: i1 */
    public static C18740b m86041i1() {
        return (C18740b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: j1 */
    public static C18740b m86042j1(C18738g3 g3Var) {
        return (C18740b) DEFAULT_INSTANCE.mo53982Y(g3Var);
    }

    /* renamed from: k1 */
    public static C18738g3 m86043k1(InputStream inputStream) throws IOException {
        return (C18738g3) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: l1 */
    public static C18738g3 m86044l1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18738g3) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: m1 */
    public static C18738g3 m86045m1(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18738g3) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: n1 */
    public static C18738g3 m86046n1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18738g3) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: o1 */
    public static C18738g3 m86047o1(C18889w wVar) throws IOException {
        return (C18738g3) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: p1 */
    public static C18738g3 m86048p1(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18738g3) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: q1 */
    public static C18738g3 m86049q1(InputStream inputStream) throws IOException {
        return (C18738g3) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: r1 */
    public static C18738g3 m86050r1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18738g3) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: s1 */
    public static C18738g3 m86051s1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18738g3) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: t1 */
    public static C18738g3 m86052t1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18738g3) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: u1 */
    public static C18738g3 m86053u1(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18738g3) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: v1 */
    public static C18738g3 m86054v1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18738g3) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: w1 */
    public static C18841p2<C18738g3> m86055w1() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18739a.f47853a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18738g3();
            case 2:
                return new C18740b((C18739a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", C18741c.f47854a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18738g3> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18738g3.class) {
                        p2Var = PARSER;
                        if (p2Var == null) {
                            p2Var = new GeneratedMessageLite.C18635c<>(DEFAULT_INSTANCE);
                            PARSER = p2Var;
                        }
                    }
                }
                return p2Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public boolean containsFields(String str) {
        str.getClass();
        return mo54616g1().containsKey(str);
    }

    /* renamed from: f1 */
    public final Map<String, Value> mo54615f1() {
        return mo54621h1();
    }

    /* renamed from: g1 */
    public final MapFieldLite<String, Value> mo54616g1() {
        return this.fields_;
    }

    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return mo54616g1().size();
    }

    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(mo54616g1());
    }

    public Value getFieldsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Value> g1 = mo54616g1();
        if (g1.containsKey(str)) {
            return g1.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h1 */
    public final MapFieldLite<String, Value> mo54621h1() {
        if (!this.fields_.mo54094n()) {
            this.fields_ = this.fields_.mo54100t();
        }
        return this.fields_;
    }

    /* renamed from: j */
    public Value mo54622j(String str, Value value) {
        str.getClass();
        MapFieldLite<String, Value> g1 = mo54616g1();
        if (g1.containsKey(str)) {
            return g1.get(str);
        }
        return value;
    }
}
