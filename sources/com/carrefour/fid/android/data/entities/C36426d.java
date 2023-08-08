package com.carrefour.fid.android.data.entities;

import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38031b;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38033d;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.ShoppingListSyncState;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nShoppingListResponseMapperExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListResponseMapperExt.kt\ncom/carrefour/fid/android/data/entities/ShoppingListResponseMapperExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n766#2:33\n857#2,2:34\n1549#2:36\n1620#2,3:37\n*S KotlinDebug\n*F\n+ 1 ShoppingListResponseMapperExt.kt\ncom/carrefour/fid/android/data/entities/ShoppingListResponseMapperExtKt\n*L\n11#1:33\n11#1:34,2\n12#1:36\n12#1:37,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.d */
public final class C36426d {
    @C12579k
    /* renamed from: a */
    public static final C38030a m149483a(@C12579k ShoppingListContentResponse shoppingListContentResponse) {
        List list;
        Intrinsics.checkNotNullParameter(shoppingListContentResponse, "<this>");
        C38031b b = m149484b(shoppingListContentResponse.getShoppingListMetadata());
        List<ShoppingListProductResponse> items = shoppingListContentResponse.getItems();
        if (items != null) {
            ArrayList<ShoppingListProductResponse> arrayList = new ArrayList<>();
            for (Object next : items) {
                if (!Intrinsics.areEqual((Object) ((ShoppingListProductResponse) next).getLabel(), (Object) C32920e.f79928l)) {
                    arrayList.add(next);
                }
            }
            list = new ArrayList(C10978t.m41495Y(arrayList, 10));
            for (ShoppingListProductResponse c : arrayList) {
                list.add(m149485c(c));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        return new C38030a(b, list);
    }

    /* renamed from: b */
    public static final C38031b m149484b(ShoppingListInfoResponse shoppingListInfoResponse) {
        String str;
        String str2;
        int i;
        String str3 = null;
        if (shoppingListInfoResponse != null) {
            str = shoppingListInfoResponse.getShoppingListId();
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        if (shoppingListInfoResponse != null) {
            str2 = shoppingListInfoResponse.getLibelleList();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str4;
        }
        if (shoppingListInfoResponse != null) {
            str3 = shoppingListInfoResponse.getShopping_list_type();
        }
        if (str3 != null) {
            str4 = str3;
        }
        if (shoppingListInfoResponse != null) {
            i = shoppingListInfoResponse.getNumberOfItems();
        } else {
            i = 0;
        }
        return new C38031b(str, str2, str4, i);
    }

    /* renamed from: c */
    public static final C38033d m149485c(ShoppingListProductResponse shoppingListProductResponse) {
        return new C38033d.C38034a(shoppingListProductResponse.getItemId(), shoppingListProductResponse.getGtin(), (ShoppingListSyncState) null, 4, (DefaultConstructorMarker) null);
    }
}
