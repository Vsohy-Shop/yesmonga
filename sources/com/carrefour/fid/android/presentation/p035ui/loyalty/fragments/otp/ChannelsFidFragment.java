package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p027os.C17779d;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.databinding.C36660c1;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.presentation.models.UserChannelsMediaModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ChannelsFidViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ChannelsFid;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.loyalty.ChannelsCardView;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.facebook.shimmer.ShimmerFrameLayout;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\bD\u0010EJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001dH\u0002J\u0012\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%H\u0002R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006H"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/ChannelsFidFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/c1;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "n1", "h1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UIState;", "uiState", "i1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ChannelsFid$UiEvent;", "uiEvent", "f1", "initListeners", "Z0", "", "channelId", "loyaltyCardNumber", "j1", "Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;", "channelEmail", "V0", "channelsSms", "X0", "", "isEmpty", "Y0", "m1", "isLoading", "g1", "isSuccess", "W0", "", "exception", "e1", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "f", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "c1", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "l1", "(Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;)V", "otpAnalytics", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "g", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "b1", "()Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "k1", "(Lcom/carrefour/fid/android/data/managers/ClearAppManager;)V", "clearAppManager", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/e;", "v", "Landroidx/navigation/m;", "a1", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/e;", "args", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/ChannelsFidViewModel;", "w", "Lkotlin/z;", "d1", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/ChannelsFidViewModel;", "viewModel", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nChannelsFidFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelsFidFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/ChannelsFidFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,274:1\n42#2,3:275\n106#3,15:278\n168#4,7:293\n183#4,6:300\n75#5,2:306\n75#5,2:308\n75#5,2:310\n75#5,2:312\n262#6,2:314\n262#6,2:316\n262#6,2:318\n262#6,2:320\n262#6,2:322\n262#6,2:324\n262#6,2:326\n*S KotlinDebug\n*F\n+ 1 ChannelsFidFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/ChannelsFidFragment\n*L\n56#1:275,3\n58#1:278,15\n75#1:293,7\n76#1:300,6\n145#1:306,2\n150#1:308,2\n186#1:310,2\n205#1:312,2\n210#1:314,2\n211#1:316,2\n244#1:318,2\n252#1:320,2\n258#1:322,2\n259#1:324,2\n260#1:326,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ChannelsFidFragment */
public final class ChannelsFidFragment extends C24619j<C36660c1> {
    @C12579k

    /* renamed from: x */
    public static final C24539a f61074x = new C24539a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f61075y = 8;
    @C12580l

    /* renamed from: z */
    public static final String f61076z = C11342l0.m43547d(ChannelsFidFragment.class).mo22848s();
    @Inject

    /* renamed from: f */
    public C24603a f61077f;
    @Inject

    /* renamed from: g */
    public ClearAppManager f61078g;
    @C12579k

