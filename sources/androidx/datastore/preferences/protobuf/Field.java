package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C18753i1;
import androidx.datastore.preferences.protobuf.C18819n2;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Field extends GeneratedMessageLite<Field, C18631b> implements C18903x0 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile C18841p2<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private String defaultValue_ = "";
    private String jsonName_ = "";
    private int kind_;
    private String name_ = "";
    private int number_;
    private int oneofIndex_;
    private C18753i1.C18770k<C18819n2> options_ = GeneratedMessageLite.m84971i0();
    private boolean packed_;
    private String typeUrl_ = "";

    public enum Cardinality implements C18753i1.C18756c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: f */
        public static final int f47519f = 0;

        /* renamed from: g */
        public static final int f47520g = 1;

        /* renamed from: v */
        public static final int f47521v = 2;

        /* renamed from: w */
        public static final int f47522w = 3;

        /* renamed from: x */
        public static final C18753i1.C18757d<Cardinality> f47523x = null;
        private final int value;

        /* renamed from: androidx.datastore.preferences.protobuf.Field$Cardinality$a */
        public static class C18626a implements C18753i1.C18757d<Cardinality> {
            /* renamed from: b */
            public Cardinality mo53931a(int i) {
                return Cardinality.m84881b(i);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.Field$Cardinality$b */
        public static final class C18627b implements C18753i1.C18758e {

            /* renamed from: a */
            public static final C18753i1.C18758e f47525a = null;

            static {
                f47525a = new C18627b();
            }

            /* renamed from: a */
            public boolean mo53933a(int i) {
                return Cardinality.m84881b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f47523x = new C18626a();
        }

        /* access modifiers changed from: public */
        Cardinality(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static Cardinality m84881b(int i) {
            if (i == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        /* renamed from: g */
        public static C18753i1.C18757d<Cardinality> m84882g() {
            return f47523x;
        }

        /* renamed from: q */
        public static C18753i1.C18758e m84883q() {
            return C18627b.f47525a;
        }

        @Deprecated
        /* renamed from: r */
        public static Cardinality m84884r(int i) {
            return m84881b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum Kind implements C18753i1.C18756c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);
        

        /* renamed from: J0 */
        public static final int f47531J0 = 0;

        /* renamed from: K0 */
        public static final int f47532K0 = 1;

        /* renamed from: L0 */
        public static final int f47533L0 = 2;

        /* renamed from: M0 */
        public static final int f47534M0 = 3;

        /* renamed from: N0 */
        public static final int f47535N0 = 4;

        /* renamed from: O0 */
        public static final int f47536O0 = 5;

        /* renamed from: P0 */
        public static final int f47537P0 = 6;

        /* renamed from: Q0 */
        public static final int f47538Q0 = 7;

        /* renamed from: R0 */
        public static final int f47539R0 = 8;

        /* renamed from: S0 */
        public static final int f47540S0 = 9;

        /* renamed from: T0 */
        public static final int f47541T0 = 10;

        /* renamed from: U0 */
        public static final int f47542U0 = 11;

        /* renamed from: V0 */
        public static final int f47543V0 = 12;

        /* renamed from: W0 */
        public static final int f47544W0 = 13;

        /* renamed from: X0 */
        public static final int f47546X0 = 14;

        /* renamed from: Y0 */
        public static final int f47548Y0 = 15;

        /* renamed from: Z0 */
        public static final int f47550Z0 = 16;

        /* renamed from: a1 */
        public static final int f47552a1 = 17;

        /* renamed from: b1 */
        public static final int f47554b1 = 18;

        /* renamed from: c1 */
        public static final C18753i1.C18757d<Kind> f47556c1 = null;
        private final int value;

        /* renamed from: androidx.datastore.preferences.protobuf.Field$Kind$a */
        public static class C18628a implements C18753i1.C18757d<Kind> {
            /* renamed from: b */
            public Kind mo53931a(int i) {
                return Kind.m84888b(i);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.Field$Kind$b */
        public static final class C18629b implements C18753i1.C18758e {

            /* renamed from: a */
            public static final C18753i1.C18758e f47567a = null;

            static {
                f47567a = new C18629b();
            }

            /* renamed from: a */
            public boolean mo53933a(int i) {
                return Kind.m84888b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f47556c1 = new C18628a();
        }

        /* access modifiers changed from: public */
        Kind(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static Kind m84888b(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        /* renamed from: g */
        public static C18753i1.C18757d<Kind> m84889g() {
            return f47556c1;
        }

        /* renamed from: q */
        public static C18753i1.C18758e m84890q() {
            return C18629b.f47567a;
        }

        @Deprecated
        /* renamed from: r */
        public static Kind m84891r(int i) {
            return m84888b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Field$a */
    public static /* synthetic */ class C18630a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47568a;

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
                f47568a = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47568a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47568a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47568a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47568a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47568a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47568a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Field.C18630a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Field$b */
    public static final class C18631b extends GeneratedMessageLite.C18634b<Field, C18631b> implements C18903x0 {
        public /* synthetic */ C18631b(C18630a aVar) {
            this();
        }

        /* renamed from: E0 */
        public C18631b mo53935E0(Iterable<? extends C18819n2> iterable) {
            mo54025u0();
            ((Field) this.f47641b).mo53886K1(iterable);
            return this;
        }

        /* renamed from: F0 */
        public C18631b mo53936F0(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((Field) this.f47641b).mo53888L1(i, bVar);
            return this;
        }

        /* renamed from: G0 */
        public C18631b mo53937G0(int i, C18819n2 n2Var) {
            mo54025u0();
            ((Field) this.f47641b).mo53891N1(i, n2Var);
            return this;
        }

        /* renamed from: H0 */
        public C18631b mo53938H0(C18819n2.C18821b bVar) {
            mo54025u0();
            ((Field) this.f47641b).mo53893O1(bVar);
            return this;
        }

        /* renamed from: I0 */
        public C18631b mo53939I0(C18819n2 n2Var) {
            mo54025u0();
            ((Field) this.f47641b).mo53894P1(n2Var);
            return this;
        }

        /* renamed from: J0 */
        public C18631b mo53940J0() {
            mo54025u0();
            ((Field) this.f47641b).mo53895Q1();
            return this;
        }

        /* renamed from: L0 */
        public C18631b mo53941L0() {
            mo54025u0();
            ((Field) this.f47641b).mo53896R1();
            return this;
        }

        /* renamed from: M0 */
        public C18631b mo53942M0() {
            mo54025u0();
            ((Field) this.f47641b).mo53897S1();
            return this;
        }

        /* renamed from: O0 */
        public C18631b mo53943O0() {
            mo54025u0();
            ((Field) this.f47641b).mo53898T1();
            return this;
        }

        /* renamed from: P0 */
        public C18631b mo53944P0() {
            mo54025u0();
            ((Field) this.f47641b).mo53899U1();
            return this;
        }

        /* renamed from: Q0 */
        public C18631b mo53945Q0() {
            mo54025u0();
            ((Field) this.f47641b).mo53900V1();
            return this;
        }

        /* renamed from: R0 */
        public C18631b mo53946R0() {
            mo54025u0();
            ((Field) this.f47641b).mo53901W1();
            return this;
        }

        /* renamed from: S0 */
        public C18631b mo53947S0() {
            mo54025u0();
            ((Field) this.f47641b).mo53902Z1();
            return this;
        }

        /* renamed from: T0 */
        public C18631b mo53948T0() {
            mo54025u0();
            ((Field) this.f47641b).mo53903a2();
            return this;
        }

        /* renamed from: U0 */
        public C18631b mo53949U0() {
            mo54025u0();
            ((Field) this.f47641b).mo53904b2();
            return this;
        }

        /* renamed from: V0 */
        public C18631b mo53950V0(int i) {
            mo54025u0();
            ((Field) this.f47641b).mo53926w2(i);
            return this;
        }

        /* renamed from: W0 */
        public C18631b mo53951W0(Cardinality cardinality) {
            mo54025u0();
            ((Field) this.f47641b).mo53927x2(cardinality);
            return this;
        }

        /* renamed from: X0 */
        public C18631b mo53952X0(int i) {
            mo54025u0();
            ((Field) this.f47641b).mo53928y2(i);
            return this;
        }

        /* renamed from: Y0 */
        public C18631b mo53953Y0(String str) {
            mo54025u0();
            ((Field) this.f47641b).mo53929z2(str);
            return this;
        }

        /* renamed from: Z0 */
        public C18631b mo53954Z0(ByteString byteString) {
            mo54025u0();
            ((Field) this.f47641b).mo53876A2(byteString);
            return this;
        }

        /* renamed from: a1 */
        public C18631b mo53955a1(String str) {
            mo54025u0();
            ((Field) this.f47641b).mo53877B2(str);
            return this;
        }

        /* renamed from: b1 */
        public C18631b mo53956b1(ByteString byteString) {
            mo54025u0();
            ((Field) this.f47641b).mo53878C2(byteString);
            return this;
        }

        /* renamed from: c1 */
        public C18631b mo53957c1(Kind kind) {
            mo54025u0();
            ((Field) this.f47641b).mo53879D2(kind);
            return this;
        }

        /* renamed from: d1 */
        public C18631b mo53958d1(int i) {
            mo54025u0();
            ((Field) this.f47641b).mo53880E2(i);
            return this;
        }

        /* renamed from: e1 */
        public C18631b mo53959e1(String str) {
            mo54025u0();
            ((Field) this.f47641b).mo53881F2(str);
            return this;
        }

        /* renamed from: f1 */
        public C18631b mo53960f1(ByteString byteString) {
            mo54025u0();
            ((Field) this.f47641b).mo53882G2(byteString);
            return this;
        }

        /* renamed from: g1 */
        public C18631b mo53961g1(int i) {
            mo54025u0();
            ((Field) this.f47641b).mo53883H2(i);
            return this;
        }

        public Cardinality getCardinality() {
            return ((Field) this.f47641b).getCardinality();
        }

        public int getCardinalityValue() {
            return ((Field) this.f47641b).getCardinalityValue();
        }

        public String getDefaultValue() {
            return ((Field) this.f47641b).getDefaultValue();
        }

        public ByteString getDefaultValueBytes() {
            return ((Field) this.f47641b).getDefaultValueBytes();
        }

        public String getJsonName() {
            return ((Field) this.f47641b).getJsonName();
        }

        public ByteString getJsonNameBytes() {
            return ((Field) this.f47641b).getJsonNameBytes();
        }

        public Kind getKind() {
            return ((Field) this.f47641b).getKind();
        }

        public int getKindValue() {
            return ((Field) this.f47641b).getKindValue();
        }

        public String getName() {
            return ((Field) this.f47641b).getName();
        }

        public ByteString getNameBytes() {
            return ((Field) this.f47641b).getNameBytes();
        }

        public int getNumber() {
            return ((Field) this.f47641b).getNumber();
        }

        public int getOneofIndex() {
            return ((Field) this.f47641b).getOneofIndex();
        }

        public C18819n2 getOptions(int i) {
            return ((Field) this.f47641b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Field) this.f47641b).getOptionsCount();
        }

        public List<C18819n2> getOptionsList() {
            return Collections.unmodifiableList(((Field) this.f47641b).getOptionsList());
        }

        public boolean getPacked() {
            return ((Field) this.f47641b).getPacked();
        }

        public String getTypeUrl() {
            return ((Field) this.f47641b).getTypeUrl();
        }

        public ByteString getTypeUrlBytes() {
            return ((Field) this.f47641b).getTypeUrlBytes();
        }

        /* renamed from: h1 */
        public C18631b mo53962h1(int i) {
            mo54025u0();
            ((Field) this.f47641b).mo53884I2(i);
            return this;
        }

        /* renamed from: i1 */
        public C18631b mo53963i1(int i, C18819n2.C18821b bVar) {
            mo54025u0();
            ((Field) this.f47641b).mo53885J2(i, bVar);
            return this;
        }

        /* renamed from: l1 */
        public C18631b mo53964l1(int i, C18819n2 n2Var) {
            mo54025u0();
            ((Field) this.f47641b).mo53887K2(i, n2Var);
            return this;
        }

        /* renamed from: m1 */
        public C18631b mo53965m1(boolean z) {
            mo54025u0();
            ((Field) this.f47641b).mo53889L2(z);
            return this;
        }

        /* renamed from: n1 */
        public C18631b mo53966n1(String str) {
            mo54025u0();
            ((Field) this.f47641b).mo53890M2(str);
            return this;
        }

        /* renamed from: o1 */
        public C18631b mo53967o1(ByteString byteString) {
            mo54025u0();
            ((Field) this.f47641b).mo53892N2(byteString);
            return this;
        }

        public C18631b() {
            super(Field.DEFAULT_INSTANCE);
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.m84965a1(Field.class, field);
    }

    /* renamed from: e2 */
    public static Field m84807e2() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: h2 */
    public static C18631b m84811h2() {
        return (C18631b) DEFAULT_INSTANCE.mo53981V();
    }

    /* renamed from: i2 */
    public static C18631b m84813i2(Field field) {
        return (C18631b) DEFAULT_INSTANCE.mo53982Y(field);
    }

    /* renamed from: j2 */
    public static Field m84815j2(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.m84944G0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: k2 */
    public static Field m84817k2(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (Field) GeneratedMessageLite.m84945H0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: l2 */
    public static Field m84819l2(ByteString byteString) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.m84946I0(DEFAULT_INSTANCE, byteString);
    }

    /* renamed from: m2 */
    public static Field m84821m2(ByteString byteString, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.m84947J0(DEFAULT_INSTANCE, byteString, p0Var);
    }

    /* renamed from: n2 */
    public static Field m84823n2(C18889w wVar) throws IOException {
        return (Field) GeneratedMessageLite.m84948L0(DEFAULT_INSTANCE, wVar);
    }

    /* renamed from: o2 */
    public static Field m84825o2(C18889w wVar, C18836p0 p0Var) throws IOException {
        return (Field) GeneratedMessageLite.m84949M0(DEFAULT_INSTANCE, wVar, p0Var);
    }

    /* renamed from: p2 */
    public static Field m84827p2(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.m84950N0(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: q2 */
    public static Field m84829q2(InputStream inputStream, C18836p0 p0Var) throws IOException {
        return (Field) GeneratedMessageLite.m84951O0(DEFAULT_INSTANCE, inputStream, p0Var);
    }

    /* renamed from: r2 */
    public static Field m84831r2(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.m84952P0(DEFAULT_INSTANCE, byteBuffer);
    }

    /* renamed from: s2 */
    public static Field m84833s2(ByteBuffer byteBuffer, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.m84953Q0(DEFAULT_INSTANCE, byteBuffer, p0Var);
    }

    /* renamed from: t2 */
    public static Field m84835t2(byte[] bArr) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.m84955R0(DEFAULT_INSTANCE, bArr);
    }

    /* renamed from: u2 */
    public static Field m84837u2(byte[] bArr, C18836p0 p0Var) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.m84956S0(DEFAULT_INSTANCE, bArr, p0Var);
    }

    /* renamed from: v2 */
    public static C18841p2<Field> m84839v2() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* renamed from: A2 */
    public final void mo53876A2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.defaultValue_ = byteString.mo53741S0();
    }

    /* renamed from: B2 */
    public final void mo53877B2(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* renamed from: C2 */
    public final void mo53878C2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.jsonName_ = byteString.mo53741S0();
    }

    /* renamed from: D2 */
    public final void mo53879D2(Kind kind) {
        kind.getClass();
        this.kind_ = kind.getNumber();
    }

    /* renamed from: E2 */
    public final void mo53880E2(int i) {
        this.kind_ = i;
    }

    /* renamed from: F2 */
    public final void mo53881F2(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* renamed from: G2 */
    public final void mo53882G2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.name_ = byteString.mo53741S0();
    }

    /* renamed from: H2 */
    public final void mo53883H2(int i) {
        this.number_ = i;
    }

    /* renamed from: I2 */
    public final void mo53884I2(int i) {
        this.oneofIndex_ = i;
    }

    /* renamed from: J2 */
    public final void mo53885J2(int i, C18819n2.C18821b bVar) {
        mo53905d2();
        this.options_.set(i, bVar.mo54018g());
    }

    /* renamed from: K1 */
    public final void mo53886K1(Iterable<? extends C18819n2> iterable) {
        mo53905d2();
        C18665a.m85406d(iterable, this.options_);
    }

    /* renamed from: K2 */
    public final void mo53887K2(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo53905d2();
        this.options_.set(i, n2Var);
    }

    /* renamed from: L1 */
    public final void mo53888L1(int i, C18819n2.C18821b bVar) {
        mo53905d2();
        this.options_.add(i, bVar.mo54018g());
    }

    /* renamed from: L2 */
    public final void mo53889L2(boolean z) {
        this.packed_ = z;
    }

    /* renamed from: M2 */
    public final void mo53890M2(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: N1 */
    public final void mo53891N1(int i, C18819n2 n2Var) {
        n2Var.getClass();
        mo53905d2();
        this.options_.add(i, n2Var);
    }

    /* renamed from: N2 */
    public final void mo53892N2(ByteString byteString) {
        byteString.getClass();
        C18665a.m85407p(byteString);
        this.typeUrl_ = byteString.mo53741S0();
    }

    /* renamed from: O1 */
    public final void mo53893O1(C18819n2.C18821b bVar) {
        mo53905d2();
        this.options_.add(bVar.mo54018g());
    }

    /* renamed from: P1 */
    public final void mo53894P1(C18819n2 n2Var) {
        n2Var.getClass();
        mo53905d2();
        this.options_.add(n2Var);
    }

    /* renamed from: Q1 */
    public final void mo53895Q1() {
        this.cardinality_ = 0;
    }

    /* renamed from: R1 */
    public final void mo53896R1() {
        this.defaultValue_ = m84807e2().getDefaultValue();
    }

    /* renamed from: S1 */
    public final void mo53897S1() {
        this.jsonName_ = m84807e2().getJsonName();
    }

    /* renamed from: T1 */
    public final void mo53898T1() {
        this.kind_ = 0;
    }

    /* renamed from: U1 */
    public final void mo53899U1() {
        this.name_ = m84807e2().getName();
    }

    /* renamed from: V1 */
    public final void mo53900V1() {
        this.number_ = 0;
    }

    /* renamed from: W1 */
    public final void mo53901W1() {
        this.oneofIndex_ = 0;
    }

    /* renamed from: Z1 */
    public final void mo53902Z1() {
        this.options_ = GeneratedMessageLite.m84971i0();
    }

    /* renamed from: a2 */
    public final void mo53903a2() {
        this.packed_ = false;
    }

    /* renamed from: b0 */
    public final Object mo53621b0(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C18630a.f47568a[methodToInvoke.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new C18631b((C18630a) null);
            case 3:
                return GeneratedMessageLite.m84941D0(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", C18819n2.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C18841p2<Field> p2Var = PARSER;
                if (p2Var == null) {
                    synchronized (Field.class) {
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
    public final void mo53904b2() {
        this.typeUrl_ = m84807e2().getTypeUrl();
    }

    /* renamed from: d2 */
    public final void mo53905d2() {
        if (!this.options_.mo54405T()) {
            this.options_ = GeneratedMessageLite.m84981z0(this.options_);
        }
    }

    /* renamed from: f2 */
    public C18831o2 mo53906f2(int i) {
        return this.options_.get(i);
    }

    /* renamed from: g2 */
    public List<? extends C18831o2> mo53907g2() {
        return this.options_;
    }

    public Cardinality getCardinality() {
        Cardinality b = Cardinality.m84881b(this.cardinality_);
        if (b == null) {
            return Cardinality.UNRECOGNIZED;
        }
        return b;
    }

    public int getCardinalityValue() {
        return this.cardinality_;
    }

    public String getDefaultValue() {
        return this.defaultValue_;
    }

    public ByteString getDefaultValueBytes() {
        return ByteString.m84390e0(this.defaultValue_);
    }

    public String getJsonName() {
        return this.jsonName_;
    }

    public ByteString getJsonNameBytes() {
        return ByteString.m84390e0(this.jsonName_);
    }

    public Kind getKind() {
        Kind b = Kind.m84888b(this.kind_);
        if (b == null) {
            return Kind.UNRECOGNIZED;
        }
        return b;
    }

    public int getKindValue() {
        return this.kind_;
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

    public int getOneofIndex() {
        return this.oneofIndex_;
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

    public boolean getPacked() {
        return this.packed_;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public ByteString getTypeUrlBytes() {
        return ByteString.m84390e0(this.typeUrl_);
    }

    /* renamed from: w2 */
    public final void mo53926w2(int i) {
        mo53905d2();
        this.options_.remove(i);
    }

    /* renamed from: x2 */
    public final void mo53927x2(Cardinality cardinality) {
        cardinality.getClass();
        this.cardinality_ = cardinality.getNumber();
    }

    /* renamed from: y2 */
    public final void mo53928y2(int i) {
        this.cardinality_ = i;
    }

    /* renamed from: z2 */
    public final void mo53929z2(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }
}
