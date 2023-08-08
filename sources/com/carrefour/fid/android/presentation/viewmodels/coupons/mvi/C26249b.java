package com.carrefour.fid.android.presentation.viewmodels.coupons.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import com.carrefour.fid.android.presentation.models.FilterSection;
import com.carrefour.fid.android.presentation.p035ui.coupons.filter.C23812d;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.b */
public final class C26249b {
    @C12579k

    /* renamed from: a */
    public static final C26249b f64184a = new C26249b();

    /* renamed from: b */
    public static final int f64185b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.b$a */
    public interface C26250a extends C28505u.C28506a {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.b$a$a */
        public static final class C26251a implements C26250a {

            /* renamed from: c */
            public static final int f64186c = 8;
            @C12579k

            /* renamed from: a */
            public final List<CouponsFilter> f64187a;
            @C12579k

            /* renamed from: b */
            public final List<CouponModel> f64188b;

            public C26251a(@C12579k List<CouponsFilter> list, @C12579k List<CouponModel> list2) {
                Intrinsics.checkNotNullParameter(list, C23812d.f59917a);
                Intrinsics.checkNotNullParameter(list2, "coupons");
                this.f64187a = list;
                this.f64188b = list2;
            }

            /* renamed from: d */
            public static /* synthetic */ C26251a m112156d(C26251a aVar, List<CouponsFilter> list, List<CouponModel> list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = aVar.f64187a;
                }
                if ((i & 2) != 0) {
                    list2 = aVar.f64188b;
                }
                return aVar.mo76337c(list, list2);
            }

            @C12579k
            /* renamed from: a */
            public final List<CouponsFilter> mo76335a() {
                return this.f64187a;
            }

            @C12579k
            /* renamed from: b */
            public final List<CouponModel> mo76336b() {
                return this.f64188b;
            }

            @C12579k
            /* renamed from: c */
            public final C26251a mo76337c(@C12579k List<CouponsFilter> list, @C12579k List<CouponModel> list2) {
                Intrinsics.checkNotNullParameter(list, C23812d.f59917a);
                Intrinsics.checkNotNullParameter(list2, "coupons");
                return new C26251a(list, list2);
            }

