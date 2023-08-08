package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34363f1;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34417m1;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AttributeContext extends GeneratedMessageLite<AttributeContext, C34562d> implements C34567a {
    public static final int API_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final AttributeContext DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile C34504y1<AttributeContext> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private Api api_;
    private Peer destination_;
    private Peer origin_;
    private Request request_;
    private Resource resource_;
    private C34556Response response_;
    private Peer source_;

    public static final class Api extends GeneratedMessageLite<Api, C34548a> implements C34560b {
        /* access modifiers changed from: private */
        public static final Api DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile C34504y1<Api> PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String operation_ = "";
        private String protocol_ = "";
        private String service_ = "";
        private String version_ = "";

        /* renamed from: com.google.rpc.context.AttributeContext$Api$a */
        public static final class C34548a extends GeneratedMessageLite.C34263b<Api, C34548a> implements C34560b {
            public /* synthetic */ C34548a(C34559a aVar) {
                this();
            }

            /* renamed from: P */
            public C34548a mo101994P() {
                mo100457F();
                ((Api) this.f83053b).clearOperation();
                return this;
            }

            /* renamed from: R */
            public C34548a mo101995R() {
                mo100457F();
                ((Api) this.f83053b).clearProtocol();
                return this;
            }

            /* renamed from: S */
            public C34548a mo101996S() {
                mo100457F();
                ((Api) this.f83053b).clearService();
                return this;
            }

            /* renamed from: T */
            public C34548a mo101997T() {
                mo100457F();
                ((Api) this.f83053b).clearVersion();
                return this;
            }

            /* renamed from: U */
            public C34548a mo101998U(String str) {
                mo100457F();
                ((Api) this.f83053b).setOperation(str);
                return this;
            }

            /* renamed from: V */
            public C34548a mo101999V(ByteString byteString) {
                mo100457F();
                ((Api) this.f83053b).setOperationBytes(byteString);
                return this;
            }

            /* renamed from: Y */
            public C34548a mo102000Y(String str) {
                mo100457F();
                ((Api) this.f83053b).setProtocol(str);
                return this;
            }

            /* renamed from: Z */
            public C34548a mo102001Z(ByteString byteString) {
                mo100457F();
                ((Api) this.f83053b).setProtocolBytes(byteString);
                return this;
            }

            /* renamed from: a0 */
            public C34548a mo102002a0(String str) {
                mo100457F();
                ((Api) this.f83053b).setService(str);
                return this;
            }

            /* renamed from: b0 */
            public C34548a mo102003b0(ByteString byteString) {
                mo100457F();
                ((Api) this.f83053b).setServiceBytes(byteString);
                return this;
            }

            /* renamed from: c0 */
            public C34548a mo102004c0(String str) {
                mo100457F();
                ((Api) this.f83053b).setVersion(str);
                return this;
            }

            /* renamed from: d0 */
            public C34548a mo102005d0(ByteString byteString) {
                mo100457F();
                ((Api) this.f83053b).setVersionBytes(byteString);
                return this;
            }

            public String getOperation() {
                return ((Api) this.f83053b).getOperation();
            }

            public ByteString getOperationBytes() {
                return ((Api) this.f83053b).getOperationBytes();
            }

            public String getProtocol() {
                return ((Api) this.f83053b).getProtocol();
            }

            public ByteString getProtocolBytes() {
                return ((Api) this.f83053b).getProtocolBytes();
            }

            public String getService() {
                return ((Api) this.f83053b).getService();
            }

            public ByteString getServiceBytes() {
                return ((Api) this.f83053b).getServiceBytes();
            }

            public String getVersion() {
                return ((Api) this.f83053b).getVersion();
            }

            public ByteString getVersionBytes() {
                return ((Api) this.f83053b).getVersionBytes();
            }

            public C34548a() {
                super(Api.DEFAULT_INSTANCE);
            }
        }

        static {
            Api api = new Api();
            DEFAULT_INSTANCE = api;
            GeneratedMessageLite.registerDefaultInstance(Api.class, api);
        }

        private Api() {
        }

        /* access modifiers changed from: private */
        public void clearOperation() {
            this.operation_ = getDefaultInstance().getOperation();
        }

        /* access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = getDefaultInstance().getProtocol();
        }

        /* access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        /* access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static Api getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34548a newBuilder() {
            return (C34548a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<Api> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setOperation(String str) {
            str.getClass();
            this.operation_ = str;
        }

        /* access modifiers changed from: private */
        public void setOperationBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.operation_ = byteString.mo99228S0();
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
        public void setService(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* access modifiers changed from: private */
        public void setServiceBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.service_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.mo99228S0();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34559a.f83635a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Api();
                case 2:
                    return new C34548a((C34559a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"service_", "operation_", "protocol_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<Api> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (Api.class) {
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

        public String getOperation() {
            return this.operation_;
        }

        public ByteString getOperationBytes() {
            return ByteString.m137260e0(this.operation_);
        }

        public String getProtocol() {
            return this.protocol_;
        }

        public ByteString getProtocolBytes() {
            return ByteString.m137260e0(this.protocol_);
        }

        public String getService() {
            return this.service_;
        }

        public ByteString getServiceBytes() {
            return ByteString.m137260e0(this.service_);
        }

        public String getVersion() {
            return this.version_;
        }

        public ByteString getVersionBytes() {
            return ByteString.m137260e0(this.version_);
        }

        public static C34548a newBuilder(Api api) {
            return (C34548a) DEFAULT_INSTANCE.createBuilder(api);
        }

        public static Api parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Api) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Api parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Api parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Api parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static Api parseFrom(InputStream inputStream) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Api parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Api parseFrom(C34448s sVar) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Api parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (Api) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class Auth extends GeneratedMessageLite<Auth, C34549a> implements C34561c {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final Auth DEFAULT_INSTANCE;
        private static volatile C34504y1<Auth> PARSER = null;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private C34471v0.C34488k<String> accessLevels_ = GeneratedMessageLite.emptyProtobufList();
        private C34471v0.C34488k<String> audiences_ = GeneratedMessageLite.emptyProtobufList();
        private Struct claims_;
        private String presenter_ = "";
        private String principal_ = "";

        /* renamed from: com.google.rpc.context.AttributeContext$Auth$a */
        public static final class C34549a extends GeneratedMessageLite.C34263b<Auth, C34549a> implements C34561c {
            public /* synthetic */ C34549a(C34559a aVar) {
                this();
            }

            /* renamed from: P */
            public C34549a mo102020P(String str) {
                mo100457F();
                ((Auth) this.f83053b).addAccessLevels(str);
                return this;
            }

            /* renamed from: R */
            public C34549a mo102021R(ByteString byteString) {
                mo100457F();
                ((Auth) this.f83053b).addAccessLevelsBytes(byteString);
                return this;
            }

            /* renamed from: S */
            public C34549a mo102022S(Iterable<String> iterable) {
                mo100457F();
                ((Auth) this.f83053b).addAllAccessLevels(iterable);
                return this;
            }

            /* renamed from: T */
            public C34549a mo102023T(Iterable<String> iterable) {
                mo100457F();
                ((Auth) this.f83053b).addAllAudiences(iterable);
                return this;
            }

            /* renamed from: U */
            public C34549a mo102024U(String str) {
                mo100457F();
                ((Auth) this.f83053b).addAudiences(str);
                return this;
            }

            /* renamed from: V */
            public C34549a mo102025V(ByteString byteString) {
                mo100457F();
                ((Auth) this.f83053b).addAudiencesBytes(byteString);
                return this;
            }

            /* renamed from: Y */
            public C34549a mo102026Y() {
                mo100457F();
                ((Auth) this.f83053b).clearAccessLevels();
                return this;
            }

            /* renamed from: Z */
            public C34549a mo102027Z() {
                mo100457F();
                ((Auth) this.f83053b).clearAudiences();
                return this;
            }

            /* renamed from: a0 */
            public C34549a mo102028a0() {
                mo100457F();
                ((Auth) this.f83053b).clearClaims();
                return this;
            }

            /* renamed from: b0 */
            public C34549a mo102029b0() {
                mo100457F();
                ((Auth) this.f83053b).clearPresenter();
                return this;
            }

            /* renamed from: c0 */
            public C34549a mo102030c0() {
                mo100457F();
                ((Auth) this.f83053b).clearPrincipal();
                return this;
            }

            /* renamed from: d0 */
            public C34549a mo102031d0(Struct struct) {
                mo100457F();
                ((Auth) this.f83053b).mergeClaims(struct);
                return this;
            }

            /* renamed from: g0 */
            public C34549a mo102032g0(int i, String str) {
                mo100457F();
                ((Auth) this.f83053b).setAccessLevels(i, str);
                return this;
            }

            public String getAccessLevels(int i) {
                return ((Auth) this.f83053b).getAccessLevels(i);
            }

            public ByteString getAccessLevelsBytes(int i) {
                return ((Auth) this.f83053b).getAccessLevelsBytes(i);
            }

            public int getAccessLevelsCount() {
                return ((Auth) this.f83053b).getAccessLevelsCount();
            }

            public List<String> getAccessLevelsList() {
                return Collections.unmodifiableList(((Auth) this.f83053b).getAccessLevelsList());
            }

            public String getAudiences(int i) {
                return ((Auth) this.f83053b).getAudiences(i);
            }

            public ByteString getAudiencesBytes(int i) {
                return ((Auth) this.f83053b).getAudiencesBytes(i);
            }

            public int getAudiencesCount() {
                return ((Auth) this.f83053b).getAudiencesCount();
            }

            public List<String> getAudiencesList() {
                return Collections.unmodifiableList(((Auth) this.f83053b).getAudiencesList());
            }

            public Struct getClaims() {
                return ((Auth) this.f83053b).getClaims();
            }

            public String getPresenter() {
                return ((Auth) this.f83053b).getPresenter();
            }

            public ByteString getPresenterBytes() {
                return ((Auth) this.f83053b).getPresenterBytes();
            }

            public String getPrincipal() {
                return ((Auth) this.f83053b).getPrincipal();
            }

            public ByteString getPrincipalBytes() {
                return ((Auth) this.f83053b).getPrincipalBytes();
            }

            /* renamed from: h0 */
            public C34549a mo102033h0(int i, String str) {
                mo100457F();
                ((Auth) this.f83053b).setAudiences(i, str);
                return this;
            }

            public boolean hasClaims() {
                return ((Auth) this.f83053b).hasClaims();
            }

            /* renamed from: i0 */
            public C34549a mo102034i0(Struct.C34293b bVar) {
                mo100457F();
                ((Auth) this.f83053b).setClaims((Struct) bVar.mo100473g());
                return this;
            }

            /* renamed from: j0 */
            public C34549a mo102035j0(Struct struct) {
                mo100457F();
                ((Auth) this.f83053b).setClaims(struct);
                return this;
            }

            /* renamed from: k0 */
            public C34549a mo102036k0(String str) {
                mo100457F();
                ((Auth) this.f83053b).setPresenter(str);
                return this;
            }

            /* renamed from: l0 */
            public C34549a mo102037l0(ByteString byteString) {
                mo100457F();
                ((Auth) this.f83053b).setPresenterBytes(byteString);
                return this;
            }

            /* renamed from: m0 */
            public C34549a mo102038m0(String str) {
                mo100457F();
                ((Auth) this.f83053b).setPrincipal(str);
                return this;
            }

            /* renamed from: o0 */
            public C34549a mo102039o0(ByteString byteString) {
                mo100457F();
                ((Auth) this.f83053b).setPrincipalBytes(byteString);
                return this;
            }

            public C34549a() {
                super(Auth.DEFAULT_INSTANCE);
            }
        }

        static {
            Auth auth = new Auth();
            DEFAULT_INSTANCE = auth;
            GeneratedMessageLite.registerDefaultInstance(Auth.class, auth);
        }

        private Auth() {
        }

        /* access modifiers changed from: private */
        public void addAccessLevels(String str) {
            str.getClass();
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(str);
        }

        /* access modifiers changed from: private */
        public void addAccessLevelsBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(byteString.mo99228S0());
        }

        /* access modifiers changed from: private */
        public void addAllAccessLevels(Iterable<String> iterable) {
            ensureAccessLevelsIsMutable();
            C34319a.addAll(iterable, this.accessLevels_);
        }

        /* access modifiers changed from: private */
        public void addAllAudiences(Iterable<String> iterable) {
            ensureAudiencesIsMutable();
            C34319a.addAll(iterable, this.audiences_);
        }

        /* access modifiers changed from: private */
        public void addAudiences(String str) {
            str.getClass();
            ensureAudiencesIsMutable();
            this.audiences_.add(str);
        }

        /* access modifiers changed from: private */
        public void addAudiencesBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            ensureAudiencesIsMutable();
            this.audiences_.add(byteString.mo99228S0());
        }

        /* access modifiers changed from: private */
        public void clearAccessLevels() {
            this.accessLevels_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearAudiences() {
            this.audiences_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearClaims() {
            this.claims_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPresenter() {
            this.presenter_ = getDefaultInstance().getPresenter();
        }

        /* access modifiers changed from: private */
        public void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        private void ensureAccessLevelsIsMutable() {
            C34471v0.C34488k<String> kVar = this.accessLevels_;
            if (!kVar.mo100971T()) {
                this.accessLevels_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        private void ensureAudiencesIsMutable() {
            C34471v0.C34488k<String> kVar = this.audiences_;
            if (!kVar.mo100971T()) {
                this.audiences_ = GeneratedMessageLite.mutableCopy(kVar);
            }
        }

        public static Auth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeClaims(Struct struct) {
            struct.getClass();
            Struct struct2 = this.claims_;
            if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
                this.claims_ = struct;
            } else {
                this.claims_ = (Struct) ((Struct.C34293b) Struct.newBuilder(this.claims_).mo100463K(struct)).mo100467Q();
            }
        }

        public static C34549a newBuilder() {
            return (C34549a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Auth parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<Auth> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccessLevels(int i, String str) {
            str.getClass();
            ensureAccessLevelsIsMutable();
            this.accessLevels_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setAudiences(int i, String str) {
            str.getClass();
            ensureAudiencesIsMutable();
            this.audiences_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setClaims(Struct struct) {
            struct.getClass();
            this.claims_ = struct;
        }

        /* access modifiers changed from: private */
        public void setPresenter(String str) {
            str.getClass();
            this.presenter_ = str;
        }

        /* access modifiers changed from: private */
        public void setPresenterBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.presenter_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setPrincipal(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* access modifiers changed from: private */
        public void setPrincipalBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.principal_ = byteString.mo99228S0();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34559a.f83635a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Auth();
                case 2:
                    return new C34549a((C34559a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\t\u0005Ț", new Object[]{"principal_", "audiences_", "presenter_", "claims_", "accessLevels_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<Auth> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (Auth.class) {
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

        public String getAccessLevels(int i) {
            return this.accessLevels_.get(i);
        }

        public ByteString getAccessLevelsBytes(int i) {
            return ByteString.m137260e0(this.accessLevels_.get(i));
        }

        public int getAccessLevelsCount() {
            return this.accessLevels_.size();
        }

        public List<String> getAccessLevelsList() {
            return this.accessLevels_;
        }

        public String getAudiences(int i) {
            return this.audiences_.get(i);
        }

        public ByteString getAudiencesBytes(int i) {
            return ByteString.m137260e0(this.audiences_.get(i));
        }

        public int getAudiencesCount() {
            return this.audiences_.size();
        }

        public List<String> getAudiencesList() {
            return this.audiences_;
        }

        public Struct getClaims() {
            Struct struct = this.claims_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public String getPresenter() {
            return this.presenter_;
        }

        public ByteString getPresenterBytes() {
            return ByteString.m137260e0(this.presenter_);
        }

        public String getPrincipal() {
            return this.principal_;
        }

        public ByteString getPrincipalBytes() {
            return ByteString.m137260e0(this.principal_);
        }

        public boolean hasClaims() {
            return this.claims_ != null;
        }

        public static C34549a newBuilder(Auth auth) {
            return (C34549a) DEFAULT_INSTANCE.createBuilder(auth);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Auth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Auth parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static Auth parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Auth parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static Auth parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Auth parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static Auth parseFrom(InputStream inputStream) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Auth parseFrom(C34448s sVar) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Auth parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (Auth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class Peer extends GeneratedMessageLite<Peer, C34550a> implements C34563e {
        /* access modifiers changed from: private */
        public static final Peer DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile C34504y1<Peer> PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private String ip_ = "";
        private MapFieldLite<String, String> labels_ = MapFieldLite.m138446i();
        private long port_;
        private String principal_ = "";
        private String regionCode_ = "";

        /* renamed from: com.google.rpc.context.AttributeContext$Peer$a */
        public static final class C34550a extends GeneratedMessageLite.C34263b<Peer, C34550a> implements C34563e {
            public /* synthetic */ C34550a(C34559a aVar) {
                this();
            }

            /* renamed from: P */
            public C34550a mo102053P() {
                mo100457F();
                ((Peer) this.f83053b).clearIp();
                return this;
            }

            /* renamed from: R */
            public C34550a mo102054R() {
                mo100457F();
                ((Peer) this.f83053b).getMutableLabelsMap().clear();
                return this;
            }

            /* renamed from: S */
            public C34550a mo102055S() {
                mo100457F();
                ((Peer) this.f83053b).clearPort();
                return this;
            }

            /* renamed from: T */
            public C34550a mo102056T() {
                mo100457F();
                ((Peer) this.f83053b).clearPrincipal();
                return this;
            }

            /* renamed from: U */
            public C34550a mo102057U() {
                mo100457F();
                ((Peer) this.f83053b).clearRegionCode();
                return this;
            }

            /* renamed from: V */
            public C34550a mo102058V(Map<String, String> map) {
                mo100457F();
                ((Peer) this.f83053b).getMutableLabelsMap().putAll(map);
                return this;
            }

            /* renamed from: Y */
            public C34550a mo102059Y(String str, String str2) {
                str.getClass();
                str2.getClass();
                mo100457F();
                ((Peer) this.f83053b).getMutableLabelsMap().put(str, str2);
                return this;
            }

            /* renamed from: Z */
            public C34550a mo102060Z(String str) {
                str.getClass();
                mo100457F();
                ((Peer) this.f83053b).getMutableLabelsMap().remove(str);
                return this;
            }

            /* renamed from: a0 */
            public C34550a mo102061a0(String str) {
                mo100457F();
                ((Peer) this.f83053b).setIp(str);
                return this;
            }

            /* renamed from: b0 */
            public C34550a mo102062b0(ByteString byteString) {
                mo100457F();
                ((Peer) this.f83053b).setIpBytes(byteString);
                return this;
            }

            /* renamed from: c0 */
            public C34550a mo102063c0(long j) {
                mo100457F();
                ((Peer) this.f83053b).setPort(j);
                return this;
            }

            public boolean containsLabels(String str) {
                str.getClass();
                return ((Peer) this.f83053b).getLabelsMap().containsKey(str);
            }

            /* renamed from: d0 */
            public C34550a mo102064d0(String str) {
                mo100457F();
                ((Peer) this.f83053b).setPrincipal(str);
                return this;
            }

            /* renamed from: g0 */
            public C34550a mo102065g0(ByteString byteString) {
                mo100457F();
                ((Peer) this.f83053b).setPrincipalBytes(byteString);
                return this;
            }

            public String getIp() {
                return ((Peer) this.f83053b).getIp();
            }

            public ByteString getIpBytes() {
                return ((Peer) this.f83053b).getIpBytes();
            }

            @Deprecated
            public Map<String, String> getLabels() {
                return getLabelsMap();
            }

            public int getLabelsCount() {
                return ((Peer) this.f83053b).getLabelsMap().size();
            }

            public Map<String, String> getLabelsMap() {
                return Collections.unmodifiableMap(((Peer) this.f83053b).getLabelsMap());
            }

            public String getLabelsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> labelsMap = ((Peer) this.f83053b).getLabelsMap();
                if (labelsMap.containsKey(str)) {
                    return labelsMap.get(str);
                }
                return str2;
            }

            public String getLabelsOrThrow(String str) {
                str.getClass();
                Map<String, String> labelsMap = ((Peer) this.f83053b).getLabelsMap();
                if (labelsMap.containsKey(str)) {
                    return labelsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public long getPort() {
                return ((Peer) this.f83053b).getPort();
            }

            public String getPrincipal() {
                return ((Peer) this.f83053b).getPrincipal();
            }

            public ByteString getPrincipalBytes() {
                return ((Peer) this.f83053b).getPrincipalBytes();
            }

            public String getRegionCode() {
                return ((Peer) this.f83053b).getRegionCode();
            }

            public ByteString getRegionCodeBytes() {
                return ((Peer) this.f83053b).getRegionCodeBytes();
            }

            /* renamed from: h0 */
            public C34550a mo102066h0(String str) {
                mo100457F();
                ((Peer) this.f83053b).setRegionCode(str);
                return this;
            }

            /* renamed from: i0 */
            public C34550a mo102067i0(ByteString byteString) {
                mo100457F();
                ((Peer) this.f83053b).setRegionCodeBytes(byteString);
                return this;
            }

            public C34550a() {
                super(Peer.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.rpc.context.AttributeContext$Peer$b */
        public static final class C34551b {

            /* renamed from: a */
            public static final C34363f1<String, String> f83631a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f83631a = C34363f1.m139185f(fieldType, "", fieldType, "");
            }
        }

        static {
            Peer peer = new Peer();
            DEFAULT_INSTANCE = peer;
            GeneratedMessageLite.registerDefaultInstance(Peer.class, peer);
        }

        private Peer() {
        }

        /* access modifiers changed from: private */
        public void clearIp() {
            this.ip_ = getDefaultInstance().getIp();
        }

        /* access modifiers changed from: private */
        public void clearPort() {
            this.port_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        /* access modifiers changed from: private */
        public void clearRegionCode() {
            this.regionCode_ = getDefaultInstance().getRegionCode();
        }

        public static Peer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        private MapFieldLite<String, String> internalGetLabels() {
            return this.labels_;
        }

        private MapFieldLite<String, String> internalGetMutableLabels() {
            if (!this.labels_.mo100543n()) {
                this.labels_ = this.labels_.mo100549t();
            }
            return this.labels_;
        }

        public static C34550a newBuilder() {
            return (C34550a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Peer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Peer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Peer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<Peer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIp(String str) {
            str.getClass();
            this.ip_ = str;
        }

        /* access modifiers changed from: private */
        public void setIpBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.ip_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setPort(long j) {
            this.port_ = j;
        }

        /* access modifiers changed from: private */
        public void setPrincipal(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* access modifiers changed from: private */
        public void setPrincipalBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.principal_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setRegionCode(String str) {
            str.getClass();
            this.regionCode_ = str;
        }

        /* access modifiers changed from: private */
        public void setRegionCodeBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.regionCode_ = byteString.mo99228S0();
        }

        public boolean containsLabels(String str) {
            str.getClass();
            return internalGetLabels().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34559a.f83635a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Peer();
                case 2:
                    return new C34550a((C34559a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u00062\u0007Ȉ\bȈ", new Object[]{"ip_", "port_", "labels_", C34551b.f83631a, "principal_", "regionCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<Peer> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (Peer.class) {
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

        public String getIp() {
            return this.ip_;
        }

        public ByteString getIpBytes() {
            return ByteString.m137260e0(this.ip_);
        }

        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        public int getLabelsCount() {
            return internalGetLabels().size();
        }

        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return internalGetLabels.get(str);
            }
            return str2;
        }

        public String getLabelsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return internalGetLabels.get(str);
            }
            throw new IllegalArgumentException();
        }

        public long getPort() {
            return this.port_;
        }

        public String getPrincipal() {
            return this.principal_;
        }

        public ByteString getPrincipalBytes() {
            return ByteString.m137260e0(this.principal_);
        }

        public String getRegionCode() {
            return this.regionCode_;
        }

        public ByteString getRegionCodeBytes() {
            return ByteString.m137260e0(this.regionCode_);
        }

        public static C34550a newBuilder(Peer peer) {
            return (C34550a) DEFAULT_INSTANCE.createBuilder(peer);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Peer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Peer parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static Peer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Peer parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static Peer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Peer parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static Peer parseFrom(InputStream inputStream) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Peer parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Peer parseFrom(C34448s sVar) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Peer parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (Peer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class Request extends GeneratedMessageLite<Request, C34552a> implements C34564f {
        public static final int AUTH_FIELD_NUMBER = 13;
        /* access modifiers changed from: private */
        public static final Request DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile C34504y1<Request> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private Auth auth_;
        private MapFieldLite<String, String> headers_ = MapFieldLite.m138446i();
        private String host_ = "";
        private String id_ = "";
        private String method_ = "";
        private String path_ = "";
        private String protocol_ = "";
        private String query_ = "";
        private String reason_ = "";
        private String scheme_ = "";
        private long size_;
        private Timestamp time_;

        /* renamed from: com.google.rpc.context.AttributeContext$Request$a */
        public static final class C34552a extends GeneratedMessageLite.C34263b<Request, C34552a> implements C34564f {
            public /* synthetic */ C34552a(C34559a aVar) {
                this();
            }

            /* renamed from: B0 */
            public C34552a mo102095B0(String str) {
                mo100457F();
                ((Request) this.f83053b).setQuery(str);
                return this;
            }

            /* renamed from: D0 */
            public C34552a mo102096D0(ByteString byteString) {
                mo100457F();
                ((Request) this.f83053b).setQueryBytes(byteString);
                return this;
            }

            /* renamed from: E0 */
            public C34552a mo102097E0(String str) {
                mo100457F();
                ((Request) this.f83053b).setReason(str);
                return this;
            }

            /* renamed from: F0 */
            public C34552a mo102098F0(ByteString byteString) {
                mo100457F();
                ((Request) this.f83053b).setReasonBytes(byteString);
                return this;
            }

            /* renamed from: G0 */
            public C34552a mo102099G0(String str) {
                mo100457F();
                ((Request) this.f83053b).setScheme(str);
                return this;
            }

            /* renamed from: H0 */
            public C34552a mo102100H0(ByteString byteString) {
                mo100457F();
                ((Request) this.f83053b).setSchemeBytes(byteString);
                return this;
            }

            /* renamed from: I0 */
            public C34552a mo102101I0(long j) {
                mo100457F();
                ((Request) this.f83053b).setSize(j);
                return this;
            }

            /* renamed from: J0 */
            public C34552a mo102102J0(Timestamp.C34298b bVar) {
                mo100457F();
                ((Request) this.f83053b).setTime((Timestamp) bVar.mo100473g());
                return this;
            }

            /* renamed from: L0 */
            public C34552a mo102103L0(Timestamp timestamp) {
                mo100457F();
                ((Request) this.f83053b).setTime(timestamp);
                return this;
            }

            /* renamed from: P */
            public C34552a mo102104P() {
                mo100457F();
                ((Request) this.f83053b).clearAuth();
                return this;
            }

            /* renamed from: R */
            public C34552a mo102105R() {
                mo100457F();
                ((Request) this.f83053b).getMutableHeadersMap().clear();
                return this;
            }

            /* renamed from: S */
            public C34552a mo102106S() {
                mo100457F();
                ((Request) this.f83053b).clearHost();
                return this;
            }

            /* renamed from: T */
            public C34552a mo102107T() {
                mo100457F();
                ((Request) this.f83053b).clearId();
                return this;
            }

            /* renamed from: U */
            public C34552a mo102108U() {
                mo100457F();
                ((Request) this.f83053b).clearMethod();
                return this;
            }

            /* renamed from: V */
            public C34552a mo102109V() {
                mo100457F();
                ((Request) this.f83053b).clearPath();
                return this;
            }

            /* renamed from: Y */
            public C34552a mo102110Y() {
                mo100457F();
                ((Request) this.f83053b).clearProtocol();
                return this;
            }

            /* renamed from: Z */
            public C34552a mo102111Z() {
                mo100457F();
                ((Request) this.f83053b).clearQuery();
                return this;
            }

            /* renamed from: a0 */
            public C34552a mo102112a0() {
                mo100457F();
                ((Request) this.f83053b).clearReason();
                return this;
            }

            /* renamed from: b0 */
            public C34552a mo102113b0() {
                mo100457F();
                ((Request) this.f83053b).clearScheme();
                return this;
            }

            /* renamed from: c0 */
            public C34552a mo102114c0() {
                mo100457F();
                ((Request) this.f83053b).clearSize();
                return this;
            }

            public boolean containsHeaders(String str) {
                str.getClass();
                return ((Request) this.f83053b).getHeadersMap().containsKey(str);
            }

            /* renamed from: d0 */
            public C34552a mo102115d0() {
                mo100457F();
                ((Request) this.f83053b).clearTime();
                return this;
            }

            /* renamed from: g0 */
            public C34552a mo102116g0(Auth auth) {
                mo100457F();
                ((Request) this.f83053b).mergeAuth(auth);
                return this;
            }

            public Auth getAuth() {
                return ((Request) this.f83053b).getAuth();
            }

            @Deprecated
            public Map<String, String> getHeaders() {
                return getHeadersMap();
            }

            public int getHeadersCount() {
                return ((Request) this.f83053b).getHeadersMap().size();
            }

            public Map<String, String> getHeadersMap() {
                return Collections.unmodifiableMap(((Request) this.f83053b).getHeadersMap());
            }

            public String getHeadersOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> headersMap = ((Request) this.f83053b).getHeadersMap();
                if (headersMap.containsKey(str)) {
                    return headersMap.get(str);
                }
                return str2;
            }

            public String getHeadersOrThrow(String str) {
                str.getClass();
                Map<String, String> headersMap = ((Request) this.f83053b).getHeadersMap();
                if (headersMap.containsKey(str)) {
                    return headersMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public String getHost() {
                return ((Request) this.f83053b).getHost();
            }

            public ByteString getHostBytes() {
                return ((Request) this.f83053b).getHostBytes();
            }

            public String getId() {
                return ((Request) this.f83053b).getId();
            }

            public ByteString getIdBytes() {
                return ((Request) this.f83053b).getIdBytes();
            }

            public String getMethod() {
                return ((Request) this.f83053b).getMethod();
            }

            public ByteString getMethodBytes() {
                return ((Request) this.f83053b).getMethodBytes();
            }

            public String getPath() {
                return ((Request) this.f83053b).getPath();
            }

            public ByteString getPathBytes() {
                return ((Request) this.f83053b).getPathBytes();
            }

            public String getProtocol() {
                return ((Request) this.f83053b).getProtocol();
            }

            public ByteString getProtocolBytes() {
                return ((Request) this.f83053b).getProtocolBytes();
            }

            public String getQuery() {
                return ((Request) this.f83053b).getQuery();
            }

            public ByteString getQueryBytes() {
                return ((Request) this.f83053b).getQueryBytes();
            }

            public String getReason() {
                return ((Request) this.f83053b).getReason();
            }

            public ByteString getReasonBytes() {
                return ((Request) this.f83053b).getReasonBytes();
            }

            public String getScheme() {
                return ((Request) this.f83053b).getScheme();
            }

            public ByteString getSchemeBytes() {
                return ((Request) this.f83053b).getSchemeBytes();
            }

            public long getSize() {
                return ((Request) this.f83053b).getSize();
            }

            public Timestamp getTime() {
                return ((Request) this.f83053b).getTime();
            }

            /* renamed from: h0 */
            public C34552a mo102117h0(Timestamp timestamp) {
                mo100457F();
                ((Request) this.f83053b).mergeTime(timestamp);
                return this;
            }

            public boolean hasAuth() {
                return ((Request) this.f83053b).hasAuth();
            }

            public boolean hasTime() {
                return ((Request) this.f83053b).hasTime();
            }

            /* renamed from: i0 */
            public C34552a mo102118i0(Map<String, String> map) {
                mo100457F();
                ((Request) this.f83053b).getMutableHeadersMap().putAll(map);
                return this;
            }

            /* renamed from: j0 */
            public C34552a mo102119j0(String str, String str2) {
                str.getClass();
                str2.getClass();
                mo100457F();
                ((Request) this.f83053b).getMutableHeadersMap().put(str, str2);
                return this;
            }

            /* renamed from: k0 */
            public C34552a mo102120k0(String str) {
                str.getClass();
                mo100457F();
                ((Request) this.f83053b).getMutableHeadersMap().remove(str);
                return this;
            }

            /* renamed from: l0 */
            public C34552a mo102121l0(Auth.C34549a aVar) {
                mo100457F();
                ((Request) this.f83053b).setAuth((Auth) aVar.mo100473g());
                return this;
            }

            /* renamed from: m0 */
            public C34552a mo102122m0(Auth auth) {
                mo100457F();
                ((Request) this.f83053b).setAuth(auth);
                return this;
            }

            /* renamed from: o0 */
            public C34552a mo102123o0(String str) {
                mo100457F();
                ((Request) this.f83053b).setHost(str);
                return this;
            }

            /* renamed from: q0 */
            public C34552a mo102124q0(ByteString byteString) {
                mo100457F();
                ((Request) this.f83053b).setHostBytes(byteString);
                return this;
            }

            /* renamed from: r0 */
            public C34552a mo102125r0(String str) {
                mo100457F();
                ((Request) this.f83053b).setId(str);
                return this;
            }

            /* renamed from: s0 */
            public C34552a mo102126s0(ByteString byteString) {
                mo100457F();
                ((Request) this.f83053b).setIdBytes(byteString);
                return this;
            }

            /* renamed from: u0 */
            public C34552a mo102127u0(String str) {
                mo100457F();
                ((Request) this.f83053b).setMethod(str);
                return this;
            }

            /* renamed from: v0 */
            public C34552a mo102128v0(ByteString byteString) {
                mo100457F();
                ((Request) this.f83053b).setMethodBytes(byteString);
                return this;
            }

            /* renamed from: w0 */
            public C34552a mo102129w0(String str) {
                mo100457F();
                ((Request) this.f83053b).setPath(str);
                return this;
            }

            /* renamed from: x0 */
            public C34552a mo102130x0(ByteString byteString) {
                mo100457F();
                ((Request) this.f83053b).setPathBytes(byteString);
                return this;
            }

            /* renamed from: y0 */
            public C34552a mo102131y0(String str) {
                mo100457F();
                ((Request) this.f83053b).setProtocol(str);
                return this;
            }

            /* renamed from: z0 */
            public C34552a mo102132z0(ByteString byteString) {
                mo100457F();
                ((Request) this.f83053b).setProtocolBytes(byteString);
                return this;
            }

            public C34552a() {
                super(Request.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.rpc.context.AttributeContext$Request$b */
        public static final class C34553b {

            /* renamed from: a */
            public static final C34363f1<String, String> f83632a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f83632a = C34363f1.m139185f(fieldType, "", fieldType, "");
            }
        }

        static {
            Request request = new Request();
            DEFAULT_INSTANCE = request;
            GeneratedMessageLite.registerDefaultInstance(Request.class, request);
        }

        private Request() {
        }

        /* access modifiers changed from: private */
        public void clearAuth() {
            this.auth_ = null;
        }

        /* access modifiers changed from: private */
        public void clearHost() {
            this.host_ = getDefaultInstance().getHost();
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = getDefaultInstance().getMethod();
        }

        /* access modifiers changed from: private */
        public void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        /* access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = getDefaultInstance().getProtocol();
        }

        /* access modifiers changed from: private */
        public void clearQuery() {
            this.query_ = getDefaultInstance().getQuery();
        }

        /* access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        /* access modifiers changed from: private */
        public void clearScheme() {
            this.scheme_ = getDefaultInstance().getScheme();
        }

        /* access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
        }

        public static Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        private MapFieldLite<String, String> internalGetHeaders() {
            return this.headers_;
        }

        private MapFieldLite<String, String> internalGetMutableHeaders() {
            if (!this.headers_.mo100543n()) {
                this.headers_ = this.headers_.mo100549t();
            }
            return this.headers_;
        }

        /* access modifiers changed from: private */
        public void mergeAuth(Auth auth) {
            auth.getClass();
            Auth auth2 = this.auth_;
            if (auth2 == null || auth2 == Auth.getDefaultInstance()) {
                this.auth_ = auth;
            } else {
                this.auth_ = (Auth) ((Auth.C34549a) Auth.newBuilder(this.auth_).mo100463K(auth)).mo100467Q();
            }
        }

        /* access modifiers changed from: private */
        public void mergeTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.time_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.time_ = timestamp;
            } else {
                this.time_ = (Timestamp) ((Timestamp.C34298b) Timestamp.newBuilder(this.time_).mo100463K(timestamp)).mo100467Q();
            }
        }

        public static C34552a newBuilder() {
            return (C34552a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Request) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<Request> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAuth(Auth auth) {
            auth.getClass();
            this.auth_ = auth;
        }

        /* access modifiers changed from: private */
        public void setHost(String str) {
            str.getClass();
            this.host_ = str;
        }

        /* access modifiers changed from: private */
        public void setHostBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.host_ = byteString.mo99228S0();
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
        public void setMethod(String str) {
            str.getClass();
            this.method_ = str;
        }

        /* access modifiers changed from: private */
        public void setMethodBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.method_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setPath(String str) {
            str.getClass();
            this.path_ = str;
        }

        /* access modifiers changed from: private */
        public void setPathBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.path_ = byteString.mo99228S0();
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
        public void setQuery(String str) {
            str.getClass();
            this.query_ = str;
        }

        /* access modifiers changed from: private */
        public void setQueryBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.query_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* access modifiers changed from: private */
        public void setReasonBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.reason_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setScheme(String str) {
            str.getClass();
            this.scheme_ = str;
        }

        /* access modifiers changed from: private */
        public void setSchemeBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.scheme_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setSize(long j) {
            this.size_ = j;
        }

        /* access modifiers changed from: private */
        public void setTime(Timestamp timestamp) {
            timestamp.getClass();
            this.time_ = timestamp;
        }

        public boolean containsHeaders(String str) {
            str.getClass();
            return internalGetHeaders().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34559a.f83635a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Request();
                case 2:
                    return new C34552a((C34559a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\r\f\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\t\t\n\u0002\u000bȈ\fȈ\r\t", new Object[]{"id_", "method_", "headers_", C34553b.f83632a, "path_", "host_", "scheme_", "query_", "time_", "size_", "protocol_", "reason_", "auth_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<Request> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (Request.class) {
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

        public Auth getAuth() {
            Auth auth = this.auth_;
            return auth == null ? Auth.getDefaultInstance() : auth;
        }

        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        public int getHeadersCount() {
            return internalGetHeaders().size();
        }

        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        public String getHeadersOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return internalGetHeaders.get(str);
            }
            return str2;
        }

        public String getHeadersOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return internalGetHeaders.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getHost() {
            return this.host_;
        }

        public ByteString getHostBytes() {
            return ByteString.m137260e0(this.host_);
        }

        public String getId() {
            return this.id_;
        }

        public ByteString getIdBytes() {
            return ByteString.m137260e0(this.id_);
        }

        public String getMethod() {
            return this.method_;
        }

        public ByteString getMethodBytes() {
            return ByteString.m137260e0(this.method_);
        }

        public String getPath() {
            return this.path_;
        }

        public ByteString getPathBytes() {
            return ByteString.m137260e0(this.path_);
        }

        public String getProtocol() {
            return this.protocol_;
        }

        public ByteString getProtocolBytes() {
            return ByteString.m137260e0(this.protocol_);
        }

        public String getQuery() {
            return this.query_;
        }

        public ByteString getQueryBytes() {
            return ByteString.m137260e0(this.query_);
        }

        public String getReason() {
            return this.reason_;
        }

        public ByteString getReasonBytes() {
            return ByteString.m137260e0(this.reason_);
        }

        public String getScheme() {
            return this.scheme_;
        }

        public ByteString getSchemeBytes() {
            return ByteString.m137260e0(this.scheme_);
        }

        public long getSize() {
            return this.size_;
        }

        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasAuth() {
            return this.auth_ != null;
        }

        public boolean hasTime() {
            return this.time_ != null;
        }

        public static C34552a newBuilder(Request request) {
            return (C34552a) DEFAULT_INSTANCE.createBuilder(request);
        }

        public static Request parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Request) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Request parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Request parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Request parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static Request parseFrom(InputStream inputStream) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Request parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Request parseFrom(C34448s sVar) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Request parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    public static final class Resource extends GeneratedMessageLite<Resource, C34554a> implements C34565g {
        /* access modifiers changed from: private */
        public static final Resource DEFAULT_INSTANCE;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile C34504y1<Resource> PARSER = null;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private MapFieldLite<String, String> labels_ = MapFieldLite.m138446i();
        private String name_ = "";
        private String service_ = "";
        private String type_ = "";

        /* renamed from: com.google.rpc.context.AttributeContext$Resource$a */
        public static final class C34554a extends GeneratedMessageLite.C34263b<Resource, C34554a> implements C34565g {
            public /* synthetic */ C34554a(C34559a aVar) {
                this();
            }

            /* renamed from: P */
            public C34554a mo102145P() {
                mo100457F();
                ((Resource) this.f83053b).getMutableLabelsMap().clear();
                return this;
            }

            /* renamed from: R */
            public C34554a mo102146R() {
                mo100457F();
                ((Resource) this.f83053b).clearName();
                return this;
            }

            /* renamed from: S */
            public C34554a mo102147S() {
                mo100457F();
                ((Resource) this.f83053b).clearService();
                return this;
            }

            /* renamed from: T */
            public C34554a mo102148T() {
                mo100457F();
                ((Resource) this.f83053b).clearType();
                return this;
            }

            /* renamed from: U */
            public C34554a mo102149U(Map<String, String> map) {
                mo100457F();
                ((Resource) this.f83053b).getMutableLabelsMap().putAll(map);
                return this;
            }

            /* renamed from: V */
            public C34554a mo102150V(String str, String str2) {
                str.getClass();
                str2.getClass();
                mo100457F();
                ((Resource) this.f83053b).getMutableLabelsMap().put(str, str2);
                return this;
            }

            /* renamed from: Y */
            public C34554a mo102151Y(String str) {
                str.getClass();
                mo100457F();
                ((Resource) this.f83053b).getMutableLabelsMap().remove(str);
                return this;
            }

            /* renamed from: Z */
            public C34554a mo102152Z(String str) {
                mo100457F();
                ((Resource) this.f83053b).setName(str);
                return this;
            }

            /* renamed from: a0 */
            public C34554a mo102153a0(ByteString byteString) {
                mo100457F();
                ((Resource) this.f83053b).setNameBytes(byteString);
                return this;
            }

            /* renamed from: b0 */
            public C34554a mo102154b0(String str) {
                mo100457F();
                ((Resource) this.f83053b).setService(str);
                return this;
            }

            /* renamed from: c0 */
            public C34554a mo102155c0(ByteString byteString) {
                mo100457F();
                ((Resource) this.f83053b).setServiceBytes(byteString);
                return this;
            }

            public boolean containsLabels(String str) {
                str.getClass();
                return ((Resource) this.f83053b).getLabelsMap().containsKey(str);
            }

            /* renamed from: d0 */
            public C34554a mo102156d0(String str) {
                mo100457F();
                ((Resource) this.f83053b).setType(str);
                return this;
            }

            /* renamed from: g0 */
            public C34554a mo102157g0(ByteString byteString) {
                mo100457F();
                ((Resource) this.f83053b).setTypeBytes(byteString);
                return this;
            }

            @Deprecated
            public Map<String, String> getLabels() {
                return getLabelsMap();
            }

            public int getLabelsCount() {
                return ((Resource) this.f83053b).getLabelsMap().size();
            }

            public Map<String, String> getLabelsMap() {
                return Collections.unmodifiableMap(((Resource) this.f83053b).getLabelsMap());
            }

            public String getLabelsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> labelsMap = ((Resource) this.f83053b).getLabelsMap();
                if (labelsMap.containsKey(str)) {
                    return labelsMap.get(str);
                }
                return str2;
            }

            public String getLabelsOrThrow(String str) {
                str.getClass();
                Map<String, String> labelsMap = ((Resource) this.f83053b).getLabelsMap();
                if (labelsMap.containsKey(str)) {
                    return labelsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public String getName() {
                return ((Resource) this.f83053b).getName();
            }

            public ByteString getNameBytes() {
                return ((Resource) this.f83053b).getNameBytes();
            }

            public String getService() {
                return ((Resource) this.f83053b).getService();
            }

            public ByteString getServiceBytes() {
                return ((Resource) this.f83053b).getServiceBytes();
            }

            public String getType() {
                return ((Resource) this.f83053b).getType();
            }

            public ByteString getTypeBytes() {
                return ((Resource) this.f83053b).getTypeBytes();
            }

            public C34554a() {
                super(Resource.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.rpc.context.AttributeContext$Resource$b */
        public static final class C34555b {

            /* renamed from: a */
            public static final C34363f1<String, String> f83633a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f83633a = C34363f1.m139185f(fieldType, "", fieldType, "");
            }
        }

        static {
            Resource resource = new Resource();
            DEFAULT_INSTANCE = resource;
            GeneratedMessageLite.registerDefaultInstance(Resource.class, resource);
        }

        private Resource() {
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static Resource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        private MapFieldLite<String, String> internalGetLabels() {
            return this.labels_;
        }

        private MapFieldLite<String, String> internalGetMutableLabels() {
            if (!this.labels_.mo100543n()) {
                this.labels_ = this.labels_.mo100549t();
            }
            return this.labels_;
        }

        public static C34554a newBuilder() {
            return (C34554a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<Resource> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setService(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* access modifiers changed from: private */
        public void setServiceBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.service_ = byteString.mo99228S0();
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

        public boolean containsLabels(String str) {
            str.getClass();
            return internalGetLabels().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34559a.f83635a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Resource();
                case 2:
                    return new C34554a((C34559a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"service_", "name_", "type_", "labels_", C34555b.f83633a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<Resource> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (Resource.class) {
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

        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        public int getLabelsCount() {
            return internalGetLabels().size();
        }

        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return internalGetLabels.get(str);
            }
            return str2;
        }

        public String getLabelsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return internalGetLabels.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.m137260e0(this.name_);
        }

        public String getService() {
            return this.service_;
        }

        public ByteString getServiceBytes() {
            return ByteString.m137260e0(this.service_);
        }

        public String getType() {
            return this.type_;
        }

        public ByteString getTypeBytes() {
            return ByteString.m137260e0(this.type_);
        }

        public static C34554a newBuilder(Resource resource) {
            return (C34554a) DEFAULT_INSTANCE.createBuilder(resource);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Resource parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Resource parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Resource parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static Resource parseFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Resource parseFrom(C34448s sVar) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Resource parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    /* renamed from: com.google.rpc.context.AttributeContext$Response */
    public static final class C34556Response extends GeneratedMessageLite<C34556Response, C34557a> implements C34566h {
        public static final int CODE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final C34556Response DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile C34504y1<C34556Response> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private long code_;
        private MapFieldLite<String, String> headers_ = MapFieldLite.m138446i();
        private long size_;
        private Timestamp time_;

        /* renamed from: com.google.rpc.context.AttributeContext$Response$a */
        public static final class C34557a extends GeneratedMessageLite.C34263b<C34556Response, C34557a> implements C34566h {
            public /* synthetic */ C34557a(C34559a aVar) {
                this();
            }

            /* renamed from: P */
            public C34557a mo102168P() {
                mo100457F();
                ((C34556Response) this.f83053b).clearCode();
                return this;
            }

            /* renamed from: R */
            public C34557a mo102169R() {
                mo100457F();
                ((C34556Response) this.f83053b).getMutableHeadersMap().clear();
                return this;
            }

            /* renamed from: S */
            public C34557a mo102170S() {
                mo100457F();
                ((C34556Response) this.f83053b).clearSize();
                return this;
            }

            /* renamed from: T */
            public C34557a mo102171T() {
                mo100457F();
                ((C34556Response) this.f83053b).clearTime();
                return this;
            }

            /* renamed from: U */
            public C34557a mo102172U(Timestamp timestamp) {
                mo100457F();
                ((C34556Response) this.f83053b).mergeTime(timestamp);
                return this;
            }

            /* renamed from: V */
            public C34557a mo102173V(Map<String, String> map) {
                mo100457F();
                ((C34556Response) this.f83053b).getMutableHeadersMap().putAll(map);
                return this;
            }

            /* renamed from: Y */
            public C34557a mo102174Y(String str, String str2) {
                str.getClass();
                str2.getClass();
                mo100457F();
                ((C34556Response) this.f83053b).getMutableHeadersMap().put(str, str2);
                return this;
            }

            /* renamed from: Z */
            public C34557a mo102175Z(String str) {
                str.getClass();
                mo100457F();
                ((C34556Response) this.f83053b).getMutableHeadersMap().remove(str);
                return this;
            }

            /* renamed from: a0 */
            public C34557a mo102176a0(long j) {
                mo100457F();
                ((C34556Response) this.f83053b).setCode(j);
                return this;
            }

            /* renamed from: b0 */
            public C34557a mo102177b0(long j) {
                mo100457F();
                ((C34556Response) this.f83053b).setSize(j);
                return this;
            }

            /* renamed from: c0 */
            public C34557a mo102178c0(Timestamp.C34298b bVar) {
                mo100457F();
                ((C34556Response) this.f83053b).setTime((Timestamp) bVar.mo100473g());
                return this;
            }

            public boolean containsHeaders(String str) {
                str.getClass();
                return ((C34556Response) this.f83053b).getHeadersMap().containsKey(str);
            }

            /* renamed from: d0 */
            public C34557a mo102179d0(Timestamp timestamp) {
                mo100457F();
                ((C34556Response) this.f83053b).setTime(timestamp);
                return this;
            }

            public long getCode() {
                return ((C34556Response) this.f83053b).getCode();
            }

            @Deprecated
            public Map<String, String> getHeaders() {
                return getHeadersMap();
            }

            public int getHeadersCount() {
                return ((C34556Response) this.f83053b).getHeadersMap().size();
            }

            public Map<String, String> getHeadersMap() {
                return Collections.unmodifiableMap(((C34556Response) this.f83053b).getHeadersMap());
            }

            public String getHeadersOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> headersMap = ((C34556Response) this.f83053b).getHeadersMap();
                if (headersMap.containsKey(str)) {
                    return headersMap.get(str);
                }
                return str2;
            }

            public String getHeadersOrThrow(String str) {
                str.getClass();
                Map<String, String> headersMap = ((C34556Response) this.f83053b).getHeadersMap();
                if (headersMap.containsKey(str)) {
                    return headersMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public long getSize() {
                return ((C34556Response) this.f83053b).getSize();
            }

            public Timestamp getTime() {
                return ((C34556Response) this.f83053b).getTime();
            }

            public boolean hasTime() {
                return ((C34556Response) this.f83053b).hasTime();
            }

            public C34557a() {
                super(C34556Response.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.google.rpc.context.AttributeContext$Response$b */
        public static final class C34558b {

            /* renamed from: a */
            public static final C34363f1<String, String> f83634a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                f83634a = C34363f1.m139185f(fieldType, "", fieldType, "");
            }
        }

        static {
            C34556Response response = new C34556Response();
            DEFAULT_INSTANCE = response;
            GeneratedMessageLite.registerDefaultInstance(C34556Response.class, response);
        }

        private C34556Response() {
        }

        /* access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
        }

        public static C34556Response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        private MapFieldLite<String, String> internalGetHeaders() {
            return this.headers_;
        }

        private MapFieldLite<String, String> internalGetMutableHeaders() {
            if (!this.headers_.mo100543n()) {
                this.headers_ = this.headers_.mo100549t();
            }
            return this.headers_;
        }

        /* access modifiers changed from: private */
        public void mergeTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.time_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.time_ = timestamp;
            } else {
                this.time_ = (Timestamp) ((Timestamp.C34298b) Timestamp.newBuilder(this.time_).mo100463K(timestamp)).mo100467Q();
            }
        }

        public static C34557a newBuilder() {
            return (C34557a) DEFAULT_INSTANCE.createBuilder();
        }

        public static C34556Response parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C34556Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static C34556Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<C34556Response> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCode(long j) {
            this.code_ = j;
        }

        /* access modifiers changed from: private */
        public void setSize(long j) {
            this.size_ = j;
        }

        /* access modifiers changed from: private */
        public void setTime(Timestamp timestamp) {
            timestamp.getClass();
            this.time_ = timestamp;
        }

        public boolean containsHeaders(String str) {
            str.getClass();
            return internalGetHeaders().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34559a.f83635a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C34556Response();
                case 2:
                    return new C34557a((C34559a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004\t", new Object[]{"code_", "size_", "headers_", C34558b.f83634a, "time_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<C34556Response> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (C34556Response.class) {
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

        public long getCode() {
            return this.code_;
        }

        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        public int getHeadersCount() {
            return internalGetHeaders().size();
        }

        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        public String getHeadersOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return internalGetHeaders.get(str);
            }
            return str2;
        }

        public String getHeadersOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return internalGetHeaders.get(str);
            }
            throw new IllegalArgumentException();
        }

        public long getSize() {
            return this.size_;
        }

        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasTime() {
            return this.time_ != null;
        }

        public static C34557a newBuilder(C34556Response response) {
            return (C34557a) DEFAULT_INSTANCE.createBuilder(response);
        }

        public static C34556Response parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (C34556Response) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static C34556Response parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static C34556Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static C34556Response parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static C34556Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static C34556Response parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static C34556Response parseFrom(InputStream inputStream) throws IOException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static C34556Response parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static C34556Response parseFrom(C34448s sVar) throws IOException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static C34556Response parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (C34556Response) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    /* renamed from: com.google.rpc.context.AttributeContext$a */
    public static /* synthetic */ class C34559a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83635a;

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
                f83635a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83635a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83635a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83635a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83635a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83635a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83635a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.context.AttributeContext.C34559a.<clinit>():void");
        }
    }

    /* renamed from: com.google.rpc.context.AttributeContext$b */
    public interface C34560b extends C34417m1 {
        String getOperation();

        ByteString getOperationBytes();

        String getProtocol();

        ByteString getProtocolBytes();

        String getService();

        ByteString getServiceBytes();

        String getVersion();

        ByteString getVersionBytes();
    }

    /* renamed from: com.google.rpc.context.AttributeContext$c */
    public interface C34561c extends C34417m1 {
        String getAccessLevels(int i);

        ByteString getAccessLevelsBytes(int i);

        int getAccessLevelsCount();

        List<String> getAccessLevelsList();

        String getAudiences(int i);

        ByteString getAudiencesBytes(int i);

        int getAudiencesCount();

        List<String> getAudiencesList();

        Struct getClaims();

        String getPresenter();

        ByteString getPresenterBytes();

        String getPrincipal();

        ByteString getPrincipalBytes();

        boolean hasClaims();
    }

    /* renamed from: com.google.rpc.context.AttributeContext$d */
    public static final class C34562d extends GeneratedMessageLite.C34263b<AttributeContext, C34562d> implements C34567a {
        public /* synthetic */ C34562d(C34559a aVar) {
            this();
        }

        /* renamed from: P */
        public C34562d mo102180P() {
            mo100457F();
            ((AttributeContext) this.f83053b).clearApi();
            return this;
        }

        /* renamed from: R */
        public C34562d mo102181R() {
            mo100457F();
            ((AttributeContext) this.f83053b).clearDestination();
            return this;
        }

        /* renamed from: S */
        public C34562d mo102182S() {
            mo100457F();
            ((AttributeContext) this.f83053b).clearOrigin();
            return this;
        }

        /* renamed from: T */
        public C34562d mo102183T() {
            mo100457F();
            ((AttributeContext) this.f83053b).clearRequest();
            return this;
        }

        /* renamed from: U */
        public C34562d mo102184U() {
            mo100457F();
            ((AttributeContext) this.f83053b).clearResource();
            return this;
        }

        /* renamed from: V */
        public C34562d mo102185V() {
            mo100457F();
            ((AttributeContext) this.f83053b).clearResponse();
            return this;
        }

        /* renamed from: Y */
        public C34562d mo102186Y() {
            mo100457F();
            ((AttributeContext) this.f83053b).clearSource();
            return this;
        }

        /* renamed from: Z */
        public C34562d mo102187Z(Api api) {
            mo100457F();
            ((AttributeContext) this.f83053b).mergeApi(api);
            return this;
        }

        /* renamed from: a0 */
        public C34562d mo102188a0(Peer peer) {
            mo100457F();
            ((AttributeContext) this.f83053b).mergeDestination(peer);
            return this;
        }

        /* renamed from: b0 */
        public C34562d mo102189b0(Peer peer) {
            mo100457F();
            ((AttributeContext) this.f83053b).mergeOrigin(peer);
            return this;
        }

        /* renamed from: c0 */
        public C34562d mo102190c0(Request request) {
            mo100457F();
            ((AttributeContext) this.f83053b).mergeRequest(request);
            return this;
        }

        /* renamed from: d0 */
        public C34562d mo102191d0(Resource resource) {
            mo100457F();
            ((AttributeContext) this.f83053b).mergeResource(resource);
            return this;
        }

        /* renamed from: g0 */
        public C34562d mo102192g0(C34556Response response) {
            mo100457F();
            ((AttributeContext) this.f83053b).mergeResponse(response);
            return this;
        }

        public Api getApi() {
            return ((AttributeContext) this.f83053b).getApi();
        }

        public Peer getDestination() {
            return ((AttributeContext) this.f83053b).getDestination();
        }

        public Peer getOrigin() {
            return ((AttributeContext) this.f83053b).getOrigin();
        }

        public Request getRequest() {
            return ((AttributeContext) this.f83053b).getRequest();
        }

        public Resource getResource() {
            return ((AttributeContext) this.f83053b).getResource();
        }

        public C34556Response getResponse() {
            return ((AttributeContext) this.f83053b).getResponse();
        }

        public Peer getSource() {
            return ((AttributeContext) this.f83053b).getSource();
        }

        /* renamed from: h0 */
        public C34562d mo102193h0(Peer peer) {
            mo100457F();
            ((AttributeContext) this.f83053b).mergeSource(peer);
            return this;
        }

        public boolean hasApi() {
            return ((AttributeContext) this.f83053b).hasApi();
        }

        public boolean hasDestination() {
            return ((AttributeContext) this.f83053b).hasDestination();
        }

        public boolean hasOrigin() {
            return ((AttributeContext) this.f83053b).hasOrigin();
        }

        public boolean hasRequest() {
            return ((AttributeContext) this.f83053b).hasRequest();
        }

        public boolean hasResource() {
            return ((AttributeContext) this.f83053b).hasResource();
        }

        public boolean hasResponse() {
            return ((AttributeContext) this.f83053b).hasResponse();
        }

        public boolean hasSource() {
            return ((AttributeContext) this.f83053b).hasSource();
        }

        /* renamed from: i0 */
        public C34562d mo102194i0(Api.C34548a aVar) {
            mo100457F();
            ((AttributeContext) this.f83053b).setApi((Api) aVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C34562d mo102195j0(Api api) {
            mo100457F();
            ((AttributeContext) this.f83053b).setApi(api);
            return this;
        }

        /* renamed from: k0 */
        public C34562d mo102196k0(Peer.C34550a aVar) {
            mo100457F();
            ((AttributeContext) this.f83053b).setDestination((Peer) aVar.mo100473g());
            return this;
        }

        /* renamed from: l0 */
        public C34562d mo102197l0(Peer peer) {
            mo100457F();
            ((AttributeContext) this.f83053b).setDestination(peer);
            return this;
        }

        /* renamed from: m0 */
        public C34562d mo102198m0(Peer.C34550a aVar) {
            mo100457F();
            ((AttributeContext) this.f83053b).setOrigin((Peer) aVar.mo100473g());
            return this;
        }

        /* renamed from: o0 */
        public C34562d mo102199o0(Peer peer) {
            mo100457F();
            ((AttributeContext) this.f83053b).setOrigin(peer);
            return this;
        }

        /* renamed from: q0 */
        public C34562d mo102200q0(Request.C34552a aVar) {
            mo100457F();
            ((AttributeContext) this.f83053b).setRequest((Request) aVar.mo100473g());
            return this;
        }

        /* renamed from: r0 */
        public C34562d mo102201r0(Request request) {
            mo100457F();
            ((AttributeContext) this.f83053b).setRequest(request);
            return this;
        }

        /* renamed from: s0 */
        public C34562d mo102202s0(Resource.C34554a aVar) {
            mo100457F();
            ((AttributeContext) this.f83053b).setResource((Resource) aVar.mo100473g());
            return this;
        }

        /* renamed from: u0 */
        public C34562d mo102203u0(Resource resource) {
            mo100457F();
            ((AttributeContext) this.f83053b).setResource(resource);
            return this;
        }

        /* renamed from: v0 */
        public C34562d mo102204v0(C34556Response.C34557a aVar) {
            mo100457F();
            ((AttributeContext) this.f83053b).setResponse((C34556Response) aVar.mo100473g());
            return this;
        }

        /* renamed from: w0 */
        public C34562d mo102205w0(C34556Response response) {
            mo100457F();
            ((AttributeContext) this.f83053b).setResponse(response);
            return this;
        }

        /* renamed from: x0 */
        public C34562d mo102206x0(Peer.C34550a aVar) {
            mo100457F();
            ((AttributeContext) this.f83053b).setSource((Peer) aVar.mo100473g());
            return this;
        }

        /* renamed from: y0 */
        public C34562d mo102207y0(Peer peer) {
            mo100457F();
            ((AttributeContext) this.f83053b).setSource(peer);
            return this;
        }

        public C34562d() {
            super(AttributeContext.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.rpc.context.AttributeContext$e */
    public interface C34563e extends C34417m1 {
        boolean containsLabels(String str);

        String getIp();

        ByteString getIpBytes();

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        long getPort();

        String getPrincipal();

        ByteString getPrincipalBytes();

        String getRegionCode();

        ByteString getRegionCodeBytes();
    }

    /* renamed from: com.google.rpc.context.AttributeContext$f */
    public interface C34564f extends C34417m1 {
        boolean containsHeaders(String str);

        Auth getAuth();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        String getHost();

        ByteString getHostBytes();

        String getId();

        ByteString getIdBytes();

        String getMethod();

        ByteString getMethodBytes();

        String getPath();

        ByteString getPathBytes();

        String getProtocol();

        ByteString getProtocolBytes();

        String getQuery();

        ByteString getQueryBytes();

        String getReason();

        ByteString getReasonBytes();

        String getScheme();

        ByteString getSchemeBytes();

        long getSize();

        Timestamp getTime();

        boolean hasAuth();

        boolean hasTime();
    }

    /* renamed from: com.google.rpc.context.AttributeContext$g */
    public interface C34565g extends C34417m1 {
        boolean containsLabels(String str);

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        String getName();

        ByteString getNameBytes();

        String getService();

        ByteString getServiceBytes();

        String getType();

        ByteString getTypeBytes();
    }

    /* renamed from: com.google.rpc.context.AttributeContext$h */
    public interface C34566h extends C34417m1 {
        boolean containsHeaders(String str);

        long getCode();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        long getSize();

        Timestamp getTime();

        boolean hasTime();
    }

    static {
        AttributeContext attributeContext = new AttributeContext();
        DEFAULT_INSTANCE = attributeContext;
        GeneratedMessageLite.registerDefaultInstance(AttributeContext.class, attributeContext);
    }

    private AttributeContext() {
    }

    /* access modifiers changed from: private */
    public void clearApi() {
        this.api_ = null;
    }

    /* access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
    }

    /* access modifiers changed from: private */
    public void clearOrigin() {
        this.origin_ = null;
    }

    /* access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
    }

    /* access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
    }

    /* access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
    }

    /* access modifiers changed from: private */
    public void clearSource() {
        this.source_ = null;
    }

    public static AttributeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeApi(Api api) {
        api.getClass();
        Api api2 = this.api_;
        if (api2 == null || api2 == Api.getDefaultInstance()) {
            this.api_ = api;
        } else {
            this.api_ = (Api) ((Api.C34548a) Api.newBuilder(this.api_).mo100463K(api)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeDestination(Peer peer) {
        peer.getClass();
        Peer peer2 = this.destination_;
        if (peer2 == null || peer2 == Peer.getDefaultInstance()) {
            this.destination_ = peer;
        } else {
            this.destination_ = (Peer) ((Peer.C34550a) Peer.newBuilder(this.destination_).mo100463K(peer)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeOrigin(Peer peer) {
        peer.getClass();
        Peer peer2 = this.origin_;
        if (peer2 == null || peer2 == Peer.getDefaultInstance()) {
            this.origin_ = peer;
        } else {
            this.origin_ = (Peer) ((Peer.C34550a) Peer.newBuilder(this.origin_).mo100463K(peer)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeRequest(Request request) {
        request.getClass();
        Request request2 = this.request_;
        if (request2 == null || request2 == Request.getDefaultInstance()) {
            this.request_ = request;
        } else {
            this.request_ = (Request) ((Request.C34552a) Request.newBuilder(this.request_).mo100463K(request)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeResource(Resource resource) {
        resource.getClass();
        Resource resource2 = this.resource_;
        if (resource2 == null || resource2 == Resource.getDefaultInstance()) {
            this.resource_ = resource;
        } else {
            this.resource_ = (Resource) ((Resource.C34554a) Resource.newBuilder(this.resource_).mo100463K(resource)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeResponse(C34556Response response) {
        response.getClass();
        C34556Response response2 = this.response_;
        if (response2 == null || response2 == C34556Response.getDefaultInstance()) {
            this.response_ = response;
        } else {
            this.response_ = (C34556Response) ((C34556Response.C34557a) C34556Response.newBuilder(this.response_).mo100463K(response)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeSource(Peer peer) {
        peer.getClass();
        Peer peer2 = this.source_;
        if (peer2 == null || peer2 == Peer.getDefaultInstance()) {
            this.source_ = peer;
        } else {
            this.source_ = (Peer) ((Peer.C34550a) Peer.newBuilder(this.source_).mo100463K(peer)).mo100467Q();
        }
    }

    public static C34562d newBuilder() {
        return (C34562d) DEFAULT_INSTANCE.createBuilder();
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<AttributeContext> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setApi(Api api) {
        api.getClass();
        this.api_ = api;
    }

    /* access modifiers changed from: private */
    public void setDestination(Peer peer) {
        peer.getClass();
        this.destination_ = peer;
    }

    /* access modifiers changed from: private */
    public void setOrigin(Peer peer) {
        peer.getClass();
        this.origin_ = peer;
    }

    /* access modifiers changed from: private */
    public void setRequest(Request request) {
        request.getClass();
        this.request_ = request;
    }

    /* access modifiers changed from: private */
    public void setResource(Resource resource) {
        resource.getClass();
        this.resource_ = resource;
    }

    /* access modifiers changed from: private */
    public void setResponse(C34556Response response) {
        response.getClass();
        this.response_ = response;
    }

    /* access modifiers changed from: private */
    public void setSource(Peer peer) {
        peer.getClass();
        this.source_ = peer;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34559a.f83635a[methodToInvoke.ordinal()]) {
            case 1:
                return new AttributeContext();
            case 2:
                return new C34562d((C34559a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"source_", "destination_", "request_", "response_", "resource_", "api_", "origin_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<AttributeContext> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (AttributeContext.class) {
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

    public Api getApi() {
        Api api = this.api_;
        return api == null ? Api.getDefaultInstance() : api;
    }

    public Peer getDestination() {
        Peer peer = this.destination_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    public Peer getOrigin() {
        Peer peer = this.origin_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    public Request getRequest() {
        Request request = this.request_;
        return request == null ? Request.getDefaultInstance() : request;
    }

    public Resource getResource() {
        Resource resource = this.resource_;
        return resource == null ? Resource.getDefaultInstance() : resource;
    }

    public C34556Response getResponse() {
        C34556Response response = this.response_;
        return response == null ? C34556Response.getDefaultInstance() : response;
    }

    public Peer getSource() {
        Peer peer = this.source_;
        return peer == null ? Peer.getDefaultInstance() : peer;
    }

    public boolean hasApi() {
        return this.api_ != null;
    }

    public boolean hasDestination() {
        return this.destination_ != null;
    }

    public boolean hasOrigin() {
        return this.origin_ != null;
    }

    public boolean hasRequest() {
        return this.request_ != null;
    }

    public boolean hasResource() {
        return this.resource_ != null;
    }

    public boolean hasResponse() {
        return this.response_ != null;
    }

    public boolean hasSource() {
        return this.source_ != null;
    }

    public static C34562d newBuilder(AttributeContext attributeContext) {
        return (C34562d) DEFAULT_INSTANCE.createBuilder(attributeContext);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static AttributeContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AttributeContext parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static AttributeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AttributeContext parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static AttributeContext parseFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static AttributeContext parseFrom(C34448s sVar) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static AttributeContext parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (AttributeContext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
