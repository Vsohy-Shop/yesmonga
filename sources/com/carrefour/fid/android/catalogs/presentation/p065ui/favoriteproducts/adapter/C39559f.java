package com.carrefour.fid.android.catalogs.presentation.p065ui.favoriteproducts.adapter;

import com.carrefour.fid.android.catalogs.databinding.C39410a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCatalogProductViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogProductViewHolder.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/favoriteproducts/adapter/FavoriteCatalogItemViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1855#2:81\n1856#2:83\n1#3:82\n*S KotlinDebug\n*F\n+ 1 CatalogProductViewHolder.kt\ncom/carrefour/fid/android/catalogs/presentation/ui/favoriteproducts/adapter/FavoriteCatalogItemViewHolder\n*L\n62#1:81\n62#1:83\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.favoriteproducts.adapter.f */
public final class C39559f extends C39558e {
    @C12579k

    /* renamed from: b */
    public static final C39560a f101101b = new C39560a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f101102c = 2;
    @C12579k

    /* renamed from: a */
    public final C39410a f101103a;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.favoriteproducts.adapter.f$a */
    public static final class C39560a {
        public /* synthetic */ C39560a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39560a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39559f(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.catalogs.databinding.C39410a r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f101103a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.favoriteproducts.adapter.C39559f.<init>(com.carrefour.fid.android.catalogs.databinding.a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo130748c(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.catalogs.presentation.models.C39452e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "listItem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.carrefour.fid.android.catalogs.databinding.a r0 = r9.f101103a
            android.widget.ImageButton r0 = r0.f100790b
            boolean r1 = r10.mo130547f()
            r0.setActivated(r1)
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r0 = r10.mo130545e()
            java.lang.String r0 = r0.mo117234s()
            boolean r0 = kotlin.text.C11622t.isBlank(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x0040
            com.carrefour.fid.android.shared.util.h$a r0 = com.carrefour.fid.android.shared.util.C28932h.f70914a
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r4 = r10.mo130545e()
            java.lang.String r4 = r4.mo117234s()
            boolean r0 = r0.mo84235e(r4)
            if (r0 == 0) goto L_0x0040
            com.carrefour.fid.android.catalogs.databinding.a r0 = r9.f101103a
            androidx.constraintlayout.widget.Group r0 = r0.f100791c
            r0.setVisibility(r2)
            android.view.View r0 = r9.itemView
            r0.setEnabled(r3)
            goto L_0x004c
        L_0x0040:
            com.carrefour.fid.android.catalogs.databinding.a r0 = r9.f101103a
            androidx.constraintlayout.widget.Group r0 = r0.f100791c
            r0.setVisibility(r3)
            android.view.View r0 = r9.itemView
            r0.setEnabled(r1)
        L_0x004c:
            com.carrefour.fid.android.catalogs.databinding.a r0 = r9.f101103a
            android.widget.TextView r0 = r0.f100797i
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r1 = r10.mo130545e()
            java.lang.String r1 = r1.mo117243z()
            r0.setText(r1)
            com.carrefour.fid.android.catalogs.databinding.a r0 = r9.f101103a
            android.widget.TextView r0 = r0.f100796h
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r1 = r10.mo130545e()
            java.lang.String r1 = r1.mo117233r()
            r0.setText(r1)
            com.carrefour.fid.android.shared.util.ImageUtils r0 = com.carrefour.fid.android.shared.util.ImageUtils.f70796a
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r1 = r10.mo130545e()
            java.lang.String r1 = r1.mo117241x()
            com.carrefour.fid.android.catalogs.databinding.a r4 = r9.f101103a
            android.widget.ImageView r4 = r4.f100792d
            java.lang.String r5 = "binding.imageAccountListStoreCatalogCatalog"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            int r5 = com.carrefour.fid.android.catalogs.C39364b.C39372h.ic_product_placeholder
            r0.mo84106j(r1, r4, r5)
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r1 = r10.mo130545e()
            java.lang.String r1 = r1.mo117210C()
            com.carrefour.fid.android.catalogs.databinding.a r4 = r9.f101103a
            android.widget.ImageView r4 = r4.f100795g
            java.lang.String r5 = "binding.imageAccountListStoreCatalogPromo"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.mo84105i(r1, r4)
            com.carrefour.fid.android.catalogs.databinding.a r0 = r9.f101103a
            android.widget.ImageView r0 = r0.f100794f
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r1 = r10.mo130545e()
            java.util.List r1 = r1.mo117237u()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00a8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x010f
            java.lang.Object r4 = r1.next()
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription r4 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription) r4
            java.util.List r4 = r4.mo117256h()
            r5 = 0
            if (r4 == 0) goto L_0x00dd
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00c1:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00db
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto r7 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto) r7
            java.lang.String r7 = r7.mo117268e()
            java.lang.String r8 = "2222884"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x00c1
            r5 = r6
        L_0x00db:
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto r5 = (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto) r5
        L_0x00dd:
            if (r5 == 0) goto L_0x00a8
            r0.setVisibility(r3)
            android.view.View r0 = r9.itemView
            android.content.Context r0 = r0.getContext()
            com.bumptech.glide.j r0 = com.bumptech.glide.C22038b.m100350E(r0)
            com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r10 = r10.mo130545e()
            java.lang.String r10 = r10.mo117210C()
            com.bumptech.glide.i r10 = r0.mo65605u(r10)
            com.bumptech.glide.request.h r0 = new com.bumptech.glide.request.h
            r0.<init>()
            int r1 = com.carrefour.fid.android.catalogs.C39364b.C39372h.ic_product_placeholder
            com.bumptech.glide.request.a r0 = r0.mo66742G(r1)
            com.bumptech.glide.i r10 = r10.mo65688b(r0)
            com.carrefour.fid.android.catalogs.databinding.a r0 = r9.f101103a
            android.widget.ImageView r0 = r0.f100795g
            r10.mo65675K1(r0)
            goto L_0x0112
        L_0x010f:
            r0.setVisibility(r2)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.presentation.p065ui.favoriteproducts.adapter.C39559f.mo130748c(com.carrefour.fid.android.catalogs.presentation.models.e):void");
    }

    @C12579k
    /* renamed from: d */
    public final C39410a mo130749d() {
        return this.f101103a;
    }
}
