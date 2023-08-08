package com.carrefour.fid.android.domain.interactors.utilities;

import com.carrefour.fid.android.domain.interactors.C37679f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.utilities.b */
public interface C37888b extends C37679f<C37889a, String> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.utilities.b$a */
    public static final class C37889a {
        @C12579k

        /* renamed from: a */
        public final String f95001a;
        @C12579k

        /* renamed from: b */
        public final String f95002b;

        public C37889a(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "accessToken");
            Intrinsics.checkNotNullParameter(str2, "partner");
            this.f95001a = str;
            this.f95002b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C37889a m155140d(C37889a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f95001a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f95002b;
            }
            return aVar.mo115374c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115372a() {
            return this.f95001a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo115373b() {
            return this.f95002b;
        }

        @C12579k
        /* renamed from: c */
        public final C37889a mo115374c(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "accessToken");
            Intrinsics.checkNotNullParameter(str2, "partner");
            return new C37889a(str, str2);
        }

        @C12579k
        /* renamed from: e */
        public final String mo115375e() {
            return this.f95001a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37889a)) {
                return false;
            }
            C37889a aVar = (C37889a) obj;
            return Intrinsics.areEqual((Object) this.f95001a, (Object) aVar.f95001a) && Intrinsics.areEqual((Object) this.f95002b, (Object) aVar.f95002b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo115377f() {
            return this.f95002b;
        }

        public int hashCode() {
            return (this.f95001a.hashCode() * 31) + this.f95002b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f95001a;
            String str2 = this.f95002b;
            return "Params(accessToken=" + str + ", partner=" + str2 + ")";
        }
    }
}
