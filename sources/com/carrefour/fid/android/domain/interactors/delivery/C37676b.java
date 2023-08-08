package com.carrefour.fid.android.domain.interactors.delivery;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.delivery.C38017b;
import com.carrefour.fid.android.domain.models.delivery.C38020e;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.delivery.b */
public interface C37676b extends C37679f<C37677a, List<? extends C38017b>> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.delivery.b$a */
    public static final class C37677a {
        @C12579k

        /* renamed from: a */
        public final String f94536a;
        @C12579k

        /* renamed from: b */
        public final List<C38020e> f94537b;

        public C37677a(@C12579k String str, @C12579k List<C38020e> list) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(list, "gtinsWithQuantity");
            this.f94536a = str;
            this.f94537b = list;
        }

        /* renamed from: d */
        public static /* synthetic */ C37677a m154444d(C37677a aVar, String str, List<C38020e> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94536a;
            }
            if ((i & 2) != 0) {
                list = aVar.f94537b;
            }
            return aVar.mo114701c(str, list);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114699a() {
            return this.f94536a;
        }

        @C12579k
        /* renamed from: b */
        public final List<C38020e> mo114700b() {
            return this.f94537b;
        }

        @C12579k
        /* renamed from: c */
        public final C37677a mo114701c(@C12579k String str, @C12579k List<C38020e> list) {
            Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
            Intrinsics.checkNotNullParameter(list, "gtinsWithQuantity");
            return new C37677a(str, list);
        }

        @C12579k
        /* renamed from: e */
        public final String mo114702e() {
            return this.f94536a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37677a)) {
                return false;
            }
            C37677a aVar = (C37677a) obj;
            return Intrinsics.areEqual((Object) this.f94536a, (Object) aVar.f94536a) && Intrinsics.areEqual((Object) this.f94537b, (Object) aVar.f94537b);
        }

        @C12579k
        /* renamed from: f */
        public final List<C38020e> mo114704f() {
            return this.f94537b;
        }

        public int hashCode() {
            return (this.f94536a.hashCode() * 31) + this.f94537b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94536a;
            List<C38020e> list = this.f94537b;
            return "Params(facilityServiceId=" + str + ", gtinsWithQuantity=" + list + ")";
        }
    }
}
