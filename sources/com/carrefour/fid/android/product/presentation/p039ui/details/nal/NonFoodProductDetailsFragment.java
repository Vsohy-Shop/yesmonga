package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.product.presentation.viewmodel.details.C28123g;
import com.carrefour.fid.android.product.presentation.viewmodel.details.NonFoodProductDetailsViewModel;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/NonFoodProductDetailsViewModel;", "f", "Lkotlin/z;", "K0", "()Lcom/carrefour/fid/android/product/presentation/viewmodel/details/NonFoodProductDetailsViewModel;", "viewModel", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/g;", "g", "Lcom/carrefour/fid/android/product/presentation/viewmodel/details/g;", "J0", "()Lcom/carrefour/fid/android/product/presentation/viewmodel/details/g;", "L0", "(Lcom/carrefour/fid/android/product/presentation/viewmodel/details/g;)V", "analyticsViewModel", "Lcom/carrefour/fid/android/shared/navigation/c;", "v", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/shared/util/j;", "w", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nNonFoodProductDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodProductDetailsFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,80:1\n106#2,15:81\n*S KotlinDebug\n*F\n+ 1 NonFoodProductDetailsFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/NonFoodProductDetailsFragment\n*L\n22#1:81,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsFragment */
public final class NonFoodProductDetailsFragment extends C27862g {

    /* renamed from: x */
    public static final int f67440x = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f67441f;
    @Inject

    /* renamed from: g */
    public C28123g f67442g;
    @Inject

    /* renamed from: v */
    public C28796c f67443v;
    @Inject

    /* renamed from: w */
    public C28936j f67444w;

    public NonFoodProductDetailsFragment() {
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C27823xf4057b56(new C27822xf4057b55(this)));
        this.f67441f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(NonFoodProductDetailsViewModel.class), new C27824xf4057b57(b), new C27825xf4057b58((C11289a) null, b), new C27826xf4057b59(this, b));
    }

    @C12579k
    /* renamed from: J0 */
    public final C28123g mo80828J0() {
        C28123g gVar = this.f67442g;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: K0 */
    public final NonFoodProductDetailsViewModel mo80829K0() {
        return (NonFoodProductDetailsViewModel) this.f67441f.getValue();
    }

    /* renamed from: L0 */
    public final void mo80830L0(@C12579k C28123g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f67442g = gVar;
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f67444w;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f67443v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        NavController a = C19736g.m91827a(this);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(219826556, true, new NonFoodProductDetailsFragment$onCreateView$view$1$1(this, a)));
        return composeView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        getFragmentUtil().mo32776b(this);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f67444w = jVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f67443v = cVar;
    }
}
