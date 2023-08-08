package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthenticationRule;
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

public final class Authentication extends GeneratedMessageLite<Authentication, C32251b> implements C32394f {
    /* access modifiers changed from: private */
    public static final Authentication DEFAULT_INSTANCE;
    private static volatile C34504y1<Authentication> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private C34471v0.C34488k<AuthProvider> providers_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<AuthenticationRule> rules_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.api.Authentication$a */
    public static /* synthetic */ class C32250a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78603a;

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
                f78603a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78603a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78603a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78603a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78603a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78603a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78603a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Authentication.C32250a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Authentication$b */
    public static final class C32251b extends GeneratedMessageLite.C34263b<Authentication, C32251b> implements C32394f {
        public /* synthetic */ C32251b(C32250a aVar) {
            this();
        }

        /* renamed from: P */
        public C32251b mo93110P(Iterable<? extends AuthProvider> iterable) {
            mo100457F();
            ((Authentication) this.f83053b).addAllProviders(iterable);
            return this;
        }

        /* renamed from: R */
        public C32251b mo93111R(Iterable<? extends AuthenticationRule> iterable) {
            mo100457F();
            ((Authentication) this.f83053b).addAllRules(iterable);
            return this;
        }

        /* renamed from: S */
        public C32251b mo93112S(int i, AuthProvider.C32247b bVar) {
            mo100457F();
            ((Authentication) this.f83053b).addProviders(i, (AuthProvider) bVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C32251b mo93113T(int i, AuthProvider authProvider) {
            mo100457F();
            ((Authentication) this.f83053b).addProviders(i, authProvider);
            return this;
        }

        /* renamed from: U */
        public C32251b mo93114U(AuthProvider.C32247b bVar) {
            mo100457F();
            ((Authentication) this.f83053b).addProviders((AuthProvider) bVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C32251b mo93115V(AuthProvider authProvider) {
            mo100457F();
            ((Authentication) this.f83053b).addProviders(authProvider);
            return this;
        }

        /* renamed from: Y */
        public C32251b mo93116Y(int i, AuthenticationRule.C32253b bVar) {
            mo100457F();
            ((Authentication) this.f83053b).addRules(i, (AuthenticationRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: Z */
        public C32251b mo93117Z(int i, AuthenticationRule authenticationRule) {
            mo100457F();
            ((Authentication) this.f83053b).addRules(i, authenticationRule);
            return this;
        }

        /* renamed from: a0 */
        public C32251b mo93118a0(AuthenticationRule.C32253b bVar) {
            mo100457F();
            ((Authentication) this.f83053b).addRules((AuthenticationRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C32251b mo93119b0(AuthenticationRule authenticationRule) {
            mo100457F();
            ((Authentication) this.f83053b).addRules(authenticationRule);
            return this;
        }

        /* renamed from: c0 */
        public C32251b mo93120c0() {
            mo100457F();
            ((Authentication) this.f83053b).clearProviders();
            return this;
        }

        /* renamed from: d0 */
        public C32251b mo93121d0() {
            mo100457F();
            ((Authentication) this.f83053b).clearRules();
            return this;
        }

        /* renamed from: g0 */
        public C32251b mo93122g0(int i) {
            mo100457F();
            ((Authentication) this.f83053b).removeProviders(i);
            return this;
        }

        public AuthProvider getProviders(int i) {
            return ((Authentication) this.f83053b).getProviders(i);
        }

        public int getProvidersCount() {
            return ((Authentication) this.f83053b).getProvidersCount();
        }

        public List<AuthProvider> getProvidersList() {
            return Collections.unmodifiableList(((Authentication) this.f83053b).getProvidersList());
        }

        public AuthenticationRule getRules(int i) {
            return ((Authentication) this.f83053b).getRules(i);
        }

        public int getRulesCount() {
            return ((Authentication) this.f83053b).getRulesCount();
        }

        public List<AuthenticationRule> getRulesList() {
            return Collections.unmodifiableList(((Authentication) this.f83053b).getRulesList());
        }

        /* renamed from: h0 */
        public C32251b mo93123h0(int i) {
            mo100457F();
            ((Authentication) this.f83053b).removeRules(i);
            return this;
        }

        /* renamed from: i0 */
        public C32251b mo93124i0(int i, AuthProvider.C32247b bVar) {
            mo100457F();
            ((Authentication) this.f83053b).setProviders(i, (AuthProvider) bVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C32251b mo93125j0(int i, AuthProvider authProvider) {
            mo100457F();
            ((Authentication) this.f83053b).setProviders(i, authProvider);
            return this;
        }

        /* renamed from: k0 */
        public C32251b mo93126k0(int i, AuthenticationRule.C32253b bVar) {
            mo100457F();
            ((Authentication) this.f83053b).setRules(i, (AuthenticationRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: l0 */
        public C32251b mo93127l0(int i, AuthenticationRule authenticationRule) {
            mo100457F();
            ((Authentication) this.f83053b).setRules(i, authenticationRule);
            return this;
        }

        public C32251b() {
            super(Authentication.DEFAULT_INSTANCE);
        }
    }

    static {
        Authentication authentication = new Authentication();
        DEFAULT_INSTANCE = authentication;
        GeneratedMessageLite.registerDefaultInstance(Authentication.class, authentication);
    }

    private Authentication() {
    }

    /* access modifiers changed from: private */
    public void addAllProviders(Iterable<? extends AuthProvider> iterable) {
        ensureProvidersIsMutable();
        C34319a.addAll(iterable, this.providers_);
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends AuthenticationRule> iterable) {
        ensureRulesIsMutable();
        C34319a.addAll(iterable, this.rules_);
    }

    /* access modifiers changed from: private */
    public void addProviders(AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(authProvider);
    }

    /* access modifiers changed from: private */
    public void addRules(AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(authenticationRule);
    }

    /* access modifiers changed from: private */
    public void clearProviders() {
        this.providers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureProvidersIsMutable() {
        C34471v0.C34488k<AuthProvider> kVar = this.providers_;
        if (!kVar.mo100971T()) {
            this.providers_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureRulesIsMutable() {
        C34471v0.C34488k<AuthenticationRule> kVar = this.rules_;
        if (!kVar.mo100971T()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Authentication getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32251b newBuilder() {
        return (C32251b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Authentication) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Authentication> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeProviders(int i) {
        ensureProvidersIsMutable();
        this.providers_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setProviders(int i, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.set(i, authProvider);
    }

    /* access modifiers changed from: private */
    public void setRules(int i, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, authenticationRule);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32250a.f78603a[methodToInvoke.ordinal()]) {
            case 1:
                return new Authentication();
            case 2:
                return new C32251b((C32250a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"rules_", AuthenticationRule.class, "providers_", AuthProvider.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Authentication> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Authentication.class) {
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

    public AuthProvider getProviders(int i) {
        return this.providers_.get(i);
    }

    public int getProvidersCount() {
        return this.providers_.size();
    }

    public List<AuthProvider> getProvidersList() {
        return this.providers_;
    }

    public C32388d getProvidersOrBuilder(int i) {
        return this.providers_.get(i);
    }

    public List<? extends C32388d> getProvidersOrBuilderList() {
        return this.providers_;
    }

    public AuthenticationRule getRules(int i) {
        return this.rules_.get(i);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<AuthenticationRule> getRulesList() {
        return this.rules_;
    }

    public C32397g getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends C32397g> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static C32251b newBuilder(Authentication authentication) {
        return (C32251b) DEFAULT_INSTANCE.createBuilder(authentication);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Authentication) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Authentication parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addProviders(int i, AuthProvider authProvider) {
        authProvider.getClass();
        ensureProvidersIsMutable();
        this.providers_.add(i, authProvider);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, authenticationRule);
    }

    public static Authentication parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Authentication parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Authentication parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Authentication parseFrom(InputStream inputStream) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Authentication parseFrom(C34448s sVar) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Authentication parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Authentication) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
