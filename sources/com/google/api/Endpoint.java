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
import java.util.Collections;
import java.util.List;

public final class Endpoint extends GeneratedMessageLite<Endpoint, C32295b> implements C32383b0 {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final Endpoint DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C34504y1<Endpoint> PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 101;
    private C34471v0.C34488k<String> aliases_ = GeneratedMessageLite.emptyProtobufList();
    private boolean allowCors_;
    private C34471v0.C34488k<String> features_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";
    private String target_ = "";

    /* renamed from: com.google.api.Endpoint$a */
    public static /* synthetic */ class C32294a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78647a;

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
                f78647a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78647a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78647a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78647a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78647a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78647a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78647a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Endpoint.C32294a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Endpoint$b */
    public static final class C32295b extends GeneratedMessageLite.C34263b<Endpoint, C32295b> implements C32383b0 {
        public /* synthetic */ C32295b(C32294a aVar) {
            this();
        }

        @Deprecated
        /* renamed from: P */
        public C32295b mo93535P(String str) {
            mo100457F();
            ((Endpoint) this.f83053b).addAliases(str);
            return this;
        }

        @Deprecated
        /* renamed from: R */
        public C32295b mo93536R(ByteString byteString) {
            mo100457F();
            ((Endpoint) this.f83053b).addAliasesBytes(byteString);
            return this;
        }

        @Deprecated
        /* renamed from: S */
        public C32295b mo93537S(Iterable<String> iterable) {
            mo100457F();
            ((Endpoint) this.f83053b).addAllAliases(iterable);
            return this;
        }

        /* renamed from: T */
        public C32295b mo93538T(Iterable<String> iterable) {
            mo100457F();
            ((Endpoint) this.f83053b).addAllFeatures(iterable);
            return this;
        }

        /* renamed from: U */
        public C32295b mo93539U(String str) {
            mo100457F();
            ((Endpoint) this.f83053b).addFeatures(str);
            return this;
        }

        /* renamed from: V */
        public C32295b mo93540V(ByteString byteString) {
            mo100457F();
            ((Endpoint) this.f83053b).addFeaturesBytes(byteString);
            return this;
        }

        @Deprecated
        /* renamed from: Y */
        public C32295b mo93541Y() {
            mo100457F();
            ((Endpoint) this.f83053b).clearAliases();
            return this;
        }

        /* renamed from: Z */
        public C32295b mo93542Z() {
            mo100457F();
            ((Endpoint) this.f83053b).clearAllowCors();
            return this;
        }

        /* renamed from: a0 */
        public C32295b mo93543a0() {
            mo100457F();
            ((Endpoint) this.f83053b).clearFeatures();
            return this;
        }

        /* renamed from: b0 */
        public C32295b mo93544b0() {
            mo100457F();
            ((Endpoint) this.f83053b).clearName();
            return this;
        }

        /* renamed from: c0 */
        public C32295b mo93545c0() {
            mo100457F();
            ((Endpoint) this.f83053b).clearTarget();
            return this;
        }

        @Deprecated
        /* renamed from: d0 */
        public C32295b mo93546d0(int i, String str) {
            mo100457F();
            ((Endpoint) this.f83053b).setAliases(i, str);
            return this;
        }

        /* renamed from: g0 */
        public C32295b mo93547g0(boolean z) {
            mo100457F();
            ((Endpoint) this.f83053b).setAllowCors(z);
            return this;
        }

        @Deprecated
        public String getAliases(int i) {
            return ((Endpoint) this.f83053b).getAliases(i);
        }

        @Deprecated
        public ByteString getAliasesBytes(int i) {
            return ((Endpoint) this.f83053b).getAliasesBytes(i);
        }

        @Deprecated
        public int getAliasesCount() {
            return ((Endpoint) this.f83053b).getAliasesCount();
        }

        @Deprecated
        public List<String> getAliasesList() {
            return Collections.unmodifiableList(((Endpoint) this.f83053b).getAliasesList());
        }

        public boolean getAllowCors() {
            return ((Endpoint) this.f83053b).getAllowCors();
        }

        public String getFeatures(int i) {
            return ((Endpoint) this.f83053b).getFeatures(i);
        }

        public ByteString getFeaturesBytes(int i) {
            return ((Endpoint) this.f83053b).getFeaturesBytes(i);
        }

        public int getFeaturesCount() {
            return ((Endpoint) this.f83053b).getFeaturesCount();
        }

        public List<String> getFeaturesList() {
            return Collections.unmodifiableList(((Endpoint) this.f83053b).getFeaturesList());
        }

        public String getName() {
            return ((Endpoint) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Endpoint) this.f83053b).getNameBytes();
        }

        public String getTarget() {
            return ((Endpoint) this.f83053b).getTarget();
        }

