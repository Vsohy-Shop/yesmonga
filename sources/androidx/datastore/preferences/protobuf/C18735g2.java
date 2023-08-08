package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: androidx.datastore.preferences.protobuf.g2 */
public final class C18735g2 extends GeneratedMessageLite<C18735g2, C18737b> implements C18745h2 {
    /* access modifiers changed from: private */
    public static final C18735g2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C18841p2<C18735g2> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* renamed from: androidx.datastore.preferences.protobuf.g2$a */
    public static /* synthetic */ class C18736a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47852a;

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
                f47852a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47852a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47852a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47852a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47852a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47852a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47852a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18735g2.C18736a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g2$b */
    public static final class C18737b extends GeneratedMessageLite.C18634b<C18735g2, C18737b> implements C18745h2 {
        public /* synthetic */ C18737b(C18736a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18737b mo54608E0() {
            mo54025u0();
            ((C18735g2) this.f47641b).mo54606j1();
            return this;
        }

        /* renamed from: F0 */
        public C18737b mo54609F0() {
            mo54025u0();
            ((C18735g2) this.f47641b).mo54607k1();
            return this;
        }

        /* renamed from: G0 */
        public C18737b mo54610G0(String str) {
            mo54025u0();
            ((C18735g2) this.f47641b).mo54598B1(str);
            return this;
        }

        /* renamed from: H0 */
        public C18737b mo54611H0(ByteString byteString) {
            mo54025u0();
            ((C18735g2) this.f47641b).mo54599C1(byteString);
            return this;
        }

        /* renamed from: I0 */
        public C18737b mo54612I0(String str) {
            mo54025u0();
            ((C18735g2) this.f47641b).mo54600D1(str);
            return this;
        }

        /* renamed from: J0 */
        public C18737b mo54613J0(ByteString byteString) {
            mo54025u0();
            ((C18735g2) this.f47641b).mo54601E1(byteString);
            return this;
        }

        public String getName() {
            return ((C18735g2) this.f47641b).getName();
        }

        public ByteString getNameBytes() {
            return ((C18735g2) this.f47641b).getNameBytes();
        }

        public String getRoot() {
            return ((C18735g2) this.f47641b).getRoot();
        }

        public ByteString getRootBytes() {
            return ((C18735g2) this.f47641b).getRootBytes();
        }

        public C18737b() {
            super(C18735g2.DEFAULT_INSTANCE);
        }
    }

    static {
        C18735g2 g2Var = new C18735g2();
        DEFAULT_INSTANCE = g2Var;
        GeneratedMessageLite.m84965a1(C18735g2.class, g2Var);
    }

    /* renamed from: A1 */
    public static C18841p2<C18735g2> m86002A1() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: l1 */
    public static C18735g2 m86010l1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: m1 */
    public static C18737b m86011m1() {
        return (C18737b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: n1 */
    public static C18737b m86012n1(C18735g2 g2Var) {
        return (C18737b) DEFAULT_INSTANCE.mo53982Y(g2Var);
    }

    /* renamed from: o1 */
    public static C18735g2 m86013o1(InputStream inputStream) throws IOException {
        return (C18735g2) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: p1 */
    public static C18735g2 m86014p1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18735g2) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: q1 */
    public static C18735g2 m86015q1(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18735g2) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: r1 */
    public static C18735g2 m86016r1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18735g2) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: s1 */
    public static C18735g2 m86017s1(C18889w wVar) throws IOException {
        return (C18735g2) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: t1 */
    public static C18735g2 m86018t1(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18735g2) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: u1 */
    public static C18735g2 m86019u1(InputStream inputStream) throws IOException {
        return (C18735g2) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: v1 */
    public static C18735g2 m86020v1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18735g2) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: w1 */
    public static C18735g2 m86021w1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18735g2) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: x1 */
    public static C18735g2 m86022x1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18735g2) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: y1 */
    public static C18735g2 m86023y1(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18735g2) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: z1 */
    public static C18735g2 m86024z1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18735g2) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: B1 */
    public final void mo54598B1(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: C1 */
    public final void mo54599C1(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.name_ = byteString.mo53741S0();
    }

    /* renamed from: D1 */
    public final void mo54600D1(String str) {
        str.getClass();
        this.root_ = str;
    }

    /* renamed from: E1 */
    public final void mo54601E1(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.root_ = byteString.mo53741S0();
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18736a.f47852a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18735g2();
            case 2:
                return new C18737b((C18736a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18735g2> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18735g2.class) {
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

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m84390e0(this.name_);
    }

    public String getRoot() {
        return this.root_;
    }

    public ByteString getRootBytes() {
        return ByteString.m84390e0(this.root_);
    }

    /* renamed from: j1 */
    public final void mo54606j1() {
        this.name_ = m86010l1().getName();
    }

    /* renamed from: k1 */
    public final void mo54607k1() {
        this.root_ = m86010l1().getRoot();
    }
}
