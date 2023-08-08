package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.data.entities.ShoppingListItemResponse;
import com.carrefour.fid.android.data.entities.ShoppingListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nShoppingListDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListDomain.kt\ncom/carrefour/fid/android/domain/extension/ShoppingListDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,8:1\n766#2:9\n857#2,2:10\n1963#2,14:12\n*S KotlinDebug\n*F\n+ 1 ShoppingListDomain.kt\ncom/carrefour/fid/android/domain/extension/ShoppingListDomainKt\n*L\n6#1:9\n6#1:10,2\n7#1:12,14\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.n */
public final class C37513n {
    @C12580l
    /* renamed from: a */
    public static final ShoppingListItemResponse m153988a(@C12579k ShoppingListResponse shoppingListResponse, @C12579k String str) {
        Intrinsics.checkNotNullParameter(shoppingListResponse, "<this>");
        Intrinsics.checkNotNullParameter(str, "type");
        List<ShoppingListItemResponse> shoppingList = shoppingListResponse.getShoppingList();
        Object obj = null;
        if (shoppingList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : shoppingList) {
            if (Intrinsics.areEqual((Object) ((ShoppingListItemResponse) next).getShoppingListType(), (Object) str)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                String lastUpdateDate = ((ShoppingListItemResponse) obj).getLastUpdateDate();
                do {
                    Object next2 = it.next();
                    String lastUpdateDate2 = ((ShoppingListItemResponse) next2).getLastUpdateDate();
                    if (lastUpdateDate.compareTo(lastUpdateDate2) < 0) {
                        obj = next2;
                        lastUpdateDate = lastUpdateDate2;
                    }
                } while (it.hasNext());
            }
        }
        return (ShoppingListItemResponse) obj;
    }
}
