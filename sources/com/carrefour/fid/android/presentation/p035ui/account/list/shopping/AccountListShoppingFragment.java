package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.core.extension.FragmentKt;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.databinding.C36639a0;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37370b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37373c;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.models.mapper.C38510j;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import com.carrefour.fid.android.presentation.p035ui.basketbuilder.BasketBuilderFragment;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.presentation.p035ui.product.quantity.QuantityBackDropFragment;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.AccountListShoppingViewModel;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26636c;
import com.carrefour.fid.android.shared.navigation.C28796c;
import com.carrefour.fid.android.shared.p046io.EmptyListThrowable;
import com.carrefour.fid.android.shared.util.events.C28928c;
import com.carrefour.fid.android.shared.util.events.EventLiveData;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\bM\u0010NJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\u001a\u0010 \u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020$H\u0016J\u001a\u0010*\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0014R\u001b\u00103\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u00100\u001a\u0004\bJ\u0010K¨\u0006Q"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/account/list/shopping/AccountListShoppingFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/a0;", "Lcom/carrefour/fid/android/presentation/viewmodels/offer/state/c;", "state", "Lkotlin/d2;", "j1", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/AccountListShoppingViewModel$b;", "uiEvent", "d1", "", "throwable", "", "g1", "n1", "", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "offerList", "h1", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "offer", "", "productPosition", "o0", "J", "e1", "D", "f1", "z", "k1", "", "isFeatureMixingProducts", "o1", "Landroid/view/ViewStub;", "errorMessageLayout", "emptyLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onDestroyView", "l1", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/AccountListShoppingViewModel;", "f", "Lkotlin/z;", "c1", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/AccountListShoppingViewModel;", "viewModel", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "g", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/b;", "adapter", "Lcom/carrefour/fid/android/shared/navigation/c;", "v", "Lcom/carrefour/fid/android/shared/navigation/c;", "getNavigator", "()Lcom/carrefour/fid/android/shared/navigation/c;", "setNavigator", "(Lcom/carrefour/fid/android/shared/navigation/c;)V", "navigator", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/a;", "w", "Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/a;", "a1", "()Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/a;", "m1", "(Lcom/carrefour/fid/android/presentation/viewmodels/account/list/shopping/a;)V", "accountListShoppingAnalyticsViewModel", "Lcom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment$ParentScreen;", "x", "b1", "()Lcom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment$ParentScreen;", "parentScreen", "<init>", "()V", "y", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountListShoppingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountListShoppingFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/AccountListShoppingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,516:1\n106#2,15:517\n168#3,7:532\n183#3,6:539\n1#4:545\n1#4:570\n800#5,11:546\n1569#5,11:557\n1864#5,2:568\n1866#5:571\n1580#5:572\n800#5,11:573\n*S KotlinDebug\n*F\n+ 1 AccountListShoppingFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/AccountListShoppingFragment\n*L\n85#1:517,15\n158#1:532,7\n159#1:539,6\n369#1:570\n363#1:546,11\n369#1:557,11\n369#1:568,2\n369#1:571\n369#1:572\n398#1:573,11\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment */
public final class AccountListShoppingFragment extends C23064d<C36639a0> {
    @C12579k

    /* renamed from: X */
    public static final String f58659X = "AccountListShoppingFragment";
    @C12579k

    /* renamed from: y */
    public static final C23009a f58660y = new C23009a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f58661z = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f58662f;
    @C12580l

    /* renamed from: g */
    public C37370b f58663g;
    @Inject

    /* renamed from: v */
    public C28796c f58664v;
    @Inject

    /* renamed from: w */
    public C25882a f58665w;
    @C12579k

    /* renamed from: x */
    public final C11677z f58666x = C10864b0.m38748c(new AccountListShoppingFragment$parentScreen$2(this));

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$a */
    public static final class C23009a {
        public /* synthetic */ C23009a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ AccountListShoppingFragment m103493b(C23009a aVar, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = null;
            }
            return aVar.mo67646a(bundle);
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final AccountListShoppingFragment mo67646a(@C12580l Bundle bundle) {
            AccountListShoppingFragment accountListShoppingFragment = new AccountListShoppingFragment();
            accountListShoppingFragment.setArguments(bundle);
            return accountListShoppingFragment;
        }

