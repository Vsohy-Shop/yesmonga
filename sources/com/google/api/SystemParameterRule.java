package com.google.api;

import com.google.api.SystemParameter;
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

public final class SystemParameterRule extends GeneratedMessageLite<SystemParameterRule, C32372b> implements C32432r1 {
    /* access modifiers changed from: private */
    public static final SystemParameterRule DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile C34504y1<SystemParameterRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private C34471v0.C34488k<SystemParameter> parameters_ = GeneratedMessageLite.emptyProtobufList();
    private String selector_ = "";

    /* renamed from: com.google.api.SystemParameterRule$a */
    public static /* synthetic */ class C32371a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78786a;

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
                f78786a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78786a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78786a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78786a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78786a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78786a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78786a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.SystemParameterRule.C32371a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.SystemParameterRule$b */
    public static final class C32372b extends GeneratedMessageLite.C34263b<SystemParameterRule, C32372b> implements C32432r1 {
        public /* synthetic */ C32372b(C32371a aVar) {
            this();
        }

        /* renamed from: P */
        public C32372b mo94402P(Iterable<? extends SystemParameter> iterable) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).addAllParameters(iterable);
            return this;
        }

        /* renamed from: R */
        public C32372b mo94403R(int i, SystemParameter.C32370b bVar) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).addParameters(i, (SystemParameter) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32372b mo94404S(int i, SystemParameter systemParameter) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).addParameters(i, systemParameter);
            return this;
        }

        /* renamed from: T */
        public C32372b mo94405T(SystemParameter.C32370b bVar) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).addParameters((SystemParameter) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32372b mo94406U(SystemParameter systemParameter) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).addParameters(systemParameter);
            return this;
        }

        /* renamed from: V */
        public C32372b mo94407V() {
            mo100457F();
            ((SystemParameterRule) this.f83053b).clearParameters();
            return this;
        }

        /* renamed from: Y */
        public C32372b mo94408Y() {
            mo100457F();
            ((SystemParameterRule) this.f83053b).clearSelector();
            return this;
        }

        /* renamed from: Z */
        public C32372b mo94409Z(int i) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).removeParameters(i);
            return this;
        }

        /* renamed from: a0 */
        public C32372b mo94410a0(int i, SystemParameter.C32370b bVar) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).setParameters(i, (SystemParameter) bVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C32372b mo94411b0(int i, SystemParameter systemParameter) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).setParameters(i, systemParameter);
            return this;
        }

        /* renamed from: c0 */
        public C32372b mo94412c0(String str) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).setSelector(str);
            return this;
        }

        /* renamed from: d0 */
        public C32372b mo94413d0(ByteString byteString) {
            mo100457F();
            ((SystemParameterRule) this.f83053b).setSelectorBytes(byteString);
            return this;
        }

        public SystemParameter getParameters(int i) {
            return ((SystemParameterRule) this.f83053b).getParameters(i);
        }

        public int getParametersCount() {
            return ((SystemParameterRule) this.f83053b).getParametersCount();
        }

        public List<SystemParameter> getParametersList() {
            return Collections.unmodifiableList(((SystemParameterRule) this.f83053b).getParametersList());
        }

        public String getSelector() {
            return ((SystemParameterRule) this.f83053b).getSelector();
        }

        public ByteString getSelectorBytes() {
            return ((SystemParameterRule) this.f83053b).getSelectorBytes();
        }

        public C32372b() {
            super(SystemParameterRule.DEFAULT_INSTANCE);
        }
    }

    static {
        SystemParameterRule systemParameterRule = new SystemParameterRule();
        DEFAULT_INSTANCE = systemParameterRule;
        GeneratedMessageLite.registerDefaultInstance(SystemParameterRule.class, systemParameterRule);
    }

    private SystemParameterRule() {
    }

    /* access modifiers changed from: private */
    public void addAllParameters(Iterable<? extends SystemParameter> iterable) {
        ensureParametersIsMutable();
        C34319a.addAll(iterable, this.parameters_);
    }

    /* access modifiers changed from: private */
    public void addParameters(SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(systemParameter);
    }

    /* access modifiers changed from: private */
    public void clearParameters() {
        this.parameters_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureParametersIsMutable() {
        C34471v0.C34488k<SystemParameter> kVar = this.parameters_;
        if (!kVar.mo100971T()) {
            this.parameters_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static SystemParameterRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32372b newBuilder() {
        return (C32372b) DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<SystemParameterRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeParameters(int i) {
        ensureParametersIsMutable();
        this.parameters_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setParameters(int i, SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.set(i, systemParameter);
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
        switch (C32371a.f78786a[methodToInvoke.ordinal()]) {
            case 1:
                return new SystemParameterRule();
            case 2:
                return new C32372b((C32371a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"selector_", "parameters_", SystemParameter.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<SystemParameterRule> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (SystemParameterRule.class) {
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

    public SystemParameter getParameters(int i) {
        return this.parameters_.get(i);
    }

    public int getParametersCount() {
        return this.parameters_.size();
    }

    public List<SystemParameter> getParametersList() {
        return this.parameters_;
    }

    public C32426p1 getParametersOrBuilder(int i) {
        return this.parameters_.get(i);
    }

    public List<? extends C32426p1> getParametersOrBuilderList() {
        return this.parameters_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.m137260e0(this.selector_);
    }

    public static C32372b newBuilder(SystemParameterRule systemParameterRule) {
        return (C32372b) DEFAULT_INSTANCE.createBuilder(systemParameterRule);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static SystemParameterRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addParameters(int i, SystemParameter systemParameter) {
        systemParameter.getClass();
        ensureParametersIsMutable();
        this.parameters_.add(i, systemParameter);
    }

    public static SystemParameterRule parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static SystemParameterRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SystemParameterRule parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static SystemParameterRule parseFrom(C34448s sVar) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static SystemParameterRule parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (SystemParameterRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
