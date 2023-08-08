package com.carrefour.fid.android.presentation.p035ui.product.filter.adapter;

import com.carrefour.fid.android.presentation.models.SortModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo22516d2 = {"<anonymous>", "", "Lcom/carrefour/fid/android/presentation/models/SortModel;", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nProductListFiltersSortAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersSortAdapter.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/adapter/ProductListFiltersSortAdapter$list$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,69:1\n13579#2:70\n13579#2,2:71\n13580#2:73\n*S KotlinDebug\n*F\n+ 1 ProductListFiltersSortAdapter.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/adapter/ProductListFiltersSortAdapter$list$2\n*L\n25#1:70\n29#1:71,2\n25#1:73\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.ProductListFiltersSortAdapter$list$2 */
public final class ProductListFiltersSortAdapter$list$2 extends Lambda implements C11289a<List<? extends SortModel>> {

    /* renamed from: f */
    public static final ProductListFiltersSortAdapter$list$2 f62574f = new ProductListFiltersSortAdapter$list$2();

    public ProductListFiltersSortAdapter$list$2() {
        super(0);
    }

    @C12579k
    public final List<SortModel> invoke() {
        ArrayList arrayList = new ArrayList();
        for (SortModel.SortValue sortValue : SortModel.SortValue.values()) {
            if (sortValue == SortModel.SortValue.DEFAULT) {
                arrayList.add(new SortModel(sortValue, (SortModel.SortOrder) null, 2, (DefaultConstructorMarker) null));
            } else {
                for (SortModel.SortOrder sortModel : SortModel.SortOrder.values()) {
                    arrayList.add(new SortModel(sortValue, sortModel));
                }
            }
        }
        return CollectionsKt___CollectionsKt.m40557Q5(arrayList);
    }
}
