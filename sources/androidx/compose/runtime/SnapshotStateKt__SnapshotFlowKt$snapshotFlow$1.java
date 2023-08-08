package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", mo22502f = "SnapshotFlow.kt", mo22503i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, mo22504l = {134, 138, 160}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,174:1\n122#2,5:175\n122#2,5:180\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n129#1:175,5\n152#1:180,5\n*E\n"})
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements C11304p<C11908f<? super T>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<T> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(C11289a<? extends T> aVar, C11045c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> cVar) {
        super(2, cVar);
        this.$block = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, cVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super T> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: kotlinx.coroutines.flow.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100 A[Catch:{ all -> 0x0053 }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0074
            if (r2 == r6) goto L_0x0057
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            java.lang.Object r2 = r1.L$5
            java.lang.Object r7 = r1.L$4
            androidx.compose.runtime.snapshots.d r7 = (androidx.compose.runtime.snapshots.C8642d) r7
            java.lang.Object r8 = r1.L$3
            kotlinx.coroutines.channels.g r8 = (kotlinx.coroutines.channels.C11744g) r8
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            java.lang.Object r10 = r1.L$1
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.C11908f) r11
            goto L_0x006d
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0033:
            int r2 = r1.I$0
            java.lang.Object r7 = r1.L$5
            java.lang.Object r8 = r1.L$4
            androidx.compose.runtime.snapshots.d r8 = (androidx.compose.runtime.snapshots.C8642d) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.g r9 = (kotlinx.coroutines.channels.C11744g) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.functions.l r10 = (kotlin.jvm.functions.C11300l) r10
            java.lang.Object r11 = r1.L$1
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.flow.f r12 = (kotlinx.coroutines.flow.C11908f) r12
            kotlin.C11661u0.m45747n(r17)     // Catch:{ all -> 0x0053 }
            r13 = r17
            r14 = r1
            goto L_0x00e4
        L_0x0053:
            r0 = move-exception
            r7 = r8
            goto L_0x015a
        L_0x0057:
            java.lang.Object r2 = r1.L$5
            java.lang.Object r7 = r1.L$4
            androidx.compose.runtime.snapshots.d r7 = (androidx.compose.runtime.snapshots.C8642d) r7
            java.lang.Object r8 = r1.L$3
            kotlinx.coroutines.channels.g r8 = (kotlinx.coroutines.channels.C11744g) r8
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.functions.l r9 = (kotlin.jvm.functions.C11300l) r9
            java.lang.Object r10 = r1.L$1
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.C11908f) r11
        L_0x006d:
            kotlin.C11661u0.m45747n(r17)     // Catch:{ all -> 0x0071 }
            goto L_0x00c4
        L_0x0071:
            r0 = move-exception
            goto L_0x015a
        L_0x0074:
            kotlin.C11661u0.m45747n(r17)
            java.lang.Object r2 = r1.L$0
            r11 = r2
            kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.C11908f) r11
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 r9 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
            r9.<init>(r10)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7 = 6
            r8 = 0
            kotlinx.coroutines.channels.g r8 = kotlinx.coroutines.channels.C11748i.m46625d(r2, r8, r8, r7, r8)
            androidx.compose.runtime.snapshots.f$a r2 = androidx.compose.runtime.snapshots.C8646f.f23196e
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 r7 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
            r7.<init>(r8)
            androidx.compose.runtime.snapshots.d r7 = r2.mo16627h(r7)
            androidx.compose.runtime.snapshots.f r2 = r2.mo16633o(r9)     // Catch:{ all -> 0x0071 }
            kotlin.jvm.functions.a<T> r12 = r1.$block     // Catch:{ all -> 0x0071 }
            androidx.compose.runtime.snapshots.f r13 = r2.mo16617p()     // Catch:{ all -> 0x0155 }
            java.lang.Object r12 = r12.invoke()     // Catch:{ all -> 0x014f }
            r2.mo16619w(r13)     // Catch:{ all -> 0x0155 }
            r2.mo16415d()     // Catch:{ all -> 0x0071 }
            r1.L$0 = r11     // Catch:{ all -> 0x0071 }
            r1.L$1 = r10     // Catch:{ all -> 0x0071 }
            r1.L$2 = r9     // Catch:{ all -> 0x0071 }
            r1.L$3 = r8     // Catch:{ all -> 0x0071 }
            r1.L$4 = r7     // Catch:{ all -> 0x0071 }
            r1.L$5 = r12     // Catch:{ all -> 0x0071 }
            r1.label = r6     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r11.emit(r12, r1)     // Catch:{ all -> 0x0071 }
            if (r2 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            r2 = r12
        L_0x00c4:
            r12 = r1
        L_0x00c5:
            r12.L$0 = r11     // Catch:{ all -> 0x0071 }
            r12.L$1 = r10     // Catch:{ all -> 0x0071 }
            r12.L$2 = r9     // Catch:{ all -> 0x0071 }
            r12.L$3 = r8     // Catch:{ all -> 0x0071 }
            r12.L$4 = r7     // Catch:{ all -> 0x0071 }
            r12.L$5 = r2     // Catch:{ all -> 0x0071 }
            r12.I$0 = r3     // Catch:{ all -> 0x0071 }
            r12.label = r5     // Catch:{ all -> 0x0071 }
            java.lang.Object r13 = r8.mo23824c0(r12)     // Catch:{ all -> 0x0071 }
            if (r13 != r0) goto L_0x00dc
            return r0
        L_0x00dc:
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = r3
        L_0x00e4:
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0053 }
        L_0x00e6:
            if (r2 != 0) goto L_0x00f1
            boolean r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.m30173d(r11, r13)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r2 = r3
            goto L_0x00f2
        L_0x00f1:
            r2 = r6
        L_0x00f2:
            java.lang.Object r13 = r9.mo23811W()     // Catch:{ all -> 0x0053 }
            java.lang.Object r13 = kotlinx.coroutines.channels.C11749j.m46637h(r13)     // Catch:{ all -> 0x0053 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0053 }
            if (r13 != 0) goto L_0x00e6
            if (r2 == 0) goto L_0x0146
            r11.clear()     // Catch:{ all -> 0x0053 }
            androidx.compose.runtime.snapshots.f$a r2 = androidx.compose.runtime.snapshots.C8646f.f23196e     // Catch:{ all -> 0x0053 }
            androidx.compose.runtime.snapshots.f r2 = r2.mo16633o(r10)     // Catch:{ all -> 0x0053 }
            kotlin.jvm.functions.a<T> r13 = r14.$block     // Catch:{ all -> 0x0053 }
            androidx.compose.runtime.snapshots.f r15 = r2.mo16617p()     // Catch:{ all -> 0x0141 }
            java.lang.Object r13 = r13.invoke()     // Catch:{ all -> 0x013b }
            r2.mo16619w(r15)     // Catch:{ all -> 0x0141 }
            r2.mo16415d()     // Catch:{ all -> 0x0053 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r7)     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x0146
            r14.L$0 = r12     // Catch:{ all -> 0x0053 }
            r14.L$1 = r11     // Catch:{ all -> 0x0053 }
            r14.L$2 = r10     // Catch:{ all -> 0x0053 }
            r14.L$3 = r9     // Catch:{ all -> 0x0053 }
            r14.L$4 = r8     // Catch:{ all -> 0x0053 }
            r14.L$5 = r13     // Catch:{ all -> 0x0053 }
            r14.label = r4     // Catch:{ all -> 0x0053 }
            java.lang.Object r2 = r12.emit(r13, r14)     // Catch:{ all -> 0x0053 }
            if (r2 != r0) goto L_0x0134
            return r0
        L_0x0134:
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r2 = r13
            goto L_0x014c
        L_0x013b:
            r0 = move-exception
            r3 = r0
            r2.mo16619w(r15)     // Catch:{ all -> 0x0141 }
            throw r3     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            r2.mo16415d()     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0146:
            r2 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
        L_0x014c:
            r12 = r14
            goto L_0x00c5
        L_0x014f:
            r0 = move-exception
            r3 = r0
            r2.mo16619w(r13)     // Catch:{ all -> 0x0155 }
            throw r3     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            r2.mo16415d()     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x015a:
            r7.mo16593g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
