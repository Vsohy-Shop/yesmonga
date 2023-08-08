package com.google.api;

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

public final class ResourceDescriptor extends GeneratedMessageLite<ResourceDescriptor, C32362b> implements C32405i1 {
    /* access modifiers changed from: private */
    public static final ResourceDescriptor DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile C34504y1<ResourceDescriptor> PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String nameField_ = "";
    private C34471v0.C34488k<String> pattern_ = GeneratedMessageLite.emptyProtobufList();
    private String plural_ = "";
    private String singular_ = "";
    private String type_ = "";

    public enum History implements C34471v0.C34474c {
        HISTORY_UNSPECIFIED(0),
        ORIGINALLY_SINGLE_PATTERN(1),
        FUTURE_MULTI_PATTERN(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        public static final int f78775e = 0;

        /* renamed from: f */
        public static final int f78776f = 1;

        /* renamed from: g */
        public static final int f78777g = 2;

        /* renamed from: v */
        public static final C34471v0.C34475d<History> f78778v = null;
        private final int value;

        /* renamed from: com.google.api.ResourceDescriptor$History$a */
        public class C32359a implements C34471v0.C34475d<History> {
            /* renamed from: b */
            public History mo93187a(int i) {
                return History.m131112b(i);
            }
        }

        /* renamed from: com.google.api.ResourceDescriptor$History$b */
        public static final class C32360b implements C34471v0.C34476e {

            /* renamed from: a */
            public static final C34471v0.C34476e f78780a = null;

            static {
                f78780a = new C32360b();
            }

            /* renamed from: a */
            public boolean mo93189a(int i) {
                return History.m131112b(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            f78778v = new C32359a();
        }

        /* access modifiers changed from: public */
        History(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static History m131112b(int i) {
            if (i == 0) {
                return HISTORY_UNSPECIFIED;
            }
            if (i == 1) {
                return ORIGINALLY_SINGLE_PATTERN;
            }
            if (i != 2) {
                return null;
            }
            return FUTURE_MULTI_PATTERN;
        }

        /* renamed from: g */
        public static C34471v0.C34475d<History> m131113g() {
            return f78778v;
        }

        /* renamed from: q */
        public static C34471v0.C34476e m131114q() {
            return C32360b.f78780a;
        }

        @Deprecated
        /* renamed from: r */
        public static History m131115r(int i) {
            return m131112b(i);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.google.api.ResourceDescriptor$a */
    public static /* synthetic */ class C32361a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78781a;

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
                f78781a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78781a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78781a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78781a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78781a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78781a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78781a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.ResourceDescriptor.C32361a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.ResourceDescriptor$b */
    public static final class C32362b extends GeneratedMessageLite.C34263b<ResourceDescriptor, C32362b> implements C32405i1 {
        public /* synthetic */ C32362b(C32361a aVar) {
            this();
        }

        /* renamed from: P */
        public C32362b mo94134P(Iterable<String> iterable) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).addAllPattern(iterable);
            return this;
        }

        /* renamed from: R */
        public C32362b mo94135R(String str) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).addPattern(str);
            return this;
        }

        /* renamed from: S */
        public C32362b mo94136S(ByteString byteString) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).addPatternBytes(byteString);
            return this;
        }

        /* renamed from: T */
        public C32362b mo94137T() {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).clearHistory();
            return this;
        }

