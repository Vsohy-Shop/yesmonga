package com.carrefour.fid.android.data.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class StoreHoursGateway {

    /* renamed from: b */
    public static final int f90028b = 8;
    @C12579k

    /* renamed from: a */
    public final C37823k f90029a;

    @Inject
    public StoreHoursGateway(@C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f90029a = kVar;
    }

    @C12579k
    /* renamed from: a */
    public final C37823k mo108693a() {
        return this.f90029a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d A[SYNTHETIC, Splitter:B:36:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108694b(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C38186x>> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.data.datasource.StoreHoursGateway$getStoreOpeningHours$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.data.datasource.StoreHoursGateway$getStoreOpeningHours$1 r0 = (com.carrefour.fid.android.data.datasource.StoreHoursGateway$getStoreOpeningHours$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.StoreHoursGateway$getStoreOpeningHours$1 r0 = new com.carrefour.fid.android.data.datasource.StoreHoursGateway$getStoreOpeningHours$1
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0037:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.domain.interactors.service.k r15 = r14.f90029a
            r0.label = r3
            java.lang.Object r15 = r15.m172965invokeIoAF18A(r0)
            if (r15 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r15)
            r1 = 0
            if (r0 == 0) goto L_0x004d
            r15 = r1
        L_0x004d:
            com.carrefour.fid.android.domain.models.service.models.k r15 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r15
            if (r15 == 0) goto L_0x005e
            com.carrefour.fid.android.domain.models.service.models.l r15 = r15.mo119352e()
            if (r15 == 0) goto L_0x005e
            com.carrefour.fid.android.shared.util.ServiceUtil r0 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            com.carrefour.fid.android.domain.models.service.models.h r15 = r0.mo84130l(r15)
            goto L_0x005f
        L_0x005e:
            r15 = r1
        L_0x005f:
            if (r15 == 0) goto L_0x0068
            com.carrefour.fid.android.shared.util.ServiceUtil r0 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            java.util.List r15 = r0.mo84127i(r15)
            goto L_0x0069
        L_0x0068:
            r15 = r1
        L_0x0069:
            r0 = r15
            java.util.Collection r0 = (java.util.Collection) r0
            r2 = 0
            if (r0 == 0) goto L_0x0078
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r0 = r2
            goto L_0x0079
        L_0x0078:
            r0 = r3
        L_0x0079:
            if (r0 == 0) goto L_0x008d
            kotlin.Result$a r15 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.StoreOpeningHoursThrowable r15 = new com.carrefour.fid.android.core.io.StoreOpeningHoursThrowable
            java.lang.String r0 = "store day list hour is empty"
            r15.<init>(r0)
            java.lang.Object r15 = kotlin.C11661u0.m45734a(r15)
            java.lang.Object r15 = kotlin.Result.m38702b(r15)
            return r15
        L_0x008d:
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01c4 }
            r4 = 7
            int r0 = r0.get(r4)     // Catch:{ Exception -> 0x01c4 }
            kotlin.jvm.internal.Ref$IntRef r4 = new kotlin.jvm.internal.Ref$IntRef     // Catch:{ Exception -> 0x01c4 }
            r4.<init>()     // Catch:{ Exception -> 0x01c4 }
            int r0 = r0 - r3
            r4.element = r0     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r0 = r15.get(r0)     // Catch:{ Exception -> 0x01c4 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x01c4 }
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.shared.util.h$a r6 = com.carrefour.fid.android.shared.util.C28932h.f70914a     // Catch:{ Exception -> 0x01c4 }
            java.text.SimpleDateFormat r7 = r6.mo84250t()     // Catch:{ Exception -> 0x01c4 }
            java.util.Date r5 = r5.getTime()     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r5 = r7.format(r5)     // Catch:{ Exception -> 0x01c4 }
            r7 = r0
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ Exception -> 0x01c4 }
            boolean r7 = r7.isEmpty()     // Catch:{ Exception -> 0x01c4 }
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x00cf
            int r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r0)     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.domain.models.service.models.b r7 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r7     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r7 = r7.mo119256f()     // Catch:{ Exception -> 0x01c4 }
            goto L_0x00d0
        L_0x00cf:
            r7 = r1
        L_0x00d0:
            java.lang.String r8 = ""
            java.lang.String r9 = "null cannot be cast to non-null type java.util.Date"
            if (r7 == 0) goto L_0x011e
            java.text.SimpleDateFormat r10 = r6.mo84250t()     // Catch:{ Exception -> 0x01c4 }
            java.util.Date r7 = r10.parse(r7)     // Catch:{ Exception -> 0x01c4 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r9)     // Catch:{ Exception -> 0x01c4 }
            java.text.SimpleDateFormat r10 = r6.mo84250t()     // Catch:{ Exception -> 0x01c4 }
            java.util.Date r10 = r10.parse(r5)     // Catch:{ Exception -> 0x01c4 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r9)     // Catch:{ Exception -> 0x01c4 }
            long r10 = r10.getTime()     // Catch:{ Exception -> 0x01c4 }
            long r12 = r7.getTime()     // Catch:{ Exception -> 0x01c4 }
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x011e
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.domain.models.x r0 = new com.carrefour.fid.android.domain.models.x     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.core.type.StoreOpeningState r2 = com.carrefour.fid.android.core.type.StoreOpeningState.WILL_OPEN_TOMORROW     // Catch:{ Exception -> 0x01c4 }
            int r3 = r4.element     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = r15.get(r3)     // Catch:{ Exception -> 0x01c4 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r15)     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.domain.models.service.models.b r15 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r15     // Catch:{ Exception -> 0x01c4 }
            if (r15 == 0) goto L_0x0112
            java.lang.String r1 = r15.mo119254e()     // Catch:{ Exception -> 0x01c4 }
        L_0x0112:
            if (r1 != 0) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r8 = r1
        L_0x0116:
            r0.<init>(r2, r8)     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = kotlin.Result.m38702b(r0)     // Catch:{ Exception -> 0x01c4 }
            return r15
        L_0x011e:
            r7 = r0
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ Exception -> 0x01c4 }
            boolean r7 = r7.isEmpty()     // Catch:{ Exception -> 0x01c4 }
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x0133
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.domain.models.service.models.b r0 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r0     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r0 = r0.mo119254e()     // Catch:{ Exception -> 0x01c4 }
            goto L_0x0134
        L_0x0133:
            r0 = r1
        L_0x0134:
            if (r0 == 0) goto L_0x017e
            java.text.SimpleDateFormat r7 = r6.mo84250t()     // Catch:{ Exception -> 0x01c4 }
            java.util.Date r0 = r7.parse(r0)     // Catch:{ Exception -> 0x01c4 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r9)     // Catch:{ Exception -> 0x01c4 }
            java.text.SimpleDateFormat r6 = r6.mo84250t()     // Catch:{ Exception -> 0x01c4 }
            java.util.Date r5 = r6.parse(r5)     // Catch:{ Exception -> 0x01c4 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r9)     // Catch:{ Exception -> 0x01c4 }
            long r5 = r5.getTime()     // Catch:{ Exception -> 0x01c4 }
            long r9 = r0.getTime()     // Catch:{ Exception -> 0x01c4 }
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x017e
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.domain.models.x r0 = new com.carrefour.fid.android.domain.models.x     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.core.type.StoreOpeningState r2 = com.carrefour.fid.android.core.type.StoreOpeningState.OPENED     // Catch:{ Exception -> 0x01c4 }
            int r3 = r4.element     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = r15.get(r3)     // Catch:{ Exception -> 0x01c4 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r15)     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.domain.models.service.models.b r15 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r15     // Catch:{ Exception -> 0x01c4 }
            if (r15 == 0) goto L_0x0172
            java.lang.String r1 = r15.mo119256f()     // Catch:{ Exception -> 0x01c4 }
        L_0x0172:
            if (r1 != 0) goto L_0x0175
            goto L_0x0176
        L_0x0175:
            r8 = r1
        L_0x0176:
            r0.<init>(r2, r8)     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = kotlin.Result.m38702b(r0)     // Catch:{ Exception -> 0x01c4 }
            return r15
        L_0x017e:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.domain.models.x r0 = new com.carrefour.fid.android.domain.models.x     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.core.type.StoreOpeningState r5 = com.carrefour.fid.android.core.type.StoreOpeningState.WILL_OPEN_TODAY     // Catch:{ Exception -> 0x01c4 }
            int r6 = r15.size()     // Catch:{ Exception -> 0x01c4 }
            int r7 = r4.element     // Catch:{ Exception -> 0x01c4 }
            int r9 = r7 + 1
            if (r6 <= r9) goto L_0x01a6
            int r7 = r7 + r3
            r4.element = r7     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = r15.get(r7)     // Catch:{ Exception -> 0x01c4 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r15)     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.domain.models.service.models.b r15 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r15     // Catch:{ Exception -> 0x01c4 }
            if (r15 == 0) goto L_0x01a3
            java.lang.String r1 = r15.mo119254e()     // Catch:{ Exception -> 0x01c4 }
        L_0x01a3:
            if (r1 != 0) goto L_0x01bb
            goto L_0x01bc
        L_0x01a6:
            java.lang.Object r15 = r15.get(r2)     // Catch:{ Exception -> 0x01c4 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r15)     // Catch:{ Exception -> 0x01c4 }
            com.carrefour.fid.android.domain.models.service.models.b r15 = (com.carrefour.fid.android.domain.models.service.models.C38147b) r15     // Catch:{ Exception -> 0x01c4 }
            if (r15 == 0) goto L_0x01b8
            java.lang.String r1 = r15.mo119254e()     // Catch:{ Exception -> 0x01c4 }
        L_0x01b8:
            if (r1 != 0) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r8 = r1
        L_0x01bc:
            r0.<init>(r5, r8)     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r15 = kotlin.Result.m38702b(r0)     // Catch:{ Exception -> 0x01c4 }
            return r15
        L_0x01c4:
            kotlin.Result$a r15 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.StoreOpeningHoursThrowable r15 = new com.carrefour.fid.android.core.io.StoreOpeningHoursThrowable
            java.lang.String r0 = "hour opening not found"
            r15.<init>(r0)
            java.lang.Object r15 = kotlin.C11661u0.m45734a(r15)
            java.lang.Object r15 = kotlin.Result.m38702b(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.StoreHoursGateway.mo108694b(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108695c(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.datasource.StoreHoursGateway$isExceptionalClosing$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.datasource.StoreHoursGateway$isExceptionalClosing$1 r0 = (com.carrefour.fid.android.data.datasource.StoreHoursGateway$isExceptionalClosing$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.StoreHoursGateway$isExceptionalClosing$1 r0 = new com.carrefour.fid.android.data.datasource.StoreHoursGateway$isExceptionalClosing$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.service.k r5 = r4.f90029a
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r5)
            if (r0 == 0) goto L_0x004c
            r5 = 0
        L_0x004c:
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            r0 = 0
            if (r5 == 0) goto L_0x0060
            com.carrefour.fid.android.domain.models.service.models.l r5 = r5.mo119352e()
            if (r5 == 0) goto L_0x0060
            com.carrefour.fid.android.shared.util.ServiceUtil r1 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
            boolean r5 = r1.mo84131m(r5)
            if (r5 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = r0
        L_0x0061:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.StoreHoursGateway.mo108695c(kotlin.coroutines.c):java.lang.Object");
    }
}
