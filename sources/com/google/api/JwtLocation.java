package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class JwtLocation extends GeneratedMessageLite<JwtLocation, C32305b> implements C32407j0 {
    /* access modifiers changed from: private */
    public static final JwtLocation DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile C34504y1<JwtLocation> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private int inCase_ = 0;
    private Object in_;
    private String valuePrefix_ = "";

    public enum InCase {
        HEADER(1),
        QUERY(2),
        IN_NOT_SET(0);
        
        private final int value;

        /* access modifiers changed from: public */
        InCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static InCase m130803b(int i) {
            if (i == 0) {
                return IN_NOT_SET;
            }
            if (i == 1) {
                return HEADER;
            }
            if (i != 2) {
                return null;
            }
            return QUERY;
        }

        @Deprecated
        /* renamed from: g */
        public static InCase m130804g(int i) {
            return m130803b(i);
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.api.JwtLocation$a */
    public static /* synthetic */ class C32304a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78679a;

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
                f78679a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78679a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78679a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78679a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78679a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78679a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78679a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.JwtLocation.C32304a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.JwtLocation$b */
    public static final class C32305b extends GeneratedMessageLite.C34263b<JwtLocation, C32305b> implements C32407j0 {
        public /* synthetic */ C32305b(C32304a aVar) {
            this();
        }

        /* renamed from: P */
        public C32305b mo93664P() {
            mo100457F();
            ((JwtLocation) this.f83053b).clearHeader();
            return this;
        }

        /* renamed from: R */
        public C32305b mo93665R() {
            mo100457F();
            ((JwtLocation) this.f83053b).clearIn();
            return this;
        }

        /* renamed from: S */
        public C32305b mo93666S() {
            mo100457F();
            ((JwtLocation) this.f83053b).clearQuery();
            return this;
        }

        /* renamed from: T */
        public C32305b mo93667T() {
            mo100457F();
            ((JwtLocation) this.f83053b).clearValuePrefix();
            return this;
        }

        /* renamed from: U */
        public C32305b mo93668U(String str) {
            mo100457F();
            ((JwtLocation) this.f83053b).setHeader(str);
            return this;
        }

        /* renamed from: V */
        public C32305b mo93669V(ByteString byteString) {
            mo100457F();
            ((JwtLocation) this.f83053b).setHeaderBytes(byteString);
            return this;
        }

        /* renamed from: Y */
        public C32305b mo93670Y(String str) {
            mo100457F();
            ((JwtLocation) this.f83053b).setQuery(str);
            return this;
        }

        /* renamed from: Z */
        public C32305b mo93671Z(ByteString byteString) {
            mo100457F();
            ((JwtLocation) this.f83053b).setQueryBytes(byteString);
            return this;
        }

        /* renamed from: a0 */
        public C32305b mo93672a0(String str) {
            mo100457F();
            ((JwtLocation) this.f83053b).setValuePrefix(str);
            return this;
        }

        /* renamed from: b0 */
        public C32305b mo93673b0(ByteString byteString) {
            mo100457F();
            ((JwtLocation) this.f83053b).setValuePrefixBytes(byteString);
            return this;
        }

        public String getHeader() {
            return ((JwtLocation) this.f83053b).getHeader();
        }

        public ByteString getHeaderBytes() {
            return ((JwtLocation) this.f83053b).getHeaderBytes();
        }

        public InCase getInCase() {
            return ((JwtLocation) this.f83053b).getInCase();
        }

        public String getQuery() {
            return ((JwtLocation) this.f83053b).getQuery();
        }

        public ByteString getQueryBytes() {
            return ((JwtLocation) this.f83053b).getQueryBytes();
        }

        public String getValuePrefix() {
            return ((JwtLocation) this.f83053b).getValuePrefix();
        }

        public ByteString getValuePrefixBytes() {
            return ((JwtLocation) this.f83053b).getValuePrefixBytes();
        }

        public C32305b() {
            super(JwtLocation.DEFAULT_INSTANCE);
        }
    }

    static {
        JwtLocation jwtLocation = new JwtLocation();
        DEFAULT_INSTANCE = jwtLocation;
        GeneratedMessageLite.registerDefaultInstance(JwtLocation.class, jwtLocation);
    }

    private JwtLocation() {
    }

    /* access modifiers changed from: private */
    public void clearHeader() {
        if (this.inCase_ == 1) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearIn() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    /* access modifiers changed from: private */
    public void clearQuery() {
        if (this.inCase_ == 2) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearValuePrefix() {
        this.valuePrefix_ = getDefaultInstance().getValuePrefix();
    }

    public static JwtLocation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32305b newBuilder() {
        return (C32305b) DEFAULT_INSTANCE.createBuilder();
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<JwtLocation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setHeader(String str) {
        str.getClass();
        this.inCase_ = 1;
        this.in_ = str;
    }

    /* access modifiers changed from: private */
    public void setHeaderBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.in_ = byteString.mo99228S0();
        this.inCase_ = 1;
    }

    /* access modifiers changed from: private */
    public void setQuery(String str) {
        str.getClass();
        this.inCase_ = 2;
        this.in_ = str;
    }

    /* access modifiers changed from: private */
    public void setQueryBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.in_ = byteString.mo99228S0();
        this.inCase_ = 2;
    }

    /* access modifiers changed from: private */
    public void setValuePrefix(String str) {
        str.getClass();
        this.valuePrefix_ = str;
    }

    /* access modifiers changed from: private */
    public void setValuePrefixBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.valuePrefix_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32304a.f78679a[methodToInvoke.ordinal()]) {
            case 1:
                return new JwtLocation();
            case 2:
                return new C32305b((C32304a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<JwtLocation> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (JwtLocation.class) {
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

    public String getHeader() {
        if (this.inCase_ == 1) {
            return (String) this.in_;
        }
        return "";
    }

    public ByteString getHeaderBytes() {
        String str;
        if (this.inCase_ == 1) {
            str = (String) this.in_;
        } else {
            str = "";
        }
        return ByteString.m137260e0(str);
    }

    public InCase getInCase() {
        return InCase.m130803b(this.inCase_);
    }

    public String getQuery() {
        if (this.inCase_ == 2) {
            return (String) this.in_;
        }
        return "";
    }

    public ByteString getQueryBytes() {
        String str;
        if (this.inCase_ == 2) {
            str = (String) this.in_;
        } else {
            str = "";
        }
        return ByteString.m137260e0(str);
    }

    public String getValuePrefix() {
        return this.valuePrefix_;
    }

    public ByteString getValuePrefixBytes() {
        return ByteString.m137260e0(this.valuePrefix_);
    }

    public static C32305b newBuilder(JwtLocation jwtLocation) {
        return (C32305b) DEFAULT_INSTANCE.createBuilder(jwtLocation);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static JwtLocation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static JwtLocation parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static JwtLocation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static JwtLocation parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static JwtLocation parseFrom(InputStream inputStream) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static JwtLocation parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static JwtLocation parseFrom(C34448s sVar) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static JwtLocation parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (JwtLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
