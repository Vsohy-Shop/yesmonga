package com.carrefour.fid.android.data.entities;

import com.carrefour.fid.android.core.constants.C36176g;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38032c;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.c */
public final class C36420c {
    @C12579k
    /* renamed from: a */
    public static final ShoppingListItemToAddRequest m149380a(@C12579k C38032c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new ShoppingListItemToAddRequest(C36176g.f89300e, cVar.mo117721h(), cVar.mo117719f(), "PRODUCT", cVar.mo117720g(), 1, new String());
    }

    @C12579k
    /* renamed from: b */
    public static final ShoppingListItemToAddRequest m149381b(@C12579k Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        String W = product.mo118422W();
        if (W == null) {
            W = "";
        }
        return new ShoppingListItemToAddRequest(C36176g.f89300e, W, product.mo118415P(), "PRODUCT", product.mo118418S(), 1, new String());
    }

    @C12579k
    /* renamed from: c */
    public static final ShoppingListItemToAddRequest m149382c(@C12579k C38115c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new ShoppingListItemToAddRequest(C36176g.f89300e, cVar.mo118856G(), cVar.mo118850A(), "PRODUCT", cVar.mo118853D(), 1, new String());
    }
}