        /* renamed from: U */
        public C32362b mo94138U() {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).clearNameField();
            return this;
        }

        /* renamed from: V */
        public C32362b mo94139V() {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).clearPattern();
            return this;
        }

        /* renamed from: Y */
        public C32362b mo94140Y() {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).clearPlural();
            return this;
        }

        /* renamed from: Z */
        public C32362b mo94141Z() {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).clearSingular();
            return this;
        }

        /* renamed from: a0 */
        public C32362b mo94142a0() {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).clearType();
            return this;
        }

        /* renamed from: b0 */
        public C32362b mo94143b0(History history) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setHistory(history);
            return this;
        }

        /* renamed from: c0 */
        public C32362b mo94144c0(int i) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setHistoryValue(i);
            return this;
        }

        /* renamed from: d0 */
        public C32362b mo94145d0(String str) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setNameField(str);
            return this;
        }

        /* renamed from: g0 */
        public C32362b mo94146g0(ByteString byteString) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setNameFieldBytes(byteString);
            return this;
        }

        public History getHistory() {
            return ((ResourceDescriptor) this.f83053b).getHistory();
        }

        public int getHistoryValue() {
            return ((ResourceDescriptor) this.f83053b).getHistoryValue();
        }

        public String getNameField() {
            return ((ResourceDescriptor) this.f83053b).getNameField();
        }

        public ByteString getNameFieldBytes() {
            return ((ResourceDescriptor) this.f83053b).getNameFieldBytes();
        }

        public String getPattern(int i) {
            return ((ResourceDescriptor) this.f83053b).getPattern(i);
        }

        public ByteString getPatternBytes(int i) {
            return ((ResourceDescriptor) this.f83053b).getPatternBytes(i);
        }

        public int getPatternCount() {
            return ((ResourceDescriptor) this.f83053b).getPatternCount();
        }

        public List<String> getPatternList() {
            return Collections.unmodifiableList(((ResourceDescriptor) this.f83053b).getPatternList());
        }

        public String getPlural() {
            return ((ResourceDescriptor) this.f83053b).getPlural();
        }

        public ByteString getPluralBytes() {
            return ((ResourceDescriptor) this.f83053b).getPluralBytes();
        }

        public String getSingular() {
            return ((ResourceDescriptor) this.f83053b).getSingular();
        }

        public ByteString getSingularBytes() {
            return ((ResourceDescriptor) this.f83053b).getSingularBytes();
        }

        public String getType() {
            return ((ResourceDescriptor) this.f83053b).getType();
        }

        public ByteString getTypeBytes() {
            return ((ResourceDescriptor) this.f83053b).getTypeBytes();
        }

        /* renamed from: h0 */
        public C32362b mo94147h0(int i, String str) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setPattern(i, str);
            return this;
        }

        /* renamed from: i0 */
        public C32362b mo94148i0(String str) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setPlural(str);
            return this;
        }

        /* renamed from: j0 */
        public C32362b mo94149j0(ByteString byteString) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setPluralBytes(byteString);
            return this;
        }

        /* renamed from: k0 */
        public C32362b mo94150k0(String str) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setSingular(str);
            return this;
        }

        /* renamed from: l0 */
        public C32362b mo94151l0(ByteString byteString) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setSingularBytes(byteString);
            return this;
        }

        /* renamed from: m0 */
        public C32362b mo94152m0(String str) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setType(str);
            return this;
        }

        /* renamed from: o0 */
        public C32362b mo94153o0(ByteString byteString) {
            mo100457F();
            ((ResourceDescriptor) this.f83053b).setTypeBytes(byteString);
            return this;
        }

        public C32362b() {
            super(ResourceDescriptor.DEFAULT_INSTANCE);
        }
    }

    static {
        ResourceDescriptor resourceDescriptor = new ResourceDescriptor();
        DEFAULT_INSTANCE = resourceDescriptor;
        GeneratedMessageLite.registerDefaultInstance(ResourceDescriptor.class, resourceDescriptor);
    }

    private ResourceDescriptor() {
    }

    /* access modifiers changed from: private */
    public void addAllPattern(Iterable<String> iterable) {
        ensurePatternIsMutable();
        C34319a.addAll(iterable, this.pattern_);
    }

    /* access modifiers changed from: private */
    public void addPattern(String str) {
        str.getClass();
        ensurePatternIsMutable();
        this.pattern_.add(str);
    }

    /* access modifiers changed from: private */
    public void addPatternBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        ensurePatternIsMutable();
        this.pattern_.add(byteString.mo99228S0());
    }

    /* access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearNameField() {
        this.nameField_ = getDefaultInstance().getNameField();
    }

    /* access modifiers changed from: private */
    public void clearPattern() {
        this.pattern_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearPlural() {
        this.plural_ = getDefaultInstance().getPlural();
    }

    /* access modifiers changed from: private */
    public void clearSingular() {
        this.singular_ = getDefaultInstance().getSingular();
    }

    /* access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensurePatternIsMutable() {
        C34471v0.C34488k<String> kVar = this.pattern_;
        if (!kVar.mo100971T()) {
            this.pattern_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static ResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32362b newBuilder() {
        return (C32362b) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<ResourceDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setHistory(History history) {
        this.history_ = history.getNumber();
    }

    /* access modifiers changed from: private */
    public void setHistoryValue(int i) {
        this.history_ = i;
    }

    /* access modifiers changed from: private */
    public void setNameField(String str) {
        str.getClass();
        this.nameField_ = str;
    }

    /* access modifiers changed from: private */
    public void setNameFieldBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.nameField_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setPattern(int i, String str) {
        str.getClass();
        ensurePatternIsMutable();
        this.pattern_.set(i, str);
    }

    /* access modifiers changed from: private */
    public void setPlural(String str) {
        str.getClass();
        this.plural_ = str;
    }

    /* access modifiers changed from: private */
    public void setPluralBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.plural_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setSingular(String str) {
        str.getClass();
        this.singular_ = str;
    }

    /* access modifiers changed from: private */
    public void setSingularBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.singular_ = byteString.mo99228S0();
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
        switch (C32361a.f78781a[methodToInvoke.ordinal()]) {
            case 1:
                return new ResourceDescriptor();
            case 2:
                return new C32362b((C32361a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ", new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<ResourceDescriptor> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (ResourceDescriptor.class) {
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

    public History getHistory() {
        History b = History.m131112b(this.history_);
        if (b == null) {
            return History.UNRECOGNIZED;
        }
        return b;
    }

    public int getHistoryValue() {
        return this.history_;
    }

    public String getNameField() {
        return this.nameField_;
    }

    public ByteString getNameFieldBytes() {
        return ByteString.m137260e0(this.nameField_);
    }

    public String getPattern(int i) {
        return this.pattern_.get(i);
    }

    public ByteString getPatternBytes(int i) {
        return ByteString.m137260e0(this.pattern_.get(i));
    }

    public int getPatternCount() {
        return this.pattern_.size();
    }

    public List<String> getPatternList() {
        return this.pattern_;
    }

    public String getPlural() {
        return this.plural_;
    }

    public ByteString getPluralBytes() {
        return ByteString.m137260e0(this.plural_);
    }

    public String getSingular() {
        return this.singular_;
    }

    public ByteString getSingularBytes() {
        return ByteString.m137260e0(this.singular_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.m137260e0(this.type_);
    }

    public static C32362b newBuilder(ResourceDescriptor resourceDescriptor) {
        return (C32362b) DEFAULT_INSTANCE.createBuilder(resourceDescriptor);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static ResourceDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResourceDescriptor parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceDescriptor parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ResourceDescriptor parseFrom(C34448s sVar) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static ResourceDescriptor parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (ResourceDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
