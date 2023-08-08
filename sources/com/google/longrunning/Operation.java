package com.google.longrunning;

import androidx.fragment.app.FragmentManager;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Operation extends GeneratedMessageLite<Operation, C33733b> implements C33744g {
    /* access modifiers changed from: private */
    public static final Operation DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C34504y1<Operation> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private String name_ = "";
    private int resultCase_ = 0;
    private Object result_;

    public enum ResultCase {
        ERROR(4),
        RESPONSE(5),
        RESULT_NOT_SET(0);
        
        private final int value;

        /* access modifiers changed from: public */
        ResultCase(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static ResultCase m135638b(int i) {
            if (i == 0) {
                return RESULT_NOT_SET;
            }
            if (i == 4) {
                return ERROR;
            }
            if (i != 5) {
                return null;
            }
            return RESPONSE;
        }

        @Deprecated
        /* renamed from: g */
        public static ResultCase m135639g(int i) {
            return m135638b(i);
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* renamed from: com.google.longrunning.Operation$a */
    public static /* synthetic */ class C33732a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81877a;

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
                f81877a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81877a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81877a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81877a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81877a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81877a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81877a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.longrunning.Operation.C33732a.<clinit>():void");
        }
    }

    /* renamed from: com.google.longrunning.Operation$b */
    public static final class C33733b extends GeneratedMessageLite.C34263b<Operation, C33733b> implements C33744g {
        public /* synthetic */ C33733b(C33732a aVar) {
            this();
        }

        /* renamed from: P */
        public C33733b mo97993P() {
            mo100457F();
            ((Operation) this.f83053b).clearDone();
            return this;
        }

        /* renamed from: R */
        public C33733b mo97994R() {
            mo100457F();
            ((Operation) this.f83053b).clearError();
            return this;
        }

        /* renamed from: S */
        public C33733b mo97995S() {
            mo100457F();
            ((Operation) this.f83053b).clearMetadata();
            return this;
        }

        /* renamed from: T */
        public C33733b mo97996T() {
            mo100457F();
            ((Operation) this.f83053b).clearName();
            return this;
        }

        /* renamed from: U */
        public C33733b mo97997U() {
            mo100457F();
            ((Operation) this.f83053b).clearResponse();
            return this;
        }

        /* renamed from: V */
        public C33733b mo97998V() {
            mo100457F();
            ((Operation) this.f83053b).clearResult();
            return this;
        }

        /* renamed from: Y */
        public C33733b mo97999Y(Status status) {
            mo100457F();
            ((Operation) this.f83053b).mergeError(status);
            return this;
        }

        /* renamed from: Z */
        public C33733b mo98000Z(Any any) {
            mo100457F();
            ((Operation) this.f83053b).mergeMetadata(any);
            return this;
        }

        /* renamed from: a0 */
        public C33733b mo98001a0(Any any) {
            mo100457F();
            ((Operation) this.f83053b).mergeResponse(any);
            return this;
        }

        /* renamed from: b0 */
        public C33733b mo98002b0(boolean z) {
            mo100457F();
            ((Operation) this.f83053b).setDone(z);
            return this;
        }

        /* renamed from: c0 */
        public C33733b mo98003c0(Status.C34544b bVar) {
            mo100457F();
            ((Operation) this.f83053b).setError((Status) bVar.mo100473g());
            return this;
        }

        /* renamed from: d0 */
        public C33733b mo98004d0(Status status) {
            mo100457F();
            ((Operation) this.f83053b).setError(status);
            return this;
        }

        /* renamed from: g0 */
        public C33733b mo98005g0(Any.C34149b bVar) {
            mo100457F();
            ((Operation) this.f83053b).setMetadata((Any) bVar.mo100473g());
            return this;
        }

        public boolean getDone() {
            return ((Operation) this.f83053b).getDone();
        }

        public Status getError() {
            return ((Operation) this.f83053b).getError();
        }

        public Any getMetadata() {
            return ((Operation) this.f83053b).getMetadata();
        }

        public String getName() {
            return ((Operation) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Operation) this.f83053b).getNameBytes();
        }

        public Any getResponse() {
            return ((Operation) this.f83053b).getResponse();
        }

        public ResultCase getResultCase() {
            return ((Operation) this.f83053b).getResultCase();
        }

        /* renamed from: h0 */
        public C33733b mo98006h0(Any any) {
            mo100457F();
            ((Operation) this.f83053b).setMetadata(any);
            return this;
        }

        public boolean hasError() {
            return ((Operation) this.f83053b).hasError();
        }

        public boolean hasMetadata() {
            return ((Operation) this.f83053b).hasMetadata();
        }

        public boolean hasResponse() {
            return ((Operation) this.f83053b).hasResponse();
        }

        /* renamed from: i0 */
        public C33733b mo98007i0(String str) {
            mo100457F();
            ((Operation) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: j0 */
        public C33733b mo98008j0(ByteString byteString) {
            mo100457F();
            ((Operation) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: k0 */
        public C33733b mo98009k0(Any.C34149b bVar) {
            mo100457F();
            ((Operation) this.f83053b).setResponse((Any) bVar.mo100473g());
            return this;
        }

        /* renamed from: l0 */
        public C33733b mo98010l0(Any any) {
            mo100457F();
            ((Operation) this.f83053b).setResponse(any);
            return this;
        }

        public C33733b() {
            super(Operation.DEFAULT_INSTANCE);
        }
    }

    static {
        Operation operation = new Operation();
        DEFAULT_INSTANCE = operation;
        GeneratedMessageLite.registerDefaultInstance(Operation.class, operation);
    }

    private Operation() {
    }

    /* access modifiers changed from: private */
    public void clearDone() {
        this.done_ = false;
    }

    /* access modifiers changed from: private */
    public void clearError() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearResponse() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static Operation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    public void mergeError(Status status) {
        status.getClass();
        if (this.resultCase_ != 4 || this.result_ == Status.getDefaultInstance()) {
            this.result_ = status;
        } else {
            this.result_ = ((Status.C34544b) Status.newBuilder((Status) this.result_).mo100463K(status)).mo100467Q();
        }
        this.resultCase_ = 4;
    }

    /* access modifiers changed from: private */
    public void mergeMetadata(Any any) {
        any.getClass();
        Any any2 = this.metadata_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.metadata_ = any;
        } else {
            this.metadata_ = (Any) ((Any.C34149b) Any.newBuilder(this.metadata_).mo100463K(any)).mo100467Q();
        }
    }

    /* access modifiers changed from: private */
    public void mergeResponse(Any any) {
        any.getClass();
        if (this.resultCase_ != 5 || this.result_ == Any.getDefaultInstance()) {
            this.result_ = any;
        } else {
            this.result_ = ((Any.C34149b) Any.newBuilder((Any) this.result_).mo100463K(any)).mo100467Q();
        }
        this.resultCase_ = 5;
    }

    public static C33733b newBuilder() {
        return (C33733b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Operation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Operation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Operation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setDone(boolean z) {
        this.done_ = z;
    }

    /* access modifiers changed from: private */
    public void setError(Status status) {
        status.getClass();
        this.result_ = status;
        this.resultCase_ = 4;
    }

    /* access modifiers changed from: private */
    public void setMetadata(Any any) {
        any.getClass();
        this.metadata_ = any;
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
    public void setResponse(Any any) {
        any.getClass();
        this.result_ = any;
        this.resultCase_ = 5;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33732a.f81877a[methodToInvoke.ordinal()]) {
            case 1:
                return new Operation();
            case 2:
                return new C33733b((C33732a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0007\u0004<\u0000\u0005<\u0000", new Object[]{FragmentManager.f49220U, "resultCase_", "name_", "metadata_", "done_", Status.class, Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Operation> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Operation.class) {
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

    public boolean getDone() {
        return this.done_;
    }

    public Status getError() {
        if (this.resultCase_ == 4) {
            return (Status) this.result_;
        }
        return Status.getDefaultInstance();
    }

    public Any getMetadata() {
        Any any = this.metadata_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public Any getResponse() {
        if (this.resultCase_ == 5) {
            return (Any) this.result_;
        }
        return Any.getDefaultInstance();
    }

    public ResultCase getResultCase() {
        return ResultCase.m135638b(this.resultCase_);
    }

    public boolean hasError() {
        return this.resultCase_ == 4;
    }

    public boolean hasMetadata() {
        return this.metadata_ != null;
    }

    public boolean hasResponse() {
        return this.resultCase_ == 5;
    }

    public static C33733b newBuilder(Operation operation) {
        return (C33733b) DEFAULT_INSTANCE.createBuilder(operation);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Operation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Operation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Operation parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Operation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Operation parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Operation parseFrom(InputStream inputStream) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Operation parseFrom(C34448s sVar) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Operation parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
