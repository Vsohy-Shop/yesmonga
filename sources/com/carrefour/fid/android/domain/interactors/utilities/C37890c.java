package com.carrefour.fid.android.domain.interactors.utilities;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.criteo.C38006h;
import com.carrefour.fid.android.domain.models.luckycart.C38048b;
import com.carrefour.fid.android.domain.utilities.C38207a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.utilities.c */
public interface C37890c extends C37679f<C37891a, C38207a> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.utilities.c$a */
    public static final class C37891a {
        @C12579k

        /* renamed from: a */
        public final C38006h f95003a;
        @C12580l

        /* renamed from: b */
        public final C38048b f95004b;
        @C12579k

        /* renamed from: c */
        public final String f95005c;
        @C12579k

        /* renamed from: d */
        public final String f95006d;

        public C37891a(@C12579k C38006h hVar, @C12580l C38048b bVar, @C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParameters");
            Intrinsics.checkNotNullParameter(str, "storeId");
            Intrinsics.checkNotNullParameter(str2, "storeServiceRef");
            this.f95003a = hVar;
            this.f95004b = bVar;
            this.f95005c = str;
            this.f95006d = str2;
        }

        /* renamed from: f */
        public static /* synthetic */ C37891a m155146f(C37891a aVar, C38006h hVar, C38048b bVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                hVar = aVar.f95003a;
            }
            if ((i & 2) != 0) {
                bVar = aVar.f95004b;
            }
            if ((i & 4) != 0) {
                str = aVar.f95005c;
            }
            if ((i & 8) != 0) {
                str2 = aVar.f95006d;
            }
            return aVar.mo115384e(hVar, bVar, str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final C38006h mo115380a() {
            return this.f95003a;
        }

        @C12580l
        /* renamed from: b */
        public final C38048b mo115381b() {
            return this.f95004b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo115382c() {
            return this.f95005c;
        }

        @C12579k
        /* renamed from: d */
        public final String mo115383d() {
            return this.f95006d;
        }

        @C12579k
        /* renamed from: e */
        public final C37891a mo115384e(@C12579k C38006h hVar, @C12580l C38048b bVar, @C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParameters");
            Intrinsics.checkNotNullParameter(str, "storeId");
            Intrinsics.checkNotNullParameter(str2, "storeServiceRef");
            return new C37891a(hVar, bVar, str, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37891a)) {
                return false;
            }
            C37891a aVar = (C37891a) obj;
            return Intrinsics.areEqual((Object) this.f95003a, (Object) aVar.f95003a) && Intrinsics.areEqual((Object) this.f95004b, (Object) aVar.f95004b) && Intrinsics.areEqual((Object) this.f95005c, (Object) aVar.f95005c) && Intrinsics.areEqual((Object) this.f95006d, (Object) aVar.f95006d);
        }

        @C12579k
        /* renamed from: g */
        public final C38006h mo115386g() {
            return this.f95003a;
        }

        @C12580l
        /* renamed from: h */
        public final C38048b mo115387h() {
            return this.f95004b;
        }

        public int hashCode() {
            int hashCode = this.f95003a.hashCode() * 31;
            C38048b bVar = this.f95004b;
            return ((((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f95005c.hashCode()) * 31) + this.f95006d.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final String mo115389i() {
            return this.f95005c;
        }

        @C12579k
        /* renamed from: j */
        public final String mo115390j() {
            return this.f95006d;
        }

        @C12579k
        public String toString() {
            C38006h hVar = this.f95003a;
            C38048b bVar = this.f95004b;
            String str = this.f95005c;
            String str2 = this.f95006d;
            return "Params(criteoParameters=" + hVar + ", luckyCartParameters=" + bVar + ", storeId=" + str + ", storeServiceRef=" + str2 + ")";
        }
    }
}
