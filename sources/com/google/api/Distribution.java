package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34361f;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34417m1;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Distribution extends GeneratedMessageLite<Distribution, C32287c> implements C32445w {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Distribution DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile C34504y1<Distribution> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bucketCountsMemoizedSerializedSize = -1;
    private C34471v0.C34481i bucketCounts_ = GeneratedMessageLite.emptyLongList();
    private BucketOptions bucketOptions_;
    private long count_;
    private C34471v0.C34488k<Exemplar> exemplars_ = GeneratedMessageLite.emptyProtobufList();
    private double mean_;
    private Range range_;
    private double sumOfSquaredDeviation_;

    public static final class BucketOptions extends GeneratedMessageLite<BucketOptions, C32279a> implements C32286b {
        /* access modifiers changed from: private */
        public static final BucketOptions DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile C34504y1<BucketOptions> PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        public static final class Explicit extends GeneratedMessageLite<Explicit, C32276a> implements C32280b {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Explicit DEFAULT_INSTANCE;
            private static volatile C34504y1<Explicit> PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private C34471v0.C34473b bounds_ = GeneratedMessageLite.emptyDoubleList();

            /* renamed from: com.google.api.Distribution$BucketOptions$Explicit$a */
            public static final class C32276a extends GeneratedMessageLite.C34263b<Explicit, C32276a> implements C32280b {
                public /* synthetic */ C32276a(C32285a aVar) {
                    this();
                }

                /* renamed from: P */
                public C32276a mo93372P(Iterable<? extends Double> iterable) {
                    mo100457F();
                    ((Explicit) this.f83053b).addAllBounds(iterable);
                    return this;
                }

                /* renamed from: R */
                public C32276a mo93373R(double d) {
                    mo100457F();
                    ((Explicit) this.f83053b).addBounds(d);
                    return this;
                }

                /* renamed from: S */
                public C32276a mo93374S() {
                    mo100457F();
                    ((Explicit) this.f83053b).clearBounds();
                    return this;
                }

                /* renamed from: T */
                public C32276a mo93375T(int i, double d) {
                    mo100457F();
                    ((Explicit) this.f83053b).setBounds(i, d);
                    return this;
                }

                public double getBounds(int i) {
                    return ((Explicit) this.f83053b).getBounds(i);
                }

                public int getBoundsCount() {
                    return ((Explicit) this.f83053b).getBoundsCount();
                }

                public List<Double> getBoundsList() {
                    return Collections.unmodifiableList(((Explicit) this.f83053b).getBoundsList());
                }

                public C32276a() {
                    super(Explicit.DEFAULT_INSTANCE);
                }
            }

            static {
                Explicit explicit = new Explicit();
                DEFAULT_INSTANCE = explicit;
                GeneratedMessageLite.registerDefaultInstance(Explicit.class, explicit);
            }

            private Explicit() {
            }

            /* access modifiers changed from: private */
            public void addAllBounds(Iterable<? extends Double> iterable) {
                ensureBoundsIsMutable();
                C34319a.addAll(iterable, this.bounds_);
            }

            /* access modifiers changed from: private */
            public void addBounds(double d) {
                ensureBoundsIsMutable();
                this.bounds_.mo101622c0(d);
            }

            /* access modifiers changed from: private */
            public void clearBounds() {
                this.bounds_ = GeneratedMessageLite.emptyDoubleList();
            }

            private void ensureBoundsIsMutable() {
                C34471v0.C34473b bVar = this.bounds_;
                if (!bVar.mo100971T()) {
                    this.bounds_ = GeneratedMessageLite.mutableCopy(bVar);
                }
            }

            public static Explicit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C32276a newBuilder() {
                return (C32276a) DEFAULT_INSTANCE.createBuilder();
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Explicit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C34504y1<Explicit> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setBounds(int i, double d) {
                ensureBoundsIsMutable();
                this.bounds_.mo101620B(i, d);
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C32285a.f78644a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Explicit();
                    case 2:
                        return new C32276a((C32285a) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"bounds_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C34504y1<Explicit> y1Var = PARSER;
                        if (y1Var == null) {
                            synchronized (Explicit.class) {
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

            public double getBounds(int i) {
                return this.bounds_.getDouble(i);
            }

            public int getBoundsCount() {
                return this.bounds_.size();
            }

            public List<Double> getBoundsList() {
                return this.bounds_;
            }

            public static C32276a newBuilder(Explicit explicit) {
                return (C32276a) DEFAULT_INSTANCE.createBuilder(explicit);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Explicit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
            }

            public static Explicit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Explicit parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
            }

            public static Explicit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Explicit parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
            }

            public static Explicit parseFrom(InputStream inputStream) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Explicit parseFrom(C34448s sVar) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
            }

            public static Explicit parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
                return (Explicit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
            }
        }

        public static final class Exponential extends GeneratedMessageLite<Exponential, C32277a> implements C32281c {
            /* access modifiers changed from: private */
            public static final Exponential DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile C34504y1<Exponential> PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            /* renamed from: com.google.api.Distribution$BucketOptions$Exponential$a */
            public static final class C32277a extends GeneratedMessageLite.C34263b<Exponential, C32277a> implements C32281c {
                public /* synthetic */ C32277a(C32285a aVar) {
                    this();
                }

                /* renamed from: P */
                public C32277a mo93379P() {
                    mo100457F();
                    ((Exponential) this.f83053b).clearGrowthFactor();
                    return this;
                }

                /* renamed from: R */
                public C32277a mo93380R() {
                    mo100457F();
                    ((Exponential) this.f83053b).clearNumFiniteBuckets();
                    return this;
                }

                /* renamed from: S */
                public C32277a mo93381S() {
                    mo100457F();
                    ((Exponential) this.f83053b).clearScale();
                    return this;
                }

                /* renamed from: T */
                public C32277a mo93382T(double d) {
                    mo100457F();
                    ((Exponential) this.f83053b).setGrowthFactor(d);
                    return this;
                }

                /* renamed from: U */
                public C32277a mo93383U(int i) {
                    mo100457F();
                    ((Exponential) this.f83053b).setNumFiniteBuckets(i);
                    return this;
                }

                /* renamed from: V */
                public C32277a mo93384V(double d) {
                    mo100457F();
                    ((Exponential) this.f83053b).setScale(d);
                    return this;
                }

                public double getGrowthFactor() {
                    return ((Exponential) this.f83053b).getGrowthFactor();
                }

                public int getNumFiniteBuckets() {
                    return ((Exponential) this.f83053b).getNumFiniteBuckets();
                }

                public double getScale() {
                    return ((Exponential) this.f83053b).getScale();
                }

                public C32277a() {
                    super(Exponential.DEFAULT_INSTANCE);
                }
            }

            static {
                Exponential exponential = new Exponential();
                DEFAULT_INSTANCE = exponential;
                GeneratedMessageLite.registerDefaultInstance(Exponential.class, exponential);
            }

            private Exponential() {
            }

            /* access modifiers changed from: private */
            public void clearGrowthFactor() {
                this.growthFactor_ = 0.0d;
            }

            /* access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearScale() {
                this.scale_ = 0.0d;
            }

            public static Exponential getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C32277a newBuilder() {
                return (C32277a) DEFAULT_INSTANCE.createBuilder();
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Exponential) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C34504y1<Exponential> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setGrowthFactor(double d) {
                this.growthFactor_ = d;
            }

            /* access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* access modifiers changed from: private */
            public void setScale(double d) {
                this.scale_ = d;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C32285a.f78644a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Exponential();
                    case 2:
                        return new C32277a((C32285a) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C34504y1<Exponential> y1Var = PARSER;
                        if (y1Var == null) {
                            synchronized (Exponential.class) {
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

            public double getGrowthFactor() {
                return this.growthFactor_;
            }

            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            public double getScale() {
                return this.scale_;
            }

            public static C32277a newBuilder(Exponential exponential) {
                return (C32277a) DEFAULT_INSTANCE.createBuilder(exponential);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Exponential) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
            }

            public static Exponential parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Exponential parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
            }

            public static Exponential parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Exponential parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
            }

            public static Exponential parseFrom(InputStream inputStream) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Exponential parseFrom(C34448s sVar) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
            }

            public static Exponential parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
                return (Exponential) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
            }
        }

        public static final class Linear extends GeneratedMessageLite<Linear, C32278a> implements C32282d {
            /* access modifiers changed from: private */
            public static final Linear DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile C34504y1<Linear> PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            /* renamed from: com.google.api.Distribution$BucketOptions$Linear$a */
            public static final class C32278a extends GeneratedMessageLite.C34263b<Linear, C32278a> implements C32282d {
                public /* synthetic */ C32278a(C32285a aVar) {
                    this();
                }

                /* renamed from: P */
                public C32278a mo93388P() {
                    mo100457F();
                    ((Linear) this.f83053b).clearNumFiniteBuckets();
                    return this;
                }

                /* renamed from: R */
                public C32278a mo93389R() {
                    mo100457F();
                    ((Linear) this.f83053b).clearOffset();
                    return this;
                }

                /* renamed from: S */
                public C32278a mo93390S() {
                    mo100457F();
                    ((Linear) this.f83053b).clearWidth();
                    return this;
                }

                /* renamed from: T */
                public C32278a mo93391T(int i) {
                    mo100457F();
                    ((Linear) this.f83053b).setNumFiniteBuckets(i);
                    return this;
                }

                /* renamed from: U */
                public C32278a mo93392U(double d) {
                    mo100457F();
                    ((Linear) this.f83053b).setOffset(d);
                    return this;
                }

                /* renamed from: V */
                public C32278a mo93393V(double d) {
                    mo100457F();
                    ((Linear) this.f83053b).setWidth(d);
                    return this;
                }

                public int getNumFiniteBuckets() {
                    return ((Linear) this.f83053b).getNumFiniteBuckets();
                }

                public double getOffset() {
                    return ((Linear) this.f83053b).getOffset();
                }

                public double getWidth() {
                    return ((Linear) this.f83053b).getWidth();
                }

                public C32278a() {
                    super(Linear.DEFAULT_INSTANCE);
                }
            }

            static {
                Linear linear = new Linear();
                DEFAULT_INSTANCE = linear;
                GeneratedMessageLite.registerDefaultInstance(Linear.class, linear);
            }

            private Linear() {
            }

            /* access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearOffset() {
                this.offset_ = 0.0d;
            }

            /* access modifiers changed from: private */
            public void clearWidth() {
                this.width_ = 0.0d;
            }

            public static Linear getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C32278a newBuilder() {
                return (C32278a) DEFAULT_INSTANCE.createBuilder();
            }

            public static Linear parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Linear) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C34504y1<Linear> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setNumFiniteBuckets(int i) {
                this.numFiniteBuckets_ = i;
            }

            /* access modifiers changed from: private */
            public void setOffset(double d) {
                this.offset_ = d;
            }

            /* access modifiers changed from: private */
            public void setWidth(double d) {
                this.width_ = d;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C32285a.f78644a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Linear();
                    case 2:
                        return new C32278a((C32285a) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "width_", "offset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C34504y1<Linear> y1Var = PARSER;
                        if (y1Var == null) {
                            synchronized (Linear.class) {
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

            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            public double getOffset() {
                return this.offset_;
            }

            public double getWidth() {
                return this.width_;
            }

            public static C32278a newBuilder(Linear linear) {
                return (C32278a) DEFAULT_INSTANCE.createBuilder(linear);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Linear) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
            }

            public static Linear parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Linear parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
            }

            public static Linear parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Linear parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
            }

            public static Linear parseFrom(InputStream inputStream) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
            }

            public static Linear parseFrom(C34448s sVar) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
            }

            public static Linear parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
                return (Linear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
            }
        }

        public enum OptionsCase {
            LINEAR_BUCKETS(1),
            EXPONENTIAL_BUCKETS(2),
            EXPLICIT_BUCKETS(3),
            OPTIONS_NOT_SET(0);
            
            private final int value;

            /* access modifiers changed from: public */
            OptionsCase(int i) {
                this.value = i;
            }

            /* renamed from: b */
            public static OptionsCase m130616b(int i) {
                if (i == 0) {
                    return OPTIONS_NOT_SET;
                }
                if (i == 1) {
                    return LINEAR_BUCKETS;
                }
                if (i == 2) {
                    return EXPONENTIAL_BUCKETS;
                }
                if (i != 3) {
                    return null;
                }
                return EXPLICIT_BUCKETS;
            }

            @Deprecated
            /* renamed from: g */
            public static OptionsCase m130617g(int i) {
                return m130616b(i);
            }

            public int getNumber() {
                return this.value;
            }
        }

        /* renamed from: com.google.api.Distribution$BucketOptions$a */
        public static final class C32279a extends GeneratedMessageLite.C34263b<BucketOptions, C32279a> implements C32286b {
            public /* synthetic */ C32279a(C32285a aVar) {
                this();
            }

            /* renamed from: P */
            public C32279a mo93395P() {
                mo100457F();
                ((BucketOptions) this.f83053b).clearExplicitBuckets();
                return this;
            }

            /* renamed from: R */
            public C32279a mo93396R() {
                mo100457F();
                ((BucketOptions) this.f83053b).clearExponentialBuckets();
                return this;
            }

            /* renamed from: S */
            public C32279a mo93397S() {
                mo100457F();
                ((BucketOptions) this.f83053b).clearLinearBuckets();
                return this;
            }

            /* renamed from: T */
            public C32279a mo93398T() {
                mo100457F();
                ((BucketOptions) this.f83053b).clearOptions();
                return this;
            }

            /* renamed from: U */
            public C32279a mo93399U(Explicit explicit) {
                mo100457F();
                ((BucketOptions) this.f83053b).mergeExplicitBuckets(explicit);
                return this;
            }

            /* renamed from: V */
            public C32279a mo93400V(Exponential exponential) {
                mo100457F();
                ((BucketOptions) this.f83053b).mergeExponentialBuckets(exponential);
                return this;
            }

            /* renamed from: Y */
            public C32279a mo93401Y(Linear linear) {
                mo100457F();
                ((BucketOptions) this.f83053b).mergeLinearBuckets(linear);
                return this;
            }

            /* renamed from: Z */
            public C32279a mo93402Z(Explicit.C32276a aVar) {
                mo100457F();
                ((BucketOptions) this.f83053b).setExplicitBuckets((Explicit) aVar.mo100473g());
                return this;
            }

            /* renamed from: a0 */
            public C32279a mo93403a0(Explicit explicit) {
                mo100457F();
                ((BucketOptions) this.f83053b).setExplicitBuckets(explicit);
                return this;
            }

            /* renamed from: b0 */
            public C32279a mo93404b0(Exponential.C32277a aVar) {
                mo100457F();
                ((BucketOptions) this.f83053b).setExponentialBuckets((Exponential) aVar.mo100473g());
                return this;
            }

            /* renamed from: c0 */
            public C32279a mo93405c0(Exponential exponential) {
                mo100457F();
                ((BucketOptions) this.f83053b).setExponentialBuckets(exponential);
                return this;
            }

            /* renamed from: d0 */
            public C32279a mo93406d0(Linear.C32278a aVar) {
                mo100457F();
                ((BucketOptions) this.f83053b).setLinearBuckets((Linear) aVar.mo100473g());
                return this;
            }

            /* renamed from: g0 */
            public C32279a mo93407g0(Linear linear) {
                mo100457F();
                ((BucketOptions) this.f83053b).setLinearBuckets(linear);
                return this;
            }

            public Explicit getExplicitBuckets() {
                return ((BucketOptions) this.f83053b).getExplicitBuckets();
            }

            public Exponential getExponentialBuckets() {
                return ((BucketOptions) this.f83053b).getExponentialBuckets();
            }

            public Linear getLinearBuckets() {
                return ((BucketOptions) this.f83053b).getLinearBuckets();
            }

            public OptionsCase getOptionsCase() {
                return ((BucketOptions) this.f83053b).getOptionsCase();
            }

            public boolean hasExplicitBuckets() {
                return ((BucketOptions) this.f83053b).hasExplicitBuckets();
            }

            public boolean hasExponentialBuckets() {
                return ((BucketOptions) this.f83053b).hasExponentialBuckets();
            }

            public boolean hasLinearBuckets() {
                return ((BucketOptions) this.f83053b).hasLinearBuckets();
            }

            public C32279a() {
                super(BucketOptions.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.api.Distribution$BucketOptions$b */
        public interface C32280b extends C34417m1 {
            double getBounds(int i);

            int getBoundsCount();

            List<Double> getBoundsList();
        }

        /* renamed from: com.google.api.Distribution$BucketOptions$c */
        public interface C32281c extends C34417m1 {
            double getGrowthFactor();

            int getNumFiniteBuckets();

            double getScale();
        }

        /* renamed from: com.google.api.Distribution$BucketOptions$d */
        public interface C32282d extends C34417m1 {
            int getNumFiniteBuckets();

            double getOffset();

            double getWidth();
        }

        static {
            BucketOptions bucketOptions = new BucketOptions();
            DEFAULT_INSTANCE = bucketOptions;
            GeneratedMessageLite.registerDefaultInstance(BucketOptions.class, bucketOptions);
        }

        private BucketOptions() {
        }

        /* access modifiers changed from: private */
        public void clearExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLinearBuckets() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        public static BucketOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeExplicitBuckets(Explicit explicit) {
            explicit.getClass();
            if (this.optionsCase_ != 3 || this.options_ == Explicit.getDefaultInstance()) {
                this.options_ = explicit;
            } else {
                this.options_ = ((Explicit.C32276a) Explicit.newBuilder((Explicit) this.options_).mo100463K(explicit)).mo100467Q();
            }
            this.optionsCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeExponentialBuckets(Exponential exponential) {
            exponential.getClass();
            if (this.optionsCase_ != 2 || this.options_ == Exponential.getDefaultInstance()) {
                this.options_ = exponential;
            } else {
                this.options_ = ((Exponential.C32277a) Exponential.newBuilder((Exponential) this.options_).mo100463K(exponential)).mo100467Q();
            }
            this.optionsCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeLinearBuckets(Linear linear) {
            linear.getClass();
            if (this.optionsCase_ != 1 || this.options_ == Linear.getDefaultInstance()) {
                this.options_ = linear;
            } else {
                this.options_ = ((Linear.C32278a) Linear.newBuilder((Linear) this.options_).mo100463K(linear)).mo100467Q();
            }
            this.optionsCase_ = 1;
        }

        public static C32279a newBuilder() {
            return (C32279a) DEFAULT_INSTANCE.createBuilder();
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<BucketOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setExplicitBuckets(Explicit explicit) {
            explicit.getClass();
            this.options_ = explicit;
            this.optionsCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setExponentialBuckets(Exponential exponential) {
            exponential.getClass();
            this.options_ = exponential;
            this.optionsCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setLinearBuckets(Linear linear) {
            linear.getClass();
            this.options_ = linear;
            this.optionsCase_ = 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C32285a.f78644a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BucketOptions();
                case 2:
                    return new C32279a((C32285a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"options_", "optionsCase_", Linear.class, Exponential.class, Explicit.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<BucketOptions> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (BucketOptions.class) {
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

        public Explicit getExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                return (Explicit) this.options_;
            }
            return Explicit.getDefaultInstance();
        }

        public Exponential getExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                return (Exponential) this.options_;
            }
            return Exponential.getDefaultInstance();
        }

        public Linear getLinearBuckets() {
            if (this.optionsCase_ == 1) {
                return (Linear) this.options_;
            }
            return Linear.getDefaultInstance();
        }

        public OptionsCase getOptionsCase() {
            return OptionsCase.m130616b(this.optionsCase_);
        }

        public boolean hasExplicitBuckets() {
            return this.optionsCase_ == 3;
        }

        public boolean hasExponentialBuckets() {
            return this.optionsCase_ == 2;
        }

        public boolean hasLinearBuckets() {
            return this.optionsCase_ == 1;
        }

        public static C32279a newBuilder(BucketOptions bucketOptions) {
            return (C32279a) DEFAULT_INSTANCE.createBuilder(bucketOptions);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static BucketOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BucketOptions parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static BucketOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BucketOptions parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static BucketOptions parseFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static BucketOptions parseFrom(C34448s sVar) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static BucketOptions parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (BucketOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class Exemplar extends GeneratedMessageLite<Exemplar, C32283a> implements C32288d {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Exemplar DEFAULT_INSTANCE;
        private static volatile C34504y1<Exemplar> PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private C34471v0.C34488k<Any> attachments_ = GeneratedMessageLite.emptyProtobufList();
        private Timestamp timestamp_;
        private double value_;

        /* renamed from: com.google.api.Distribution$Exemplar$a */
        public static final class C32283a extends GeneratedMessageLite.C34263b<Exemplar, C32283a> implements C32288d {
            public /* synthetic */ C32283a(C32285a aVar) {
                this();
            }

            /* renamed from: P */
            public C32283a mo93416P(Iterable<? extends Any> iterable) {
                mo100457F();
                ((Exemplar) this.f83053b).addAllAttachments(iterable);
                return this;
            }

            /* renamed from: R */
            public C32283a mo93417R(int i, Any.C34149b bVar) {
                mo100457F();
                ((Exemplar) this.f83053b).addAttachments(i, (Any) bVar.mo100473g());
                return this;
            }

            /* renamed from: S */
            public C32283a mo93418S(int i, Any any) {
                mo100457F();
                ((Exemplar) this.f83053b).addAttachments(i, any);
                return this;
            }

            /* renamed from: T */
            public C32283a mo93419T(Any.C34149b bVar) {
                mo100457F();
                ((Exemplar) this.f83053b).addAttachments((Any) bVar.mo100473g());
                return this;
            }

            /* renamed from: U */
            public C32283a mo93420U(Any any) {
                mo100457F();
                ((Exemplar) this.f83053b).addAttachments(any);
                return this;
            }

            /* renamed from: V */
            public C32283a mo93421V() {
                mo100457F();
                ((Exemplar) this.f83053b).clearAttachments();
                return this;
            }

            /* renamed from: Y */
            public C32283a mo93422Y() {
                mo100457F();
                ((Exemplar) this.f83053b).clearTimestamp();
                return this;
            }

            /* renamed from: Z */
            public C32283a mo93423Z() {
                mo100457F();
                ((Exemplar) this.f83053b).clearValue();
                return this;
            }

            /* renamed from: a0 */
            public C32283a mo93424a0(Timestamp timestamp) {
                mo100457F();
                ((Exemplar) this.f83053b).mergeTimestamp(timestamp);
                return this;
            }

            /* renamed from: b0 */
            public C32283a mo93425b0(int i) {
                mo100457F();
                ((Exemplar) this.f83053b).removeAttachments(i);
                return this;
            }

            /* renamed from: c0 */
            public C32283a mo93426c0(int i, Any.C34149b bVar) {
                mo100457F();
                ((Exemplar) this.f83053b).setAttachments(i, (Any) bVar.mo100473g());
                return this;
            }

            /* renamed from: d0 */
            public C32283a mo93427d0(int i, Any any) {
                mo100457F();
                ((Exemplar) this.f83053b).setAttachments(i, any);
                return this;
            }

            /* renamed from: g0 */
            public C32283a mo93428g0(Timestamp.C34298b bVar) {
                mo100457F();
                ((Exemplar) this.f83053b).setTimestamp((Timestamp) bVar.mo100473g());
                return this;
            }

            public Any getAttachments(int i) {
                return ((Exemplar) this.f83053b).getAttachments(i);
            }

            public int getAttachmentsCount() {
                return ((Exemplar) this.f83053b).getAttachmentsCount();
            }

            public List<Any> getAttachmentsList() {
                return Collections.unmodifiableList(((Exemplar) this.f83053b).getAttachmentsList());
            }

            public Timestamp getTimestamp() {
                return ((Exemplar) this.f83053b).getTimestamp();
            }

            public double getValue() {
                return ((Exemplar) this.f83053b).getValue();
            }

            /* renamed from: h0 */
            public C32283a mo93429h0(Timestamp timestamp) {
                mo100457F();
                ((Exemplar) this.f83053b).setTimestamp(timestamp);
                return this;
            }

            public boolean hasTimestamp() {
                return ((Exemplar) this.f83053b).hasTimestamp();
            }

            /* renamed from: i0 */
            public C32283a mo93430i0(double d) {
                mo100457F();
                ((Exemplar) this.f83053b).setValue(d);
                return this;
            }

            public C32283a() {
                super(Exemplar.DEFAULT_INSTANCE);
            }
        }

        static {
            Exemplar exemplar = new Exemplar();
            DEFAULT_INSTANCE = exemplar;
            GeneratedMessageLite.registerDefaultInstance(Exemplar.class, exemplar);
        }

        private Exemplar() {
        }

        /* access modifiers changed from: private */
        public void addAllAttachments(Iterable<? extends Any> iterable) {
            ensureAttachmentsIsMutable();
            C34319a.addAll(iterable, this.attachments_);
        }

        /* access modifiers changed from: private */
        public void addAttachments(Any any) {
            any.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.add(any);
        }

        /* access modifiers changed from: private */
        public void clearAttachments() {
            this.attachments_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0.0d;
        }

        private void ensureAttachmentsIsMutable() {
            C34471v0.C34488k<Any> kVar = this.attachments_;
            if (!kVar.mo100971T()) {
                this.attachments_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static Exemplar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.timestamp_ = timestamp;
            } else {
                this.timestamp_ = (Timestamp) ((Timestamp.C34298b) Timestamp.newBuilder(this.timestamp_).mo100463K(timestamp)).mo100467Q();
            }
        }

        public static C32283a newBuilder() {
            return (C32283a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<Exemplar> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAttachments(int i) {
            ensureAttachmentsIsMutable();
            this.attachments_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAttachments(int i, Any any) {
            any.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.set(i, any);
        }

        /* access modifiers changed from: private */
        public void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
        }

        /* access modifiers changed from: private */
        public void setValue(double d) {
            this.value_ = d;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C32285a.f78644a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Exemplar();
                case 2:
                    return new C32283a((C32285a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002\t\u0003\u001b", new Object[]{"value_", "timestamp_", "attachments_", Any.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<Exemplar> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (Exemplar.class) {
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

        public Any getAttachments(int i) {
            return this.attachments_.get(i);
        }

        public int getAttachmentsCount() {
            return this.attachments_.size();
        }

        public List<Any> getAttachmentsList() {
            return this.attachments_;
        }

        public C34361f getAttachmentsOrBuilder(int i) {
            return this.attachments_.get(i);
        }

        public List<? extends C34361f> getAttachmentsOrBuilderList() {
            return this.attachments_;
        }

        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public double getValue() {
            return this.value_;
        }

        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        public static C32283a newBuilder(Exemplar exemplar) {
            return (C32283a) DEFAULT_INSTANCE.createBuilder(exemplar);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static Exemplar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* access modifiers changed from: private */
        public void addAttachments(int i, Any any) {
            any.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.add(i, any);
        }

        public static Exemplar parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static Exemplar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Exemplar parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static Exemplar parseFrom(InputStream inputStream) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Exemplar parseFrom(C34448s sVar) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Exemplar parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (Exemplar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class Range extends GeneratedMessageLite<Range, C32284a> implements C32289e {
        /* access modifiers changed from: private */
        public static final Range DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile C34504y1<Range> PARSER;
        private double max_;
        private double min_;

        /* renamed from: com.google.api.Distribution$Range$a */
        public static final class C32284a extends GeneratedMessageLite.C34263b<Range, C32284a> implements C32289e {
            public /* synthetic */ C32284a(C32285a aVar) {
                this();
            }

            /* renamed from: P */
            public C32284a mo93433P() {
                mo100457F();
                ((Range) this.f83053b).clearMax();
                return this;
            }

            /* renamed from: R */
            public C32284a mo93434R() {
                mo100457F();
                ((Range) this.f83053b).clearMin();
                return this;
            }

            /* renamed from: S */
            public C32284a mo93435S(double d) {
                mo100457F();
                ((Range) this.f83053b).setMax(d);
                return this;
            }

            /* renamed from: T */
            public C32284a mo93436T(double d) {
                mo100457F();
                ((Range) this.f83053b).setMin(d);
                return this;
            }

            public double getMax() {
                return ((Range) this.f83053b).getMax();
            }

            public double getMin() {
                return ((Range) this.f83053b).getMin();
            }

            public C32284a() {
                super(Range.DEFAULT_INSTANCE);
            }
        }

        static {
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            GeneratedMessageLite.registerDefaultInstance(Range.class, range);
        }

        private Range() {
        }

        /* access modifiers changed from: private */
        public void clearMax() {
            this.max_ = 0.0d;
        }

        /* access modifiers changed from: private */
        public void clearMin() {
            this.min_ = 0.0d;
        }

        public static Range getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C32284a newBuilder() {
            return (C32284a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Range parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Range) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<Range> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setMax(double d) {
            this.max_ = d;
        }

        /* access modifiers changed from: private */
        public void setMin(double d) {
            this.min_ = d;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C32285a.f78644a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Range();
                case 2:
                    return new C32284a((C32285a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<Range> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (Range.class) {
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

        public double getMax() {
            return this.max_;
        }

        public double getMin() {
            return this.min_;
        }

        public static C32284a newBuilder(Range range) {
            return (C32284a) DEFAULT_INSTANCE.createBuilder(range);
        }

        public static Range parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Range) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Range parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static Range parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Range parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static Range parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Range parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static Range parseFrom(InputStream inputStream) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Range parseFrom(C34448s sVar) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Range parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (Range) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    /* renamed from: com.google.api.Distribution$a */
    public static /* synthetic */ class C32285a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78644a;

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
                f78644a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78644a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78644a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78644a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78644a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78644a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78644a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Distribution.C32285a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Distribution$b */
    public interface C32286b extends C34417m1 {
        BucketOptions.Explicit getExplicitBuckets();

        BucketOptions.Exponential getExponentialBuckets();

        BucketOptions.Linear getLinearBuckets();

        BucketOptions.OptionsCase getOptionsCase();

        boolean hasExplicitBuckets();

        boolean hasExponentialBuckets();

        boolean hasLinearBuckets();
    }

    /* renamed from: com.google.api.Distribution$c */
    public static final class C32287c extends GeneratedMessageLite.C34263b<Distribution, C32287c> implements C32445w {
        public /* synthetic */ C32287c(C32285a aVar) {
            this();
        }

        /* renamed from: P */
        public C32287c mo93437P(Iterable<? extends Long> iterable) {
            mo100457F();
            ((Distribution) this.f83053b).addAllBucketCounts(iterable);
            return this;
        }

        /* renamed from: R */
        public C32287c mo93438R(Iterable<? extends Exemplar> iterable) {
            mo100457F();
            ((Distribution) this.f83053b).addAllExemplars(iterable);
            return this;
        }

        /* renamed from: S */
        public C32287c mo93439S(long j) {
            mo100457F();
            ((Distribution) this.f83053b).addBucketCounts(j);
            return this;
        }

        /* renamed from: T */
        public C32287c mo93440T(int i, Exemplar.C32283a aVar) {
            mo100457F();
            ((Distribution) this.f83053b).addExemplars(i, (Exemplar) aVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32287c mo93441U(int i, Exemplar exemplar) {
            mo100457F();
            ((Distribution) this.f83053b).addExemplars(i, exemplar);
            return this;
        }

        /* renamed from: V */
        public C32287c mo93442V(Exemplar.C32283a aVar) {
            mo100457F();
            ((Distribution) this.f83053b).addExemplars((Exemplar) aVar.mo100473g());
            return this;
        }

        /* renamed from: Y */
        public C32287c mo93443Y(Exemplar exemplar) {
            mo100457F();
            ((Distribution) this.f83053b).addExemplars(exemplar);
            return this;
        }

        /* renamed from: Z */
        public C32287c mo93444Z() {
            mo100457F();
            ((Distribution) this.f83053b).clearBucketCounts();
            return this;
        }

        /* renamed from: a0 */
        public C32287c mo93445a0() {
            mo100457F();
            ((Distribution) this.f83053b).clearBucketOptions();
            return this;
        }

        /* renamed from: b0 */
        public C32287c mo93446b0() {
            mo100457F();
            ((Distribution) this.f83053b).clearCount();
            return this;
        }

        /* renamed from: c0 */
        public C32287c mo93447c0() {
            mo100457F();
            ((Distribution) this.f83053b).clearExemplars();
            return this;
        }

        /* renamed from: d0 */
        public C32287c mo93448d0() {
            mo100457F();
            ((Distribution) this.f83053b).clearMean();
            return this;
        }

        /* renamed from: g0 */
        public C32287c mo93449g0() {
            mo100457F();
            ((Distribution) this.f83053b).clearRange();
            return this;
        }

        public long getBucketCounts(int i) {
            return ((Distribution) this.f83053b).getBucketCounts(i);
        }

        public int getBucketCountsCount() {
            return ((Distribution) this.f83053b).getBucketCountsCount();
        }

        public List<Long> getBucketCountsList() {
            return Collections.unmodifiableList(((Distribution) this.f83053b).getBucketCountsList());
        }

        public BucketOptions getBucketOptions() {
            return ((Distribution) this.f83053b).getBucketOptions();
        }

        public long getCount() {
            return ((Distribution) this.f83053b).getCount();
        }

        public Exemplar getExemplars(int i) {
            return ((Distribution) this.f83053b).getExemplars(i);
        }

        public int getExemplarsCount() {
            return ((Distribution) this.f83053b).getExemplarsCount();
        }

        public List<Exemplar> getExemplarsList() {
            return Collections.unmodifiableList(((Distribution) this.f83053b).getExemplarsList());
        }

        public double getMean() {
            return ((Distribution) this.f83053b).getMean();
        }

        public Range getRange() {
            return ((Distribution) this.f83053b).getRange();
        }

        public double getSumOfSquaredDeviation() {
            return ((Distribution) this.f83053b).getSumOfSquaredDeviation();
        }

        /* renamed from: h0 */
        public C32287c mo93450h0() {
            mo100457F();
            ((Distribution) this.f83053b).clearSumOfSquaredDeviation();
            return this;
        }

        public boolean hasBucketOptions() {
            return ((Distribution) this.f83053b).hasBucketOptions();
        }

        public boolean hasRange() {
            return ((Distribution) this.f83053b).hasRange();
        }

        /* renamed from: i0 */
        public C32287c mo93451i0(BucketOptions bucketOptions) {
            mo100457F();
            ((Distribution) this.f83053b).mergeBucketOptions(bucketOptions);
            return this;
        }

        /* renamed from: j0 */
        public C32287c mo93452j0(Range range) {
            mo100457F();
            ((Distribution) this.f83053b).mergeRange(range);
            return this;
        }

        /* renamed from: k0 */
        public C32287c mo93453k0(int i) {
            mo100457F();
            ((Distribution) this.f83053b).removeExemplars(i);
            return this;
        }

        /* renamed from: l0 */
        public C32287c mo93454l0(int i, long j) {
            mo100457F();
            ((Distribution) this.f83053b).setBucketCounts(i, j);
            return this;
        }

        /* renamed from: m0 */
        public C32287c mo93455m0(BucketOptions.C32279a aVar) {
            mo100457F();
            ((Distribution) this.f83053b).setBucketOptions((BucketOptions) aVar.mo100473g());
            return this;
        }

        /* renamed from: o0 */
        public C32287c mo93456o0(BucketOptions bucketOptions) {
            mo100457F();
            ((Distribution) this.f83053b).setBucketOptions(bucketOptions);
            return this;
        }

        /* renamed from: q0 */
        public C32287c mo93457q0(long j) {
            mo100457F();
            ((Distribution) this.f83053b).setCount(j);
            return this;
        }

        /* renamed from: r0 */
        public C32287c mo93458r0(int i, Exemplar.C32283a aVar) {
            mo100457F();
            ((Distribution) this.f83053b).setExemplars(i, (Exemplar) aVar.mo100473g());
            return this;
        }

        /* renamed from: s0 */
        public C32287c mo93459s0(int i, Exemplar exemplar) {
            mo100457F();
            ((Distribution) this.f83053b).setExemplars(i, exemplar);
            return this;
        }

        /* renamed from: u0 */
        public C32287c mo93460u0(double d) {
            mo100457F();
            ((Distribution) this.f83053b).setMean(d);
            return this;
        }

        /* renamed from: v0 */
        public C32287c mo93461v0(Range.C32284a aVar) {
            mo100457F();
            ((Distribution) this.f83053b).setRange((Range) aVar.mo100473g());
            return this;
        }

        /* renamed from: w0 */
        public C32287c mo93462w0(Range range) {
            mo100457F();
            ((Distribution) this.f83053b).setRange(range);
            return this;
        }

        /* renamed from: x0 */
        public C32287c mo93463x0(double d) {
            mo100457F();
            ((Distribution) this.f83053b).setSumOfSquaredDeviation(d);
            return this;
        }

        public C32287c() {
            super(Distribution.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.Distribution$d */
    public interface C32288d extends C34417m1 {
        Any getAttachments(int i);

        int getAttachmentsCount();

        List<Any> getAttachmentsList();

        Timestamp getTimestamp();

        double getValue();

        boolean hasTimestamp();
    }

    /* renamed from: com.google.api.Distribution$e */
    public interface C32289e extends C34417m1 {
        double getMax();

        double getMin();
    }

    static {
        Distribution distribution = new Distribution();
        DEFAULT_INSTANCE = distribution;
        GeneratedMessageLite.registerDefaultInstance(Distribution.class, distribution);
    }

    private Distribution() {
    }

    /* access modifiers changed from: private */
    public void addAllBucketCounts(Iterable<? extends Long> iterable) {
        ensureBucketCountsIsMutable();
        C34319a.addAll(iterable, this.bucketCounts_);
    }

    /* access modifiers changed from: private */
    public void addAllExemplars(Iterable<? extends Exemplar> iterable) {
        ensureExemplarsIsMutable();
        C34319a.addAll(iterable, this.exemplars_);
    }

    /* access modifiers changed from: private */
    public void addBucketCounts(long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.mo101024Z(j);
    }

    /* access modifiers changed from: private */
    public void addExemplars(Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(exemplar);
    }

    /* access modifiers changed from: private */
    public void clearBucketCounts() {
        this.bucketCounts_ = GeneratedMessageLite.emptyLongList();
    }

    /* access modifiers changed from: private */
    public void clearBucketOptions() {
        this.bucketOptions_ = null;
    }

    /* access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearExemplars() {
        this.exemplars_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearMean() {
        this.mean_ = 0.0d;
    }

    /* access modifiers changed from: private */
    public void clearRange() {
        this.range_ = null;
    }

    /* access modifiers changed from: private */
    public void clearSumOfSquaredDeviation() {
        this.sumOfSquaredDeviation_ = 0.0d;
    }

    private void ensureBucketCountsIsMutable() {
        C34471v0.C34481i iVar = this.bucketCounts_;
        if (!iVar.mo100971T()) {
            this.bucketCounts_ = GeneratedMessageLite.mutableCopy(iVar);
        }
    }

    private void ensureExemplarsIsMutable() {
        C34471v0.C34488k<Exemplar> kVar = this.exemplars_;
        if (!kVar.mo100971T()) {
            this.exemplars_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Distribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeBucketOptions(BucketOptions bucketOptions) {
        bucketOptions.getClass();
        BucketOptions bucketOptions2 = this.bucketOptions_;
        if (bucketOptions2 == null || bucketOptions2 == BucketOptions.getDefaultInstance()) {
            this.bucketOptions_ = bucketOptions;
        } else {
            this.bucketOptions_ = (BucketOptions) ((BucketOptions.C32279a) BucketOptions.newBuilder(this.bucketOptions_).mo100463K(bucketOptions)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeRange(Range range) {
        range.getClass();
        Range range2 = this.range_;
        if (range2 == null || range2 == Range.getDefaultInstance()) {
            this.range_ = range;
        } else {
            this.range_ = (Range) ((Range.C32284a) Range.newBuilder(this.range_).mo100463K(range)).mo100467Q();
        }
    }

    public static C32287c newBuilder() {
        return (C32287c) DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Distribution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Distribution> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeExemplars(int i) {
        ensureExemplarsIsMutable();
        this.exemplars_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setBucketCounts(int i, long j) {
        ensureBucketCountsIsMutable();
        this.bucketCounts_.mo101022F(i, j);
    }

    /* access modifiers changed from: private */
    public void setBucketOptions(BucketOptions bucketOptions) {
        bucketOptions.getClass();
        this.bucketOptions_ = bucketOptions;
    }

    /* access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* access modifiers changed from: private */
    public void setExemplars(int i, Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.set(i, exemplar);
    }

    /* access modifiers changed from: private */
    public void setMean(double d) {
        this.mean_ = d;
    }

    /* access modifiers changed from: private */
    public void setRange(Range range) {
        range.getClass();
        this.range_ = range;
    }

    /* access modifiers changed from: private */
    public void setSumOfSquaredDeviation(double d) {
        this.sumOfSquaredDeviation_ = d;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32285a.f78644a[methodToInvoke.ordinal()]) {
            case 1:
                return new Distribution();
            case 2:
                return new C32287c((C32285a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004\t\u0006\t\u0007%\n\u001b", new Object[]{"count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", Exemplar.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Distribution> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Distribution.class) {
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

    public long getBucketCounts(int i) {
        return this.bucketCounts_.getLong(i);
    }

    public int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    public List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    public BucketOptions getBucketOptions() {
        BucketOptions bucketOptions = this.bucketOptions_;
        return bucketOptions == null ? BucketOptions.getDefaultInstance() : bucketOptions;
    }

    public long getCount() {
        return this.count_;
    }

    public Exemplar getExemplars(int i) {
        return this.exemplars_.get(i);
    }

    public int getExemplarsCount() {
        return this.exemplars_.size();
    }

    public List<Exemplar> getExemplarsList() {
        return this.exemplars_;
    }

    public C32288d getExemplarsOrBuilder(int i) {
        return this.exemplars_.get(i);
    }

    public List<? extends C32288d> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    public double getMean() {
        return this.mean_;
    }

    public Range getRange() {
        Range range = this.range_;
        return range == null ? Range.getDefaultInstance() : range;
    }

    public double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    public boolean hasBucketOptions() {
        return this.bucketOptions_ != null;
    }

    public boolean hasRange() {
        return this.range_ != null;
    }

    public static C32287c newBuilder(Distribution distribution) {
        return (C32287c) DEFAULT_INSTANCE.createBuilder(distribution);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Distribution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Distribution parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addExemplars(int i, Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(i, exemplar);
    }

    public static Distribution parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Distribution parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Distribution parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Distribution parseFrom(InputStream inputStream) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Distribution parseFrom(C34448s sVar) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Distribution parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Distribution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
