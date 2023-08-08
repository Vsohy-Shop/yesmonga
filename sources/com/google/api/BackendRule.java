package com.google.api;

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

public final class BackendRule extends GeneratedMessageLite<BackendRule, C32259b> implements C32406j {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final BackendRule DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile C34504y1<BackendRule> PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String address_ = "";
    private int authenticationCase_ = 0;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private String protocol_ = "";
    private String selector_ = "";

    public enum AuthenticationCase {
        JWT_AUDIENCE(7),
        DISABLE_AUTH(8),
        AUTHENTICATION_NOT_SET(0);
        
        private final int value;

        /* access modifiers changed from: public */
        AuthenticationCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static AuthenticationCase m130481b(int i) {
            if (i == 0) {
                return AUTHENTICATION_NOT_SET;
            }
            if (i == 7) {
                return JWT_AUDIENCE;
            }
            if (i != 8) {
                return null;
            }
            return DISABLE_AUTH;
        }

        @Deprecated
        /* renamed from: g */
        public static AuthenticationCase m130482g(int i) {
            return m130481b(i);
        }

        public int getNumber() {
            return this.value;
        }
    }

    public enum PathTranslation implements C34471v0.C34474c {
        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        public static final int f78614e = 0;

        /* renamed from: f */
        public static final int f78615f = 1;

        /* renamed from: g */
        public static final int f78616g = 2;

        /* renamed from: v */
        public static final C34471v0.C34475d<PathTranslation> f78617v = null;
        private final int value;

        /* renamed from: com.google.api.BackendRule$PathTranslation$a */
        public class C32256a implements C34471v0.C34475d<PathTranslation> {
            /* renamed from: b */
            public PathTranslation mo93187a(int i) {
                return PathTranslation.m130483b(i);
            }
        }

        /* renamed from: com.google.api.BackendRule$PathTranslation$b */
        public static final class C32257b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f78619a = null;

            static {
                f78619a = new C32257b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return PathTranslation.m130483b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f78617v = new C32256a();
        }

