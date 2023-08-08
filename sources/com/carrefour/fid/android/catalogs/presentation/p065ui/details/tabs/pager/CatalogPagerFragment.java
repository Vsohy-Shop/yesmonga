package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager;

import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39419j;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.adapters.CatalogPageAdapter;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogFullDetails;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.facebook.shimmer.ShimmerFrameLayout;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/pager/CatalogPagerFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/catalogs/databinding/j;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/a$b;", "state", "Z0", "", "loading", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "W0", "Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogFullDetails;", "details", "", "pagesNumber", "X0", "Y0", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "f", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "U0", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "a1", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogDetailsViewModel;", "g", "Lkotlin/z;", "V0", "()Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogDetailsViewModel;", "viewModel", "Lcom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/pager/adapters/CatalogPageAdapter;", "v", "Lcom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/pager/adapters/CatalogPageAdapter;", "pagerAdapter", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "w", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "catalog", "<init>", "()V", "x", "a", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCatalogPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogPagerFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/pager/CatalogPagerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,112:1\n84#2,6:113\n168#3,7:119\n262#4,2:126\n262#4,2:128\n262#4,2:130\n262#4,2:132\n262#4,2:134\n*S KotlinDebug\n*F\n+ 1 CatalogPagerFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/pager/CatalogPagerFragment\n*L\n36#1:113,6\n44#1:119,7\n63#1:126,2\n66#1:128,2\n69#1:130,2\n72#1:132,2\n83#1:134,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.CatalogPagerFragment */
public final class CatalogPagerFragment extends C39538c<C39419j> {
    @C12579k

    /* renamed from: x */
    public static final C39526a f101050x = new C39526a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f101051y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f101052z = "catalog";
    @Inject

    /* renamed from: f */
    public AppEnvironment f101053f;
    @C12579k