        public C23009a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$b */
    public static final class C23010b implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ C11300l f58668a;

        public C23010b(C11300l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "function");
            this.f58668a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4590a(Object obj) {
            this.f58668a.invoke(obj);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return this.f58668a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public AccountListShoppingFragment() {
        super(C230081.f58667a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C23022xf1306d8b(new C23021xf1306d8a(this)));
        this.f58662f = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(AccountListShoppingViewModel.class), new C23023xf1306d8c(b), new C23024xf1306d8d((C11289a) null, b), new C23025xf1306d8e(this, b));
    }

    @C12579k
    @C11384m
    /* renamed from: i1 */
    public static final AccountListShoppingFragment m103473i1(@C12580l Bundle bundle) {
        return f58660y.mo67646a(bundle);
    }

    /* renamed from: D */
    public final void mo67625D(OfferProductModel offerProductModel, int i) {
        mo67627a1().mo75159p(offerProductModel, mo67628b1(), i);
        mo67629c1().sendIntent(new AccountListShoppingViewModel.C25874c.C25880f(offerProductModel));
    }

    /* renamed from: J */
    public final void mo67626J(OfferProductModel offerProductModel, int i) {
        mo67629c1().sendIntent(new AccountListShoppingViewModel.C25874c.C25878d(offerProductModel, (Integer) null, 2, (DefaultConstructorMarker) null));
        mo67627a1().mo75155l(offerProductModel, mo67628b1(), offerProductModel.mo121519p0(), i);
    }

    @C12579k
    /* renamed from: a1 */
    public final C25882a mo67627a1() {
        C25882a aVar = this.f58665w;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountListShoppingAnalyticsViewModel");
        return null;
    }

    /* renamed from: b1 */
    public final AccountListFragment.ParentScreen mo67628b1() {
        return (AccountListFragment.ParentScreen) this.f58666x.getValue();
    }

    /* renamed from: c1 */
    public final AccountListShoppingViewModel mo67629c1() {
        return (AccountListShoppingViewModel) this.f58662f.getValue();
    }

    /* renamed from: d1 */
    public final void mo67630d1(AccountListShoppingViewModel.C25872b bVar) {
        if (bVar instanceof AccountListShoppingViewModel.C25872b.C25873a) {
            C28796c navigator = getNavigator();
            C19232h activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.carrefour.fid.android.navigation.BottomNavActivity");
            AccountListShoppingViewModel.C25872b.C25873a aVar = (AccountListShoppingViewModel.C25872b.C25873a) bVar;
            navigator.mo83838n(((BottomNavActivity) activity).mo83823k(), OfferProductModelKt.m159574W(aVar.mo75102f()), aVar.mo75100e());
        }
    }

