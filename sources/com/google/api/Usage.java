package com.google.api;

import com.google.api.UsageRule;
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

public final class Usage extends GeneratedMessageLite<Usage, C32376b> implements C32438t1 {
    /* access modifiers changed from: private */
    public static final Usage DEFAULT_INSTANCE;
    private static volatile C34504y1<Usage> PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private String producerNotificationChannel_ = "";
    private C34471v0.C34488k<String> requirements_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<UsageRule> rules_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.api.Usage$a */
    public static /* synthetic */ class C32375a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78788a;

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
                f78788a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78788a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78788a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78788a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78788a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78788a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78788a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Usage.C32375a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Usage$b */
    public static final class C32376b extends GeneratedMessageLite.C34263b<Usage, C32376b> implements C32438t1 {
        public /* synthetic */ C32376b(C32375a aVar) {
            this();
        }

        /* renamed from: P */
        public C32376b mo94439P(Iterable<String> iterable) {
            mo100457F();
            ((Usage) this.f83053b).addAllRequirements(iterable);
            return this;
        }

        /* renamed from: R */
        public C32376b mo94440R(Iterable<? extends UsageRule> iterable) {
            mo100457F();
            ((Usage) this.f83053b).addAllRules(iterable);
            return this;
        }

        /* renamed from: S */
        public C32376b mo94441S(String str) {
            mo100457F();
            ((Usage) this.f83053b).addRequirements(str);
            return this;
        }

        /* renamed from: T */
        public C32376b mo94442T(ByteString byteString) {
            mo100457F();
            ((Usage) this.f83053b).addRequirementsBytes(byteString);
            return this;
        }

