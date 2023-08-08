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

@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B7\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b&\u0010'BK\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0016\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001dR\"\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u0012\u0004\b%\u0010\u001f\u001a\u0004\b#\u0010$¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacetsObject;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacet;", "component1", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSortsObject;", "component2", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetrics;", "component3", "filters", "sorts", "productsMetrics", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "getFilters$annotations", "()V", "getSorts", "getSorts$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetrics;", "getProductsMetrics", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetrics;", "getProductsMetrics$annotations", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetrics;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductMetrics;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffFacetsObject {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {new C12269f(BffFacet$$serializer.INSTANCE), new C12269f(BffSortsObject$$serializer.INSTANCE), null};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final List<BffFacet> filters;
    @C12580l
    private final BffProductMetrics productsMetrics;
    @C12580l
    private final List<BffSortsObject> sorts;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacetsObject$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacetsObject;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffFacetsObject> serializer() {
            return BffFacetsObject$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffFacetsObject() {
        this((List) null, (List) null, (BffProductMetrics) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffFacetsObject copy$default(BffFacetsObject bffFacetsObject, List<BffFacet> list, List<BffSortsObject> list2, BffProductMetrics bffProductMetrics, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bffFacetsObject.filters;
        }
        if ((i & 2) != 0) {
            list2 = bffFacetsObject.sorts;
        }
        if ((i & 4) != 0) {
            bffProductMetrics = bffFacetsObject.productsMetrics;
        }
        return bffFacetsObject.copy(list, list2, bffProductMetrics);
    }

    @C12438n("filters")
    public static /* synthetic */ void getFilters$annotations() {
    }

    @C12438n("products_metrics")
    public static /* synthetic */ void getProductsMetrics$annotations() {
    }

    @C12438n("sorts")
    public static /* synthetic */ void getSorts$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffFacetsObject bffFacetsObject, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffFacetsObject.filters != null) {
            dVar.mo24912i(fVar, 0, gVarArr[0], bffFacetsObject.filters);
        }
        if (dVar.mo24897A(fVar, 1) || bffFacetsObject.sorts != null) {
            dVar.mo24912i(fVar, 1, gVarArr[1], bffFacetsObject.sorts);
        }
        if (dVar.mo24897A(fVar, 2) || bffFacetsObject.productsMetrics != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 2, BffProductMetrics$$serializer.INSTANCE, bffFacetsObject.productsMetrics);
        }
    }

    @C12580l
    public final List<BffFacet> component1() {
        return this.filters;
    }

    @C12580l
    public final List<BffSortsObject> component2() {
        return this.sorts;
    }

    @C12580l
    public final BffProductMetrics component3() {
        return this.productsMetrics;
    }

    @C12579k
    public final BffFacetsObject copy(@C12580l List<BffFacet> list, @C12580l List<BffSortsObject> list2, @C12580l BffProductMetrics bffProductMetrics) {
        return new BffFacetsObject(list, list2, bffProductMetrics);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffFacetsObject)) {
            return false;
        }
        BffFacetsObject bffFacetsObject = (BffFacetsObject) obj;
        return Intrinsics.areEqual((Object) this.filters, (Object) bffFacetsObject.filters) && Intrinsics.areEqual((Object) this.sorts, (Object) bffFacetsObject.sorts) && Intrinsics.areEqual((Object) this.productsMetrics, (Object) bffFacetsObject.productsMetrics);
    }

    @C12580l
    public final List<BffFacet> getFilters() {
        return this.filters;
    }

    @C12580l
    public final BffProductMetrics getProductsMetrics() {
        return this.productsMetrics;
    }

    @C12580l
    public final List<BffSortsObject> getSorts() {
        return this.sorts;
    }

    public int hashCode() {
        List<BffFacet> list = this.filters;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<BffSortsObject> list2 = this.sorts;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        BffProductMetrics bffProductMetrics = this.productsMetrics;
        if (bffProductMetrics != null) {
            i = bffProductMetrics.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        List<BffFacet> list = this.filters;
        List<BffSortsObject> list2 = this.sorts;
        BffProductMetrics bffProductMetrics = this.productsMetrics;
        return "BffFacetsObject(filters=" + list + ", sorts=" + list2 + ", productsMetrics=" + bffProductMetrics + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffFacetsObject(int i, @C12438n("filters") List list, @C12438n("sorts") List list2, @C12438n("products_metrics") BffProductMetrics bffProductMetrics, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffFacetsObject$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.filters = null;
        } else {
            this.filters = list;
        }
        if ((i & 2) == 0) {
            this.sorts = null;
        } else {
            this.sorts = list2;
        }
        if ((i & 4) == 0) {
            this.productsMetrics = null;
        } else {
            this.productsMetrics = bffProductMetrics;
        }
    }

    public BffFacetsObject(@C12580l List<BffFacet> list, @C12580l List<BffSortsObject> list2, @C12580l BffProductMetrics bffProductMetrics) {
        this.filters = list;
        this.sorts = list2;
        this.productsMetrics = bffProductMetrics;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BffFacetsObject(List list, List list2, BffProductMetrics bffProductMetrics, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : bffProductMetrics);
    }
}
