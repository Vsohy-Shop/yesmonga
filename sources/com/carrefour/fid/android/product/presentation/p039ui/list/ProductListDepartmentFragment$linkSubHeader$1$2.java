package com.carrefour.fid.android.product.presentation.p039ui.list;

import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.product.C27455c;
import com.carrefour.fid.android.product.C27609f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "productCategory", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/domain/models/category/ProductCategory;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.ProductListDepartmentFragment$linkSubHeader$1$2 */
public final class ProductListDepartmentFragment$linkSubHeader$1$2 extends Lambda implements C11300l<ProductCategory, C11079d2> {
    final /* synthetic */ ProductCategory $department;
    final /* synthetic */ ProductListDepartmentFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductListDepartmentFragment$linkSubHeader$1$2(ProductCategory productCategory, ProductListDepartmentFragment productListDepartmentFragment) {
        super(1);
        this.$department = productCategory;
        this.this$0 = productListDepartmentFragment;
    }

    /* renamed from: a */
    public final void mo81551a(@C12579k ProductCategory productCategory) {
        Intrinsics.checkNotNullParameter(productCategory, "productCategory");
        C19736g.m91827a(this.this$0).mo58130W(C27609f.C27619j.product_list_department_graph, new C27455c(productCategory, this.$department.mo117297q()).mo79808h());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81551a((ProductCategory) obj);
        return C11079d2.f28267a;
    }
}
