package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.databinding.C36761m2;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.models.ArsenalJOBanner;
import com.carrefour.fid.android.loyalty.core.type.CardType;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.components.home.CagnotteCardView;
import com.carrefour.fid.android.presentation.components.home.CouponCardView;
import com.carrefour.fid.android.presentation.components.loyalty.BarCodeCardView;
import com.carrefour.fid.android.presentation.components.toolbar.ToolBarDefaultView;
import com.carrefour.fid.android.presentation.models.CurrentCampaignsModel;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details.C24481j;
import com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.OtpOrigination;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.LoyaltyDetailViewModel;
import com.carrefour.fid.android.presentation.viewmodels.loyalty.details.mvi.C26562a;
import com.carrefour.fid.android.shared.constant.C28555j2;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.carrefour.fid.android.shared.presentation.p047ui.webview.C28870e;
import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p009io.github.aakira.napier.C10848c;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bX\u0010YJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J \u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0016\u0010\u001e\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0002J\b\u0010 \u001a\u00020\u0005H\u0002J\b\u0010!\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\u0005H\u0002J\u0019\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\b\u0010*\u001a\u00020\u0005H\u0002J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020&H\u0002J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0016H\u0002J\b\u0010/\u001a\u00020\u0005H\u0002J\b\u00100\u001a\u00020\u0005H\u0002J\u0010\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0016H\u0002J\b\u00103\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020&H\u0002J\b\u00106\u001a\u00020\u0005H\u0002J\u0010\u00109\u001a\u00020\u00052\u0006\u00108\u001a\u000207H\u0002J\b\u0010:\u001a\u00020\u0005H\u0002J\b\u0010;\u001a\u00020\u0005H\u0002J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0007H\u0002J\b\u0010>\u001a\u00020\u0005H\u0002J\b\u0010?\u001a\u00020\u0005H\u0002J\b\u0010@\u001a\u00020\u0005H\u0002J\b\u0010A\u001a\u00020\u0005H\u0002J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020BH\u0002J\b\u0010E\u001a\u00020\u0005H\u0002J\u001a\u0010J\u001a\u00020\u00052\u0006\u0010G\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016R\u0018\u0010-\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020M8BX\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010LR\u0014\u0010W\u001a\u00020&8\u0002XD¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Z"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/details/LoyaltyDetailViewFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/m2;", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$j;", "state", "Lkotlin/d2;", "I1", "Lcom/carrefour/fid/android/domain/models/ArsenalJOBanner;", "banner", "i1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$i;", "event", "H1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$j$b;", "j1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$g;", "l1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$a;", "k1", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/mvi/a$h;", "error", "m1", "", "gameUrl", "webViewTitle", "secureTokenValue", "G1", "", "Lcom/carrefour/fid/android/cms/domain/models/LoyaltyBonus;", "loyaltyBonusList", "g1", "v1", "w1", "r1", "", "balance", "o1", "n1", "", "nbCoupon", "z1", "(Ljava/lang/Integer;)V", "P1", "message", "O1", "cardName", "K1", "N1", "s1", "loyaltyCardNumber", "f1", "Q1", "visibility", "J1", "A1", "", "isVisible", "L1", "C1", "initUi", "joBanner", "t1", "u1", "F1", "h1", "d1", "Lcom/carrefour/fid/android/presentation/models/CurrentCampaignsModel;", "currentCampaignsModel", "q1", "M1", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "f", "Ljava/lang/String;", "Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/LoyaltyDetailViewModel;", "g", "Lkotlin/z;", "e1", "()Lcom/carrefour/fid/android/presentation/viewmodels/loyalty/details/LoyaltyDetailViewModel;", "viewModel", "v", "cardNumber", "w", "I", "ignorePassCardNumberPrefix", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLoyaltyDetailViewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyDetailViewFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/details/LoyaltyDetailViewFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,505:1\n106#2,15:506\n168#3,7:521\n183#3,6:528\n262#4,2:534\n37#5,2:536\n*S KotlinDebug\n*F\n+ 1 LoyaltyDetailViewFragment.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/fragments/details/LoyaltyDetailViewFragment\n*L\n68#1:506,15\n98#1:521,7\n99#1:528,6\n183#1:534,2\n263#1:536,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment */
public final class LoyaltyDetailViewFragment extends C24472a<C36761m2> {

