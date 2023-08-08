package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12295n1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"B3\b\u0017\u0012\u0006\u0010#\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u000e\u001a\u00020\u000b8\u0016X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFrequentlyPurchasedProductEnvelop;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductEnvelop;", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "component2", "metadata", "product", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;", "getMetadata", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;", "getMetadata$annotations", "()V", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "getProduct", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "getProduct$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffFrequentlyPurchasedProductEnvelop extends BffProductEnvelop {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffProductMetadata metadata;
    @C12579k
    private final BffCommonProduct product;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFrequentlyPurchasedProductEnvelop$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFrequentlyPurchasedProductEnvelop;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffFrequentlyPurchasedProductEnvelop> serializer() {
            return BffFrequentlyPurchasedProductEnvelop$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffFrequentlyPurchasedProductEnvelop(int i, @C12438n("frequently_purchased_product") BffProductMetadata bffProductMetadata, @C12438n("product") BffCommonProduct bffCommonProduct, C12295n1 n1Var) {
        if (2 != (i & 2)) {
            C12261c1.m49256b(i, 2, BffFrequentlyPurchasedProductEnvelop$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.metadata = null;
        } else {
            this.metadata = bffProductMetadata;
        }
        this.product = bffCommonProduct;
    }

    public static /* synthetic */ BffFrequentlyPurchasedProductEnvelop copy$default(BffFrequentlyPurchasedProductEnvelop bffFrequentlyPurchasedProductEnvelop, BffProductMetadata bffProductMetadata, BffCommonProduct bffCommonProduct, int i, Object obj) {
        if ((i & 1) != 0) {
            bffProductMetadata = bffFrequentlyPurchasedProductEnvelop.metadata;
        }
        if ((i & 2) != 0) {
            bffCommonProduct = bffFrequentlyPurchasedProductEnvelop.product;
        }
        return bffFrequentlyPurchasedProductEnvelop.copy(bffProductMetadata, bffCommonProduct);
    }

    @C12438n("frequently_purchased_product")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @C12438n("product")
    public static /* synthetic */ void getProduct$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffFrequentlyPurchasedProductEnvelop bffFrequentlyPurchasedProductEnvelop, C12239d dVar, C12217f fVar) {
        if (dVar.mo24897A(fVar, 0) || bffFrequentlyPurchasedProductEnvelop.getMetadata() != null) {
            dVar.mo24912i(fVar, 0, BffProductMetadata$$serializer.INSTANCE, bffFrequentlyPurchasedProductEnvelop.getMetadata());
        }
        dVar.mo24899D(fVar, 1, BffCommonProduct$$serializer.INSTANCE, bffFrequentlyPurchasedProductEnvelop.getProduct());
    }

    @C12580l
    public final BffProductMetadata component1() {
        return this.metadata;
    }

    @C12579k
    public final BffCommonProduct component2() {
        return this.product;
    }

    @C12579k
    public final BffFrequentlyPurchasedProductEnvelop copy(@C12580l BffProductMetadata bffProductMetadata, @C12579k BffCommonProduct bffCommonProduct) {
        Intrinsics.checkNotNullParameter(bffCommonProduct, "product");
        return new BffFrequentlyPurchasedProductEnvelop(bffProductMetadata, bffCommonProduct);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffFrequentlyPurchasedProductEnvelop)) {
            return false;
        }
        BffFrequentlyPurchasedProductEnvelop bffFrequentlyPurchasedProductEnvelop = (BffFrequentlyPurchasedProductEnvelop) obj;
        return Intrinsics.areEqual((Object) this.metadata, (Object) bffFrequentlyPurchasedProductEnvelop.metadata) && Intrinsics.areEqual((Object) this.product, (Object) bffFrequentlyPurchasedProductEnvelop.product);
    }

    @C12580l
    public BffProductMetadata getMetadata() {
        return this.metadata;
    }

    @C12579k
    public BffCommonProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        BffProductMetadata bffProductMetadata = this.metadata;
        return ((bffProductMetadata == null ? 0 : bffProductMetadata.hashCode()) * 31) + this.product.hashCode();
    }

    @C12579k
    public String toString() {
        BffProductMetadata bffProductMetadata = this.metadata;
        BffCommonProduct bffCommonProduct = this.product;
        return "BffFrequentlyPurchasedProductEnvelop(metadata=" + bffProductMetadata + ", product=" + bffCommonProduct + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffFrequentlyPurchasedProductEnvelop(BffProductMetadata bffProductMetadata, BffCommonProduct bffCommonProduct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffProductMetadata, bffCommonProduct);
    }

    public BffFrequentlyPurchasedProductEnvelop(@C12580l BffProductMetadata bffProductMetadata, @C12579k BffCommonProduct bffCommonProduct) {
        Intrinsics.checkNotNullParameter(bffCommonProduct, "product");
        this.metadata = bffProductMetadata;
        this.product = bffCommonProduct;
    }
}
