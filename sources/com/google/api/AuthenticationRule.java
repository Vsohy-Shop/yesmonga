package com.google.api;

import com.google.api.AuthRequirement;
import com.google.api.OAuthRequirements;
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

public final class AuthenticationRule extends GeneratedMessageLite<AuthenticationRule, C32253b> implements C32397g {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final AuthenticationRule DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile C34504y1<AuthenticationRule> PARSER = null;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private OAuthRequirements oauth_;
    private C34471v0.C34488k<AuthRequirement> requirements_ = GeneratedMessageLite.emptyProtobufList();
    private String selector_ = "";

    /* renamed from: com.google.api.AuthenticationRule$a */
    public static /* synthetic */ class C32252a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78604a;

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
                f78604a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78604a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78604a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78604a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78604a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78604a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78604a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.AuthenticationRule.C32252a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.AuthenticationRule$b */
    public static final class C32253b extends GeneratedMessageLite.C34263b<AuthenticationRule, C32253b> implements C32397g {
        public /* synthetic */ C32253b(C32252a aVar) {
            this();
        }

        /* renamed from: P */
        public C32253b mo93138P(Iterable<? extends AuthRequirement> iterable) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).addAllRequirements(iterable);
            return this;
        }

        /* renamed from: R */
        public C32253b mo93139R(int i, AuthRequirement.C32249b bVar) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).addRequirements(i, (AuthRequirement) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32253b mo93140S(int i, AuthRequirement authRequirement) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).addRequirements(i, authRequirement);
            return this;
        }

        /* renamed from: T */
        public C32253b mo93141T(AuthRequirement.C32249b bVar) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).addRequirements((AuthRequirement) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32253b mo93142U(AuthRequirement authRequirement) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).addRequirements(authRequirement);
            return this;
        }

        /* renamed from: V */
        public C32253b mo93143V() {
            mo100457F();
            ((AuthenticationRule) this.f83053b).clearAllowWithoutCredential();
            return this;
        }

        /* renamed from: Y */
        public C32253b mo93144Y() {
            mo100457F();
            ((AuthenticationRule) this.f83053b).clearOauth();
            return this;
        }

        /* renamed from: Z */
        public C32253b mo93145Z() {
            mo100457F();
            ((AuthenticationRule) this.f83053b).clearRequirements();
            return this;
        }

        /* renamed from: a0 */
        public C32253b mo93146a0() {
            mo100457F();
            ((AuthenticationRule) this.f83053b).clearSelector();
            return this;
        }

        /* renamed from: b0 */
        public C32253b mo93147b0(OAuthRequirements oAuthRequirements) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).mergeOauth(oAuthRequirements);
            return this;
        }

        /* renamed from: c0 */
        public C32253b mo93148c0(int i) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).removeRequirements(i);
            return this;
        }

        /* renamed from: d0 */
        public C32253b mo93149d0(boolean z) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).setAllowWithoutCredential(z);
            return this;
        }

        /* renamed from: g0 */
        public C32253b mo93150g0(OAuthRequirements.C32345b bVar) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).setOauth((OAuthRequirements) bVar.mo100473g());
            return this;
        }

        public boolean getAllowWithoutCredential() {
            return ((AuthenticationRule) this.f83053b).getAllowWithoutCredential();
        }

        public OAuthRequirements getOauth() {
            return ((AuthenticationRule) this.f83053b).getOauth();
        }

        public AuthRequirement getRequirements(int i) {
            return ((AuthenticationRule) this.f83053b).getRequirements(i);
        }

        public int getRequirementsCount() {
            return ((AuthenticationRule) this.f83053b).getRequirementsCount();
        }

        public List<AuthRequirement> getRequirementsList() {
            return Collections.unmodifiableList(((AuthenticationRule) this.f83053b).getRequirementsList());
        }

        public String getSelector() {
            return ((AuthenticationRule) this.f83053b).getSelector();
        }

        public ByteString getSelectorBytes() {
            return ((AuthenticationRule) this.f83053b).getSelectorBytes();
        }

        /* renamed from: h0 */
        public C32253b mo93151h0(OAuthRequirements oAuthRequirements) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).setOauth(oAuthRequirements);
            return this;
        }

        public boolean hasOauth() {
            return ((AuthenticationRule) this.f83053b).hasOauth();
        }

        /* renamed from: i0 */
        public C32253b mo93152i0(int i, AuthRequirement.C32249b bVar) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).setRequirements(i, (AuthRequirement) bVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C32253b mo93153j0(int i, AuthRequirement authRequirement) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).setRequirements(i, authRequirement);
            return this;
        }

        /* renamed from: k0 */
        public C32253b mo93154k0(String str) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).setSelector(str);
            return this;
        }

        /* renamed from: l0 */
        public C32253b mo93155l0(ByteString byteString) {
            mo100457F();
            ((AuthenticationRule) this.f83053b).setSelectorBytes(byteString);
            return this;
        }

        public C32253b() {
            super(AuthenticationRule.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthenticationRule authenticationRule = new AuthenticationRule();
        DEFAULT_INSTANCE = authenticationRule;
        GeneratedMessageLite.registerDefaultInstance(AuthenticationRule.class, authenticationRule);
    }

    private AuthenticationRule() {
    }

    /* access modifiers changed from: private */
    public void addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
        ensureRequirementsIsMutable();
        C34319a.addAll(iterable, this.requirements_);
    }

    /* access modifiers changed from: private */
    public void addRequirements(AuthRequirement authRequirement) {
        authRequirement.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(authRequirement);
    }

    /* access modifiers changed from: private */
    public void clearAllowWithoutCredential() {
        this.allowWithoutCredential_ = false;
    }

    /* access modifiers changed from: private */
    public void clearOauth() {
        this.oauth_ = null;
    }

    /* access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureRequirementsIsMutable() {
        C34471v0.C34488k<AuthRequirement> kVar = this.requirements_;
        if (!kVar.mo100971T()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static AuthenticationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeOauth(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.getClass();
        OAuthRequirements oAuthRequirements2 = this.oauth_;
        if (oAuthRequirements2 == null || oAuthRequirements2 == OAuthRequirements.getDefaultInstance()) {
            this.oauth_ = oAuthRequirements;
        } else {
            this.oauth_ = (OAuthRequirements) ((OAuthRequirements.C32345b) OAuthRequirements.newBuilder(this.oauth_).mo100463K(oAuthRequirements)).mo100467Q();
        }
    }

    public static C32253b newBuilder() {
        return (C32253b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<AuthenticationRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeRequirements(int i) {
        ensureRequirementsIsMutable();
        this.requirements_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setAllowWithoutCredential(boolean z) {
        this.allowWithoutCredential_ = z;
    }

    /* access modifiers changed from: private */
    public void setOauth(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.getClass();
        this.oauth_ = oAuthRequirements;
    }

    /* access modifiers changed from: private */
    public void setRequirements(int i, AuthRequirement authRequirement) {
        authRequirement.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.set(i, authRequirement);
    }

    /* access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* access modifiers changed from: private */
    public void setSelectorBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.selector_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32252a.f78604a[methodToInvoke.ordinal()]) {
            case 1:
                return new AuthenticationRule();
            case 2:
                return new C32253b((C32252a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0005\u0007\u0007\u001b", new Object[]{"selector_", "oauth_", "allowWithoutCredential_", "requirements_", AuthRequirement.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<AuthenticationRule> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (AuthenticationRule.class) {
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

    public boolean getAllowWithoutCredential() {
        return this.allowWithoutCredential_;
    }

    public OAuthRequirements getOauth() {
        OAuthRequirements oAuthRequirements = this.oauth_;
        return oAuthRequirements == null ? OAuthRequirements.getDefaultInstance() : oAuthRequirements;
    }

    public AuthRequirement getRequirements(int i) {
        return this.requirements_.get(i);
    }

    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    public List<AuthRequirement> getRequirementsList() {
        return this.requirements_;
    }

    public C32391e getRequirementsOrBuilder(int i) {
        return this.requirements_.get(i);
    }

    public List<? extends C32391e> getRequirementsOrBuilderList() {
        return this.requirements_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.m137260e0(this.selector_);
    }

    public boolean hasOauth() {
        return this.oauth_ != null;
    }

    public static C32253b newBuilder(AuthenticationRule authenticationRule) {
        return (C32253b) DEFAULT_INSTANCE.createBuilder(authenticationRule);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static AuthenticationRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addRequirements(int i, AuthRequirement authRequirement) {
        authRequirement.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(i, authRequirement);
    }

    public static AuthenticationRule parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static AuthenticationRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthenticationRule parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static AuthenticationRule parseFrom(C34448s sVar) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static AuthenticationRule parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (AuthenticationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
