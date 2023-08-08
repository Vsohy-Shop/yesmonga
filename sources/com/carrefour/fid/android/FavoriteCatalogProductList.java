package com.carrefour.fid.android;

import com.carrefour.fid.android.CatalogProduct;
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

public final class FavoriteCatalogProductList extends GeneratedMessageLite<FavoriteCatalogProductList, C13122b> implements C14083z {
    /* access modifiers changed from: private */
    public static final FavoriteCatalogProductList DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile C34504y1<FavoriteCatalogProductList> PARSER;
    private C34471v0.C34488k<CatalogProduct> items_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.carrefour.fid.android.FavoriteCatalogProductList$a */
    public static /* synthetic */ class C13121a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32241a;

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
                f32241a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32241a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32241a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32241a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32241a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32241a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32241a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.FavoriteCatalogProductList.C13121a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.FavoriteCatalogProductList$b */
    public static final class C13122b extends GeneratedMessageLite.C34263b<FavoriteCatalogProductList, C13122b> implements C14083z {
        /* renamed from: P */
        public C13122b mo30799P(Iterable<? extends CatalogProduct> iterable) {
            mo100457F();
            ((FavoriteCatalogProductList) this.f83053b).addAllItems(iterable);
            return this;
        }

        /* renamed from: R */
        public C13122b mo30800R(int i, CatalogProduct.C13116b bVar) {
            mo100457F();
            ((FavoriteCatalogProductList) this.f83053b).addItems(i, (CatalogProduct) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C13122b mo30801S(int i, CatalogProduct catalogProduct) {
            mo100457F();
            ((FavoriteCatalogProductList) this.f83053b).addItems(i, catalogProduct);
            return this;
        }

        /* renamed from: T */
        public C13122b mo30802T(CatalogProduct.C13116b bVar) {
            mo100457F();
            ((FavoriteCatalogProductList) this.f83053b).addItems((CatalogProduct) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C13122b mo30803U(CatalogProduct catalogProduct) {
            mo100457F();
            ((FavoriteCatalogProductList) this.f83053b).addItems(catalogProduct);
            return this;
        }

        /* renamed from: V */
        public C13122b mo30804V() {
            mo100457F();
            ((FavoriteCatalogProductList) this.f83053b).clearItems();
            return this;
        }

        /* renamed from: Y */
        public C13122b mo30805Y(int i) {
            mo100457F();
            ((FavoriteCatalogProductList) this.f83053b).removeItems(i);
            return this;
        }

        /* renamed from: Z */
        public C13122b mo30806Z(int i, CatalogProduct.C13116b bVar) {
            mo100457F();
            ((FavoriteCatalogProductList) this.f83053b).setItems(i, (CatalogProduct) bVar.mo100473g());
            return this;
        }

        /* renamed from: a0 */
        public C13122b mo30807a0(int i, CatalogProduct catalogProduct) {
            mo100457F();
            ((FavoriteCatalogProductList) this.f83053b).setItems(i, catalogProduct);
            return this;
        }

        public CatalogProduct getItems(int i) {
            return ((FavoriteCatalogProductList) this.f83053b).getItems(i);
        }

        public int getItemsCount() {
            return ((FavoriteCatalogProductList) this.f83053b).getItemsCount();
        }

        public List<CatalogProduct> getItemsList() {
            return Collections.unmodifiableList(((FavoriteCatalogProductList) this.f83053b).getItemsList());
        }

        public C13122b() {
            super(FavoriteCatalogProductList.DEFAULT_INSTANCE);
        }
    }

    static {
        FavoriteCatalogProductList favoriteCatalogProductList = new FavoriteCatalogProductList();
        DEFAULT_INSTANCE = favoriteCatalogProductList;
        GeneratedMessageLite.registerDefaultInstance(FavoriteCatalogProductList.class, favoriteCatalogProductList);
    }

    private FavoriteCatalogProductList() {
    }

    /* access modifiers changed from: private */
    public void addAllItems(Iterable<? extends CatalogProduct> iterable) {
        ensureItemsIsMutable();
        C34319a.addAll(iterable, this.items_);
    }

    /* access modifiers changed from: private */
    public void addItems(CatalogProduct catalogProduct) {
        catalogProduct.getClass();
        ensureItemsIsMutable();
        this.items_.add(catalogProduct);
    }

    /* access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        C34471v0.C34488k<CatalogProduct> kVar = this.items_;
        if (!kVar.mo100971T()) {
            this.items_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static FavoriteCatalogProductList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13122b newBuilder() {
        return (C13122b) DEFAULT_INSTANCE.createBuilder();
    }

    public static FavoriteCatalogProductList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteCatalogProductList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<FavoriteCatalogProductList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setItems(int i, CatalogProduct catalogProduct) {
        catalogProduct.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, catalogProduct);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13121a.f32241a[methodToInvoke.ordinal()]) {
            case 1:
                return new FavoriteCatalogProductList();
            case 2:
                return new C13122b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", CatalogProduct.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<FavoriteCatalogProductList> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (FavoriteCatalogProductList.class) {
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

    public CatalogProduct getItems(int i) {
        return this.items_.get(i);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<CatalogProduct> getItemsList() {
        return this.items_;
    }

    public C13976e getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends C13976e> getItemsOrBuilderList() {
        return this.items_;
    }

    public static C13122b newBuilder(FavoriteCatalogProductList favoriteCatalogProductList) {
        return (C13122b) DEFAULT_INSTANCE.createBuilder(favoriteCatalogProductList);
    }

    public static FavoriteCatalogProductList parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static FavoriteCatalogProductList parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static FavoriteCatalogProductList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addItems(int i, CatalogProduct catalogProduct) {
        catalogProduct.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, catalogProduct);
    }

    public static FavoriteCatalogProductList parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static FavoriteCatalogProductList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FavoriteCatalogProductList parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static FavoriteCatalogProductList parseFrom(InputStream inputStream) throws IOException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteCatalogProductList parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static FavoriteCatalogProductList parseFrom(C34448s sVar) throws IOException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static FavoriteCatalogProductList parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (FavoriteCatalogProductList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
