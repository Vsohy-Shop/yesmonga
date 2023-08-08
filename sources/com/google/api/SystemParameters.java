package com.google.api;

import com.google.api.SystemParameterRule;
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

public final class SystemParameters extends GeneratedMessageLite<SystemParameters, C32374b> implements C32435s1 {
    /* access modifiers changed from: private */
    public static final SystemParameters DEFAULT_INSTANCE;
    private static volatile C34504y1<SystemParameters> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private C34471v0.C34488k<SystemParameterRule> rules_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.api.SystemParameters$a */
    public static /* synthetic */ class C32373a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78787a;

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
                f78787a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78787a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78787a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78787a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78787a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78787a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78787a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.SystemParameters.C32373a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.SystemParameters$b */
    public static final class C32374b extends GeneratedMessageLite.C34263b<SystemParameters, C32374b> implements C32435s1 {
        public /* synthetic */ C32374b(C32373a aVar) {
            this();
        }

        /* renamed from: P */
        public C32374b mo94419P(Iterable<? extends SystemParameterRule> iterable) {
            mo100457F();
            ((SystemParameters) this.f83053b).addAllRules(iterable);
            return this;
        }

        /* renamed from: R */
        public C32374b mo94420R(int i, SystemParameterRule.C32372b bVar) {
            mo100457F();
            ((SystemParameters) this.f83053b).addRules(i, (SystemParameterRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32374b mo94421S(int i, SystemParameterRule systemParameterRule) {
            mo100457F();
            ((SystemParameters) this.f83053b).addRules(i, systemParameterRule);
            return this;
        }

        /* renamed from: T */
        public C32374b mo94422T(SystemParameterRule.C32372b bVar) {
            mo100457F();
            ((SystemParameters) this.f83053b).addRules((SystemParameterRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32374b mo94423U(SystemParameterRule systemParameterRule) {
            mo100457F();
            ((SystemParameters) this.f83053b).addRules(systemParameterRule);
            return this;
        }

        /* renamed from: V */
        public C32374b mo94424V() {
            mo100457F();
            ((SystemParameters) this.f83053b).clearRules();
            return this;
        }

        /* renamed from: Y */
        public C32374b mo94425Y(int i) {
            mo100457F();
            ((SystemParameters) this.f83053b).removeRules(i);
            return this;
        }

        /* renamed from: Z */
        public C32374b mo94426Z(int i, SystemParameterRule.C32372b bVar) {
            mo100457F();
            ((SystemParameters) this.f83053b).setRules(i, (SystemParameterRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: a0 */
        public C32374b mo94427a0(int i, SystemParameterRule systemParameterRule) {
            mo100457F();
            ((SystemParameters) this.f83053b).setRules(i, systemParameterRule);
            return this;
        }

        public SystemParameterRule getRules(int i) {
            return ((SystemParameters) this.f83053b).getRules(i);
        }

        public int getRulesCount() {
            return ((SystemParameters) this.f83053b).getRulesCount();
        }

        public List<SystemParameterRule> getRulesList() {
            return Collections.unmodifiableList(((SystemParameters) this.f83053b).getRulesList());
        }

        public C32374b() {
            super(SystemParameters.DEFAULT_INSTANCE);
        }
    }

    static {
        SystemParameters systemParameters = new SystemParameters();
        DEFAULT_INSTANCE = systemParameters;
        GeneratedMessageLite.registerDefaultInstance(SystemParameters.class, systemParameters);
    }

    private SystemParameters() {
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends SystemParameterRule> iterable) {
        ensureRulesIsMutable();
        C34319a.addAll(iterable, this.rules_);
    }

    /* access modifiers changed from: private */
    public void addRules(SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(systemParameterRule);
    }

    /* access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        C34471v0.C34488k<SystemParameterRule> kVar = this.rules_;
        if (!kVar.mo100971T()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static SystemParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32374b newBuilder() {
        return (C32374b) DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<SystemParameters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setRules(int i, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, systemParameterRule);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32373a.f78787a[methodToInvoke.ordinal()]) {
            case 1:
                return new SystemParameters();
            case 2:
                return new C32374b((C32373a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", SystemParameterRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<SystemParameters> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (SystemParameters.class) {
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

    public SystemParameterRule getRules(int i) {
        return this.rules_.get(i);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<SystemParameterRule> getRulesList() {
        return this.rules_;
    }

    public C32432r1 getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends C32432r1> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static C32374b newBuilder(SystemParameters systemParameters) {
        return (C32374b) DEFAULT_INSTANCE.createBuilder(systemParameters);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static SystemParameters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, systemParameterRule);
    }

    public static SystemParameters parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static SystemParameters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameters parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static SystemParameters parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static SystemParameters parseFrom(C34448s sVar) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static SystemParameters parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (SystemParameters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
