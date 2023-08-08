package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18691b3;
import androidx.datastore.preferences.protobuf.C18715e2;
import androidx.datastore.preferences.protobuf.C18735g2;
import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18819n2;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.i */
public final class C18747i extends GeneratedMessageLite<C18747i, C18749b> implements C18774j {
    /* access modifiers changed from: private */
    public static final C18747i DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile C18841p2<C18747i> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private C18753i1.C18770k<C18715e2> methods_ = GeneratedMessageLite.m84971i0();
    private C18753i1.C18770k<C18735g2> mixins_ = GeneratedMessageLite.m84971i0();
    private String name_ = "";
    private C18753i1.C18770k<C18819n2> options_ = GeneratedMessageLite.m84971i0();
    private C18691b3 sourceContext_;
    private int syntax_;
    private String version_ = "";

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static /* synthetic */ class C18748a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47858a;

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
                f47858a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47858a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47858a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47858a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47858a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47858a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47858a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18747i.C18748a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$b */
    public static final class C18749b extends GeneratedMessageLite.C18634b<C18747i, C18749b> implements C18774j {
        public /* synthetic */ C18749b(C18748a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18749b mo54708E0(Iterable<? extends C18715e2> iterable) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54645S1(iterable);
            return this;
        }

        /* renamed from: F0 */
        public C18749b mo54709F0(Iterable<? extends C18735g2> iterable) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54647T1(iterable);
            return this;
        }

