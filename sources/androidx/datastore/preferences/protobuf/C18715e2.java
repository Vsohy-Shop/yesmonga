package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18819n2;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.e2 */
public final class C18715e2 extends GeneratedMessageLite<C18715e2, C18717b> implements C18730f2 {
    /* access modifiers changed from: private */
    public static final C18715e2 DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile C18841p2<C18715e2> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private String name_ = "";
    private C18753i1.C18770k<C18819n2> options_ = GeneratedMessageLite.m84971i0();
    private boolean requestStreaming_;
    private String requestTypeUrl_ = "";
    private boolean responseStreaming_;
    private String responseTypeUrl_ = "";
    private int syntax_;

    /* renamed from: androidx.datastore.preferences.protobuf.e2$a */
    public static /* synthetic */ class C18716a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47847a;

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
                f47847a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47847a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47847a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47847a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47847a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47847a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47847a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18715e2.C18716a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.e2$b */
    public static final class C18717b extends GeneratedMessageLite.C18634b<C18715e2, C18717b> implements C18730f2 {
        public /* synthetic */ C18717b(C18716a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18717b mo54547E0(Iterable<? extends C18819n2> iterable) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54506C1(iterable);
            return this;
        }

        /* renamed from: F0 */
        public C18717b mo54548F0(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54507D1(i, bVar);
            return this;
        }

        /* renamed from: G0 */
        public C18717b mo54549G0(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54508E1(i, n2Var);
            return this;
        }

        /* renamed from: H0 */
        public C18717b mo54550H0(C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54509F1(bVar);
            return this;
        }

        /* renamed from: I0 */
        public C18717b mo54551I0(C18819n2 n2Var) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54510G1(n2Var);
            return this;
        }

        /* renamed from: J0 */
        public C18717b mo54552J0() {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54511H1();
            return this;
        }

        /* renamed from: L0 */
        public C18717b mo54553L0() {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54512I1();
            return this;
        }

        /* renamed from: M0 */
        public C18717b mo54554M0() {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54513J1();
            return this;
        }

        /* renamed from: O0 */
        public C18717b mo54555O0() {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54514K1();
            return this;
        }

        /* renamed from: P0 */
        public C18717b mo54556P0() {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54515L1();
            return this;
        }

        /* renamed from: Q0 */
        public C18717b mo54557Q0() {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54516N1();
            return this;
        }

        /* renamed from: R0 */
        public C18717b mo54558R0() {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54517O1();
            return this;
        }