        public ByteString getTargetBytes() {
            return ((Endpoint) this.f83053b).getTargetBytes();
        }

        /* renamed from: h0 */
        public C32295b mo93548h0(int i, String str) {
            mo100457F();
            ((Endpoint) this.f83053b).setFeatures(i, str);
            return this;
        }

        /* renamed from: i0 */
        public C32295b mo93549i0(String str) {
            mo100457F();
            ((Endpoint) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: j0 */
        public C32295b mo93550j0(ByteString byteString) {
            mo100457F();
            ((Endpoint) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: k0 */
        public C32295b mo93551k0(String str) {
            mo100457F();
            ((Endpoint) this.f83053b).setTarget(str);
            return this;
        }

        /* renamed from: l0 */
        public C32295b mo93552l0(ByteString byteString) {
            mo100457F();
            ((Endpoint) this.f83053b).setTargetBytes(byteString);
            return this;
        }

        public C32295b() {
            super(Endpoint.DEFAULT_INSTANCE);
        }
    }

    static {
        Endpoint endpoint = new Endpoint();
        DEFAULT_INSTANCE = endpoint;
        GeneratedMessageLite.registerDefaultInstance(Endpoint.class, endpoint);
    }

    private Endpoint() {
    }

    /* access modifiers changed from: private */
    public void addAliases(String str) {
        str.getClass();
        ensureAliasesIsMutable();
        this.aliases_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAliasesBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureAliasesIsMutable();
        this.aliases_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void addAllAliases(Iterable<String> iterable) {
        ensureAliasesIsMutable();
        C34319a.addAll(iterable, this.aliases_);
    }

    /* access modifiers changed from: private */
    public void addAllFeatures(Iterable<String> iterable) {
        ensureFeaturesIsMutable();
        C34319a.addAll(iterable, this.features_);
    }

    /* access modifiers changed from: private */
    public void addFeatures(String str) {
        str.getClass();
        ensureFeaturesIsMutable();
        this.features_.add(str);
    }

    /* access modifiers changed from: private */
    public void addFeaturesBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureFeaturesIsMutable();
        this.features_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void clearAliases() {
        this.aliases_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearAllowCors() {
        this.allowCors_ = false;
    }

    /* access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = getDefaultInstance().getTarget();
    }

    private void ensureAliasesIsMutable() {
        C34471v0.C34488k<String> kVar = this.aliases_;
        if (!kVar.mo100971T()) {
            this.aliases_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureFeaturesIsMutable() {
        C34471v0.C34488k<String> kVar = this.features_;
        if (!kVar.mo100971T()) {
            this.features_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Endpoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32295b newBuilder() {
        return (C32295b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Endpoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setAliases(int i, String str) {
        str.getClass();
        ensureAliasesIsMutable();
        this.aliases_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void setAllowCors(boolean z) {
        this.allowCors_ = z;
    }

    /* access modifiers changed from: private */
    public void setFeatures(int i, String str) {
        str.getClass();
        ensureFeaturesIsMutable();
        this.features_.set(i, str);
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
    public void setTarget(String str) {
        str.getClass();
        this.target_ = str;
    }

    /* access modifiers changed from: private */
    public void setTargetBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.target_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32294a.f78647a[methodToInvoke.ordinal()]) {
            case 1:
                return new Endpoint();
            case 2:
                return new C32295b((C32294a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0004Ț\u0005\u0007eȈ", new Object[]{"name_", "aliases_", "features_", "allowCors_", "target_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Endpoint> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Endpoint.class) {
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
    public String getAliases(int i) {
        return this.aliases_.get(i);
    }

    @Deprecated
    public ByteString getAliasesBytes(int i) {
        return ByteString.m137260e0(this.aliases_.get(i));
    }

    @Deprecated
    public int getAliasesCount() {
        return this.aliases_.size();
    }

    @Deprecated
    public List<String> getAliasesList() {
        return this.aliases_;
    }

    public boolean getAllowCors() {
        return this.allowCors_;
    }

    public String getFeatures(int i) {
        return this.features_.get(i);
    }

    public ByteString getFeaturesBytes(int i) {
        return ByteString.m137260e0(this.features_.get(i));
    }

    public int getFeaturesCount() {
        return this.features_.size();
    }

    public List<String> getFeaturesList() {
        return this.features_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public String getTarget() {
        return this.target_;
    }

    public ByteString getTargetBytes() {
        return ByteString.m137260e0(this.target_);
    }

    public static C32295b newBuilder(Endpoint endpoint) {
        return (C32295b) DEFAULT_INSTANCE.createBuilder(endpoint);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Endpoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Endpoint parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Endpoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Endpoint parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Endpoint parseFrom(InputStream inputStream) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Endpoint parseFrom(C34448s sVar) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Endpoint parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
