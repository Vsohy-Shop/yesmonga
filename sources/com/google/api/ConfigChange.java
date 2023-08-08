package com.google.api;

import com.google.api.Advice;
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

public final class ConfigChange extends GeneratedMessageLite<ConfigChange, C32267b> implements C32418n {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final ConfigChange DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile C34504y1<ConfigChange> PARSER;
    private C34471v0.C34488k<Advice> advices_ = GeneratedMessageLite.emptyProtobufList();
    private int changeType_;
    private String element_ = "";
    private String newValue_ = "";
    private String oldValue_ = "";

    /* renamed from: com.google.api.ConfigChange$a */
    public static /* synthetic */ class C32266a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78634a;

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
                f78634a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78634a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78634a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78634a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78634a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78634a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78634a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.ConfigChange.C32266a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.ConfigChange$b */
    public static final class C32267b extends GeneratedMessageLite.C34263b<ConfigChange, C32267b> implements C32418n {
        public /* synthetic */ C32267b(C32266a aVar) {
            this();
        }

        /* renamed from: P */
        public C32267b mo93256P(int i, Advice.C32245b bVar) {
            mo100457F();
            ((ConfigChange) this.f83053b).addAdvices(i, (Advice) bVar.mo100473g());
            return this;
        }

        /* renamed from: R */
        public C32267b mo93257R(int i, Advice advice) {
            mo100457F();
            ((ConfigChange) this.f83053b).addAdvices(i, advice);
            return this;
        }

