package com.carrefour.fid.android.checkout.domain.repositories;

import com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource;
import com.carrefour.fid.android.checkout.data.datastore.datasources.SlotDataStoreSource;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
public final class SlotRepository {
    @C12579k

    /* renamed from: a */
    public final SlotDataSource f101689a;
    @C12579k

    /* renamed from: b */
    public final SlotDataStoreSource f101690b;

    @Inject
    public SlotRepository(@C12579k SlotDataSource slotDataSource, @C12579k SlotDataStoreSource slotDataStoreSource) {
        Intrinsics.checkNotNullParameter(slotDataSource, "slotDataSource");
        Intrinsics.checkNotNullParameter(slotDataStoreSource, "slotDataStoreSource");
        this.f101689a = slotDataSource;
        this.f101690b = slotDataStoreSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131428b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.slot.Slot r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$add$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$add$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$add$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$add$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$add$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x004c }
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.checkout.data.datastore.datasources.SlotDataStoreSource r6 = r4.f101690b     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.SlotItem r5 = com.carrefour.fid.android.checkout.domain.extension.C39853a.m162473b(r5)     // Catch:{ all -> 0x004c }
            r0.label = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = r6.mo31123c(r5, r0)     // Catch:{ all -> 0x004c }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0057
        L_0x004c:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.SlotRepository.mo131428b(com.carrefour.fid.android.domain.models.slot.Slot, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131429c(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$clear$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$clear$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$clear$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$clear$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$clear$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0048 }
            com.carrefour.fid.android.checkout.data.datastore.datasources.SlotDataStoreSource r5 = r4.f101690b     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r5.clear(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.SlotRepository.mo131429c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131430d(@org.jetbrains.annotations.C12579k java.lang.String r5, int r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.ServiceSlot>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchH1h3Slots$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchH1h3Slots$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchH1h3Slots$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchH1h3Slots$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchH1h3Slots$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource r7 = r4.f101689a
            r0.label = r3
            java.lang.Object r5 = r7.mo131225b(r5, r6, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.SlotRepository.mo131430d(java.lang.String, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131431e(java.lang.String r5, java.lang.String r6, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.Slot>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetails$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetails$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetails$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetails$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource r7 = r4.f101689a
            r0.label = r3
            java.lang.Object r5 = r7.mo131226c(r5, r6, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.SlotRepository.mo131431e(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131432f(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetailsAndSave$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetailsAndSave$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetailsAndSave$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetailsAndSave$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotDetailsAndSave$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository r6 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository) r6
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x0051
        L_0x0042:
            kotlin.C11661u0.m45747n(r8)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r5.mo131431e(r6, r7, r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r6 = r5
        L_0x0051:
            boolean r8 = kotlin.Result.m38710j(r7)
            if (r8 == 0) goto L_0x0074
            kotlin.Result$a r8 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.slot.Slot r7 = (com.carrefour.fid.android.domain.models.slot.Slot) r7
            com.carrefour.fid.android.checkout.data.datastore.datasources.SlotDataStoreSource r6 = r6.f101690b
            com.carrefour.fid.android.SlotItem r7 = com.carrefour.fid.android.checkout.domain.extension.C39853a.m162473b(r7)
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r6 = r6.mo31123c(r7, r0)
            if (r6 != r1) goto L_0x006d
            return r1
        L_0x006d:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x0078
        L_0x0074:
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
        L_0x0078:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.SlotRepository.mo131432f(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131433g(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.SlotExpress>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotExpress$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotExpress$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotExpress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotExpress$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotExpress$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource r6 = r4.f101689a
            r0.label = r3
            java.lang.Object r5 = r6.mo131227d(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.SlotRepository.mo131433g(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131434h(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.slot.C37859f.C37860a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.ServiceSlot>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotYield$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotYield$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotYield$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotYield$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotYield$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource r6 = r4.f101689a
            r0.label = r3
            java.lang.Object r5 = r6.mo131228e(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.SlotRepository.mo131434h(com.carrefour.fid.android.domain.interactors.slot.f$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131435i(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.ServiceSlot>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotsSecured$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotsSecured$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotsSecured$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotsSecured$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$fetchSlotsSecured$1
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
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.checkout.data.api.datasources.SlotDataSource r6 = r4.f101689a
            r0.label = r3
            java.lang.Object r5 = r6.mo131229f(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.SlotRepository.mo131435i(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052 A[Catch:{ all -> 0x005e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131436j(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.slot.Slot>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$get$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$get$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.SlotRepository$get$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x005e }
            goto L_0x0053
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x005e }
            goto L_0x0048
        L_0x0038:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x005e }
            com.carrefour.fid.android.checkout.data.datastore.datasources.SlotDataStoreSource r6 = r5.f101690b     // Catch:{ all -> 0x005e }
            r0.label = r4     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = r6.mo31122b(r0)     // Catch:{ all -> 0x005e }
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C11907e) r6     // Catch:{ all -> 0x005e }
            r0.label = r3     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = kotlinx.coroutines.flow.C11909g.m47495u0(r6, r0)     // Catch:{ all -> 0x005e }
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            com.carrefour.fid.android.SlotItem r6 = (com.carrefour.fid.android.SlotItem) r6     // Catch:{ all -> 0x005e }
            com.carrefour.fid.android.domain.models.slot.Slot r6 = com.carrefour.fid.android.checkout.domain.extension.C39853a.m162472a(r6)     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x005e }
            goto L_0x0069
        L_0x005e:
            r6 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0069:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.SlotRepository.mo131436j(kotlin.coroutines.c):java.lang.Object");
    }
}