    /* renamed from: g */
    public final C11677z f101054g = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CatalogDetailsViewModel.class), new C39532x39b05f70(this), new C39533x39b05f71(this));

    /* renamed from: v */
    public CatalogPageAdapter f101055v;
    @C12580l

    /* renamed from: w */
    public Catalog f101056w;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.CatalogPagerFragment$a */
    public static final class C39526a {
        public /* synthetic */ C39526a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39526a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.CatalogPagerFragment$b */
    public static final class C39527b extends ViewPager2.C20817j {

        /* renamed from: a */
        public final /* synthetic */ CatalogPagerFragment f101058a;

        /* renamed from: b */
        public final /* synthetic */ String f101059b;

        public C39527b(CatalogPagerFragment catalogPagerFragment, String str) {
            this.f101058a = catalogPagerFragment;
            this.f101059b = str;
        }

        /* renamed from: c */
        public void mo30667c(int i) {
            int i2 = i + 1;
            Catalog R0 = this.f101058a.f101056w;
            if (R0 != null) {
                this.f101058a.mo130699V0().sendIntent(new C39635a.C39646c.C39649c(R0, String.valueOf(i2)));
            }
            CatalogPagerFragment.m161824Q0(this.f101058a).f100843c.setText(this.f101058a.getString(C39364b.C39383s.catalog_page_number_formator, String.valueOf(i2), this.f101059b));
            super.mo30667c(i);
        }
    }

    public CatalogPagerFragment() {
        super(C395251.f101057a);
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ C39419j m161824Q0(CatalogPagerFragment catalogPagerFragment) {
        return (C39419j) catalogPagerFragment.getBinding();
    }

    @C12579k
    /* renamed from: U0 */
    public final AppEnvironment mo130698U0() {
        AppEnvironment appEnvironment = this.f101053f;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    /* renamed from: V0 */
    public final CatalogDetailsViewModel mo130699V0() {
        return (CatalogDetailsViewModel) this.f101054g.getValue();
    }

    /* renamed from: W0 */
    public final ShimmerFrameLayout mo130700W0(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout;
        if (z) {
            ViewPager2 viewPager2 = ((C39419j) getBinding()).f100844d;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.catalogViewPager");
            viewPager2.setVisibility(8);
            shimmerFrameLayout = ((C39419j) getBinding()).f100845e;
            shimmerFrameLayout.mo36996g();
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "handleLoading$lambda$1");
            shimmerFrameLayout.setVisibility(0);
        } else {
            ViewPager2 viewPager22 = ((C39419j) getBinding()).f100844d;
            Intrinsics.checkNotNullExpressionValue(viewPager22, "binding.catalogViewPager");
            viewPager22.setVisibility(0);
            shimmerFrameLayout = ((C39419j) getBinding()).f100845e;
            shimmerFrameLayout.mo36997h();
            Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "handleLoading$lambda$2");
            shimmerFrameLayout.setVisibility(8);
        }
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "if (loading) {\n        b…e = false\n        }\n    }");
        return shimmerFrameLayout;
    }

    /* renamed from: X0 */
    public final void mo130701X0(CatalogFullDetails catalogFullDetails, String str) {
        if (this.f101055v == null) {
            this.f101055v = new CatalogPageAdapter(catalogFullDetails, new CatalogPagerFragment$handleStreamContent$2(this));
            C39419j jVar = (C39419j) getBinding();
            ViewPager2 viewPager2 = jVar.f100844d;
            CatalogPageAdapter catalogPageAdapter = this.f101055v;
            if (catalogPageAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
                catalogPageAdapter = null;
            }
            viewPager2.setAdapter(catalogPageAdapter);
            TextView textView = jVar.f100843c;
            Intrinsics.checkNotNullExpressionValue(textView, "catalogPageNumber");
            textView.setVisibility(0);
            int currentItem = jVar.f100844d.getCurrentItem() + 1;
            jVar.f100843c.setText(getString(C39364b.C39383s.catalog_page_number_formator, String.valueOf(currentItem), str));
            Catalog catalog = this.f101056w;
            if (catalog != null) {
                mo130699V0().sendIntent(new C39635a.C39646c.C39649c(catalog, String.valueOf(currentItem)));
            }
            mo130702Y0(str);
        }
    }

    /* renamed from: Y0 */
    public final void mo130702Y0(String str) {
        ((C39419j) getBinding()).f100844d.mo62469n(new C39527b(this, str));
    }

    /* renamed from: Z0 */
    public final void mo130703Z0(C39635a.C39638b bVar) {
        if (bVar instanceof C39635a.C39638b.C39641c) {
            C39635a.C39638b.C39641c cVar = (C39635a.C39638b.C39641c) bVar;
            mo130701X0(cVar.mo130883k(), cVar.mo130884l());
        } else if (bVar instanceof C39635a.C39638b.C39644f) {
            mo130700W0(((C39635a.C39638b.C39644f) bVar).isLoading());
        }
    }

    /* renamed from: a1 */
    public final void mo130704a1(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f101053f = appEnvironment;
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(@org.jetbrains.annotations.C12579k android.view.View r8, @org.jetbrains.annotations.C12580l android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            super.onViewCreated(r8, r9)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r8 = r7.mo130699V0()
            androidx.lifecycle.w r9 = r7.getViewLifecycleOwner()
            java.lang.String r0 = "viewLifecycleOwner"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.C19501x.m90847a(r9)
            r2 = 0
            r3 = 0
            com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.CatalogPagerFragment$onViewCreated$$inlined$processState$1 r4 = new com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.CatalogPagerFragment$onViewCreated$$inlined$processState$1
            r9 = 0
            r4.<init>(r7, r8, r9, r7)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r1, r2, r3, r4, r5, r6)
            android.os.Bundle r8 = r7.getArguments()
            if (r8 == 0) goto L_0x0035
            java.lang.String r9 = "catalog"
            android.os.Parcelable r8 = r8.getParcelable(r9)
            r9 = r8
            com.carrefour.fid.android.domain.models.catalog.Catalog r9 = (com.carrefour.fid.android.domain.models.catalog.Catalog) r9
        L_0x0035:
            r7.f101056w = r9
            if (r9 == 0) goto L_0x0057
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r8 = r7.mo130699V0()
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$b r0 = new com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$b
            r0.<init>(r9)
            r8.sendIntent(r0)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r8 = r7.mo130699V0()
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$e r9 = com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a.C39646c.C39651e.f101263a
            r8.sendIntent(r9)
            com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel r8 = r7.mo130699V0()
            com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.a$c$g r9 = com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a.C39646c.C39653g.f101269a
            r8.sendIntent(r9)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.CatalogPagerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
