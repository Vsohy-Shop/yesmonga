package com.google.firebase.perf.p049v1;

import com.google.firebase.perf.p049v1.PerfSession;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34363f1;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.perf.v1.TraceMetric */
public final class TraceMetric extends GeneratedMessageLite<TraceMetric, C33480b> implements C33498l {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C34504y1<TraceMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.m138446i();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.m138446i();
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private C34471v0.C34488k<PerfSession> perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<TraceMetric> subtraces_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$a */
    public static /* synthetic */ class C33479a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81491a;

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
                f81491a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81491a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81491a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81491a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81491a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81491a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81491a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p049v1.TraceMetric.C33479a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$b */
    public static final class C33480b extends GeneratedMessageLite.C34263b<TraceMetric, C33480b> implements C33498l {
        public /* synthetic */ C33480b(C33479a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C33480b mo97215B0(String str) {
            mo100457F();
            ((TraceMetric) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: D0 */
        public C33480b mo97216D0(ByteString byteString) {
            mo100457F();
            ((TraceMetric) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: E0 */
        public C33480b mo97217E0(int i, PerfSession.C33476c cVar) {
            mo100457F();
            ((TraceMetric) this.f83053b).setPerfSessions(i, (PerfSession) cVar.mo100473g());
            return this;
        }

        /* renamed from: F0 */
        public C33480b mo97218F0(int i, PerfSession perfSession) {
            mo100457F();
            ((TraceMetric) this.f83053b).setPerfSessions(i, perfSession);
            return this;
        }

        /* renamed from: G0 */
        public C33480b mo97219G0(int i, C33480b bVar) {
            mo100457F();
            ((TraceMetric) this.f83053b).setSubtraces(i, (TraceMetric) bVar.mo100473g());
            return this;
        }

        /* renamed from: H0 */
        public C33480b mo97220H0(int i, TraceMetric traceMetric) {
            mo100457F();
            ((TraceMetric) this.f83053b).setSubtraces(i, traceMetric);
            return this;
        }

        /* renamed from: P */
        public C33480b mo97221P(Iterable<? extends PerfSession> iterable) {
            mo100457F();
            ((TraceMetric) this.f83053b).addAllPerfSessions(iterable);
            return this;
        }

        /* renamed from: R */
        public C33480b mo97222R(Iterable<? extends TraceMetric> iterable) {
            mo100457F();
            ((TraceMetric) this.f83053b).addAllSubtraces(iterable);
            return this;
        }

        /* renamed from: S */
        public C33480b mo97223S(int i, PerfSession.C33476c cVar) {
            mo100457F();
            ((TraceMetric) this.f83053b).addPerfSessions(i, (PerfSession) cVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C33480b mo97224T(int i, PerfSession perfSession) {
            mo100457F();
            ((TraceMetric) this.f83053b).addPerfSessions(i, perfSession);
            return this;
        }

        /* renamed from: U */
        public C33480b mo97225U(PerfSession.C33476c cVar) {
            mo100457F();
            ((TraceMetric) this.f83053b).addPerfSessions((PerfSession) cVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C33480b mo97226V(PerfSession perfSession) {
            mo100457F();
            ((TraceMetric) this.f83053b).addPerfSessions(perfSession);
            return this;
        }

        /* renamed from: Y */
        public C33480b mo97227Y(int i, C33480b bVar) {
            mo100457F();
            ((TraceMetric) this.f83053b).addSubtraces(i, (TraceMetric) bVar.mo100473g());
            return this;
        }

        /* renamed from: Z */
        public C33480b mo97228Z(int i, TraceMetric traceMetric) {
            mo100457F();
            ((TraceMetric) this.f83053b).addSubtraces(i, traceMetric);
            return this;
        }

        /* renamed from: a0 */
        public C33480b mo97229a0(C33480b bVar) {
            mo100457F();
            ((TraceMetric) this.f83053b).addSubtraces((TraceMetric) bVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C33480b mo97230b0(TraceMetric traceMetric) {
            mo100457F();
            ((TraceMetric) this.f83053b).addSubtraces(traceMetric);
            return this;
        }

        /* renamed from: c0 */
        public C33480b mo97231c0() {
            mo100457F();
            ((TraceMetric) this.f83053b).clearClientStartTimeUs();
            return this;
        }

        public boolean containsCounters(String str) {
            str.getClass();
            return ((TraceMetric) this.f83053b).getCountersMap().containsKey(str);
        }

        public boolean containsCustomAttributes(String str) {
            str.getClass();
            return ((TraceMetric) this.f83053b).getCustomAttributesMap().containsKey(str);
        }

        /* renamed from: d0 */
        public C33480b mo97232d0() {
            mo100457F();
            ((TraceMetric) this.f83053b).getMutableCountersMap().clear();
            return this;
        }

        /* renamed from: g0 */
        public C33480b mo97233g0() {
            mo100457F();
            ((TraceMetric) this.f83053b).getMutableCustomAttributesMap().clear();
            return this;
        }

        public long getClientStartTimeUs() {
            return ((TraceMetric) this.f83053b).getClientStartTimeUs();
        }

        @Deprecated
        public Map<String, Long> getCounters() {
            return getCountersMap();
        }

        public int getCountersCount() {
            return ((TraceMetric) this.f83053b).getCountersMap().size();
        }

        public Map<String, Long> getCountersMap() {
            return Collections.unmodifiableMap(((TraceMetric) this.f83053b).getCountersMap());
        }

        public long getCountersOrDefault(String str, long j) {
            str.getClass();
            Map<String, Long> countersMap = ((TraceMetric) this.f83053b).getCountersMap();
            if (countersMap.containsKey(str)) {
                return countersMap.get(str).longValue();
            }
            return j;
        }

        public long getCountersOrThrow(String str) {
            str.getClass();
            Map<String, Long> countersMap = ((TraceMetric) this.f83053b).getCountersMap();
            if (countersMap.containsKey(str)) {
                return countersMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, String> getCustomAttributes() {
            return getCustomAttributesMap();
        }

        public int getCustomAttributesCount() {
            return ((TraceMetric) this.f83053b).getCustomAttributesMap().size();
        }

        public Map<String, String> getCustomAttributesMap() {
            return Collections.unmodifiableMap(((TraceMetric) this.f83053b).getCustomAttributesMap());
        }

        public String getCustomAttributesOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> customAttributesMap = ((TraceMetric) this.f83053b).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            return str2;
        }

        public String getCustomAttributesOrThrow(String str) {
            str.getClass();
            Map<String, String> customAttributesMap = ((TraceMetric) this.f83053b).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public long getDurationUs() {
            return ((TraceMetric) this.f83053b).getDurationUs();
        }

        public boolean getIsAuto() {
            return ((TraceMetric) this.f83053b).getIsAuto();
        }

        public String getName() {
            return ((TraceMetric) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((TraceMetric) this.f83053b).getNameBytes();
        }

        public PerfSession getPerfSessions(int i) {
            return ((TraceMetric) this.f83053b).getPerfSessions(i);
        }

        public int getPerfSessionsCount() {
            return ((TraceMetric) this.f83053b).getPerfSessionsCount();
        }

        public List<PerfSession> getPerfSessionsList() {
            return Collections.unmodifiableList(((TraceMetric) this.f83053b).getPerfSessionsList());
        }

        public TraceMetric getSubtraces(int i) {
            return ((TraceMetric) this.f83053b).getSubtraces(i);
        }

        public int getSubtracesCount() {
            return ((TraceMetric) this.f83053b).getSubtracesCount();
        }

        public List<TraceMetric> getSubtracesList() {
            return Collections.unmodifiableList(((TraceMetric) this.f83053b).getSubtracesList());
        }

        /* renamed from: h0 */
        public C33480b mo97234h0() {
            mo100457F();
            ((TraceMetric) this.f83053b).clearDurationUs();
            return this;
        }

        public boolean hasClientStartTimeUs() {
            return ((TraceMetric) this.f83053b).hasClientStartTimeUs();
        }

        public boolean hasDurationUs() {
            return ((TraceMetric) this.f83053b).hasDurationUs();
        }

        public boolean hasIsAuto() {
            return ((TraceMetric) this.f83053b).hasIsAuto();
        }

        public boolean hasName() {
            return ((TraceMetric) this.f83053b).hasName();
        }

        /* renamed from: i0 */
        public C33480b mo97235i0() {
            mo100457F();
            ((TraceMetric) this.f83053b).clearIsAuto();
            return this;
        }

        /* renamed from: j0 */
        public C33480b mo97236j0() {
            mo100457F();
            ((TraceMetric) this.f83053b).clearName();
            return this;
        }

        /* renamed from: k0 */
        public C33480b mo97237k0() {
            mo100457F();
            ((TraceMetric) this.f83053b).clearPerfSessions();
            return this;
        }

        /* renamed from: l0 */
        public C33480b mo97238l0() {
            mo100457F();
            ((TraceMetric) this.f83053b).clearSubtraces();
            return this;
        }

        /* renamed from: m0 */
        public C33480b mo97239m0(Map<String, Long> map) {
            mo100457F();
            ((TraceMetric) this.f83053b).getMutableCountersMap().putAll(map);
            return this;
        }

        /* renamed from: o0 */
        public C33480b mo97240o0(Map<String, String> map) {
            mo100457F();
            ((TraceMetric) this.f83053b).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        /* renamed from: q0 */
        public C33480b mo97241q0(String str, long j) {
            str.getClass();
            mo100457F();
            ((TraceMetric) this.f83053b).getMutableCountersMap().put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: r0 */
        public C33480b mo97242r0(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo100457F();
            ((TraceMetric) this.f83053b).getMutableCustomAttributesMap().put(str, str2);
            return this;
        }

        /* renamed from: s0 */
        public C33480b mo97243s0(String str) {
            str.getClass();
            mo100457F();
            ((TraceMetric) this.f83053b).getMutableCountersMap().remove(str);
            return this;
        }

        /* renamed from: u0 */
        public C33480b mo97244u0(String str) {
            str.getClass();
            mo100457F();
            ((TraceMetric) this.f83053b).getMutableCustomAttributesMap().remove(str);
            return this;
        }

        /* renamed from: v0 */
        public C33480b mo97245v0(int i) {
            mo100457F();
            ((TraceMetric) this.f83053b).removePerfSessions(i);
            return this;
        }

        /* renamed from: w0 */
        public C33480b mo97246w0(int i) {
            mo100457F();
            ((TraceMetric) this.f83053b).removeSubtraces(i);
            return this;
        }

        /* renamed from: x0 */
        public C33480b mo97247x0(long j) {
            mo100457F();
            ((TraceMetric) this.f83053b).setClientStartTimeUs(j);
            return this;
        }

        /* renamed from: y0 */
        public C33480b mo97248y0(long j) {
            mo100457F();
            ((TraceMetric) this.f83053b).setDurationUs(j);
            return this;
        }

        /* renamed from: z0 */
        public C33480b mo97249z0(boolean z) {
            mo100457F();
            ((TraceMetric) this.f83053b).setIsAuto(z);
            return this;
        }

        public C33480b() {
            super(TraceMetric.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$c */
    public static final class C33481c {

        /* renamed from: a */
        public static final C34363f1<String, Long> f81492a = C34363f1.m139185f(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);
    }

    /* renamed from: com.google.firebase.perf.v1.TraceMetric$d */
    public static final class C33482d {

        /* renamed from: a */
        public static final C34363f1<String, String> f81493a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f81493a = C34363f1.m139185f(fieldType, "", fieldType, "");
        }
    }

    static {
        TraceMetric traceMetric = new TraceMetric();
        DEFAULT_INSTANCE = traceMetric;
        GeneratedMessageLite.registerDefaultInstance(TraceMetric.class, traceMetric);
    }

    private TraceMetric() {
    }

    /* access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        C34319a.addAll(iterable, this.perfSessions_);
    }

    /* access modifiers changed from: private */
    public void addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
        ensureSubtracesIsMutable();
        C34319a.addAll(iterable, this.subtraces_);
    }

    /* access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* access modifiers changed from: private */
    public void addSubtraces(TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(traceMetric);
    }

    /* access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearDurationUs() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearIsAuto() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearSubtraces() {
        this.subtraces_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePerfSessionsIsMutable() {
        C34471v0.C34488k<PerfSession> kVar = this.perfSessions_;
        if (!kVar.mo100971T()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureSubtracesIsMutable() {
        C34471v0.C34488k<TraceMetric> kVar = this.subtraces_;
        if (!kVar.mo100971T()) {
            this.subtraces_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static TraceMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, Long> getMutableCountersMap() {
        return internalGetMutableCounters();
    }

    /* access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private MapFieldLite<String, Long> internalGetCounters() {
        return this.counters_;
    }

    private MapFieldLite<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private MapFieldLite<String, Long> internalGetMutableCounters() {
        if (!this.counters_.mo100543n()) {
            this.counters_ = this.counters_.mo100549t();
        }
        return this.counters_;
    }

    private MapFieldLite<String, String> internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.mo100543n()) {
            this.customAttributes_ = this.customAttributes_.mo100549t();
        }
        return this.customAttributes_;
    }

    public static C33480b newBuilder() {
        return (C33480b) DEFAULT_INSTANCE.createBuilder();
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<TraceMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removePerfSessions(int i) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeSubtraces(int i) {
        ensureSubtracesIsMutable();
        this.subtraces_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setClientStartTimeUs(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* access modifiers changed from: private */
    public void setDurationUs(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    /* access modifiers changed from: private */
    public void setIsAuto(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    /* access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        this.name_ = byteString.mo99228S0();
        this.bitField0_ |= 1;
    }

    /* access modifiers changed from: private */
    public void setPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i, perfSession);
    }

    /* access modifiers changed from: private */
    public void setSubtraces(int i, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.set(i, traceMetric);
    }

    public boolean containsCounters(String str) {
        str.getClass();
        return internalGetCounters().containsKey(str);
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33479a.f81491a[methodToInvoke.ordinal()]) {
            case 1:
                return new TraceMetric();
            case 2:
                return new C33480b((C33479a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", C33481c.f81492a, "subtraces_", TraceMetric.class, "customAttributes_", C33482d.f81493a, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<TraceMetric> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (TraceMetric.class) {
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

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    @Deprecated
    public Map<String, Long> getCounters() {
        return getCountersMap();
    }

    public int getCountersCount() {
        return internalGetCounters().size();
    }

    public Map<String, Long> getCountersMap() {
        return Collections.unmodifiableMap(internalGetCounters());
    }

    public long getCountersOrDefault(String str, long j) {
        str.getClass();
        MapFieldLite<String, Long> internalGetCounters = internalGetCounters();
        if (internalGetCounters.containsKey(str)) {
            return internalGetCounters.get(str).longValue();
        }
        return j;
    }

    public long getCountersOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Long> internalGetCounters = internalGetCounters();
        if (internalGetCounters.containsKey(str)) {
            return internalGetCounters.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return internalGetCustomAttributes.get(str);
        }
        return str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return internalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getDurationUs() {
        return this.durationUs_;
    }

    public boolean getIsAuto() {
        return this.isAuto_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public PerfSession getPerfSessions(int i) {
        return this.perfSessions_.get(i);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List<PerfSession> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public C33497k getPerfSessionsOrBuilder(int i) {
        return this.perfSessions_.get(i);
    }

    public List<? extends C33497k> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public TraceMetric getSubtraces(int i) {
        return this.subtraces_.get(i);
    }

    public int getSubtracesCount() {
        return this.subtraces_.size();
    }

    public List<TraceMetric> getSubtracesList() {
        return this.subtraces_;
    }

    public C33498l getSubtracesOrBuilder(int i) {
        return this.subtraces_.get(i);
    }

    public List<? extends C33498l> getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDurationUs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsAuto() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C33480b newBuilder(TraceMetric traceMetric) {
        return (C33480b) DEFAULT_INSTANCE.createBuilder(traceMetric);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static TraceMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i, perfSession);
    }

    /* access modifiers changed from: private */
    public void addSubtraces(int i, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(i, traceMetric);
    }

    public static TraceMetric parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static TraceMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TraceMetric parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static TraceMetric parseFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static TraceMetric parseFrom(C34448s sVar) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static TraceMetric parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
