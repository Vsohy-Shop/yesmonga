package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", mo22502f = "Recomposer.kt", mo22503i = {0, 0, 0, 1}, mo22504l = {746, 766, 767}, mo22505m = "invokeSuspend", mo22506n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, mo22507s = {"L$0", "L$1", "L$2", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Landroidx/compose/runtime/v0;", "parentFrameClock", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n433#3,3:1410\n436#3,2:1417\n438#3,8:1420\n33#4,4:1413\n38#4:1419\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n749#1:1409\n750#1:1410,3\n750#1:1417,2\n750#1:1420,8\n750#1:1413,4\n750#1:1419\n*E\n"})
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements C11305q<C12074o0, C8686v0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, C11045c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.$recomposeCoroutineContext = coroutineContext;
        this.this$0 = recomposer;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C12074o0 o0Var, @C12579k C8686v0 v0Var, @C12580l C11045c<? super C11079d2> cVar) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, cVar);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = o0Var;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = v0Var;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(C11079d2.f28267a);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @org.jetbrains.annotations.C12580l
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r3 = 3
            r4 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r7) goto L_0x002b
            if (r2 == r4) goto L_0x0021
            if (r2 != r3) goto L_0x0019
            kotlin.C11661u0.m45747n(r22)
            goto L_0x0187
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0021:
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.c2 r2 = (kotlinx.coroutines.C11723c2) r2
            kotlin.C11661u0.m45747n(r22)
            r10 = r1
            goto L_0x017c
        L_0x002b:
            java.lang.Object r2 = r1.L$2
            kotlinx.coroutines.c2 r2 = (kotlinx.coroutines.C11723c2) r2
            java.lang.Object r8 = r1.L$1
            androidx.compose.runtime.g1 r8 = (androidx.compose.runtime.C8542g1) r8
            java.lang.Object r9 = r1.L$0
            kotlinx.coroutines.o0 r9 = (kotlinx.coroutines.C12074o0) r9
            kotlin.C11661u0.m45747n(r22)
            r14 = r1
            r15 = r9
            goto L_0x00ab
        L_0x003e:
            kotlin.C11661u0.m45747n(r22)
            java.lang.Object r2 = r1.L$0
            r8 = r2
            kotlinx.coroutines.o0 r8 = (kotlinx.coroutines.C12074o0) r8
            java.lang.Object r2 = r1.L$1
            androidx.compose.runtime.v0 r2 = (androidx.compose.runtime.C8686v0) r2
            kotlin.coroutines.CoroutineContext r9 = r1.$recomposeCoroutineContext
            kotlinx.coroutines.c2$b r10 = kotlinx.coroutines.C11723c2.f29067w0
            kotlin.coroutines.CoroutineContext$a r9 = r9.mo7444b(r10)
            if (r9 != 0) goto L_0x0056
            r9 = r7
            goto L_0x0057
        L_0x0056:
            r9 = 0
        L_0x0057:
            kotlin.coroutines.CoroutineContext r11 = r1.$recomposeCoroutineContext
            if (r9 == 0) goto L_0x018a
            kotlin.coroutines.CoroutineContext r9 = r8.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r10 = r1.$recomposeCoroutineContext
            kotlin.coroutines.CoroutineContext r9 = r9.mo7443Q(r10)
            kotlin.coroutines.CoroutineContext r10 = r8.getCoroutineContext()
            kotlinx.coroutines.c2 r10 = kotlinx.coroutines.C11804f2.m46951B(r10)
            kotlinx.coroutines.a0 r10 = kotlinx.coroutines.C11804f2.m46953a(r10)
            kotlin.coroutines.CoroutineContext r9 = r9.mo7443Q(r10)
            kotlinx.coroutines.o0 r14 = kotlinx.coroutines.C12079p0.m48260a(r9)
            androidx.compose.runtime.g1 r15 = new androidx.compose.runtime.g1
            r15.<init>()
            r9 = 0
            r10 = 0
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 r11 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1
            androidx.compose.runtime.Recomposer r12 = r1.this$0
            r11.<init>(r12, r2, r15, r6)
            r12 = 3
            r13 = 0
            kotlinx.coroutines.c2 r2 = kotlinx.coroutines.C12038j.m48061f(r8, r9, r10, r11, r12, r13)
            r10 = r1
            r9 = r14
            r8 = r15
        L_0x0090:
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            boolean r11 = r11.mo15254u0()
            if (r11 == 0) goto L_0x0165
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            r10.L$0 = r9
            r10.L$1 = r8
            r10.L$2 = r2
            r10.label = r7
            java.lang.Object r11 = r11.mo15242i0(r10)
            if (r11 != r0) goto L_0x00a9
            return r0
        L_0x00a9:
            r15 = r9
            r14 = r10
        L_0x00ab:
            androidx.compose.runtime.Recomposer r9 = r14.this$0
            java.lang.Object r16 = r9.f22715d
            androidx.compose.runtime.Recomposer r13 = r14.this$0
            monitor-enter(r16)
            java.util.Set r9 = r13.f22719h     // Catch:{ all -> 0x0162 }
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ all -> 0x0162 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0162 }
            r10 = r10 ^ r7
            if (r10 == 0) goto L_0x00e3
            java.util.List r10 = r13.f22718g     // Catch:{ all -> 0x0162 }
            int r11 = r10.size()     // Catch:{ all -> 0x0162 }
            r12 = 0
        L_0x00cb:
            if (r12 >= r11) goto L_0x00db
            java.lang.Object r17 = r10.get(r12)     // Catch:{ all -> 0x0162 }
            r5 = r17
            androidx.compose.runtime.y r5 = (androidx.compose.runtime.C8696y) r5     // Catch:{ all -> 0x0162 }
            r5.mo16366q(r9)     // Catch:{ all -> 0x0162 }
            int r12 = r12 + 1
            goto L_0x00cb
        L_0x00db:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0162 }
            r5.<init>()     // Catch:{ all -> 0x0162 }
            r13.f22719h = r5     // Catch:{ all -> 0x0162 }
        L_0x00e3:
            java.util.List r5 = r13.f22720i     // Catch:{ all -> 0x0162 }
            int r12 = r5.size()     // Catch:{ all -> 0x0162 }
            r11 = 0
        L_0x00ec:
            if (r11 >= r12) goto L_0x0126
            java.lang.Object r9 = r5.get(r11)     // Catch:{ all -> 0x0162 }
            androidx.compose.runtime.y r9 = (androidx.compose.runtime.C8696y) r9     // Catch:{ all -> 0x0162 }
            int r10 = r13.f22727p     // Catch:{ all -> 0x0162 }
            int r10 = r10 + r7
            r13.f22727p = r10     // Catch:{ all -> 0x0162 }
            kotlin.coroutines.CoroutineContext r10 = androidx.compose.runtime.C8676t.m31874j(r9)     // Catch:{ all -> 0x0162 }
            r17 = 0
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1 r7 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1     // Catch:{ all -> 0x0162 }
            r7.<init>(r13, r9, r6)     // Catch:{ all -> 0x0162 }
            r18 = 2
            r19 = 0
            r9 = r15
            r20 = r11
            r11 = r17
            r17 = r12
            r12 = r7
            r7 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0162 }
            int r11 = r20 + 1
            r13 = r7
            r12 = r17
            r14 = r18
            r7 = 1
            goto L_0x00ec
        L_0x0126:
            r7 = r13
            r18 = r14
            java.util.List r5 = r7.f22720i     // Catch:{ all -> 0x0162 }
            r5.clear()     // Catch:{ all -> 0x0162 }
            kotlinx.coroutines.o r5 = r7.mo15246m0()     // Catch:{ all -> 0x0162 }
            if (r5 != 0) goto L_0x0156
            boolean r5 = r7.mo15250q0()     // Catch:{ all -> 0x0162 }
            if (r5 == 0) goto L_0x0141
            kotlin.coroutines.c r5 = r8.mo16129d()     // Catch:{ all -> 0x0162 }
            goto L_0x0142
        L_0x0141:
            r5 = r6
        L_0x0142:
            monitor-exit(r16)
            if (r5 == 0) goto L_0x0150
            kotlin.Result$a r7 = kotlin.Result.f28060a
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            r5.resumeWith(r7)
        L_0x0150:
            r9 = r15
            r10 = r18
            r7 = 1
            goto L_0x0090
        L_0x0156:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = "called outside of runRecomposeAndApplyChanges"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0162 }
            r0.<init>(r2)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        L_0x0165:
            kotlin.coroutines.CoroutineContext r5 = r9.getCoroutineContext()
            kotlinx.coroutines.c2 r5 = kotlinx.coroutines.C11804f2.m46951B(r5)
            r10.L$0 = r2
            r10.L$1 = r6
            r10.L$2 = r6
            r10.label = r4
            java.lang.Object r4 = kotlinx.coroutines.C11804f2.m46964l(r5, r10)
            if (r4 != r0) goto L_0x017c
            return r0
        L_0x017c:
            r10.L$0 = r6
            r10.label = r3
            java.lang.Object r2 = kotlinx.coroutines.C11804f2.m46964l(r2, r10)
            if (r2 != r0) goto L_0x0187
            return r0
        L_0x0187:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x018a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "recomposeCoroutineContext may not contain a Job; found "
            r0.append(r2)
            kotlin.coroutines.CoroutineContext$a r2 = r11.mo7444b(r10)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
