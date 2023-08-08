package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19765l0;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.CritizrSDK.C21423b;
import com.CritizrSDK.C21424c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36169b;
import com.carrefour.fid.android.databinding.C36709h0;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.C38049m;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.extension.C38463b;
import com.carrefour.fid.android.presentation.p035ui.confirmation.LuckyCartBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.viewmodels.order.online.additionalorders.checkout.CheckoutConfirmationViewModel;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.p046io.LuckyCartOptOutThrowable;
import com.carrefour.fid.android.shared.p046io.LuckyCartThrowable;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.tracking.orders.online.additionalorder.C29003g;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;

@C10164b
@C11076d0(mo22515d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0017\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001fB\u0007¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u0014\u0010\u0010\u001a\u00020\u00052\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010\"\u001a\u00020\u0005H\u0002J\b\u0010#\u001a\u00020\u0005H\u0002J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0002J\u001a\u0010+\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020\u0012H\u0002J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H\u0002J\b\u0010/\u001a\u00020\u0005H\u0002J\b\u00100\u001a\u00020\u0005H\u0002J\b\u00101\u001a\u00020\u0005H\u0002J\b\u00102\u001a\u00020\u0005H\u0002J\b\u00103\u001a\u00020\u0005H\u0002J\b\u00104\u001a\u00020\u0005H\u0002J\u001a\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u0002052\b\u00108\u001a\u0004\u0018\u000107H\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\b\u0010;\u001a\u00020\u0005H\u0016R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010I\u001a\u00020D8BX\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8BX\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001d\u0010W\u001a\u0004\u0018\u00010\u001f8BX\u0002¢\u0006\f\n\u0004\bT\u0010F\u001a\u0004\bU\u0010VR\u001d\u0010[\u001a\u0004\u0018\u00010\u00128BX\u0002¢\u0006\f\n\u0004\bX\u0010F\u001a\u0004\bY\u0010ZR\u001b\u0010_\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b\\\u0010F\u001a\u0004\b]\u0010^R\u001b\u0010b\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b`\u0010F\u001a\u0004\ba\u0010Z¨\u0006g"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutConfirmationFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/h0;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel$b;", "uiState", "Lkotlin/d2;", "w1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel$a;", "uiEvent", "u1", "t1", "initUi", "initHeader", "Lcom/carrefour/fid/android/domain/models/LuckyCartTicketDomain;", "Lcom/carrefour/fid/android/presentation/models/LuckCartTicketModel;", "luckyCartTicket", "s1", "q1", "", "email", "Landroid/text/SpannableString;", "g1", "", "h1", "", "throwable", "", "o1", "Lcom/carrefour/fid/android/domain/models/m;", "feedbackModel", "p1", "Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "orderConfirmationModel", "z1", "G1", "y1", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel$b$a;", "state", "n1", "F1", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "basketDomain", "slotDateBegin", "E1", "", "enabled", "K1", "e1", "I1", "C1", "J1", "M1", "x1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onDestroyView", "Lcom/CritizrSDK/c;", "f", "Lcom/CritizrSDK/c;", "i1", "()Lcom/CritizrSDK/c;", "B1", "(Lcom/CritizrSDK/c;)V", "critizrSDK", "Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel;", "g", "Lkotlin/z;", "m1", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/online/additionalorders/checkout/CheckoutConfirmationViewModel;", "viewModel", "Ljava/util/Timer;", "v", "Ljava/util/Timer;", "popInTimer", "Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/f;", "w", "Landroidx/navigation/m;", "f1", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/f;", "args", "x", "l1", "()Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "orderConfirmation", "y", "j1", "()Ljava/lang/String;", "errorCode", "z", "v1", "()Z", "isExpressPickup", "X", "k1", "initialOrderId", "<init>", "()V", "Y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutConfirmationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutConfirmationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,436:1\n106#2,15:437\n42#3,3:452\n168#4,7:455\n183#4,6:462\n1#5:468\n262#6,2:469\n*S KotlinDebug\n*F\n+ 1 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutConfirmationFragment\n*L\n68#1:437,15\n72#1:452,3\n90#1:455,7\n91#1:462,6\n365#1:469,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment */
public class CheckoutConfirmationFragment extends C25141m0<C36709h0> {

    /* renamed from: E0 */
    public static final long f61792E0 = 3000;
    @C12579k

    /* renamed from: Y */
    public static final C24986a f61793Y = new C24986a((DefaultConstructorMarker) null);

    /* renamed from: Z */
    public static final int f61794Z = 8;
    @C12579k

    /* renamed from: X */
    public final C11677z f61795X = C10864b0.m38748c(new CheckoutConfirmationFragment$initialOrderId$2(this));
    @Inject

    /* renamed from: f */
    public C21424c f61796f;
    @C12579k

    /* renamed from: g */
    public final C11677z f61797g;
    @C12580l

    /* renamed from: v */
    public Timer f61798v;
    @C12579k

    /* renamed from: w */
    public final C19766m f61799w = new C19766m(C11342l0.m43547d(C25119f.class), new CheckoutConfirmationFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: x */
    public final C11677z f61800x = C10864b0.m38748c(new CheckoutConfirmationFragment$orderConfirmation$2(this));
    @C12579k

    /* renamed from: y */
    public final C11677z f61801y = C10864b0.m38748c(new CheckoutConfirmationFragment$errorCode$2(this));
    @C12579k

    /* renamed from: z */
    public final C11677z f61802z = C10864b0.m38748c(new CheckoutConfirmationFragment$isExpressPickup$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment$a */
    public static final class C24986a {
        public /* synthetic */ C24986a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24986a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment$b */
    public static final class C24987b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f61804a;

        public C24987b(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            this.f61804a = checkoutConfirmationFragment;
        }

        public final void run() {
            this.f61804a.mo72789I1();
        }
    }

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutConfirmationFragment\n*L\n1#1,148:1\n380#2,4:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment$c */
    public static final class C24988c extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f61805a;

        public C24988c(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            this.f61805a = checkoutConfirmationFragment;
        }

        public void run() {
            C19232h activity = this.f61805a.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new C24987b(this.f61805a));
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment$d */
    public static final class C24989d implements C21423b {
        /* renamed from: d0 */
        public void mo63892d0() {
            C28935i.m119705e(C28935i.f70940a, "critizr onRatingError", (Throwable) null, 0, 6, (Object) null);
        }

        /* renamed from: i0 */
        public void mo63893i0(double d) {
            C28935i.m119705e(C28935i.f70940a, "critizr onRatingResult", (Throwable) null, 0, 6, (Object) null);
        }

        /* renamed from: k0 */
        public void mo63894k0() {
            C28935i.m119705e(C28935i.f70940a, "critizr onFeedbackSent", (Throwable) null, 0, 6, (Object) null);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment$e */
    public static final class C24990e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f61806a;

        /* renamed from: b */
        public final /* synthetic */ LuckyCartTicketDomain f61807b;

        public C24990e(CheckoutConfirmationFragment checkoutConfirmationFragment, LuckyCartTicketDomain luckyCartTicketDomain) {
            this.f61806a = checkoutConfirmationFragment;
            this.f61807b = luckyCartTicketDomain;
        }

        public final void run() {
            this.f61806a.mo72807q1();
            LuckyCartBottomSheetDialogFragment a = LuckyCartBottomSheetDialogFragment.f59812g.mo69597a(this.f61807b);
            FragmentManager childFragmentManager = this.f61806a.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            FragmentExtensionKt.m58763n(a, childFragmentManager);
        }
    }

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/additionalorders/checkout/CheckoutConfirmationFragment\n*L\n1#1,148:1\n178#2,7:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.CheckoutConfirmationFragment$f */
    public static final class C24991f extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f61808a;

        /* renamed from: b */
        public final /* synthetic */ LuckyCartTicketDomain f61809b;

        public C24991f(CheckoutConfirmationFragment checkoutConfirmationFragment, LuckyCartTicketDomain luckyCartTicketDomain) {
            this.f61808a = checkoutConfirmationFragment;
            this.f61809b = luckyCartTicketDomain;
        }

        public void run() {
            C19232h activity = this.f61808a.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new C24990e(this.f61808a, this.f61809b));
            }
        }
    }

    public CheckoutConfirmationFragment() {
        super(C249851.f61803a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C25003x57fbad73(new C25002x57fbad72(this)));
        this.f61797g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CheckoutConfirmationViewModel.class), new C25004x57fbad74(b), new C25005x57fbad75((C11289a) null, b), new C25006x57fbad76(this, b));
    }

    /* renamed from: A1 */
    public static final void m108464A1(CheckoutConfirmationFragment checkoutConfirmationFragment, OrderConfirmationModel orderConfirmationModel, View view) {
        String str;
        boolean z;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        boolean z2 = false;
        view.setEnabled(false);
        checkoutConfirmationFragment.mo72803m1().mo77696A();
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType(C36169b.f89278a);
        intent.putExtra("title", checkoutConfirmationFragment.getString(R.string.on_board_drive));
        String str4 = null;
        if (orderConfirmationModel != null) {
            str = orderConfirmationModel.mo116163n();
        } else {
            str = null;
        }
        if (str == null || C11622t.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (orderConfirmationModel != null) {
                str2 = orderConfirmationModel.mo116164o();
            } else {
                str2 = null;
            }
            if (str2 == null || C11622t.isBlank(str2)) {
                z2 = true;
            }
            if (!z2) {
                if (orderConfirmationModel != null) {
                    str3 = orderConfirmationModel.mo116163n();
                } else {
                    str3 = null;
                }
                intent.putExtra("beginTime", DateTime.m51195N2(str3).mo27912k());
                if (orderConfirmationModel != null) {
                    str4 = orderConfirmationModel.mo116164o();
                }
                intent.putExtra("endTime", DateTime.m51195N2(str4).mo27912k());
            }
        }
        try {
            checkoutConfirmationFragment.startActivity(intent);
        } catch (Exception e) {
            C28935i.m119705e(C28935i.f70940a, "No Calendar application available", e, 0, 4, (Object) null);
        }
    }

    /* renamed from: D1 */
    public static final void m108465D1(CheckoutConfirmationFragment checkoutConfirmationFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        view.setEnabled(false);
        FragmentExtensionKt.m58765p(checkoutConfirmationFragment, new CheckoutConfirmationFragment$setCustomerServiceVisibility$1$1(checkoutConfirmationFragment));
    }

    /* renamed from: H1 */
    public static final void m108466H1(CheckoutConfirmationFragment checkoutConfirmationFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        view.setEnabled(false);
        C19736g.m91827a(checkoutConfirmationFragment).mo58132X(R.id.orders_graph, (Bundle) null, C19765l0.m91906a(CheckoutConfirmationFragment$setVisibilityTrackOrderHistory$1$1.f61818f));
    }

    /* renamed from: L1 */
    public static final void m108467L1(CheckoutConfirmationFragment checkoutConfirmationFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        view.setEnabled(false);
        checkoutConfirmationFragment.mo72792M1();
    }

    /* renamed from: W0 */
    public static final /* synthetic */ C36709h0 m108474W0(CheckoutConfirmationFragment checkoutConfirmationFragment) {
        return (C36709h0) checkoutConfirmationFragment.getBinding();
    }

    /* renamed from: r1 */
    public static final void m108482r1(CheckoutConfirmationFragment checkoutConfirmationFragment, FragmentManager fragmentManager, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        Intrinsics.checkNotNullParameter(fragmentManager, "$this_apply");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "<anonymous parameter 1>");
        checkoutConfirmationFragment.mo72803m1().sendIntent(CheckoutConfirmationViewModel.C26752c.C26753a.f65282a);
        fragmentManager.mo56865c(LuckyCartBottomSheetDialogFragment.f59814w);
    }

    /* renamed from: B1 */
    public final void mo72784B1(@C12579k C21424c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f61796f = cVar;
    }

    /* renamed from: C1 */
    public final void mo72785C1() {
        ((C36709h0) getBinding()).f90927m.setOnClickListener(new C25115d(this));
    }

    /* renamed from: E1 */
    public final void mo72786E1(BasketDomain basketDomain, String str) {
        String str2;
        C28932h.C28933a aVar = C28932h.f70914a;
        Date J = aVar.mo84219J(str);
        if (J != null) {
            TextView textView = ((C36709h0) getBinding()).f90922h;
            String string = getString(R.string.from);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.from)");
            textView.setText(getString(R.string.available_from, aVar.mo84210A(J, string)));
            if (basketDomain != null) {
                str2 = basketDomain.mo115460C();
            } else {
                str2 = null;
            }
            if (C11622t.equals(str2, "drive", true)) {
                ((C36709h0) getBinding()).f90923i.setImageResource(R.drawable.ic_drive);
            } else {
                ((C36709h0) getBinding()).f90923i.setImageResource(R.drawable.ic_withdrawal_reception);
            }
        }
    }

    /* renamed from: F1 */
    public final void mo72787F1(CheckoutConfirmationViewModel.C26748b.C26749a aVar) {
        String str;
        TextView textView = ((C36709h0) getBinding()).f90922h;
        C28932h.C28933a aVar2 = C28932h.f70914a;
        OrderConfirmationModel q = aVar.mo77752q();
        if (q != null) {
            str = q.mo116163n();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        Date J = aVar2.mo84219J(str);
        if (J != null) {
            if (aVar.mo77754s()) {
                ((C36709h0) getBinding()).f90923i.setImageResource(R.drawable.ic_livraison);
                textView.setText(getString(R.string.checkout_order_confirmation_slot_delivery, aVar2.mo84254z(J), aVar2.mo84211B(J)));
                ((C36709h0) getBinding()).f90921g.setVisibility(8);
                return;
            }
            ((C36709h0) getBinding()).f90923i.setImageResource(R.drawable.ic_drive);
            textView.setText(getString(R.string.checkout_order_confirmation_slot_drive, aVar2.mo84254z(J), aVar2.mo84211B(J)));
            ((C36709h0) getBinding()).f90921g.setVisibility(0);
        }
    }

    /* renamed from: G1 */
    public final void mo72788G1() {
        ((C36709h0) getBinding()).f90920f.setOnClickListener(new C25111b(this));
    }

    /* renamed from: I1 */
    public final void mo72789I1() {
        C19232h activity = getActivity();
        if (activity != null) {
            String string = activity.getString(R.string.critizr_pop_in_title);
            String string2 = activity.getString(R.string.critizr_pop_in_message);
            String string3 = activity.getString(R.string.yes);
            String string4 = activity.getString(R.string.no);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.critizr_pop_in_title)");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.critizr_pop_in_message)");
            ActivityKt.m118709s(activity, string, string2, (Drawable) null, string4, new CheckoutConfirmationFragment$showFeedbackDialog$1$1(this), string3, false, new CheckoutConfirmationFragment$showFeedbackDialog$1$2(this), (String) null, (C11289a) null, (C11289a) null, 0, 3908, (Object) null);
        }
    }

    /* renamed from: J1 */
    public final void mo72790J1() {
        ((C36709h0) getBinding()).f90920f.setVisibility(8);
        ((C36709h0) getBinding()).f90918d.setVisibility(8);
        ((C36709h0) getBinding()).f90919e.setVisibility(8);
        ((C36709h0) getBinding()).f90925k.setVisibility(8);
        ((C36709h0) getBinding()).f90920f.setVisibility(8);
        ((C36709h0) getBinding()).f90921g.setVisibility(8);
        ((C36709h0) getBinding()).f90927m.setVisibility(0);
    }

    /* renamed from: K1 */
    public final void mo72791K1(boolean z) {
        int i;
        Button button = ((C36709h0) getBinding()).f90919e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.buttonCheckoutConfirmationCritizr");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        if (z) {
            ((C36709h0) getBinding()).f90919e.setOnClickListener(new C25109a(this));
        }
    }

    /* renamed from: M1 */
    public final void mo72792M1() {
        CheckoutConfirmationViewModel m1 = mo72803m1();
        m1.sendIntent(CheckoutConfirmationViewModel.C26752c.C26755c.f65289a);
        m1.mo77698O();
    }

    /* renamed from: e1 */
    public final void mo72793e1() {
        Timer timer = new Timer();
        timer.schedule(new C24988c(this), 3000);
        this.f61798v = timer;
    }

    /* renamed from: f1 */
    public final C25119f mo72794f1() {
        return (C25119f) this.f61799w.getValue();
    }

    /* renamed from: g1 */
    public final SpannableString mo72795g1(String str) {
        boolean z;
        int i;
        String j1 = mo72800j1();
        if (j1 == null || C11622t.isBlank(j1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = R.string.checkout_order_confirmation_mail_text;
        } else {
            i = R.string.checkout_order_confirmation_mail_error;
        }
        return new SpannableString(getString(i, str));
    }

    /* renamed from: h1 */
    public final CharSequence mo72796h1() {
        boolean z;
        String j1 = mo72800j1();
        if (j1 == null || C11622t.isBlank(j1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return getString(R.string.checkout_order_confirmation_well_done);
        }
        return mo72800j1();
    }

    @C12579k
    /* renamed from: i1 */
    public final C21424c mo72797i1() {
        C21424c cVar = this.f61796f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("critizrSDK");
        return null;
    }

    public final void initHeader() {
        FragmentExtensionKt.m58757h(this);
        ((C36709h0) getBinding()).f90916b.setContent(C8553b.m31049c(1965761089, true, new CheckoutConfirmationFragment$initHeader$1(this)));
    }

    public final void initUi() {
        initHeader();
        C36709h0 h0Var = (C36709h0) getBinding();
        h0Var.f90926l.setVisibility(8);
        h0Var.f90925k.setText(mo72796h1());
        mo72788G1();
    }

    /* renamed from: j1 */
    public final String mo72800j1() {
        return (String) this.f61801y.getValue();
    }

    /* renamed from: k1 */
    public final String mo72801k1() {
        return (String) this.f61795X.getValue();
    }

    /* renamed from: l1 */
    public final OrderConfirmationModel mo72802l1() {
        return (OrderConfirmationModel) this.f61800x.getValue();
    }

    /* renamed from: m1 */
    public final CheckoutConfirmationViewModel mo72803m1() {
        return (CheckoutConfirmationViewModel) this.f61797g.getValue();
    }

    /* renamed from: n1 */
    public final void mo72804n1(CheckoutConfirmationViewModel.C26748b.C26749a aVar) {
        String str;
        if (aVar.mo77755t() && aVar.mo77749n() != null) {
            ((C36709h0) getBinding()).f90921g.setVisibility(0);
            C38463b.m159620e(aVar.mo77749n(), ((C36709h0) getBinding()).f90921g);
            BasketDomain n = aVar.mo77749n();
            OrderConfirmationModel q = aVar.mo77752q();
            if (q != null) {
                str = q.mo116163n();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            mo72786E1(n, str);
        }
    }

    /* renamed from: o1 */
    public final Object mo72805o1(Throwable th) {
        boolean z;
        Throwable th2 = th;
        if (th2 instanceof RequireSignInThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_02)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            C28935i.m119705e(C28935i.f70940a, "Service is not available!", (Throwable) null, 0, 6, (Object) null);
            return C11079d2.f28267a;
        }
        if (th2 instanceof LuckyCartThrowable) {
            z = true;
        } else {
            z = th2 instanceof LuckyCartOptOutThrowable;
        }
        if (z) {
            mo72803m1().sendIntent(CheckoutConfirmationViewModel.C26752c.C26753a.f65282a);
            return C11079d2.f28267a;
        }
        NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
        String string2 = getString(R.string.general_error_parameters_server_not_responding_02);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…server_not_responding_02)");
        return FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    public void onDestroyView() {
        Timer timer = this.f61798v;
        if (timer != null) {
            timer.cancel();
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        C36709h0 h0Var = (C36709h0) getBinding();
        ConstraintLayout constraintLayout = h0Var.f90926l;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "viewCheckoutConfirmation");
        ViewKt.m152123e(constraintLayout, (Integer) null, false, (C11289a) null, 7, (Object) null);
        h0Var.f90919e.setEnabled(true);
        h0Var.f90918d.setEnabled(true);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new CheckoutConfirmationFragment$onViewCreated$1(this));
        initUi();
        CheckoutConfirmationViewModel m1 = mo72803m1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24997x984f2033(this, m1, (C11045c) null, this), 3, (Object) null);
        CheckoutConfirmationViewModel m12 = mo72803m1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C24992xb7576ffc(this, m12, (C11045c) null, this), 3, (Object) null);
        mo72803m1().sendIntent(new CheckoutConfirmationViewModel.C26752c.C26754b(mo72802l1(), mo72800j1(), mo72811v1(), mo72801k1()));
        mo72814y1();
        mo72813x1();
    }

    /* renamed from: p1 */
    public final void mo72806p1(C38049m mVar) {
        mo72797i1().mo63898g(getContext(), new C24989d(), mVar.mo117922f(), mVar.mo117920e());
    }

    /* renamed from: q1 */
    public final void mo72807q1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.mo56861b(LuckyCartBottomSheetDialogFragment.f59814w, this, new C25117e(this, childFragmentManager));
    }

    /* renamed from: s1 */
    public final void mo72808s1(LuckyCartTicketDomain luckyCartTicketDomain) {
        Timer timer = new Timer();
        timer.schedule(new C24991f(this, luckyCartTicketDomain), 3000);
        this.f61798v = timer;
    }

    /* renamed from: t1 */
    public final void mo72809t1() {
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.carrefour.fid.android.navigation.BottomNavActivity");
        ((BottomNavActivity) requireActivity).mo121120W1();
    }

    /* renamed from: u1 */
    public final void mo72810u1(CheckoutConfirmationViewModel.C26742a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) CheckoutConfirmationViewModel.C26742a.C26743a.f65262a)) {
            mo72790J1();
            mo72785C1();
        } else if (aVar instanceof CheckoutConfirmationViewModel.C26742a.C26746d) {
            mo72805o1(((CheckoutConfirmationViewModel.C26742a.C26746d) aVar).mo77729d());
        } else if (aVar instanceof CheckoutConfirmationViewModel.C26742a.C26745c) {
            if (((CheckoutConfirmationViewModel.C26742a.C26745c) aVar).mo77723d()) {
                mo72793e1();
            }
        } else if (aVar instanceof CheckoutConfirmationViewModel.C26742a.C26744b) {
            mo72791K1(((CheckoutConfirmationViewModel.C26742a.C26744b) aVar).mo77717d());
        } else if (aVar instanceof CheckoutConfirmationViewModel.C26742a.C26747e) {
            mo72806p1(((CheckoutConfirmationViewModel.C26742a.C26747e) aVar).mo77735d());
        }
    }

    /* renamed from: v1 */
    public final boolean mo72811v1() {
        return ((Boolean) this.f61802z.getValue()).booleanValue();
    }

    /* renamed from: w1 */
    public final void mo72812w1(CheckoutConfirmationViewModel.C26748b bVar) {
        CheckoutConfirmationViewModel.C26748b.C26749a aVar;
        if (bVar instanceof CheckoutConfirmationViewModel.C26748b.C26749a) {
            aVar = (CheckoutConfirmationViewModel.C26748b.C26749a) bVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            mo72804n1(aVar);
            mo72787F1(aVar);
            mo72815z1(aVar.mo77752q());
            ((C36709h0) getBinding()).f90924j.setText(mo72795g1(aVar.mo77753r()));
            LuckyCartTicketDomain p = aVar.mo77751p();
            if (p != null) {
                mo72808s1(p);
            }
        }
    }

    /* renamed from: x1 */
    public final void mo72813x1() {
        boolean z;
        String j1 = mo72800j1();
        if (j1 == null || j1.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo72803m1().sendIntent(CheckoutConfirmationViewModel.C26752c.C26756d.f65291a);
        }
    }

    /* renamed from: y1 */
    public final void mo72814y1() {
        boolean z;
        String j1 = mo72800j1();
        if (j1 == null || j1.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo72803m1().mo77700X();
            C29003g.C29004a.m119993a(mo72803m1(), (String) null, false, 3, (Object) null);
            return;
        }
        mo72803m1().mo77701c();
    }

    /* renamed from: z1 */
    public final void mo72815z1(OrderConfirmationModel orderConfirmationModel) {
        ((C36709h0) getBinding()).f90918d.setOnClickListener(new C25113c(this, orderConfirmationModel));
    }
}