    /* renamed from: v */
    public final C19766m f61079v = new C19766m(C11342l0.m43547d(C24611e.class), new ChannelsFidFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: w */
    public final C11677z f61080w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ChannelsFidFragment$a */
    public static final class C24539a {
        public /* synthetic */ C24539a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final String mo71753a() {
            return ChannelsFidFragment.f61076z;
        }

        public C24539a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ChannelsFidFragment$b */
    public static final class C24540b implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f61082a;

        public C24540b(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f61082a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f61082a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f61082a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public ChannelsFidFragment() {
        super(C245381.f61081a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new ChannelsFidFragment$special$$inlined$viewModels$default$2(new ChannelsFidFragment$special$$inlined$viewModels$default$1(this)));
        this.f61080w = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ChannelsFidViewModel.class), new ChannelsFidFragment$special$$inlined$viewModels$default$3(b), new ChannelsFidFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new ChannelsFidFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: V0 */
    public final void mo71732V0(UserChannelsMediaModel userChannelsMediaModel, String str) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ChannelsCardView channelsCardView = new ChannelsCardView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        channelsCardView.mo121244b(userChannelsMediaModel);
        ((C36660c1) getBinding()).f90633h.addView(channelsCardView);
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(channelsCardView), new ChannelsFidFragment$bindChannelsEmail$1(channelsCardView, this, userChannelsMediaModel, str, (C11045c<? super ChannelsFidFragment$bindChannelsEmail$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24541xa6649c47((C11045c) null));
    }

    /* renamed from: W0 */
    public final void mo71733W0(boolean z) {
        int i;
        int i2;
        C36660c1 c1Var = (C36660c1) getBinding();
        ConstraintLayout b = c1Var.f90627b.getRoot();
        Intrinsics.checkNotNullExpressionValue(b, "channelErrorLayout.root");
        int i3 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        b.setVisibility(i);
        TextView textView = c1Var.f90631f;
        Intrinsics.checkNotNullExpressionValue(textView, "channelTitle");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        GridLayout gridLayout = c1Var.f90633h;
        Intrinsics.checkNotNullExpressionValue(gridLayout, "lytChannels");
        if (!z) {
            i3 = 8;
        }
        gridLayout.setVisibility(i3);
    }

    /* renamed from: X0 */
    public final void mo71734X0(UserChannelsMediaModel userChannelsMediaModel, String str) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ChannelsCardView channelsCardView = new ChannelsCardView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        channelsCardView.mo121244b(userChannelsMediaModel);
        ((C36660c1) getBinding()).f90633h.addView(channelsCardView);
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(channelsCardView), new ChannelsFidFragment$bindChannelsSms$1(channelsCardView, this, userChannelsMediaModel, str, (C11045c<? super ChannelsFidFragment$bindChannelsSms$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24542xbef8422a((C11045c) null));
    }

    /* renamed from: Y0 */
    public final void mo71735Y0(boolean z) {
        int i;
        String str;
        C36660c1 c1Var = (C36660c1) getBinding();
        GridLayout gridLayout = c1Var.f90633h;
        Intrinsics.checkNotNullExpressionValue(gridLayout, "lytChannels");
        int i2 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        gridLayout.setVisibility(i);
        TextView textView = c1Var.f90630e;
        Intrinsics.checkNotNullExpressionValue(textView, "channelSubTitle");
        if (!(!z)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        TextView textView2 = c1Var.f90631f;
        if (z) {
            str = getString(R.string.loyalty_channels_info);
        } else {
            str = getString(R.string.loyalty_channels_title_retry);
        }
        textView2.setText(str);
    }

    /* renamed from: Z0 */
    public final void mo71736Z0() {
        mo71740d1().sendIntent(new ChannelsFid.UserAction.FetchUserChannels(mo71737a1().mo71937f()));
    }

    /* renamed from: a1 */
    public final C24611e mo71737a1() {
        return (C24611e) this.f61079v.getValue();
    }

    @C12579k
    /* renamed from: b1 */
    public final ClearAppManager mo71738b1() {
        ClearAppManager clearAppManager = this.f61078g;
        if (clearAppManager != null) {
            return clearAppManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clearAppManager");
        return null;
    }

    @C12579k
    /* renamed from: c1 */
    public final C24603a mo71739c1() {
        C24603a aVar = this.f61077f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpAnalytics");
        return null;
    }

    /* renamed from: d1 */
    public final ChannelsFidViewModel mo71740d1() {
        return (ChannelsFidViewModel) this.f61080w.getValue();
    }

    /* renamed from: e1 */
    public final void mo71741e1(Throwable th) {
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

    /* renamed from: f1 */
    public final void mo71742f1(ChannelsFid.UiEvent uiEvent) {
        if (uiEvent instanceof ChannelsFid.UiEvent.ErrorChannelsFid) {
            mo71733W0(false);
            mo71741e1(((ChannelsFid.UiEvent.ErrorChannelsFid) uiEvent).getThrowable());
        } else if (uiEvent instanceof ChannelsFid.UiEvent.ShowChannelSms) {
            ChannelsFid.UiEvent.ShowChannelSms showChannelSms = (ChannelsFid.UiEvent.ShowChannelSms) uiEvent;
            mo71734X0(showChannelSms.getChannelSms(), showChannelSms.getLoyaltyCardNumber());
        } else if (uiEvent instanceof ChannelsFid.UiEvent.ShowChannelEmail) {
            ChannelsFid.UiEvent.ShowChannelEmail showChannelEmail = (ChannelsFid.UiEvent.ShowChannelEmail) uiEvent;
            mo71732V0(showChannelEmail.getChannelEmail(), showChannelEmail.getLoyaltyCardNumber());
        }
    }

    /* renamed from: g1 */
    public final void mo71743g1(boolean z) {
        int i;
        C36660c1 c1Var = (C36660c1) getBinding();
        ShimmerFrameLayout shimmerFrameLayout = c1Var.f90629d;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "handleLoading$lambda$5$lambda$4");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        shimmerFrameLayout.setVisibility(i);
        if (z) {
            c1Var.f90627b.getRoot().setVisibility(8);
            shimmerFrameLayout.mo36996g();
        } else {
            shimmerFrameLayout.mo36997h();
        }
        ConstraintLayout constraintLayout = c1Var.f90628c;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "channelLayout");
        if (!(!z)) {
            i2 = 8;
        }
        constraintLayout.setVisibility(i2);
    }

    /* renamed from: h1 */
    public final void mo71744h1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.secret_code_title);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, ChannelsFidFragment$initToolbar$1$1.f61091f, 1, (Object) null);
        }
    }

