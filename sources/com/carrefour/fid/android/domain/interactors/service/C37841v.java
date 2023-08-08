package com.carrefour.fid.android.domain.interactors.service;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.service.v */
public interface C37841v extends C37679f<C37842a, C38162k> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.service.v$a */
    public static final class C37842a {
        @C12579k

        /* renamed from: a */
        public final StoreService f94918a;

        public C37842a(@C12579k StoreService storeService) {
            Intrinsics.checkNotNullParameter(storeService, "storeService");
            this.f94918a = storeService;
        }

        /* renamed from: c */
        public static /* synthetic */ C37842a m155025c(C37842a aVar, StoreService storeService, int i, Object obj) {
            if ((i & 1) != 0) {
                storeService = aVar.f94918a;
            }
            return aVar.mo115267b(storeService);
        }

        @C12579k
        /* renamed from: a */
        public final StoreService mo115266a() {
            return this.f94918a;
        }

        @C12579k
        /* renamed from: b */
        public final C37842a mo115267b(@C12579k StoreService storeService) {
            Intrinsics.checkNotNullParameter(storeService, "storeService");
            return new C37842a(storeService);
        }

        @C12579k
        /* renamed from: d */
        public final StoreService mo115268d() {
            return this.f94918a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37842a) && Intrinsics.areEqual((Object) this.f94918a, (Object) ((C37842a) obj).f94918a);
        }

        public int hashCode() {
            return this.f94918a.hashCode();
        }

        @C12579k
        public String toString() {
            StoreService storeService = this.f94918a;
            return "Param(storeService=" + storeService + ")";
        }
    }
}