        /* renamed from: S0 */
        public C18717b mo54559S0(int i) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54534l2(i);
            return this;
        }

        /* renamed from: T0 */
        public C18717b mo54560T0(String str) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54535m2(str);
            return this;
        }

        /* renamed from: U0 */
        public C18717b mo54561U0(ByteString byteString) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54536n2(byteString);
            return this;
        }

        /* renamed from: V0 */
        public C18717b mo54562V0(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54537o2(i, bVar);
            return this;
        }

        /* renamed from: W0 */
        public C18717b mo54563W0(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54538p2(i, n2Var);
            return this;
        }

        /* renamed from: X0 */
        public C18717b mo54564X0(boolean z) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54539q2(z);
            return this;
        }

        /* renamed from: Y0 */
        public C18717b mo54565Y0(String str) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54540r2(str);
            return this;
        }

        /* renamed from: Z0 */
        public C18717b mo54566Z0(ByteString byteString) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54541s2(byteString);
            return this;
        }

        /* renamed from: a1 */
        public C18717b mo54567a1(boolean z) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54542t2(z);
            return this;
        }

        /* renamed from: b1 */
        public C18717b mo54568b1(String str) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54543u2(str);
            return this;
        }

        /* renamed from: c1 */
        public C18717b mo54569c1(ByteString byteString) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54544v2(byteString);
            return this;
        }

        /* renamed from: d1 */
        public C18717b mo54570d1(Syntax syntax) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54545w2(syntax);
            return this;
        }

        /* renamed from: e1 */
        public C18717b mo54571e1(int i) {
            mo54025u0();
            ((C18715e2) this.f47641b).mo54546x2(i);
            return this;
        }

        public String getName() {
            return ((C18715e2) this.f47641b).getName();
        }

        public ByteString getNameBytes() {
            return ((C18715e2) this.f47641b).getNameBytes();
        }

        public C18819n2 getOptions(int i) {
            return ((C18715e2) this.f47641b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((C18715e2) this.f47641b).getOptionsCount();
        }

        public List<C18819n2> getOptionsList() {
            return Collections.unmodifiableList(((C18715e2) this.f47641b).getOptionsList());
        }

        public boolean getRequestStreaming() {
            return ((C18715e2) this.f47641b).getRequestStreaming();
        }

        public String getRequestTypeUrl() {
            return ((C18715e2) this.f47641b).getRequestTypeUrl();
        }

        public ByteString getRequestTypeUrlBytes() {
            return ((C18715e2) this.f47641b).getRequestTypeUrlBytes();
        }

        public boolean getResponseStreaming() {
            return ((C18715e2) this.f47641b).getResponseStreaming();
        }

        public String getResponseTypeUrl() {
            return ((C18715e2) this.f47641b).getResponseTypeUrl();
        }

        public ByteString getResponseTypeUrlBytes() {
            return ((C18715e2) this.f47641b).getResponseTypeUrlBytes();
        }

        public Syntax getSyntax() {
            return ((C18715e2) this.f47641b).getSyntax();
        }

        public int getSyntaxValue() {
            return ((C18715e2) this.f47641b).getSyntaxValue();
        }

        public C18717b() {
            super(C18715e2.DEFAULT_INSTANCE);
        }
    }

    static {
        C18715e2 e2Var = new C18715e2();
        DEFAULT_INSTANCE = e2Var;
        GeneratedMessageLite.m84965a1(C18715e2.class, e2Var);
    }

    /* renamed from: Q1 */
    public static C18715e2 m85804Q1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: T1 */
    public static C18717b m85805T1() {
        return (C18717b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: U1 */
    public static C18717b m85806U1(C18715e2 e2Var) {
        return (C18717b) DEFAULT_INSTANCE.mo53982Y(e2Var);
    }

    /* renamed from: V1 */
    public static C18715e2 m85807V1(InputStream inputStream) throws IOException {
        return (C18715e2) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: W1 */
    public static C18715e2 m85808W1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18715e2) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: Z1 */
    public static C18715e2 m85809Z1(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18715e2) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: a2 */
    public static C18715e2 m85810a2(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18715e2) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: b2 */
    public static C18715e2 m85811b2(C18889w wVar) throws IOException {
        return (C18715e2) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: d2 */
    public static C18715e2 m85814d2(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18715e2) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: e2 */
    public static C18715e2 m85816e2(InputStream inputStream) throws IOException {
        return (C18715e2) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: f2 */
    public static C18715e2 m85818f2(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18715e2) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: g2 */
    public static C18715e2 m85820g2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18715e2) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: h2 */
    public static C18715e2 m85822h2(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18715e2) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: i2 */
    public static C18715e2 m85824i2(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18715e2) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: j2 */
    public static C18715e2 m85826j2(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18715e2) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: k2 */
    public static C18841p2<C18715e2> m85828k2() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: C1 */
    public final void mo54506C1(Iterable<? extends C18819n2> iterable) {
        mo54518P1();
        C18665a.m85406d(iterable, this.options_);
    }

    /* renamed from: D1 */
    public final void mo54507D1(int i, C18819n2.C18821b bVar) {
        mo54518P1();
        this.options_.add(i, bVar.mo54018g());
    }

    /* renamed from: E1 */
    public final void mo54508E1(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo54518P1();
        this.options_.add(i, n2Var);
    }

    /* renamed from: F1 */
    public final void mo54509F1(C18819n2.C18821b bVar) {
        mo54518P1();
        this.options_.add(bVar.mo54018g());
    }

    /* renamed from: G1 */
    public final void mo54510G1(C18819n2 n2Var) {
        n2Var.getClass();
        mo54518P1();
        this.options_.add(n2Var);
    }

    /* renamed from: H1 */
    public final void mo54511H1() {
        this.name_ = m85804Q1().getName();
    }

    /* renamed from: I1 */
    public final void mo54512I1() {
        this.options_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: J1 */
    public final void mo54513J1() {
        this.requestStreaming_ = false;
    }

    /* renamed from: K1 */
    public final void mo54514K1() {
        this.requestTypeUrl_ = m85804Q1().getRequestTypeUrl();
    }

    /* renamed from: L1 */
    public final void mo54515L1() {
        this.responseStreaming_ = false;
    }

    /* renamed from: N1 */
    public final void mo54516N1() {
        this.responseTypeUrl_ = m85804Q1().getResponseTypeUrl();
    }

    /* renamed from: O1 */
    public final void mo54517O1() {
        this.syntax_ = 0;
    }

    /* renamed from: P1 */
    public final void mo54518P1() {
        if (!this.options_.mo54405T()) {
            this.options_ = GeneratedMessageLite.m84981z0(this.options_);
        }
    }

    /* renamed from: R1 */
    public C18831o2 mo54519R1(int i) {
        return this.options_.get(i);
    }

    /* renamed from: S1 */
    public List<? extends C18831o2> mo54520S1() {
        return this.options_;
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18716a.f47847a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18715e2();
            case 2:
                return new C18717b((C18716a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", C18819n2.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18715e2> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18715e2.class) {
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

    public C18819n2 getOptions(int i) {
        return this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<C18819n2> getOptionsList() {
        return this.options_;
    }

    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    public ByteString getRequestTypeUrlBytes() {
        return ByteString.m84390e0(this.requestTypeUrl_);
    }

    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    public ByteString getResponseTypeUrlBytes() {
        return ByteString.m84390e0(this.responseTypeUrl_);
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

    /* renamed from: l2 */
    public final void mo54534l2(int i) {
        mo54518P1();
        this.options_.remove(i);
    }

    /* renamed from: m2 */
    public final void mo54535m2(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: n2 */
    public final void mo54536n2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.name_ = byteString.mo53741S0();
    }

    /* renamed from: o2 */
    public final void mo54537o2(int i, C18819n2.C18821b bVar) {
        mo54518P1();
        this.options_.set(i, bVar.mo54018g());
    }

    /* renamed from: p2 */
    public final void mo54538p2(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo54518P1();
        this.options_.set(i, n2Var);
    }

    /* renamed from: q2 */
    public final void mo54539q2(boolean z) {
        this.requestStreaming_ = z;
    }

    /* renamed from: r2 */
    public final void mo54540r2(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* renamed from: s2 */
    public final void mo54541s2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.requestTypeUrl_ = byteString.mo53741S0();
    }

    /* renamed from: t2 */
    public final void mo54542t2(boolean z) {
        this.responseStreaming_ = z;
    }

    /* renamed from: u2 */
    public final void mo54543u2(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* renamed from: v2 */
    public final void mo54544v2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.responseTypeUrl_ = byteString.mo53741S0();
    }

    /* renamed from: w2 */
    public final void mo54545w2(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    /* renamed from: x2 */
    public final void mo54546x2(int i) {
        this.syntax_ = i;
    }
}
