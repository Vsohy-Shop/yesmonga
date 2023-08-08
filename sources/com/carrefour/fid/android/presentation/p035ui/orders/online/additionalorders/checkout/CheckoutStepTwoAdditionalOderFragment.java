package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.core.p057io.BasketAdditionalOrderSlotError;
import com.carrefour.fid.android.core.p057io.BasketOrderIdNotFoundedError;
import com.carrefour.fid.android.core.p057io.BasketThrowable;
import com.carrefour.fid.android.core.p057io.BasketUpdateThrowable;
import com.carrefour.fid.android.core.p057io.CheckoutAssociateThrowable;
import com.carrefour.fid.android.core.p057io.CheckoutDefaultThrowable;
import com.carrefour.fid.android.core.p057io.CheckoutDeliveryThrowable;
import com.carrefour.fid.android.core.p057io.CheckoutMissingDataThrowable;
import com.carrefour.fid.android.core.p057io.RequireAttachedLoyaltyCardThrowable;
import com.carrefour.fid.android.core.type.LoyaltyAmountType;
import com.carrefour.fid.android.core.type.LoyaltyBalanceType;
import com.carrefour.fid.android.databinding.C36780o1;
import com.carrefour.fid.android.databinding.C36820s1;
import com.carrefour.fid.android.design.components.extension.ButtonKt;
import com.carrefour.fid.android.design.components.utils.C37139f;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.design.components.widgets.StepBarView;
import com.carrefour.fid.android.domain.exceptions.BasketClosedStoreThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketSlotOutdatedThrowable;
import com.carrefour.fid.android.domain.models.PaymentSettingsModel;
import com.carrefour.fid.android.loyalty.core.p061io.CheckoutBalanceThrowable;
import com.carrefour.fid.android.loyalty.core.p061io.CheckoutCardFidThrowable;
import com.carrefour.fid.android.loyalty.presentation.models.LoyaltyModel;
import com.carrefour.fid.android.presentation.models.PaymentConfirmationModel;
import com.carrefour.fid.android.presentation.models.extension.C38473i;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.BasketAdditionalOrderFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.mvi.C26944g;
import com.carrefour.fid.android.shared.base.ObserverWhileStartedImpl;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.C28746b0;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.carrefour.fid.android.shared.extension.ViewKt;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.p046io.ResponseThrowable;
import com.carrefour.fid.android.shared.util.C28935i;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.C10164b;
import java.io.IOException;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p009io.github.aakira.napier.C10848c;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bh\u0010iJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0002J\u0012\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u001aH\u0002J\u0012\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0005H\u0002J\b\u0010)\u001a\u00020\u0005H\u0002J\b\u0010*\u001a\u00020\u0005H\u0002J\b\u0010+\u001a\u00020\u0005H\u0002J\b\u0010,\u001a\u00020\u0005H\u0002J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0014H\u0002J\b\u0010/\u001a\u00020\u0005H\u0002J\b\u00100\u001a\u00020\u0005H\u0002J\u0010\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0014H\u0002J\u0010\u00103\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0014H\u0002J\u0010\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u001aH\u0002J\u0010\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0002J0\u0010=\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u0018H\u0002J\b\u0010>\u001a\u00020\u0005H\u0002J\b\u0010?\u001a\u00020\u0005H\u0002J\b\u0010@\u001a\u00020\u0005H\u0002J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0014H\u0002J\u0010\u0010E\u001a\u00020\u00052\u0006\u0010D\u001a\u00020CH\u0002J\u0010\u0010H\u001a\u00020\u00052\u0006\u0010G\u001a\u00020FH\u0002J\u0010\u0010I\u001a\u00020\u00052\u0006\u0010G\u001a\u00020FH\u0002J\u0010\u0010J\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J&\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010L\u001a\u00020K2\b\u0010N\u001a\u0004\u0018\u00010M2\b\u0010O\u001a\u0004\u0018\u00010FH\u0016J\u001a\u0010S\u001a\u00020\u00052\u0006\u0010R\u001a\u00020P2\b\u0010O\u001a\u0004\u0018\u00010FH\u0016J\b\u0010U\u001a\u00020TH\u0016J\b\u0010V\u001a\u00020\u0005H\u0016J\b\u0010W\u001a\u00020\u0005H\u0016R\u001b\u0010]\u001a\u00020X8BX\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001b\u0010c\u001a\u00020^8BX\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00140d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006j"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/s1;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/g$b;", "state", "Lkotlin/d2;", "O1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/mvi/g$a;", "event", "N1", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyModel;", "loyaltyModel", "t1", "Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType;", "loyaltyBalanceType", "s1", "", "throwable", "o1", "z1", "", "loading", "p1", "(Ljava/lang/Boolean;)V", "", "fidText", "", "loyaltyAmount", "addLoyaltyEnabled", "fidPriceVisibility", "edtVisibility", "M1", "loyaltyCardNumber", "P1", "cardFidNumber", "F1", "totalDiscountAmount", "U1", "isEnabled", "j1", "initListener", "I1", "A1", "D1", "T1", "isChecked", "K1", "i1", "h1", "isBalanceError", "V1", "q1", "message", "Q1", "Lcom/carrefour/fid/android/core/type/LoyaltyAmountType;", "loyaltyAmountType", "r1", "textErrorVisibility", "textSuccessVisibility", "edtTextImage", "edtBackground", "L1", "R1", "x1", "f1", "filled", "u1", "Lcom/carrefour/fid/android/presentation/models/PaymentConfirmationModel;", "paymentConfirmationModel", "v1", "Landroid/os/Bundle;", "bundle", "m1", "n1", "w1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "onResume", "onDestroyView", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderViewModel;", "f", "Lkotlin/z;", "l1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderViewModel;", "viewModel", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/h0;", "g", "Landroidx/navigation/m;", "k1", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/h0;", "navArgs", "Landroidx/compose/runtime/z0;", "v", "Landroidx/compose/runtime/z0;", "loyaltyCardSecretCodeCheck", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStepTwoAdditionalOderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStepTwoAdditionalOderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Lifecycle.kt\ncom/carrefour/fid/android/shared/base/LifecycleKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,676:1\n48#2,9:677\n42#3,3:686\n168#4,7:689\n183#4,6:696\n1#5:702\n75#6,2:703\n260#7:705\n*S KotlinDebug\n*F\n+ 1 CheckoutStepTwoAdditionalOderFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutStepTwoAdditionalOderFragment\n*L\n89#1:677,9\n90#1:686,3\n133#1:689,7\n134#1:696,6\n383#1:703,2\n435#1:705\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutStepTwoAdditionalOderFragment */
public final class CheckoutStepTwoAdditionalOderFragment extends C25152r0<C36820s1> {