    /* renamed from: i1 */
    public final void mo71745i1(ChannelsFid.UIState uIState) {
        mo71743g1(uIState.isLoading());
        mo71735Y0(uIState.isEmptyChannels());
        mo71733W0(true);
    }

    public final void initListeners() {
        C36660c1 c1Var = (C36660c1) getBinding();
        ImageView imageView = c1Var.f90632g;
        Intrinsics.checkNotNullExpressionValue(imageView, "imgCallServiceClient");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(imageView), new ChannelsFidFragment$initListeners$1$1(c1Var, this, (C11045c<? super ChannelsFidFragment$initListeners$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24543xc462f526((C11045c) null));
        Button button = c1Var.f90627b.f91160b;
        Intrinsics.checkNotNullExpressionValue(button, "channelErrorLayout.channelTryAgain");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(button), new ChannelsFidFragment$initListeners$1$2(this, (C11045c<? super ChannelsFidFragment$initListeners$1$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C24544xc462f527((C11045c) null));
    }

    /* renamed from: j1 */
    public final void mo71747j1(String str, String str2) {
        mo71740d1().sendIntent(new ChannelsFid.UserAction.GetOtpCode(str, str2));
        mo71750m1(str2);
    }

    /* renamed from: k1 */
    public final void mo71748k1(@C12579k ClearAppManager clearAppManager) {
        Intrinsics.checkNotNullParameter(clearAppManager, "<set-?>");
        this.f61078g = clearAppManager;
    }

    /* renamed from: l1 */
    public final void mo71749l1(@C12579k C24603a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f61077f = aVar;
    }

    /* renamed from: m1 */
    public final void mo71750m1(String str) {
        Bundle b = C17779d.m81164b(new Pair(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, str), new Pair("origination", mo71737a1().mo71938g()));
        OtpOrigination g = mo71737a1().mo71938g();
        if (Intrinsics.areEqual((Object) g, (Object) OtpOrigination.MyAccount.f61099d)) {
            C19736g.m91827a(this).mo58130W(R.id.validateOtpFragment, b);
        } else if (g instanceof OtpOrigination.NonFoodCheckoutStep2) {
            C19736g.m91827a(this).mo58130W(R.id.validateOtpFromNonFoodStep2, b);
        } else if (g instanceof OtpOrigination.CheckoutStep3) {
            C19736g.m91827a(this).mo58130W(R.id.validateOtpFromCheckoutAlStep3, b);
        } else if (g instanceof OtpOrigination.AdditionalOrders) {
            C19736g.m91827a(this).mo58130W(R.id.validateOtpFromAdditionalOrder, b);
        }
    }

    /* renamed from: n1 */
    public final void mo71751n1() {
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C24540b(new ChannelsFidFragment$subscribeToSignInEvent$1(this)));
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        mo71739c1().mo71920d(!(mo71737a1().mo71938g() instanceof OtpOrigination.MyAccount));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71751n1();
        mo71744h1();
        initListeners();
        ChannelsFidViewModel d1 = mo71740d1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new ChannelsFidFragment$onViewCreated$$inlined$processState$1(this, d1, (C11045c) null, this), 3, (Object) null);
        ChannelsFidViewModel d12 = mo71740d1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new ChannelsFidFragment$onViewCreated$$inlined$processEvent$1(this, d12, (C11045c) null, this), 3, (Object) null);
        mo71736Z0();
    }
}
