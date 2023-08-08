package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.shared.paging.C28844a;
import com.carrefour.fid.android.shared.paging.Pager;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.domain.repositories.c */
public final class C27597c {
    @C12579k
    /* renamed from: a */
    public static final Pager<Integer, C38115c> m116162a(@C12579k C12074o0 o0Var, @C12579k C28844a<Integer, C38115c> aVar) {
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        Intrinsics.checkNotNullParameter(aVar, "source");
        return new Pager<>(o0Var, aVar, 0, 1);
    }
}
