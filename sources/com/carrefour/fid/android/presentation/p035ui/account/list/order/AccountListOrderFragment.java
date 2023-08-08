package com.carrefour.fid.android.presentation.p035ui.account.list.order;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.databinding.C36669d0;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.C23062c;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.account.list.order.AccountListOrderViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.order.C25858a;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26636c;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
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
import kotlin.text.C11622t;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001XB\u0007¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0003J\b\u0010\u001f\u001a\u00020\u0005H\u0002J\u001a\u0010\"\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010!\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020&H\u0016J\u001a\u0010,\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0014J\b\u00101\u001a\u00020\u0005H\u0014R\"\u00109\u001a\u0002028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0002¢\u0006\f\n\u0004\bM\u0010D\u001a\u0004\bN\u0010OR\u0016\u0010T\u001a\u0004\u0018\u00010Q8BX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006Y"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/list/order/AccountListOrderFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/d0;", "Lcom/carrefour/fid/android/presentation/viewmodels/offer/state/c;", "state", "Lkotlin/d2;", "p1", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/order/AccountListOrderViewModel$a;", "uiEvent", "k1", "", "throwable", "j1", "v1", "", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "offerList", "l1", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "", "productPosition", "o0", "J", "Y", "i1", "m1", "z", "n1", "t1", "h1", "q1", "", "isFeatureMixingProducts", "w1", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onPause", "onDestroyView", "c1", "r1", "Lcom/carrefour/fid/android/shared/navigation/c;", "f", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/order/a;", "g", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/order/a;", "d1", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/list/order/a;", "s1", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/list/order/a;)V", "accountListOrderAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/order/AccountListOrderViewModel;", "v", "Lkotlin/z;", "e1", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/list/order/AccountListOrderViewModel;", "accountListOrderViewModel", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "w", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "Lcom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment$ParentScreen;", "x", "g1", "()Lcom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment$ParentScreen;", "parentScreen", "", "f1", "()Ljava/lang/String;", "orderId", "<init>", "()V", "y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountListOrderFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountListOrderFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/order/AccountListOrderFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,567:1\n106#2,15:568\n168#3,7:583\n183#3,6:590\n1#4:596\n1#4:632\n800#5,11:597\n800#5,11:608\n1569#5,11:619\n1864#5,2:630\n1866#5:633\n1580#5:634\n*S KotlinDebug\n*F\n+ 1 AccountListOrderFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/order/AccountListOrderFragment\n*L\n102#1:568,15\n175#1:583,7\n176#1:590,6\n402#1:632\n396#1:597,11\n401#1:608,11\n402#1:619,11\n402#1:630,2\n402#1:633\n402#1:634\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment */
public final class AccountListOrderFragment extends C23007d<C36669d0> {
    @C12579k

    /* renamed from: X */
    public static final String f58631X = "AccountListOrderFragment";
    @C12579k

    /* renamed from: Y */
    public static final String f58632Y = "KEY_LIST_LAST_ORDER_POSITION";
    @C12579k

    /* renamed from: Z */
    public static final String f58633Z = "order_id";
    @C12579k

    /* renamed from: y */
    public static final C22986a f58634y = new C22986a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f58635z = 8;
    @Inject

    /* renamed from: f */
    public C28796c f58636f;
    @Inject

    /* renamed from: g */
    public C25858a f58637g;
    @C12579k

    /* renamed from: v */
    public final C11677z f58638v;
    @C12580l

    /* renamed from: w */
    public C37370b f58639w;
    @C12579k

