package com.google.api;

import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Endpoint;
import com.google.api.Http;
import com.google.api.LogDescriptor;
import com.google.api.Logging;
import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.Api;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34330b0;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34373h;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34464t2;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.Enum;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Service extends GeneratedMessageLite<Service, C32366b> implements C32414l1 {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    /* access modifiers changed from: private */
    public static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C34504y1<Service> PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private C34471v0.C34488k<Api> apis_ = GeneratedMessageLite.emptyProtobufList();
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private C34471v0.C34488k<Endpoint> endpoints_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<Enum> enums_ = GeneratedMessageLite.emptyProtobufList();
    private Http http_;
    private String id_ = "";
    private Logging logging_;
    private C34471v0.C34488k<LogDescriptor> logs_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<MetricDescriptor> metrics_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<MonitoredResourceDescriptor> monitoredResources_ = GeneratedMessageLite.emptyProtobufList();
    private Monitoring monitoring_;
    private String name_ = "";
    private String producerProjectId_ = "";
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private String title_ = "";
    private C34471v0.C34488k<Type> types_ = GeneratedMessageLite.emptyProtobufList();
    private Usage usage_;

    /* renamed from: com.google.api.Service$a */
    public static /* synthetic */ class C32365a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78783a;

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
                f78783a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78783a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78783a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78783a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78783a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78783a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78783a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Service.C32365a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Service$b */
    public static final class C32366b extends GeneratedMessageLite.C34263b<Service, C32366b> implements C32414l1 {
        public /* synthetic */ C32366b(C32365a aVar) {
            this();
        }

        /* renamed from: A2 */
        public C32366b mo94235A2(ByteString byteString) {
            mo100457F();
            ((Service) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: B0 */
        public C32366b mo94236B0(MonitoredResourceDescriptor.C32336b bVar) {
            mo100457F();
            ((Service) this.f83053b).addMonitoredResources((MonitoredResourceDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: B1 */
        public C32366b mo94237B1(int i) {
            mo100457F();
            ((Service) this.f83053b).removeEndpoints(i);
            return this;
        }

        /* renamed from: B2 */
        public C32366b mo94238B2(String str) {
            mo100457F();
            ((Service) this.f83053b).setProducerProjectId(str);
            return this;
        }

        /* renamed from: C1 */
        public C32366b mo94239C1(int i) {
            mo100457F();
            ((Service) this.f83053b).removeEnums(i);
            return this;
        }

        /* renamed from: C2 */
        public C32366b mo94240C2(ByteString byteString) {
            mo100457F();
            ((Service) this.f83053b).setProducerProjectIdBytes(byteString);
            return this;
        }

        /* renamed from: D0 */
        public C32366b mo94241D0(MonitoredResourceDescriptor monitoredResourceDescriptor) {
            mo100457F();
            ((Service) this.f83053b).addMonitoredResources(monitoredResourceDescriptor);
            return this;
        }

        /* renamed from: D1 */
        public C32366b mo94242D1(int i) {
            mo100457F();
            ((Service) this.f83053b).removeLogs(i);
            return this;
        }

        /* renamed from: E0 */
        public C32366b mo94243E0(int i, Type.C34300b bVar) {
            mo100457F();
            ((Service) this.f83053b).addTypes(i, (Type) bVar.mo100473g());
            return this;
        }

        /* renamed from: E1 */
        public C32366b mo94244E1(int i) {
            mo100457F();
            ((Service) this.f83053b).removeMetrics(i);
            return this;
        }

        /* renamed from: E2 */
        public C32366b mo94245E2(Quota.C32355b bVar) {
            mo100457F();
            ((Service) this.f83053b).setQuota((Quota) bVar.mo100473g());
            return this;
        }

        /* renamed from: F0 */
        public C32366b mo94246F0(int i, Type type) {
            mo100457F();
            ((Service) this.f83053b).addTypes(i, type);
            return this;
        }

        /* renamed from: F1 */
        public C32366b mo94247F1(int i) {
            mo100457F();
            ((Service) this.f83053b).removeMonitoredResources(i);
            return this;
        }

        /* renamed from: F2 */
        public C32366b mo94248F2(Quota quota) {
            mo100457F();
            ((Service) this.f83053b).setQuota(quota);
            return this;
        }

        /* renamed from: G0 */
        public C32366b mo94249G0(Type.C34300b bVar) {
            mo100457F();
            ((Service) this.f83053b).addTypes((Type) bVar.mo100473g());
            return this;
        }

        /* renamed from: G2 */
        public C32366b mo94250G2(SourceInfo.C32368b bVar) {
            mo100457F();
            ((Service) this.f83053b).setSourceInfo((SourceInfo) bVar.mo100473g());
            return this;
        }

        /* renamed from: H0 */
        public C32366b mo94251H0(Type type) {
            mo100457F();
            ((Service) this.f83053b).addTypes(type);
            return this;
        }

        /* renamed from: H1 */
        public C32366b mo94252H1(int i) {
            mo100457F();
            ((Service) this.f83053b).removeTypes(i);
            return this;
        }

        /* renamed from: H2 */
        public C32366b mo94253H2(SourceInfo sourceInfo) {
            mo100457F();
            ((Service) this.f83053b).setSourceInfo(sourceInfo);
            return this;
        }

        /* renamed from: I0 */
        public C32366b mo94254I0() {
            mo100457F();
            ((Service) this.f83053b).clearApis();
            return this;
        }

        /* renamed from: I1 */
        public C32366b mo94255I1(int i, Api.C34151b bVar) {
            mo100457F();
            ((Service) this.f83053b).setApis(i, (Api) bVar.mo100473g());
            return this;
        }

        /* renamed from: I2 */
        public C32366b mo94256I2(SystemParameters.C32374b bVar) {
            mo100457F();
            ((Service) this.f83053b).setSystemParameters((SystemParameters) bVar.mo100473g());
            return this;
        }

        /* renamed from: J0 */
        public C32366b mo94257J0() {
            mo100457F();
            ((Service) this.f83053b).clearAuthentication();
            return this;
        }

        /* renamed from: J1 */
        public C32366b mo94258J1(int i, Api api) {
            mo100457F();
            ((Service) this.f83053b).setApis(i, api);
            return this;
        }

        /* renamed from: J2 */
        public C32366b mo94259J2(SystemParameters systemParameters) {
            mo100457F();
            ((Service) this.f83053b).setSystemParameters(systemParameters);
            return this;
        }

        /* renamed from: K1 */
        public C32366b mo94260K1(Authentication.C32251b bVar) {
            mo100457F();
            ((Service) this.f83053b).setAuthentication((Authentication) bVar.mo100473g());
            return this;
        }

        /* renamed from: K2 */
        public C32366b mo94261K2(String str) {
            mo100457F();
            ((Service) this.f83053b).setTitle(str);
            return this;
        }

        /* renamed from: L0 */
        public C32366b mo94262L0() {
            mo100457F();
            ((Service) this.f83053b).clearBackend();
            return this;
        }

        /* renamed from: L2 */
        public C32366b mo94263L2(ByteString byteString) {
            mo100457F();
            ((Service) this.f83053b).setTitleBytes(byteString);
            return this;
        }

        /* renamed from: M0 */
        public C32366b mo94264M0() {
            mo100457F();
            ((Service) this.f83053b).clearBilling();
            return this;
        }

        /* renamed from: N1 */
        public C32366b mo94265N1(Authentication authentication) {
            mo100457F();
            ((Service) this.f83053b).setAuthentication(authentication);
            return this;
        }

        /* renamed from: N2 */
        public C32366b mo94266N2(int i, Type.C34300b bVar) {
            mo100457F();
            ((Service) this.f83053b).setTypes(i, (Type) bVar.mo100473g());
            return this;
        }

        /* renamed from: O0 */
        public C32366b mo94267O0() {
            mo100457F();
            ((Service) this.f83053b).clearConfigVersion();
            return this;
        }

        /* renamed from: O1 */
        public C32366b mo94268O1(Backend.C32255b bVar) {
            mo100457F();
            ((Service) this.f83053b).setBackend((Backend) bVar.mo100473g());
            return this;
        }

        /* renamed from: O2 */
        public C32366b mo94269O2(int i, Type type) {
            mo100457F();
            ((Service) this.f83053b).setTypes(i, type);
            return this;
        }

        /* renamed from: P */
        public C32366b mo94270P(Iterable<? extends Api> iterable) {
            mo100457F();
            ((Service) this.f83053b).addAllApis(iterable);
            return this;
        }

        /* renamed from: P0 */
        public C32366b mo94271P0() {
            mo100457F();
            ((Service) this.f83053b).clearContext();
            return this;
        }

        /* renamed from: P1 */
        public C32366b mo94272P1(Backend backend) {
            mo100457F();
            ((Service) this.f83053b).setBackend(backend);
            return this;
        }

        /* renamed from: P2 */
        public C32366b mo94273P2(Usage.C32376b bVar) {
            mo100457F();
            ((Service) this.f83053b).setUsage((Usage) bVar.mo100473g());
            return this;
        }

        /* renamed from: Q0 */
        public C32366b mo94274Q0() {
            mo100457F();
            ((Service) this.f83053b).clearControl();
            return this;
        }

        /* renamed from: Q1 */
        public C32366b mo94275Q1(Billing.C32263c cVar) {
            mo100457F();
            ((Service) this.f83053b).setBilling((Billing) cVar.mo100473g());
            return this;
        }

        /* renamed from: Q2 */
        public C32366b mo94276Q2(Usage usage) {
            mo100457F();
            ((Service) this.f83053b).setUsage(usage);
            return this;
        }

        /* renamed from: R */
        public C32366b mo94277R(Iterable<? extends Endpoint> iterable) {
            mo100457F();
            ((Service) this.f83053b).addAllEndpoints(iterable);
            return this;
        }

        /* renamed from: R0 */
        public C32366b mo94278R0() {
            mo100457F();
            ((Service) this.f83053b).clearDocumentation();
            return this;
        }

        /* renamed from: R1 */
        public C32366b mo94279R1(Billing billing) {
            mo100457F();
            ((Service) this.f83053b).setBilling(billing);
            return this;
        }

        /* renamed from: S */
        public C32366b mo94280S(Iterable<? extends Enum> iterable) {
            mo100457F();
            ((Service) this.f83053b).addAllEnums(iterable);
            return this;
        }

        /* renamed from: S0 */
        public C32366b mo94281S0() {
            mo100457F();
            ((Service) this.f83053b).clearEndpoints();
            return this;
        }

        /* renamed from: S1 */
        public C32366b mo94282S1(UInt32Value.C34302b bVar) {
            mo100457F();
            ((Service) this.f83053b).setConfigVersion((UInt32Value) bVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C32366b mo94283T(Iterable<? extends LogDescriptor> iterable) {
            mo100457F();
            ((Service) this.f83053b).addAllLogs(iterable);
            return this;
        }

        /* renamed from: T0 */
        public C32366b mo94284T0() {
            mo100457F();
            ((Service) this.f83053b).clearEnums();
            return this;
        }

        /* renamed from: T1 */
        public C32366b mo94285T1(UInt32Value uInt32Value) {
            mo100457F();
            ((Service) this.f83053b).setConfigVersion(uInt32Value);
            return this;
        }

        /* renamed from: U */
        public C32366b mo94286U(Iterable<? extends MetricDescriptor> iterable) {
            mo100457F();
            ((Service) this.f83053b).addAllMetrics(iterable);
            return this;
        }

        /* renamed from: U0 */
        public C32366b mo94287U0() {
            mo100457F();
            ((Service) this.f83053b).clearHttp();
            return this;
        }

        /* renamed from: U1 */
        public C32366b mo94288U1(Context.C32269b bVar) {
            mo100457F();
            ((Service) this.f83053b).setContext((Context) bVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C32366b mo94289V(Iterable<? extends MonitoredResourceDescriptor> iterable) {
            mo100457F();
            ((Service) this.f83053b).addAllMonitoredResources(iterable);
            return this;
        }

        /* renamed from: V0 */
        public C32366b mo94290V0() {
            mo100457F();
            ((Service) this.f83053b).clearId();
            return this;
        }

        /* renamed from: V1 */
        public C32366b mo94291V1(Context context) {
            mo100457F();
            ((Service) this.f83053b).setContext(context);
            return this;
        }

        /* renamed from: W0 */
        public C32366b mo94292W0() {
            mo100457F();
            ((Service) this.f83053b).clearLogging();
            return this;
        }

        /* renamed from: W1 */
        public C32366b mo94293W1(Control.C32273b bVar) {
            mo100457F();
            ((Service) this.f83053b).setControl((Control) bVar.mo100473g());
            return this;
        }

        /* renamed from: X0 */
        public C32366b mo94294X0() {
            mo100457F();
            ((Service) this.f83053b).clearLogs();
            return this;
        }

        /* renamed from: Y */
        public C32366b mo94295Y(Iterable<? extends Type> iterable) {
            mo100457F();
            ((Service) this.f83053b).addAllTypes(iterable);
            return this;
        }

        /* renamed from: Y0 */
        public C32366b mo94296Y0() {
            mo100457F();
            ((Service) this.f83053b).clearMetrics();
            return this;
        }

        /* renamed from: Z */
        public C32366b mo94297Z(int i, Api.C34151b bVar) {
            mo100457F();
            ((Service) this.f83053b).addApis(i, (Api) bVar.mo100473g());
            return this;
        }

        /* renamed from: Z0 */
        public C32366b mo94298Z0() {
            mo100457F();
            ((Service) this.f83053b).clearMonitoredResources();
            return this;
        }

        /* renamed from: Z1 */
        public C32366b mo94299Z1(Control control) {
            mo100457F();
            ((Service) this.f83053b).setControl(control);
            return this;
        }

        /* renamed from: a0 */
        public C32366b mo94300a0(int i, Api api) {
            mo100457F();
            ((Service) this.f83053b).addApis(i, api);
            return this;
        }

        /* renamed from: a1 */
        public C32366b mo94301a1() {
            mo100457F();
            ((Service) this.f83053b).clearMonitoring();
            return this;
        }

        /* renamed from: a2 */
        public C32366b mo94302a2(Documentation.C32291b bVar) {
            mo100457F();
            ((Service) this.f83053b).setDocumentation((Documentation) bVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C32366b mo94303b0(Api.C34151b bVar) {
            mo100457F();
            ((Service) this.f83053b).addApis((Api) bVar.mo100473g());
            return this;
        }

        /* renamed from: b1 */
        public C32366b mo94304b1() {
            mo100457F();
            ((Service) this.f83053b).clearName();
            return this;
        }

        /* renamed from: b2 */
        public C32366b mo94305b2(Documentation documentation) {
            mo100457F();
            ((Service) this.f83053b).setDocumentation(documentation);
            return this;
        }

        /* renamed from: c0 */
        public C32366b mo94306c0(Api api) {
            mo100457F();
            ((Service) this.f83053b).addApis(api);
            return this;
        }

        /* renamed from: c1 */
        public C32366b mo94307c1() {
            mo100457F();
            ((Service) this.f83053b).clearProducerProjectId();
            return this;
        }

        /* renamed from: d0 */
        public C32366b mo94308d0(int i, Endpoint.C32295b bVar) {
            mo100457F();
            ((Service) this.f83053b).addEndpoints(i, (Endpoint) bVar.mo100473g());
            return this;
        }

        /* renamed from: d1 */
        public C32366b mo94309d1() {
            mo100457F();
            ((Service) this.f83053b).clearQuota();
            return this;
        }

        /* renamed from: d2 */
        public C32366b mo94310d2(int i, Endpoint.C32295b bVar) {
            mo100457F();
            ((Service) this.f83053b).setEndpoints(i, (Endpoint) bVar.mo100473g());
            return this;
        }

        /* renamed from: e1 */
        public C32366b mo94311e1() {
            mo100457F();
            ((Service) this.f83053b).clearSourceInfo();
            return this;
        }

        /* renamed from: f1 */
        public C32366b mo94312f1() {
            mo100457F();
            ((Service) this.f83053b).clearSystemParameters();
            return this;
        }

        /* renamed from: f2 */
        public C32366b mo94313f2(int i, Endpoint endpoint) {
            mo100457F();
            ((Service) this.f83053b).setEndpoints(i, endpoint);
            return this;
        }

        /* renamed from: g0 */
        public C32366b mo94314g0(int i, Endpoint endpoint) {
            mo100457F();
            ((Service) this.f83053b).addEndpoints(i, endpoint);
            return this;
        }

        /* renamed from: g1 */
        public C32366b mo94315g1() {
            mo100457F();
            ((Service) this.f83053b).clearTitle();
            return this;
        }

        /* renamed from: g2 */
        public C32366b mo94316g2(int i, Enum.C34247b bVar) {
            mo100457F();
            ((Service) this.f83053b).setEnums(i, (Enum) bVar.mo100473g());
            return this;
        }

        public Api getApis(int i) {
            return ((Service) this.f83053b).getApis(i);
        }

        public int getApisCount() {
            return ((Service) this.f83053b).getApisCount();
        }

        public List<Api> getApisList() {
            return Collections.unmodifiableList(((Service) this.f83053b).getApisList());
        }

        public Authentication getAuthentication() {
            return ((Service) this.f83053b).getAuthentication();
        }

        public Backend getBackend() {
            return ((Service) this.f83053b).getBackend();
        }

        public Billing getBilling() {
            return ((Service) this.f83053b).getBilling();
        }

        public UInt32Value getConfigVersion() {
            return ((Service) this.f83053b).getConfigVersion();
        }

        public Context getContext() {
            return ((Service) this.f83053b).getContext();
        }

        public Control getControl() {
            return ((Service) this.f83053b).getControl();
        }

        public Documentation getDocumentation() {
            return ((Service) this.f83053b).getDocumentation();
        }

        public Endpoint getEndpoints(int i) {
            return ((Service) this.f83053b).getEndpoints(i);
        }

        public int getEndpointsCount() {
            return ((Service) this.f83053b).getEndpointsCount();
        }

        public List<Endpoint> getEndpointsList() {
            return Collections.unmodifiableList(((Service) this.f83053b).getEndpointsList());
        }

        public Enum getEnums(int i) {
            return ((Service) this.f83053b).getEnums(i);
        }

        public int getEnumsCount() {
            return ((Service) this.f83053b).getEnumsCount();
        }

        public List<Enum> getEnumsList() {
            return Collections.unmodifiableList(((Service) this.f83053b).getEnumsList());
        }

        public Http getHttp() {
            return ((Service) this.f83053b).getHttp();
        }

        public String getId() {
            return ((Service) this.f83053b).getId();
        }

        public ByteString getIdBytes() {
            return ((Service) this.f83053b).getIdBytes();
        }

        public Logging getLogging() {
            return ((Service) this.f83053b).getLogging();
        }

        public LogDescriptor getLogs(int i) {
            return ((Service) this.f83053b).getLogs(i);
        }

        public int getLogsCount() {
            return ((Service) this.f83053b).getLogsCount();
        }

        public List<LogDescriptor> getLogsList() {
            return Collections.unmodifiableList(((Service) this.f83053b).getLogsList());
        }

        public MetricDescriptor getMetrics(int i) {
            return ((Service) this.f83053b).getMetrics(i);
        }

        public int getMetricsCount() {
            return ((Service) this.f83053b).getMetricsCount();
        }

        public List<MetricDescriptor> getMetricsList() {
            return Collections.unmodifiableList(((Service) this.f83053b).getMetricsList());
        }

        public MonitoredResourceDescriptor getMonitoredResources(int i) {
            return ((Service) this.f83053b).getMonitoredResources(i);
        }

        public int getMonitoredResourcesCount() {
            return ((Service) this.f83053b).getMonitoredResourcesCount();
        }

        public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
            return Collections.unmodifiableList(((Service) this.f83053b).getMonitoredResourcesList());
        }

        public Monitoring getMonitoring() {
            return ((Service) this.f83053b).getMonitoring();
        }

        public String getName() {
            return ((Service) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Service) this.f83053b).getNameBytes();
        }

        public String getProducerProjectId() {
            return ((Service) this.f83053b).getProducerProjectId();
        }

        public ByteString getProducerProjectIdBytes() {
            return ((Service) this.f83053b).getProducerProjectIdBytes();
        }

        public Quota getQuota() {
            return ((Service) this.f83053b).getQuota();
        }

        public SourceInfo getSourceInfo() {
            return ((Service) this.f83053b).getSourceInfo();
        }

        public SystemParameters getSystemParameters() {
            return ((Service) this.f83053b).getSystemParameters();
        }

        public String getTitle() {
            return ((Service) this.f83053b).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Service) this.f83053b).getTitleBytes();
        }

        public Type getTypes(int i) {
            return ((Service) this.f83053b).getTypes(i);
        }

        public int getTypesCount() {
            return ((Service) this.f83053b).getTypesCount();
        }

        public List<Type> getTypesList() {
            return Collections.unmodifiableList(((Service) this.f83053b).getTypesList());
        }

        public Usage getUsage() {
            return ((Service) this.f83053b).getUsage();
        }

        /* renamed from: h0 */
        public C32366b mo94317h0(Endpoint.C32295b bVar) {
            mo100457F();
            ((Service) this.f83053b).addEndpoints((Endpoint) bVar.mo100473g());
            return this;
        }

        /* renamed from: h1 */
        public C32366b mo94318h1() {
            mo100457F();
            ((Service) this.f83053b).clearTypes();
            return this;
        }

        /* renamed from: h2 */
        public C32366b mo94319h2(int i, Enum enumR) {
            mo100457F();
            ((Service) this.f83053b).setEnums(i, enumR);
            return this;
        }

        public boolean hasAuthentication() {
            return ((Service) this.f83053b).hasAuthentication();
        }

        public boolean hasBackend() {
            return ((Service) this.f83053b).hasBackend();
        }

        public boolean hasBilling() {
            return ((Service) this.f83053b).hasBilling();
        }

        public boolean hasConfigVersion() {
            return ((Service) this.f83053b).hasConfigVersion();
        }

        public boolean hasContext() {
            return ((Service) this.f83053b).hasContext();
        }

        public boolean hasControl() {
            return ((Service) this.f83053b).hasControl();
        }

        public boolean hasDocumentation() {
            return ((Service) this.f83053b).hasDocumentation();
        }

        public boolean hasHttp() {
            return ((Service) this.f83053b).hasHttp();
        }

        public boolean hasLogging() {
            return ((Service) this.f83053b).hasLogging();
        }

        public boolean hasMonitoring() {
            return ((Service) this.f83053b).hasMonitoring();
        }

        public boolean hasQuota() {
            return ((Service) this.f83053b).hasQuota();
        }

        public boolean hasSourceInfo() {
            return ((Service) this.f83053b).hasSourceInfo();
        }

        public boolean hasSystemParameters() {
            return ((Service) this.f83053b).hasSystemParameters();
        }

        public boolean hasUsage() {
            return ((Service) this.f83053b).hasUsage();
        }

        /* renamed from: i0 */
        public C32366b mo94320i0(Endpoint endpoint) {
            mo100457F();
            ((Service) this.f83053b).addEndpoints(endpoint);
            return this;
        }

        /* renamed from: i1 */
        public C32366b mo94321i1() {
            mo100457F();
            ((Service) this.f83053b).clearUsage();
            return this;
        }

        /* renamed from: i2 */
        public C32366b mo94322i2(Http.C32299b bVar) {
            mo100457F();
            ((Service) this.f83053b).setHttp((Http) bVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C32366b mo94323j0(int i, Enum.C34247b bVar) {
            mo100457F();
            ((Service) this.f83053b).addEnums(i, (Enum) bVar.mo100473g());
            return this;
        }

        /* renamed from: j2 */
        public C32366b mo94324j2(Http http) {
            mo100457F();
            ((Service) this.f83053b).setHttp(http);
            return this;
        }

        /* renamed from: k0 */
        public C32366b mo94325k0(int i, Enum enumR) {
            mo100457F();
            ((Service) this.f83053b).addEnums(i, enumR);
            return this;
        }

        /* renamed from: k2 */
        public C32366b mo94326k2(String str) {
            mo100457F();
            ((Service) this.f83053b).setId(str);
            return this;
        }

        /* renamed from: l0 */
        public C32366b mo94327l0(Enum.C34247b bVar) {
            mo100457F();
            ((Service) this.f83053b).addEnums((Enum) bVar.mo100473g());
            return this;
        }

        /* renamed from: l1 */
        public C32366b mo94328l1(Authentication authentication) {
            mo100457F();
            ((Service) this.f83053b).mergeAuthentication(authentication);
            return this;
        }

        /* renamed from: m0 */
        public C32366b mo94329m0(Enum enumR) {
            mo100457F();
            ((Service) this.f83053b).addEnums(enumR);
            return this;
        }

        /* renamed from: m1 */
        public C32366b mo94330m1(Backend backend) {
            mo100457F();
            ((Service) this.f83053b).mergeBackend(backend);
            return this;
        }

        /* renamed from: n1 */
        public C32366b mo94331n1(Billing billing) {
            mo100457F();
            ((Service) this.f83053b).mergeBilling(billing);
            return this;
        }

        /* renamed from: n2 */
        public C32366b mo94332n2(ByteString byteString) {
            mo100457F();
            ((Service) this.f83053b).setIdBytes(byteString);
            return this;
        }

        /* renamed from: o0 */
        public C32366b mo94333o0(int i, LogDescriptor.C32313b bVar) {
            mo100457F();
            ((Service) this.f83053b).addLogs(i, (LogDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: o1 */
        public C32366b mo94334o1(UInt32Value uInt32Value) {
            mo100457F();
            ((Service) this.f83053b).mergeConfigVersion(uInt32Value);
            return this;
        }

        /* renamed from: o2 */
        public C32366b mo94335o2(Logging.C32316b bVar) {
            mo100457F();
            ((Service) this.f83053b).setLogging((Logging) bVar.mo100473g());
            return this;
        }

        /* renamed from: p1 */
        public C32366b mo94336p1(Context context) {
            mo100457F();
            ((Service) this.f83053b).mergeContext(context);
            return this;
        }

        /* renamed from: p2 */
        public C32366b mo94337p2(Logging logging) {
            mo100457F();
            ((Service) this.f83053b).setLogging(logging);
            return this;
        }

        /* renamed from: q0 */
        public C32366b mo94338q0(int i, LogDescriptor logDescriptor) {
            mo100457F();
            ((Service) this.f83053b).addLogs(i, logDescriptor);
            return this;
        }

        /* renamed from: q1 */
        public C32366b mo94339q1(Control control) {
            mo100457F();
            ((Service) this.f83053b).mergeControl(control);
            return this;
        }

        /* renamed from: q2 */
        public C32366b mo94340q2(int i, LogDescriptor.C32313b bVar) {
            mo100457F();
            ((Service) this.f83053b).setLogs(i, (LogDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: r0 */
        public C32366b mo94341r0(LogDescriptor.C32313b bVar) {
            mo100457F();
            ((Service) this.f83053b).addLogs((LogDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: r1 */
        public C32366b mo94342r1(Documentation documentation) {
            mo100457F();
            ((Service) this.f83053b).mergeDocumentation(documentation);
            return this;
        }

        /* renamed from: r2 */
        public C32366b mo94343r2(int i, LogDescriptor logDescriptor) {
            mo100457F();
            ((Service) this.f83053b).setLogs(i, logDescriptor);
            return this;
        }

        /* renamed from: s0 */
        public C32366b mo94344s0(LogDescriptor logDescriptor) {
            mo100457F();
            ((Service) this.f83053b).addLogs(logDescriptor);
            return this;
        }

        /* renamed from: s1 */
        public C32366b mo94345s1(Http http) {
            mo100457F();
            ((Service) this.f83053b).mergeHttp(http);
            return this;
        }

        /* renamed from: s2 */
        public C32366b mo94346s2(int i, MetricDescriptor.C32327b bVar) {
            mo100457F();
            ((Service) this.f83053b).setMetrics(i, (MetricDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: t1 */
        public C32366b mo94347t1(Logging logging) {
            mo100457F();
            ((Service) this.f83053b).mergeLogging(logging);
            return this;
        }

        /* renamed from: t2 */
        public C32366b mo94348t2(int i, MetricDescriptor metricDescriptor) {
            mo100457F();
            ((Service) this.f83053b).setMetrics(i, metricDescriptor);
            return this;
        }

        /* renamed from: u0 */
        public C32366b mo94349u0(int i, MetricDescriptor.C32327b bVar) {
            mo100457F();
            ((Service) this.f83053b).addMetrics(i, (MetricDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: u1 */
        public C32366b mo94350u1(Monitoring monitoring) {
            mo100457F();
            ((Service) this.f83053b).mergeMonitoring(monitoring);
            return this;
        }

        /* renamed from: u2 */
        public C32366b mo94351u2(int i, MonitoredResourceDescriptor.C32336b bVar) {
            mo100457F();
            ((Service) this.f83053b).setMonitoredResources(i, (MonitoredResourceDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: v0 */
        public C32366b mo94352v0(int i, MetricDescriptor metricDescriptor) {
            mo100457F();
            ((Service) this.f83053b).addMetrics(i, metricDescriptor);
            return this;
        }

        /* renamed from: v1 */
        public C32366b mo94353v1(Quota quota) {
            mo100457F();
            ((Service) this.f83053b).mergeQuota(quota);
            return this;
        }

        /* renamed from: v2 */
        public C32366b mo94354v2(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            mo100457F();
            ((Service) this.f83053b).setMonitoredResources(i, monitoredResourceDescriptor);
            return this;
        }

        /* renamed from: w0 */
        public C32366b mo94355w0(MetricDescriptor.C32327b bVar) {
            mo100457F();
            ((Service) this.f83053b).addMetrics((MetricDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: w1 */
        public C32366b mo94356w1(SourceInfo sourceInfo) {
            mo100457F();
            ((Service) this.f83053b).mergeSourceInfo(sourceInfo);
            return this;
        }

        /* renamed from: w2 */
        public C32366b mo94357w2(Monitoring.C32342b bVar) {
            mo100457F();
            ((Service) this.f83053b).setMonitoring((Monitoring) bVar.mo100473g());
            return this;
        }

        /* renamed from: x0 */
        public C32366b mo94358x0(MetricDescriptor metricDescriptor) {
            mo100457F();
            ((Service) this.f83053b).addMetrics(metricDescriptor);
            return this;
        }

        /* renamed from: x1 */
        public C32366b mo94359x1(SystemParameters systemParameters) {
            mo100457F();
            ((Service) this.f83053b).mergeSystemParameters(systemParameters);
            return this;
        }

        /* renamed from: x2 */
        public C32366b mo94360x2(Monitoring monitoring) {
            mo100457F();
            ((Service) this.f83053b).setMonitoring(monitoring);
            return this;
        }

        /* renamed from: y0 */
        public C32366b mo94361y0(int i, MonitoredResourceDescriptor.C32336b bVar) {
            mo100457F();
            ((Service) this.f83053b).addMonitoredResources(i, (MonitoredResourceDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: y1 */
        public C32366b mo94362y1(Usage usage) {
            mo100457F();
            ((Service) this.f83053b).mergeUsage(usage);
            return this;
        }

        /* renamed from: z0 */
        public C32366b mo94363z0(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            mo100457F();
            ((Service) this.f83053b).addMonitoredResources(i, monitoredResourceDescriptor);
            return this;
        }

        /* renamed from: z1 */
        public C32366b mo94364z1(int i) {
            mo100457F();
            ((Service) this.f83053b).removeApis(i);
            return this;
        }

        /* renamed from: z2 */
        public C32366b mo94365z2(String str) {
            mo100457F();
            ((Service) this.f83053b).setName(str);
            return this;
        }

        public C32366b() {
            super(Service.DEFAULT_INSTANCE);
        }
    }

    static {
        Service service = new Service();
        DEFAULT_INSTANCE = service;
        GeneratedMessageLite.registerDefaultInstance(Service.class, service);
    }

    private Service() {
    }

    /* access modifiers changed from: private */
    public void addAllApis(Iterable<? extends Api> iterable) {
        ensureApisIsMutable();
        C34319a.addAll(iterable, this.apis_);
    }

    /* access modifiers changed from: private */
    public void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        ensureEndpointsIsMutable();
        C34319a.addAll(iterable, this.endpoints_);
    }

    /* access modifiers changed from: private */
    public void addAllEnums(Iterable<? extends Enum> iterable) {
        ensureEnumsIsMutable();
        C34319a.addAll(iterable, this.enums_);
    }

    /* access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        ensureLogsIsMutable();
        C34319a.addAll(iterable, this.logs_);
    }

    /* access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        ensureMetricsIsMutable();
        C34319a.addAll(iterable, this.metrics_);
    }

    /* access modifiers changed from: private */
    public void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        ensureMonitoredResourcesIsMutable();
        C34319a.addAll(iterable, this.monitoredResources_);
    }

    /* access modifiers changed from: private */
    public void addAllTypes(Iterable<? extends Type> iterable) {
        ensureTypesIsMutable();
        C34319a.addAll(iterable, this.types_);
    }

    /* access modifiers changed from: private */
    public void addApis(Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(api);
    }

    /* access modifiers changed from: private */
    public void addEndpoints(Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(endpoint);
    }

    /* access modifiers changed from: private */
    public void addEnums(Enum enumR) {
        enumR.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(enumR);
    }

    /* access modifiers changed from: private */
    public void addLogs(LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(logDescriptor);
    }

    /* access modifiers changed from: private */
    public void addMetrics(MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(metricDescriptor);
    }

    /* access modifiers changed from: private */
    public void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(monitoredResourceDescriptor);
    }

    /* access modifiers changed from: private */
    public void addTypes(Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(type);
    }

    /* access modifiers changed from: private */
    public void clearApis() {
        this.apis_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearAuthentication() {
        this.authentication_ = null;
    }

    /* access modifiers changed from: private */
    public void clearBackend() {
        this.backend_ = null;
    }

    /* access modifiers changed from: private */
    public void clearBilling() {
        this.billing_ = null;
    }

    /* access modifiers changed from: private */
    public void clearConfigVersion() {
        this.configVersion_ = null;
    }

    /* access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
    }

    /* access modifiers changed from: private */
    public void clearControl() {
        this.control_ = null;
    }

    /* access modifiers changed from: private */
    public void clearDocumentation() {
        this.documentation_ = null;
    }

    /* access modifiers changed from: private */
    public void clearEndpoints() {
        this.endpoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearEnums() {
        this.enums_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearHttp() {
        this.http_ = null;
    }

    /* access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* access modifiers changed from: private */
    public void clearLogging() {
        this.logging_ = null;
    }

    /* access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearMonitoredResources() {
        this.monitoredResources_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearMonitoring() {
        this.monitoring_ = null;
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearProducerProjectId() {
        this.producerProjectId_ = getDefaultInstance().getProducerProjectId();
    }

    /* access modifiers changed from: private */
    public void clearQuota() {
        this.quota_ = null;
    }

    /* access modifiers changed from: private */
    public void clearSourceInfo() {
        this.sourceInfo_ = null;
    }

    /* access modifiers changed from: private */
    public void clearSystemParameters() {
        this.systemParameters_ = null;
    }

    /* access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* access modifiers changed from: private */
    public void clearTypes() {
        this.types_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearUsage() {
        this.usage_ = null;
    }

    private void ensureApisIsMutable() {
        C34471v0.C34488k<Api> kVar = this.apis_;
        if (!kVar.mo100971T()) {
            this.apis_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureEndpointsIsMutable() {
        C34471v0.C34488k<Endpoint> kVar = this.endpoints_;
        if (!kVar.mo100971T()) {
            this.endpoints_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureEnumsIsMutable() {
        C34471v0.C34488k<Enum> kVar = this.enums_;
        if (!kVar.mo100971T()) {
            this.enums_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureLogsIsMutable() {
        C34471v0.C34488k<LogDescriptor> kVar = this.logs_;
        if (!kVar.mo100971T()) {
            this.logs_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureMetricsIsMutable() {
        C34471v0.C34488k<MetricDescriptor> kVar = this.metrics_;
        if (!kVar.mo100971T()) {
            this.metrics_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureMonitoredResourcesIsMutable() {
        C34471v0.C34488k<MonitoredResourceDescriptor> kVar = this.monitoredResources_;
        if (!kVar.mo100971T()) {
            this.monitoredResources_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureTypesIsMutable() {
        C34471v0.C34488k<Type> kVar = this.types_;
        if (!kVar.mo100971T()) {
            this.types_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeAuthentication(Authentication authentication) {
        authentication.getClass();
        Authentication authentication2 = this.authentication_;
        if (authentication2 == null || authentication2 == Authentication.getDefaultInstance()) {
            this.authentication_ = authentication;
        } else {
            this.authentication_ = (Authentication) ((Authentication.C32251b) Authentication.newBuilder(this.authentication_).mo100463K(authentication)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeBackend(Backend backend) {
        backend.getClass();
        Backend backend2 = this.backend_;
        if (backend2 == null || backend2 == Backend.getDefaultInstance()) {
            this.backend_ = backend;
        } else {
            this.backend_ = (Backend) ((Backend.C32255b) Backend.newBuilder(this.backend_).mo100463K(backend)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeBilling(Billing billing) {
        billing.getClass();
        Billing billing2 = this.billing_;
        if (billing2 == null || billing2 == Billing.getDefaultInstance()) {
            this.billing_ = billing;
        } else {
            this.billing_ = (Billing) ((Billing.C32263c) Billing.newBuilder(this.billing_).mo100463K(billing)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        UInt32Value uInt32Value2 = this.configVersion_;
        if (uInt32Value2 == null || uInt32Value2 == UInt32Value.getDefaultInstance()) {
            this.configVersion_ = uInt32Value;
        } else {
            this.configVersion_ = (UInt32Value) ((UInt32Value.C34302b) UInt32Value.newBuilder(this.configVersion_).mo100463K(uInt32Value)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeContext(Context context) {
        context.getClass();
        Context context2 = this.context_;
        if (context2 == null || context2 == Context.getDefaultInstance()) {
            this.context_ = context;
        } else {
            this.context_ = (Context) ((Context.C32269b) Context.newBuilder(this.context_).mo100463K(context)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeControl(Control control) {
        control.getClass();
        Control control2 = this.control_;
        if (control2 == null || control2 == Control.getDefaultInstance()) {
            this.control_ = control;
        } else {
            this.control_ = (Control) ((Control.C32273b) Control.newBuilder(this.control_).mo100463K(control)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeDocumentation(Documentation documentation) {
        documentation.getClass();
        Documentation documentation2 = this.documentation_;
        if (documentation2 == null || documentation2 == Documentation.getDefaultInstance()) {
            this.documentation_ = documentation;
        } else {
            this.documentation_ = (Documentation) ((Documentation.C32291b) Documentation.newBuilder(this.documentation_).mo100463K(documentation)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeHttp(Http http) {
        http.getClass();
        Http http2 = this.http_;
        if (http2 == null || http2 == Http.getDefaultInstance()) {
            this.http_ = http;
        } else {
            this.http_ = (Http) ((Http.C32299b) Http.newBuilder(this.http_).mo100463K(http)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeLogging(Logging logging) {
        logging.getClass();
        Logging logging2 = this.logging_;
        if (logging2 == null || logging2 == Logging.getDefaultInstance()) {
            this.logging_ = logging;
        } else {
            this.logging_ = (Logging) ((Logging.C32316b) Logging.newBuilder(this.logging_).mo100463K(logging)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 == null || monitoring2 == Monitoring.getDefaultInstance()) {
            this.monitoring_ = monitoring;
        } else {
            this.monitoring_ = (Monitoring) ((Monitoring.C32342b) Monitoring.newBuilder(this.monitoring_).mo100463K(monitoring)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeQuota(Quota quota) {
        quota.getClass();
        Quota quota2 = this.quota_;
        if (quota2 == null || quota2 == Quota.getDefaultInstance()) {
            this.quota_ = quota;
        } else {
            this.quota_ = (Quota) ((Quota.C32355b) Quota.newBuilder(this.quota_).mo100463K(quota)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 == null || sourceInfo2 == SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = sourceInfo;
        } else {
            this.sourceInfo_ = (SourceInfo) ((SourceInfo.C32368b) SourceInfo.newBuilder(this.sourceInfo_).mo100463K(sourceInfo)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 == null || systemParameters2 == SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = systemParameters;
        } else {
            this.systemParameters_ = (SystemParameters) ((SystemParameters.C32374b) SystemParameters.newBuilder(this.systemParameters_).mo100463K(systemParameters)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeUsage(Usage usage) {
        usage.getClass();
        Usage usage2 = this.usage_;
        if (usage2 == null || usage2 == Usage.getDefaultInstance()) {
            this.usage_ = usage;
        } else {
            this.usage_ = (Usage) ((Usage.C32376b) Usage.newBuilder(this.usage_).mo100463K(usage)).mo100467Q();
        }
    }

    public static C32366b newBuilder() {
        return (C32366b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Service> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeApis(int i) {
        ensureApisIsMutable();
        this.apis_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeEndpoints(int i) {
        ensureEndpointsIsMutable();
        this.endpoints_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeEnums(int i) {
        ensureEnumsIsMutable();
        this.enums_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeLogs(int i) {
        ensureLogsIsMutable();
        this.logs_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeMetrics(int i) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeMonitoredResources(int i) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeTypes(int i) {
        ensureTypesIsMutable();
        this.types_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setApis(int i, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.set(i, api);
    }

    /* access modifiers changed from: private */
    public void setAuthentication(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
    }

    /* access modifiers changed from: private */
    public void setBackend(Backend backend) {
        backend.getClass();
        this.backend_ = backend;
    }

    /* access modifiers changed from: private */
    public void setBilling(Billing billing) {
        billing.getClass();
        this.billing_ = billing;
    }

    /* access modifiers changed from: private */
    public void setConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        this.configVersion_ = uInt32Value;
    }

    /* access modifiers changed from: private */
    public void setContext(Context context) {
        context.getClass();
        this.context_ = context;
    }

    /* access modifiers changed from: private */
    public void setControl(Control control) {
        control.getClass();
        this.control_ = control;
    }

    /* access modifiers changed from: private */
    public void setDocumentation(Documentation documentation) {
        documentation.getClass();
        this.documentation_ = documentation;
    }

    /* access modifiers changed from: private */
    public void setEndpoints(int i, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.set(i, endpoint);
    }

    /* access modifiers changed from: private */
    public void setEnums(int i, Enum enumR) {
        enumR.getClass();
        ensureEnumsIsMutable();
        this.enums_.set(i, enumR);
    }

    /* access modifiers changed from: private */
    public void setHttp(Http http) {
        http.getClass();
        this.http_ = http;
    }

    /* access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLogging(Logging logging) {
        logging.getClass();
        this.logging_ = logging;
    }

    /* access modifiers changed from: private */
    public void setLogs(int i, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i, logDescriptor);
    }

    /* access modifiers changed from: private */
    public void setMetrics(int i, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i, metricDescriptor);
    }

    /* access modifiers changed from: private */
    public void setMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(i, monitoredResourceDescriptor);
    }

    /* access modifiers changed from: private */
    public void setMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        this.monitoring_ = monitoring;
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
    public void setProducerProjectId(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* access modifiers changed from: private */
    public void setProducerProjectIdBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.producerProjectId_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setQuota(Quota quota) {
        quota.getClass();
        this.quota_ = quota;
    }

    /* access modifiers changed from: private */
    public void setSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        this.sourceInfo_ = sourceInfo;
    }

    /* access modifiers changed from: private */
    public void setSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        this.systemParameters_ = systemParameters;
    }

    /* access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setTypes(int i, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.set(i, type);
    }

    /* access modifiers changed from: private */
    public void setUsage(Usage usage) {
        usage.getClass();
        this.usage_ = usage;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32365a.f78783a[methodToInvoke.ordinal()]) {
            case 1:
                return new Service();
            case 2:
                return new C32366b((C32365a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u000f\t\u0012\u001b\u0014\t\u0015\t\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001a\t\u001b\t\u001c\t\u001d\t!Ȉ%\t", new Object[]{"name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Service> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Service.class) {
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

    public Api getApis(int i) {
        return this.apis_.get(i);
    }

    public int getApisCount() {
        return this.apis_.size();
    }

    public List<Api> getApisList() {
        return this.apis_;
    }

    public C34373h getApisOrBuilder(int i) {
        return this.apis_.get(i);
    }

    public List<? extends C34373h> getApisOrBuilderList() {
        return this.apis_;
    }

    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.getDefaultInstance() : authentication;
    }

    public Backend getBackend() {
        Backend backend = this.backend_;
        return backend == null ? Backend.getDefaultInstance() : backend;
    }

    public Billing getBilling() {
        Billing billing = this.billing_;
        return billing == null ? Billing.getDefaultInstance() : billing;
    }

    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
    }

    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    public Control getControl() {
        Control control = this.control_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        return documentation == null ? Documentation.getDefaultInstance() : documentation;
    }

    public Endpoint getEndpoints(int i) {
        return this.endpoints_.get(i);
    }

    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public C32383b0 getEndpointsOrBuilder(int i) {
        return this.endpoints_.get(i);
    }

    public List<? extends C32383b0> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    public Enum getEnums(int i) {
        return this.enums_.get(i);
    }

    public int getEnumsCount() {
        return this.enums_.size();
    }

    public List<Enum> getEnumsList() {
        return this.enums_;
    }

    public C34330b0 getEnumsOrBuilder(int i) {
        return this.enums_.get(i);
    }

    public List<? extends C34330b0> getEnumsOrBuilderList() {
        return this.enums_;
    }

    public Http getHttp() {
        Http http = this.http_;
        return http == null ? Http.getDefaultInstance() : http;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.m137260e0(this.id_);
    }

    public Logging getLogging() {
        Logging logging = this.logging_;
        return logging == null ? Logging.getDefaultInstance() : logging;
    }

    public LogDescriptor getLogs(int i) {
        return this.logs_.get(i);
    }

    public int getLogsCount() {
        return this.logs_.size();
    }

    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public C32419n0 getLogsOrBuilder(int i) {
        return this.logs_.get(i);
    }

    public List<? extends C32419n0> getLogsOrBuilderList() {
        return this.logs_;
    }

    public MetricDescriptor getMetrics(int i) {
        return this.metrics_.get(i);
    }

    public int getMetricsCount() {
        return this.metrics_.size();
    }

    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public C32431r0 getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
    }

    public List<? extends C32431r0> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public MonitoredResourceDescriptor getMonitoredResources(int i) {
        return this.monitoredResources_.get(i);
    }

    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public C32443v0 getMonitoredResourcesOrBuilder(int i) {
        return this.monitoredResources_.get(i);
    }

    public List<? extends C32443v0> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    public ByteString getProducerProjectIdBytes() {
        return ByteString.m137260e0(this.producerProjectId_);
    }

    public Quota getQuota() {
        Quota quota = this.quota_;
        return quota == null ? Quota.getDefaultInstance() : quota;
    }

    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
    }

    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.m137260e0(this.title_);
    }

    public Type getTypes(int i) {
        return this.types_.get(i);
    }

    public int getTypesCount() {
        return this.types_.size();
    }

    public List<Type> getTypesList() {
        return this.types_;
    }

    public C34464t2 getTypesOrBuilder(int i) {
        return this.types_.get(i);
    }

    public List<? extends C34464t2> getTypesOrBuilderList() {
        return this.types_;
    }

    public Usage getUsage() {
        Usage usage = this.usage_;
        return usage == null ? Usage.getDefaultInstance() : usage;
    }

    public boolean hasAuthentication() {
        return this.authentication_ != null;
    }

    public boolean hasBackend() {
        return this.backend_ != null;
    }

    public boolean hasBilling() {
        return this.billing_ != null;
    }

    public boolean hasConfigVersion() {
        return this.configVersion_ != null;
    }

    public boolean hasContext() {
        return this.context_ != null;
    }

    public boolean hasControl() {
        return this.control_ != null;
    }

    public boolean hasDocumentation() {
        return this.documentation_ != null;
    }

    public boolean hasHttp() {
        return this.http_ != null;
    }

    public boolean hasLogging() {
        return this.logging_ != null;
    }

    public boolean hasMonitoring() {
        return this.monitoring_ != null;
    }

    public boolean hasQuota() {
        return this.quota_ != null;
    }

    public boolean hasSourceInfo() {
        return this.sourceInfo_ != null;
    }

    public boolean hasSystemParameters() {
        return this.systemParameters_ != null;
    }

    public boolean hasUsage() {
        return this.usage_ != null;
    }

    public static C32366b newBuilder(Service service) {
        return (C32366b) DEFAULT_INSTANCE.createBuilder(service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Service parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addApis(int i, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(i, api);
    }

    /* access modifiers changed from: private */
    public void addEndpoints(int i, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(i, endpoint);
    }

    /* access modifiers changed from: private */
    public void addEnums(int i, Enum enumR) {
        enumR.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(i, enumR);
    }

    /* access modifiers changed from: private */
    public void addLogs(int i, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i, logDescriptor);
    }

    /* access modifiers changed from: private */
    public void addMetrics(int i, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i, metricDescriptor);
    }

    /* access modifiers changed from: private */
    public void addMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(i, monitoredResourceDescriptor);
    }

    /* access modifiers changed from: private */
    public void addTypes(int i, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(i, type);
    }

    public static Service parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Service parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Service parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Service parseFrom(C34448s sVar) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Service parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
