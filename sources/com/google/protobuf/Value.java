package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value extends GeneratedMessageLite<Value, C34310b> implements C34353d3 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile C34504y1<Value> PARSER = null;
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
        public static KindCase m138700b(int i) {
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
        public static KindCase m138701g(int i) {
            return m138700b(i);
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.protobuf.Value$a */
    public static /* synthetic */ class C34309a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83138a;

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
                f83138a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83138a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83138a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83138a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83138a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83138a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83138a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Value.C34309a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.Value$b */
    public static final class C34310b extends GeneratedMessageLite.C34263b<Value, C34310b> implements C34353d3 {
        public /* synthetic */ C34310b(C34309a aVar) {
            this();
        }

        /* renamed from: P */
        public C34310b mo100763P() {
            mo100457F();
            ((Value) this.f83053b).clearBoolValue();
            return this;
        }

        /* renamed from: R */
        public C34310b mo100764R() {
            mo100457F();
            ((Value) this.f83053b).clearKind();
            return this;
        }

        /* renamed from: S */
        public C34310b mo100765S() {
            mo100457F();
            ((Value) this.f83053b).clearListValue();
            return this;
        }

        /* renamed from: T */
        public C34310b mo100766T() {
            mo100457F();
            ((Value) this.f83053b).clearNullValue();
            return this;
        }

        /* renamed from: U */
        public C34310b mo100767U() {
            mo100457F();
            ((Value) this.f83053b).clearNumberValue();
            return this;
        }

        /* renamed from: V */
        public C34310b mo100768V() {
            mo100457F();
            ((Value) this.f83053b).clearStringValue();
            return this;
        }

        /* renamed from: Y */
        public C34310b mo100769Y() {
            mo100457F();
            ((Value) this.f83053b).clearStructValue();
            return this;
        }

        /* renamed from: Z */
        public C34310b mo100770Z(ListValue listValue) {
            mo100457F();
            ((Value) this.f83053b).mergeListValue(listValue);
            return this;
        }

        /* renamed from: a0 */
        public C34310b mo100771a0(Struct struct) {
            mo100457F();
            ((Value) this.f83053b).mergeStructValue(struct);
            return this;
        }

        /* renamed from: b0 */
        public C34310b mo100772b0(boolean z) {
            mo100457F();
            ((Value) this.f83053b).setBoolValue(z);
            return this;
        }

        /* renamed from: c0 */
        public C34310b mo100773c0(ListValue.C34274b bVar) {
            mo100457F();
            ((Value) this.f83053b).setListValue((ListValue) bVar.mo100473g());
            return this;
        }

        /* renamed from: d0 */
        public C34310b mo100774d0(ListValue listValue) {
            mo100457F();
            ((Value) this.f83053b).setListValue(listValue);
            return this;
        }

        /* renamed from: g0 */
        public C34310b mo100775g0(NullValue nullValue) {
            mo100457F();
            ((Value) this.f83053b).setNullValue(nullValue);
            return this;
        }

        public boolean getBoolValue() {
            return ((Value) this.f83053b).getBoolValue();
        }

        public KindCase getKindCase() {
            return ((Value) this.f83053b).getKindCase();
        }

        public ListValue getListValue() {
            return ((Value) this.f83053b).getListValue();
        }

        public NullValue getNullValue() {
            return ((Value) this.f83053b).getNullValue();
        }

        public int getNullValueValue() {
            return ((Value) this.f83053b).getNullValueValue();
        }

        public double getNumberValue() {
            return ((Value) this.f83053b).getNumberValue();
        }

        public String getStringValue() {
            return ((Value) this.f83053b).getStringValue();
        }

        public ByteString getStringValueBytes() {
            return ((Value) this.f83053b).getStringValueBytes();
        }

        public Struct getStructValue() {
            return ((Value) this.f83053b).getStructValue();
        }

        /* renamed from: h0 */
        public C34310b mo100776h0(int i) {
            mo100457F();
            ((Value) this.f83053b).setNullValueValue(i);
            return this;
        }

        public boolean hasBoolValue() {
            return ((Value) this.f83053b).hasBoolValue();
        }

        public boolean hasListValue() {
            return ((Value) this.f83053b).hasListValue();
        }

        public boolean hasNullValue() {
            return ((Value) this.f83053b).hasNullValue();
        }

        public boolean hasNumberValue() {
            return ((Value) this.f83053b).hasNumberValue();
        }

        public boolean hasStringValue() {
            return ((Value) this.f83053b).hasStringValue();
        }

        public boolean hasStructValue() {
            return ((Value) this.f83053b).hasStructValue();
        }

        /* renamed from: i0 */
        public C34310b mo100777i0(double d) {
            mo100457F();
            ((Value) this.f83053b).setNumberValue(d);
            return this;
        }

        /* renamed from: j0 */
        public C34310b mo100778j0(String str) {
            mo100457F();
            ((Value) this.f83053b).setStringValue(str);
            return this;
        }

        /* renamed from: k0 */
        public C34310b mo100779k0(ByteString byteString) {
            mo100457F();
            ((Value) this.f83053b).setStringValueBytes(byteString);
            return this;
        }

        /* renamed from: l0 */
        public C34310b mo100780l0(Struct.C34293b bVar) {
            mo100457F();
            ((Value) this.f83053b).setStructValue((Struct) bVar.mo100473g());
            return this;
        }

        /* renamed from: m0 */
        public C34310b mo100781m0(Struct struct) {
            mo100457F();
            ((Value) this.f83053b).setStructValue(struct);
            return this;
        }

        public C34310b() {
            super(Value.DEFAULT_INSTANCE);
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.registerDefaultInstance(Value.class, value);
    }

    private Value() {
    }

    /* access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeListValue(ListValue listValue) {
        listValue.getClass();
        if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
            this.kind_ = listValue;
        } else {
            this.kind_ = ((ListValue.C34274b) ListValue.newBuilder((ListValue) this.kind_).mo100463K(listValue)).mo100467Q();
        }
        this.kindCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void mergeStructValue(Struct struct) {
        struct.getClass();
        if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
            this.kind_ = struct;
        } else {
            this.kind_ = ((Struct.C34293b) Struct.newBuilder((Struct) this.kind_).mo100463K(struct)).mo100467Q();
        }
        this.kindCase_ = 5;
    }

    public static C34310b newBuilder() {
        return (C34310b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void setNullValue(NullValue nullValue) {
        this.kind_ = Integer.valueOf(nullValue.getNumber());
        this.kindCase_ = 1;
    }

    /* access modifiers changed from: private */
    public void setNullValueValue(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    /* access modifiers changed from: private */
    public void setNumberValue(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }

    /* access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* access modifiers changed from: private */
    public void setStringValueBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.kind_ = byteString.mo99228S0();
        this.kindCase_ = 3;
    }

    /* access modifiers changed from: private */
    public void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34309a.f83138a[methodToInvoke.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new C34310b((C34309a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Value> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Value.class) {
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

    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public KindCase getKindCase() {
        return KindCase.m138700b(this.kindCase_);
    }

    public ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (ListValue) this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue b = NullValue.m138505b(((Integer) this.kind_).intValue());
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
        return ByteString.m137260e0(str);
    }

    public Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (Struct) this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static C34310b newBuilder(Value value) {
        return (C34310b) DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Value parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Value parseFrom(C34448s sVar) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Value parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
