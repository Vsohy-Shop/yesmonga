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
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.PinEntryEditText;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.data.managers.ClearAppManager;
import com.carrefour.fid.android.databinding.C36889z2;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import com.carrefour.fid.android.loyalty.core.p061io.OTPCodeThrowable;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.ValidateOtpViewModel;
import com.carrefour.fid.android.loyalty.presentation.viewmodels.otp.mvi.ValidateOtp;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics.C24603a;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.extension.TextViewKt;
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
@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b8\u00109J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/ValidateOtpFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/z2;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "d1", "i1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UiEvent;", "uiEvent", "b1", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/mvi/ValidateOtp$UIState;", "uiState", "f1", "V0", "initListeners", "", "validationOtpCode", "loyaltyCard", "e1", "c1", "", "exception", "a1", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "f", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "Y0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;", "h1", "(Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/analytics/a;)V", "otpAnalytics", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "g", "Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "X0", "()Lcom/carrefour/fid/android/data/managers/ClearAppManager;", "g1", "(Lcom/carrefour/fid/android/data/managers/ClearAppManager;)V", "clearAppManager", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/q;", "v", "Landroidx/navigation/m;", "W0", "()Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/q;", "args", "Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/ValidateOtpViewModel;", "w", "Lkotlin/z;", "Z0", "()Lcom/carrefour/fid/android/loyalty/presentation/viewmodels/otp/ValidateOtpViewModel;", "viewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nValidateOtpFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidateOtpFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/ValidateOtpFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,247:1\n42#2,3:248\n106#3,15:251\n168#4,7:266\n183#4,6:273\n75#5,2:279\n75#5,2:286\n75#5,2:288\n75#5,2:290\n75#5,2:292\n21#6:281\n23#6:285\n50#7:282\n55#7:284\n106#8:283\n262#9,2:294\n*S KotlinDebug\n*F\n+ 1 ValidateOtpFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/ValidateOtpFragment\n*L\n55#1:248,3\n57#1:251,15\n74#1:266,7\n75#1:273,6\n131#1:279,2\n149#1:286,2\n161#1:288,2\n169#1:290,2\n187#1:292,2\n139#1:281\n139#1:285\n139#1:282\n139#1:284\n139#1:283\n215#1:294,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ValidateOtpFragment */
public final class ValidateOtpFragment extends C24621l<C36889z2> {

    /* renamed from: x */
    public static final int f61131x = 8;
    @Inject

    /* renamed from: f */
    public C24603a f61132f;
    @Inject

    /* renamed from: g */
    public ClearAppManager f61133g;
    @C12579k

