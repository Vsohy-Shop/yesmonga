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

public final class Property extends GeneratedMessageLite<Property, C32353b> implements C32393e1 {
    /* access modifiers changed from: private */
    public static final Property DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C34504y1<Property> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String name_ = "";
    private int type_;

    public enum PropertyType implements C34471v0.C34474c {
        UNSPECIFIED(0),
        INT64(1),
        BOOL(2),
        STRING(3),
        DOUBLE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: g */
        public static final int f78760g = 0;

        /* renamed from: v */
        public static final int f78761v = 1;

        /* renamed from: w */
        public static final int f78762w = 2;

        /* renamed from: x */
        public static final int f78763x = 3;

        /* renamed from: y */
        public static final int f78764y = 4;

        /* renamed from: z */
        public static final C34471v0.C34475d<PropertyType> f78765z = null;
        private final int value;

        /* renamed from: com.google.api.Property$PropertyType$a */
        public class C32350a implements C34471v0.C34475d<PropertyType> {
            /* renamed from: b */
            public PropertyType mo93187a(int i) {
                return PropertyType.m131050b(i);
            }
        }

        /* renamed from: com.google.api.Property$PropertyType$b */
        public static final class C32351b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f78766a = null;

            static {
                f78766a = new C32351b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return PropertyType.m131050b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f78765z = new C32350a();
        }

        /* access modifiers changed from: public */
        PropertyType(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static PropertyType m131050b(int i) {
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return INT64;
            }
            if (i == 2) {
                return BOOL;
            }
            if (i == 3) {
                return STRING;
            }
            if (i != 4) {
                return null;
            }
            return DOUBLE;
        }

        /* renamed from: g */
        public static C34471v0.C34475d<PropertyType> m131051g() {
            return f78765z;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m131052q() {
            return C32351b.f78766a;
        }

        @Deprecated
        /* renamed from: r */
        public static PropertyType m131053r(int i) {
            return m131050b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.google.api.Property$a */
    public static /* synthetic */ class C32352a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78767a;

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
                f78767a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78767a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78767a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78767a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78767a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78767a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78767a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Property.C32352a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Property$b */
    public static final class C32353b extends GeneratedMessageLite.C34263b<Property, C32353b> implements C32393e1 {
        public /* synthetic */ C32353b(C32352a aVar) {
            this();
        }

        /* renamed from: P */
        public C32353b mo94033P() {
            mo100457F();
            ((Property) this.f83053b).clearDescription();
            return this;
        }

        /* renamed from: R */
        public C32353b mo94034R() {
            mo100457F();
            ((Property) this.f83053b).clearName();
            return this;
        }

        /* renamed from: S */
        public C32353b mo94035S() {
            mo100457F();
            ((Property) this.f83053b).clearType();
            return this;
        }

        /* renamed from: T */
        public C32353b mo94036T(String str) {
            mo100457F();
            ((Property) this.f83053b).setDescription(str);
            return this;
        }

        /* renamed from: U */
        public C32353b mo94037U(ByteString byteString) {
            mo100457F();
            ((Property) this.f83053b).setDescriptionBytes(byteString);
            return this;
        }

        /* renamed from: V */
        public C32353b mo94038V(String str) {
            mo100457F();
            ((Property) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: Y */
        public C32353b mo94039Y(ByteString byteString) {
            mo100457F();
            ((Property) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: Z */
        public C32353b mo94040Z(PropertyType propertyType) {
            mo100457F();
            ((Property) this.f83053b).setType(propertyType);
            return this;
        }

        /* renamed from: a0 */
        public C32353b mo94041a0(int i) {
            mo100457F();
            ((Property) this.f83053b).setTypeValue(i);
            return this;
        }

        public String getDescription() {
            return ((Property) this.f83053b).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((Property) this.f83053b).getDescriptionBytes();
        }

        public String getName() {
            return ((Property) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Property) this.f83053b).getNameBytes();
        }

        public PropertyType getType() {
            return ((Property) this.f83053b).getType();
        }

        public int getTypeValue() {
            return ((Property) this.f83053b).getTypeValue();
        }

        public C32353b() {
            super(Property.DEFAULT_INSTANCE);
        }
    }

    static {
        Property property = new Property();
        DEFAULT_INSTANCE = property;
        GeneratedMessageLite.registerDefaultInstance(Property.class, property);
    }

    private Property() {
    }

    /* access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static Property getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32353b newBuilder() {
        return (C32353b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Property parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Property) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Property> parser() {
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
    public void setType(PropertyType propertyType) {
        this.type_ = propertyType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32352a.f78767a[methodToInvoke.ordinal()]) {
            case 1:
                return new Property();
            case 2:
                return new C32353b((C32352a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"name_", "type_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Property> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Property.class) {
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

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public PropertyType getType() {
        PropertyType b = PropertyType.m131050b(this.type_);
        if (b == null) {
            return PropertyType.UNRECOGNIZED;
        }
        return b;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public static C32353b newBuilder(Property property) {
        return (C32353b) DEFAULT_INSTANCE.createBuilder(property);
    }

    public static Property parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Property) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Property parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Property parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Property parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Property parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Property parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Property parseFrom(InputStream inputStream) throws IOException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Property parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Property parseFrom(C34448s sVar) throws IOException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Property parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Property) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
