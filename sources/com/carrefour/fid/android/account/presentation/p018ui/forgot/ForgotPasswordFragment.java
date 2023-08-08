package com.carrefour.fid.android.account.presentation.p018ui.forgot;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.compose.runtime.internal.C8553b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13215b;
import com.carrefour.fid.android.account.databinding.C13218e;
import com.carrefour.fid.android.account.p017io.LoginNotFoundThrowable;
import com.carrefour.fid.android.account.presentation.models.NameLastView;
import com.carrefour.fid.android.account.presentation.p018ui.forgot.C13518a;
import com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.C13693a;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.constant.C28540g0;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.EditTextKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
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

@C10164b
@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\u0012\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002R\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/forgot/ForgotPasswordFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/account/databinding/e;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "initHeader", "Z0", "", "isEnabled", "W0", "initListeners", "d1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/forgot/mvi/a$a;", "state", "b1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/forgot/mvi/a$b;", "event", "a1", "isLoading", "Y0", "", "exception", "X0", "c1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/forgot/ForgotPasswordViewModel;", "f", "Lkotlin/z;", "V0", "()Lcom/carrefour/fid/android/account/presentation/viewmodels/forgot/ForgotPasswordViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/util/j;", "g", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "v", "Z", "isValidEmail", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nForgotPasswordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForgotPasswordFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/forgot/ForgotPasswordFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n*L\n1#1,206:1\n56#2,10:207\n168#3,7:217\n183#3,6:224\n21#4:230\n23#4:234\n21#4:235\n23#4:239\n53#4:246\n55#4:250\n50#5:231\n55#5:233\n50#5:236\n55#5:238\n50#5:247\n55#5:249\n106#6:232\n106#6:237\n106#6:248\n75#7,2:240\n75#7,2:242\n75#7,2:244\n75#7,2:251\n*S KotlinDebug\n*F\n+ 1 ForgotPasswordFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/forgot/ForgotPasswordFragment\n*L\n49#1:207,10\n65#1:217,7\n66#1:224,6\n110#1:230\n110#1:234\n111#1:235\n111#1:239\n135#1:246\n135#1:250\n110#1:231\n110#1:233\n111#1:236\n111#1:238\n135#1:247\n135#1:249\n110#1:232\n111#1:237\n135#1:248\n117#1:240,2\n126#1:242,2\n131#1:244,2\n140#1:251,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.forgot.ForgotPasswordFragment */
public final class ForgotPasswordFragment extends C13523d<C13218e> {
    @C12579k

    /* renamed from: f */
    public final C11677z f32981f;
    @Inject

    /* renamed from: g */
    public C28936j f32982g;

    /* renamed from: v */
    public boolean f32983v;

    public ForgotPasswordFragment() {
        super(C134971.f32984a);
        ForgotPasswordFragment$special$$inlined$viewModels$default$1 forgotPasswordFragment$special$$inlined$viewModels$default$1 = new ForgotPasswordFragment$special$$inlined$viewModels$default$1(this);
        this.f32981f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(ForgotPasswordViewModel.class), new ForgotPasswordFragment$special$$inlined$viewModels$default$2(forgotPasswordFragment$special$$inlined$viewModels$default$1), new ForgotPasswordFragment$special$$inlined$viewModels$default$3(forgotPasswordFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: V0 */
    public final ForgotPasswordViewModel mo32062V0() {
        return (ForgotPasswordViewModel) this.f32981f.getValue();
    }

    /* renamed from: W0 */
    public final void mo32063W0(boolean z) {
        C13215b bVar = ((C13218e) getBinding()).f32436b;
        if (z) {
            bVar.f32397d.setVisibility(0);
            EditText editText = bVar.f32396c;
            Intrinsics.checkNotNullExpressionValue(editText, "editForgotPasswordEmail");
            EditTextKt.m118803m(editText, C13144b.C13150f.error_color);
            return;
        }
        bVar.f32397d.setVisibility(4);
        EditText editText2 = bVar.f32396c;
        Intrinsics.checkNotNullExpressionValue(editText2, "editForgotPasswordEmail");
        EditTextKt.m118803m(editText2, C13144b.C13150f.colorPrimary);
    }

    /* renamed from: X0 */
    public final void mo32064X0(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof LoginNotFoundThrowable) {
            mo32062V0().mo31599R("le-service-ne-repond-pas");
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(C13144b.C13163s.general_error_server_not_responding_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…r_not_responding_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th2 instanceof NetWorkResponseThrowable) {
            mo32062V0().mo31599R(C28540g0.f69274f);
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(C13144b.C13163s.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…error_no_network_message)");
            FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th2 != null) {
            mo32066Z0();
        }
    }

    /* renamed from: Y0 */
    public final void mo32065Y0(boolean z) {
        C13215b bVar = ((C13218e) getBinding()).f32436b;
        bVar.f32398e.setEnabled(!z);
        if (z) {
            bVar.f32403j.setVisibility(0);
            bVar.f32398e.setText(new String());
            bVar.f32398e.setClickable(false);
            return;
        }
        bVar.f32403j.setVisibility(8);
        bVar.f32398e.setText(getString(C13144b.C13163s.general_reset));
        bVar.f32398e.setClickable(true);
    }

    /* renamed from: Z0 */
    public final void mo32066Z0() {
        FragmentKt.m118823k(this, C13518a.C13520b.m58045b(C13518a.f33001a, NameLastView.FORGOTPASSWORD, false, ((C13218e) getBinding()).f32436b.f32396c.getText().toString(), 2, (Object) null));
    }

    /* renamed from: a1 */
    public final void mo32067a1(C13693a.C13695b bVar) {
        if (bVar instanceof C13693a.C13695b.C13696a) {
            mo32064X0(((C13693a.C13695b.C13696a) bVar).mo32593d());
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C13693a.C13695b.C13697b.f33301a)) {
            mo32066Z0();
        }
    }

    /* renamed from: b1 */
    public final void mo32068b1(C13693a.C13694a aVar) {
        mo32065Y0(aVar.isLoading());
    }

    /* renamed from: c1 */
    public final void mo32069c1() {
        EditText editText = ((C13218e) getBinding()).f32436b.f32396c;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.forgotPasswordCo…t.editForgotPasswordEmail");
        String string = getString(C13144b.C13163s.login_email_hint_accessibility);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.login_email_hint_accessibility)");
        ViewKt.m118994g(editText, string);
    }

