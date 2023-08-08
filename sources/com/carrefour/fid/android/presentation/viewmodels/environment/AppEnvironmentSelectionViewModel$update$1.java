package com.carrefour.fid.android.presentation.viewmodels.environment;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.environment.AppEnvironmentSelectionViewModel$update$1", mo22502f = "AppEnvironmentSelectionViewModel.kt", mo22503i = {}, mo22504l = {42, 44}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AppEnvironmentSelectionViewModel$update$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ AppEnvironmentSelectionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppEnvironmentSelectionViewModel$update$1(AppEnvironmentSelectionViewModel appEnvironmentSelectionViewModel, int i, C11045c<? super AppEnvironmentSelectionViewModel$update$1> cVar) {
        super(2, cVar);
        this.this$0 = appEnvironmentSelectionViewModel;
        this.$position = i;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AppEnvironmentSelectionViewModel$update$1(this.this$0, this.$position, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0051
        L_0x0018:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0020:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            r5.mo21858l()
            goto L_0x003b
        L_0x0029:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.presentation.viewmodels.environment.AppEnvironmentSelectionViewModel r5 = r4.this$0
            com.carrefour.fid.android.domain.interactors.service.a r5 = r5.f64355e
            r4.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r4)
            if (r5 != r0) goto L_0x003b
            return r0
        L_0x003b:
            com.carrefour.fid.android.presentation.viewmodels.environment.AppEnvironmentSelectionViewModel r5 = r4.this$0
            com.carrefour.fid.android.domain.interactors.c r5 = r5.f64354d
            com.carrefour.fid.android.domain.interactors.c$a r1 = new com.carrefour.fid.android.domain.interactors.c$a
            int r3 = r4.$position
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.m172943invokegIAlus(r1, r4)
            if (r5 != r0) goto L_0x0051
            return r0
        L_0x0051:
            com.carrefour.fid.android.presentation.viewmodels.environment.AppEnvironmentSelectionViewModel r0 = r4.this$0
            com.carrefour.fid.android.shared.util.q r0 = r0.f64357g
            boolean r1 = kotlin.Result.m38709i(r5)
            if (r1 == 0) goto L_0x005e
            r5 = 0
        L_0x005e:
            r0.mo57493o(r5)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.environment.AppEnvironmentSelectionViewModel$update$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AppEnvironmentSelectionViewModel$update$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
