package com.google.logging.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class HttpRequest extends GeneratedMessageLite<HttpRequest, C33716b> implements C33719a {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    /* access modifiers changed from: private */
    public static final HttpRequest DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile C34504y1<HttpRequest> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private String protocol_ = "";
    private String referer_ = "";
    private String remoteIp_ = "";
    private String requestMethod_ = "";
    private long requestSize_;
    private String requestUrl_ = "";
    private long responseSize_;
    private String serverIp_ = "";
    private int status_;
    private String userAgent_ = "";

    /* renamed from: com.google.logging.type.HttpRequest$a */
    public static /* synthetic */ class C33715a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81845a;

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
                f81845a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81845a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81845a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81845a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81845a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81845a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81845a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.logging.type.HttpRequest.C33715a.<clinit>():void");
        }
    }

    /* renamed from: com.google.logging.type.HttpRequest$b */
    public static final class C33716b extends GeneratedMessageLite.C34263b<HttpRequest, C33716b> implements C33719a {
        public /* synthetic */ C33716b(C33715a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C33716b mo97890B0(ByteString byteString) {
            mo100457F();
            ((HttpRequest) this.f83053b).setRequestMethodBytes(byteString);
            return this;
        }

        /* renamed from: D0 */
        public C33716b mo97891D0(long j) {
            mo100457F();
            ((HttpRequest) this.f83053b).setRequestSize(j);
            return this;
        }

        /* renamed from: E0 */
        public C33716b mo97892E0(String str) {
            mo100457F();
            ((HttpRequest) this.f83053b).setRequestUrl(str);
            return this;
        }

        /* renamed from: F0 */
        public C33716b mo97893F0(ByteString byteString) {
            mo100457F();
            ((HttpRequest) this.f83053b).setRequestUrlBytes(byteString);
            return this;
        }

        /* renamed from: G0 */
        public C33716b mo97894G0(long j) {
            mo100457F();
            ((HttpRequest) this.f83053b).setResponseSize(j);
            return this;
        }

        /* renamed from: H0 */
        public C33716b mo97895H0(String str) {
            mo100457F();
            ((HttpRequest) this.f83053b).setServerIp(str);
            return this;
        }

        /* renamed from: I0 */
        public C33716b mo97896I0(ByteString byteString) {
            mo100457F();
            ((HttpRequest) this.f83053b).setServerIpBytes(byteString);
            return this;
        }

        /* renamed from: J0 */
        public C33716b mo97897J0(int i) {
            mo100457F();
            ((HttpRequest) this.f83053b).setStatus(i);
            return this;
        }

        /* renamed from: L0 */
        public C33716b mo97898L0(String str) {
            mo100457F();
            ((HttpRequest) this.f83053b).setUserAgent(str);
            return this;
        }

        /* renamed from: M0 */
        public C33716b mo97899M0(ByteString byteString) {
            mo100457F();
            ((HttpRequest) this.f83053b).setUserAgentBytes(byteString);
            return this;
        }

        /* renamed from: P */
        public C33716b mo97900P() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearCacheFillBytes();
            return this;
        }

        /* renamed from: R */
        public C33716b mo97901R() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearCacheHit();
            return this;
        }

        /* renamed from: S */
        public C33716b mo97902S() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearCacheLookup();
            return this;
        }

        /* renamed from: T */
        public C33716b mo97903T() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearCacheValidatedWithOriginServer();
            return this;
        }

        /* renamed from: U */
        public C33716b mo97904U() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearLatency();
            return this;
        }

        /* renamed from: V */
        public C33716b mo97905V() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearProtocol();
            return this;
        }

        /* renamed from: Y */
        public C33716b mo97906Y() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearReferer();
            return this;
        }

        /* renamed from: Z */
        public C33716b mo97907Z() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearRemoteIp();
            return this;
        }

        /* renamed from: a0 */
        public C33716b mo97908a0() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearRequestMethod();
            return this;
        }

        /* renamed from: b0 */
        public C33716b mo97909b0() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearRequestSize();
            return this;
        }

        /* renamed from: c0 */
        public C33716b mo97910c0() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearRequestUrl();
            return this;
        }

        /* renamed from: d0 */
        public C33716b mo97911d0() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearResponseSize();
            return this;
        }

        /* renamed from: g0 */
        public C33716b mo97912g0() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearServerIp();
            return this;
        }

        public long getCacheFillBytes() {
            return ((HttpRequest) this.f83053b).getCacheFillBytes();
        }

        public boolean getCacheHit() {
            return ((HttpRequest) this.f83053b).getCacheHit();
        }

        public boolean getCacheLookup() {
            return ((HttpRequest) this.f83053b).getCacheLookup();
        }

        public boolean getCacheValidatedWithOriginServer() {
            return ((HttpRequest) this.f83053b).getCacheValidatedWithOriginServer();
        }

        public Duration getLatency() {
            return ((HttpRequest) this.f83053b).getLatency();
        }

        public String getProtocol() {
            return ((HttpRequest) this.f83053b).getProtocol();
        }

        public ByteString getProtocolBytes() {
            return ((HttpRequest) this.f83053b).getProtocolBytes();
        }

        public String getReferer() {
            return ((HttpRequest) this.f83053b).getReferer();
        }

        public ByteString getRefererBytes() {
            return ((HttpRequest) this.f83053b).getRefererBytes();
        }

        public String getRemoteIp() {
            return ((HttpRequest) this.f83053b).getRemoteIp();
        }

        public ByteString getRemoteIpBytes() {
            return ((HttpRequest) this.f83053b).getRemoteIpBytes();
        }

        public String getRequestMethod() {
            return ((HttpRequest) this.f83053b).getRequestMethod();
        }

        public ByteString getRequestMethodBytes() {
            return ((HttpRequest) this.f83053b).getRequestMethodBytes();
        }

        public long getRequestSize() {
            return ((HttpRequest) this.f83053b).getRequestSize();
        }

        public String getRequestUrl() {
            return ((HttpRequest) this.f83053b).getRequestUrl();
        }

        public ByteString getRequestUrlBytes() {
            return ((HttpRequest) this.f83053b).getRequestUrlBytes();
        }

        public long getResponseSize() {
            return ((HttpRequest) this.f83053b).getResponseSize();
        }

        public String getServerIp() {
            return ((HttpRequest) this.f83053b).getServerIp();
        }

        public ByteString getServerIpBytes() {
            return ((HttpRequest) this.f83053b).getServerIpBytes();
        }

        public int getStatus() {
            return ((HttpRequest) this.f83053b).getStatus();
        }

        public String getUserAgent() {
            return ((HttpRequest) this.f83053b).getUserAgent();
        }

        public ByteString getUserAgentBytes() {
            return ((HttpRequest) this.f83053b).getUserAgentBytes();
        }

        /* renamed from: h0 */
        public C33716b mo97913h0() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearStatus();
            return this;
        }

        public boolean hasLatency() {
            return ((HttpRequest) this.f83053b).hasLatency();
        }

        /* renamed from: i0 */
        public C33716b mo97914i0() {
            mo100457F();
            ((HttpRequest) this.f83053b).clearUserAgent();
            return this;
        }

        /* renamed from: j0 */
        public C33716b mo97915j0(Duration duration) {
            mo100457F();
            ((HttpRequest) this.f83053b).mergeLatency(duration);
            return this;
        }

        /* renamed from: k0 */
        public C33716b mo97916k0(long j) {
            mo100457F();
            ((HttpRequest) this.f83053b).setCacheFillBytes(j);
            return this;
        }

        /* renamed from: l0 */
        public C33716b mo97917l0(boolean z) {
            mo100457F();
            ((HttpRequest) this.f83053b).setCacheHit(z);
            return this;
        }

        /* renamed from: m0 */
        public C33716b mo97918m0(boolean z) {
            mo100457F();
            ((HttpRequest) this.f83053b).setCacheLookup(z);
            return this;
        }

        /* renamed from: o0 */
        public C33716b mo97919o0(boolean z) {
            mo100457F();
            ((HttpRequest) this.f83053b).setCacheValidatedWithOriginServer(z);
            return this;
        }

        /* renamed from: q0 */
        public C33716b mo97920q0(Duration.C34243b bVar) {
            mo100457F();
            ((HttpRequest) this.f83053b).setLatency((Duration) bVar.mo100473g());
            return this;
        }

        /* renamed from: r0 */
        public C33716b mo97921r0(Duration duration) {
            mo100457F();
            ((HttpRequest) this.f83053b).setLatency(duration);
            return this;
        }

        /* renamed from: s0 */
        public C33716b mo97922s0(String str) {
            mo100457F();
            ((HttpRequest) this.f83053b).setProtocol(str);
            return this;
        }

        /* renamed from: u0 */
        public C33716b mo97923u0(ByteString byteString) {
            mo100457F();
            ((HttpRequest) this.f83053b).setProtocolBytes(byteString);
            return this;
        }

        /* renamed from: v0 */
        public C33716b mo97924v0(String str) {
            mo100457F();
            ((HttpRequest) this.f83053b).setReferer(str);
            return this;
        }

        /* renamed from: w0 */
        public C33716b mo97925w0(ByteString byteString) {
            mo100457F();
            ((HttpRequest) this.f83053b).setRefererBytes(byteString);
            return this;
        }

        /* renamed from: x0 */
        public C33716b mo97926x0(String str) {
            mo100457F();
            ((HttpRequest) this.f83053b).setRemoteIp(str);
            return this;
        }

        /* renamed from: y0 */
        public C33716b mo97927y0(ByteString byteString) {
            mo100457F();
            ((HttpRequest) this.f83053b).setRemoteIpBytes(byteString);
            return this;
        }

        /* renamed from: z0 */
        public C33716b mo97928z0(String str) {
            mo100457F();
            ((HttpRequest) this.f83053b).setRequestMethod(str);
            return this;
        }

        public C33716b() {
            super(HttpRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        HttpRequest httpRequest = new HttpRequest();
        DEFAULT_INSTANCE = httpRequest;
        GeneratedMessageLite.registerDefaultInstance(HttpRequest.class, httpRequest);
    }

    private HttpRequest() {
    }

    /* access modifiers changed from: private */
    public void clearCacheFillBytes() {
        this.cacheFillBytes_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearCacheHit() {
        this.cacheHit_ = false;
    }

    /* access modifiers changed from: private */
    public void clearCacheLookup() {
        this.cacheLookup_ = false;
    }

    /* access modifiers changed from: private */
    public void clearCacheValidatedWithOriginServer() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    /* access modifiers changed from: private */
    public void clearLatency() {
        this.latency_ = null;
    }

    /* access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* access modifiers changed from: private */
    public void clearReferer() {
        this.referer_ = getDefaultInstance().getReferer();
    }

    /* access modifiers changed from: private */
    public void clearRemoteIp() {
        this.remoteIp_ = getDefaultInstance().getRemoteIp();
    }

    /* access modifiers changed from: private */
    public void clearRequestMethod() {
        this.requestMethod_ = getDefaultInstance().getRequestMethod();
    }

    /* access modifiers changed from: private */
    public void clearRequestSize() {
        this.requestSize_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearRequestUrl() {
        this.requestUrl_ = getDefaultInstance().getRequestUrl();
    }

    /* access modifiers changed from: private */
    public void clearResponseSize() {
        this.responseSize_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearServerIp() {
        this.serverIp_ = getDefaultInstance().getServerIp();
    }

    /* access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    public static HttpRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeLatency(Duration duration) {
        duration.getClass();
        Duration duration2 = this.latency_;
        if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
            this.latency_ = duration;
        } else {
            this.latency_ = (Duration) ((Duration.C34243b) Duration.newBuilder(this.latency_).mo100463K(duration)).mo100467Q();
        }
    }

    public static C33716b newBuilder() {
        return (C33716b) DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<HttpRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setCacheFillBytes(long j) {
        this.cacheFillBytes_ = j;
    }

    /* access modifiers changed from: private */
    public void setCacheHit(boolean z) {
        this.cacheHit_ = z;
    }

    /* access modifiers changed from: private */
    public void setCacheLookup(boolean z) {
        this.cacheLookup_ = z;
    }

    /* access modifiers changed from: private */
    public void setCacheValidatedWithOriginServer(boolean z) {
        this.cacheValidatedWithOriginServer_ = z;
    }

    /* access modifiers changed from: private */
    public void setLatency(Duration duration) {
        duration.getClass();
        this.latency_ = duration;
    }

    /* access modifiers changed from: private */
    public void setProtocol(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* access modifiers changed from: private */
    public void setProtocolBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.protocol_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setReferer(String str) {
        str.getClass();
        this.referer_ = str;
    }

    /* access modifiers changed from: private */
    public void setRefererBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.referer_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setRemoteIp(String str) {
        str.getClass();
        this.remoteIp_ = str;
    }

    /* access modifiers changed from: private */
    public void setRemoteIpBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.remoteIp_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setRequestMethod(String str) {
        str.getClass();
        this.requestMethod_ = str;
    }

    /* access modifiers changed from: private */
    public void setRequestMethodBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.requestMethod_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setRequestSize(long j) {
        this.requestSize_ = j;
    }

    /* access modifiers changed from: private */
    public void setRequestUrl(String str) {
        str.getClass();
        this.requestUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setRequestUrlBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.requestUrl_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setResponseSize(long j) {
        this.responseSize_ = j;
    }

    /* access modifiers changed from: private */
    public void setServerIp(String str) {
        str.getClass();
        this.serverIp_ = str;
    }

    /* access modifiers changed from: private */
    public void setServerIpBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.serverIp_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* access modifiers changed from: private */
    public void setUserAgent(String str) {
        str.getClass();
        this.userAgent_ = str;
    }

    /* access modifiers changed from: private */
    public void setUserAgentBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.userAgent_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33715a.f81845a[methodToInvoke.ordinal()]) {
            case 1:
                return new HttpRequest();
            case 2:
                return new C33716b((C33715a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0004\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000b\u0007\f\u0002\rȈ\u000e\t\u000fȈ", new Object[]{"requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<HttpRequest> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (HttpRequest.class) {
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

    public long getCacheFillBytes() {
        return this.cacheFillBytes_;
    }

    public boolean getCacheHit() {
        return this.cacheHit_;
    }

    public boolean getCacheLookup() {
        return this.cacheLookup_;
    }

    public boolean getCacheValidatedWithOriginServer() {
        return this.cacheValidatedWithOriginServer_;
    }

    public Duration getLatency() {
        Duration duration = this.latency_;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public ByteString getProtocolBytes() {
        return ByteString.m137260e0(this.protocol_);
    }

    public String getReferer() {
        return this.referer_;
    }

    public ByteString getRefererBytes() {
        return ByteString.m137260e0(this.referer_);
    }

    public String getRemoteIp() {
        return this.remoteIp_;
    }

    public ByteString getRemoteIpBytes() {
        return ByteString.m137260e0(this.remoteIp_);
    }

    public String getRequestMethod() {
        return this.requestMethod_;
    }

    public ByteString getRequestMethodBytes() {
        return ByteString.m137260e0(this.requestMethod_);
    }

    public long getRequestSize() {
        return this.requestSize_;
    }

    public String getRequestUrl() {
        return this.requestUrl_;
    }

    public ByteString getRequestUrlBytes() {
        return ByteString.m137260e0(this.requestUrl_);
    }

    public long getResponseSize() {
        return this.responseSize_;
    }

    public String getServerIp() {
        return this.serverIp_;
    }

    public ByteString getServerIpBytes() {
        return ByteString.m137260e0(this.serverIp_);
    }

    public int getStatus() {
        return this.status_;
    }

    public String getUserAgent() {
        return this.userAgent_;
    }

    public ByteString getUserAgentBytes() {
        return ByteString.m137260e0(this.userAgent_);
    }

    public boolean hasLatency() {
        return this.latency_ != null;
    }

    public static C33716b newBuilder(HttpRequest httpRequest) {
        return (C33716b) DEFAULT_INSTANCE.createBuilder(httpRequest);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static HttpRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HttpRequest parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static HttpRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRequest parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static HttpRequest parseFrom(InputStream inputStream) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static HttpRequest parseFrom(C34448s sVar) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static HttpRequest parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (HttpRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
