package com.google.api;

import com.google.api.DocumentationRule;
import com.google.api.Page;
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

public final class Documentation extends GeneratedMessageLite<Documentation, C32291b> implements C32449y {
    /* access modifiers changed from: private */
    public static final Documentation DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile C34504y1<Documentation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String documentationRootUrl_ = "";
    private String overview_ = "";
    private C34471v0.C34488k<Page> pages_ = GeneratedMessageLite.emptyProtobufList();
    private C34471v0.C34488k<DocumentationRule> rules_ = GeneratedMessageLite.emptyProtobufList();
    private String summary_ = "";

    /* renamed from: com.google.api.Documentation$a */
    public static /* synthetic */ class C32290a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78645a;

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
                f78645a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f78645a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f78645a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f78645a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f78645a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f78645a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f78645a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.Documentation.C32290a.<clinit>():void");
        }
    }

    /* renamed from: com.google.api.Documentation$b */
    public static final class C32291b extends GeneratedMessageLite.C34263b<Documentation, C32291b> implements C32449y {
        public /* synthetic */ C32291b(C32290a aVar) {
            this();
        }

        /* renamed from: P */
        public C32291b mo93480P(Iterable<? extends Page> iterable) {
            mo100457F();
            ((Documentation) this.f83053b).addAllPages(iterable);
            return this;
        }

        /* renamed from: R */
        public C32291b mo93481R(Iterable<? extends DocumentationRule> iterable) {
            mo100457F();
            ((Documentation) this.f83053b).addAllRules(iterable);
            return this;
        }

        /* renamed from: S */
        public C32291b mo93482S(int i, Page.C32347b bVar) {
            mo100457F();
            ((Documentation) this.f83053b).addPages(i, (Page) bVar.mo100473g());
            return this;
        }

        /* renamed from: T */
        public C32291b mo93483T(int i, Page page) {
            mo100457F();
            ((Documentation) this.f83053b).addPages(i, page);
            return this;
        }

        /* renamed from: U */
        public C32291b mo93484U(Page.C32347b bVar) {
            mo100457F();
            ((Documentation) this.f83053b).addPages((Page) bVar.mo100473g());
            return this;
        }

        /* renamed from: V */
        public C32291b mo93485V(Page page) {
            mo100457F();
            ((Documentation) this.f83053b).addPages(page);
            return this;
        }

        /* renamed from: Y */
        public C32291b mo93486Y(int i, DocumentationRule.C32293b bVar) {
            mo100457F();
            ((Documentation) this.f83053b).addRules(i, (DocumentationRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: Z */
        public C32291b mo93487Z(int i, DocumentationRule documentationRule) {
            mo100457F();
            ((Documentation) this.f83053b).addRules(i, documentationRule);
            return this;
        }

        /* renamed from: a0 */
        public C32291b mo93488a0(DocumentationRule.C32293b bVar) {
            mo100457F();
            ((Documentation) this.f83053b).addRules((DocumentationRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: b0 */
        public C32291b mo93489b0(DocumentationRule documentationRule) {
            mo100457F();
            ((Documentation) this.f83053b).addRules(documentationRule);
            return this;
        }

        /* renamed from: c0 */
        public C32291b mo93490c0() {
            mo100457F();
            ((Documentation) this.f83053b).clearDocumentationRootUrl();
            return this;
        }

        /* renamed from: d0 */
        public C32291b mo93491d0() {
            mo100457F();
            ((Documentation) this.f83053b).clearOverview();
            return this;
        }

        /* renamed from: g0 */
        public C32291b mo93492g0() {
            mo100457F();
            ((Documentation) this.f83053b).clearPages();
            return this;
        }

        public String getDocumentationRootUrl() {
            return ((Documentation) this.f83053b).getDocumentationRootUrl();
        }

        public ByteString getDocumentationRootUrlBytes() {
            return ((Documentation) this.f83053b).getDocumentationRootUrlBytes();
        }

        public String getOverview() {
            return ((Documentation) this.f83053b).getOverview();
        }

        public ByteString getOverviewBytes() {
            return ((Documentation) this.f83053b).getOverviewBytes();
        }

        public Page getPages(int i) {
            return ((Documentation) this.f83053b).getPages(i);
        }

        public int getPagesCount() {
            return ((Documentation) this.f83053b).getPagesCount();
        }

        public List<Page> getPagesList() {
            return Collections.unmodifiableList(((Documentation) this.f83053b).getPagesList());
        }

        public DocumentationRule getRules(int i) {
            return ((Documentation) this.f83053b).getRules(i);
        }

        public int getRulesCount() {
            return ((Documentation) this.f83053b).getRulesCount();
        }

        public List<DocumentationRule> getRulesList() {
            return Collections.unmodifiableList(((Documentation) this.f83053b).getRulesList());
        }

        public String getSummary() {
            return ((Documentation) this.f83053b).getSummary();
        }

        public ByteString getSummaryBytes() {
            return ((Documentation) this.f83053b).getSummaryBytes();
        }

        /* renamed from: h0 */
        public C32291b mo93493h0() {
            mo100457F();
            ((Documentation) this.f83053b).clearRules();
            return this;
        }

        /* renamed from: i0 */
        public C32291b mo93494i0() {
            mo100457F();
            ((Documentation) this.f83053b).clearSummary();
            return this;
        }

        /* renamed from: j0 */
        public C32291b mo93495j0(int i) {
            mo100457F();
            ((Documentation) this.f83053b).removePages(i);
            return this;
        }

        /* renamed from: k0 */
        public C32291b mo93496k0(int i) {
            mo100457F();
            ((Documentation) this.f83053b).removeRules(i);
            return this;
        }

        /* renamed from: l0 */
        public C32291b mo93497l0(String str) {
            mo100457F();
            ((Documentation) this.f83053b).setDocumentationRootUrl(str);
            return this;
        }

        /* renamed from: m0 */
        public C32291b mo93498m0(ByteString byteString) {
            mo100457F();
            ((Documentation) this.f83053b).setDocumentationRootUrlBytes(byteString);
            return this;
        }

        /* renamed from: o0 */
        public C32291b mo93499o0(String str) {
            mo100457F();
            ((Documentation) this.f83053b).setOverview(str);
            return this;
        }

        /* renamed from: q0 */
        public C32291b mo93500q0(ByteString byteString) {
            mo100457F();
            ((Documentation) this.f83053b).setOverviewBytes(byteString);
            return this;
        }

        /* renamed from: r0 */
        public C32291b mo93501r0(int i, Page.C32347b bVar) {
            mo100457F();
            ((Documentation) this.f83053b).setPages(i, (Page) bVar.mo100473g());
            return this;
        }

        /* renamed from: s0 */
        public C32291b mo93502s0(int i, Page page) {
            mo100457F();
            ((Documentation) this.f83053b).setPages(i, page);
            return this;
        }

        /* renamed from: u0 */
        public C32291b mo93503u0(int i, DocumentationRule.C32293b bVar) {
            mo100457F();
            ((Documentation) this.f83053b).setRules(i, (DocumentationRule) bVar.mo100473g());
            return this;
        }

        /* renamed from: v0 */
        public C32291b mo93504v0(int i, DocumentationRule documentationRule) {
            mo100457F();
            ((Documentation) this.f83053b).setRules(i, documentationRule);
            return this;
        }

        /* renamed from: w0 */
        public C32291b mo93505w0(String str) {
            mo100457F();
            ((Documentation) this.f83053b).setSummary(str);
            return this;
        }

        /* renamed from: x0 */
        public C32291b mo93506x0(ByteString byteString) {
            mo100457F();
            ((Documentation) this.f83053b).setSummaryBytes(byteString);
            return this;
        }

        public C32291b() {
            super(Documentation.DEFAULT_INSTANCE);
        }
    }

    static {
        Documentation documentation = new Documentation();
        DEFAULT_INSTANCE = documentation;
        GeneratedMessageLite.registerDefaultInstance(Documentation.class, documentation);
    }

    private Documentation() {
    }

    /* access modifiers changed from: private */
    public void addAllPages(Iterable<? extends Page> iterable) {
        ensurePagesIsMutable();
        C34319a.addAll(iterable, this.pages_);
    }

    /* access modifiers changed from: private */
    public void addAllRules(Iterable<? extends DocumentationRule> iterable) {
        ensureRulesIsMutable();
        C34319a.addAll(iterable, this.rules_);
    }

    /* access modifiers changed from: private */
    public void addPages(Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.add(page);
    }

    /* access modifiers changed from: private */
    public void addRules(DocumentationRule documentationRule) {
        documentationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(documentationRule);
    }

    /* access modifiers changed from: private */
    public void clearDocumentationRootUrl() {
        this.documentationRootUrl_ = getDefaultInstance().getDocumentationRootUrl();
    }

    /* access modifiers changed from: private */
    public void clearOverview() {
        this.overview_ = getDefaultInstance().getOverview();
    }

    /* access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearSummary() {
        this.summary_ = getDefaultInstance().getSummary();
    }

    private void ensurePagesIsMutable() {
        C34471v0.C34488k<Page> kVar = this.pages_;
        if (!kVar.mo100971T()) {
            this.pages_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    private void ensureRulesIsMutable() {
        C34471v0.C34488k<DocumentationRule> kVar = this.rules_;
        if (!kVar.mo100971T()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static Documentation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C32291b newBuilder() {
        return (C32291b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Documentation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<Documentation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removePages(int i) {
        ensurePagesIsMutable();
        this.pages_.remove(i);
    }

    /* access modifiers changed from: private */
    public void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setDocumentationRootUrl(String str) {
        str.getClass();
        this.documentationRootUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setDocumentationRootUrlBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.documentationRootUrl_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setOverview(String str) {
        str.getClass();
        this.overview_ = str;
    }

    /* access modifiers changed from: private */
    public void setOverviewBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.overview_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setPages(int i, Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.set(i, page);
    }

    /* access modifiers changed from: private */
    public void setRules(int i, DocumentationRule documentationRule) {
        documentationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, documentationRule);
    }

    /* access modifiers changed from: private */
    public void setSummary(String str) {
        str.getClass();
        this.summary_ = str;
    }

    /* access modifiers changed from: private */
    public void setSummaryBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.summary_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C32290a.f78645a[methodToInvoke.ordinal()]) {
            case 1:
                return new Documentation();
            case 2:
                return new C32291b((C32290a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005\u001b", new Object[]{"summary_", "overview_", "rules_", DocumentationRule.class, "documentationRootUrl_", "pages_", Page.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<Documentation> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (Documentation.class) {
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

    public String getDocumentationRootUrl() {
        return this.documentationRootUrl_;
    }

    public ByteString getDocumentationRootUrlBytes() {
        return ByteString.m137260e0(this.documentationRootUrl_);
    }

    public String getOverview() {
        return this.overview_;
    }

    public ByteString getOverviewBytes() {
        return ByteString.m137260e0(this.overview_);
    }

    public Page getPages(int i) {
        return this.pages_.get(i);
    }

    public int getPagesCount() {
        return this.pages_.size();
    }

    public List<Page> getPagesList() {
        return this.pages_;
    }

    public C32387c1 getPagesOrBuilder(int i) {
        return this.pages_.get(i);
    }

    public List<? extends C32387c1> getPagesOrBuilderList() {
        return this.pages_;
    }

    public DocumentationRule getRules(int i) {
        return this.rules_.get(i);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<DocumentationRule> getRulesList() {
        return this.rules_;
    }

    public C32380a0 getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends C32380a0> getRulesOrBuilderList() {
        return this.rules_;
    }

    public String getSummary() {
        return this.summary_;
    }

    public ByteString getSummaryBytes() {
        return ByteString.m137260e0(this.summary_);
    }

    public static C32291b newBuilder(Documentation documentation) {
        return (C32291b) DEFAULT_INSTANCE.createBuilder(documentation);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Documentation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static Documentation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addPages(int i, Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.add(i, page);
    }

    /* access modifiers changed from: private */
    public void addRules(int i, DocumentationRule documentationRule) {
        documentationRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, documentationRule);
    }

    public static Documentation parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static Documentation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Documentation parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static Documentation parseFrom(InputStream inputStream) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Documentation parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static Documentation parseFrom(C34448s sVar) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static Documentation parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (Documentation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
