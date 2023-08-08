package com.google.protobuf;

import com.google.protobuf.C34471v0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Api extends GeneratedMessageLite<Api, C34151b> implements C34373h {
    /* access modifiers changed from: private */
    public static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile C34504y1<Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private C34471v0.C34488k<Method> methods_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<Mixin> mixins_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";
    private C34471v0.C34488k<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private SourceContext sourceContext_;
    private int syntax_;
    private String version_ = "";

    /* renamed from: com.google.protobuf.Api$a */
    public static /* synthetic */ class C34150a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f82780a;

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
                f82780a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f82780a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f82780a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f82780a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f82780a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f82780a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f82780a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Api.C34150a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.Api$b */
    public static final class C34151b extends GeneratedMessageLite.C34263b<Api, C34151b> implements C34373h {
        public /* synthetic */ C34151b(C34150a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C34151b mo99175B0(int i, Mixin mixin) {
            mo100457F();
            ((Api) this.f83053b).setMixins(i, mixin);
            return this;
        }

        /* renamed from: D0 */
        public C34151b mo99176D0(String str) {
            mo100457F();
            ((Api) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: E0 */
        public C34151b mo99177E0(ByteString byteString) {
            mo100457F();
            ((Api) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: F0 */
        public C34151b mo99178F0(int i, Option.C34283b bVar) {
            mo100457F();
            ((Api) this.f83053b).setOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: G0 */
        public C34151b mo99179G0(int i, Option option) {
            mo100457F();
            ((Api) this.f83053b).setOptions(i, option);
            return this;
        }

        /* renamed from: H0 */
        public C34151b mo99180H0(SourceContext.C34289b bVar) {
            mo100457F();
            ((Api) this.f83053b).setSourceContext((SourceContext) bVar.mo100473g());
            return this;
        }

        /* renamed from: I0 */
        public C34151b mo99181I0(SourceContext sourceContext) {
            mo100457F();
            ((Api) this.f83053b).setSourceContext(sourceContext);
            return this;
        }

        /* renamed from: J0 */
        public C34151b mo99182J0(Syntax syntax) {
            mo100457F();
            ((Api) this.f83053b).setSyntax(syntax);
            return this;
        }

        /* renamed from: L0 */
        public C34151b mo99183L0(int i) {
            mo100457F();
            ((Api) this.f83053b).setSyntaxValue(i);
            return this;
        }

        /* renamed from: M0 */
        public C34151b mo99184M0(String str) {
            mo100457F();
            ((Api) this.f83053b).setVersion(str);
            return this;
        }

        /* renamed from: O0 */
        public C34151b mo99185O0(ByteString byteString) {
            mo100457F();
            ((Api) this.f83053b).setVersionBytes(byteString);
            return this;
        }

        /* renamed from: P */
        public C34151b mo99186P(Iterable<? extends Method> iterable) {
            mo100457F();
            ((Api) this.f83053b).addAllMethods(iterable);
            return this;
        }

        /* renamed from: R */
        public C34151b mo99187R(Iterable<? extends Mixin> iterable) {
            mo100457F();
            ((Api) this.f83053b).addAllMixins(iterable);
            return this;
        }

        /* renamed from: S */
        public C34151b mo99188S(Iterable<? extends Option> iterable) {
            mo100457F();
            ((Api) this.f83053b).addAllOptions(iterable);
            return this;
        }

        /* renamed from: T */
        public C34151b mo99189T(int i, Method.C34276b bVar) {
            mo100457F();
            ((Api) this.f83053b).addMethods(i, (Method) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C34151b mo99190U(int i, Method method) {
            mo100457F();
            ((Api) this.f83053b).addMethods(i, method);
            return this;
        }

        /* renamed from: V */
        public C34151b mo99191V(Method.C34276b bVar) {
            mo100457F();
            ((Api) this.f83053b).addMethods((Method) bVar.mo100473g());
            return this;
        }

        /* renamed from: Y */
        public C34151b mo99192Y(Method method) {
            mo100457F();
            ((Api) this.f83053b).addMethods(method);
            return this;
        }

        /* renamed from: Z */
        public C34151b mo99193Z(int i, Mixin.C34278b bVar) {
            mo100457F();
            ((Api) this.f83053b).addMixins(i, (Mixin) bVar.mo100473g());
            return this;
        }

        /* renamed from: a0 */
        public C34151b mo99194a0(int i, Mixin mixin) {
            mo100457F();
            ((Api) this.f83053b).addMixins(i, mixin);
            return this;
        }

        /* renamed from: b0 */
        public C34151b mo99195b0(Mixin.C34278b bVar) {
            mo100457F();
            ((Api) this.f83053b).addMixins((Mixin) bVar.mo100473g());
            return this;
        }

        /* renamed from: c0 */
        public C34151b mo99196c0(Mixin mixin) {
            mo100457F();
            ((Api) this.f83053b).addMixins(mixin);
            return this;
        }

        /* renamed from: d0 */
        public C34151b mo99197d0(int i, Option.C34283b bVar) {
            mo100457F();
            ((Api) this.f83053b).addOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: g0 */
        public C34151b mo99198g0(int i, Option option) {
            mo100457F();
            ((Api) this.f83053b).addOptions(i, option);
            return this;
        }

        public Method getMethods(int i) {
            return ((Api) this.f83053b).getMethods(i);
        }

        public int getMethodsCount() {
            return ((Api) this.f83053b).getMethodsCount();
        }

        public List<Method> getMethodsList() {
            return Collections.unmodifiableList(((Api) this.f83053b).getMethodsList());
        }

        public Mixin getMixins(int i) {
            return ((Api) this.f83053b).getMixins(i);
        }

        public int getMixinsCount() {
            return ((Api) this.f83053b).getMixinsCount();
        }

        public List<Mixin> getMixinsList() {
            return Collections.unmodifiableList(((Api) this.f83053b).getMixinsList());
        }

        public String getName() {
            return ((Api) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Api) this.f83053b).getNameBytes();
        }

        public Option getOptions(int i) {
            return ((Api) this.f83053b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Api) this.f83053b).getOptionsCount();
        }

        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Api) this.f83053b).getOptionsList());
        }

        public SourceContext getSourceContext() {
            return ((Api) this.f83053b).getSourceContext();
        }

        public Syntax getSyntax() {
            return ((Api) this.f83053b).getSyntax();
        }

        public int getSyntaxValue() {
            return ((Api) this.f83053b).getSyntaxValue();
        }

        public String getVersion() {
            return ((Api) this.f83053b).getVersion();
        }

        public ByteString getVersionBytes() {
            return ((Api) this.f83053b).getVersionBytes();
        }

        /* renamed from: h0 */
        public C34151b mo99199h0(Option.C34283b bVar) {
            mo100457F();
            ((Api) this.f83053b).addOptions((Option) bVar.mo100473g());
            return this;
        }

        public boolean hasSourceContext() {
            return ((Api) this.f83053b).hasSourceContext();
        }

        /* renamed from: i0 */
        public C34151b mo99200i0(Option option) {
            mo100457F();
            ((Api) this.f83053b).addOptions(option);
            return this;
        }

        /* renamed from: j0 */
        public C34151b mo99201j0() {
            mo100457F();
            ((Api) this.f83053b).clearMethods();
            return this;
        }

        /* renamed from: k0 */
        public C34151b mo99202k0() {
            mo100457F();
            ((Api) this.f83053b).clearMixins();
            return this;
        }

        /* renamed from: l0 */
        public C34151b mo99203l0() {
            mo100457F();
            ((Api) this.f83053b).clearName();
            return this;
        }

        /* renamed from: m0 */
        public C34151b mo99204m0() {
            mo100457F();
            ((Api) this.f83053b).clearOptions();
            return this;
        }

        /* renamed from: o0 */
        public C34151b mo99205o0() {
            mo100457F();
            ((Api) this.f83053b).clearSourceContext();
            return this;
        }

        /* renamed from: q0 */
        public C34151b mo99206q0() {
            mo100457F();
            ((Api) this.f83053b).clearSyntax();
            return this;
        }

        /* renamed from: r0 */
        public C34151b mo99207r0() {
            mo100457F();
            ((Api) this.f83053b).clearVersion();
            return this;
        }

        /* renamed from: s0 */
        public C34151b mo99208s0(SourceContext sourceContext) {
            mo100457F();
            ((Api) this.f83053b).mergeSourceContext(sourceContext);
            return this;
        }

        /* renamed from: u0 */
        public C34151b mo99209u0(int i) {
            mo100457F();
            ((Api) this.f83053b).removeMethods(i);
            return this;
        }

        /* renamed from: v0 */
        public C34151b mo99210v0(int i) {
            mo100457F();
            ((Api) this.f83053b).removeMixins(i);
            return this;
        }

        /* renamed from: w0 */
        public C34151b mo99211w0(int i) {
            mo100457F();
            ((Api) this.f83053b).removeOptions(i);
            return this;
        }

        /* renamed from: x0 */
        public C34151b mo99212x0(int i, Method.C34276b bVar) {
            mo100457F();
            ((Api) this.f83053b).setMethods(i, (Method) bVar.mo100473g());
            return this;
        }

        /* renamed from: y0 */
        public C34151b mo99213y0(int i, Method method) {
            mo100457F();
            ((Api) this.f83053b).setMethods(i, method);
            return this;
        }

        /* renamed from: z0 */
        public C34151b mo99214z0(int i, Mixin.C34278b bVar) {
            mo100457F();
            ((Api) this.f83053b).setMixins(i, (Mixin) bVar.mo100473g());
            return this;
        }

        public C34151b() {
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
    public void addAllMethods(Iterable<? extends Method> iterable) {
        ensureMethodsIsMutable();
        C34319a.addAll(iterable, this.methods_);
    }

    /* access modifiers changed from: private */
    public void addAllMixins(Iterable<? extends Mixin> iterable) {
        ensureMixinsIsMutable();
        C34319a.addAll(iterable, this.mixins_);
    }

    /* access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        C34319a.addAll(iterable, this.options_);
    }

    /* access modifiers changed from: private */
    public void addMethods(Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    /* access modifiers changed from: private */
    public void addMixins(Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(mixin);
    }

    /* access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* access modifiers changed from: private */
    public void clearMethods() {
        this.methods_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearMixins() {
        this.mixins_ = GeneratedMessageLite.emptyProtobufList();
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
    public void clearSourceContext() {
        this.sourceContext_ = null;
    }

    /* access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void ensureMethodsIsMutable() {
        C34471v0.C34488k<Method> kVar = this.methods_;
        if (!kVar.mo100971T()) {
            this.methods_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureMixinsIsMutable() {
        C34471v0.C34488k<Mixin> kVar = this.mixins_;
        if (!kVar.mo100971T()) {
            this.mixins_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureOptionsIsMutable() {
        C34471v0.C34488k<Option> kVar = this.options_;
        if (!kVar.mo100971T()) {
            this.options_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 == null || sourceContext2 == SourceContext.getDefaultInstance()) {
            this.sourceContext_ = sourceContext;
        } else {
            this.sourceContext_ = (SourceContext) ((SourceContext.C34289b) SourceContext.newBuilder(this.sourceContext_).mo100463K(sourceContext)).mo100467Q();
        }
    }

    public static C34151b newBuilder() {
        return (C34151b) DEFAULT_INSTANCE.createBuilder();
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
    public void removeMethods(int i) {
        ensureMethodsIsMutable();
        this.methods_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeMixins(int i) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setMethods(int i, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(i, method);
    }

    /* access modifiers changed from: private */
    public void setMixins(int i, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(i, mixin);
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
    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
    }

    /* access modifiers changed from: private */
    public void setSyntax(Syntax syntax) {
        this.syntax_ = syntax.getNumber();
    }

    /* access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
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
        switch (C34150a.f82780a[methodToInvoke.ordinal()]) {
            case 1:
                return new Api();
            case 2:
                return new C34151b((C34150a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
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

    public Method getMethods(int i) {
        return this.methods_.get(i);
    }

    public int getMethodsCount() {
        return this.methods_.size();
    }

    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public C34439q1 getMethodsOrBuilder(int i) {
        return this.methods_.get(i);
    }

    public List<? extends C34439q1> getMethodsOrBuilderList() {
        return this.methods_;
    }

    public Mixin getMixins(int i) {
        return this.mixins_.get(i);
    }

    public int getMixinsCount() {
        return this.mixins_.size();
    }

    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public C34446r1 getMixinsOrBuilder(int i) {
        return this.mixins_.get(i);
    }

    public List<? extends C34446r1> getMixinsOrBuilderList() {
        return this.mixins_;
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

    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
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

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.m137260e0(this.version_);
    }

    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static C34151b newBuilder(Api api) {
        return (C34151b) DEFAULT_INSTANCE.createBuilder(api);
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

    /* access modifiers changed from: private */
    public void addMethods(int i, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(i, method);
    }

    /* access modifiers changed from: private */
    public void addMixins(int i, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(i, mixin);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
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
