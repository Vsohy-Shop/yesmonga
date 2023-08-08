package com.carrefour.fid.android.design.libs.pager.snapper;

import androidx.compose.foundation.lazy.C2517l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.libs.pager.snapper.b */
public final class C37470b extends C37473e {
    @C12579k

    /* renamed from: b */
    public final C2517l f94124b;

    public C37470b(@C12579k C2517l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "lazyListItem");
        this.f94124b = lVar;
    }

    /* renamed from: a */
    public int mo114170a() {
        return this.f94124b.getIndex();
    }

    /* renamed from: b */
    public int mo114171b() {
        return this.f94124b.getOffset();
    }

    /* renamed from: c */
    public int mo114172c() {
        return this.f94124b.getSize();
    }
}
