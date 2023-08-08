package com.carrefour.fid.android.analytics.data.analytics;

import com.carrefour.fid.android.shared.constant.C28564m1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.analytics.data.analytics.d */
public final class C13786d {
    @C12579k

    /* renamed from: a */
    public static final List<FirebaseEventKey> f33551a = CollectionsKt__CollectionsKt.m40448L(FirebaseEventKey.ADD_TO_CART, FirebaseEventKey.ADD_TO_WISHLIST, FirebaseEventKey.SELECT_CONTENT, FirebaseEventKey.SELECT_ITEM, FirebaseEventKey.VIEW_ITEM_LIST);
    @C12579k

    /* renamed from: b */
    public static final List<String> f33552b = CollectionsKt__CollectionsKt.m40448L(C28564m1.f69580n, C28564m1.f69581o, "cart_ID", C28564m1.f69568b, "user_transactionTotal", "cart_storeService");

    /* renamed from: b */
    public static final boolean m58689b(@C12579k FirebaseEventKey firebaseEventKey) {
        Intrinsics.checkNotNullParameter(firebaseEventKey, "<this>");
        return f33551a.contains(firebaseEventKey);
    }
}
