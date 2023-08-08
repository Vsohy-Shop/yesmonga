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

public final class Monitoring extends GeneratedMessageLite<Monitoring, C32342b> implements C32452z0 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Monitoring DEFAULT_INSTANCE;
    private static volatile C34504y1<Monitoring> PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private C34471v0.C34488k<MonitoringDestination> consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<MonitoringDestination> producerDestinations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class MonitoringDestination extends GeneratedMessageLite<MonitoringDestination, C32340a> implements C32343c {
        /* access modifiers changed from: private */
        public static final MonitoringDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile C34504y1<MonitoringDestination> PARSER;
        private C34471v0.C34488k<String> metrics_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        /* renamed from: com.google.api.Monitoring$MonitoringDestination$a */
        public static final class C32340a extends GeneratedMessageLite.C34263b<MonitoringDestination, C32340a> implements C32343c {
            public /* synthetic */ C32340a(C32341a aVar) {
                this();
            }

            /* renamed from: P */
            public C32340a mo93957P(Iterable<String> iterable) {
                mo100457F();
                ((MonitoringDestination) this.f83053b).addAllMetrics(iterable);
                return this;
            }

            /* renamed from: R */
            public C32340a mo93958R(String str) {
                mo100457F();
                ((MonitoringDestination) this.f83053b).addMetrics(str);
                return this;
            }

            /* renamed from: S */
            public C32340a mo93959S(ByteString byteString) {
                mo100457F();
                ((MonitoringDestination) this.f83053b).addMetricsBytes(byteString);
                return this;
            }

            /* renamed from: T */
            public C32340a mo93960T() {
                mo100457F();
                ((MonitoringDestination) this.f83053b).clearMetrics();
                return this;
            }

            /* renamed from: U */
            public C32340a mo93961U() {
                mo100457F();
                ((MonitoringDestination) this.f83053b).clearMonitoredResource();
                return this;
            }

            /* renamed from: V */
            public C32340a mo93962V(int i, String str) {
                mo100457F();
                ((MonitoringDestination) this.f83053b).setMetrics(i, str);
                return this;
            }

            /* renamed from: Y */
            public C32340a mo93963Y(String str) {
                mo100457F();
                ((MonitoringDestination) this.f83053b).setMonitoredResource(str);
                return this;
            }

            /* renamed from: Z */
            public C32340a mo93964Z(ByteString byteString) {
                mo100457F();
                ((MonitoringDestination) this.f83053b).setMonitoredResourceBytes(byteString);
                return this;
            }

            public String getMetrics(int i) {
                return ((MonitoringDestination) this.f83053b).getMetrics(i);
            }

            public ByteString getMetricsBytes(int i) {
                return ((MonitoringDestination) this.f83053b).getMetricsBytes(i);
            }

            public int getMetricsCount() {
                return ((MonitoringDestination) this.f83053b).getMetricsCount();
            }

            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((MonitoringDestination) this.f83053b).getMetricsList());
            }

            public String getMonitoredResource() {
                return ((MonitoringDestination) this.f83053b).getMonitoredResource();
            }

            public ByteString getMonitoredResourceBytes() {
                return ((MonitoringDestination) this.f83053b).getMonitoredResourceBytes();
            }

            public C32340a() {
                super(MonitoringDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            MonitoringDestination monitoringDestination = new MonitoringDestination();
            DEFAULT_INSTANCE = monitoringDestination;
            GeneratedMessageLite.registerDefaultInstance(MonitoringDestination.class, monitoringDestination);
        }

        private MonitoringDestination() {
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

        public static MonitoringDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C32340a newBuilder() {
            return (C32340a) DEFAULT_INSTANCE.createBuilder();
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<MonitoringDestination> parser() {
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
            switch (C32341a.f78749a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MonitoringDestination();
                case 2:
                    return new C32340a((C32341a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<MonitoringDestination> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (MonitoringDestination.class) {
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

        public static C32340a newBuilder(MonitoringDestination monitoringDestination) {
            return (C32340a) DEFAULT_INSTANCE.createBuilder(monitoringDestination);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static MonitoringDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MonitoringDestination parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static MonitoringDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MonitoringDestination parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MonitoringDestination parseFrom(C34448s sVar) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static MonitoringDestination parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    /* renamed from: com.google.api.Monitoring$a */
    public static /* synthetic */ class C32341a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78749a;

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
                f78749a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78749a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78749a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78749a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78749a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78749a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78749a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Monitoring.C32341a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Monitoring$b */
    public static final class C32342b extends GeneratedMessageLite.C34263b<Monitoring, C32342b> implements C32452z0 {
        public /* synthetic */ C32342b(C32341a aVar) {
            this();
        }

        /* renamed from: P */
        public C32342b mo93965P(Iterable<? extends MonitoringDestination> iterable) {
            mo100457F();
            ((Monitoring) this.f83053b).addAllConsumerDestinations(iterable);
            return this;
        }

        /* renamed from: R */
        public C32342b mo93966R(Iterable<? extends MonitoringDestination> iterable) {
            mo100457F();
            ((Monitoring) this.f83053b).addAllProducerDestinations(iterable);
            return this;
        }

        /* renamed from: S */
        public C32342b mo93967S(int i, MonitoringDestination.C32340a aVar) {
            mo100457F();
            ((Monitoring) this.f83053b).addConsumerDestinations(i, (MonitoringDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C32342b mo93968T(int i, MonitoringDestination monitoringDestination) {
            mo100457F();
            ((Monitoring) this.f83053b).addConsumerDestinations(i, monitoringDestination);
            return this;
        }

        /* renamed from: U */
        public C32342b mo93969U(MonitoringDestination.C32340a aVar) {
            mo100457F();
            ((Monitoring) this.f83053b).addConsumerDestinations((MonitoringDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C32342b mo93970V(MonitoringDestination monitoringDestination) {
            mo100457F();
            ((Monitoring) this.f83053b).addConsumerDestinations(monitoringDestination);
            return this;
        }

        /* renamed from: Y */
        public C32342b mo93971Y(int i, MonitoringDestination.C32340a aVar) {
            mo100457F();
            ((Monitoring) this.f83053b).addProducerDestinations(i, (MonitoringDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: Z */
        public C32342b mo93972Z(int i, MonitoringDestination monitoringDestination) {
            mo100457F();
            ((Monitoring) this.f83053b).addProducerDestinations(i, monitoringDestination);
            return this;
        }

        /* renamed from: a0 */
        public C32342b mo93973a0(MonitoringDestination.C32340a aVar) {
            mo100457F();
            ((Monitoring) this.f83053b).addProducerDestinations((MonitoringDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C32342b mo93974b0(MonitoringDestination monitoringDestination) {
            mo100457F();
            ((Monitoring) this.f83053b).addProducerDestinations(monitoringDestination);
            return this;
        }

        /* renamed from: c0 */
        public C32342b mo93975c0() {
            mo100457F();
            ((Monitoring) this.f83053b).clearConsumerDestinations();
            return this;
        }

        /* renamed from: d0 */
        public C32342b mo93976d0() {
            mo100457F();
            ((Monitoring) this.f83053b).clearProducerDestinations();
            return this;
        }

        /* renamed from: g0 */
        public C32342b mo93977g0(int i) {
            mo100457F();
            ((Monitoring) this.f83053b).removeConsumerDestinations(i);
            return this;
        }

        public MonitoringDestination getConsumerDestinations(int i) {
            return ((Monitoring) this.f83053b).getConsumerDestinations(i);
        }

        public int getConsumerDestinationsCount() {
            return ((Monitoring) this.f83053b).getConsumerDestinationsCount();
        }

        public List<MonitoringDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Monitoring) this.f83053b).getConsumerDestinationsList());
        }

        public MonitoringDestination getProducerDestinations(int i) {
            return ((Monitoring) this.f83053b).getProducerDestinations(i);
        }

        public int getProducerDestinationsCount() {
            return ((Monitoring) this.f83053b).getProducerDestinationsCount();
        }

        public List<MonitoringDestination> getProducerDestinationsList() {
            return Collections.unmodifiableList(((Monitoring) this.f83053b).getProducerDestinationsList());
        }

        /* renamed from: h0 */
        public C32342b mo93978h0(int i) {
            mo100457F();
            ((Monitoring) this.f83053b).removeProducerDestinations(i);
            return this;
        }

        /* renamed from: i0 */
        public C32342b mo93979i0(int i, MonitoringDestination.C32340a aVar) {
            mo100457F();
            ((Monitoring) this.f83053b).setConsumerDestinations(i, (MonitoringDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C32342b mo93980j0(int i, MonitoringDestination monitoringDestination) {
            mo100457F();
            ((Monitoring) this.f83053b).setConsumerDestinations(i, monitoringDestination);
            return this;
        }

        /* renamed from: k0 */
        public C32342b mo93981k0(int i, MonitoringDestination.C32340a aVar) {
            mo100457F();
            ((Monitoring) this.f83053b).setProducerDestinations(i, (MonitoringDestination) aVar.mo100473g());
            return this;
        }

        /* renamed from: l0 */
        public C32342b mo93982l0(int i, MonitoringDestination monitoringDestination) {
            mo100457F();
            ((Monitoring) this.f83053b).setProducerDestinations(i, monitoringDestination);
            return this;
        }

        public C32342b() {
            super(Monitoring.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Monitoring$c */
    public interface C32343c extends C34417m1 {
        String getMetrics(int i);

        ByteString getMetricsBytes(int i);

        int getMetricsCount();

        List<String> getMetricsList();

        String getMonitoredResource();

        ByteString getMonitoredResourceBytes();
    }

    static {
        Monitoring monitoring = new Monitoring();
        DEFAULT_INSTANCE = monitoring;
        GeneratedMessageLite.registerDefaultInstance(Monitoring.class, monitoring);
    }

    private Monitoring() {
    }

    /* access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        C34319a.addAll(iterable, this.consumerDestinations_);
    }

    /* access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureProducerDestinationsIsMutable();
        C34319a.addAll(iterable, this.producerDestinations_);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void addProducerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearProducerDestinations() {
        this.producerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        C34471v0.C34488k<MonitoringDestination> kVar = this.consumerDestinations_;
        if (!kVar.mo100971T()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureProducerDestinationsIsMutable() {
        C34471v0.C34488k<MonitoringDestination> kVar = this.producerDestinations_;
        if (!kVar.mo100971T()) {
            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Monitoring getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32342b newBuilder() {
        return (C32342b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Monitoring> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeConsumerDestinations(int i) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeProducerDestinations(int i) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i, monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void setProducerDestinations(int i, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i, monitoringDestination);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32341a.f78749a[methodToInvoke.ordinal()]) {
            case 1:
                return new Monitoring();
            case 2:
                return new C32342b((C32341a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", MonitoringDestination.class, "consumerDestinations_", MonitoringDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Monitoring> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Monitoring.class) {
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

    public MonitoringDestination getConsumerDestinations(int i) {
        return this.consumerDestinations_.get(i);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List<MonitoringDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public C32343c getConsumerDestinationsOrBuilder(int i) {
        return this.consumerDestinations_.get(i);
    }

    public List<? extends C32343c> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public MonitoringDestination getProducerDestinations(int i) {
        return this.producerDestinations_.get(i);
    }

    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    public List<MonitoringDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public C32343c getProducerDestinationsOrBuilder(int i) {
        return this.producerDestinations_.get(i);
    }

    public List<? extends C32343c> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public static C32342b newBuilder(Monitoring monitoring) {
        return (C32342b) DEFAULT_INSTANCE.createBuilder(monitoring);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Monitoring parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addConsumerDestinations(int i, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i, monitoringDestination);
    }

    /* access modifiers changed from: private */
    public void addProducerDestinations(int i, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i, monitoringDestination);
    }

    public static Monitoring parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Monitoring parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Monitoring parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Monitoring parseFrom(InputStream inputStream) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Monitoring parseFrom(C34448s sVar) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Monitoring parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
