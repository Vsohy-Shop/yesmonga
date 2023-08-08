package com.carrefour.fid.android.product.domain.model;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.product.C38104c;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.SearchParam;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.domain.model.e */
public interface C27587e {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.model.e$a */
    public static final class C27588a implements C27587e {

        /* renamed from: e */
        public static final int f67010e = 8;
        @C12579k

        /* renamed from: a */
        public final List<String> f67011a;
        @C12579k

        /* renamed from: b */
        public final String f67012b;
        @C12579k

        /* renamed from: c */
        public final List<String> f67013c;
        @C12580l

        /* renamed from: d */
        public final C38104c f67014d;

        public C27588a(@C12579k List<String> list, @C12579k String str, @C12579k List<String> list2, @C12580l C38104c cVar) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(str, "slotSlice");
            Intrinsics.checkNotNullParameter(list2, "searchParam");
            this.f67011a = list;
            this.f67012b = str;
            this.f67013c = list2;
            this.f67014d = cVar;
        }

        /* renamed from: f */
        public static /* synthetic */ C27588a m116059f(C27588a aVar, List<String> list, String str, List<String> list2, C38104c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f67011a;
            }
            if ((i & 2) != 0) {
                str = aVar.f67012b;
            }
            if ((i & 4) != 0) {
                list2 = aVar.f67013c;
            }
            if ((i & 8) != 0) {
                cVar = aVar.f67014d;
            }
            return aVar.mo80102e(list, str, list2, cVar);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo80098a() {
            return this.f67011a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo80099b() {
            return this.f67012b;
        }

        @C12579k
        /* renamed from: c */
        public final List<String> mo80100c() {
            return this.f67013c;
        }

        @C12580l
        /* renamed from: d */
        public final C38104c mo80101d() {
            return this.f67014d;
        }

        @C12579k
        /* renamed from: e */
        public final C27588a mo80102e(@C12579k List<String> list, @C12579k String str, @C12579k List<String> list2, @C12580l C38104c cVar) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(str, "slotSlice");
            Intrinsics.checkNotNullParameter(list2, "searchParam");
            return new C27588a(list, str, list2, cVar);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27588a)) {
                return false;
            }
            C27588a aVar = (C27588a) obj;
            return Intrinsics.areEqual((Object) this.f67011a, (Object) aVar.f67011a) && Intrinsics.areEqual((Object) this.f67012b, (Object) aVar.f67012b) && Intrinsics.areEqual((Object) this.f67013c, (Object) aVar.f67013c) && Intrinsics.areEqual((Object) this.f67014d, (Object) aVar.f67014d);
        }

        @C12580l
        /* renamed from: g */
        public final C38104c mo80104g() {
            return this.f67014d;
        }

        @C12579k
        /* renamed from: h */
        public final List<String> mo80105h() {
            return this.f67011a;
        }

        public int hashCode() {
            int hashCode = ((((this.f67011a.hashCode() * 31) + this.f67012b.hashCode()) * 31) + this.f67013c.hashCode()) * 31;
            C38104c cVar = this.f67014d;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        @C12579k
        /* renamed from: i */
        public final List<String> mo80107i() {
            return this.f67013c;
        }

        @C12579k
        /* renamed from: j */
        public final String mo80108j() {
            return this.f67012b;
        }

        @C12579k
        public String toString() {
            List<String> list = this.f67011a;
            String str = this.f67012b;
            List<String> list2 = this.f67013c;
            C38104c cVar = this.f67014d;
            return "Department(facilityServiceIds=" + list + ", slotSlice=" + str + ", searchParam=" + list2 + ", facets=" + cVar + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.model.e$b */
    public static final class C27589b implements C27587e {

        /* renamed from: c */
        public static final int f67015c = 8;
        @C12579k

        /* renamed from: a */
        public final List<String> f67016a;
        @C12579k

        /* renamed from: b */
        public final List<Gtin> f67017b;

        public C27589b(@C12579k List<String> list, @C12579k List<Gtin> list2) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(list2, "gtins");
            this.f67016a = list;
            this.f67017b = list2;
        }

        /* renamed from: d */
        public static /* synthetic */ C27589b m116069d(C27589b bVar, List<String> list, List<Gtin> list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bVar.f67016a;
            }
            if ((i & 2) != 0) {
                list2 = bVar.f67017b;
            }
            return bVar.mo80112c(list, list2);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo80110a() {
            return this.f67016a;
        }

        @C12579k
        /* renamed from: b */
        public final List<Gtin> mo80111b() {
            return this.f67017b;
        }

        @C12579k
        /* renamed from: c */
        public final C27589b mo80112c(@C12579k List<String> list, @C12579k List<Gtin> list2) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(list2, "gtins");
            return new C27589b(list, list2);
        }

        @C12579k
        /* renamed from: e */
        public final List<String> mo80113e() {
            return this.f67016a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27589b)) {
                return false;
            }
            C27589b bVar = (C27589b) obj;
            return Intrinsics.areEqual((Object) this.f67016a, (Object) bVar.f67016a) && Intrinsics.areEqual((Object) this.f67017b, (Object) bVar.f67017b);
        }

        @C12579k
        /* renamed from: f */
        public final List<Gtin> mo80115f() {
            return this.f67017b;
        }

        public int hashCode() {
            return (this.f67016a.hashCode() * 31) + this.f67017b.hashCode();
        }

        @C12579k
        public String toString() {
            List<String> list = this.f67016a;
            List<Gtin> list2 = this.f67017b;
            return "GtinList(facilityServiceIds=" + list + ", gtins=" + list2 + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.model.e$c */
    public static final class C27590c implements C27587e {

        /* renamed from: d */
        public static final int f67018d = 8;
        @C12579k

        /* renamed from: a */
        public final List<String> f67019a;
        @C12579k

        /* renamed from: b */
        public final String f67020b;
        @C12580l

        /* renamed from: c */
        public final C38104c f67021c;

        public C27590c(@C12579k List<String> list, @C12579k String str, @C12580l C38104c cVar) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(str, "slotSlice");
            this.f67019a = list;
            this.f67020b = str;
            this.f67021c = cVar;
        }

        /* renamed from: e */
        public static /* synthetic */ C27590c m116075e(C27590c cVar, List<String> list, String str, C38104c cVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = cVar.f67019a;
            }
            if ((i & 2) != 0) {
                str = cVar.f67020b;
            }
            if ((i & 4) != 0) {
                cVar2 = cVar.f67021c;
            }
            return cVar.mo80121d(list, str, cVar2);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo80118a() {
            return this.f67019a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo80119b() {
            return this.f67020b;
        }

        @C12580l
        /* renamed from: c */
        public final C38104c mo80120c() {
            return this.f67021c;
        }

        @C12579k
        /* renamed from: d */
        public final C27590c mo80121d(@C12579k List<String> list, @C12579k String str, @C12580l C38104c cVar) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(str, "slotSlice");
            return new C27590c(list, str, cVar);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27590c)) {
                return false;
            }
            C27590c cVar = (C27590c) obj;
            return Intrinsics.areEqual((Object) this.f67019a, (Object) cVar.f67019a) && Intrinsics.areEqual((Object) this.f67020b, (Object) cVar.f67020b) && Intrinsics.areEqual((Object) this.f67021c, (Object) cVar.f67021c);
        }

        @C12580l
        /* renamed from: f */
        public final C38104c mo80123f() {
            return this.f67021c;
        }

        @C12579k
        /* renamed from: g */
        public final List<String> mo80124g() {
            return this.f67019a;
        }

        @C12579k
        /* renamed from: h */
        public final String mo80125h() {
            return this.f67020b;
        }

        public int hashCode() {
            int hashCode = ((this.f67019a.hashCode() * 31) + this.f67020b.hashCode()) * 31;
            C38104c cVar = this.f67021c;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        @C12579k
        public String toString() {
            List<String> list = this.f67019a;
            String str = this.f67020b;
            C38104c cVar = this.f67021c;
            return "Promo(facilityServiceIds=" + list + ", slotSlice=" + str + ", facets=" + cVar + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.model.e$d */
    public static final class C27591d implements C27587e {

        /* renamed from: e */
        public static final int f67022e = 8;
        @C12579k

        /* renamed from: a */
        public final List<String> f67023a;
        @C12579k

        /* renamed from: b */
        public final String f67024b;
        @C12579k

        /* renamed from: c */
        public final String f67025c;
        @C12580l

        /* renamed from: d */
        public final C38104c f67026d;

        public C27591d(@C12579k List<String> list, @C12579k String str, @C12579k String str2, @C12580l C38104c cVar) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(str, "slotSlice");
            Intrinsics.checkNotNullParameter(str2, "query");
            this.f67023a = list;
            this.f67024b = str;
            this.f67025c = str2;
            this.f67026d = cVar;
        }

        /* renamed from: f */
        public static /* synthetic */ C27591d m116083f(C27591d dVar, List<String> list, String str, String str2, C38104c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dVar.f67023a;
            }
            if ((i & 2) != 0) {
                str = dVar.f67024b;
            }
            if ((i & 4) != 0) {
                str2 = dVar.f67025c;
            }
            if ((i & 8) != 0) {
                cVar = dVar.f67026d;
            }
            return dVar.mo80132e(list, str, str2, cVar);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo80128a() {
            return this.f67023a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo80129b() {
            return this.f67024b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo80130c() {
            return this.f67025c;
        }

        @C12580l
        /* renamed from: d */
        public final C38104c mo80131d() {
            return this.f67026d;
        }

        @C12579k
        /* renamed from: e */
        public final C27591d mo80132e(@C12579k List<String> list, @C12579k String str, @C12579k String str2, @C12580l C38104c cVar) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(str, "slotSlice");
            Intrinsics.checkNotNullParameter(str2, "query");
            return new C27591d(list, str, str2, cVar);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27591d)) {
                return false;
            }
            C27591d dVar = (C27591d) obj;
            return Intrinsics.areEqual((Object) this.f67023a, (Object) dVar.f67023a) && Intrinsics.areEqual((Object) this.f67024b, (Object) dVar.f67024b) && Intrinsics.areEqual((Object) this.f67025c, (Object) dVar.f67025c) && Intrinsics.areEqual((Object) this.f67026d, (Object) dVar.f67026d);
        }

        @C12580l
        /* renamed from: g */
        public final C38104c mo80134g() {
            return this.f67026d;
        }

        @C12579k
        /* renamed from: h */
        public final List<String> mo80135h() {
            return this.f67023a;
        }

        public int hashCode() {
            int hashCode = ((((this.f67023a.hashCode() * 31) + this.f67024b.hashCode()) * 31) + this.f67025c.hashCode()) * 31;
            C38104c cVar = this.f67026d;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        @C12579k
        /* renamed from: i */
        public final String mo80137i() {
            return this.f67025c;
        }

        @C12579k
        /* renamed from: j */
        public final String mo80138j() {
            return this.f67024b;
        }

        @C12579k
        public String toString() {
            List<String> list = this.f67023a;
            String str = this.f67024b;
            String str2 = this.f67025c;
            C38104c cVar = this.f67026d;
            return "Query(facilityServiceIds=" + list + ", slotSlice=" + str + ", query=" + str2 + ", facets=" + cVar + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.domain.model.e$e */
    public static final class C27592e implements C27587e {

        /* renamed from: e */
        public static final int f67027e = 8;
        @C12579k

        /* renamed from: a */
        public final List<String> f67028a;
        @C12579k

        /* renamed from: b */
        public final String f67029b;
        @C12579k

        /* renamed from: c */
        public final String f67030c;
        @C12580l

        /* renamed from: d */
        public final C38104c f67031d;

        public /* synthetic */ C27592e(List list, String str, String str2, C38104c cVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, str2, cVar);
        }

        /* renamed from: f */
        public static /* synthetic */ C27592e m116093f(C27592e eVar, List<String> list, String str, String str2, C38104c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                list = eVar.f67028a;
            }
            if ((i & 2) != 0) {
                str = eVar.f67029b;
            }
            if ((i & 4) != 0) {
                str2 = eVar.f67030c;
            }
            if ((i & 8) != 0) {
                cVar = eVar.f67031d;
            }
            return eVar.mo80144e(list, str, str2, cVar);
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo80140a() {
            return this.f67028a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo80141b() {
            return this.f67029b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo80142c() {
            return this.f67030c;
        }

        @C12580l
        /* renamed from: d */
        public final C38104c mo80143d() {
            return this.f67031d;
        }

        @C12579k
        /* renamed from: e */
        public final C27592e mo80144e(@C12579k List<String> list, @C12579k String str, @C12579k String str2, @C12580l C38104c cVar) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(str, "slotSlice");
            Intrinsics.checkNotNullParameter(str2, "searchParam");
            return new C27592e(list, str, str2, cVar, (DefaultConstructorMarker) null);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27592e)) {
                return false;
            }
            C27592e eVar = (C27592e) obj;
            return Intrinsics.areEqual((Object) this.f67028a, (Object) eVar.f67028a) && Intrinsics.areEqual((Object) this.f67029b, (Object) eVar.f67029b) && SearchParam.m157481e(this.f67030c, eVar.f67030c) && Intrinsics.areEqual((Object) this.f67031d, (Object) eVar.f67031d);
        }

        @C12580l
        /* renamed from: g */
        public final C38104c mo80146g() {
            return this.f67031d;
        }

        @C12579k
        /* renamed from: h */
        public final List<String> mo80147h() {
            return this.f67028a;
        }

        public int hashCode() {
            int hashCode = ((((this.f67028a.hashCode() * 31) + this.f67029b.hashCode()) * 31) + SearchParam.m157482g(this.f67030c)) * 31;
            C38104c cVar = this.f67031d;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        @C12579k
        /* renamed from: i */
        public final String mo80149i() {
            return this.f67030c;
        }

        @C12579k
        /* renamed from: j */
        public final String mo80150j() {
            return this.f67029b;
        }

        @C12579k
        public String toString() {
            List<String> list = this.f67028a;
            String str = this.f67029b;
            String h = SearchParam.m157483h(this.f67030c);
            C38104c cVar = this.f67031d;
            return "Search(facilityServiceIds=" + list + ", slotSlice=" + str + ", searchParam=" + h + ", facets=" + cVar + ")";
        }

        public C27592e(List<String> list, String str, String str2, C38104c cVar) {
            Intrinsics.checkNotNullParameter(list, "facilityServiceIds");
            Intrinsics.checkNotNullParameter(str, "slotSlice");
            Intrinsics.checkNotNullParameter(str2, "searchParam");
            this.f67028a = list;
            this.f67029b = str;
            this.f67030c = str2;
            this.f67031d = cVar;
        }
    }
}
