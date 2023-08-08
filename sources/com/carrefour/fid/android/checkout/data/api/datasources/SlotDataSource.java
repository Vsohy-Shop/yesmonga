package com.carrefour.fid.android.checkout.data.api.datasources;

import com.carrefour.fid.android.checkout.data.api.services.C39838b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class SlotDataSource {
    @C12579k

    /* renamed from: a */
    public final C39838b f101597a;

    @Inject
    public SlotDataSource(@C12579k C39838b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "api");
        this.f101597a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131225b(@org.jetbrains.annotations.C12579k java.lang.String r5, int r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.ServiceSlot>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchH1h3Slots$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchH1h3Slots$1 r0 = (com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchH1h3Slots$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchH1h3Slots$1 r0 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchH1h3Slots$1
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
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchH1h3Slots$2 r7 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchH1h3Slots$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource.mo131225b(java.lang.String, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131226c(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.Slot>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotDetails$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotDetails$1 r0 = (com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotDetails$1 r0 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotDetails$1
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
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotDetails$2 r7 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotDetails$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource.mo131226c(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131227d(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.SlotExpress>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotExpress$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotExpress$1 r0 = (com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotExpress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotExpress$1 r0 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotExpress$1
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
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotExpress$2 r6 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotExpress$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource.mo131227d(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131228e(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.slot.C37859f.C37860a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.ServiceSlot>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotYield$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotYield$1 r0 = (com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotYield$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotYield$1 r0 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotYield$1
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
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotYield$2 r6 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotYield$2
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource.mo131228e(com.carrefour.fid.android.domain.interactors.slot.f$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131229f(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.ServiceSlot>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotsSecured$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotsSecured$1 r0 = (com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotsSecured$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotsSecured$1 r0 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotsSecured$1
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
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotsSecured$2 r6 = new com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource$fetchSlotsSecured$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource.mo131229f(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
