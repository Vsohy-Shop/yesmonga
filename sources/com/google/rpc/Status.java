package com.google.rpc;

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

public final class Status extends GeneratedMessageLite<Status, C34544b> implements C34578m {
    public static final int CODE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Status DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile C34504y1<Status> PARSER;
    private int code_;
    private C34471v0.C34488k<Any> details_ = GeneratedMessageLite.emptyProtobufList();
    private String message_ = "";

    /* renamed from: com.google.rpc.Status$a */
    public static /* synthetic */ class C34543a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83630a;

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
                f83630a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83630a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83630a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83630a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83630a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83630a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83630a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.Status.C34543a.<clinit>():void");
        }
    }

    /* renamed from: com.google.rpc.Status$b */
    public static final class C34544b extends GeneratedMessageLite.C34263b<Status, C34544b> implements C34578m {
        public /* synthetic */ C34544b(C34543a aVar) {
            this();
        }

        /* renamed from: P */
        public C34544b mo101958P(Iterable<? extends Any> iterable) {
            mo100457F();
            ((Status) this.f83053b).addAllDetails(iterable);
            return this;
        }

        /* renamed from: R */
        public C34544b mo101959R(int i, Any.C34149b bVar) {
            mo100457F();
            ((Status) this.f83053b).addDetails(i, (Any) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C34544b mo101960S(int i, Any any) {
            mo100457F();
            ((Status) this.f83053b).addDetails(i, any);
            return this;
        }

        /* renamed from: T */
        public C34544b mo101961T(Any.C34149b bVar) {
            mo100457F();
            ((Status) this.f83053b).addDetails((Any) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C34544b mo101962U(Any any) {
            mo100457F();
            ((Status) this.f83053b).addDetails(any);
            return this;
        }

        /* renamed from: V */
        public C34544b mo101963V() {
            mo100457F();
            ((Status) this.f83053b).clearCode();
            return this;
        }

        /* renamed from: Y */
        public C34544b mo101964Y() {
            mo100457F();
            ((Status) this.f83053b).clearDetails();
            return this;
        }

        /* renamed from: Z */
        public C34544b mo101965Z() {
            mo100457F();
            ((Status) this.f83053b).clearMessage();
            return this;
        }

        /* renamed from: a0 */
        public C34544b mo101966a0(int i) {
            mo100457F();
            ((Status) this.f83053b).removeDetails(i);
            return this;
        }

        /* renamed from: b0 */
        public C34544b mo101967b0(int i) {
            mo100457F();
            ((Status) this.f83053b).setCode(i);
            return this;
        }

        /* renamed from: c0 */
        public C34544b mo101968c0(int i, Any.C34149b bVar) {
            mo100457F();
            ((Status) this.f83053b).setDetails(i, (Any) bVar.mo100473g());
            return this;
        }

        /* renamed from: d0 */
        public C34544b mo101969d0(int i, Any any) {
            mo100457F();
            ((Status) this.f83053b).setDetails(i, any);
            return this;
        }

        /* renamed from: g0 */
        public C34544b mo101970g0(String str) {
            mo100457F();
            ((Status) this.f83053b).setMessage(str);
            return this;
        }

        public int getCode() {
            return ((Status) this.f83053b).getCode();
        }

        public Any getDetails(int i) {
            return ((Status) this.f83053b).getDetails(i);
        }

        public int getDetailsCount() {
            return ((Status) this.f83053b).getDetailsCount();
        }

        public List<Any> getDetailsList() {
            return Collections.unmodifiableList(((Status) this.f83053b).getDetailsList());
        }

        public String getMessage() {
            return ((Status) this.f83053b).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((Status) this.f83053b).getMessageBytes();
        }

        /* renamed from: h0 */
        public C34544b mo101971h0(ByteString byteString) {
            mo100457F();
            ((Status) this.f83053b).setMessageBytes(byteString);
            return this;
        }

        public C34544b() {
            super(Status.DEFAULT_INSTANCE);
        }
    }

    static {
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        GeneratedMessageLite.registerDefaultInstance(Status.class, status);
    }

    private Status() {
    }

    /* access modifiers changed from: private */
    public void addAllDetails(Iterable<? extends Any> iterable) {
        ensureDetailsIsMutable();
        C34319a.addAll(iterable, this.details_);
    }

    /* access modifiers changed from: private */
    public void addDetails(Any any) {
        any.getClass();
        ensureDetailsIsMutable();
        this.details_.add(any);
    }

    /* access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    private void ensureDetailsIsMutable() {
        C34471v0.C34488k<Any> kVar = this.details_;
        if (!kVar.mo100971T()) {
            this.details_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C34544b newBuilder() {
        return (C34544b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Status> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeDetails(int i) {
        ensureDetailsIsMutable();
        this.details_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* access modifiers changed from: private */
    public void setDetails(int i, Any any) {
        any.getClass();
        ensureDetailsIsMutable();
        this.details_.set(i, any);
    }

    /* access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34543a.f83630a[methodToInvoke.ordinal()]) {
            case 1:
                return new Status();
            case 2:
                return new C34544b((C34543a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Status> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Status.class) {
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

    public int getCode() {
        return this.code_;
    }

    public Any getDetails(int i) {
        return this.details_.get(i);
    }

    public int getDetailsCount() {
        return this.details_.size();
    }

    public List<Any> getDetailsList() {
        return this.details_;
    }

    public C34361f getDetailsOrBuilder(int i) {
        return this.details_.get(i);
    }

    public List<? extends C34361f> getDetailsOrBuilderList() {
        return this.details_;
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.m137260e0(this.message_);
    }

    public static C34544b newBuilder(Status status) {
        return (C34544b) DEFAULT_INSTANCE.createBuilder(status);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Status parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addDetails(int i, Any any) {
        any.getClass();
        ensureDetailsIsMutable();
        this.details_.add(i, any);
    }

    public static Status parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Status parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Status parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Status parseFrom(C34448s sVar) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Status parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
