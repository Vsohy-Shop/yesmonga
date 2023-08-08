package androidx.compose.runtime.snapshots;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.sequences.C11561o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", mo22502f = "SnapshotIdSet.kt", mo22503i = {0, 0, 1, 1, 2, 2}, mo22504l = {295, 300, 307}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, mo22507s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/sequences/o;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super Integer>, C11045c<? super C11079d2>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SnapshotIdSet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, C11045c<? super SnapshotIdSet$iterator$1> cVar) {
        super(2, cVar);
        this.this$0 = snapshotIdSet;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, cVar);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super Integer> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SnapshotIdSet$iterator$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r6 = 3
            r7 = 2
            r8 = 64
            r10 = 0
            r12 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r12) goto L_0x003c
            if (r2 == r7) goto L_0x0030
            if (r2 != r6) goto L_0x0028
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$0
            kotlin.sequences.o r7 = (kotlin.sequences.C11561o) r7
            kotlin.C11661u0.m45747n(r21)
            r9 = r2
            r13 = r6
            r2 = r0
            goto L_0x00f4
        L_0x0028:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0030:
            int r2 = r0.I$0
            java.lang.Object r13 = r0.L$0
            kotlin.sequences.o r13 = (kotlin.sequences.C11561o) r13
            kotlin.C11661u0.m45747n(r21)
            r9 = r0
            goto L_0x00b7
        L_0x003c:
            int r2 = r0.I$1
            int r13 = r0.I$0
            java.lang.Object r14 = r0.L$1
            int[] r14 = (int[]) r14
            java.lang.Object r15 = r0.L$0
            kotlin.sequences.o r15 = (kotlin.sequences.C11561o) r15
            kotlin.C11661u0.m45747n(r21)
            r9 = r0
            goto L_0x007b
        L_0x004d:
            kotlin.C11661u0.m45747n(r21)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.o r2 = (kotlin.sequences.C11561o) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r0.this$0
            int[] r13 = r13.f23124d
            if (r13 == 0) goto L_0x0080
            int r14 = r13.length
            r9 = r0
            r15 = r2
            r2 = r14
            r14 = r13
            r13 = 0
        L_0x0062:
            if (r13 >= r2) goto L_0x007e
            r17 = r14[r13]
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r17)
            r9.L$0 = r15
            r9.L$1 = r14
            r9.I$0 = r13
            r9.I$1 = r2
            r9.label = r12
            java.lang.Object r6 = r15.mo23250b(r6, r9)
            if (r6 != r1) goto L_0x007b
            return r1
        L_0x007b:
            int r13 = r13 + r12
            r6 = 3
            goto L_0x0062
        L_0x007e:
            r2 = r15
            goto L_0x0081
        L_0x0080:
            r9 = r0
        L_0x0081:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r13 = r6.f23122b
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00ba
            r13 = r2
            r2 = 0
        L_0x008d:
            if (r2 >= r8) goto L_0x00b9
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r14 = r6.f23122b
            long r18 = r4 << r2
            long r14 = r14 & r18
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00b7
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            int r6 = r6.f23123c
            int r6 = r6 + r2
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r6)
            r9.L$0 = r13
            r9.L$1 = r3
            r9.I$0 = r2
            r9.label = r7
            java.lang.Object r6 = r13.mo23250b(r6, r9)
            if (r6 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            int r2 = r2 + r12
            goto L_0x008d
        L_0x00b9:
            r2 = r13
        L_0x00ba:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r6 = r6.f23121a
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00f6
            r7 = r2
            r2 = r9
            r9 = 0
        L_0x00c7:
            if (r9 >= r8) goto L_0x00f6
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r2.this$0
            long r13 = r6.f23121a
            long r15 = r4 << r9
            long r13 = r13 & r15
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00f3
            int r6 = r9 + 64
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r2.this$0
            int r13 = r13.f23123c
            int r6 = r6 + r13
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r6)
            r2.L$0 = r7
            r2.L$1 = r3
            r2.I$0 = r9
            r13 = 3
            r2.label = r13
            java.lang.Object r6 = r7.mo23250b(r6, r2)
            if (r6 != r1) goto L_0x00f4
            return r1
        L_0x00f3:
            r13 = 3
        L_0x00f4:
            int r9 = r9 + r12
            goto L_0x00c7
        L_0x00f6:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
