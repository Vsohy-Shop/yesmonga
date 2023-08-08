package com.google.api;

import com.google.api.LabelDescriptor;
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

public final class LogDescriptor extends GeneratedMessageLite<LogDescriptor, C32313b> implements C32419n0 {
    /* access modifiers changed from: private */
    public static final LogDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C34504y1<LogDescriptor> PARSER;
    private String description_ = "";
    private String displayName_ = "";
    private C34471v0.C34488k<LabelDescriptor> labels_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";

    /* renamed from: com.google.api.LogDescriptor$a */
    public static /* synthetic */ class C32312a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78707a;

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
                f78707a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78707a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78707a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78707a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78707a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78707a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78707a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.LogDescriptor.C32312a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.LogDescriptor$b */
    public static final class C32313b extends GeneratedMessageLite.C34263b<LogDescriptor, C32313b> implements C32419n0 {
        public /* synthetic */ C32313b(C32312a aVar) {
            this();
        }

        /* renamed from: P */
        public C32313b mo93702P(Iterable<? extends LabelDescriptor> iterable) {
            mo100457F();
            ((LogDescriptor) this.f83053b).addAllLabels(iterable);
            return this;
        }

        /* renamed from: R */
        public C32313b mo93703R(int i, LabelDescriptor.C32309b bVar) {
            mo100457F();
            ((LogDescriptor) this.f83053b).addLabels(i, (LabelDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32313b mo93704S(int i, LabelDescriptor labelDescriptor) {
            mo100457F();
            ((LogDescriptor) this.f83053b).addLabels(i, labelDescriptor);
            return this;
        }

        /* renamed from: T */
        public C32313b mo93705T(LabelDescriptor.C32309b bVar) {
            mo100457F();
            ((LogDescriptor) this.f83053b).addLabels((LabelDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32313b mo93706U(LabelDescriptor labelDescriptor) {
            mo100457F();
            ((LogDescriptor) this.f83053b).addLabels(labelDescriptor);
            return this;
        }

        /* renamed from: V */
        public C32313b mo93707V() {
            mo100457F();
            ((LogDescriptor) this.f83053b).clearDescription();
            return this;
        }

        /* renamed from: Y */
        public C32313b mo93708Y() {
            mo100457F();
            ((LogDescriptor) this.f83053b).clearDisplayName();
            return this;
        }

        /* renamed from: Z */
        public C32313b mo93709Z() {
            mo100457F();
            ((LogDescriptor) this.f83053b).clearLabels();
            return this;
        }

        /* renamed from: a0 */
        public C32313b mo93710a0() {
            mo100457F();
            ((LogDescriptor) this.f83053b).clearName();
            return this;
        }

        /* renamed from: b0 */
        public C32313b mo93711b0(int i) {
            mo100457F();
            ((LogDescriptor) this.f83053b).removeLabels(i);
            return this;
        }

        /* renamed from: c0 */
        public C32313b mo93712c0(String str) {
            mo100457F();
            ((LogDescriptor) this.f83053b).setDescription(str);
            return this;
        }

        /* renamed from: d0 */
        public C32313b mo93713d0(ByteString byteString) {
            mo100457F();
            ((LogDescriptor) this.f83053b).setDescriptionBytes(byteString);
            return this;
        }

        /* renamed from: g0 */
        public C32313b mo93714g0(String str) {
            mo100457F();
            ((LogDescriptor) this.f83053b).setDisplayName(str);
            return this;
        }

        public String getDescription() {
            return ((LogDescriptor) this.f83053b).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((LogDescriptor) this.f83053b).getDescriptionBytes();
        }

        public String getDisplayName() {
            return ((LogDescriptor) this.f83053b).getDisplayName();
        }

        public ByteString getDisplayNameBytes() {
            return ((LogDescriptor) this.f83053b).getDisplayNameBytes();
        }

        public LabelDescriptor getLabels(int i) {
            return ((LogDescriptor) this.f83053b).getLabels(i);
        }

        public int getLabelsCount() {
            return ((LogDescriptor) this.f83053b).getLabelsCount();
        }

        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((LogDescriptor) this.f83053b).getLabelsList());
        }

        public String getName() {
            return ((LogDescriptor) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((LogDescriptor) this.f83053b).getNameBytes();
        }

        /* renamed from: h0 */
        public C32313b mo93715h0(ByteString byteString) {
            mo100457F();
            ((LogDescriptor) this.f83053b).setDisplayNameBytes(byteString);
            return this;
        }

        /* renamed from: i0 */
        public C32313b mo93716i0(int i, LabelDescriptor.C32309b bVar) {
            mo100457F();
            ((LogDescriptor) this.f83053b).setLabels(i, (LabelDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: j0 */
        public C32313b mo93717j0(int i, LabelDescriptor labelDescriptor) {
            mo100457F();
            ((LogDescriptor) this.f83053b).setLabels(i, labelDescriptor);
            return this;
        }

        /* renamed from: k0 */
        public C32313b mo93718k0(String str) {
            mo100457F();
            ((LogDescriptor) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: l0 */
        public C32313b mo93719l0(ByteString byteString) {
            mo100457F();
            ((LogDescriptor) this.f83053b).setNameBytes(byteString);
            return this;
        }

        public C32313b() {
            super(LogDescriptor.DEFAULT_INSTANCE);
        }
    }

    static {
        LogDescriptor logDescriptor = new LogDescriptor();
        DEFAULT_INSTANCE = logDescriptor;
        GeneratedMessageLite.registerDefaultInstance(LogDescriptor.class, logDescriptor);
    }

    private LogDescriptor() {
    }

    /* access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        ensureLabelsIsMutable();
        C34319a.addAll(iterable, this.labels_);
    }

    /* access modifiers changed from: private */
    public void addLabels(LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
    }

    /* access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* access modifiers changed from: private */
    public void clearLabels() {
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureLabelsIsMutable() {
        C34471v0.C34488k<LabelDescriptor> kVar = this.labels_;
        if (!kVar.mo100971T()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static LogDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32313b newBuilder() {
        return (C32313b) DEFAULT_INSTANCE.createBuilder();
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<LogDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeLabels(int i) {
        ensureLabelsIsMutable();
        this.labels_.remove(i);
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
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* access modifiers changed from: private */
    public void setDisplayNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.displayName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i, labelDescriptor);
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

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32312a.f78707a[methodToInvoke.ordinal()]) {
            case 1:
                return new LogDescriptor();
            case 2:
                return new C32313b((C32312a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "labels_", LabelDescriptor.class, "description_", "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<LogDescriptor> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (LogDescriptor.class) {
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

    public String getDisplayName() {
        return this.displayName_;
    }

    public ByteString getDisplayNameBytes() {
        return ByteString.m137260e0(this.displayName_);
    }

    public LabelDescriptor getLabels(int i) {
        return this.labels_.get(i);
    }

    public int getLabelsCount() {
        return this.labels_.size();
    }

    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public C32410k0 getLabelsOrBuilder(int i) {
        return this.labels_.get(i);
    }

    public List<? extends C32410k0> getLabelsOrBuilderList() {
        return this.labels_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public static C32313b newBuilder(LogDescriptor logDescriptor) {
        return (C32313b) DEFAULT_INSTANCE.createBuilder(logDescriptor);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static LogDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, labelDescriptor);
    }

    public static LogDescriptor parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static LogDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LogDescriptor parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static LogDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogDescriptor parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static LogDescriptor parseFrom(C34448s sVar) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static LogDescriptor parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (LogDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
