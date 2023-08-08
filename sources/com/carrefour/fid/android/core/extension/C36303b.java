package com.carrefour.fid.android.core.extension;

import com.carrefour.fid.android.domain.models.C38039i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDepartmentDomain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentDomain.kt\ncom/carrefour/fid/android/core/extension/DepartmentDomainKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1855#2:23\n766#2:24\n857#2,2:25\n1856#2:27\n1855#2,2:28\n*S KotlinDebug\n*F\n+ 1 DepartmentDomain.kt\ncom/carrefour/fid/android/core/extension/DepartmentDomainKt\n*L\n9#1:23\n10#1:24\n10#1:25,2\n9#1:27\n18#1:28,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.core.extension.b */
public final class C36303b {
    @C12579k
    /* renamed from: a */
    public static final Map<String, List<C38039i>> m148944a(@C12579k List<C38039i> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterable<C38039i> iterable = list;
        for (C38039i iVar : iterable) {
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable) {
                if (Intrinsics.areEqual((Object) ((C38039i) next).mo117757p(), (Object) iVar.mo117757p())) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() > 1) {
                linkedHashMap.put(iVar.mo117757p(), arrayList);
            }
        }
        return C10977s0.m41430D0(linkedHashMap);
    }

    @C12579k
    /* renamed from: b */
    public static final C38039i m148945b(@C12579k List<C38039i> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        C38039i iVar = (C38039i) CollectionsKt___CollectionsKt.m40706w2(list);
        for (C38039i m : list.subList(1, list.size())) {
            iVar.mo117763u(m148946c(iVar.mo117754m(), m.mo117754m()));
        }
        return iVar;
    }

    @C12579k
    /* renamed from: c */
    public static final List<C38039i> m148946c(@C12579k List<C38039i> list, @C12580l List<C38039i> list2) {
        Iterable iterable;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collection collection = list;
        if (list2 != null) {
            iterable = list2;
        } else {
            iterable = CollectionsKt__CollectionsKt.m40441E();
        }
        return CollectionsKt___CollectionsKt.m40718y4(collection, iterable);
    }
}
