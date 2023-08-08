package com.carrefour.fid.android.catalogs.data.local.mapper;

import com.carrefour.fid.android.CatalogProduct;
import com.carrefour.fid.android.CatalogProductDescription;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductPicto;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDomainToProto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DomainToProto.kt\ncom/carrefour/fid/android/catalogs/data/local/mapper/DomainToProtoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1549#2:39\n1620#2,3:40\n1549#2:43\n1620#2,3:44\n*S KotlinDebug\n*F\n+ 1 DomainToProto.kt\ncom/carrefour/fid/android/catalogs/data/local/mapper/DomainToProtoKt\n*L\n23#1:39\n23#1:40,3\n31#1:43\n31#1:44,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.catalogs.data.local.mapper.a */
public final class C39405a {
    /* renamed from: a */
    public static final CatalogProductDescription m161513a(@C12579k com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription catalogProductDescription) {
        List list;
        Intrinsics.checkNotNullParameter(catalogProductDescription, "<this>");
        CatalogProductDescription.C13118b d0 = CatalogProductDescription.newBuilder().mo30778b0(catalogProductDescription.mo117254f()).mo30780d0(catalogProductDescription.mo117255g());
        List<CatalogProductPicto> h = catalogProductDescription.mo117256h();
        if (h != null) {
            Iterable<CatalogProductPicto> iterable = h;
            list = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (CatalogProductPicto b : iterable) {
                list.add(m161514b(b));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        return (CatalogProductDescription) d0.mo30769P(list).mo100473g();
    }

    /* renamed from: b */
    public static final com.carrefour.fid.android.CatalogProductPicto m161514b(@C12579k CatalogProductPicto catalogProductPicto) {
        Intrinsics.checkNotNullParameter(catalogProductPicto, "<this>");
        return (com.carrefour.fid.android.CatalogProductPicto) com.carrefour.fid.android.CatalogProductPicto.newBuilder().mo30790S(catalogProductPicto.mo117268e()).mo30792U(catalogProductPicto.mo117270f()).mo100473g();
    }

    /* renamed from: c */
    public static final CatalogProduct m161515c(@C12579k com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct catalogProduct) {
        Intrinsics.checkNotNullParameter(catalogProduct, "<this>");
        CatalogProduct.C13116b G0 = CatalogProduct.newBuilder().mo30722P0(catalogProduct.mo117239w()).mo30756w0(catalogProduct.mo117235t()).mo30710B0(catalogProduct.mo117238v()).mo30716I0(catalogProduct.mo117243z()).mo30752r0(catalogProduct.mo117233r()).mo30719M0(catalogProduct.mo117209B()).mo30725R0(catalogProduct.mo117210C()).mo30729T0(catalogProduct.mo117211D()).mo30718L0((long) catalogProduct.mo117208A()).mo30733V0(catalogProduct.mo117212E()).mo30735X0(catalogProduct.mo117213F()).mo30714G0(catalogProduct.mo117242y());
        Iterable<com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription> u = catalogProduct.mo117237u();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(u, 10));
        for (com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProductDescription a : u) {
            arrayList.add(m161513a(a));
        }
        return (CatalogProduct) G0.mo30721P(arrayList).mo30754u0(catalogProduct.mo117234s()).mo30712E0(catalogProduct.mo117241x()).mo100473g();
    }
}