    /* renamed from: w */
    public static final int f61873w = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f61874f;
    @C12579k

    /* renamed from: g */
    public final C19766m f61875g = new C19766m(C11342l0.m43547d(C25125h0.class), new CheckoutStepTwoAdditionalOderFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: v */
    public final C8700z0<Boolean> f61876v = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);

    public CheckoutStepTwoAdditionalOderFragment() {
        super(C250661.f61877a);
        C11677z c = C10864b0.m38748c(new C25078xebb10891(this, R.id.checkout_additional_order_graph));
        this.f61874f = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CheckoutStepTwoAdditionalOderViewModel.class), new C25079xebb10892(c, (C11510n) null), new C25080xebb10893(this, c, (C11510n) null));
    }

    /* renamed from: B1 */
    public static final void m108626B1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutStepTwoAdditionalOderFragment, "this$0");
        ((C36820s1) checkoutStepTwoAdditionalOderFragment.getBinding()).f91622p.f90575f.callOnClick();
    }

    /* renamed from: C1 */
    public static final void m108627C1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment, View view) {
        boolean z;
        Intrinsics.checkNotNullParameter(checkoutStepTwoAdditionalOderFragment, "this$0");
        LinearLayoutCompat linearLayoutCompat = ((C36820s1) checkoutStepTwoAdditionalOderFragment.getBinding()).f91622p.f90571b;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.verified3dsLayout.container3dsInstructions");
        if (linearLayoutCompat.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        AppCompatImageView appCompatImageView = ((C36820s1) checkoutStepTwoAdditionalOderFragment.getBinding()).f91622p.f90572c;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.verified3dsLayout.image3dsArrow");
        ViewKt.m118982G(appCompatImageView, z, 0, 2, (Object) null);
        if (z) {
            LinearLayoutCompat linearLayoutCompat2 = ((C36820s1) checkoutStepTwoAdditionalOderFragment.getBinding()).f91622p.f90571b;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.verified3dsLayout.container3dsInstructions");
            ViewKt.m118999l(linearLayoutCompat2, false, 0.0d, (C11289a) null, 7, (Object) null);
            return;
        }
        LinearLayoutCompat linearLayoutCompat3 = ((C36820s1) checkoutStepTwoAdditionalOderFragment.getBinding()).f91622p.f90571b;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "binding.verified3dsLayout.container3dsInstructions");
        ViewKt.m119006s(linearLayoutCompat3, false, 0.0d, (C11289a) null, 5, (Object) null);
    }

    /* renamed from: E1 */
    public static final void m108628E1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment, Button button, View view) {
        Intrinsics.checkNotNullParameter(checkoutStepTwoAdditionalOderFragment, "this$0");
        Intrinsics.checkNotNullParameter(button, "$this_apply");
        String g = StringKt.m118927g(((C36820s1) checkoutStepTwoAdditionalOderFragment.getBinding()).f91615i.f91407d.getText().toString());
        if (button.isEnabled() && (!C11622t.isBlank(g))) {
            C19232h requireActivity = checkoutStepTwoAdditionalOderFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            C13825a.m58775d(requireActivity);
            checkoutStepTwoAdditionalOderFragment.mo72938l1().mo77864K0(g);
        }
    }

    /* renamed from: G1 */
    public static final void m108629G1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutStepTwoAdditionalOderFragment, "this$0");
        checkoutStepTwoAdditionalOderFragment.mo72936j1(false);
        if (((C36820s1) checkoutStepTwoAdditionalOderFragment.getBinding()).f91615i.f91410g.isChecked()) {
            checkoutStepTwoAdditionalOderFragment.mo72929T1();
        } else {
            checkoutStepTwoAdditionalOderFragment.mo72938l1().sendIntent(new C26944g.C26964c.C26969e(new PaymentSettingsModel(false, false, false, true, checkoutStepTwoAdditionalOderFragment.mo72937k1().mo73012e())));
        }
    }

    /* renamed from: H1 */
    public static final void m108630H1(SwitchCompat switchCompat, CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment, View view) {
        Intrinsics.checkNotNullParameter(switchCompat, "$switch");
        Intrinsics.checkNotNullParameter(checkoutStepTwoAdditionalOderFragment, "this$0");
        if (switchCompat.isChecked()) {
            checkoutStepTwoAdditionalOderFragment.mo72938l1().mo77863J0();
        } else {
            checkoutStepTwoAdditionalOderFragment.mo72921K1(false);
        }
    }

    /* renamed from: J1 */
    public static final void m108631J1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutStepTwoAdditionalOderFragment, "this$0");
        checkoutStepTwoAdditionalOderFragment.mo72938l1().sendIntent(new C26944g.C26964c.C26966b(false));
    }

    /* renamed from: S1 */
    public static final void m108635S1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment) {
        Intrinsics.checkNotNullParameter(checkoutStepTwoAdditionalOderFragment, "this$0");
        BasketAdditionalOrderFragment basketAdditionalOrderFragment = (BasketAdditionalOrderFragment) FragmentKt.m148916b(checkoutStepTwoAdditionalOderFragment, BasketAdditionalOrderFragment.class);
        if (basketAdditionalOrderFragment != null) {
            basketAdditionalOrderFragment.mo72756g1(false);
        }
    }

    /* renamed from: g1 */
    public static final void m108648g1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(checkoutStepTwoAdditionalOderFragment, "this$0");
        Intrinsics.checkNotNullParameter(nestedScrollView, "<anonymous parameter 0>");
        if (i2 > i4) {
            checkoutStepTwoAdditionalOderFragment.mo72950x1();
        }
        if (i2 == 0) {
            checkoutStepTwoAdditionalOderFragment.mo72928R1();
        }
    }

    /* renamed from: y1 */
    public static final void m108649y1(CheckoutStepTwoAdditionalOderFragment checkoutStepTwoAdditionalOderFragment) {
        Intrinsics.checkNotNullParameter(checkoutStepTwoAdditionalOderFragment, "this$0");
        BasketAdditionalOrderFragment basketAdditionalOrderFragment = (BasketAdditionalOrderFragment) FragmentKt.m148916b(checkoutStepTwoAdditionalOderFragment, BasketAdditionalOrderFragment.class);
        if (basketAdditionalOrderFragment != null) {
            basketAdditionalOrderFragment.mo72756g1(true);
        }
    }

    /* renamed from: A1 */
    public final void mo72917A1() {
        ((C36820s1) getBinding()).f91622p.f90572c.setOnClickListener(new C25114c0(this));
        ((C36820s1) getBinding()).f91622p.f90575f.setOnClickListener(new C25116d0(this));
    }

    /* renamed from: D1 */
    public final void mo72918D1() {
        Button button = ((C36820s1) getBinding()).f91615i.f91406c;
        button.setOnClickListener(new C25112b0(this, button));
    }

    /* renamed from: F1 */
    public final void mo72919F1(String str) {
        ((C36820s1) getBinding()).f91615i.f91414k.setVisibility(0);
        TextView textView = ((C36820s1) getBinding()).f91615i.f91411h;
        textView.setVisibility(0);
        textView.setText(getString(R.string.checkout_card_number, str));
    }

    /* renamed from: I1 */
    public final void mo72920I1() {
        ((C36820s1) getBinding()).f91613g.f91252e.setOnClickListener(new C25118e0(this));
    }

    /* renamed from: K1 */
    public final void mo72921K1(boolean z) {
        if (z) {
            mo72934i1();
        } else {
            mo72933h1();
        }
    }

    /* renamed from: L1 */
    public final void mo72922L1(int i, int i2, String str, int i3, int i4) {
        C36780o1 o1Var = ((C36820s1) getBinding()).f91615i;
        String string = getString(R.string.checkout_loyalty_text_ok, str);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.check…y_text_ok, loyaltyAmount)");
        SpannableStringBuilder b = C37139f.m152214b(string, str);
        o1Var.f91407d.setBackground(C17318d.m79726i(requireContext(), i4));
        o1Var.f91412i.setVisibility(i);
        o1Var.f91416m.setVisibility(i2);
        ImageView imageView = o1Var.f91405b;
        imageView.setImageResource(i3);
        imageView.setVisibility(0);
        TextView textView = o1Var.f91415l;
        textView.setVisibility(i2);
        textView.setText(b);
    }

    /* renamed from: M1 */
    public final void mo72923M1(int i, String str, boolean z, int i2, int i3) {
        ((C36820s1) getBinding()).f91614h.f91355e.setVisibility(8);
        ((C36820s1) getBinding()).f91613g.f91254g.setVisibility(8);
        C36780o1 o1Var = ((C36820s1) getBinding()).f91615i;
        o1Var.f91419p.setVisibility(0);
        TextView textView = o1Var.f91417n;
        textView.setVisibility(i2);
        Intrinsics.checkNotNullExpressionValue(textView, "manageLoyaltyUi$lambda$7$lambda$3");
        TextViewKt.m118963n(textView, str);
        EditText editText = o1Var.f91407d;
        editText.setVisibility(i3);
        editText.setEnabled(z);
        SwitchCompat switchCompat = o1Var.f91410g;
        switchCompat.setVisibility(i3);
        switchCompat.setEnabled(z);
        Button button = o1Var.f91406c;
        button.setVisibility(i3);
        button.setEnabled(z);
        o1Var.f91418o.setVisibility(i3);
        o1Var.f91413j.setText(getString(i, StringKt.m118910S(str, (String) null, 1, (Object) null)));
    }

    /* renamed from: N1 */
    public final void mo72924N1(C26944g.C26945a aVar) {
        if (aVar instanceof C26944g.C26945a.C26948c) {
            mo72941o1(((C26944g.C26945a.C26948c) aVar).mo78285d());
        } else if (aVar instanceof C26944g.C26945a.C26951f) {
            mo72948v1(((C26944g.C26945a.C26951f) aVar).mo78297d());
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C26944g.C26945a.C26946a.f65624a)) {
            this.f61876v.setValue(Boolean.TRUE);
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C26944g.C26945a.C26950e.f65632a)) {
            this.f61876v.setValue(Boolean.FALSE);
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C26944g.C26945a.C26953h.f65638a)) {
            ((C36820s1) getBinding()).f91615i.f91410g.setChecked(true);
            mo72921K1(true);
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C26944g.C26945a.C26947b.f65626a)) {
            ((C36820s1) getBinding()).f91615i.f91410g.setChecked(false);
            mo72921K1(false);
        } else if (aVar instanceof C26944g.C26945a.C26952g) {
            C19736g.m91827a(this).mo58142g0(C25128i0.f61929a.mo73046c(((C26944g.C26945a.C26952g) aVar).mo78303d(), new OtpOrigination.AdditionalOrders(mo72937k1().mo73014f())));
        } else if (aVar instanceof C26944g.C26945a.C26949d) {
            mo72938l1().mo77862I0();
            C19736g.m91827a(this).mo58142g0(C25128i0.f61929a.mo73047d(((C26944g.C26945a.C26949d) aVar).mo78291d(), new OtpOrigination.AdditionalOrders(mo72937k1().mo73014f())));
        }
    }

    /* renamed from: O1 */
    public final void mo72925O1(C26944g.C26954b bVar) {
        if (bVar instanceof C26944g.C26954b.C26958d) {
            mo72942p1(Boolean.valueOf(((C26944g.C26954b.C26958d) bVar).isLoading()));
        } else if (bVar instanceof C26944g.C26954b.C26959e) {
            mo72946t1(((C26944g.C26954b.C26959e) bVar).mo78322h());
        } else if (bVar instanceof C26944g.C26954b.C26961g) {
            mo72945s1(((C26944g.C26954b.C26961g) bVar).mo78334h());
        } else if (bVar instanceof C26944g.C26954b.C26960f) {
            mo72944r1(((C26944g.C26954b.C26960f) bVar).mo78328h());
        } else if (bVar instanceof C26944g.C26954b.C26962h) {
            mo72947u1(((C26944g.C26954b.C26962h) bVar).mo78340h());
        } else if (bVar instanceof C26944g.C26954b.C26963i) {
            mo72949w1(((C26944g.C26954b.C26963i) bVar).isLoading());
        } else if (bVar instanceof C26944g.C26954b.C26955a) {
            mo72938l1().sendIntent(new C26944g.C26964c.C26967c(((C26944g.C26954b.C26955a) bVar).mo78310h()));
        }
    }

    /* renamed from: P1 */
    public final void mo72926P1(String str) {
        if (str != null) {
            mo72919F1(str);
        }
        ((C36820s1) getBinding()).f91614h.f91355e.setVisibility(0);
        ((C36820s1) getBinding()).f91615i.f91419p.setVisibility(8);
        ((C36820s1) getBinding()).f91613g.f91254g.setVisibility(8);
    }

    /* renamed from: Q1 */
    public final void mo72927Q1(String str) {
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118716z(requireActivity, NotificationComponent.Variant.ERROR, str, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: R1 */
    public final void mo72928R1() {
        C36820s1 s1Var = (C36820s1) getBinding();
        s1Var.f91618l.setGuidelineEnd(C28746b0.m119031b(166));
        LinearLayoutCompat linearLayoutCompat = s1Var.f91616j;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "groupAdditionalOrderValidate");
        com.carrefour.fid.android.design.components.extension.ViewKt.m152132n(linearLayoutCompat, new C25121f0(this));
    }

    /* renamed from: T1 */
    public final void mo72929T1() {
        String string = getString(R.string.checkout_confirm_order_full_loyalty_title);
        String string2 = getString(R.string.checkout_confirm_order_full_loyalty_subtitle);
        String string3 = getString(R.string.general_validate);
        String string4 = getString(R.string.general_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.check…order_full_loyalty_title)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.check…er_full_loyalty_subtitle)");
        com.carrefour.fid.android.shared.extension.FragmentKt.m118838z(this, string, string2, string4, new C25086x95a3f134(this), string3, false, new C25087x95a3f135(this), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    /* renamed from: U1 */
    public final void mo72930U1(String str) {
        C36780o1 o1Var = ((C36820s1) getBinding()).f91615i;
        EditText editText = o1Var.f91407d;
        editText.setVisibility(8);
        editText.setEnabled(false);
        SwitchCompat switchCompat = o1Var.f91410g;
        switchCompat.setVisibility(8);
        switchCompat.setEnabled(false);
        o1Var.f91406c.setVisibility(8);
        o1Var.f91414k.setVisibility(8);
        o1Var.f91418o.setVisibility(8);
        o1Var.f91411h.setVisibility(8);
        o1Var.f91417n.setVisibility(8);
        TextView textView = o1Var.f91413j;
        textView.setTextSize(0, textView.getResources().getDimension(R.dimen.ds_font_size_s));
        textView.setText(getString(R.string.checkout_your_fid_empty_card_text, str));
    }

    /* renamed from: V1 */
    public final void mo72931V1(boolean z) {
        mo72943q1(z);
        ((C36820s1) getBinding()).f91613g.f91254g.setVisibility(0);
        ((C36820s1) getBinding()).f91614h.f91355e.setVisibility(8);
        ((C36820s1) getBinding()).f91615i.f91419p.setVisibility(8);
    }

    /* renamed from: f1 */
    public final void mo72932f1() {
        BasketAdditionalOrderFragment basketAdditionalOrderFragment = (BasketAdditionalOrderFragment) FragmentKt.m148916b(this, BasketAdditionalOrderFragment.class);
        if (basketAdditionalOrderFragment != null) {
            basketAdditionalOrderFragment.mo72755f1(StepBarView.STEP.STEP_TWO);
        }
        ((C36820s1) getBinding()).f91612f.setOnScrollChangeListener(new C25123g0(this));
        initListener();
    }

    /* renamed from: h1 */
    public final void mo72933h1() {
        EditText editText = ((C36820s1) getBinding()).f91615i.f91407d;
        editText.setBackground(C17318d.m79726i(requireContext(), R.drawable.checkout_background_layout));
        editText.setVisibility(0);
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        ((C36820s1) getBinding()).f91615i.f91406c.setVisibility(0);
    }

    /* renamed from: i1 */
    public final void mo72934i1() {
        C36780o1 o1Var = ((C36820s1) getBinding()).f91615i;
        o1Var.f91407d.setVisibility(4);
        o1Var.f91406c.setVisibility(4);
        o1Var.f91412i.setVisibility(4);
        o1Var.f91415l.setVisibility(4);
        o1Var.f91416m.setVisibility(4);
        o1Var.f91405b.setVisibility(4);
    }

    public final void initListener() {
        TextView textView = ((C36820s1) getBinding()).f91610d;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.checkoutCgv");
        C11907e<C11079d2> f1 = C11909g.m47448f1(ViewKt.m118997j(textView), new CheckoutStepTwoAdditionalOderFragment$initListener$1(this, (C11045c<? super CheckoutStepTwoAdditionalOderFragment$initListener$1>) null));
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
        new ObserverWhileStartedImpl(viewLifecycleOwner, f1, new C25067x1c14641e((C11045c) null));
        ((C36820s1) getBinding()).f91609c.setOnClickListener(new C25164z(this));
        SwitchCompat switchCompat = ((C36820s1) getBinding()).f91615i.f91410g;
        Intrinsics.checkNotNullExpressionValue(switchCompat, "binding.fidelityUnsecure…heckoutStepTwoFullLoyalty");
        switchCompat.setOnClickListener(new C25110a0(switchCompat, this));
        mo72918D1();
        mo72920I1();
        mo72917A1();
    }

    /* renamed from: j1 */
    public final void mo72936j1(boolean z) {
        ((C36820s1) getBinding()).f91609c.setEnabled(z);
    }

    /* renamed from: k1 */
    public final C25125h0 mo72937k1() {
        return (C25125h0) this.f61875g.getValue();
    }

    /* renamed from: l1 */
    public final CheckoutStepTwoAdditionalOderViewModel mo72938l1() {
        return (CheckoutStepTwoAdditionalOderViewModel) this.f61874f.getValue();
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36820s1) getBinding()).f91611e;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.checkoutShimmer");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo72939m1(Bundle bundle) {
        BasketAdditionalOrderFragment basketAdditionalOrderFragment = (BasketAdditionalOrderFragment) FragmentKt.m148916b(this, BasketAdditionalOrderFragment.class);
        if (basketAdditionalOrderFragment != null) {
            basketAdditionalOrderFragment.mo72750a1(bundle);
        }
    }

    /* renamed from: n1 */
    public final void mo72940n1(Bundle bundle) {
        com.carrefour.fid.android.shared.extension.FragmentKt.m118823k(this, C25128i0.f61929a.mo73045a(mo72937k1().mo73012e(), bundle));
    }

    /* renamed from: o1 */
    public final void mo72941o1(Throwable th) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Throwable th2;
        ResponseThrowable responseThrowable;
        int i;
        boolean z5 = true;
        mo72936j1(true);
        if (th instanceof RequireAttachedLoyaltyCardThrowable) {
            mo72951z1();
        } else if (th instanceof CheckoutBalanceThrowable) {
            mo72931V1(true);
        } else if (th instanceof CheckoutCardFidThrowable) {
            mo72931V1(false);
        } else if (th instanceof CheckoutDefaultThrowable) {
            String string = getString(((CheckoutDefaultThrowable) th).mo108345b());
            Intrinsics.checkNotNullExpressionValue(string, "getString(throwable.messageResourceId)");
            mo72927Q1(string);
        } else if (th instanceof CheckoutDeliveryThrowable) {
            String string2 = getString(((CheckoutDeliveryThrowable) th).mo108347b());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(throwable.messageResourceId)");
            mo72927Q1(string2);
        } else if (th instanceof CheckoutAssociateThrowable) {
            String string3 = getString(((CheckoutAssociateThrowable) th).mo108343b());
            Intrinsics.checkNotNullExpressionValue(string3, "getString(throwable.messageResourceId)");
            mo72927Q1(string3);
        } else if (th instanceof CheckoutMissingDataThrowable) {
            String string4 = getString(((CheckoutMissingDataThrowable) th).mo108355b());
            Intrinsics.checkNotNullExpressionValue(string4, "getString(throwable.messageResourceId)");
            mo72927Q1(string4);
        } else {
            if (th instanceof BasketClosedStoreThrowable) {
                z = true;
            } else {
                z = th instanceof BasketExpiredFacilityStoreIdThrowable;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = th instanceof BasketSlotOutdatedThrowable;
            }
            if (z2) {
                String string5 = getString(R.string.basket_error_closed_store);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.basket_error_closed_store)");
                mo72927Q1(string5);
                mo72951z1();
            } else if (th instanceof BasketThrowable) {
                String string6 = getString(((BasketThrowable) th).mo108318a().mo108470q());
                Intrinsics.checkNotNullExpressionValue(string6, "getString(throwable.error.resourceId)");
                mo72927Q1(string6);
            } else {
                if (th instanceof BasketUpdateThrowable) {
                    z3 = true;
                } else {
                    z3 = th instanceof BasketAdditionalOrderSlotError;
                }
                if (z3) {
                    z4 = true;
                } else {
                    z4 = th instanceof BasketOrderIdNotFoundedError;
                }
                if (z4) {
                    Object[] objArr = new Object[1];
                    Throwable cause = th.getCause();
                    if (cause instanceof ResponseThrowable) {
                        responseThrowable = (ResponseThrowable) cause;
                    } else {
                        responseThrowable = null;
                    }
                    if (responseThrowable != null) {
                        i = responseThrowable.mo83810a();
                    } else {
                        i = 0;
                    }
                    objArr[0] = Integer.valueOf(i);
                    String string7 = getString(R.string.basket_error_banner, objArr);
                    Intrinsics.checkNotNullExpressionValue(string7, "getString(\n             …: 0\n                    )");
                    mo72927Q1(string7);
                    return;
                }
                if (!(th instanceof NetworkException)) {
                    z5 = th instanceof IOException;
                }
                if (z5) {
                    C28935i iVar = C28935i.f70940a;
                    String message = th.getMessage();
                    Intrinsics.checkNotNull(message, "null cannot be cast to non-null type kotlin.String");
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        th2 = th;
                    } else {
                        th2 = cause2;
                    }
                    C28935i.m119705e(iVar, message, th2, 0, 4, (Object) null);
                    String string8 = getString(R.string.general_error_no_network_message);
                    Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.gener…error_no_network_message)");
                    mo72927Q1(string8);
                } else if (th != null) {
                    C28935i iVar2 = C28935i.f70940a;
                    String message2 = th.getMessage();
                    if (message2 == null) {
                        message2 = "";
                    }
                    C28935i.m119705e(iVar2, message2, th, 0, 4, (Object) null);
                    String string9 = getString(R.string.checkout_confirm_payment_failed_to_validate_apim);
                    Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.check…_failed_to_validate_apim)");
                    mo72927Q1(string9);
                }
            }
        }
    }

    @C12580l
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ((C36820s1) getBinding()).f91620n.setContent(C8553b.m31049c(-1323110116, true, new CheckoutStepTwoAdditionalOderFragment$onCreateView$1(this)));
        com.carrefour.fid.android.shared.extension.FragmentKt.m118814b(this);
        return onCreateView;
    }

    public void onDestroyView() {
        com.carrefour.fid.android.shared.extension.FragmentKt.m118832t(this);
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        mo72938l1().sendIntent(C26944g.C26964c.C26965a.f65656a);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo72932f1();
        CheckoutStepTwoAdditionalOderViewModel l1 = mo72938l1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25073xaedee1bb(this, l1, (C11045c) null, this), 3, (Object) null);
        CheckoutStepTwoAdditionalOderViewModel l12 = mo72938l1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C25068xcde73184(this, l12, (C11045c) null, this), 3, (Object) null);
        mo72938l1().sendIntent(new C26944g.C26964c.C26966b(true));
    }

    /* renamed from: p1 */
    public final void mo72942p1(Boolean bool) {
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            ((C36820s1) getBinding()).f91617k.setVisibility(8);
            ((C36820s1) getBinding()).f91616j.setVisibility(8);
            showLoading();
            return;
        }
        ((C36820s1) getBinding()).f91617k.setVisibility(0);
        ((C36820s1) getBinding()).f91616j.setVisibility(0);
        hideLoading();
    }

    /* renamed from: q1 */
    public final void mo72943q1(boolean z) {
        if (z) {
            ((C36820s1) getBinding()).f91613g.f91253f.setText(getString(R.string.balance_error_txt));
            ((C36820s1) getBinding()).f91613g.f91252e.setVisibility(8);
            return;
        }
        ((C36820s1) getBinding()).f91613g.f91253f.setText(getString(R.string.loading_txt_error_title));
    }

    /* renamed from: r1 */
    public final void mo72944r1(LoyaltyAmountType loyaltyAmountType) {
        if (loyaltyAmountType instanceof LoyaltyAmountType.SuccessLoyaltyAmount) {
            mo72922L1(4, 0, ((LoyaltyAmountType.SuccessLoyaltyAmount) loyaltyAmountType).mo108534f(), loyaltyAmountType.mo108511b(), loyaltyAmountType.mo108510a());
        } else if (loyaltyAmountType instanceof LoyaltyAmountType.FailedLoyaltyAmount) {
            mo72922L1(0, 8, ((LoyaltyAmountType.FailedLoyaltyAmount) loyaltyAmountType).mo108516f(), loyaltyAmountType.mo108511b(), loyaltyAmountType.mo108510a());
        } else {
            mo72922L1(8, 8, new String(), loyaltyAmountType.mo108511b(), loyaltyAmountType.mo108510a());
        }
    }

    /* renamed from: s1 */
    public final void mo72945s1(LoyaltyBalanceType loyaltyBalanceType) {
        mo72942p1(Boolean.FALSE);
        if (loyaltyBalanceType instanceof LoyaltyBalanceType.LoyaltyBalanceDelivery) {
            mo72923M1(loyaltyBalanceType.mo108542a(), new String(), false, 8, 8);
        } else if (loyaltyBalanceType instanceof LoyaltyBalanceType.LoyaltyBalanceNotEmpty) {
            int a = loyaltyBalanceType.mo108542a();
            LoyaltyBalanceType.LoyaltyBalanceNotEmpty loyaltyBalanceNotEmpty = (LoyaltyBalanceType.LoyaltyBalanceNotEmpty) loyaltyBalanceType;
            mo72923M1(a, loyaltyBalanceNotEmpty.mo108556h(), loyaltyBalanceNotEmpty.mo108558i(), 0, 0);
        }
    }

    /* renamed from: t1 */
    public final void mo72946t1(LoyaltyModel loyaltyModel) {
        mo72942p1(Boolean.FALSE);
        if (loyaltyModel.getTotalLoyaltyAmount() == null) {
            mo72926P1(loyaltyModel.getLoyaltyCardNumber());
        } else if (C38473i.m159632a(loyaltyModel)) {
            mo72930U1(C38473i.m159633b(loyaltyModel));
        } else {
            String loyaltyCardNumber = loyaltyModel.getLoyaltyCardNumber();
            if (loyaltyCardNumber != null) {
                mo72919F1(loyaltyCardNumber);
            }
        }
    }

    /* renamed from: u1 */
    public final void mo72947u1(boolean z) {
        if (z) {
            ((C36820s1) getBinding()).f91615i.f91416m.setText(getString(R.string.checkout_loyalty_note_payline));
        }
    }

    /* renamed from: v1 */
    public final void mo72948v1(PaymentConfirmationModel paymentConfirmationModel) {
        if (paymentConfirmationModel instanceof PaymentConfirmationModel.FullFidPayment) {
            mo72939m1(((PaymentConfirmationModel.FullFidPayment) paymentConfirmationModel).mo121787d());
        } else if (paymentConfirmationModel instanceof PaymentConfirmationModel.SdpPayment) {
            mo72940n1(((PaymentConfirmationModel.SdpPayment) paymentConfirmationModel).mo121799d());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: w1 */
    public final void mo72949w1(boolean z) {
        String str;
        mo72936j1(!z);
        MaterialButton materialButton = ((C36820s1) getBinding()).f91609c;
        Intrinsics.checkNotNullExpressionValue(materialButton, "binding.buttonCheckoutStepTwoValidate");
        if (z) {
            str = new String();
        } else {
            str = getString(R.string.additional_order_checkout_step_two_validate);
            Intrinsics.checkNotNullExpressionValue(str, "{\n                getStr…o_validate)\n            }");
        }
        ButtonKt.m152103e(materialButton, z, (Drawable) null, str, (Integer) null, (Integer) null, 26, (Object) null);
    }

    /* renamed from: x1 */
    public final void mo72950x1() {
        C36820s1 s1Var = (C36820s1) getBinding();
        s1Var.f91618l.setGuidelineEnd(0);
        LinearLayoutCompat linearLayoutCompat = s1Var.f91616j;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "groupAdditionalOrderValidate");
        com.carrefour.fid.android.design.components.extension.ViewKt.m152131m(linearLayoutCompat, new C25163y(this));
    }

    /* renamed from: z1 */
    public final void mo72951z1() {
        ((C36820s1) getBinding()).f91615i.f91419p.setVisibility(8);
        ((C36820s1) getBinding()).f91614h.f91355e.setVisibility(8);
        ((C36820s1) getBinding()).f91613g.f91254g.setVisibility(8);
    }
}
