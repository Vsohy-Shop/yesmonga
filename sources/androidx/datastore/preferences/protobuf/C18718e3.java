package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: androidx.datastore.preferences.protobuf.e3 */
public final class C18718e3 extends GeneratedMessageLite<C18718e3, C18720b> implements C18731f3 {
    /* access modifiers changed from: private */
    public static final C18718e3 DEFAULT_INSTANCE;
    private static volatile C18841p2<C18718e3> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* renamed from: androidx.datastore.preferences.protobuf.e3$a */
    public static /* synthetic */ class C18719a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47848a;

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
                f47848a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47848a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47848a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47848a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47848a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47848a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47848a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18718e3.C18719a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.e3$b */
    public static final class C18720b extends GeneratedMessageLite.C18634b<C18718e3, C18720b> implements C18731f3 {
        public /* synthetic */ C18720b(C18719a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18720b mo54577E0() {
            mo54025u0();
            ((C18718e3) this.f47641b).mo54572g1();
            return this;
        }

        /* renamed from: F0 */
        public C18720b mo54578F0(String str) {
            mo54025u0();
            ((C18718e3) this.f47641b).mo54575y1(str);
            return this;
        }

        /* renamed from: G0 */
        public C18720b mo54579G0(ByteString byteString) {
            mo54025u0();
            ((C18718e3) this.f47641b).mo54576z1(byteString);
            return this;
        }

        public String getValue() {
            return ((C18718e3) this.f47641b).getValue();
        }

        public ByteString getValueBytes() {
            return ((C18718e3) this.f47641b).getValueBytes();
        }

        public C18720b() {
            super(C18718e3.DEFAULT_INSTANCE);
        }
    }

    static {
        C18718e3 e3Var = new C18718e3();
        DEFAULT_INSTANCE = e3Var;
        GeneratedMessageLite.m84965a1(C18718e3.class, e3Var);
    }

    /* renamed from: h1 */
    public static C18718e3 m85902h1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: i1 */
    public static C18720b m85903i1() {
        return (C18720b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: j1 */
    public static C18720b m85904j1(C18718e3 e3Var) {
        return (C18720b) DEFAULT_INSTANCE.mo53982Y(e3Var);
    }

    /* renamed from: k1 */
    public static C18718e3 m85905k1(String str) {
        return (C18718e3) m85903i1().mo54578F0(str).mo54018g();
    }

    /* renamed from: l1 */
    public static C18718e3 m85906l1(InputStream inputStream) throws IOException {
        return (C18718e3) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: m1 */
    public static C18718e3 m85907m1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18718e3) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: n1 */
    public static C18718e3 m85908n1(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18718e3) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: o1 */
    public static C18718e3 m85909o1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18718e3) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: p1 */
    public static C18718e3 m85910p1(C18889w wVar) throws IOException {
        return (C18718e3) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: q1 */
    public static C18718e3 m85911q1(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18718e3) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: r1 */
    public static C18718e3 m85912r1(InputStream inputStream) throws IOException {
        return (C18718e3) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: s1 */
    public static C18718e3 m85913s1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18718e3) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: t1 */
    public static C18718e3 m85914t1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18718e3) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: u1 */
    public static C18718e3 m85915u1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18718e3) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: v1 */
    public static C18718e3 m85916v1(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18718e3) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: w1 */
    public static C18718e3 m85917w1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18718e3) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: x1 */
    public static C18841p2<C18718e3> m85918x1() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18719a.f47848a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18718e3();
            case 2:
                return new C18720b((C18719a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18718e3> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18718e3.class) {
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

    /* renamed from: g1 */
    public final void mo54572g1() {
        this.value_ = m85902h1().getValue();
    }

    public String getValue() {
        return this.value_;
    }

    public ByteString getValueBytes() {
        return ByteString.m84390e0(this.value_);
    }

    /* renamed from: y1 */
    public final void mo54575y1(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* renamed from: z1 */
    public final void mo54576z1(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.value_ = byteString.mo53741S0();
    }
}
