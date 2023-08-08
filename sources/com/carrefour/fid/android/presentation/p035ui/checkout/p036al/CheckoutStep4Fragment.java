package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.checkout.presentation.webview.C39984a;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.core.p057io.CheckoutPaymentResponseThrowable;
import com.carrefour.fid.android.core.p057io.CheckoutResponseThrowable;
import com.carrefour.fid.android.core.type.BasketService;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.databinding.C36790p1;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.domain.models.BasketAmounts;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketServiceType;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.ecommerce.utils.C38213c;
import com.carrefour.fid.android.presentation.analytics.C38362d;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26016i;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutStep4ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26196a;
import com.carrefour.fid.android.shared.constant.C28559l;
import com.carrefour.fid.android.shared.extension.C28785u0;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002XYB\u0007¢\u0006\u0004\bU\u0010VJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0003J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0019H\u0002J\u001a\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0003H\u0016R\u001b\u0010'\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001b\u0010M\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8BX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006Z"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep4Fragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/p1;", "Lkotlin/d2;", "initHeader", "j1", "k1", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "basketDomain", "g1", "", "W0", "", "error", "h1", "Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "orderConfirmationModel", "i1", "paymentPostData", "m1", "errorCode", "f1", "Landroid/os/Bundle;", "bundle", "d1", "Lcom/carrefour/fid/android/core/io/CheckoutPaymentResponseThrowable;", "e1", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "onStart", "onStop", "onDestroyView", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutStep4ViewModel;", "f", "Lkotlin/z;", "b1", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutStep4ViewModel;", "checkoutStep4ViewModel", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "g", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "X0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "n1", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/i;", "v", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/i;", "a1", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/i;", "p1", "(Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/i;)V", "checkoutStep4AnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "w", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "Z0", "()Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "o1", "(Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;)V", "checkoutConfirmationAnalyticsViewModel", "Lcom/carrefour/fid/android/domain/interactors/logm/a;", "x", "Lcom/carrefour/fid/android/domain/interactors/logm/a;", "c1", "()Lcom/carrefour/fid/android/domain/interactors/logm/a;", "q1", "(Lcom/carrefour/fid/android/domain/interactors/logm/a;)V", "remoteLogUseCase", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/t;", "y", "Landroidx/navigation/m;", "Y0", "()Lcom/carrefour/fid/android/presentation/ui/checkout/al/t;", "args", "z", "Ljava/lang/String;", "basketTypeAnalytic", "", "l1", "()Z", "isExpressPickup", "<init>", "()V", "X", "a", "InternalWebViewClient", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStep4Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep4Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep4Fragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n106#2,15:312\n42#3,3:327\n1#4:330\n*S KotlinDebug\n*F\n+ 1 CheckoutStep4Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep4Fragment\n*L\n60#1:312,15\n74#1:327,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment */
public final class CheckoutStep4Fragment extends C23359d0<C36790p1> {
    @C12579k

    /* renamed from: E0 */
    public static final String f59026E0 = "arguments_payment_confirmation";
    @C12579k

    /* renamed from: X */
    public static final C23314a f59027X = new C23314a((DefaultConstructorMarker) null);

    /* renamed from: Y */
    public static final int f59028Y = 8;
    @C12579k

    /* renamed from: Z */
    public static final String f59029Z = "?paylinecancel";
    @C12579k

    /* renamed from: f */
    public final C11677z f59030f;
    @Inject

    /* renamed from: g */
    public AppEnvironment f59031g;
    @Inject

    /* renamed from: v */
    public C26016i f59032v;
    @Inject

    /* renamed from: w */
    public C26196a f59033w;
    @Inject

    /* renamed from: x */
    public C37694a f59034x;
    @C12579k

