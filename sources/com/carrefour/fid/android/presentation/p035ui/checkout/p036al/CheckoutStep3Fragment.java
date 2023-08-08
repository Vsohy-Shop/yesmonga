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
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23345b;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.C23380r;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step3.CheckoutStep3ViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep3Fragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "R0", "bundle", "", "subBasketId", "Q0", "P0", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel;", "f", "Lkotlin/z;", "O0", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/step3/CheckoutStep3ViewModel;", "checkoutStep3ViewModel", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutFragment;", "g", "N0", "()Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutFragment;", "checkoutFragment", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/q;", "v", "Landroidx/navigation/m;", "M0", "()Lcom/carrefour/fid/android/presentation/ui/checkout/al/q;", "args", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStep3Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep3Fragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,155:1\n48#2,9:156\n42#3,3:165\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep3Fragment\n*L\n33#1:156,9\n37#1:165,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3Fragment */
public final class CheckoutStep3Fragment extends C23351c0 {

    /* renamed from: w */
    public static final int f59020w = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f59021f;
    @C12579k

    /* renamed from: g */
    public final C11677z f59022g = C10864b0.m38748c(new CheckoutStep3Fragment$checkoutFragment$2(this));
    @C12579k

    /* renamed from: v */
    public final C19766m f59023v = new C19766m(C11342l0.m43547d(C23378q.class), new CheckoutStep3Fragment$special$$inlined$navArgs$1(this));

    public CheckoutStep3Fragment() {
        C11677z c = C10864b0.m38748c(new CheckoutStep3Fragment$special$$inlined$hiltNavGraphViewModels$1(this, R.id.checkout_step_graph));
        this.f59021f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CheckoutStep3ViewModel.class), new CheckoutStep3Fragment$special$$inlined$hiltNavGraphViewModels$2(c, (C11510n) null), new CheckoutStep3Fragment$special$$inlined$hiltNavGraphViewModels$3(this, c, (C11510n) null));
    }

    /* renamed from: M0 */
    public final C23378q mo68246M0() {
        return (C23378q) this.f59023v.getValue();
    }

    /* renamed from: N0 */
    public final CheckoutFragment mo68247N0() {
        return (CheckoutFragment) this.f59022g.getValue();
    }

    /* renamed from: O0 */
    public final CheckoutStep3ViewModel mo68248O0() {
        return (CheckoutStep3ViewModel) this.f59021f.getValue();
    }

    /* renamed from: P0 */
    public final void mo68249P0(Bundle bundle, String str) {
        CheckoutFragment N0 = mo68247N0();
        if (N0 != null) {
            FragmentKt.m118823k(N0, C23345b.C23348c.m104202b(C23345b.f59104a, str, bundle, (Bundle) null, 4, (Object) null));
        }
    }

    /* renamed from: Q0 */
    public final void mo68250Q0(Bundle bundle, String str) {
        FragmentKt.m118823k(this, C23380r.C23385e.m104338d(C23380r.f59190a, str, bundle, mo68246M0().mo68492h(), (Bundle) null, 8, (Object) null));
    }

    /* renamed from: R0 */
    public final void mo68251R0() {
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep3Fragment$listenToSlotCheckout$1(this, (C11045c<? super CheckoutStep3Fragment$listenToSlotCheckout$1>) null), 3, (Object) null);
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && arguments.getBoolean(OtpOrigination.f61094c)) {
            z = true;
        }
        if (z) {
            mo68248O0().mo75840W0();
        }
        FragmentKt.m118814b(this);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f39397b);
        composeView.setContent(C8553b.m31049c(1484455275, true, new CheckoutStep3Fragment$onCreateView$1$1(this)));
        return composeView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        FragmentKt.m118832t(this);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentExtensionKt.m58757h(this);
        mo68251R0();
    }
}