        /* access modifiers changed from: public */
        PathTranslation(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static PathTranslation m130483b(int i) {
            if (i == 0) {
                return PATH_TRANSLATION_UNSPECIFIED;
            }
            if (i == 1) {
                return CONSTANT_ADDRESS;
            }
            if (i != 2) {
                return null;
            }
            return APPEND_PATH_TO_ADDRESS;
        }

        /* renamed from: g */
        public static C34471v0.C34475d<PathTranslation> m130484g() {
            return f78617v;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m130485q() {
            return C32257b.f78619a;
        }

        @Deprecated
        /* renamed from: r */
        public static PathTranslation m130486r(int i) {
            return m130483b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.google.api.BackendRule$a */
    public static /* synthetic */ class C32258a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78620a;

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
                f78620a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78620a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78620a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78620a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78620a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78620a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78620a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.BackendRule.C32258a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.BackendRule$b */
    public static final class C32259b extends GeneratedMessageLite.C34263b<BackendRule, C32259b> implements C32406j {
        public /* synthetic */ C32259b(C32258a aVar) {
            this();
        }

        /* renamed from: P */
        public C32259b mo93190P() {
            mo100457F();
            ((BackendRule) this.f83053b).clearAddress();
            return this;
        }

        /* renamed from: R */
        public C32259b mo93191R() {
            mo100457F();
            ((BackendRule) this.f83053b).clearAuthentication();
            return this;
        }

        /* renamed from: S */
        public C32259b mo93192S() {
            mo100457F();
            ((BackendRule) this.f83053b).clearDeadline();
            return this;
        }

        /* renamed from: T */
        public C32259b mo93193T() {
            mo100457F();
            ((BackendRule) this.f83053b).clearDisableAuth();
            return this;
        }

        /* renamed from: U */
        public C32259b mo93194U() {
            mo100457F();
            ((BackendRule) this.f83053b).clearJwtAudience();
            return this;
        }

        /* renamed from: V */
        public C32259b mo93195V() {
            mo100457F();
            ((BackendRule) this.f83053b).clearMinDeadline();
            return this;
        }

        /* renamed from: Y */
        public C32259b mo93196Y() {
            mo100457F();
            ((BackendRule) this.f83053b).clearOperationDeadline();
            return this;
        }

        /* renamed from: Z */
        public C32259b mo93197Z() {
            mo100457F();
            ((BackendRule) this.f83053b).clearPathTranslation();
            return this;
        }

        /* renamed from: a0 */
        public C32259b mo93198a0() {
            mo100457F();
            ((BackendRule) this.f83053b).clearProtocol();
            return this;
        }

        /* renamed from: b0 */
        public C32259b mo93199b0() {
            mo100457F();
            ((BackendRule) this.f83053b).clearSelector();
            return this;
        }

        /* renamed from: c0 */
        public C32259b mo93200c0(String str) {
            mo100457F();
            ((BackendRule) this.f83053b).setAddress(str);
            return this;
        }

        /* renamed from: d0 */
        public C32259b mo93201d0(ByteString byteString) {
            mo100457F();
            ((BackendRule) this.f83053b).setAddressBytes(byteString);
            return this;
        }

        /* renamed from: g0 */
        public C32259b mo93202g0(double d) {
            mo100457F();
            ((BackendRule) this.f83053b).setDeadline(d);
            return this;
        }

        public String getAddress() {
            return ((BackendRule) this.f83053b).getAddress();
        }

        public ByteString getAddressBytes() {
            return ((BackendRule) this.f83053b).getAddressBytes();
        }

        public AuthenticationCase getAuthenticationCase() {
            return ((BackendRule) this.f83053b).getAuthenticationCase();
        }

        public double getDeadline() {
            return ((BackendRule) this.f83053b).getDeadline();
        }

        public boolean getDisableAuth() {
            return ((BackendRule) this.f83053b).getDisableAuth();
        }

        public String getJwtAudience() {
            return ((BackendRule) this.f83053b).getJwtAudience();
        }

        public ByteString getJwtAudienceBytes() {
            return ((BackendRule) this.f83053b).getJwtAudienceBytes();
        }

        public double getMinDeadline() {
            return ((BackendRule) this.f83053b).getMinDeadline();
        }

        public double getOperationDeadline() {
            return ((BackendRule) this.f83053b).getOperationDeadline();
        }

        public PathTranslation getPathTranslation() {
            return ((BackendRule) this.f83053b).getPathTranslation();
        }

        public int getPathTranslationValue() {
            return ((BackendRule) this.f83053b).getPathTranslationValue();
        }

        public String getProtocol() {
            return ((BackendRule) this.f83053b).getProtocol();
        }

        public ByteString getProtocolBytes() {
            return ((BackendRule) this.f83053b).getProtocolBytes();
        }

        public String getSelector() {
            return ((BackendRule) this.f83053b).getSelector();
        }

        public ByteString getSelectorBytes() {
            return ((BackendRule) this.f83053b).getSelectorBytes();
        }

        /* renamed from: h0 */
        public C32259b mo93203h0(boolean z) {
            mo100457F();
            ((BackendRule) this.f83053b).setDisableAuth(z);
            return this;
        }

        /* renamed from: i0 */
        public C32259b mo93204i0(String str) {
            mo100457F();
            ((BackendRule) this.f83053b).setJwtAudience(str);
            return this;
        }

        /* renamed from: j0 */
        public C32259b mo93205j0(ByteString byteString) {
            mo100457F();
            ((BackendRule) this.f83053b).setJwtAudienceBytes(byteString);
            return this;
        }

        /* renamed from: k0 */
        public C32259b mo93206k0(double d) {
            mo100457F();
            ((BackendRule) this.f83053b).setMinDeadline(d);
            return this;
        }

        /* renamed from: l0 */
        public C32259b mo93207l0(double d) {
            mo100457F();
            ((BackendRule) this.f83053b).setOperationDeadline(d);
            return this;
        }

        /* renamed from: m0 */
        public C32259b mo93208m0(PathTranslation pathTranslation) {
            mo100457F();
            ((BackendRule) this.f83053b).setPathTranslation(pathTranslation);
            return this;
        }

        /* renamed from: o0 */
        public C32259b mo93209o0(int i) {
            mo100457F();
            ((BackendRule) this.f83053b).setPathTranslationValue(i);
            return this;
        }

        /* renamed from: q0 */
        public C32259b mo93210q0(String str) {
            mo100457F();
            ((BackendRule) this.f83053b).setProtocol(str);
            return this;
        }

        /* renamed from: r0 */
        public C32259b mo93211r0(ByteString byteString) {
            mo100457F();
            ((BackendRule) this.f83053b).setProtocolBytes(byteString);
            return this;
        }

        /* renamed from: s0 */
        public C32259b mo93212s0(String str) {
            mo100457F();
            ((BackendRule) this.f83053b).setSelector(str);
            return this;
        }

        /* renamed from: u0 */
        public C32259b mo93213u0(ByteString byteString) {
            mo100457F();
            ((BackendRule) this.f83053b).setSelectorBytes(byteString);
            return this;
        }

        public C32259b() {
            super(BackendRule.DEFAULT_INSTANCE);
        }
    }

    static {
        BackendRule backendRule = new BackendRule();
        DEFAULT_INSTANCE = backendRule;
        GeneratedMessageLite.registerDefaultInstance(BackendRule.class, backendRule);
    }

    private BackendRule() {
    }

    /* access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = getDefaultInstance().getAddress();
    }

    /* access modifiers changed from: private */
    public void clearAuthentication() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
    }

    /* access modifiers changed from: private */
    public void clearDeadline() {
        this.deadline_ = 0.0d;
    }

    /* access modifiers changed from: private */
    public void clearDisableAuth() {
        if (this.authenticationCase_ == 8) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearJwtAudience() {
        if (this.authenticationCase_ == 7) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearMinDeadline() {
        this.minDeadline_ = 0.0d;
    }

    /* access modifiers changed from: private */
    public void clearOperationDeadline() {
        this.operationDeadline_ = 0.0d;
    }

    /* access modifiers changed from: private */
    public void clearPathTranslation() {
        this.pathTranslation_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static BackendRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32259b newBuilder() {
        return (C32259b) DEFAULT_INSTANCE.createBuilder();
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<BackendRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setAddress(String str) {
        str.getClass();
        this.address_ = str;
    }

    /* access modifiers changed from: private */
    public void setAddressBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.address_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setDeadline(double d) {
        this.deadline_ = d;
    }

    /* access modifiers changed from: private */
    public void setDisableAuth(boolean z) {
        this.authenticationCase_ = 8;
        this.authentication_ = Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public void setJwtAudience(String str) {
        str.getClass();
        this.authenticationCase_ = 7;
        this.authentication_ = str;
    }

    /* access modifiers changed from: private */
    public void setJwtAudienceBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.authentication_ = byteString.mo99228S0();
        this.authenticationCase_ = 7;
    }

    /* access modifiers changed from: private */
    public void setMinDeadline(double d) {
        this.minDeadline_ = d;
    }

    /* access modifiers changed from: private */
    public void setOperationDeadline(double d) {
        this.operationDeadline_ = d;
    }

    /* access modifiers changed from: private */
    public void setPathTranslation(PathTranslation pathTranslation) {
        this.pathTranslation_ = pathTranslation.getNumber();
    }

    /* access modifiers changed from: private */
    public void setPathTranslationValue(int i) {
        this.pathTranslation_ = i;
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
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* access modifiers changed from: private */
    public void setSelectorBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.selector_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32258a.f78620a[methodToInvoke.ordinal()]) {
            case 1:
                return new BackendRule();
            case 2:
                return new C32259b((C32258a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<BackendRule> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (BackendRule.class) {
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

    public String getAddress() {
        return this.address_;
    }

    public ByteString getAddressBytes() {
        return ByteString.m137260e0(this.address_);
    }

    public AuthenticationCase getAuthenticationCase() {
        return AuthenticationCase.m130481b(this.authenticationCase_);
    }

    public double getDeadline() {
        return this.deadline_;
    }

    public boolean getDisableAuth() {
        if (this.authenticationCase_ == 8) {
            return ((Boolean) this.authentication_).booleanValue();
        }
        return false;
    }

    public String getJwtAudience() {
        if (this.authenticationCase_ == 7) {
            return (String) this.authentication_;
        }
        return "";
    }

    public ByteString getJwtAudienceBytes() {
        String str;
        if (this.authenticationCase_ == 7) {
            str = (String) this.authentication_;
        } else {
            str = "";
        }
        return ByteString.m137260e0(str);
    }

    public double getMinDeadline() {
        return this.minDeadline_;
    }

    public double getOperationDeadline() {
        return this.operationDeadline_;
    }

    public PathTranslation getPathTranslation() {
        PathTranslation b = PathTranslation.m130483b(this.pathTranslation_);
        if (b == null) {
            return PathTranslation.UNRECOGNIZED;
        }
        return b;
    }

    public int getPathTranslationValue() {
        return this.pathTranslation_;
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public ByteString getProtocolBytes() {
        return ByteString.m137260e0(this.protocol_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.m137260e0(this.selector_);
    }

    public static C32259b newBuilder(BackendRule backendRule) {
        return (C32259b) DEFAULT_INSTANCE.createBuilder(backendRule);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static BackendRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BackendRule parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static BackendRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BackendRule parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static BackendRule parseFrom(InputStream inputStream) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static BackendRule parseFrom(C34448s sVar) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static BackendRule parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (BackendRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
