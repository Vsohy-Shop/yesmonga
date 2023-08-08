package com.google.api;

import com.google.api.MetricRule;
import com.google.api.QuotaLimit;
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

public final class Quota extends GeneratedMessageLite<Quota, C32355b> implements C32399g1 {
    /* access modifiers changed from: private */
    public static final Quota DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile C34504y1<Quota> PARSER;
    private C34471v0.C34488k<QuotaLimit> limits_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<MetricRule> metricRules_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.api.Quota$a */
    public static /* synthetic */ class C32354a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78768a;

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
                f78768a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78768a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78768a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78768a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78768a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78768a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78768a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Quota.C32354a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Quota$b */
    public static final class C32355b extends GeneratedMessageLite.C34263b<Quota, C32355b> implements C32399g1 {
        public /* synthetic */ C32355b(C32354a aVar) {
            this();
        }

        /* renamed from: P */
        public C32355b mo94052P(Iterable<? extends QuotaLimit> iterable) {
            mo100457F();
            ((Quota) this.f83053b).addAllLimits(iterable);
            return this;
        }

        /* renamed from: R */
        public C32355b mo94053R(Iterable<? extends MetricRule> iterable) {
            mo100457F();
            ((Quota) this.f83053b).addAllMetricRules(iterable);
            return this;
        }

