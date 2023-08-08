package com.google.cloud.audit;

import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class AuditLog extends GeneratedMessageLite<AuditLog, C32475b> implements C32482a {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    /* access modifiers changed from: private */
    public static final AuditLog DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile C34504y1<AuditLog> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private C34471v0.C34488k<AuthorizationInfo> authorizationInfo_ = GeneratedMessageLite.emptyProtobufList();
    private String methodName_ = "";
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private String resourceName_ = "";
    private Struct response_;
    private Any serviceData_;
    private String serviceName_ = "";
    private Status status_;

    /* renamed from: com.google.cloud.audit.AuditLog$a */
    public static /* synthetic */ class C32474a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78811a;

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
                f78811a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78811a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78811a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78811a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78811a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78811a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78811a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.cloud.audit.AuditLog.C32474a.<clinit>():void");
        }
    }

    /* renamed from: com.google.cloud.audit.AuditLog$b */
    public static final class C32475b extends GeneratedMessageLite.C34263b<AuditLog, C32475b> implements C32482a {
        public /* synthetic */ C32475b(C32474a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C32475b mo94505B0(long j) {
            mo100457F();
            ((AuditLog) this.f83053b).setNumResponseItems(j);
            return this;
        }

        /* renamed from: D0 */
        public C32475b mo94506D0(Struct.C34293b bVar) {
            mo100457F();
            ((AuditLog) this.f83053b).setRequest((Struct) bVar.mo100473g());
            return this;
        }

        /* renamed from: E0 */
        public C32475b mo94507E0(Struct struct) {
            mo100457F();
            ((AuditLog) this.f83053b).setRequest(struct);
            return this;
        }

        /* renamed from: F0 */
        public C32475b mo94508F0(RequestMetadata.C32481b bVar) {
            mo100457F();
            ((AuditLog) this.f83053b).setRequestMetadata((RequestMetadata) bVar.mo100473g());
            return this;
        }

        /* renamed from: G0 */
        public C32475b mo94509G0(RequestMetadata requestMetadata) {
            mo100457F();
            ((AuditLog) this.f83053b).setRequestMetadata(requestMetadata);
            return this;
        }

        /* renamed from: H0 */
        public C32475b mo94510H0(String str) {
            mo100457F();
            ((AuditLog) this.f83053b).setResourceName(str);
            return this;
        }

        /* renamed from: I0 */
        public C32475b mo94511I0(ByteString byteString) {
            mo100457F();
            ((AuditLog) this.f83053b).setResourceNameBytes(byteString);
            return this;
        }

        /* renamed from: J0 */
        public C32475b mo94512J0(Struct.C34293b bVar) {
            mo100457F();
            ((AuditLog) this.f83053b).setResponse((Struct) bVar.mo100473g());
            return this;
        }

        /* renamed from: L0 */
        public C32475b mo94513L0(Struct struct) {
            mo100457F();
            ((AuditLog) this.f83053b).setResponse(struct);
            return this;
        }

        /* renamed from: M0 */
        public C32475b mo94514M0(Any.C34149b bVar) {
            mo100457F();
            ((AuditLog) this.f83053b).setServiceData((Any) bVar.mo100473g());
            return this;
        }

        /* renamed from: O0 */
        public C32475b mo94515O0(Any any) {
            mo100457F();
            ((AuditLog) this.f83053b).setServiceData(any);
            return this;
        }

        /* renamed from: P */
        public C32475b mo94516P(Iterable<? extends AuthorizationInfo> iterable) {
            mo100457F();
            ((AuditLog) this.f83053b).addAllAuthorizationInfo(iterable);
            return this;
        }

        /* renamed from: P0 */
        public C32475b mo94517P0(String str) {
            mo100457F();
            ((AuditLog) this.f83053b).setServiceName(str);
            return this;
        }

        /* renamed from: Q0 */
        public C32475b mo94518Q0(ByteString byteString) {
            mo100457F();
            ((AuditLog) this.f83053b).setServiceNameBytes(byteString);
            return this;
        }

        /* renamed from: R */
        public C32475b mo94519R(int i, AuthorizationInfo.C32479b bVar) {
            mo100457F();
            ((AuditLog) this.f83053b).addAuthorizationInfo(i, (AuthorizationInfo) bVar.mo100473g());
            return this;
        }

        /* renamed from: R0 */
        public C32475b mo94520R0(Status.C34544b bVar) {
            mo100457F();
            ((AuditLog) this.f83053b).setStatus((Status) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32475b mo94521S(int i, AuthorizationInfo authorizationInfo) {
            mo100457F();
            ((AuditLog) this.f83053b).addAuthorizationInfo(i, authorizationInfo);
            return this;
        }

        /* renamed from: S0 */
        public C32475b mo94522S0(Status status) {
            mo100457F();
            ((AuditLog) this.f83053b).setStatus(status);
            return this;
        }

        /* renamed from: T */
        public C32475b mo94523T(AuthorizationInfo.C32479b bVar) {
            mo100457F();
            ((AuditLog) this.f83053b).addAuthorizationInfo((AuthorizationInfo) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32475b mo94524U(AuthorizationInfo authorizationInfo) {
            mo100457F();
            ((AuditLog) this.f83053b).addAuthorizationInfo(authorizationInfo);
            return this;
        }

        /* renamed from: V */
        public C32475b mo94525V() {
            mo100457F();
            ((AuditLog) this.f83053b).clearAuthenticationInfo();
            return this;
        }

        /* renamed from: Y */
        public C32475b mo94526Y() {
            mo100457F();
            ((AuditLog) this.f83053b).clearAuthorizationInfo();
            return this;
        }

        /* renamed from: Z */
        public C32475b mo94527Z() {
            mo100457F();
            ((AuditLog) this.f83053b).clearMethodName();
            return this;
        }

        /* renamed from: a0 */
        public C32475b mo94528a0() {
            mo100457F();
            ((AuditLog) this.f83053b).clearNumResponseItems();
            return this;
        }

        /* renamed from: b0 */
        public C32475b mo94529b0() {
            mo100457F();
            ((AuditLog) this.f83053b).clearRequest();
            return this;
        }

        /* renamed from: c0 */
        public C32475b mo94530c0() {
            mo100457F();
            ((AuditLog) this.f83053b).clearRequestMetadata();
            return this;
        }

        /* renamed from: d0 */
        public C32475b mo94531d0() {
            mo100457F();
            ((AuditLog) this.f83053b).clearResourceName();
            return this;
        }

        /* renamed from: g0 */
        public C32475b mo94532g0() {
            mo100457F();
            ((AuditLog) this.f83053b).clearResponse();
            return this;
        }

        public AuthenticationInfo getAuthenticationInfo() {
            return ((AuditLog) this.f83053b).getAuthenticationInfo();
        }

        public AuthorizationInfo getAuthorizationInfo(int i) {
            return ((AuditLog) this.f83053b).getAuthorizationInfo(i);
        }

        public int getAuthorizationInfoCount() {
            return ((AuditLog) this.f83053b).getAuthorizationInfoCount();
        }

        public List<AuthorizationInfo> getAuthorizationInfoList() {
            return Collections.unmodifiableList(((AuditLog) this.f83053b).getAuthorizationInfoList());
        }

        public String getMethodName() {
            return ((AuditLog) this.f83053b).getMethodName();
        }

        public ByteString getMethodNameBytes() {
            return ((AuditLog) this.f83053b).getMethodNameBytes();
        }

        public long getNumResponseItems() {
            return ((AuditLog) this.f83053b).getNumResponseItems();
        }

        public Struct getRequest() {
            return ((AuditLog) this.f83053b).getRequest();
        }

        public RequestMetadata getRequestMetadata() {
            return ((AuditLog) this.f83053b).getRequestMetadata();
        }

        public String getResourceName() {
            return ((AuditLog) this.f83053b).getResourceName();
        }

        public ByteString getResourceNameBytes() {
            return ((AuditLog) this.f83053b).getResourceNameBytes();
        }

        public Struct getResponse() {
            return ((AuditLog) this.f83053b).getResponse();
        }

        public Any getServiceData() {
            return ((AuditLog) this.f83053b).getServiceData();
        }

        public String getServiceName() {
            return ((AuditLog) this.f83053b).getServiceName();
        }

        public ByteString getServiceNameBytes() {
            return ((AuditLog) this.f83053b).getServiceNameBytes();
        }

        public Status getStatus() {
            return ((AuditLog) this.f83053b).getStatus();
        }

        /* renamed from: h0 */
        public C32475b mo94533h0() {
            mo100457F();
            ((AuditLog) this.f83053b).clearServiceData();
            return this;
        }

        public boolean hasAuthenticationInfo() {
            return ((AuditLog) this.f83053b).hasAuthenticationInfo();
        }

        public boolean hasRequest() {
            return ((AuditLog) this.f83053b).hasRequest();
        }

        public boolean hasRequestMetadata() {
            return ((AuditLog) this.f83053b).hasRequestMetadata();
        }

        public boolean hasResponse() {
            return ((AuditLog) this.f83053b).hasResponse();
        }

        public boolean hasServiceData() {
            return ((AuditLog) this.f83053b).hasServiceData();
        }

        public boolean hasStatus() {
            return ((AuditLog) this.f83053b).hasStatus();
        }

        /* renamed from: i0 */
        public C32475b mo94534i0() {
            mo100457F();
            ((AuditLog) this.f83053b).clearServiceName();
            return this;
        }

        /* renamed from: j0 */
        public C32475b mo94535j0() {
            mo100457F();
            ((AuditLog) this.f83053b).clearStatus();
            return this;
        }

        /* renamed from: k0 */
        public C32475b mo94536k0(AuthenticationInfo authenticationInfo) {
            mo100457F();
            ((AuditLog) this.f83053b).mergeAuthenticationInfo(authenticationInfo);
            return this;
        }

        /* renamed from: l0 */
        public C32475b mo94537l0(Struct struct) {
            mo100457F();
            ((AuditLog) this.f83053b).mergeRequest(struct);
            return this;
        }

        /* renamed from: m0 */
        public C32475b mo94538m0(RequestMetadata requestMetadata) {
            mo100457F();
            ((AuditLog) this.f83053b).mergeRequestMetadata(requestMetadata);
            return this;
        }

        /* renamed from: o0 */
        public C32475b mo94539o0(Struct struct) {
            mo100457F();
            ((AuditLog) this.f83053b).mergeResponse(struct);
            return this;
        }

        /* renamed from: q0 */
        public C32475b mo94540q0(Any any) {
            mo100457F();
            ((AuditLog) this.f83053b).mergeServiceData(any);
            return this;
        }

        /* renamed from: r0 */
        public C32475b mo94541r0(Status status) {
            mo100457F();
            ((AuditLog) this.f83053b).mergeStatus(status);
            return this;
        }

        /* renamed from: s0 */
        public C32475b mo94542s0(int i) {
            mo100457F();
            ((AuditLog) this.f83053b).removeAuthorizationInfo(i);
            return this;
        }

        /* renamed from: u0 */
        public C32475b mo94543u0(AuthenticationInfo.C32477b bVar) {
            mo100457F();
            ((AuditLog) this.f83053b).setAuthenticationInfo((AuthenticationInfo) bVar.mo100473g());
            return this;
        }

        /* renamed from: v0 */
        public C32475b mo94544v0(AuthenticationInfo authenticationInfo) {
            mo100457F();
            ((AuditLog) this.f83053b).setAuthenticationInfo(authenticationInfo);
            return this;
        }

        /* renamed from: w0 */
        public C32475b mo94545w0(int i, AuthorizationInfo.C32479b bVar) {
            mo100457F();
            ((AuditLog) this.f83053b).setAuthorizationInfo(i, (AuthorizationInfo) bVar.mo100473g());
            return this;
        }

        /* renamed from: x0 */
        public C32475b mo94546x0(int i, AuthorizationInfo authorizationInfo) {
            mo100457F();
            ((AuditLog) this.f83053b).setAuthorizationInfo(i, authorizationInfo);
            return this;
        }

        /* renamed from: y0 */
        public C32475b mo94547y0(String str) {
            mo100457F();
            ((AuditLog) this.f83053b).setMethodName(str);
            return this;
        }

        /* renamed from: z0 */
        public C32475b mo94548z0(ByteString byteString) {
            mo100457F();
            ((AuditLog) this.f83053b).setMethodNameBytes(byteString);
            return this;
        }

        public C32475b() {
            super(AuditLog.DEFAULT_INSTANCE);
        }
    }

    static {
        AuditLog auditLog = new AuditLog();
        DEFAULT_INSTANCE = auditLog;
        GeneratedMessageLite.registerDefaultInstance(AuditLog.class, auditLog);
    }

    private AuditLog() {
    }

    /* access modifiers changed from: private */
    public void addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
        ensureAuthorizationInfoIsMutable();
        C34319a.addAll(iterable, this.authorizationInfo_);
    }

    /* access modifiers changed from: private */
    public void addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(authorizationInfo);
    }

    /* access modifiers changed from: private */
    public void clearAuthenticationInfo() {
        this.authenticationInfo_ = null;
    }

    /* access modifiers changed from: private */
    public void clearAuthorizationInfo() {
        this.authorizationInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearMethodName() {
        this.methodName_ = getDefaultInstance().getMethodName();
    }

    /* access modifiers changed from: private */
    public void clearNumResponseItems() {
        this.numResponseItems_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
    }

    /* access modifiers changed from: private */
    public void clearRequestMetadata() {
        this.requestMetadata_ = null;
    }

    /* access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
    }

    /* access modifiers changed from: private */
    public void clearServiceData() {
        this.serviceData_ = null;
    }

    /* access modifiers changed from: private */
    public void clearServiceName() {
        this.serviceName_ = getDefaultInstance().getServiceName();
    }

    /* access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
    }

    private void ensureAuthorizationInfoIsMutable() {
        C34471v0.C34488k<AuthorizationInfo> kVar = this.authorizationInfo_;
        if (!kVar.mo100971T()) {
            this.authorizationInfo_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static AuditLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        authenticationInfo.getClass();
        AuthenticationInfo authenticationInfo2 = this.authenticationInfo_;
        if (authenticationInfo2 == null || authenticationInfo2 == AuthenticationInfo.getDefaultInstance()) {
            this.authenticationInfo_ = authenticationInfo;
        } else {
            this.authenticationInfo_ = (AuthenticationInfo) ((AuthenticationInfo.C32477b) AuthenticationInfo.newBuilder(this.authenticationInfo_).mo100463K(authenticationInfo)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeRequest(Struct struct) {
        struct.getClass();
        Struct struct2 = this.request_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.request_ = struct;
        } else {
            this.request_ = (Struct) ((Struct.C34293b) Struct.newBuilder(this.request_).mo100463K(struct)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeRequestMetadata(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        RequestMetadata requestMetadata2 = this.requestMetadata_;
        if (requestMetadata2 == null || requestMetadata2 == RequestMetadata.getDefaultInstance()) {
            this.requestMetadata_ = requestMetadata;
        } else {
            this.requestMetadata_ = (RequestMetadata) ((RequestMetadata.C32481b) RequestMetadata.newBuilder(this.requestMetadata_).mo100463K(requestMetadata)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeResponse(Struct struct) {
        struct.getClass();
        Struct struct2 = this.response_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.response_ = struct;
        } else {
            this.response_ = (Struct) ((Struct.C34293b) Struct.newBuilder(this.response_).mo100463K(struct)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeServiceData(Any any) {
        any.getClass();
        Any any2 = this.serviceData_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.serviceData_ = any;
        } else {
            this.serviceData_ = (Any) ((Any.C34149b) Any.newBuilder(this.serviceData_).mo100463K(any)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeStatus(Status status) {
        status.getClass();
        Status status2 = this.status_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.status_ = status;
        } else {
            this.status_ = (Status) ((Status.C34544b) Status.newBuilder(this.status_).mo100463K(status)).mo100467Q();
        }
    }

    public static C32475b newBuilder() {
        return (C32475b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<AuditLog> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeAuthorizationInfo(int i) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        authenticationInfo.getClass();
        this.authenticationInfo_ = authenticationInfo;
    }

    /* access modifiers changed from: private */
    public void setAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.set(i, authorizationInfo);
    }

    /* access modifiers changed from: private */
    public void setMethodName(String str) {
        str.getClass();
        this.methodName_ = str;
    }

    /* access modifiers changed from: private */
    public void setMethodNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.methodName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setNumResponseItems(long j) {
        this.numResponseItems_ = j;
    }

    /* access modifiers changed from: private */
    public void setRequest(Struct struct) {
        struct.getClass();
        this.request_ = struct;
    }

    /* access modifiers changed from: private */
    public void setRequestMetadata(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        this.requestMetadata_ = requestMetadata;
    }

    /* access modifiers changed from: private */
    public void setResourceName(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* access modifiers changed from: private */
    public void setResourceNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.resourceName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setResponse(Struct struct) {
        struct.getClass();
        this.response_ = struct;
    }

    /* access modifiers changed from: private */
    public void setServiceData(Any any) {
        any.getClass();
        this.serviceData_ = any;
    }

    /* access modifiers changed from: private */
    public void setServiceName(String str) {
        str.getClass();
        this.serviceName_ = str;
    }

    /* access modifiers changed from: private */
    public void setServiceNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.serviceName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32474a.f78811a[methodToInvoke.ordinal()]) {
            case 1:
                return new AuditLog();
            case 2:
                return new C32475b((C32474a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0002\u0011\u000b\u0000\u0001\u0000\u0002\t\u0003\t\u0004\t\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000f\t\u0010\t\u0011\t", new Object[]{"status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", AuthorizationInfo.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<AuditLog> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (AuditLog.class) {
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

    public AuthenticationInfo getAuthenticationInfo() {
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        return authenticationInfo == null ? AuthenticationInfo.getDefaultInstance() : authenticationInfo;
    }

    public AuthorizationInfo getAuthorizationInfo(int i) {
        return this.authorizationInfo_.get(i);
    }

    public int getAuthorizationInfoCount() {
        return this.authorizationInfo_.size();
    }

    public List<AuthorizationInfo> getAuthorizationInfoList() {
        return this.authorizationInfo_;
    }

    public C32485d getAuthorizationInfoOrBuilder(int i) {
        return this.authorizationInfo_.get(i);
    }

    public List<? extends C32485d> getAuthorizationInfoOrBuilderList() {
        return this.authorizationInfo_;
    }

    public String getMethodName() {
        return this.methodName_;
    }

    public ByteString getMethodNameBytes() {
        return ByteString.m137260e0(this.methodName_);
    }

    public long getNumResponseItems() {
        return this.numResponseItems_;
    }

    public Struct getRequest() {
        Struct struct = this.request_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public RequestMetadata getRequestMetadata() {
        RequestMetadata requestMetadata = this.requestMetadata_;
        return requestMetadata == null ? RequestMetadata.getDefaultInstance() : requestMetadata;
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public ByteString getResourceNameBytes() {
        return ByteString.m137260e0(this.resourceName_);
    }

    public Struct getResponse() {
        Struct struct = this.response_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public Any getServiceData() {
        Any any = this.serviceData_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public String getServiceName() {
        return this.serviceName_;
    }

    public ByteString getServiceNameBytes() {
        return ByteString.m137260e0(this.serviceName_);
    }

    public Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    public boolean hasAuthenticationInfo() {
        return this.authenticationInfo_ != null;
    }

    public boolean hasRequest() {
        return this.request_ != null;
    }

    public boolean hasRequestMetadata() {
        return this.requestMetadata_ != null;
    }

    public boolean hasResponse() {
        return this.response_ != null;
    }

    public boolean hasServiceData() {
        return this.serviceData_ != null;
    }

    public boolean hasStatus() {
        return this.status_ != null;
    }

    public static C32475b newBuilder(AuditLog auditLog) {
        return (C32475b) DEFAULT_INSTANCE.createBuilder(auditLog);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static AuditLog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(i, authorizationInfo);
    }

    public static AuditLog parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static AuditLog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuditLog parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static AuditLog parseFrom(InputStream inputStream) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static AuditLog parseFrom(C34448s sVar) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static AuditLog parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
