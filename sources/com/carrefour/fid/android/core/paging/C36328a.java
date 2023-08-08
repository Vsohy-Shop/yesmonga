package com.carrefour.fid.android.core.paging;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.core.paging.a */
public final class C36328a<Value> {
    @C12579k

    /* renamed from: f */
    public static final C36329a f89745f = new C36329a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final List<Value> f89746a;
    @C12579k

    /* renamed from: b */
    public final C36330b f89747b;
    @C12580l

    /* renamed from: c */
    public final Integer f89748c;
    @C12580l

    /* renamed from: d */
    public final Integer f89749d;
    @C12580l

    /* renamed from: e */
    public final Integer f89750e;

    /* renamed from: com.carrefour.fid.android.core.paging.a$a */
    public static final class C36329a {
        public /* synthetic */ C36329a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final <Value> C36328a<Value> mo108402a() {
            return new C36328a(CollectionsKt__CollectionsKt.m40441E(), C36330b.C36333c.f89753a, 0, (Integer) null, (Integer) null);
        }

        public C36329a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.core.paging.a$b */
    public static abstract class C36330b {

        /* renamed from: com.carrefour.fid.android.core.paging.a$b$a */
        public static final class C36331a extends C36330b {
            @C12579k

            /* renamed from: a */
            public final Throwable f89751a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C36331a(@C12579k Throwable th) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(th, "error");
                this.f89751a = th;
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo108403a() {
                return this.f89751a;
            }
        }

        /* renamed from: com.carrefour.fid.android.core.paging.a$b$b */
        public static final class C36332b extends C36330b {
            @C12579k

            /* renamed from: a */
            public static final C36332b f89752a = new C36332b();

            public C36332b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.carrefour.fid.android.core.paging.a$b$c */
        public static final class C36333c extends C36330b {
            @C12579k

            /* renamed from: a */
            public static final C36333c f89753a = new C36333c();

            public C36333c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C36330b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C36330b() {
        }
    }

    public C36328a(@C12579k List<? extends Value> list, @C12579k C36330b bVar, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(bVar, "state");
        this.f89746a = list;
        this.f89747b = bVar;
        this.f89748c = num;
        this.f89749d = num2;
        this.f89750e = num3;
    }

    /* renamed from: g */
    public static /* synthetic */ C36328a m149051g(C36328a aVar, List<Value> list, C36330b bVar, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aVar.f89746a;
        }
        if ((i & 2) != 0) {
            bVar = aVar.f89747b;
        }
        C36330b bVar2 = bVar;
        if ((i & 4) != 0) {
            num = aVar.f89748c;
        }
        Integer num4 = num;
        if ((i & 8) != 0) {
            num2 = aVar.f89749d;
        }
        Integer num5 = num2;
        if ((i & 16) != 0) {
            num3 = aVar.f89750e;
        }
        return aVar.mo108394f(list, bVar2, num4, num5, num3);
    }

    @C12579k
    /* renamed from: a */
    public final List<Value> mo108388a() {
        return this.f89746a;
    }

    @C12579k
    /* renamed from: b */
    public final C36330b mo108389b() {
        return this.f89747b;
    }

    @C12580l
    /* renamed from: c */
    public final Integer mo108390c() {
        return this.f89748c;
    }

    @C12580l
    /* renamed from: d */
    public final Integer mo108391d() {
        return this.f89749d;
    }

    @C12580l
    /* renamed from: e */
    public final Integer mo108392e() {
        return this.f89750e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36328a)) {
            return false;
        }
        C36328a aVar = (C36328a) obj;
        return Intrinsics.areEqual((Object) this.f89746a, (Object) aVar.f89746a) && Intrinsics.areEqual((Object) this.f89747b, (Object) aVar.f89747b) && Intrinsics.areEqual((Object) this.f89748c, (Object) aVar.f89748c) && Intrinsics.areEqual((Object) this.f89749d, (Object) aVar.f89749d) && Intrinsics.areEqual((Object) this.f89750e, (Object) aVar.f89750e);
    }

    @C12579k
    /* renamed from: f */
    public final C36328a<Value> mo108394f(@C12579k List<? extends Value> list, @C12579k C36330b bVar, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(bVar, "state");
        return new C36328a(list, bVar, num, num2, num3);
    }

    @C12579k
    /* renamed from: h */
    public final List<Value> mo108395h() {
        return this.f89746a;
    }

    public int hashCode() {
        int hashCode = ((this.f89746a.hashCode() * 31) + this.f89747b.hashCode()) * 31;
        Integer num = this.f89748c;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f89749d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f89750e;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode3 + i;
    }

    @C12579k
    /* renamed from: i */
    public final C36330b mo108397i() {
        return this.f89747b;
    }

    @C12580l
    /* renamed from: j */
    public final Integer mo108398j() {
        return this.f89750e;
    }

    @C12580l
    /* renamed from: k */
    public final Integer mo108399k() {
        return this.f89748c;
    }

    @C12580l
    /* renamed from: l */
    public final Integer mo108400l() {
        return this.f89749d;
    }

    @C12579k
    public String toString() {
        List<Value> list = this.f89746a;
        C36330b bVar = this.f89747b;
        Integer num = this.f89748c;
        Integer num2 = this.f89749d;
        Integer num3 = this.f89750e;
        return "PagingData(list=" + list + ", state=" + bVar + ", totalCount=" + num + ", totalFilters=" + num2 + ", topResultsCategoryId=" + num3 + ")";
    }
}
