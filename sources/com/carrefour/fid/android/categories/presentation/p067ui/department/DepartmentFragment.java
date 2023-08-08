package com.carrefour.fid.android.categories.presentation.p067ui.department;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0302g;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19499w;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.categories.presentation.analytics.C39752a;
import com.carrefour.fid.android.design.components.widgets.list.C37269i;
import com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.shared.extension.C28752e0;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b8\u00109J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, mo22516d2 = {"Lcom/carrefour/fid/android/categories/presentation/ui/department/DepartmentFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "S0", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "productCategory", "Q0", "Lcom/carrefour/fid/android/design/components/widgets/list/i;", "N0", "M0", "Lcom/carrefour/fid/android/shared/util/j;", "f", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Lcom/carrefour/fid/android/shared/navigation/c;", "g", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/categories/presentation/analytics/a;", "v", "Lcom/carrefour/fid/android/categories/presentation/analytics/a;", "P0", "()Lcom/carrefour/fid/android/categories/presentation/analytics/a;", "R0", "(Lcom/carrefour/fid/android/categories/presentation/analytics/a;)V", "departmentsAnalyticsViewModel", "Lcom/carrefour/fid/android/categories/presentation/ui/department/f;", "w", "Landroidx/navigation/m;", "O0", "()Lcom/carrefour/fid/android/categories/presentation/ui/department/f;", "args", "Landroidx/activity/result/g;", "", "x", "Landroidx/activity/result/g;", "requestPermission", "<init>", "()V", "categories_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nDepartmentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentFragment.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,167:1\n42#2,3:168\n*S KotlinDebug\n*F\n+ 1 DepartmentFragment.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentFragment\n*L\n43#1:168,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentFragment */
public final class DepartmentFragment extends C39796o {

    /* renamed from: y */
    public static final int f101479y = 8;
    @Inject

    /* renamed from: f */
    public C28936j f101480f;
    @Inject

    /* renamed from: g */
    public C28796c f101481g;
    @Inject

    /* renamed from: v */
    public C39752a f101482v;
    @C12579k

    /* renamed from: w */
    public final C19766m f101483w = new C19766m(C11342l0.m43547d(C39783f.class), new DepartmentFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: x */
    public final C0302g<String> f101484x = FragmentKt.m118833u(this, new DepartmentFragment$requestPermission$1(this), new DepartmentFragment$requestPermission$2(this));

    /* renamed from: M0 */
    public final C37269i mo131089M0() {
        String string = getString(C39711b.C39729r.department_coupons);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.department_coupons)");
        ListItemIconComponent.C37270a aVar = ListItemIconComponent.f93487f;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        String string2 = getString(C39711b.C39729r.accessibility_open_department, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.acces…department, labelCoupons)");
        return aVar.mo113530a(requireContext, string, string2, FragmentKt.m118819g(this, C39711b.C39719h.ds_ic_diagonal_coupon, Integer.valueOf(C39711b.C39717f.ds_primary)), new DepartmentFragment$createCouponItem$1(this));
    }

    /* renamed from: N0 */
    public final C37269i mo131090N0() {
        String string = getString(C39711b.C39729r.promotions);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.promotions)");
        ListItemIconComponent.C37270a aVar = ListItemIconComponent.f93487f;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        String string2 = getString(C39711b.C39729r.accessibility_open_department, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.acces…artment, labelPromotions)");
        return aVar.mo113530a(requireContext, string, string2, FragmentKt.m118819g(this, C39711b.C39719h.ds_ic_promotion_percentage, Integer.valueOf(C39711b.C39717f.ds_red_1)), new DepartmentFragment$createPromoItem$1(this));
    }

    /* renamed from: O0 */
    public final C39783f mo131091O0() {
        return (C39783f) this.f101483w.getValue();
    }

    @C12579k
    /* renamed from: P0 */
    public final C39752a mo131092P0() {
        C39752a aVar = this.f101482v;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("departmentsAnalyticsViewModel");
        return null;
    }

    /* renamed from: Q0 */
    public final void mo131093Q0(ProductCategory productCategory) {
        mo131092P0().mo131069d(productCategory.mo117294n());
        C28752e0.m119042a(C19736g.m91827a(this), C39711b.C39721j.departmentFragment, C39711b.C39721j.departmentDetailsFragment, new C39776b(productCategory, (String) null, true, 2, (DefaultConstructorMarker) null).mo131144j());
    }

    /* renamed from: R0 */
    public final void mo131094R0(@C12579k C39752a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f101482v = aVar;
    }

    /* renamed from: S0 */
    public final void mo131095S0() {
        String string = getString(C39711b.C39729r.scan_bar_dialog_title);
        String string2 = getString(C39711b.C39729r.scan_bar_dialog_message);
        Drawable h = FragmentKt.m118820h(this, C39711b.C39719h.background_search_bar, (Integer) null, 2, (Object) null);
        String string3 = getString(C39711b.C39729r.general_refuse);
        String string4 = getString(C39711b.C39729r.ok_uppercase);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.scan_bar_dialog_title)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.scan_bar_dialog_message)");
        FragmentKt.m118838z(this, string, string2, string3, DepartmentFragment$showPermissionExplanationDialog$1.f101485f, string4, false, new DepartmentFragment$showPermissionExplanationDialog$2(this), (String) null, (C11289a) null, (C11289a) null, h, 0, 2976, (Object) null);
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f101480f;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f101481g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public void onCreate(@C12580l Bundle bundle) {
        ProductCategory e = mo131091O0().mo131164e();
        if (e != null) {
            mo131093Q0(e);
        }
        super.onCreate(bundle);
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(1144185014, true, new DepartmentFragment$onCreateView$view$1$1(this)));
        return composeView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        getFragmentUtil().mo32776b(this);
        mo131092P0().mo131067b();
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f101480f = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f101481g = cVar;
    }
}
