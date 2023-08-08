package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.C20171k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.catalogs.databinding.C39421l;
import com.carrefour.fid.android.catalogs.presentation.models.C39452e;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.C39492c;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.adapter.C39514a;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogDetailsViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39635a;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
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
@C11076d0(mo22515d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001:B\u0007¢\u0006\u0004\b7\u00108J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002J\u0016\u0010\u001b\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\bH\u0002J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002J\n\u0010$\u001a\u0004\u0018\u00010#H\u0002R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u0006;"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/list/CatalogProductListFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/catalogs/databinding/l;", "Lcom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/list/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "product", "X", "t0", "n0", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/a$b;", "state", "e1", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/a$a;", "event", "d1", "X0", "Z0", "b1", "", "Lcom/carrefour/fid/android/catalogs/presentation/models/e;", "list", "Y0", "", "loading", "a1", "c1", "", "value", "f1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "V0", "Lcom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/list/adapter/a;", "f", "Lcom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/list/adapter/a;", "catalogAdapter", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogDetailsViewModel;", "g", "Lkotlin/z;", "W0", "()Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogDetailsViewModel;", "viewModel", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "v", "Lcom/carrefour/fid/android/domain/models/catalog/Catalog;", "catalog", "", "w", "I", "currentVisiblePosition", "<init>", "()V", "x", "a", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCatalogProductListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogProductListFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/list/CatalogProductListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,180:1\n84#2,6:181\n168#3,7:187\n183#3,6:194\n262#4,2:200\n262#4,2:202\n262#4,2:204\n262#4,2:206\n262#4,2:208\n262#4,2:210\n262#4,2:212\n262#4,2:214\n262#4,2:216\n262#4,2:218\n262#4,2:220\n262#4,2:222\n262#4,2:224\n262#4,2:226\n262#4,2:228\n262#4,2:230\n*S KotlinDebug\n*F\n+ 1 CatalogProductListFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/details/tabs/list/CatalogProductListFragment\n*L\n45#1:181,6\n55#1:187,7\n56#1:194,6\n83#1:200,2\n84#1:202,2\n85#1:204,2\n90#1:206,2\n91#1:208,2\n92#1:210,2\n97#1:212,2\n98#1:214,2\n99#1:216,2\n103#1:218,2\n104#1:220,2\n105#1:222,2\n117#1:224,2\n119#1:226,2\n120#1:228,2\n121#1:230,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.CatalogProductListFragment */
public final class CatalogProductListFragment extends C39523d<C39421l> implements C39513a {
    @C12579k

    /* renamed from: x */
    public static final C39499a f101015x = new C39499a((DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final int f101016y = 8;
    @C12579k

    /* renamed from: z */
    public static final String f101017z = "catalog";
    @C12580l

    /* renamed from: f */
    public C39514a f101018f;
    @C12579k

    /* renamed from: g */
    public final C11677z f101019g = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CatalogDetailsViewModel.class), new C39508x1b608d1a(this), new C39509x1b608d1b(this));
    @C12580l

    /* renamed from: v */
    public Catalog f101020v;

    /* renamed from: w */
    public int f101021w;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.CatalogProductListFragment$a */
    public static final class C39499a {
        public /* synthetic */ C39499a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39499a() {
        }
    }

    public CatalogProductListFragment() {
        super(C394981.f101022a);
    }

    /* renamed from: V0 */
    public final LinearLayoutManager mo130659V0() {
        RecyclerView.C20076o layoutManager = ((C39421l) getBinding()).f100867h.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* renamed from: W0 */
    public final CatalogDetailsViewModel mo130660W0() {
        return (CatalogDetailsViewModel) this.f101019g.getValue();
    }

    /* renamed from: X */
    public void mo130661X(@C12579k CatalogProduct catalogProduct) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(catalogProduct, "product");
        LinearLayoutManager V0 = mo130659V0();
        if (V0 != null) {
            i = V0.mo59426t2();
        } else {
            i = 0;
        }
        this.f101021w = i;
        CatalogDetailsViewModel W0 = mo130660W0();
        Catalog catalog = this.f101020v;
        if (catalog != null) {
            str = catalog.mo117079z();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        W0.sendIntent(new C39635a.C39646c.C39652f(catalogProduct, true, str));
    }

    /* renamed from: X0 */
    public final void mo130662X0() {
        ((C39421l) getBinding()).f100861b.setVisibility(8);
        Group group = ((C39421l) getBinding()).f100869j;
        Intrinsics.checkNotNullExpressionValue(group, "binding.emptyGroup");
        group.setVisibility(8);
        RecyclerView recyclerView = ((C39421l) getBinding()).f100867h;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.catalogProductsRecyclerView");
        recyclerView.setVisibility(8);
        Group group2 = ((C39421l) getBinding()).f100870k;
        Intrinsics.checkNotNullExpressionValue(group2, "binding.notVisibleGroup");
        group2.setVisibility(0);
    }

    /* renamed from: Y0 */
    public final void mo130663Y0(List<C39452e> list) {
        Group group = ((C39421l) getBinding()).f100869j;
        Intrinsics.checkNotNullExpressionValue(group, "binding.emptyGroup");
        group.setVisibility(8);
        Group group2 = ((C39421l) getBinding()).f100870k;
        Intrinsics.checkNotNullExpressionValue(group2, "binding.notVisibleGroup");
        group2.setVisibility(8);
        RecyclerView recyclerView = ((C39421l) getBinding()).f100867h;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.catalogProductsRecyclerView");
        recyclerView.setVisibility(0);
        ((C39421l) getBinding()).f100861b.setVisibility(0);
        C39514a aVar = this.f101018f;
        if (aVar != null) {
            aVar.mo130682l(list);
        }
        C39514a aVar2 = this.f101018f;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
        RecyclerView.C20076o layoutManager = ((C39421l) getBinding()).f100867h.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.mo59385R1(this.f101021w);
        }
    }

    /* renamed from: Z0 */
    public final void mo130664Z0() {
        ((C39421l) getBinding()).f100861b.setVisibility(8);
        RecyclerView recyclerView = ((C39421l) getBinding()).f100867h;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.catalogProductsRecyclerView");
        recyclerView.setVisibility(8);
        Group group = ((C39421l) getBinding()).f100870k;
        Intrinsics.checkNotNullExpressionValue(group, "binding.notVisibleGroup");
        group.setVisibility(8);
        Group group2 = ((C39421l) getBinding()).f100869j;
        Intrinsics.checkNotNullExpressionValue(group2, "binding.emptyGroup");
        group2.setVisibility(8);
    }

    /* renamed from: a1 */
    public final void mo130665a1(boolean z) {
        int i;
        int i2;
        int i3;
        ShimmerFrameLayout shimmerFrameLayout = ((C39421l) getBinding()).f100868i;
        if (z) {
            shimmerFrameLayout.mo36996g();
        } else {
            shimmerFrameLayout.mo36997h();
        }
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "handleLoading$lambda$2");
        int i4 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        shimmerFrameLayout.setVisibility(i);
        Group group = ((C39421l) getBinding()).f100869j;
        Intrinsics.checkNotNullExpressionValue(group, "binding.emptyGroup");
        if (!z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        group.setVisibility(i2);
        Group group2 = ((C39421l) getBinding()).f100870k;
        Intrinsics.checkNotNullExpressionValue(group2, "binding.notVisibleGroup");
        if (!z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        group2.setVisibility(i3);
        RecyclerView recyclerView = ((C39421l) getBinding()).f100867h;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.catalogProductsRecyclerView");
        if (!(!z)) {
            i4 = 8;
        }
        recyclerView.setVisibility(i4);
    }

    /* renamed from: b1 */
    public final void mo130666b1() {
        ((C39421l) getBinding()).f100861b.setVisibility(0);
        RecyclerView recyclerView = ((C39421l) getBinding()).f100867h;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.catalogProductsRecyclerView");
        recyclerView.setVisibility(8);
        Group group = ((C39421l) getBinding()).f100870k;
        Intrinsics.checkNotNullExpressionValue(group, "binding.notVisibleGroup");
        group.setVisibility(8);
        Group group2 = ((C39421l) getBinding()).f100869j;
        Intrinsics.checkNotNullExpressionValue(group2, "binding.emptyGroup");
        group2.setVisibility(0);
    }

    /* renamed from: c1 */
    public final void mo130667c1() {
        ((C39421l) getBinding()).f100862c.setContent(C8553b.m31049c(1100729332, true, new CatalogProductListFragment$initUI$1(this)));
        ((C39421l) getBinding()).f100867h.mo59589n(new C20171k(getContext(), 1));
        this.f101018f = new C39514a(CollectionsKt__CollectionsKt.m40441E(), this, (C39524e) null, 4, (DefaultConstructorMarker) null);
        ((C39421l) getBinding()).f100867h.setAdapter(this.f101018f);
    }

    /* renamed from: d1 */
    public final void mo130668d1(C39635a.C39636a aVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C39635a.C39636a.C39637a.f101237a)) {
            throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e1 */
    public final void mo130669e1(C39635a.C39638b bVar) {
        if (bVar instanceof C39635a.C39638b.C39644f) {
            mo130665a1(((C39635a.C39638b.C39644f) bVar).isLoading());
        } else if (bVar instanceof C39635a.C39638b.C39640b) {
            mo130663Y0(((C39635a.C39638b.C39640b) bVar).mo130873h());
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C39635a.C39638b.C39645g.f101251b)) {
            mo130666b1();
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C39635a.C39638b.C39639a.f101239b)) {
            mo130662X0();
        } else if (Intrinsics.areEqual((Object) bVar, (Object) C39635a.C39638b.C39643e.f101247b)) {
            mo130664Z0();
        }
    }

    /* renamed from: f1 */
    public final void mo130670f1(String str) {
        Catalog catalog = this.f101020v;
        if (catalog != null) {
            if (str.length() >= 3) {
                mo130660W0().sendIntent(new C39635a.C39646c.C39647a(catalog, str));
            } else {
                mo130660W0().sendIntent(new C39635a.C39646c.C39647a(catalog, (String) null));
            }
        }
    }

    /* renamed from: n0 */
    public void mo130671n0(@C12579k CatalogProduct catalogProduct) {
        int i;
        Intrinsics.checkNotNullParameter(catalogProduct, "product");
        LinearLayoutManager V0 = mo130659V0();
        if (V0 != null) {
            i = V0.mo59426t2();
        } else {
            i = 0;
        }
        this.f101021w = i;
        FragmentKt.m118823k(this, C39492c.f101005a.mo130654a(catalogProduct));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Catalog catalog;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo130667c1();
        CatalogDetailsViewModel W0 = mo130660W0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new CatalogProductListFragment$onViewCreated$$inlined$processState$1(this, W0, (C11045c) null, this), 3, (Object) null);
        CatalogDetailsViewModel W02 = mo130660W0();
        C19499w viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        C11723c2 unused2 = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner2), (CoroutineContext) null, (CoroutineStart) null, new CatalogProductListFragment$onViewCreated$$inlined$processEvent$1(this, W02, (C11045c) null, this), 3, (Object) null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            catalog = (Catalog) arguments.getParcelable("catalog");
        } else {
            catalog = null;
        }
        this.f101020v = catalog;
        if (catalog != null) {
            mo130660W0().sendIntent(new C39635a.C39646c.C39647a(catalog, (String) null, 2, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: t0 */
    public void mo130672t0(@C12579k CatalogProduct catalogProduct) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(catalogProduct, "product");
        LinearLayoutManager V0 = mo130659V0();
        if (V0 != null) {
            i = V0.mo59426t2();
        } else {
            i = 0;
        }
        this.f101021w = i;
        CatalogDetailsViewModel W0 = mo130660W0();
        Catalog catalog = this.f101020v;
        if (catalog != null) {
            str = catalog.mo117079z();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        W0.sendIntent(new C39635a.C39646c.C39652f(catalogProduct, false, str));
    }
}
