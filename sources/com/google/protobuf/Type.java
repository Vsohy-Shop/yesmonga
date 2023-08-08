package com.google.protobuf;

import com.google.protobuf.C34471v0;
import com.google.protobuf.Field;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Type extends GeneratedMessageLite<Type, C34300b> implements C34464t2 {
    /* access modifiers changed from: private */
    public static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile C34504y1<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private C34471v0.C34488k<Field> fields_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";
    private C34471v0.C34488k<String> oneofs_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<Option> options_ = GeneratedMessageLite.emptyProtobufList();
    private SourceContext sourceContext_;
    private int syntax_;

    /* renamed from: com.google.protobuf.Type$a */
    public static /* synthetic */ class C34299a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83121a;

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
                f83121a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83121a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83121a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83121a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83121a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83121a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83121a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Type.C34299a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.Type$b */
    public static final class C34300b extends GeneratedMessageLite.C34263b<Type, C34300b> implements C34464t2 {
        public /* synthetic */ C34300b(C34299a aVar) {
            this();
        }

        /* renamed from: B0 */
        public C34300b mo100692B0(SourceContext.C34289b bVar) {
            mo100457F();
            ((Type) this.f83053b).setSourceContext((SourceContext) bVar.mo100473g());
            return this;
        }

        /* renamed from: D0 */
        public C34300b mo100693D0(SourceContext sourceContext) {
            mo100457F();
            ((Type) this.f83053b).setSourceContext(sourceContext);
            return this;
        }

        /* renamed from: E0 */
        public C34300b mo100694E0(Syntax syntax) {
            mo100457F();
            ((Type) this.f83053b).setSyntax(syntax);
            return this;
        }

        /* renamed from: F0 */
        public C34300b mo100695F0(int i) {
            mo100457F();
            ((Type) this.f83053b).setSyntaxValue(i);
            return this;
        }

        /* renamed from: P */
        public C34300b mo100696P(Iterable<? extends Field> iterable) {
            mo100457F();
            ((Type) this.f83053b).addAllFields(iterable);
            return this;
        }

        /* renamed from: R */
        public C34300b mo100697R(Iterable<String> iterable) {
            mo100457F();
            ((Type) this.f83053b).addAllOneofs(iterable);
            return this;
        }

        /* renamed from: S */
        public C34300b mo100698S(Iterable<? extends Option> iterable) {
            mo100457F();
            ((Type) this.f83053b).addAllOptions(iterable);
            return this;
        }

        /* renamed from: T */
        public C34300b mo100699T(int i, Field.C34255b bVar) {
            mo100457F();
            ((Type) this.f83053b).addFields(i, (Field) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C34300b mo100700U(int i, Field field) {
            mo100457F();
            ((Type) this.f83053b).addFields(i, field);
            return this;
        }

        /* renamed from: V */
        public C34300b mo100701V(Field.C34255b bVar) {
            mo100457F();
            ((Type) this.f83053b).addFields((Field) bVar.mo100473g());
            return this;
        }

        /* renamed from: Y */
        public C34300b mo100702Y(Field field) {
            mo100457F();
            ((Type) this.f83053b).addFields(field);
            return this;
        }

        /* renamed from: Z */
        public C34300b mo100703Z(String str) {
            mo100457F();
            ((Type) this.f83053b).addOneofs(str);
            return this;
        }

        /* renamed from: a0 */
        public C34300b mo100704a0(ByteString byteString) {
            mo100457F();
            ((Type) this.f83053b).addOneofsBytes(byteString);
            return this;
        }

        /* renamed from: b0 */
        public C34300b mo100705b0(int i, Option.C34283b bVar) {
            mo100457F();
            ((Type) this.f83053b).addOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: c0 */
        public C34300b mo100706c0(int i, Option option) {
            mo100457F();
            ((Type) this.f83053b).addOptions(i, option);
            return this;
        }

        /* renamed from: d0 */
        public C34300b mo100707d0(Option.C34283b bVar) {
            mo100457F();
            ((Type) this.f83053b).addOptions((Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: g0 */
        public C34300b mo100708g0(Option option) {
            mo100457F();
            ((Type) this.f83053b).addOptions(option);
            return this;
        }

        public Field getFields(int i) {
            return ((Type) this.f83053b).getFields(i);
        }

        public int getFieldsCount() {
            return ((Type) this.f83053b).getFieldsCount();
        }

        public List<Field> getFieldsList() {
            return Collections.unmodifiableList(((Type) this.f83053b).getFieldsList());
        }

        public String getName() {
            return ((Type) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Type) this.f83053b).getNameBytes();
        }

        public String getOneofs(int i) {
            return ((Type) this.f83053b).getOneofs(i);
        }

        public ByteString getOneofsBytes(int i) {
            return ((Type) this.f83053b).getOneofsBytes(i);
        }

        public int getOneofsCount() {
            return ((Type) this.f83053b).getOneofsCount();
        }

        public List<String> getOneofsList() {
            return Collections.unmodifiableList(((Type) this.f83053b).getOneofsList());
        }

        public Option getOptions(int i) {
            return ((Type) this.f83053b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((Type) this.f83053b).getOptionsCount();
        }

        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Type) this.f83053b).getOptionsList());
        }

        public SourceContext getSourceContext() {
            return ((Type) this.f83053b).getSourceContext();
        }

        public Syntax getSyntax() {
            return ((Type) this.f83053b).getSyntax();
        }

        public int getSyntaxValue() {
            return ((Type) this.f83053b).getSyntaxValue();
        }

        /* renamed from: h0 */
        public C34300b mo100709h0() {
            mo100457F();
            ((Type) this.f83053b).clearFields();
            return this;
        }

        public boolean hasSourceContext() {
            return ((Type) this.f83053b).hasSourceContext();
        }

        /* renamed from: i0 */
        public C34300b mo100710i0() {
            mo100457F();
            ((Type) this.f83053b).clearName();
            return this;
        }

        /* renamed from: j0 */
        public C34300b mo100711j0() {
            mo100457F();
            ((Type) this.f83053b).clearOneofs();
            return this;
        }

        /* renamed from: k0 */
        public C34300b mo100712k0() {
            mo100457F();
            ((Type) this.f83053b).clearOptions();
            return this;
        }

        /* renamed from: l0 */
        public C34300b mo100713l0() {
            mo100457F();
            ((Type) this.f83053b).clearSourceContext();
            return this;
        }

        /* renamed from: m0 */
        public C34300b mo100714m0() {
            mo100457F();
            ((Type) this.f83053b).clearSyntax();
            return this;
        }

        /* renamed from: o0 */
        public C34300b mo100715o0(SourceContext sourceContext) {
            mo100457F();
            ((Type) this.f83053b).mergeSourceContext(sourceContext);
            return this;
        }

        /* renamed from: q0 */
        public C34300b mo100716q0(int i) {
            mo100457F();
            ((Type) this.f83053b).removeFields(i);
            return this;
        }

        /* renamed from: r0 */
        public C34300b mo100717r0(int i) {
            mo100457F();
            ((Type) this.f83053b).removeOptions(i);
            return this;
        }

        /* renamed from: s0 */
        public C34300b mo100718s0(int i, Field.C34255b bVar) {
            mo100457F();
            ((Type) this.f83053b).setFields(i, (Field) bVar.mo100473g());
            return this;
        }

        /* renamed from: u0 */
        public C34300b mo100719u0(int i, Field field) {
            mo100457F();
            ((Type) this.f83053b).setFields(i, field);
            return this;
        }

        /* renamed from: v0 */
        public C34300b mo100720v0(String str) {
            mo100457F();
            ((Type) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: w0 */
        public C34300b mo100721w0(ByteString byteString) {
            mo100457F();
            ((Type) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: x0 */
        public C34300b mo100722x0(int i, String str) {
            mo100457F();
            ((Type) this.f83053b).setOneofs(i, str);
            return this;
        }

        /* renamed from: y0 */
        public C34300b mo100723y0(int i, Option.C34283b bVar) {
            mo100457F();
            ((Type) this.f83053b).setOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: z0 */
        public C34300b mo100724z0(int i, Option option) {
            mo100457F();
            ((Type) this.f83053b).setOptions(i, option);
            return this;
        }

        public C34300b() {
            super(Type.DEFAULT_INSTANCE);
        }
    }

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        GeneratedMessageLite.registerDefaultInstance(Type.class, type);
    }

    private Type() {
    }

    /* access modifiers changed from: private */
    public void addAllFields(Iterable<? extends Field> iterable) {
        ensureFieldsIsMutable();
        C34319a.addAll(iterable, this.fields_);
    }

    /* access modifiers changed from: private */
    public void addAllOneofs(Iterable<String> iterable) {
        ensureOneofsIsMutable();
        C34319a.addAll(iterable, this.oneofs_);
    }

    /* access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        C34319a.addAll(iterable, this.options_);
    }

    /* access modifiers changed from: private */
    public void addFields(Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    /* access modifiers changed from: private */
    public void addOneofs(String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(str);
    }

    /* access modifiers changed from: private */
    public void addOneofsBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensureOneofsIsMutable();
        this.oneofs_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
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

    private void ensureFieldsIsMutable() {
        C34471v0.C34488k<Field> kVar = this.fields_;
        if (!kVar.mo100971T()) {
            this.fields_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureOneofsIsMutable() {
        C34471v0.C34488k<String> kVar = this.oneofs_;
        if (!kVar.mo100971T()) {
            this.oneofs_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureOptionsIsMutable() {
        C34471v0.C34488k<Option> kVar = this.options_;
        if (!kVar.mo100971T()) {
            this.options_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Type getDefaultInstance() {
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

    public static C34300b newBuilder() {
        return (C34300b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeFields(int i) {
        ensureFieldsIsMutable();
        this.fields_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setFields(int i, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i, field);
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
    public void setOneofs(int i, String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(i, str);
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
        switch (C34299a.f83121a[methodToInvoke.ordinal()]) {
            case 1:
                return new Type();
            case 2:
                return new C34300b((C34299a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Type> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Type.class) {
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

    public Field getFields(int i) {
        return this.fields_.get(i);
    }

    public int getFieldsCount() {
        return this.fields_.size();
    }

    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public C34420n0 getFieldsOrBuilder(int i) {
        return this.fields_.get(i);
    }

    public List<? extends C34420n0> getFieldsOrBuilderList() {
        return this.fields_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public String getOneofs(int i) {
        return this.oneofs_.get(i);
    }

    public ByteString getOneofsBytes(int i) {
        return ByteString.m137260e0(this.oneofs_.get(i));
    }

    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    public List<String> getOneofsList() {
        return this.oneofs_;
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

    public static C34300b newBuilder(Type type) {
        return (C34300b) DEFAULT_INSTANCE.createBuilder(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Type parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addFields(int i, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i, field);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Type parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Type parseFrom(C34448s sVar) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Type parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
