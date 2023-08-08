package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: androidx.datastore.preferences.protobuf.f */
public final class C18721f extends GeneratedMessageLite<C18721f, C18723b> implements C18732g {
    /* access modifiers changed from: private */
    public static final C18721f DEFAULT_INSTANCE;
    private static volatile C18841p2<C18721f> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.f47470d;

    /* renamed from: androidx.datastore.preferences.protobuf.f$a */
    public static /* synthetic */ class C18722a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47849a;

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
                f47849a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47849a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47849a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47849a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47849a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47849a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47849a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18721f.C18722a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$b */
    public static final class C18723b extends GeneratedMessageLite.C18634b<C18721f, C18723b> implements C18732g {
        public /* synthetic */ C18723b(C18722a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18723b mo54588E0() {
            mo54025u0();
            ((C18721f) this.f47641b).mo54586i1();
            return this;
        }

        /* renamed from: F0 */
        public C18723b mo54589F0() {
            mo54025u0();
            ((C18721f) this.f47641b).mo54587j1();
            return this;
        }

        /* renamed from: G0 */
        public C18723b mo54590G0(String str) {
            mo54025u0();
            ((C18721f) this.f47641b).mo54580A1(str);
            return this;
        }

        /* renamed from: H0 */
        public C18723b mo54591H0(ByteString byteString) {
            mo54025u0();
            ((C18721f) this.f47641b).mo54581B1(byteString);
            return this;
        }

        /* renamed from: I0 */
        public C18723b mo54592I0(ByteString byteString) {
            mo54025u0();
            ((C18721f) this.f47641b).mo54582C1(byteString);
            return this;
        }

        public String getTypeUrl() {
            return ((C18721f) this.f47641b).getTypeUrl();
        }

        public ByteString getTypeUrlBytes() {
            return ((C18721f) this.f47641b).getTypeUrlBytes();
        }

        public ByteString getValue() {
            return ((C18721f) this.f47641b).getValue();
        }

        public C18723b() {
            super(C18721f.DEFAULT_INSTANCE);
        }
    }

    static {
        C18721f fVar = new C18721f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.m84965a1(C18721f.class, fVar);
    }

    /* renamed from: k1 */
    public static C18721f m85932k1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: l1 */
    public static C18723b m85933l1() {
        return (C18723b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: m1 */
    public static C18723b m85934m1(C18721f fVar) {
        return (C18723b) DEFAULT_INSTANCE.mo53982Y(fVar);
    }

    /* renamed from: n1 */
    public static C18721f m85935n1(InputStream inputStream) throws IOException {
        return (C18721f) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: o1 */
    public static C18721f m85936o1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18721f) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: p1 */
    public static C18721f m85937p1(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18721f) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: q1 */
    public static C18721f m85938q1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18721f) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: r1 */
    public static C18721f m85939r1(C18889w wVar) throws IOException {
        return (C18721f) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: s1 */
    public static C18721f m85940s1(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18721f) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: t1 */
    public static C18721f m85941t1(InputStream inputStream) throws IOException {
        return (C18721f) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: u1 */
    public static C18721f m85942u1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18721f) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: v1 */
    public static C18721f m85943v1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18721f) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: w1 */
    public static C18721f m85944w1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18721f) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: x1 */
    public static C18721f m85945x1(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18721f) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: y1 */
    public static C18721f m85946y1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18721f) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: z1 */
    public static C18841p2<C18721f> m85947z1() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: A1 */
    public final void mo54580A1(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: B1 */
    public final void mo54581B1(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.typeUrl_ = byteString.mo53741S0();
    }

    /* renamed from: C1 */
    public final void mo54582C1(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18722a.f47849a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18721f();
            case 2:
                return new C18723b((C18722a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18721f> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18721f.class) {
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

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public ByteString getTypeUrlBytes() {
        return ByteString.m84390e0(this.typeUrl_);
    }

    public ByteString getValue() {
        return this.value_;
    }

    /* renamed from: i1 */
    public final void mo54586i1() {
        this.typeUrl_ = m85932k1().getTypeUrl();
    }

    /* renamed from: j1 */
    public final void mo54587j1() {
        this.value_ = m85932k1().getValue();
    }
}
