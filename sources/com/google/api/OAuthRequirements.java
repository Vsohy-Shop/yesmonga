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

public final class OAuthRequirements extends GeneratedMessageLite<OAuthRequirements, C32345b> implements C32384b1 {
    public static final int CANONICAL_SCOPES_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final OAuthRequirements DEFAULT_INSTANCE;
    private static volatile C34504y1<OAuthRequirements> PARSER;
    private String canonicalScopes_ = "";

    /* renamed from: com.google.api.OAuthRequirements$a */
    public static /* synthetic */ class C32344a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78750a;

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
                f78750a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78750a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78750a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78750a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78750a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78750a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78750a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.OAuthRequirements.C32344a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.OAuthRequirements$b */
    public static final class C32345b extends GeneratedMessageLite.C34263b<OAuthRequirements, C32345b> implements C32384b1 {
        public /* synthetic */ C32345b(C32344a aVar) {
            this();
        }

        /* renamed from: P */
        public C32345b mo93985P() {
            mo100457F();
            ((OAuthRequirements) this.f83053b).clearCanonicalScopes();
            return this;
        }

        /* renamed from: R */
        public C32345b mo93986R(String str) {
            mo100457F();
            ((OAuthRequirements) this.f83053b).setCanonicalScopes(str);
            return this;
        }

        /* renamed from: S */
        public C32345b mo93987S(ByteString byteString) {
            mo100457F();
            ((OAuthRequirements) this.f83053b).setCanonicalScopesBytes(byteString);
            return this;
        }

        public String getCanonicalScopes() {
            return ((OAuthRequirements) this.f83053b).getCanonicalScopes();
        }

        public ByteString getCanonicalScopesBytes() {
            return ((OAuthRequirements) this.f83053b).getCanonicalScopesBytes();
        }

        public C32345b() {
            super(OAuthRequirements.DEFAULT_INSTANCE);
        }
    }

    static {
        OAuthRequirements oAuthRequirements = new OAuthRequirements();
        DEFAULT_INSTANCE = oAuthRequirements;
        GeneratedMessageLite.registerDefaultInstance(OAuthRequirements.class, oAuthRequirements);
    }

    private OAuthRequirements() {
    }

    /* access modifiers changed from: private */
    public void clearCanonicalScopes() {
        this.canonicalScopes_ = getDefaultInstance().getCanonicalScopes();
    }

    public static OAuthRequirements getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32345b newBuilder() {
        return (C32345b) DEFAULT_INSTANCE.createBuilder();
    }

    public static OAuthRequirements parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OAuthRequirements) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OAuthRequirements parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<OAuthRequirements> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setCanonicalScopes(String str) {
        str.getClass();
        this.canonicalScopes_ = str;
    }

    /* access modifiers changed from: private */
    public void setCanonicalScopesBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.canonicalScopes_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32344a.f78750a[methodToInvoke.ordinal()]) {
            case 1:
                return new OAuthRequirements();
            case 2:
                return new C32345b((C32344a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"canonicalScopes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<OAuthRequirements> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (OAuthRequirements.class) {
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

    public String getCanonicalScopes() {
        return this.canonicalScopes_;
    }

    public ByteString getCanonicalScopesBytes() {
        return ByteString.m137260e0(this.canonicalScopes_);
    }

    public static C32345b newBuilder(OAuthRequirements oAuthRequirements) {
        return (C32345b) DEFAULT_INSTANCE.createBuilder(oAuthRequirements);
    }

    public static OAuthRequirements parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (OAuthRequirements) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static OAuthRequirements parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static OAuthRequirements parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OAuthRequirements parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static OAuthRequirements parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OAuthRequirements parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static OAuthRequirements parseFrom(InputStream inputStream) throws IOException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OAuthRequirements parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static OAuthRequirements parseFrom(C34448s sVar) throws IOException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static OAuthRequirements parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (OAuthRequirements) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
