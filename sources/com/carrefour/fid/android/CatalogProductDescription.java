package com.carrefour.fid.android;

import com.carrefour.fid.android.CatalogProductPicto;
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

public final class CatalogProductDescription extends GeneratedMessageLite<CatalogProductDescription, C13118b> implements C13974d {
    public static final int CONTENT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final CatalogProductDescription DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile C34504y1<CatalogProductDescription> PARSER = null;
    public static final int PICTOS_FIELD_NUMBER = 3;
    private String content_ = "";
    private String label_ = "";
    private C34471v0.C34488k<CatalogProductPicto> pictos_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.carrefour.fid.android.CatalogProductDescription$a */
    public static /* synthetic */ class C13117a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32239a;

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
                f32239a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32239a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32239a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32239a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32239a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32239a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32239a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.CatalogProductDescription.C13117a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.CatalogProductDescription$b */
    public static final class C13118b extends GeneratedMessageLite.C34263b<CatalogProductDescription, C13118b> implements C13974d {
        /* renamed from: P */
        public C13118b mo30769P(Iterable<? extends CatalogProductPicto> iterable) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).addAllPictos(iterable);
            return this;
        }

        /* renamed from: R */
        public C13118b mo30770R(int i, CatalogProductPicto.C13120b bVar) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).addPictos(i, (CatalogProductPicto) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C13118b mo30771S(int i, CatalogProductPicto catalogProductPicto) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).addPictos(i, catalogProductPicto);
            return this;
        }

        /* renamed from: T */
        public C13118b mo30772T(CatalogProductPicto.C13120b bVar) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).addPictos((CatalogProductPicto) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C13118b mo30773U(CatalogProductPicto catalogProductPicto) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).addPictos(catalogProductPicto);
            return this;
        }

        /* renamed from: V */
        public C13118b mo30774V() {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).clearContent();
            return this;
        }

        /* renamed from: Y */
        public C13118b mo30775Y() {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).clearLabel();
            return this;
        }

        /* renamed from: Z */
        public C13118b mo30776Z() {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).clearPictos();
            return this;
        }

        /* renamed from: a0 */
        public C13118b mo30777a0(int i) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).removePictos(i);
            return this;
        }

        /* renamed from: b0 */
        public C13118b mo30778b0(String str) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).setContent(str);
            return this;
        }

        /* renamed from: c0 */
        public C13118b mo30779c0(ByteString byteString) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).setContentBytes(byteString);
            return this;
        }

        /* renamed from: d0 */
        public C13118b mo30780d0(String str) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).setLabel(str);
            return this;
        }

        /* renamed from: g0 */
        public C13118b mo30781g0(ByteString byteString) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).setLabelBytes(byteString);
            return this;
        }

        public String getContent() {
            return ((CatalogProductDescription) this.f83053b).getContent();
        }

        public ByteString getContentBytes() {
            return ((CatalogProductDescription) this.f83053b).getContentBytes();
        }

        public String getLabel() {
            return ((CatalogProductDescription) this.f83053b).getLabel();
        }

        public ByteString getLabelBytes() {
            return ((CatalogProductDescription) this.f83053b).getLabelBytes();
        }

        public CatalogProductPicto getPictos(int i) {
            return ((CatalogProductDescription) this.f83053b).getPictos(i);
        }

        public int getPictosCount() {
            return ((CatalogProductDescription) this.f83053b).getPictosCount();
        }

        public List<CatalogProductPicto> getPictosList() {
            return Collections.unmodifiableList(((CatalogProductDescription) this.f83053b).getPictosList());
        }

        /* renamed from: h0 */
        public C13118b mo30782h0(int i, CatalogProductPicto.C13120b bVar) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).setPictos(i, (CatalogProductPicto) bVar.mo100473g());
            return this;
        }

        /* renamed from: i0 */
        public C13118b mo30783i0(int i, CatalogProductPicto catalogProductPicto) {
            mo100457F();
            ((CatalogProductDescription) this.f83053b).setPictos(i, catalogProductPicto);
            return this;
        }

        public C13118b() {
            super(CatalogProductDescription.DEFAULT_INSTANCE);
        }
    }

    static {
        CatalogProductDescription catalogProductDescription = new CatalogProductDescription();
        DEFAULT_INSTANCE = catalogProductDescription;
        GeneratedMessageLite.registerDefaultInstance(CatalogProductDescription.class, catalogProductDescription);
    }

    private CatalogProductDescription() {
    }

    /* access modifiers changed from: private */
    public void addAllPictos(Iterable<? extends CatalogProductPicto> iterable) {
        ensurePictosIsMutable();
        C34319a.addAll(iterable, this.pictos_);
    }

    /* access modifiers changed from: private */
    public void addPictos(CatalogProductPicto catalogProductPicto) {
        catalogProductPicto.getClass();
        ensurePictosIsMutable();
        this.pictos_.add(catalogProductPicto);
    }

    /* access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    /* access modifiers changed from: private */
    public void clearPictos() {
        this.pictos_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePictosIsMutable() {
        C34471v0.C34488k<CatalogProductPicto> kVar = this.pictos_;
        if (!kVar.mo100971T()) {
            this.pictos_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static CatalogProductDescription getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13118b newBuilder() {
        return (C13118b) DEFAULT_INSTANCE.createBuilder();
    }

    public static CatalogProductDescription parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CatalogProductDescription) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CatalogProductDescription parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<CatalogProductDescription> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removePictos(int i) {
        ensurePictosIsMutable();
        this.pictos_.remove(i);
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
    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    /* access modifiers changed from: private */
    public void setLabelBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.label_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setPictos(int i, CatalogProductPicto catalogProductPicto) {
        catalogProductPicto.getClass();
        ensurePictosIsMutable();
        this.pictos_.set(i, catalogProductPicto);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13117a.f32239a[methodToInvoke.ordinal()]) {
            case 1:
                return new CatalogProductDescription();
            case 2:
                return new C13118b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"label_", "content_", "pictos_", CatalogProductPicto.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<CatalogProductDescription> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (CatalogProductDescription.class) {
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

    public String getLabel() {
        return this.label_;
    }

    public ByteString getLabelBytes() {
        return ByteString.m137260e0(this.label_);
    }

    public CatalogProductPicto getPictos(int i) {
        return this.pictos_.get(i);
    }

    public int getPictosCount() {
        return this.pictos_.size();
    }

    public List<CatalogProductPicto> getPictosList() {
        return this.pictos_;
    }

    public C13980g getPictosOrBuilder(int i) {
        return this.pictos_.get(i);
    }

    public List<? extends C13980g> getPictosOrBuilderList() {
        return this.pictos_;
    }

    public static C13118b newBuilder(CatalogProductDescription catalogProductDescription) {
        return (C13118b) DEFAULT_INSTANCE.createBuilder(catalogProductDescription);
    }

    public static CatalogProductDescription parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (CatalogProductDescription) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static CatalogProductDescription parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static CatalogProductDescription parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addPictos(int i, CatalogProductPicto catalogProductPicto) {
        catalogProductPicto.getClass();
        ensurePictosIsMutable();
        this.pictos_.add(i, catalogProductPicto);
    }

    public static CatalogProductDescription parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static CatalogProductDescription parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CatalogProductDescription parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static CatalogProductDescription parseFrom(InputStream inputStream) throws IOException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CatalogProductDescription parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static CatalogProductDescription parseFrom(C34448s sVar) throws IOException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static CatalogProductDescription parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (CatalogProductDescription) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
