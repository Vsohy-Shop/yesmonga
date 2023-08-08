package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18691b3;
import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18819n2;
import androidx.datastore.preferences.protobuf.Field;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.o3 */
public final class C18832o3 extends GeneratedMessageLite<C18832o3, C18834b> implements C18842p3 {
    /* access modifiers changed from: private */
    public static final C18832o3 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile C18841p2<C18832o3> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private C18753i1.C18770k<Field> fields_ = GeneratedMessageLite.m84971i0();
    private String name_ = "";
    private C18753i1.C18770k<String> oneofs_ = GeneratedMessageLite.m84971i0();
    private C18753i1.C18770k<C18819n2> options_ = GeneratedMessageLite.m84971i0();
    private C18691b3 sourceContext_;
    private int syntax_;

    /* renamed from: androidx.datastore.preferences.protobuf.o3$a */
    public static /* synthetic */ class C18833a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47972a;

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
                f47972a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47972a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47972a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47972a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47972a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47972a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47972a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18832o3.C18833a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.o3$b */
    public static final class C18834b extends GeneratedMessageLite.C18634b<C18832o3, C18834b> implements C18842p3 {
        public /* synthetic */ C18834b(C18833a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18834b mo55268E0(Iterable<? extends Field> iterable) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55217K1(iterable);
            return this;
        }

        /* renamed from: F0 */
        public C18834b mo55269F0(Iterable<String> iterable) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55219L1(iterable);
            return this;
        }

