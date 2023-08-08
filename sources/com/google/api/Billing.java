package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34417m1;
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

public final class Billing extends GeneratedMessageLite<Billing, C32263c> implements C32409k {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final Billing DEFAULT_INSTANCE;
    private static volatile C34504y1<Billing> PARSER;
    private C34471v0.C34488k<BillingDestination> consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class BillingDestination extends GeneratedMessageLite<BillingDestination, C32260a> implements C32262b {
        /* access modifiers changed from: private */
        public static final BillingDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile C34504y1<BillingDestination> PARSER;
        private C34471v0.C34488k<String> metrics_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        /* renamed from: com.google.api.Billing$BillingDestination$a */
        public static final class C32260a extends GeneratedMessageLite.C34263b<BillingDestination, C32260a> implements C32262b {
            public /* synthetic */ C32260a(C32261a aVar) {
                this();
            }

            /* renamed from: P */
            public C32260a mo93225P(Iterable<String> iterable) {
                mo100457F();
                ((BillingDestination) this.f83053b).addAllMetrics(iterable);
                return this;
            }

            /* renamed from: R */
            public C32260a mo93226R(String str) {
                mo100457F();
                ((BillingDestination) this.f83053b).addMetrics(str);
                return this;
            }

            /* renamed from: S */
            public C32260a mo93227S(ByteString byteString) {
                mo100457F();
                ((BillingDestination) this.f83053b).addMetricsBytes(byteString);
                return this;
            }

            /* renamed from: T */
            public C32260a mo93228T() {
                mo100457F();
                ((BillingDestination) this.f83053b).clearMetrics();
                return this;
            }

            /* renamed from: U */
            public C32260a mo93229U() {
                mo100457F();
                ((BillingDestination) this.f83053b).clearMonitoredResource();
                return this;
            }

            /* renamed from: V */
            public C32260a mo93230V(int i, String str) {
                mo100457F();
                ((BillingDestination) this.f83053b).setMetrics(i, str);
                return this;
            }

            /* renamed from: Y */
            public C32260a mo93231Y(String str) {
                mo100457F();
                ((BillingDestination) this.f83053b).setMonitoredResource(str);
                return this;
            }

            /* renamed from: Z */
            public C32260a mo93232Z(ByteString byteString) {
                mo100457F();
                ((BillingDestination) this.f83053b).setMonitoredResourceBytes(byteString);
                return this;
            }

            public String getMetrics(int i) {
                return ((BillingDestination) this.f83053b).getMetrics(i);
            }

            public ByteString getMetricsBytes(int i) {
                return ((BillingDestination) this.f83053b).getMetricsBytes(i);
            }

            public int getMetricsCount() {
                return ((BillingDestination) this.f83053b).getMetricsCount();
            }

            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((BillingDestination) this.f83053b).getMetricsList());
            }

            public String getMonitoredResource() {
                return ((BillingDestination) this.f83053b).getMonitoredResource();
            }

            public ByteString getMonitoredResourceBytes() {
                return ((BillingDestination) this.f83053b).getMonitoredResourceBytes();
            }

            public C32260a() {
                super(BillingDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            BillingDestination billingDestination = new BillingDestination();
            DEFAULT_INSTANCE = billingDestination;
            GeneratedMessageLite.registerDefaultInstance(BillingDestination.class, billingDestination);
        }

        private BillingDestination() {
        }

        /* access modifiers changed from: private */
        public void addAllMetrics(Iterable<String> iterable) {
            ensureMetricsIsMutable();
            C34319a.addAll(iterable, this.metrics_);
        }

        /* access modifiers changed from: private */
        public void addMetrics(String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(str);
        }

        /* access modifiers changed from: private */
        public void addMetricsBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            ensureMetricsIsMutable();
            this.metrics_.add(byteString.mo99228S0());
        }

