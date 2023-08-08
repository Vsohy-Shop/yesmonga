package com.carrefour.fid.android.account.presentation.p018ui.account;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.core.util.SecurityRule;
import com.carrefour.fid.android.account.databinding.C13223j;
import com.carrefour.fid.android.account.p017io.CredentialsResponseThrowable;
import com.carrefour.fid.android.account.p017io.LoginNotFoundThrowable;
import com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.EditTextKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.util.C28936j;
import com.carrefour.fid.android.shared.util.C28951s;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.Set;
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
import kotlin.time.C11636e;
import kotlin.time.C11639g;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/account/UpdateUserPasswordFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/account/databinding/j;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "onPause", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$a;", "uiEvent", "Y0", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$b;", "uiState", "d1", "initHeader", "", "throwable", "X0", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$b$d;", "Z0", "e1", "a1", "b1", "Landroid/widget/TextView;", "", "isRuleEnabled", "V0", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserPasswordViewModel;", "f", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserPasswordViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/util/j;", "g", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nUpdateUserPasswordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateUserPasswordFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/account/UpdateUserPasswordFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n56#2,10:259\n168#3,7:269\n183#3,6:276\n75#4,2:282\n75#4,2:284\n75#4,2:286\n75#4,2:288\n75#4,2:290\n1#5:292\n*S KotlinDebug\n*F\n+ 1 UpdateUserPasswordFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/account/UpdateUserPasswordFragment\n*L\n50#1:259,10\n62#1:269,7\n63#1:276,6\n207#1:282,2\n222#1:284,2\n228#1:286,2\n234#1:288,2\n247#1:290,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.UpdateUserPasswordFragment */
public final class UpdateUserPasswordFragment extends C13392l<C13223j> {
    @C12579k

    /* renamed from: f */
    public final C11677z f32758f;
    @Inject

    /* renamed from: g */
    public C28936j f32759g;

