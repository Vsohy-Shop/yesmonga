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

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSuggestedProductsData;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "component2", "suggestedProduct", "product", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;", "getSuggestedProduct", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;", "getSuggestedProduct$annotations", "()V", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "getProduct", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "getProduct$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetadata;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffSuggestedProductsData {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffCommonProduct product;
    @C12580l
    private final BffProductMetadata suggestedProduct;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSuggestedProductsData$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSuggestedProductsData;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffSuggestedProductsData> serializer() {
            return BffSuggestedProductsData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffSuggestedProductsData() {
        this((BffProductMetadata) null, (BffCommonProduct) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffSuggestedProductsData copy$default(BffSuggestedProductsData bffSuggestedProductsData, BffProductMetadata bffProductMetadata, BffCommonProduct bffCommonProduct, int i, Object obj) {
        if ((i & 1) != 0) {
            bffProductMetadata = bffSuggestedProductsData.suggestedProduct;
        }
        if ((i & 2) != 0) {
            bffCommonProduct = bffSuggestedProductsData.product;
        }
        return bffSuggestedProductsData.copy(bffProductMetadata, bffCommonProduct);
    }

    @C12438n("product")
    public static /* synthetic */ void getProduct$annotations() {
    }

    @C12438n("suggested_product")
    public static /* synthetic */ void getSuggestedProduct$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffSuggestedProductsData bffSuggestedProductsData, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffSuggestedProductsData.suggestedProduct != null) {
            dVar.mo24912i(fVar, 0, BffProductMetadata$$serializer.INSTANCE, bffSuggestedProductsData.suggestedProduct);
        }
        if (dVar.mo24897A(fVar, 1) || bffSuggestedProductsData.product != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 1, BffCommonProduct$$serializer.INSTANCE, bffSuggestedProductsData.product);
        }
    }

    @C12580l
    public final BffProductMetadata component1() {
        return this.suggestedProduct;
    }

    @C12580l
    public final BffCommonProduct component2() {
        return this.product;
    }

    @C12579k
    public final BffSuggestedProductsData copy(@C12580l BffProductMetadata bffProductMetadata, @C12580l BffCommonProduct bffCommonProduct) {
        return new BffSuggestedProductsData(bffProductMetadata, bffCommonProduct);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffSuggestedProductsData)) {
            return false;
        }
        BffSuggestedProductsData bffSuggestedProductsData = (BffSuggestedProductsData) obj;
        return Intrinsics.areEqual((Object) this.suggestedProduct, (Object) bffSuggestedProductsData.suggestedProduct) && Intrinsics.areEqual((Object) this.product, (Object) bffSuggestedProductsData.product);
    }

    @C12580l
    public final BffCommonProduct getProduct() {
        return this.product;
    }

    @C12580l
    public final BffProductMetadata getSuggestedProduct() {
        return this.suggestedProduct;
    }

    public int hashCode() {
        BffProductMetadata bffProductMetadata = this.suggestedProduct;
        int i = 0;
        int hashCode = (bffProductMetadata == null ? 0 : bffProductMetadata.hashCode()) * 31;
        BffCommonProduct bffCommonProduct = this.product;
        if (bffCommonProduct != null) {
            i = bffCommonProduct.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        BffProductMetadata bffProductMetadata = this.suggestedProduct;
        BffCommonProduct bffCommonProduct = this.product;
        return "BffSuggestedProductsData(suggestedProduct=" + bffProductMetadata + ", product=" + bffCommonProduct + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffSuggestedProductsData(int i, @C12438n("suggested_product") BffProductMetadata bffProductMetadata, @C12438n("product") BffCommonProduct bffCommonProduct, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffSuggestedProductsData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.suggestedProduct = null;
        } else {
            this.suggestedProduct = bffProductMetadata;
        }
        if ((i & 2) == 0) {
            this.product = null;
        } else {
            this.product = bffCommonProduct;
        }
    }

    public BffSuggestedProductsData(@C12580l BffProductMetadata bffProductMetadata, @C12580l BffCommonProduct bffCommonProduct) {
        this.suggestedProduct = bffProductMetadata;
        this.product = bffCommonProduct;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffSuggestedProductsData(BffProductMetadata bffProductMetadata, BffCommonProduct bffCommonProduct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bffProductMetadata, (i & 2) != 0 ? null : bffCommonProduct);
    }
}