        /* renamed from: S */
        public C32355b mo94054S(int i, QuotaLimit.C32357b bVar) {
            mo100457F();
            ((Quota) this.f83053b).addLimits(i, (QuotaLimit) bVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C32355b mo94055T(int i, QuotaLimit quotaLimit) {
            mo100457F();
            ((Quota) this.f83053b).addLimits(i, quotaLimit);
            return this;
        }

        /* renamed from: U */
        public C32355b mo94056U(QuotaLimit.C32357b bVar) {
            mo100457F();
            ((Quota) this.f83053b).addLimits((QuotaLimit) bVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C32355b mo94057V(QuotaLimit quotaLimit) {
            mo100457F();
            ((Quota) this.f83053b).addLimits(quotaLimit);
            return this;
        }

        /* renamed from: Y */
        public C32355b mo94058Y(int i, MetricRule.C32330b bVar) {
            mo100457F();
            ((Quota) this.f83053b).addMetricRules(i, (MetricRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: Z */
        public C32355b mo94059Z(int i, MetricRule metricRule) {
            mo100457F();
            ((Quota) this.f83053b).addMetricRules(i, metricRule);
            return this;
        }

        /* renamed from: a0 */
        public C32355b mo94060a0(MetricRule.C32330b bVar) {
            mo100457F();
            ((Quota) this.f83053b).addMetricRules((MetricRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C32355b mo94061b0(MetricRule metricRule) {
            mo100457F();
            ((Quota) this.f83053b).addMetricRules(metricRule);
            return this;
        }

        /* renamed from: c0 */
        public C32355b mo94062c0() {
            mo100457F();
            ((Quota) this.f83053b).clearLimits();
            return this;
        }

        /* renamed from: d0 */
        public C32355b mo94063d0() {
            mo100457F();
            ((Quota) this.f83053b).clearMetricRules();
            return this;
        }

        /* renamed from: g0 */
        public C32355b mo94064g0(int i) {
            mo100457F();
            ((Quota) this.f83053b).removeLimits(i);
            return this;
        }

        public QuotaLimit getLimits(int i) {
            return ((Quota) this.f83053b).getLimits(i);
        }

        public int getLimitsCount() {
            return ((Quota) this.f83053b).getLimitsCount();
        }

        public List<QuotaLimit> getLimitsList() {
            return Collections.unmodifiableList(((Quota) this.f83053b).getLimitsList());
        }

        public MetricRule getMetricRules(int i) {
            return ((Quota) this.f83053b).getMetricRules(i);
        }

        public int getMetricRulesCount() {
            return ((Quota) this.f83053b).getMetricRulesCount();
        }

        public List<MetricRule> getMetricRulesList() {
            return Collections.unmodifiableList(((Quota) this.f83053b).getMetricRulesList());
        }

        /* renamed from: h0 */
        public C32355b mo94065h0(int i) {
            mo100457F();
            ((Quota) this.f83053b).removeMetricRules(i);
            return this;
        }

        /* renamed from: i0 */
        public C32355b mo94066i0(int i, QuotaLimit.C32357b bVar) {
            mo100457F();
            ((Quota) this.f83053b).setLimits(i, (QuotaLimit) bVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C32355b mo94067j0(int i, QuotaLimit quotaLimit) {
            mo100457F();
            ((Quota) this.f83053b).setLimits(i, quotaLimit);
            return this;
        }

        /* renamed from: k0 */
        public C32355b mo94068k0(int i, MetricRule.C32330b bVar) {
            mo100457F();
            ((Quota) this.f83053b).setMetricRules(i, (MetricRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: l0 */
        public C32355b mo94069l0(int i, MetricRule metricRule) {
            mo100457F();
            ((Quota) this.f83053b).setMetricRules(i, metricRule);
            return this;
        }

        public C32355b() {
            super(Quota.DEFAULT_INSTANCE);
        }
    }

    static {
        Quota quota = new Quota();
        DEFAULT_INSTANCE = quota;
        GeneratedMessageLite.registerDefaultInstance(Quota.class, quota);
    }

    private Quota() {
    }

    /* access modifiers changed from: private */
    public void addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        ensureLimitsIsMutable();
        C34319a.addAll(iterable, this.limits_);
    }

    /* access modifiers changed from: private */
    public void addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        ensureMetricRulesIsMutable();
        C34319a.addAll(iterable, this.metricRules_);
    }

    /* access modifiers changed from: private */
    public void addLimits(QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(quotaLimit);
    }

    /* access modifiers changed from: private */
    public void addMetricRules(MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(metricRule);
    }

    /* access modifiers changed from: private */
    public void clearLimits() {
        this.limits_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearMetricRules() {
        this.metricRules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLimitsIsMutable() {
        C34471v0.C34488k<QuotaLimit> kVar = this.limits_;
        if (!kVar.mo100971T()) {
            this.limits_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureMetricRulesIsMutable() {
        C34471v0.C34488k<MetricRule> kVar = this.metricRules_;
        if (!kVar.mo100971T()) {
            this.metricRules_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32355b newBuilder() {
        return (C32355b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quota) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Quota> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeLimits(int i) {
        ensureLimitsIsMutable();
        this.limits_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeMetricRules(int i) {
        ensureMetricRulesIsMutable();
        this.metricRules_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setLimits(int i, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.set(i, quotaLimit);
    }

    /* access modifiers changed from: private */
    public void setMetricRules(int i, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.set(i, metricRule);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32354a.f78768a[methodToInvoke.ordinal()]) {
            case 1:
                return new Quota();
            case 2:
                return new C32355b((C32354a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"limits_", QuotaLimit.class, "metricRules_", MetricRule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Quota> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Quota.class) {
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

    public QuotaLimit getLimits(int i) {
        return this.limits_.get(i);
    }

    public int getLimitsCount() {
        return this.limits_.size();
    }

    public List<QuotaLimit> getLimitsList() {
        return this.limits_;
    }

    public C32396f1 getLimitsOrBuilder(int i) {
        return this.limits_.get(i);
    }

    public List<? extends C32396f1> getLimitsOrBuilderList() {
        return this.limits_;
    }

    public MetricRule getMetricRules(int i) {
        return this.metricRules_.get(i);
    }

    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    public List<MetricRule> getMetricRulesList() {
        return this.metricRules_;
    }

    public C32440u0 getMetricRulesOrBuilder(int i) {
        return this.metricRules_.get(i);
    }

    public List<? extends C32440u0> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    public static C32355b newBuilder(Quota quota) {
        return (C32355b) DEFAULT_INSTANCE.createBuilder(quota);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Quota) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Quota parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addLimits(int i, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        ensureLimitsIsMutable();
        this.limits_.add(i, quotaLimit);
    }

    /* access modifiers changed from: private */
    public void addMetricRules(int i, MetricRule metricRule) {
        metricRule.getClass();
        ensureMetricRulesIsMutable();
        this.metricRules_.add(i, metricRule);
    }

    public static Quota parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Quota parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Quota parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Quota parseFrom(InputStream inputStream) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Quota parseFrom(C34448s sVar) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Quota parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Quota) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
