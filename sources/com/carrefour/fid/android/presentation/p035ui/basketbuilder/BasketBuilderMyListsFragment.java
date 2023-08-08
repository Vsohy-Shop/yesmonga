package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.databinding.C36859w0;
import com.carrefour.fid.android.design.components.widgets.C37422x;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderMyListViewModel;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25964k;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderMyListsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/w0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "U0", "initListeners", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderMyListViewModel$a;", "state", "V0", "R0", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/k;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/k;", "S0", "()Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/k;", "W0", "(Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/k;)V", "analyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderMyListViewModel;", "g", "Lkotlin/z;", "T0", "()Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderMyListViewModel;", "viewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketBuilderMyListsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBuilderMyListsFragment.kt\ncom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderMyListsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,100:1\n106#2,15:101\n168#3,7:116\n*S KotlinDebug\n*F\n+ 1 BasketBuilderMyListsFragment.kt\ncom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderMyListsFragment\n*L\n29#1:101,15\n39#1:116,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderMyListsFragment */
public final class BasketBuilderMyListsFragment extends C23229p<C36859w0> {

    /* renamed from: v */
    public static final int f58880v = 8;
    @Inject

    /* renamed from: f */
    public C25964k f58881f;
    @C12579k

    /* renamed from: g */
    public final C11677z f58882g;

    public BasketBuilderMyListsFragment() {
        super(C231961.f58883a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C23203xc3cd25ac(new C23202xc3cd25ab(this)));
        this.f58882g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BasketBuilderMyListViewModel.class), new C23204xc3cd25ad(b), new C23205xc3cd25ae((C11289a) null, b), new C23206xc3cd25af(this, b));
    }

    /* renamed from: R0 */
    public final void mo68011R0() {
        BasketBuilderFragment basketBuilderFragment = (BasketBuilderFragment) FragmentKt.m148916b(this, BasketBuilderFragment.class);
        if (basketBuilderFragment != null) {
            NavController a = C19736g.m91827a(basketBuilderFragment);
            NavGraph b = a.mo58111M().mo58438b(R.navigation.catalogs_graph);
            b.mo58283V0(R.id.catalogProductList);
            a.mo58107K().mo58269F0(b);
        }
    }

    @C12579k
    /* renamed from: S0 */
    public final C25964k mo68012S0() {
        C25964k kVar = this.f58881f;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: T0 */
    public final BasketBuilderMyListViewModel mo68013T0() {
        return (BasketBuilderMyListViewModel) this.f58882g.getValue();
    }

    /* renamed from: U0 */
    public final void mo68014U0() {
        C36859w0 w0Var = (C36859w0) getBinding();
        w0Var.f91832c.mo112884L(new C37422x.C37426d((List) null, 1, (DefaultConstructorMarker) null));
        w0Var.f91833d.mo112884L(C37422x.C37427e.f94050b);
        w0Var.f91831b.setVisibility(8);
    }

    /* renamed from: V0 */
    public final void mo68015V0(BasketBuilderMyListViewModel.C25912a aVar) {
        if (aVar.mo75241i()) {
            BasketBuilderSignInBottomSheetFragment basketBuilderSignInBottomSheetFragment = new BasketBuilderSignInBottomSheetFragment();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            FragmentExtensionKt.m58762m(basketBuilderSignInBottomSheetFragment, childFragmentManager);
        }
    }

    /* renamed from: W0 */
    public final void mo68016W0(@C12579k C25964k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f58881f = kVar;
    }

    public final void initListeners() {
        C36859w0 w0Var = (C36859w0) getBinding();
        w0Var.f91833d.setOnClickListener(new BasketBuilderMyListsFragment$initListeners$1$1(this));
        w0Var.f91832c.setOnClickListener(new BasketBuilderMyListsFragment$initListeners$1$2(this));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo68014U0();
        initListeners();
        mo68011R0();
        mo68012S0().mo75390a();
        BasketBuilderMyListViewModel T0 = mo68013T0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C23197x420986c(this, T0, (C11045c) null, this), 3, (Object) null);
        mo68013T0().sendIntent(BasketBuilderMyListViewModel.C25914b.C25915a.f63411b);
    }
}
