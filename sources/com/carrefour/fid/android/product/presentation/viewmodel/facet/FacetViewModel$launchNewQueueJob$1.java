package com.carrefour.fid.android.product.presentation.viewmodel.facet;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel$launchNewQueueJob$1", mo22502f = "FacetViewModel.kt", mo22503i = {0, 1}, mo22504l = {163, 78}, mo22505m = "invokeSuspend", mo22506n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFacetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel$launchNewQueueJob$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,155:1\n105#2:156\n82#2,6:157\n106#2,2:163\n92#2:165\n88#2,3:166\n*S KotlinDebug\n*F\n+ 1 FacetViewModel.kt\ncom/carrefour/fid/android/product/presentation/viewmodel/facet/FacetViewModel$launchNewQueueJob$1\n*L\n78#1:156\n78#1:157,6\n78#1:163,2\n78#1:165\n78#1:166,3\n*E\n"})
public final class FacetViewModel$launchNewQueueJob$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FacetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacetViewModel$launchNewQueueJob$1(FacetViewModel facetViewModel, C11045c<? super FacetViewModel$launchNewQueueJob$1> cVar) {
        super(2, cVar);
        this.this$0 = facetViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new FacetViewModel$launchNewQueueJob$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059 A[Catch:{ all -> 0x0077 }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x007a }
            r8 = r1
            goto L_0x003e
        L_0x001b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0023:
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x007a }
            r5 = r4
            r4 = r7
            goto L_0x0051
        L_0x0031:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel r8 = r7.this$0
            kotlinx.coroutines.channels.g r4 = r8.f68202i
            kotlinx.coroutines.channels.ChannelIterator r8 = r4.iterator()     // Catch:{ all -> 0x007a }
        L_0x003e:
            r1 = r7
        L_0x003f:
            r1.L$0 = r4     // Catch:{ all -> 0x007a }
            r1.L$1 = r8     // Catch:{ all -> 0x007a }
            r1.label = r3     // Catch:{ all -> 0x007a }
            java.lang.Object r5 = r8.mo23863c(r1)     // Catch:{ all -> 0x007a }
            if (r5 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r6 = r1
            r1 = r8
            r8 = r5
            r5 = r4
            r4 = r6
        L_0x0051:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0077 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0077 }
            if (r8 == 0) goto L_0x0070
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x0077 }
            kotlinx.coroutines.c2 r8 = (kotlinx.coroutines.C11723c2) r8     // Catch:{ all -> 0x0077 }
            r4.L$0 = r5     // Catch:{ all -> 0x0077 }
            r4.L$1 = r1     // Catch:{ all -> 0x0077 }
            r4.label = r2     // Catch:{ all -> 0x0077 }
            java.lang.Object r8 = r8.mo23614S(r4)     // Catch:{ all -> 0x0077 }
            if (r8 != r0) goto L_0x006c
            return r0
        L_0x006c:
            r8 = r1
            r1 = r4
            r4 = r5
            goto L_0x003f
        L_0x0070:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0077 }
            r0 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r5, r0)
            return r8
        L_0x0077:
            r8 = move-exception
            r4 = r5
            goto L_0x007b
        L_0x007a:
            r8 = move-exception
        L_0x007b:
            throw r8     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r4, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.viewmodel.facet.FacetViewModel$launchNewQueueJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((FacetViewModel$launchNewQueueJob$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
