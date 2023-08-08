package com.google.protobuf;

import com.google.protobuf.C34471v0;
import com.google.protobuf.EnumValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Enum extends GeneratedMessageLite<Enum, C34247b> implements C34330b0 {
    /* access modifiers changed from: private */
    public static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile C34504y1<Enum> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private C34471v0.C34488k<EnumValue> enumvalue_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";
    private C34471v0.C34488k<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: com.google.protobuf.Enum$a */
    public static /* synthetic */ class C34246a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f82918a;

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
                f82918a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f82918a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f82918a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f82918a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f82918a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f82918a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f82918a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Enum.C34246a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.Enum$b */
    public static final class C34247b extends GeneratedMessageLite.C34263b<Enum, C34247b> implements C34330b0 {
        public /* synthetic */ C34247b(C34246a aVar) {
            this();
        }

        /* renamed from: P */
        public C34247b mo100287P(Iterable<? extends EnumValue> iterable) {
            mo100457F();
            ((Enum) this.f83053b).addAllEnumvalue(iterable);
            return this;
        }

        /* renamed from: R */
        public C34247b mo100288R(Iterable<? extends Option> iterable) {
            mo100457F();
            ((Enum) this.f83053b).addAllOptions(iterable);
            return this;
        }

        /* renamed from: S */
        public C34247b mo100289S(int i, EnumValue.C34249b bVar) {
            mo100457F();
            ((Enum) this.f83053b).addEnumvalue(i, (EnumValue) bVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C34247b mo100290T(int i, EnumValue enumValue) {
            mo100457F();
            ((Enum) this.f83053b).addEnumvalue(i, enumValue);
            return this;
        }

        /* renamed from: U */
        public C34247b mo100291U(EnumValue.C34249b bVar) {
            mo100457F();
            ((Enum) this.f83053b).addEnumvalue((EnumValue) bVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C34247b mo100292V(EnumValue enumValue) {
            mo100457F();
            ((Enum) this.f83053b).addEnumvalue(enumValue);
            return this;
        }

        /* renamed from: Y */
        public C34247b mo100293Y(int i, Option.C34283b bVar) {
            mo100457F();
            ((Enum) this.f83053b).addOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: Z */
        public C34247b mo100294Z(int i, Option option) {
            mo100457F();
            ((Enum) this.f83053b).addOptions(i, option);
            return this;
        }

        /* renamed from: a0 */
        public C34247b mo100295a0(Option.C34283b bVar) {
            mo100457F();
            ((Enum) this.f83053b).addOptions((Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C34247b mo100296b0(Option option) {
            mo100457F();
            ((Enum) this.f83053b).addOptions(option);
            return this;
        }

        /* renamed from: c0 */
        public C34247b mo100297c0() {
            mo100457F();
            ((Enum) this.f83053b).clearEnumvalue();
            return this;
        }

        /* renamed from: d0 */
        public C34247b mo100298d0() {
            mo100457F();
            ((Enum) this.f83053b).clearName();
            return this;
        }

        /* renamed from: g0 */
        public C34247b mo100299g0() {
            mo100457F();
            ((Enum) this.f83053b).clearOptions();
            return this;
        }

        public EnumValue getEnumvalue(int i) {
            return ((Enum) this.f83053b).getEnumvalue(i);
        }

        public int getEnumvalueCount() {
            return ((Enum) this.f83053b).getEnumvalueCount();
        }

        public List<EnumValue> getEnumvalueList() {
            return Collections.unmodifiableList(((Enum) this.f83053b).getEnumvalueList());
        }

        public String getName() {
            return ((Enum) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Enum) this.f83053b).getNameBytes();
        }

        public Option getOptions(int i) {
            return ((Enum) this.f83053b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Enum) this.f83053b).getOptionsCount();
        }

        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Enum) this.f83053b).getOptionsList());
        }

        public SourceContext getSourceContext() {
            return ((Enum) this.f83053b).getSourceContext();
        }

        public Syntax getSyntax() {
            return ((Enum) this.f83053b).getSyntax();
        }

        public int getSyntaxValue() {
            return ((Enum) this.f83053b).getSyntaxValue();
        }

        /* renamed from: h0 */
        public C34247b mo100300h0() {
            mo100457F();
            ((Enum) this.f83053b).clearSourceContext();
            return this;
        }

        public boolean hasSourceContext() {
            return ((Enum) this.f83053b).hasSourceContext();
        }

        /* renamed from: i0 */
        public C34247b mo100301i0() {
            mo100457F();
            ((Enum) this.f83053b).clearSyntax();
            return this;
        }

        /* renamed from: j0 */
        public C34247b mo100302j0(SourceContext sourceContext) {
            mo100457F();
            ((Enum) this.f83053b).mergeSourceContext(sourceContext);
            return this;
        }

        /* renamed from: k0 */
        public C34247b mo100303k0(int i) {
            mo100457F();
            ((Enum) this.f83053b).removeEnumvalue(i);
            return this;
        }

        /* renamed from: l0 */
        public C34247b mo100304l0(int i) {
            mo100457F();
            ((Enum) this.f83053b).removeOptions(i);
            return this;
        }

        /* renamed from: m0 */
        public C34247b mo100305m0(int i, EnumValue.C34249b bVar) {
            mo100457F();
            ((Enum) this.f83053b).setEnumvalue(i, (EnumValue) bVar.mo100473g());
            return this;
        }

        /* renamed from: o0 */
        public C34247b mo100306o0(int i, EnumValue enumValue) {
            mo100457F();
            ((Enum) this.f83053b).setEnumvalue(i, enumValue);
            return this;
        }

        /* renamed from: q0 */
        public C34247b mo100307q0(String str) {
            mo100457F();
            ((Enum) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: r0 */
        public C34247b mo100308r0(ByteString byteString) {
            mo100457F();
            ((Enum) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: s0 */
        public C34247b mo100309s0(int i, Option.C34283b bVar) {
            mo100457F();
            ((Enum) this.f83053b).setOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: u0 */
        public C34247b mo100310u0(int i, Option option) {
            mo100457F();
            ((Enum) this.f83053b).setOptions(i, option);
            return this;
        }

        /* renamed from: v0 */
        public C34247b mo100311v0(SourceContext.C34289b bVar) {
            mo100457F();
            ((Enum) this.f83053b).setSourceContext((SourceContext) bVar.mo100473g());
            return this;
        }

        /* renamed from: w0 */
        public C34247b mo100312w0(SourceContext sourceContext) {
            mo100457F();
            ((Enum) this.f83053b).setSourceContext(sourceContext);
            return this;
        }

        /* renamed from: x0 */
        public C34247b mo100313x0(Syntax syntax) {
            mo100457F();
            ((Enum) this.f83053b).setSyntax(syntax);
            return this;
        }

        /* renamed from: y0 */
        public C34247b mo100314y0(int i) {
            mo100457F();
            ((Enum) this.f83053b).setSyntaxValue(i);
            return this;
        }

        public C34247b() {
            super(Enum.DEFAULT_INSTANCE);
        }
    }

    static {
        Enum enumR = new Enum();
        DEFAULT_INSTANCE = enumR;
        GeneratedMessageLite.registerDefaultInstance(Enum.class, enumR);
    }

    private Enum() {
    }

    /* access modifiers changed from: private */
    public void addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        ensureEnumvalueIsMutable();
        C34319a.addAll(iterable, this.enumvalue_);
    }

    /* access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        C34319a.addAll(iterable, this.options_);
    }

    /* access modifiers changed from: private */
    public void addEnumvalue(EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue);
    }

    /* access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* access modifiers changed from: private */
    public void clearEnumvalue() {
        this.enumvalue_ = GeneratedMessageLite.emptyProtobufList();
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

    private void ensureEnumvalueIsMutable() {
        C34471v0.C34488k<EnumValue> kVar = this.enumvalue_;
        if (!kVar.mo100971T()) {
            this.enumvalue_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureOptionsIsMutable() {
        C34471v0.C34488k<Option> kVar = this.options_;
        if (!kVar.mo100971T()) {
            this.options_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Enum getDefaultInstance() {
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

    public static C34247b newBuilder() {
        return (C34247b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Enum> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeEnumvalue(int i) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setEnumvalue(int i, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i, enumValue);
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

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34246a.f82918a[methodToInvoke.ordinal()]) {
            case 1:
                return new Enum();
            case 2:
                return new C34247b((C34246a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Enum> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Enum.class) {
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

    public EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public C34338c0 getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    public List<? extends C34338c0> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
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

    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    public static C34247b newBuilder(Enum enumR) {
        return (C34247b) DEFAULT_INSTANCE.createBuilder(enumR);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Enum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Enum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addEnumvalue(int i, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i, enumValue);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Enum parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Enum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Enum parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Enum parseFrom(C34448s sVar) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Enum parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Enum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
