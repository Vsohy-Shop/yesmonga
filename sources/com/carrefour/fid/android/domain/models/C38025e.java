package com.carrefour.fid.android.domain.models;

import com.carrefour.fid.android.data.entities.coupons.CouponType;
import com.carrefour.fid.android.shared.extension.C28759i;
import com.carrefour.fid.android.shared.extension.C28780s;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.shared.util.C28935i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.joda.time.DateTime;

@C11363r0({"SMAP\nCouponDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponDomain.kt\ncom/carrefour/fid/android/domain/models/CouponDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n766#2:108\n857#2,2:109\n*S KotlinDebug\n*F\n+ 1 CouponDomain.kt\ncom/carrefour/fid/android/domain/models/CouponDomainKt\n*L\n90#1:108\n90#1:109,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.models.e */
public final class C38025e {

    /* renamed from: a */
    public static final int f95852a = 86400000;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CouponDomain.kt\ncom/carrefour/fid/android/domain/models/CouponDomainKt\n*L\n1#1,328:1\n84#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.domain.models.e$a */
    public static final class C38026a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Long.valueOf(((C38015d) t).mo117587M()), Long.valueOf(((C38015d) t2).mo117587M()));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 CouponDomain.kt\ncom/carrefour/fid/android/domain/models/CouponDomainKt\n*L\n1#1,328:1\n85#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.domain.models.e$b */
    public static final class C38027b<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator f95853a;

        public C38027b(Comparator comparator) {
            this.f95853a = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.f95853a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            C28932h.C28933a aVar = C28932h.f70914a;
            return C11006g.m42424l(Long.valueOf(aVar.mo84231V(((C38015d) t).mo117595U(), "yyyy-MM-dd")), Long.valueOf(aVar.mo84231V(((C38015d) t2).mo117595U(), "yyyy-MM-dd")));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 CouponDomain.kt\ncom/carrefour/fid/android/domain/models/CouponDomainKt\n*L\n1#1,328:1\n86#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.domain.models.e$c */
    public static final class C38028c<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator f95854a;

        public C38028c(Comparator comparator) {
            this.f95854a = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.f95854a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return C11006g.m42424l(((C38015d) t2).mo117575A(), ((C38015d) t).mo117575A());
        }
    }

    @C12579k
    /* renamed from: a */
    public static final List<C38015d> m156776a(@C12579k List<C38015d> list, long j) {
        Long l;
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C38015d dVar = (C38015d) next;
            DateTime a = C28780s.m119103a(dVar.mo117576B());
            if (a != null) {
                l = Long.valueOf(a.mo27912k());
            } else {
                l = null;
            }
            if (l != null) {
                z = m156777b(j, l.longValue());
            } else {
                C28935i iVar = C28935i.f70940a;
                long I = dVar.mo117583I();
                String B = dVar.mo117576B();
                C28935i.m119705e(iVar, "❌ Error occurred during the parsing of the date of this coupon -> EAN " + I + " DATE " + B + " ❌", (Throwable) null, 0, 6, (Object) null);
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m156777b(long j, long j2) {
        return C28759i.m119064a(Long.valueOf(j2 + ((long) 86400000)), Long.valueOf(j));
    }

    /* renamed from: c */
    public static final boolean m156778c(@C12579k C38015d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return C11622t.contentEquals(CouponType.DIGIT.getType(), dVar.mo117579E(), true);
    }

    @C12579k
    /* renamed from: d */
    public static final C37974c m156779d(@C12579k C37974c cVar) {
        List<C38015d> list;
        List<C38015d> list2;
        List<C38015d> a;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List<C38015d> h = cVar.mo117041h();
        List<C38015d> list3 = null;
        if (h != null) {
            list = m156780e(h);
        } else {
            list = null;
        }
        List<C38015d> g = cVar.mo117040g();
        if (g != null) {
            list2 = m156780e(g);
        } else {
            list2 = null;
        }
        List<C38015d> f = cVar.mo117039f();
        if (!(f == null || (a = m156776a(f, new Date().getTime())) == null)) {
            list3 = m156780e(a);
        }
        return cVar.mo117037d(list, list2, list3);
    }

    @C12579k
    /* renamed from: e */
    public static final List<C38015d> m156780e(@C12579k List<C38015d> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt___CollectionsKt.m40675p5(list, new C38028c(new C38027b(new C38026a())));
    }
}
