package com.google.firebase.perf.p049v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo */
public final class NetworkConnectionInfo extends GeneratedMessageLite<NetworkConnectionInfo, C33464b> implements C33494h {
    /* access modifiers changed from: private */
    public static final NetworkConnectionInfo DEFAULT_INSTANCE;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile C34504y1<NetworkConnectionInfo> PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_ = -1;

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype */
    public enum MobileSubtype implements C34471v0.C34474c {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: K0 */
        public static final int f81369K0 = 0;

        /* renamed from: L0 */
        public static final int f81370L0 = 1;

        /* renamed from: M0 */
        public static final int f81371M0 = 2;

        /* renamed from: N0 */
        public static final int f81372N0 = 3;

        /* renamed from: O0 */
        public static final int f81373O0 = 4;

        /* renamed from: P0 */
        public static final int f81374P0 = 5;

        /* renamed from: Q0 */
        public static final int f81375Q0 = 6;

        /* renamed from: R0 */
        public static final int f81376R0 = 7;

        /* renamed from: S0 */
        public static final int f81377S0 = 8;

        /* renamed from: T0 */
        public static final int f81378T0 = 9;

        /* renamed from: U0 */
        public static final int f81379U0 = 10;

        /* renamed from: V0 */
        public static final int f81380V0 = 11;

        /* renamed from: W0 */
        public static final int f81381W0 = 12;

        /* renamed from: X0 */
        public static final int f81383X0 = 13;

        /* renamed from: Y0 */
        public static final int f81385Y0 = 14;

        /* renamed from: Z0 */
        public static final int f81387Z0 = 15;

        /* renamed from: a1 */
        public static final int f81389a1 = 16;

        /* renamed from: b1 */
        public static final int f81391b1 = 17;

        /* renamed from: c1 */
        public static final int f81393c1 = 18;

        /* renamed from: d1 */
        public static final int f81395d1 = 19;

        /* renamed from: e1 */
        public static final int f81397e1 = 100;

        /* renamed from: f1 */
        public static final C34471v0.C34475d<MobileSubtype> f81399f1 = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype$a */
        public class C33459a implements C34471v0.C34475d<MobileSubtype> {
            /* renamed from: b */
            public MobileSubtype mo93187a(int i) {
                return MobileSubtype.m134921b(i);
            }
        }

        /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype$b */
        public static final class C33460b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f81407a = null;

            static {
                f81407a = new C33460b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return MobileSubtype.m134921b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f81399f1 = new C33459a();
        }

