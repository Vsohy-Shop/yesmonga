package com.carrefour.fid.android.product.presentation.mapper;

import android.content.res.Resources;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.mapper.b */
public final class C27642b {
    @C12579k
    /* renamed from: a */
    public static final ProductCardSComponent.C37338a m116298a(@C12579k C27670g.C27676f fVar, @C12579k Resources resources, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12579k C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12579k C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4, boolean z, boolean z2, boolean z3, @C12580l C11289a<C11079d2> aVar5) {
        C27670g.C27676f fVar2 = fVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Resources resources2 = resources;
        Intrinsics.checkNotNullParameter(resources2, "resources");
        C11300l<? super C37133a, C11079d2> lVar4 = lVar;
        Intrinsics.checkNotNullParameter(lVar4, "onAtcPressed");
        C11300l<? super C37133a, C11079d2> lVar5 = lVar2;
        Intrinsics.checkNotNullParameter(lVar5, "onDeletePressed");
        C11300l<? super C37133a, C11079d2> lVar6 = lVar3;
        Intrinsics.checkNotNullParameter(lVar6, "onFavPressed");
        C11289a<C11079d2> aVar6 = aVar;
        Intrinsics.checkNotNullParameter(aVar6, "onCardPressed");
        return PlpItemDataToProductCardSMapperKt.m116271b(fVar.mo80412e(), resources2, lVar4, lVar5, lVar6, aVar6, aVar2, aVar3, aVar4, fVar.mo80414f(), z, z2, z3, aVar5);
    }

    /* renamed from: b */
    public static /* synthetic */ ProductCardSComponent.C37338a m116299b(C27670g.C27676f fVar, Resources resources, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, boolean z, boolean z2, boolean z3, C11289a aVar5, int i, Object obj) {
        int i2 = i;
        return m116298a(fVar, resources, lVar, lVar2, lVar3, aVar, aVar2, (i2 & 64) != 0 ? null : aVar3, (i2 & 128) != 0 ? null : aVar4, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? false : z3, (i2 & 2048) != 0 ? null : aVar5);
    }
}
