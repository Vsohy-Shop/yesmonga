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

public final class MonitoredResourceDescriptor extends GeneratedMessageLite<MonitoredResourceDescriptor, C32336b> implements C32443v0 {
    /* access modifiers changed from: private */
    public static final MonitoredResourceDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile C34504y1<MonitoredResourceDescriptor> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String description_ = "";
    private String displayName_ = "";
    private C34471v0.C34488k<LabelDescriptor> labels_ = GeneratedMessageLite.emptyProtobufList();
    private int launchStage_;
    private String name_ = "";
    private String type_ = "";

    /* renamed from: com.google.api.MonitoredResourceDescriptor$a */
    public static /* synthetic */ class C32335a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78746a;

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
                f78746a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78746a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78746a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78746a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78746a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78746a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78746a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.MonitoredResourceDescriptor.C32335a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.MonitoredResourceDescriptor$b */
    public static final class C32336b extends GeneratedMessageLite.C34263b<MonitoredResourceDescriptor, C32336b> implements C32443v0 {
        public /* synthetic */ C32336b(C32335a aVar) {
            this();
        }

        /* renamed from: P */
        public C32336b mo93901P(Iterable<? extends LabelDescriptor> iterable) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).addAllLabels(iterable);
            return this;
        }

        /* renamed from: R */
        public C32336b mo93902R(int i, LabelDescriptor.C32309b bVar) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).addLabels(i, (LabelDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32336b mo93903S(int i, LabelDescriptor labelDescriptor) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).addLabels(i, labelDescriptor);
            return this;
        }

        /* renamed from: T */
        public C32336b mo93904T(LabelDescriptor.C32309b bVar) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).addLabels((LabelDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32336b mo93905U(LabelDescriptor labelDescriptor) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).addLabels(labelDescriptor);
            return this;
        }

        /* renamed from: V */
        public C32336b mo93906V() {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).clearDescription();
            return this;
        }

        /* renamed from: Y */
        public C32336b mo93907Y() {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).clearDisplayName();
            return this;
        }

        /* renamed from: Z */
        public C32336b mo93908Z() {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).clearLabels();
            return this;
        }

        /* renamed from: a0 */
        public C32336b mo93909a0() {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).clearLaunchStage();
            return this;
        }

        /* renamed from: b0 */
        public C32336b mo93910b0() {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).clearName();
            return this;
        }

        /* renamed from: c0 */
        public C32336b mo93911c0() {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).clearType();
            return this;
        }

        /* renamed from: d0 */
        public C32336b mo93912d0(int i) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).removeLabels(i);
            return this;
        }

        /* renamed from: g0 */
        public C32336b mo93913g0(String str) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setDescription(str);
            return this;
        }

        public String getDescription() {
            return ((MonitoredResourceDescriptor) this.f83053b).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((MonitoredResourceDescriptor) this.f83053b).getDescriptionBytes();
        }

        public String getDisplayName() {
            return ((MonitoredResourceDescriptor) this.f83053b).getDisplayName();
        }

        public ByteString getDisplayNameBytes() {
            return ((MonitoredResourceDescriptor) this.f83053b).getDisplayNameBytes();
        }

        public LabelDescriptor getLabels(int i) {
            return ((MonitoredResourceDescriptor) this.f83053b).getLabels(i);
        }

        public int getLabelsCount() {
            return ((MonitoredResourceDescriptor) this.f83053b).getLabelsCount();
        }

        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((MonitoredResourceDescriptor) this.f83053b).getLabelsList());
        }

        public LaunchStage getLaunchStage() {
            return ((MonitoredResourceDescriptor) this.f83053b).getLaunchStage();
        }

        public int getLaunchStageValue() {
            return ((MonitoredResourceDescriptor) this.f83053b).getLaunchStageValue();
        }

        public String getName() {
            return ((MonitoredResourceDescriptor) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((MonitoredResourceDescriptor) this.f83053b).getNameBytes();
        }

        public String getType() {
            return ((MonitoredResourceDescriptor) this.f83053b).getType();
        }

        public ByteString getTypeBytes() {
            return ((MonitoredResourceDescriptor) this.f83053b).getTypeBytes();
        }

        /* renamed from: h0 */
        public C32336b mo93914h0(ByteString byteString) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setDescriptionBytes(byteString);
            return this;
        }

        /* renamed from: i0 */
        public C32336b mo93915i0(String str) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setDisplayName(str);
            return this;
        }

        /* renamed from: j0 */
        public C32336b mo93916j0(ByteString byteString) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setDisplayNameBytes(byteString);
            return this;
        }

        /* renamed from: k0 */
        public C32336b mo93917k0(int i, LabelDescriptor.C32309b bVar) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setLabels(i, (LabelDescriptor) bVar.mo100473g());
            return this;
        }

        /* renamed from: l0 */
        public C32336b mo93918l0(int i, LabelDescriptor labelDescriptor) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setLabels(i, labelDescriptor);
            return this;
        }

        /* renamed from: m0 */
        public C32336b mo93919m0(LaunchStage launchStage) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setLaunchStage(launchStage);
            return this;
        }

        /* renamed from: o0 */
        public C32336b mo93920o0(int i) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setLaunchStageValue(i);
            return this;
        }

        /* renamed from: q0 */
        public C32336b mo93921q0(String str) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: r0 */
        public C32336b mo93922r0(ByteString byteString) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: s0 */
        public C32336b mo93923s0(String str) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setType(str);
            return this;
        }

        /* renamed from: u0 */
        public C32336b mo93924u0(ByteString byteString) {
            mo100457F();
            ((MonitoredResourceDescriptor) this.f83053b).setTypeBytes(byteString);
            return this;
        }

        public C32336b() {
            super(MonitoredResourceDescriptor.DEFAULT_INSTANCE);
        }
    }

    static {
        MonitoredResourceDescriptor monitoredResourceDescriptor = new MonitoredResourceDescriptor();
        DEFAULT_INSTANCE = monitoredResourceDescriptor;
        GeneratedMessageLite.registerDefaultInstance(MonitoredResourceDescriptor.class, monitoredResourceDescriptor);
    }

    private MonitoredResourceDescriptor() {
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
    public void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureLabelsIsMutable() {
        C34471v0.C34488k<LabelDescriptor> kVar = this.labels_;
        if (!kVar.mo100971T()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static MonitoredResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32336b newBuilder() {
        return (C32336b) DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<MonitoredResourceDescriptor> parser() {
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
    public void setLaunchStage(LaunchStage launchStage) {
        this.launchStage_ = launchStage.getNumber();
    }

    /* access modifiers changed from: private */
    public void setLaunchStageValue(int i) {
        this.launchStage_ = i;
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
        switch (C32335a.f78746a[methodToInvoke.ordinal()]) {
            case 1:
                return new MonitoredResourceDescriptor();
            case 2:
                return new C32336b((C32335a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005Ȉ\u0007\f", new Object[]{"type_", "displayName_", "description_", "labels_", LabelDescriptor.class, "name_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<MonitoredResourceDescriptor> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (MonitoredResourceDescriptor.class) {
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

    public LaunchStage getLaunchStage() {
        LaunchStage b = LaunchStage.m130831b(this.launchStage_);
        if (b == null) {
            return LaunchStage.UNRECOGNIZED;
        }
        return b;
    }

    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.m137260e0(this.type_);
    }

    public static C32336b newBuilder(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        return (C32336b) DEFAULT_INSTANCE.createBuilder(monitoredResourceDescriptor);
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addLabels(int i, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i, labelDescriptor);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static MonitoredResourceDescriptor parseFrom(C34448s sVar) throws IOException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static MonitoredResourceDescriptor parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (MonitoredResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
