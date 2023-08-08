package com.carrefour.fid.android.various.presentation.p034ui.notification;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.various.C22729b;
import com.carrefour.fid.android.various.databinding.C22773a;
import com.carrefour.fid.android.various.domain.model.AppMessage;
import com.carrefour.fid.android.various.domain.model.AppMessageRecurrence;
import com.carrefour.fid.android.various.presentation.viewmodels.notification.AppMessageViewModel;
import com.carrefour.fid.android.various.presentation.viewmodels.notification.mvi.C22822a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.C10164b;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/presentation/ui/notification/AppMessageFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/various/databinding/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "X0", "Lcom/carrefour/fid/android/various/presentation/viewmodels/notification/mvi/a$a;", "uiEvent", "Y0", "Lcom/carrefour/fid/android/various/presentation/viewmodels/notification/mvi/a$b;", "uiState", "b1", "Lcom/carrefour/fid/android/various/domain/model/AppMessage;", "message", "V0", "Lcom/carrefour/fid/android/various/presentation/viewmodels/notification/AppMessageViewModel;", "f", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/various/presentation/viewmodels/notification/AppMessageViewModel;", "viewModel", "<init>", "()V", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAppMessageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMessageFragment.kt\ncom/carrefour/fid/android/various/presentation/ui/notification/AppMessageFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,95:1\n56#2,10:96\n168#3,7:106\n183#3,6:113\n262#4,2:119\n262#4,2:121\n*S KotlinDebug\n*F\n+ 1 AppMessageFragment.kt\ncom/carrefour/fid/android/various/presentation/ui/notification/AppMessageFragment\n*L\n27#1:96,10\n41#1:106,7\n42#1:113,6\n82#1:119,2\n87#1:121,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.various.presentation.ui.notification.AppMessageFragment */
public final class AppMessageFragment extends C22814d<C22773a> {
    @C12579k

    /* renamed from: f */
    public final C11677z f58365f;

    public AppMessageFragment() {
        super(C228021.f58366a);
        AppMessageFragment$special$$inlined$viewModels$default$1 appMessageFragment$special$$inlined$viewModels$default$1 = new AppMessageFragment$special$$inlined$viewModels$default$1(this);
        this.f58365f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(AppMessageViewModel.class), new AppMessageFragment$special$$inlined$viewModels$default$2(appMessageFragment$special$$inlined$viewModels$default$1), new AppMessageFragment$special$$inlined$viewModels$default$3(appMessageFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: Z0 */
    public static final void m103057Z0(AppMessageFragment appMessageFragment, View view) {
        Intrinsics.checkNotNullParameter(appMessageFragment, "this$0");
        appMessageFragment.mo67249W0().sendIntent(C22822a.C22833c.C22834a.f58397a);
    }

    /* renamed from: a1 */
    public static final void m103058a1(AppMessageFragment appMessageFragment, View view) {
        Intrinsics.checkNotNullParameter(appMessageFragment, "this$0");
        appMessageFragment.mo67249W0().sendIntent(C22822a.C22833c.C22836c.f58399a);
    }

    /* renamed from: V0 */
    public final void mo67248V0(AppMessage appMessage) {
        int i;
        String str;
        ((C22773a) getBinding()).f58321c.setText(appMessage.getTitle());
        ((C22773a) getBinding()).f58320b.setText(appMessage.getText());
        MaterialButton materialButton = ((C22773a) getBinding()).f58322d;
        Intrinsics.checkNotNullExpressionValue(materialButton, "displayMessage$lambda$3");
        int i2 = 0;
        if (!C11622t.isBlank(appMessage.getButtonText())) {
            i = 0;
        } else {
            i = 8;
        }
        materialButton.setVisibility(i);
        materialButton.setText(appMessage.getButtonText());
        MaterialButton materialButton2 = ((C22773a) getBinding()).f58324f;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "displayMessage$lambda$4");
        if (!(!Intrinsics.areEqual((Object) appMessage.getRecurrence(), (Object) AppMessageRecurrence.Blocker.INSTANCE))) {
            i2 = 8;
        }
        materialButton2.setVisibility(i2);
        if (Intrinsics.areEqual((Object) appMessage.getRecurrence(), (Object) AppMessageRecurrence.Info.INSTANCE)) {
            str = getString(C22729b.C22748s.general_continue);
        } else {
            str = getString(C22729b.C22748s.general_ignore);
        }
        materialButton2.setText(str);
    }

    /* renamed from: W0 */
    public final AppMessageViewModel mo67249W0() {
        return (AppMessageViewModel) this.f58365f.getValue();
    }

    /* renamed from: X0 */
    public final void mo67250X0() {
        mo67249W0().sendIntent(C22822a.C22833c.C22835b.f58398a);
    }

    /* renamed from: Y0 */
    public final void mo67251Y0(C22822a.C22823a aVar) {
        if (aVar instanceof C22822a.C22823a.C22824a) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((C22822a.C22823a.C22824a) aVar).mo67276d())));
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C22822a.C22823a.C22826c.f58392a)) {
            C19232h activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        C19736g.m91827a(this).mo58156s0();
    }

    /* renamed from: b1 */
    public final void mo67252b1(C22822a.C22828b bVar) {
        boolean z;
        if (bVar instanceof C22822a.C22828b.C22830b) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) bVar, (Object) C22822a.C22828b.C22831c.f58395b);
        }
        if (!z && (bVar instanceof C22822a.C22828b.C22832d)) {
            mo67248V0(((C22822a.C22828b.C22832d) bVar).mo67283h());
        }
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new AppMessageFragment$onViewCreated$1(this));
        ((C22773a) getBinding()).f58322d.setOnClickListener(new C22811a(this));
        ((C22773a) getBinding()).f58324f.setOnClickListener(new C22812b(this));
        AppMessageViewModel W0 = mo67249W0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new AppMessageFragment$onViewCreated$$inlined$processState$1(this, W0, (C11045c) null, this), 3, (Object) null);
        AppMessageViewModel W02 = mo67249W0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new AppMessageFragment$onViewCreated$$inlined$processEvent$1(this, W02, (C11045c) null, this), 3, (Object) null);
        mo67249W0().mo67265l0().mo67244a();
    }
}
