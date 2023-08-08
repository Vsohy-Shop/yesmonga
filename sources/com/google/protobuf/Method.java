package com.google.protobuf;

import com.google.protobuf.C34471v0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Option;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Method extends GeneratedMessageLite<Method, C34276b> implements C34439q1 {
    /* access modifiers changed from: private */
    public static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile C34504y1<Method> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private String name_ = "";
    private C34471v0.C34488k<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private boolean requestStreaming_;
    private String requestTypeUrl_ = "";
    private boolean responseStreaming_;
    private String responseTypeUrl_ = "";
    private int syntax_;

    /* renamed from: com.google.protobuf.Method$a */
    public static /* synthetic */ class C34275a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83080a;

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
                f83080a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83080a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83080a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83080a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83080a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83080a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83080a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Method.C34275a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.Method$b */
    public static final class C34276b extends GeneratedMessageLite.C34263b<Method, C34276b> implements C34439q1 {
        public /* synthetic */ C34276b(C34275a aVar) {
            this();
        }

        /* renamed from: P */
        public C34276b mo100566P(Iterable<? extends Option> iterable) {
            mo100457F();
            ((Method) this.f83053b).addAllOptions(iterable);
            return this;
        }

        /* renamed from: R */
        public C34276b mo100567R(int i, Option.C34283b bVar) {
            mo100457F();
            ((Method) this.f83053b).addOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C34276b mo100568S(int i, Option option) {
            mo100457F();
            ((Method) this.f83053b).addOptions(i, option);
            return this;
        }

        /* renamed from: T */
        public C34276b mo100569T(Option.C34283b bVar) {
            mo100457F();
            ((Method) this.f83053b).addOptions((Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C34276b mo100570U(Option option) {
            mo100457F();
            ((Method) this.f83053b).addOptions(option);
            return this;
        }

        /* renamed from: V */
        public C34276b mo100571V() {
            mo100457F();
            ((Method) this.f83053b).clearName();
            return this;
        }

        /* renamed from: Y */
        public C34276b mo100572Y() {
            mo100457F();
            ((Method) this.f83053b).clearOptions();
            return this;
        }

        /* renamed from: Z */
        public C34276b mo100573Z() {
            mo100457F();
            ((Method) this.f83053b).clearRequestStreaming();
            return this;
        }

        /* renamed from: a0 */
        public C34276b mo100574a0() {
            mo100457F();
            ((Method) this.f83053b).clearRequestTypeUrl();
            return this;
        }

        /* renamed from: b0 */
        public C34276b mo100575b0() {
            mo100457F();
            ((Method) this.f83053b).clearResponseStreaming();
            return this;
        }

        /* renamed from: c0 */
        public C34276b mo100576c0() {
            mo100457F();
            ((Method) this.f83053b).clearResponseTypeUrl();
            return this;
        }

        /* renamed from: d0 */
        public C34276b mo100577d0() {
            mo100457F();
            ((Method) this.f83053b).clearSyntax();
            return this;
        }

        /* renamed from: g0 */
        public C34276b mo100578g0(int i) {
            mo100457F();
            ((Method) this.f83053b).removeOptions(i);
            return this;
        }

        public String getName() {
            return ((Method) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Method) this.f83053b).getNameBytes();
        }

        public Option getOptions(int i) {
            return ((Method) this.f83053b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Method) this.f83053b).getOptionsCount();
        }

        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Method) this.f83053b).getOptionsList());
        }

        public boolean getRequestStreaming() {
            return ((Method) this.f83053b).getRequestStreaming();
        }

        public String getRequestTypeUrl() {
            return ((Method) this.f83053b).getRequestTypeUrl();
        }

        public ByteString getRequestTypeUrlBytes() {
            return ((Method) this.f83053b).getRequestTypeUrlBytes();
        }

        public boolean getResponseStreaming() {
            return ((Method) this.f83053b).getResponseStreaming();
        }

        public String getResponseTypeUrl() {
            return ((Method) this.f83053b).getResponseTypeUrl();
        }

        public ByteString getResponseTypeUrlBytes() {
            return ((Method) this.f83053b).getResponseTypeUrlBytes();
        }

        public Syntax getSyntax() {
            return ((Method) this.f83053b).getSyntax();
        }

        public int getSyntaxValue() {
            return ((Method) this.f83053b).getSyntaxValue();
        }

        /* renamed from: h0 */
        public C34276b mo100579h0(String str) {
            mo100457F();
            ((Method) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: i0 */
        public C34276b mo100580i0(ByteString byteString) {
            mo100457F();
            ((Method) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: j0 */
        public C34276b mo100581j0(int i, Option.C34283b bVar) {
            mo100457F();
            ((Method) this.f83053b).setOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: k0 */
        public C34276b mo100582k0(int i, Option option) {
            mo100457F();
            ((Method) this.f83053b).setOptions(i, option);
            return this;
        }

        /* renamed from: l0 */
        public C34276b mo100583l0(boolean z) {
            mo100457F();
            ((Method) this.f83053b).setRequestStreaming(z);
            return this;
        }

        /* renamed from: m0 */
        public C34276b mo100584m0(String str) {
            mo100457F();
            ((Method) this.f83053b).setRequestTypeUrl(str);
            return this;
        }

        /* renamed from: o0 */
        public C34276b mo100585o0(ByteString byteString) {
            mo100457F();
            ((Method) this.f83053b).setRequestTypeUrlBytes(byteString);
            return this;
        }

        /* renamed from: q0 */
        public C34276b mo100586q0(boolean z) {
            mo100457F();
            ((Method) this.f83053b).setResponseStreaming(z);
            return this;
        }

        /* renamed from: r0 */
        public C34276b mo100587r0(String str) {
            mo100457F();
            ((Method) this.f83053b).setResponseTypeUrl(str);
            return this;
        }

        /* renamed from: s0 */
        public C34276b mo100588s0(ByteString byteString) {
            mo100457F();
            ((Method) this.f83053b).setResponseTypeUrlBytes(byteString);
            return this;
        }

        /* renamed from: u0 */
        public C34276b mo100589u0(Syntax syntax) {
            mo100457F();
            ((Method) this.f83053b).setSyntax(syntax);
            return this;
        }

        /* renamed from: v0 */
        public C34276b mo100590v0(int i) {
            mo100457F();
            ((Method) this.f83053b).setSyntaxValue(i);
            return this;
        }

        public C34276b() {
            super(Method.DEFAULT_INSTANCE);
        }
    }

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        GeneratedMessageLite.registerDefaultInstance(Method.class, method);
    }

    private Method() {
    }

    /* access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        C34319a.addAll(iterable, this.options_);
    }

    /* access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    /* access modifiers changed from: private */
    public void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    /* access modifiers changed from: private */
    public void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    /* access modifiers changed from: private */
    public void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    /* access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureOptionsIsMutable() {
        C34471v0.C34488k<Option> kVar = this.options_;
        if (!kVar.mo100971T()) {
            this.options_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C34276b newBuilder() {
        return (C34276b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Method> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
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
    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* access modifiers changed from: private */
    public void setRequestStreaming(boolean z) {
        this.requestStreaming_ = z;
    }

    /* access modifiers changed from: private */
    public void setRequestTypeUrl(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setRequestTypeUrlBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.requestTypeUrl_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setResponseStreaming(boolean z) {
        this.responseStreaming_ = z;
    }

    /* access modifiers changed from: private */
    public void setResponseTypeUrl(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setResponseTypeUrlBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.responseTypeUrl_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setSyntax(Syntax syntax) {
        this.syntax_ = syntax.getNumber();
    }

    /* access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34275a.f83080a[methodToInvoke.ordinal()]) {
            case 1:
                return new Method();
            case 2:
                return new C34276b((C34275a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Method> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Method.class) {
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

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<Option> getOptionsList() {
        return this.options_;
    }

    public C34500x1 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    public List<? extends C34500x1> getOptionsOrBuilderList() {
        return this.options_;
    }

    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    public ByteString getRequestTypeUrlBytes() {
        return ByteString.m137260e0(this.requestTypeUrl_);
    }

    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    public ByteString getResponseTypeUrlBytes() {
        return ByteString.m137260e0(this.responseTypeUrl_);
    }

    public Syntax getSyntax() {
        Syntax b = Syntax.m138570b(this.syntax_);
        if (b == null) {
            return Syntax.UNRECOGNIZED;
        }
        return b;
    }

    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static C34276b newBuilder(Method method) {
        return (C34276b) DEFAULT_INSTANCE.createBuilder(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Method) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Method parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Method parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Method parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Method parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Method parseFrom(C34448s sVar) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Method parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Method) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
