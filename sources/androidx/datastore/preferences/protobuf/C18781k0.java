package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18819n2;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.k0 */
public final class C18781k0 extends GeneratedMessageLite<C18781k0, C18783b> implements C18796l0 {
    /* access modifiers changed from: private */
    public static final C18781k0 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile C18841p2<C18781k0> PARSER;
    private String name_ = "";
    private int number_;
    private C18753i1.C18770k<C18819n2> options_ = GeneratedMessageLite.m84971i0();

    /* renamed from: androidx.datastore.preferences.protobuf.k0$a */
    public static /* synthetic */ class C18782a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47899a;

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
                f47899a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47899a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47899a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47899a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47899a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47899a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47899a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18781k0.C18782a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.k0$b */
    public static final class C18783b extends GeneratedMessageLite.C18634b<C18781k0, C18783b> implements C18796l0 {
        public /* synthetic */ C18783b(C18782a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18783b mo54895E0(Iterable<? extends C18819n2> iterable) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54886r1(iterable);
            return this;
        }

        /* renamed from: F0 */
        public C18783b mo54896F0(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54887s1(i, bVar);
            return this;
        }

        /* renamed from: G0 */
        public C18783b mo54897G0(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54888t1(i, n2Var);
            return this;
        }

        /* renamed from: H0 */
        public C18783b mo54898H0(C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54889u1(bVar);
            return this;
        }

        /* renamed from: I0 */
        public C18783b mo54899I0(C18819n2 n2Var) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54890v1(n2Var);
            return this;
        }

        /* renamed from: J0 */
        public C18783b mo54900J0() {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54891w1();
            return this;
        }

        /* renamed from: L0 */
        public C18783b mo54901L0() {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54892x1();
            return this;
        }

        /* renamed from: M0 */
        public C18783b mo54902M0() {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54893y1();
            return this;
        }

        /* renamed from: O0 */
        public C18783b mo54903O0(int i) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54874T1(i);
            return this;
        }

        /* renamed from: P0 */
        public C18783b mo54904P0(String str) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54875U1(str);
            return this;
        }

        /* renamed from: Q0 */
        public C18783b mo54905Q0(ByteString byteString) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54876V1(byteString);
            return this;
        }

        /* renamed from: R0 */
        public C18783b mo54906R0(int i) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54877W1(i);
            return this;
        }

        /* renamed from: S0 */
        public C18783b mo54907S0(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54878Z1(i, bVar);
            return this;
        }

        /* renamed from: T0 */
        public C18783b mo54908T0(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18781k0) this.f47641b).mo54879a2(i, n2Var);
            return this;
        }

        public String getName() {
            return ((C18781k0) this.f47641b).getName();
        }

        public ByteString getNameBytes() {
            return ((C18781k0) this.f47641b).getNameBytes();
        }

        public int getNumber() {
            return ((C18781k0) this.f47641b).getNumber();
        }

        public C18819n2 getOptions(int i) {
            return ((C18781k0) this.f47641b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((C18781k0) this.f47641b).getOptionsCount();
        }

        public List<C18819n2> getOptionsList() {
            return Collections.unmodifiableList(((C18781k0) this.f47641b).getOptionsList());
        }

        public C18783b() {
            super(C18781k0.DEFAULT_INSTANCE);
        }
    }

    static {
        C18781k0 k0Var = new C18781k0();
        DEFAULT_INSTANCE = k0Var;
        GeneratedMessageLite.m84965a1(C18781k0.class, k0Var);
    }

    /* renamed from: A1 */
    public static C18781k0 m86412A1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: D1 */
    public static C18783b m86413D1() {
        return (C18783b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: E1 */
    public static C18783b m86414E1(C18781k0 k0Var) {
        return (C18783b) DEFAULT_INSTANCE.mo53982Y(k0Var);
    }

    /* renamed from: F1 */
    public static C18781k0 m86415F1(InputStream inputStream) throws IOException {
        return (C18781k0) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: G1 */
    public static C18781k0 m86416G1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18781k0) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: H1 */
    public static C18781k0 m86417H1(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18781k0) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: I1 */
    public static C18781k0 m86418I1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18781k0) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: J1 */
    public static C18781k0 m86419J1(C18889w wVar) throws IOException {
        return (C18781k0) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: K1 */
    public static C18781k0 m86420K1(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18781k0) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: L1 */
    public static C18781k0 m86421L1(InputStream inputStream) throws IOException {
        return (C18781k0) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: N1 */
    public static C18781k0 m86422N1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18781k0) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: O1 */
    public static C18781k0 m86423O1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18781k0) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: P1 */
    public static C18781k0 m86424P1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18781k0) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: Q1 */
    public static C18781k0 m86425Q1(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18781k0) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: R1 */
    public static C18781k0 m86426R1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18781k0) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: S1 */
    public static C18841p2<C18781k0> m86427S1() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: B1 */
    public C18831o2 mo54872B1(int i) {
        return this.options_.get(i);
    }

    /* renamed from: C1 */
    public List<? extends C18831o2> mo54873C1() {
        return this.options_;
    }

    /* renamed from: T1 */
    public final void mo54874T1(int i) {
        mo54894z1();
        this.options_.remove(i);
    }

    /* renamed from: U1 */
    public final void mo54875U1(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: V1 */
    public final void mo54876V1(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.name_ = byteString.mo53741S0();
    }

    /* renamed from: W1 */
    public final void mo54877W1(int i) {
        this.number_ = i;
    }

    /* renamed from: Z1 */
    public final void mo54878Z1(int i, C18819n2.C18821b bVar) {
        mo54894z1();
        this.options_.set(i, bVar.mo54018g());
    }

    /* renamed from: a2 */
    public final void mo54879a2(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo54894z1();
        this.options_.set(i, n2Var);
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18782a.f47899a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18781k0();
            case 2:
                return new C18783b((C18782a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", C18819n2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18781k0> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18781k0.class) {
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

    public int getNumber() {
        return this.number_;
    }

    public C18819n2 getOptions(int i) {
        return this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<C18819n2> getOptionsList() {
        return this.options_;
    }

    /* renamed from: r1 */
    public final void mo54886r1(Iterable<? extends C18819n2> iterable) {
        mo54894z1();
        C18665a.m85406d(iterable, this.options_);
    }

    /* renamed from: s1 */
    public final void mo54887s1(int i, C18819n2.C18821b bVar) {
        mo54894z1();
        this.options_.add(i, bVar.mo54018g());
    }

    /* renamed from: t1 */
    public final void mo54888t1(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo54894z1();
        this.options_.add(i, n2Var);
    }

    /* renamed from: u1 */
    public final void mo54889u1(C18819n2.C18821b bVar) {
        mo54894z1();
        this.options_.add(bVar.mo54018g());
    }

    /* renamed from: v1 */
    public final void mo54890v1(C18819n2 n2Var) {
        n2Var.getClass();
        mo54894z1();
        this.options_.add(n2Var);
    }

    /* renamed from: w1 */
    public final void mo54891w1() {
        this.name_ = m86412A1().getName();
    }

    /* renamed from: x1 */
    public final void mo54892x1() {
        this.number_ = 0;
    }

    /* renamed from: y1 */
    public final void mo54893y1() {
        this.options_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: z1 */
    public final void mo54894z1() {
        if (!this.options_.mo54405T()) {
            this.options_ = GeneratedMessageLite.m84981z0(this.options_);
        }
    }
}
