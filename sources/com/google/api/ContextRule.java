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

public final class ContextRule extends GeneratedMessageLite<ContextRule, C32271b> implements C32433s {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final ContextRule DEFAULT_INSTANCE;
    private static volatile C34504y1<ContextRule> PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private C34471v0.C34488k<String> allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<String> allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<String> provided_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<String> requested_ = GeneratedMessageLite.emptyProtobufList();
    private String selector_ = "";

    /* renamed from: com.google.api.ContextRule$a */
    public static /* synthetic */ class C32270a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78636a;

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
                f78636a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78636a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78636a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78636a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78636a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78636a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78636a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.ContextRule.C32270a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.ContextRule$b */
    public static final class C32271b extends GeneratedMessageLite.C34263b<ContextRule, C32271b> implements C32433s {
        public /* synthetic */ C32271b(C32270a aVar) {
            this();
        }

        /* renamed from: P */
        public C32271b mo93309P(Iterable<String> iterable) {
            mo100457F();
            ((ContextRule) this.f83053b).addAllAllowedRequestExtensions(iterable);
            return this;
        }

        /* renamed from: R */
        public C32271b mo93310R(Iterable<String> iterable) {
            mo100457F();
            ((ContextRule) this.f83053b).addAllAllowedResponseExtensions(iterable);
            return this;
        }

        /* renamed from: S */
        public C32271b mo93311S(Iterable<String> iterable) {
            mo100457F();
            ((ContextRule) this.f83053b).addAllProvided(iterable);
            return this;
        }

        /* renamed from: T */
        public C32271b mo93312T(Iterable<String> iterable) {
            mo100457F();
            ((ContextRule) this.f83053b).addAllRequested(iterable);
            return this;
        }

        /* renamed from: U */
        public C32271b mo93313U(String str) {
            mo100457F();
            ((ContextRule) this.f83053b).addAllowedRequestExtensions(str);
            return this;
        }

        /* renamed from: V */
        public C32271b mo93314V(ByteString byteString) {
            mo100457F();
            ((ContextRule) this.f83053b).addAllowedRequestExtensionsBytes(byteString);
            return this;
        }

        /* renamed from: Y */
        public C32271b mo93315Y(String str) {
            mo100457F();
            ((ContextRule) this.f83053b).addAllowedResponseExtensions(str);
            return this;
        }

        /* renamed from: Z */
        public C32271b mo93316Z(ByteString byteString) {
            mo100457F();
            ((ContextRule) this.f83053b).addAllowedResponseExtensionsBytes(byteString);
            return this;
        }

        /* renamed from: a0 */
        public C32271b mo93317a0(String str) {
            mo100457F();
            ((ContextRule) this.f83053b).addProvided(str);
            return this;
        }

        /* renamed from: b0 */
        public C32271b mo93318b0(ByteString byteString) {
            mo100457F();
            ((ContextRule) this.f83053b).addProvidedBytes(byteString);
            return this;
        }

        /* renamed from: c0 */
        public C32271b mo93319c0(String str) {
            mo100457F();
            ((ContextRule) this.f83053b).addRequested(str);
            return this;
        }

        /* renamed from: d0 */
        public C32271b mo93320d0(ByteString byteString) {
            mo100457F();
            ((ContextRule) this.f83053b).addRequestedBytes(byteString);
            return this;
        }

        /* renamed from: g0 */
        public C32271b mo93321g0() {
            mo100457F();
            ((ContextRule) this.f83053b).clearAllowedRequestExtensions();
            return this;
        }

        public String getAllowedRequestExtensions(int i) {
            return ((ContextRule) this.f83053b).getAllowedRequestExtensions(i);
        }

        public ByteString getAllowedRequestExtensionsBytes(int i) {
            return ((ContextRule) this.f83053b).getAllowedRequestExtensionsBytes(i);
        }

        public int getAllowedRequestExtensionsCount() {
            return ((ContextRule) this.f83053b).getAllowedRequestExtensionsCount();
        }

        public List<String> getAllowedRequestExtensionsList() {
            return Collections.unmodifiableList(((ContextRule) this.f83053b).getAllowedRequestExtensionsList());
        }

