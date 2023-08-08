package com.carrefour.fid.android.domain.models.favorites.shoppinglist.extensions;

import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.domain.models.favorites.shoppinglist.extensions.a */
public final class C38036a {
    @C12579k
    /* renamed from: a */
    public static final C38032c m156827a(@C12579k Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        return new C38032c(product.mo118415P(), product.mo118418S(), product.mo118422W(), (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: b */
    public static final C38032c m156828b(@C12579k C38115c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new C38032c(cVar.mo118850A(), cVar.mo118853D(), cVar.mo118856G(), (DefaultConstructorMarker) null);
    }
}
