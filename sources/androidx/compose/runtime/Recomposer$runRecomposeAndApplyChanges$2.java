package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", mo22502f = "Recomposer.kt", mo22503i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, mo22504l = {492, 510}, mo22505m = "invokeSuspend", mo22506n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Landroidx/compose/runtime/v0;", "parentFrameClock", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1410\n33#3,6:1411\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n496#1:1409\n485#1:1410\n486#1:1411,6\n*E\n"})
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements C11305q<C12074o0, C8686v0, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, C11045c<? super Recomposer$runRecomposeAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.this$0 = recomposer;
    }

    /* renamed from: k */
    public static final void m30135k(List<C8696y> list, List<C8697y0> list2, List<C8696y> list3, Set<C8696y> set, Set<C8696y> set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    /* renamed from: l */
    public static final void m30136l(List<C8697y0> list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f22715d) {
            List z = recomposer.f22722k;
            int size = z.size();
            for (int i = 0; i < size; i++) {
                list.add((C8697y0) z.get(i));
            }
            recomposer.f22722k.clear();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    @C12580l
    /* renamed from: i */
    public final Object invoke(@C12579k C12074o0 o0Var, @C12579k C8686v0 v0Var, @C12580l C11045c<? super C11079d2> cVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, cVar);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = v0Var;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(C11079d2.f28267a);
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
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r2 = r1.L$5
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.L$4
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$0
            androidx.compose.runtime.v0 r9 = (androidx.compose.runtime.C8686v0) r9
            kotlin.C11661u0.m45747n(r19)
            r10 = r1
            r14 = r6
            r6 = r3
            r16 = r9
            r9 = r2
            r2 = r16
            r17 = r8
            r8 = r5
            r5 = r17
            goto L_0x00fd
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0042:
            java.lang.Object r2 = r1.L$5
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.L$4
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$0
            androidx.compose.runtime.v0 r9 = (androidx.compose.runtime.C8686v0) r9
            kotlin.C11661u0.m45747n(r19)
            r11 = r1
            r10 = r2
            r15 = r5
            r14 = r6
            r13 = r7
            r12 = r8
            r2 = r9
            goto L_0x00ab
        L_0x0065:
            kotlin.C11661u0.m45747n(r19)
            java.lang.Object r2 = r1.L$0
            androidx.compose.runtime.v0 r2 = (androidx.compose.runtime.C8686v0) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r10 = r1
        L_0x0086:
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            boolean r11 = r11.mo15254u0()
            if (r11 == 0) goto L_0x010b
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            r10.L$0 = r2
            r10.L$1 = r5
            r10.L$2 = r6
            r10.L$3 = r7
            r10.L$4 = r8
            r10.L$5 = r9
            r10.label = r4
            java.lang.Object r11 = r11.mo15242i0(r10)
            if (r11 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r8
            r11 = r10
            r10 = r9
        L_0x00ab:
            androidx.compose.runtime.Recomposer r5 = r11.this$0
            java.lang.Object r5 = r5.f22715d
            androidx.compose.runtime.Recomposer r6 = r11.this$0
            monitor-enter(r5)
            boolean r7 = r6.mo15251r0()     // Catch:{ all -> 0x0108 }
            r8 = 0
            if (r7 != 0) goto L_0x00c5
            r6.mo15230G0()     // Catch:{ all -> 0x0108 }
            boolean r6 = r6.mo15251r0()     // Catch:{ all -> 0x0108 }
            if (r6 != 0) goto L_0x00c5
            r8 = r4
        L_0x00c5:
            monitor-exit(r5)
            if (r8 == 0) goto L_0x00cf
            r9 = r10
            r10 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            goto L_0x0086
        L_0x00cf:
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2 r9 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2
            androidx.compose.runtime.Recomposer r6 = r11.this$0
            r5 = r9
            r7 = r12
            r8 = r13
            r4 = r9
            r9 = r15
            r19 = r10
            r10 = r14
            r3 = r11
            r11 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.L$0 = r2
            r3.L$1 = r12
            r3.L$2 = r13
            r3.L$3 = r14
            r3.L$4 = r15
            r9 = r19
            r3.L$5 = r9
            r6 = 2
            r3.label = r6
            java.lang.Object r4 = r2.mo14872B(r4, r3)
            if (r4 != r0) goto L_0x00f9
            return r0
        L_0x00f9:
            r10 = r3
            r5 = r12
            r7 = r13
            r8 = r15
        L_0x00fd:
            androidx.compose.runtime.Recomposer r3 = r10.this$0
            r3.mo15247n0()
            r3 = r6
            r6 = r7
            r7 = r14
            r4 = 1
            goto L_0x0086
        L_0x0108:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x010b:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
