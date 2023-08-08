package com.carrefour.fid.android.domain.interactors.address;

import androidx.autofill.C0861a;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.LatLon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.interactors.address.a */
public interface C37542a extends C37679f<C37543a, LatLon> {

    /* renamed from: com.carrefour.fid.android.domain.interactors.address.a$a */
    public static final class C37543a {
        @C12579k

        /* renamed from: a */
        public final String f94289a;
        @C12580l

        /* renamed from: b */
        public final String f94290b;

        public C37543a(@C12579k String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, C0861a.f2707g);
            this.f94289a = str;
            this.f94290b = str2;
        }

        /* renamed from: d */
        public static /* synthetic */ C37543a m154055d(C37543a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94289a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f94290b;
            }
            return aVar.mo114319c(str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114317a() {
            return this.f94289a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo114318b() {
            return this.f94290b;
        }

        @C12579k
        /* renamed from: c */
        public final C37543a mo114319c(@C12579k String str, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, C0861a.f2707g);
            return new C37543a(str, str2);
        }

        @C12580l
        /* renamed from: e */
        public final String mo114320e() {
            return this.f94290b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37543a)) {
                return false;
            }
            C37543a aVar = (C37543a) obj;
            return Intrinsics.areEqual((Object) this.f94289a, (Object) aVar.f94289a) && Intrinsics.areEqual((Object) this.f94290b, (Object) aVar.f94290b);
        }

        @C12579k
        /* renamed from: f */
        public final String mo114322f() {
            return this.f94289a;
        }

        public int hashCode() {
            int hashCode = this.f94289a.hashCode() * 31;
            String str = this.f94290b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            String str = this.f94289a;
            String str2 = this.f94290b;
            return "Param(postalCode=" + str + ", city=" + str2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37543a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }
}
