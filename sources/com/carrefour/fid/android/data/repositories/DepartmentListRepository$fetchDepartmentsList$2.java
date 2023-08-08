package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.domain.models.C38039i;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.DepartmentListRepository$fetchDepartmentsList$2", mo22502f = "DepartmentListRepository.kt", mo22503i = {1}, mo22504l = {28, 60}, mo22505m = "invokeSuspend", mo22506n = {"e"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/i;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDepartmentListRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepartmentListRepository.kt\ncom/carrefour/fid/android/data/repositories/DepartmentListRepository$fetchDepartmentsList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1549#2:72\n1620#2,3:73\n1549#2:76\n1620#2,3:77\n*S KotlinDebug\n*F\n+ 1 DepartmentListRepository.kt\ncom/carrefour/fid/android/data/repositories/DepartmentListRepository$fetchDepartmentsList$2\n*L\n44#1:72\n44#1:73,3\n46#1:76\n46#1:77,3\n*E\n"})
public final class DepartmentListRepository$fetchDepartmentsList$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends List<? extends C38039i>>>, Object> {
    final /* synthetic */ String $facilityServiceId;
    Object L$0;
    int label;
    final /* synthetic */ DepartmentListRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentListRepository$fetchDepartmentsList$2(DepartmentListRepository departmentListRepository, String str, C11045c<? super DepartmentListRepository$fetchDepartmentsList$2> cVar) {
        super(1, cVar);
        this.this$0 = departmentListRepository;
        this.$facilityServiceId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new DepartmentListRepository$fetchDepartmentsList$2(this.this$0, this.$facilityServiceId, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r12.L$0
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0144
        L_0x0017:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001f:
            kotlin.C11661u0.m45747n(r13)
            goto L_0x0047
        L_0x0023:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.data.repositories.DepartmentListRepository r13 = r12.this$0
            com.carrefour.fid.android.data.service.g r4 = r13.f90374a
            java.lang.String r5 = r12.$facilityServiceId
            r6 = 1
            java.lang.String r7 = "mobile_v0"
            com.carrefour.fid.android.data.repositories.DepartmentListRepository r13 = r12.this$0
            com.carrefour.fid.android.data.provider.headers.s r13 = r13.f90376c
            java.lang.String r1 = r12.$facilityServiceId
            java.util.HashMap r8 = r13.mo111446a(r1)
            r12.label = r3
            r9 = r12
            java.lang.Object r13 = r4.mo111642a(r5, r6, r7, r8, r9)
            if (r13 != r0) goto L_0x0047
            return r0
        L_0x0047:
            com.carrefour.fid.android.data.repositories.DepartmentListRepository r1 = r12.this$0
            retrofit2.w r13 = (retrofit2.C13091w) r13
            boolean r4 = r13.mo30576g()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r4 != 0) goto L_0x0063
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.lang.String r3 = "Error fetching Departments"
            com.carrefour.fid.android.shared.io.ResponseThrowable r13 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r13, r3)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.lang.Object r13 = kotlin.Result.m38702b(r13)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            goto L_0x0126
        L_0x0063:
            r1.mo111414b(r13)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.lang.Object r4 = r13.mo30572a()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            com.carrefour.fid.android.data.entities.APIMCatalogsResponse r4 = (com.carrefour.fid.android.data.entities.APIMCatalogsResponse) r4     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r4 == 0) goto L_0x0116
            com.carrefour.fid.android.data.entities.APIMProductResponse r5 = r4.getProduct()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            r6 = 0
            if (r5 == 0) goto L_0x007a
            java.util.List r5 = r5.getCategories()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            goto L_0x007b
        L_0x007a:
            r5 = r6
        L_0x007b:
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            r7 = 0
            if (r5 == 0) goto L_0x0089
            boolean r5 = r5.isEmpty()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r5 == 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r5 = r7
            goto L_0x008a
        L_0x0089:
            r5 = r3
        L_0x008a:
            if (r5 != 0) goto L_0x0116
            com.carrefour.fid.android.data.entities.APIMProductResponse r13 = r4.getProduct()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r13 == 0) goto L_0x0109
            java.util.List r13 = r13.getCategories()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r13 == 0) goto L_0x0109
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            r8 = 10
            int r9 = kotlin.collections.C10978t.m41495Y(r13, r8)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            r5.<init>(r9)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
        L_0x00a9:
            boolean r9 = r13.hasNext()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r9 == 0) goto L_0x00c6
            java.lang.Object r9 = r13.next()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            com.carrefour.fid.android.data.entities.APIMCategoriesResponse r9 = (com.carrefour.fid.android.data.entities.APIMCategoriesResponse) r9     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            com.carrefour.fid.android.data.entities.mapper.c r10 = r1.f90375b     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            com.carrefour.fid.android.data.entities.mapper.c$a r11 = new com.carrefour.fid.android.data.entities.mapper.c$a     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            r11.<init>(r9, r7, r2, r6)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            com.carrefour.fid.android.domain.models.i r9 = r10.mo72340a(r11)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            r5.add(r9)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            goto L_0x00a9
        L_0x00c6:
            com.carrefour.fid.android.data.entities.APIMOffersResponse r13 = r4.getOffers()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r13 == 0) goto L_0x00fe
            java.util.List r13 = r13.getShops()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r13 == 0) goto L_0x00fe
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            int r7 = kotlin.collections.C10978t.m41495Y(r13, r8)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            r4.<init>(r7)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
        L_0x00e1:
            boolean r7 = r13.hasNext()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r7 == 0) goto L_0x00ff
            java.lang.Object r7 = r13.next()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            com.carrefour.fid.android.data.entities.APIMCategoriesResponse r7 = (com.carrefour.fid.android.data.entities.APIMCategoriesResponse) r7     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            com.carrefour.fid.android.data.entities.mapper.c r8 = r1.f90375b     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            com.carrefour.fid.android.data.entities.mapper.c$a r9 = new com.carrefour.fid.android.data.entities.mapper.c$a     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            r9.<init>(r7, r3)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            com.carrefour.fid.android.domain.models.i r7 = r8.mo72340a(r9)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            r4.add(r7)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            goto L_0x00e1
        L_0x00fe:
            r4 = r6
        L_0x00ff:
            java.util.List r13 = com.carrefour.fid.android.core.extension.C36303b.m148946c(r5, r4)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r13 == 0) goto L_0x0109
            java.util.List r6 = com.carrefour.fid.android.domain.extension.C37503e.m153943a(r13)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
        L_0x0109:
            kotlin.Result$a r13 = kotlin.Result.f28060a     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            if (r6 != 0) goto L_0x0111
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
        L_0x0111:
            java.lang.Object r13 = kotlin.Result.m38702b(r6)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            goto L_0x0126
        L_0x0116:
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.lang.String r3 = "Error parsing Departments"
            com.carrefour.fid.android.shared.io.ResponseThrowable r13 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r13, r3)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
            java.lang.Object r13 = kotlin.Result.m38702b(r13)     // Catch:{ NetworkException -> 0x016d, Exception -> 0x012b }
        L_0x0126:
            kotlin.Result r13 = kotlin.Result.m38701a(r13)
            return r13
        L_0x012b:
            r13 = move-exception
            com.carrefour.fid.android.domain.interactors.logm.a r3 = r1.f90377d
            java.lang.String r4 = r13.getMessage()
            if (r4 != 0) goto L_0x0138
            java.lang.String r4 = ""
        L_0x0138:
            r12.L$0 = r13
            r12.label = r2
            java.lang.Object r1 = r1.mo111413a(r3, r4, r12)
            if (r1 != r0) goto L_0x0143
            return r0
        L_0x0143:
            r0 = r13
        L_0x0144:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.Throwable r13 = new java.lang.Throwable
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error while fetching departments list - "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r13.<init>(r1, r0)
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r13)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            kotlin.Result r13 = kotlin.Result.m38701a(r13)
            return r13
        L_0x016d:
            r13 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r1 = r13.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Network exception - "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r13)
            java.lang.Object r13 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r13 = kotlin.Result.m38702b(r13)
            kotlin.Result r13 = kotlin.Result.m38701a(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.DepartmentListRepository$fetchDepartmentsList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends List<C38039i>>> cVar) {
        return ((DepartmentListRepository$fetchDepartmentsList$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
