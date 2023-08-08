package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: androidx.datastore.preferences.protobuf.l3 */
public final class C18799l3 extends GeneratedMessageLite<C18799l3, C18801b> implements C18810m3 {
    /* access modifiers changed from: private */
    public static final C18799l3 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile C18841p2<C18799l3> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: androidx.datastore.preferences.protobuf.l3$a */
    public static /* synthetic */ class C18800a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47917a;

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
                f47917a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47917a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47917a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47917a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47917a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47917a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47917a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18799l3.C18800a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.l3$b */
    public static final class C18801b extends GeneratedMessageLite.C18634b<C18799l3, C18801b> implements C18810m3 {
        public /* synthetic */ C18801b(C18800a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18801b mo54941E0() {
            mo54025u0();
            ((C18799l3) this.f47641b).mo54938h1();
            return this;
        }

        /* renamed from: F0 */
        public C18801b mo54942F0() {
            mo54025u0();
            ((C18799l3) this.f47641b).mo54939i1();
            return this;
        }

        /* renamed from: G0 */
        public C18801b mo54943G0(int i) {
            mo54025u0();
            ((C18799l3) this.f47641b).mo54940z1(i);
            return this;
        }

        /* renamed from: H0 */
        public C18801b mo54944H0(long j) {
            mo54025u0();
            ((C18799l3) this.f47641b).mo54935A1(j);
            return this;
        }

        public int getNanos() {
            return ((C18799l3) this.f47641b).getNanos();
        }

        public long getSeconds() {
            return ((C18799l3) this.f47641b).getSeconds();
        }

        public C18801b() {
            super(C18799l3.DEFAULT_INSTANCE);
        }
    }

    static {
        C18799l3 l3Var = new C18799l3();
        DEFAULT_INSTANCE = l3Var;
        GeneratedMessageLite.m84965a1(C18799l3.class, l3Var);
    }

    /* renamed from: j1 */
    public static C18799l3 m86551j1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: k1 */
    public static C18801b m86552k1() {
        return (C18801b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: l1 */
    public static C18801b m86553l1(C18799l3 l3Var) {
        return (C18801b) DEFAULT_INSTANCE.mo53982Y(l3Var);
    }

    /* renamed from: m1 */
    public static C18799l3 m86554m1(InputStream inputStream) throws IOException {
        return (C18799l3) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: n1 */
    public static C18799l3 m86555n1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18799l3) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: o1 */
    public static C18799l3 m86556o1(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18799l3) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: p1 */
    public static C18799l3 m86557p1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18799l3) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: q1 */
    public static C18799l3 m86558q1(C18889w wVar) throws IOException {
        return (C18799l3) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: r1 */
    public static C18799l3 m86559r1(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18799l3) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: s1 */
    public static C18799l3 m86560s1(InputStream inputStream) throws IOException {
        return (C18799l3) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: t1 */
    public static C18799l3 m86561t1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18799l3) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: u1 */
    public static C18799l3 m86562u1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18799l3) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: v1 */
    public static C18799l3 m86563v1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18799l3) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: w1 */
    public static C18799l3 m86564w1(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18799l3) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: x1 */
    public static C18799l3 m86565x1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18799l3) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: y1 */
    public static C18841p2<C18799l3> m86566y1() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: A1 */
    public final void mo54935A1(long j) {
        this.seconds_ = j;
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18800a.f47917a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18799l3();
            case 2:
                return new C18801b((C18800a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18799l3> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18799l3.class) {
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

    public int getNanos() {
        return this.nanos_;
    }

    public long getSeconds() {
        return this.seconds_;
    }

    /* renamed from: h1 */
    public final void mo54938h1() {
        this.nanos_ = 0;
    }

    /* renamed from: i1 */
    public final void mo54939i1() {
        this.seconds_ = 0;
    }

    /* renamed from: z1 */
    public final void mo54940z1(int i) {
        this.nanos_ = i;
    }
}
