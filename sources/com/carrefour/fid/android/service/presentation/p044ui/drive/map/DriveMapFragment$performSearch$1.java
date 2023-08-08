package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$performSearch$1", mo22502f = "DriveMapFragment.kt", mo22503i = {1}, mo22504l = {578, 588, 590, 593}, mo22505m = "invokeSuspend", mo22506n = {"addressFound"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$performSearch$1 */
public final class DriveMapFragment$performSearch$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $search;
    Object L$0;
    int label;
    final /* synthetic */ DriveMapFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveMapFragment$performSearch$1(DriveMapFragment driveMapFragment, String str, C11045c<? super DriveMapFragment$performSearch$1> cVar) {
        super(2, cVar);
        this.this$0 = driveMapFragment;
        this.$search = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new DriveMapFragment$performSearch$1(this.this$0, this.$search, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.location.Address} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r13.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 == r6) goto L_0x002b
            if (r1 == r4) goto L_0x0023
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            goto L_0x001e
        L_0x0016:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001e:
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00aa
        L_0x0023:
            java.lang.Object r1 = r13.L$0
            android.location.Address r1 = (android.location.Address) r1
            kotlin.C11661u0.m45747n(r14)
            goto L_0x007b
        L_0x002b:
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0048
        L_0x002f:
            kotlin.C11661u0.m45747n(r14)
            kotlinx.coroutines.CoroutineDispatcher r14 = kotlinx.coroutines.C11768d1.m46781c()
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$performSearch$1$addressList$1 r1 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$performSearch$1$addressList$1
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment r7 = r13.this$0
            java.lang.String r8 = r13.$search
            r1.<init>(r7, r8, r5)
            r13.label = r6
            java.lang.Object r14 = kotlinx.coroutines.C11965h.m47673h(r14, r1, r13)
            if (r14 != r0) goto L_0x0048
            return r0
        L_0x0048:
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x0096
            r1 = r14
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x0096
            java.lang.Object r14 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r14)
            r1 = r14
            android.location.Address r1 = (android.location.Address) r1
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment r14 = r13.this$0
            com.carrefour.fid.android.service.presentation.viewmodels.drive.DriveMapViewModel r14 = r14.getViewModel()
            com.carrefour.fid.android.domain.models.LatLon r2 = new com.carrefour.fid.android.domain.models.LatLon
            double r6 = r1.getLatitude()
            double r8 = r1.getLongitude()
            r2.<init>(r6, r8)
            r13.L$0 = r1
            r13.label = r4
            java.lang.Object r14 = r14.fetchDrivePoints(r2, r13)
            if (r14 != r0) goto L_0x007b
            return r0
        L_0x007b:
            r7 = r14
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x00aa
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment r6 = r13.this$0
            double r8 = r1.getLatitude()
            double r10 = r1.getLongitude()
            r13.L$0 = r5
            r13.label = r3
            r12 = r13
            java.lang.Object r14 = r6.adjustScaleForDriveList(r7, r8, r10, r12)
            if (r14 != r0) goto L_0x00aa
            return r0
        L_0x0096:
            kotlinx.coroutines.m2 r14 = kotlinx.coroutines.C11768d1.m46783e()
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$performSearch$1$1 r1 = new com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment$performSearch$1$1
            com.carrefour.fid.android.service.presentation.ui.drive.map.DriveMapFragment r3 = r13.this$0
            r1.<init>(r3, r5)
            r13.label = r2
            java.lang.Object r14 = kotlinx.coroutines.C11965h.m47673h(r14, r1, r13)
            if (r14 != r0) goto L_0x00aa
            return r0
        L_0x00aa:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.presentation.p044ui.drive.map.DriveMapFragment$performSearch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DriveMapFragment$performSearch$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
