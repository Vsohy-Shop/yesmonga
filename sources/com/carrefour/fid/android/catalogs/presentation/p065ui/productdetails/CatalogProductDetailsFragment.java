package com.carrefour.fid.android.catalogs.presentation.p065ui.productdetails;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C17318d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19501x;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39420k;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogProductDetailsViewModel;
import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39666c;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/presentation/ui/productdetails/CatalogProductDetailsFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/catalogs/databinding/k;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "a1", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/mvi/c$b;", "state", "c1", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "product", "T0", "Y0", "", "isFavorite", "U0", "Z0", "Lcom/carrefour/fid/android/catalogs/presentation/ui/productdetails/c;", "f", "Landroidx/navigation/m;", "W0", "()Lcom/carrefour/fid/android/catalogs/presentation/ui/productdetails/c;", "args", "Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogProductDetailsViewModel;", "g", "Lkotlin/z;", "X0", "()Lcom/carrefour/fid/android/catalogs/presentation/viewmodel/CatalogProductDetailsViewModel;", "viewModel", "v", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "Lcom/carrefour/fid/android/shared/util/j;", "w", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCatalogProductDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogProductDetailsFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/productdetails/CatalogProductDetailsFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n42#2,3:119\n56#3,10:122\n168#4,7:132\n1#5:139\n*S KotlinDebug\n*F\n+ 1 CatalogProductDetailsFragment.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/productdetails/CatalogProductDetailsFragment\n*L\n26#1:119,3\n28#1:122,10\n39#1:132,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.productdetails.CatalogProductDetailsFragment */
public final class CatalogProductDetailsFragment extends C39584f<C39420k> {
    @C12579k

    /* renamed from: f */
    public final C19766m f101117f = new C19766m(C11342l0.m43547d(C39580c.class), new CatalogProductDetailsFragment$special$$inlined$navArgs$1(this));
    @C12579k

    /* renamed from: g */
    public final C11677z f101118g;
    @C12580l

    /* renamed from: v */
    public CatalogProduct f101119v;
    @Inject

    /* renamed from: w */
    public C28936j f101120w;

    public CatalogProductDetailsFragment() {
        super(C395691.f101121a);
        C39575x2f8645a3 catalogProductDetailsFragment$special$$inlined$viewModels$default$1 = new C39575x2f8645a3(this);
        this.f101118g = FragmentViewModelLazyKt.m89922g(this, C11342l0.m43547d(CatalogProductDetailsViewModel.class), new C39576x2f8645a4(catalogProductDetailsFragment$special$$inlined$viewModels$default$1), new C39577x2f8645a5(catalogProductDetailsFragment$special$$inlined$viewModels$default$1, this));
    }

    /* renamed from: V0 */
    public static final void m161899V0(CatalogProductDetailsFragment catalogProductDetailsFragment, boolean z, View view) {
        Intrinsics.checkNotNullParameter(catalogProductDetailsFragment, "this$0");
        CatalogProduct catalogProduct = catalogProductDetailsFragment.f101119v;
        if (catalogProduct != null) {
            catalogProductDetailsFragment.mo130766X0().sendIntent(new C39666c.C39672c.C39674b(catalogProduct, !z));
        }
    }

    /* renamed from: b1 */
    public static final void m161900b1(CatalogProductDetailsFragment catalogProductDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(catalogProductDetailsFragment, "this$0");
        C19736g.m91827a(catalogProductDetailsFragment).mo58152q0();
    }

    /* renamed from: T0 */
    public final void mo130763T0(CatalogProduct catalogProduct) {
        boolean z;
        mo130767Y0(catalogProduct);
        ((C39420k) getBinding()).f100856j.setText(catalogProduct.mo117213F());
        ((C39420k) getBinding()).f100854h.setText(catalogProduct.mo117243z());
        ((C39420k) getBinding()).f100850d.setText(catalogProduct.mo117233r());
        if (catalogProduct.mo117242y().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C39420k) getBinding()).f100848b.setVisibility(8);
        } else {
            ((C39420k) getBinding()).f100848b.setVisibility(0);
            ((C39420k) getBinding()).f100853g.setText(catalogProduct.mo117242y());
        }
        mo130768Z0(catalogProduct);
    }

    /* renamed from: U0 */
    public final void mo130764U0(boolean z) {
        int i;
        ImageView imageView = ((C39420k) getBinding()).f100857k;
        Context requireContext = requireContext();
        if (z) {
            i = C39364b.C39372h.ic_add_list_ok;
        } else {
            i = C39364b.C39372h.ic_add_list;
        }
        imageView.setImageDrawable(C17318d.m79726i(requireContext, i));
        ((C39420k) getBinding()).f100857k.setOnClickListener(new C39579b(this, z));
    }

    /* renamed from: W0 */
    public final C39580c mo130765W0() {
        return (C39580c) this.f101117f.getValue();
    }

    /* renamed from: X0 */
    public final CatalogProductDetailsViewModel mo130766X0() {
        return (CatalogProductDetailsViewModel) this.f101118g.getValue();
    }

    /* renamed from: Y0 */
    public final void mo130767Y0(CatalogProduct catalogProduct) {
        ((C39420k) getBinding()).f100858l.setText(catalogProduct.mo117243z());
        C22038b.m100352G(this).mo65605u(catalogProduct.mo117241x()).mo65688b(new C22561h().mo66742G(C39364b.C39372h.ic_coupon_placeholder)).mo65675K1(((C39420k) getBinding()).f100852f);
        C22038b.m100352G(this).mo65605u(catalogProduct.mo117210C()).mo65675K1(((C39420k) getBinding()).f100855i);
    }

    /* renamed from: Z0 */
    public final void mo130768Z0(CatalogProduct catalogProduct) {
        String str = "";
        for (CatalogProductDescription next : catalogProduct.mo117237u()) {
            List<CatalogProductPicto> h = next.mo117256h();
            if (h != null) {
                for (CatalogProductPicto f : h) {
                    C22038b.m100352G(this).mo65605u(f.mo117270f()).mo65688b(new C22561h().mo66742G(C39364b.C39372h.ic_product_placeholder)).mo65675K1(((C39420k) getBinding()).f100849c);
                }
            }
            str = str + next.mo117254f();
            ((C39420k) getBinding()).f100851e.setText(str);
        }
    }

    /* renamed from: a1 */
    public final void mo130769a1() {
        getFragmentUtil().mo32776b(this);
        ((C39420k) getBinding()).f100859m.setOnClickListener(new C39578a(this));
    }

    /* renamed from: c1 */
    public final void mo130770c1(C39666c.C39668b bVar) {
        if (bVar instanceof C39666c.C39668b.C39671c) {
            mo130764U0(((C39666c.C39668b.C39671c) bVar).mo130947h());
        }
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f101120w;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        mo130769a1();
        this.f101119v = mo130765W0().mo130780e();
        CatalogProductDetailsViewModel X0 = mo130766X0();
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new C39570x6fd9b864(this, X0, (C11045c) null, this), 3, (Object) null);
        CatalogProduct catalogProduct = this.f101119v;
        if (catalogProduct != null) {
            mo130763T0(catalogProduct);
            mo130766X0().sendIntent(new C39666c.C39672c.C39673a(catalogProduct));
        }
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f101120w = jVar;
    }
}
