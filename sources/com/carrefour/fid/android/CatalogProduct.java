package com.carrefour.fid.android;

import com.carrefour.fid.android.CatalogProductDescription;
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

public final class CatalogProduct extends GeneratedMessageLite<CatalogProduct, C13116b> implements C13976e {
    public static final int BRAND_FIELD_NUMBER = 5;
    public static final int CATALOGENDDATA_FIELD_NUMBER = 14;
    public static final int CATALOGID_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final CatalogProduct DEFAULT_INSTANCE;
    public static final int DESCRIPTIONS_FIELD_NUMBER = 13;
    public static final int EAN_FIELD_NUMBER = 3;
    public static final int IMAGEURL_FIELD_NUMBER = 15;
    public static final int LEGALINFO_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGENUM_FIELD_NUMBER = 9;
    private static volatile C34504y1<CatalogProduct> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 6;
    public static final int PRODUCTID_FIELD_NUMBER = 1;
    public static final int PROMOIMAGE_FIELD_NUMBER = 7;
    public static final int SHELF_FIELD_NUMBER = 8;
    public static final int SUBSHELF_FIELD_NUMBER = 10;
    public static final int UNITPRICE_FIELD_NUMBER = 11;
    private String brand_ = "";
    private String catalogEndData_ = "";
    private String catalogId_ = "";
    private C34471v0.C34488k<CatalogProductDescription> descriptions_ = GeneratedMessageLite.emptyProtobufList();
    private String ean_ = "";
    private String imageUrl_ = "";
    private String legalInfo_ = "";
    private String name_ = "";
    private long pageNum_;
    private String price_ = "";
    private String productId_ = "";
    private String promoImage_ = "";
    private String shelf_ = "";
    private String subShelf_ = "";
    private String unitPrice_ = "";

    /* renamed from: com.carrefour.fid.android.CatalogProduct$a */
    public static /* synthetic */ class C13115a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32238a;

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
                f32238a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32238a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32238a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32238a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32238a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32238a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32238a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.CatalogProduct.C13115a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.CatalogProduct$b */
    public static final class C13116b extends GeneratedMessageLite.C34263b<CatalogProduct, C13116b> implements C13976e {
        /* renamed from: B0 */
        public C13116b mo30710B0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setEan(str);
            return this;
        }

