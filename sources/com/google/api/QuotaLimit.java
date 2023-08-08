package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34363f1;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class QuotaLimit extends GeneratedMessageLite<QuotaLimit, C32357b> implements C32396f1 {
    /* access modifiers changed from: private */
    public static final QuotaLimit DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile C34504y1<QuotaLimit> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private String description_ = "";
    private String displayName_ = "";
    private String duration_ = "";
    private long freeTier_;
    private long maxLimit_;
    private String metric_ = "";
    private String name_ = "";
    private String unit_ = "";
    private MapFieldLite<String, Long> values_ = MapFieldLite.m138446i();

    /* renamed from: com.google.api.QuotaLimit$a */
    public static /* synthetic */ class C32356a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78769a;

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
                f78769a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78769a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78769a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78769a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78769a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78769a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78769a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.QuotaLimit.C32356a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.QuotaLimit$b */
    public static final class C32357b extends GeneratedMessageLite.C34263b<QuotaLimit, C32357b> implements C32396f1 {
        public /* synthetic */ C32357b(C32356a aVar) {
            this();
        }

        /* renamed from: P */
        public C32357b mo94091P() {
            mo100457F();
            ((QuotaLimit) this.f83053b).clearDefaultLimit();
            return this;
        }

        /* renamed from: R */
        public C32357b mo94092R() {
            mo100457F();
            ((QuotaLimit) this.f83053b).clearDescription();
            return this;
        }

        /* renamed from: S */
        public C32357b mo94093S() {
            mo100457F();
            ((QuotaLimit) this.f83053b).clearDisplayName();
            return this;
        }

        /* renamed from: T */
        public C32357b mo94094T() {
            mo100457F();
            ((QuotaLimit) this.f83053b).clearDuration();
            return this;
        }

        /* renamed from: U */
        public C32357b mo94095U() {
            mo100457F();
            ((QuotaLimit) this.f83053b).clearFreeTier();
            return this;
        }

        /* renamed from: V */
        public C32357b mo94096V() {
            mo100457F();
            ((QuotaLimit) this.f83053b).clearMaxLimit();
            return this;
        }

        /* renamed from: Y */
        public C32357b mo94097Y() {
            mo100457F();
            ((QuotaLimit) this.f83053b).clearMetric();
            return this;
        }

        /* renamed from: Z */
        public C32357b mo94098Z() {
            mo100457F();
            ((QuotaLimit) this.f83053b).clearName();
            return this;
        }

        /* renamed from: a0 */
        public C32357b mo94099a0() {
            mo100457F();
            ((QuotaLimit) this.f83053b).clearUnit();
            return this;
        }

        /* renamed from: b0 */
        public C32357b mo94100b0() {
            mo100457F();
            ((QuotaLimit) this.f83053b).getMutableValuesMap().clear();
            return this;
        }

        /* renamed from: c0 */
        public C32357b mo94101c0(Map<String, Long> map) {
            mo100457F();
            ((QuotaLimit) this.f83053b).getMutableValuesMap().putAll(map);
            return this;
        }

        public boolean containsValues(String str) {
            str.getClass();
            return ((QuotaLimit) this.f83053b).getValuesMap().containsKey(str);
        }

        /* renamed from: d0 */
        public C32357b mo94102d0(String str, long j) {
            str.getClass();
            mo100457F();
            ((QuotaLimit) this.f83053b).getMutableValuesMap().put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: g0 */
        public C32357b mo94103g0(String str) {
            str.getClass();
            mo100457F();
            ((QuotaLimit) this.f83053b).getMutableValuesMap().remove(str);
            return this;
        }

        public long getDefaultLimit() {
            return ((QuotaLimit) this.f83053b).getDefaultLimit();
        }

        public String getDescription() {
            return ((QuotaLimit) this.f83053b).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((QuotaLimit) this.f83053b).getDescriptionBytes();
        }

        public String getDisplayName() {
            return ((QuotaLimit) this.f83053b).getDisplayName();
        }

        public ByteString getDisplayNameBytes() {
            return ((QuotaLimit) this.f83053b).getDisplayNameBytes();
        }

        public String getDuration() {
            return ((QuotaLimit) this.f83053b).getDuration();
        }

        public ByteString getDurationBytes() {
            return ((QuotaLimit) this.f83053b).getDurationBytes();
        }

        public long getFreeTier() {
            return ((QuotaLimit) this.f83053b).getFreeTier();
        }

        public long getMaxLimit() {
            return ((QuotaLimit) this.f83053b).getMaxLimit();
        }

        public String getMetric() {
            return ((QuotaLimit) this.f83053b).getMetric();
        }

        public ByteString getMetricBytes() {
            return ((QuotaLimit) this.f83053b).getMetricBytes();
        }

        public String getName() {
            return ((QuotaLimit) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((QuotaLimit) this.f83053b).getNameBytes();
        }

        public String getUnit() {
            return ((QuotaLimit) this.f83053b).getUnit();
        }

        public ByteString getUnitBytes() {
            return ((QuotaLimit) this.f83053b).getUnitBytes();
        }

        @Deprecated
        public Map<String, Long> getValues() {
            return getValuesMap();
        }

        public int getValuesCount() {
            return ((QuotaLimit) this.f83053b).getValuesMap().size();
        }

        public Map<String, Long> getValuesMap() {
            return Collections.unmodifiableMap(((QuotaLimit) this.f83053b).getValuesMap());
        }

        public long getValuesOrDefault(String str, long j) {
            str.getClass();
            Map<String, Long> valuesMap = ((QuotaLimit) this.f83053b).getValuesMap();
            if (valuesMap.containsKey(str)) {
                return valuesMap.get(str).longValue();
            }
            return j;
        }

        public long getValuesOrThrow(String str) {
            str.getClass();
            Map<String, Long> valuesMap = ((QuotaLimit) this.f83053b).getValuesMap();
            if (valuesMap.containsKey(str)) {
                return valuesMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: h0 */
        public C32357b mo94104h0(long j) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setDefaultLimit(j);
            return this;
        }

        /* renamed from: i0 */
        public C32357b mo94105i0(String str) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setDescription(str);
            return this;
        }

        /* renamed from: j0 */
        public C32357b mo94106j0(ByteString byteString) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setDescriptionBytes(byteString);
            return this;
        }

        /* renamed from: k0 */
        public C32357b mo94107k0(String str) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setDisplayName(str);
            return this;
        }

        /* renamed from: l0 */
        public C32357b mo94108l0(ByteString byteString) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setDisplayNameBytes(byteString);
            return this;
        }

        /* renamed from: m0 */
        public C32357b mo94109m0(String str) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setDuration(str);
            return this;
        }

        /* renamed from: o0 */
        public C32357b mo94110o0(ByteString byteString) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setDurationBytes(byteString);
            return this;
        }

        /* renamed from: q0 */
        public C32357b mo94111q0(long j) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setFreeTier(j);
            return this;
        }

        /* renamed from: r0 */
        public C32357b mo94112r0(long j) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setMaxLimit(j);
            return this;
        }

        /* renamed from: s0 */
        public C32357b mo94113s0(String str) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setMetric(str);
            return this;
        }

        /* renamed from: u0 */
        public C32357b mo94114u0(ByteString byteString) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setMetricBytes(byteString);
            return this;
        }

        /* renamed from: v0 */
        public C32357b mo94115v0(String str) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: w0 */
        public C32357b mo94116w0(ByteString byteString) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: x0 */
        public C32357b mo94117x0(String str) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setUnit(str);
            return this;
        }

        /* renamed from: y0 */
        public C32357b mo94118y0(ByteString byteString) {
            mo100457F();
            ((QuotaLimit) this.f83053b).setUnitBytes(byteString);
            return this;
        }

        public C32357b() {
            super(QuotaLimit.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.api.QuotaLimit$c */
    public static final class C32358c {

        /* renamed from: a */
        public static final C34363f1<String, Long> f78770a = C34363f1.m139185f(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    static {
        QuotaLimit quotaLimit = new QuotaLimit();
        DEFAULT_INSTANCE = quotaLimit;
        GeneratedMessageLite.registerDefaultInstance(QuotaLimit.class, quotaLimit);
    }

    private QuotaLimit() {
    }

    /* access modifiers changed from: private */
    public void clearDefaultLimit() {
        this.defaultLimit_ = 0;
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
    public void clearDuration() {
        this.duration_ = getDefaultInstance().getDuration();
    }

    /* access modifiers changed from: private */
    public void clearFreeTier() {
        this.freeTier_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearMaxLimit() {
        this.maxLimit_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearMetric() {
        this.metric_ = getDefaultInstance().getMetric();
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    public static QuotaLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, Long> getMutableValuesMap() {
        return internalGetMutableValues();
    }

    private MapFieldLite<String, Long> internalGetMutableValues() {
        if (!this.values_.mo100543n()) {
            this.values_ = this.values_.mo100549t();
        }
        return this.values_;
    }

    private MapFieldLite<String, Long> internalGetValues() {
        return this.values_;
    }

    public static C32357b newBuilder() {
        return (C32357b) DEFAULT_INSTANCE.createBuilder();
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<QuotaLimit> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setDefaultLimit(long j) {
        this.defaultLimit_ = j;
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
    public void setDuration(String str) {
        str.getClass();
        this.duration_ = str;
    }

    /* access modifiers changed from: private */
    public void setDurationBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.duration_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setFreeTier(long j) {
        this.freeTier_ = j;
    }

    /* access modifiers changed from: private */
    public void setMaxLimit(long j) {
        this.maxLimit_ = j;
    }

    /* access modifiers changed from: private */
    public void setMetric(String str) {
        str.getClass();
        this.metric_ = str;
    }

    /* access modifiers changed from: private */
    public void setMetricBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.metric_ = byteString.mo99228S0();
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
    public void setUnit(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* access modifiers changed from: private */
    public void setUnitBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.unit_ = byteString.mo99228S0();
    }

    public boolean containsValues(String str) {
        str.getClass();
        return internalGetValues().containsKey(str);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32356a.f78769a[methodToInvoke.ordinal()]) {
            case 1:
                return new QuotaLimit();
            case 2:
                return new C32357b((C32356a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\tȈ\n2\fȈ", new Object[]{"description_", "defaultLimit_", "maxLimit_", "duration_", "name_", "freeTier_", "metric_", "unit_", "values_", C32358c.f78770a, "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<QuotaLimit> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (QuotaLimit.class) {
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

    public long getDefaultLimit() {
        return this.defaultLimit_;
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

    public String getDuration() {
        return this.duration_;
    }

    public ByteString getDurationBytes() {
        return ByteString.m137260e0(this.duration_);
    }

    public long getFreeTier() {
        return this.freeTier_;
    }

    public long getMaxLimit() {
        return this.maxLimit_;
    }

    public String getMetric() {
        return this.metric_;
    }

    public ByteString getMetricBytes() {
        return ByteString.m137260e0(this.metric_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public String getUnit() {
        return this.unit_;
    }

    public ByteString getUnitBytes() {
        return ByteString.m137260e0(this.unit_);
    }

    @Deprecated
    public Map<String, Long> getValues() {
        return getValuesMap();
    }

    public int getValuesCount() {
        return internalGetValues().size();
    }

    public Map<String, Long> getValuesMap() {
        return Collections.unmodifiableMap(internalGetValues());
    }

    public long getValuesOrDefault(String str, long j) {
        str.getClass();
        MapFieldLite<String, Long> internalGetValues = internalGetValues();
        if (internalGetValues.containsKey(str)) {
            return internalGetValues.get(str).longValue();
        }
        return j;
    }

    public long getValuesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Long> internalGetValues = internalGetValues();
        if (internalGetValues.containsKey(str)) {
            return internalGetValues.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    public static C32357b newBuilder(QuotaLimit quotaLimit) {
        return (C32357b) DEFAULT_INSTANCE.createBuilder(quotaLimit);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static QuotaLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static QuotaLimit parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static QuotaLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QuotaLimit parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static QuotaLimit parseFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static QuotaLimit parseFrom(C34448s sVar) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static QuotaLimit parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (QuotaLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
