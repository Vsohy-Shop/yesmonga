package com.carrefour.fid.android.presentation.p035ui.home.shop;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36765m6;
import com.carrefour.fid.android.domain.models.BasketAmounts;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.home.shop.adapter.C24203a;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.home.HomeOnlineShopDetailsViewModel;
import com.carrefour.fid.android.presentation.viewmodels.offer.state.C26636c;
import com.carrefour.fid.android.shared.extension.C28746b0;
import com.carrefour.fid.android.shared.extension.TextViewKt;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.C10164b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0016\u0010\u001e\u001a\u00020\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00069"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/home/shop/OnlineShopBasketDetailsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/m6;", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Landroid/content/Context;", "context", "onAttach", "onDetach", "onDestroyView", "Lcom/carrefour/fid/android/presentation/viewmodels/offer/state/c;", "state", "b1", "initListeners", "Y0", "Lcom/carrefour/fid/android/domain/models/BasketAmounts;", "amounts", "W0", "", "count", "X0", "", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "offerList", "V0", "Landroidx/recyclerview/widget/LinearLayoutManager;", "f", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeOnlineShopDetailsViewModel;", "g", "Lkotlin/z;", "U0", "()Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeOnlineShopDetailsViewModel;", "homeOnlineShopDetailsViewModel", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "v", "Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "T0", "()Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;", "c1", "(Lcom/carrefour/fid/android/presentation/viewmodels/home/HomeAnalyticsViewModel;)V", "homeAnalyticsViewModel", "Lcom/carrefour/fid/android/navigation/BottomNavActivity;", "w", "Lcom/carrefour/fid/android/navigation/BottomNavActivity;", "callback", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOnlineShopBasketDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnlineShopBasketDetailsFragment.kt\ncom/carrefour/fid/android/presentation/ui/home/shop/OnlineShopBasketDetailsFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n106#2,15:174\n168#3,7:189\n1#4:196\n800#5,11:197\n*S KotlinDebug\n*F\n+ 1 OnlineShopBasketDetailsFragment.kt\ncom/carrefour/fid/android/presentation/ui/home/shop/OnlineShopBasketDetailsFragment\n*L\n55#1:174,15\n81#1:189,7\n168#1:197,11\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.shop.OnlineShopBasketDetailsFragment */
public final class OnlineShopBasketDetailsFragment extends C24202a<C36765m6> {
    @C12579k

    /* renamed from: X */
    public static final String f60501X = "basket";
    @C12579k

    /* renamed from: x */
    public static final C24189a f60502x = new C24189a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f60503y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f60504z = "OnlineShopBasketDetailsFragment";
    @C12580l

    /* renamed from: f */
    public LinearLayoutManager f60505f = new OnlineShopBasketDetailsFragment$linearLayoutManager$1(getContext());
    @C12579k

    /* renamed from: g */
    public final C11677z f60506g;
    @Inject

    /* renamed from: v */
    public HomeAnalyticsViewModel f60507v;
    @C12580l

    /* renamed from: w */
    public BottomNavActivity f60508w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.home.shop.OnlineShopBasketDetailsFragment$a */
    public static final class C24189a {
        public /* synthetic */ C24189a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ OnlineShopBasketDetailsFragment m106555b(C24189a aVar, BasketDomain basketDomain, int i, Object obj) {
            if ((i & 1) != 0) {
                basketDomain = null;
            }
            return aVar.mo70810a(basketDomain);
        }

        @C12579k
        /* renamed from: a */
        public final OnlineShopBasketDetailsFragment mo70810a(@C12580l BasketDomain basketDomain) {
            OnlineShopBasketDetailsFragment onlineShopBasketDetailsFragment = new OnlineShopBasketDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("basket", basketDomain);
            onlineShopBasketDetailsFragment.setArguments(bundle);
            return onlineShopBasketDetailsFragment;
        }

        public C24189a() {
        }
    }

