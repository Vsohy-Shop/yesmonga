package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: androidx.datastore.preferences.protobuf.b3 */
public final class C18691b3 extends GeneratedMessageLite<C18691b3, C18693b> implements C18702c3 {
    /* access modifiers changed from: private */
    public static final C18691b3 DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile C18841p2<C18691b3> PARSER;
    private String fileName_ = "";

    /* renamed from: androidx.datastore.preferences.protobuf.b3$a */
    public static /* synthetic */ class C18692a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47803a;

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
                f47803a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47803a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47803a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47803a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47803a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47803a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47803a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18691b3.C18692a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b3$b */
    public static final class C18693b extends GeneratedMessageLite.C18634b<C18691b3, C18693b> implements C18702c3 {
        public /* synthetic */ C18693b(C18692a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18693b mo54401E0() {
            mo54025u0();
            ((C18691b3) this.f47641b).mo54396g1();
            return this;
        }

        /* renamed from: F0 */
        public C18693b mo54402F0(String str) {
            mo54025u0();
            ((C18691b3) this.f47641b).mo54399x1(str);
            return this;
        }

        /* renamed from: G0 */
        public C18693b mo54403G0(ByteString byteString) {
            mo54025u0();
            ((C18691b3) this.f47641b).mo54400y1(byteString);
            return this;
        }

        public String getFileName() {
            return ((C18691b3) this.f47641b).getFileName();
        }

        public ByteString getFileNameBytes() {
            return ((C18691b3) this.f47641b).getFileNameBytes();
        }

        public C18693b() {
            super(C18691b3.DEFAULT_INSTANCE);
        }
    }

    static {
        C18691b3 b3Var = new C18691b3();
        DEFAULT_INSTANCE = b3Var;
        GeneratedMessageLite.m84965a1(C18691b3.class, b3Var);
    }

    /* renamed from: h1 */
    public static C18691b3 m85587h1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: i1 */
    public static C18693b m85588i1() {
        return (C18693b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: j1 */
    public static C18693b m85589j1(C18691b3 b3Var) {
        return (C18693b) DEFAULT_INSTANCE.mo53982Y(b3Var);
    }

    /* renamed from: k1 */
    public static C18691b3 m85590k1(InputStream inputStream) throws IOException {
        return (C18691b3) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: l1 */
    public static C18691b3 m85591l1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18691b3) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: m1 */
    public static C18691b3 m85592m1(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18691b3) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: n1 */
    public static C18691b3 m85593n1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18691b3) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: o1 */
    public static C18691b3 m85594o1(C18889w wVar) throws IOException {
        return (C18691b3) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: p1 */
    public static C18691b3 m85595p1(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18691b3) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: q1 */
    public static C18691b3 m85596q1(InputStream inputStream) throws IOException {
        return (C18691b3) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: r1 */
    public static C18691b3 m85597r1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18691b3) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: s1 */
    public static C18691b3 m85598s1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18691b3) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: t1 */
    public static C18691b3 m85599t1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18691b3) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: u1 */
    public static C18691b3 m85600u1(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18691b3) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: v1 */
    public static C18691b3 m85601v1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18691b3) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: w1 */
    public static C18841p2<C18691b3> m85602w1() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18692a.f47803a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18691b3();
            case 2:
                return new C18693b((C18692a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18691b3> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18691b3.class) {
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
    public final void mo54396g1() {
        this.fileName_ = m85587h1().getFileName();
    }

    public String getFileName() {
        return this.fileName_;
    }

    public ByteString getFileNameBytes() {
        return ByteString.m84390e0(this.fileName_);
    }

    /* renamed from: x1 */
    public final void mo54399x1(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* renamed from: y1 */
    public final void mo54400y1(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.fileName_ = byteString.mo53741S0();
    }
}
