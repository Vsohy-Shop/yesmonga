package com.carrefour.fid.android.domain.interactors.criteo;

import com.carrefour.fid.android.domain.interactors.C37679f;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.criteo.j */
public interface C37672j extends C37679f<C37673a, C11079d2> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.criteo.j$a */
    public static final class C37673a {
        @C12579k

        /* renamed from: a */
        public final String f94530a;

        /* renamed from: b */
        public final boolean f94531b;

        public C37673a(@C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "trackingUrl");
            this.f94530a = str;
            this.f94531b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C37673a m154431d(C37673a aVar, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94530a;
            }
            if ((i & 2) != 0) {
                z = aVar.f94531b;
            }
            return aVar.mo114690c(str, z);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114688a() {
            return this.f94530a;
        }

        /* renamed from: b */
        public final boolean mo114689b() {
            return this.f94531b;
        }

        @C12579k
        /* renamed from: c */
        public final C37673a mo114690c(@C12579k String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "trackingUrl");
            return new C37673a(str, z);
        }

        @C12579k
        /* renamed from: e */
        public final String mo114691e() {
            return this.f94530a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37673a)) {
                return false;
            }
            C37673a aVar = (C37673a) obj;
            return Intrinsics.areEqual((Object) this.f94530a, (Object) aVar.f94530a) && this.f94531b == aVar.f94531b;
        }

        /* renamed from: f */
        public final boolean mo114693f() {
            return this.f94531b;
        }

        public int hashCode() {
            int hashCode = this.f94530a.hashCode() * 31;
            boolean z = this.f94531b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            String str = this.f94530a;
            boolean z = this.f94531b;
            return "Params(trackingUrl=" + str + ", isFromBff=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37673a(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }
    }
}
