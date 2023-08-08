package com.carrefour.fid.android.data.datasource;

import androidx.annotation.C0344h1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.cache.C36380c;
import com.carrefour.fid.android.data.repositories.DepartmentListRepository;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C8567o(parameters = 0)
public final class DepartmentListGateway {

    /* renamed from: d */
    public static final int f90007d = 8;
    @C12579k

    /* renamed from: a */
    public final DepartmentListRepository f90008a;
    @C12579k

    /* renamed from: b */
    public final C37823k f90009b;
    @C12580l

    /* renamed from: c */
    public C36380c f90010c;

    @Inject
    public DepartmentListGateway(@C12579k DepartmentListRepository departmentListRepository, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(departmentListRepository, "repository");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f90008a = departmentListRepository;
        this.f90009b = kVar;
    }

    @C0344h1(otherwise = 2)
    /* renamed from: f */
    public static /* synthetic */ void m149251f() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.carrefour.fid.android.data.cache.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.carrefour.fid.android.data.cache.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.carrefour.fid.android.data.cache.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.carrefour.fid.android.data.cache.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.carrefour.fid.android.data.cache.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108658c(kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.C38039i>>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.data.datasource.DepartmentListGateway$fetchDepartmentsList$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.data.datasource.DepartmentListGateway$fetchDepartmentsList$1 r0 = (com.carrefour.fid.android.data.datasource.DepartmentListGateway$fetchDepartmentsList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.DepartmentListGateway$fetchDepartmentsList$1 r0 = new com.carrefour.fid.android.data.datasource.DepartmentListGateway$fetchDepartmentsList$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r5) goto L_0x0054
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r1 = r0.L$2
            com.carrefour.fid.android.data.datasource.DepartmentListGateway r1 = (com.carrefour.fid.android.data.datasource.DepartmentListGateway) r1
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r0.L$0
            kotlin.Result r0 = (kotlin.Result) r0
            kotlin.C11661u0.m45747n(r11)
            r3 = r2
            goto L_0x00b8
        L_0x003e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0046:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.datasource.DepartmentListGateway r2 = (com.carrefour.fid.android.data.datasource.DepartmentListGateway) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0083
        L_0x0054:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.data.repositories.DepartmentListRepository r2 = (com.carrefour.fid.android.data.repositories.DepartmentListRepository) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.data.datasource.DepartmentListGateway r5 = (com.carrefour.fid.android.data.datasource.DepartmentListGateway) r5
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0073
        L_0x0060:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.data.repositories.DepartmentListRepository r2 = r10.f90008a
            r0.L$0 = r10
            r0.L$1 = r2
            r0.label = r5
            java.lang.Object r11 = r10.mo108661g(r0)
            if (r11 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r5 = r10
        L_0x0073:
            java.lang.String r11 = (java.lang.String) r11
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r11 = r2.mo111499g(r11, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r2 = r5
        L_0x0083:
            kotlin.Result r11 = kotlin.Result.m38701a(r11)
            java.lang.Object r4 = r11.mo21858l()
            boolean r5 = kotlin.Result.m38709i(r4)
            if (r5 == 0) goto L_0x0092
            goto L_0x00c8
        L_0x0092:
            boolean r5 = kotlin.Result.m38709i(r4)
            if (r5 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r6 = r4
        L_0x009a:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x00a3
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x00a4
        L_0x00a3:
            r4 = r6
        L_0x00a4:
            r0.L$0 = r11
            r0.L$1 = r4
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r0 = r2.mo108661g(r0)
            if (r0 != r1) goto L_0x00b3
            return r1
        L_0x00b3:
            r1 = r2
            r3 = r4
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x00b8:
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r7 = 4
            r8 = 0
            com.carrefour.fid.android.data.cache.c r11 = new com.carrefour.fid.android.data.cache.c
            r2 = r11
            r2.<init>(r3, r4, r5, r7, r8)
            r6 = r11
            r11 = r0
            r2 = r1
        L_0x00c8:
            r2.f90010c = r6
            java.lang.Object r11 = r11.mo21858l()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.DepartmentListGateway.mo108658c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108659d(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.C38039i>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.datasource.DepartmentListGateway$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.datasource.DepartmentListGateway$get$1 r0 = (com.carrefour.fid.android.data.datasource.DepartmentListGateway$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.DepartmentListGateway$get$1 r0 = new com.carrefour.fid.android.data.datasource.DepartmentListGateway$get$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0089
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.data.cache.c r2 = (com.carrefour.fid.android.data.cache.C36380c) r2
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.data.datasource.DepartmentListGateway r6 = (com.carrefour.fid.android.data.datasource.DepartmentListGateway) r6
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005c
        L_0x0047:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.data.cache.c r2 = r7.f90010c
            if (r2 == 0) goto L_0x0066
            r0.L$0 = r7
            r0.L$1 = r2
            r0.label = r5
            java.lang.Object r8 = r7.mo108661g(r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r6 = r7
        L_0x005c:
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r2.mo108646d(r8)
            if (r8 != r5) goto L_0x0067
            r3 = r5
            goto L_0x0067
        L_0x0066:
            r6 = r7
        L_0x0067:
            if (r3 == 0) goto L_0x007b
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.data.cache.c r8 = r6.f90010c
            java.lang.String r0 = "null cannot be cast to non-null type com.carrefour.fid.android.data.cache.DepartmentListCache"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r0)
            java.lang.Object r8 = r8.mo83403a()
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            return r8
        L_0x007b:
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r8 = r6.mo108658c(r0)
            if (r8 != r1) goto L_0x0089
            return r1
        L_0x0089:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.DepartmentListGateway.mo108659d(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: e */
    public final C36380c mo108660e() {
        return this.f90010c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108661g(kotlin.coroutines.C11045c<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.datasource.DepartmentListGateway$getFacilityServiceId$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.datasource.DepartmentListGateway$getFacilityServiceId$1 r0 = (com.carrefour.fid.android.data.datasource.DepartmentListGateway$getFacilityServiceId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.DepartmentListGateway$getFacilityServiceId$1 r0 = new com.carrefour.fid.android.data.datasource.DepartmentListGateway$getFacilityServiceId$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.shared.util.ServiceUtil r0 = (com.carrefour.fid.android.shared.util.ServiceUtil) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0050
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.shared.util.ServiceUtil r6 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            com.carrefour.fid.android.domain.interactors.service.k r2 = r5.f90009b
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r0 = r2.m172965invokeIoAF18A(r0)
            if (r0 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0050:
            boolean r1 = kotlin.Result.m38709i(r6)
            r2 = 0
            if (r1 == 0) goto L_0x0058
            r6 = r2
        L_0x0058:
            com.carrefour.fid.android.domain.models.service.models.k r6 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r6
            if (r6 == 0) goto L_0x0060
            com.carrefour.fid.android.domain.models.service.models.StoreService r2 = r6.mo119354f()
        L_0x0060:
            java.lang.String r6 = r0.mo84123e(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.DepartmentListGateway.mo108661g(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public final void mo108662h(@C12580l C36380c cVar) {
        this.f90010c = cVar;
    }
}
