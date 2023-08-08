package com.carrefour.fid.android.catalogs.presentation.p065ui.favoriteproducts;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.C20171k;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39418i;
import com.carrefour.fid.android.catalogs.presentation.models.C39452e;
import com.carrefour.fid.android.catalogs.presentation.p065ui.favoriteproducts.adapter.C39556d;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogFavoriteProductsViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39654b;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.shared.base.C28500r;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11677z;
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
@C11076d0(mo22515d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b$\u0010%J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0002R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/ui/favoriteproducts/CatalogsFavoriteProductListFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/catalogs/databinding/i;", "Lcom/carrefour/fid/android/catalogs/presentation/ui/favoriteproducts/adapter/d$a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "Landroid/view/ViewStub;", "emptyLayout", "v", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "product", "P", "m", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/b$b;", "state", "a1", "", "Lcom/carrefour/fid/android/catalogs/presentation/models/e;", "list", "V0", "Y0", "X0", "Lcom/carrefour/fid/android/catalogs/presentation/ui/favoriteproducts/adapter/d;", "f", "Lcom/carrefour/fid/android/catalogs/presentation/ui/favoriteproducts/adapter/d;", "catalogAdapter", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogFavoriteProductsViewModel;", "g", "Lkotlin/z;", "U0", "()Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogFavoriteProductsViewModel;", "viewModel", "<init>", "()V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nCatalogsFavoriteProductListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogsFavoriteProductListFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/favoriteproducts/CatalogsFavoriteProductListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,127:1\n56#2,10:128\n168#3,7:138\n262#4,2:145\n262#4,2:147\n262#4,2:149\n262#4,2:151\n*S KotlinDebug\n*F\n+ 1 CatalogsFavoriteProductListFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/favoriteproducts/CatalogsFavoriteProductListFragment\n*L\n35#1:128,10\n40#1:138,7\n65#1:145,2\n66#1:147,2\n78#1:149,2\n79#1:151,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.favoriteproducts.CatalogsFavoriteProductListFragment */
public final class CatalogsFavoriteProductListFragment extends C39568e<C39418i> implements C39556d.C39557a {

    /* renamed from: v */
    public static final int f101083v = 8;
    @C12580l

    /* renamed from: f */
    public C39556d f101084f;
    @C12579k

    /* renamed from: g */
    public final C11677z f101085g;

    public CatalogsFavoriteProductListFragment() {
        super(C395431.f101086a);
        C39549x26e038ae catalogsFavoriteProductListFragment$special$$inlined$viewModels$default$1 = new C39549x26e038ae(this);
        this.f101085g = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CatalogFavoriteProductsViewModel.class), new C39550x26e038af(catalogsFavoriteProductListFragment$special$$inlined$viewModels$default$1), new C39551x26e038b0(catalogsFavoriteProductListFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: W0 */
    public static final void m161862W0(CatalogsFavoriteProductListFragment catalogsFavoriteProductListFragment, View view) {
        Intrinsics.checkNotNullParameter(catalogsFavoriteProductListFragment, "this$0");
        catalogsFavoriteProductListFragment.mo130732X0();
    }

    /* renamed from: Z0 */
    public static final void m161863Z0(CatalogsFavoriteProductListFragment catalogsFavoriteProductListFragment, View view) {
        Intrinsics.checkNotNullParameter(catalogsFavoriteProductListFragment, "this$0");
        C19736g.m91827a(catalogsFavoriteProductListFragment).mo58152q0();
    }

    /* renamed from: P */
    public void mo130729P(@C12579k CatalogProduct catalogProduct) {
        Intrinsics.checkNotNullParameter(catalogProduct, "product");
        FragmentKt.m118823k(this, C39564c.f101108a.mo130759b(catalogProduct));
    }

    /* renamed from: U0 */
    public final CatalogFavoriteProductsViewModel mo130730U0() {
        return (CatalogFavoriteProductsViewModel) this.f101085g.getValue();
    }

    /* renamed from: V0 */
    public final void mo130731V0(List<C39452e> list) {
        String string = getString(C39364b.C39383s.my_catalogs_list);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.my_catalogs_list)");
        String quantityString = getResources().getQuantityString(C39364b.C39381q.catalogs_products_number, list.size(), new Object[]{Integer.valueOf(list.size())});
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…er, list.size, list.size)");
        TextView textView = ((C39418i) getBinding()).f100840l;
        SpannableString spannableString = new SpannableString(string + "\n" + quantityString);
        spannableString.setSpan(new RelativeSizeSpan(0.85f), string.length() + 1, spannableString.length(), 18);
        textView.setText(spannableString);
        if (list.isEmpty()) {
            RecyclerView recyclerView = ((C39418i) getBinding()).f100833e;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.catalogProductsRecyclerView");
            recyclerView.setVisibility(8);
            ImageButton imageButton = ((C39418i) getBinding()).f100835g;
            Intrinsics.checkNotNullExpressionValue(imageButton, "binding.deleteImageButton");
            imageButton.setVisibility(8);
            C28500r.C28501a.m118419a(this, (Integer) null, Integer.valueOf(C39364b.C39383s.favorite_products_empty_title), Integer.valueOf(C39364b.C39383s.favorite_products_empty_description), Integer.valueOf(C39364b.C39383s.see_my_catalogs), true, false, new CatalogsFavoriteProductListFragment$handleDataContent$2(this), 33, (Object) null);
            showEmpty();
            return;
        }
        RecyclerView recyclerView2 = ((C39418i) getBinding()).f100833e;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.catalogProductsRecyclerView");
        recyclerView2.setVisibility(0);
        ImageButton imageButton2 = ((C39418i) getBinding()).f100835g;
        Intrinsics.checkNotNullExpressionValue(imageButton2, "binding.deleteImageButton");
        imageButton2.setVisibility(0);
        ((C39418i) getBinding()).f100835g.setOnClickListener(new C39563b(this));
        C39556d dVar = this.f101084f;
        if (dVar != null) {
            dVar.mo130747t(list);
        }
    }

    /* renamed from: X0 */
    public final void mo130732X0() {
        String string = getString(C39364b.C39383s.catalog_favorite_list_delete_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.catal…vorite_list_delete_title)");
        FragmentKt.m118838z(this, string, "", getString(C39364b.C39383s.catalog_favorite_list_delete_promos_only), new CatalogsFavoriteProductListFragment$handleToolbarDeleteClick$1(this), getString(C39364b.C39383s.catalog_favorite_list_delete_all), false, new CatalogsFavoriteProductListFragment$handleToolbarDeleteClick$2(this), getString(C39364b.C39383s.general_cancel), CatalogsFavoriteProductListFragment$handleToolbarDeleteClick$3.f101091f, (C11289a) null, (Drawable) null, 0, 3616, (Object) null);
    }

    /* renamed from: Y0 */
    public final void mo130733Y0() {
        ((C39418i) getBinding()).f100833e.mo59589n(new C20171k(getContext(), 1));
        this.f101084f = new C39556d(this, (List) null, 2, (DefaultConstructorMarker) null);
        ((C39418i) getBinding()).f100833e.setAdapter(this.f101084f);
        ((C39418i) getBinding()).f100831c.setOnClickListener(new C39552a(this));
    }

    /* renamed from: a1 */
    public final void mo130734a1(C39654b.C39656b bVar) {
        if (bVar instanceof C39654b.C39656b.C39657a) {
            mo130731V0(((C39654b.C39656b.C39657a) bVar).mo130936j());
        }
    }

    @C12579k
    public ViewStub emptyLayout() {
        ViewStub viewStub = ((C39418i) getBinding()).f100838j;
        Intrinsics.checkNotNullExpressionValue(viewStub, "binding.stubEmptyView");
        return viewStub;
    }

    /* renamed from: m */
    public void mo130735m(@C12579k CatalogProduct catalogProduct) {
        Intrinsics.checkNotNullParameter(catalogProduct, "product");
        mo130730U0().sendIntent(new C39654b.C39660c.C39665e(catalogProduct));
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo130733Y0();
        CatalogFavoriteProductsViewModel U0 = mo130730U0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C39544x6733ab6f(this, U0, (C11045c) null, this), 3, (Object) null);
        mo130730U0().sendIntent(C39654b.C39660c.C39662b.f101279a);
    }

    /* renamed from: v */
    public void mo130736v() {
        mo130730U0().sendIntent(C39654b.C39660c.C39661a.f101277a);
        FragmentKt.m118823k(this, C39564c.f101108a.mo130758a());
    }
}