    /* renamed from: x */
    public static final int f60958x = 8;
    @C12580l

    /* renamed from: f */
    public String f60959f;
    @C12579k

    /* renamed from: g */
    public final C11677z f60960g;
    @C12580l

    /* renamed from: v */
    public String f60961v;

    /* renamed from: w */
    public final int f60962w = 3;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$a */
    public /* synthetic */ class C24442a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.loyalty.core.type.CardType[] r0 = com.carrefour.fid.android.loyalty.core.type.CardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.loyalty.core.type.CardType r1 = com.carrefour.fid.android.loyalty.core.type.CardType.FID     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.loyalty.core.type.CardType r1 = com.carrefour.fid.android.loyalty.core.type.CardType.PASS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.loyalty.core.type.CardType r1 = com.carrefour.fid.android.loyalty.core.type.CardType.CZAM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.details.LoyaltyDetailViewFragment.C24442a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.details.LoyaltyDetailViewFragment$b */
    public static final class C24443b implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f60964a;

        public C24443b(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f60964a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f60964a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f60964a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public LoyaltyDetailViewFragment() {
        super(C244411.f60963a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new LoyaltyDetailViewFragment$special$$inlined$viewModels$default$2(new LoyaltyDetailViewFragment$special$$inlined$viewModels$default$1(this)));
        this.f60960g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(LoyaltyDetailViewModel.class), new LoyaltyDetailViewFragment$special$$inlined$viewModels$default$3(b), new LoyaltyDetailViewFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new LoyaltyDetailViewFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: B1 */
    public static final void m107227B1(LoyaltyDetailViewFragment loyaltyDetailViewFragment, View view) {
        Intrinsics.checkNotNullParameter(loyaltyDetailViewFragment, "this$0");
        loyaltyDetailViewFragment.mo71521e1().sendIntent(C26562a.C26601k.C26611j.f65007a);
    }

    /* renamed from: D1 */
    public static final void m107228D1(LoyaltyDetailViewFragment loyaltyDetailViewFragment, View view) {
        Intrinsics.checkNotNullParameter(loyaltyDetailViewFragment, "this$0");
        loyaltyDetailViewFragment.mo71521e1().sendIntent(C26562a.C26601k.C26602a.f64987a);
    }

    /* renamed from: E1 */
    public static final void m107229E1(LoyaltyDetailViewFragment loyaltyDetailViewFragment, View view) {
        Intrinsics.checkNotNullParameter(loyaltyDetailViewFragment, "this$0");
        loyaltyDetailViewFragment.mo71521e1().sendIntent(C26562a.C26601k.C26605d.f64995a);
    }

    /* renamed from: p1 */
    public static final void m107243p1(LoyaltyDetailViewFragment loyaltyDetailViewFragment, double d, View view) {
        Intrinsics.checkNotNullParameter(loyaltyDetailViewFragment, "this$0");
        FragmentKt.m118823k(loyaltyDetailViewFragment, C24481j.f61006a.mo71639g(String.valueOf(d)));
    }

    /* renamed from: x1 */
    public static final void m107244x1(LoyaltyDetailViewFragment loyaltyDetailViewFragment, View view) {
        Intrinsics.checkNotNullParameter(loyaltyDetailViewFragment, "this$0");
        loyaltyDetailViewFragment.mo71521e1().sendIntent(C26562a.C26601k.C26612k.f65009a);
    }

    /* renamed from: y1 */
    public static final void m107245y1(LoyaltyDetailViewFragment loyaltyDetailViewFragment, View view) {
        Intrinsics.checkNotNullParameter(loyaltyDetailViewFragment, "this$0");
        loyaltyDetailViewFragment.mo71521e1().sendIntent(C26562a.C26601k.C26612k.f65009a);
    }

    /* renamed from: A1 */
    public final void mo71506A1() {
        ((C36761m2) getBinding()).f91270p.f90770d.setOnClickListener(new C24480i(this));
    }

    /* renamed from: C1 */
    public final void mo71507C1() {
        ((C36761m2) getBinding()).f91262h.setOnClickListener(new C24475d(this));
        ((C36761m2) getBinding()).f91267m.setOnClickListener(new C24476e(this));
        mo71506A1();
    }

    /* renamed from: F1 */
    public final void mo71508F1() {
        mo71514L1(false);
        FragmentKt.m118823k(this, C24481j.f61006a.mo71638e(false));
    }

    /* renamed from: G1 */
    public final void mo71509G1(String str, String str2, String str3) {
        C19736g.m91827a(this).mo58130W(R.id.webview_graph, new C28870e(str, str2, C28555j2.f69460a, str3, true).mo84044n());
    }

    /* renamed from: H1 */
    public final void mo71510H1(C26562a.C26579i iVar) {
        if (iVar instanceof C26562a.C26579i.C26582c) {
            mo71530m1(((C26562a.C26579i.C26582c) iVar).mo77268d());
        } else if (iVar instanceof C26562a.C26579i.C26585f) {
            FragmentKt.m118823k(this, C24481j.f61006a.mo71637c(((C26562a.C26579i.C26585f) iVar).mo77274d()));
        } else if (Intrinsics.areEqual((Object) iVar, (Object) C26562a.C26579i.C26581b.f64943a)) {
            mo71517O1(R.string.general_error_server_not_responding_message);
        } else if (Intrinsics.areEqual((Object) iVar, (Object) C26562a.C26579i.C26583d.f64947a)) {
            mo71508F1();
        } else if (Intrinsics.areEqual((Object) iVar, (Object) C26562a.C26579i.C26584e.f64949a)) {
            mo71519Q1();
        } else if (Intrinsics.areEqual((Object) iVar, (Object) C26562a.C26579i.C26580a.f64941a)) {
            mo71517O1(R.string.general_error_server_not_responding_message);
        } else if (iVar instanceof C26562a.C26579i.C26587h) {
            mo71522f1(((C26562a.C26579i.C26587h) iVar).mo77281e());
        } else if (iVar instanceof C26562a.C26579i.C26586g) {
            mo71534r1();
        } else if (iVar instanceof C26562a.C26579i.C26588i) {
            C26562a.C26579i.C26588i iVar2 = (C26562a.C26579i.C26588i) iVar;
            mo71509G1(iVar2.mo77292g(), iVar2.mo77291f(), iVar2.mo77293h());
        } else if (Intrinsics.areEqual((Object) iVar, (Object) C26562a.C26579i.C26589j.f64962a)) {
            NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
            String string = getString(R.string.general_an_error_occurred);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_an_error_occurred)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, true, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2012, (Object) null);
        }
    }

