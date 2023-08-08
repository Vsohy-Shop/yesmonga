package com.carrefour.fid.android.domain.models.favorites.shoppinglist;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.favorites.shoppinglist.a */
public final class C38030a {
    @C12579k

    /* renamed from: a */
    public final C38031b f95862a;
    @C12579k

    /* renamed from: b */
    public final List<C38033d> f95863b;

    public C38030a(@C12579k C38031b bVar, @C12579k List<? extends C38033d> list) {
        Intrinsics.checkNotNullParameter(bVar, "metadata");
        Intrinsics.checkNotNullParameter(list, "items");
        this.f95862a = bVar;
        this.f95863b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ C38030a m156788d(C38030a aVar, C38031b bVar, List<C38033d> list, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = aVar.f95862a;
        }
        if ((i & 2) != 0) {
            list = aVar.f95863b;
        }
        return aVar.mo117696c(bVar, list);
    }

    @C12579k
    /* renamed from: a */
    public final C38031b mo117694a() {
        return this.f95862a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38033d> mo117695b() {
        return this.f95863b;
    }

    @C12579k
    /* renamed from: c */
    public final C38030a mo117696c(@C12579k C38031b bVar, @C12579k List<? extends C38033d> list) {
        Intrinsics.checkNotNullParameter(bVar, "metadata");
        Intrinsics.checkNotNullParameter(list, "items");
        return new C38030a(bVar, list);
    }

    @C12579k
    /* renamed from: e */
    public final List<C38033d> mo117697e() {
        return this.f95863b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38030a)) {
            return false;
        }
        C38030a aVar = (C38030a) obj;
        return Intrinsics.areEqual((Object) this.f95862a, (Object) aVar.f95862a) && Intrinsics.areEqual((Object) this.f95863b, (Object) aVar.f95863b);
    }

    @C12579k
    /* renamed from: f */
    public final C38031b mo117699f() {
        return this.f95862a;
    }

    public int hashCode() {
        return (this.f95862a.hashCode() * 31) + this.f95863b.hashCode();
    }

    @C12579k
    public String toString() {
        C38031b bVar = this.f95862a;
        List<C38033d> list = this.f95863b;
        return "ShoppingList(metadata=" + bVar + ", items=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38030a(C38031b bVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
    }
}
