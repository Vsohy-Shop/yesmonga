package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36690f1;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.CheckoutCgvViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.mvi.C26075b;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0007*\u0001\"\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep3CgvFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/f1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "initHeader", "initListeners", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/mvi/b$c;", "uiEvent", "W0", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/mvi/b$b;", "uiState", "X0", "", "checkoutCGV", "V0", "Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutCgvViewModel;", "f", "Lkotlin/z;", "U0", "()Lcom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutCgvViewModel;", "checkoutCgvViewModel", "Lcom/carrefour/fid/android/shared/util/j;", "g", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "com/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep3CgvFragment$handlerWebViewClient$1", "v", "Lcom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep3CgvFragment$handlerWebViewClient$1;", "handlerWebViewClient", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStep3CgvFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep3CgvFragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep3CgvFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,125:1\n106#2,15:126\n168#3,7:141\n183#3,6:148\n83#4,2:154\n262#5,2:156\n*S KotlinDebug\n*F\n+ 1 CheckoutStep3CgvFragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep3CgvFragment\n*L\n40#1:126,15\n62#1:141,7\n64#1:148,6\n91#1:154,2\n104#1:156,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep3CgvFragment */
public final class CheckoutStep3CgvFragment extends C23349b0<C36690f1> {

    /* renamed from: w */
    public static final int f59006w = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f59007f;
    @Inject

    /* renamed from: g */
    public C28936j f59008g;
    @C12579k

    /* renamed from: v */
    public final CheckoutStep3CgvFragment$handlerWebViewClient$1 f59009v = new CheckoutStep3CgvFragment$handlerWebViewClient$1(this);

    public CheckoutStep3CgvFragment() {
        super(C232921.f59010a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new CheckoutStep3CgvFragment$special$$inlined$viewModels$default$2(new CheckoutStep3CgvFragment$special$$inlined$viewModels$default$1(this)));
        this.f59007f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CheckoutCgvViewModel.class), new CheckoutStep3CgvFragment$special$$inlined$viewModels$default$3(b), new CheckoutStep3CgvFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new CheckoutStep3CgvFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ C36690f1 m104041Q0(CheckoutStep3CgvFragment checkoutStep3CgvFragment) {
        return (C36690f1) checkoutStep3CgvFragment.getBinding();
    }

    /* renamed from: U0 */
    public final CheckoutCgvViewModel mo68225U0() {
        return (CheckoutCgvViewModel) this.f59007f.getValue();
    }

    /* renamed from: V0 */
    public final void mo68226V0(String str) {
        WebView webView = ((C36690f1) getBinding()).f90796g;
        webView.setWebViewClient(this.f59009v);
        webView.loadDataWithBaseURL(new String(), str, C28937k.f70947d, "utf-8", (String) null);
    }

    /* renamed from: W0 */
    public final void mo68227W0(C26075b.C26081c cVar) {
        if (cVar instanceof C26075b.C26081c.C26082a) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_server_not_responding_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…r_not_responding_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: X0 */
    public final void mo68228X0(C26075b.C26080b bVar) {
        int i;
        ProgressBar progressBar = ((C36690f1) getBinding()).f90794e;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.checkoutStep3CgvProgressBar");
        boolean z = false;
        if (bVar.mo75737j()) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        if (bVar.mo75736i().length() > 0) {
            z = true;
        }
        if (z) {
            mo68226V0(bVar.mo75736i());
        }
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f59008g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C36690f1) getBinding()).f90792c.setContent(C8553b.m31049c(-1501626920, true, new CheckoutStep3CgvFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        ImageButton imageButton = ((C36690f1) getBinding()).f90791b;
        Intrinsics.checkNotNullExpressionValue(imageButton, "cgvGoToBottom");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(imageButton), new CheckoutStep3CgvFragment$initListeners$1$1(this, (C11045c<? super CheckoutStep3CgvFragment$initListeners$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileResumedImpl(viewLifecycleOwner, f1, new C23293xeee5951d((C11045c) null));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118697g(requireActivity);
        initHeader();
        initListeners();
        CheckoutCgvViewModel U0 = mo68225U0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep3CgvFragment$onViewCreated$$inlined$processState$1(this, U0, (C11045c) null, this), 3, (Object) null);
        CheckoutCgvViewModel U02 = mo68225U0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new CheckoutStep3CgvFragment$onViewCreated$$inlined$processEvent$1(this, U02, (C11045c) null, this), 3, (Object) null);
        C19501x.m90847a(this).mo57477c(new CheckoutStep3CgvFragment$onViewCreated$3(this, (C11045c<? super CheckoutStep3CgvFragment$onViewCreated$3>) null));
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f59008g = jVar;
    }
}
