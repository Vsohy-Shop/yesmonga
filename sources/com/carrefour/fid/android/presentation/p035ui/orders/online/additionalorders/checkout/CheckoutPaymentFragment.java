package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.checkout.presentation.webview.C39984a;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.core.p057io.CheckoutPaymentResponseThrowable;
import com.carrefour.fid.android.core.p057io.CheckoutResponseThrowable;
import com.carrefour.fid.android.databinding.C36719i0;
import com.carrefour.fid.android.design.components.widgets.C37248j0;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.StepBarView;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.ecommerce.utils.C38213c;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.BasketAdditionalOrderFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutPaymentViewModel;
import com.carrefour.fid.android.shared.extension.C28785u0;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b7\u00108J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0003J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0016H\u0002R\u001b\u0010(\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006:"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutPaymentFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/i0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onDestroyView", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentViewModel$b;", "uiState", "f1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentViewModel$a;", "uiEvent", "c1", "", "throwable", "a1", "Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "orderConfirmationModel", "b1", "", "paymentPostData", "e1", "Lcom/carrefour/fid/android/design/components/widgets/j0;", "h1", "errorCode", "Z0", "bundle", "X0", "Lcom/carrefour/fid/android/core/io/CheckoutPaymentResponseThrowable;", "Y0", "url", "d1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentViewModel;", "f", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutPaymentViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/n;", "g", "Landroidx/navigation/m;", "V0", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/n;", "navArgs", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "v", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "U0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "g1", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "<init>", "()V", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutPaymentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutPaymentFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutPaymentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n106#2,15:164\n42#3,3:179\n168#4,7:182\n183#4,6:189\n1#5:195\n*S KotlinDebug\n*F\n+ 1 CheckoutPaymentFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutPaymentFragment\n*L\n44#1:164,15\n45#1:179,3\n60#1:182,7\n61#1:189,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutPaymentFragment */
public final class CheckoutPaymentFragment extends C25146o0<C36719i0> {

    /* renamed from: w */
    public static final int f61836w = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f61837f;
    @C12579k

    /* renamed from: g */
    public final C19766m f61838g = new C19766m(C11342l0.m43547d(C25142n.class), new CheckoutPaymentFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: v */
    public AppEnvironment f61839v;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutPaymentFragment$a */
    public final class C25030a extends WebViewClient {
        public C25030a() {
        }

        public void onPageStarted(@C12579k WebView webView, @C12579k String str, @C12580l Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(webView, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(str, "url");
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) CheckoutPaymentFragment.this.mo72854U0().mo84160G(), false, 2, (Object) null)) {
                CheckoutPaymentFragment.this.mo72856W0().mo77794y();
            }
        }

        public boolean shouldOverrideUrlLoading(@C12579k WebView webView, @C12579k String str) {
            Intrinsics.checkNotNullParameter(webView, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(str, "url");
            if (C11622t.startsWith$default(str, CheckoutPaymentFragment.this.mo72854U0().mo84160G(), false, 2, (Object) null)) {
                CheckoutPaymentFragment.this.mo72863d1(str);
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public CheckoutPaymentFragment() {
        super(C250291.f61840a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new CheckoutPaymentFragment$special$$inlined$viewModels$default$2(new CheckoutPaymentFragment$special$$inlined$viewModels$default$1(this)));
        this.f61837f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CheckoutPaymentViewModel.class), new CheckoutPaymentFragment$special$$inlined$viewModels$default$3(b), new CheckoutPaymentFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new CheckoutPaymentFragment$special$$inlined$viewModels$default$5(this, b));
    }

    @C12579k
    /* renamed from: U0 */
    public final AppEnvironment mo72854U0() {
        AppEnvironment appEnvironment = this.f61839v;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    /* renamed from: V0 */
    public final C25142n mo72855V0() {
        return (C25142n) this.f61838g.getValue();
    }

    /* renamed from: W0 */
    public final CheckoutPaymentViewModel mo72856W0() {
        return (CheckoutPaymentViewModel) this.f61837f.getValue();
    }

    /* renamed from: X0 */
    public final void mo72857X0(Bundle bundle) {
        BasketAdditionalOrderFragment basketAdditionalOrderFragment = (BasketAdditionalOrderFragment) FragmentKt.m148916b(this, BasketAdditionalOrderFragment.class);
        if (basketAdditionalOrderFragment != null) {
            basketAdditionalOrderFragment.mo72750a1(bundle);
        }
    }

    /* renamed from: Y0 */
    public final void mo72858Y0(CheckoutPaymentResponseThrowable checkoutPaymentResponseThrowable) {
        BasketAdditionalOrderFragment basketAdditionalOrderFragment = (BasketAdditionalOrderFragment) FragmentKt.m148916b(this, BasketAdditionalOrderFragment.class);
        if (basketAdditionalOrderFragment != null) {
            basketAdditionalOrderFragment.mo72751b1(checkoutPaymentResponseThrowable);
        }
    }

    /* renamed from: Z0 */
    public final void mo72859Z0(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C38212b.f96798f, str);
        String g = mo72855V0().mo73069g();
        if (g == null) {
            g = "";
        }
        bundle.putString(C38212b.f96799g, g);
        mo72857X0(bundle);
    }

    /* renamed from: a1 */
    public final void mo72860a1(Throwable th) {
        C28935i iVar = C28935i.f70940a;
        String message = th.getMessage();
        Intrinsics.checkNotNull(message, "null cannot be cast to non-null type kotlin.String");
        C28935i.m119706i(iVar, message, (Throwable) null, 0, 6, (Object) null);
        if (th instanceof CheckoutResponseThrowable) {
            String a = ((CheckoutResponseThrowable) th).mo108359a();
            if (a == null) {
                a = "";
            }
            mo72859Z0(a);
        } else if (th instanceof CheckoutPaymentResponseThrowable) {
            mo72858Y0((CheckoutPaymentResponseThrowable) th);
        } else {
            mo72867h1();
        }
    }

    /* renamed from: b1 */
    public final void mo72861b1(OrderConfirmationModel orderConfirmationModel) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("orderKey", orderConfirmationModel);
        String g = mo72855V0().mo73069g();
        if (g == null) {
            g = "";
        }
        bundle.putString(C38212b.f96799g, g);
        bundle.putBoolean(C38212b.f96801i, false);
        mo72857X0(bundle);
    }

    /* renamed from: c1 */
    public final void mo72862c1(CheckoutPaymentViewModel.C26763a aVar) {
        if (aVar instanceof CheckoutPaymentViewModel.C26763a.C26764a) {
            mo72860a1(((CheckoutPaymentViewModel.C26763a.C26764a) aVar).mo77797d());
        } else if (aVar instanceof CheckoutPaymentViewModel.C26763a.C26765b) {
            mo72861b1(((CheckoutPaymentViewModel.C26763a.C26765b) aVar).mo77803d());
        }
    }

    /* renamed from: d1 */
    public final void mo72863d1(String str) {
        WebView webView = ((C36719i0) getBinding()).f90993b;
        Intrinsics.checkNotNullExpressionValue(webView, "binding.webviewPayline");
        C28785u0.m119114b(webView, C38213c.f96819a.mo119640b());
        mo72856W0().sendIntent(new CheckoutPaymentViewModel.C26767c.C26768a(str, getArguments()));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: e1 */
    public final void mo72864e1(String str) {
        WebView webView = ((C36719i0) getBinding()).f90993b;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new C25030a());
        Intrinsics.checkNotNullExpressionValue(webView, "loadWebView$lambda$5");
        C28785u0.m119115c(webView, C39984a.m162965b(str, mo72854U0().mo84159F()));
    }

    /* renamed from: f1 */
    public final void mo72865f1(CheckoutPaymentViewModel.C26766b bVar) {
        String h = bVar.mo77810h();
        if (h != null) {
            mo72864e1(h);
        }
    }

    /* renamed from: g1 */
    public final void mo72866g1(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f61839v = appEnvironment;
    }

    /* renamed from: h1 */
    public final C37248j0 mo72867h1() {
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string = getString(R.string.checkout_confirm_payment_failed_to_validate_apim);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.check…_failed_to_validate_apim)");
        return com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    public void onDestroyView() {
        super.onDestroyView();
        ((C36719i0) getBinding()).f90993b.destroy();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        BasketAdditionalOrderFragment basketAdditionalOrderFragment = (BasketAdditionalOrderFragment) FragmentKt.m148916b(this, BasketAdditionalOrderFragment.class);
        if (basketAdditionalOrderFragment != null) {
            basketAdditionalOrderFragment.mo72755f1(StepBarView.STEP.STEP_THREE);
        }
        CheckoutPaymentViewModel W0 = mo72856W0();
        W0.sendScreenView();
        W0.mo77788T();
        CheckoutPaymentViewModel W02 = mo72856W0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new CheckoutPaymentFragment$onViewCreated$$inlined$processState$1(this, W02, (C11045c) null, this), 3, (Object) null);
        CheckoutPaymentViewModel W03 = mo72856W0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new CheckoutPaymentFragment$onViewCreated$$inlined$processEvent$1(this, W03, (C11045c) null, this), 3, (Object) null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mo72856W0().sendIntent(new CheckoutPaymentViewModel.C26767c.C26769b(arguments));
        }
    }
}
