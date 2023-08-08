package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18691b3;
import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18781k0;
import androidx.datastore.preferences.protobuf.C18819n2;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i0 */
public final class C18750i0 extends GeneratedMessageLite<C18750i0, C18752b> implements C18775j0 {
    /* access modifiers changed from: private */
    public static final C18750i0 DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile C18841p2<C18750i0> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private C18753i1.C18770k<C18781k0> enumvalue_ = GeneratedMessageLite.m84971i0();
    private String name_ = "";
    private C18753i1.C18770k<C18819n2> options_ = GeneratedMessageLite.m84971i0();
    private C18691b3 sourceContext_;
    private int syntax_;

    /* renamed from: androidx.datastore.preferences.protobuf.i0$a */
    public static /* synthetic */ class C18751a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47859a;

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
                f47859a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47859a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47859a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47859a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47859a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47859a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47859a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18750i0.C18751a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i0$b */
    public static final class C18752b extends GeneratedMessageLite.C18634b<C18750i0, C18752b> implements C18775j0 {
        public /* synthetic */ C18752b(C18751a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18752b mo54794E0(Iterable<? extends C18781k0> iterable) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54753F1(iterable);
            return this;
        }

        /* renamed from: F0 */
        public C18752b mo54795F0(Iterable<? extends C18819n2> iterable) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54755G1(iterable);
            return this;
        }

