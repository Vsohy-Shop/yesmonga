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

public final class Page extends GeneratedMessageLite<Page, C32347b> implements C32387c1 {
    public static final int CONTENT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Page DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C34504y1<Page> PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String content_ = "";
    private String name_ = "";
    private C34471v0.C34488k<Page> subpages_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.google.api.Page$a */
    public static /* synthetic */ class C32346a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78751a;

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
                f78751a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78751a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78751a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78751a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78751a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78751a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78751a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Page.C32346a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Page$b */
    public static final class C32347b extends GeneratedMessageLite.C34263b<Page, C32347b> implements C32387c1 {
        public /* synthetic */ C32347b(C32346a aVar) {
            this();
        }

        /* renamed from: P */
        public C32347b mo93997P(Iterable<? extends Page> iterable) {
            mo100457F();
            ((Page) this.f83053b).addAllSubpages(iterable);
            return this;
        }

        /* renamed from: R */
        public C32347b mo93998R(int i, C32347b bVar) {
            mo100457F();
            ((Page) this.f83053b).addSubpages(i, (Page) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C32347b mo93999S(int i, Page page) {
            mo100457F();
            ((Page) this.f83053b).addSubpages(i, page);
            return this;
        }

        /* renamed from: T */
        public C32347b mo94000T(C32347b bVar) {
            mo100457F();
            ((Page) this.f83053b).addSubpages((Page) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C32347b mo94001U(Page page) {
            mo100457F();
            ((Page) this.f83053b).addSubpages(page);
            return this;
        }

        /* renamed from: V */
        public C32347b mo94002V() {
            mo100457F();
            ((Page) this.f83053b).clearContent();
            return this;
        }

        /* renamed from: Y */
        public C32347b mo94003Y() {
            mo100457F();
            ((Page) this.f83053b).clearName();
            return this;
        }

        /* renamed from: Z */
        public C32347b mo94004Z() {
            mo100457F();
            ((Page) this.f83053b).clearSubpages();
            return this;
        }

        /* renamed from: a0 */
        public C32347b mo94005a0(int i) {
            mo100457F();
            ((Page) this.f83053b).removeSubpages(i);
            return this;
        }

        /* renamed from: b0 */
        public C32347b mo94006b0(String str) {
            mo100457F();
            ((Page) this.f83053b).setContent(str);
            return this;
        }

        /* renamed from: c0 */
        public C32347b mo94007c0(ByteString byteString) {
            mo100457F();
            ((Page) this.f83053b).setContentBytes(byteString);
            return this;
        }

        /* renamed from: d0 */
        public C32347b mo94008d0(String str) {
            mo100457F();
            ((Page) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: g0 */
        public C32347b mo94009g0(ByteString byteString) {
            mo100457F();
            ((Page) this.f83053b).setNameBytes(byteString);
            return this;
        }

        public String getContent() {
            return ((Page) this.f83053b).getContent();
        }

        public ByteString getContentBytes() {
            return ((Page) this.f83053b).getContentBytes();
        }

        public String getName() {
            return ((Page) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((Page) this.f83053b).getNameBytes();
        }

        public Page getSubpages(int i) {
            return ((Page) this.f83053b).getSubpages(i);
        }

        public int getSubpagesCount() {
            return ((Page) this.f83053b).getSubpagesCount();
        }

        public List<Page> getSubpagesList() {
            return Collections.unmodifiableList(((Page) this.f83053b).getSubpagesList());
        }

        /* renamed from: h0 */
        public C32347b mo94010h0(int i, C32347b bVar) {
            mo100457F();
            ((Page) this.f83053b).setSubpages(i, (Page) bVar.mo100473g());
            return this;
        }

        /* renamed from: i0 */
        public C32347b mo94011i0(int i, Page page) {
            mo100457F();
            ((Page) this.f83053b).setSubpages(i, page);
            return this;
        }

        public C32347b() {
            super(Page.DEFAULT_INSTANCE);
        }
    }

    static {
        Page page = new Page();
        DEFAULT_INSTANCE = page;
        GeneratedMessageLite.registerDefaultInstance(Page.class, page);
    }

    private Page() {
    }

    /* access modifiers changed from: private */
    public void addAllSubpages(Iterable<? extends Page> iterable) {
        ensureSubpagesIsMutable();
        C34319a.addAll(iterable, this.subpages_);
    }

    /* access modifiers changed from: private */
    public void addSubpages(Page page) {
        page.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.add(page);
    }

    /* access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearSubpages() {
        this.subpages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSubpagesIsMutable() {
        C34471v0.C34488k<Page> kVar = this.subpages_;
        if (!kVar.mo100971T()) {
            this.subpages_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Page getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32347b newBuilder() {
        return (C32347b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Page parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Page) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Page> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeSubpages(int i) {
        ensureSubpagesIsMutable();
        this.subpages_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.mo99228S0();
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
    public void setSubpages(int i, Page page) {
        page.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.set(i, page);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32346a.f78751a[methodToInvoke.ordinal()]) {
            case 1:
                return new Page();
            case 2:
                return new C32347b((C32346a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"name_", "content_", "subpages_", Page.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Page> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Page.class) {
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

    public String getContent() {
        return this.content_;
    }

    public ByteString getContentBytes() {
        return ByteString.m137260e0(this.content_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public Page getSubpages(int i) {
        return this.subpages_.get(i);
    }

    public int getSubpagesCount() {
        return this.subpages_.size();
    }

    public List<Page> getSubpagesList() {
        return this.subpages_;
    }

    public C32387c1 getSubpagesOrBuilder(int i) {
        return this.subpages_.get(i);
    }

    public List<? extends C32387c1> getSubpagesOrBuilderList() {
        return this.subpages_;
    }

    public static C32347b newBuilder(Page page) {
        return (C32347b) DEFAULT_INSTANCE.createBuilder(page);
    }

    public static Page parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Page) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Page parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Page parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addSubpages(int i, Page page) {
        page.getClass();
        ensureSubpagesIsMutable();
        this.subpages_.add(i, page);
    }

    public static Page parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Page parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Page parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Page parseFrom(InputStream inputStream) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Page parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Page parseFrom(C34448s sVar) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Page parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Page) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