            @C12579k
            /* renamed from: e */
            public final List<CouponModel> mo76338e() {
                return this.f64188b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26251a)) {
                    return false;
                }
                C26251a aVar = (C26251a) obj;
                return Intrinsics.areEqual((Object) this.f64187a, (Object) aVar.f64187a) && Intrinsics.areEqual((Object) this.f64188b, (Object) aVar.f64188b);
            }

            @C12579k
            /* renamed from: f */
            public final List<CouponsFilter> mo76340f() {
                return this.f64187a;
            }

            public int hashCode() {
                return (this.f64187a.hashCode() * 31) + this.f64188b.hashCode();
            }

            @C12579k
            public String toString() {
                List<CouponsFilter> list = this.f64187a;
                List<CouponModel> list2 = this.f64188b;
                return "ApplyFilters(filters=" + list + ", coupons=" + list2 + ")";
            }
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.b$b */
    public static final class C26252b implements C28505u.C28509d {

        /* renamed from: f */
        public static final int f64189f = 8;
        @C12580l

        /* renamed from: b */
        public final List<CouponsFilter> f64190b;
        @C12579k

        /* renamed from: c */
        public final List<CouponModel> f64191c;
        @C12579k

        /* renamed from: d */
        public final List<CouponModel> f64192d;

        /* renamed from: e */
        public final boolean f64193e;

        public C26252b() {
            this((List) null, (List) null, (List) null, false, 15, (DefaultConstructorMarker) null);
        }

        /* renamed from: j */
        public static /* synthetic */ C26252b m112162j(C26252b bVar, List<CouponsFilter> list, List<CouponModel> list2, List<CouponModel> list3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bVar.f64190b;
            }
            if ((i & 2) != 0) {
                list2 = bVar.f64191c;
            }
            if ((i & 4) != 0) {
                list3 = bVar.f64192d;
            }
            if ((i & 8) != 0) {
                z = bVar.f64193e;
            }
            return bVar.mo76349i(list, list2, list3, z);
        }

        @C12580l
        /* renamed from: e */
        public final List<CouponsFilter> mo76343e() {
            return this.f64190b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26252b)) {
                return false;
            }
            C26252b bVar = (C26252b) obj;
            return Intrinsics.areEqual((Object) this.f64190b, (Object) bVar.f64190b) && Intrinsics.areEqual((Object) this.f64191c, (Object) bVar.f64191c) && Intrinsics.areEqual((Object) this.f64192d, (Object) bVar.f64192d) && this.f64193e == bVar.f64193e;
        }

        @C12579k
        /* renamed from: f */
        public final List<CouponModel> mo76345f() {
            return this.f64191c;
        }

        @C12579k
        /* renamed from: g */
        public final List<CouponModel> mo76346g() {
            return this.f64192d;
        }

        /* renamed from: h */
        public final boolean mo76347h() {
            return this.f64193e;
        }

        public int hashCode() {
            List<CouponsFilter> list = this.f64190b;
            int hashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.f64191c.hashCode()) * 31) + this.f64192d.hashCode()) * 31;
            boolean z = this.f64193e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        /* renamed from: i */
        public final C26252b mo76349i(@C12580l List<CouponsFilter> list, @C12579k List<CouponModel> list2, @C12579k List<CouponModel> list3, boolean z) {
            Intrinsics.checkNotNullParameter(list2, "coupons");
            Intrinsics.checkNotNullParameter(list3, "filteredCoupons");
            return new C26252b(list, list2, list3, z);
        }

        @C12579k
        /* renamed from: k */
        public final List<CouponModel> mo76350k() {
            return this.f64191c;
        }

        @C12579k
        /* renamed from: l */
        public final List<CouponModel> mo76351l() {
            return this.f64192d;
        }

        @C12580l
        /* renamed from: m */
        public final List<CouponsFilter> mo76352m() {
            return this.f64190b;
        }

        /* renamed from: n */
        public final boolean mo76353n() {
            return this.f64193e;
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        @C12579k
        public String toString() {
            List<CouponsFilter> list = this.f64190b;
            List<CouponModel> list2 = this.f64191c;
            List<CouponModel> list3 = this.f64192d;
            boolean z = this.f64193e;
            return "UiState(filters=" + list + ", coupons=" + list2 + ", filteredCoupons=" + list3 + ", isInStore=" + z + ")";
        }

        public C26252b(@C12580l List<CouponsFilter> list, @C12579k List<CouponModel> list2, @C12579k List<CouponModel> list3, boolean z) {
            Intrinsics.checkNotNullParameter(list2, "coupons");
            Intrinsics.checkNotNullParameter(list3, "filteredCoupons");
            this.f64190b = list;
            this.f64191c = list2;
            this.f64192d = list3;
            this.f64193e = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26252b(List list, List list2, List list3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list3, (i & 8) != 0 ? true : z);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.b$c */
    public static abstract class C26253c implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f64194a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.b$c$a */
        public static final class C26254a extends C26253c {
            @C12579k

            /* renamed from: b */
            public static final C26254a f64195b = new C26254a();

            /* renamed from: c */
            public static final int f64196c = 0;

            public C26254a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.b$c$b */
        public static final class C26255b extends C26253c {

            /* renamed from: e */
            public static final int f64197e = 8;
            @C12579k

            /* renamed from: b */
            public final List<CouponModel> f64198b;
            @C12579k

            /* renamed from: c */
            public final List<CouponsFilter> f64199c;

            /* renamed from: d */
            public final boolean f64200d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26255b(@C12579k List<CouponModel> list, @C12579k List<CouponsFilter> list2, boolean z) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(list, "list");
                Intrinsics.checkNotNullParameter(list2, C23812d.f59917a);
                this.f64198b = list;
                this.f64199c = list2;
                this.f64200d = z;
            }

            /* renamed from: e */
            public static /* synthetic */ C26255b m112172e(C26255b bVar, List<CouponModel> list, List<CouponsFilter> list2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = bVar.f64198b;
                }
                if ((i & 2) != 0) {
                    list2 = bVar.f64199c;
                }
                if ((i & 4) != 0) {
                    z = bVar.f64200d;
                }
                return bVar.mo76358d(list, list2, z);
            }

            @C12579k
            /* renamed from: a */
            public final List<CouponModel> mo76355a() {
                return this.f64198b;
            }

            @C12579k
            /* renamed from: b */
            public final List<CouponsFilter> mo76356b() {
                return this.f64199c;
            }

            /* renamed from: c */
            public final boolean mo76357c() {
                return this.f64200d;
            }

            @C12579k
            /* renamed from: d */
            public final C26255b mo76358d(@C12579k List<CouponModel> list, @C12579k List<CouponsFilter> list2, boolean z) {
                Intrinsics.checkNotNullParameter(list, "list");
                Intrinsics.checkNotNullParameter(list2, C23812d.f59917a);
                return new C26255b(list, list2, z);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26255b)) {
                    return false;
                }
                C26255b bVar = (C26255b) obj;
                return Intrinsics.areEqual((Object) this.f64198b, (Object) bVar.f64198b) && Intrinsics.areEqual((Object) this.f64199c, (Object) bVar.f64199c) && this.f64200d == bVar.f64200d;
            }

            @C12579k
            /* renamed from: f */
            public final List<CouponsFilter> mo76360f() {
                return this.f64199c;
            }

            @C12579k
            /* renamed from: g */
            public final List<CouponModel> mo76361g() {
                return this.f64198b;
            }

            /* renamed from: h */
            public final boolean mo76362h() {
                return this.f64200d;
            }

            public int hashCode() {
                int hashCode = ((this.f64198b.hashCode() * 31) + this.f64199c.hashCode()) * 31;
                boolean z = this.f64200d;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            @C12579k
            public String toString() {
                List<CouponModel> list = this.f64198b;
                List<CouponsFilter> list2 = this.f64199c;
                boolean z = this.f64200d;
                return "InitCoupons(list=" + list + ", filters=" + list2 + ", isInStore=" + z + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.b$c$c */
        public static final class C26256c extends C26253c {
            @C12579k

            /* renamed from: b */
            public static final C26256c f64201b = new C26256c();

            /* renamed from: c */
            public static final int f64202c = 0;

            public C26256c() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.mvi.b$c$d */
        public static final class C26257d extends C26253c {

            /* renamed from: d */
            public static final int f64203d = 0;
            @C12579k

            /* renamed from: b */
            public final FilterSection f64204b;
            @C12579k

            /* renamed from: c */
            public final String f64205c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26257d(@C12579k FilterSection filterSection, @C12579k String str) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(filterSection, "section");
                Intrinsics.checkNotNullParameter(str, "key");
                this.f64204b = filterSection;
                this.f64205c = str;
            }

            /* renamed from: d */
            public static /* synthetic */ C26257d m112180d(C26257d dVar, FilterSection filterSection, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    filterSection = dVar.f64204b;
                }
                if ((i & 2) != 0) {
                    str = dVar.f64205c;
                }
                return dVar.mo76367c(filterSection, str);
            }

            @C12579k
            /* renamed from: a */
            public final FilterSection mo76365a() {
                return this.f64204b;
            }

            @C12579k
            /* renamed from: b */
            public final String mo76366b() {
                return this.f64205c;
            }

            @C12579k
            /* renamed from: c */
            public final C26257d mo76367c(@C12579k FilterSection filterSection, @C12579k String str) {
                Intrinsics.checkNotNullParameter(filterSection, "section");
                Intrinsics.checkNotNullParameter(str, "key");
                return new C26257d(filterSection, str);
            }

            @C12579k
            /* renamed from: e */
            public final String mo76368e() {
                return this.f64205c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C26257d)) {
                    return false;
                }
                C26257d dVar = (C26257d) obj;
                return this.f64204b == dVar.f64204b && Intrinsics.areEqual((Object) this.f64205c, (Object) dVar.f64205c);
            }

            @C12579k
            /* renamed from: f */
            public final FilterSection mo76370f() {
                return this.f64204b;
            }

            public int hashCode() {
                return (this.f64204b.hashCode() * 31) + this.f64205c.hashCode();
            }

            @C12579k
            public String toString() {
                FilterSection filterSection = this.f64204b;
                String str = this.f64205c;
                return "UpdateFilter(section=" + filterSection + ", key=" + str + ")";
            }
        }

        public /* synthetic */ C26253c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C26253c() {
        }
    }
}