        /* renamed from: D0 */
        public C13116b mo30711D0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setEanBytes(byteString);
            return this;
        }

        /* renamed from: E0 */
        public C13116b mo30712E0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setImageUrl(str);
            return this;
        }

        /* renamed from: F0 */
        public C13116b mo30713F0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setImageUrlBytes(byteString);
            return this;
        }

        /* renamed from: G0 */
        public C13116b mo30714G0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setLegalInfo(str);
            return this;
        }

        /* renamed from: H0 */
        public C13116b mo30715H0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setLegalInfoBytes(byteString);
            return this;
        }

        /* renamed from: I0 */
        public C13116b mo30716I0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setName(str);
            return this;
        }

        /* renamed from: J0 */
        public C13116b mo30717J0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setNameBytes(byteString);
            return this;
        }

        /* renamed from: L0 */
        public C13116b mo30718L0(long j) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setPageNum(j);
            return this;
        }

        /* renamed from: M0 */
        public C13116b mo30719M0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setPrice(str);
            return this;
        }

        /* renamed from: O0 */
        public C13116b mo30720O0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setPriceBytes(byteString);
            return this;
        }

        /* renamed from: P */
        public C13116b mo30721P(Iterable<? extends CatalogProductDescription> iterable) {
            mo100457F();
            ((CatalogProduct) this.f83053b).addAllDescriptions(iterable);
            return this;
        }

        /* renamed from: P0 */
        public C13116b mo30722P0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setProductId(str);
            return this;
        }

        /* renamed from: Q0 */
        public C13116b mo30723Q0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setProductIdBytes(byteString);
            return this;
        }

        /* renamed from: R */
        public C13116b mo30724R(int i, CatalogProductDescription.C13118b bVar) {
            mo100457F();
            ((CatalogProduct) this.f83053b).addDescriptions(i, (CatalogProductDescription) bVar.mo100473g());
            return this;
        }

        /* renamed from: R0 */
        public C13116b mo30725R0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setPromoImage(str);
            return this;
        }

        /* renamed from: S */
        public C13116b mo30726S(int i, CatalogProductDescription catalogProductDescription) {
            mo100457F();
            ((CatalogProduct) this.f83053b).addDescriptions(i, catalogProductDescription);
            return this;
        }

        /* renamed from: S0 */
        public C13116b mo30727S0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setPromoImageBytes(byteString);
            return this;
        }

        /* renamed from: T */
        public C13116b mo30728T(CatalogProductDescription.C13118b bVar) {
            mo100457F();
            ((CatalogProduct) this.f83053b).addDescriptions((CatalogProductDescription) bVar.mo100473g());
            return this;
        }

        /* renamed from: T0 */
        public C13116b mo30729T0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setShelf(str);
            return this;
        }

        /* renamed from: U */
        public C13116b mo30730U(CatalogProductDescription catalogProductDescription) {
            mo100457F();
            ((CatalogProduct) this.f83053b).addDescriptions(catalogProductDescription);
            return this;
        }

        /* renamed from: U0 */
        public C13116b mo30731U0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setShelfBytes(byteString);
            return this;
        }

        /* renamed from: V */
        public C13116b mo30732V() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearBrand();
            return this;
        }

        /* renamed from: V0 */
        public C13116b mo30733V0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setSubShelf(str);
            return this;
        }

        /* renamed from: W0 */
        public C13116b mo30734W0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setSubShelfBytes(byteString);
            return this;
        }

        /* renamed from: X0 */
        public C13116b mo30735X0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setUnitPrice(str);
            return this;
        }

        /* renamed from: Y */
        public C13116b mo30736Y() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearCatalogEndData();
            return this;
        }

        /* renamed from: Y0 */
        public C13116b mo30737Y0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setUnitPriceBytes(byteString);
            return this;
        }

        /* renamed from: Z */
        public C13116b mo30738Z() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearCatalogId();
            return this;
        }

        /* renamed from: a0 */
        public C13116b mo30739a0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearDescriptions();
            return this;
        }

        /* renamed from: b0 */
        public C13116b mo30740b0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearEan();
            return this;
        }

        /* renamed from: c0 */
        public C13116b mo30741c0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearImageUrl();
            return this;
        }

        /* renamed from: d0 */
        public C13116b mo30742d0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearLegalInfo();
            return this;
        }

        /* renamed from: g0 */
        public C13116b mo30743g0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearName();
            return this;
        }

        public String getBrand() {
            return ((CatalogProduct) this.f83053b).getBrand();
        }

        public ByteString getBrandBytes() {
            return ((CatalogProduct) this.f83053b).getBrandBytes();
        }

        public String getCatalogEndData() {
            return ((CatalogProduct) this.f83053b).getCatalogEndData();
        }

        public ByteString getCatalogEndDataBytes() {
            return ((CatalogProduct) this.f83053b).getCatalogEndDataBytes();
        }

        public String getCatalogId() {
            return ((CatalogProduct) this.f83053b).getCatalogId();
        }

        public ByteString getCatalogIdBytes() {
            return ((CatalogProduct) this.f83053b).getCatalogIdBytes();
        }

        public CatalogProductDescription getDescriptions(int i) {
            return ((CatalogProduct) this.f83053b).getDescriptions(i);
        }

        public int getDescriptionsCount() {
            return ((CatalogProduct) this.f83053b).getDescriptionsCount();
        }

        public List<CatalogProductDescription> getDescriptionsList() {
            return Collections.unmodifiableList(((CatalogProduct) this.f83053b).getDescriptionsList());
        }

        public String getEan() {
            return ((CatalogProduct) this.f83053b).getEan();
        }

        public ByteString getEanBytes() {
            return ((CatalogProduct) this.f83053b).getEanBytes();
        }

        public String getImageUrl() {
            return ((CatalogProduct) this.f83053b).getImageUrl();
        }

        public ByteString getImageUrlBytes() {
            return ((CatalogProduct) this.f83053b).getImageUrlBytes();
        }

        public String getLegalInfo() {
            return ((CatalogProduct) this.f83053b).getLegalInfo();
        }

        public ByteString getLegalInfoBytes() {
            return ((CatalogProduct) this.f83053b).getLegalInfoBytes();
        }

        public String getName() {
            return ((CatalogProduct) this.f83053b).getName();
        }

        public ByteString getNameBytes() {
            return ((CatalogProduct) this.f83053b).getNameBytes();
        }

        public long getPageNum() {
            return ((CatalogProduct) this.f83053b).getPageNum();
        }

        public String getPrice() {
            return ((CatalogProduct) this.f83053b).getPrice();
        }

        public ByteString getPriceBytes() {
            return ((CatalogProduct) this.f83053b).getPriceBytes();
        }

        public String getProductId() {
            return ((CatalogProduct) this.f83053b).getProductId();
        }

        public ByteString getProductIdBytes() {
            return ((CatalogProduct) this.f83053b).getProductIdBytes();
        }

        public String getPromoImage() {
            return ((CatalogProduct) this.f83053b).getPromoImage();
        }

        public ByteString getPromoImageBytes() {
            return ((CatalogProduct) this.f83053b).getPromoImageBytes();
        }

        public String getShelf() {
            return ((CatalogProduct) this.f83053b).getShelf();
        }

        public ByteString getShelfBytes() {
            return ((CatalogProduct) this.f83053b).getShelfBytes();
        }

        public String getSubShelf() {
            return ((CatalogProduct) this.f83053b).getSubShelf();
        }

        public ByteString getSubShelfBytes() {
            return ((CatalogProduct) this.f83053b).getSubShelfBytes();
        }

        public String getUnitPrice() {
            return ((CatalogProduct) this.f83053b).getUnitPrice();
        }

        public ByteString getUnitPriceBytes() {
            return ((CatalogProduct) this.f83053b).getUnitPriceBytes();
        }

        /* renamed from: h0 */
        public C13116b mo30744h0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearPageNum();
            return this;
        }

        /* renamed from: i0 */
        public C13116b mo30745i0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearPrice();
            return this;
        }

        /* renamed from: j0 */
        public C13116b mo30746j0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearProductId();
            return this;
        }

        /* renamed from: k0 */
        public C13116b mo30747k0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearPromoImage();
            return this;
        }

        /* renamed from: l0 */
        public C13116b mo30748l0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearShelf();
            return this;
        }

        /* renamed from: m0 */
        public C13116b mo30749m0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearSubShelf();
            return this;
        }

        /* renamed from: o0 */
        public C13116b mo30750o0() {
            mo100457F();
            ((CatalogProduct) this.f83053b).clearUnitPrice();
            return this;
        }

        /* renamed from: q0 */
        public C13116b mo30751q0(int i) {
            mo100457F();
            ((CatalogProduct) this.f83053b).removeDescriptions(i);
            return this;
        }

        /* renamed from: r0 */
        public C13116b mo30752r0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setBrand(str);
            return this;
        }

        /* renamed from: s0 */
        public C13116b mo30753s0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setBrandBytes(byteString);
            return this;
        }

        /* renamed from: u0 */
        public C13116b mo30754u0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setCatalogEndData(str);
            return this;
        }

        /* renamed from: v0 */
        public C13116b mo30755v0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setCatalogEndDataBytes(byteString);
            return this;
        }

        /* renamed from: w0 */
        public C13116b mo30756w0(String str) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setCatalogId(str);
            return this;
        }

        /* renamed from: x0 */
        public C13116b mo30757x0(ByteString byteString) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setCatalogIdBytes(byteString);
            return this;
        }

        /* renamed from: y0 */
        public C13116b mo30758y0(int i, CatalogProductDescription.C13118b bVar) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setDescriptions(i, (CatalogProductDescription) bVar.mo100473g());
            return this;
        }

        /* renamed from: z0 */
        public C13116b mo30759z0(int i, CatalogProductDescription catalogProductDescription) {
            mo100457F();
            ((CatalogProduct) this.f83053b).setDescriptions(i, catalogProductDescription);
            return this;
        }

        public C13116b() {
            super(CatalogProduct.DEFAULT_INSTANCE);
        }
    }

    static {
        CatalogProduct catalogProduct = new CatalogProduct();
        DEFAULT_INSTANCE = catalogProduct;
        GeneratedMessageLite.registerDefaultInstance(CatalogProduct.class, catalogProduct);
    }

    private CatalogProduct() {
    }

    /* access modifiers changed from: private */
    public void addAllDescriptions(Iterable<? extends CatalogProductDescription> iterable) {
        ensureDescriptionsIsMutable();
        C34319a.addAll(iterable, this.descriptions_);
    }

    /* access modifiers changed from: private */
    public void addDescriptions(CatalogProductDescription catalogProductDescription) {
        catalogProductDescription.getClass();
        ensureDescriptionsIsMutable();
        this.descriptions_.add(catalogProductDescription);
    }

    /* access modifiers changed from: private */
    public void clearBrand() {
        this.brand_ = getDefaultInstance().getBrand();
    }

    /* access modifiers changed from: private */
    public void clearCatalogEndData() {
        this.catalogEndData_ = getDefaultInstance().getCatalogEndData();
    }

    /* access modifiers changed from: private */
    public void clearCatalogId() {
        this.catalogId_ = getDefaultInstance().getCatalogId();
    }

    /* access modifiers changed from: private */
    public void clearDescriptions() {
        this.descriptions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* access modifiers changed from: private */
    public void clearEan() {
        this.ean_ = getDefaultInstance().getEan();
    }

    /* access modifiers changed from: private */
    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* access modifiers changed from: private */
    public void clearLegalInfo() {
        this.legalInfo_ = getDefaultInstance().getLegalInfo();
    }

    /* access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* access modifiers changed from: private */
    public void clearPageNum() {
        this.pageNum_ = 0;
    }

    /* access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = getDefaultInstance().getPrice();
    }

    /* access modifiers changed from: private */
    public void clearProductId() {
        this.productId_ = getDefaultInstance().getProductId();
    }

    /* access modifiers changed from: private */
    public void clearPromoImage() {
        this.promoImage_ = getDefaultInstance().getPromoImage();
    }

    /* access modifiers changed from: private */
    public void clearShelf() {
        this.shelf_ = getDefaultInstance().getShelf();
    }

    /* access modifiers changed from: private */
    public void clearSubShelf() {
        this.subShelf_ = getDefaultInstance().getSubShelf();
    }

    /* access modifiers changed from: private */
    public void clearUnitPrice() {
        this.unitPrice_ = getDefaultInstance().getUnitPrice();
    }

    private void ensureDescriptionsIsMutable() {
        C34471v0.C34488k<CatalogProductDescription> kVar = this.descriptions_;
        if (!kVar.mo100971T()) {
            this.descriptions_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static CatalogProduct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13116b newBuilder() {
        return (C13116b) DEFAULT_INSTANCE.createBuilder();
    }

    public static CatalogProduct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CatalogProduct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CatalogProduct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<CatalogProduct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeDescriptions(int i) {
        ensureDescriptionsIsMutable();
        this.descriptions_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setBrand(String str) {
        str.getClass();
        this.brand_ = str;
    }

    /* access modifiers changed from: private */
    public void setBrandBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.brand_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setCatalogEndData(String str) {
        str.getClass();
        this.catalogEndData_ = str;
    }

    /* access modifiers changed from: private */
    public void setCatalogEndDataBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.catalogEndData_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setCatalogId(String str) {
        str.getClass();
        this.catalogId_ = str;
    }

    /* access modifiers changed from: private */
    public void setCatalogIdBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.catalogId_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setDescriptions(int i, CatalogProductDescription catalogProductDescription) {
        catalogProductDescription.getClass();
        ensureDescriptionsIsMutable();
        this.descriptions_.set(i, catalogProductDescription);
    }

    /* access modifiers changed from: private */
    public void setEan(String str) {
        str.getClass();
        this.ean_ = str;
    }

    /* access modifiers changed from: private */
    public void setEanBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.ean_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setImageUrl(String str) {
        str.getClass();
        this.imageUrl_ = str;
    }

    /* access modifiers changed from: private */
    public void setImageUrlBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.imageUrl_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setLegalInfo(String str) {
        str.getClass();
        this.legalInfo_ = str;
    }

    /* access modifiers changed from: private */
    public void setLegalInfoBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.legalInfo_ = byteString.mo99228S0();
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
    public void setPageNum(long j) {
        this.pageNum_ = j;
    }

    /* access modifiers changed from: private */
    public void setPrice(String str) {
        str.getClass();
        this.price_ = str;
    }

    /* access modifiers changed from: private */
    public void setPriceBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.price_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setProductId(String str) {
        str.getClass();
        this.productId_ = str;
    }

    /* access modifiers changed from: private */
    public void setProductIdBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.productId_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setPromoImage(String str) {
        str.getClass();
        this.promoImage_ = str;
    }

    /* access modifiers changed from: private */
    public void setPromoImageBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.promoImage_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setShelf(String str) {
        str.getClass();
        this.shelf_ = str;
    }

    /* access modifiers changed from: private */
    public void setShelfBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.shelf_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setSubShelf(String str) {
        str.getClass();
        this.subShelf_ = str;
    }

    /* access modifiers changed from: private */
    public void setSubShelfBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.subShelf_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setUnitPrice(String str) {
        str.getClass();
        this.unitPrice_ = str;
    }

    /* access modifiers changed from: private */
    public void setUnitPriceBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.unitPrice_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13115a.f32238a[methodToInvoke.ordinal()]) {
            case 1:
                return new CatalogProduct();
            case 2:
                return new C13116b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t\u0002\nȈ\u000bȈ\fȈ\r\u001b\u000eȈ\u000fȈ", new Object[]{"productId_", "catalogId_", "ean_", "name_", "brand_", "price_", "promoImage_", "shelf_", "pageNum_", "subShelf_", "unitPrice_", "legalInfo_", "descriptions_", CatalogProductDescription.class, "catalogEndData_", "imageUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<CatalogProduct> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (CatalogProduct.class) {
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

    public String getBrand() {
        return this.brand_;
    }

    public ByteString getBrandBytes() {
        return ByteString.m137260e0(this.brand_);
    }

    public String getCatalogEndData() {
        return this.catalogEndData_;
    }

    public ByteString getCatalogEndDataBytes() {
        return ByteString.m137260e0(this.catalogEndData_);
    }

    public String getCatalogId() {
        return this.catalogId_;
    }

    public ByteString getCatalogIdBytes() {
        return ByteString.m137260e0(this.catalogId_);
    }

    public CatalogProductDescription getDescriptions(int i) {
        return this.descriptions_.get(i);
    }

    public int getDescriptionsCount() {
        return this.descriptions_.size();
    }

    public List<CatalogProductDescription> getDescriptionsList() {
        return this.descriptions_;
    }

    public C13974d getDescriptionsOrBuilder(int i) {
        return this.descriptions_.get(i);
    }

    public List<? extends C13974d> getDescriptionsOrBuilderList() {
        return this.descriptions_;
    }

    public String getEan() {
        return this.ean_;
    }

    public ByteString getEanBytes() {
        return ByteString.m137260e0(this.ean_);
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public ByteString getImageUrlBytes() {
        return ByteString.m137260e0(this.imageUrl_);
    }

    public String getLegalInfo() {
        return this.legalInfo_;
    }

    public ByteString getLegalInfoBytes() {
        return ByteString.m137260e0(this.legalInfo_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.m137260e0(this.name_);
    }

    public long getPageNum() {
        return this.pageNum_;
    }

    public String getPrice() {
        return this.price_;
    }

    public ByteString getPriceBytes() {
        return ByteString.m137260e0(this.price_);
    }

    public String getProductId() {
        return this.productId_;
    }

    public ByteString getProductIdBytes() {
        return ByteString.m137260e0(this.productId_);
    }

    public String getPromoImage() {
        return this.promoImage_;
    }

    public ByteString getPromoImageBytes() {
        return ByteString.m137260e0(this.promoImage_);
    }

    public String getShelf() {
        return this.shelf_;
    }

    public ByteString getShelfBytes() {
        return ByteString.m137260e0(this.shelf_);
    }

    public String getSubShelf() {
        return this.subShelf_;
    }

    public ByteString getSubShelfBytes() {
        return ByteString.m137260e0(this.subShelf_);
    }

    public String getUnitPrice() {
        return this.unitPrice_;
    }

    public ByteString getUnitPriceBytes() {
        return ByteString.m137260e0(this.unitPrice_);
    }

    public static C13116b newBuilder(CatalogProduct catalogProduct) {
        return (C13116b) DEFAULT_INSTANCE.createBuilder(catalogProduct);
    }

    public static CatalogProduct parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (CatalogProduct) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static CatalogProduct parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static CatalogProduct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addDescriptions(int i, CatalogProductDescription catalogProductDescription) {
        catalogProductDescription.getClass();
        ensureDescriptionsIsMutable();
        this.descriptions_.add(i, catalogProductDescription);
    }

    public static CatalogProduct parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static CatalogProduct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CatalogProduct parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static CatalogProduct parseFrom(InputStream inputStream) throws IOException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CatalogProduct parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static CatalogProduct parseFrom(C34448s sVar) throws IOException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static CatalogProduct parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (CatalogProduct) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
