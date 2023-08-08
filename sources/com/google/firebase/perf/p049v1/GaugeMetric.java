package com.google.firebase.perf.p049v1;

import com.google.firebase.perf.p049v1.AndroidMemoryReading;
import com.google.firebase.perf.p049v1.CpuMetricReading;
import com.google.firebase.perf.p049v1.GaugeMetadata;
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

/* renamed from: com.google.firebase.perf.v1.GaugeMetric */
public final class GaugeMetric extends GeneratedMessageLite<GaugeMetric, C33458b> implements C33493g {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final GaugeMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile C34504y1<GaugeMetric> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private C34471v0.C34488k<AndroidMemoryReading> androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();
    private int bitField0_;
    private C34471v0.C34488k<CpuMetricReading> cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    private GaugeMetadata gaugeMetadata_;
    private String sessionId_ = "";

    /* renamed from: com.google.firebase.perf.v1.GaugeMetric$a */
    public static /* synthetic */ class C33457a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81362a;

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
                f81362a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81362a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81362a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81362a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81362a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81362a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81362a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p049v1.GaugeMetric.C33457a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.GaugeMetric$b */
    public static final class C33458b extends GeneratedMessageLite.C34263b<GaugeMetric, C33458b> implements C33493g {
        public /* synthetic */ C33458b(C33457a aVar) {
            this();
        }

        /* renamed from: P */
        public C33458b mo97029P(Iterable<? extends AndroidMemoryReading> iterable) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addAllAndroidMemoryReadings(iterable);
            return this;
        }

