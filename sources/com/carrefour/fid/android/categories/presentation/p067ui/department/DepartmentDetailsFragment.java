package com.carrefour.fid.android.categories.presentation.p067ui.department;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.categories.databinding.C39739b;
import com.carrefour.fid.android.categories.domain.extensions.C39745a;
import com.carrefour.fid.android.categories.domain.models.DepartmentModel;
import com.carrefour.fid.android.categories.presentation.analytics.C39752a;
import com.carrefour.fid.android.design.components.widgets.list.C37266f;
import com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002R\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, mo22516d2 = {"Lcom/carrefour/fid/android/categories/presentation/ui/department/DepartmentDetailsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/categories/databinding/b;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "initHeader", "S0", "V0", "Lcom/carrefour/fid/android/categories/presentation/ui/department/b;", "f", "Landroidx/navigation/m;", "T0", "()Lcom/carrefour/fid/android/categories/presentation/ui/department/b;", "departmentDetailsArgs", "Lcom/carrefour/fid/android/shared/navigation/c;", "g", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/categories/presentation/analytics/a;", "v", "Lcom/carrefour/fid/android/categories/presentation/analytics/a;", "U0", "()Lcom/carrefour/fid/android/categories/presentation/analytics/a;", "W0", "(Lcom/carrefour/fid/android/categories/presentation/analytics/a;)V", "departmentsAnalyticsViewModel", "Lcom/carrefour/fid/android/shared/util/j;", "w", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "categories_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nDepartmentDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentDetailsFragment.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentDetailsFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n42#2,3:125\n1549#3:128\n1620#3,3:129\n*S KotlinDebug\n*F\n+ 1 DepartmentDetailsFragment.kt\ncom/carrefour/fid/android/categories/presentation/ui/department/DepartmentDetailsFragment\n*L\n35#1:125,3\n82#1:128\n82#1:129,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.DepartmentDetailsFragment */
public final class DepartmentDetailsFragment extends C39795n<C39739b> {

    /* renamed from: x */
    public static final int f101473x = 8;
    @C12579k

    /* renamed from: f */
    public final C19766m f101474f = new C19766m(C11342l0.m43547d(C39776b.class), new DepartmentDetailsFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: g */
    public C28796c f101475g;
    @Inject

    /* renamed from: v */
    public C39752a f101476v;
    @Inject

    /* renamed from: w */
    public C28936j f101477w;

    public DepartmentDetailsFragment() {
        super(C397541.f101478a);
    }

    /* renamed from: S0 */
    public final void mo131075S0() {
        boolean z;
        if (mo131076T0().mo131141h().mo117297q().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo131077U0().mo131066a(mo131076T0().mo131141h().mo117297q());
        }
        ListItemRecyclerView listItemRecyclerView = ((C39739b) getBinding()).f101393d;
        Iterable<ProductCategory> m = mo131076T0().mo131141h().mo117293m();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(m, 10));
        for (ProductCategory productCategory : m) {
            DepartmentModel b = C39745a.m162192b(productCategory);
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            arrayList.add(C39791j.m162355a(b, requireContext, new DepartmentDetailsFragment$configureList$1$1(productCategory, this)));
        }
        String string = getString(C39711b.C39729r.department_see_all);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.department_see_all)");
        listItemRecyclerView.setList(CollectionsKt___CollectionsKt.m40723z4(arrayList, new C37266f(string, new DepartmentDetailsFragment$configureList$2(this))));
    }

    /* renamed from: T0 */
    public final C39776b mo131076T0() {
        return (C39776b) this.f101474f.getValue();
    }

    @C12579k
    /* renamed from: U0 */
    public final C39752a mo131077U0() {
        C39752a aVar = this.f101476v;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("departmentsAnalyticsViewModel");
        return null;
    }

    /* renamed from: V0 */
    public final void mo131078V0() {
        C19736g.m91827a(this).mo58152q0();
    }

    /* renamed from: W0 */
    public final void mo131079W0(@C12579k C39752a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f101476v = aVar;
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f101477w;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f101475g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void initHeader() {
        ((C39739b) getBinding()).f101391b.setContent(C8553b.m31049c(2077506977, true, new DepartmentDetailsFragment$initHeader$1(this)));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        getFragmentUtil().mo32776b(this);
        FragmentKt.m118815c(this, new DepartmentDetailsFragment$onViewCreated$1(this));
        initHeader();
        mo131075S0();
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f101477w = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f101475g = cVar;
    }
}