        /* renamed from: G0 */
        public C18752b mo54796G0(int i, C18781k0.C18783b bVar) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54757H1(i, bVar);
            return this;
        }

        /* renamed from: H0 */
        public C18752b mo54797H0(int i, C18781k0 k0Var) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54758I1(i, k0Var);
            return this;
        }

        /* renamed from: I0 */
        public C18752b mo54798I0(C18781k0.C18783b bVar) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54759J1(bVar);
            return this;
        }

        /* renamed from: J0 */
        public C18752b mo54799J0(C18781k0 k0Var) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54760K1(k0Var);
            return this;
        }

        /* renamed from: L0 */
        public C18752b mo54800L0(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54761L1(i, bVar);
            return this;
        }

        /* renamed from: M0 */
        public C18752b mo54801M0(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54762N1(i, n2Var);
            return this;
        }

        /* renamed from: O0 */
        public C18752b mo54802O0(C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54763O1(bVar);
            return this;
        }

        /* renamed from: P0 */
        public C18752b mo54803P0(C18819n2 n2Var) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54764P1(n2Var);
            return this;
        }

        /* renamed from: Q0 */
        public C18752b mo54804Q0() {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54765Q1();
            return this;
        }

        /* renamed from: R0 */
        public C18752b mo54805R0() {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54766R1();
            return this;
        }

        /* renamed from: S0 */
        public C18752b mo54806S0() {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54767S1();
            return this;
        }

        /* renamed from: T0 */
        public C18752b mo54807T0() {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54768T1();
            return this;
        }

        /* renamed from: U0 */
        public C18752b mo54808U0() {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54769U1();
            return this;
        }

        /* renamed from: V0 */
        public C18752b mo54809V0(C18691b3 b3Var) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54776f2(b3Var);
            return this;
        }

        /* renamed from: W0 */
        public C18752b mo54810W0(int i) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54789v2(i);
            return this;
        }

        /* renamed from: X0 */
        public C18752b mo54811X0(int i) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54790w2(i);
            return this;
        }

        /* renamed from: Y0 */
        public C18752b mo54812Y0(int i, C18781k0.C18783b bVar) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54791x2(i, bVar);
            return this;
        }

        /* renamed from: Z0 */
        public C18752b mo54813Z0(int i, C18781k0 k0Var) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54792y2(i, k0Var);
            return this;
        }

        /* renamed from: a1 */
        public C18752b mo54814a1(String str) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54793z2(str);
            return this;
        }

        /* renamed from: b1 */
        public C18752b mo54815b1(ByteString byteString) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54748A2(byteString);
            return this;
        }

        /* renamed from: c1 */
        public C18752b mo54816c1(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54749B2(i, bVar);
            return this;
        }

        /* renamed from: d1 */
        public C18752b mo54817d1(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54750C2(i, n2Var);
            return this;
        }

        /* renamed from: e1 */
        public C18752b mo54818e1(C18691b3.C18693b bVar) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54751D2(bVar);
            return this;
        }

        /* renamed from: f1 */
        public C18752b mo54819f1(C18691b3 b3Var) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54752E2(b3Var);
            return this;
        }

        /* renamed from: g1 */
        public C18752b mo54820g1(Syntax syntax) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54754F2(syntax);
            return this;
        }

        public C18781k0 getEnumvalue(int i) {
            return ((C18750i0) this.f47641b).getEnumvalue(i);
        }

        public int getEnumvalueCount() {
            return ((C18750i0) this.f47641b).getEnumvalueCount();
        }

        public List<C18781k0> getEnumvalueList() {
            return Collections.unmodifiableList(((C18750i0) this.f47641b).getEnumvalueList());
        }

        public String getName() {
            return ((C18750i0) this.f47641b).getName();
        }

        public ByteString getNameBytes() {
            return ((C18750i0) this.f47641b).getNameBytes();
        }

        public C18819n2 getOptions(int i) {
            return ((C18750i0) this.f47641b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((C18750i0) this.f47641b).getOptionsCount();
        }

        public List<C18819n2> getOptionsList() {
            return Collections.unmodifiableList(((C18750i0) this.f47641b).getOptionsList());
        }

        public C18691b3 getSourceContext() {
            return ((C18750i0) this.f47641b).getSourceContext();
        }

        public Syntax getSyntax() {
            return ((C18750i0) this.f47641b).getSyntax();
        }

        public int getSyntaxValue() {
            return ((C18750i0) this.f47641b).getSyntaxValue();
        }

        /* renamed from: h1 */
        public C18752b mo54821h1(int i) {
            mo54025u0();
            ((C18750i0) this.f47641b).mo54756G2(i);
            return this;
        }

        public boolean hasSourceContext() {
            return ((C18750i0) this.f47641b).hasSourceContext();
        }

        public C18752b() {
            super(C18750i0.DEFAULT_INSTANCE);
        }
    }

    static {
        C18750i0 i0Var = new C18750i0();
        DEFAULT_INSTANCE = i0Var;
        GeneratedMessageLite.m84965a1(C18750i0.class, i0Var);
    }

    /* renamed from: Z1 */
    public static C18750i0 m86234Z1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g2 */
    public static C18752b m86240g2() {
        return (C18752b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: h2 */
    public static C18752b m86242h2(C18750i0 i0Var) {
        return (C18752b) DEFAULT_INSTANCE.mo53982Y(i0Var);
    }

    /* renamed from: i2 */
    public static C18750i0 m86244i2(InputStream inputStream) throws IOException {
        return (C18750i0) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: j2 */
    public static C18750i0 m86246j2(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18750i0) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: k2 */
    public static C18750i0 m86248k2(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18750i0) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: l2 */
    public static C18750i0 m86250l2(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18750i0) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: m2 */
    public static C18750i0 m86252m2(C18889w wVar) throws IOException {
        return (C18750i0) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: n2 */
    public static C18750i0 m86254n2(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18750i0) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: o2 */
    public static C18750i0 m86256o2(InputStream inputStream) throws IOException {
        return (C18750i0) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: p2 */
    public static C18750i0 m86258p2(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18750i0) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: q2 */
    public static C18750i0 m86260q2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18750i0) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: r2 */
    public static C18750i0 m86262r2(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18750i0) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: s2 */
    public static C18750i0 m86264s2(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18750i0) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: t2 */
    public static C18750i0 m86266t2(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18750i0) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: u2 */
    public static C18841p2<C18750i0> m86268u2() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: A2 */
    public final void mo54748A2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.name_ = byteString.mo53741S0();
    }

    /* renamed from: B2 */
    public final void mo54749B2(int i, C18819n2.C18821b bVar) {
        mo54771W1();
        this.options_.set(i, bVar.mo54018g());
    }

    /* renamed from: C2 */
    public final void mo54750C2(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo54771W1();
        this.options_.set(i, n2Var);
    }

    /* renamed from: D2 */
    public final void mo54751D2(C18691b3.C18693b bVar) {
        this.sourceContext_ = (C18691b3) bVar.mo54018g();
    }

    /* renamed from: E2 */
    public final void mo54752E2(C18691b3 b3Var) {
        b3Var.getClass();
        this.sourceContext_ = b3Var;
    }

    /* renamed from: F1 */
    public final void mo54753F1(Iterable<? extends C18781k0> iterable) {
        mo54770V1();
        C18665a.m85406d(iterable, this.enumvalue_);
    }

    /* renamed from: F2 */
    public final void mo54754F2(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    /* renamed from: G1 */
    public final void mo54755G1(Iterable<? extends C18819n2> iterable) {
        mo54771W1();
        C18665a.m85406d(iterable, this.options_);
    }

    /* renamed from: G2 */
    public final void mo54756G2(int i) {
        this.syntax_ = i;
    }

    /* renamed from: H1 */
    public final void mo54757H1(int i, C18781k0.C18783b bVar) {
        mo54770V1();
        this.enumvalue_.add(i, bVar.mo54018g());
    }

    /* renamed from: I1 */
    public final void mo54758I1(int i, C18781k0 k0Var) {
        k0Var.getClass();
        mo54770V1();
        this.enumvalue_.add(i, k0Var);
    }

    /* renamed from: J1 */
    public final void mo54759J1(C18781k0.C18783b bVar) {
        mo54770V1();
        this.enumvalue_.add(bVar.mo54018g());
    }

    /* renamed from: K1 */
    public final void mo54760K1(C18781k0 k0Var) {
        k0Var.getClass();
        mo54770V1();
        this.enumvalue_.add(k0Var);
    }

    /* renamed from: L1 */
    public final void mo54761L1(int i, C18819n2.C18821b bVar) {
        mo54771W1();
        this.options_.add(i, bVar.mo54018g());
    }

    /* renamed from: N1 */
    public final void mo54762N1(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo54771W1();
        this.options_.add(i, n2Var);
    }

    /* renamed from: O1 */
    public final void mo54763O1(C18819n2.C18821b bVar) {
        mo54771W1();
        this.options_.add(bVar.mo54018g());
    }

    /* renamed from: P1 */
    public final void mo54764P1(C18819n2 n2Var) {
        n2Var.getClass();
        mo54771W1();
        this.options_.add(n2Var);
    }

    /* renamed from: Q1 */
    public final void mo54765Q1() {
        this.enumvalue_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: R1 */
    public final void mo54766R1() {
        this.name_ = m86234Z1().getName();
    }

    /* renamed from: S1 */
    public final void mo54767S1() {
        this.options_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: T1 */
    public final void mo54768T1() {
        this.sourceContext_ = null;
    }

    /* renamed from: U1 */
    public final void mo54769U1() {
        this.syntax_ = 0;
    }

    /* renamed from: V1 */
    public final void mo54770V1() {
        if (!this.enumvalue_.mo54405T()) {
            this.enumvalue_ = GeneratedMessageLite.m84981z0(this.enumvalue_);
        }
    }

    /* renamed from: W1 */
    public final void mo54771W1() {
        if (!this.options_.mo54405T()) {
            this.options_ = GeneratedMessageLite.m84981z0(this.options_);
        }
    }

    /* renamed from: a2 */
    public C18796l0 mo54772a2(int i) {
        return this.enumvalue_.get(i);
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18751a.f47859a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18750i0();
            case 2:
                return new C18752b((C18751a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", C18781k0.class, "options_", C18819n2.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18750i0> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18750i0.class) {
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

    /* renamed from: b2 */
    public List<? extends C18796l0> mo54773b2() {
        return this.enumvalue_;
    }

    /* renamed from: d2 */
    public C18831o2 mo54774d2(int i) {
        return this.options_.get(i);
    }

    /* renamed from: e2 */
    public List<? extends C18831o2> mo54775e2() {
        return this.options_;
    }

    /* renamed from: f2 */
    public final void mo54776f2(C18691b3 b3Var) {
        b3Var.getClass();
        C18691b3 b3Var2 = this.sourceContext_;
        if (b3Var2 == null || b3Var2 == C18691b3.m85587h1()) {
            this.sourceContext_ = b3Var;
        } else {
            this.sourceContext_ = (C18691b3) ((C18691b3.C18693b) C18691b3.m85589j1(this.sourceContext_).mo54029y0(b3Var)).mo54011Q();
        }
    }

    public C18781k0 getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    public List<C18781k0> getEnumvalueList() {
        return this.enumvalue_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m84390e0(this.name_);
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

    public C18691b3 getSourceContext() {
        C18691b3 b3Var = this.sourceContext_;
        return b3Var == null ? C18691b3.m85587h1() : b3Var;
    }

    public Syntax getSyntax() {
        Syntax b = Syntax.m85180b(this.syntax_);
        if (b == null) {
            return Syntax.UNRECOGNIZED;
        }
        return b;
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }

    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    /* renamed from: v2 */
    public final void mo54789v2(int i) {
        mo54770V1();
        this.enumvalue_.remove(i);
    }

    /* renamed from: w2 */
    public final void mo54790w2(int i) {
        mo54771W1();
        this.options_.remove(i);
    }

    /* renamed from: x2 */
    public final void mo54791x2(int i, C18781k0.C18783b bVar) {
        mo54770V1();
        this.enumvalue_.set(i, bVar.mo54018g());
    }

    /* renamed from: y2 */
    public final void mo54792y2(int i, C18781k0 k0Var) {
        k0Var.getClass();
        mo54770V1();
        this.enumvalue_.set(i, k0Var);
    }

    /* renamed from: z2 */
    public final void mo54793z2(String str) {
        str.getClass();
        this.name_ = str;
    }
}