    /* renamed from: d1 */
    public final void mo32070d1() {
        C13215b bVar = ((C13218e) getBinding()).f32436b;
        boolean z = this.f32983v;
        if (z) {
            mo32062V0().sendIntent(new C13693a.C13698c.C13699a(bVar.f32396c.getText().toString()));
        } else {
            mo32063W0(!z);
        }
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f32982g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C13218e) getBinding()).f32438d.setContent(C8553b.m31049c(-415592103, true, new ForgotPasswordFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        C13215b bVar = ((C13218e) getBinding()).f32436b;
        Button button = bVar.f32398e;
        Intrinsics.checkNotNullExpressionValue(button, "forgotPasswordSendButton");
        EditText editText = bVar.f32396c;
        Intrinsics.checkNotNullExpressionValue(editText, "editForgotPasswordEmail");
        C11907e f1 = C11909g.m47448f1(C11909g.m47432b1(ViewKt.m118997j(button), new ForgotPasswordFragment$initListeners$lambda$5$$inlined$filter$2(new ForgotPasswordFragment$initListeners$lambda$5$$inlined$filter$1(TextViewKt.m118955f(editText, (C11300l) null, 1, (Object) null)), bVar)), new ForgotPasswordFragment$initListeners$1$3(this, (C11045c<? super ForgotPasswordFragment$initListeners$1$3>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C13498x24580e90((C11045c) null));
        EditText editText2 = bVar.f32396c;
        Intrinsics.checkNotNullExpressionValue(editText2, "editForgotPasswordEmail");
        C11907e<Boolean> f12 = C11909g.m47448f1(ViewKt.m119007t(editText2).mo83735h(), new ForgotPasswordFragment$initListeners$1$4(bVar, (C11045c<? super ForgotPasswordFragment$initListeners$1$4>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C13499x24580e91((C11045c) null));
        ConstraintLayout constraintLayout = bVar.f32399f;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "forgotPasswordView");
        C11907e f13 = C11909g.m47448f1(ViewKt.m118986K(constraintLayout, (C11300l) null, 1, (Object) null), new ForgotPasswordFragment$initListeners$1$5(this, (C11045c<? super ForgotPasswordFragment$initListeners$1$5>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner3, f13, new C13500x24580e92((C11045c) null));
        EditText editText3 = bVar.f32396c;
        Intrinsics.checkNotNullExpressionValue(editText3, "editForgotPasswordEmail");
        C11907e f14 = C11909g.m47448f1(new ForgotPasswordFragment$initListeners$lambda$5$$inlined$map$1(TextViewKt.m118968s(editText3)), new ForgotPasswordFragment$initListeners$1$7(this, (C11045c<? super ForgotPasswordFragment$initListeners$1$7>) null));
        C19499w viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner4, f14, new C13501x24580e93((C11045c) null));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo32062V0().sendScreenView();
        initHeader();
        initListeners();
        mo32069c1();
        ForgotPasswordViewModel V0 = mo32062V0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new ForgotPasswordFragment$onViewCreated$$inlined$processState$1(this, V0, (C11045c) null, this), 3, (Object) null);
        ForgotPasswordViewModel V02 = mo32062V0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new ForgotPasswordFragment$onViewCreated$$inlined$processEvent$1(this, V02, (C11045c) null, this), 3, (Object) null);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f32982g = jVar;
    }
}
