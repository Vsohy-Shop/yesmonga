package com.carrefour.fid.android.domain.interactors.accountmenu;

import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.domain.interactors.accountmenu.a */
public final class C37536a implements C37539c {
    @C12579k
    /* renamed from: a */
    public List<AccountMenuItem> mo114315a() {
        return CollectionsKt__CollectionsKt.m40448L(AccountMenuItem.ORDERS, AccountMenuItem.LOYALTY, AccountMenuItem.PERSONAL_DATA, AccountMenuItem.PAYMENT, AccountMenuItem.HELP, AccountMenuItem.USER_CONSENTS, AccountMenuItem.SERVICES, AccountMenuItem.LEGALS, AccountMenuItem.LOGOUT, AccountMenuItem.APP_VERSION);
    }
}
