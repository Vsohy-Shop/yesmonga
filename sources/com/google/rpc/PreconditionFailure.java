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

public final class PreconditionFailure extends GeneratedMessageLite<PreconditionFailure, C34531b> implements C34573h {
    /* access modifiers changed from: private */
    public static final PreconditionFailure DEFAULT_INSTANCE;
    private static volatile C34504y1<PreconditionFailure> PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private C34471v0.C34488k<Violation> violations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Violation extends GeneratedMessageLite<Violation, C34529a> implements C34532c {
        /* access modifiers changed from: private */
        public static final Violation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile C34504y1<Violation> PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String description_ = "";
        private String subject_ = "";
        private String type_ = "";

        /* renamed from: com.google.rpc.PreconditionFailure$Violation$a */
        public static final class C34529a extends GeneratedMessageLite.C34263b<Violation, C34529a> implements C34532c {
            public /* synthetic */ C34529a(C34530a aVar) {
                this();
            }

            /* renamed from: P */
            public C34529a mo101872P() {
                mo100457F();
                ((Violation) this.f83053b).clearDescription();
                return this;
            }

            /* renamed from: R */
            public C34529a mo101873R() {
                mo100457F();
                ((Violation) this.f83053b).clearSubject();
                return this;
            }

            /* renamed from: S */
            public C34529a mo101874S() {
                mo100457F();
                ((Violation) this.f83053b).clearType();
                return this;
            }

            /* renamed from: T */
            public C34529a mo101875T(String str) {
                mo100457F();
                ((Violation) this.f83053b).setDescription(str);
                return this;
            }

            /* renamed from: U */
            public C34529a mo101876U(ByteString byteString) {
                mo100457F();
                ((Violation) this.f83053b).setDescriptionBytes(byteString);
                return this;
            }

            /* renamed from: V */
            public C34529a mo101877V(String str) {
                mo100457F();
                ((Violation) this.f83053b).setSubject(str);
                return this;
            }

            /* renamed from: Y */
            public C34529a mo101878Y(ByteString byteString) {
                mo100457F();
                ((Violation) this.f83053b).setSubjectBytes(byteString);
                return this;
            }

            /* renamed from: Z */
            public C34529a mo101879Z(String str) {
                mo100457F();
                ((Violation) this.f83053b).setType(str);
                return this;
            }

            /* renamed from: a0 */
            public C34529a mo101880a0(ByteString byteString) {
                mo100457F();
                ((Violation) this.f83053b).setTypeBytes(byteString);
                return this;
            }

            public String getDescription() {
                return ((Violation) this.f83053b).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((Violation) this.f83053b).getDescriptionBytes();
            }

            public String getSubject() {
                return ((Violation) this.f83053b).getSubject();
            }

            public ByteString getSubjectBytes() {
                return ((Violation) this.f83053b).getSubjectBytes();
            }

            public String getType() {
                return ((Violation) this.f83053b).getType();
            }

            public ByteString getTypeBytes() {
                return ((Violation) this.f83053b).getTypeBytes();
            }

            public C34529a() {
                super(Violation.DEFAULT_INSTANCE);
            }
        }

        static {
            Violation violation = new Violation();
            DEFAULT_INSTANCE = violation;
            GeneratedMessageLite.registerDefaultInstance(Violation.class, violation);
        }

        private Violation() {
        }

        /* access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* access modifiers changed from: private */
        public void clearSubject() {
            this.subject_ = getDefaultInstance().getSubject();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static Violation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C34529a newBuilder() {
            return (C34529a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Violation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Violation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C34504y1<Violation> parser() {
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
        public void setSubject(String str) {
            str.getClass();
            this.subject_ = str;
        }

        /* access modifiers changed from: private */
        public void setSubjectBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.subject_ = byteString.mo99228S0();
        }

        /* access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            C34319a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.mo99228S0();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C34530a.f83625a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Violation();
                case 2:
                    return new C34529a((C34530a) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "subject_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C34504y1<Violation> y1Var = PARSER;
                    if (y1Var == null) {
                        synchronized (Violation.class) {
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

        public String getSubject() {
            return this.subject_;
        }

        public ByteString getSubjectBytes() {
            return ByteString.m137260e0(this.subject_);
        }

        public String getType() {
            return this.type_;
        }

        public ByteString getTypeBytes() {
            return ByteString.m137260e0(this.type_);
        }

        public static C34529a newBuilder(Violation violation) {
            return (C34529a) DEFAULT_INSTANCE.createBuilder(violation);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Violation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
        }

        public static Violation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Violation parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
        }

        public static Violation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Violation parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
        }

        public static Violation parseFrom(InputStream inputStream) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
        }

        public static Violation parseFrom(C34448s sVar) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Violation parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
        }
    }

    /* renamed from: com.google.rpc.PreconditionFailure$a */
    public static /* synthetic */ class C34530a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83625a;

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
                f83625a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83625a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83625a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83625a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83625a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83625a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83625a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.PreconditionFailure.C34530a.<clinit>():void");
        }
    }

    /* renamed from: com.google.rpc.PreconditionFailure$b */
    public static final class C34531b extends GeneratedMessageLite.C34263b<PreconditionFailure, C34531b> implements C34573h {
        public /* synthetic */ C34531b(C34530a aVar) {
            this();
        }

        /* renamed from: P */
        public C34531b mo101881P(Iterable<? extends Violation> iterable) {
            mo100457F();
            ((PreconditionFailure) this.f83053b).addAllViolations(iterable);
            return this;
        }

        /* renamed from: R */
        public C34531b mo101882R(int i, Violation.C34529a aVar) {
            mo100457F();
            ((PreconditionFailure) this.f83053b).addViolations(i, (Violation) aVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C34531b mo101883S(int i, Violation violation) {
            mo100457F();
            ((PreconditionFailure) this.f83053b).addViolations(i, violation);
            return this;
        }

        /* renamed from: T */
        public C34531b mo101884T(Violation.C34529a aVar) {
            mo100457F();
            ((PreconditionFailure) this.f83053b).addViolations((Violation) aVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C34531b mo101885U(Violation violation) {
            mo100457F();
            ((PreconditionFailure) this.f83053b).addViolations(violation);
            return this;
        }

        /* renamed from: V */
        public C34531b mo101886V() {
            mo100457F();
            ((PreconditionFailure) this.f83053b).clearViolations();
            return this;
        }

        /* renamed from: Y */
        public C34531b mo101887Y(int i) {
            mo100457F();
            ((PreconditionFailure) this.f83053b).removeViolations(i);
            return this;
        }

        /* renamed from: Z */
        public C34531b mo101888Z(int i, Violation.C34529a aVar) {
            mo100457F();
            ((PreconditionFailure) this.f83053b).setViolations(i, (Violation) aVar.mo100473g());
            return this;
        }

        /* renamed from: a0 */
        public C34531b mo101889a0(int i, Violation violation) {
            mo100457F();
            ((PreconditionFailure) this.f83053b).setViolations(i, violation);
            return this;
        }

        public Violation getViolations(int i) {
            return ((PreconditionFailure) this.f83053b).getViolations(i);
        }

        public int getViolationsCount() {
            return ((PreconditionFailure) this.f83053b).getViolationsCount();
        }

        public List<Violation> getViolationsList() {
            return Collections.unmodifiableList(((PreconditionFailure) this.f83053b).getViolationsList());
        }

        public C34531b() {
            super(PreconditionFailure.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.rpc.PreconditionFailure$c */
    public interface C34532c extends C34417m1 {
        String getDescription();

        ByteString getDescriptionBytes();

        String getSubject();

        ByteString getSubjectBytes();

        String getType();

        ByteString getTypeBytes();
    }

    static {
        PreconditionFailure preconditionFailure = new PreconditionFailure();
        DEFAULT_INSTANCE = preconditionFailure;
        GeneratedMessageLite.registerDefaultInstance(PreconditionFailure.class, preconditionFailure);
    }

    private PreconditionFailure() {
    }

    /* access modifiers changed from: private */
    public void addAllViolations(Iterable<? extends Violation> iterable) {
        ensureViolationsIsMutable();
        C34319a.addAll(iterable, this.violations_);
    }

    /* access modifiers changed from: private */
    public void addViolations(Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(violation);
    }

    /* access modifiers changed from: private */
    public void clearViolations() {
        this.violations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureViolationsIsMutable() {
        C34471v0.C34488k<Violation> kVar = this.violations_;
        if (!kVar.mo100971T()) {
            this.violations_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static PreconditionFailure getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C34531b newBuilder() {
        return (C34531b) DEFAULT_INSTANCE.createBuilder();
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<PreconditionFailure> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeViolations(int i) {
        ensureViolationsIsMutable();
        this.violations_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setViolations(int i, Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.set(i, violation);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34530a.f83625a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreconditionFailure();
            case 2:
                return new C34531b((C34530a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", Violation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<PreconditionFailure> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (PreconditionFailure.class) {
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

    public Violation getViolations(int i) {
        return this.violations_.get(i);
    }

    public int getViolationsCount() {
        return this.violations_.size();
    }

    public List<Violation> getViolationsList() {
        return this.violations_;
    }

    public C34532c getViolationsOrBuilder(int i) {
        return this.violations_.get(i);
    }

    public List<? extends C34532c> getViolationsOrBuilderList() {
        return this.violations_;
    }

    public static C34531b newBuilder(PreconditionFailure preconditionFailure) {
        return (C34531b) DEFAULT_INSTANCE.createBuilder(preconditionFailure);
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static PreconditionFailure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addViolations(int i, Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(i, violation);
    }

    public static PreconditionFailure parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static PreconditionFailure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreconditionFailure parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static PreconditionFailure parseFrom(C34448s sVar) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static PreconditionFailure parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
