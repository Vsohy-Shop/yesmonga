package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34417m1;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class MetricDescriptor extends GeneratedMessageLite<MetricDescriptor, C32327b> implements C32431r0 {
    /* access modifiers changed from: private */
    public static final MetricDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C34504y1<MetricDescriptor> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private String description_ = "";
    private String displayName_ = "";
    private C34471v0.C34488k<LabelDescriptor> labels_ = GeneratedMessageLite.emptyProtobufList();
    private int launchStage_;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private String name_ = "";
    private String type_ = "";
    private String unit_ = "";
    private int valueType_;

    public static final class MetricDescriptorMetadata extends GeneratedMessageLite<MetricDescriptorMetadata, C32321a> implements C32328c {
        /* access modifiers changed from: private */
        public static final MetricDescriptorMetadata DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile C34504y1<MetricDescriptorMetadata> PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private Duration ingestDelay_;
        private int launchStage_;
        private Duration samplePeriod_;

        /* renamed from: com.google.api.MetricDescriptor$MetricDescriptorMetadata$a */
        public static final class C32321a extends GeneratedMessageLite.C34263b<MetricDescriptorMetadata, C32321a> implements C32328c {
            public /* synthetic */ C32321a(C32326a aVar) {
                this();
            }

            /* renamed from: P */
            public C32321a mo93806P() {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).clearIngestDelay();
                return this;
            }

            @Deprecated
            /* renamed from: R */
            public C32321a mo93807R() {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).clearLaunchStage();
                return this;
            }

            /* renamed from: S */
            public C32321a mo93808S() {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).clearSamplePeriod();
                return this;
            }

            /* renamed from: T */
            public C32321a mo93809T(Duration duration) {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).mergeIngestDelay(duration);
                return this;
            }

            /* renamed from: U */
            public C32321a mo93810U(Duration duration) {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).mergeSamplePeriod(duration);
                return this;
            }

            /* renamed from: V */
            public C32321a mo93811V(Duration.C34243b bVar) {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).setIngestDelay((Duration) bVar.mo100473g());
                return this;
            }

            /* renamed from: Y */
            public C32321a mo93812Y(Duration duration) {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).setIngestDelay(duration);
                return this;
            }

            @Deprecated
            /* renamed from: Z */
            public C32321a mo93813Z(LaunchStage launchStage) {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).setLaunchStage(launchStage);
                return this;
            }

            @Deprecated
            /* renamed from: a0 */
            public C32321a mo93814a0(int i) {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).setLaunchStageValue(i);
                return this;
            }

            /* renamed from: b0 */
            public C32321a mo93815b0(Duration.C34243b bVar) {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).setSamplePeriod((Duration) bVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C32321a mo93816c0(Duration duration) {
                mo100457F();
                ((MetricDescriptorMetadata) this.f83053b).setSamplePeriod(duration);
                return this;
            }

            public Duration getIngestDelay() {
                return ((MetricDescriptorMetadata) this.f83053b).getIngestDelay();
            }

            @Deprecated
            public LaunchStage getLaunchStage() {
                return ((MetricDescriptorMetadata) this.f83053b).getLaunchStage();
            }

            @Deprecated
            public int getLaunchStageValue() {
                return ((MetricDescriptorMetadata) this.f83053b).getLaunchStageValue();
            }

            public Duration getSamplePeriod() {
                return ((MetricDescriptorMetadata) this.f83053b).getSamplePeriod();
            }

            public boolean hasIngestDelay() {
                return ((MetricDescriptorMetadata) this.f83053b).hasIngestDelay();
            }

            public boolean hasSamplePeriod() {
                return ((MetricDescriptorMetadata) this.f83053b).hasSamplePeriod();
            }

            public C32321a() {
                super(MetricDescriptorMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata();
            DEFAULT_INSTANCE = metricDescriptorMetadata;
            GeneratedMessageLite.registerDefaultInstance(MetricDescriptorMetadata.class, metricDescriptorMetadata);
        }

        private MetricDescriptorMetadata() {
        }

        /* access modifiers changed from: private */
        public void clearIngestDelay() {
            this.ingestDelay_ = null;
        }

        /* access modifiers changed from: private */
        public void clearLaunchStage() {
            this.launchStage_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSamplePeriod() {
            this.samplePeriod_ = null;
        }

        public static MetricDescriptorMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeIngestDelay(Duration duration) {
            duration.getClass();
            Duration duration2 = this.ingestDelay_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.ingestDelay_ = duration;
            } else {
                this.ingestDelay_ = (Duration) ((Duration.C34243b) Duration.newBuilder(this.ingestDelay_).mo100463K(duration)).mo100467Q();
            }
        }

        /* access modifiers changed from: private */
        public void mergeSamplePeriod(Duration duration) {
            duration.getClass();
            Duration duration2 = this.samplePeriod_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.samplePeriod_ = duration;
            } else {
                this.samplePeriod_ = (Duration) ((Duration.C34243b) Duration.newBuilder(this.samplePeriod_).mo100463K(duration)).mo100467Q();
            }
        }

        public static C32321a newBuilder() {
            return (C32321a) DEFAULT_INSTANCE.createBuilder();
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<MetricDescriptorMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIngestDelay(Duration duration) {
            duration.getClass();
            this.ingestDelay_ = duration;
        }

        /* access modifiers changed from: private */
        public void setLaunchStage(LaunchStage launchStage) {
            this.launchStage_ = launchStage.getNumber();
        }

        /* access modifiers changed from: private */
        public void setLaunchStageValue(int i) {
            this.launchStage_ = i;
        }

        /* access modifiers changed from: private */
        public void setSamplePeriod(Duration duration) {
            duration.getClass();
            this.samplePeriod_ = duration;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C32326a.f78741a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MetricDescriptorMetadata();
                case 2:
                    return new C32321a((C32326a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"launchStage_", "samplePeriod_", "ingestDelay_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<MetricDescriptorMetadata> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (MetricDescriptorMetadata.class) {
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

        public Duration getIngestDelay() {
            Duration duration = this.ingestDelay_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Deprecated
        public LaunchStage getLaunchStage() {
            LaunchStage b = LaunchStage.m130831b(this.launchStage_);
            if (b == null) {
                return LaunchStage.UNRECOGNIZED;
            }
            return b;
        }

        @Deprecated
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        public Duration getSamplePeriod() {
            Duration duration = this.samplePeriod_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public boolean hasIngestDelay() {
            return this.ingestDelay_ != null;
        }

        public boolean hasSamplePeriod() {
            return this.samplePeriod_ != null;
        }

        public static C32321a newBuilder(MetricDescriptorMetadata metricDescriptorMetadata) {
            return (C32321a) DEFAULT_INSTANCE.createBuilder(metricDescriptorMetadata);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static MetricDescriptorMetadata parseFrom(C34448s sVar) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static MetricDescriptorMetadata parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public enum MetricKind implements C34471v0.C34474c {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: f */
        public static final int f78716f = 0;

        /* renamed from: g */
        public static final int f78717g = 1;

        /* renamed from: v */
        public static final int f78718v = 2;

        /* renamed from: w */
        public static final int f78719w = 3;

        /* renamed from: x */
        public static final C34471v0.C34475d<MetricKind> f78720x = null;
        private final int value;

        /* renamed from: com.google.api.MetricDescriptor$MetricKind$a */
        public class C32322a implements C34471v0.C34475d<MetricKind> {
            /* renamed from: b */
            public MetricKind mo93187a(int i) {
                return MetricKind.m130900b(i);
            }
        }

        /* renamed from: com.google.api.MetricDescriptor$MetricKind$b */
        public static final class C32323b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f78722a = null;

            static {
                f78722a = new C32323b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return MetricKind.m130900b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f78720x = new C32322a();
        }

        /* access modifiers changed from: public */
        MetricKind(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static MetricKind m130900b(int i) {
            if (i == 0) {
                return METRIC_KIND_UNSPECIFIED;
            }
            if (i == 1) {
                return GAUGE;
            }
            if (i == 2) {
                return DELTA;
            }
            if (i != 3) {
                return null;
            }
            return CUMULATIVE;
        }

        /* renamed from: g */
        public static C34471v0.C34475d<MetricKind> m130901g() {
            return f78720x;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m130902q() {
            return C32323b.f78722a;
        }

        @Deprecated
        /* renamed from: r */
        public static MetricKind m130903r(int i) {
            return m130900b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum ValueType implements C34471v0.C34474c {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);
        

        /* renamed from: E0 */
        public static final C34471v0.C34475d<ValueType> f78723E0 = null;

        /* renamed from: X */
        public static final int f78725X = 4;

        /* renamed from: Y */
        public static final int f78726Y = 5;

        /* renamed from: Z */
        public static final int f78727Z = 6;

        /* renamed from: w */
        public static final int f78736w = 0;

        /* renamed from: x */
        public static final int f78737x = 1;

        /* renamed from: y */
        public static final int f78738y = 2;

        /* renamed from: z */
        public static final int f78739z = 3;
        private final int value;

        /* renamed from: com.google.api.MetricDescriptor$ValueType$a */
        public class C32324a implements C34471v0.C34475d<ValueType> {
            /* renamed from: b */
            public ValueType mo93187a(int i) {
                return ValueType.m130907b(i);
            }
        }

        /* renamed from: com.google.api.MetricDescriptor$ValueType$b */
        public static final class C32325b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f78740a = null;

            static {
                f78740a = new C32325b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return ValueType.m130907b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f78723E0 = new C32324a();
        }

        /* access modifiers changed from: public */
        ValueType(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static ValueType m130907b(int i) {
            switch (i) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        /* renamed from: g */
        public static C34471v0.C34475d<ValueType> m130908g() {
            return f78723E0;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m130909q() {
            return C32325b.f78740a;
        }

        @Deprecated
        /* renamed from: r */
        public static ValueType m130910r(int i) {
            return m130907b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.google.api.MetricDescriptor$a */
    public static /* synthetic */ class C32326a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78741a;

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
                f78741a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78741a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78741a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78741a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78741a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78741a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78741a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.MetricDescriptor.C32326a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.MetricDescriptor$b */
    public static final class C32327b extends GeneratedMessageLite.C34263b<MetricDescriptor, C32327b> implements C32431r0 {
        public /* synthetic */ C32327b(C32326a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C32327b mo93819B0(String str) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: D0 */
        public C32327b mo93820D0(ByteString byteString) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: E0 */
        public C32327b mo93821E0(String str) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setType(str);
            return this;
        }

        /* renamed from: F0 */
        public C32327b mo93822F0(ByteString byteString) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setTypeBytes(byteString);
            return this;
        }

        /* renamed from: G0 */
        public C32327b mo93823G0(String str) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setUnit(str);
            return this;
        }

        /* renamed from: H0 */
        public C32327b mo93824H0(ByteString byteString) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setUnitBytes(byteString);
            return this;
        }

        /* renamed from: I0 */
        public C32327b mo93825I0(ValueType valueType) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setValueType(valueType);
            return this;
        }

        /* renamed from: J0 */
        public C32327b mo93826J0(int i) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setValueTypeValue(i);
            return this;
        }

        /* renamed from: P */
        public C32327b mo93827P(Iterable<? extends LabelDescriptor> iterable) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).addAllLabels(iterable);
            return this;
        }

        /* renamed from: R */
        public C32327b mo93828R(int i, LabelDescriptor.C32309b bVar) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).addLabels(i, (LabelDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32327b mo93829S(int i, LabelDescriptor labelDescriptor) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).addLabels(i, labelDescriptor);
            return this;
        }

        /* renamed from: T */
        public C32327b mo93830T(LabelDescriptor.C32309b bVar) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).addLabels((LabelDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32327b mo93831U(LabelDescriptor labelDescriptor) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).addLabels(labelDescriptor);
            return this;
        }

        /* renamed from: V */
        public C32327b mo93832V() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearDescription();
            return this;
        }

        /* renamed from: Y */
        public C32327b mo93833Y() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearDisplayName();
            return this;
        }

        /* renamed from: Z */
        public C32327b mo93834Z() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearLabels();
            return this;
        }

        /* renamed from: a0 */
        public C32327b mo93835a0() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearLaunchStage();
            return this;
        }

        /* renamed from: b0 */
        public C32327b mo93836b0() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearMetadata();
            return this;
        }

        /* renamed from: c0 */
        public C32327b mo93837c0() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearMetricKind();
            return this;
        }

        /* renamed from: d0 */
        public C32327b mo93838d0() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearName();
            return this;
        }

        /* renamed from: g0 */
        public C32327b mo93839g0() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearType();
            return this;
        }

        public String getDescription() {
            return ((MetricDescriptor) this.f83053b).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((MetricDescriptor) this.f83053b).getDescriptionBytes();
        }

        public String getDisplayName() {
            return ((MetricDescriptor) this.f83053b).getDisplayName();
        }

        public ByteString getDisplayNameBytes() {
            return ((MetricDescriptor) this.f83053b).getDisplayNameBytes();
        }

        public LabelDescriptor getLabels(int i) {
            return ((MetricDescriptor) this.f83053b).getLabels(i);
        }

        public int getLabelsCount() {
            return ((MetricDescriptor) this.f83053b).getLabelsCount();
        }

        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((MetricDescriptor) this.f83053b).getLabelsList());
        }

        public LaunchStage getLaunchStage() {
            return ((MetricDescriptor) this.f83053b).getLaunchStage();
        }

        public int getLaunchStageValue() {
            return ((MetricDescriptor) this.f83053b).getLaunchStageValue();
        }

        public MetricDescriptorMetadata getMetadata() {
            return ((MetricDescriptor) this.f83053b).getMetadata();
        }

        public MetricKind getMetricKind() {
            return ((MetricDescriptor) this.f83053b).getMetricKind();
        }

        public int getMetricKindValue() {
            return ((MetricDescriptor) this.f83053b).getMetricKindValue();
        }

        public String getName() {
            return ((MetricDescriptor) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((MetricDescriptor) this.f83053b).getNameBytes();
        }

        public String getType() {
            return ((MetricDescriptor) this.f83053b).getType();
        }

        public ByteString getTypeBytes() {
            return ((MetricDescriptor) this.f83053b).getTypeBytes();
        }

        public String getUnit() {
            return ((MetricDescriptor) this.f83053b).getUnit();
        }

        public ByteString getUnitBytes() {
            return ((MetricDescriptor) this.f83053b).getUnitBytes();
        }

        public ValueType getValueType() {
            return ((MetricDescriptor) this.f83053b).getValueType();
        }

        public int getValueTypeValue() {
            return ((MetricDescriptor) this.f83053b).getValueTypeValue();
        }

        /* renamed from: h0 */
        public C32327b mo93840h0() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearUnit();
            return this;
        }

        public boolean hasMetadata() {
            return ((MetricDescriptor) this.f83053b).hasMetadata();
        }

        /* renamed from: i0 */
        public C32327b mo93841i0() {
            mo100457F();
            ((MetricDescriptor) this.f83053b).clearValueType();
            return this;
        }

        /* renamed from: j0 */
        public C32327b mo93842j0(MetricDescriptorMetadata metricDescriptorMetadata) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).mergeMetadata(metricDescriptorMetadata);
            return this;
        }

        /* renamed from: k0 */
        public C32327b mo93843k0(int i) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).removeLabels(i);
            return this;
        }

        /* renamed from: l0 */
        public C32327b mo93844l0(String str) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setDescription(str);
            return this;
        }

        /* renamed from: m0 */
        public C32327b mo93845m0(ByteString byteString) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setDescriptionBytes(byteString);
            return this;
        }

        /* renamed from: o0 */
        public C32327b mo93846o0(String str) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setDisplayName(str);
            return this;
        }

        /* renamed from: q0 */
        public C32327b mo93847q0(ByteString byteString) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setDisplayNameBytes(byteString);
            return this;
        }

        /* renamed from: r0 */
        public C32327b mo93848r0(int i, LabelDescriptor.C32309b bVar) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setLabels(i, (LabelDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: s0 */
        public C32327b mo93849s0(int i, LabelDescriptor labelDescriptor) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setLabels(i, labelDescriptor);
            return this;
        }

        /* renamed from: u0 */
        public C32327b mo93850u0(LaunchStage launchStage) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setLaunchStage(launchStage);
            return this;
        }

        /* renamed from: v0 */
        public C32327b mo93851v0(int i) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setLaunchStageValue(i);
            return this;
        }

        /* renamed from: w0 */
        public C32327b mo93852w0(MetricDescriptorMetadata.C32321a aVar) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setMetadata((MetricDescriptorMetadata) aVar.mo100473g());
            return this;
        }

        /* renamed from: x0 */
        public C32327b mo93853x0(MetricDescriptorMetadata metricDescriptorMetadata) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setMetadata(metricDescriptorMetadata);
            return this;
        }

        /* renamed from: y0 */
        public C32327b mo93854y0(MetricKind metricKind) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setMetricKind(metricKind);
            return this;
        }

        /* renamed from: z0 */
        public C32327b mo93855z0(int i) {
            mo100457F();
            ((MetricDescriptor) this.f83053b).setMetricKindValue(i);
            return this;
        }

        public C32327b() {
            super(MetricDescriptor.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.MetricDescriptor$c */
    public interface C32328c extends C34417m1 {
        Duration getIngestDelay();

        @Deprecated
        LaunchStage getLaunchStage();

        @Deprecated
        int getLaunchStageValue();

        Duration getSamplePeriod();

        boolean hasIngestDelay();

        boolean hasSamplePeriod();
    }

    static {
        MetricDescriptor metricDescriptor = new MetricDescriptor();
        DEFAULT_INSTANCE = metricDescriptor;
        GeneratedMessageLite.registerDefaultInstance(MetricDescriptor.class, metricDescriptor);
    }

    private MetricDescriptor() {
    }

    /* access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        ensureLabelsIsMutable();
        C34319a.addAll(iterable, this.labels_);
    }

    /* access modifiers changed from: private */
    public void addLabels(LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
    }

    /* access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* access modifiers changed from: private */
    public void clearLabels() {
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
    }

    /* access modifiers changed from: private */
    public void clearMetricKind() {
        this.metricKind_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    /* access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    private void ensureLabelsIsMutable() {
        C34471v0.C34488k<LabelDescriptor> kVar = this.labels_;
        if (!kVar.mo100971T()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        MetricDescriptorMetadata metricDescriptorMetadata2 = this.metadata_;
        if (metricDescriptorMetadata2 == null || metricDescriptorMetadata2 == MetricDescriptorMetadata.getDefaultInstance()) {
            this.metadata_ = metricDescriptorMetadata;
        } else {
            this.metadata_ = (MetricDescriptorMetadata) ((MetricDescriptorMetadata.C32321a) MetricDescriptorMetadata.newBuilder(this.metadata_).mo100463K(metricDescriptorMetadata)).mo100467Q();
        }
    }

    public static C32327b newBuilder() {
        return (C32327b) DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<MetricDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* access modifiers changed from: private */
    public void setDisplayNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.displayName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i, labelDescriptor);
    }

    /* access modifiers changed from: private */
    public void setLaunchStage(LaunchStage launchStage) {
        this.launchStage_ = launchStage.getNumber();
    }

    /* access modifiers changed from: private */
    public void setLaunchStageValue(int i) {
        this.launchStage_ = i;
    }

    /* access modifiers changed from: private */
    public void setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        this.metadata_ = metricDescriptorMetadata;
    }

    /* access modifiers changed from: private */
    public void setMetricKind(MetricKind metricKind) {
        this.metricKind_ = metricKind.getNumber();
    }

    /* access modifiers changed from: private */
    public void setMetricKindValue(int i) {
        this.metricKind_ = i;
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setUnit(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* access modifiers changed from: private */
    public void setUnitBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.unit_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setValueType(ValueType valueType) {
        this.valueType_ = valueType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setValueTypeValue(int i) {
        this.valueType_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32326a.f78741a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricDescriptor();
            case 2:
                return new C32327b((C32326a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\n\t\f\f", new Object[]{"name_", "labels_", LabelDescriptor.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<MetricDescriptor> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (MetricDescriptor.class) {
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

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.m137260e0(this.description_);
    }

    public String getDisplayName() {
        return this.displayName_;
    }

    public ByteString getDisplayNameBytes() {
        return ByteString.m137260e0(this.displayName_);
    }

    public LabelDescriptor getLabels(int i) {
        return this.labels_.get(i);
    }

    public int getLabelsCount() {
        return this.labels_.size();
    }

    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public C32410k0 getLabelsOrBuilder(int i) {
        return this.labels_.get(i);
    }

    public List<? extends C32410k0> getLabelsOrBuilderList() {
        return this.labels_;
    }

    public LaunchStage getLaunchStage() {
        LaunchStage b = LaunchStage.m130831b(this.launchStage_);
        if (b == null) {
            return LaunchStage.UNRECOGNIZED;
        }
        return b;
    }

    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    public MetricDescriptorMetadata getMetadata() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
        return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
    }

    public MetricKind getMetricKind() {
        MetricKind b = MetricKind.m130900b(this.metricKind_);
        if (b == null) {
            return MetricKind.UNRECOGNIZED;
        }
        return b;
    }

    public int getMetricKindValue() {
        return this.metricKind_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.m137260e0(this.type_);
    }

    public String getUnit() {
        return this.unit_;
    }

    public ByteString getUnitBytes() {
        return ByteString.m137260e0(this.unit_);
    }

    public ValueType getValueType() {
        ValueType b = ValueType.m130907b(this.valueType_);
        if (b == null) {
            return ValueType.UNRECOGNIZED;
        }
        return b;
    }

    public int getValueTypeValue() {
        return this.valueType_;
    }

    public boolean hasMetadata() {
        return this.metadata_ != null;
    }

    public static C32327b newBuilder(MetricDescriptor metricDescriptor) {
        return (C32327b) DEFAULT_INSTANCE.createBuilder(metricDescriptor);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static MetricDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, labelDescriptor);
    }

    public static MetricDescriptor parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static MetricDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricDescriptor parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static MetricDescriptor parseFrom(C34448s sVar) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static MetricDescriptor parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
