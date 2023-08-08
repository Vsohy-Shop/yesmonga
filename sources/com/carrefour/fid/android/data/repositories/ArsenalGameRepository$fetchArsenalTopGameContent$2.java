package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.data.entities.ArsenalGameContentResponse;
import java.util.ArrayList;
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

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.ArsenalGameRepository$fetchArsenalTopGameContent$2", mo22502f = "ArsenalGameRepository.kt", mo22503i = {}, mo22504l = {38}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00030\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Ljava/util/ArrayList;", "Lcom/carrefour/fid/android/data/entities/ArsenalGameContentResponse;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nArsenalGameRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArsenalGameRepository.kt\ncom/carrefour/fid/android/data/repositories/ArsenalGameRepository$fetchArsenalTopGameContent$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1747#2,3:70\n*S KotlinDebug\n*F\n+ 1 ArsenalGameRepository.kt\ncom/carrefour/fid/android/data/repositories/ArsenalGameRepository$fetchArsenalTopGameContent$2\n*L\n43#1:70,3\n*E\n"})
public final class ArsenalGameRepository$fetchArsenalTopGameContent$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends ArrayList<ArsenalGameContentResponse>>>, Object> {
    int label;
    final /* synthetic */ ArsenalGameRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArsenalGameRepository$fetchArsenalTopGameContent$2(ArsenalGameRepository arsenalGameRepository, C11045c<? super ArsenalGameRepository$fetchArsenalTopGameContent$2> cVar) {
        super(1, cVar);
        this.this$0 = arsenalGameRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new ArsenalGameRepository$fetchArsenalTopGameContent$2(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0029
        L_0x000f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0017:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.ArsenalGameRepository r6 = r5.this$0
            com.carrefour.fid.android.data.service.c r6 = r6.f90362b
            r5.label = r2
            java.lang.Object r6 = r6.mo111635b(r5)
            if (r6 != r0) goto L_0x0029
            return r0
        L_0x0029:
            retrofit2.w r6 = (retrofit2.C13091w) r6
            java.lang.Object r0 = r6.mo30572a()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r6 = r6.mo30576g()
            if (r6 == 0) goto L_0x0085
            if (r0 == 0) goto L_0x0085
            boolean r6 = r0.isEmpty()
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x0085
            boolean r6 = r0.isEmpty()
            r1 = 0
            if (r6 == 0) goto L_0x0048
            goto L_0x007c
        L_0x0048:
            java.util.Iterator r6 = r0.iterator()
        L_0x004c:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x007c
            java.lang.Object r3 = r6.next()
            com.carrefour.fid.android.data.entities.ArsenalGameContentResponse r3 = (com.carrefour.fid.android.data.entities.ArsenalGameContentResponse) r3
            java.lang.String r4 = r3.getGameUrl()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0064
            r4 = r2
            goto L_0x0065
        L_0x0064:
            r4 = r1
        L_0x0065:
            if (r4 == 0) goto L_0x0078
            java.lang.String r3 = r3.getBannerUrl()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0073
            r3 = r2
            goto L_0x0074
        L_0x0073:
            r3 = r1
        L_0x0074:
            if (r3 == 0) goto L_0x0078
            r3 = r2
            goto L_0x0079
        L_0x0078:
            r3 = r1
        L_0x0079:
            if (r3 == 0) goto L_0x004c
            r1 = r2
        L_0x007c:
            if (r1 == 0) goto L_0x0085
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.Result.m38702b(r0)
            goto L_0x0095
        L_0x0085:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.ArsenalGameThrowable r6 = new com.carrefour.fid.android.shared.io.ArsenalGameThrowable
            r0 = 0
            r6.<init>(r0, r2, r0)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0095:
            kotlin.Result r6 = kotlin.Result.m38701a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.ArsenalGameRepository$fetchArsenalTopGameContent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<? extends ArrayList<ArsenalGameContentResponse>>> cVar) {
        return ((ArsenalGameRepository$fetchArsenalTopGameContent$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
