package com.google.protobuf;

import com.google.protobuf.C34471v0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Option;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Field extends GeneratedMessageLite<Field, C34255b> implements C34420n0 {
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
    private static volatile C34504y1<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private String defaultValue_ = "";
    private String jsonName_ = "";
    private int kind_;
    private String name_ = "";
    private int number_;
    private int oneofIndex_;
    private C34471v0.C34488k<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private boolean packed_;
    private String typeUrl_ = "";

    public enum Cardinality implements C34471v0.C34474c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: f */
        public static final int f82925f = 0;

        /* renamed from: g */
        public static final int f82926g = 1;

        /* renamed from: v */
        public static final int f82927v = 2;

        /* renamed from: w */
        public static final int f82928w = 3;

        /* renamed from: x */
        public static final C34471v0.C34475d<Cardinality> f82929x = null;
        private final int value;

        /* renamed from: com.google.protobuf.Field$Cardinality$a */
        public static class C34250a implements C34471v0.C34475d<Cardinality> {
            /* renamed from: b */
            public Cardinality mo93187a(int i) {
                return Cardinality.m138273b(i);
            }
        }

        /* renamed from: com.google.protobuf.Field$Cardinality$b */
        public static final class C34251b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f82931a = null;

            static {
                f82931a = new C34251b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return Cardinality.m138273b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f82929x = new C34250a();
        }

        /* access modifiers changed from: public */
        Cardinality(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static Cardinality m138273b(int i) {
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
        public static C34471v0.C34475d<Cardinality> m138274g() {
            return f82929x;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m138275q() {
            return C34251b.f82931a;
        }

        @Deprecated
        /* renamed from: r */
        public static Cardinality m138276r(int i) {
            return m138273b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum Kind implements C34471v0.C34474c {
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
        public static final int f82937J0 = 0;

        /* renamed from: K0 */
        public static final int f82938K0 = 1;

        /* renamed from: L0 */
        public static final int f82939L0 = 2;

        /* renamed from: M0 */
        public static final int f82940M0 = 3;

        /* renamed from: N0 */
        public static final int f82941N0 = 4;

        /* renamed from: O0 */
        public static final int f82942O0 = 5;

        /* renamed from: P0 */
        public static final int f82943P0 = 6;

        /* renamed from: Q0 */
        public static final int f82944Q0 = 7;

        /* renamed from: R0 */
        public static final int f82945R0 = 8;

        /* renamed from: S0 */
        public static final int f82946S0 = 9;

        /* renamed from: T0 */
        public static final int f82947T0 = 10;

        /* renamed from: U0 */
        public static final int f82948U0 = 11;

        /* renamed from: V0 */
        public static final int f82949V0 = 12;

        /* renamed from: W0 */
        public static final int f82950W0 = 13;

        /* renamed from: X0 */
        public static final int f82952X0 = 14;

        /* renamed from: Y0 */
        public static final int f82954Y0 = 15;

        /* renamed from: Z0 */
        public static final int f82956Z0 = 16;

        /* renamed from: a1 */
        public static final int f82958a1 = 17;

        /* renamed from: b1 */
        public static final int f82960b1 = 18;

        /* renamed from: c1 */
        public static final C34471v0.C34475d<Kind> f82962c1 = null;
        private final int value;

        /* renamed from: com.google.protobuf.Field$Kind$a */
        public static class C34252a implements C34471v0.C34475d<Kind> {
            /* renamed from: b */
            public Kind mo93187a(int i) {
                return Kind.m138280b(i);
            }
        }

        /* renamed from: com.google.protobuf.Field$Kind$b */
        public static final class C34253b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f82973a = null;

            static {
                f82973a = new C34253b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return Kind.m138280b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f82962c1 = new C34252a();
        }

        /* access modifiers changed from: public */
        Kind(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static Kind m138280b(int i) {
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
        public static C34471v0.C34475d<Kind> m138281g() {
            return f82962c1;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m138282q() {
            return C34253b.f82973a;
        }

        @Deprecated
        /* renamed from: r */
        public static Kind m138283r(int i) {
            return m138280b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.google.protobuf.Field$a */
    public static /* synthetic */ class C34254a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f82974a;

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
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f82974a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f82974a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f82974a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f82974a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f82974a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f82974a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f82974a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Field.C34254a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.Field$b */
    public static final class C34255b extends GeneratedMessageLite.C34263b<Field, C34255b> implements C34420n0 {
        public /* synthetic */ C34255b(C34254a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C34255b mo100359B0(int i, Option option) {
            mo100457F();
            ((Field) this.f83053b).setOptions(i, option);
            return this;
        }

        /* renamed from: D0 */
        public C34255b mo100360D0(boolean z) {
            mo100457F();
            ((Field) this.f83053b).setPacked(z);
            return this;
        }

        /* renamed from: E0 */
        public C34255b mo100361E0(String str) {
            mo100457F();
            ((Field) this.f83053b).setTypeUrl(str);
            return this;
        }

        /* renamed from: F0 */
        public C34255b mo100362F0(ByteString byteString) {
            mo100457F();
            ((Field) this.f83053b).setTypeUrlBytes(byteString);
            return this;
        }

        /* renamed from: P */
        public C34255b mo100363P(Iterable<? extends Option> iterable) {
            mo100457F();
            ((Field) this.f83053b).addAllOptions(iterable);
            return this;
        }

        /* renamed from: R */
        public C34255b mo100364R(int i, Option.C34283b bVar) {
            mo100457F();
            ((Field) this.f83053b).addOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C34255b mo100365S(int i, Option option) {
            mo100457F();
            ((Field) this.f83053b).addOptions(i, option);
            return this;
        }

        /* renamed from: T */
        public C34255b mo100366T(Option.C34283b bVar) {
            mo100457F();
            ((Field) this.f83053b).addOptions((Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C34255b mo100367U(Option option) {
            mo100457F();
            ((Field) this.f83053b).addOptions(option);
            return this;
        }

        /* renamed from: V */
        public C34255b mo100368V() {
            mo100457F();
            ((Field) this.f83053b).clearCardinality();
            return this;
        }

        /* renamed from: Y */
        public C34255b mo100369Y() {
            mo100457F();
            ((Field) this.f83053b).clearDefaultValue();
            return this;
        }

        /* renamed from: Z */
        public C34255b mo100370Z() {
            mo100457F();
            ((Field) this.f83053b).clearJsonName();
            return this;
        }

        /* renamed from: a0 */
        public C34255b mo100371a0() {
            mo100457F();
            ((Field) this.f83053b).clearKind();
            return this;
        }

        /* renamed from: b0 */
        public C34255b mo100372b0() {
            mo100457F();
            ((Field) this.f83053b).clearName();
            return this;
        }

        /* renamed from: c0 */
        public C34255b mo100373c0() {
            mo100457F();
            ((Field) this.f83053b).clearNumber();
            return this;
        }

        /* renamed from: d0 */
        public C34255b mo100374d0() {
            mo100457F();
            ((Field) this.f83053b).clearOneofIndex();
            return this;
        }

        /* renamed from: g0 */
        public C34255b mo100375g0() {
            mo100457F();
            ((Field) this.f83053b).clearOptions();
            return this;
        }

        public Cardinality getCardinality() {
            return ((Field) this.f83053b).getCardinality();
        }

        public int getCardinalityValue() {
            return ((Field) this.f83053b).getCardinalityValue();
        }

        public String getDefaultValue() {
            return ((Field) this.f83053b).getDefaultValue();
        }

        public ByteString getDefaultValueBytes() {
            return ((Field) this.f83053b).getDefaultValueBytes();
        }

        public String getJsonName() {
            return ((Field) this.f83053b).getJsonName();
        }

        public ByteString getJsonNameBytes() {
            return ((Field) this.f83053b).getJsonNameBytes();
        }

        public Kind getKind() {
            return ((Field) this.f83053b).getKind();
        }

        public int getKindValue() {
            return ((Field) this.f83053b).getKindValue();
        }

        public String getName() {
            return ((Field) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Field) this.f83053b).getNameBytes();
        }

        public int getNumber() {
            return ((Field) this.f83053b).getNumber();
        }

        public int getOneofIndex() {
            return ((Field) this.f83053b).getOneofIndex();
        }

        public Option getOptions(int i) {
            return ((Field) this.f83053b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Field) this.f83053b).getOptionsCount();
        }

        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Field) this.f83053b).getOptionsList());
        }

        public boolean getPacked() {
            return ((Field) this.f83053b).getPacked();
        }

        public String getTypeUrl() {
            return ((Field) this.f83053b).getTypeUrl();
        }

        public ByteString getTypeUrlBytes() {
            return ((Field) this.f83053b).getTypeUrlBytes();
        }

        /* renamed from: h0 */
        public C34255b mo100376h0() {
            mo100457F();
            ((Field) this.f83053b).clearPacked();
            return this;
        }

        /* renamed from: i0 */
        public C34255b mo100377i0() {
            mo100457F();
            ((Field) this.f83053b).clearTypeUrl();
            return this;
        }

        /* renamed from: j0 */
        public C34255b mo100378j0(int i) {
            mo100457F();
            ((Field) this.f83053b).removeOptions(i);
            return this;
        }

        /* renamed from: k0 */
        public C34255b mo100379k0(Cardinality cardinality) {
            mo100457F();
            ((Field) this.f83053b).setCardinality(cardinality);
            return this;
        }

        /* renamed from: l0 */
        public C34255b mo100380l0(int i) {
            mo100457F();
            ((Field) this.f83053b).setCardinalityValue(i);
            return this;
        }

        /* renamed from: m0 */
        public C34255b mo100381m0(String str) {
            mo100457F();
            ((Field) this.f83053b).setDefaultValue(str);
            return this;
        }

        /* renamed from: o0 */
        public C34255b mo100382o0(ByteString byteString) {
            mo100457F();
            ((Field) this.f83053b).setDefaultValueBytes(byteString);
            return this;
        }

        /* renamed from: q0 */
        public C34255b mo100383q0(String str) {
            mo100457F();
            ((Field) this.f83053b).setJsonName(str);
            return this;
        }

        /* renamed from: r0 */
        public C34255b mo100384r0(ByteString byteString) {
            mo100457F();
            ((Field) this.f83053b).setJsonNameBytes(byteString);
            return this;
        }

        /* renamed from: s0 */
        public C34255b mo100385s0(Kind kind) {
            mo100457F();
            ((Field) this.f83053b).setKind(kind);
            return this;
        }

        /* renamed from: u0 */
        public C34255b mo100386u0(int i) {
            mo100457F();
            ((Field) this.f83053b).setKindValue(i);
            return this;
        }

        /* renamed from: v0 */
        public C34255b mo100387v0(String str) {
            mo100457F();
            ((Field) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: w0 */
        public C34255b mo100388w0(ByteString byteString) {
            mo100457F();
            ((Field) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: x0 */
        public C34255b mo100389x0(int i) {
            mo100457F();
            ((Field) this.f83053b).setNumber(i);
            return this;
        }

        /* renamed from: y0 */
        public C34255b mo100390y0(int i) {
            mo100457F();
            ((Field) this.f83053b).setOneofIndex(i);
            return this;
        }

        /* renamed from: z0 */
        public C34255b mo100391z0(int i, Option.C34283b bVar) {
            mo100457F();
            ((Field) this.f83053b).setOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        public C34255b() {
            super(Field.DEFAULT_INSTANCE);
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.registerDefaultInstance(Field.class, field);
    }

    private Field() {
    }

    /* access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        C34319a.addAll(iterable, this.options_);
    }

    /* access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* access modifiers changed from: private */
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    /* access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    private void ensureOptionsIsMutable() {
        C34471v0.C34488k<Option> kVar = this.options_;
        if (!kVar.mo100971T()) {
            this.options_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C34255b newBuilder() {
        return (C34255b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Field> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setCardinality(Cardinality cardinality) {
        this.cardinality_ = cardinality.getNumber();
    }

    /* access modifiers changed from: private */
    public void setCardinalityValue(int i) {
        this.cardinality_ = i;
    }

    /* access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* access modifiers changed from: private */
    public void setDefaultValueBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.defaultValue_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* access modifiers changed from: private */
    public void setJsonNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.jsonName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setKind(Kind kind) {
        this.kind_ = kind.getNumber();
    }

    /* access modifiers changed from: private */
    public void setKindValue(int i) {
        this.kind_ = i;
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setNumber(int i) {
        this.number_ = i;
    }

    /* access modifiers changed from: private */
    public void setOneofIndex(int i) {
        this.oneofIndex_ = i;
    }

    /* access modifiers changed from: private */
    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* access modifiers changed from: private */
    public void setPacked(boolean z) {
        this.packed_ = z;
    }

    /* access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setTypeUrlBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.typeUrl_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34254a.f82974a[methodToInvoke.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new C34255b((C34254a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Field> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Field.class) {
                        y1Var = PARSER;
                        if (y1Var == null) {
                            y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                            PARSER = y1Var;
                        }
                    }
                }
                return y1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Cardinality getCardinality() {
        Cardinality b = Cardinality.m138273b(this.cardinality_);
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
        return ByteString.m137260e0(this.defaultValue_);
    }

    public String getJsonName() {
        return this.jsonName_;
    }

    public ByteString getJsonNameBytes() {
        return ByteString.m137260e0(this.jsonName_);
    }

    public Kind getKind() {
        Kind b = Kind.m138280b(this.kind_);
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
        return ByteString.m137260e0(this.name_);
    }

    public int getNumber() {
        return this.number_;
    }

    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<Option> getOptionsList() {
        return this.options_;
    }

    public C34500x1 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    public List<? extends C34500x1> getOptionsOrBuilderList() {
        return this.options_;
    }

    public boolean getPacked() {
        return this.packed_;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public ByteString getTypeUrlBytes() {
        return ByteString.m137260e0(this.typeUrl_);
    }

    public static C34255b newBuilder(Field field) {
        return (C34255b) DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Field parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Field parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Field parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Field parseFrom(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Field parseFrom(C34448s sVar) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Field parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
