package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B9\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPdpProducts;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "component1", "", "component2", "product", "mixedProducts", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "getProduct", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "getProduct$annotations", "()V", "Ljava/util/List;", "getMixedProducts", "()Ljava/util/List;", "getMixedProducts$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffPdpProducts {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, new C12269f(BffCommonProduct$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final List<BffCommonProduct> mixedProducts;
    @C12580l
    private final BffCommonProduct product;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPdpProducts$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPdpProducts;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffPdpProducts> serializer() {
            return BffPdpProducts$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffPdpProducts() {
        this((BffCommonProduct) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffPdpProducts copy$default(BffPdpProducts bffPdpProducts, BffCommonProduct bffCommonProduct, List<BffCommonProduct> list, int i, Object obj) {
        if ((i & 1) != 0) {
            bffCommonProduct = bffPdpProducts.product;
        }
        if ((i & 2) != 0) {
            list = bffPdpProducts.mixedProducts;
        }
        return bffPdpProducts.copy(bffCommonProduct, list);
    }

    @C12438n("mixed_products")
    public static /* synthetic */ void getMixedProducts$annotations() {
    }

    @C12438n("product")
    public static /* synthetic */ void getProduct$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffPdpProducts bffPdpProducts, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffPdpProducts.product != null) {
            dVar.mo24912i(fVar, 0, BffCommonProduct$$serializer.INSTANCE, bffPdpProducts.product);
        }
        if (dVar.mo24897A(fVar, 1) || bffPdpProducts.mixedProducts != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, gVarArr[1], bffPdpProducts.mixedProducts);
        }
    }

    @C12580l
    public final BffCommonProduct component1() {
        return this.product;
    }

    @C12580l
    public final List<BffCommonProduct> component2() {
        return this.mixedProducts;
    }

    @C12579k
    public final BffPdpProducts copy(@C12580l BffCommonProduct bffCommonProduct, @C12580l List<BffCommonProduct> list) {
        return new BffPdpProducts(bffCommonProduct, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffPdpProducts)) {
            return false;
        }
        BffPdpProducts bffPdpProducts = (BffPdpProducts) obj;
        return Intrinsics.areEqual((Object) this.product, (Object) bffPdpProducts.product) && Intrinsics.areEqual((Object) this.mixedProducts, (Object) bffPdpProducts.mixedProducts);
    }

    @C12580l
    public final List<BffCommonProduct> getMixedProducts() {
        return this.mixedProducts;
    }

    @C12580l
    public final BffCommonProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        BffCommonProduct bffCommonProduct = this.product;
        int i = 0;
        int hashCode = (bffCommonProduct == null ? 0 : bffCommonProduct.hashCode()) * 31;
        List<BffCommonProduct> list = this.mixedProducts;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        BffCommonProduct bffCommonProduct = this.product;
        List<BffCommonProduct> list = this.mixedProducts;
        return "BffPdpProducts(product=" + bffCommonProduct + ", mixedProducts=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffPdpProducts(int i, @C12438n("product") BffCommonProduct bffCommonProduct, @C12438n("mixed_products") List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffPdpProducts$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.product = null;
        } else {
            this.product = bffCommonProduct;
        }
        if ((i & 2) == 0) {
            this.mixedProducts = null;
        } else {
            this.mixedProducts = list;
        }
    }

    public BffPdpProducts(@C12580l BffCommonProduct bffCommonProduct, @C12580l List<BffCommonProduct> list) {
        this.product = bffCommonProduct;
        this.mixedProducts = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffPdpProducts(BffCommonProduct bffCommonProduct, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffCommonProduct, (i & 2) != 0 ? null : list);
    }
}
