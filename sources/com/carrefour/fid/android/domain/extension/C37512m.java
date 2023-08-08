package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.data.entities.ShoppingListContentResponse;
import com.carrefour.fid.android.data.entities.ShoppingListProductResponse;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nShoppingListContentDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListContentDomain.kt\ncom/carrefour/fid/android/domain/extension/ShoppingListContentDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,6:1\n766#2:7\n857#2,2:8\n*S KotlinDebug\n*F\n+ 1 ShoppingListContentDomain.kt\ncom/carrefour/fid/android/domain/extension/ShoppingListContentDomainKt\n*L\n5#1:7\n5#1:8,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.m */
public final class C37512m {
    @C12579k
    /* renamed from: a */
    public static final List<ShoppingListProductResponse> m153987a(@C12579k ShoppingListContentResponse shoppingListContentResponse) {
        Intrinsics.checkNotNullParameter(shoppingListContentResponse, "<this>");
        List<ShoppingListProductResponse> items = shoppingListContentResponse.getItems();
        if (items == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : items) {
            if (!Intrinsics.areEqual((Object) ((ShoppingListProductResponse) next).getLabel(), (Object) C32920e.f79928l)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
