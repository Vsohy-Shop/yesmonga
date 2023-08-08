package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
import com.carrefour.fid.android.app.PinEntryEditText;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.databinding.C36782o3;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.core.p061io.OTPLoyaltyBlockedCardThrowable;
import com.carrefour.fid.android.loyalty.core.p061io.OTPLoyaltyCodeNotSecuredThrowable;
import com.carrefour.fid.android.loyalty.core.p061io.OTPLoyaltyInvalidCardOrSecretCodeThrowable;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.SecretCodeViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.SecretCode;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26190a;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
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
import kotlin.jvm.C11384m;
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
@C11076d0(mo22515d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00108\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010>\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010A¨\u0006G"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/SecretCodeFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/o3;", "Lkotlin/d2;", "h1", "i1", "r1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UiEvent;", "uiEvent", "f1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/SecretCode$UIState;", "uiState", "n1", "Y0", "initListeners", "g1", "", "loyaltyCardId", "k1", "l1", "j1", "", "exception", "e1", "", "message", "q1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onResume", "onPause", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "f", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "b1", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "p1", "(Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;)V", "otpAnalytics", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "g", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "a1", "()Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "o1", "(Lcom/carrefour/fid/android/data/managers/ClearAppManager;)V", "clearAppManager", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/m;", "v", "Landroidx/navigation/m;", "Z0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/m;", "args", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/SecretCodeViewModel;", "w", "Lkotlin/z;", "d1", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/SecretCodeViewModel;", "viewModel", "x", "c1", "()Ljava/lang/String;", "validationOtpCode", "<init>", "()V", "y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nSecretCodeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretCodeFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/SecretCodeFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,363:1\n42#2,3:364\n106#3,15:367\n168#4,7:382\n183#4,6:389\n75#5,2:395\n75#5,2:397\n75#5,2:399\n75#5,2:401\n75#5,2:408\n21#6:403\n23#6:407\n50#7:404\n55#7:406\n106#8:405\n262#9,2:410\n*S KotlinDebug\n*F\n+ 1 SecretCodeFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/SecretCodeFragment\n*L\n76#1:364,3\n78#1:367,15\n107#1:382,7\n108#1:389,6\n190#1:395,2\n208#1:397,2\n221#1:399,2\n229#1:401,2\n244#1:408,2\n233#1:403\n233#1:407\n233#1:404\n233#1:406\n233#1:405\n250#1:410,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment */
public final class SecretCodeFragment extends C24620k<C36782o3> {
    @C12580l

    /* renamed from: X */
    public static final String f61103X = C11342l0.m43547d(SecretCodeFragment.class).mo22848s();
    @C12579k

    /* renamed from: y */
    public static final C24560a f61104y = new C24560a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f61105z = 8;
    @Inject

    /* renamed from: f */
    public C24603a f61106f;
    @Inject

    /* renamed from: g */
    public ClearAppManager f61107g;
    @C12579k

    /* renamed from: v */
    public final C19766m f61108v = new C19766m(C11342l0.m43547d(C24622m.class), new SecretCodeFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: w */
    public final C11677z f61109w;
    @C12579k

    /* renamed from: x */
    public final C11677z f61110x;

    @C11363r0({"SMAP\nSecretCodeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretCodeFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/SecretCodeFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$a */
    public static final class C24560a {
        public /* synthetic */ C24560a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ SecretCodeFragment m107513c(C24560a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return aVar.mo71837b(bundle);
        }

        @C12580l
        /* renamed from: a */
        public final String mo71836a() {
            return SecretCodeFragment.f61103X;
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final SecretCodeFragment mo71837b(@C12580l Bundle bundle) {
            SecretCodeFragment secretCodeFragment = new SecretCodeFragment();
            if (bundle != null) {
                secretCodeFragment.setArguments(bundle);
            }
            return secretCodeFragment;
        }

        public C24560a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$b */
    public static final class C24561b implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f61112a;

        public C24561b(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f61112a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f61112a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f61112a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public SecretCodeFragment() {
        super(C245591.f61111a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new SecretCodeFragment$special$$inlined$viewModels$default$2(new SecretCodeFragment$special$$inlined$viewModels$default$1(this)));
        this.f61109w = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(SecretCodeViewModel.class), new SecretCodeFragment$special$$inlined$viewModels$default$3(b), new SecretCodeFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new SecretCodeFragment$special$$inlined$viewModels$default$5(this, b));
        this.f61110x = C10864b0.m38748c(new SecretCodeFragment$validationOtpCode$2(this));
    }

    @C12579k
    @C11384m
    /* renamed from: m1 */
    public static final SecretCodeFragment m107492m1(@C12580l Bundle bundle) {
        return f61104y.mo71837b(bundle);
    }

    /* renamed from: Y0 */
    public final void mo71815Y0() {
        boolean z;
        C36782o3 o3Var = (C36782o3) getBinding();
        o3Var.f91424c.setMask("*");
        o3Var.f91424c.setNumChars(4);
        if (mo71819c1().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o3Var.f91426e.setText(getString(R.string.loyalty_secret_code_create_title));
            o3Var.f91430i.setVisibility(8);
            o3Var.f91433l.setVisibility(8);
            o3Var.f91431j.setVisibility(8);
        }
    }

    /* renamed from: Z0 */
    public final C24622m mo71816Z0() {
        return (C24622m) this.f61108v.getValue();
    }

    @C12579k
    /* renamed from: a1 */
    public final ClearAppManager mo71817a1() {
        ClearAppManager clearAppManager = this.f61107g;
        if (clearAppManager != null) {
            return clearAppManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clearAppManager");
        return null;
    }

    @C12579k
    /* renamed from: b1 */
    public final C24603a mo71818b1() {
        C24603a aVar = this.f61106f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpAnalytics");
        return null;
    }

    /* renamed from: c1 */
    public final String mo71819c1() {
        return (String) this.f61110x.getValue();
    }

    /* renamed from: d1 */
    public final SecretCodeViewModel mo71820d1() {
        return (SecretCodeViewModel) this.f61109w.getValue();
    }

    /* renamed from: e1 */
    public final void mo71821e1(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof NetWorkResponseThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…error_no_network_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th2 instanceof OTPLoyaltyBlockedCardThrowable) {
            mo71827j1(mo71816Z0().mo71972g());
        } else if (th2 instanceof OTPLoyaltyInvalidCardOrSecretCodeThrowable) {
            mo71833q1(R.string.loyalty_error_code_invalid_card_or_secret_code);
        } else if (th2 instanceof OTPLoyaltyCodeNotSecuredThrowable) {
            mo71833q1(R.string.loyalty_error_code_code_secret_not_secured);
        } else {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(R.string.general_error_server_not_responding_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…r_not_responding_message)");
            FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: f1 */
    public final void mo71822f1(SecretCode.UiEvent uiEvent) {
        if (Intrinsics.areEqual((Object) uiEvent, (Object) SecretCode.UiEvent.ShowNextDestination.INSTANCE)) {
            mo71829l1();
        } else if (uiEvent instanceof SecretCode.UiEvent.ErrorUpdateSecretCode) {
            mo71821e1(((SecretCode.UiEvent.ErrorUpdateSecretCode) uiEvent).getThrowable());
        }
    }

    /* renamed from: g1 */
    public final void mo71823g1(SecretCode.UIState uIState) {
        int i;
        String str;
        C36782o3 o3Var = (C36782o3) getBinding();
        ProgressBar progressBar = o3Var.f91428g;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBarSecretCode");
        boolean z = false;
        if (uIState.isLoading()) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        Button button = o3Var.f91423b;
        button.setAllCaps(true);
        if (!uIState.isLoading() && !uIState.isErrorDigitCode()) {
            z = true;
        }
        button.setEnabled(z);
        if (uIState.isLoading()) {
            str = new String();
        } else {
            str = getString(R.string.general_validate);
        }
        button.setText(str);
    }

    /* renamed from: h1 */
    public final void mo71824h1() {
        C19736g.m91827a(this).mo58152q0();
    }

    /* renamed from: i1 */
    public final void mo71825i1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.secret_code_title);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, new SecretCodeFragment$initToolbar$1$1(bottomNavActivity), 1, (Object) null);
        }
    }

    public final void initListeners() {
        C36782o3 o3Var = (C36782o3) getBinding();
        TextView textView = o3Var.f91430i;
        Intrinsics.checkNotNullExpressionValue(textView, "txtLinkGetMyCode");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(textView), new SecretCodeFragment$initListeners$1$1(this, (C11045c<? super SecretCodeFragment$initListeners$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24562x3f2d4c50((C11045c) null));
        ImageView imageView = o3Var.f91425d;
        Intrinsics.checkNotNullExpressionValue(imageView, "imgEye");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(imageView), new SecretCodeFragment$initListeners$1$2(o3Var, (C11045c<? super SecretCodeFragment$initListeners$1$2>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C24563x3f2d4c51((C11045c) null));
        Button button = o3Var.f91423b;
        Intrinsics.checkNotNullExpressionValue(button, "btnValidateAttachCard");
        C11907e<C11079d2> f13 = C11909g.m47448f1(ViewKt.m118997j(button), new SecretCodeFragment$initListeners$1$3(this, o3Var, (C11045c<? super SecretCodeFragment$initListeners$1$3>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner3, f13, new C24564x3f2d4c52((C11045c) null));
        PinEntryEditText pinEntryEditText = o3Var.f91424c;
        Intrinsics.checkNotNullExpressionValue(pinEntryEditText, "edtSecretCode");
        C11907e<CharSequence> f14 = C11909g.m47448f1(TextViewKt.m118968s(pinEntryEditText), new SecretCodeFragment$initListeners$1$4(o3Var, this, (C11045c<? super SecretCodeFragment$initListeners$1$4>) null));
        C19499w viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner4, f14, new C24565x3f2d4c53((C11045c) null));
        PinEntryEditText pinEntryEditText2 = o3Var.f91424c;
        Intrinsics.checkNotNullExpressionValue(pinEntryEditText2, "edtSecretCode");
        C11907e f15 = C11909g.m47448f1(new SecretCodeFragment$initListeners$lambda$4$$inlined$filter$1(TextViewKt.m118955f(pinEntryEditText2, (C11300l) null, 1, (Object) null)), new SecretCodeFragment$initListeners$1$6(this, o3Var, (C11045c<? super SecretCodeFragment$initListeners$1$6>) null));
        C19499w viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner5, f15, new C24566x3f2d4c54((C11045c) null));
    }

    /* renamed from: j1 */
    public final void mo71827j1(String str) {
        C19736g.m91827a(this).mo58130W(R.id.blockedCardFragment, C17779d.m81164b(new Pair(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, str), new Pair("origination", OtpOrigination.MyAccount.f61099d)));
    }

    /* renamed from: k1 */
    public final void mo71828k1(String str) {
        C19736g.m91827a(this).mo58130W(R.id.channelsFidFragment, C17779d.m81164b(new Pair(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, str), new Pair("origination", OtpOrigination.MyAccount.f61099d)));
    }

    /* renamed from: l1 */
    public final void mo71829l1() {
        OtpOrigination h = mo71816Z0().mo71973h();
        if (Intrinsics.areEqual((Object) h, (Object) OtpOrigination.MyAccount.f61099d)) {
            C19736g.m91827a(this).mo58132X(R.id.loyalty_graph, (Bundle) null, C19765l0.m91906a(SecretCodeFragment$navigateToNextDestination$1.f61123f));
        } else if (h instanceof OtpOrigination.NonFoodCheckoutStep2) {
            NavController a = C19736g.m91827a(this);
            Bundle b = C17779d.m81164b(new Pair(C26190a.f64037a, ((OtpOrigination.NonFoodCheckoutStep2) h).mo71805d()));
            b.putBoolean(OtpOrigination.f61094c, true);
            C11079d2 d2Var = C11079d2.f28267a;
            a.mo58132X(R.id.nonFoodCheckoutStep2Fragment, b, C19765l0.m91906a(SecretCodeFragment$navigateToNextDestination$3.f61125f));
        } else if (h instanceof OtpOrigination.CheckoutStep3) {
            NavController a2 = C19736g.m91827a(this);
            Bundle d = ((OtpOrigination.CheckoutStep3) h).mo71787d();
            d.putBoolean(OtpOrigination.f61094c, true);
            C11079d2 d2Var2 = C11079d2.f28267a;
            a2.mo58132X(R.id.checkoutStep3Fragment, d, C19765l0.m91906a(SecretCodeFragment$navigateToNextDestination$5.f61127f));
        } else if (h instanceof OtpOrigination.AdditionalOrders) {
            C19736g.m91827a(this).mo58132X(R.id.checkoutStepTwoAdditionalOderFragment, ((OtpOrigination.AdditionalOrders) h).mo71775d(), C19765l0.m91906a(SecretCodeFragment$navigateToNextDestination$6.f61129f));
        }
    }

    /* renamed from: n1 */
    public final void mo71830n1(SecretCode.UIState uIState) {
        mo71823g1(uIState);
    }

    /* renamed from: o1 */
    public final void mo71831o1(@C12579k ClearAppManager clearAppManager) {
        Intrinsics.checkNotNullParameter(clearAppManager, "<set-?>");
        this.f61107g = clearAppManager;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        if (Intrinsics.areEqual((Object) mo71816Z0().mo71973h(), (Object) OtpOrigination.MyAccount.f61099d)) {
            if (mo71819c1().length() <= 0) {
                z = false;
            }
            if (z) {
                mo71818b1().mo71917a(false);
            } else {
                mo71818b1().mo71919c(false);
            }
        } else {
            mo71818b1().mo71917a(true);
        }
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
        FragmentKt.m118815c(this, new SecretCodeFragment$onViewCreated$1(this));
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71825i1();
        mo71834r1();
        mo71815Y0();
        initListeners();
        SecretCodeViewModel d1 = mo71820d1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new SecretCodeFragment$onViewCreated$$inlined$processState$1(this, d1, (C11045c) null, this), 3, (Object) null);
        SecretCodeViewModel d12 = mo71820d1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new SecretCodeFragment$onViewCreated$$inlined$processEvent$1(this, d12, (C11045c) null, this), 3, (Object) null);
        C22757a.m102929c(false);
    }

    /* renamed from: p1 */
    public final void mo71832p1(@C12579k C24603a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f61106f = aVar;
    }

    /* renamed from: q1 */
    public final void mo71833q1(int i) {
        TextView textView = ((C36782o3) getBinding()).f91429h;
        textView.setVisibility(0);
        textView.setText(getString(i));
    }

    /* renamed from: r1 */
    public final void mo71834r1() {
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C24561b(new SecretCodeFragment$subscribeToSignInEvent$1(this)));
    }
}
