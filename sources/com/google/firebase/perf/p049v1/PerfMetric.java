package com.google.firebase.perf.p049v1;

import com.google.firebase.perf.p049v1.ApplicationInfo;
import com.google.firebase.perf.p049v1.GaugeMetric;
import com.google.firebase.perf.p049v1.NetworkRequestMetric;
import com.google.firebase.perf.p049v1.TraceMetric;
import com.google.firebase.perf.p049v1.TransportInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.firebase.perf.v1.PerfMetric */
public final class PerfMetric extends GeneratedMessageLite<PerfMetric, C33473b> implements C33496j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final PerfMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile C34504y1<PerfMetric> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ApplicationInfo applicationInfo_;
    private int bitField0_;
    private GaugeMetric gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private TraceMetric traceMetric_;
    private TransportInfo transportInfo_;

    /* renamed from: com.google.firebase.perf.v1.PerfMetric$a */
    public static /* synthetic */ class C33472a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81482a;

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
                f81482a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81482a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81482a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81482a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81482a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81482a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81482a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p049v1.PerfMetric.C33472a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.PerfMetric$b */
    public static final class C33473b extends GeneratedMessageLite.C34263b<PerfMetric, C33473b> implements C33496j {
        public /* synthetic */ C33473b(C33472a aVar) {
            this();
        }

        /* renamed from: P */
        public C33473b mo97148P() {
            mo100457F();
            ((PerfMetric) this.f83053b).clearApplicationInfo();
            return this;
        }

        /* renamed from: R */
        public C33473b mo97149R() {
            mo100457F();
            ((PerfMetric) this.f83053b).clearGaugeMetric();
            return this;
        }

        /* renamed from: S */
        public C33473b mo97150S() {
            mo100457F();
            ((PerfMetric) this.f83053b).clearNetworkRequestMetric();
            return this;
        }

        /* renamed from: T */
        public C33473b mo97151T() {
            mo100457F();
            ((PerfMetric) this.f83053b).clearTraceMetric();
            return this;
        }

        /* renamed from: U */
        public C33473b mo97152U() {
            mo100457F();
            ((PerfMetric) this.f83053b).clearTransportInfo();
            return this;
        }

        /* renamed from: V */
        public C33473b mo97153V(ApplicationInfo applicationInfo) {
            mo100457F();
            ((PerfMetric) this.f83053b).mergeApplicationInfo(applicationInfo);
            return this;
        }

        /* renamed from: Y */
        public C33473b mo97154Y(GaugeMetric gaugeMetric) {
            mo100457F();
            ((PerfMetric) this.f83053b).mergeGaugeMetric(gaugeMetric);
            return this;
        }

        /* renamed from: Z */
        public C33473b mo97155Z(NetworkRequestMetric networkRequestMetric) {
            mo100457F();
            ((PerfMetric) this.f83053b).mergeNetworkRequestMetric(networkRequestMetric);
            return this;
        }

        /* renamed from: a0 */
        public C33473b mo97156a0(TraceMetric traceMetric) {
            mo100457F();
            ((PerfMetric) this.f83053b).mergeTraceMetric(traceMetric);
            return this;
        }

        /* renamed from: b0 */
        public C33473b mo97157b0(TransportInfo transportInfo) {
            mo100457F();
            ((PerfMetric) this.f83053b).mergeTransportInfo(transportInfo);
            return this;
        }

        /* renamed from: c0 */
        public C33473b mo97158c0(ApplicationInfo.C33449b bVar) {
            mo100457F();
            ((PerfMetric) this.f83053b).setApplicationInfo((ApplicationInfo) bVar.mo100473g());
            return this;
        }

        /* renamed from: d0 */
        public C33473b mo97159d0(ApplicationInfo applicationInfo) {
            mo100457F();
            ((PerfMetric) this.f83053b).setApplicationInfo(applicationInfo);
            return this;
        }

        /* renamed from: g0 */
        public C33473b mo97160g0(GaugeMetric.C33458b bVar) {
            mo100457F();
            ((PerfMetric) this.f83053b).setGaugeMetric((GaugeMetric) bVar.mo100473g());
            return this;
        }

        public ApplicationInfo getApplicationInfo() {
            return ((PerfMetric) this.f83053b).getApplicationInfo();
        }

        public GaugeMetric getGaugeMetric() {
            return ((PerfMetric) this.f83053b).getGaugeMetric();
        }

        public NetworkRequestMetric getNetworkRequestMetric() {
            return ((PerfMetric) this.f83053b).getNetworkRequestMetric();
        }

        public TraceMetric getTraceMetric() {
            return ((PerfMetric) this.f83053b).getTraceMetric();
        }

        public TransportInfo getTransportInfo() {
            return ((PerfMetric) this.f83053b).getTransportInfo();
        }

        /* renamed from: h0 */
        public C33473b mo97161h0(GaugeMetric gaugeMetric) {
            mo100457F();
            ((PerfMetric) this.f83053b).setGaugeMetric(gaugeMetric);
            return this;
        }

        public boolean hasApplicationInfo() {
            return ((PerfMetric) this.f83053b).hasApplicationInfo();
        }

        public boolean hasGaugeMetric() {
            return ((PerfMetric) this.f83053b).hasGaugeMetric();
        }

        public boolean hasNetworkRequestMetric() {
            return ((PerfMetric) this.f83053b).hasNetworkRequestMetric();
        }

        public boolean hasTraceMetric() {
            return ((PerfMetric) this.f83053b).hasTraceMetric();
        }

        public boolean hasTransportInfo() {
            return ((PerfMetric) this.f83053b).hasTransportInfo();
        }

        /* renamed from: i0 */
        public C33473b mo97162i0(NetworkRequestMetric.C33470b bVar) {
            mo100457F();
            ((PerfMetric) this.f83053b).setNetworkRequestMetric((NetworkRequestMetric) bVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C33473b mo97163j0(NetworkRequestMetric networkRequestMetric) {
            mo100457F();
            ((PerfMetric) this.f83053b).setNetworkRequestMetric(networkRequestMetric);
            return this;
        }

        /* renamed from: k0 */
        public C33473b mo97164k0(TraceMetric.C33480b bVar) {
            mo100457F();
            ((PerfMetric) this.f83053b).setTraceMetric((TraceMetric) bVar.mo100473g());
            return this;
        }

        /* renamed from: l0 */
        public C33473b mo97165l0(TraceMetric traceMetric) {
            mo100457F();
            ((PerfMetric) this.f83053b).setTraceMetric(traceMetric);
            return this;
        }

        /* renamed from: m0 */
        public C33473b mo97166m0(TransportInfo.C33486b bVar) {
            mo100457F();
            ((PerfMetric) this.f83053b).setTransportInfo((TransportInfo) bVar.mo100473g());
            return this;
        }

        /* renamed from: o0 */
        public C33473b mo97167o0(TransportInfo transportInfo) {
            mo100457F();
            ((PerfMetric) this.f83053b).setTransportInfo(transportInfo);
            return this;
        }

        public C33473b() {
            super(PerfMetric.DEFAULT_INSTANCE);
        }
    }

    static {
        PerfMetric perfMetric = new PerfMetric();
        DEFAULT_INSTANCE = perfMetric;
        GeneratedMessageLite.registerDefaultInstance(PerfMetric.class, perfMetric);
    }

    private PerfMetric() {
    }

    /* access modifiers changed from: private */
    public void clearApplicationInfo() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* access modifiers changed from: private */
    public void clearGaugeMetric() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    /* access modifiers changed from: private */
    public void clearNetworkRequestMetric() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    /* access modifiers changed from: private */
    public void clearTraceMetric() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    /* access modifiers changed from: private */
    public void clearTransportInfo() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static PerfMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        ApplicationInfo applicationInfo2 = this.applicationInfo_;
        if (applicationInfo2 == null || applicationInfo2 == ApplicationInfo.getDefaultInstance()) {
            this.applicationInfo_ = applicationInfo;
        } else {
            this.applicationInfo_ = (ApplicationInfo) ((ApplicationInfo.C33449b) ApplicationInfo.newBuilder(this.applicationInfo_).mo100463K(applicationInfo)).mo100467Q();
        }
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void mergeGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        GaugeMetric gaugeMetric2 = this.gaugeMetric_;
        if (gaugeMetric2 == null || gaugeMetric2 == GaugeMetric.getDefaultInstance()) {
            this.gaugeMetric_ = gaugeMetric;
        } else {
            this.gaugeMetric_ = (GaugeMetric) ((GaugeMetric.C33458b) GaugeMetric.newBuilder(this.gaugeMetric_).mo100463K(gaugeMetric)).mo100467Q();
        }
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        NetworkRequestMetric networkRequestMetric2 = this.networkRequestMetric_;
        if (networkRequestMetric2 == null || networkRequestMetric2 == NetworkRequestMetric.getDefaultInstance()) {
            this.networkRequestMetric_ = networkRequestMetric;
        } else {
            this.networkRequestMetric_ = (NetworkRequestMetric) ((NetworkRequestMetric.C33470b) NetworkRequestMetric.newBuilder(this.networkRequestMetric_).mo100463K(networkRequestMetric)).mo100467Q();
        }
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void mergeTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        TraceMetric traceMetric2 = this.traceMetric_;
        if (traceMetric2 == null || traceMetric2 == TraceMetric.getDefaultInstance()) {
            this.traceMetric_ = traceMetric;
        } else {
            this.traceMetric_ = (TraceMetric) ((TraceMetric.C33480b) TraceMetric.newBuilder(this.traceMetric_).mo100463K(traceMetric)).mo100467Q();
        }
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void mergeTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        TransportInfo transportInfo2 = this.transportInfo_;
        if (transportInfo2 == null || transportInfo2 == TransportInfo.getDefaultInstance()) {
            this.transportInfo_ = transportInfo;
        } else {
            this.transportInfo_ = (TransportInfo) ((TransportInfo.C33486b) TransportInfo.newBuilder(this.transportInfo_).mo100463K(transportInfo)).mo100467Q();
        }
        this.bitField0_ |= 16;
    }

    public static C33473b newBuilder() {
        return (C33473b) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<PerfMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        this.applicationInfo_ = applicationInfo;
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void setGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        this.gaugeMetric_ = gaugeMetric;
        this.bitField0_ |= 8;
    }

    /* access modifiers changed from: private */
    public void setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        this.networkRequestMetric_ = networkRequestMetric;
        this.bitField0_ |= 4;
    }

    /* access modifiers changed from: private */
    public void setTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        this.traceMetric_ = traceMetric;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void setTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        this.transportInfo_ = transportInfo;
        this.bitField0_ |= 16;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33472a.f81482a[methodToInvoke.ordinal()]) {
            case 1:
                return new PerfMetric();
            case 2:
                return new C33473b((C33472a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<PerfMetric> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (PerfMetric.class) {
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

    public ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = this.applicationInfo_;
        return applicationInfo == null ? ApplicationInfo.getDefaultInstance() : applicationInfo;
    }

    public GaugeMetric getGaugeMetric() {
        GaugeMetric gaugeMetric = this.gaugeMetric_;
        return gaugeMetric == null ? GaugeMetric.getDefaultInstance() : gaugeMetric;
    }

    public NetworkRequestMetric getNetworkRequestMetric() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.getDefaultInstance() : networkRequestMetric;
    }

    public TraceMetric getTraceMetric() {
        TraceMetric traceMetric = this.traceMetric_;
        return traceMetric == null ? TraceMetric.getDefaultInstance() : traceMetric;
    }

    public TransportInfo getTransportInfo() {
        TransportInfo transportInfo = this.transportInfo_;
        return transportInfo == null ? TransportInfo.getDefaultInstance() : transportInfo;
    }

    public boolean hasApplicationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasGaugeMetric() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNetworkRequestMetric() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTraceMetric() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTransportInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    public static C33473b newBuilder(PerfMetric perfMetric) {
        return (C33473b) DEFAULT_INSTANCE.createBuilder(perfMetric);
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static PerfMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PerfMetric parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static PerfMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfMetric parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static PerfMetric parseFrom(InputStream inputStream) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static PerfMetric parseFrom(C34448s sVar) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static PerfMetric parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
