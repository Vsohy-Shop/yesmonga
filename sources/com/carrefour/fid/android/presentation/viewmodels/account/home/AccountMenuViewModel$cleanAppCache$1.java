package com.carrefour.fid.android.presentation.viewmodels.account.home;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel$cleanAppCache$1", mo22502f = "AccountMenuViewModel.kt", mo22503i = {}, mo22504l = {140, 142, 143, 144, 145, 146, 147}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AccountMenuViewModel$cleanAppCache$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<C11079d2> $onCleanFinished;
    int label;
    final /* synthetic */ AccountMenuViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountMenuViewModel$cleanAppCache$1(AccountMenuViewModel accountMenuViewModel, C11289a<C11079d2> aVar, C11045c<? super AccountMenuViewModel$cleanAppCache$1> cVar) {
        super(2, cVar);
        this.this$0 = accountMenuViewModel;
        this.$onCleanFinished = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AccountMenuViewModel$cleanAppCache$1(this.this$0, this.$onCleanFinished, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r2.this$0.f63160a.mo31349a();
        r3 = r2.this$0.f63161b;
        r2.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r3.mo31322g(r2) != r0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r3 = r2.this$0.f63162c;
        r2.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r3.clearLoyaltyCard(r2) != r0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        r3 = r2.this$0.f63166g;
        r2.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r3.m172965invokeIoAF18A(r2) != r0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r3 = r2.this$0.f63169j;
        r2.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        if (r3.m172965invokeIoAF18A(r2) != r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        r3 = r2.this$0.f63163d;
        r2.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r3.m172965invokeIoAF18A(r2) != r0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r3 = r2.this$0.f63170k;
        r2.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (r3.m172919invokeIoAF18A(r2) != r0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        r2.this$0.f63173n.mo80058d();
        r3 = r2.$onCleanFinished;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (r3 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        r3.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        return kotlin.C11079d2.f28267a;
     */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r2.label
            switch(r1) {
                case 0: goto L_0x0043;
                case 1: goto L_0x003f;
                case 2: goto L_0x003b;
                case 3: goto L_0x0037;
                case 4: goto L_0x002e;
                case 5: goto L_0x0025;
                case 6: goto L_0x001b;
                case 7: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r0)
            throw r3
        L_0x0011:
            kotlin.C11661u0.m45747n(r3)
            kotlin.Result r3 = (kotlin.Result) r3
            r3.mo21858l()
            goto L_0x00bb
        L_0x001b:
            kotlin.C11661u0.m45747n(r3)
            kotlin.Result r3 = (kotlin.Result) r3
            r3.mo21858l()
            goto L_0x00ab
        L_0x0025:
            kotlin.C11661u0.m45747n(r3)
            kotlin.Result r3 = (kotlin.Result) r3
            r3.mo21858l()
            goto L_0x009b
        L_0x002e:
            kotlin.C11661u0.m45747n(r3)
            kotlin.Result r3 = (kotlin.Result) r3
            r3.mo21858l()
            goto L_0x008b
        L_0x0037:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x007b
        L_0x003b:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x006b
        L_0x003f:
            kotlin.C11661u0.m45747n(r3)
            goto L_0x0052
        L_0x0043:
            kotlin.C11661u0.m45747n(r3)
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r3 = r2.this$0
            r1 = 1
            r2.label = r1
            java.lang.Object r3 = r3.mo74866C0(r2)
            if (r3 != r0) goto L_0x0052
            return r0
        L_0x0052:
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r3 = r2.this$0
            com.carrefour.fid.android.account.data.repositories.LoginRepository r3 = r3.f63160a
            r3.mo31349a()
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r3 = r2.this$0
            com.carrefour.fid.android.account.data.repositories.AccountRepository r3 = r3.f63161b
            r1 = 2
            r2.label = r1
            java.lang.Object r3 = r3.mo31322g(r2)
            if (r3 != r0) goto L_0x006b
            return r0
        L_0x006b:
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r3 = r2.this$0
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r3 = r3.f63162c
            r1 = 3
            r2.label = r1
            java.lang.Object r3 = r3.clearLoyaltyCard(r2)
            if (r3 != r0) goto L_0x007b
            return r0
        L_0x007b:
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r3 = r2.this$0
            com.carrefour.fid.android.domain.interactors.service.a r3 = r3.f63166g
            r1 = 4
            r2.label = r1
            java.lang.Object r3 = r3.m172965invokeIoAF18A(r2)
            if (r3 != r0) goto L_0x008b
            return r0
        L_0x008b:
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r3 = r2.this$0
            com.carrefour.fid.android.domain.interactors.basket.h r3 = r3.f63169j
            r1 = 5
            r2.label = r1
            java.lang.Object r3 = r3.m172965invokeIoAF18A(r2)
            if (r3 != r0) goto L_0x009b
            return r0
        L_0x009b:
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r3 = r2.this$0
            com.carrefour.fid.android.domain.interactors.slot.a r3 = r3.f63163d
            r1 = 6
            r2.label = r1
            java.lang.Object r3 = r3.m172965invokeIoAF18A(r2)
            if (r3 != r0) goto L_0x00ab
            return r0
        L_0x00ab:
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r3 = r2.this$0
            com.carrefour.fid.android.consent.domain.interactors.ClearConsentUserCase r3 = r3.f63170k
            r1 = 7
            r2.label = r1
            java.lang.Object r3 = r3.m172919invokeIoAF18A(r2)
            if (r3 != r0) goto L_0x00bb
            return r0
        L_0x00bb:
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel r3 = r2.this$0
            com.carrefour.fid.android.domain.interactors.product.s r3 = r3.f63173n
            r3.mo80058d()
            kotlin.jvm.functions.a<kotlin.d2> r3 = r2.$onCleanFinished
            if (r3 == 0) goto L_0x00cb
            r3.invoke()
        L_0x00cb:
            kotlin.d2 r3 = kotlin.C11079d2.f28267a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel$cleanAppCache$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AccountMenuViewModel$cleanAppCache$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
