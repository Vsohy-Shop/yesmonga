package com.google.api;

import com.google.api.CustomHttpPattern;
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

public final class HttpRule extends GeneratedMessageLite<HttpRule, C32303b> implements C32404i0 {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final HttpRule DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile C34504y1<HttpRule> PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private C34471v0.C34488k<HttpRule> additionalBindings_ = GeneratedMessageLite.emptyProtobufList();
    private String body_ = "";
    private int patternCase_ = 0;
    private Object pattern_;
    private String responseBody_ = "";
    private String selector_ = "";

    public enum PatternCase {
        GET(2),
        PUT(3),
        POST(4),
        DELETE(5),
        PATCH(6),
        CUSTOM(8),
        PATTERN_NOT_SET(0);
        
        private final int value;

        /* access modifiers changed from: public */
        PatternCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static PatternCase m130763b(int i) {
            if (i == 0) {
                return PATTERN_NOT_SET;
            }
            if (i == 8) {
                return CUSTOM;
            }
            if (i == 2) {
                return GET;
            }
            if (i == 3) {
                return PUT;
            }
            if (i == 4) {
                return POST;
            }
            if (i == 5) {
                return DELETE;
            }
            if (i != 6) {
                return null;
            }
            return PATCH;
        }

        @Deprecated
        /* renamed from: g */
        public static PatternCase m130764g(int i) {
            return m130763b(i);
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.api.HttpRule$a */
    public static /* synthetic */ class C32302a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78674a;

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
                f78674a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78674a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78674a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78674a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78674a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78674a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78674a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.HttpRule.C32302a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.HttpRule$b */
    public static final class C32303b extends GeneratedMessageLite.C34263b<HttpRule, C32303b> implements C32404i0 {
        public /* synthetic */ C32303b(C32302a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C32303b mo93618B0(ByteString byteString) {
            mo100457F();
            ((HttpRule) this.f83053b).setPatchBytes(byteString);
            return this;
        }

        /* renamed from: D0 */
        public C32303b mo93619D0(String str) {
            mo100457F();
            ((HttpRule) this.f83053b).setPost(str);
            return this;
        }

        /* renamed from: E0 */
        public C32303b mo93620E0(ByteString byteString) {
            mo100457F();
            ((HttpRule) this.f83053b).setPostBytes(byteString);
            return this;
        }

        /* renamed from: F0 */
        public C32303b mo93621F0(String str) {
            mo100457F();
            ((HttpRule) this.f83053b).setPut(str);
            return this;
        }

        /* renamed from: G0 */
        public C32303b mo93622G0(ByteString byteString) {
            mo100457F();
            ((HttpRule) this.f83053b).setPutBytes(byteString);
            return this;
        }

        /* renamed from: H0 */
        public C32303b mo93623H0(String str) {
            mo100457F();
            ((HttpRule) this.f83053b).setResponseBody(str);
            return this;
        }

        /* renamed from: I0 */
        public C32303b mo93624I0(ByteString byteString) {
            mo100457F();
            ((HttpRule) this.f83053b).setResponseBodyBytes(byteString);
            return this;
        }

        /* renamed from: J0 */
        public C32303b mo93625J0(String str) {
            mo100457F();
            ((HttpRule) this.f83053b).setSelector(str);
            return this;
        }

        /* renamed from: L0 */
        public C32303b mo93626L0(ByteString byteString) {
            mo100457F();
            ((HttpRule) this.f83053b).setSelectorBytes(byteString);
            return this;
        }

        /* renamed from: P */
        public C32303b mo93627P(int i, C32303b bVar) {
            mo100457F();
            ((HttpRule) this.f83053b).addAdditionalBindings(i, (HttpRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: R */
        public C32303b mo93628R(int i, HttpRule httpRule) {
            mo100457F();
            ((HttpRule) this.f83053b).addAdditionalBindings(i, httpRule);
            return this;
        }

        /* renamed from: S */
        public C32303b mo93629S(C32303b bVar) {
            mo100457F();
            ((HttpRule) this.f83053b).addAdditionalBindings((HttpRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C32303b mo93630T(HttpRule httpRule) {
            mo100457F();
            ((HttpRule) this.f83053b).addAdditionalBindings(httpRule);
            return this;
        }

        /* renamed from: U */
        public C32303b mo93631U(Iterable<? extends HttpRule> iterable) {
            mo100457F();
            ((HttpRule) this.f83053b).addAllAdditionalBindings(iterable);
            return this;
        }

        /* renamed from: V */
        public C32303b mo93632V() {
            mo100457F();
            ((HttpRule) this.f83053b).clearAdditionalBindings();
            return this;
        }

        /* renamed from: Y */
        public C32303b mo93633Y() {
            mo100457F();
            ((HttpRule) this.f83053b).clearBody();
            return this;
        }

        /* renamed from: Z */
        public C32303b mo93634Z() {
            mo100457F();
            ((HttpRule) this.f83053b).clearCustom();
            return this;
        }

        /* renamed from: a0 */
        public C32303b mo93635a0() {
            mo100457F();
            ((HttpRule) this.f83053b).clearDelete();
            return this;
        }

        /* renamed from: b0 */
        public C32303b mo93636b0() {
            mo100457F();
            ((HttpRule) this.f83053b).clearGet();
            return this;
        }

        /* renamed from: c0 */
        public C32303b mo93637c0() {
            mo100457F();
            ((HttpRule) this.f83053b).clearPatch();
            return this;
        }

        /* renamed from: d0 */
        public C32303b mo93638d0() {
            mo100457F();
            ((HttpRule) this.f83053b).clearPattern();
            return this;
        }

        /* renamed from: g0 */
        public C32303b mo93639g0() {
            mo100457F();
            ((HttpRule) this.f83053b).clearPost();
            return this;
        }

        public HttpRule getAdditionalBindings(int i) {
            return ((HttpRule) this.f83053b).getAdditionalBindings(i);
        }

        public int getAdditionalBindingsCount() {
            return ((HttpRule) this.f83053b).getAdditionalBindingsCount();
        }

        public List<HttpRule> getAdditionalBindingsList() {
            return Collections.unmodifiableList(((HttpRule) this.f83053b).getAdditionalBindingsList());
        }

        public String getBody() {
            return ((HttpRule) this.f83053b).getBody();
        }

        public ByteString getBodyBytes() {
            return ((HttpRule) this.f83053b).getBodyBytes();
        }

        public CustomHttpPattern getCustom() {
            return ((HttpRule) this.f83053b).getCustom();
        }

        public String getDelete() {
            return ((HttpRule) this.f83053b).getDelete();
        }

        public ByteString getDeleteBytes() {
            return ((HttpRule) this.f83053b).getDeleteBytes();
        }

        public String getGet() {
            return ((HttpRule) this.f83053b).getGet();
        }

        public ByteString getGetBytes() {
            return ((HttpRule) this.f83053b).getGetBytes();
        }

        public String getPatch() {
            return ((HttpRule) this.f83053b).getPatch();
        }

        public ByteString getPatchBytes() {
            return ((HttpRule) this.f83053b).getPatchBytes();
        }

        public PatternCase getPatternCase() {
            return ((HttpRule) this.f83053b).getPatternCase();
        }

        public String getPost() {
            return ((HttpRule) this.f83053b).getPost();
        }

        public ByteString getPostBytes() {
            return ((HttpRule) this.f83053b).getPostBytes();
        }

        public String getPut() {
            return ((HttpRule) this.f83053b).getPut();
        }

        public ByteString getPutBytes() {
            return ((HttpRule) this.f83053b).getPutBytes();
        }

        public String getResponseBody() {
            return ((HttpRule) this.f83053b).getResponseBody();
        }

        public ByteString getResponseBodyBytes() {
            return ((HttpRule) this.f83053b).getResponseBodyBytes();
        }

        public String getSelector() {
            return ((HttpRule) this.f83053b).getSelector();
        }

        public ByteString getSelectorBytes() {
            return ((HttpRule) this.f83053b).getSelectorBytes();
        }

        /* renamed from: h0 */
        public C32303b mo93640h0() {
            mo100457F();
            ((HttpRule) this.f83053b).clearPut();
            return this;
        }

        public boolean hasCustom() {
            return ((HttpRule) this.f83053b).hasCustom();
        }

        /* renamed from: i0 */
        public C32303b mo93641i0() {
            mo100457F();
            ((HttpRule) this.f83053b).clearResponseBody();
            return this;
        }

        /* renamed from: j0 */
        public C32303b mo93642j0() {
            mo100457F();
            ((HttpRule) this.f83053b).clearSelector();
            return this;
        }

        /* renamed from: k0 */
        public C32303b mo93643k0(CustomHttpPattern customHttpPattern) {
            mo100457F();
            ((HttpRule) this.f83053b).mergeCustom(customHttpPattern);
            return this;
        }

        /* renamed from: l0 */
        public C32303b mo93644l0(int i) {
            mo100457F();
            ((HttpRule) this.f83053b).removeAdditionalBindings(i);
            return this;
        }

        /* renamed from: m0 */
        public C32303b mo93645m0(int i, C32303b bVar) {
            mo100457F();
            ((HttpRule) this.f83053b).setAdditionalBindings(i, (HttpRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: o0 */
        public C32303b mo93646o0(int i, HttpRule httpRule) {
            mo100457F();
            ((HttpRule) this.f83053b).setAdditionalBindings(i, httpRule);
            return this;
        }

        /* renamed from: q0 */
        public C32303b mo93647q0(String str) {
            mo100457F();
            ((HttpRule) this.f83053b).setBody(str);
            return this;
        }

        /* renamed from: r0 */
        public C32303b mo93648r0(ByteString byteString) {
            mo100457F();
            ((HttpRule) this.f83053b).setBodyBytes(byteString);
            return this;
        }

        /* renamed from: s0 */
        public C32303b mo93649s0(CustomHttpPattern.C32275b bVar) {
            mo100457F();
            ((HttpRule) this.f83053b).setCustom((CustomHttpPattern) bVar.mo100473g());
            return this;
        }

        /* renamed from: u0 */
        public C32303b mo93650u0(CustomHttpPattern customHttpPattern) {
            mo100457F();
            ((HttpRule) this.f83053b).setCustom(customHttpPattern);
            return this;
        }

        /* renamed from: v0 */
        public C32303b mo93651v0(String str) {
            mo100457F();
            ((HttpRule) this.f83053b).setDelete(str);
            return this;
        }

        /* renamed from: w0 */
        public C32303b mo93652w0(ByteString byteString) {
            mo100457F();
            ((HttpRule) this.f83053b).setDeleteBytes(byteString);
            return this;
        }

        /* renamed from: x0 */
        public C32303b mo93653x0(String str) {
            mo100457F();
            ((HttpRule) this.f83053b).setGet(str);
            return this;
        }

        /* renamed from: y0 */
        public C32303b mo93654y0(ByteString byteString) {
            mo100457F();
            ((HttpRule) this.f83053b).setGetBytes(byteString);
            return this;
        }

        /* renamed from: z0 */
        public C32303b mo93655z0(String str) {
            mo100457F();
            ((HttpRule) this.f83053b).setPatch(str);
            return this;
        }

        public C32303b() {
            super(HttpRule.DEFAULT_INSTANCE);
        }
    }

    static {
        HttpRule httpRule = new HttpRule();
        DEFAULT_INSTANCE = httpRule;
        GeneratedMessageLite.registerDefaultInstance(HttpRule.class, httpRule);
    }

    private HttpRule() {
    }

    /* access modifiers changed from: private */
    public void addAdditionalBindings(HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(httpRule);
    }

    /* access modifiers changed from: private */
    public void addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
        ensureAdditionalBindingsIsMutable();
        C34319a.addAll(iterable, this.additionalBindings_);
    }

    /* access modifiers changed from: private */
    public void clearAdditionalBindings() {
        this.additionalBindings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* access modifiers changed from: private */
    public void clearCustom() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearDelete() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearGet() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearPatch() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearPattern() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    /* access modifiers changed from: private */
    public void clearPost() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearPut() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearResponseBody() {
        this.responseBody_ = getDefaultInstance().getResponseBody();
    }

    /* access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAdditionalBindingsIsMutable() {
        C34471v0.C34488k<HttpRule> kVar = this.additionalBindings_;
        if (!kVar.mo100971T()) {
            this.additionalBindings_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static HttpRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        if (this.patternCase_ != 8 || this.pattern_ == CustomHttpPattern.getDefaultInstance()) {
            this.pattern_ = customHttpPattern;
        } else {
            this.pattern_ = ((CustomHttpPattern.C32275b) CustomHttpPattern.newBuilder((CustomHttpPattern) this.pattern_).mo100463K(customHttpPattern)).mo100467Q();
        }
        this.patternCase_ = 8;
    }

    public static C32303b newBuilder() {
        return (C32303b) DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<HttpRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeAdditionalBindings(int i) {
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setAdditionalBindings(int i, HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.set(i, httpRule);
    }

    /* access modifiers changed from: private */
    public void setBody(String str) {
        str.getClass();
        this.body_ = str;
    }

    /* access modifiers changed from: private */
    public void setBodyBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.body_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        this.pattern_ = customHttpPattern;
        this.patternCase_ = 8;
    }

    /* access modifiers changed from: private */
    public void setDelete(String str) {
        str.getClass();
        this.patternCase_ = 5;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void setDeleteBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.pattern_ = byteString.mo99228S0();
        this.patternCase_ = 5;
    }

    /* access modifiers changed from: private */
    public void setGet(String str) {
        str.getClass();
        this.patternCase_ = 2;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void setGetBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.pattern_ = byteString.mo99228S0();
        this.patternCase_ = 2;
    }

    /* access modifiers changed from: private */
    public void setPatch(String str) {
        str.getClass();
        this.patternCase_ = 6;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void setPatchBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.pattern_ = byteString.mo99228S0();
        this.patternCase_ = 6;
    }

    /* access modifiers changed from: private */
    public void setPost(String str) {
        str.getClass();
        this.patternCase_ = 4;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void setPostBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.pattern_ = byteString.mo99228S0();
        this.patternCase_ = 4;
    }

    /* access modifiers changed from: private */
    public void setPut(String str) {
        str.getClass();
        this.patternCase_ = 3;
        this.pattern_ = str;
    }

    /* access modifiers changed from: private */
    public void setPutBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.pattern_ = byteString.mo99228S0();
        this.patternCase_ = 3;
    }

    /* access modifiers changed from: private */
    public void setResponseBody(String str) {
        str.getClass();
        this.responseBody_ = str;
    }

    /* access modifiers changed from: private */
    public void setResponseBodyBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.responseBody_ = byteString.mo99228S0();
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
        switch (C32302a.f78674a[methodToInvoke.ordinal()]) {
            case 1:
                return new HttpRule();
            case 2:
                return new C32303b((C32302a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000b\u001b\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", CustomHttpPattern.class, "additionalBindings_", HttpRule.class, "responseBody_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<HttpRule> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (HttpRule.class) {
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

    public HttpRule getAdditionalBindings(int i) {
        return this.additionalBindings_.get(i);
    }

    public int getAdditionalBindingsCount() {
        return this.additionalBindings_.size();
    }

    public List<HttpRule> getAdditionalBindingsList() {
        return this.additionalBindings_;
    }

    public C32404i0 getAdditionalBindingsOrBuilder(int i) {
        return this.additionalBindings_.get(i);
    }

    public List<? extends C32404i0> getAdditionalBindingsOrBuilderList() {
        return this.additionalBindings_;
    }

    public String getBody() {
        return this.body_;
    }

    public ByteString getBodyBytes() {
        return ByteString.m137260e0(this.body_);
    }

    public CustomHttpPattern getCustom() {
        if (this.patternCase_ == 8) {
            return (CustomHttpPattern) this.pattern_;
        }
        return CustomHttpPattern.getDefaultInstance();
    }

    public String getDelete() {
        if (this.patternCase_ == 5) {
            return (String) this.pattern_;
        }
        return "";
    }

    public ByteString getDeleteBytes() {
        String str;
        if (this.patternCase_ == 5) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return ByteString.m137260e0(str);
    }

    public String getGet() {
        if (this.patternCase_ == 2) {
            return (String) this.pattern_;
        }
        return "";
    }

    public ByteString getGetBytes() {
        String str;
        if (this.patternCase_ == 2) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return ByteString.m137260e0(str);
    }

    public String getPatch() {
        if (this.patternCase_ == 6) {
            return (String) this.pattern_;
        }
        return "";
    }

    public ByteString getPatchBytes() {
        String str;
        if (this.patternCase_ == 6) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return ByteString.m137260e0(str);
    }

    public PatternCase getPatternCase() {
        return PatternCase.m130763b(this.patternCase_);
    }

    public String getPost() {
        if (this.patternCase_ == 4) {
            return (String) this.pattern_;
        }
        return "";
    }

    public ByteString getPostBytes() {
        String str;
        if (this.patternCase_ == 4) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return ByteString.m137260e0(str);
    }

    public String getPut() {
        if (this.patternCase_ == 3) {
            return (String) this.pattern_;
        }
        return "";
    }

    public ByteString getPutBytes() {
        String str;
        if (this.patternCase_ == 3) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return ByteString.m137260e0(str);
    }

    public String getResponseBody() {
        return this.responseBody_;
    }

    public ByteString getResponseBodyBytes() {
        return ByteString.m137260e0(this.responseBody_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.m137260e0(this.selector_);
    }

    public boolean hasCustom() {
        return this.patternCase_ == 8;
    }

    public static C32303b newBuilder(HttpRule httpRule) {
        return (C32303b) DEFAULT_INSTANCE.createBuilder(httpRule);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static HttpRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addAdditionalBindings(int i, HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(i, httpRule);
    }

    public static HttpRule parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static HttpRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRule parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static HttpRule parseFrom(InputStream inputStream) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static HttpRule parseFrom(C34448s sVar) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static HttpRule parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