    /* renamed from: x */
    public final C11677z f58640x = C10864b0.m38748c(new AccountListOrderFragment$parentScreen$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$a */
    public static final class C22986a {
        public /* synthetic */ C22986a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ AccountListOrderFragment m103445b(C22986a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return aVar.mo67602a(bundle);
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final AccountListOrderFragment mo67602a(@C12580l Bundle bundle) {
            AccountListOrderFragment accountListOrderFragment = new AccountListOrderFragment();
            accountListOrderFragment.setArguments(bundle);
            return accountListOrderFragment;
        }

        public C22986a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$b */
    public /* synthetic */ class C22987b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen[] r0 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r1 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.ACCOUNT_LIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r1 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.BASKET_BUILDER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.order.AccountListOrderFragment.C22987b.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$c */
    public static final class C22988c implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f58642a;

        public C22988c(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f58642a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f58642a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f58642a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public AccountListOrderFragment() {
        super(C229851.f58641a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new AccountListOrderFragment$special$$inlined$viewModels$default$2(new AccountListOrderFragment$special$$inlined$viewModels$default$1(this)));
        this.f58638v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AccountListOrderViewModel.class), new AccountListOrderFragment$special$$inlined$viewModels$default$3(b), new AccountListOrderFragment$special$$inlined$viewModels$default$4((C11289a) null, b), new AccountListOrderFragment$special$$inlined$viewModels$default$5(this, b));
    }

    @C12579k
    @C11384m
    /* renamed from: o1 */
    public static final AccountListOrderFragment m103419o1(@C12580l Bundle bundle) {
        return f58634y.mo67602a(bundle);
    }

    /* renamed from: u1 */
    public static final void m103420u1(AccountListOrderFragment accountListOrderFragment, View view) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(accountListOrderFragment, "this$0");
        C19232h activity = accountListOrderFragment.getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121122Y1();
        }
    }

    /* renamed from: J */
    public final void mo67575J(OfferProductModel offerProductModel, int i) {
        mo67579e1().sendIntent(new AccountListOrderViewModel.C25849b.C25854e(offerProductModel, (Integer) null, 2, (DefaultConstructorMarker) null));
        mo67578d1().mo75076g(offerProductModel, mo67582g1(), offerProductModel.mo121519p0(), i);
    }

    /* renamed from: Y */
    public final void mo67576Y(OfferProductModel offerProductModel, int i) {
        if (!offerProductModel.mo121497A1()) {
            mo67579e1().sendIntent(new AccountListOrderViewModel.C25849b.C25851b(offerProductModel));
            mo67578d1().mo75079j(offerProductModel, mo67582g1(), i);
            return;
        }
        mo67579e1().sendIntent(new AccountListOrderViewModel.C25849b.C25855f(offerProductModel));
        mo67578d1().mo75080k(offerProductModel, mo67582g1(), i);
    }