    /* renamed from: e1 */
    public final void mo67631e1(OfferProductModel offerProductModel) {
        if (offerProductModel.mo121497A1()) {
            mo67629c1().sendIntent(new AccountListShoppingViewModel.C25874c.C25879e(offerProductModel));
            mo67627a1().mo75162s(offerProductModel, mo67628b1());
            return;
        }
        throw new IllegalStateException("We cannot add an item to the shopping list from the shopping list.".toString());
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C36639a0) getBinding()).f90540d;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubAccountListEmpty");
        return viewStub;
    }

    @C12579k
    public ViewStub errorMessageLayout() {
        ViewStub viewStub = ((C36639a0) getBinding()).f90541e;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubAccountListError");
        return viewStub;
    }

    /* renamed from: f1 */
    public final void mo67632f1(OfferProductModel offerProductModel) {
        FragmentExtensionKt.m58756g(this, offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen.PRODUCTS, (ProductListSettingsModel) null, 4, (Object) null);
        FragmentExtensionKt.m58759j(this, new AccountListShoppingFragment$handleOnMixingPressed$1(this));
        mo67642o1(offerProductModel, false);
        mo67627a1().mo75164u(mo67628b1());
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67633g1(java.lang.Throwable r28) {
        /*
            r27 = this;
            r14 = r27
            r0 = r28
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.p046io.RequireSignInThrowable
            r2 = 2131953705(0x7f130829, float:1.9543889E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 8
            r4 = 2131820565(0x7f110015, float:1.9273849E38)
            java.lang.Class<com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment> r5 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.class
            r7 = 1
            r8 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            if (r1 == 0) goto L_0x007a
            java.lang.Object r0 = com.carrefour.fid.android.core.extension.FragmentKt.m148916b(r14, r5)
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment r0 = (com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment) r0
            if (r0 == 0) goto L_0x0039
            com.carrefour.fid.android.core.type.AccountListType$Shopping r1 = com.carrefour.fid.android.core.type.AccountListType.Shopping.f89774d
            int r1 = r1.mo108407b()
            android.content.res.Resources r5 = r27.getResources()
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r8] = r6
            java.lang.String r4 = r5.getQuantityString(r4, r8, r7)
            r0.mo67477W0(r1, r4)
        L_0x0039:
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.a r0 = r27.mo67627a1()
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r1 = r27.mo67628b1()
            r0.mo75166w(r1)
            androidx.viewbinding.b r0 = r27.getBinding()
            com.carrefour.fid.android.databinding.a0 r0 = (com.carrefour.fid.android.databinding.C36639a0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f90538b
            r0.setVisibility(r3)
            r27.hideErrorView()
            r27.hideLoading()
            r1 = 0
            r0 = 2131953703(0x7f130827, float:1.9543884E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 2131952300(0x7f1302ac, float:1.9541039E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = 1
            r6 = 0
            com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$handleShoppingListError$1 r7 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$handleShoppingListError$1
            r7.<init>(r14)
            r8 = 33
            r9 = 0
            r0 = r27
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118419a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r27.showEmpty()
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x033f
        L_0x007a:
            boolean r1 = r0 instanceof com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable
            if (r1 == 0) goto L_0x008d
            com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$handleShoppingListError$2 r0 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$handleShoppingListError$2
            r0.<init>(r14)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r14, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r27)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x033f
        L_0x008d:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.ShoppingListSizeLimitReached
            if (r1 == 0) goto L_0x00b3
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r0 = 2131952909(0x7f13050d, float:1.9542274E38)
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.limit…t_quantity_error_message)"
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
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x033f
        L_0x00b3:
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.p046io.EmptyListThrowable
            if (r1 == 0) goto L_0x010f
            java.lang.Object r0 = com.carrefour.fid.android.core.extension.FragmentKt.m148916b(r14, r5)
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment r0 = (com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment) r0
            if (r0 == 0) goto L_0x00d4
            com.carrefour.fid.android.core.type.AccountListType$Shopping r1 = com.carrefour.fid.android.core.type.AccountListType.Shopping.f89774d
            int r1 = r1.mo108407b()
            android.content.res.Resources r5 = r27.getResources()
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r8] = r6
            java.lang.String r4 = r5.getQuantityString(r4, r8, r7)
            r0.mo67477W0(r1, r4)
        L_0x00d4:
            com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.a r0 = r27.mo67627a1()
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r1 = r27.mo67628b1()
            r0.mo75166w(r1)
            androidx.viewbinding.b r0 = r27.getBinding()
            com.carrefour.fid.android.databinding.a0 r0 = (com.carrefour.fid.android.databinding.C36639a0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f90538b
            r0.setVisibility(r3)
            r27.hideErrorView()
            r27.hideLoading()
            r1 = 0
            r3 = 0
            r0 = 2131953702(0x7f130826, float:1.9543882E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = 1
            r6 = 0
            com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$handleShoppingListError$3 r7 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$handleShoppingListError$3
            r7.<init>(r14)
            r8 = 37
            r9 = 0
            r0 = r27
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118419a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r27.showEmpty()
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x033f
        L_0x010f:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0162
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.BasketItemMaxQuantityReachedThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketItemMaxQuantityReachedThrowable) r0
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0122
            r16 = r2
            goto L_0x0124
        L_0x0122:
            r16 = r0
        L_0x0124:
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r15, r16, r17, r18, r19, r20)
            androidx.viewbinding.b r0 = r27.getBinding()
            com.carrefour.fid.android.databinding.a0 r0 = (com.carrefour.fid.android.databinding.C36639a0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f90538b
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x0140
            r0.notifyDataSetChanged()
        L_0x0140:
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
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x033f
        L_0x0162:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.CategoryLimitationExceededThrowable
            if (r1 == 0) goto L_0x01a0
            androidx.viewbinding.b r1 = r27.getBinding()
            com.carrefour.fid.android.databinding.a0 r1 = (com.carrefour.fid.android.databinding.C36639a0) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f90538b
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x0177
            r1.notifyDataSetChanged()
        L_0x0177:
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.WARNING
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
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x033f
        L_0x01a0:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketThrowable
            if (r1 == 0) goto L_0x01cd
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
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
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x033f
        L_0x01cd:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketUpdateThrowable
            r9 = 0
            if (r1 == 0) goto L_0x0211
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r1 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.carrefour.fid.android.core.io.BasketUpdateThrowable r0 = (com.carrefour.fid.android.core.p057io.BasketUpdateThrowable) r0
            java.lang.Throwable r0 = r0.getCause()
            boolean r3 = r0 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r3 == 0) goto L_0x01e3
            r9 = r0
            com.carrefour.fid.android.shared.io.ResponseThrowable r9 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r9
        L_0x01e3:
            if (r9 == 0) goto L_0x01ea
            int r0 = r9.mo83810a()
            goto L_0x01eb
        L_0x01ea:
            r0 = r8
        L_0x01eb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r8] = r0
            r0 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r2 = r14.getString(r0, r2)
            java.lang.String r0 = "getString(\n             …de ?: 0\n                )"
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
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x033f
        L_0x0211:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.ShoppingListThrowable
            if (r1 == 0) goto L_0x0233
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.ShoppingListThrowable r0 = (com.carrefour.fid.android.core.p057io.ShoppingListThrowable) r0
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0222
            r16 = r2
            goto L_0x0224
        L_0x0222:
            r16 = r0
        L_0x0224:
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r15, r16, r17, r18, r19, r20)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x033f
        L_0x0233:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketClosedStoreThrowable
            if (r1 == 0) goto L_0x0239
            r1 = r7
            goto L_0x023b
        L_0x0239:
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.p057io.BasketExpiredFacilityStoreIdThrowable
        L_0x023b:
            if (r1 == 0) goto L_0x0264
            androidx.fragment.app.h r0 = r27.getActivity()
            if (r0 == 0) goto L_0x0252
            r1 = 2131951974(0x7f130166, float:1.9540378E38)
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r2 = "getString(R.string.basket_error_closed_store)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.carrefour.fid.android.shared.extension.ActivityKt.m118689B(r0, r7, r1)
        L_0x0252:
            r27.mo67637k1()
            com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$handleShoppingListError$4 r0 = new com.carrefour.fid.android.presentation.ui.account.list.shopping.AccountListShoppingFragment$handleShoppingListError$4
            r0.<init>(r14)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58759j(r14, r0)
            com.carrefour.fid.android.app.extensions.FragmentExtensionKt.m58764o(r27)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x033f
        L_0x0264:
            boolean r1 = r0 instanceof com.carrefour.fid.android.shared.p046io.NetworkException
            if (r1 == 0) goto L_0x02ae
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            r1 = r0
            com.carrefour.fid.android.shared.io.NetworkException r1 = (com.carrefour.fid.android.shared.p046io.NetworkException) r1
            java.lang.String r2 = r1.getMessage()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            java.lang.Throwable r1 = r1.getCause()
            if (r1 != 0) goto L_0x027f
            r17 = r0
            goto L_0x0281
        L_0x027f:
            r17 = r1
        L_0x0281:
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r2
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
            com.carrefour.fid.android.design.components.widgets.j0 r0 = com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x033f
        L_0x02ae:
            if (r0 == 0) goto L_0x033d
            com.carrefour.fid.android.shared.util.i r15 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r0 = r28.getMessage()
            if (r0 != 0) goto L_0x02bb
            r16 = r2
            goto L_0x02bd
        L_0x02bb:
            r16 = r0
        L_0x02bd:
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r15, r16, r17, r18, r19, r20)
            java.lang.Object r0 = com.carrefour.fid.android.core.extension.FragmentKt.m148916b(r14, r5)
            com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment r0 = (com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment) r0
            if (r0 == 0) goto L_0x02e5
            com.carrefour.fid.android.core.type.AccountListType$Shopping r1 = com.carrefour.fid.android.core.type.AccountListType.Shopping.f89774d
            int r1 = r1.mo108407b()
            android.content.res.Resources r2 = r27.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r8] = r6
            java.lang.String r2 = r2.getQuantityString(r4, r8, r5)
            r0.mo67477W0(r1, r2)
        L_0x02e5:
            androidx.viewbinding.b r0 = r27.getBinding()
            com.carrefour.fid.android.databinding.a0 r0 = (com.carrefour.fid.android.databinding.C36639a0) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f90538b
            r0.setVisibility(r3)
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
            com.carrefour.fid.android.shared.base.C28500r.C28501a.m118423e(r14, r8, r7, r9)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            goto L_0x033f
        L_0x033d:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
        L_0x033f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.shopping.AccountListShoppingFragment.mo67633g1(java.lang.Throwable):java.lang.Object");
    }

    @C12579k
    public final C28796c getNavigator() {
        C28796c cVar = this.f58664v;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    /* renamed from: h1 */
    public final Object mo67635h1(List<? extends OfferModel> list) {
        Object obj;
        List<? extends OfferModel> list2 = list;
        if (list2 == null) {
            return C11079d2.f28267a;
        }
        if (list.isEmpty()) {
            return mo67633g1(new EmptyListThrowable());
        }
        hideEmpty();
        hideLoading();
        hideErrorView();
        Iterable iterable = list2;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (next instanceof OfferProductModel) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        AccountListFragment accountListFragment = (AccountListFragment) FragmentKt.m148916b(this, AccountListFragment.class);
        int i = 0;
        if (accountListFragment != null) {
            accountListFragment.mo67477W0(AccountListType.Shopping.f89774d.mo108407b(), getResources().getQuantityString(R.plurals.shoppinglist_list_item_number, size, new Object[]{Integer.valueOf(size)}));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            OfferModel offerModel = (OfferModel) next2;
            if (offerModel instanceof OfferProductModel) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                obj = C38510j.m159764b((OfferProductModel) offerModel, resources, new C23026xf3cad4cf(this, offerModel, i), new C23027xf3cad4d0(this, offerModel, i), new C23028xf3cad4d1(this, offerModel), new C23029xf3cad4d2(this, offerModel, i), new C23030xf3cad4d3(this, offerModel), new C23031xf3cad4d4(this, offerModel), new C23032xf3cad4d5(this, offerModel), false, false, false, false, (C11289a) null, 7680, (Object) null);
            } else if (offerModel instanceof C37369a) {
                obj = (C37369a) offerModel;
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
            i = i2;
        }
        C37370b bVar = this.f58663g;
        if (bVar != null) {
            bVar.setList(arrayList2);
        }
        RecyclerView recyclerView = ((C36639a0) getBinding()).f90538b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listAccountListDefault");
        ViewKt.m152123e(recyclerView, (Integer) null, false, (C11289a) null, 7, (Object) null);
        BasketBuilderFragment basketBuilderFragment = (BasketBuilderFragment) FragmentKt.m148916b(this, BasketBuilderFragment.class);
        if (basketBuilderFragment != null) {
            RecyclerView recyclerView2 = ((C36639a0) getBinding()).f90538b;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.listAccountListDefault");
            basketBuilderFragment.mo67956b1(list2, recyclerView2);
        }
        mo67627a1().mo75149f(mo67628b1());
        C25882a a1 = mo67627a1();
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : iterable) {
            if (next3 instanceof OfferProductModel) {
                arrayList3.add(next3);
            }
        }
        a1.mo75148e(arrayList3, mo67628b1());
        return C11079d2.f28267a;
    }

    /* renamed from: j1 */
    public final void mo67636j1(C26636c cVar) {
        if (cVar.isLoading()) {
            mo67640n1();
        }
        List<OfferModel> m = cVar.mo77398m();
        if (m != null) {
            mo67635h1(m);
        }
        Throwable l = cVar.mo77397l();
        if (l != null) {
            mo67633g1(l);
        }
    }

    /* renamed from: k1 */
    public final void mo67637k1() {
        RecyclerView.Adapter adapter = ((C36639a0) getBinding()).f90538b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: l1 */
    public void mo67638l1() {
        mo67629c1().sendIntent(AccountListShoppingViewModel.C25874c.C25877c.f63340b);
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36639a0) getBinding()).f90539c;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerAccountListDefault");
        return shimmerFrameLayout;
    }

    /* renamed from: m1 */
    public final void mo67639m1(@C12579k C25882a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58665w = aVar;
    }

    /* renamed from: n1 */
    public final void mo67640n1() {
        ((C36639a0) getBinding()).f90538b.setVisibility(8);
        hideEmpty();
        hideErrorView();
        showLoading();
    }

    /* renamed from: o0 */
    public final void mo67641o0(OfferProductModel offerProductModel, int i) {
        int p0 = offerProductModel.mo121519p0();
        String str = null;
        if (p0 == 0) {
            mo67629c1().sendIntent(new AccountListShoppingViewModel.C25874c.C25875a(offerProductModel));
            C25882a a1 = mo67627a1();
            a1.mo75153j(offerProductModel, mo67628b1(), 1, i);
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            ProductModel o0 = offerProductModel.mo121517o0();
            if (o0 != null) {
                str = o0.mo121889s();
            }
            if (str == null) {
                str = "";
            }
            a1.mo75165v(requireContext, str, 1);
            return;
        }
        FragmentExtensionKt.m58759j(this, new AccountListShoppingFragment$handleAtcPressed$2(this, offerProductModel, p0, i));
        QuantityBackDropFragment.C25492a.m109994b(QuantityBackDropFragment.f62741v, offerProductModel, offerProductModel.mo121519p0(), (BasketType) null, 4, (Object) null).show(requireActivity().mo57175g0(), (String) null);
    }

    /* renamed from: o1 */
    public final void mo67642o1(OfferProductModel offerProductModel, boolean z) {
        if (offerProductModel != null) {
            offerProductModel.mo121745l2(Boolean.valueOf(z));
        }
    }

    public void onDestroyView() {
        ((C36639a0) getBinding()).f90538b.setAdapter((RecyclerView.Adapter) null);
        ((C36639a0) getBinding()).f90538b.setLayoutManager((RecyclerView.C20076o) null);
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        mo67629c1().sendIntent(AccountListShoppingViewModel.C25874c.C25877c.f63340b);
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        AccountListFragment accountListFragment = (AccountListFragment) FragmentKt.m148916b(this, AccountListFragment.class);
        if (accountListFragment != null) {
            accountListFragment.mo67476V0(false);
            accountListFragment.mo67477W0(AccountListType.Shopping.f89774d.mo108407b(), accountListFragment.getResources().getQuantityString(R.plurals.shoppinglist_list_item_number, 0, new Object[]{0}));
        }
        mo67627a1().mo75150g();
        RecyclerView recyclerView = ((C36639a0) getBinding()).f90538b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.listAccountListDefault");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Resources.Theme theme = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "requireContext().theme");
        C23062c cVar = new C23062c(recyclerView, resources, theme);
        RecyclerView recyclerView2 = ((C36639a0) getBinding()).f90538b;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.listAccountListDefault");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f58663g = C37373c.m153543a(recyclerView2, requireContext, cVar);
        C28928c<String> a = EventLiveData.f70863b.mo84199a(C36168a.f89273a);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        a.mo57491k(viewLifecycleOwner, new C23010b(new AccountListShoppingFragment$onViewCreated$2(this)));
        AccountListShoppingViewModel c1 = mo67629c1();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new C23016x3183e04b(this, c1, (C11045c) null, this), 3, (Object) null);
        AccountListShoppingViewModel c12 = mo67629c1();
        C19499w viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner3), (CoroutineContext) null, (CoroutineStart) null, new C23011x508c3014(this, c12, (C11045c) null, this), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ C11079d2 retryFunction() {
        mo67638l1();
        return C11079d2.f28267a;
    }

    public final void setNavigator(@C12579k C28796c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f58664v = cVar;
    }

    /* renamed from: z */
    public final void mo67644z(OfferProductModel offerProductModel) {
        mo67642o1(offerProductModel, false);
        mo67627a1().mo75157n(mo67628b1());
    }
}
