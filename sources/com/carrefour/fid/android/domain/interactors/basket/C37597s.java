package com.carrefour.fid.android.domain.interactors.basket;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.basket.C37591o0;
import com.carrefour.fid.android.domain.models.basket.Basket;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.basket.s */
public interface C37597s extends C37679f<C37598a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.basket.s$a */
    public static final class C37598a {
        @C12579k

        /* renamed from: a */
        public final C37591o0.C37592a f94352a;
        @C12579k

        /* renamed from: b */
        public final Basket f94353b;

        public C37598a(@C12579k C37591o0.C37592a aVar, @C12579k Basket basket) {
            Intrinsics.checkNotNullParameter(aVar, "data");
            Intrinsics.checkNotNullParameter(basket, "basket");
            this.f94352a = aVar;
            this.f94353b = basket;
        }

        /* renamed from: d */
        public static /* synthetic */ C37598a m154166d(C37598a aVar, C37591o0.C37592a aVar2, Basket basket, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.f94352a;
            }
            if ((i & 2) != 0) {
                basket = aVar.f94353b;
            }
            return aVar.mo114439c(aVar2, basket);
        }

        @C12579k
        /* renamed from: a */
        public final C37591o0.C37592a mo114437a() {
            return this.f94352a;
        }

        @C12579k
        /* renamed from: b */
        public final Basket mo114438b() {
            return this.f94353b;
        }

        @C12579k
        /* renamed from: c */
        public final C37598a mo114439c(@C12579k C37591o0.C37592a aVar, @C12579k Basket basket) {
            Intrinsics.checkNotNullParameter(aVar, "data");
            Intrinsics.checkNotNullParameter(basket, "basket");
            return new C37598a(aVar, basket);
        }

        @C12579k
        /* renamed from: e */
        public final Basket mo114440e() {
            return this.f94353b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37598a)) {
                return false;
            }
            C37598a aVar = (C37598a) obj;
            return Intrinsics.areEqual((Object) this.f94352a, (Object) aVar.f94352a) && Intrinsics.areEqual((Object) this.f94353b, (Object) aVar.f94353b);
        }

        @C12579k
        /* renamed from: f */
        public final C37591o0.C37592a mo114442f() {
            return this.f94352a;
        }

        public int hashCode() {
            return (this.f94352a.hashCode() * 31) + this.f94353b.hashCode();
        }

        @C12579k
        public String toString() {
            C37591o0.C37592a aVar = this.f94352a;
            Basket basket = this.f94353b;
            return "Params(data=" + aVar + ", basket=" + basket + ")";
        }
    }
}
