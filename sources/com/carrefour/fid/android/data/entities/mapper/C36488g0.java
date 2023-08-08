package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.C38042l;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.shared.base.C28486g;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.g0 */
public final class C36488g0 extends C28486g<C36489a, C38042l> {

    /* renamed from: b */
    public static final int f90175b = 0;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.data.entities.mapper.g0$a */
    public static final class C36489a {

        /* renamed from: d */
        public static final int f90176d = 0;
        @C12580l

        /* renamed from: a */
        public final String f90177a;
        @C12579k

        /* renamed from: b */
        public final String f90178b;
        @C12580l

        /* renamed from: c */
        public final String f90179c;

        public C36489a(@C12580l String str, @C12579k String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str2, "newCustomer");
            this.f90177a = str;
            this.f90178b = str2;
            this.f90179c = str3;
        }

        /* renamed from: e */
        public static /* synthetic */ C36489a m149659e(C36489a aVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f90177a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f90178b;
            }
            if ((i & 4) != 0) {
                str3 = aVar.f90179c;
            }
            return aVar.mo111268d(str, str2, str3);
        }

        @C12580l
        /* renamed from: a */
        public final String mo111265a() {
            return this.f90177a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo111266b() {
            return this.f90178b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo111267c() {
            return this.f90179c;
        }

        @C12579k
        /* renamed from: d */
        public final C36489a mo111268d(@C12580l String str, @C12579k String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str2, "newCustomer");
            return new C36489a(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36489a)) {
                return false;
            }
            C36489a aVar = (C36489a) obj;
            return Intrinsics.areEqual((Object) this.f90177a, (Object) aVar.f90177a) && Intrinsics.areEqual((Object) this.f90178b, (Object) aVar.f90178b) && Intrinsics.areEqual((Object) this.f90179c, (Object) aVar.f90179c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo111270f() {
            return this.f90178b;
        }

        @C12580l
        /* renamed from: g */
        public final String mo111271g() {
            return this.f90179c;
        }

        @C12580l
        /* renamed from: h */
        public final String mo111272h() {
            return this.f90177a;
        }

        public int hashCode() {
            String str = this.f90177a;
            int i = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f90178b.hashCode()) * 31;
            String str2 = this.f90179c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            String str = this.f90177a;
            String str2 = this.f90178b;
            String str3 = this.f90179c;
            return "Param(userInfos=" + str + ", newCustomer=" + str2 + ", slotDateBegin=" + str3 + ")";
        }
    }

    @C12579k
    /* renamed from: d */
    public C38042l mo72340a(@C12579k C36489a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "entity");
        String f = aVar.mo111270f();
        String g = aVar.mo111271g();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a("mode", C38212b.f96808p);
        pairArr[1] = C11078d1.m42659a(C38212b.f96818z, C38212b.f96811s);
        pairArr[2] = C11078d1.m42659a("tag", C38212b.f96785E);
        pairArr[3] = C11078d1.m42659a("version", "clcv");
        String h = aVar.mo111272h();
        if (h == null) {
            h = "";
        }
        pairArr[4] = C11078d1.m42659a(C38212b.f96784D, h);
        return new C38042l("", C10977s0.m41446M(pairArr), f, g);
    }
}
