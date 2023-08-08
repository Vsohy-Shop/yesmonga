package com.carrefour.fid.android.account.presentation.p018ui.signin;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13219f;
import com.carrefour.fid.android.account.databinding.C13232s;
import com.carrefour.fid.android.account.p017io.CredentialsResponseThrowable;
import com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.C13706a;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.constant.C28596t0;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.C28755g;
import com.carrefour.fid.android.shared.extension.EditTextKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
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
@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0007H\u0002R\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/signin/SignInFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/account/databinding/f;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "onDestroyView", "h1", "", "isEnabled", "W0", "X0", "Lcom/carrefour/fid/android/account/presentation/viewmodels/signin/mvi/a$b;", "uiState", "Y0", "c1", "e1", "d1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/signin/mvi/a$c;", "uiEvent", "b1", "f1", "", "exception", "a1", "V0", "g1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/signin/SignInViewModel;", "f", "Lkotlin/z;", "Z0", "()Lcom/carrefour/fid/android/account/presentation/viewmodels/signin/SignInViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/navigation/c;", "g", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSignInFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignInFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/signin/SignInFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n*L\n1#1,293:1\n56#2,10:294\n168#3,7:304\n183#3,6:311\n262#4,2:317\n21#5:319\n23#5:323\n21#5:324\n23#5:328\n50#6:320\n55#6:322\n50#6:325\n55#6:327\n106#7:321\n106#7:326\n75#8,2:329\n75#8,2:331\n75#8,2:333\n75#8,2:335\n75#8,2:337\n75#8,2:339\n75#8,2:341\n75#8,2:343\n75#8,2:345\n*S KotlinDebug\n*F\n+ 1 SignInFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/signin/SignInFragment\n*L\n52#1:294,10\n65#1:304,7\n66#1:311,6\n127#1:317,2\n143#1:319\n143#1:323\n144#1:324\n144#1:328\n143#1:320\n143#1:322\n144#1:325\n144#1:327\n143#1:321\n144#1:326\n155#1:329,2\n165#1:331,2\n170#1:333,2\n175#1:335,2\n182#1:337,2\n188#1:339,2\n200#1:341,2\n208#1:343,2\n212#1:345,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment */
public final class SignInFragment extends C13545a<C13219f> {
    @C12579k

    /* renamed from: f */
    public final C11677z f33013f;
    @Inject

    /* renamed from: g */
    public C28796c f33014g;

