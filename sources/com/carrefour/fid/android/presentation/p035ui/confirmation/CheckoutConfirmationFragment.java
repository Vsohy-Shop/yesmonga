package com.carrefour.fid.android.presentation.p035ui.confirmation;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import com.CritizrSDK.C21423b;
import com.CritizrSDK.C21424c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36169b;
import com.carrefour.fid.android.core.type.BasketService;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.databinding.C36700g1;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketServiceType;
import com.carrefour.fid.android.domain.models.C38049m;
import com.carrefour.fid.android.domain.models.LuckyCartTicketDomain;
import com.carrefour.fid.android.domain.models.OrderConfirmationModel;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.analytics.C38362d;
import com.carrefour.fid.android.presentation.models.extension.C38463b;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.C26196a;
import com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel;
import com.carrefour.fid.android.presentation.viewmodels.feesback.FeedbackViewModel;
import com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel;
import com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel;
import com.carrefour.fid.android.shared.base.C28502s;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.play.core.review.C32121c;
import com.google.android.play.core.tasks.C32227d;
import dagger.hilt.android.C10164b;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.joda.time.DateTime;
import org.json.JSONObject;

@C10164b
@C11076d0(mo22515d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0001B\t¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0014\u0010\u0012\u001a\u00020\u00042\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0013\u0010\u0016\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0018H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0012\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J\b\u0010(\u001a\u00020\u0004H\u0002J\b\u0010)\u001a\u00020\u0004H\u0002J\b\u0010*\u001a\u00020\u0004H\u0002J\u0012\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0002J\b\u0010.\u001a\u00020\u0004H\u0002J\u0013\u0010/\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u0012\u00100\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0002J\u0013\u00101\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\b\u00102\u001a\u00020\u0004H\u0002J\b\u00103\u001a\u00020\u0004H\u0002J\b\u00104\u001a\u00020\u0004H\u0002J\b\u00105\u001a\u00020\u0004H\u0002J\u001a\u0010:\u001a\u00020\u00042\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u000108H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J\b\u0010<\u001a\u00020\u0004H\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J\b\u0010>\u001a\u00020\u0004H\u0016J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016R\"\u0010I\u001a\u00020B8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001b\u0010_\u001a\u00020Z8BX\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0002¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020e8BX\u0002¢\u0006\f\n\u0004\bf\u0010\\\u001a\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020j8BX\u0002¢\u0006\f\n\u0004\bk\u0010\\\u001a\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001b\u0010x\u001a\u00020s8BX\u0002¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0016\u0010|\u001a\u00020y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010~\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b}\u0010zR\u0018\u0010\u0001\u001a\u0004\u0018\u00010y8BX\u0004¢\u0006\u0007\u001a\u0005\b\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u001e8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u0005\u0018\u00010\u00018DX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/confirmation/CheckoutConfirmationFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/g1;", "Lcom/CritizrSDK/b;", "Lkotlin/d2;", "U1", "Y1", "Lkotlinx/coroutines/c2;", "Z1", "Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/LuckyCartViewModel$a;", "state", "b2", "Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel$a;", "c2", "z1", "Lcom/carrefour/fid/android/domain/models/LuckyCartTicketDomain;", "Lcom/carrefour/fid/android/presentation/models/LuckCartTicketModel;", "luckyCartTicket", "T1", "R1", "r2", "Landroid/text/SpannableString;", "D1", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "F1", "E1", "", "error", "P1", "", "isEnabled", "V1", "W1", "throwable", "", "O1", "Lcom/carrefour/fid/android/domain/models/m;", "feedbackModel", "Q1", "n2", "p2", "e2", "Lcom/carrefour/fid/android/domain/models/BasketDomain;", "basketDomain", "N1", "i2", "l2", "k2", "f2", "v2", "t2", "u2", "w2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onDestroyView", "k0", "d0", "", "p0", "i0", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "B1", "()Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;", "g2", "(Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/a;)V", "checkoutConfirmationAnalyticsViewModel", "Lcom/CritizrSDK/c;", "g", "Lcom/CritizrSDK/c;", "G1", "()Lcom/CritizrSDK/c;", "h2", "(Lcom/CritizrSDK/c;)V", "critizrSDK", "Lcom/google/android/play/core/review/c;", "v", "Lcom/google/android/play/core/review/c;", "M1", "()Lcom/google/android/play/core/review/c;", "m2", "(Lcom/google/android/play/core/review/c;)V", "reviewManager", "Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationViewModel;", "w", "Lkotlin/z;", "C1", "()Lcom/carrefour/fid/android/presentation/viewmodels/confirmation/CheckoutConfirmationViewModel;", "checkoutConfirmationViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/feesback/FeedbackViewModel;", "x", "I1", "()Lcom/carrefour/fid/android/presentation/viewmodels/feesback/FeedbackViewModel;", "feedbackViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/LuckyCartViewModel;", "y", "J1", "()Lcom/carrefour/fid/android/presentation/viewmodels/luckycart/LuckyCartViewModel;", "luckyCartViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel;", "z", "L1", "()Lcom/carrefour/fid/android/presentation/viewmodels/rating/RatingViewModel;", "ratingViewModel", "Ljava/util/Timer;", "X", "Ljava/util/Timer;", "popInTimer", "Lcom/carrefour/fid/android/presentation/ui/confirmation/i;", "Y", "Landroidx/navigation/m;", "A1", "()Lcom/carrefour/fid/android/presentation/ui/confirmation/i;", "args", "", "Z", "Ljava/lang/String;", "basketTypeAnalytic", "E0", "hasBeenSentBasketTypeAnalytics", "H1", "()Ljava/lang/String;", "errorCode", "a2", "()Z", "isExpressPickup", "Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "K1", "()Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "orderConfirmationModel", "<init>", "()V", "F0", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutConfirmationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/confirmation/CheckoutConfirmationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,631:1\n106#2,15:632\n106#2,15:647\n106#2,15:662\n106#2,15:677\n42#3,3:692\n262#4,2:695\n1#5:697\n*S KotlinDebug\n*F\n+ 1 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/confirmation/CheckoutConfirmationFragment\n*L\n76#1:632,15\n78#1:647,15\n80#1:662,15\n82#1:677,15\n86#1:692,3\n329#1:695,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment */
public class CheckoutConfirmationFragment extends C23769s<C36700g1> implements C21423b {
    @C12579k

    /* renamed from: F0 */
    public static final C23699a f59770F0 = new C23699a((DefaultConstructorMarker) null);

    /* renamed from: G0 */
    public static final int f59771G0 = 8;
    @C12579k

    /* renamed from: H0 */
    public static final String f59772H0 = "CheckoutConfirmationFragment";
    @C12579k

    /* renamed from: I0 */
    public static final String f59773I0 = "order_confirmation";

    /* renamed from: J0 */
    public static final long f59774J0 = 3000;

    /* renamed from: E0 */
    public boolean f59775E0;
    @C12580l

    /* renamed from: X */
    public Timer f59776X;
    @C12579k

    /* renamed from: Y */
    public final C19766m f59777Y = new C19766m(C11342l0.m43547d(C23757i.class), new CheckoutConfirmationFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: Z */
    public String f59778Z = "";
    @Inject

    /* renamed from: f */
    public C26196a f59779f;
    @Inject

    /* renamed from: g */
    public C21424c f59780g;
    @Inject

    /* renamed from: v */
    public C32121c f59781v;
    @C12579k

    /* renamed from: w */
    public final C11677z f59782w;
    @C12579k

    /* renamed from: x */
    public final C11677z f59783x;
    @C12579k

    /* renamed from: y */
    public final C11677z f59784y;
    @C12579k

    /* renamed from: z */
    public final C11677z f59785z;

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$a */
    public static final class C23699a {
        public /* synthetic */ C23699a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C23699a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$b */
    public static final class C23700b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f59787a;

        /* renamed from: b */
        public final /* synthetic */ LuckyCartTicketDomain f59788b;

        public C23700b(CheckoutConfirmationFragment checkoutConfirmationFragment, LuckyCartTicketDomain luckyCartTicketDomain) {
            this.f59787a = checkoutConfirmationFragment;
            this.f59788b = luckyCartTicketDomain;
        }

        public final void run() {
            this.f59787a.mo69510R1();
            LuckyCartBottomSheetDialogFragment a = LuckyCartBottomSheetDialogFragment.f59812g.mo69597a(this.f59788b);
            FragmentManager childFragmentManager = this.f59787a.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            FragmentExtensionKt.m58763n(a, childFragmentManager);
        }
    }

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/confirmation/CheckoutConfirmationFragment\n*L\n1#1,148:1\n250#2,7:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$c */
    public static final class C23701c extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f59789a;

        /* renamed from: b */
        public final /* synthetic */ LuckyCartTicketDomain f59790b;

        public C23701c(CheckoutConfirmationFragment checkoutConfirmationFragment, LuckyCartTicketDomain luckyCartTicketDomain) {
            this.f59789a = checkoutConfirmationFragment;
            this.f59790b = luckyCartTicketDomain;
        }

        public void run() {
            C19232h activity = this.f59789a.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new C23700b(this.f59789a, this.f59790b));
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$d */
    public static final class C23702d implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f59791a;

        public C23702d(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f59791a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f59791a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f59791a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$e */
    public static final class C23703e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f59792a;

        public C23703e(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            this.f59792a = checkoutConfirmationFragment;
        }

        public final void run() {
            this.f59792a.mo69531t2();
        }
    }

    @C11363r0({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/confirmation/CheckoutConfirmationFragment\n*L\n1#1,148:1\n583#2,4:149\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$f */
    public static final class C23704f extends TimerTask {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f59793a;

        public C23704f(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            this.f59793a = checkoutConfirmationFragment;
        }

        public void run() {
            C19232h activity = this.f59793a.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new C23703e(this.f59793a));
            }
        }
    }

    public CheckoutConfirmationFragment() {
        super(C236981.f59786a);
        C23715x57fbad72 checkoutConfirmationFragment$special$$inlined$viewModels$default$1 = new C23715x57fbad72(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        C11677z b = C10864b0.m38747b(lazyThreadSafetyMode, new C23726x57fbad73(checkoutConfirmationFragment$special$$inlined$viewModels$default$1));
        this.f59782w = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(CheckoutConfirmationViewModel.class), new C23728x57fbad74(b), new C23729x57fbad75((C11289a) null, b), new C23730x57fbad76(this, b));
        C11677z b2 = C10864b0.m38747b(lazyThreadSafetyMode, new C23732x57fbad78(new C23731x57fbad77(this)));
        this.f59783x = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(FeedbackViewModel.class), new C23733x57fbad79(b2), new C23734x57fbad7a((C11289a) null, b2), new C23716xa77a00fe(this, b2));
        C11677z b3 = C10864b0.m38747b(lazyThreadSafetyMode, new C23718xa77a0100(new C23717xa77a00ff(this)));
        this.f59784y = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(LuckyCartViewModel.class), new C23719xa77a0101(b3), new C23720xa77a0102((C11289a) null, b3), new C23721xa77a0103(this, b3));
        C11677z b4 = C10864b0.m38747b(lazyThreadSafetyMode, new C23723xa77a0105(new C23722xa77a0104(this)));
        this.f59785z = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(RatingViewModel.class), new C23724xa77a0106(b4), new C23725xa77a0107((C11289a) null, b4), new C23727xa77a011d(this, b4));
    }

    /* renamed from: S1 */
    public static final void m105211S1(CheckoutConfirmationFragment checkoutConfirmationFragment, FragmentManager fragmentManager, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        Intrinsics.checkNotNullParameter(fragmentManager, "$this_apply");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "<anonymous parameter 1>");
        checkoutConfirmationFragment.mo69501I1().mo76627l0();
        fragmentManager.mo56865c(LuckyCartBottomSheetDialogFragment.f59814w);
    }

    /* renamed from: X1 */
    public static final void m105217X1(CheckoutConfirmationFragment checkoutConfirmationFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        view.setEnabled(false);
        checkoutConfirmationFragment.mo69534w2();
    }

    /* renamed from: Y0 */
    public static final /* synthetic */ C36700g1 m105218Y0(CheckoutConfirmationFragment checkoutConfirmationFragment) {
        return (C36700g1) checkoutConfirmationFragment.getBinding();
    }

    /* renamed from: d2 */
    public static final void m105224d2(CheckoutConfirmationFragment checkoutConfirmationFragment, C32227d dVar) {
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        Intrinsics.checkNotNullParameter(dVar, "it");
        C28935i.m119706i(C28935i.f70940a, "Review in-app rating popup is finished with success", (Throwable) null, 0, 6, (Object) null);
        checkoutConfirmationFragment.mo69531t2();
    }

    /* renamed from: j2 */
    public static final void m105231j2(CheckoutConfirmationFragment checkoutConfirmationFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        view.setEnabled(false);
        FragmentExtensionKt.m58765p(checkoutConfirmationFragment, new CheckoutConfirmationFragment$setCustomerServiceVisibility$1$1(checkoutConfirmationFragment));
    }

    /* renamed from: o2 */
    public static final void m105237o2(CheckoutConfirmationFragment checkoutConfirmationFragment, View view) {
        String str;
        boolean z;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        boolean z2 = false;
        view.setEnabled(false);
        checkoutConfirmationFragment.mo69494B1().mo76204d(checkoutConfirmationFragment.f59778Z);
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType(C36169b.f89278a);
        intent.putExtra("title", checkoutConfirmationFragment.getString(R.string.on_board_drive));
        OrderConfirmationModel K1 = checkoutConfirmationFragment.mo69503K1();
        String str4 = null;
        if (K1 != null) {
            str = K1.mo116163n();
        } else {
            str = null;
        }
        if (str == null || C11622t.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            OrderConfirmationModel K12 = checkoutConfirmationFragment.mo69503K1();
            if (K12 != null) {
                str2 = K12.mo116164o();
            } else {
                str2 = null;
            }
            if (str2 == null || C11622t.isBlank(str2)) {
                z2 = true;
            }
            if (!z2) {
                OrderConfirmationModel K13 = checkoutConfirmationFragment.mo69503K1();
                if (K13 != null) {
                    str3 = K13.mo116163n();
                } else {
                    str3 = null;
                }
                intent.putExtra("beginTime", DateTime.m51195N2(str3).mo27912k());
                OrderConfirmationModel K14 = checkoutConfirmationFragment.mo69503K1();
                if (K14 != null) {
                    str4 = K14.mo116164o();
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

    /* renamed from: q2 */
    public static final void m105240q2(CheckoutConfirmationFragment checkoutConfirmationFragment, View view) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        view.setEnabled(false);
        C19232h activity = checkoutConfirmationFragment.getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121122Y1();
        }
    }

    /* renamed from: s2 */
    public static final void m105243s2(CheckoutConfirmationFragment checkoutConfirmationFragment, View view) {
        Intrinsics.checkNotNullParameter(checkoutConfirmationFragment, "this$0");
        view.setEnabled(false);
        C19232h activity = checkoutConfirmationFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: A1 */
    public final C23757i mo69493A1() {
        return (C23757i) this.f59777Y.getValue();
    }

    @C12579k
    /* renamed from: B1 */
    public final C26196a mo69494B1() {
        C26196a aVar = this.f59779f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkoutConfirmationAnalyticsViewModel");
        return null;
    }

    /* renamed from: C1 */
    public final CheckoutConfirmationViewModel mo69495C1() {
        return (CheckoutConfirmationViewModel) this.f59782w.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: D1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo69496D1(kotlin.coroutines.C11045c<? super android.text.SpannableString> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorSubtitle$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorSubtitle$1 r0 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorSubtitle$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorSubtitle$1 r0 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorSubtitle$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            int r1 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r3 = r0.L$2
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object r4 = r0.L$1
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r4 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r4
            java.lang.Object r0 = r0.L$0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x007d
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0041:
            kotlin.C11661u0.m45747n(r7)
            java.lang.String r7 = r6.mo69500H1()
            r2 = 0
            if (r7 == 0) goto L_0x0054
            boolean r7 = kotlin.text.C11622t.isBlank(r7)
            if (r7 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r7 = r2
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 == 0) goto L_0x005b
            r7 = 2131952183(0x7f130237, float:1.9540802E38)
            goto L_0x005e
        L_0x005b:
            r7 = 2131952182(0x7f130236, float:1.95408E38)
        L_0x005e:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r5 = r6.mo69495C1()
            r0.L$0 = r4
            r0.L$1 = r6
            r0.L$2 = r4
            r0.I$0 = r7
            r0.I$1 = r2
            r0.label = r3
            java.lang.Object r0 = r5.mo76183E0(r0)
            if (r0 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r1 = r2
            r3 = r4
            r2 = r7
            r7 = r0
            r0 = r3
            r4 = r6
        L_0x007d:
            r3[r1] = r7
            java.lang.String r7 = r4.getString(r2, r0)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment.mo69496D1(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: E1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo69497E1(kotlin.coroutines.C11045c<? super java.lang.CharSequence> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorThanks$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorThanks$1 r0 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorThanks$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorThanks$1 r0 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$getConfirmationOrErrorThanks$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            int r1 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r3 = r0.L$2
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object r4 = r0.L$1
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r4 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r4
            java.lang.Object r0 = r0.L$0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0079
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0041:
            kotlin.C11661u0.m45747n(r7)
            java.lang.String r7 = r6.mo69500H1()
            r2 = 0
            if (r7 == 0) goto L_0x0054
            boolean r7 = kotlin.text.C11622t.isBlank(r7)
            if (r7 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r7 = r2
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r7 == 0) goto L_0x0080
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r4 = r6.mo69495C1()
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r7
            r5 = 2131952191(0x7f13023f, float:1.9540818E38)
            r0.I$0 = r5
            r0.I$1 = r2
            r0.label = r3
            java.lang.Object r0 = r4.mo76179A0(r0)
            if (r0 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r4 = r6
            r3 = r7
            r1 = r2
            r2 = r5
            r7 = r0
            r0 = r3
        L_0x0079:
            r3[r1] = r7
            java.lang.String r7 = r4.getString(r2, r0)
            goto L_0x0084
        L_0x0080:
            java.lang.String r7 = r6.mo69500H1()
        L_0x0084:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment.mo69497E1(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: F1 */
    public final CharSequence mo69498F1() {
        boolean z;
        String str;
        String H1 = mo69500H1();
        if (H1 == null || C11622t.isBlank(H1)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return mo69500H1();
        }
        Object[] objArr = new Object[1];
        OrderConfirmationModel K1 = mo69503K1();
        if (K1 != null) {
            str = K1.mo116155f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        return getString(R.string.checkout_order_confirmation_text, objArr);
    }

    @C12579k
    /* renamed from: G1 */
    public final C21424c mo69499G1() {
        C21424c cVar = this.f59780g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("critizrSDK");
        return null;
    }

    /* renamed from: H1 */
    public final String mo69500H1() {
        Bundle bundle;
        Bundle arguments = getArguments();
        if (arguments == null || (bundle = arguments.getBundle(f59773I0)) == null) {
            return null;
        }
        return bundle.getString(C38212b.f96798f);
    }

    /* renamed from: I1 */
    public final FeedbackViewModel mo69501I1() {
        return (FeedbackViewModel) this.f59783x.getValue();
    }

    /* renamed from: J1 */
    public final LuckyCartViewModel mo69502J1() {
        return (LuckyCartViewModel) this.f59784y.getValue();
    }

    @C12580l
    /* renamed from: K1 */
    public final OrderConfirmationModel mo69503K1() {
        Bundle bundle;
        Bundle arguments = getArguments();
        if (arguments == null || (bundle = arguments.getBundle(f59773I0)) == null) {
            return null;
        }
        return (OrderConfirmationModel) bundle.getParcelable("orderKey");
    }

    /* renamed from: L1 */
    public final RatingViewModel mo69504L1() {
        return (RatingViewModel) this.f59785z.getValue();
    }

    @C12579k
    /* renamed from: M1 */
    public final C32121c mo69505M1() {
        C32121c cVar = this.f59781v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reviewManager");
        return null;
    }

    /* renamed from: N1 */
    public final void mo69506N1(BasketDomain basketDomain) {
        mo69515Y1();
        if (mo69517a2() && basketDomain != null) {
            ((C36700g1) getBinding()).f90867h.setText(getString(R.string.checkout_order_confirmation_slot_drive_description));
            ((C36700g1) getBinding()).f90867h.setVisibility(0);
            C38463b.m159620e(basketDomain, ((C36700g1) getBinding()).f90867h);
            mo69525k2(basketDomain);
        }
    }

    /* renamed from: O1 */
    public final Object mo69507O1(Throwable th) {
        Throwable th2 = th;
        if (th2 instanceof RequireSignInThrowable) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.gener…server_not_responding_02)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
            C28935i.m119705e(C28935i.f70940a, "Service is not available!", (Throwable) null, 0, 6, (Object) null);
            return C11079d2.f28267a;
        } else if (th2 == null) {
            return C11079d2.f28267a;
        } else {
            NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
            String string2 = getString(R.string.general_error_parameters_server_not_responding_02);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gener…server_not_responding_02)");
            return FragmentKt.m118811B(this, variant2, string2, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: P1 */
    public final void mo69508P1(Throwable th) {
        String str;
        C28935i iVar = C28935i.f70940a;
        if (th != null) {
            str = th.getLocalizedMessage();
        } else {
            str = null;
        }
        C28935i.m119705e(iVar, String.valueOf(str), (Throwable) null, 0, 6, (Object) null);
        ((C36700g1) getBinding()).f90862c.setVisibility(8);
    }

    /* renamed from: Q1 */
    public final void mo69509Q1(C38049m mVar) {
        String str;
        C21424c G1 = mo69499G1();
        Context context = getContext();
        JSONObject jSONObject = null;
        if (mVar != null) {
            str = mVar.mo117922f();
        } else {
            str = null;
        }
        if (mVar != null) {
            jSONObject = mVar.mo117920e();
        }
        G1.mo63898g(context, this, str, jSONObject);
    }

    /* renamed from: R1 */
    public final void mo69510R1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.mo56861b(LuckyCartBottomSheetDialogFragment.f59814w, this, new C23752d(this, childFragmentManager));
    }

    /* renamed from: T1 */
    public final void mo69511T1(LuckyCartTicketDomain luckyCartTicketDomain) {
        Timer timer = new Timer();
        timer.schedule(new C23701c(this, luckyCartTicketDomain), 3000);
        this.f59776X = timer;
    }

    /* renamed from: U1 */
    public final void mo69512U1() {
        C19232h activity = getActivity();
        BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121120W1();
        }
    }

    /* renamed from: V1 */
    public final void mo69513V1(boolean z) {
        if (z) {
            mo69533v2();
        }
    }

    /* renamed from: W1 */
    public final void mo69514W1(boolean z) {
        int i;
        Button button = ((C36700g1) getBinding()).f90862c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.buttonCheckoutConfirmationCritizr");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        if (z) {
            ((C36700g1) getBinding()).f90862c.setOnClickListener(new C23749a(this));
        }
    }

    /* renamed from: Y1 */
    public final void mo69515Y1() {
        BasketType basketType;
        boolean z;
        BasketServiceType I;
        BasketDomain f = mo69495C1().mo76193w0().mo4610f();
        C38362d dVar = C38362d.f97145a;
        BasketService basketService = null;
        if (f != null) {
            basketType = f.mo115499w();
        } else {
            basketType = null;
        }
        if (!(f == null || (I = f.mo115466I()) == null)) {
            basketService = I.mo115633d();
        }
        if (f != null) {
            z = f.mo115470M();
        } else {
            z = false;
        }
        this.f59778Z = dVar.mo121199b(basketType, basketService, z);
        mo69520e2();
    }

    /* renamed from: Z1 */
    public final C11723c2 mo69516Z1() {
        return C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new CheckoutConfirmationFragment$initUi$1(this, (C11045c<? super CheckoutConfirmationFragment$initUi$1>) null), 3, (Object) null);
    }

    /* renamed from: a2 */
    public final boolean mo69517a2() {
        Bundle bundle;
        Bundle arguments = getArguments();
        if (arguments == null || (bundle = arguments.getBundle(f59773I0)) == null) {
            return false;
        }
        return bundle.getBoolean(C38212b.f96801i, false);
    }

    /* renamed from: b2 */
    public final void mo69518b2(LuckyCartViewModel.C26613a aVar) {
        if (aVar instanceof LuckyCartViewModel.C26613a.C26616c) {
            mo69511T1(((LuckyCartViewModel.C26613a.C26616c) aVar).mo77356h());
        } else if (aVar instanceof LuckyCartViewModel.C26613a.C26615b) {
            mo69504L1().sendIntent(new RatingViewModel.C27382b.C27384b(0, 1, (DefaultConstructorMarker) null));
        } else {
            Intrinsics.areEqual((Object) aVar, (Object) LuckyCartViewModel.C26613a.C26614a.f65014c);
        }
    }

    /* renamed from: c2 */
    public final void mo69519c2(RatingViewModel.C27377a aVar) {
        if (aVar instanceof RatingViewModel.C27377a.C27378a) {
            C32227d<Void> b = mo69505M1().mo92879b(requireActivity(), ((RatingViewModel.C27377a.C27378a) aVar).mo79673h());
            Intrinsics.checkNotNullExpressionValue(b, "reviewManager.launchRevi…vity(), state.reviewInfo)");
            b.mo93013a(new C23753e(this));
            mo69535z1();
            return;
        }
        C28935i.m119706i(C28935i.f70940a, "Nothing to render", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: d0 */
    public void mo63892d0() {
        C28935i.m119705e(C28935i.f70940a, "critizr onRatingError", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: e2 */
    public final void mo69520e2() {
        boolean z;
        C26196a B1 = mo69494B1();
        String H1 = mo69500H1();
        if (H1 == null || C11622t.isBlank(H1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            B1.mo76201a(mo69503K1(), this.f59778Z, mo69495C1().mo76191u0());
            B1.mo76209j(mo69503K1());
            if (!this.f59775E0) {
                this.f59775E0 = true;
                B1.mo76208h(this.f59778Z, false);
            }
        } else if (mo69500H1() != null) {
            B1.mo76202b(this.f59778Z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0259, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025a, code lost:
        r1 = r14;
        r14 = r0;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x025d, code lost:
        r7 = r0;
        r0 = (java.lang.String) r14;
        r14 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0262, code lost:
        r1 = ((com.carrefour.fid.android.databinding.C36700g1) r7.getBinding()).f90865f;
        r1.setVisibility(0);
        r1.setText(r14);
        r14 = ((com.carrefour.fid.android.databinding.C36700g1) r7.getBinding()).f90866g;
        r14.setVisibility(0);
        r14.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0280, code lost:
        ((com.carrefour.fid.android.databinding.C36700g1) r7.getBinding()).f90865f.setVisibility(8);
        ((com.carrefour.fid.android.databinding.C36700g1) r7.getBinding()).f90866g.setVisibility(8);
        ((com.carrefour.fid.android.databinding.C36700g1) r7.getBinding()).f90864e.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a5, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        if (((java.lang.Boolean) r14).booleanValue() == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0103, code lost:
        r14 = r7.mo69503K1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0107, code lost:
        if (r14 == null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r14.mo116169t() != true) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010f, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0111, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0112, code lost:
        if (r14 == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        r14 = r7.mo69503K1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0118, code lost:
        if (r14 == null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        if (r14.mo116168s() != true) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0120, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0122, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0123, code lost:
        if (r14 == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
        r14 = r7.mo69503K1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        if (r14 == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012b, code lost:
        r14 = r14.mo116159j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012f, code lost:
        if (r14 == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        if ((!kotlin.text.C11622t.isBlank(r14)) != true) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0138, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013a, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013b, code lost:
        if (r14 == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        r14 = r7.mo69503K1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0141, code lost:
        if (r14 == null) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0143, code lost:
        r14 = r14.mo116159j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0148, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        r14 = r14 + "\n" + r2.mo116722w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0163, code lost:
        r14 = r2.mo116722w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0169, code lost:
        r8 = new java.lang.Object[2];
        r9 = r7.mo69495C1();
        r0.L$0 = r7;
        r0.L$1 = r2;
        r0.L$2 = r8;
        r0.L$3 = r7;
        r0.L$4 = r8;
        r0.I$0 = com.carrefour.fid.android.R.string.checkout_order_confirmation_store;
        r0.I$1 = 0;
        r0.label = 2;
        r14 = r9.mo76182D0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0187, code lost:
        if (r14 != r1) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0189, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018a, code lost:
        r11 = r2;
        r2 = 0;
        r9 = r7;
        r12 = r9;
        r7 = com.carrefour.fid.android.R.string.checkout_order_confirmation_store;
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0190, code lost:
        r8[r2] = r14;
        r14 = r12.mo69495C1();
        r0.L$0 = r12;
        r0.L$1 = r11;
        r0.L$2 = r10;
        r0.L$3 = r9;
        r0.L$4 = r10;
        r0.I$0 = r7;
        r0.I$1 = 1;
        r0.label = 3;
        r14 = r14.mo76181C0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ab, code lost:
        if (r14 != r1) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ad, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ae, code lost:
        r2 = 1;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b0, code lost:
        r8[r2] = r14;
        r7 = new android.text.SpannableString(r9.getString(r7, r10));
        r8 = new android.text.style.StyleSpan(1);
        r14 = r12.mo69495C1();
        r0.L$0 = r12;
        r0.L$1 = r11;
        r0.L$2 = r7;
        r0.L$3 = r7;
        r0.L$4 = r8;
        r0.L$5 = r7;
        r0.I$0 = 0;
        r0.label = 4;
        r14 = r14.mo76182D0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d9, code lost:
        if (r14 != r1) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01db, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01dc, code lost:
        r2 = 0;
        r9 = r7;
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01df, code lost:
        r14 = (java.lang.String) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e1, code lost:
        if (r14 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e3, code lost:
        r14 = r14.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e8, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e9, code lost:
        r7.setSpan(r8, r2, r14, 33);
        r8 = new android.text.style.ForegroundColorSpan(androidx.core.content.C17318d.m79723f(r12.requireContext(), com.carrefour.fid.android.R.color.ds_primary_dark));
        r14 = r12.mo69495C1();
        r0.L$0 = r12;
        r0.L$1 = r11;
        r0.L$2 = r10;
        r0.L$3 = r8;
        r0.L$4 = r9;
        r0.L$5 = null;
        r0.I$0 = 0;
        r0.label = 5;
        r14 = r14.mo76182D0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0215, code lost:
        if (r14 != r1) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0217, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0218, code lost:
        r2 = 0;
        r7 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021d, code lost:
        r14 = (java.lang.String) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021f, code lost:
        if (r14 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0221, code lost:
        r14 = r14.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0226, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0227, code lost:
        r7.setSpan(r8, r2, r14, 33);
        r14 = r9;
        r2 = r10;
        r7 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022d, code lost:
        r3 = r7.mo69503K1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0231, code lost:
        if (r3 == null) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0237, code lost:
        if (r3.mo116169t() != true) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023a, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023b, code lost:
        if (r5 == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x023d, code lost:
        r0 = r2.mo116726z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0242, code lost:
        r2 = r7.mo69495C1();
        r0.L$0 = r7;
        r0.L$1 = r14;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.L$4 = null;
        r0.label = 6;
        r0 = r2.mo76180B0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0257, code lost:
        if (r0 != r1) goto L_0x025a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: f2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo69521f2(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment$setAddress$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$setAddress$1 r0 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment$setAddress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$setAddress$1 r0 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$setAddress$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 33
            r4 = 0
            r5 = 1
            r6 = 0
            switch(r2) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00b1;
                case 2: goto L_0x0094;
                case 3: goto L_0x0077;
                case 4: goto L_0x0058;
                case 5: goto L_0x003d;
                case 6: goto L_0x0030;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0030:
            java.lang.Object r1 = r0.L$1
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r0 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x025d
        L_0x003d:
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$4
            android.text.SpannableString r7 = (android.text.SpannableString) r7
            java.lang.Object r8 = r0.L$3
            android.text.style.ForegroundColorSpan r8 = (android.text.style.ForegroundColorSpan) r8
            java.lang.Object r9 = r0.L$2
            android.text.SpannableString r9 = (android.text.SpannableString) r9
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.models.account.Address r10 = (com.carrefour.fid.android.domain.models.account.Address) r10
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r11 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r11
            kotlin.C11661u0.m45747n(r14)
            goto L_0x021d
        L_0x0058:
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$5
            android.text.SpannableString r7 = (android.text.SpannableString) r7
            java.lang.Object r8 = r0.L$4
            android.text.style.StyleSpan r8 = (android.text.style.StyleSpan) r8
            java.lang.Object r9 = r0.L$3
            android.text.SpannableString r9 = (android.text.SpannableString) r9
            java.lang.Object r10 = r0.L$2
            android.text.SpannableString r10 = (android.text.SpannableString) r10
            java.lang.Object r11 = r0.L$1
            com.carrefour.fid.android.domain.models.account.Address r11 = (com.carrefour.fid.android.domain.models.account.Address) r11
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r12 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r12
            kotlin.C11661u0.m45747n(r14)
            goto L_0x01df
        L_0x0077:
            int r2 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$4
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.Object r9 = r0.L$3
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r9 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r9
            java.lang.Object r10 = r0.L$2
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Object r11 = r0.L$1
            com.carrefour.fid.android.domain.models.account.Address r11 = (com.carrefour.fid.android.domain.models.account.Address) r11
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r12 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r12
            kotlin.C11661u0.m45747n(r14)
            goto L_0x01b0
        L_0x0094:
            int r2 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$4
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.Object r9 = r0.L$3
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r9 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r9
            java.lang.Object r10 = r0.L$2
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Object r11 = r0.L$1
            com.carrefour.fid.android.domain.models.account.Address r11 = (com.carrefour.fid.android.domain.models.account.Address) r11
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r12 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r12
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0190
        L_0x00b1:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.models.account.Address r2 = (com.carrefour.fid.android.domain.models.account.Address) r2
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r7 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r7
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00f8
        L_0x00bd:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r14 = r13.mo69503K1()
            if (r14 == 0) goto L_0x00cc
            com.carrefour.fid.android.domain.models.account.Address r14 = r14.mo116149a()
            r2 = r14
            goto L_0x00cd
        L_0x00cc:
            r2 = r4
        L_0x00cd:
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r14 = r13.mo69503K1()
            if (r14 == 0) goto L_0x00db
            boolean r14 = r14.mo116169t()
            if (r14 != r5) goto L_0x00db
            r14 = r5
            goto L_0x00dc
        L_0x00db:
            r14 = r6
        L_0x00dc:
            if (r14 == 0) goto L_0x027f
            if (r2 == 0) goto L_0x027f
            boolean r14 = r13.mo69517a2()
            if (r14 != 0) goto L_0x0102
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r14 = r13.mo69495C1()
            r0.L$0 = r13
            r0.L$1 = r2
            r0.label = r5
            java.lang.Object r14 = r14.mo76184F0(r0)
            if (r14 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            r7 = r13
        L_0x00f8:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0103
            goto L_0x0280
        L_0x0102:
            r7 = r13
        L_0x0103:
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r14 = r7.mo69503K1()
            if (r14 == 0) goto L_0x0111
            boolean r14 = r14.mo116169t()
            if (r14 != r5) goto L_0x0111
            r14 = r5
            goto L_0x0112
        L_0x0111:
            r14 = r6
        L_0x0112:
            if (r14 == 0) goto L_0x0169
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r14 = r7.mo69503K1()
            if (r14 == 0) goto L_0x0122
            boolean r14 = r14.mo116168s()
            if (r14 != r5) goto L_0x0122
            r14 = r5
            goto L_0x0123
        L_0x0122:
            r14 = r6
        L_0x0123:
            if (r14 == 0) goto L_0x0163
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r14 = r7.mo69503K1()
            if (r14 == 0) goto L_0x013a
            java.lang.String r14 = r14.mo116159j()
            if (r14 == 0) goto L_0x013a
            boolean r14 = kotlin.text.C11622t.isBlank(r14)
            r14 = r14 ^ r5
            if (r14 != r5) goto L_0x013a
            r14 = r5
            goto L_0x013b
        L_0x013a:
            r14 = r6
        L_0x013b:
            if (r14 == 0) goto L_0x0163
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r14 = r7.mo69503K1()
            if (r14 == 0) goto L_0x0148
            java.lang.String r14 = r14.mo116159j()
            goto L_0x0149
        L_0x0148:
            r14 = r4
        L_0x0149:
            java.lang.String r3 = r2.mo116722w()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            java.lang.String r14 = "\n"
            r8.append(r14)
            r8.append(r3)
            java.lang.String r14 = r8.toString()
            goto L_0x022d
        L_0x0163:
            java.lang.String r14 = r2.mo116722w()
            goto L_0x022d
        L_0x0169:
            r14 = 2
            java.lang.Object[] r8 = new java.lang.Object[r14]
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r9 = r7.mo69495C1()
            r0.L$0 = r7
            r0.L$1 = r2
            r0.L$2 = r8
            r0.L$3 = r7
            r0.L$4 = r8
            r10 = 2131952189(0x7f13023d, float:1.9540814E38)
            r0.I$0 = r10
            r0.I$1 = r6
            r0.label = r14
            java.lang.Object r14 = r9.mo76182D0(r0)
            if (r14 != r1) goto L_0x018a
            return r1
        L_0x018a:
            r11 = r2
            r2 = r6
            r9 = r7
            r12 = r9
            r7 = r10
            r10 = r8
        L_0x0190:
            r8[r2] = r14
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r14 = r12.mo69495C1()
            r0.L$0 = r12
            r0.L$1 = r11
            r0.L$2 = r10
            r0.L$3 = r9
            r0.L$4 = r10
            r0.I$0 = r7
            r0.I$1 = r5
            r2 = 3
            r0.label = r2
            java.lang.Object r14 = r14.mo76181C0(r0)
            if (r14 != r1) goto L_0x01ae
            return r1
        L_0x01ae:
            r2 = r5
            r8 = r10
        L_0x01b0:
            r8[r2] = r14
            java.lang.String r14 = r9.getString(r7, r10)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r14)
            android.text.style.StyleSpan r8 = new android.text.style.StyleSpan
            r8.<init>(r5)
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r14 = r12.mo69495C1()
            r0.L$0 = r12
            r0.L$1 = r11
            r0.L$2 = r7
            r0.L$3 = r7
            r0.L$4 = r8
            r0.L$5 = r7
            r0.I$0 = r6
            r2 = 4
            r0.label = r2
            java.lang.Object r14 = r14.mo76182D0(r0)
            if (r14 != r1) goto L_0x01dc
            return r1
        L_0x01dc:
            r2 = r6
            r9 = r7
            r10 = r9
        L_0x01df:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x01e8
            int r14 = r14.length()
            goto L_0x01e9
        L_0x01e8:
            r14 = r6
        L_0x01e9:
            r7.setSpan(r8, r2, r14, r3)
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            android.content.Context r14 = r12.requireContext()
            r2 = 2131099842(0x7f0600c2, float:1.7812049E38)
            int r14 = androidx.core.content.C17318d.m79723f(r14, r2)
            r8.<init>(r14)
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r14 = r12.mo69495C1()
            r0.L$0 = r12
            r0.L$1 = r11
            r0.L$2 = r10
            r0.L$3 = r8
            r0.L$4 = r9
            r0.L$5 = r4
            r0.I$0 = r6
            r2 = 5
            r0.label = r2
            java.lang.Object r14 = r14.mo76182D0(r0)
            if (r14 != r1) goto L_0x0218
            return r1
        L_0x0218:
            r2 = r6
            r7 = r9
            r9 = r10
            r10 = r11
            r11 = r12
        L_0x021d:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x0226
            int r14 = r14.length()
            goto L_0x0227
        L_0x0226:
            r14 = r6
        L_0x0227:
            r7.setSpan(r8, r2, r14, r3)
            r14 = r9
            r2 = r10
            r7 = r11
        L_0x022d:
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r3 = r7.mo69503K1()
            if (r3 == 0) goto L_0x023a
            boolean r3 = r3.mo116169t()
            if (r3 != r5) goto L_0x023a
            goto L_0x023b
        L_0x023a:
            r5 = r6
        L_0x023b:
            if (r5 == 0) goto L_0x0242
            java.lang.String r0 = r2.mo116726z()
            goto L_0x0262
        L_0x0242:
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r2 = r7.mo69495C1()
            r0.L$0 = r7
            r0.L$1 = r14
            r0.L$2 = r4
            r0.L$3 = r4
            r0.L$4 = r4
            r3 = 6
            r0.label = r3
            java.lang.Object r0 = r2.mo76180B0(r0)
            if (r0 != r1) goto L_0x025a
            return r1
        L_0x025a:
            r1 = r14
            r14 = r0
            r0 = r7
        L_0x025d:
            java.lang.String r14 = (java.lang.String) r14
            r7 = r0
            r0 = r14
            r14 = r1
        L_0x0262:
            androidx.viewbinding.b r1 = r7.getBinding()
            com.carrefour.fid.android.databinding.g1 r1 = (com.carrefour.fid.android.databinding.C36700g1) r1
            android.widget.TextView r1 = r1.f90865f
            r1.setVisibility(r6)
            r1.setText(r14)
            androidx.viewbinding.b r14 = r7.getBinding()
            com.carrefour.fid.android.databinding.g1 r14 = (com.carrefour.fid.android.databinding.C36700g1) r14
            android.widget.TextView r14 = r14.f90866g
            r14.setVisibility(r6)
            r14.setText(r0)
            goto L_0x02a3
        L_0x027f:
            r7 = r13
        L_0x0280:
            androidx.viewbinding.b r14 = r7.getBinding()
            com.carrefour.fid.android.databinding.g1 r14 = (com.carrefour.fid.android.databinding.C36700g1) r14
            android.widget.TextView r14 = r14.f90865f
            r0 = 8
            r14.setVisibility(r0)
            androidx.viewbinding.b r14 = r7.getBinding()
            com.carrefour.fid.android.databinding.g1 r14 = (com.carrefour.fid.android.databinding.C36700g1) r14
            android.widget.TextView r14 = r14.f90866g
            r14.setVisibility(r0)
            androidx.viewbinding.b r14 = r7.getBinding()
            com.carrefour.fid.android.databinding.g1 r14 = (com.carrefour.fid.android.databinding.C36700g1) r14
            android.widget.ImageView r14 = r14.f90864e
            r14.setVisibility(r0)
        L_0x02a3:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment.mo69521f2(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g2 */
    public final void mo69522g2(@C12579k C26196a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f59779f = aVar;
    }

    /* renamed from: h2 */
    public final void mo69523h2(@C12579k C21424c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f59780g = cVar;
    }

    /* renamed from: i0 */
    public void mo63893i0(double d) {
        C28935i.m119705e(C28935i.f70940a, "critizr onRatingResult", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: i2 */
    public final void mo69524i2() {
        ((C36700g1) getBinding()).f90875p.setOnClickListener(new C23755g(this));
    }

    /* renamed from: k0 */
    public void mo63894k0() {
        C28935i.m119705e(C28935i.f70940a, "critizr onFeedbackSent", (Throwable) null, 0, 6, (Object) null);
    }

    /* renamed from: k2 */
    public final void mo69525k2(BasketDomain basketDomain) {
        String str;
        C28932h.C28933a aVar = C28932h.f70914a;
        OrderConfirmationModel K1 = mo69503K1();
        String str2 = null;
        if (K1 != null) {
            str = K1.mo116163n();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        Date J = aVar.mo84219J(str);
        if (J != null) {
            TextView textView = ((C36700g1) getBinding()).f90868i;
            String string = getString(R.string.from);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.from)");
            textView.setText(getString(R.string.available_from, aVar.mo84210A(J, string)));
            if (basketDomain != null) {
                str2 = basketDomain.mo115460C();
            }
            if (C11622t.equals(str2, "drive", true)) {
                ((C36700g1) getBinding()).f90869j.setImageResource(R.drawable.ic_drive);
            } else {
                ((C36700g1) getBinding()).f90869j.setImageResource(R.drawable.ic_withdrawal_reception);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: l2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo69526l2(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment$setNormalSlotValue$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$setNormalSlotValue$1 r0 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment$setNormalSlotValue$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$setNormalSlotValue$1 r0 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$setNormalSlotValue$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2131231514(0x7f08031a, float:1.8079111E38)
            java.lang.String r4 = "binding.textCheckoutConfirmationInformation"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 != r6) goto L_0x0041
            java.lang.Object r1 = r0.L$3
            java.util.Date r1 = (java.util.Date) r1
            java.lang.Object r2 = r0.L$2
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r8 = r0.L$1
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r0 = (com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment) r0
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0111
        L_0x0041:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0049:
            kotlin.C11661u0.m45747n(r13)
            androidx.viewbinding.b r13 = r12.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.TextView r2 = r13.f90868i
            com.carrefour.fid.android.shared.util.h$a r13 = com.carrefour.fid.android.shared.util.C28932h.f70914a
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r8 = r12.mo69503K1()
            r9 = 0
            if (r8 == 0) goto L_0x0062
            java.lang.String r8 = r8.mo116163n()
            goto L_0x0063
        L_0x0062:
            r8 = r9
        L_0x0063:
            java.lang.String r10 = ""
            if (r8 != 0) goto L_0x0068
            r8 = r10
        L_0x0068:
            java.util.Date r8 = r13.mo84219J(r8)
            if (r8 != 0) goto L_0x0071
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x0071:
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r11 = r12.mo69503K1()
            if (r11 == 0) goto L_0x007b
            java.lang.String r9 = r11.mo116164o()
        L_0x007b:
            if (r9 != 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r10 = r9
        L_0x007f:
            java.util.Date r9 = r13.mo84219J(r10)
            if (r9 != 0) goto L_0x0099
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r13 = r13.mo84239i(r8)
            r0[r7] = r13
            r13 = 2131952188(0x7f13023c, float:1.9540812E38)
            java.lang.String r13 = r12.getString(r13, r0)
            r2.setText(r13)
            goto L_0x01a5
        L_0x0099:
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r10 = r12.mo69503K1()
            if (r10 == 0) goto L_0x00a7
            boolean r10 = r10.mo116169t()
            if (r10 != r6) goto L_0x00a7
            r10 = r6
            goto L_0x00a8
        L_0x00a7:
            r10 = r7
        L_0x00a8:
            if (r10 == 0) goto L_0x00fa
            androidx.viewbinding.b r0 = r12.getBinding()
            com.carrefour.fid.android.databinding.g1 r0 = (com.carrefour.fid.android.databinding.C36700g1) r0
            android.widget.ImageView r0 = r0.f90869j
            r0.setImageResource(r3)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = r13.mo84239i(r8)
            r0[r7] = r1
            java.lang.String r13 = r13.mo84239i(r9)
            r0[r6] = r13
            r13 = 2131952187(0x7f13023b, float:1.954081E38)
            java.lang.String r13 = r12.getString(r13, r0)
            r2.setText(r13)
            androidx.viewbinding.b r13 = r12.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.TextView r13 = r13.f90867h
            r0 = 2131952181(0x7f130235, float:1.9540797E38)
            java.lang.String r0 = r12.getString(r0)
            r13.setText(r0)
            androidx.viewbinding.b r13 = r12.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.TextView r13 = r13.f90867h
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)
            com.carrefour.fid.android.shared.extension.ViewKt.m118983H(r13, r7, r7, r7, r7)
            androidx.viewbinding.b r13 = r12.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.TextView r13 = r13.f90867h
            r13.setVisibility(r7)
            goto L_0x01a5
        L_0x00fa:
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r13 = r12.mo69495C1()
            r0.L$0 = r12
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r8
            r0.label = r6
            java.lang.Object r13 = r13.mo76184F0(r0)
            if (r13 != r1) goto L_0x010f
            return r1
        L_0x010f:
            r0 = r12
            r1 = r8
        L_0x0111:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x014c
            androidx.viewbinding.b r13 = r0.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.ImageView r13 = r13.f90869j
            r13.setImageResource(r3)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            com.carrefour.fid.android.shared.util.h$a r3 = com.carrefour.fid.android.shared.util.C28932h.f70914a
            java.lang.String r4 = r3.mo84254z(r1)
            r13[r7] = r4
            java.lang.String r1 = r3.mo84211B(r1)
            r13[r6] = r1
            r1 = 2131952184(0x7f130238, float:1.9540804E38)
            java.lang.String r13 = r0.getString(r1, r13)
            r2.setText(r13)
            androidx.viewbinding.b r13 = r0.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.TextView r13 = r13.f90867h
            r0 = 8
            r13.setVisibility(r0)
            goto L_0x01a5
        L_0x014c:
            androidx.viewbinding.b r13 = r0.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.ImageView r13 = r13.f90869j
            r3 = 2131231461(0x7f0802e5, float:1.8079004E38)
            r13.setImageResource(r3)
            java.lang.Object[] r13 = new java.lang.Object[r5]
            com.carrefour.fid.android.shared.util.h$a r3 = com.carrefour.fid.android.shared.util.C28932h.f70914a
            java.lang.String r5 = r3.mo84254z(r1)
            r13[r7] = r5
            java.lang.String r1 = r3.mo84211B(r1)
            r13[r6] = r1
            r1 = 2131952185(0x7f130239, float:1.9540806E38)
            java.lang.String r13 = r0.getString(r1, r13)
            r2.setText(r13)
            androidx.viewbinding.b r13 = r0.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.TextView r13 = r13.f90867h
            r1 = 2131952186(0x7f13023a, float:1.9540808E38)
            java.lang.String r1 = r0.getString(r1)
            r13.setText(r1)
            androidx.viewbinding.b r13 = r0.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.TextView r13 = r13.f90867h
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)
            r1 = 1090519040(0x41000000, float:8.0)
            int r1 = com.carrefour.fid.android.shared.extension.ViewKt.m119002o(r1)
            com.carrefour.fid.android.shared.extension.ViewKt.m118983H(r13, r7, r1, r7, r7)
            androidx.viewbinding.b r13 = r0.getBinding()
            com.carrefour.fid.android.databinding.g1 r13 = (com.carrefour.fid.android.databinding.C36700g1) r13
            android.widget.TextView r13 = r13.f90867h
            r13.setVisibility(r7)
        L_0x01a5:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment.mo69526l2(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: m2 */
    public final void mo69527m2(@C12579k C32121c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f59781v = cVar;
    }

    /* renamed from: n2 */
    public final void mo69528n2() {
        ((C36700g1) getBinding()).f90861b.setOnClickListener(new C23750b(this));
    }

    public void onDestroyView() {
        CheckoutConfirmationViewModel C1 = mo69495C1();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C28502s.C28503a.m118425a(C1, viewLifecycleOwner, (Boolean) null, 2, (Object) null);
        FeedbackViewModel I1 = mo69501I1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C28502s.C28503a.m118425a(I1, viewLifecycleOwner2, (Boolean) null, 2, (Object) null);
        Timer timer = this.f59776X;
        if (timer != null) {
            timer.cancel();
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        ConstraintLayout constraintLayout = ((C36700g1) getBinding()).f90874o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.viewCheckoutConfirmation");
        ViewKt.m152123e(constraintLayout, (Integer) null, false, (C11289a) null, 7, (Object) null);
        ((C36700g1) getBinding()).f90862c.setEnabled(true);
        ((C36700g1) getBinding()).f90861b.setEnabled(true);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        FragmentKt.m118815c(this, new CheckoutConfirmationFragment$onViewCreated$1(this));
        mo69516Z1();
        mo69530r2();
        String H1 = mo69500H1();
        if (H1 == null || C11622t.isBlank(H1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            CheckoutConfirmationViewModel C1 = mo69495C1();
            C1.mo76186H0(mo69493A1().mo69611i());
            C1.mo76189K0(mo69503K1());
            C1.sendAirshipEvent();
        }
    }

    /* renamed from: p2 */
    public final void mo69529p2() {
        ((C36700g1) getBinding()).f90863d.setOnClickListener(new C23751c(this));
    }

    /* renamed from: r2 */
    public final void mo69530r2() {
        FragmentExtensionKt.m58757h(this);
        ((C36700g1) getBinding()).f90873n.f91229b.setOnClickListener(new C23754f(this));
    }

    /* renamed from: t2 */
    public final void mo69531t2() {
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

    /* renamed from: u2 */
    public final void mo69532u2() {
        ((C36700g1) getBinding()).f90863d.setVisibility(8);
        ((C36700g1) getBinding()).f90861b.setVisibility(8);
        ((C36700g1) getBinding()).f90862c.setVisibility(8);
        ((C36700g1) getBinding()).f90875p.setVisibility(0);
        ((C36700g1) getBinding()).f90871l.setVisibility(8);
        ((C36700g1) getBinding()).f90863d.setVisibility(8);
        ((C36700g1) getBinding()).f90867h.setVisibility(8);
        ((C36700g1) getBinding()).f90865f.setVisibility(8);
        ((C36700g1) getBinding()).f90866g.setVisibility(8);
        ((C36700g1) getBinding()).f90864e.setVisibility(8);
        ((C36700g1) getBinding()).f90872m.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_order_error, 0, 0);
    }

    /* renamed from: v2 */
    public final void mo69533v2() {
        Timer timer = new Timer();
        timer.schedule(new C23704f(this), 3000);
        this.f59776X = timer;
    }

    /* renamed from: w2 */
    public final void mo69534w2() {
        String str;
        CheckoutConfirmationViewModel C1 = mo69495C1();
        OrderConfirmationModel K1 = mo69503K1();
        String str2 = null;
        if (K1 != null) {
            str = K1.mo116163n();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        OrderConfirmationModel K12 = mo69503K1();
        if (K12 != null) {
            str2 = K12.mo116156g();
        }
        if (str2 != null) {
            str3 = str2;
        }
        C1.mo76185G0(str, str3);
        mo69494B1().mo76205e(this.f59778Z);
    }

    /* renamed from: z1 */
    public final void mo69535z1() {
        mo69502J1().sendIntent(LuckyCartViewModel.C26617b.C26618a.f65021b);
        mo69504L1().sendIntent(RatingViewModel.C27382b.C27383a.f66450b);
    }
}
