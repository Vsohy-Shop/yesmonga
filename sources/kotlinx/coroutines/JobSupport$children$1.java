package kotlinx.coroutines;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.sequences.C11561o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.JobSupport$children$1", mo22502f = "JobSupport.kt", mo22503i = {1, 1, 1}, mo22504l = {956, 958}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "this_$iv", "cur$iv"}, mo22507s = {"L$0", "L$1", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/sequences/o;", "Lkotlinx/coroutines/c2;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1454:1\n341#2,6:1455\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n958#1:1455,6\n*E\n"})
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super C11723c2>, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, C11045c<? super JobSupport$children$1> cVar) {
        super(2, cVar);
        this.this$0 = jobSupport;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, cVar);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super C11723c2> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((JobSupport$children$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r1 = r7.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r7.L$1
            kotlinx.coroutines.internal.u r3 = (kotlinx.coroutines.internal.C12021u) r3
            java.lang.Object r4 = r7.L$0
            kotlin.sequences.o r4 = (kotlin.sequences.C11561o) r4
            kotlin.C11661u0.m45747n(r8)
            r8 = r7
            goto L_0x0083
        L_0x001f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0027:
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0088
        L_0x002b:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Object r8 = r7.L$0
            kotlin.sequences.o r8 = (kotlin.sequences.C11561o) r8
            kotlinx.coroutines.JobSupport r1 = r7.this$0
            java.lang.Object r1 = r1.mo23620Z0()
            boolean r4 = r1 instanceof kotlinx.coroutines.C12158v
            if (r4 == 0) goto L_0x0049
            kotlinx.coroutines.v r1 = (kotlinx.coroutines.C12158v) r1
            kotlinx.coroutines.w r1 = r1.f29941e
            r7.label = r3
            java.lang.Object r8 = r8.mo23250b(r1, r7)
            if (r8 != r0) goto L_0x0088
            return r0
        L_0x0049:
            boolean r3 = r1 instanceof kotlinx.coroutines.C12166w1
            if (r3 == 0) goto L_0x0088
            kotlinx.coroutines.w1 r1 = (kotlinx.coroutines.C12166w1) r1
            kotlinx.coroutines.n2 r1 = r1.mo23671a()
            if (r1 == 0) goto L_0x0088
            java.lang.Object r3 = r1.mo24314m()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0065:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r5 != 0) goto L_0x0088
            boolean r5 = r1 instanceof kotlinx.coroutines.C12158v
            if (r5 == 0) goto L_0x0083
            r5 = r1
            kotlinx.coroutines.v r5 = (kotlinx.coroutines.C12158v) r5
            kotlinx.coroutines.w r5 = r5.f29941e
            r8.L$0 = r4
            r8.L$1 = r3
            r8.L$2 = r1
            r8.label = r2
            java.lang.Object r5 = r4.mo23250b(r5, r8)
            if (r5 != r0) goto L_0x0083
            return r0
        L_0x0083:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.mo24315n()
            goto L_0x0065
        L_0x0088:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