        /* renamed from: U */
        public C32376b mo94443U(int i, UsageRule.C32378b bVar) {
            mo100457F();
            ((Usage) this.f83053b).addRules(i, (UsageRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C32376b mo94444V(int i, UsageRule usageRule) {
            mo100457F();
            ((Usage) this.f83053b).addRules(i, usageRule);
            return this;
        }

        /* renamed from: Y */
        public C32376b mo94445Y(UsageRule.C32378b bVar) {
            mo100457F();
            ((Usage) this.f83053b).addRules((UsageRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: Z */
        public C32376b mo94446Z(UsageRule usageRule) {
            mo100457F();
            ((Usage) this.f83053b).addRules(usageRule);
            return this;
        }

        /* renamed from: a0 */
        public C32376b mo94447a0() {
            mo100457F();
            ((Usage) this.f83053b).clearProducerNotificationChannel();
            return this;
        }

        /* renamed from: b0 */
        public C32376b mo94448b0() {
            mo100457F();
            ((Usage) this.f83053b).clearRequirements();
            return this;
        }

        /* renamed from: c0 */
        public C32376b mo94449c0() {
            mo100457F();
            ((Usage) this.f83053b).clearRules();
            return this;
        }

        /* renamed from: d0 */
        public C32376b mo94450d0(int i) {
            mo100457F();
            ((Usage) this.f83053b).removeRules(i);
            return this;
        }

        /* renamed from: g0 */
        public C32376b mo94451g0(String str) {
            mo100457F();
            ((Usage) this.f83053b).setProducerNotificationChannel(str);
            return this;
        }

        public String getProducerNotificationChannel() {
            return ((Usage) this.f83053b).getProducerNotificationChannel();
        }

        public ByteString getProducerNotificationChannelBytes() {
            return ((Usage) this.f83053b).getProducerNotificationChannelBytes();
        }

        public String getRequirements(int i) {
            return ((Usage) this.f83053b).getRequirements(i);
        }

        public ByteString getRequirementsBytes(int i) {
            return ((Usage) this.f83053b).getRequirementsBytes(i);
        }

        public int getRequirementsCount() {
            return ((Usage) this.f83053b).getRequirementsCount();
        }

        public List<String> getRequirementsList() {
            return Collections.unmodifiableList(((Usage) this.f83053b).getRequirementsList());
        }

        public UsageRule getRules(int i) {
            return ((Usage) this.f83053b).getRules(i);
        }

        public int getRulesCount() {
            return ((Usage) this.f83053b).getRulesCount();
        }

        public List<UsageRule> getRulesList() {
            return Collections.unmodifiableList(((Usage) this.f83053b).getRulesList());
        }

        /* renamed from: h0 */
        public C32376b mo94452h0(ByteString byteString) {
            mo100457F();
            ((Usage) this.f83053b).setProducerNotificationChannelBytes(byteString);
            return this;
        }

        /* renamed from: i0 */
        public C32376b mo94453i0(int i, String str) {
            mo100457F();
            ((Usage) this.f83053b).setRequirements(i, str);
            return this;
        }

        /* renamed from: j0 */
        public C32376b mo94454j0(int i, UsageRule.C32378b bVar) {
            mo100457F();
            ((Usage) this.f83053b).setRules(i, (UsageRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: k0 */
        public C32376b mo94455k0(int i, UsageRule usageRule) {
            mo100457F();
            ((Usage) this.f83053b).setRules(i, usageRule);
            return this;
        }

        public C32376b() {
            super(Usage.DEFAULT_INSTANCE);
        }
    }

    static {
        Usage usage = new Usage();
        DEFAULT_INSTANCE = usage;
        GeneratedMessageLite.registerDefaultInstance(Usage.class, usage);
    }

    private Usage() {
    }

    /* access modifiers changed from: private */
    public void addAllRequirements(Iterable<String> iterable) {
        ensureRequirementsIsMutable();
        C34319a.addAll(iterable, this.requirements_);
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends UsageRule> iterable) {
        ensureRulesIsMutable();
        C34319a.addAll(iterable, this.rules_);
    }

    /* access modifiers changed from: private */
    public void addRequirements(String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(str);
    }

    /* access modifiers changed from: private */
    public void addRequirementsBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureRequirementsIsMutable();
        this.requirements_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void addRules(UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(usageRule);
    }

    /* access modifiers changed from: private */
    public void clearProducerNotificationChannel() {
        this.producerNotificationChannel_ = getDefaultInstance().getProducerNotificationChannel();
    }

    /* access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRequirementsIsMutable() {
        C34471v0.C34488k<String> kVar = this.requirements_;
        if (!kVar.mo100971T()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureRulesIsMutable() {
        C34471v0.C34488k<UsageRule> kVar = this.rules_;
        if (!kVar.mo100971T()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Usage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32376b newBuilder() {
        return (C32376b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Usage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Usage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Usage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setProducerNotificationChannel(String str) {
        str.getClass();
        this.producerNotificationChannel_ = str;
    }

    /* access modifiers changed from: private */
    public void setProducerNotificationChannelBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.producerNotificationChannel_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setRequirements(int i, String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void setRules(int i, UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, usageRule);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32375a.f78788a[methodToInvoke.ordinal()]) {
            case 1:
                return new Usage();
            case 2:
                return new C32376b((C32375a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001b\u0007Ȉ", new Object[]{"requirements_", "rules_", UsageRule.class, "producerNotificationChannel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Usage> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Usage.class) {
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

    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel_;
    }

    public ByteString getProducerNotificationChannelBytes() {
        return ByteString.m137260e0(this.producerNotificationChannel_);
    }

    public String getRequirements(int i) {
        return this.requirements_.get(i);
    }

    public ByteString getRequirementsBytes(int i) {
        return ByteString.m137260e0(this.requirements_.get(i));
    }

    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    public List<String> getRequirementsList() {
        return this.requirements_;
    }

    public UsageRule getRules(int i) {
        return this.rules_.get(i);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<UsageRule> getRulesList() {
        return this.rules_;
    }

    public C32444v1 getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends C32444v1> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static C32376b newBuilder(Usage usage) {
        return (C32376b) DEFAULT_INSTANCE.createBuilder(usage);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Usage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Usage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, usageRule);
    }

    public static Usage parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Usage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Usage parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Usage parseFrom(InputStream inputStream) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Usage parseFrom(C34448s sVar) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Usage parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Usage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
