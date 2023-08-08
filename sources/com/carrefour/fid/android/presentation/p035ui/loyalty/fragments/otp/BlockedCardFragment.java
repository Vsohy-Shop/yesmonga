package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19765l0;
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.databinding.C36640a1;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.BlockedCardViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.BlockedCard;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26190a;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/BlockedCardFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/a1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "b1", "f1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UiEvent;", "uiEvent", "Z0", "c1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/BlockedCard$UIState;", "uiState", "d1", "initListeners", "", "isLoading", "a1", "", "exception", "Y0", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "f", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "W0", "()Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "e1", "(Lcom/carrefour/fid/android/data/managers/ClearAppManager;)V", "clearAppManager", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/a;", "g", "Landroidx/navigation/m;", "V0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/a;", "args", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/BlockedCardViewModel;", "v", "Lkotlin/z;", "X0", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/BlockedCardViewModel;", "viewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nBlockedCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockedCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/BlockedCardFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,236:1\n42#2,3:237\n106#3,15:240\n168#4,7:255\n183#4,6:262\n75#5,2:268\n75#5,2:270\n262#6,2:272\n*S KotlinDebug\n*F\n+ 1 BlockedCardFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/BlockedCardFragment\n*L\n46#1:237,3\n48#1:240,15\n61#1:255,7\n62#1:262,6\n197#1:268,2\n208#1:270,2\n214#1:272,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.BlockedCardFragment */
public final class BlockedCardFragment extends C24618i<C36640a1> {

    /* renamed from: w */
    public static final int f61051w = 8;
    @Inject

    /* renamed from: f */
    public ClearAppManager f61052f;
    @C12579k

