package com.carrefour.fid.android.catalogs.presentation.p065ui.adapter;

import android.content.Context;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.design.components.widgets.catalogs.CatalogComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.carrefour.fid.android.domain.models.catalog.Catalog;
import com.carrefour.fid.android.shared.util.C28932h;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.adapter.a */
public final class C39473a {
    @C12579k
    /* renamed from: a */
    public static final CatalogComponent.C37205a m161718a(@C12579k Catalog catalog, @C12579k Context context) {
        Intrinsics.checkNotNullParameter(catalog, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        String u = catalog.mo117073u();
        ImageComponent.C37313a aVar = new ImageComponent.C37313a(catalog.mo117069r(), ImageComponent.Size.L, false, 4, (DefaultConstructorMarker) null);
        String w = catalog.mo117075w();
        int i = C39364b.C39383s.catalog_date_validity_formatter;
        String F = catalog.mo117049F();
        C28932h.C28933a aVar2 = C28932h.f70914a;
        return new CatalogComponent.C37205a(u, aVar, w, context.getString(i, new Object[]{aVar2.mo84224O(F), aVar2.mo84224O(catalog.mo117048E())}));
    }
}