    public OnlineShopBasketDetailsFragment() {
        super(C241881.f60509a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C24196xea0a16cb(new C24195xea0a16ca(this)));
        this.f60506g = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(HomeOnlineShopDetailsViewModel.class), new C24197xea0a16cc(b), new C24198xea0a16cd((C11289a) null, b), new C24199xea0a16ce(this, b));
    }

    /* renamed from: Z0 */
    public static final void m106544Z0(OnlineShopBasketDetailsFragment onlineShopBasketDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(onlineShopBasketDetailsFragment, "this$0");
        onlineShopBasketDetailsFragment.mo70800T0().mo76715w();
        BottomNavActivity bottomNavActivity = onlineShopBasketDetailsFragment.f60508w;
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121113P1();
        }
    }

    /* renamed from: a1 */
    public static final void m106545a1(OnlineShopBasketDetailsFragment onlineShopBasketDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(onlineShopBasketDetailsFragment, "this$0");
        onlineShopBasketDetailsFragment.mo70800T0().mo76717y();
        BottomNavActivity bottomNavActivity = onlineShopBasketDetailsFragment.f60508w;
        if (bottomNavActivity != null) {
            bottomNavActivity.mo121113P1();
        }
    }

    @C12579k
    /* renamed from: T0 */
    public final HomeAnalyticsViewModel mo70800T0() {
        HomeAnalyticsViewModel homeAnalyticsViewModel = this.f60507v;
        if (homeAnalyticsViewModel != null) {
            return homeAnalyticsViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeAnalyticsViewModel");
        return null;
    }

    /* renamed from: U0 */
    public final HomeOnlineShopDetailsViewModel mo70801U0() {
        return (HomeOnlineShopDetailsViewModel) this.f60506g.getValue();
    }

    /* renamed from: V0 */
    public final void mo70802V0(List<? extends OfferModel> list) {
        C24203a aVar;
        hideLoading();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof OfferProductModel) {
                arrayList.add(next);
            }
        }
        RecyclerView.Adapter adapter = ((C36765m6) getBinding()).f91318c.getAdapter();
        if (adapter instanceof C24203a) {
            aVar = (C24203a) adapter;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo70824m(CollectionsKt___CollectionsKt.m40497E5(arrayList, 5));
        }
    }

    /* renamed from: W0 */
    public final void mo70803W0(BasketAmounts basketAmounts) {
        boolean z;
        C11079d2 d2Var = null;
        if (basketAmounts != null) {
            if (basketAmounts.mo115443r() == 0.0d) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                TextView textView = ((C36765m6) getBinding()).f91321f;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.textOnlineShopDetailsBasketDiscount");
                TextViewKt.m118963n(textView, String.valueOf(C28746b0.m119035f(Double.valueOf(basketAmounts.mo115443r()), 0, 1, (Object) null)));
            } else {
                ((C36765m6) getBinding()).f91321f.setVisibility(8);
            }
            TextView textView2 = ((C36765m6) getBinding()).f91323h;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.textOnlineShopDetailsBasketPrice");
            TextViewKt.m118963n(textView2, String.valueOf(basketAmounts.mo115452y()));
            d2Var = C11079d2.f28267a;
        }
        if (d2Var == null) {
            ((C36765m6) getBinding()).f91323h.setVisibility(8);
            ((C36765m6) getBinding()).f91321f.setVisibility(8);
        }
    }

    /* renamed from: X0 */
    public final void mo70804X0(int i) {
        TextView textView = ((C36765m6) getBinding()).f91320e;
        SpannableString spannableString = new SpannableString(getResources().getQuantityString(R.plurals.nhp_label_products_count, i, new Object[]{Integer.valueOf(i)}));
        spannableString.setSpan(new StyleSpan(1), 0, String.valueOf(i).length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(2.5f), 0, String.valueOf(i).length(), 33);
        textView.setText(spannableString);
    }

    /* renamed from: Y0 */
    public final void mo70805Y0() {
        BasketDomain basketDomain;
        Bundle arguments = getArguments();
        BasketDomain basketDomain2 = null;
        if (arguments != null) {
            basketDomain = (BasketDomain) arguments.getParcelable("basket");
        } else {
            basketDomain = null;
        }
        if (basketDomain instanceof BasketDomain) {
            basketDomain2 = basketDomain;
        }
        if (basketDomain2 == null || basketDomain2.mo115461D() <= 0) {
            ((C36765m6) getBinding()).f91317b.setVisibility(8);
            ((C36765m6) getBinding()).f91324i.setVisibility(8);
            ((C36765m6) getBinding()).f91318c.setVisibility(8);
            return;
        }
        mo70804X0(basketDomain2.mo115461D());
        mo70803W0(basketDomain2.mo115498v());
        mo70801U0().sendIntent(new HomeOnlineShopDetailsViewModel.C26373a.C26374a(basketDomain2));
    }

    /* renamed from: b1 */
    public final void mo70806b1(C26636c cVar) {
        if (cVar.isLoading()) {
            showLoading();
        }
        List<OfferModel> m = cVar.mo77398m();
        if (m != null) {
            mo70802V0(m);
        }
    }

    /* renamed from: c1 */
    public final void mo70807c1(@C12579k HomeAnalyticsViewModel homeAnalyticsViewModel) {
        Intrinsics.checkNotNullParameter(homeAnalyticsViewModel, "<set-?>");
        this.f60507v = homeAnalyticsViewModel;
    }

    public final void initListeners() {
        ((C36765m6) getBinding()).f91324i.setOnClickListener(new C24206c(this));
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new C24207d(this));
        }
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36765m6) getBinding()).f91319d;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.shimmerLayoutHomeOnlineShop");
        return shimmerFrameLayout;
    }

    public void onAttach(@C12579k Context context) {
        BottomNavActivity bottomNavActivity;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        super.onAttach(context);
        C19232h activity = getActivity();
        if (activity instanceof BottomNavActivity) {
            bottomNavActivity = (BottomNavActivity) activity;
        } else {
            bottomNavActivity = null;
        }
        this.f60508w = bottomNavActivity;
    }

    public void onDestroyView() {
        ((C36765m6) getBinding()).f91318c.setAdapter((RecyclerView.Adapter) null);
        this.f60505f = null;
        super.onDestroyView();
    }

    public void onDetach() {
        this.f60508w = null;
        super.onDetach();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = ((C36765m6) getBinding()).f91318c;
        recyclerView.setAdapter(new C24203a((List) null, 1, (DefaultConstructorMarker) null));
        recyclerView.setLayoutManager(this.f60505f);
        initListeners();
        mo70805Y0();
        mo70800T0().mo76716x();
        HomeOnlineShopDetailsViewModel U0 = mo70801U0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C24190x2a5d898b(this, U0, (C11045c) null, this), 3, (Object) null);
    }
}
