package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

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
import androidx.navigation.C19766m;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.CheckoutStep2ViewModel;
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
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep2Fragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/shared/util/j;", "f", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/k;", "g", "Landroidx/navigation/m;", "K0", "()Lcom/carrefour/fid/android/presentation/ui/checkout/al/k;", "args", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step2/CheckoutStep2ViewModel;", "v", "Lkotlin/z;", "L0", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step2/CheckoutStep2ViewModel;", "checkoutStep2ViewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStep2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep2Fragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,64:1\n42#2,3:65\n106#3,15:68\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep2Fragment\n*L\n27#1:65,3\n29#1:68,15\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep2Fragment */
public final class CheckoutStep2Fragment extends C23326a0 {

    /* renamed from: w */
    public static final int f59002w = 8;
    @Inject

    /* renamed from: f */
    public C28936j f59003f;
    @C12579k

    /* renamed from: g */
    public final C19766m f59004g = new C19766m(C11342l0.m43547d(C23369k.class), new CheckoutStep2Fragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f59005v;

    public CheckoutStep2Fragment() {
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new CheckoutStep2Fragment$special$$inlined$viewModels$default$2(new CheckoutStep2Fragment$special$$inlined$viewModels$default$1(this)));
        this.f59005v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CheckoutStep2ViewModel.class), new CheckoutStep2Fragment$special$$inlined$viewModels$default$3(b), new CheckoutStep2Fragment$special$$inlined$viewModels$default$4((C11289a) null, b), new CheckoutStep2Fragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: K0 */
    public final C23369k mo68216K0() {
        return (C23369k) this.f59004g.getValue();
    }

    /* renamed from: L0 */
    public final CheckoutStep2ViewModel mo68217L0() {
        return (CheckoutStep2ViewModel) this.f59005v.getValue();
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f59003f;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f39397b);
        composeView.setContent(C8553b.m31049c(554837003, true, new CheckoutStep2Fragment$onCreateView$1$1(this)));
        return composeView;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        getFragmentUtil().mo32776b(this);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f59003f = jVar;
    }
}
