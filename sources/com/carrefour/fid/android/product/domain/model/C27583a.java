package com.carrefour.fid.android.product.domain.model;

import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.domain.model.a */
public final class C27583a {
    @C12579k

    /* renamed from: a */
    public final C38115c f66995a;
    @C12579k

    /* renamed from: b */
    public final List<C38115c> f66996b;

    public C27583a(@C12579k C38115c cVar, @C12579k List<C38115c> list) {
        Intrinsics.checkNotNullParameter(cVar, "product");
        Intrinsics.checkNotNullParameter(list, "mixedProducts");
        this.f66995a = cVar;
        this.f66996b = list;
    }

    @C12579k
    /* renamed from: a */
    public final List<C38115c> mo80060a() {
        return this.f66996b;
    }

    @C12579k
    /* renamed from: b */
    public final C38115c mo80061b() {
        return this.f66995a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27583a(C38115c cVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }
}
