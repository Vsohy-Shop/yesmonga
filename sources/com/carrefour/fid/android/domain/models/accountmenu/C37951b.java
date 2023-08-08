package com.carrefour.fid.android.domain.models.accountmenu;

import com.carrefour.fid.android.domain.models.account.AccountInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.accountmenu.b */
public final class C37951b {
    @C12579k

    /* renamed from: a */
    public final AccountInfo f95453a;
    @C12580l

    /* renamed from: b */
    public final Integer f95454b;

    public C37951b(@C12579k AccountInfo accountInfo, @C12580l Integer num) {
        Intrinsics.checkNotNullParameter(accountInfo, "infoModel");
        this.f95453a = accountInfo;
        this.f95454b = num;
    }

    @C12580l
    /* renamed from: a */
    public final Integer mo116792a() {
        return this.f95454b;
    }

    @C12579k
    /* renamed from: b */
    public final AccountInfo mo116793b() {
        return this.f95453a;
    }
}