    /* renamed from: v */
    public final C19766m f61134v = new C19766m(C11342l0.m43547d(C24630q.class), new ValidateOtpFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: w */
    public final C11677z f61135w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.ValidateOtpFragment$a */
    public static final class C24584a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f61137a;

        public C24584a(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f61137a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f61137a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f61137a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public ValidateOtpFragment() {
        super(C245831.f61136a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new ValidateOtpFragment$special$$inlined$viewModels$default$2(new ValidateOtpFragment$special$$inlined$viewModels$default$1(this)));
        this.f61135w = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ValidateOtpViewModel.class), new ValidateOtpFragment$special$$inlined$viewModels$default$3(b), new ValidateOtpFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new ValidateOtpFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: R0 */
    public static final /* synthetic */ C36889z2 m107532R0(ValidateOtpFragment validateOtpFragment) {
        return (C36889z2) validateOtpFragment.getBinding();
    }

    /* renamed from: V0 */
    public final void mo71868V0() {
        PinEntryEditText pinEntryEditText = ((C36889z2) getBinding()).f92012c;
        pinEntryEditText.setMask("*");
        pinEntryEditText.setNumChars(6);
        Intrinsics.checkNotNullExpressionValue(pinEntryEditText, "bindUiView$lambda$2");
        C11907e<CharSequence> f1 = C11909g.m47448f1(TextViewKt.m118968s(pinEntryEditText), new ValidateOtpFragment$bindUiView$1$1(this, (C11045c<? super ValidateOtpFragment$bindUiView$1$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24585x4a93234f((C11045c) null));
    }

    /* renamed from: W0 */
    public final C24630q mo71869W0() {
        return (C24630q) this.f61134v.getValue();
    }

    @C12579k
    /* renamed from: X0 */
    public final ClearAppManager mo71870X0() {
        ClearAppManager clearAppManager = this.f61133g;
        if (clearAppManager != null) {
            return clearAppManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clearAppManager");
        return null;
    }

    @C12579k
    /* renamed from: Y0 */
    public final C24603a mo71871Y0() {
        C24603a aVar = this.f61132f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpAnalytics");
        return null;
    }

    /* renamed from: Z0 */
    public final ValidateOtpViewModel mo71872Z0() {
        return (ValidateOtpViewModel) this.f61135w.getValue();
    }

    /* renamed from: a1 */
    public final void mo71873a1(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof NetWorkResponseThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_no_network_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…error_no_network_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        } else if (th2 instanceof OTPCodeThrowable) {
            TextView textView = ((C36889z2) getBinding()).f92017h;
            textView.setVisibility(0);
            textView.setText(getString(R.string.loyalty_txt_error_code_authentification));
        } else {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(R.string.general_error_server_not_responding_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…r_not_responding_message)");
            FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: b1 */
    public final void mo71874b1(ValidateOtp.UiEvent uiEvent) {
        if (uiEvent instanceof ValidateOtp.UiEvent.NavigateToCreateSecretCode) {
            ValidateOtp.UiEvent.NavigateToCreateSecretCode navigateToCreateSecretCode = (ValidateOtp.UiEvent.NavigateToCreateSecretCode) uiEvent;
            mo71877e1(navigateToCreateSecretCode.getOtpCode(), navigateToCreateSecretCode.getLoyaltyCard());
        } else if (uiEvent instanceof ValidateOtp.UiEvent.ErrorValidateOtp) {
            mo71873a1(((ValidateOtp.UiEvent.ErrorValidateOtp) uiEvent).getThrowable());
        }
    }

    /* renamed from: c1 */
    public final void mo71875c1(ValidateOtp.UIState uIState) {
        int i;
        String str;
        C36889z2 z2Var = (C36889z2) getBinding();
        ProgressBar progressBar = z2Var.f92016g;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBarSecretCode");
        boolean z = false;
        if (uIState.isLoading()) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        Button button = z2Var.f92011b;
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

    /* renamed from: d1 */
    public final void mo71876d1() {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121107M1().mo121278k0(R.string.secret_code_title);
            ToolBarDefaultView.setup$default(bottomNavActivity.mo121107M1(), (C11300l) null, ValidateOtpFragment$initToolbar$1$1.f61148f, 1, (Object) null);
        }
    }

    /* renamed from: e1 */
    public final void mo71877e1(String str, String str2) {
        Bundle b = C17779d.m81164b(new Pair(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, str2), new Pair("validationOtpCode", str), new Pair("origination", mo71869W0().mo72006g()));
        OtpOrigination g = mo71869W0().mo72006g();
        if (Intrinsics.areEqual((Object) g, (Object) OtpOrigination.MyAccount.f61099d)) {
            C19736g.m91827a(this).mo58130W(R.id.secretCodeFragment, b);
        } else if (g instanceof OtpOrigination.NonFoodCheckoutStep2) {
            C19736g.m91827a(this).mo58130W(R.id.secretCodeFromNonFoodStep2, b);
        } else if (g instanceof OtpOrigination.CheckoutStep3) {
            C19736g.m91827a(this).mo58130W(R.id.secretCodeFromCheckoutAlStep3, b);
        } else if (g instanceof OtpOrigination.AdditionalOrders) {
            C19736g.m91827a(this).mo58130W(R.id.secretCodeFromAdditionalOrder, b);
        }
    }

    /* renamed from: f1 */
    public final void mo71878f1(ValidateOtp.UIState uIState) {
        mo71875c1(uIState);
    }

    /* renamed from: g1 */
    public final void mo71879g1(@C12579k ClearAppManager clearAppManager) {
        Intrinsics.checkNotNullParameter(clearAppManager, "<set-?>");
        this.f61133g = clearAppManager;
    }

    /* renamed from: h1 */
    public final void mo71880h1(@C12579k C24603a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f61132f = aVar;
    }

    /* renamed from: i1 */
    public final void mo71881i1() {
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C24584a(new ValidateOtpFragment$subscribeToSignInEvent$1(this)));
    }

    public final void initListeners() {
        C36889z2 z2Var = (C36889z2) getBinding();
        PinEntryEditText pinEntryEditText = z2Var.f92012c;
        Intrinsics.checkNotNullExpressionValue(pinEntryEditText, "edtSecretCode");
        C11907e f1 = C11909g.m47448f1(new ValidateOtpFragment$initListeners$lambda$4$$inlined$filter$1(TextViewKt.m118955f(pinEntryEditText, (C11300l) null, 1, (Object) null)), new ValidateOtpFragment$initListeners$1$2(this, (C11045c<? super ValidateOtpFragment$initListeners$1$2>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C24586x85aa3d88((C11045c) null));
        Button button = z2Var.f92011b;
        Intrinsics.checkNotNullExpressionValue(button, "btnValidateAttachCard");
        C11907e<C11079d2> f12 = C11909g.m47448f1(ViewKt.m118997j(button), new ValidateOtpFragment$initListeners$1$3(this, (C11045c<? super ValidateOtpFragment$initListeners$1$3>) null));
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner2, f12, new C24587x85aa3d89((C11045c) null));
        TextView textView = z2Var.f92018i;
        Intrinsics.checkNotNullExpressionValue(textView, "txtLinkGetMyCode");
        C11907e<C11079d2> f13 = C11909g.m47448f1(ViewKt.m118997j(textView), new ValidateOtpFragment$initListeners$1$4(this, (C11045c<? super ValidateOtpFragment$initListeners$1$4>) null));
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner3, f13, new C24588x85aa3d8a((C11045c) null));
        ImageView imageView = z2Var.f92013d;
        Intrinsics.checkNotNullExpressionValue(imageView, "imgEye");
        C11907e<C11079d2> f14 = C11909g.m47448f1(ViewKt.m118997j(imageView), new ValidateOtpFragment$initListeners$1$5(z2Var, (C11045c<? super ValidateOtpFragment$initListeners$1$5>) null));
        C19499w viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner4, f14, new C24589x85aa3d8b((C11045c) null));
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        mo71871Y0().mo71918b(!(mo71869W0().mo72006g() instanceof OtpOrigination.MyAccount));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h activity = getActivity();
        if (activity != null) {
            ActivityKt.m118697g(activity);
        }
        mo71876d1();
        mo71881i1();
        mo71868V0();
        initListeners();
        ValidateOtpViewModel Z0 = mo71872Z0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new ValidateOtpFragment$onViewCreated$$inlined$processState$1(this, Z0, (C11045c) null, this), 3, (Object) null);
        ValidateOtpViewModel Z02 = mo71872Z0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new ValidateOtpFragment$onViewCreated$$inlined$processEvent$1(this, Z02, (C11045c) null, this), 3, (Object) null);
    }
}
