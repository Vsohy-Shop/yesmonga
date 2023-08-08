package com.carrefour.fid.android.categories.presentation.p067ui.department;

import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.categories.presentation.p067ui.department.C39778c;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.product.C27455c;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentDetailsFragment$configureList$1$1 */
public final class DepartmentDetailsFragment$configureList$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ ProductCategory $childProductCategory;
    final /* synthetic */ DepartmentDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentDetailsFragment$configureList$1$1(ProductCategory productCategory, DepartmentDetailsFragment departmentDetailsFragment) {
        super(0);
        this.$childProductCategory = productCategory;
        this.this$0 = departmentDetailsFragment;
    }

    public final void invoke() {
        if (!this.$childProductCategory.mo117293m().isEmpty()) {
            this.this$0.mo131077U0().mo131071f(this.$childProductCategory.mo117297q());
            DepartmentDetailsFragment departmentDetailsFragment = this.this$0;
            FragmentKt.m118823k(departmentDetailsFragment, C39778c.C39780b.m162313b(C39778c.f101506a, this.$childProductCategory, departmentDetailsFragment.mo131076T0().mo131141h().mo117297q(), false, 4, (Object) null));
            return;
        }
        C19736g.m91827a(this.this$0).mo58130W(C39711b.C39721j.product_list_department_graph, new C27455c(this.$childProductCategory, this.this$0.mo131076T0().mo131141h().mo117297q()).mo79808h());
    }
}