    public UpdateUserPasswordFragment() {
        super(C133631.f32760a);
        UpdateUserPasswordFragment$special$$inlined$viewModels$default$1 updateUserPasswordFragment$special$$inlined$viewModels$default$1 = new UpdateUserPasswordFragment$special$$inlined$viewModels$default$1(this);
        this.f32758f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(UpdateUserPasswordViewModel.class), new UpdateUserPasswordFragment$special$$inlined$viewModels$default$2(updateUserPasswordFragment$special$$inlined$viewModels$default$1), new UpdateUserPasswordFragment$special$$inlined$viewModels$default$3(updateUserPasswordFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C13223j m57714R0(UpdateUserPasswordFragment updateUserPasswordFragment) {
        return (C13223j) updateUserPasswordFragment.getBinding();
    }

    /* renamed from: c1 */
    public static final void m57718c1(UpdateUserPasswordFragment updateUserPasswordFragment, C13223j jVar, View view) {
        Intrinsics.checkNotNullParameter(updateUserPasswordFragment, "this$0");
        Intrinsics.checkNotNullParameter(jVar, "$this_with");
        updateUserPasswordFragment.mo31705W0().sendIntent(new UpdateUserPassword.C13620c.C13621a(jVar.f32511g.getText().toString(), jVar.f32507c.getText().toString()));
    }

    /* renamed from: V0 */
    public final void mo31704V0(TextView textView, boolean z) {
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C13144b.C13152h.ic_check_green, 0);
            Context context = textView.getContext();
            if (context != null) {
                textView.setCompoundDrawablePadding(C28951s.f70964a.mo84277c(5, context));
                return;
            }
            return;
        }
        textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: W0 */
    public final UpdateUserPasswordViewModel mo31705W0() {
        return (UpdateUserPasswordViewModel) this.f32758f.getValue();
    }

    /* renamed from: X0 */
    public final void mo31706X0(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof CredentialsResponseThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(C13144b.C13163s.account_update_user_password_wrong_old_password);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.accou…sword_wrong_old_password)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th2 instanceof LoginNotFoundThrowable) {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(C13144b.C13163s.general_error_parameters_server_not_responding_01);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…server_not_responding_01)");
            FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else {
            NotificationComponent.Variant variant3 = NotificationComponent.Variant.ERROR;
            String string3 = getString(C13144b.C13163s.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.gener…error_no_network_message)");
            FragmentKt.m118811B(this, variant3, string3, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: Y0 */
    public final void mo31707Y0(UpdateUserPassword.C13612a aVar) {
        if (aVar instanceof UpdateUserPassword.C13612a.C13613a) {
            mo31706X0(((UpdateUserPassword.C13612a.C13613a) aVar).mo32311d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) UpdateUserPassword.C13612a.C13614b.f33138a)) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.SUCCESS;
            String string = getString(C13144b.C13163s.account_update_user_password_dialog_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.accou…_password_dialog_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            C19736g.m91827a(this).mo58156s0();
        }
    }

    /* renamed from: Z0 */
    public final void mo31708Z0(UpdateUserPassword.C13615b.C13619d dVar) {
        int i;
        TextView textView = ((C13223j) getBinding()).f32512h;
        int i2 = 8;
        boolean z = false;
        if (dVar.mo32328k()) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        TextView textView2 = ((C13223j) getBinding()).f32508d;
        if (!dVar.mo32329l()) {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        EditText editText = ((C13223j) getBinding()).f32507c;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.newPasswordEditText");
        EditTextKt.m118799i(editText, new UpdateUserPasswordFragment$handlePasswordsValidation$1(dVar, this));
        Set<SecurityRule> j = dVar.mo32327j();
        TextView textView3 = ((C13223j) getBinding()).f32520p;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.uppercaseRuleText");
        mo31704V0(textView3, j.contains(SecurityRule.UPPER_CASE));
        TextView textView4 = ((C13223j) getBinding()).f32506b;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.lowercaseRuleText");
        mo31704V0(textView4, j.contains(SecurityRule.LOWER_CASE));
        TextView textView5 = ((C13223j) getBinding()).f32510f;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.numericRuleText");
        mo31704V0(textView5, j.contains(SecurityRule.NUMERIC));
        TextView textView6 = ((C13223j) getBinding()).f32516l;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.specialCharRuleText");
        mo31704V0(textView6, j.contains(SecurityRule.SPECIAL_CHARACTER));
        Button button = ((C13223j) getBinding()).f32515k;
        if (dVar.mo32329l() && dVar.mo32328k()) {
            z = true;
        }
        button.setEnabled(z);
    }

    /* renamed from: a1 */
    public final void mo31709a1() {
        C13223j jVar = (C13223j) getBinding();
        jVar.f32519o.setVisibility(8);
        Button button = jVar.f32515k;
        ((C13223j) getBinding()).f32515k.setEnabled(true);
        button.setAllCaps(true);
        button.setText(getString(C13144b.C13163s.general_validate));
        button.setContentDescription(getString(C13144b.C13163s.accessibility_validate_to_continue));
        button.setClickable(true);
        jVar.f32507c.setEnabled(true);
        jVar.f32511g.setEnabled(true);
    }

    /* renamed from: b1 */
    public final View mo31710b1() {
        C13223j jVar = (C13223j) getBinding();
        EditText editText = jVar.f32507c;
        Intrinsics.checkNotNullExpressionValue(editText, "newPasswordEditText");
        C11907e<Boolean> f1 = C11909g.m47448f1(ViewKt.m119007t(editText).mo83735h(), new UpdateUserPasswordFragment$initListeners$1$1(jVar, this, (C11045c<? super UpdateUserPasswordFragment$initListeners$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C13364xca7acafe((C11045c) null));
        EditText editText2 = jVar.f32511g;
        Intrinsics.checkNotNullExpressionValue(editText2, "oldPasswordEditText");
        C11907e<Boolean> f12 = C11909g.m47448f1(ViewKt.m119007t(editText2).mo83735h(), new UpdateUserPasswordFragment$initListeners$1$2(jVar, this, (C11045c<? super UpdateUserPasswordFragment$initListeners$1$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C13365xca7acaff((C11045c) null));
        EditText editText3 = jVar.f32507c;
        Intrinsics.checkNotNullExpressionValue(editText3, "newPasswordEditText");
        C11907e<String> p = EditTextKt.m118806p(editText3);
        C11636e.C11637a aVar = C11636e.f28954b;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        C11907e<String> f13 = C11909g.m47448f1(C11909g.m47435c0(p, C11639g.m45638m0(500, durationUnit)), new UpdateUserPasswordFragment$initListeners$1$3(this, (C11045c<? super UpdateUserPasswordFragment$initListeners$1$3>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner3, f13, new C13366xca7acb00((C11045c) null));
        EditText editText4 = jVar.f32511g;
        Intrinsics.checkNotNullExpressionValue(editText4, "oldPasswordEditText");
        C11907e<String> f14 = C11909g.m47448f1(C11909g.m47435c0(EditTextKt.m118806p(editText4), C11639g.m45638m0(500, durationUnit)), new UpdateUserPasswordFragment$initListeners$1$4(this, (C11045c<? super UpdateUserPasswordFragment$initListeners$1$4>) null));
        C19499w viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner4, f14, new C13367xca7acb01((C11045c) null));
        jVar.f32515k.setOnClickListener(new C13404v(this, jVar));
        View view = getView();
        if (view == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(view, "initListeners$lambda$8$lambda$7");
        C11907e f15 = C11909g.m47448f1(ViewKt.m118986K(view, (C11300l) null, 1, (Object) null), new UpdateUserPasswordFragment$initListeners$1$6$1(view, (C11045c<? super UpdateUserPasswordFragment$initListeners$1$6$1>) null));
        C19499w viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner5, f15, new C13368x3a65cbca((C11045c) null));
        return view;
    }

    /* renamed from: d1 */
    public final void mo31711d1(UpdateUserPassword.C13615b bVar) {
        if (bVar instanceof UpdateUserPassword.C13615b.C13618c) {
            if (((UpdateUserPassword.C13615b.C13618c) bVar).isLoading()) {
                mo31712e1();
            } else {
                mo31709a1();
            }
        } else if (bVar instanceof UpdateUserPassword.C13615b.C13619d) {
            mo31708Z0((UpdateUserPassword.C13615b.C13619d) bVar);
        }
    }

    /* renamed from: e1 */
    public final void mo31712e1() {
        C13223j jVar = (C13223j) getBinding();
        jVar.f32519o.setVisibility(0);
        Button button = jVar.f32515k;
        button.setText(new String());
        button.setEnabled(true);
        button.setClickable(false);
        jVar.f32507c.setEnabled(false);
        jVar.f32511g.setEnabled(false);
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f32759g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C13223j) getBinding()).f32517m.setContent(C8553b.m31049c(2060724195, true, new UpdateUserPasswordFragment$initHeader$1(this)));
    }

    public void onPause() {
        FragmentKt.m118832t(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        FragmentKt.m118814b(this);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initHeader();
        mo31710b1();
        mo31705W0().sendScreenView();
        UpdateUserPasswordViewModel W0 = mo31705W0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new UpdateUserPasswordFragment$onViewCreated$$inlined$processState$1(this, W0, (C11045c) null, this), 3, (Object) null);
        UpdateUserPasswordViewModel W02 = mo31705W0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new UpdateUserPasswordFragment$onViewCreated$$inlined$processEvent$1(this, W02, (C11045c) null, this), 3, (Object) null);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f32759g = jVar;
    }
}
