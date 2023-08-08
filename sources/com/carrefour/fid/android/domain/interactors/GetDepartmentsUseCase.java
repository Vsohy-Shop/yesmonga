package com.carrefour.fid.android.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.extension.C36303b;
import com.carrefour.fid.android.data.datasource.DepartmentListGateway;
import com.carrefour.fid.android.domain.models.C38039i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "Deprecated for BFF use", replaceWith = @C11587t0(expression = "GetCategoriesUseCase", imports = {}))
@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetDepartmentsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetDepartmentsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/GetDepartmentsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,49:1\n1855#2,2:50\n223#2,2:53\n1655#2,8:56\n215#3:52\n216#3:55\n*S KotlinDebug\n*F\n+ 1 GetDepartmentsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/GetDepartmentsUseCase\n*L\n28#1:50,2\n41#1:53,2\n46#1:56,8\n40#1:52\n40#1:55\n*E\n"})
public final class GetDepartmentsUseCase implements C37678e<List<? extends C38039i>> {

    /* renamed from: b */
    public static final int f94250b = 8;
    @C12579k

    /* renamed from: a */
    public final DepartmentListGateway f94251a;

    @Inject
    public GetDepartmentsUseCase(@C12579k DepartmentListGateway departmentListGateway) {
        Intrinsics.checkNotNullParameter(departmentListGateway, "departmentListGateway");
        this.f94251a = departmentListGateway;
    }

    /* renamed from: a */
    public final List<C38039i> mo114274a(List<C38039i> list) {
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

    /* renamed from: c */
    public final List<C38039i> mo114275c(List<C38039i> list) {
        List<C38039i> a = mo114274a(list);
        for (C38039i iVar : a) {
            iVar.mo117763u(mo114274a(iVar.mo117754m()));
            mo114275c(iVar.mo117754m());
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172930invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.C38039i>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.GetDepartmentsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.GetDepartmentsUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.GetDepartmentsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.GetDepartmentsUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.GetDepartmentsUseCase$invoke$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.GetDepartmentsUseCase r0 = (com.carrefour.fid.android.domain.interactors.GetDepartmentsUseCase) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.data.datasource.DepartmentListGateway r5 = r4.f94251a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo108659d(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            boolean r1 = kotlin.Result.m38709i(r5)
            if (r1 == 0) goto L_0x0064
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Throwable r5 = new java.lang.Throwable
            java.lang.String r0 = "error"
            r5.<init>(r0)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x007d
        L_0x0064:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            boolean r1 = kotlin.Result.m38709i(r5)
            if (r1 == 0) goto L_0x006d
            r5 = 0
        L_0x006d:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0075
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0075:
            java.util.List r5 = r0.mo114275c(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x007d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.GetDepartmentsUseCase.m172930invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
