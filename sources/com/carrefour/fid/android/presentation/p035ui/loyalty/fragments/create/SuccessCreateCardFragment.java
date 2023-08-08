package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.databinding.C36842u3;
import com.carrefour.fid.android.loyalty.presentation.models.DataPrimeCmsModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.SuccessCreateCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.create.mvi.SuccessCreateCard;
import com.carrefour.fid.android.presentation.p035ui.loyalty.adapters.C24233h;
import com.carrefour.fid.android.shared.base.ObserverWhileResumedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.Collection;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
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
@C11076d0(mo22515d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/SuccessCreateCardFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/u3;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/mvi/SuccessCreateCard$UIState;", "uiState", "Y0", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/DataPrimeCmsModel;", "listPrimesSubscribe", "S0", "", "firstName", "T0", "X0", "initListener", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/SuccessCreateCardViewModel;", "f", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/create/SuccessCreateCardViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/y;", "g", "Landroidx/navigation/m;", "U0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/y;", "args", "Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/h;", "v", "V0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/adapters/h;", "primesCardAdapter", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nSuccessCreateCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuccessCreateCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/SuccessCreateCardFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n*L\n1#1,103:1\n106#2,15:104\n42#3,3:119\n168#4,7:122\n262#5,2:129\n262#5,2:131\n262#5,2:133\n83#6,2:135\n*S KotlinDebug\n*F\n+ 1 SuccessCreateCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/create/SuccessCreateCardFragment\n*L\n29#1:104,15\n30#1:119,3\n45#1:122,7\n56#1:129,2\n57#1:131,2\n60#1:133,2\n100#1:135,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.SuccessCreateCardFragment */
public final class SuccessCreateCardFragment extends C24436x<C36842u3> {

    /* renamed from: w */
    public static final int f60803w = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f60804f;
    @C12579k

    /* renamed from: g */
    public final C19766m f60805g = new C19766m(C11342l0.m43547d(C24437y.class), new SuccessCreateCardFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f60806v = C10864b0.m38748c(SuccessCreateCardFragment$primesCardAdapter$2.f60812f);

    public SuccessCreateCardFragment() {
        super(C243621.f60807a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new SuccessCreateCardFragment$special$$inlined$viewModels$default$2(new SuccessCreateCardFragment$special$$inlined$viewModels$default$1(this)));
        this.f60804f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(SuccessCreateCardViewModel.class), new SuccessCreateCardFragment$special$$inlined$viewModels$default$3(b), new SuccessCreateCardFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new SuccessCreateCardFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: S0 */
    public final void mo71227S0(List<DataPrimeCmsModel> list) {
        boolean z;
        int i;
        boolean z2;
        C36842u3 u3Var = (C36842u3) getBinding();
        TextView textView = u3Var.f91746f;
        Intrinsics.checkNotNullExpressionValue(textView, "loyaltyEmptyListPrimeFidMessage");
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = u3Var.f91743c;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "layoutListPrime");
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        TextView textView2 = u3Var.f91745e;
        Intrinsics.checkNotNullExpressionValue(textView2, "bindListPrimeFid$lambda$2$lambda$1");
        textView2.setVisibility(0);
        C22757a.m102928b(textView2);
        mo71230V0().mo70923l(list);
        u3Var.f91744d.setHasFixedSize(true);
        u3Var.f91744d.setAdapter(mo71230V0());
    }

    /* renamed from: T0 */
    public final void mo71228T0(String str) {
        int i;
        TextView textView = ((C36842u3) getBinding()).f91745e;
        if (mo71229U0().mo71494g()) {
            i = R.string.loyalty_activate_card_success;
        } else {
            i = R.string.loyalty_create_card_success;
        }
        textView.setText(getString(i, str));
        Intrinsics.checkNotNullExpressionValue(textView, "bindUserInformation$lambda$3");
        C22757a.m102928b(textView);
    }

    /* renamed from: U0 */
    public final C24437y mo71229U0() {
        return (C24437y) this.f60805g.getValue();
    }

    /* renamed from: V0 */
    public final C24233h mo71230V0() {
        return (C24233h) this.f60806v.getValue();
    }

    /* renamed from: W0 */
    public final SuccessCreateCardViewModel mo71231W0() {
        return (SuccessCreateCardViewModel) this.f60804f.getValue();
    }

    /* renamed from: X0 */
    public final void mo71232X0() {
        CreateSecretCodeFragment createSecretCodeFragment = (CreateSecretCodeFragment) FragmentKt.m148916b(this, CreateSecretCodeFragment.class);
        if (createSecretCodeFragment != null) {
            createSecretCodeFragment.mo71219Y0(true);
            createSecretCodeFragment.mo71220Z0(false);
        }
    }

    /* renamed from: Y0 */
    public final void mo71233Y0(SuccessCreateCard.UIState uIState) {
        mo71227S0(uIState.getListPrimesSubscribe());
        mo71228T0(uIState.getFirstName());
    }

    public final void initListener() {
        Button button = ((C36842u3) getBinding()).f91742b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.btStartUseApp");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(button), new SuccessCreateCardFragment$initListener$1(this, (C11045c<? super SuccessCreateCardFragment$initListener$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileResumedImpl(viewLifecycleOwner, f1, new C24363xe687bba0((C11045c) null));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71232X0();
        initListener();
        SuccessCreateCardViewModel W0 = mo71231W0();
        W0.sendTagScreenView();
        W0.sendIntent(new SuccessCreateCard.GetUserInformation(ArraysKt___ArraysKt.m39955kz(mo71229U0().mo71493f())));
        SuccessCreateCardViewModel W02 = mo71231W0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new SuccessCreateCardFragment$onViewCreated$$inlined$processState$1(this, W02, (C11045c) null, this), 3, (Object) null);
        C22757a.m102929c(false);
    }
}
