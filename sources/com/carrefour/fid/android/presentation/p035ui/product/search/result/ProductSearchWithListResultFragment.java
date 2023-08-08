package com.carrefour.fid.android.presentation.p035ui.product.search.result;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.databinding.C36772n3;
import com.carrefour.fid.android.presentation.viewmodels.product.search.ProductSearchWithListResultViewModel;
import com.carrefour.fid.android.shared.base.BaseViewPagerAdapter;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.C10164b;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\f\u0010\u0011\u001a\u00020\u0007*\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/product/search/result/ProductSearchWithListResultFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/databinding/n3;", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingLayout", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "initHeader", "", "isSearchWithListAvailable", "Y0", "Lcom/google/android/material/tabs/TabLayout;", "U0", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListResultViewModel$a;", "event", "X0", "Lcom/carrefour/fid/android/presentation/ui/product/search/result/r;", "f", "Landroidx/navigation/m;", "V0", "()Lcom/carrefour/fid/android/presentation/ui/product/search/result/r;", "navArgs", "", "g", "I", "currentTab", "Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListResultViewModel;", "v", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListResultViewModel;", "viewModel", "Lcom/google/android/material/tabs/TabLayout$f;", "w", "Lcom/google/android/material/tabs/TabLayout$f;", "onTabSelectedListener", "<init>", "()V", "x", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductSearchWithListResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSearchWithListResultFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/result/ProductSearchWithListResultFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n42#2,3:165\n106#3,15:168\n183#4,6:183\n262#5,2:189\n1855#6,2:191\n1#7:193\n*S KotlinDebug\n*F\n+ 1 ProductSearchWithListResultFragment.kt\ncom/carrefour/fid/android/presentation/ui/product/search/result/ProductSearchWithListResultFragment\n*L\n33#1:165,3\n44#1:168,15\n60#1:183,6\n82#1:189,2\n133#1:191,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListResultFragment */
public final class ProductSearchWithListResultFragment extends C25673j<C36772n3> {
    @C12579k

    /* renamed from: X */
    public static final String f62914X = "SEARCH_WITH_LIST_RESULT";

    /* renamed from: Y */
    public static final int f62915Y = 0;

    /* renamed from: Z */
    public static final int f62916Z = 1;
    @C12579k

    /* renamed from: x */
    public static final C25646a f62917x = new C25646a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f62918y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f62919z = "ProductSearchWithListResultFragment";
    @C12579k

    /* renamed from: f */
    public final C19766m f62920f = new C19766m(C11342l0.m43547d(C25681r.class), new ProductSearchWithListResultFragment$special$$inlined$navArgs$1(this));

    /* renamed from: g */
    public int f62921g;
    @C12579k

    /* renamed from: v */
    public final C11677z f62922v;
    @C12580l

    /* renamed from: w */
    public TabLayout.C31610f f62923w;

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListResultFragment$a */
    public static final class C25646a {
        public /* synthetic */ C25646a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C25646a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListResultFragment$b */
    public static final class C25647b implements TabLayout.C31610f {

        /* renamed from: a */
        public final /* synthetic */ ProductSearchWithListResultFragment f62925a;

        public C25647b(ProductSearchWithListResultFragment productSearchWithListResultFragment) {
            this.f62925a = productSearchWithListResultFragment;
        }

        /* renamed from: a */
        public void mo67964a(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
            ProductSearchWithListResultFragment.m110286Q0(this.f62925a).f91364f.setCurrentItem(iVar.mo91427k());
        }

        /* renamed from: b */
        public void mo67965b(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
        }