        /* access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            C34471v0.C34488k<String> kVar = this.metrics_;
            if (!kVar.mo100971T()) {
                this.metrics_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static BillingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C32260a newBuilder() {
            return (C32260a) DEFAULT_INSTANCE.createBuilder();
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<BillingDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setMetrics(int i, String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setMonitoredResource(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* access modifiers changed from: private */
        public void setMonitoredResourceBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.monitoredResource_ = byteString.mo99228S0();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C32261a.f78621a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BillingDestination();
                case 2:
                    return new C32260a((C32261a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<BillingDestination> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (BillingDestination.class) {
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

        public String getMetrics(int i) {
            return this.metrics_.get(i);
        }

        public ByteString getMetricsBytes(int i) {
            return ByteString.m137260e0(this.metrics_.get(i));
        }

        public int getMetricsCount() {
            return this.metrics_.size();
        }

        public List<String> getMetricsList() {
            return this.metrics_;
        }

        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        public ByteString getMonitoredResourceBytes() {
            return ByteString.m137260e0(this.monitoredResource_);
        }

        public static C32260a newBuilder(BillingDestination billingDestination) {
            return (C32260a) DEFAULT_INSTANCE.createBuilder(billingDestination);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static BillingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BillingDestination parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static BillingDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BillingDestination parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static BillingDestination parseFrom(InputStream inputStream) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static BillingDestination parseFrom(C34448s sVar) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static BillingDestination parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    /* renamed from: com.google.api.Billing$a */
    public static /* synthetic */ class C32261a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78621a;

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
                f78621a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78621a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78621a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78621a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78621a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78621a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78621a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Billing.C32261a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Billing$b */
    public interface C32262b extends C34417m1 {
        String getMetrics(int i);

        ByteString getMetricsBytes(int i);

        int getMetricsCount();

        List<String> getMetricsList();

        String getMonitoredResource();

        ByteString getMonitoredResourceBytes();
    }

    /* renamed from: com.google.api.Billing$c */
    public static final class C32263c extends GeneratedMessageLite.C34263b<Billing, C32263c> implements C32409k {
        public /* synthetic */ C32263c(C32261a aVar) {
            this();
        }

        /* renamed from: P */
        public C32263c mo93233P(Iterable<? extends BillingDestination> iterable) {
            mo100457F();
            ((Billing) this.f83053b).addAllConsumerDestinations(iterable);
            return this;
        }

        /* renamed from: R */
        public C32263c mo93234R(int i, BillingDestination.C32260a aVar) {
            mo100457F();
            ((Billing) this.f83053b).addConsumerDestinations(i, (BillingDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32263c mo93235S(int i, BillingDestination billingDestination) {
            mo100457F();
            ((Billing) this.f83053b).addConsumerDestinations(i, billingDestination);
            return this;
        }

        /* renamed from: T */
        public C32263c mo93236T(BillingDestination.C32260a aVar) {
            mo100457F();
            ((Billing) this.f83053b).addConsumerDestinations((BillingDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32263c mo93237U(BillingDestination billingDestination) {
            mo100457F();
            ((Billing) this.f83053b).addConsumerDestinations(billingDestination);
            return this;
        }

        /* renamed from: V */
        public C32263c mo93238V() {
            mo100457F();
            ((Billing) this.f83053b).clearConsumerDestinations();
            return this;
        }

        /* renamed from: Y */
        public C32263c mo93239Y(int i) {
            mo100457F();
            ((Billing) this.f83053b).removeConsumerDestinations(i);
            return this;
        }

        /* renamed from: Z */
        public C32263c mo93240Z(int i, BillingDestination.C32260a aVar) {
            mo100457F();
            ((Billing) this.f83053b).setConsumerDestinations(i, (BillingDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: a0 */
        public C32263c mo93241a0(int i, BillingDestination billingDestination) {
            mo100457F();
            ((Billing) this.f83053b).setConsumerDestinations(i, billingDestination);
            return this;
        }

        public BillingDestination getConsumerDestinations(int i) {
            return ((Billing) this.f83053b).getConsumerDestinations(i);
        }

        public int getConsumerDestinationsCount() {
            return ((Billing) this.f83053b).getConsumerDestinationsCount();
        }

        public List<BillingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Billing) this.f83053b).getConsumerDestinationsList());
        }

        public C32263c() {
            super(Billing.DEFAULT_INSTANCE);
        }
    }

    static {
        Billing billing = new Billing();
        DEFAULT_INSTANCE = billing;
        GeneratedMessageLite.registerDefaultInstance(Billing.class, billing);
    }

    private Billing() {
    }

    /* access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        C34319a.addAll(iterable, this.consumerDestinations_);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(billingDestination);
    }

    /* access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        C34471v0.C34488k<BillingDestination> kVar = this.consumerDestinations_;
        if (!kVar.mo100971T()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Billing getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32263c newBuilder() {
        return (C32263c) DEFAULT_INSTANCE.createBuilder();
    }

    public static Billing parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Billing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Billing> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeConsumerDestinations(int i) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setConsumerDestinations(int i, BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, billingDestination);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32261a.f78621a[methodToInvoke.ordinal()]) {
            case 1:
                return new Billing();
            case 2:
                return new C32263c((C32261a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", BillingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Billing> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Billing.class) {
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

    public BillingDestination getConsumerDestinations(int i) {
        return this.consumerDestinations_.get(i);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List<BillingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public C32262b getConsumerDestinationsOrBuilder(int i) {
        return this.consumerDestinations_.get(i);
    }

    public List<? extends C32262b> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public static C32263c newBuilder(Billing billing) {
        return (C32263c) DEFAULT_INSTANCE.createBuilder(billing);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Billing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Billing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(int i, BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, billingDestination);
    }

    public static Billing parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Billing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Billing parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Billing parseFrom(InputStream inputStream) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Billing parseFrom(C34448s sVar) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Billing parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
