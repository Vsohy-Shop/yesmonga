package com.google.type;

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

public final class Expr extends GeneratedMessageLite<Expr, C34591b> implements C34614i {
    /* access modifiers changed from: private */
    public static final Expr DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile C34504y1<Expr> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String expression_ = "";
    private String location_ = "";
    private String title_ = "";

    /* renamed from: com.google.type.Expr$a */
    public static /* synthetic */ class C34590a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83683a;

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
                f83683a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83683a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83683a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83683a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83683a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83683a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83683a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.type.Expr.C34590a.<clinit>():void");
        }
    }

    /* renamed from: com.google.type.Expr$b */
    public static final class C34591b extends GeneratedMessageLite.C34263b<Expr, C34591b> implements C34614i {
        public /* synthetic */ C34591b(C34590a aVar) {
            this();
        }

        /* renamed from: P */
        public C34591b mo102278P() {
            mo100457F();
            ((Expr) this.f83053b).clearDescription();
            return this;
        }

        /* renamed from: R */
        public C34591b mo102279R() {
            mo100457F();
            ((Expr) this.f83053b).clearExpression();
            return this;
        }

        /* renamed from: S */
        public C34591b mo102280S() {
            mo100457F();
            ((Expr) this.f83053b).clearLocation();
            return this;
        }

        /* renamed from: T */
        public C34591b mo102281T() {
            mo100457F();
            ((Expr) this.f83053b).clearTitle();
            return this;
        }

        /* renamed from: U */
        public C34591b mo102282U(String str) {
            mo100457F();
            ((Expr) this.f83053b).setDescription(str);
            return this;
        }

        /* renamed from: V */
        public C34591b mo102283V(ByteString byteString) {
            mo100457F();
            ((Expr) this.f83053b).setDescriptionBytes(byteString);
            return this;
        }

        /* renamed from: Y */
        public C34591b mo102284Y(String str) {
            mo100457F();
            ((Expr) this.f83053b).setExpression(str);
            return this;
        }

        /* renamed from: Z */
        public C34591b mo102285Z(ByteString byteString) {
            mo100457F();
            ((Expr) this.f83053b).setExpressionBytes(byteString);
            return this;
        }

        /* renamed from: a0 */
        public C34591b mo102286a0(String str) {
            mo100457F();
            ((Expr) this.f83053b).setLocation(str);
            return this;
        }

        /* renamed from: b0 */
        public C34591b mo102287b0(ByteString byteString) {
            mo100457F();
            ((Expr) this.f83053b).setLocationBytes(byteString);
            return this;
        }

        /* renamed from: c0 */
        public C34591b mo102288c0(String str) {
            mo100457F();
            ((Expr) this.f83053b).setTitle(str);
            return this;
        }

        /* renamed from: d0 */
        public C34591b mo102289d0(ByteString byteString) {
            mo100457F();
            ((Expr) this.f83053b).setTitleBytes(byteString);
            return this;
        }

        public String getDescription() {
            return ((Expr) this.f83053b).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((Expr) this.f83053b).getDescriptionBytes();
        }

        public String getExpression() {
            return ((Expr) this.f83053b).getExpression();
        }

        public ByteString getExpressionBytes() {
            return ((Expr) this.f83053b).getExpressionBytes();
        }

        public String getLocation() {
            return ((Expr) this.f83053b).getLocation();
        }

        public ByteString getLocationBytes() {
            return ((Expr) this.f83053b).getLocationBytes();
        }

        public String getTitle() {
            return ((Expr) this.f83053b).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Expr) this.f83053b).getTitleBytes();
        }

        public C34591b() {
            super(Expr.DEFAULT_INSTANCE);
        }
    }

    static {
        Expr expr = new Expr();
        DEFAULT_INSTANCE = expr;
        GeneratedMessageLite.registerDefaultInstance(Expr.class, expr);
    }

    private Expr() {
    }

    /* access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* access modifiers changed from: private */
    public void clearExpression() {
        this.expression_ = getDefaultInstance().getExpression();
    }

    /* access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }

    /* access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Expr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C34591b newBuilder() {
        return (C34591b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Expr parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Expr) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Expr> parser() {
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
    public void setExpression(String str) {
        str.getClass();
        this.expression_ = str;
    }

    /* access modifiers changed from: private */
    public void setExpressionBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.expression_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLocation(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* access modifiers changed from: private */
    public void setLocationBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.location_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34590a.f83683a[methodToInvoke.ordinal()]) {
            case 1:
                return new Expr();
            case 2:
                return new C34591b((C34590a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Expr> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Expr.class) {
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

    public String getExpression() {
        return this.expression_;
    }

    public ByteString getExpressionBytes() {
        return ByteString.m137260e0(this.expression_);
    }

    public String getLocation() {
        return this.location_;
    }

    public ByteString getLocationBytes() {
        return ByteString.m137260e0(this.location_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.m137260e0(this.title_);
    }

    public static C34591b newBuilder(Expr expr) {
        return (C34591b) DEFAULT_INSTANCE.createBuilder(expr);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Expr) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Expr parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Expr parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Expr parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Expr parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Expr parseFrom(InputStream inputStream) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Expr parseFrom(C34448s sVar) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Expr parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
