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

/* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric */
public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, C33470b> implements C33495i {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile C34504y1<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.m138446i();
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private C34471v0.C34488k<PerfSession> perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod */
    public enum HttpMethod implements C34471v0.C34474c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        

        /* renamed from: E0 */
        public static final int f81450E0 = 5;

        /* renamed from: F0 */
        public static final int f81451F0 = 6;

        /* renamed from: G0 */
        public static final int f81452G0 = 7;

        /* renamed from: H0 */
        public static final int f81453H0 = 8;

        /* renamed from: I0 */
        public static final int f81454I0 = 9;

        /* renamed from: J0 */
        public static final C34471v0.C34475d<HttpMethod> f81455J0 = null;

        /* renamed from: X */
        public static final int f81457X = 2;

        /* renamed from: Y */
        public static final int f81458Y = 3;

        /* renamed from: Z */
        public static final int f81459Z = 4;

        /* renamed from: y */
        public static final int f81470y = 0;

        /* renamed from: z */
        public static final int f81471z = 1;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$a */
        public class C33465a implements C34471v0.C34475d<HttpMethod> {
            /* renamed from: b */
            public HttpMethod mo93187a(int i) {
                return HttpMethod.m134939b(i);
            }
        }

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$b */
        public static final class C33466b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f81472a = null;

            static {
                f81472a = new C33466b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return HttpMethod.m134939b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f81455J0 = new C33465a();
        }

        /* access modifiers changed from: public */
        HttpMethod(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static HttpMethod m134939b(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        /* renamed from: g */
        public static C34471v0.C34475d<HttpMethod> m134940g() {
            return f81455J0;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m134941q() {
            return C33466b.f81472a;
        }

        @Deprecated
        /* renamed from: r */
        public static HttpMethod m134942r(int i) {
            return m134939b(i);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason */
    public enum NetworkClientErrorReason implements C34471v0.C34474c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        

        /* renamed from: c */
        public static final int f81475c = 0;

        /* renamed from: d */
        public static final int f81476d = 1;

        /* renamed from: e */
        public static final C34471v0.C34475d<NetworkClientErrorReason> f81477e = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason$a */
        public class C33467a implements C34471v0.C34475d<NetworkClientErrorReason> {
            /* renamed from: b */
            public NetworkClientErrorReason mo93187a(int i) {
                return NetworkClientErrorReason.m134946b(i);
            }
        }

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason$b */
        public static final class C33468b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f81479a = null;

            static {
                f81479a = new C33468b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return NetworkClientErrorReason.m134946b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f81477e = new C33467a();
        }

        /* access modifiers changed from: public */
        NetworkClientErrorReason(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static NetworkClientErrorReason m134946b(int i) {
            if (i == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        /* renamed from: g */
        public static C34471v0.C34475d<NetworkClientErrorReason> m134947g() {
            return f81477e;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m134948q() {
            return C33468b.f81479a;
        }

        @Deprecated
        /* renamed from: r */
        public static NetworkClientErrorReason m134949r(int i) {
            return m134946b(i);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$a */
    public static /* synthetic */ class C33469a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81480a;

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
                f81480a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81480a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81480a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81480a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81480a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81480a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81480a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p049v1.NetworkRequestMetric.C33469a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$b */
    public static final class C33470b extends GeneratedMessageLite.C34263b<NetworkRequestMetric, C33470b> implements C33495i {
        public /* synthetic */ C33470b(C33469a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C33470b mo97101B0(String str) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setResponseContentType(str);
            return this;
        }

        /* renamed from: D0 */
        public C33470b mo97102D0(ByteString byteString) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setResponseContentTypeBytes(byteString);
            return this;
        }

        /* renamed from: E0 */
        public C33470b mo97103E0(long j) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setResponsePayloadBytes(j);
            return this;
        }

        /* renamed from: F0 */
        public C33470b mo97104F0(long j) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setTimeToRequestCompletedUs(j);
            return this;
        }

        /* renamed from: G0 */
        public C33470b mo97105G0(long j) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setTimeToResponseCompletedUs(j);
            return this;
        }

        /* renamed from: H0 */
        public C33470b mo97106H0(long j) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setTimeToResponseInitiatedUs(j);
            return this;
        }

        /* renamed from: I0 */
        public C33470b mo97107I0(String str) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setUrl(str);
            return this;
        }

        /* renamed from: J0 */
        public C33470b mo97108J0(ByteString byteString) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setUrlBytes(byteString);
            return this;
        }

        /* renamed from: P */
        public C33470b mo97109P(Iterable<? extends PerfSession> iterable) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).addAllPerfSessions(iterable);
            return this;
        }

        /* renamed from: R */
        public C33470b mo97110R(int i, PerfSession.C33476c cVar) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).addPerfSessions(i, (PerfSession) cVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C33470b mo97111S(int i, PerfSession perfSession) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).addPerfSessions(i, perfSession);
            return this;
        }

        /* renamed from: T */
        public C33470b mo97112T(PerfSession.C33476c cVar) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).addPerfSessions((PerfSession) cVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C33470b mo97113U(PerfSession perfSession) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).addPerfSessions(perfSession);
            return this;
        }

        /* renamed from: V */
        public C33470b mo97114V() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearClientStartTimeUs();
            return this;
        }

        /* renamed from: Y */
        public C33470b mo97115Y() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).getMutableCustomAttributesMap().clear();
            return this;
        }

        /* renamed from: Z */
        public C33470b mo97116Z() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearHttpMethod();
            return this;
        }

        /* renamed from: a0 */
        public C33470b mo97117a0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearHttpResponseCode();
            return this;
        }

        /* renamed from: b0 */
        public C33470b mo97118b0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearNetworkClientErrorReason();
            return this;
        }

        /* renamed from: c0 */
        public C33470b mo97119c0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearPerfSessions();
            return this;
        }

        public boolean containsCustomAttributes(String str) {
            str.getClass();
            return ((NetworkRequestMetric) this.f83053b).getCustomAttributesMap().containsKey(str);
        }

        /* renamed from: d0 */
        public C33470b mo97120d0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearRequestPayloadBytes();
            return this;
        }

        /* renamed from: g0 */
        public C33470b mo97121g0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearResponseContentType();
            return this;
        }

        public long getClientStartTimeUs() {
            return ((NetworkRequestMetric) this.f83053b).getClientStartTimeUs();
        }

        @Deprecated
        public Map<String, String> getCustomAttributes() {
            return getCustomAttributesMap();
        }

        public int getCustomAttributesCount() {
            return ((NetworkRequestMetric) this.f83053b).getCustomAttributesMap().size();
        }

        public Map<String, String> getCustomAttributesMap() {
            return Collections.unmodifiableMap(((NetworkRequestMetric) this.f83053b).getCustomAttributesMap());
        }

        public String getCustomAttributesOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> customAttributesMap = ((NetworkRequestMetric) this.f83053b).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            return str2;
        }

        public String getCustomAttributesOrThrow(String str) {
            str.getClass();
            Map<String, String> customAttributesMap = ((NetworkRequestMetric) this.f83053b).getCustomAttributesMap();
            if (customAttributesMap.containsKey(str)) {
                return customAttributesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public HttpMethod getHttpMethod() {
            return ((NetworkRequestMetric) this.f83053b).getHttpMethod();
        }

        public int getHttpResponseCode() {
            return ((NetworkRequestMetric) this.f83053b).getHttpResponseCode();
        }

        public NetworkClientErrorReason getNetworkClientErrorReason() {
            return ((NetworkRequestMetric) this.f83053b).getNetworkClientErrorReason();
        }

        public PerfSession getPerfSessions(int i) {
            return ((NetworkRequestMetric) this.f83053b).getPerfSessions(i);
        }

        public int getPerfSessionsCount() {
            return ((NetworkRequestMetric) this.f83053b).getPerfSessionsCount();
        }

        public List<PerfSession> getPerfSessionsList() {
            return Collections.unmodifiableList(((NetworkRequestMetric) this.f83053b).getPerfSessionsList());
        }

        public long getRequestPayloadBytes() {
            return ((NetworkRequestMetric) this.f83053b).getRequestPayloadBytes();
        }

        public String getResponseContentType() {
            return ((NetworkRequestMetric) this.f83053b).getResponseContentType();
        }

        public ByteString getResponseContentTypeBytes() {
            return ((NetworkRequestMetric) this.f83053b).getResponseContentTypeBytes();
        }

        public long getResponsePayloadBytes() {
            return ((NetworkRequestMetric) this.f83053b).getResponsePayloadBytes();
        }

        public long getTimeToRequestCompletedUs() {
            return ((NetworkRequestMetric) this.f83053b).getTimeToRequestCompletedUs();
        }

        public long getTimeToResponseCompletedUs() {
            return ((NetworkRequestMetric) this.f83053b).getTimeToResponseCompletedUs();
        }

        public long getTimeToResponseInitiatedUs() {
            return ((NetworkRequestMetric) this.f83053b).getTimeToResponseInitiatedUs();
        }

        public String getUrl() {
            return ((NetworkRequestMetric) this.f83053b).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((NetworkRequestMetric) this.f83053b).getUrlBytes();
        }

        /* renamed from: h0 */
        public C33470b mo97122h0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearResponsePayloadBytes();
            return this;
        }

        public boolean hasClientStartTimeUs() {
            return ((NetworkRequestMetric) this.f83053b).hasClientStartTimeUs();
        }

        public boolean hasHttpMethod() {
            return ((NetworkRequestMetric) this.f83053b).hasHttpMethod();
        }

        public boolean hasHttpResponseCode() {
            return ((NetworkRequestMetric) this.f83053b).hasHttpResponseCode();
        }

        public boolean hasNetworkClientErrorReason() {
            return ((NetworkRequestMetric) this.f83053b).hasNetworkClientErrorReason();
        }

        public boolean hasRequestPayloadBytes() {
            return ((NetworkRequestMetric) this.f83053b).hasRequestPayloadBytes();
        }

        public boolean hasResponseContentType() {
            return ((NetworkRequestMetric) this.f83053b).hasResponseContentType();
        }

        public boolean hasResponsePayloadBytes() {
            return ((NetworkRequestMetric) this.f83053b).hasResponsePayloadBytes();
        }

        public boolean hasTimeToRequestCompletedUs() {
            return ((NetworkRequestMetric) this.f83053b).hasTimeToRequestCompletedUs();
        }

        public boolean hasTimeToResponseCompletedUs() {
            return ((NetworkRequestMetric) this.f83053b).hasTimeToResponseCompletedUs();
        }

        public boolean hasTimeToResponseInitiatedUs() {
            return ((NetworkRequestMetric) this.f83053b).hasTimeToResponseInitiatedUs();
        }

        public boolean hasUrl() {
            return ((NetworkRequestMetric) this.f83053b).hasUrl();
        }

        /* renamed from: i0 */
        public C33470b mo97123i0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearTimeToRequestCompletedUs();
            return this;
        }

        /* renamed from: j0 */
        public C33470b mo97124j0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearTimeToResponseCompletedUs();
            return this;
        }

        /* renamed from: k0 */
        public C33470b mo97125k0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearTimeToResponseInitiatedUs();
            return this;
        }

        /* renamed from: l0 */
        public C33470b mo97126l0() {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).clearUrl();
            return this;
        }

        /* renamed from: m0 */
        public C33470b mo97127m0(Map<String, String> map) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        /* renamed from: o0 */
        public C33470b mo97128o0(String str, String str2) {
            str.getClass();
            str2.getClass();
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).getMutableCustomAttributesMap().put(str, str2);
            return this;
        }

        /* renamed from: q0 */
        public C33470b mo97129q0(String str) {
            str.getClass();
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).getMutableCustomAttributesMap().remove(str);
            return this;
        }

        /* renamed from: r0 */
        public C33470b mo97130r0(int i) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).removePerfSessions(i);
            return this;
        }

        /* renamed from: s0 */
        public C33470b mo97131s0(long j) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setClientStartTimeUs(j);
            return this;
        }

        /* renamed from: u0 */
        public C33470b mo97132u0(HttpMethod httpMethod) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setHttpMethod(httpMethod);
            return this;
        }

        /* renamed from: v0 */
        public C33470b mo97133v0(int i) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setHttpResponseCode(i);
            return this;
        }

        /* renamed from: w0 */
        public C33470b mo97134w0(NetworkClientErrorReason networkClientErrorReason) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setNetworkClientErrorReason(networkClientErrorReason);
            return this;
        }

        /* renamed from: x0 */
        public C33470b mo97135x0(int i, PerfSession.C33476c cVar) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setPerfSessions(i, (PerfSession) cVar.mo100473g());
            return this;
        }

        /* renamed from: y0 */
        public C33470b mo97136y0(int i, PerfSession perfSession) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setPerfSessions(i, perfSession);
            return this;
        }

        /* renamed from: z0 */
        public C33470b mo97137z0(long j) {
            mo100457F();
            ((NetworkRequestMetric) this.f83053b).setRequestPayloadBytes(j);
            return this;
        }

        public C33470b() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$c */
    public static final class C33471c {

        /* renamed from: a */
        public static final C34363f1<String, String> f81481a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f81481a = C34363f1.m139185f(fieldType, "", fieldType, "");
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.registerDefaultInstance(NetworkRequestMetric.class, networkRequestMetric);
    }

    private NetworkRequestMetric() {
    }

    /* access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        C34319a.addAll(iterable, this.perfSessions_);
    }

    /* access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearHttpMethod() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearHttpResponseCode() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearNetworkClientErrorReason() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearRequestPayloadBytes() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearResponseContentType() {
        this.bitField0_ &= -65;
        this.responseContentType_ = getDefaultInstance().getResponseContentType();
    }

    /* access modifiers changed from: private */
    public void clearResponsePayloadBytes() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearTimeToRequestCompletedUs() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearTimeToResponseCompletedUs() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearTimeToResponseInitiatedUs() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensurePerfSessionsIsMutable() {
        C34471v0.C34488k<PerfSession> kVar = this.perfSessions_;
        if (!kVar.mo100971T()) {
            this.perfSessions_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static NetworkRequestMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private MapFieldLite<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private MapFieldLite<String, String> internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.mo100543n()) {
            this.customAttributes_ = this.customAttributes_.mo100549t();
        }
        return this.customAttributes_;
    }

    public static C33470b newBuilder() {
        return (C33470b) DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<NetworkRequestMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removePerfSessions(int i) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setClientStartTimeUs(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    /* access modifiers changed from: private */
    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod_ = httpMethod.getNumber();
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void setHttpResponseCode(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    /* access modifiers changed from: private */
    public void setNetworkClientErrorReason(NetworkClientErrorReason networkClientErrorReason) {
        this.networkClientErrorReason_ = networkClientErrorReason.getNumber();
        this.bitField0_ |= 16;
    }

    /* access modifiers changed from: private */
    public void setPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i, perfSession);
    }

    /* access modifiers changed from: private */
    public void setRequestPayloadBytes(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    /* access modifiers changed from: private */
    public void setResponseContentType(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* access modifiers changed from: private */
    public void setResponseContentTypeBytes(ByteString byteString) {
        this.responseContentType_ = byteString.mo99228S0();
        this.bitField0_ |= 64;
    }

    /* access modifiers changed from: private */
    public void setResponsePayloadBytes(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* access modifiers changed from: private */
    public void setTimeToRequestCompletedUs(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    /* access modifiers changed from: private */
    public void setTimeToResponseCompletedUs(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    /* access modifiers changed from: private */
    public void setTimeToResponseInitiatedUs(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    /* access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        this.url_ = byteString.mo99228S0();
        this.bitField0_ |= 1;
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33469a.f81480a[methodToInvoke.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new C33470b((C33469a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.m134941q(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.m134948q(), "customAttributes_", C33471c.f81481a, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<NetworkRequestMetric> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (NetworkRequestMetric.class) {
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

    public HttpMethod getHttpMethod() {
        HttpMethod b = HttpMethod.m134939b(this.httpMethod_);
        if (b == null) {
            return HttpMethod.HTTP_METHOD_UNKNOWN;
        }
        return b;
    }

    public int getHttpResponseCode() {
        return this.httpResponseCode_;
    }

    public NetworkClientErrorReason getNetworkClientErrorReason() {
        NetworkClientErrorReason b = NetworkClientErrorReason.m134946b(this.networkClientErrorReason_);
        if (b == null) {
            return NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }
        return b;
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

    public long getRequestPayloadBytes() {
        return this.requestPayloadBytes_;
    }

    public String getResponseContentType() {
        return this.responseContentType_;
    }

    public ByteString getResponseContentTypeBytes() {
        return ByteString.m137260e0(this.responseContentType_);
    }

    public long getResponsePayloadBytes() {
        return this.responsePayloadBytes_;
    }

    public long getTimeToRequestCompletedUs() {
        return this.timeToRequestCompletedUs_;
    }

    public long getTimeToResponseCompletedUs() {
        return this.timeToResponseCompletedUs_;
    }

    public long getTimeToResponseInitiatedUs() {
        return this.timeToResponseInitiatedUs_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.m137260e0(this.url_);
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasHttpMethod() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHttpResponseCode() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNetworkClientErrorReason() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRequestPayloadBytes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasResponseContentType() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasResponsePayloadBytes() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimeToRequestCompletedUs() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTimeToResponseCompletedUs() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTimeToResponseInitiatedUs() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C33470b newBuilder(NetworkRequestMetric networkRequestMetric) {
        return (C33470b) DEFAULT_INSTANCE.createBuilder(networkRequestMetric);
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static NetworkRequestMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addPerfSessions(int i, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i, perfSession);
    }

    public static NetworkRequestMetric parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static NetworkRequestMetric parseFrom(C34448s sVar) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static NetworkRequestMetric parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
