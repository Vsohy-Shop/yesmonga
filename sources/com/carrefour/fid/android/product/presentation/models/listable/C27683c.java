package com.carrefour.fid.android.product.presentation.models.listable;

import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.domain.models.criteo.C38004f;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import java.util.ArrayList;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nListableCriteoPlpFlagship.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListableCriteoPlpFlagship.kt\ncom/carrefour/fid/android/product/presentation/models/listable/ListableCriteoPlpFlagship\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n*S KotlinDebug\n*F\n+ 1 ListableCriteoPlpFlagship.kt\ncom/carrefour/fid/android/product/presentation/models/listable/ListableCriteoPlpFlagship\n*L\n17#1:21\n17#1:22,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.models.listable.c */
public final class C27683c implements C37369a {
    @C12579k

    /* renamed from: a */
    public final C38004f f67211a;

    /* renamed from: b */
    public final int f67212b;

    public C27683c(@C12579k C38004f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "flagship");
        this.f67211a = fVar;
        this.f67212b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C27683c m116462d(C27683c cVar, C38004f fVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = cVar.f67211a;
        }
        if ((i2 & 2) != 0) {
            i = cVar.f67212b;
        }
        return cVar.mo80431c(fVar, i);
    }

    @C12579k
    /* renamed from: a */
    public final C38004f mo80429a() {
        return this.f67211a;
    }

    /* renamed from: b */
    public final int mo80430b() {
        return this.f67212b;
    }

    @C12579k
    /* renamed from: c */
    public final C27683c mo80431c(@C12579k C38004f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "flagship");
        return new C27683c(fVar, i);
    }

    @C12579k
    /* renamed from: e */
    public final C38004f mo80432e() {
        return this.f67211a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27683c)) {
            return false;
        }
        C27683c cVar = (C27683c) obj;
        return Intrinsics.areEqual((Object) this.f67211a, (Object) cVar.f67211a) && this.f67212b == cVar.f67212b;
    }

    /* renamed from: f */
    public final int mo80434f() {
        return this.f67212b;
    }

    /* renamed from: g */
    public final int mo80435g() {
        Iterable<C38114b> d = this.f67211a.mo117435d();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(d, 10));
        for (C38114b j : d) {
            arrayList.add(Gtin.m157307a(j.mo118842j().mo118850A()));
        }
        return arrayList.hashCode();
    }

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return 8;
    }

    public int hashCode() {
        return (this.f67211a.hashCode() * 31) + Integer.hashCode(this.f67212b);
    }

    @C12579k
    public String toString() {
        C38004f fVar = this.f67211a;
        int i = this.f67212b;
        return "ListableCriteoPlpFlagship(flagship=" + fVar + ", selectedProductPosition=" + i + ")";
    }
}
