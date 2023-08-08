package com.carrefour.fid.android.checkout.presentation.p071ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.checkout.databinding.C39841a;
import com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel;
import com.carrefour.fid.android.checkout.presentation.webview.C39984a;
import com.carrefour.fid.android.shared.extension.C28785u0;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/ui/PaymentMethodFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/checkout/databinding/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "initHeader", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/PaymentMethodViewModel$a;", "uiState", "U0", "", "paymentPostData", "T0", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/PaymentMethodViewModel;", "f", "Lkotlin/z;", "S0", "()Lcom/carrefour/fid/android/checkout/presentation/viewmodels/PaymentMethodViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "g", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "R0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "V0", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "Lcom/carrefour/fid/android/shared/util/j;", "v", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPaymentMethodFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodFragment.kt\ncom/carrefour/fid/android/checkout/presentation/ui/PaymentMethodFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n*L\n1#1,101:1\n56#2,10:102\n168#3,7:112\n*S KotlinDebug\n*F\n+ 1 PaymentMethodFragment.kt\ncom/carrefour/fid/android/checkout/presentation/ui/PaymentMethodFragment\n*L\n32#1:102,10\n46#1:112,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.PaymentMethodFragment */
public final class PaymentMethodFragment extends C39876a<C39841a> {

    /* renamed from: w */
    public static final int f101698w = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f101699f;
    @Inject

    /* renamed from: g */
    public AppEnvironment f101700g;
    @Inject

    /* renamed from: v */
    public C28936j f101701v;

    public PaymentMethodFragment() {
        super(C398691.f101702a);
        PaymentMethodFragment$special$$inlined$viewModels$default$1 paymentMethodFragment$special$$inlined$viewModels$default$1 = new PaymentMethodFragment$special$$inlined$viewModels$default$1(this);
        this.f101699f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(PaymentMethodViewModel.class), new PaymentMethodFragment$special$$inlined$viewModels$default$2(paymentMethodFragment$special$$inlined$viewModels$default$1), new PaymentMethodFragment$special$$inlined$viewModels$default$3(paymentMethodFragment$special$$inlined$viewModels$default$1, this));
    }

    @C12579k
    /* renamed from: R0 */
    public final AppEnvironment mo131454R0() {
        AppEnvironment appEnvironment = this.f101700g;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    /* renamed from: S0 */
    public final PaymentMethodViewModel mo131455S0() {
        return (PaymentMethodViewModel) this.f101699f.getValue();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: T0 */
    public final void mo131456T0(String str) {
        WebView webView = ((C39841a) getBinding()).f101612e;
        webView.getSettings().setJavaScriptEnabled(true);
        Intrinsics.checkNotNullExpressionValue(webView, "loadWebView$lambda$0");
        C28785u0.m119115c(webView, C39984a.m162965b(str, mo131454R0().mo84159F()));
    }

    /* renamed from: U0 */
    public final void mo131457U0(PaymentMethodViewModel.C39939a aVar) {
        ((C39841a) getBinding()).f101609b.setVisibility(8);
        if (aVar instanceof PaymentMethodViewModel.C39939a.C39940a) {
            ((C39841a) getBinding()).f101612e.setVisibility(0);
            mo131456T0(((PaymentMethodViewModel.C39939a.C39940a) aVar).mo131702h());
        } else if (aVar instanceof PaymentMethodViewModel.C39939a.C39942c) {
            Context requireContext = requireContext();
            String h = ((PaymentMethodViewModel.C39939a.C39942c) aVar).mo131708h();
            Toast.makeText(requireContext, "Error: " + h, 1).show();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) PaymentMethodViewModel.C39939a.C39941b.f101850c)) {
            ((C39841a) getBinding()).f101609b.setVisibility(0);
        }
    }

    /* renamed from: V0 */
    public final void mo131458V0(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f101700g = appEnvironment;
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f101701v;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C39841a) getBinding()).f101610c.setContent(C8553b.m31049c(-1757455667, true, new PaymentMethodFragment$initHeader$1(this)));
    }

    public void onDestroyView() {
        FragmentKt.m118832t(this);
        super.onDestroyView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118814b(this);
        initHeader();
        PaymentMethodViewModel S0 = mo131455S0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new PaymentMethodFragment$onViewCreated$$inlined$processState$1(this, S0, (C11045c) null, this), 3, (Object) null);
        mo131455S0().sendIntent(PaymentMethodViewModel.C39943b.C39944a.f101855b);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f101701v = jVar;
    }
}
