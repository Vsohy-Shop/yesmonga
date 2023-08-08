package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36830t1;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoCgvViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26970h;
import com.carrefour.fid.android.shared.base.ObserverWhileResumedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.shared.util.C28937k;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
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
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\t*\u0001.\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b2\u00103J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00066"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoCgvDialogFragment;", "Lcom/carrefour/fid/android/shared/base/j;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lkotlin/d2;", "onViewCreated", "initHeader", "initListeners", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/h$a;", "uiEvent", "U0", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/h$b;", "uiState", "W0", "", "checkoutCGV", "T0", "", "isLoading", "V0", "Lcom/carrefour/fid/android/databinding/t1;", "v", "Lkotlin/z;", "R0", "()Lcom/carrefour/fid/android/databinding/t1;", "binding", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepTwoCgvViewModel;", "w", "S0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepTwoCgvViewModel;", "checkoutCgvViewModel", "Lcom/carrefour/fid/android/shared/util/j;", "x", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "com/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoCgvDialogFragment$handlerWebViewClient$1", "y", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoCgvDialogFragment$handlerWebViewClient$1;", "handlerWebViewClient", "<init>", "()V", "z", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStepTwoCgvDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStepTwoCgvDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoCgvDialogFragment\n+ 2 FragmentViewBindingDelegate.kt\ncom/carrefour/fid/android/shared/util/FragmentViewBindingDelegateKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,152:1\n120#2,3:153\n106#3,15:156\n168#4,7:171\n183#4,6:178\n83#5,2:184\n262#6,2:186\n*S KotlinDebug\n*F\n+ 1 CheckoutStepTwoCgvDialogFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoCgvDialogFragment\n*L\n51#1:153,3\n53#1:156,15\n82#1:171,7\n83#1:178,6\n109#1:184,2\n149#1:186,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepTwoCgvDialogFragment */
public final class CheckoutStepTwoCgvDialogFragment extends C25154s0 {

    /* renamed from: X */
    public static final int f61886X = 8;
    @C12579k

    /* renamed from: Y */
    public static final String f61887Y = "CheckoutStepTwoCgvDialogFragment";
    @C12579k

    /* renamed from: z */
    public static final C25088a f61888z = new C25088a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: v */
    public final C11677z f61889v;
    @C12579k

    /* renamed from: w */
    public final C11677z f61890w;
    @Inject

    /* renamed from: x */
    public C28936j f61891x;
    @C12579k

    /* renamed from: y */
    public final CheckoutStepTwoCgvDialogFragment$handlerWebViewClient$1 f61892y = new CheckoutStepTwoCgvDialogFragment$handlerWebViewClient$1(this);

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepTwoCgvDialogFragment$a */
    public static final class C25088a {
        public /* synthetic */ C25088a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo72973a(@C12579k FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            new CheckoutStepTwoCgvDialogFragment().show(fragmentManager, CheckoutStepTwoCgvDialogFragment.f61887Y);
        }

        public C25088a() {
        }
    }

    public CheckoutStepTwoCgvDialogFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f61889v = C10864b0.m38747b(lazyThreadSafetyMode, new CheckoutStepTwoCgvDialogFragment$special$$inlined$viewBinding$1(this));
        C11677z b = C10864b0.m38747b(lazyThreadSafetyMode, new C25101x5dc5edf8(new C25100x5dc5edf7(this)));
        this.f61890w = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CheckoutStepTwoCgvViewModel.class), new C25102x5dc5edf9(b), new C25103x5dc5edfa((C11289a) null, b), new C25104x5dc5edfb(this, b));
    }

    /* renamed from: R0 */
    public final C36830t1 mo72963R0() {
        return (C36830t1) this.f61889v.getValue();
    }

    /* renamed from: S0 */
    public final CheckoutStepTwoCgvViewModel mo72964S0() {
        return (CheckoutStepTwoCgvViewModel) this.f61890w.getValue();
    }

    /* renamed from: T0 */
    public final void mo72965T0(String str) {
        mo72967V0(false);
        WebView webView = mo72963R0().f91664g;
        webView.setWebViewClient(this.f61892y);
        webView.loadDataWithBaseURL(new String(), str, C28937k.f70947d, "utf-8", (String) null);
    }

    /* renamed from: U0 */
    public final void mo72966U0(C26970h.C26971a aVar) {
        if (aVar instanceof C26970h.C26971a.C26972a) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_server_not_responding_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…r_not_responding_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: V0 */
    public final void mo72967V0(boolean z) {
        int i;
        ProgressBar progressBar = mo72963R0().f91662e;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.checkoutStep3CgvProgressBar");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: W0 */
    public final void mo72968W0(C26970h.C26973b bVar) {
        boolean z;
        if (bVar instanceof C26970h.C26973b.C26977d) {
            mo72967V0(((C26970h.C26973b.C26977d) bVar).mo78388h());
        } else if (bVar instanceof C26970h.C26973b.C26975b) {
            C26970h.C26973b.C26975b bVar2 = (C26970h.C26973b.C26975b) bVar;
            if (bVar2.mo78382h().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo72965T0(bVar2.mo78382h());
            }
        }
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f61891x;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        mo72963R0().f91660c.setContent(C8553b.m31049c(-1326898057, true, new CheckoutStepTwoCgvDialogFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        ImageButton imageButton = mo72963R0().f91659b;
        Intrinsics.checkNotNullExpressionValue(imageButton, "cgvGoToBottom");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(imageButton), new CheckoutStepTwoCgvDialogFragment$initListeners$1$1(this, (C11045c<? super CheckoutStepTwoCgvDialogFragment$initListeners$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileResumedImpl(viewLifecycleOwner, f1, new C25089x7a60738b((C11045c) null));
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ConstraintLayout b = mo72963R0().getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "binding.root");
        return b;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            ActivityKt.m118698h(dialog);
        }
        initHeader();
        initListeners();
        CheckoutStepTwoCgvViewModel S0 = mo72964S0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25095x9e1960b8(this, S0, (C11045c) null, this), 3, (Object) null);
        CheckoutStepTwoCgvViewModel S02 = mo72964S0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C25090xbd21b081(this, S02, (C11045c) null, this), 3, (Object) null);
        C19501x.m90847a(this).mo57477c(new CheckoutStepTwoCgvDialogFragment$onViewCreated$3(this, (C11045c<? super CheckoutStepTwoCgvDialogFragment$onViewCreated$3>) null));
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f61891x = jVar;
    }
}