        public String getAllowedResponseExtensions(int i) {
            return ((ContextRule) this.f83053b).getAllowedResponseExtensions(i);
        }

        public ByteString getAllowedResponseExtensionsBytes(int i) {
            return ((ContextRule) this.f83053b).getAllowedResponseExtensionsBytes(i);
        }

        public int getAllowedResponseExtensionsCount() {
            return ((ContextRule) this.f83053b).getAllowedResponseExtensionsCount();
        }

        public List<String> getAllowedResponseExtensionsList() {
            return Collections.unmodifiableList(((ContextRule) this.f83053b).getAllowedResponseExtensionsList());
        }

        public String getProvided(int i) {
            return ((ContextRule) this.f83053b).getProvided(i);
        }

        public ByteString getProvidedBytes(int i) {
            return ((ContextRule) this.f83053b).getProvidedBytes(i);
        }

        public int getProvidedCount() {
            return ((ContextRule) this.f83053b).getProvidedCount();
        }

        public List<String> getProvidedList() {
            return Collections.unmodifiableList(((ContextRule) this.f83053b).getProvidedList());
        }

        public String getRequested(int i) {
            return ((ContextRule) this.f83053b).getRequested(i);
        }

        public ByteString getRequestedBytes(int i) {
            return ((ContextRule) this.f83053b).getRequestedBytes(i);
        }

        public int getRequestedCount() {
            return ((ContextRule) this.f83053b).getRequestedCount();
        }

        public List<String> getRequestedList() {
            return Collections.unmodifiableList(((ContextRule) this.f83053b).getRequestedList());
        }

        public String getSelector() {
            return ((ContextRule) this.f83053b).getSelector();
        }

        public ByteString getSelectorBytes() {
            return ((ContextRule) this.f83053b).getSelectorBytes();
        }

        /* renamed from: h0 */
        public C32271b mo93322h0() {
            mo100457F();
            ((ContextRule) this.f83053b).clearAllowedResponseExtensions();
            return this;
        }

        /* renamed from: i0 */
        public C32271b mo93323i0() {
            mo100457F();
            ((ContextRule) this.f83053b).clearProvided();
            return this;
        }

        /* renamed from: j0 */
        public C32271b mo93324j0() {
            mo100457F();
            ((ContextRule) this.f83053b).clearRequested();
            return this;
        }

        /* renamed from: k0 */
        public C32271b mo93325k0() {
            mo100457F();
            ((ContextRule) this.f83053b).clearSelector();
            return this;
        }

        /* renamed from: l0 */
        public C32271b mo93326l0(int i, String str) {
            mo100457F();
            ((ContextRule) this.f83053b).setAllowedRequestExtensions(i, str);
            return this;
        }

        /* renamed from: m0 */
        public C32271b mo93327m0(int i, String str) {
            mo100457F();
            ((ContextRule) this.f83053b).setAllowedResponseExtensions(i, str);
            return this;
        }

        /* renamed from: o0 */
        public C32271b mo93328o0(int i, String str) {
            mo100457F();
            ((ContextRule) this.f83053b).setProvided(i, str);
            return this;
        }

        /* renamed from: q0 */
        public C32271b mo93329q0(int i, String str) {
            mo100457F();
            ((ContextRule) this.f83053b).setRequested(i, str);
            return this;
        }

        /* renamed from: r0 */
        public C32271b mo93330r0(String str) {
            mo100457F();
            ((ContextRule) this.f83053b).setSelector(str);
            return this;
        }

        /* renamed from: s0 */
        public C32271b mo93331s0(ByteString byteString) {
            mo100457F();
            ((ContextRule) this.f83053b).setSelectorBytes(byteString);
            return this;
        }

        public C32271b() {
            super(ContextRule.DEFAULT_INSTANCE);
        }
    }

    static {
        ContextRule contextRule = new ContextRule();
        DEFAULT_INSTANCE = contextRule;
        GeneratedMessageLite.registerDefaultInstance(ContextRule.class, contextRule);
    }

    private ContextRule() {
    }

    /* access modifiers changed from: private */
    public void addAllAllowedRequestExtensions(Iterable<String> iterable) {
        ensureAllowedRequestExtensionsIsMutable();
        C34319a.addAll(iterable, this.allowedRequestExtensions_);
    }