        /* renamed from: c */
        public void mo67966c(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.product.search.result.ProductSearchWithListResultFragment$c */
    public static final class C25648c extends ViewPager2.C20817j {

        /* renamed from: a */
        public final /* synthetic */ ProductSearchWithListResultFragment f62926a;

        public C25648c(ProductSearchWithListResultFragment productSearchWithListResultFragment) {
            this.f62926a = productSearchWithListResultFragment;
        }

        /* renamed from: c */
        public void mo30667c(int i) {
            this.f62926a.f62921g = i;
        }
    }

    public ProductSearchWithListResultFragment() {
        super(C256451.f62924a);
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new C25655x3c7cacf0(new C25654x3c7cacef(this)));
        this.f62922v = FragmentViewModelLazyKt.m89923h(this, C11342l0.m43547d(ProductSearchWithListResultViewModel.class), new C25656x3c7cacf1(b), new C25657x3c7cacf2((C11289a) null, b), new C25658x3c7cacf3(this, b));
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ C36772n3 m110286Q0(ProductSearchWithListResultFragment productSearchWithListResultFragment) {
        return (C36772n3) productSearchWithListResultFragment.getBinding();
    }

    /* renamed from: U0 */
    public final void mo74556U0(TabLayout tabLayout) {
        TabLayout.C31610f fVar = this.f62923w;
        if (fVar != null) {
            tabLayout.mo91282J(fVar);
        }
        C25647b bVar = new C25647b(this);
        this.f62923w = bVar;
        tabLayout.mo91298d(bVar);
    }

    /* renamed from: V0 */
    public final C25681r mo74557V0() {
        return (C25681r) this.f62920f.getValue();
    }

    /* renamed from: W0 */
    public final ProductSearchWithListResultViewModel mo74558W0() {
        return (ProductSearchWithListResultViewModel) this.f62922v.getValue();
    }

    /* renamed from: X0 */
    public final void mo74559X0(ProductSearchWithListResultViewModel.C27258a aVar) {
        if (aVar instanceof ProductSearchWithListResultViewModel.C27258a.C27259a) {
            mo74560Y0(((ProductSearchWithListResultViewModel.C27258a.C27259a) aVar).mo79279d());
        }
    }

    /* renamed from: Y0 */
    public final void mo74560Y0(boolean z) {
        int i;
        List list;
        List<CharSequence> list2;
        TabLayout tabLayout = ((C36772n3) getBinding()).f91363e;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "binding.searchWithListResultTagline");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        tabLayout.setVisibility(i);
        Bundle f = mo74557V0().mo74616f();
        if (((C36772n3) getBinding()).f91363e.getTabCount() == 0) {
            if (z) {
                list = CollectionsKt__CollectionsKt.m40448L(ProductSearchWithListAllResultsFragment.f62879x.mo74509b(f), ProductSearchWithListRecommendationResultsFragment.f62897y.mo74547b(f));
            } else {
                list = C10976s.m41419k(ProductSearchWithListRecommendationResultsFragment.f62897y.mo74547b(f));
            }
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.content.Context");
            BaseViewPagerAdapter baseViewPagerAdapter = new BaseViewPagerAdapter(this, context);
            ViewPager2 viewPager2 = ((C36772n3) getBinding()).f91364f;
            viewPager2.setSaveEnabled(true);
            if (viewPager2.getAdapter() == null) {
                baseViewPagerAdapter.mo83350H(list);
                viewPager2.setAdapter(baseViewPagerAdapter);
            } else {
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
            ((C36772n3) getBinding()).f91364f.setOffscreenPageLimit(2);
            ((C36772n3) getBinding()).f91364f.setUserInputEnabled(false);
            if (z) {
                list2 = CollectionsKt__CollectionsKt.m40448L(getText(R.string.search_with_list_all_results), getText(R.string.search_with_list_recommendation_results));
            } else {
                list2 = C10976s.m41419k(getText(R.string.search_with_list_all_results));
            }
            ((C36772n3) getBinding()).f91364f.setCurrentItem(this.f62921g);
            ((C36772n3) getBinding()).f91364f.mo62469n(new C25648c(this));
            if (z) {
                TabLayout tabLayout2 = ((C36772n3) getBinding()).f91363e;
                tabLayout2.mo91280H();
                for (CharSequence D : list2) {
                    tabLayout2.mo91299e(tabLayout2.mo91277E().mo91419D(D));
                }
                tabLayout2.mo91286N(tabLayout2.mo91367z(this.f62921g));
                Intrinsics.checkNotNullExpressionValue(tabLayout2, "initUi$lambda$3");
                mo74556U0(tabLayout2);
            }
        }
    }

    public final void initHeader() {
        FragmentExtensionKt.m58757h(this);
        ((C36772n3) getBinding()).f91360b.setContent(C8553b.m31049c(1962152661, true, new ProductSearchWithListResultFragment$initHeader$1(this)));
    }

    @C12579k
    public ShimmerFrameLayout loadingLayout() {
        ShimmerFrameLayout shimmerFrameLayout = ((C36772n3) getBinding()).f91362d;
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "binding.searchWithListResultShimmer");
        return shimmerFrameLayout;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        this.f62921g = mo74557V0().mo74617g();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initHeader();
        ProductSearchWithListResultViewModel W0 = mo74558W0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C25649x9bd86f79(this, W0, (C11045c) null, this), 3, (Object) null);
        C19501x.m90847a(this).mo57477c(new ProductSearchWithListResultFragment$onViewCreated$2(this, (C11045c<? super ProductSearchWithListResultFragment$onViewCreated$2>) null));
    }
}
