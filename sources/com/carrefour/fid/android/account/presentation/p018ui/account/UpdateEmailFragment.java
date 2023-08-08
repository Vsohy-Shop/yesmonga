package com.carrefour.fid.android.account.presentation.p018ui.account;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.compose.runtime.internal.C8553b;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13221h;
import com.carrefour.fid.android.account.presentation.models.NameLastView;
import com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel;
import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.C13623a;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.EditTextKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
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
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/ui/account/UpdateEmailFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/account/databinding/h;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "onPause", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/a$b;", "uiEvent", "V0", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/a$a;", "uiState", "Y0", "Z0", "W0", "initHeader", "initListeners", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserEmailViewModel;", "f", "Lkotlin/z;", "U0", "()Lcom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserEmailViewModel;", "viewModel", "Lcom/carrefour/fid/android/shared/util/j;", "g", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nUpdateEmailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateEmailFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/account/UpdateEmailFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n*L\n1#1,147:1\n56#2,10:148\n168#3,7:158\n183#3,6:165\n75#4,2:171\n*S KotlinDebug\n*F\n+ 1 UpdateEmailFragment.kt\ncom/carrefour/fid/android/account/presentation/ui/account/UpdateEmailFragment\n*L\n37#1:148,10\n50#1:158,7\n51#1:165,6\n139#1:171,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.UpdateEmailFragment */
public final class UpdateEmailFragment extends C13390j<C13221h> {
    @C12579k

    /* renamed from: f */
    public final C11677z f32732f;
    @Inject

    /* renamed from: g */
    public C28936j f32733g;

    public UpdateEmailFragment() {
        super(C133311.f32734a);
        UpdateEmailFragment$special$$inlined$viewModels$default$1 updateEmailFragment$special$$inlined$viewModels$default$1 = new UpdateEmailFragment$special$$inlined$viewModels$default$1(this);
        this.f32732f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(UpdateUserEmailViewModel.class), new UpdateEmailFragment$special$$inlined$viewModels$default$2(updateEmailFragment$special$$inlined$viewModels$default$1), new UpdateEmailFragment$special$$inlined$viewModels$default$3(updateEmailFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: X0 */
    public static final void m57678X0(UpdateEmailFragment updateEmailFragment, View view) {
        Intrinsics.checkNotNullParameter(updateEmailFragment, "this$0");
        updateEmailFragment.mo31660U0().sendIntent(new C13623a.C13628c.C13630b(((C13221h) updateEmailFragment.getBinding()).f32484b.getText().toString()));
    }

    /* renamed from: U0 */
    public final UpdateUserEmailViewModel mo31660U0() {
        return (UpdateUserEmailViewModel) this.f32732f.getValue();
    }

    /* renamed from: V0 */
    public final void mo31661V0(C13623a.C13625b bVar) {
        Throwable d;
        String message;
        if (bVar instanceof C13623a.C13625b.C13626a) {
            FragmentKt.m118823k(this, C13394n.f32804a.mo31787a(NameLastView.UPDATEEMAIL, false, ((C13623a.C13625b.C13626a) bVar).mo32357d()));
        } else if ((bVar instanceof C13623a.C13625b.C13627b) && (d = ((C13623a.C13625b.C13627b) bVar).mo32363d()) != null && (message = d.getMessage()) != null) {
            FragmentKt.m118811B(this, NotificationComponent.Variant.ERROR, message, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: W0 */
    public final void mo31662W0() {
        ((C13221h) getBinding()).f32486d.setEnabled(true);
        C13221h hVar = (C13221h) getBinding();
        hVar.f32487e.setVisibility(8);
        hVar.f32486d.setText(getString(C13144b.C13163s.account_button_save));
        hVar.f32486d.setClickable(true);
    }

    /* renamed from: Y0 */
    public final void mo31663Y0(C13623a.C13624a aVar) {
        boolean z;
        if (((C13221h) getBinding()).f32487e.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.isLoading() && !z) {
            mo31664Z0();
        } else if (!aVar.isLoading() && z) {
            mo31662W0();
        }
        if (((C13221h) getBinding()).f32486d.isEnabled() != aVar.mo32352i()) {
            ((C13221h) getBinding()).f32486d.setEnabled(aVar.mo32352i());
        }
    }

    /* renamed from: Z0 */
    public final void mo31664Z0() {
        ((C13221h) getBinding()).f32486d.setEnabled(false);
        C13221h hVar = (C13221h) getBinding();
        hVar.f32487e.setVisibility(0);
        hVar.f32486d.setText("");
        hVar.f32486d.setClickable(false);
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f32733g;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public final void initHeader() {
        getFragmentUtil().mo32776b(this);
        ((C13221h) getBinding()).f32488f.setContent(C8553b.m31049c(-1901682627, true, new UpdateEmailFragment$initHeader$1(this)));
    }

    public final void initListeners() {
        EditText editText = ((C13221h) getBinding()).f32484b;
        Intrinsics.checkNotNullExpressionValue(editText, "initListeners$lambda$4");
        EditTextKt.m118804n(editText);
        C11907e<String> f1 = C11909g.m47448f1(C11909g.m47451g0(EditTextKt.m118806p(editText)), new UpdateEmailFragment$initListeners$1$1(this, (C11045c<? super UpdateEmailFragment$initListeners$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C13332xec2b07a6((C11045c) null));
        ((C13221h) getBinding()).f32486d.setOnClickListener(new C13393m(this));
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
        ((C13221h) getBinding()).f32486d.setEnabled(false);
        initHeader();
        initListeners();
        mo31660U0().sendScreenView();
        UpdateUserEmailViewModel U0 = mo31660U0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new UpdateEmailFragment$onViewCreated$$inlined$processState$1(this, U0, (C11045c) null, this), 3, (Object) null);
        UpdateUserEmailViewModel U02 = mo31660U0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new UpdateEmailFragment$onViewCreated$$inlined$processEvent$1(this, U02, (C11045c) null, this), 3, (Object) null);
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f32733g = jVar;
    }
}
