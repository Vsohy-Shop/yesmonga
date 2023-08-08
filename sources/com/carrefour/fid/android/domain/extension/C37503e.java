package com.carrefour.fid.android.domain.extension;

import com.carrefour.fid.android.domain.models.C38039i;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDepartmentDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentDomain.kt\ncom/carrefour/fid/android/domain/extension/DepartmentDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,9:1\n1855#2,2:10\n1045#2:12\n*S KotlinDebug\n*F\n+ 1 DepartmentDomain.kt\ncom/carrefour/fid/android/domain/extension/DepartmentDomainKt\n*L\n6#1:10,2\n7#1:12\n*E\n"})
/* renamed from: com.carrefour.fid.android.domain.extension.e */
public final class C37503e {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DepartmentDomain.kt\ncom/carrefour/fid/android/domain/extension/DepartmentDomainKt\n*L\n1#1,328:1\n7#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.domain.extension.e$a */
    public static final class C37504a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Integer.valueOf(((C38039i) t).mo117759r()), Integer.valueOf(((C38039i) t2).mo117759r()));
        }
    }

    @C12579k
    /* renamed from: a */
    public static final List<C38039i> m153943a(@C12579k List<C38039i> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<C38039i> iterable = list;
        for (C38039i iVar : iterable) {
            iVar.mo117763u(m153943a(iVar.mo117754m()));
        }
        return CollectionsKt___CollectionsKt.m40675p5(iterable, new C37504a());
    }
}
