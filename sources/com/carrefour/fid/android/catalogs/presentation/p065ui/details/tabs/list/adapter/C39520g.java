package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.content.res.C0507a;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.catalogs.databinding.C39411b;
import com.carrefour.fid.android.catalogs.presentation.models.C39452e;
import com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.list.C39513a;
import com.carrefour.fid.android.catalogs.utils.C39709b;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.ImageUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.list.adapter.g */
public final class C39520g extends RecyclerView.C20061e0 {
    @C12579k

    /* renamed from: a */
    public final C39411b f101043a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39520g(@C12579k C39411b bVar) {
        super(bVar.getRoot());
        Intrinsics.checkNotNullParameter(bVar, "binding");
        this.f101043a = bVar;
    }

    /* renamed from: i */
    public static final void m161815i(boolean z, C39513a aVar, CatalogProduct catalogProduct, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$delegateData");
        Intrinsics.checkNotNullParameter(catalogProduct, "$product");
        if (z) {
            aVar.mo130672t0(catalogProduct);
        } else {
            aVar.mo130661X(catalogProduct);
        }
    }

    /* renamed from: j */
    public static final void m161816j(C39513a aVar, CatalogProduct catalogProduct, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$delegateData");
        Intrinsics.checkNotNullParameter(catalogProduct, "$product");
        aVar.mo130671n0(catalogProduct);
    }

    /* renamed from: e */
    public final void mo130689e(@C12579k C39452e eVar, @C12579k C39513a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(eVar, "item");
        Intrinsics.checkNotNullParameter(aVar, "delegateCata");
        if (eVar.mo130545e().mo117234s().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !C28932h.f70914a.mo84235e(eVar.mo130545e().mo117234s())) {
            this.f101043a.f100807i.setVisibility(0);
            this.f101043a.f100800b.setVisibility(0);
        }
        ImageUtils imageUtils = ImageUtils.f70796a;
        String x = eVar.mo130545e().mo117241x();
        ImageView imageView = this.f101043a.f100804f;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.productImage");
        imageUtils.mo84106j(x, imageView, C39364b.C39372h.ic_product_placeholder);
        String C = eVar.mo130545e().mo117210C();
        ImageView imageView2 = this.f101043a.f100806h;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.productPromo");
        imageUtils.mo84105i(C, imageView2);
        this.f101043a.f100805g.setText(eVar.mo130545e().mo117243z());
        this.f101043a.f100803e.setText(eVar.mo130545e().mo117233r());
        mo130691g(eVar.mo130547f());
        mo130692h(eVar.mo130545e(), eVar.mo130547f(), aVar);
        mo130693k(eVar.mo130545e());
    }

    @C12579k
    /* renamed from: f */
    public final C39411b mo130690f() {
        return this.f101043a;
    }

    /* renamed from: g */
    public final void mo130691g(boolean z) {
        int i;
        C39411b bVar = this.f101043a;
        ImageView imageView = bVar.f100802d;
        Context context = bVar.getRoot().getContext();
        if (z) {
            i = C39364b.C39372h.ic_add_list_ok;
        } else {
            i = C39364b.C39372h.ic_add_list;
        }
        imageView.setImageDrawable(C0507a.m2346b(context, i));
    }

    /* renamed from: h */
    public final void mo130692h(CatalogProduct catalogProduct, boolean z, C39513a aVar) {
        this.f101043a.f100802d.setOnClickListener(new C39518e(z, aVar, catalogProduct));
        this.f101043a.getRoot().setOnClickListener(new C39519f(aVar, catalogProduct));
    }

    /* renamed from: k */
    public final void mo130693k(CatalogProduct catalogProduct) {
        for (CatalogProductDescription h : catalogProduct.mo117237u()) {
            List<CatalogProductPicto> h2 = h.mo117256h();
            if (h2 != null) {
                for (CatalogProductPicto next : h2) {
                    if (Intrinsics.areEqual((Object) next.mo117268e(), (Object) C39709b.f101343g)) {
                        C22038b.m100350E(this.f101043a.f100804f.getContext()).mo65605u(next.mo117270f()).mo65688b(new C22561h().mo66742G(C39364b.C39372h.ic_product_placeholder)).mo65675K1(this.f101043a.f100801c);
                    }
                }
            }
        }
    }
}