        /* renamed from: S */
        public C32267b mo93258S(Advice.C32245b bVar) {
            mo100457F();
            ((ConfigChange) this.f83053b).addAdvices((Advice) bVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C32267b mo93259T(Advice advice) {
            mo100457F();
            ((ConfigChange) this.f83053b).addAdvices(advice);
            return this;
        }

        /* renamed from: U */
        public C32267b mo93260U(Iterable<? extends Advice> iterable) {
            mo100457F();
            ((ConfigChange) this.f83053b).addAllAdvices(iterable);
            return this;
        }

        /* renamed from: V */
        public C32267b mo93261V() {
            mo100457F();
            ((ConfigChange) this.f83053b).clearAdvices();
            return this;
        }

        /* renamed from: Y */
        public C32267b mo93262Y() {
            mo100457F();
            ((ConfigChange) this.f83053b).clearChangeType();
            return this;
        }

        /* renamed from: Z */
        public C32267b mo93263Z() {
            mo100457F();
            ((ConfigChange) this.f83053b).clearElement();
            return this;
        }

        /* renamed from: a0 */
        public C32267b mo93264a0() {
            mo100457F();
            ((ConfigChange) this.f83053b).clearNewValue();
            return this;
        }

        /* renamed from: b0 */
        public C32267b mo93265b0() {
            mo100457F();
            ((ConfigChange) this.f83053b).clearOldValue();
            return this;
        }

        /* renamed from: c0 */
        public C32267b mo93266c0(int i) {
            mo100457F();
            ((ConfigChange) this.f83053b).removeAdvices(i);
            return this;
        }

        /* renamed from: d0 */
        public C32267b mo93267d0(int i, Advice.C32245b bVar) {
            mo100457F();
            ((ConfigChange) this.f83053b).setAdvices(i, (Advice) bVar.mo100473g());
            return this;
        }

        /* renamed from: g0 */
        public C32267b mo93268g0(int i, Advice advice) {
            mo100457F();
            ((ConfigChange) this.f83053b).setAdvices(i, advice);
            return this;
        }

        public Advice getAdvices(int i) {
            return ((ConfigChange) this.f83053b).getAdvices(i);
        }

        public int getAdvicesCount() {
            return ((ConfigChange) this.f83053b).getAdvicesCount();
        }

        public List<Advice> getAdvicesList() {
            return Collections.unmodifiableList(((ConfigChange) this.f83053b).getAdvicesList());
        }

        public ChangeType getChangeType() {
            return ((ConfigChange) this.f83053b).getChangeType();
        }

        public int getChangeTypeValue() {
            return ((ConfigChange) this.f83053b).getChangeTypeValue();
        }

        public String getElement() {
            return ((ConfigChange) this.f83053b).getElement();
        }

        public ByteString getElementBytes() {
            return ((ConfigChange) this.f83053b).getElementBytes();
        }

        public String getNewValue() {
            return ((ConfigChange) this.f83053b).getNewValue();
        }

        public ByteString getNewValueBytes() {
            return ((ConfigChange) this.f83053b).getNewValueBytes();
        }

        public String getOldValue() {
            return ((ConfigChange) this.f83053b).getOldValue();
        }

        public ByteString getOldValueBytes() {
            return ((ConfigChange) this.f83053b).getOldValueBytes();
        }

        /* renamed from: h0 */
        public C32267b mo93269h0(ChangeType changeType) {
            mo100457F();
            ((ConfigChange) this.f83053b).setChangeType(changeType);
            return this;
        }

        /* renamed from: i0 */
        public C32267b mo93270i0(int i) {
            mo100457F();
            ((ConfigChange) this.f83053b).setChangeTypeValue(i);
            return this;
        }

        /* renamed from: j0 */
        public C32267b mo93271j0(String str) {
            mo100457F();
            ((ConfigChange) this.f83053b).setElement(str);
            return this;
        }

        /* renamed from: k0 */
        public C32267b mo93272k0(ByteString byteString) {
            mo100457F();
            ((ConfigChange) this.f83053b).setElementBytes(byteString);
            return this;
        }

        /* renamed from: l0 */
        public C32267b mo93273l0(String str) {
            mo100457F();
            ((ConfigChange) this.f83053b).setNewValue(str);
            return this;
        }

        /* renamed from: m0 */
        public C32267b mo93274m0(ByteString byteString) {
            mo100457F();
            ((ConfigChange) this.f83053b).setNewValueBytes(byteString);
            return this;
        }

        /* renamed from: o0 */
        public C32267b mo93275o0(String str) {
            mo100457F();
            ((ConfigChange) this.f83053b).setOldValue(str);
            return this;
        }

        /* renamed from: q0 */
        public C32267b mo93276q0(ByteString byteString) {
            mo100457F();
            ((ConfigChange) this.f83053b).setOldValueBytes(byteString);
            return this;
        }

        public C32267b() {
            super(ConfigChange.DEFAULT_INSTANCE);
        }
    }

    static {
        ConfigChange configChange = new ConfigChange();
        DEFAULT_INSTANCE = configChange;
        GeneratedMessageLite.registerDefaultInstance(ConfigChange.class, configChange);
    }

    private ConfigChange() {
    }

    /* access modifiers changed from: private */
    public void addAdvices(Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(advice);
    }

    /* access modifiers changed from: private */
    public void addAllAdvices(Iterable<? extends Advice> iterable) {
        ensureAdvicesIsMutable();
        C34319a.addAll(iterable, this.advices_);
    }

    /* access modifiers changed from: private */
    public void clearAdvices() {
        this.advices_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearChangeType() {
        this.changeType_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearElement() {
        this.element_ = getDefaultInstance().getElement();
    }

    /* access modifiers changed from: private */
    public void clearNewValue() {
        this.newValue_ = getDefaultInstance().getNewValue();
    }

    /* access modifiers changed from: private */
    public void clearOldValue() {
        this.oldValue_ = getDefaultInstance().getOldValue();
    }

    private void ensureAdvicesIsMutable() {
        C34471v0.C34488k<Advice> kVar = this.advices_;
        if (!kVar.mo100971T()) {
            this.advices_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static ConfigChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32267b newBuilder() {
        return (C32267b) DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<ConfigChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeAdvices(int i) {
        ensureAdvicesIsMutable();
        this.advices_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setAdvices(int i, Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.set(i, advice);
    }

    /* access modifiers changed from: private */
    public void setChangeType(ChangeType changeType) {
        this.changeType_ = changeType.getNumber();
    }

    /* access modifiers changed from: private */
    public void setChangeTypeValue(int i) {
        this.changeType_ = i;
    }

    /* access modifiers changed from: private */
    public void setElement(String str) {
        str.getClass();
        this.element_ = str;
    }

    /* access modifiers changed from: private */
    public void setElementBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.element_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setNewValue(String str) {
        str.getClass();
        this.newValue_ = str;
    }

    /* access modifiers changed from: private */
    public void setNewValueBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.newValue_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setOldValue(String str) {
        str.getClass();
        this.oldValue_ = str;
    }

    /* access modifiers changed from: private */
    public void setOldValueBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.oldValue_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32266a.f78634a[methodToInvoke.ordinal()]) {
            case 1:
                return new ConfigChange();
            case 2:
                return new C32267b((C32266a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", Advice.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<ConfigChange> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (ConfigChange.class) {
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

    public Advice getAdvices(int i) {
        return this.advices_.get(i);
    }

    public int getAdvicesCount() {
        return this.advices_.size();
    }

    public List<Advice> getAdvicesList() {
        return this.advices_;
    }

    public C32379a getAdvicesOrBuilder(int i) {
        return this.advices_.get(i);
    }

    public List<? extends C32379a> getAdvicesOrBuilderList() {
        return this.advices_;
    }

    public ChangeType getChangeType() {
        ChangeType b = ChangeType.m130531b(this.changeType_);
        if (b == null) {
            return ChangeType.UNRECOGNIZED;
        }
        return b;
    }

    public int getChangeTypeValue() {
        return this.changeType_;
    }

    public String getElement() {
        return this.element_;
    }

    public ByteString getElementBytes() {
        return ByteString.m137260e0(this.element_);
    }

    public String getNewValue() {
        return this.newValue_;
    }

    public ByteString getNewValueBytes() {
        return ByteString.m137260e0(this.newValue_);
    }

    public String getOldValue() {
        return this.oldValue_;
    }

    public ByteString getOldValueBytes() {
        return ByteString.m137260e0(this.oldValue_);
    }

    public static C32267b newBuilder(ConfigChange configChange) {
        return (C32267b) DEFAULT_INSTANCE.createBuilder(configChange);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static ConfigChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addAdvices(int i, Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(i, advice);
    }

    public static ConfigChange parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static ConfigChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfigChange parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static ConfigChange parseFrom(InputStream inputStream) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ConfigChange parseFrom(C34448s sVar) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static ConfigChange parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (ConfigChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