        /* renamed from: R */
        public C33458b mo97030R(Iterable<? extends CpuMetricReading> iterable) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addAllCpuMetricReadings(iterable);
            return this;
        }

        /* renamed from: S */
        public C33458b mo97031S(int i, AndroidMemoryReading.C33447b bVar) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addAndroidMemoryReadings(i, (AndroidMemoryReading) bVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C33458b mo97032T(int i, AndroidMemoryReading androidMemoryReading) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addAndroidMemoryReadings(i, androidMemoryReading);
            return this;
        }

        /* renamed from: U */
        public C33458b mo97033U(AndroidMemoryReading.C33447b bVar) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addAndroidMemoryReadings((AndroidMemoryReading) bVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C33458b mo97034V(AndroidMemoryReading androidMemoryReading) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addAndroidMemoryReadings(androidMemoryReading);
            return this;
        }

        /* renamed from: Y */
        public C33458b mo97035Y(int i, CpuMetricReading.C33454b bVar) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addCpuMetricReadings(i, (CpuMetricReading) bVar.mo100473g());
            return this;
        }

        /* renamed from: Z */
        public C33458b mo97036Z(int i, CpuMetricReading cpuMetricReading) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addCpuMetricReadings(i, cpuMetricReading);
            return this;
        }

        /* renamed from: a0 */
        public C33458b mo97037a0(CpuMetricReading.C33454b bVar) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addCpuMetricReadings((CpuMetricReading) bVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C33458b mo97038b0(CpuMetricReading cpuMetricReading) {
            mo100457F();
            ((GaugeMetric) this.f83053b).addCpuMetricReadings(cpuMetricReading);
            return this;
        }

        /* renamed from: c0 */
        public C33458b mo97039c0() {
            mo100457F();
            ((GaugeMetric) this.f83053b).clearAndroidMemoryReadings();
            return this;
        }

        /* renamed from: d0 */
        public C33458b mo97040d0() {
            mo100457F();
            ((GaugeMetric) this.f83053b).clearCpuMetricReadings();
            return this;
        }

        /* renamed from: g0 */
        public C33458b mo97041g0() {
            mo100457F();
            ((GaugeMetric) this.f83053b).clearGaugeMetadata();
            return this;
        }

        public AndroidMemoryReading getAndroidMemoryReadings(int i) {
            return ((GaugeMetric) this.f83053b).getAndroidMemoryReadings(i);
        }

        public int getAndroidMemoryReadingsCount() {
            return ((GaugeMetric) this.f83053b).getAndroidMemoryReadingsCount();
        }

        public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
            return Collections.unmodifiableList(((GaugeMetric) this.f83053b).getAndroidMemoryReadingsList());
        }

        public CpuMetricReading getCpuMetricReadings(int i) {
            return ((GaugeMetric) this.f83053b).getCpuMetricReadings(i);
        }

        public int getCpuMetricReadingsCount() {
            return ((GaugeMetric) this.f83053b).getCpuMetricReadingsCount();
        }

        public List<CpuMetricReading> getCpuMetricReadingsList() {
            return Collections.unmodifiableList(((GaugeMetric) this.f83053b).getCpuMetricReadingsList());
        }

        public GaugeMetadata getGaugeMetadata() {
            return ((GaugeMetric) this.f83053b).getGaugeMetadata();
        }

        public String getSessionId() {
            return ((GaugeMetric) this.f83053b).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((GaugeMetric) this.f83053b).getSessionIdBytes();
        }

        /* renamed from: h0 */
        public C33458b mo97042h0() {
            mo100457F();
            ((GaugeMetric) this.f83053b).clearSessionId();
            return this;
        }

        public boolean hasGaugeMetadata() {
            return ((GaugeMetric) this.f83053b).hasGaugeMetadata();
        }

        public boolean hasSessionId() {
            return ((GaugeMetric) this.f83053b).hasSessionId();
        }

        /* renamed from: i0 */
        public C33458b mo97043i0(GaugeMetadata gaugeMetadata) {
            mo100457F();
            ((GaugeMetric) this.f83053b).mergeGaugeMetadata(gaugeMetadata);
            return this;
        }

        /* renamed from: j0 */
        public C33458b mo97044j0(int i) {
            mo100457F();
            ((GaugeMetric) this.f83053b).removeAndroidMemoryReadings(i);
            return this;
        }

        /* renamed from: k0 */
        public C33458b mo97045k0(int i) {
            mo100457F();
            ((GaugeMetric) this.f83053b).removeCpuMetricReadings(i);
            return this;
        }

        /* renamed from: l0 */
        public C33458b mo97046l0(int i, AndroidMemoryReading.C33447b bVar) {
            mo100457F();
            ((GaugeMetric) this.f83053b).setAndroidMemoryReadings(i, (AndroidMemoryReading) bVar.mo100473g());
            return this;
        }

        /* renamed from: m0 */
        public C33458b mo97047m0(int i, AndroidMemoryReading androidMemoryReading) {
            mo100457F();
            ((GaugeMetric) this.f83053b).setAndroidMemoryReadings(i, androidMemoryReading);
            return this;
        }

        /* renamed from: o0 */
        public C33458b mo97048o0(int i, CpuMetricReading.C33454b bVar) {
            mo100457F();
            ((GaugeMetric) this.f83053b).setCpuMetricReadings(i, (CpuMetricReading) bVar.mo100473g());
            return this;
        }

        /* renamed from: q0 */
        public C33458b mo97049q0(int i, CpuMetricReading cpuMetricReading) {
            mo100457F();
            ((GaugeMetric) this.f83053b).setCpuMetricReadings(i, cpuMetricReading);
            return this;
        }

        /* renamed from: r0 */
        public C33458b mo97050r0(GaugeMetadata.C33456b bVar) {
            mo100457F();
            ((GaugeMetric) this.f83053b).setGaugeMetadata((GaugeMetadata) bVar.mo100473g());
            return this;
        }

        /* renamed from: s0 */
        public C33458b mo97051s0(GaugeMetadata gaugeMetadata) {
            mo100457F();
            ((GaugeMetric) this.f83053b).setGaugeMetadata(gaugeMetadata);
            return this;
        }

        /* renamed from: u0 */
        public C33458b mo97052u0(String str) {
            mo100457F();
            ((GaugeMetric) this.f83053b).setSessionId(str);
            return this;
        }

        /* renamed from: v0 */
        public C33458b mo97053v0(ByteString byteString) {
            mo100457F();
            ((GaugeMetric) this.f83053b).setSessionIdBytes(byteString);
            return this;
        }

        public C33458b() {
            super(GaugeMetric.DEFAULT_INSTANCE);
        }
    }

    static {
        GaugeMetric gaugeMetric = new GaugeMetric();
        DEFAULT_INSTANCE = gaugeMetric;
        GeneratedMessageLite.registerDefaultInstance(GaugeMetric.class, gaugeMetric);
    }

    private GaugeMetric() {
    }

    /* access modifiers changed from: private */
    public void addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
        ensureAndroidMemoryReadingsIsMutable();
        C34319a.addAll(iterable, this.androidMemoryReadings_);
    }

    /* access modifiers changed from: private */
    public void addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
        ensureCpuMetricReadingsIsMutable();
        C34319a.addAll(iterable, this.cpuMetricReadings_);
    }

    /* access modifiers changed from: private */
    public void addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(androidMemoryReading);
    }

    /* access modifiers changed from: private */
    public void addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(cpuMetricReading);
    }

    /* access modifiers changed from: private */
    public void clearAndroidMemoryReadings() {
        this.androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearCpuMetricReadings() {
        this.cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearGaugeMetadata() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    /* access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    private void ensureAndroidMemoryReadingsIsMutable() {
        C34471v0.C34488k<AndroidMemoryReading> kVar = this.androidMemoryReadings_;
        if (!kVar.mo100971T()) {
            this.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureCpuMetricReadingsIsMutable() {
        C34471v0.C34488k<CpuMetricReading> kVar = this.cpuMetricReadings_;
        if (!kVar.mo100971T()) {
            this.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static GaugeMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        GaugeMetadata gaugeMetadata2 = this.gaugeMetadata_;
        if (gaugeMetadata2 == null || gaugeMetadata2 == GaugeMetadata.getDefaultInstance()) {
            this.gaugeMetadata_ = gaugeMetadata;
        } else {
            this.gaugeMetadata_ = (GaugeMetadata) ((GaugeMetadata.C33456b) GaugeMetadata.newBuilder(this.gaugeMetadata_).mo100463K(gaugeMetadata)).mo100467Q();
        }
        this.bitField0_ |= 2;
    }

    public static C33458b newBuilder() {
        return (C33458b) DEFAULT_INSTANCE.createBuilder();
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<GaugeMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeAndroidMemoryReadings(int i) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeCpuMetricReadings(int i) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.set(i, androidMemoryReading);
    }

    /* access modifiers changed from: private */
    public void setCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.set(i, cpuMetricReading);
    }

    /* access modifiers changed from: private */
    public void setGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        this.gaugeMetadata_ = gaugeMetadata;
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        this.sessionId_ = byteString.mo99228S0();
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33457a.f81362a[methodToInvoke.ordinal()]) {
            case 1:
                return new GaugeMetric();
            case 2:
                return new C33458b((C33457a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", CpuMetricReading.class, "gaugeMetadata_", "androidMemoryReadings_", AndroidMemoryReading.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<GaugeMetric> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (GaugeMetric.class) {
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

    public AndroidMemoryReading getAndroidMemoryReadings(int i) {
        return this.androidMemoryReadings_.get(i);
    }

    public int getAndroidMemoryReadingsCount() {
        return this.androidMemoryReadings_.size();
    }

    public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
        return this.androidMemoryReadings_;
    }

    public C33488b getAndroidMemoryReadingsOrBuilder(int i) {
        return this.androidMemoryReadings_.get(i);
    }

    public List<? extends C33488b> getAndroidMemoryReadingsOrBuilderList() {
        return this.androidMemoryReadings_;
    }

    public CpuMetricReading getCpuMetricReadings(int i) {
        return this.cpuMetricReadings_.get(i);
    }

    public int getCpuMetricReadingsCount() {
        return this.cpuMetricReadings_.size();
    }

    public List<CpuMetricReading> getCpuMetricReadingsList() {
        return this.cpuMetricReadings_;
    }

    public C33490d getCpuMetricReadingsOrBuilder(int i) {
        return this.cpuMetricReadings_.get(i);
    }

    public List<? extends C33490d> getCpuMetricReadingsOrBuilderList() {
        return this.cpuMetricReadings_;
    }

    public GaugeMetadata getGaugeMetadata() {
        GaugeMetadata gaugeMetadata = this.gaugeMetadata_;
        return gaugeMetadata == null ? GaugeMetadata.getDefaultInstance() : gaugeMetadata;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.m137260e0(this.sessionId_);
    }

    public boolean hasGaugeMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C33458b newBuilder(GaugeMetric gaugeMetric) {
        return (C33458b) DEFAULT_INSTANCE.createBuilder(gaugeMetric);
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static GaugeMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addAndroidMemoryReadings(int i, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(i, androidMemoryReading);
    }

    /* access modifiers changed from: private */
    public void addCpuMetricReadings(int i, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(i, cpuMetricReading);
    }

    public static GaugeMetric parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static GaugeMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetric parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static GaugeMetric parseFrom(InputStream inputStream) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static GaugeMetric parseFrom(C34448s sVar) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static GaugeMetric parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