    /* access modifiers changed from: private */
    public void addAllAllowedResponseExtensions(Iterable<String> iterable) {
        ensureAllowedResponseExtensionsIsMutable();
        C34319a.addAll(iterable, this.allowedResponseExtensions_);
    }

    /* access modifiers changed from: private */
    public void addAllProvided(Iterable<String> iterable) {
        ensureProvidedIsMutable();
        C34319a.addAll(iterable, this.provided_);
    }

    /* access modifiers changed from: private */
    public void addAllRequested(Iterable<String> iterable) {
        ensureRequestedIsMutable();
        C34319a.addAll(iterable, this.requested_);
    }

    /* access modifiers changed from: private */
    public void addAllowedRequestExtensions(String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllowedRequestExtensionsBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void addAllowedResponseExtensions(String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(str);
    }

    /* access modifiers changed from: private */
    public void addAllowedResponseExtensionsBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void addProvided(String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.add(str);
    }

    /* access modifiers changed from: private */
    public void addProvidedBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureProvidedIsMutable();
        this.provided_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void addRequested(String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.add(str);
    }

    /* access modifiers changed from: private */
    public void addRequestedBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureRequestedIsMutable();
        this.requested_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void clearAllowedRequestExtensions() {
        this.allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearAllowedResponseExtensions() {
        this.allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearProvided() {
        this.provided_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearRequested() {
        this.requested_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        C34471v0.C34488k<String> kVar = this.allowedRequestExtensions_;
        if (!kVar.mo100971T()) {
            this.allowedRequestExtensions_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        C34471v0.C34488k<String> kVar = this.allowedResponseExtensions_;
        if (!kVar.mo100971T()) {
            this.allowedResponseExtensions_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureProvidedIsMutable() {
        C34471v0.C34488k<String> kVar = this.provided_;
        if (!kVar.mo100971T()) {
            this.provided_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureRequestedIsMutable() {
        C34471v0.C34488k<String> kVar = this.requested_;
        if (!kVar.mo100971T()) {
            this.requested_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32271b newBuilder() {
        return (C32271b) DEFAULT_INSTANCE.createBuilder();
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<ContextRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setAllowedRequestExtensions(int i, String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void setAllowedResponseExtensions(int i, String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void setProvided(int i, String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void setRequested(int i, String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.set(i, str);
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
        switch (C32270a.f78636a[methodToInvoke.ordinal()]) {
            case 1:
                return new ContextRule();
            case 2:
                return new C32271b((C32270a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<ContextRule> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (ContextRule.class) {
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

    public String getAllowedRequestExtensions(int i) {
        return this.allowedRequestExtensions_.get(i);
    }

    public ByteString getAllowedRequestExtensionsBytes(int i) {
        return ByteString.m137260e0(this.allowedRequestExtensions_.get(i));
    }

    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    public List<String> getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    public String getAllowedResponseExtensions(int i) {
        return this.allowedResponseExtensions_.get(i);
    }

    public ByteString getAllowedResponseExtensionsBytes(int i) {
        return ByteString.m137260e0(this.allowedResponseExtensions_.get(i));
    }

    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    public List<String> getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    public String getProvided(int i) {
        return this.provided_.get(i);
    }

    public ByteString getProvidedBytes(int i) {
        return ByteString.m137260e0(this.provided_.get(i));
    }

    public int getProvidedCount() {
        return this.provided_.size();
    }

    public List<String> getProvidedList() {
        return this.provided_;
    }

    public String getRequested(int i) {
        return this.requested_.get(i);
    }

    public ByteString getRequestedBytes(int i) {
        return ByteString.m137260e0(this.requested_.get(i));
    }

    public int getRequestedCount() {
        return this.requested_.size();
    }

    public List<String> getRequestedList() {
        return this.requested_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.m137260e0(this.selector_);
    }

    public static C32271b newBuilder(ContextRule contextRule) {
        return (C32271b) DEFAULT_INSTANCE.createBuilder(contextRule);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static ContextRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ContextRule parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static ContextRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextRule parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ContextRule parseFrom(C34448s sVar) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static ContextRule parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
