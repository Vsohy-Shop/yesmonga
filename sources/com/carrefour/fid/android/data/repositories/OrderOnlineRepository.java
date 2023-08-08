package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper;
import com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineEntityDataMapper;
import com.carrefour.fid.android.data.provider.headers.C36569k;
import com.carrefour.fid.android.data.provider.headers.C36571m;
import com.carrefour.fid.android.data.service.C36633l;
import com.carrefour.fid.android.domain.models.C38120r;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
public final class OrderOnlineRepository {

    /* renamed from: h */
    public static final int f90416h = 8;
    @C12579k

    /* renamed from: a */
    public final C36633l f90417a;
    @C12579k

    /* renamed from: b */
    public final OHMOrdersOnlineEntityDataMapper f90418b;
    @C12579k

    /* renamed from: c */
    public final OHMOrdersOnlineDetailsEntityDataMapper f90419c;
    @C12579k

    /* renamed from: d */
    public final C36571m f90420d;
    @C12579k

    /* renamed from: e */
    public final C36569k f90421e;
    @C12579k

    /* renamed from: f */
    public final C11940j<C38120r> f90422f;
    @C12579k

    /* renamed from: g */
    public final C11952u<C38120r> f90423g;

    @Inject
    public OrderOnlineRepository(@C12579k C36633l lVar, @C12579k OHMOrdersOnlineEntityDataMapper oHMOrdersOnlineEntityDataMapper, @C12579k OHMOrdersOnlineDetailsEntityDataMapper oHMOrdersOnlineDetailsEntityDataMapper, @C12579k C36571m mVar, @C12579k C36569k kVar) {
        Intrinsics.checkNotNullParameter(lVar, "orderOnlineApiService");
        Intrinsics.checkNotNullParameter(oHMOrdersOnlineEntityDataMapper, "ohmOrdersOnlineEntityDataMapper");
        Intrinsics.checkNotNullParameter(oHMOrdersOnlineDetailsEntityDataMapper, "ohmOrdersOnlineDetailsEntityDataMapper");
        Intrinsics.checkNotNullParameter(mVar, "ordersHistoryHeaders");
        Intrinsics.checkNotNullParameter(kVar, "ordersHeaders");
        this.f90417a = lVar;
        this.f90418b = oHMOrdersOnlineEntityDataMapper;
        this.f90419c = oHMOrdersOnlineDetailsEntityDataMapper;
        this.f90420d = mVar;
        this.f90421e = kVar;
        C11940j<C38120r> a = C11953v.m47628a(null);
        this.f90422f = a;
        this.f90423g = C11909g.m47470m(a);
    }

    /* renamed from: k */
    public static /* synthetic */ Object m150073k(OrderOnlineRepository orderOnlineRepository, String str, String str2, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return orderOnlineRepository.mo111538j(str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111535g(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.OrderOnlineRepository$cancelOrder$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$cancelOrder$1 r0 = (com.carrefour.fid.android.data.repositories.OrderOnlineRepository$cancelOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$cancelOrder$1 r0 = new com.carrefour.fid.android.data.repositories.OrderOnlineRepository$cancelOrder$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$cancelOrder$2 r6 = new com.carrefour.fid.android.data.repositories.OrderOnlineRepository$cancelOrder$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOnlineRepository.mo111535g(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: h */
    public final C11952u<C38120r> mo111536h() {
        return this.f90423g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111537i(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C38120r>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderDetail$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderDetail$1 r0 = (com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderDetail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderDetail$1 r0 = new com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderDetail$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderDetail$2 r6 = new com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderDetail$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOnlineRepository.mo111537i(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111538j(@org.jetbrains.annotations.C12580l java.lang.String r5, @org.jetbrains.annotations.C12580l java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderList$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderList$1 r0 = (com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderList$1 r0 = new com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderList$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderList$2 r7 = new com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderList$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOnlineRepository.mo111538j(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111539l(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.repositories.OrderOnlineRepository$updateOrder$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$updateOrder$1 r0 = (com.carrefour.fid.android.data.repositories.OrderOnlineRepository$updateOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$updateOrder$1 r0 = new com.carrefour.fid.android.data.repositories.OrderOnlineRepository$updateOrder$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository$updateOrder$2 r7 = new com.carrefour.fid.android.data.repositories.OrderOnlineRepository$updateOrder$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOnlineRepository.mo111539l(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
