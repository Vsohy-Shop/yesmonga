package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18738g3;
import androidx.datastore.preferences.protobuf.C18838p1;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value extends GeneratedMessageLite<Value, C18656b> implements C18686a4 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile C18841p2<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    public enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);
        
        private final int value;

        /* access modifiers changed from: public */
        KindCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static KindCase m85323b(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Deprecated
        /* renamed from: g */
        public static KindCase m85324g(int i) {
            return m85323b(i);
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Value$a */
    public static /* synthetic */ class C18655a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47716a;

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
                f47716a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47716a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47716a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47716a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47716a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47716a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47716a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Value.C18655a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Value$b */
    public static final class C18656b extends GeneratedMessageLite.C18634b<Value, C18656b> implements C18686a4 {
        public /* synthetic */ C18656b(C18655a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18656b mo54182E0() {
            mo54025u0();
            ((Value) this.f47641b).mo54177w1();
            return this;
        }

        /* renamed from: F0 */
        public C18656b mo54183F0() {
            mo54025u0();
            ((Value) this.f47641b).mo54178x1();
            return this;
        }

        /* renamed from: G0 */
        public C18656b mo54184G0() {
            mo54025u0();
            ((Value) this.f47641b).mo54179y1();
            return this;
        }

        /* renamed from: H0 */
        public C18656b mo54185H0() {
            mo54025u0();
            ((Value) this.f47641b).mo54180z1();
            return this;
        }

        /* renamed from: I0 */
        public C18656b mo54186I0() {
            mo54025u0();
            ((Value) this.f47641b).mo54151A1();
            return this;
        }

        /* renamed from: J0 */
        public C18656b mo54187J0() {
            mo54025u0();
            ((Value) this.f47641b).mo54152B1();
            return this;
        }

        /* renamed from: L0 */
        public C18656b mo54188L0() {
            mo54025u0();
            ((Value) this.f47641b).mo54153C1();
            return this;
        }

        /* renamed from: M0 */
        public C18656b mo54189M0(C18838p1 p1Var) {
            mo54025u0();
            ((Value) this.f47641b).mo54154E1(p1Var);
            return this;
        }

        /* renamed from: O0 */
        public C18656b mo54190O0(C18738g3 g3Var) {
            mo54025u0();
            ((Value) this.f47641b).mo54155F1(g3Var);
            return this;
        }

        /* renamed from: P0 */
        public C18656b mo54191P0(boolean z) {
            mo54025u0();
            ((Value) this.f47641b).mo54156W1(z);
            return this;
        }

        /* renamed from: Q0 */
        public C18656b mo54192Q0(C18838p1.C18840b bVar) {
            mo54025u0();
            ((Value) this.f47641b).mo54157Z1(bVar);
            return this;
        }

        /* renamed from: R0 */
        public C18656b mo54193R0(C18838p1 p1Var) {
            mo54025u0();
            ((Value) this.f47641b).mo54158a2(p1Var);
            return this;
        }

        /* renamed from: S0 */
        public C18656b mo54194S0(NullValue nullValue) {
            mo54025u0();
            ((Value) this.f47641b).mo54159b2(nullValue);
            return this;
        }

        /* renamed from: T0 */
        public C18656b mo54195T0(int i) {
            mo54025u0();
            ((Value) this.f47641b).mo54160d2(i);
            return this;
        }

        /* renamed from: U0 */
        public C18656b mo54196U0(double d) {
            mo54025u0();
            ((Value) this.f47641b).mo54161e2(d);
            return this;
        }

        /* renamed from: V0 */
        public C18656b mo54197V0(String str) {
            mo54025u0();
            ((Value) this.f47641b).mo54162f2(str);
            return this;
        }

        /* renamed from: W0 */
        public C18656b mo54198W0(ByteString byteString) {
            mo54025u0();
            ((Value) this.f47641b).mo54163g2(byteString);
            return this;
        }

        /* renamed from: X0 */
        public C18656b mo54199X0(C18738g3.C18740b bVar) {
            mo54025u0();
            ((Value) this.f47641b).mo54173h2(bVar);
            return this;
        }

        /* renamed from: Y0 */
        public C18656b mo54200Y0(C18738g3 g3Var) {
            mo54025u0();
            ((Value) this.f47641b).mo54176i2(g3Var);
            return this;
        }

        public boolean getBoolValue() {
            return ((Value) this.f47641b).getBoolValue();
        }

        public KindCase getKindCase() {
            return ((Value) this.f47641b).getKindCase();
        }

        public C18838p1 getListValue() {
            return ((Value) this.f47641b).getListValue();
        }

        public NullValue getNullValue() {
            return ((Value) this.f47641b).getNullValue();
        }

        public int getNullValueValue() {
            return ((Value) this.f47641b).getNullValueValue();
        }

        public double getNumberValue() {
            return ((Value) this.f47641b).getNumberValue();
        }

        public String getStringValue() {
            return ((Value) this.f47641b).getStringValue();
        }

        public ByteString getStringValueBytes() {
            return ((Value) this.f47641b).getStringValueBytes();
        }

        public C18738g3 getStructValue() {
            return ((Value) this.f47641b).getStructValue();
        }

        public boolean hasListValue() {
            return ((Value) this.f47641b).hasListValue();
        }

        public boolean hasStructValue() {
            return ((Value) this.f47641b).hasStructValue();
        }

        public C18656b() {
            super(Value.DEFAULT_INSTANCE);
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.m84965a1(Value.class, value);
    }

    /* renamed from: D1 */
    public static Value m85267D1() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: G1 */
    public static C18656b m85268G1() {
        return (C18656b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: H1 */
    public static C18656b m85269H1(Value value) {
        return (C18656b) DEFAULT_INSTANCE.mo53982Y(value);
    }

    /* renamed from: I1 */
    public static Value m85270I1(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: J1 */
    public static Value m85271J1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (Value) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: K1 */
    public static Value m85272K1(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: L1 */
    public static Value m85273L1(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: N1 */
    public static Value m85274N1(C18889w wVar) throws IOException {
        return (Value) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: O1 */
    public static Value m85275O1(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (Value) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: P1 */
    public static Value m85276P1(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: Q1 */
    public static Value m85277Q1(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (Value) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: R1 */
    public static Value m85278R1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: S1 */
    public static Value m85279S1(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: T1 */
    public static Value m85280T1(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: U1 */
    public static Value m85281U1(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: V1 */
    public static C18841p2<Value> m85282V1() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: A1 */
    public final void mo54151A1() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: B1 */
    public final void mo54152B1() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: C1 */
    public final void mo54153C1() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: E1 */
    public final void mo54154E1(C18838p1 p1Var) {
        p1Var.getClass();
        if (this.kindCase_ != 6 || this.kind_ == C18838p1.m87253t1()) {
            this.kind_ = p1Var;
        } else {
            this.kind_ = ((C18838p1.C18840b) C18838p1.m87255x1((C18838p1) this.kind_).mo54029y0(p1Var)).mo54011Q();
        }
        this.kindCase_ = 6;
    }

    /* renamed from: F1 */
    public final void mo54155F1(C18738g3 g3Var) {
        g3Var.getClass();
        if (this.kindCase_ != 5 || this.kind_ == C18738g3.m86040e1()) {
            this.kind_ = g3Var;
        } else {
            this.kind_ = ((C18738g3.C18740b) C18738g3.m86042j1((C18738g3) this.kind_).mo54029y0(g3Var)).mo54011Q();
        }
        this.kindCase_ = 5;
    }

    /* renamed from: W1 */
    public final void mo54156W1(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    /* renamed from: Z1 */
    public final void mo54157Z1(C18838p1.C18840b bVar) {
        this.kind_ = bVar.mo54018g();
        this.kindCase_ = 6;
    }

    /* renamed from: a2 */
    public final void mo54158a2(C18838p1 p1Var) {
        p1Var.getClass();
        this.kind_ = p1Var;
        this.kindCase_ = 6;
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18655a.f47716a[methodToInvoke.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new C18656b((C18655a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", C18738g3.class, C18838p1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<Value> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (Value.class) {
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
    public final void mo54159b2(NullValue nullValue) {
        nullValue.getClass();
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(nullValue.getNumber());
    }

    /* renamed from: d2 */
    public final void mo54160d2(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    /* renamed from: e2 */
    public final void mo54161e2(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }

    /* renamed from: f2 */
    public final void mo54162f2(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* renamed from: g2 */
    public final void mo54163g2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.kindCase_ = 3;
        this.kind_ = byteString.mo53741S0();
    }

    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public KindCase getKindCase() {
        return KindCase.m85323b(this.kindCase_);
    }

    public C18838p1 getListValue() {
        if (this.kindCase_ == 6) {
            return (C18838p1) this.kind_;
        }
        return C18838p1.m87253t1();
    }

    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue b = NullValue.m85135b(((Integer) this.kind_).intValue());
        if (b == null) {
            return NullValue.UNRECOGNIZED;
        }
        return b;
    }

    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    public String getStringValue() {
        if (this.kindCase_ == 3) {
            return (String) this.kind_;
        }
        return "";
    }

    public ByteString getStringValueBytes() {
        String str;
        if (this.kindCase_ == 3) {
            str = (String) this.kind_;
        } else {
            str = "";
        }
        return ByteString.m84390e0(str);
    }

    public C18738g3 getStructValue() {
        if (this.kindCase_ == 5) {
            return (C18738g3) this.kind_;
        }
        return C18738g3.m86040e1();
    }

    /* renamed from: h2 */
    public final void mo54173h2(C18738g3.C18740b bVar) {
        this.kind_ = bVar.mo54018g();
        this.kindCase_ = 5;
    }

    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    /* renamed from: i2 */
    public final void mo54176i2(C18738g3 g3Var) {
        g3Var.getClass();
        this.kind_ = g3Var;
        this.kindCase_ = 5;
    }

    /* renamed from: w1 */
    public final void mo54177w1() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: x1 */
    public final void mo54178x1() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* renamed from: y1 */
    public final void mo54179y1() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* renamed from: z1 */
    public final void mo54180z1() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }
}
