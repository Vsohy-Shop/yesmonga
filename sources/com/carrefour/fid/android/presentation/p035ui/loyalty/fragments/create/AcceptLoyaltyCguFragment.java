package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36838u;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.create.AcceptLoyaltyCguViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.create.mvi.C26550a;
import com.carrefour.fid.android.shared.base.ObserverWhileResumedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.C28785u0;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.util.C28937k;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p009io.github.aakira.napier.C10848c;

@C10164b
@C11076d0(mo22515d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0007*\u0001(\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002R\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/AcceptLoyaltyCguFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/u;", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "b1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/create/mvi/a$c;", "uiState", "c1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/create/mvi/a$d;", "uiEvent", "Z0", "", "isLoading", "a1", "(Ljava/lang/Boolean;)V", "", "cgu", "Y0", "uri", "d1", "initListener", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/create/AcceptLoyaltyCguViewModel;", "f", "Lkotlin/z;", "X0", "()Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/create/AcceptLoyaltyCguViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/a;", "g", "Landroidx/navigation/m;", "W0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/a;", "args", "com/carrefour/fid/android/presentation/ui/loyalty/fragments/create/AcceptLoyaltyCguFragment$a", "v", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/AcceptLoyaltyCguFragment$a;", "handlerWebViewClient", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAcceptLoyaltyCguFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AcceptLoyaltyCguFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/AcceptLoyaltyCguFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n*L\n1#1,165:1\n106#2,15:166\n42#3,3:181\n168#4,7:184\n183#4,6:191\n83#5,2:197\n83#5,2:199\n83#5,2:201\n*S KotlinDebug\n*F\n+ 1 AcceptLoyaltyCguFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/AcceptLoyaltyCguFragment\n*L\n38#1:166,15\n39#1:181,3\n61#1:184,7\n62#1:191,6\n140#1:197,2\n154#1:199,2\n162#1:201,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.AcceptLoyaltyCguFragment */
public final class AcceptLoyaltyCguFragment extends C24431s<C36838u> {

    /* renamed from: w */
    public static final int f60757w = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f60758f;
    @C12579k

    /* renamed from: g */
    public final C19766m f60759g = new C19766m(C11342l0.m43547d(C24368a.class), new AcceptLoyaltyCguFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C24322a f60760v = new C24322a(this);

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.AcceptLoyaltyCguFragment$a */
    public static final class C24322a extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ AcceptLoyaltyCguFragment f60762a;

        public C24322a(AcceptLoyaltyCguFragment acceptLoyaltyCguFragment) {
            this.f60762a = acceptLoyaltyCguFragment;
        }

        public boolean shouldOverrideUrlLoading(@C12580l WebView webView, @C12580l WebResourceRequest webResourceRequest) {
            Uri url;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                return false;
            }
            AcceptLoyaltyCguFragment acceptLoyaltyCguFragment = this.f60762a;
            String uri = url.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "it.toString()");
            acceptLoyaltyCguFragment.mo71155d1(uri);
            return true;
        }
    }

    public AcceptLoyaltyCguFragment() {
        super(C243211.f60761a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new AcceptLoyaltyCguFragment$special$$inlined$viewModels$default$2(new AcceptLoyaltyCguFragment$special$$inlined$viewModels$default$1(this)));
        this.f60758f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AcceptLoyaltyCguViewModel.class), new AcceptLoyaltyCguFragment$special$$inlined$viewModels$default$3(b), new AcceptLoyaltyCguFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new AcceptLoyaltyCguFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C36838u m106889R0(AcceptLoyaltyCguFragment acceptLoyaltyCguFragment) {
        return (C36838u) acceptLoyaltyCguFragment.getBinding();
    }

    /* renamed from: W0 */
    public final C24368a mo71148W0() {
        return (C24368a) this.f60759g.getValue();
    }

    /* renamed from: X0 */
    public final AcceptLoyaltyCguViewModel mo71149X0() {
        return (AcceptLoyaltyCguViewModel) this.f60758f.getValue();
    }

    /* renamed from: Y0 */
    public final void mo71150Y0(String str) {
        WebView webView = ((C36838u) getBinding()).f91719c;
        webView.setWebViewClient(this.f60760v);
        Intrinsics.checkNotNullExpressionValue(webView, "handleCguInformation$lambda$2");
        C28785u0.m119116d(webView, new AcceptLoyaltyCguFragment$handleCguInformation$1$1(this));
        String str2 = new String();
        if (str == null) {
            str = "";
        }
        webView.loadDataWithBaseURL(str2, str, C28937k.f70947d, "utf-8", (String) null);
    }

    /* renamed from: Z0 */
    public final void mo71151Z0(C26550a.C26554d dVar) {
        if (dVar instanceof C26550a.C26552b) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_server_not_responding_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…r_not_responding_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: a1 */
    public final void mo71152a1(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            ((C36838u) getBinding()).f91718b.setVisibility(8);
            showLoading();
            return;
        }
        ((C36838u) getBinding()).f91718b.setVisibility(0);
        hideLoading();
    }

    /* renamed from: b1 */
    public final void mo71153b1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.condition_carte_carrefour_title);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, AcceptLoyaltyCguFragment$initToolbar$1$1.f60771f, 1, (Object) null);
        }
    }

    /* renamed from: c1 */
    public final void mo71154c1(C26550a.C26553c cVar) {
        boolean z;
        mo71152a1(Boolean.valueOf(cVar.isLoading()));
        if (cVar.mo77216i().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo71150Y0(cVar.mo77216i());
        }
    }

    /* renamed from: d1 */
    public final void mo71155d1(String str) {
        String string = getString(R.string.general_external_link_popup_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…xternal_link_popup_title)");
        String string2 = getString(R.string.general_external_link_popup_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…ernal_link_popup_message)");
        FragmentKt.m118838z(this, string, string2, getString(R.string.yes), new AcceptLoyaltyCguFragment$showPopupDeepLinkDialog$1(this, str), getString(R.string.general_cancel), false, AcceptLoyaltyCguFragment$showPopupDeepLinkDialog$2.f60772f, (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    public final void initListener() {
        ImageButton imageButton = ((C36838u) getBinding()).f91722f;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.loyaltyIvGoToBottom");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(imageButton), new AcceptLoyaltyCguFragment$initListener$1(this, (C11045c<? super AcceptLoyaltyCguFragment$initListener$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileResumedImpl(viewLifecycleOwner, f1, new C24323xbb0bbbe4((C11045c) null));
        Button button = ((C36838u) getBinding()).f91724h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.tvAcceptCgu");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(button), new AcceptLoyaltyCguFragment$initListener$2(this, (C11045c<? super AcceptLoyaltyCguFragment$initListener$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileResumedImpl(viewLifecycleOwner2, f12, new C24324xbb0bbbe5((C11045c) null));
        Button button2 = ((C36838u) getBinding()).f91725i;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.tvCancelCgu");
        C11907e<C11079d2> f13 = C11909g.m47448f1(ViewKt.m118997j(button2), new AcceptLoyaltyCguFragment$initListener$3(this, (C11045c<? super AcceptLoyaltyCguFragment$initListener$3>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileResumedImpl(viewLifecycleOwner3, f13, new C24325xbb0bbbe6((C11045c) null));
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36838u) getBinding()).f91723g;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.loyaltyShimmerContent");
        return shimmerFrameLayout;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71153b1();
        mo71149X0().sendTagScreenAcceptLoyaltyCGU();
        AcceptLoyaltyCguViewModel X0 = mo71149X0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new AcceptLoyaltyCguFragment$onViewCreated$$inlined$processState$1(this, X0, (C11045c) null, this), 3, (Object) null);
        AcceptLoyaltyCguViewModel X02 = mo71149X0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new AcceptLoyaltyCguFragment$onViewCreated$$inlined$processEvent$1(this, X02, (C11045c) null, this), 3, (Object) null);
        C19501x.m90847a(this).mo57477c(new AcceptLoyaltyCguFragment$onViewCreated$3(this, (C11045c<? super AcceptLoyaltyCguFragment$onViewCreated$3>) null));
        initListener();
    }
}