        /* renamed from: G0 */
        public C18749b mo54710G0(Iterable<? extends C18819n2> iterable) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54649U1(iterable);
            return this;
        }

        /* renamed from: H0 */
        public C18749b mo54711H0(int i, C18715e2.C18717b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54651V1(i, bVar);
            return this;
        }

        /* renamed from: I0 */
        public C18749b mo54712I0(int i, C18715e2 e2Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54653W1(i, e2Var);
            return this;
        }

        /* renamed from: J0 */
        public C18749b mo54713J0(C18715e2.C18717b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54657Z1(bVar);
            return this;
        }

        /* renamed from: L0 */
        public C18749b mo54714L0(C18715e2 e2Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54659a2(e2Var);
            return this;
        }

        /* renamed from: M0 */
        public C18749b mo54715M0(int i, C18735g2.C18737b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54661b2(i, bVar);
            return this;
        }

        /* renamed from: O0 */
        public C18749b mo54716O0(int i, C18735g2 g2Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54664d2(i, g2Var);
            return this;
        }

        /* renamed from: P0 */
        public C18749b mo54717P0(C18735g2.C18737b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54666e2(bVar);
            return this;
        }

        /* renamed from: Q0 */
        public C18749b mo54718Q0(C18735g2 g2Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54668f2(g2Var);
            return this;
        }

        /* renamed from: R0 */
        public C18749b mo54719R0(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54670g2(i, bVar);
            return this;
        }

        /* renamed from: S0 */
        public C18749b mo54720S0(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54688h2(i, n2Var);
            return this;
        }

        /* renamed from: T0 */
        public C18749b mo54721T0(C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54691i2(bVar);
            return this;
        }

        /* renamed from: U0 */
        public C18749b mo54722U0(C18819n2 n2Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54692j2(n2Var);
            return this;
        }

        /* renamed from: V0 */
        public C18749b mo54723V0() {
            mo54025u0();
            ((C18747i) this.f47641b).mo54693k2();
            return this;
        }

        /* renamed from: W0 */
        public C18749b mo54724W0() {
            mo54025u0();
            ((C18747i) this.f47641b).mo54694l2();
            return this;
        }

        /* renamed from: X0 */
        public C18749b mo54725X0() {
            mo54025u0();
            ((C18747i) this.f47641b).mo54695m2();
            return this;
        }

        /* renamed from: Y0 */
        public C18749b mo54726Y0() {
            mo54025u0();
            ((C18747i) this.f47641b).mo54696n2();
            return this;
        }

        /* renamed from: Z0 */
        public C18749b mo54727Z0() {
            mo54025u0();
            ((C18747i) this.f47641b).mo54697o2();
            return this;
        }

        /* renamed from: a1 */
        public C18749b mo54728a1() {
            mo54025u0();
            ((C18747i) this.f47641b).mo54698p2();
            return this;
        }

        /* renamed from: b1 */
        public C18749b mo54729b1() {
            mo54025u0();
            ((C18747i) this.f47641b).mo54699q2();
            return this;
        }

        /* renamed from: c1 */
        public C18749b mo54730c1(C18691b3 b3Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54643B2(b3Var);
            return this;
        }

        /* renamed from: d1 */
        public C18749b mo54731d1(int i) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54644R2(i);
            return this;
        }

        /* renamed from: e1 */
        public C18749b mo54732e1(int i) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54646S2(i);
            return this;
        }

        /* renamed from: f1 */
        public C18749b mo54733f1(int i) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54648T2(i);
            return this;
        }

        /* renamed from: g1 */
        public C18749b mo54734g1(int i, C18715e2.C18717b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54650U2(i, bVar);
            return this;
        }

        public C18715e2 getMethods(int i) {
            return ((C18747i) this.f47641b).getMethods(i);
        }

        public int getMethodsCount() {
            return ((C18747i) this.f47641b).getMethodsCount();
        }

        public List<C18715e2> getMethodsList() {
            return Collections.unmodifiableList(((C18747i) this.f47641b).getMethodsList());
        }

        public C18735g2 getMixins(int i) {
            return ((C18747i) this.f47641b).getMixins(i);
        }

        public int getMixinsCount() {
            return ((C18747i) this.f47641b).getMixinsCount();
        }

        public List<C18735g2> getMixinsList() {
            return Collections.unmodifiableList(((C18747i) this.f47641b).getMixinsList());
        }

        public String getName() {
            return ((C18747i) this.f47641b).getName();
        }

        public ByteString getNameBytes() {
            return ((C18747i) this.f47641b).getNameBytes();
        }

        public C18819n2 getOptions(int i) {
            return ((C18747i) this.f47641b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((C18747i) this.f47641b).getOptionsCount();
        }

        public List<C18819n2> getOptionsList() {
            return Collections.unmodifiableList(((C18747i) this.f47641b).getOptionsList());
        }

        public C18691b3 getSourceContext() {
            return ((C18747i) this.f47641b).getSourceContext();
        }

        public Syntax getSyntax() {
            return ((C18747i) this.f47641b).getSyntax();
        }

        public int getSyntaxValue() {
            return ((C18747i) this.f47641b).getSyntaxValue();
        }

        public String getVersion() {
            return ((C18747i) this.f47641b).getVersion();
        }

        public ByteString getVersionBytes() {
            return ((C18747i) this.f47641b).getVersionBytes();
        }

        /* renamed from: h1 */
        public C18749b mo54735h1(int i, C18715e2 e2Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54652V2(i, e2Var);
            return this;
        }

        public boolean hasSourceContext() {
            return ((C18747i) this.f47641b).hasSourceContext();
        }

        /* renamed from: i1 */
        public C18749b mo54736i1(int i, C18735g2.C18737b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54654W2(i, bVar);
            return this;
        }

        /* renamed from: l1 */
        public C18749b mo54737l1(int i, C18735g2 g2Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54655X2(i, g2Var);
            return this;
        }

        /* renamed from: m1 */
        public C18749b mo54738m1(String str) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54656Y2(str);
            return this;
        }

        /* renamed from: n1 */
        public C18749b mo54739n1(ByteString byteString) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54658Z2(byteString);
            return this;
        }

        /* renamed from: o1 */
        public C18749b mo54740o1(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54660a3(i, bVar);
            return this;
        }

        /* renamed from: p1 */
        public C18749b mo54741p1(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54662b3(i, n2Var);
            return this;
        }

        /* renamed from: q1 */
        public C18749b mo54742q1(C18691b3.C18693b bVar) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54663c3(bVar);
            return this;
        }

        /* renamed from: r1 */
        public C18749b mo54743r1(C18691b3 b3Var) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54665d3(b3Var);
            return this;
        }

        /* renamed from: s1 */
        public C18749b mo54744s1(Syntax syntax) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54667e3(syntax);
            return this;
        }

        /* renamed from: t1 */
        public C18749b mo54745t1(int i) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54669f3(i);
            return this;
        }

        /* renamed from: u1 */
        public C18749b mo54746u1(String str) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54671g3(str);
            return this;
        }

        /* renamed from: v1 */
        public C18749b mo54747v1(ByteString byteString) {
            mo54025u0();
            ((C18747i) this.f47641b).mo54689h3(byteString);
            return this;
        }

        public C18749b() {
            super(C18747i.DEFAULT_INSTANCE);
        }
    }

    static {
        C18747i iVar = new C18747i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.m84965a1(C18747i.class, iVar);
    }

    /* renamed from: C2 */
    public static C18749b m86085C2() {
        return (C18749b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: D2 */
    public static C18749b m86087D2(C18747i iVar) {
        return (C18749b) DEFAULT_INSTANCE.mo53982Y(iVar);
    }

    /* renamed from: E2 */
    public static C18747i m86089E2(InputStream inputStream) throws IOException {
        return (C18747i) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: F2 */
    public static C18747i m86091F2(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18747i) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: G2 */
    public static C18747i m86093G2(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18747i) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: H2 */
    public static C18747i m86095H2(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18747i) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: I2 */
    public static C18747i m86097I2(C18889w wVar) throws IOException {
        return (C18747i) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: J2 */
    public static C18747i m86099J2(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18747i) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: K2 */
    public static C18747i m86101K2(InputStream inputStream) throws IOException {
        return (C18747i) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: L2 */
    public static C18747i m86103L2(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18747i) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: M2 */
    public static C18747i m86104M2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18747i) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: N2 */
    public static C18747i m86106N2(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18747i) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: O2 */
    public static C18747i m86108O2(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18747i) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: P2 */
    public static C18747i m86110P2(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18747i) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: Q2 */
    public static C18841p2<C18747i> m86112Q2() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: u2 */
    public static C18747i m86133u2() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A2 */
    public List<? extends C18831o2> mo54642A2() {
        return this.options_;
    }

    /* renamed from: B2 */
    public final void mo54643B2(C18691b3 b3Var) {
        b3Var.getClass();
        C18691b3 b3Var2 = this.sourceContext_;
        if (b3Var2 == null || b3Var2 == C18691b3.m85587h1()) {
            this.sourceContext_ = b3Var;
        } else {
            this.sourceContext_ = (C18691b3) ((C18691b3.C18693b) C18691b3.m85589j1(this.sourceContext_).mo54029y0(b3Var)).mo54011Q();
        }
    }

    /* renamed from: R2 */
    public final void mo54644R2(int i) {
        mo54700r2();
        this.methods_.remove(i);
    }

    /* renamed from: S1 */
    public final void mo54645S1(Iterable<? extends C18715e2> iterable) {
        mo54700r2();
        C18665a.m85406d(iterable, this.methods_);
    }

    /* renamed from: S2 */
    public final void mo54646S2(int i) {
        mo54701s2();
        this.mixins_.remove(i);
    }

    /* renamed from: T1 */
    public final void mo54647T1(Iterable<? extends C18735g2> iterable) {
        mo54701s2();
        C18665a.m85406d(iterable, this.mixins_);
    }

    /* renamed from: T2 */
    public final void mo54648T2(int i) {
        mo54702t2();
        this.options_.remove(i);
    }

    /* renamed from: U1 */
    public final void mo54649U1(Iterable<? extends C18819n2> iterable) {
        mo54702t2();
        C18665a.m85406d(iterable, this.options_);
    }

    /* renamed from: U2 */
    public final void mo54650U2(int i, C18715e2.C18717b bVar) {
        mo54700r2();
        this.methods_.set(i, bVar.mo54018g());
    }

    /* renamed from: V1 */
    public final void mo54651V1(int i, C18715e2.C18717b bVar) {
        mo54700r2();
        this.methods_.add(i, bVar.mo54018g());
    }

    /* renamed from: V2 */
    public final void mo54652V2(int i, C18715e2 e2Var) {
        e2Var.getClass();
        mo54700r2();
        this.methods_.set(i, e2Var);
    }

    /* renamed from: W1 */
    public final void mo54653W1(int i, C18715e2 e2Var) {
        e2Var.getClass();
        mo54700r2();
        this.methods_.add(i, e2Var);
    }

    /* renamed from: W2 */
    public final void mo54654W2(int i, C18735g2.C18737b bVar) {
        mo54701s2();
        this.mixins_.set(i, bVar.mo54018g());
    }

    /* renamed from: X2 */
    public final void mo54655X2(int i, C18735g2 g2Var) {
        g2Var.getClass();
        mo54701s2();
        this.mixins_.set(i, g2Var);
    }

    /* renamed from: Y2 */
    public final void mo54656Y2(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: Z1 */
    public final void mo54657Z1(C18715e2.C18717b bVar) {
        mo54700r2();
        this.methods_.add(bVar.mo54018g());
    }

    /* renamed from: Z2 */
    public final void mo54658Z2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.name_ = byteString.mo53741S0();
    }

    /* renamed from: a2 */
    public final void mo54659a2(C18715e2 e2Var) {
        e2Var.getClass();
        mo54700r2();
        this.methods_.add(e2Var);
    }

    /* renamed from: a3 */
    public final void mo54660a3(int i, C18819n2.C18821b bVar) {
        mo54702t2();
        this.options_.set(i, bVar.mo54018g());
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18748a.f47858a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18747i();
            case 2:
                return new C18749b((C18748a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", C18715e2.class, "options_", C18819n2.class, "version_", "sourceContext_", "mixins_", C18735g2.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18747i> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18747i.class) {
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
    public final void mo54661b2(int i, C18735g2.C18737b bVar) {
        mo54701s2();
        this.mixins_.add(i, bVar.mo54018g());
    }

    /* renamed from: b3 */
    public final void mo54662b3(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo54702t2();
        this.options_.set(i, n2Var);
    }

    /* renamed from: c3 */
    public final void mo54663c3(C18691b3.C18693b bVar) {
        this.sourceContext_ = (C18691b3) bVar.mo54018g();
    }

    /* renamed from: d2 */
    public final void mo54664d2(int i, C18735g2 g2Var) {
        g2Var.getClass();
        mo54701s2();
        this.mixins_.add(i, g2Var);
    }

    /* renamed from: d3 */
    public final void mo54665d3(C18691b3 b3Var) {
        b3Var.getClass();
        this.sourceContext_ = b3Var;
    }

    /* renamed from: e2 */
    public final void mo54666e2(C18735g2.C18737b bVar) {
        mo54701s2();
        this.mixins_.add(bVar.mo54018g());
    }

    /* renamed from: e3 */
    public final void mo54667e3(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    /* renamed from: f2 */
    public final void mo54668f2(C18735g2 g2Var) {
        g2Var.getClass();
        mo54701s2();
        this.mixins_.add(g2Var);
    }

    /* renamed from: f3 */
    public final void mo54669f3(int i) {
        this.syntax_ = i;
    }

    /* renamed from: g2 */
    public final void mo54670g2(int i, C18819n2.C18821b bVar) {
        mo54702t2();
        this.options_.add(i, bVar.mo54018g());
    }

    /* renamed from: g3 */
    public final void mo54671g3(String str) {
        str.getClass();
        this.version_ = str;
    }

    public C18715e2 getMethods(int i) {
        return this.methods_.get(i);
    }

    public int getMethodsCount() {
        return this.methods_.size();
    }

    public List<C18715e2> getMethodsList() {
        return this.methods_;
    }

    public C18735g2 getMixins(int i) {
        return this.mixins_.get(i);
    }

    public int getMixinsCount() {
        return this.mixins_.size();
    }

    public List<C18735g2> getMixinsList() {
        return this.mixins_;
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

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.m84390e0(this.version_);
    }

    /* renamed from: h2 */
    public final void mo54688h2(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo54702t2();
        this.options_.add(i, n2Var);
    }

    /* renamed from: h3 */
    public final void mo54689h3(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.version_ = byteString.mo53741S0();
    }

    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    /* renamed from: i2 */
    public final void mo54691i2(C18819n2.C18821b bVar) {
        mo54702t2();
        this.options_.add(bVar.mo54018g());
    }

    /* renamed from: j2 */
    public final void mo54692j2(C18819n2 n2Var) {
        n2Var.getClass();
        mo54702t2();
        this.options_.add(n2Var);
    }

    /* renamed from: k2 */
    public final void mo54693k2() {
        this.methods_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: l2 */
    public final void mo54694l2() {
        this.mixins_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: m2 */
    public final void mo54695m2() {
        this.name_ = m86133u2().getName();
    }

    /* renamed from: n2 */
    public final void mo54696n2() {
        this.options_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: o2 */
    public final void mo54697o2() {
        this.sourceContext_ = null;
    }

    /* renamed from: p2 */
    public final void mo54698p2() {
        this.syntax_ = 0;
    }

    /* renamed from: q2 */
    public final void mo54699q2() {
        this.version_ = m86133u2().getVersion();
    }

    /* renamed from: r2 */
    public final void mo54700r2() {
        if (!this.methods_.mo54405T()) {
            this.methods_ = GeneratedMessageLite.m84981z0(this.methods_);
        }
    }

    /* renamed from: s2 */
    public final void mo54701s2() {
        if (!this.mixins_.mo54405T()) {
            this.mixins_ = GeneratedMessageLite.m84981z0(this.mixins_);
        }
    }

    /* renamed from: t2 */
    public final void mo54702t2() {
        if (!this.options_.mo54405T()) {
            this.options_ = GeneratedMessageLite.m84981z0(this.options_);
        }
    }

    /* renamed from: v2 */
    public C18730f2 mo54703v2(int i) {
        return this.methods_.get(i);
    }

    /* renamed from: w2 */
    public List<? extends C18730f2> mo54704w2() {
        return this.methods_;
    }

    /* renamed from: x2 */
    public C18745h2 mo54705x2(int i) {
        return this.mixins_.get(i);
    }

    /* renamed from: y2 */
    public List<? extends C18745h2> mo54706y2() {
        return this.mixins_;
    }

    /* renamed from: z2 */
    public C18831o2 mo54707z2(int i) {
        return this.options_.get(i);
    }
}
