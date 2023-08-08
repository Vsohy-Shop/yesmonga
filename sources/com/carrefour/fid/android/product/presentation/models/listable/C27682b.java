package com.carrefour.fid.android.product.presentation.models.listable;

import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.domain.models.criteo.C38003e;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import java.util.ArrayList;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nListableCriteoPlpButterfly.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListableCriteoPlpButterfly.kt\ncom/carrefour/fid/android/product/presentation/models/listable/ListableCriteoPlpButterfly\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n*S KotlinDebug\n*F\n+ 1 ListableCriteoPlpButterfly.kt\ncom/carrefour/fid/android/product/presentation/models/listable/ListableCriteoPlpButterfly\n*L\n17#1:21\n17#1:22,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.models.listable.b */
public final class C27682b implements C37369a {
    @C12579k

    /* renamed from: a */
    public final C38003e f67209a;

    /* renamed from: b */
    public final int f67210b;

    public C27682b(@C12579k C38003e eVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "butterfly");
        this.f67209a = eVar;
        this.f67210b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C27682b m116455d(C27682b bVar, C38003e eVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eVar = bVar.f67209a;
        }
        if ((i2 & 2) != 0) {
            i = bVar.f67210b;
        }
        return bVar.mo80421c(eVar, i);
    }

    @C12579k
    /* renamed from: a */
    public final C38003e mo80419a() {
        return this.f67209a;
    }

    /* renamed from: b */
    public final int mo80420b() {
        return this.f67210b;
    }

    @C12579k
    /* renamed from: c */
    public final C27682b mo80421c(@C12579k C38003e eVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "butterfly");
        return new C27682b(eVar, i);
    }

    @C12579k
    /* renamed from: e */
    public final C38003e mo80422e() {
        return this.f67209a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27682b)) {
            return false;
        }
        C27682b bVar = (C27682b) obj;
        return Intrinsics.areEqual((Object) this.f67209a, (Object) bVar.f67209a) && this.f67210b == bVar.f67210b;
    }

    /* renamed from: f */
    public final int mo80424f() {
        return this.f67210b;
    }

    /* renamed from: g */
    public final int mo80425g() {
        Iterable<C38114b> d = this.f67209a.mo117435d();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(d, 10));
        for (C38114b j : d) {
            arrayList.add(Gtin.m157307a(j.mo118842j().mo118850A()));
        }
        return arrayList.hashCode();
    }

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return 7;
    }

    public int hashCode() {
        return (this.f67209a.hashCode() * 31) + Integer.hashCode(this.f67210b);
    }

    @C12579k
    public String toString() {
        C38003e eVar = this.f67209a;
        int i = this.f67210b;
        return "ListableCriteoPlpButterfly(butterfly=" + eVar + ", selectedProductPosition=" + i + ")";
    }
}
