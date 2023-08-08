package com.carrefour.fid.android.domain.interactors.catalog;

import com.carrefour.fid.android.domain.interactors.C37679f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.catalog.h */
public interface C37616h extends C37679f<C37617a, Boolean> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.catalog.h$a */
    public static final class C37617a {
        @C12579k

        /* renamed from: a */
        public final CatalogFavoriteRemoval f94366a;

        public C37617a(@C12579k CatalogFavoriteRemoval catalogFavoriteRemoval) {
            Intrinsics.checkNotNullParameter(catalogFavoriteRemoval, "removalType");
            this.f94366a = catalogFavoriteRemoval;
        }

        /* renamed from: c */
        public static /* synthetic */ C37617a m154188c(C37617a aVar, CatalogFavoriteRemoval catalogFavoriteRemoval, int i, Object obj) {
            if ((i & 1) != 0) {
                catalogFavoriteRemoval = aVar.f94366a;
            }
            return aVar.mo114461b(catalogFavoriteRemoval);
        }

        @C12579k
        /* renamed from: a */
        public final CatalogFavoriteRemoval mo114460a() {
            return this.f94366a;
        }

        @C12579k
        /* renamed from: b */
        public final C37617a mo114461b(@C12579k CatalogFavoriteRemoval catalogFavoriteRemoval) {
            Intrinsics.checkNotNullParameter(catalogFavoriteRemoval, "removalType");
            return new C37617a(catalogFavoriteRemoval);
        }

        @C12579k
        /* renamed from: d */
        public final CatalogFavoriteRemoval mo114462d() {
            return this.f94366a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37617a) && this.f94366a == ((C37617a) obj).f94366a;
        }

        public int hashCode() {
            return this.f94366a.hashCode();
        }

        @C12579k
        public String toString() {
            CatalogFavoriteRemoval catalogFavoriteRemoval = this.f94366a;
            return "Params(removalType=" + catalogFavoriteRemoval + ")";
        }
    }
}
