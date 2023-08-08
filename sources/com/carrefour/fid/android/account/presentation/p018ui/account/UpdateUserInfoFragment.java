package com.carrefour.fid.android.account.presentation.p018ui.account;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13222i;
import com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo;
import com.carrefour.fid.android.design.components.extension.EditTextKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11677z;
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
@C11076d0(mo22515d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0015H\u0002J \u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u0007H\u0002J\b\u0010\"\u001a\u00020\u0007H\u0002J\b\u0010#\u001a\u00020\u0007H\u0002R\u001b\u0010)\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00064"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/account/UpdateUserInfoFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/account/databinding/i;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "onPause", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$c;", "uiEvent", "a1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$b;", "uiState", "i1", "initHeader", "Lcom/carrefour/fid/android/domain/models/account/AccountInfo;", "accountInfo", "Z0", "", "enabled", "X0", "isEnabled", "d1", "c1", "Landroid/widget/TextView;", "fieldError", "Landroid/widget/EditText;", "fieldInput", "b1", "e1", "k1", "initListeners", "j1", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserInfoViewModel;", "f", "Lkotlin/z;", "Y0", "()Lcom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserInfoViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/util/j;", "g", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nUpdateUserInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateUserInfoFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/account/UpdateUserInfoFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n*L\n1#1,217:1\n56#2,10:218\n168#3,7:228\n183#3,6:235\n1#4:241\n28#5:242\n30#5:246\n28#5:249\n30#5:253\n50#6:243\n55#6:245\n50#6:250\n55#6:252\n106#7:244\n106#7:251\n75#8,2:247\n75#8,2:254\n*S KotlinDebug\n*F\n+ 1 UpdateUserInfoFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/account/UpdateUserInfoFragment\n*L\n44#1:218,10\n57#1:228,7\n58#1:235,6\n163#1:242\n163#1:246\n174#1:249\n174#1:253\n163#1:243\n163#1:245\n174#1:250\n174#1:252\n163#1:244\n174#1:251\n167#1:247,2\n182#1:254,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.UpdateUserInfoFragment */
public final class UpdateUserInfoFragment extends C13391k<C13222i> {
    @C12579k

    /* renamed from: f */
    public final C11677z f32743f;
    @Inject

    /* renamed from: g */
    public C28936j f32744g;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.account.UpdateUserInfoFragment$a */
    public /* synthetic */ class C13344a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CivilityTitle.values().length];
            try {
                iArr[CivilityTitle.MRS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UpdateUserInfoFragment() {
        super(C133431.f32745a);
        UpdateUserInfoFragment$special$$inlined$viewModels$default$1 updateUserInfoFragment$special$$inlined$viewModels$default$1 = new UpdateUserInfoFragment$special$$inlined$viewModels$default$1(this);
        this.f32743f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(UpdateUserInfoViewModel.class), new UpdateUserInfoFragment$special$$inlined$viewModels$default$2(updateUserInfoFragment$special$$inlined$viewModels$default$1), new UpdateUserInfoFragment$special$$inlined$viewModels$default$3(updateUserInfoFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C13222i m57690T0(UpdateUserInfoFragment updateUserInfoFragment) {
        return (C13222i) updateUserInfoFragment.getBinding();
    }

    /* renamed from: f1 */
    public static final void m57694f1(UpdateUserInfoFragment updateUserInfoFragment, View view) {
        CivilityTitle civilityTitle;
        Intrinsics.checkNotNullParameter(updateUserInfoFragment, "this$0");
        UpdateUserInfoViewModel Y0 = updateUserInfoFragment.mo31679Y0();
        String obj = ((C13222i) updateUserInfoFragment.getBinding()).f32496g.getText().toString();
        String obj2 = ((C13222i) updateUserInfoFragment.getBinding()).f32498i.getText().toString();
        if (((C13222i) updateUserInfoFragment.getBinding()).f32493d.isChecked()) {
            civilityTitle = CivilityTitle.MR;
        } else {
            civilityTitle = CivilityTitle.MRS;
        }
        Y0.sendIntent(new UpdateUserInfo.C13605d.C13610e(obj, obj2, civilityTitle));
    }

    /* renamed from: g1 */
    public static final void m57695g1(UpdateUserInfoFragment updateUserInfoFragment, View view) {
        Intrinsics.checkNotNullParameter(updateUserInfoFragment, "this$0");
        updateUserInfoFragment.mo31679Y0().sendIntent(new UpdateUserInfo.C13605d.C13609d(CivilityTitle.MR));
    }

    /* renamed from: h1 */
    public static final void m57696h1(UpdateUserInfoFragment updateUserInfoFragment, View view) {
        Intrinsics.checkNotNullParameter(updateUserInfoFragment, "this$0");
        updateUserInfoFragment.mo31679Y0().sendIntent(new UpdateUserInfo.C13605d.C13609d(CivilityTitle.MRS));
    }

    /* renamed from: X0 */
    public final void mo31678X0(boolean z) {
        ((C13222i) getBinding()).f32502m.setEnabled(z);
    }

    /* renamed from: Y0 */
    public final UpdateUserInfoViewModel mo31679Y0() {
        return (UpdateUserInfoViewModel) this.f32743f.getValue();
    }

    /* renamed from: Z0 */
    public final void mo31680Z0(AccountInfo accountInfo) {
        int i;
        int i2;
        CivilityTitle p = accountInfo.mo116661p();
        if (p == null) {
            i = -1;
        } else {
            i = C13344a.$EnumSwitchMapping$0[p.ordinal()];
        }
        if (i == 1) {
            i2 = ((C13222i) getBinding()).f32495f.getId();
        } else {
            i2 = ((C13222i) getBinding()).f32493d.getId();
        }
        ((C13222i) getBinding()).f32494e.check(i2);
        EditText editText = ((C13222i) getBinding()).f32498i;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.lastnameEditText");
        EditTextKt.m152107a(editText, accountInfo.mo116667u());
        EditText editText2 = ((C13222i) getBinding()).f32496g;
        Intrinsics.checkNotNullExpressionValue(editText2, "binding.firstnameEditText");
        EditTextKt.m152107a(editText2, accountInfo.mo116664s());
    }

    /* renamed from: a1 */
    public final void mo31681a1(UpdateUserInfo.C13602c cVar) {
        UpdateUserInfo.C13602c cVar2 = cVar;
        if (Intrinsics.areEqual((Object) cVar2, (Object) UpdateUserInfo.C13602c.C13603a.f33115a)) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(C13144b.C13163s.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_02)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (Intrinsics.areEqual((Object) cVar2, (Object) UpdateUserInfo.C13602c.C13604b.f33117a)) {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.SUCCESS;
            String string2 = getString(C13144b.C13163s.account_infos_updated);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.account_infos_updated)");
            FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            C19736g.m91827a(this).mo58156s0();
        }
    }

    /* renamed from: b1 */
    public final void mo31682b1(boolean z, TextView textView, EditText editText) {
        if (z) {
            textView.setVisibility(0);
            com.carrefour.fid.android.shared.extension.EditTextKt.m118803m(editText, C13144b.C13150f.error_color);
            return;
        }
        textView.setVisibility(4);
        com.carrefour.fid.android.shared.extension.EditTextKt.m118803m(editText, C13144b.C13150f.colorPrimary);
    }

    /* renamed from: c1 */
    public final void mo31683c1(boolean z) {
        TextView textView = ((C13222i) getBinding()).f32497h;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.firstnameErrorText");
        EditText editText = ((C13222i) getBinding()).f32496g;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.firstnameEditText");
        mo31682b1(z, textView, editText);
    }

    /* renamed from: d1 */
    public final void mo31684d1(boolean z) {
        TextView textView = ((C13222i) getBinding()).f32499j;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.lastnameErrorText");
        EditText editText = ((C13222i) getBinding()).f32498i;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.lastnameEditText");
        mo31682b1(z, textView, editText);
    }

    /* renamed from: e1 */
    public final void mo31685e1() {
        mo31678X0(true);
        ((C13222i) getBinding()).f32501l.setVisibility(8);
        ((C13222i) getBinding()).f32502m.setText(getString(C13144b.C13163s.account_button_save));
        ((C13222i) getBinding()).f32502m.setClickable(true);
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f32744g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    /* renamed from: i1 */
    public final void mo31687i1(UpdateUserInfo.C13600b bVar) {
        if (bVar.isLoading()) {
            mo31691k1();
        } else {
            mo31685e1();
        }
        AccountInfo k = bVar.mo32275k();
        if (k != null) {
            mo31680Z0(k);
        }
        mo31684d1(bVar.mo32276l().contains(UpdateUserInfo.FieldError.LASTNAME));
        mo31683c1(bVar.mo32276l().contains(UpdateUserInfo.FieldError.FIRSTNAME));
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C13222i) getBinding()).f32503n.setContent(C8553b.m31049c(-460792003, true, new UpdateUserInfoFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        EditText editText = ((C13222i) getBinding()).f32498i;
        Intrinsics.checkNotNullExpressionValue(editText, "initListeners$lambda$3");
        com.carrefour.fid.android.shared.extension.EditTextKt.m118804n(editText);
        C11907e f1 = C11909g.m47448f1(new C13346xf2e3992(ViewKt.m119007t(editText).mo83735h()), new UpdateUserInfoFragment$initListeners$1$2(this, (C11045c<? super UpdateUserInfoFragment$initListeners$1$2>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C13345x58fe276((C11045c) null));
        EditText editText2 = ((C13222i) getBinding()).f32496g;
        Intrinsics.checkNotNullExpressionValue(editText2, "initListeners$lambda$5");
        com.carrefour.fid.android.shared.extension.EditTextKt.m118804n(editText2);
        C11907e f12 = C11909g.m47448f1(new C13350x1c39aed0(ViewKt.m119007t(editText2).mo83735h()), new UpdateUserInfoFragment$initListeners$2$2(this, (C11045c<? super UpdateUserInfoFragment$initListeners$2$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C13349x7fcf6ab4((C11045c) null));
        ((C13222i) getBinding()).f32502m.setOnClickListener(new C13399q(this));
        ((C13222i) getBinding()).f32493d.setOnClickListener(new C13400r(this));
        ((C13222i) getBinding()).f32495f.setOnClickListener(new C13401s(this));
    }

    /* renamed from: j1 */
    public final void mo31690j1() {
        EditText editText = ((C13222i) getBinding()).f32498i;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.lastnameEditText");
        String string = getString(C13144b.C13163s.accessibility_update_account_fields_nom);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.acces…pdate_account_fields_nom)");
        ViewKt.m118994g(editText, string);
        EditText editText2 = ((C13222i) getBinding()).f32496g;
        Intrinsics.checkNotNullExpressionValue(editText2, "binding.firstnameEditText");
        String string2 = getString(C13144b.C13163s.accessibility_update_account_fields_prenom);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.acces…te_account_fields_prenom)");
        ViewKt.m118994g(editText2, string2);
    }

    /* renamed from: k1 */
    public final void mo31691k1() {
        mo31678X0(false);
        ((C13222i) getBinding()).f32501l.setVisibility(0);
        ((C13222i) getBinding()).f32502m.setText("");
        ((C13222i) getBinding()).f32502m.setClickable(false);
    }

    public void onPause() {
        FragmentKt.m118832t(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        FragmentKt.m118814b(this);
        mo31679Y0().sendIntent(UpdateUserInfo.C13605d.C13608c.f33123a);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo31690j1();
        initHeader();
        initListeners();
        mo31679Y0().sendScreenView();
        UpdateUserInfoViewModel Y0 = mo31679Y0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new UpdateUserInfoFragment$onViewCreated$$inlined$processState$1(this, Y0, (C11045c) null, this), 3, (Object) null);
        UpdateUserInfoViewModel Y02 = mo31679Y0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new UpdateUserInfoFragment$onViewCreated$$inlined$processEvent$1(this, Y02, (C11045c) null, this), 3, (Object) null);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f32744g = jVar;
    }
}