    /* renamed from: c1 */
    public void mo67577c1() {
        boolean z;
        String f1 = mo67581f1();
        if (f1 == null || C11622t.isBlank(f1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo67578d1().mo75077h(mo67582g1());
        }
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        C13825a.m58787p(requireActivity, false, 0, 0, 7, (Object) null);
    }

    @C12579k
    /* renamed from: d1 */
    public final C25858a mo67578d1() {
        C25858a aVar = this.f58637g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountListOrderAnalyticsViewModel");
        return null;
    }

    /* renamed from: e1 */
    public final AccountListOrderViewModel mo67579e1() {
        return (AccountListOrderViewModel) this.f58638v.getValue();
    }

    public /* bridge */ /* synthetic */ C11079d2 emptyFunction() {
        mo67577c1();
        return C11079d2.f28267a;
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36669d0) getBinding()).f90706f;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubAccountListEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36669d0) getBinding()).f90707g;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubAccountListError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final String mo67581f1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("order_id");
        }
        return null;
    }

    /* renamed from: g1 */
    public final AccountListFragment.ParentScreen mo67582g1() {
        return (AccountListFragment.ParentScreen) this.f58640x.getValue();
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f58636f;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @C0324b1
    /* renamed from: h1 */
    public final int mo67584h1() {
        boolean z;
        String f1 = mo67581f1();
        if (f1 == null || C11622t.isBlank(f1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return AccountListType.Order.f89772d.mo108407b();
        }
        return R.string.make_new_order;
    }

    /* renamed from: i1 */
    public final void mo67585i1(OfferProductModel offerProductModel) {
        mo67579e1().sendIntent(new AccountListOrderViewModel.C25849b.C25857h(offerProductModel));
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67586j1(java.lang.Throwable r28) {
        /*
            r27 = this;
            r14 = r27
            r2 = r28
            boolean r0 = r2 instanceof com.carrefour.fid.android.shared.p046io.RequireSignInThrowable
            r1 = 2131953365(0x7f1306d5, float:1.9543199E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 2131953366(0x7f1306d6, float:1.95432E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6 = 2131820565(0x7f110015, float:1.9273849E38)
            java.lang.Class<com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment> r7 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.class
            r8 = 1
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = com.carrefour.fid.android.core.extension.FragmentKt.m148916b(r14, r7)
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment r0 = (com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment) r0
            if (r0 == 0) goto L_0x003c
            int r1 = r27.mo67584h1()
            android.content.res.Resources r2 = r27.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r9] = r10
            java.lang.String r2 = r2.getQuantityString(r6, r9, r5)
            r0.mo67477W0(r1, r2)
        L_0x003c:
            r27.mo67590n1()
            r27.hideErrorView()
            r27.hideLoading()
            r1 = 0
            r0 = 2131952300(0x7f1302ac, float:1.9541039E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 1
            r7 = 0
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleError$1 r8 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleError$1
            r8.<init>(r14)
            r9 = 33
            r10 = 0
            r0 = r27
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118419a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r27.showEmpty()
            goto L_0x031f
        L_0x0068:
            boolean r0 = r2 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable
            if (r0 == 0) goto L_0x0082
            com.carrefour.fid.android.presentation.viewmodels.account.list.order.AccountListOrderViewModel r0 = r27.mo67579e1()
            com.carrefour.fid.android.presentation.viewmodels.account.list.order.AccountListOrderViewModel$b$g r1 = com.carrefour.fid.android.presentation.viewmodels.account.list.order.AccountListOrderViewModel.C25849b.C25856g.f63307b
            r0.sendIntent(r1)
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleError$2 r0 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleError$2
            r0.<init>(r14)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r14, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r27)
            goto L_0x031f
        L_0x0082:
            boolean r0 = r2 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r27.mo67581f1()
            if (r0 == 0) goto L_0x0095
            boolean r0 = kotlin.text.C11622t.isBlank(r0)
            if (r0 == 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r0 = r9
            goto L_0x0096
        L_0x0095:
            r0 = r8
        L_0x0096:
            if (r0 != 0) goto L_0x00b6
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r1 = r27.mo67581f1()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Empty list for reorder "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r14.mo67586j1(r0)
            return
        L_0x00b6:
            java.lang.Object r0 = com.carrefour.fid.android.core.extension.FragmentKt.m148916b(r14, r7)
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment r0 = (com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment) r0
            if (r0 == 0) goto L_0x00d1
            int r1 = r27.mo67584h1()
            android.content.res.Resources r2 = r27.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r9] = r10
            java.lang.String r2 = r2.getQuantityString(r6, r9, r5)
            r0.mo67477W0(r1, r2)
        L_0x00d1:
            r27.mo67590n1()
            r27.hideErrorView()
            r27.hideLoading()
            r1 = 0
            r0 = 2131953272(0x7f130678, float:1.954301E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 97
            r10 = 0
            r0 = r27
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118419a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r27.showEmpty()
            goto L_0x031f
        L_0x00f9:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x0155
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r0 = r2
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r0
            java.lang.String r0 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            r16 = r0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r15, r16, r17, r18, r19, r20)
            com.carrefour.fid.android.presentation.viewmodels.account.list.order.a r0 = r27.mo67578d1()
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r1 = r27.mo67582g1()
            r0.mo75082m(r1)
            androidx.viewbinding.b r0 = r27.getBinding()
            com.carrefour.fid.android.databinding.d0 r0 = (com.carrefour.fid.android.databinding.C36669d0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f90704d
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x0134
            r0.notifyDataSetChanged()
        L_0x0134:
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = 2131952749(0x7f13046d, float:1.954195E38)
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.fec_b…_category_limit_excecced)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x031f
        L_0x0155:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r0 == 0) goto L_0x0193
            androidx.viewbinding.b r0 = r27.getBinding()
            com.carrefour.fid.android.databinding.d0 r0 = (com.carrefour.fid.android.databinding.C36669d0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f90704d
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x016a
            r0.notifyDataSetChanged()
        L_0x016a:
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
            r0 = r2
            com.carrefour.fid.android.core.io.CategoryLimitationExceededThrowable r0 = (com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable) r0
            com.carrefour.fid.android.domain.models.CategoryLimitDomain r0 = r0.mo108325a()
            android.content.Context r2 = r27.requireContext()
            java.lang.String r3 = "requireContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = com.carrefour.fid.android.presentation.models.extension.C38464c.m159621a(r0, r2)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x031f
        L_0x0193:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r0 == 0) goto L_0x01c0
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = r2
            com.carrefour.fid.android.core.io.BasketThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketThrowable) r0
            com.carrefour.fid.android.core.type.BasketErrorType r0 = r0.mo108318a()
            int r0 = r0.mo108470q()
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(throwable.error.resourceId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x031f
        L_0x01c0:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            r11 = 0
            if (r0 == 0) goto L_0x0203
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.carrefour.fid.android.core.io.BasketUpdateThrowable r2 = (com.carrefour.fid.android.core.p057io.BasketUpdateThrowable) r2
            java.lang.Throwable r2 = r2.getCause()
            boolean r3 = r2 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r3 == 0) goto L_0x01d6
            r11 = r2
            com.carrefour.fid.android.shared.io.ResponseThrowable r11 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r11
        L_0x01d6:
            if (r11 == 0) goto L_0x01dd
            int r2 = r11.mo83810a()
            goto L_0x01de
        L_0x01dd:
            r2 = r9
        L_0x01de:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r9] = r2
            r2 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r2 = r14.getString(r2, r0)
            java.lang.String r0 = "getString(\n             …: 0\n                    )"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x031f
        L_0x0203:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            if (r0 == 0) goto L_0x022b
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r0 = r2
            com.carrefour.fid.android.core.io.ShoppingListThrowable r0 = (com.carrefour.fid.android.core.p057io.ShoppingListThrowable) r0
            java.lang.String r3 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            java.lang.Throwable r0 = r0.getCause()
            if (r0 != 0) goto L_0x021c
            r17 = r2
            goto L_0x021e
        L_0x021c:
            r17 = r0
        L_0x021e:
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r3
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r15, r16, r17, r18, r19, r20)
            goto L_0x031f
        L_0x022b:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketClosedStoreThrowable
            if (r0 == 0) goto L_0x0231
            r0 = r8
            goto L_0x0233
        L_0x0231:
            boolean r0 = r2 instanceof com.carrefour.fid.android.core.p057io.BasketExpiredFacilityStoreIdThrowable
        L_0x0233:
            if (r0 == 0) goto L_0x025a
            androidx.fragment.app.h r0 = r27.getActivity()
            if (r0 == 0) goto L_0x024a
            r1 = 2131951974(0x7f130166, float:1.9540378E38)
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r2 = "getString(R.string.basket_error_closed_store)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.carrefour.fid.android.shared.extension.ActivityKt.m118689B(r0, r8, r1)
        L_0x024a:
            r27.mo67593q1()
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleError$3 r0 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleError$3
            r0.<init>(r14)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r14, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r27)
            goto L_0x031f
        L_0x025a:
            boolean r0 = r2 instanceof com.carrefour.fid.android.shared.p046io.NetworkException
            if (r0 == 0) goto L_0x02a1
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r0 = r2
            com.carrefour.fid.android.shared.io.NetworkException r0 = (com.carrefour.fid.android.shared.p046io.NetworkException) r0
            java.lang.String r3 = r0.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            java.lang.Throwable r0 = r0.getCause()
            if (r0 != 0) goto L_0x0273
            r17 = r2
            goto L_0x0275
        L_0x0273:
            r17 = r0
        L_0x0275:
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r3
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r15, r16, r17, r18, r19, r20)
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131952789(0x7f130495, float:1.954203E38)
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.gener…error_no_network_message)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 2044(0x7fc, float:2.864E-42)
            r13 = 0
            r0 = r27
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x031f
        L_0x02a1:
            if (r2 == 0) goto L_0x031f
            com.carrefour.fid.android.shared.util.i r0 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r1 = r28.getMessage()
            if (r1 != 0) goto L_0x02ad
            java.lang.String r1 = ""
        L_0x02ad:
            r3 = 0
            r4 = 4
            r5 = 0
            r2 = r28
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = com.carrefour.fid.android.core.extension.FragmentKt.m148916b(r14, r7)
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment r0 = (com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment) r0
            if (r0 == 0) goto L_0x02d2
            com.carrefour.fid.android.core.type.AccountListType$Frequent r1 = com.carrefour.fid.android.core.type.AccountListType.Frequent.f89766d
            int r1 = r1.mo108407b()
            android.content.res.Resources r2 = r0.getResources()
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r9] = r10
            java.lang.String r2 = r2.getQuantityString(r6, r9, r3)
            r0.mo67477W0(r1, r2)
        L_0x02d2:
            r27.mo67590n1()
            r27.hideEmpty()
            r27.hideLoading()
            com.carrefour.fid.android.design.components.widgets.MessageComponent$a r1 = new com.carrefour.fid.android.design.components.widgets.MessageComponent$a
            android.content.Context r0 = r27.requireContext()
            r2 = 2131231396(0x7f0802a4, float:1.8078872E38)
            android.graphics.drawable.Drawable r16 = androidx.core.content.C17318d.m79726i(r0, r2)
            r0 = 2131952790(0x7f130496, float:1.9542033E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r2 = "getString(R.string.gener…server_not_responding_01)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r18 = 0
            r2 = 2131952813(0x7f1304ad, float:1.954208E38)
            java.lang.String r19 = r14.getString(r2)
            r20 = 0
            r21 = 0
            com.carrefour.fid.android.design.components.widgets.MessageComponent$Type r22 = com.carrefour.fid.android.design.components.widgets.MessageComponent.Type.ERROR
            r23 = 0
            r24 = 0
            r25 = 384(0x180, float:5.38E-43)
            r26 = 0
            r15 = r1
            r17 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r27
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118421c(r0, r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118423e(r14, r9, r8, r11)
        L_0x031f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.order.AccountListOrderFragment.mo67586j1(java.lang.Throwable):void");
    }

    /* renamed from: k1 */
    public final void mo67587k1(AccountListOrderViewModel.C25847a aVar) {
        if (aVar instanceof AccountListOrderViewModel.C25847a.C25848a) {
            C28796c navigator = getNavigator();
            C19232h activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.carrefour.fid.android.navigation.BottomNavActivity");
            AccountListOrderViewModel.C25847a.C25848a aVar2 = (AccountListOrderViewModel.C25847a.C25848a) aVar;
            navigator.mo83838n(((BottomNavActivity) activity).mo83823k(), OfferProductModelKt.m159574W(aVar2.mo75029f()), aVar2.mo75027e());
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [androidx.fragment.app.h] */
    /* JADX WARNING: type inference failed for: r7v6, types: [com.carrefour.fid.android.design.components.widgets.productcard.list.a] */
    /* JADX WARNING: type inference failed for: r7v8, types: [com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67588l1(java.util.List<? extends com.carrefour.fid.android.presentation.models.OfferModel> r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            if (r1 == 0) goto L_0x0160
            boolean r2 = r26.isEmpty()
            if (r2 == 0) goto L_0x0016
            com.carrefour.fid.android.shared.io.EmptyListThrowable r1 = new com.carrefour.fid.android.shared.io.EmptyListThrowable
            r1.<init>()
            r0.mo67586j1(r1)
            goto L_0x0160
        L_0x0016:
            r25.hideEmpty()
            r25.hideErrorView()
            r25.hideLoading()
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x002b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003d
            java.lang.Object r5 = r4.next()
            boolean r6 = r5 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r6 == 0) goto L_0x002b
            r3.add(r5)
            goto L_0x002b
        L_0x003d:
            int r3 = r3.size()
            java.lang.Class<com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment> r4 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.class
            java.lang.Object r4 = com.carrefour.fid.android.core.extension.FragmentKt.m148916b(r0, r4)
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment r4 = (com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment) r4
            r5 = 0
            if (r4 == 0) goto L_0x0067
            int r6 = r25.mo67584h1()
            android.content.res.Resources r7 = r25.getResources()
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r8[r5] = r9
            r9 = 2131820565(0x7f110015, float:1.9273849E38)
            java.lang.String r3 = r7.getQuantityString(r9, r3, r8)
            r4.mo67477W0(r6, r3)
        L_0x0067:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x0070:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0082
            java.lang.Object r6 = r4.next()
            boolean r7 = r6 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r7 == 0) goto L_0x0070
            r3.add(r6)
            goto L_0x0070
        L_0x0082:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x008b:
            boolean r6 = r2.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x00f7
            java.lang.Object r6 = r2.next()
            int r8 = r5 + 1
            if (r5 >= 0) goto L_0x009d
            kotlin.collections.CollectionsKt__CollectionsKt.m40459W()
        L_0x009d:
            com.carrefour.fid.android.presentation.models.OfferModel r6 = (com.carrefour.fid.android.presentation.models.OfferModel) r6
            boolean r5 = r6 instanceof com.carrefour.fid.android.presentation.models.OfferProductModel
            if (r5 == 0) goto L_0x00e9
            r9 = r6
            com.carrefour.fid.android.presentation.models.OfferProductModel r9 = (com.carrefour.fid.android.presentation.models.OfferProductModel) r9
            android.content.res.Resources r10 = r25.getResources()
            java.lang.String r5 = "resources"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$1 r11 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$1
            r11.<init>(r0, r6, r3)
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$2 r12 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$2
            r12.<init>(r0, r6, r3)
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$3 r13 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$3
            r13.<init>(r0, r6, r3)
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$4 r14 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$4
            r14.<init>(r0, r6)
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$5 r15 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$5
            r15.<init>(r0, r6)
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$6 r5 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$6
            r5.<init>(r0, r6)
            com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$7 r7 = new com.carrefour.fid.android.presentation.ui.account.list.order.AccountListOrderFragment$handleLastListResult$offerProductModels$1$7
            r7.<init>(r0, r6)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 7680(0x1e00, float:1.0762E-41)
            r24 = 0
            r16 = r5
            r17 = r7
            com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent$a r7 = com.carrefour.fid.android.presentation.models.mapper.C38510j.m159764b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x00f0
        L_0x00e9:
            boolean r5 = r6 instanceof com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a
            if (r5 == 0) goto L_0x00f0
            r7 = r6
            com.carrefour.fid.android.design.components.widgets.productcard.list.a r7 = (com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a) r7
        L_0x00f0:
            if (r7 == 0) goto L_0x00f5
            r4.add(r7)
        L_0x00f5:
            r5 = r8
            goto L_0x008b
        L_0x00f7:
            com.carrefour.fid.android.design.components.widgets.productcard.list.b r2 = r0.f58639w
            if (r2 != 0) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            r2.setList(r4)
        L_0x00ff:
            androidx.viewbinding.b r2 = r25.getBinding()
            com.carrefour.fid.android.databinding.d0 r2 = (com.carrefour.fid.android.databinding.C36669d0) r2
            androidx.recyclerview.widget.RecyclerView r8 = r2.f90704d
            androidx.fragment.app.h r2 = r25.getActivity()
            boolean r4 = r2 instanceof com.carrefour.fid.android.navigation.BottomNavActivity
            if (r4 == 0) goto L_0x0112
            r7 = r2
            com.carrefour.fid.android.navigation.BottomNavActivity r7 = (com.carrefour.fid.android.navigation.BottomNavActivity) r7
        L_0x0112:
            if (r7 == 0) goto L_0x012b
            android.os.Bundle r2 = r7.mo121105L1()
            if (r2 == 0) goto L_0x012b
            java.lang.String r4 = "KEY_LIST_LAST_ORDER_POSITION"
            android.os.Parcelable r2 = r2.getParcelable(r4)
            if (r2 == 0) goto L_0x012b
            androidx.recyclerview.widget.RecyclerView$o r4 = r8.getLayoutManager()
            if (r4 == 0) goto L_0x012b
            r4.mo59429v1(r2)
        L_0x012b:
            java.lang.String r2 = "handleLastListResult$lambda$7"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 7
            r13 = 0
            com.carrefour.fid.android.design.components.extension.ViewKt.m152123e(r8, r9, r10, r11, r12, r13)
            java.lang.Class<com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment> r2 = com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderFragment.class
            java.lang.Object r2 = com.carrefour.fid.android.core.extension.FragmentKt.m148916b(r0, r2)
            com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment r2 = (com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderFragment) r2
            if (r2 == 0) goto L_0x0152
            androidx.viewbinding.b r4 = r25.getBinding()
            com.carrefour.fid.android.databinding.d0 r4 = (com.carrefour.fid.android.databinding.C36669d0) r4
            androidx.recyclerview.widget.RecyclerView r4 = r4.f90704d
            java.lang.String r5 = "binding.listAccountListOrder"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r2.mo67956b1(r1, r4)
        L_0x0152:
            r25.mo67597t1()
            com.carrefour.fid.android.presentation.viewmodels.account.list.order.a r1 = r25.mo67578d1()
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r2 = r25.mo67582g1()
            r1.mo75083n(r3, r2)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.order.AccountListOrderFragment.mo67588l1(java.util.List):void");
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36669d0) getBinding()).f90705e;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerAccountListOrder");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo67589m1(OfferProductModel offerProductModel) {
        FragmentExtensionKt.m58756g(this, offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen.PRODUCTS, (ProductListSettingsModel) null, 4, (Object) null);
        FragmentExtensionKt.m58759j(this, new AccountListOrderFragment$handleOnMixingPressed$1(this));
        mo67599w1(offerProductModel, false);
        mo67578d1().mo75081l(mo67582g1());
    }

    /* renamed from: n1 */
    public final void mo67590n1() {
        ((C36669d0) getBinding()).f90703c.setVisibility(8);
        ((C36669d0) getBinding()).f90708h.setVisibility(8);
        ((C36669d0) getBinding()).f90704d.setVisibility(8);
    }

    /* renamed from: o0 */
    public final void mo67591o0(OfferProductModel offerProductModel, int i) {
        int p0 = offerProductModel.mo121519p0();
        if (p0 == 0) {
            mo67579e1().sendIntent(new AccountListOrderViewModel.C25849b.C25850a(offerProductModel));
            mo67578d1().mo75075f(offerProductModel, mo67582g1(), 1, i);
            return;
        }
        FragmentExtensionKt.m58759j(this, new AccountListOrderFragment$handleAtcPressed$1(this, offerProductModel, p0, i));
        QuantityBackDropFragment.C25492a.m109994b(QuantityBackDropFragment.f62741v, offerProductModel, offerProductModel.mo121519p0(), (BasketType) null, 4, (Object) null).show(requireActivity().mo57175g0(), (String) null);
    }

    public void onDestroyView() {
        ((C36669d0) getBinding()).f90704d.setAdapter((RecyclerView.Adapter) null);
        ((C36669d0) getBinding()).f90704d.setLayoutManager((RecyclerView.C20076o) null);
        super.onDestroyView();
    }

    public void onPause() {
        BottomNavActivity bottomNavActivity;
        super.onPause();
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        if (bottomNavActivity != null) {
            RecyclerView recyclerView = ((C36669d0) getBinding()).f90704d;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listAccountListOrder");
            bottomNavActivity.mo121090D2(saveRecyclerViewState(f58632Y, recyclerView));
        }
    }

    public void onResume() {
        super.onResume();
        mo67579e1().sendIntent(new AccountListOrderViewModel.C25849b.C25853d(mo67581f1()));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        AccountListFragment accountListFragment = (AccountListFragment) FragmentKt.m148916b(this, AccountListFragment.class);
        if (accountListFragment != null) {
            accountListFragment.mo67476V0(false);
            accountListFragment.mo67477W0(mo67584h1(), accountListFragment.getResources().getQuantityString(R.plurals.shoppinglist_list_item_number, 0, new Object[]{0}));
        }
        mo67590n1();
        RecyclerView recyclerView = ((C36669d0) getBinding()).f90704d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listAccountListOrder");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Resources.Theme theme = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "requireContext().theme");
        C23062c cVar = new C23062c(recyclerView, resources, theme);
        RecyclerView recyclerView2 = ((C36669d0) getBinding()).f90704d;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.listAccountListOrder");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f58639w = C37373c.m153543a(recyclerView2, requireContext, cVar);
        mo67578d1().mo75073d();
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C22988c(new AccountListOrderFragment$onViewCreated$2(this)));
        AccountListOrderViewModel e1 = mo67579e1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new AccountListOrderFragment$onViewCreated$$inlined$processState$1(this, e1, (C11045c) null, this), 3, (Object) null);
        AccountListOrderViewModel e12 = mo67579e1();
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner3), (CoroutineContext) null, (CoroutineStart) null, new AccountListOrderFragment$onViewCreated$$inlined$processEvent$1(this, e12, (C11045c) null, this), 3, (Object) null);
    }

    /* renamed from: p1 */
    public final void mo67592p1(C26636c cVar) {
        if (cVar.isLoading()) {
            mo67598v1();
        }
        List<OfferModel> m = cVar.mo77398m();
        if (m != null) {
            mo67588l1(m);
        }
        Throwable l = cVar.mo77397l();
        if (l != null) {
            mo67586j1(l);
        }
    }

    /* renamed from: q1 */
    public final void mo67593q1() {
        RecyclerView.Adapter adapter = ((C36669d0) getBinding()).f90704d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: r1 */
    public void mo67594r1() {
        mo67579e1().sendIntent(new AccountListOrderViewModel.C25849b.C25853d(mo67581f1()));
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo67594r1();
        return C11079d2.f28267a;
    }

    /* renamed from: s1 */
    public final void mo67595s1(@C12579k C25858a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58637g = aVar;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f58636f = cVar;
    }

    /* renamed from: t1 */
    public final void mo67597t1() {
        int i = C22987b.$EnumSwitchMapping$0[mo67582g1().ordinal()];
        if (i == 1) {
            ((C36669d0) getBinding()).f90703c.setVisibility(8);
            ((C36669d0) getBinding()).f90708h.setVisibility(0);
        } else if (i == 2) {
            ((C36669d0) getBinding()).f90703c.setVisibility(0);
            ((C36669d0) getBinding()).f90708h.setVisibility(8);
        }
        ((C36669d0) getBinding()).f90703c.setOnClickListener(new C23004a(this));
        RecyclerView recyclerView = ((C36669d0) getBinding()).f90704d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listAccountListOrder");
        ViewKt.m152123e(recyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
    }

    /* renamed from: v1 */
    public final void mo67598v1() {
        mo67590n1();
        hideEmpty();
        hideErrorView();
        showLoading();
    }

    /* renamed from: w1 */
    public final void mo67599w1(OfferProductModel offerProductModel, boolean z) {
        if (offerProductModel != null) {
            offerProductModel.mo121745l2(Boolean.valueOf(z));
        }
    }

    /* renamed from: z */
    public final void mo67600z(OfferProductModel offerProductModel) {
        mo67599w1(offerProductModel, false);
        mo67578d1().mo75078i(mo67582g1());
    }
}