    /* renamed from: g */
    public final C19766m f61053g = new C19766m(C11342l0.m43547d(C24601a.class), new BlockedCardFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C11677z f61054v;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.BlockedCardFragment$a */
    public static final class C24522a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f61056a;

        public C24522a(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f61056a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f61056a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f61056a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public BlockedCardFragment() {
        super(C245211.f61055a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new BlockedCardFragment$special$$inlined$viewModels$default$2(new BlockedCardFragment$special$$inlined$viewModels$default$1(this)));
        this.f61054v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(BlockedCardViewModel.class), new BlockedCardFragment$special$$inlined$viewModels$default$3(b), new BlockedCardFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new BlockedCardFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: V0 */
    public final C24601a mo71696V0() {
        return (C24601a) this.f61053g.getValue();
    }

    @C12579k
    /* renamed from: W0 */
    public final ClearAppManager mo71697W0() {
        ClearAppManager clearAppManager = this.f61052f;
        if (clearAppManager != null) {
            return clearAppManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clearAppManager");
        return null;
    }

    /* renamed from: X0 */
    public final BlockedCardViewModel mo71698X0() {
        return (BlockedCardViewModel) this.f61054v.getValue();
    }

    /* renamed from: Y0 */
    public final void mo71699Y0(Throwable th) {
        String str;
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        if (th instanceof NetWorkResponseThrowable) {
            str = getString(R.string.general_error_no_network_message);
        } else {
            str = getString(R.string.general_error_server_not_responding_message);
        }
        String str2 = str;
        Intrinsics.checkNotNullExpressionValue(str2, "when (exception) {\n     …ng_message)\n            }");
        FragmentKt.m118811B(this, variant, str2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: Z0 */
    public final void mo71700Z0(BlockedCard.UiEvent uiEvent) {
        if (uiEvent instanceof BlockedCard.UiEvent.ShowDisplayChannels) {
            OtpOrigination g = mo71696V0().mo71910g();
            if (g instanceof OtpOrigination.AdditionalOrders) {
                C19736g.m91827a(this).mo58130W(R.id.channelsFidFromAdditionalOrder, getArguments());
            } else if (g instanceof OtpOrigination.CheckoutStep3) {
                C19736g.m91827a(this).mo58130W(R.id.channelsFidFromCheckoutAl, getArguments());
            } else if (Intrinsics.areEqual((Object) g, (Object) OtpOrigination.MyAccount.f61099d)) {
                C19736g.m91827a(this).mo58130W(R.id.channelsFidFragment, getArguments());
            } else if (g instanceof OtpOrigination.NonFoodCheckoutStep2) {
                C19736g.m91827a(this).mo58130W(R.id.channelsFidFragment2, getArguments());
            }
        } else if (uiEvent instanceof BlockedCard.UiEvent.ErrorDisplayChannels) {
            mo71699Y0(((BlockedCard.UiEvent.ErrorDisplayChannels) uiEvent).getThrowable());
        }
    }

    /* renamed from: a1 */
    public final void mo71701a1(boolean z) {
        int i;
        String str;
        C36640a1 a1Var = (C36640a1) getBinding();
        ProgressBar progressBar = a1Var.f90546e;
        Intrinsics.checkNotNullExpressionValue(progressBar, "blockedCardProgressBar");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        Button button = a1Var.f90545d;
        button.setEnabled(!z);
        if (z) {
            str = new String();
        } else {
            str = getString(R.string.loyalty_blocked_card_button_title);
        }
        button.setText(str);
    }

    /* renamed from: b1 */
    public final void mo71702b1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.secret_code_title);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, BlockedCardFragment$initToolbar$1$1.f61065f, 1, (Object) null);
        }
    }

    /* renamed from: c1 */
    public final void mo71703c1() {
        mo71698X0().sendTagOnRetryClick();
        OtpOrigination g = mo71696V0().mo71910g();
        if (g instanceof OtpOrigination.AdditionalOrders) {
            C19736g.m91827a(this).mo58132X(R.id.checkoutStepTwoAdditionalOderFragment, ((OtpOrigination.AdditionalOrders) g).mo71775d(), C19765l0.m91906a(BlockedCardFragment$onTryLater$1.f61066f));
        } else if (g instanceof OtpOrigination.CheckoutStep3) {
            NavController a = C19736g.m91827a(this);
            Bundle d = ((OtpOrigination.CheckoutStep3) g).mo71787d();
            d.putBoolean(OtpOrigination.f61094c, false);
            C11079d2 d2Var = C11079d2.f28267a;
            a.mo58132X(R.id.checkoutStep3Fragment, d, C19765l0.m91906a(BlockedCardFragment$onTryLater$3.f61068f));
        } else if (Intrinsics.areEqual((Object) g, (Object) OtpOrigination.MyAccount.f61099d)) {
            C19736g.m91827a(this).mo58132X(R.id.loyalty_graph, C17779d.m81163a(), C19765l0.m91906a(BlockedCardFragment$onTryLater$4.f61070f));
        } else if (g instanceof OtpOrigination.NonFoodCheckoutStep2) {
            NavController a2 = C19736g.m91827a(this);
            Bundle b = C17779d.m81164b(new Pair(C26190a.f64037a, ((OtpOrigination.NonFoodCheckoutStep2) g).mo71805d()));
            b.putBoolean(OtpOrigination.f61094c, false);
            C11079d2 d2Var2 = C11079d2.f28267a;
            a2.mo58132X(R.id.nonFoodCheckoutStep2Fragment, b, C19765l0.m91906a(BlockedCardFragment$onTryLater$6.f61072f));
        }
    }

    /* renamed from: d1 */
    public final void mo71704d1(BlockedCard.UIState uIState) {
        mo71701a1(uIState.isLoading());
    }

    /* renamed from: e1 */
    public final void mo71705e1(@C12579k ClearAppManager clearAppManager) {
        Intrinsics.checkNotNullParameter(clearAppManager, "<set-?>");
        this.f61052f = clearAppManager;
    }

    /* renamed from: f1 */
    public final void mo71706f1() {
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C24522a(new BlockedCardFragment$subscribeToSignInEvent$1(this)));
    }

    public final void initListeners() {
        C36640a1 a1Var = (C36640a1) getBinding();
        TextView textView = a1Var.f90548g;
        Intrinsics.checkNotNullExpressionValue(textView, "blockedCardTryLater");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(textView), new BlockedCardFragment$initListeners$1$1(this, (C11045c<? super BlockedCardFragment$initListeners$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24523x1e8e026f((C11045c) null));
        Button button = a1Var.f90545d;
        Intrinsics.checkNotNullExpressionValue(button, "blockedCardInitSecretCode");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(button), new BlockedCardFragment$initListeners$1$2(this, (C11045c<? super BlockedCardFragment$initListeners$1$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C24524x1e8e0270((C11045c) null));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71702b1();
        mo71706f1();
        initListeners();
        mo71698X0().sendScreenView();
        BlockedCardViewModel X0 = mo71698X0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new BlockedCardFragment$onViewCreated$$inlined$processState$1(this, X0, (C11045c) null, this), 3, (Object) null);
        BlockedCardViewModel X02 = mo71698X0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new BlockedCardFragment$onViewCreated$$inlined$processEvent$1(this, X02, (C11045c) null, this), 3, (Object) null);
    }
}