    /* renamed from: y */
    public final C19766m f59035y = new C19766m(C11342l0.m43547d(C23432t.class), new CheckoutStep4Fragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: z */
    public String f59036z = "";

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment$InternalWebViewClient */
    public final class InternalWebViewClient extends WebViewClient {
        public InternalWebViewClient() {
        }

        /* renamed from: a */
        public final void mo68283a(String str) {
            String str2;
            Bundle bundle;
            WebView webView = CheckoutStep4Fragment.m104068R0(CheckoutStep4Fragment.this).f91478f;
            Intrinsics.checkNotNullExpressionValue(webView, "binding.webviewPayline");
            C28785u0.m119114b(webView, C38213c.f96819a.mo119640b());
            CheckoutStep4ViewModel S0 = CheckoutStep4Fragment.this.mo68265b1();
            Bundle arguments = CheckoutStep4Fragment.this.getArguments();
            if (arguments == null || (bundle = arguments.getBundle("arguments_payment_confirmation")) == null) {
                str2 = null;
            } else {
                str2 = bundle.getString("LOYALTY_AMOUNT_DATA");
            }
            S0.mo75477q0(str, str2);
        }

        public void onPageStarted(@C12579k WebView webView, @C12579k String str, @C12580l Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(webView, C40383c.f102945c);
            Intrinsics.checkNotNullParameter(str, "url");
            if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) CheckoutStep4Fragment.this.mo68261X0().mo84160G(), false, 2, (Object) null)) {
                CheckoutStep4Fragment.this.mo68264a1().mo75515c();
            }
        }

        public boolean shouldOverrideUrlLoading(@C12579k WebView webView, @C12580l WebResourceRequest webResourceRequest) {
            Uri url;
            String uri;
            Intrinsics.checkNotNullParameter(webView, C40383c.f102945c);
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (uri = url.toString()) == null) {
                return false;
            }
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(CheckoutStep4Fragment.this), (CoroutineContext) null, (CoroutineStart) null, new C23318xe1588488(CheckoutStep4Fragment.this, uri, (C11045c<? super C23318xe1588488>) null), 3, (Object) null);
            if (C11622t.startsWith$default(uri, CheckoutStep4Fragment.this.mo68261X0().mo84160G(), false, 2, (Object) null)) {
                mo68283a(uri);
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            } else if (C11622t.startsWith$default(uri, CheckoutStep4Fragment.this.mo68261X0().mo84157D(), false, 2, (Object) null)) {
                CheckoutStep4Fragment.m104068R0(CheckoutStep4Fragment.this).f91478f.setVisibility(8);
                CheckoutStep4Fragment.m104068R0(CheckoutStep4Fragment.this).f91477e.setVisibility(0);
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            } else if (C11622t.startsWith$default(uri, CheckoutStep4Fragment.this.mo68261X0().mo84158E(), false, 2, (Object) null)) {
                if (StringsKt__StringsKt.contains$default((CharSequence) uri, (CharSequence) CheckoutStep4Fragment.f59029Z, false, 2, (Object) null)) {
                    C19736g.m91827a(CheckoutStep4Fragment.this).mo58152q0();
                    return true;
                }
                CheckoutStep4Fragment.m104068R0(CheckoutStep4Fragment.this).f91478f.setVisibility(0);
                CheckoutStep4Fragment.m104068R0(CheckoutStep4Fragment.this).f91477e.setVisibility(8);
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            } else if (!C11622t.startsWith$default(uri, CheckoutStep4Fragment.this.mo68261X0().mo84175o(), false, 2, (Object) null)) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            } else {
                C19736g.m91827a(CheckoutStep4Fragment.this).mo58152q0();
                return true;
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment$a */
    public static final class C23314a {
        public /* synthetic */ C23314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23314a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment$b */
    public /* synthetic */ class C23315b implements C19426h0, C11379z {
        public C23315b() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l BasketDomain basketDomain) {
            CheckoutStep4Fragment.this.mo68270g1(basketDomain);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CheckoutStep4Fragment.this, CheckoutStep4Fragment.class, "handleBasketResult", "handleBasketResult(Lcom/carrefour/fid/android/domain/models/BasketDomain;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment$c */
    public /* synthetic */ class C23316c implements C19426h0, C11379z {
        public C23316c() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12579k OrderConfirmationModel orderConfirmationModel) {
            Intrinsics.checkNotNullParameter(orderConfirmationModel, "p0");
            CheckoutStep4Fragment.this.mo68272i1(orderConfirmationModel);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CheckoutStep4Fragment.this, CheckoutStep4Fragment.class, "handleResult", "handleResult(Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep4Fragment$d */
    public /* synthetic */ class C23317d implements C19426h0, C11379z {
        public C23317d() {
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Throwable th) {
            CheckoutStep4Fragment.this.mo68271h1(th);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CheckoutStep4Fragment.this, CheckoutStep4Fragment.class, "handleErrors", "handleErrors(Ljava/lang/Throwable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public CheckoutStep4Fragment() {
        super(C233131.f59037a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new CheckoutStep4Fragment$special$$inlined$viewModels$default$2(new CheckoutStep4Fragment$special$$inlined$viewModels$default$1(this)));
        this.f59030f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CheckoutStep4ViewModel.class), new CheckoutStep4Fragment$special$$inlined$viewModels$default$3(b), new CheckoutStep4Fragment$special$$inlined$viewModels$default$4((C11289a) null, b), new CheckoutStep4Fragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C36790p1 m104068R0(CheckoutStep4Fragment checkoutStep4Fragment) {
        return (C36790p1) checkoutStep4Fragment.getBinding();
    }

    /* renamed from: W0 */
    public final String mo68260W0() {
        Bundle bundle;
        Bundle arguments = getArguments();
        if (arguments == null || (bundle = arguments.getBundle("arguments_payment_confirmation")) == null) {
            return null;
        }
        return bundle.getString("MF_PAYMENT_TRANSACTION_DATA_EXTRA");
    }

    @C12579k
    /* renamed from: X0 */
    public final AppEnvironment mo68261X0() {
        AppEnvironment appEnvironment = this.f59031g;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    /* renamed from: Y0 */
    public final C23432t mo68262Y0() {
        return (C23432t) this.f59035y.getValue();
    }

    @C12579k
    /* renamed from: Z0 */
    public final C26196a mo68263Z0() {
        C26196a aVar = this.f59033w;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkoutConfirmationAnalyticsViewModel");
        return null;
    }

    @C12579k
    /* renamed from: a1 */
    public final C26016i mo68264a1() {
        C26016i iVar = this.f59032v;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkoutStep4AnalyticsViewModel");
        return null;
    }

    /* renamed from: b1 */
    public final CheckoutStep4ViewModel mo68265b1() {
        return (CheckoutStep4ViewModel) this.f59030f.getValue();
    }

    @C12579k
    /* renamed from: c1 */
    public final C37694a mo68266c1() {
        C37694a aVar = this.f59034x;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("remoteLogUseCase");
        return null;
    }

    /* renamed from: d1 */
    public final void mo68267d1(Bundle bundle) {
        CheckoutFragment checkoutFragment = (CheckoutFragment) FragmentKt.m148916b(this, CheckoutFragment.class);
        if (checkoutFragment != null) {
            com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(checkoutFragment, C23345b.f59104a.mo68387a(mo68262Y0().mo68647k(), bundle, mo68262Y0().mo68646j()));
        }
    }

    /* renamed from: e1 */
    public final void mo68268e1(CheckoutPaymentResponseThrowable checkoutPaymentResponseThrowable) {
        CheckoutFragment checkoutFragment = (CheckoutFragment) FragmentKt.m148916b(this, CheckoutFragment.class);
        if (checkoutFragment != null) {
            com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(checkoutFragment, C23345b.f59104a.mo68388c(checkoutPaymentResponseThrowable.mo108357b(), checkoutPaymentResponseThrowable.mo108356a(), checkoutPaymentResponseThrowable.mo108358c()));
        }
    }

    /* renamed from: f1 */
    public final void mo68269f1(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C38212b.f96798f, str);
        mo68267d1(bundle);
    }

    /* renamed from: g1 */
    public final void mo68270g1(BasketDomain basketDomain) {
        Double d;
        BasketAmounts v;
        BasketAmounts v2;
        BasketAmounts v3;
        Double d2 = null;
        if (basketDomain == null || (v3 = basketDomain.mo115498v()) == null) {
            d = null;
        } else {
            d = Double.valueOf(v3.mo115423B());
        }
        if (!Intrinsics.areEqual(d, 0.0d)) {
            if (!(basketDomain == null || (v2 = basketDomain.mo115498v()) == null)) {
                d2 = Double.valueOf(v2.mo115423B());
            }
        } else if (!(basketDomain == null || (v = basketDomain.mo115498v()) == null)) {
            d2 = Double.valueOf(v.mo115452y());
        }
        if (d2 != null) {
            mo68264a1().mo75513a((float) d2.doubleValue());
        }
        mo68274j1();
        mo68264a1().mo75514b(this.f59036z);
        if (!mo68276l1()) {
            ((C36790p1) getBinding()).f91476d.setVisibility(8);
        } else {
            ((C36790p1) getBinding()).f91476d.setContent(C8553b.m31049c(1153412168, true, new CheckoutStep4Fragment$handleBasketResult$2(this)));
        }
    }

    /* renamed from: h1 */
    public final void mo68271h1(Throwable th) {
        String str;
        Throwable th2 = th;
        C28935i iVar = C28935i.f70940a;
        if (th2 != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
        C28935i.m119706i(iVar, str, (Throwable) null, 0, 6, (Object) null);
        String str2 = "";
        if (th2 instanceof CheckoutResponseThrowable) {
            C26196a Z0 = mo68263Z0();
            CheckoutResponseThrowable checkoutResponseThrowable = (CheckoutResponseThrowable) th2;
            String a = checkoutResponseThrowable.mo108359a();
            if (a == null) {
                a = str2;
            }
            Z0.mo76206f(a);
            String a2 = checkoutResponseThrowable.mo108359a();
            if (a2 != null) {
                str2 = a2;
            }
            mo68269f1(str2);
        } else if (th2 instanceof CheckoutPaymentResponseThrowable) {
            C26196a Z02 = mo68263Z0();
            CheckoutPaymentResponseThrowable checkoutPaymentResponseThrowable = (CheckoutPaymentResponseThrowable) th2;
            String a3 = checkoutPaymentResponseThrowable.mo108356a();
            if (a3 != null) {
                str2 = a3;
            }
            Z02.mo76206f(str2);
            mo68268e1(checkoutPaymentResponseThrowable);
        } else {
            C26196a Z03 = mo68263Z0();
            String message = th.getMessage();
            if (message != null) {
                str2 = message;
            }
            Z03.mo76206f(str2);
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.checkout_confirm_payment_failed_to_validate_apim);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.check…_failed_to_validate_apim)");
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            C19736g.m91827a(this).mo58152q0();
        }
    }

    /* renamed from: i1 */
    public final void mo68272i1(OrderConfirmationModel orderConfirmationModel) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("orderKey", orderConfirmationModel);
        bundle.putBoolean(C38212b.f96801i, mo68276l1());
        mo68267d1(bundle);
    }

    public final void initHeader() {
        ((C36790p1) getBinding()).f91474b.setContent(C8553b.m31049c(70632004, true, new CheckoutStep4Fragment$initHeader$1(this)));
    }

    /* renamed from: j1 */
    public final void mo68274j1() {
        BasketType basketType;
        boolean z;
        BasketServiceType I;
        BasketDomain f = mo68265b1().mo75474n0().mo4610f();
        C38362d dVar = C38362d.f97145a;
        BasketService basketService = null;
        if (f != null) {
            basketType = f.mo115499w();
        } else {
            basketType = null;
        }
        if (!(f == null || (I = f.mo115466I()) == null)) {
            basketService = I.mo115633d();
        }
        if (f != null) {
            z = f.mo115470M();
        } else {
            z = false;
        }
        this.f59036z = dVar.mo121199b(basketType, basketService, z);
    }

    /* renamed from: k1 */
    public final void mo68275k1() {
        CheckoutStep4ViewModel b1 = mo68265b1();
        b1.mo75474n0().mo57491k(getViewLifecycleOwner(), new C23315b());
        b1.mo75473m0();
        b1.mo75476p0().mo57491k(getViewLifecycleOwner(), new C23316c());
        b1.mo83418c0().mo57491k(getViewLifecycleOwner(), new C23317d());
    }

    /* renamed from: l1 */
    public final boolean mo68276l1() {
        Bundle bundle;
        Bundle arguments = getArguments();
        if (arguments != null && (bundle = arguments.getBundle("arguments_payment_confirmation")) != null) {
            return bundle.getBoolean(C28559l.f69485a);
        }
        throw new Throwable("isExpressPickup not found");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: m1 */
    public final void mo68277m1(String str) {
        WebView webView = ((C36790p1) getBinding()).f91478f;
        webView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(false);
        webView.setWebViewClient(new InternalWebViewClient());
        Intrinsics.checkNotNullExpressionValue(webView, "loadWebView$lambda$4");
        C28785u0.m119115c(webView, C39984a.m162965b(str, mo68261X0().mo84159F()));
    }

    /* renamed from: n1 */
    public final void mo68278n1(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f59031g = appEnvironment;
    }

    /* renamed from: o1 */
    public final void mo68279o1(@C12579k C26196a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f59033w = aVar;
    }

    public void onDestroyView() {
        com.carrefour.fid.android.shared.extension.FragmentKt.m118832t(this);
        super.onDestroyView();
        ((C36790p1) getBinding()).f91478f.destroy();
    }

    public void onStart() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        super.onStart();
    }

    public void onStop() {
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        super.onStop();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        com.carrefour.fid.android.shared.extension.FragmentKt.m118814b(this);
        initHeader();
        String W0 = mo68260W0();
        if (W0 != null) {
            mo68277m1(W0);
        }
        mo68275k1();
    }

    /* renamed from: p1 */
    public final void mo68280p1(@C12579k C26016i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f59032v = iVar;
    }

    /* renamed from: q1 */
    public final void mo68281q1(@C12579k C37694a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f59034x = aVar;
    }
}
