package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LabelDescriptor extends GeneratedMessageLite<LabelDescriptor, C32309b> implements C32410k0 {
    /* access modifiers changed from: private */
    public static final LabelDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile C34504y1<LabelDescriptor> PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String key_ = "";
    private int valueType_;

    public enum ValueType implements C34471v0.C34474c {
        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        public static final int f78684e = 0;

        /* renamed from: f */
        public static final int f78685f = 1;

        /* renamed from: g */
        public static final int f78686g = 2;

        /* renamed from: v */
        public static final C34471v0.C34475d<ValueType> f78687v = null;
        private final int value;

        /* renamed from: com.google.api.LabelDescriptor$ValueType$a */
        public class C32306a implements C34471v0.C34475d<ValueType> {
            /* renamed from: b */
            public ValueType mo93187a(int i) {
                return ValueType.m130815b(i);
            }
        }

        /* renamed from: com.google.api.LabelDescriptor$ValueType$b */
        public static final class C32307b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f78689a = null;

            static {
                f78689a = new C32307b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return ValueType.m130815b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f78687v = new C32306a();
        }

        /* access modifiers changed from: public */
        ValueType(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static ValueType m130815b(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return BOOL;
            }
            if (i != 2) {
                return null;
            }
            return INT64;
        }

        /* renamed from: g */
        public static C34471v0.C34475d<ValueType> m130816g() {
            return f78687v;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m130817q() {
            return C32307b.f78689a;
        }

        @Deprecated
        /* renamed from: r */
        public static ValueType m130818r(int i) {
            return m130815b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.google.api.LabelDescriptor$a */
    public static /* synthetic */ class C32308a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78690a;

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
                f78690a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78690a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78690a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78690a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78690a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78690a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78690a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.LabelDescriptor.C32308a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.LabelDescriptor$b */
    public static final class C32309b extends GeneratedMessageLite.C34263b<LabelDescriptor, C32309b> implements C32410k0 {
        public /* synthetic */ C32309b(C32308a aVar) {
            this();
        }

        /* renamed from: P */
        public C32309b mo93681P() {
            mo100457F();
            ((LabelDescriptor) this.f83053b).clearDescription();
            return this;
        }

        /* renamed from: R */
        public C32309b mo93682R() {
            mo100457F();
            ((LabelDescriptor) this.f83053b).clearKey();
            return this;
        }

        /* renamed from: S */
        public C32309b mo93683S() {
            mo100457F();
            ((LabelDescriptor) this.f83053b).clearValueType();
            return this;
        }

        /* renamed from: T */
        public C32309b mo93684T(String str) {
            mo100457F();
            ((LabelDescriptor) this.f83053b).setDescription(str);
            return this;
        }

        /* renamed from: U */
        public C32309b mo93685U(ByteString byteString) {
            mo100457F();
            ((LabelDescriptor) this.f83053b).setDescriptionBytes(byteString);
            return this;
        }

        /* renamed from: V */
        public C32309b mo93686V(String str) {
            mo100457F();
            ((LabelDescriptor) this.f83053b).setKey(str);
            return this;
        }

        /* renamed from: Y */
        public C32309b mo93687Y(ByteString byteString) {
            mo100457F();
            ((LabelDescriptor) this.f83053b).setKeyBytes(byteString);
            return this;
        }

        /* renamed from: Z */
        public C32309b mo93688Z(ValueType valueType) {
            mo100457F();
            ((LabelDescriptor) this.f83053b).setValueType(valueType);
            return this;
        }

        /* renamed from: a0 */
        public C32309b mo93689a0(int i) {
            mo100457F();
            ((LabelDescriptor) this.f83053b).setValueTypeValue(i);
            return this;
        }

        public String getDescription() {
            return ((LabelDescriptor) this.f83053b).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((LabelDescriptor) this.f83053b).getDescriptionBytes();
        }

        public String getKey() {
            return ((LabelDescriptor) this.f83053b).getKey();
        }

        public ByteString getKeyBytes() {
            return ((LabelDescriptor) this.f83053b).getKeyBytes();
        }

        public ValueType getValueType() {
            return ((LabelDescriptor) this.f83053b).getValueType();
        }

        public int getValueTypeValue() {
            return ((LabelDescriptor) this.f83053b).getValueTypeValue();
        }

        public C32309b() {
            super(LabelDescriptor.DEFAULT_INSTANCE);
        }
    }

    static {
        LabelDescriptor labelDescriptor = new LabelDescriptor();
        DEFAULT_INSTANCE = labelDescriptor;
        GeneratedMessageLite.registerDefaultInstance(LabelDescriptor.class, labelDescriptor);
    }

    private LabelDescriptor() {
    }

    /* access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    public static LabelDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32309b newBuilder() {
        return (C32309b) DEFAULT_INSTANCE.createBuilder();
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<LabelDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setValueType(ValueType valueType) {
        this.valueType_ = valueType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setValueTypeValue(int i) {
        this.valueType_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32308a.f78690a[methodToInvoke.ordinal()]) {
            case 1:
                return new LabelDescriptor();
            case 2:
                return new C32309b((C32308a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<LabelDescriptor> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (LabelDescriptor.class) {
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

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.m137260e0(this.description_);
    }

    public String getKey() {
        return this.key_;
    }

    public ByteString getKeyBytes() {
        return ByteString.m137260e0(this.key_);
    }

    public ValueType getValueType() {
        ValueType b = ValueType.m130815b(this.valueType_);
        if (b == null) {
            return ValueType.UNRECOGNIZED;
        }
        return b;
    }

    public int getValueTypeValue() {
        return this.valueType_;
    }

    public static C32309b newBuilder(LabelDescriptor labelDescriptor) {
        return (C32309b) DEFAULT_INSTANCE.createBuilder(labelDescriptor);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static LabelDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LabelDescriptor parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static LabelDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LabelDescriptor parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static LabelDescriptor parseFrom(C34448s sVar) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static LabelDescriptor parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (LabelDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
