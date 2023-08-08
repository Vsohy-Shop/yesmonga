package com.google.longrunning;

import com.google.longrunning.Operation;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
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

public final class ListOperationsResponse extends GeneratedMessageLite<ListOperationsResponse, C33731b> implements C33742e {
    /* access modifiers changed from: private */
    public static final ListOperationsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile C34504y1<ListOperationsResponse> PARSER;
    private String nextPageToken_ = "";
    private C34471v0.C34488k<Operation> operations_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.longrunning.ListOperationsResponse$a */
    public static /* synthetic */ class C33730a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81872a;

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
                f81872a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f81872a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f81872a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f81872a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f81872a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f81872a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f81872a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.longrunning.ListOperationsResponse.C33730a.<clinit>():void");
        }
    }

    /* renamed from: com.google.longrunning.ListOperationsResponse$b */
    public static final class C33731b extends GeneratedMessageLite.C34263b<ListOperationsResponse, C33731b> implements C33742e {
        public /* synthetic */ C33731b(C33730a aVar) {
            this();
        }

        /* renamed from: P */
        public C33731b mo97970P(Iterable<? extends Operation> iterable) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).addAllOperations(iterable);
            return this;
        }

        /* renamed from: R */
        public C33731b mo97971R(int i, Operation.C33733b bVar) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).addOperations(i, (Operation) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C33731b mo97972S(int i, Operation operation) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).addOperations(i, operation);
            return this;
        }

        /* renamed from: T */
        public C33731b mo97973T(Operation.C33733b bVar) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).addOperations((Operation) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C33731b mo97974U(Operation operation) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).addOperations(operation);
            return this;
        }

        /* renamed from: V */
        public C33731b mo97975V() {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).clearNextPageToken();
            return this;
        }

        /* renamed from: Y */
        public C33731b mo97976Y() {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).clearOperations();
            return this;
        }

        /* renamed from: Z */
        public C33731b mo97977Z(int i) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).removeOperations(i);
            return this;
        }

        /* renamed from: a0 */
        public C33731b mo97978a0(String str) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).setNextPageToken(str);
            return this;
        }

        /* renamed from: b0 */
        public C33731b mo97979b0(ByteString byteString) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).setNextPageTokenBytes(byteString);
            return this;
        }

        /* renamed from: c0 */
        public C33731b mo97980c0(int i, Operation.C33733b bVar) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).setOperations(i, (Operation) bVar.mo100473g());
            return this;
        }

        /* renamed from: d0 */
        public C33731b mo97981d0(int i, Operation operation) {
            mo100457F();
            ((ListOperationsResponse) this.f83053b).setOperations(i, operation);
            return this;
        }

        public String getNextPageToken() {
            return ((ListOperationsResponse) this.f83053b).getNextPageToken();
        }

        public ByteString getNextPageTokenBytes() {
            return ((ListOperationsResponse) this.f83053b).getNextPageTokenBytes();
        }

        public Operation getOperations(int i) {
            return ((ListOperationsResponse) this.f83053b).getOperations(i);
        }

        public int getOperationsCount() {
            return ((ListOperationsResponse) this.f83053b).getOperationsCount();
        }

        public List<Operation> getOperationsList() {
            return Collections.unmodifiableList(((ListOperationsResponse) this.f83053b).getOperationsList());
        }

        public C33731b() {
            super(ListOperationsResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        ListOperationsResponse listOperationsResponse = new ListOperationsResponse();
        DEFAULT_INSTANCE = listOperationsResponse;
        GeneratedMessageLite.registerDefaultInstance(ListOperationsResponse.class, listOperationsResponse);
    }

    private ListOperationsResponse() {
    }

    /* access modifiers changed from: private */
    public void addAllOperations(Iterable<? extends Operation> iterable) {
        ensureOperationsIsMutable();
        C34319a.addAll(iterable, this.operations_);
    }

    /* access modifiers changed from: private */
    public void addOperations(Operation operation) {
        operation.getClass();
        ensureOperationsIsMutable();
        this.operations_.add(operation);
    }

    /* access modifiers changed from: private */
    public void clearNextPageToken() {
        this.nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    /* access modifiers changed from: private */
    public void clearOperations() {
        this.operations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureOperationsIsMutable() {
        C34471v0.C34488k<Operation> kVar = this.operations_;
        if (!kVar.mo100971T()) {
            this.operations_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static ListOperationsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C33731b newBuilder() {
        return (C33731b) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<ListOperationsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeOperations(int i) {
        ensureOperationsIsMutable();
        this.operations_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setNextPageToken(String str) {
        str.getClass();
        this.nextPageToken_ = str;
    }

    /* access modifiers changed from: private */
    public void setNextPageTokenBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.nextPageToken_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setOperations(int i, Operation operation) {
        operation.getClass();
        ensureOperationsIsMutable();
        this.operations_.set(i, operation);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C33730a.f81872a[methodToInvoke.ordinal()]) {
            case 1:
                return new ListOperationsResponse();
            case 2:
                return new C33731b((C33730a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"operations_", Operation.class, "nextPageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<ListOperationsResponse> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (ListOperationsResponse.class) {
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

    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    public ByteString getNextPageTokenBytes() {
        return ByteString.m137260e0(this.nextPageToken_);
    }

    public Operation getOperations(int i) {
        return this.operations_.get(i);
    }

    public int getOperationsCount() {
        return this.operations_.size();
    }

    public List<Operation> getOperationsList() {
        return this.operations_;
    }

    public C33744g getOperationsOrBuilder(int i) {
        return this.operations_.get(i);
    }

    public List<? extends C33744g> getOperationsOrBuilderList() {
        return this.operations_;
    }

    public static C33731b newBuilder(ListOperationsResponse listOperationsResponse) {
        return (C33731b) DEFAULT_INSTANCE.createBuilder(listOperationsResponse);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static ListOperationsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addOperations(int i, Operation operation) {
        operation.getClass();
        ensureOperationsIsMutable();
        this.operations_.add(i, operation);
    }

    public static ListOperationsResponse parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static ListOperationsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListOperationsResponse parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ListOperationsResponse parseFrom(C34448s sVar) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static ListOperationsResponse parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (ListOperationsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