        /* access modifiers changed from: public */
        MobileSubtype(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static MobileSubtype m134921b(int i) {
            if (i == 100) {
                return COMBINED;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        /* renamed from: g */
        public static C34471v0.C34475d<MobileSubtype> m134922g() {
            return f81399f1;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m134923q() {
            return C33460b.f81407a;
        }

        @Deprecated
        /* renamed from: r */
        public static MobileSubtype m134924r(int i) {
            return m134921b(i);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType */
    public enum NetworkType implements C34471v0.C34474c {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        

        /* renamed from: I0 */
        public static final int f81412I0 = -1;

        /* renamed from: J0 */
        public static final int f81413J0 = 0;

        /* renamed from: K0 */
        public static final int f81414K0 = 1;

        /* renamed from: L0 */
        public static final int f81415L0 = 2;

        /* renamed from: M0 */
        public static final int f81416M0 = 3;

        /* renamed from: N0 */
        public static final int f81417N0 = 4;

        /* renamed from: O0 */
        public static final int f81418O0 = 5;

        /* renamed from: P0 */
        public static final int f81419P0 = 6;

        /* renamed from: Q0 */
        public static final int f81420Q0 = 7;

        /* renamed from: R0 */
        public static final int f81421R0 = 8;

        /* renamed from: S0 */
        public static final int f81422S0 = 9;

        /* renamed from: T0 */
        public static final int f81423T0 = 10;

        /* renamed from: U0 */
        public static final int f81424U0 = 11;

        /* renamed from: V0 */
        public static final int f81425V0 = 12;

        /* renamed from: W0 */
        public static final int f81426W0 = 13;

        /* renamed from: X0 */
        public static final int f81428X0 = 14;

        /* renamed from: Y0 */
        public static final int f81430Y0 = 15;

        /* renamed from: Z0 */
        public static final int f81432Z0 = 16;

        /* renamed from: a1 */
        public static final int f81434a1 = 17;

        /* renamed from: b1 */
        public static final C34471v0.C34475d<NetworkType> f81436b1 = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType$a */
        public class C33461a implements C34471v0.C34475d<NetworkType> {
            /* renamed from: b */
            public NetworkType mo93187a(int i) {
                return NetworkType.m134928b(i);
            }
        }

        /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType$b */
        public static final class C33462b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f81448a = null;

            static {
                f81448a = new C33462b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return NetworkType.m134928b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f81436b1 = new C33461a();
        }

        /* access modifiers changed from: public */
        NetworkType(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static NetworkType m134928b(int i) {
            switch (i) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        /* renamed from: g */
        public static C34471v0.C34475d<NetworkType> m134929g() {
            return f81436b1;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m134930q() {
            return C33462b.f81448a;
        }

        @Deprecated
        /* renamed from: r */
        public static NetworkType m134931r(int i) {
            return m134928b(i);
        }

        public final int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$a */
    public static /* synthetic */ class C33463a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81449a;

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
                f81449a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81449a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81449a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81449a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81449a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81449a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81449a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p049v1.NetworkConnectionInfo.C33463a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$b */
    public static final class C33464b extends GeneratedMessageLite.C34263b<NetworkConnectionInfo, C33464b> implements C33494h {
        public /* synthetic */ C33464b(C33463a aVar) {
            this();
        }

        /* renamed from: P */
        public C33464b mo97060P() {
            mo100457F();
            ((NetworkConnectionInfo) this.f83053b).clearMobileSubtype();
            return this;
        }

        /* renamed from: R */
        public C33464b mo97061R() {
            mo100457F();
            ((NetworkConnectionInfo) this.f83053b).clearNetworkType();
            return this;
        }

        /* renamed from: S */
        public C33464b mo97062S(MobileSubtype mobileSubtype) {
            mo100457F();
            ((NetworkConnectionInfo) this.f83053b).setMobileSubtype(mobileSubtype);
            return this;
        }

        /* renamed from: T */
        public C33464b mo97063T(NetworkType networkType) {
            mo100457F();
            ((NetworkConnectionInfo) this.f83053b).setNetworkType(networkType);
            return this;
        }

        public MobileSubtype getMobileSubtype() {
            return ((NetworkConnectionInfo) this.f83053b).getMobileSubtype();
        }

        public NetworkType getNetworkType() {
            return ((NetworkConnectionInfo) this.f83053b).getNetworkType();
        }

        public boolean hasMobileSubtype() {
            return ((NetworkConnectionInfo) this.f83053b).hasMobileSubtype();
        }

        public boolean hasNetworkType() {
            return ((NetworkConnectionInfo) this.f83053b).hasNetworkType();
        }

        public C33464b() {
            super(NetworkConnectionInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        NetworkConnectionInfo networkConnectionInfo = new NetworkConnectionInfo();
        DEFAULT_INSTANCE = networkConnectionInfo;
        GeneratedMessageLite.registerDefaultInstance(NetworkConnectionInfo.class, networkConnectionInfo);
    }

    private NetworkConnectionInfo() {
    }

    /* access modifiers changed from: private */
    public void clearMobileSubtype() {
        this.bitField0_ &= -3;
        this.mobileSubtype_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearNetworkType() {
        this.bitField0_ &= -2;
        this.networkType_ = -1;
    }

    public static NetworkConnectionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C33464b newBuilder() {
        return (C33464b) DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<NetworkConnectionInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setMobileSubtype(MobileSubtype mobileSubtype) {
        this.mobileSubtype_ = mobileSubtype.getNumber();
        this.bitField0_ |= 2;
    }

    /* access modifiers changed from: private */
    public void setNetworkType(NetworkType networkType) {
        this.networkType_ = networkType.getNumber();
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33463a.f81449a[methodToInvoke.ordinal()]) {
            case 1:
                return new NetworkConnectionInfo();
            case 2:
                return new C33464b((C33463a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "networkType_", NetworkType.m134930q(), "mobileSubtype_", MobileSubtype.m134923q()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<NetworkConnectionInfo> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (NetworkConnectionInfo.class) {
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

    public MobileSubtype getMobileSubtype() {
        MobileSubtype b = MobileSubtype.m134921b(this.mobileSubtype_);
        if (b == null) {
            return MobileSubtype.UNKNOWN_MOBILE_SUBTYPE;
        }
        return b;
    }

    public NetworkType getNetworkType() {
        NetworkType b = NetworkType.m134928b(this.networkType_);
        if (b == null) {
            return NetworkType.NONE;
        }
        return b;
    }

    public boolean hasMobileSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNetworkType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C33464b newBuilder(NetworkConnectionInfo networkConnectionInfo) {
        return (C33464b) DEFAULT_INSTANCE.createBuilder(networkConnectionInfo);
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static NetworkConnectionInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NetworkConnectionInfo parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkConnectionInfo parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static NetworkConnectionInfo parseFrom(C34448s sVar) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static NetworkConnectionInfo parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (NetworkConnectionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
