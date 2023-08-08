package com.google.api;

import com.google.api.ContextRule;
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

public final class Context extends GeneratedMessageLite<Context, C32269b> implements C32427q {
    /* access modifiers changed from: private */
    public static final Context DEFAULT_INSTANCE;
    private static volatile C34504y1<Context> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private C34471v0.C34488k<ContextRule> rules_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.api.Context$a */
    public static /* synthetic */ class C32268a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78635a;

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
                f78635a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78635a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78635a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78635a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78635a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78635a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78635a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Context.C32268a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Context$b */
    public static final class C32269b extends GeneratedMessageLite.C34263b<Context, C32269b> implements C32427q {
        public /* synthetic */ C32269b(C32268a aVar) {
            this();
        }

        /* renamed from: P */
        public C32269b mo93282P(Iterable<? extends ContextRule> iterable) {
            mo100457F();
            ((Context) this.f83053b).addAllRules(iterable);
            return this;
        }

        /* renamed from: R */
        public C32269b mo93283R(int i, ContextRule.C32271b bVar) {
            mo100457F();
            ((Context) this.f83053b).addRules(i, (ContextRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32269b mo93284S(int i, ContextRule contextRule) {
            mo100457F();
            ((Context) this.f83053b).addRules(i, contextRule);
            return this;
        }

        /* renamed from: T */
        public C32269b mo93285T(ContextRule.C32271b bVar) {
            mo100457F();
            ((Context) this.f83053b).addRules((ContextRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32269b mo93286U(ContextRule contextRule) {
            mo100457F();
            ((Context) this.f83053b).addRules(contextRule);
            return this;
        }

        /* renamed from: V */
        public C32269b mo93287V() {
            mo100457F();
            ((Context) this.f83053b).clearRules();
            return this;
        }

        /* renamed from: Y */
        public C32269b mo93288Y(int i) {
            mo100457F();
            ((Context) this.f83053b).removeRules(i);
            return this;
        }

        /* renamed from: Z */
        public C32269b mo93289Z(int i, ContextRule.C32271b bVar) {
            mo100457F();
            ((Context) this.f83053b).setRules(i, (ContextRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: a0 */
        public C32269b mo93290a0(int i, ContextRule contextRule) {
            mo100457F();
            ((Context) this.f83053b).setRules(i, contextRule);
            return this;
        }

        public ContextRule getRules(int i) {
            return ((Context) this.f83053b).getRules(i);
        }

        public int getRulesCount() {
            return ((Context) this.f83053b).getRulesCount();
        }

        public List<ContextRule> getRulesList() {
            return Collections.unmodifiableList(((Context) this.f83053b).getRulesList());
        }

        public C32269b() {
            super(Context.DEFAULT_INSTANCE);
        }
    }

    static {
        Context context = new Context();
        DEFAULT_INSTANCE = context;
        GeneratedMessageLite.registerDefaultInstance(Context.class, context);
    }

    private Context() {
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends ContextRule> iterable) {
        ensureRulesIsMutable();
        C34319a.addAll(iterable, this.rules_);
    }

    /* access modifiers changed from: private */
    public void addRules(ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(contextRule);
    }

    /* access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        C34471v0.C34488k<ContextRule> kVar = this.rules_;
        if (!kVar.mo100971T()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32269b newBuilder() {
        return (C32269b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Context) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Context> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setRules(int i, ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, contextRule);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32268a.f78635a[methodToInvoke.ordinal()]) {
            case 1:
                return new Context();
            case 2:
                return new C32269b((C32268a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", ContextRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Context> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Context.class) {
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

    public ContextRule getRules(int i) {
        return this.rules_.get(i);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<ContextRule> getRulesList() {
        return this.rules_;
    }

    public C32433s getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends C32433s> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static C32269b newBuilder(Context context) {
        return (C32269b) DEFAULT_INSTANCE.createBuilder(context);
    }

    public static Context parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Context) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, ContextRule contextRule) {
        contextRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, contextRule);
    }

    public static Context parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Context parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Context parseFrom(C34448s sVar) throws IOException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Context parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Context) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
