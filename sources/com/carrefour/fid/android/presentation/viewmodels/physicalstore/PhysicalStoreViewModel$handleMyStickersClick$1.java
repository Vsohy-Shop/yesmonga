package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$handleMyStickersClick$1", mo22502f = "PhysicalStoreViewModel.kt", mo22503i = {}, mo22504l = {155, 161, 169}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PhysicalStoreViewModel$handleMyStickersClick$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $stickersTitle;
    final /* synthetic */ String $stickersUrl;
    Object L$0;
    int label;
    final /* synthetic */ PhysicalStoreViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreViewModel$handleMyStickersClick$1(PhysicalStoreViewModel physicalStoreViewModel, String str, String str2, C11045c<? super PhysicalStoreViewModel$handleMyStickersClick$1> cVar) {
        super(2, cVar);
        this.this$0 = physicalStoreViewModel;
        this.$stickersUrl = str;
        this.$stickersTitle = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PhysicalStoreViewModel$handleMyStickersClick$1(this.this$0, this.$stickersUrl, this.$stickersTitle, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 == r4) goto L_0x0024
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.C11661u0.m45747n(r9)
            goto L_0x008e
        L_0x0016:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001e:
            java.lang.Object r1 = r8.L$0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0075
        L_0x0024:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0051
        L_0x002e:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r9 = r8.this$0
            com.carrefour.fid.android.domain.interactors.utilities.b r9 = r9.f65914j
            com.carrefour.fid.android.domain.interactors.utilities.b$a r1 = new com.carrefour.fid.android.domain.interactors.utilities.b$a
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r5 = r8.this$0
            com.carrefour.fid.android.account.data.repositories.LoginRepository r5 = r5.f65915k
            java.lang.String r5 = r5.mo31350b()
            java.lang.String r6 = "ARSENAL"
            r1.<init>(r5, r6)
            r8.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r1, r8)
            if (r9 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r1 = r9
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r9 = r8.this$0
            java.lang.String r4 = r8.$stickersUrl
            java.lang.String r5 = r8.$stickersTitle
            boolean r6 = kotlin.Result.m38710j(r1)
            if (r6 == 0) goto L_0x0075
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            kotlinx.coroutines.channels.g r9 = r9.f65917m
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$b r7 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$b
            r7.<init>(r4, r5, r6)
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r9.mo23757h0(r7, r8)
            if (r9 != r0) goto L_0x0075
            return r0
        L_0x0075:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r9 = r8.this$0
            java.lang.Throwable r3 = kotlin.Result.m38705e(r1)
            if (r3 == 0) goto L_0x008e
            kotlinx.coroutines.channels.g r9 = r9.f65917m
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$e r3 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27121d.C27126e.f65969a
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = r9.mo23757h0(r3, r8)
            if (r9 != r0) goto L_0x008e
            return r0
        L_0x008e:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$handleMyStickersClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PhysicalStoreViewModel$handleMyStickersClick$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
