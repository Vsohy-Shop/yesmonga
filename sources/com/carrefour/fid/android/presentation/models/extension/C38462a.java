package com.carrefour.fid.android.presentation.models.extension;

import com.carrefour.fid.android.core.type.AccountListCategory;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.presentation.models.C38453a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.presentation.models.extension.a */
public final class C38462a {
    @C12579k
    /* renamed from: a */
    public static final List<C38453a> m159614a(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C38453a(AccountListCategory.MY_SHOPPING_LIST, (AccountListType) null, 2, (DefaultConstructorMarker) null));
        arrayList.add(new C38453a((AccountListCategory) null, AccountListType.Shopping.f89774d, 1, (DefaultConstructorMarker) null));
        if (z) {
            arrayList.add(new C38453a((AccountListCategory) null, AccountListType.Memos.f89768d, 1, (DefaultConstructorMarker) null));
        }
        arrayList.add(new C38453a((AccountListCategory) null, AccountListType.Catalog.f89764d, 1, (DefaultConstructorMarker) null));
        arrayList.add(new C38453a(AccountListCategory.ONE_CLICK_SHOPPING_LIST, (AccountListType) null, 2, (DefaultConstructorMarker) null));
        arrayList.add(new C38453a((AccountListCategory) null, AccountListType.Frequent.f89766d, 1, (DefaultConstructorMarker) null));
        arrayList.add(new C38453a((AccountListCategory) null, AccountListType.Order.f89772d, 1, (DefaultConstructorMarker) null));
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m159615b(@C12579k C38453a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.mo121992e() != null) {
            return true;
        }
        return false;
    }
}