    /* renamed from: I1 */
    public final void mo71511I1(C26562a.C26590j jVar) {
        if (jVar instanceof C26562a.C26590j.C26594d) {
            mo71529l1(((C26562a.C26590j.C26594d) jVar).mo77321h());
        } else if (jVar instanceof C26562a.C26590j.C26592b) {
            mo71527j1((C26562a.C26590j.C26592b) jVar);
        } else if (jVar instanceof C26562a.C26590j.C26591a) {
            C26562a.C26590j.C26591a aVar = (C26562a.C26590j.C26591a) jVar;
            if (aVar.mo77299h() != null) {
                mo71533q1(aVar.mo77299h());
            }
        } else if (jVar instanceof C26562a.C26590j.C26593c) {
            mo71528k1(((C26562a.C26590j.C26593c) jVar).mo77315h());
        } else if (jVar instanceof C26562a.C26590j.C26598h) {
            mo71525i1(((C26562a.C26590j.C26598h) jVar).mo77327h());
        }
    }

    /* renamed from: J1 */
    public final void mo71512J1(int i) {
        ((C36761m2) getBinding()).f91270p.f90770d.setVisibility(i);
    }

    /* renamed from: K1 */
    public final void mo71513K1(String str) {
        this.f60959f = str;
    }

    /* renamed from: L1 */
    public final void mo71514L1(boolean z) {
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
        if (bottomNavActivity != null && (M1 = bottomNavActivity.mo121107M1()) != null) {
            ToolBarDefaultView.m158946v0(M1, z, (C11300l) null, 2, (Object) null);
        }
    }