        /* renamed from: G0 */
        public C18834b mo55270G0(Iterable<? extends C18819n2> iterable) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55222N1(iterable);
            return this;
        }

        /* renamed from: H0 */
        public C18834b mo55271H0(int i, Field.C18631b bVar) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55224O1(i, bVar);
            return this;
        }

        /* renamed from: I0 */
        public C18834b mo55272I0(int i, Field field) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55226P1(i, field);
            return this;
        }

        /* renamed from: J0 */
        public C18834b mo55273J0(Field.C18631b bVar) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55228Q1(bVar);
            return this;
        }

        /* renamed from: L0 */
        public C18834b mo55274L0(Field field) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55230R1(field);
            return this;
        }

        /* renamed from: M0 */
        public C18834b mo55275M0(String str) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55232S1(str);
            return this;
        }

        /* renamed from: O0 */
        public C18834b mo55276O0(ByteString byteString) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55233T1(byteString);
            return this;
        }

        /* renamed from: P0 */
        public C18834b mo55277P0(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55234U1(i, bVar);
            return this;
        }

        /* renamed from: Q0 */
        public C18834b mo55278Q0(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55235V1(i, n2Var);
            return this;
        }

        /* renamed from: R0 */
        public C18834b mo55279R0(C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55236W1(bVar);
            return this;
        }

        /* renamed from: S0 */
        public C18834b mo55280S0(C18819n2 n2Var) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55237Z1(n2Var);
            return this;
        }

        /* renamed from: T0 */
        public C18834b mo55281T0() {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55238a2();
            return this;
        }

        /* renamed from: U0 */
        public C18834b mo55282U0() {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55239b2();
            return this;
        }

        /* renamed from: V0 */
        public C18834b mo55283V0() {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55240d2();
            return this;
        }

        /* renamed from: W0 */
        public C18834b mo55284W0() {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55241e2();
            return this;
        }

        /* renamed from: X0 */
        public C18834b mo55285X0() {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55242f2();
            return this;
        }

        /* renamed from: Y0 */
        public C18834b mo55286Y0() {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55243g2();
            return this;
        }

        /* renamed from: Z0 */
        public C18834b mo55287Z0(C18691b3 b3Var) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55267p2(b3Var);
            return this;
        }

        /* renamed from: a1 */
        public C18834b mo55288a1(int i) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55212F2(i);
            return this;
        }

        /* renamed from: b1 */
        public C18834b mo55289b1(int i) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55213G2(i);
            return this;
        }

        /* renamed from: c1 */
        public C18834b mo55290c1(int i, Field.C18631b bVar) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55214H2(i, bVar);
            return this;
        }

        /* renamed from: d1 */
        public C18834b mo55291d1(int i, Field field) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55215I2(i, field);
            return this;
        }

        /* renamed from: e1 */
        public C18834b mo55292e1(String str) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55216J2(str);
            return this;
        }

        /* renamed from: f1 */
        public C18834b mo55293f1(ByteString byteString) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55218K2(byteString);
            return this;
        }

        /* renamed from: g1 */
        public C18834b mo55294g1(int i, String str) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55220L2(i, str);
            return this;
        }

        public Field getFields(int i) {
            return ((C18832o3) this.f47641b).getFields(i);
        }

        public int getFieldsCount() {
            return ((C18832o3) this.f47641b).getFieldsCount();
        }

        public List<Field> getFieldsList() {
            return Collections.unmodifiableList(((C18832o3) this.f47641b).getFieldsList());
        }

        public String getName() {
            return ((C18832o3) this.f47641b).getName();
        }

        public ByteString getNameBytes() {
            return ((C18832o3) this.f47641b).getNameBytes();
        }

        public String getOneofs(int i) {
            return ((C18832o3) this.f47641b).getOneofs(i);
        }

        public ByteString getOneofsBytes(int i) {
            return ((C18832o3) this.f47641b).getOneofsBytes(i);
        }

        public int getOneofsCount() {
            return ((C18832o3) this.f47641b).getOneofsCount();
        }

        public List<String> getOneofsList() {
            return Collections.unmodifiableList(((C18832o3) this.f47641b).getOneofsList());
        }

        public C18819n2 getOptions(int i) {
            return ((C18832o3) this.f47641b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((C18832o3) this.f47641b).getOptionsCount();
        }

        public List<C18819n2> getOptionsList() {
            return Collections.unmodifiableList(((C18832o3) this.f47641b).getOptionsList());
        }

        public C18691b3 getSourceContext() {
            return ((C18832o3) this.f47641b).getSourceContext();
        }

        public Syntax getSyntax() {
            return ((C18832o3) this.f47641b).getSyntax();
        }

        public int getSyntaxValue() {
            return ((C18832o3) this.f47641b).getSyntaxValue();
        }

        /* renamed from: h1 */
        public C18834b mo55295h1(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55221M2(i, bVar);
            return this;
        }

        public boolean hasSourceContext() {
            return ((C18832o3) this.f47641b).hasSourceContext();
        }

        /* renamed from: i1 */
        public C18834b mo55296i1(int i, C18819n2 n2Var) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55223N2(i, n2Var);
            return this;
        }

        /* renamed from: l1 */
        public C18834b mo55297l1(C18691b3.C18693b bVar) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55225O2(bVar);
            return this;
        }

        /* renamed from: m1 */
        public C18834b mo55298m1(C18691b3 b3Var) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55227P2(b3Var);
            return this;
        }

        /* renamed from: n1 */
        public C18834b mo55299n1(Syntax syntax) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55229Q2(syntax);
            return this;
        }

        /* renamed from: o1 */
        public C18834b mo55300o1(int i) {
            mo54025u0();
            ((C18832o3) this.f47641b).mo55231R2(i);
            return this;
        }

        public C18834b() {
            super(C18832o3.DEFAULT_INSTANCE);
        }
    }

    static {
        C18832o3 o3Var = new C18832o3();
        DEFAULT_INSTANCE = o3Var;
        GeneratedMessageLite.m84965a1(C18832o3.class, o3Var);
    }

    /* renamed from: A2 */
    public static C18832o3 m87100A2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (C18832o3) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: B2 */
    public static C18832o3 m87102B2(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18832o3) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: C2 */
    public static C18832o3 m87104C2(byte[] bArr) throws InvalidProtocolBufferException {
        return (C18832o3) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: D2 */
    public static C18832o3 m87106D2(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18832o3) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: E2 */
    public static C18841p2<C18832o3> m87108E2() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: k2 */
    public static C18832o3 m87123k2() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: q2 */
    public static C18834b m87130q2() {
        return (C18834b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: r2 */
    public static C18834b m87132r2(C18832o3 o3Var) {
        return (C18834b) DEFAULT_INSTANCE.mo53982Y(o3Var);
    }

    /* renamed from: s2 */
    public static C18832o3 m87134s2(InputStream inputStream) throws IOException {
        return (C18832o3) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: t2 */
    public static C18832o3 m87136t2(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18832o3) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: u2 */
    public static C18832o3 m87138u2(ByteString byteString) throws InvalidProtocolBufferException {
        return (C18832o3) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: v2 */
    public static C18832o3 m87140v2(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (C18832o3) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: w2 */
    public static C18832o3 m87142w2(C18889w wVar) throws IOException {
        return (C18832o3) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: x2 */
    public static C18832o3 m87144x2(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (C18832o3) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: y2 */
    public static C18832o3 m87146y2(InputStream inputStream) throws IOException {
        return (C18832o3) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: z2 */
    public static C18832o3 m87148z2(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (C18832o3) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: F2 */
    public final void mo55212F2(int i) {
        mo55259h2();
        this.fields_.remove(i);
    }

    /* renamed from: G2 */
    public final void mo55213G2(int i) {
        mo55262j2();
        this.options_.remove(i);
    }

    /* renamed from: H2 */
    public final void mo55214H2(int i, Field.C18631b bVar) {
        mo55259h2();
        this.fields_.set(i, bVar.mo54018g());
    }

    /* renamed from: I2 */
    public final void mo55215I2(int i, Field field) {
        field.getClass();
        mo55259h2();
        this.fields_.set(i, field);
    }

    /* renamed from: J2 */
    public final void mo55216J2(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: K1 */
    public final void mo55217K1(Iterable<? extends Field> iterable) {
        mo55259h2();
        C18665a.m85406d(iterable, this.fields_);
    }

    /* renamed from: K2 */
    public final void mo55218K2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.name_ = byteString.mo53741S0();
    }

    /* renamed from: L1 */
    public final void mo55219L1(Iterable<String> iterable) {
        mo55261i2();
        C18665a.m85406d(iterable, this.oneofs_);
    }

    /* renamed from: L2 */
    public final void mo55220L2(int i, String str) {
        str.getClass();
        mo55261i2();
        this.oneofs_.set(i, str);
    }

    /* renamed from: M2 */
    public final void mo55221M2(int i, C18819n2.C18821b bVar) {
        mo55262j2();
        this.options_.set(i, bVar.mo54018g());
    }

    /* renamed from: N1 */
    public final void mo55222N1(Iterable<? extends C18819n2> iterable) {
        mo55262j2();
        C18665a.m85406d(iterable, this.options_);
    }

    /* renamed from: N2 */
    public final void mo55223N2(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo55262j2();
        this.options_.set(i, n2Var);
    }

    /* renamed from: O1 */
    public final void mo55224O1(int i, Field.C18631b bVar) {
        mo55259h2();
        this.fields_.add(i, bVar.mo54018g());
    }

    /* renamed from: O2 */
    public final void mo55225O2(C18691b3.C18693b bVar) {
        this.sourceContext_ = (C18691b3) bVar.mo54018g();
    }

    /* renamed from: P1 */
    public final void mo55226P1(int i, Field field) {
        field.getClass();
        mo55259h2();
        this.fields_.add(i, field);
    }

    /* renamed from: P2 */
    public final void mo55227P2(C18691b3 b3Var) {
        b3Var.getClass();
        this.sourceContext_ = b3Var;
    }

    /* renamed from: Q1 */
    public final void mo55228Q1(Field.C18631b bVar) {
        mo55259h2();
        this.fields_.add(bVar.mo54018g());
    }

    /* renamed from: Q2 */
    public final void mo55229Q2(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    /* renamed from: R1 */
    public final void mo55230R1(Field field) {
        field.getClass();
        mo55259h2();
        this.fields_.add(field);
    }

    /* renamed from: R2 */
    public final void mo55231R2(int i) {
        this.syntax_ = i;
    }

    /* renamed from: S1 */
    public final void mo55232S1(String str) {
        str.getClass();
        mo55261i2();
        this.oneofs_.add(str);
    }

    /* renamed from: T1 */
    public final void mo55233T1(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        mo55261i2();
        this.oneofs_.add(byteString.mo53741S0());
    }

    /* renamed from: U1 */
    public final void mo55234U1(int i, C18819n2.C18821b bVar) {
        mo55262j2();
        this.options_.add(i, bVar.mo54018g());
    }

    /* renamed from: V1 */
    public final void mo55235V1(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo55262j2();
        this.options_.add(i, n2Var);
    }

    /* renamed from: W1 */
    public final void mo55236W1(C18819n2.C18821b bVar) {
        mo55262j2();
        this.options_.add(bVar.mo54018g());
    }

    /* renamed from: Z1 */
    public final void mo55237Z1(C18819n2 n2Var) {
        n2Var.getClass();
        mo55262j2();
        this.options_.add(n2Var);
    }

    /* renamed from: a2 */
    public final void mo55238a2() {
        this.fields_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18833a.f47972a[methodToInvoke.ordinal()]) {
            case 1:
                return new C18832o3();
            case 2:
                return new C18834b((C18833a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", C18819n2.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<C18832o3> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (C18832o3.class) {
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
    public final void mo55239b2() {
        this.name_ = m87123k2().getName();
    }

    /* renamed from: d2 */
    public final void mo55240d2() {
        this.oneofs_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: e2 */
    public final void mo55241e2() {
        this.options_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: f2 */
    public final void mo55242f2() {
        this.sourceContext_ = null;
    }

    /* renamed from: g2 */
    public final void mo55243g2() {
        this.syntax_ = 0;
    }

    public Field getFields(int i) {
        return this.fields_.get(i);
    }

    public int getFieldsCount() {
        return this.fields_.size();
    }

    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m84390e0(this.name_);
    }

    public String getOneofs(int i) {
        return this.oneofs_.get(i);
    }

    public ByteString getOneofsBytes(int i) {
        return ByteString.m84390e0(this.oneofs_.get(i));
    }

    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    public List<String> getOneofsList() {
        return this.oneofs_;
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

    /* renamed from: h2 */
    public final void mo55259h2() {
        if (!this.fields_.mo54405T()) {
            this.fields_ = GeneratedMessageLite.m84981z0(this.fields_);
        }
    }

    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    /* renamed from: i2 */
    public final void mo55261i2() {
        if (!this.oneofs_.mo54405T()) {
            this.oneofs_ = GeneratedMessageLite.m84981z0(this.oneofs_);
        }
    }

    /* renamed from: j2 */
    public final void mo55262j2() {
        if (!this.options_.mo54405T()) {
            this.options_ = GeneratedMessageLite.m84981z0(this.options_);
        }
    }

    /* renamed from: l2 */
    public C18903x0 mo55263l2(int i) {
        return this.fields_.get(i);
    }

    /* renamed from: m2 */
    public List<? extends C18903x0> mo55264m2() {
        return this.fields_;
    }

    /* renamed from: n2 */
    public C18831o2 mo55265n2(int i) {
        return this.options_.get(i);
    }

    /* renamed from: o2 */
    public List<? extends C18831o2> mo55266o2() {
        return this.options_;
    }

    /* renamed from: p2 */
    public final void mo55267p2(C18691b3 b3Var) {
        b3Var.getClass();
        C18691b3 b3Var2 = this.sourceContext_;
        if (b3Var2 == null || b3Var2 == C18691b3.m85587h1()) {
            this.sourceContext_ = b3Var;
        } else {
            this.sourceContext_ = (C18691b3) ((C18691b3.C18693b) C18691b3.m85589j1(this.sourceContext_).mo54029y0(b3Var)).mo54011Q();
        }
    }
}
