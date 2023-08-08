package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.mapper.C36507m;
import com.carrefour.fid.android.data.entities.mapper.C36523s;
import com.carrefour.fid.android.data.provider.headers.C36571m;
import com.carrefour.fid.android.data.service.C36632k;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class OrderOfflineRepository {

    /* renamed from: e */
    public static final int f90411e = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C36507m f90412a;
    @C12579k

    /* renamed from: b */
    public final C36523s f90413b;
    @C12579k

    /* renamed from: c */
    public final C36632k f90414c;
    @C12579k

    /* renamed from: d */
    public final C36571m f90415d;

    @Inject
    public OrderOfflineRepository(@C12579k C36507m mVar, @C12579k C36523s sVar, @C12579k C36632k kVar, @C12579k C36571m mVar2) {
        Intrinsics.checkNotNullParameter(mVar, "apimOrdersOfflineDetailsEntityDataMapper");
        Intrinsics.checkNotNullParameter(sVar, "apimOrdersOfflineEntityDataMapper");
        Intrinsics.checkNotNullParameter(kVar, "orderOfflineApiService");
        Intrinsics.checkNotNullParameter(mVar2, "ordersHistoryHeaders");
        this.f90412a = mVar;
        this.f90413b = sVar;
        this.f90414c = kVar;
        this.f90415d = mVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111533a(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase.C37721a r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderDetail$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderDetail$1 r0 = (com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderDetail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderDetail$1 r0 = new com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderDetail$1
            r0.<init>(r8, r10)
        L_0x0018:
            r6 = r0
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            java.lang.String r7 = "Error during fetching offline order detail for "
            r2 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            java.lang.Object r9 = r6.L$1
            com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$a r9 = (com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase.C37721a) r9
            java.lang.Object r0 = r6.L$0
            com.carrefour.fid.android.data.repositories.OrderOfflineRepository r0 = (com.carrefour.fid.android.data.repositories.OrderOfflineRepository) r0
            kotlin.C11661u0.m45747n(r10)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0062
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.data.service.k r1 = r8.f90414c     // Catch:{ Exception -> 0x00a4 }
            com.carrefour.fid.android.data.provider.headers.m r10 = r8.f90415d     // Catch:{ Exception -> 0x00a4 }
            java.util.HashMap r10 = r10.mo111440a()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = r9.mo114844j()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r4 = r9.mo114845k()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = r9.mo114843i()     // Catch:{ Exception -> 0x00a4 }
            r6.L$0 = r8     // Catch:{ Exception -> 0x00a4 }
            r6.L$1 = r9     // Catch:{ Exception -> 0x00a4 }
            r6.label = r2     // Catch:{ Exception -> 0x00a4 }
            r2 = r10
            java.lang.Object r10 = r1.mo111649c(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a4 }
            if (r10 != r0) goto L_0x0061
            return r0
        L_0x0061:
            r0 = r8
        L_0x0062:
            retrofit2.w r10 = (retrofit2.C13091w) r10     // Catch:{ Exception -> 0x00a4 }
            boolean r1 = r10.mo30576g()     // Catch:{ Exception -> 0x00a4 }
            if (r1 == 0) goto L_0x0082
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00a4 }
            com.carrefour.fid.android.data.entities.mapper.m r0 = r0.f90412a     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r10 = r10.mo30572a()     // Catch:{ Exception -> 0x00a4 }
            com.carrefour.fid.android.data.entities.APIMOrdersOfflineDetailsEntity r10 = (com.carrefour.fid.android.data.entities.APIMOrdersOfflineDetailsEntity) r10     // Catch:{ Exception -> 0x00a4 }
            com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain r10 = r0.mo72340a(r10)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = "null cannot be cast to non-null type com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r9 = kotlin.Result.m38702b(r10)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00c6
        L_0x0082:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r9.mo114845k()     // Catch:{ Exception -> 0x00a4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r1.<init>()     // Catch:{ Exception -> 0x00a4 }
            r1.append(r7)     // Catch:{ Exception -> 0x00a4 }
            r1.append(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00a4 }
            com.carrefour.fid.android.shared.io.ResponseThrowable r10 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r10, r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r9 = kotlin.Result.m38702b(r10)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00c6
        L_0x00a4:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r9 = r9.mo114845k()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
        L_0x00c6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOfflineRepository.mo111533a(com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineDetailUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062 A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075 A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111534b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase.C37722a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderList$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderList$1 r0 = (com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderList$1 r0 = new com.carrefour.fid.android.data.repositories.OrderOfflineRepository$getOrderList$1
            r0.<init>(r7, r9)
        L_0x0018:
            r6 = r0
            java.lang.Object r9 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r8 = r6.L$0
            com.carrefour.fid.android.data.repositories.OrderOfflineRepository r8 = (com.carrefour.fid.android.data.repositories.OrderOfflineRepository) r8
            kotlin.C11661u0.m45747n(r9)     // Catch:{ Exception -> 0x0086 }
            goto L_0x005a
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.data.service.k r1 = r7.f90414c     // Catch:{ Exception -> 0x0086 }
            com.carrefour.fid.android.data.provider.headers.m r9 = r7.f90415d     // Catch:{ Exception -> 0x0086 }
            java.util.HashMap r9 = r9.mo111440a()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = r8.mo114855f()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r4 = r8.mo114856g()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r5 = r8.mo114857h()     // Catch:{ Exception -> 0x0086 }
            r6.L$0 = r7     // Catch:{ Exception -> 0x0086 }
            r6.label = r2     // Catch:{ Exception -> 0x0086 }
            r2 = r9
            java.lang.Object r9 = r1.mo111648b(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0086 }
            if (r9 != r0) goto L_0x0059
            return r0
        L_0x0059:
            r8 = r7
        L_0x005a:
            retrofit2.w r9 = (retrofit2.C13091w) r9     // Catch:{ Exception -> 0x0086 }
            boolean r0 = r9.mo30576g()     // Catch:{ Exception -> 0x0086 }
            if (r0 == 0) goto L_0x0075
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x0086 }
            com.carrefour.fid.android.data.entities.mapper.s r8 = r8.f90413b     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r9 = r9.mo30572a()     // Catch:{ Exception -> 0x0086 }
            com.carrefour.fid.android.data.entities.APIMOrdersOfflineEntity r9 = (com.carrefour.fid.android.data.entities.APIMOrdersOfflineEntity) r9     // Catch:{ Exception -> 0x0086 }
            com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain r8 = r8.mo72340a(r9)     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0097
        L_0x0075:
            kotlin.Result$a r8 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x0086 }
            java.lang.String r8 = "Error during fetching offline order list"
            com.carrefour.fid.android.shared.io.ResponseThrowable r8 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r9, r8)     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0097
        L_0x0086:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "Error during fetching offline lists order"
            r8.<init>(r9)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x0097:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOfflineRepository.mo111534b(com.carrefour.fid.android.domain.interactors.order.GetOrderOfflineListUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