    public SignInFragment() {
        super(C135241.f33015a);
        SignInFragment$special$$inlined$viewModels$default$1 signInFragment$special$$inlined$viewModels$default$1 = new SignInFragment$special$$inlined$viewModels$default$1(this);
        this.f33013f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(SignInViewModel.class), new SignInFragment$special$$inlined$viewModels$default$2(signInFragment$special$$inlined$viewModels$default$1), new SignInFragment$special$$inlined$viewModels$default$3(signInFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: V0 */
    public final void mo32106V0(C13706a.C13711b bVar) {
        mo32107W0(!bVar.mo32636j());
        mo32108X0(!bVar.mo32637k());
        mo32109Y0(bVar);
    }

    /* renamed from: W0 */
    public final void mo32107W0(boolean z) {
        C13232s sVar = ((C13219f) getBinding()).f32442d;
        if (z) {
            sVar.f32561c.setVisibility(0);
            EditText editText = sVar.f32562d;
            Intrinsics.checkNotNullExpressionValue(editText, "emailText");
            EditTextKt.m118803m(editText, C13144b.C13150f.error_color);
            return;
        }
        sVar.f32561c.setVisibility(4);
        EditText editText2 = sVar.f32562d;
        Intrinsics.checkNotNullExpressionValue(editText2, "emailText");
        EditTextKt.m118803m(editText2, C13144b.C13150f.colorPrimary);
    }

    /* renamed from: X0 */
    public final void mo32108X0(boolean z) {
        C13232s sVar = ((C13219f) getBinding()).f32442d;
        if (z) {
            sVar.f32570l.setVisibility(0);
            EditText editText = sVar.f32571m;
            Intrinsics.checkNotNullExpressionValue(editText, "pwdText");
            EditTextKt.m118803m(editText, C13144b.C13150f.error_color);
            return;
        }
        sVar.f32570l.setVisibility(4);
        EditText editText2 = sVar.f32571m;
        Intrinsics.checkNotNullExpressionValue(editText2, "pwdText");
        EditTextKt.m118803m(editText2, C13144b.C13150f.colorPrimary);
    }

    /* renamed from: Y0 */
    public final void mo32109Y0(C13706a.C13711b bVar) {
        ((C13219f) getBinding()).f32442d.f32560b.setEnabled(!bVar.isLoading());
    }

    /* renamed from: Z0 */
    public final SignInViewModel mo32110Z0() {
        return (SignInViewModel) this.f33013f.getValue();
    }

    /* renamed from: a1 */
    public final void mo32111a1(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof CredentialsResponseThrowable) {
            mo32119h1();
            mo32110Z0().mo31581n(C28596t0.f69890b);
        } else if (th2 instanceof NetWorkResponseThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(C13144b.C13163s.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…error_no_network_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th2 != null) {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(C13144b.C13163s.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…server_not_responding_02)");
            FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            mo32110Z0().mo31581n("le-service-ne-repond-pas");
        }
    }

    /* renamed from: b1 */
    public final void mo32112b1(C13706a.C13712c cVar) {
        C19232h activity;
        if (cVar instanceof C13706a.C13712c.C13714b) {
            mo32111a1(((C13706a.C13712c.C13714b) cVar).mo32651d());
        } else if (cVar instanceof C13706a.C13712c.C13713a) {
            SignInViewModel Z0 = mo32110Z0();
            C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new SignInFragment$handleEvent$1$1(Z0, cVar, (C11045c<? super SignInFragment$handleEvent$1$1>) null), 3, (Object) null);
            Z0.mo31577D();
            Z0.mo31583x(((C13706a.C13712c.C13713a) cVar).mo32644f());
            if (!getNavigator().mo83825a(C19736g.m91827a(this)) && (activity = getActivity()) != null) {
                int i = C13144b.C13145a.no_change;
                int i2 = C13144b.C13145a.slide_out_down;
                Intent putExtra = new Intent().putExtra(C36168a.f89275c, false);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(IS_STORE_REFRESHED, false)");
                C28755g.m119047a(activity, -1, i, i2, putExtra);
            }
        }
    }

    /* renamed from: c1 */
    public final void mo32113c1(boolean z) {
        int i;
        String str;
        C13232s sVar = ((C13219f) getBinding()).f32442d;
        sVar.f32560b.setEnabled(!z);
        ProgressBar progressBar = sVar.f32569k;
        Intrinsics.checkNotNullExpressionValue(progressBar, C9874a.f27062g);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        Button button = sVar.f32560b;
        if (!z) {
            str = getString(C13144b.C13163s.login_connect_text_btn);
        } else {
            str = new String();
        }
        button.setText(str);
        sVar.f32560b.setClickable(!z);
    }

    /* renamed from: d1 */
    public final void mo32114d1() {
        C13232s sVar = ((C13219f) getBinding()).f32442d;
        EditText editText = sVar.f32562d;
        Intrinsics.checkNotNullExpressionValue(editText, "emailText");
        C11907e<Boolean> f1 = C11909g.m47448f1(ViewKt.m119007t(editText).mo83735h(), new SignInFragment$handleTouchAndFocusChange$1$1(sVar, (C11045c<? super SignInFragment$handleTouchAndFocusChange$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C13525x97affe8b((C11045c) null));
        EditText editText2 = sVar.f32571m;
        Intrinsics.checkNotNullExpressionValue(editText2, "pwdText");
        C11907e<Boolean> f12 = C11909g.m47448f1(ViewKt.m119007t(editText2).mo83735h(), new SignInFragment$handleTouchAndFocusChange$1$2(sVar, (C11045c<? super SignInFragment$handleTouchAndFocusChange$1$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C13526x97affe8c((C11045c) null));
        ConstraintLayout constraintLayout = sVar.f32572n;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "signInContentView");
        C11907e f13 = C11909g.m47448f1(ViewKt.m118986K(constraintLayout, (C11300l) null, 1, (Object) null), new SignInFragment$handleTouchAndFocusChange$1$3(this, (C11045c<? super SignInFragment$handleTouchAndFocusChange$1$3>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner3, f13, new C13527x97affe8d((C11045c) null));
    }

    /* renamed from: e1 */
    public final void mo32115e1() {
        C13232s sVar = ((C13219f) getBinding()).f32442d;
        Button button = sVar.f32560b;
        Intrinsics.checkNotNullExpressionValue(button, "connectButton");
        EditText editText = sVar.f32571m;
        Intrinsics.checkNotNullExpressionValue(editText, "pwdText");
        C11907e f1 = C11909g.m47448f1(C11909g.m47432b1(ViewKt.m118997j(button), C11909g.m47448f1(new SignInFragment$initOnClicks$lambda$6$$inlined$filter$2(new SignInFragment$initOnClicks$lambda$6$$inlined$filter$1(TextViewKt.m118955f(editText, (C11300l) null, 1, (Object) null)), sVar), new SignInFragment$initOnClicks$1$3(this, (C11045c<? super SignInFragment$initOnClicks$1$3>) null))), new SignInFragment$initOnClicks$1$4(this, sVar, (C11045c<? super SignInFragment$initOnClicks$1$4>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C13528xf4716582((C11045c) null));
        TextView textView = sVar.f32568j;
        Intrinsics.checkNotNullExpressionValue(textView, "newCustomerText");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(textView), new SignInFragment$initOnClicks$1$5(this, (C11045c<? super SignInFragment$initOnClicks$1$5>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C13529xf4716583((C11045c) null));
        EditText editText2 = sVar.f32562d;
        Intrinsics.checkNotNullExpressionValue(editText2, "emailText");
        C11907e<C11079d2> f13 = C11909g.m47448f1(ViewKt.m118997j(editText2), new SignInFragment$initOnClicks$1$6(this, (C11045c<? super SignInFragment$initOnClicks$1$6>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner3, f13, new C13530xf4716584((C11045c) null));
        EditText editText3 = sVar.f32571m;
        Intrinsics.checkNotNullExpressionValue(editText3, "pwdText");
        C11907e<C11079d2> f14 = C11909g.m47448f1(ViewKt.m118997j(editText3), new SignInFragment$initOnClicks$1$7(this, (C11045c<? super SignInFragment$initOnClicks$1$7>) null));
        C19499w viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner4, f14, new C13531xf4716585((C11045c) null));
        TextView textView2 = sVar.f32563e;
        Intrinsics.checkNotNullExpressionValue(textView2, "forgotPwdText");
        C11907e<C11079d2> f15 = C11909g.m47448f1(ViewKt.m118997j(textView2), new SignInFragment$initOnClicks$1$8(this, (C11045c<? super SignInFragment$initOnClicks$1$8>) null));
        C19499w viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner5, f15, new C13532xf4716586((C11045c) null));
        FloatingActionButton floatingActionButton = ((C13219f) getBinding()).f32441c;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "binding.signInCloseButton");
        C11907e<C11079d2> f16 = C11909g.m47448f1(ViewKt.m118997j(floatingActionButton), new SignInFragment$initOnClicks$2(this, (C11045c<? super SignInFragment$initOnClicks$2>) null));
        C19499w viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner6, f16, new SignInFragment$initOnClicks$$inlined$collectWhileStartedIn$1((C11045c) null));
    }

    /* renamed from: f1 */
    public final void mo32116f1(C13706a.C13711b bVar) {
        mo32113c1(bVar.isLoading());
        mo32106V0(bVar);
    }

    /* renamed from: g1 */
    public final void mo32117g1() {
        C13232s sVar = ((C13219f) getBinding()).f32442d;
        EditText editText = sVar.f32562d;
        Intrinsics.checkNotNullExpressionValue(editText, "emailText");
        String string = getString(C13144b.C13163s.login_email_hint_accessibility);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.login_email_hint_accessibility)");
        ViewKt.m118994g(editText, string);
        EditText editText2 = sVar.f32571m;
        Intrinsics.checkNotNullExpressionValue(editText2, "pwdText");
        String string2 = getString(C13144b.C13163s.login_password_hint_accessibility);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.login…sword_hint_accessibility)");
        ViewKt.m118994g(editText2, string2);
        TextView textView = sVar.f32563e;
        Intrinsics.checkNotNullExpressionValue(textView, "forgotPwdText");
        String string3 = getString(C13144b.C13163s.login_forgot_password_accessibility);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.login…t_password_accessibility)");
        ViewKt.m118994g(textView, string3);
        TextView textView2 = sVar.f32568j;
        Intrinsics.checkNotNullExpressionValue(textView2, "newCustomerText");
        String string4 = getString(C13144b.C13163s.sign_in_new_customer_txt_accessibility);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.sign_…stomer_txt_accessibility)");
        ViewKt.m118994g(textView2, string4);
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f33014g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final void mo32119h1() {
        String string = getString(C13144b.C13163s.general_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_connection)");
        String string2 = getString(C13144b.C13163s.sign_in_authentication_error_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sign_…entication_error_message)");
        FragmentKt.m118838z(this, string, string2, getString(C13144b.C13163s.general_modify), SignInFragment$showWrongCredentialsAlert$1.f33030f, getString(C13144b.C13163s.sign_in_authentication_error_pwd_forgotten), false, new SignInFragment$showWrongCredentialsAlert$2(this), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    public void onDestroyView() {
        super.onDestroyView();
        cleanBinding();
    }

    public void onResume() {
        super.onResume();
        mo32110Z0().sendScreenView();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo32115e1();
        mo32117g1();
        mo32114d1();
        SignInViewModel Z0 = mo32110Z0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new SignInFragment$onViewCreated$$inlined$processState$1(this, Z0, (C11045c) null, this), 3, (Object) null);
        SignInViewModel Z02 = mo32110Z0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new SignInFragment$onViewCreated$$inlined$processEvent$1(this, Z02, (C11045c) null, this), 3, (Object) null);
        EventLiveData.f70863b.mo84199a(C36168a.f89273a).mo57493o(new String());
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f33014g = cVar;
    }
}
