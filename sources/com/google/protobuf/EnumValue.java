package com.google.protobuf;

import com.google.protobuf.C34471v0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Option;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class EnumValue extends GeneratedMessageLite<EnumValue, C34249b> implements C34338c0 {
    /* access modifiers changed from: private */
    public static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile C34504y1<EnumValue> PARSER;
    private String name_ = "";
    private int number_;
    private C34471v0.C34488k<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.protobuf.EnumValue$a */
    public static /* synthetic */ class C34248a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f82919a;

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
                f82919a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f82919a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f82919a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f82919a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f82919a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f82919a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f82919a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.EnumValue.C34248a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.EnumValue$b */
    public static final class C34249b extends GeneratedMessageLite.C34263b<EnumValue, C34249b> implements C34338c0 {
        public /* synthetic */ C34249b(C34248a aVar) {
            this();
        }

        /* renamed from: P */
        public C34249b mo100323P(Iterable<? extends Option> iterable) {
            mo100457F();
            ((EnumValue) this.f83053b).addAllOptions(iterable);
            return this;
        }

        /* renamed from: R */
        public C34249b mo100324R(int i, Option.C34283b bVar) {
            mo100457F();
            ((EnumValue) this.f83053b).addOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C34249b mo100325S(int i, Option option) {
            mo100457F();
            ((EnumValue) this.f83053b).addOptions(i, option);
            return this;
        }

        /* renamed from: T */
        public C34249b mo100326T(Option.C34283b bVar) {
            mo100457F();
            ((EnumValue) this.f83053b).addOptions((Option) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C34249b mo100327U(Option option) {
            mo100457F();
            ((EnumValue) this.f83053b).addOptions(option);
            return this;
        }

        /* renamed from: V */
        public C34249b mo100328V() {
            mo100457F();
            ((EnumValue) this.f83053b).clearName();
            return this;
        }

        /* renamed from: Y */
        public C34249b mo100329Y() {
            mo100457F();
            ((EnumValue) this.f83053b).clearNumber();
            return this;
        }

        /* renamed from: Z */
        public C34249b mo100330Z() {
            mo100457F();
            ((EnumValue) this.f83053b).clearOptions();
            return this;
        }

        /* renamed from: a0 */
        public C34249b mo100331a0(int i) {
            mo100457F();
            ((EnumValue) this.f83053b).removeOptions(i);
            return this;
        }

        /* renamed from: b0 */
        public C34249b mo100332b0(String str) {
            mo100457F();
            ((EnumValue) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: c0 */
        public C34249b mo100333c0(ByteString byteString) {
            mo100457F();
            ((EnumValue) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: d0 */
        public C34249b mo100334d0(int i) {
            mo100457F();
            ((EnumValue) this.f83053b).setNumber(i);
            return this;
        }

        /* renamed from: g0 */
        public C34249b mo100335g0(int i, Option.C34283b bVar) {
            mo100457F();
            ((EnumValue) this.f83053b).setOptions(i, (Option) bVar.mo100473g());
            return this;
        }

        public String getName() {
            return ((EnumValue) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((EnumValue) this.f83053b).getNameBytes();
        }

        public int getNumber() {
            return ((EnumValue) this.f83053b).getNumber();
        }

        public Option getOptions(int i) {
            return ((EnumValue) this.f83053b).getOptions(i);
        }

        public int getOptionsCount() {
            return ((EnumValue) this.f83053b).getOptionsCount();
        }

        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((EnumValue) this.f83053b).getOptionsList());
        }

        /* renamed from: h0 */
        public C34249b mo100336h0(int i, Option option) {
            mo100457F();
            ((EnumValue) this.f83053b).setOptions(i, option);
            return this;
        }

        public C34249b() {
            super(EnumValue.DEFAULT_INSTANCE);
        }
    }

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        GeneratedMessageLite.registerDefaultInstance(EnumValue.class, enumValue);
    }

    private EnumValue() {
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
    public void clearNumber() {
        this.number_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureOptionsIsMutable() {
        C34471v0.C34488k<Option> kVar = this.options_;
        if (!kVar.mo100971T()) {
            this.options_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C34249b newBuilder() {
        return (C34249b) DEFAULT_INSTANCE.createBuilder();
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<EnumValue> parser() {
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
    public void setNumber(int i) {
        this.number_ = i;
    }

    /* access modifiers changed from: private */
    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34248a.f82919a[methodToInvoke.ordinal()]) {
            case 1:
                return new EnumValue();
            case 2:
                return new C34249b((C34248a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<EnumValue> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (EnumValue.class) {
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

    public int getNumber() {
        return this.number_;
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

    public static C34249b newBuilder(EnumValue enumValue) {
        return (C34249b) DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static EnumValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static EnumValue parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static EnumValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EnumValue parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static EnumValue parseFrom(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static EnumValue parseFrom(C34448s sVar) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static EnumValue parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (EnumValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
