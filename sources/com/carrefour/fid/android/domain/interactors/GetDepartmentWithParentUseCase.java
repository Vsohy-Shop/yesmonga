package com.carrefour.fid.android.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.extension.C36303b;
import com.carrefour.fid.android.data.datasource.DepartmentListGateway;
import com.carrefour.fid.android.domain.models.C38039i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "Deprecated for BFF use", replaceWith = @C11587t0(expression = "GetCategoriesUseCase", imports = {}))
@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetDepartmentWithParentUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetDepartmentWithParentUseCase.kt\ncom/carrefour/fid/android/domain/interactors/GetDepartmentWithParentUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1855#2,2:74\n223#2,2:77\n1655#2,8:80\n1855#2:89\n1855#2,2:90\n1856#2:92\n215#3:76\n216#3:79\n1#4:88\n*S KotlinDebug\n*F\n+ 1 GetDepartmentWithParentUseCase.kt\ncom/carrefour/fid/android/domain/interactors/GetDepartmentWithParentUseCase\n*L\n26#1:74,2\n39#1:77,2\n43#1:80,8\n53#1:89\n60#1:90,2\n53#1:92\n38#1:76\n38#1:79\n*E\n"})
public final class GetDepartmentWithParentUseCase implements C37679f<String, List<? extends C38039i>> {

    /* renamed from: b */
    public static final int f94248b = 8;
    @C12579k

    /* renamed from: a */
    public final DepartmentListGateway f94249a;

    @Inject
    public GetDepartmentWithParentUseCase(@C12579k DepartmentListGateway departmentListGateway) {
        Intrinsics.checkNotNullParameter(departmentListGateway, "departmentListGateway");
        this.f94249a = departmentListGateway;
    }

    /* renamed from: a */
    public final List<C38039i> mo114270a(List<C38039i> list) {
        List T5 = CollectionsKt___CollectionsKt.m40572T5(list);
        Map<String, List<C38039i>> a = C36303b.m148944a(T5);
        if (!a.isEmpty()) {
            for (Map.Entry next : a.entrySet()) {
                for (Object next2 : T5) {
                    if (Intrinsics.areEqual((Object) ((C38039i) next2).mo117757p(), next.getKey())) {
                        T5.set(T5.indexOf(next2), C36303b.m148945b((List) next.getValue()));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next3 : T5) {
            if (hashSet.add(((C38039i) next3).mo117757p())) {
                arrayList.add(next3);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<C38039i> mo114271b(List<C38039i> list) {
        List<C38039i> a = mo114270a(list);
        for (C38039i iVar : a) {
            iVar.mo117763u(mo114270a(iVar.mo117754m()));
            mo114271b(iVar.mo117754m());
        }
        return a;
    }

    /* renamed from: c */
    public final List<C38039i> mo114272c(List<C38039i> list, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterable<C38039i> iterable = list;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((C38039i) obj).mo117757p(), (Object) str)) {
                break;
            }
        }
        C38039i iVar = (C38039i) obj;
        if (iVar != null) {
            return C10976s.m41419k(iVar);
        }
        for (C38039i iVar2 : iterable) {
            Iterator it2 = iVar2.mo117754m().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (Intrinsics.areEqual((Object) ((C38039i) obj2).mo117757p(), (Object) str)) {
                    break;
                }
            }
            C38039i iVar3 = (C38039i) obj2;
            if (iVar3 != null) {
                return CollectionsKt__CollectionsKt.m40448L(iVar2, iVar3);
            }
            Iterator it3 = iVar2.mo117754m().iterator();
            while (true) {
                if (it3.hasNext()) {
                    C38039i iVar4 = (C38039i) it3.next();
                    Iterator it4 = iVar4.mo117754m().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it4.next();
                        if (Intrinsics.areEqual((Object) ((C38039i) obj3).mo117757p(), (Object) str)) {
                            break;
                        }
                    }
                    C38039i iVar5 = (C38039i) obj3;
                    if (iVar5 != null) {
                        return CollectionsKt__CollectionsKt.m40448L(iVar2, iVar4, iVar5);
                    }
                }
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172929invokegIAlus(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.C38039i>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.GetDepartmentWithParentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.GetDepartmentWithParentUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.GetDepartmentWithParentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.GetDepartmentWithParentUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.GetDepartmentWithParentUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.GetDepartmentWithParentUseCase r0 = (com.carrefour.fid.android.domain.interactors.GetDepartmentWithParentUseCase) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0052
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.datasource.DepartmentListGateway r6 = r4.f94249a
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.mo108659d(r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r4
        L_0x0052:
            boolean r1 = kotlin.Result.m38710j(r6)
            if (r1 == 0) goto L_0x006f
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x0062
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0062:
            java.util.List r6 = r0.mo114271b(r6)
            java.util.List r5 = r0.mo114272c(r6, r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0073
        L_0x006f:
            java.lang.Object r5 = kotlin.Result.m38702b(r6)
        L_0x0073:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.GetDepartmentWithParentUseCase.m172929invokegIAlus(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