    /* renamed from: M1 */
    public final void mo71515M1() {
        String string = getString(R.string.loyalty_modify_secret_code);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loyalty_modify_secret_code)");
        String string2 = getString(R.string.accessibility_loyalty_modify_secret_code);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.acces…yalty_modify_secret_code)");
        TextView textView = ((C36761m2) getBinding()).f91267m;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.modifySecretCodeTxt");
        ViewKt.m152121c(textView, string + ". " + string2, false, 2, (Object) null);
    }

    /* renamed from: N1 */
    public final void mo71516N1() {
        ((C36761m2) getBinding()).f91267m.setVisibility(4);
        ((C36761m2) getBinding()).f91266l.setVisibility(0);
    }

    /* renamed from: O1 */
    public final void mo71517O1(int i) {
        NotificationComponent.Variant variant = NotificationComponent.Variant.ERROR;
        String string = getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(message)");
        FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
    }

    /* renamed from: P1 */
    public final void mo71518P1() {
        String string = getString(R.string.loyalty_card_clean_data_title, this.f60959f);
        String string2 = getString(R.string.loyalty_card_clean_data_msg, this.f60959f);
        String string3 = getString(R.string.general_cancel);
        String string4 = getString(R.string.general_delete);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loyal…ean_data_title, cardName)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.loyal…clean_data_msg, cardName)");
        FragmentKt.m118838z(this, string, string2, string3, new LoyaltyDetailViewFragment$showPopInDetachCard$1(this), string4, false, new LoyaltyDetailViewFragment$showPopInDetachCard$2(this), (String) null, (C11289a) null, (C11289a) null, (Drawable) null, 0, C10848c.f28038c, (Object) null);
    }

    /* renamed from: Q1 */
    public final void mo71519Q1() {
        C19232h activity = getActivity();
        BottomNavActivity bottomNavActivity = activity instanceof BottomNavActivity ? (BottomNavActivity) activity : null;
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121096G2();
        }
    }

    /* renamed from: d1 */
    public final void mo71520d1() {
        Context context = getContext();
        if (context != null) {
            Object systemService = context.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData newPlainText = ClipData.newPlainText("loyalty card number", this.f60961v);
            Intrinsics.checkNotNullExpressionValue(newPlainText, "newPlainText(\"loyalty card number\", cardNumber)");
            ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
            NotificationComponent.Variant variant = NotificationComponent.Variant.SUCCESS;
            String string = getString(R.string.loyalty_card_copied_card_number_toast_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loyal…ard_number_toast_message)");
            FragmentKt.m118811B(this, variant, string, (String) null, (String) null, (C11289a) null, false, false, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2044, (Object) null);
        }
    }

    /* renamed from: e1 */
    public final LoyaltyDetailViewModel mo71521e1() {
        return (LoyaltyDetailViewModel) this.f60960g.getValue();
    }

    /* renamed from: f1 */
    public final void mo71522f1(String str) {
        FragmentKt.m118823k(this, C24481j.f61006a.mo71636b(str, OtpOrigination.MyAccount.f61099d));
    }

    /* renamed from: g1 */
    public final void mo71523g1(List<LoyaltyBonus> list) {
        FragmentKt.m118823k(this, C24481j.C24488g.m107333j(C24481j.f61006a, (LoyaltyBonus[]) list.toArray(new LoyaltyBonus[0]), false, 2, (Object) null));
    }

    /* renamed from: h1 */
    public final void mo71524h1() {
        FragmentKt.m118823k(this, C24481j.f61006a.mo71640h());
        mo71521e1().sendTagClickLoyaltyCardButton();
    }

    /* renamed from: i1 */
    public final void mo71525i1(ArsenalJOBanner arsenalJOBanner) {
        mo71536t1(new ArsenalJOBanner(arsenalJOBanner.getOpCode(), arsenalJOBanner.getGameUrl(), arsenalJOBanner.getGameName(), arsenalJOBanner.getAccountBalance(), arsenalJOBanner.getAssociationClientClub(), arsenalJOBanner.getAssociationClubName()));
    }

    public final void initUi() {
        BottomNavActivity bottomNavActivity;
        ToolBarDefaultView M1;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (!(bottomNavActivity == null || (M1 = bottomNavActivity.mo121107M1()) == null)) {
            ToolBarDefaultView.setup$default(M1, (C11300l) null, new LoyaltyDetailViewFragment$initUi$1(this), 1, (Object) null);
        }
        ((C36761m2) getBinding()).f91265k.setContent(C8553b.m31049c(266668167, true, new LoyaltyDetailViewFragment$initUi$2(this)));
        ((C36761m2) getBinding()).f91259e.mo121219e();
        ((C36761m2) getBinding()).f91259e.setBackground(true);
        ((C36761m2) getBinding()).f91262h.mo121228e();
        ((C36761m2) getBinding()).f91262h.setBackground(true);
        ((C36761m2) getBinding()).f91263i.setContent(C8553b.m31049c(-70164560, true, new LoyaltyDetailViewFragment$initUi$3(this)));
    }

    /* renamed from: j1 */
    public final void mo71527j1(C26562a.C26590j.C26592b bVar) {
        String str;
        boolean z;
        CardType l = bVar.mo77310l();
        CardType cardType = CardType.PASS;
        if (l == cardType) {
            str = bVar.mo77309k().substring(this.f60962w);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
        } else {
            str = bVar.mo77309k();
        }
        this.f60961v = str;
        BarCodeCardView barCodeCardView = ((C36761m2) getBinding()).f91258d;
        Intrinsics.checkNotNullExpressionValue(barCodeCardView, "binding.barcodeCardView");
        int i = 0;
        BarCodeCardView.m158885w(barCodeCardView, bVar.mo77309k(), false, 2, (Object) null);
        mo71514L1(true);
        ImageView imageView = ((C36761m2) getBinding()).f91264j;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.loyaltyCardButton");
        if (bVar.mo77310l() != cardType) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        int i2 = C24442a.$EnumSwitchMapping$0[bVar.mo77310l().ordinal()];
        if (i2 == 1 || i2 == 2) {
            String string = getString(R.string.loyalty_card_carrefour);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loyalty_card_carrefour)");
            mo71513K1(string);
            mo71539w1();
        } else if (i2 == 3) {
            String string2 = getString(R.string.loyalty_card_czam);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.loyalty_card_czam)");
            mo71513K1(string2);
            mo71539w1();
        }
        mo71532o1(bVar.mo77308j());
    }

    /* renamed from: k1 */
    public final void mo71528k1(C26562a.C26563a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C26562a.C26564b.f64915a)) {
            mo71535s1();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C26562a.C26565c.f64917a)) {
            mo71516N1();
        }
    }

    /* renamed from: l1 */
    public final void mo71529l1(C26562a.C26569g gVar) {
        if (gVar instanceof C26562a.C26566d) {
            mo71540z1(Integer.valueOf(((C26562a.C26566d) gVar).mo77262d()));
        } else if (Intrinsics.areEqual((Object) gVar, (Object) C26562a.C26567e.f64921a)) {
            mo71538v1();
        } else if (Intrinsics.areEqual((Object) gVar, (Object) C26562a.C26568f.f64923a)) {
            ((C36761m2) getBinding()).f91262h.mo121228e();
        }
    }

    /* renamed from: m1 */
    public final void mo71530m1(C26562a.C26570h hVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (Intrinsics.areEqual((Object) hVar, (Object) C26562a.C26570h.C26571a.f64925a)) {
            mo71518P1();
            mo71531n1();
        } else if (Intrinsics.areEqual((Object) hVar, (Object) C26562a.C26570h.C26572b.f64927a)) {
            mo71540z1(0);
            mo71531n1();
        } else {
            boolean z4 = true;
            if (Intrinsics.areEqual((Object) hVar, (Object) C26562a.C26570h.C26574d.f64931a)) {
                z = true;
            } else {
                z = Intrinsics.areEqual((Object) hVar, (Object) C26562a.C26570h.C26573c.f64929a);
            }
            if (z) {
                mo71517O1(R.string.general_error_server_not_responding_message);
                mo71531n1();
                return;
            }
            if (Intrinsics.areEqual((Object) hVar, (Object) C26562a.C26570h.C26578h.f64939a)) {
                z2 = true;
            } else {
                z2 = Intrinsics.areEqual((Object) hVar, (Object) C26562a.C26570h.C26577g.f64937a);
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = Intrinsics.areEqual((Object) hVar, (Object) C26562a.C26570h.C26575e.f64933a);
            }
            if (!z3) {
                z4 = Intrinsics.areEqual((Object) hVar, (Object) C26562a.C26570h.C26576f.f64935a);
            }
            if (z4) {
                C28935i.m119705e(C28935i.f70940a, hVar.toString(), (Throwable) null, 0, 6, (Object) null);
            }
        }
    }

    /* renamed from: n1 */
    public final void mo71531n1() {
        CagnotteCardView cagnotteCardView = ((C36761m2) getBinding()).f91259e;
        Intrinsics.checkNotNullExpressionValue(cagnotteCardView, "handleErrorLoyaltyAmount$lambda$6");
        CagnotteCardView.m158850b(cagnotteCardView, 0.0d, false, true, 2, (Object) null);
        cagnotteCardView.setClickable(false);
        ((C36761m2) getBinding()).f91259e.setVisibilityErrorCagnotteRetry(false);
    }

    /* renamed from: o1 */
    public final void mo71532o1(double d) {
        CagnotteCardView cagnotteCardView = ((C36761m2) getBinding()).f91259e;
        Intrinsics.checkNotNullExpressionValue(cagnotteCardView, "binding.cagnotteCard");
        CagnotteCardView.m158850b(cagnotteCardView, d, false, false, 6, (Object) null);
        ((C36761m2) getBinding()).f91259e.setOnClickListener(new C24479h(this, d));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initUi();
        mo71507C1();
        mo71537u1();
        mo71515M1();
        mo71521e1().sendTagScreenView();
        C22757a.m102929c(false);
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C24443b(new LoyaltyDetailViewFragment$onViewCreated$1(this)));
        LoyaltyDetailViewModel e1 = mo71521e1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C24449x324fe0b4(this, e1, (C11045c) null, this), 3, (Object) null);
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner3), (CoroutineContext) null, (CoroutineStart) null, new C24444x5158307d(this, e1, (C11045c) null, this), 3, (Object) null);
        C19499w viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        C11723c2 unused3 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner4), (CoroutineContext) null, (CoroutineStart) null, new LoyaltyDetailViewFragment$onViewCreated$2$3(this, e1, (C11045c<? super LoyaltyDetailViewFragment$onViewCreated$2$3>) null), 3, (Object) null);
    }

    /* renamed from: q1 */
    public final void mo71533q1(CurrentCampaignsModel currentCampaignsModel) {
        BottomNavActivity bottomNavActivity;
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121144w2(currentCampaignsModel);
        }
        if (currentCampaignsModel.mo121539h()) {
            mo71512J1(0);
        } else {
            mo71512J1(8);
        }
    }

    /* renamed from: r1 */
    public final void mo71534r1() {
        mo71524h1();
    }

    /* renamed from: s1 */
    public final void mo71535s1() {
        ((C36761m2) getBinding()).f91267m.setVisibility(0);
        ((C36761m2) getBinding()).f91266l.setVisibility(8);
    }

    /* renamed from: t1 */
    public final void mo71536t1(ArsenalJOBanner arsenalJOBanner) {
        ((C36761m2) getBinding()).f91256b.setContent(C8553b.m31049c(-1570620139, true, new LoyaltyDetailViewFragment$initArsenalJOBanner$1(arsenalJOBanner, this)));
    }

    /* renamed from: u1 */
    public final void mo71537u1() {
        mo71521e1().tagChallengeFid();
        ((C36761m2) getBinding()).f91257c.setContent(C8553b.m31049c(1038198289, true, new LoyaltyDetailViewFragment$initChallengeFid$1(this)));
    }

    /* renamed from: v1 */
    public final void mo71538v1() {
        CouponCardView couponCardView = ((C36761m2) getBinding()).f91262h;
        couponCardView.mo121226c();
        couponCardView.mo121224a();
    }

    /* renamed from: w1 */
    public final void mo71539w1() {
        ((C36761m2) getBinding()).f91264j.setOnClickListener(new C24477f(this));
        ((C36761m2) getBinding()).f91258d.setOnClickListener(new C24478g(this));
    }

    /* renamed from: z1 */
    public final void mo71540z1(Integer num) {
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(this), (CoroutineContext) null, (CoroutineStart) null, new LoyaltyDetailViewFragment$initNbCoupon$1$1(((C36761m2) getBinding()).f91262h, num, (C11045c<? super LoyaltyDetailViewFragment$initNbCoupon$1$1>) null), 3, (Object) null);
    }
}
