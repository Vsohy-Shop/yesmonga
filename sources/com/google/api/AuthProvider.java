package com.google.api;

import com.google.api.JwtLocation;
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
import java.util.Collections;
import java.util.List;

public final class AuthProvider extends GeneratedMessageLite<AuthProvider, C32247b> implements C32388d {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile C34504y1<AuthProvider> PARSER;
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private C34471v0.C34488k<JwtLocation> jwtLocations_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.api.AuthProvider$a */
    public static /* synthetic */ class C32246a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78601a;

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
                f78601a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78601a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78601a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78601a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78601a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78601a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78601a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.AuthProvider.C32246a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.AuthProvider$b */
    public static final class C32247b extends GeneratedMessageLite.C34263b<AuthProvider, C32247b> implements C32388d {
        public /* synthetic */ C32247b(C32246a aVar) {
            this();
        }

        /* renamed from: P */
        public C32247b mo93066P(Iterable<? extends JwtLocation> iterable) {
            mo100457F();
            ((AuthProvider) this.f83053b).addAllJwtLocations(iterable);
            return this;
        }

        /* renamed from: R */
        public C32247b mo93067R(int i, JwtLocation.C32305b bVar) {
            mo100457F();
            ((AuthProvider) this.f83053b).addJwtLocations(i, (JwtLocation) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32247b mo93068S(int i, JwtLocation jwtLocation) {
            mo100457F();
            ((AuthProvider) this.f83053b).addJwtLocations(i, jwtLocation);
            return this;
        }

        /* renamed from: T */
        public C32247b mo93069T(JwtLocation.C32305b bVar) {
            mo100457F();
            ((AuthProvider) this.f83053b).addJwtLocations((JwtLocation) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32247b mo93070U(JwtLocation jwtLocation) {
            mo100457F();
            ((AuthProvider) this.f83053b).addJwtLocations(jwtLocation);
            return this;
        }

        /* renamed from: V */
        public C32247b mo93071V() {
            mo100457F();
            ((AuthProvider) this.f83053b).clearAudiences();
            return this;
        }

        /* renamed from: Y */
        public C32247b mo93072Y() {
            mo100457F();
            ((AuthProvider) this.f83053b).clearAuthorizationUrl();
            return this;
        }

        /* renamed from: Z */
        public C32247b mo93073Z() {
            mo100457F();
            ((AuthProvider) this.f83053b).clearId();
            return this;
        }

        /* renamed from: a0 */
        public C32247b mo93074a0() {
            mo100457F();
            ((AuthProvider) this.f83053b).clearIssuer();
            return this;
        }

        /* renamed from: b0 */
        public C32247b mo93075b0() {
            mo100457F();
            ((AuthProvider) this.f83053b).clearJwksUri();
            return this;
        }

        /* renamed from: c0 */
        public C32247b mo93076c0() {
            mo100457F();
            ((AuthProvider) this.f83053b).clearJwtLocations();
            return this;
        }

        /* renamed from: d0 */
        public C32247b mo93077d0(int i) {
            mo100457F();
            ((AuthProvider) this.f83053b).removeJwtLocations(i);
            return this;
        }

        /* renamed from: g0 */
        public C32247b mo93078g0(String str) {
            mo100457F();
            ((AuthProvider) this.f83053b).setAudiences(str);
            return this;
        }

        public String getAudiences() {
            return ((AuthProvider) this.f83053b).getAudiences();
        }

        public ByteString getAudiencesBytes() {
            return ((AuthProvider) this.f83053b).getAudiencesBytes();
        }

        public String getAuthorizationUrl() {
            return ((AuthProvider) this.f83053b).getAuthorizationUrl();
        }

        public ByteString getAuthorizationUrlBytes() {
            return ((AuthProvider) this.f83053b).getAuthorizationUrlBytes();
        }

        public String getId() {
            return ((AuthProvider) this.f83053b).getId();
        }

        public ByteString getIdBytes() {
            return ((AuthProvider) this.f83053b).getIdBytes();
        }

        public String getIssuer() {
            return ((AuthProvider) this.f83053b).getIssuer();
        }

        public ByteString getIssuerBytes() {
            return ((AuthProvider) this.f83053b).getIssuerBytes();
        }

        public String getJwksUri() {
            return ((AuthProvider) this.f83053b).getJwksUri();
        }

        public ByteString getJwksUriBytes() {
            return ((AuthProvider) this.f83053b).getJwksUriBytes();
        }

        public JwtLocation getJwtLocations(int i) {
            return ((AuthProvider) this.f83053b).getJwtLocations(i);
        }

        public int getJwtLocationsCount() {
            return ((AuthProvider) this.f83053b).getJwtLocationsCount();
        }

        public List<JwtLocation> getJwtLocationsList() {
            return Collections.unmodifiableList(((AuthProvider) this.f83053b).getJwtLocationsList());
        }

        /* renamed from: h0 */
        public C32247b mo93079h0(ByteString byteString) {
            mo100457F();
            ((AuthProvider) this.f83053b).setAudiencesBytes(byteString);
            return this;
        }

        /* renamed from: i0 */
        public C32247b mo93080i0(String str) {
            mo100457F();
            ((AuthProvider) this.f83053b).setAuthorizationUrl(str);
            return this;
        }

        /* renamed from: j0 */
        public C32247b mo93081j0(ByteString byteString) {
            mo100457F();
            ((AuthProvider) this.f83053b).setAuthorizationUrlBytes(byteString);
            return this;
        }

        /* renamed from: k0 */
        public C32247b mo93082k0(String str) {
            mo100457F();
            ((AuthProvider) this.f83053b).setId(str);
            return this;
        }

        /* renamed from: l0 */
        public C32247b mo93083l0(ByteString byteString) {
            mo100457F();
            ((AuthProvider) this.f83053b).setIdBytes(byteString);
            return this;
        }

        /* renamed from: m0 */
        public C32247b mo93084m0(String str) {
            mo100457F();
            ((AuthProvider) this.f83053b).setIssuer(str);
            return this;
        }

        /* renamed from: o0 */
        public C32247b mo93085o0(ByteString byteString) {
            mo100457F();
            ((AuthProvider) this.f83053b).setIssuerBytes(byteString);
            return this;
        }

        /* renamed from: q0 */
        public C32247b mo93086q0(String str) {
            mo100457F();
            ((AuthProvider) this.f83053b).setJwksUri(str);
            return this;
        }

        /* renamed from: r0 */
        public C32247b mo93087r0(ByteString byteString) {
            mo100457F();
            ((AuthProvider) this.f83053b).setJwksUriBytes(byteString);
            return this;
        }

        /* renamed from: s0 */
        public C32247b mo93088s0(int i, JwtLocation.C32305b bVar) {
            mo100457F();
            ((AuthProvider) this.f83053b).setJwtLocations(i, (JwtLocation) bVar.mo100473g());
            return this;
        }

        /* renamed from: u0 */
        public C32247b mo93089u0(int i, JwtLocation jwtLocation) {
            mo100457F();
            ((AuthProvider) this.f83053b).setJwtLocations(i, jwtLocation);
            return this;
        }

        public C32247b() {
            super(AuthProvider.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthProvider authProvider = new AuthProvider();
        DEFAULT_INSTANCE = authProvider;
        GeneratedMessageLite.registerDefaultInstance(AuthProvider.class, authProvider);
    }

    private AuthProvider() {
    }

    /* access modifiers changed from: private */
    public void addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        ensureJwtLocationsIsMutable();
        C34319a.addAll(iterable, this.jwtLocations_);
    }

    /* access modifiers changed from: private */
    public void addJwtLocations(JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(jwtLocation);
    }

    /* access modifiers changed from: private */
    public void clearAudiences() {
        this.audiences_ = getDefaultInstance().getAudiences();
    }

    /* access modifiers changed from: private */
    public void clearAuthorizationUrl() {
        this.authorizationUrl_ = getDefaultInstance().getAuthorizationUrl();
    }

    /* access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* access modifiers changed from: private */
    public void clearIssuer() {
        this.issuer_ = getDefaultInstance().getIssuer();
    }

    /* access modifiers changed from: private */
    public void clearJwksUri() {
        this.jwksUri_ = getDefaultInstance().getJwksUri();
    }

    /* access modifiers changed from: private */
    public void clearJwtLocations() {
        this.jwtLocations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureJwtLocationsIsMutable() {
        C34471v0.C34488k<JwtLocation> kVar = this.jwtLocations_;
        if (!kVar.mo100971T()) {
            this.jwtLocations_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32247b newBuilder() {
        return (C32247b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<AuthProvider> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeJwtLocations(int i) {
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setAudiences(String str) {
        str.getClass();
        this.audiences_ = str;
    }

    /* access modifiers changed from: private */
    public void setAudiencesBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.audiences_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setAuthorizationUrl(String str) {
        str.getClass();
        this.authorizationUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setAuthorizationUrlBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.authorizationUrl_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setIssuer(String str) {
        str.getClass();
        this.issuer_ = str;
    }

    /* access modifiers changed from: private */
    public void setIssuerBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.issuer_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setJwksUri(String str) {
        str.getClass();
        this.jwksUri_ = str;
    }

    /* access modifiers changed from: private */
    public void setJwksUriBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.jwksUri_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setJwtLocations(int i, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(i, jwtLocation);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32246a.f78601a[methodToInvoke.ordinal()]) {
            case 1:
                return new AuthProvider();
            case 2:
                return new C32247b((C32246a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<AuthProvider> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (AuthProvider.class) {
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

    public String getAudiences() {
        return this.audiences_;
    }

    public ByteString getAudiencesBytes() {
        return ByteString.m137260e0(this.audiences_);
    }

    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    public ByteString getAuthorizationUrlBytes() {
        return ByteString.m137260e0(this.authorizationUrl_);
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.m137260e0(this.id_);
    }

    public String getIssuer() {
        return this.issuer_;
    }

    public ByteString getIssuerBytes() {
        return ByteString.m137260e0(this.issuer_);
    }

    public String getJwksUri() {
        return this.jwksUri_;
    }

    public ByteString getJwksUriBytes() {
        return ByteString.m137260e0(this.jwksUri_);
    }

    public JwtLocation getJwtLocations(int i) {
        return this.jwtLocations_.get(i);
    }

    public int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    public List<JwtLocation> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public C32407j0 getJwtLocationsOrBuilder(int i) {
        return this.jwtLocations_.get(i);
    }

    public List<? extends C32407j0> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    public static C32247b newBuilder(AuthProvider authProvider) {
        return (C32247b) DEFAULT_INSTANCE.createBuilder(authProvider);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static AuthProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addJwtLocations(int i, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(i, jwtLocation);
    }

    public static AuthProvider parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static AuthProvider parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthProvider parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static AuthProvider parseFrom(InputStream inputStream) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static AuthProvider parseFrom(C34448s sVar) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static AuthProvider parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (AuthProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
