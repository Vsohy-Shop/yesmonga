package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34417m1;
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

public final class BadRequest extends GeneratedMessageLite<BadRequest, C34514b> implements C34545a {
    /* access modifiers changed from: private */
    public static final BadRequest DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile C34504y1<BadRequest> PARSER;
    private C34471v0.C34488k<FieldViolation> fieldViolations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class FieldViolation extends GeneratedMessageLite<FieldViolation, C34512a> implements C34515c {
        /* access modifiers changed from: private */
        public static final FieldViolation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile C34504y1<FieldViolation> PARSER;
        private String description_ = "";
        private String field_ = "";

        /* renamed from: com.google.rpc.BadRequest$FieldViolation$a */
        public static final class C34512a extends GeneratedMessageLite.C34263b<FieldViolation, C34512a> implements C34515c {
            public /* synthetic */ C34512a(C34513a aVar) {
                this();
            }

            /* renamed from: P */
            public C34512a mo101777P() {
                mo100457F();
                ((FieldViolation) this.f83053b).clearDescription();
                return this;
            }

            /* renamed from: R */
            public C34512a mo101778R() {
                mo100457F();
                ((FieldViolation) this.f83053b).clearField();
                return this;
            }

            /* renamed from: S */
            public C34512a mo101779S(String str) {
                mo100457F();
                ((FieldViolation) this.f83053b).setDescription(str);
                return this;
            }

            /* renamed from: T */
            public C34512a mo101780T(ByteString byteString) {
                mo100457F();
                ((FieldViolation) this.f83053b).setDescriptionBytes(byteString);
                return this;
            }

            /* renamed from: U */
            public C34512a mo101781U(String str) {
                mo100457F();
                ((FieldViolation) this.f83053b).setField(str);
                return this;
            }

            /* renamed from: V */
            public C34512a mo101782V(ByteString byteString) {
                mo100457F();
                ((FieldViolation) this.f83053b).setFieldBytes(byteString);
                return this;
            }

            public String getDescription() {
                return ((FieldViolation) this.f83053b).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((FieldViolation) this.f83053b).getDescriptionBytes();
            }

            public String getField() {
                return ((FieldViolation) this.f83053b).getField();
            }

            public ByteString getFieldBytes() {
                return ((FieldViolation) this.f83053b).getFieldBytes();
            }

            public C34512a() {
                super(FieldViolation.DEFAULT_INSTANCE);
            }
        }

        static {
            FieldViolation fieldViolation = new FieldViolation();
            DEFAULT_INSTANCE = fieldViolation;
            GeneratedMessageLite.registerDefaultInstance(FieldViolation.class, fieldViolation);
        }

        private FieldViolation() {
        }

        /* access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* access modifiers changed from: private */
        public void clearField() {
            this.field_ = getDefaultInstance().getField();
        }

        public static FieldViolation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34512a newBuilder() {
            return (C34512a) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<FieldViolation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.description_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setField(String str) {
            str.getClass();
            this.field_ = str;
        }

        /* access modifiers changed from: private */
        public void setFieldBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.field_ = byteString.mo99228S0();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34513a.f83581a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldViolation();
                case 2:
                    return new C34512a((C34513a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"field_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<FieldViolation> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (FieldViolation.class) {
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

        public String getDescription() {
            return this.description_;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.m137260e0(this.description_);
        }

        public String getField() {
            return this.field_;
        }

        public ByteString getFieldBytes() {
            return ByteString.m137260e0(this.field_);
        }

        public static C34512a newBuilder(FieldViolation fieldViolation) {
            return (C34512a) DEFAULT_INSTANCE.createBuilder(fieldViolation);
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static FieldViolation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FieldViolation parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static FieldViolation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldViolation parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static FieldViolation parseFrom(InputStream inputStream) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldViolation parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static FieldViolation parseFrom(C34448s sVar) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static FieldViolation parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (FieldViolation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    /* renamed from: com.google.rpc.BadRequest$a */
    public static /* synthetic */ class C34513a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83581a;

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
                f83581a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83581a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83581a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83581a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83581a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83581a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83581a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.BadRequest.C34513a.<clinit>():void");
        }
    }

    /* renamed from: com.google.rpc.BadRequest$b */
    public static final class C34514b extends GeneratedMessageLite.C34263b<BadRequest, C34514b> implements C34545a {
        public /* synthetic */ C34514b(C34513a aVar) {
            this();
        }

        /* renamed from: P */
        public C34514b mo101783P(Iterable<? extends FieldViolation> iterable) {
            mo100457F();
            ((BadRequest) this.f83053b).addAllFieldViolations(iterable);
            return this;
        }

        /* renamed from: R */
        public C34514b mo101784R(int i, FieldViolation.C34512a aVar) {
            mo100457F();
            ((BadRequest) this.f83053b).addFieldViolations(i, (FieldViolation) aVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C34514b mo101785S(int i, FieldViolation fieldViolation) {
            mo100457F();
            ((BadRequest) this.f83053b).addFieldViolations(i, fieldViolation);
            return this;
        }

        /* renamed from: T */
        public C34514b mo101786T(FieldViolation.C34512a aVar) {
            mo100457F();
            ((BadRequest) this.f83053b).addFieldViolations((FieldViolation) aVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C34514b mo101787U(FieldViolation fieldViolation) {
            mo100457F();
            ((BadRequest) this.f83053b).addFieldViolations(fieldViolation);
            return this;
        }

        /* renamed from: V */
        public C34514b mo101788V() {
            mo100457F();
            ((BadRequest) this.f83053b).clearFieldViolations();
            return this;
        }

        /* renamed from: Y */
        public C34514b mo101789Y(int i) {
            mo100457F();
            ((BadRequest) this.f83053b).removeFieldViolations(i);
            return this;
        }

        /* renamed from: Z */
        public C34514b mo101790Z(int i, FieldViolation.C34512a aVar) {
            mo100457F();
            ((BadRequest) this.f83053b).setFieldViolations(i, (FieldViolation) aVar.mo100473g());
            return this;
        }

        /* renamed from: a0 */
        public C34514b mo101791a0(int i, FieldViolation fieldViolation) {
            mo100457F();
            ((BadRequest) this.f83053b).setFieldViolations(i, fieldViolation);
            return this;
        }

        public FieldViolation getFieldViolations(int i) {
            return ((BadRequest) this.f83053b).getFieldViolations(i);
        }

        public int getFieldViolationsCount() {
            return ((BadRequest) this.f83053b).getFieldViolationsCount();
        }

        public List<FieldViolation> getFieldViolationsList() {
            return Collections.unmodifiableList(((BadRequest) this.f83053b).getFieldViolationsList());
        }

        public C34514b() {
            super(BadRequest.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.rpc.BadRequest$c */
    public interface C34515c extends C34417m1 {
        String getDescription();

        ByteString getDescriptionBytes();

        String getField();

        ByteString getFieldBytes();
    }

    static {
        BadRequest badRequest = new BadRequest();
        DEFAULT_INSTANCE = badRequest;
        GeneratedMessageLite.registerDefaultInstance(BadRequest.class, badRequest);
    }

    private BadRequest() {
    }

    /* access modifiers changed from: private */
    public void addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
        ensureFieldViolationsIsMutable();
        C34319a.addAll(iterable, this.fieldViolations_);
    }

    /* access modifiers changed from: private */
    public void addFieldViolations(FieldViolation fieldViolation) {
        fieldViolation.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(fieldViolation);
    }

    /* access modifiers changed from: private */
    public void clearFieldViolations() {
        this.fieldViolations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFieldViolationsIsMutable() {
        C34471v0.C34488k<FieldViolation> kVar = this.fieldViolations_;
        if (!kVar.mo100971T()) {
            this.fieldViolations_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static BadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C34514b newBuilder() {
        return (C34514b) DEFAULT_INSTANCE.createBuilder();
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<BadRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeFieldViolations(int i) {
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setFieldViolations(int i, FieldViolation fieldViolation) {
        fieldViolation.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.set(i, fieldViolation);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34513a.f83581a[methodToInvoke.ordinal()]) {
            case 1:
                return new BadRequest();
            case 2:
                return new C34514b((C34513a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldViolations_", FieldViolation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<BadRequest> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (BadRequest.class) {
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

    public FieldViolation getFieldViolations(int i) {
        return this.fieldViolations_.get(i);
    }

    public int getFieldViolationsCount() {
        return this.fieldViolations_.size();
    }

    public List<FieldViolation> getFieldViolationsList() {
        return this.fieldViolations_;
    }

    public C34515c getFieldViolationsOrBuilder(int i) {
        return this.fieldViolations_.get(i);
    }

    public List<? extends C34515c> getFieldViolationsOrBuilderList() {
        return this.fieldViolations_;
    }

    public static C34514b newBuilder(BadRequest badRequest) {
        return (C34514b) DEFAULT_INSTANCE.createBuilder(badRequest);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static BadRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addFieldViolations(int i, FieldViolation fieldViolation) {
        fieldViolation.getClass();
        ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(i, fieldViolation);
    }

    public static BadRequest parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static BadRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BadRequest parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static BadRequest parseFrom(InputStream inputStream) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BadRequest parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static BadRequest parseFrom(C34448s sVar) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static BadRequest parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (BadRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
