package com.carrefour.fid.android.domain.interactors.service;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.service.s */
public interface C37836s extends C37679f<C37837a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.service.s$a */
    public static final class C37837a {
        @C12579k

        /* renamed from: a */
        public final C38163l f94914a;
        @C12579k

        /* renamed from: b */
        public final StoreService f94915b;

        public C37837a(@C12579k C38163l lVar, @C12579k StoreService storeService) {
            Intrinsics.checkNotNullParameter(lVar, "store");
            Intrinsics.checkNotNullParameter(storeService, "storeService");
            this.f94914a = lVar;
            this.f94915b = storeService;
        }

        /* renamed from: d */
        public static /* synthetic */ C37837a m155013d(C37837a aVar, C38163l lVar, StoreService storeService, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = aVar.f94914a;
            }
            if ((i & 2) != 0) {
                storeService = aVar.f94915b;
            }
            return aVar.mo115252c(lVar, storeService);
        }

        @C12579k
        /* renamed from: a */
        public final C38163l mo115250a() {
            return this.f94914a;
        }

        @C12579k
        /* renamed from: b */
        public final StoreService mo115251b() {
            return this.f94915b;
        }

        @C12579k
        /* renamed from: c */
        public final C37837a mo115252c(@C12579k C38163l lVar, @C12579k StoreService storeService) {
            Intrinsics.checkNotNullParameter(lVar, "store");
            Intrinsics.checkNotNullParameter(storeService, "storeService");
            return new C37837a(lVar, storeService);
        }

        @C12579k
        /* renamed from: e */
        public final C38163l mo115253e() {
            return this.f94914a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37837a)) {
                return false;
            }
            C37837a aVar = (C37837a) obj;
            return Intrinsics.areEqual((Object) this.f94914a, (Object) aVar.f94914a) && Intrinsics.areEqual((Object) this.f94915b, (Object) aVar.f94915b);
        }

        @C12579k
        /* renamed from: f */
        public final StoreService mo115255f() {
            return this.f94915b;
        }

        public int hashCode() {
            return (this.f94914a.hashCode() * 31) + this.f94915b.hashCode();
        }

        @C12579k
        public String toString() {
            C38163l lVar = this.f94914a;
            StoreService storeService = this.f94915b;
            return "Param(store=" + lVar + ", storeService=" + storeService + ")";
        }
    }
}
