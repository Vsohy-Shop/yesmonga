package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34361f;
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

public final class HttpBody extends GeneratedMessageLite<HttpBody, C32301b> implements C32392e0 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final HttpBody DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile C34504y1<HttpBody> PARSER;
    private String contentType_ = "";
    private ByteString data_ = ByteString.f82785d;
    private C34471v0.C34488k<Any> extensions_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.api.HttpBody$a */
    public static /* synthetic */ class C32300a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78665a;

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
                f78665a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78665a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78665a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78665a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78665a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78665a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78665a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.HttpBody.C32300a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.HttpBody$b */
    public static final class C32301b extends GeneratedMessageLite.C34263b<HttpBody, C32301b> implements C32392e0 {
        public /* synthetic */ C32301b(C32300a aVar) {
            this();
        }

        /* renamed from: P */
        public C32301b mo93579P(Iterable<? extends Any> iterable) {
            mo100457F();
            ((HttpBody) this.f83053b).addAllExtensions(iterable);
            return this;
        }

        /* renamed from: R */
        public C32301b mo93580R(int i, Any.C34149b bVar) {
            mo100457F();
            ((HttpBody) this.f83053b).addExtensions(i, (Any) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32301b mo93581S(int i, Any any) {
            mo100457F();
            ((HttpBody) this.f83053b).addExtensions(i, any);
            return this;
        }

        /* renamed from: T */
        public C32301b mo93582T(Any.C34149b bVar) {
            mo100457F();
            ((HttpBody) this.f83053b).addExtensions((Any) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32301b mo93583U(Any any) {
            mo100457F();
            ((HttpBody) this.f83053b).addExtensions(any);
            return this;
        }

        /* renamed from: V */
        public C32301b mo93584V() {
            mo100457F();
            ((HttpBody) this.f83053b).clearContentType();
            return this;
        }

        /* renamed from: Y */
        public C32301b mo93585Y() {
            mo100457F();
            ((HttpBody) this.f83053b).clearData();
            return this;
        }

        /* renamed from: Z */
        public C32301b mo93586Z() {
            mo100457F();
            ((HttpBody) this.f83053b).clearExtensions();
            return this;
        }

        /* renamed from: a0 */
        public C32301b mo93587a0(int i) {
            mo100457F();
            ((HttpBody) this.f83053b).removeExtensions(i);
            return this;
        }

        /* renamed from: b0 */
        public C32301b mo93588b0(String str) {
            mo100457F();
            ((HttpBody) this.f83053b).setContentType(str);
            return this;
        }

        /* renamed from: c0 */
        public C32301b mo93589c0(ByteString byteString) {
            mo100457F();
            ((HttpBody) this.f83053b).setContentTypeBytes(byteString);
            return this;
        }

        /* renamed from: d0 */
        public C32301b mo93590d0(ByteString byteString) {
            mo100457F();
            ((HttpBody) this.f83053b).setData(byteString);
            return this;
        }

        /* renamed from: g0 */
        public C32301b mo93591g0(int i, Any.C34149b bVar) {
            mo100457F();
            ((HttpBody) this.f83053b).setExtensions(i, (Any) bVar.mo100473g());
            return this;
        }

        public String getContentType() {
            return ((HttpBody) this.f83053b).getContentType();
        }

        public ByteString getContentTypeBytes() {
            return ((HttpBody) this.f83053b).getContentTypeBytes();
        }

        public ByteString getData() {
            return ((HttpBody) this.f83053b).getData();
        }

        public Any getExtensions(int i) {
            return ((HttpBody) this.f83053b).getExtensions(i);
        }

        public int getExtensionsCount() {
            return ((HttpBody) this.f83053b).getExtensionsCount();
        }

        public List<Any> getExtensionsList() {
            return Collections.unmodifiableList(((HttpBody) this.f83053b).getExtensionsList());
        }

        /* renamed from: h0 */
        public C32301b mo93592h0(int i, Any any) {
            mo100457F();
            ((HttpBody) this.f83053b).setExtensions(i, any);
            return this;
        }

        public C32301b() {
            super(HttpBody.DEFAULT_INSTANCE);
        }
    }

    static {
        HttpBody httpBody = new HttpBody();
        DEFAULT_INSTANCE = httpBody;
        GeneratedMessageLite.registerDefaultInstance(HttpBody.class, httpBody);
    }

    private HttpBody() {
    }

    /* access modifiers changed from: private */
    public void addAllExtensions(Iterable<? extends Any> iterable) {
        ensureExtensionsIsMutable();
        C34319a.addAll(iterable, this.extensions_);
    }

    /* access modifiers changed from: private */
    public void addExtensions(Any any) {
        any.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.add(any);
    }

    /* access modifiers changed from: private */
    public void clearContentType() {
        this.contentType_ = getDefaultInstance().getContentType();
    }

    /* access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* access modifiers changed from: private */
    public void clearExtensions() {
        this.extensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureExtensionsIsMutable() {
        C34471v0.C34488k<Any> kVar = this.extensions_;
        if (!kVar.mo100971T()) {
            this.extensions_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static HttpBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32301b newBuilder() {
        return (C32301b) DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<HttpBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeExtensions(int i) {
        ensureExtensionsIsMutable();
        this.extensions_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setContentType(String str) {
        str.getClass();
        this.contentType_ = str;
    }

    /* access modifiers changed from: private */
    public void setContentTypeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.contentType_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setData(ByteString byteString) {
        byteString.getClass();
        this.data_ = byteString;
    }

    /* access modifiers changed from: private */
    public void setExtensions(int i, Any any) {
        any.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.set(i, any);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32300a.f78665a[methodToInvoke.ordinal()]) {
            case 1:
                return new HttpBody();
            case 2:
                return new C32301b((C32300a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b", new Object[]{"contentType_", "data_", "extensions_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<HttpBody> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (HttpBody.class) {
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

    public String getContentType() {
        return this.contentType_;
    }

    public ByteString getContentTypeBytes() {
        return ByteString.m137260e0(this.contentType_);
    }

    public ByteString getData() {
        return this.data_;
    }

    public Any getExtensions(int i) {
        return this.extensions_.get(i);
    }

    public int getExtensionsCount() {
        return this.extensions_.size();
    }

    public List<Any> getExtensionsList() {
        return this.extensions_;
    }

    public C34361f getExtensionsOrBuilder(int i) {
        return this.extensions_.get(i);
    }

    public List<? extends C34361f> getExtensionsOrBuilderList() {
        return this.extensions_;
    }

    public static C32301b newBuilder(HttpBody httpBody) {
        return (C32301b) DEFAULT_INSTANCE.createBuilder(httpBody);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static HttpBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addExtensions(int i, Any any) {
        any.getClass();
        ensureExtensionsIsMutable();
        this.extensions_.add(i, any);
    }

    public static HttpBody parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static HttpBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpBody parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static HttpBody parseFrom(InputStream inputStream) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpBody parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static HttpBody parseFrom(C34448s sVar) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static HttpBody parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (HttpBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
