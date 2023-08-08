package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.core.constants.C36179j;
import com.carrefour.fid.android.domain.models.C38121s;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOrdersOnlineDetailsProductDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsProductDomain.kt\ncom/carrefour/fid/android/domain/extension/OrdersOnlineDetailsProductDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1747#2,3:41\n1747#2,3:44\n1747#2,3:47\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsProductDomain.kt\ncom/carrefour/fid/android/domain/extension/OrdersOnlineDetailsProductDomainKt\n*L\n14#1:41,3\n16#1:44,3\n18#1:47,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.k */
public final class C37510k {
    /* renamed from: a */
    public static final double m153973a(@C12579k C38121s sVar, @C12579k C38121s sVar2) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(sVar2, "replacedProduct");
        return Math.abs(m153976d(sVar2) - m153975c(sVar));
    }

    /* renamed from: b */
    public static final double m153974b(@C12579k C38121s sVar, @C12579k C38121s sVar2) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(sVar2, "replacedProduct");
        double d = m153976d(sVar2);
        double c = m153975c(sVar);
        if (c > d) {
            return d;
        }
        return c;
    }

    /* renamed from: c */
    public static final double m153975c(@C12579k C38121s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return sVar.mo119023N().mo116379f() * ((double) sVar.mo119022M());
    }

    /* renamed from: d */
    public static final double m153976d(@C12579k C38121s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return sVar.mo119023N().mo116379f() * ((double) sVar.mo119027R());
    }

    /* renamed from: e */
    public static final boolean m153977e(@C12579k C38121s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (sVar.mo119022M() < sVar.mo119027R()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m153978f(@C12579k List<C38121s> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<C38121s> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C38121s e : iterable) {
            if (m153977e(e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m153979g(@C12579k C38121s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        String J = sVar.mo119019J();
        if (J == null || !(!C11622t.isBlank(J))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m153980h(@C12579k List<C38121s> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<C38121s> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C38121s g : iterable) {
            if (m153979g(g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m153981i(@C12579k C38121s sVar, @C12579k List<C38121s> list) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "products");
        Iterable<C38121s> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C38121s J : iterable) {
            if (Intrinsics.areEqual((Object) J.mo119019J(), (Object) sVar.mo119010A())) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: j */
    public static final String m153982j(@C12579k C38121s sVar, @C12579k C38121s sVar2) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(sVar2, "replacedProduct");
        if (m153975c(sVar) < m153976d(sVar2)) {
            return C36179j.f89328c;
        }
        if (m153975c(sVar) > m153976d(sVar2)) {
            return C36179j.f89329d;
        }
        return C36179j.f89330e;
    }
}
