package androidx.compose.animation;

import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,863:1\n1549#2:864\n1620#2,3:865\n145#3,13:868\n145#3,13:881\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedEnterExitMeasurePolicy\n*L\n795#1:864\n795#1:865,3\n796#1:868,13\n797#1:881,13\n*E\n"})
public final class AnimatedEnterExitMeasurePolicy implements C15560f0 {
    @C12579k

    /* renamed from: a */
    public final C1915c f5206a;

    public AnimatedEnterExitMeasurePolicy(@C12579k C1915c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "scope");
        this.f5206a = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.ui.layout.w0} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.p004ui.layout.C15564g0 mo6397a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15568h0 r10, @org.jetbrains.annotations.C12579k java.util.List<? extends androidx.compose.p004ui.layout.C15557e0> r11, long r12) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$measure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "measurables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C10978t.m41495Y(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x001b:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r11.next()
            androidx.compose.ui.layout.e0 r1 = (androidx.compose.p004ui.layout.C15557e0) r1
            androidx.compose.ui.layout.w0 r1 = r1.mo44324t0(r12)
            r0.add(r1)
            goto L_0x001b
        L_0x002f:
            boolean r11 = r0.isEmpty()
            r12 = 0
            r13 = 1
            r1 = 0
            if (r11 == 0) goto L_0x003a
            r11 = r12
            goto L_0x0060
        L_0x003a:
            java.lang.Object r11 = r0.get(r1)
            r2 = r11
            androidx.compose.ui.layout.w0 r2 = (androidx.compose.p004ui.layout.C15611w0) r2
            int r2 = r2.mo44471K0()
            int r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r0)
            if (r13 > r3) goto L_0x0060
            r4 = r13
        L_0x004c:
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            androidx.compose.ui.layout.w0 r6 = (androidx.compose.p004ui.layout.C15611w0) r6
            int r6 = r6.mo44471K0()
            if (r2 >= r6) goto L_0x005b
            r11 = r5
            r2 = r6
        L_0x005b:
            if (r4 == r3) goto L_0x0060
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0060:
            androidx.compose.ui.layout.w0 r11 = (androidx.compose.p004ui.layout.C15611w0) r11
            if (r11 == 0) goto L_0x006a
            int r11 = r11.mo44471K0()
            r3 = r11
            goto L_0x006b
        L_0x006a:
            r3 = r1
        L_0x006b:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x0072
            goto L_0x0098
        L_0x0072:
            java.lang.Object r11 = r0.get(r1)
            r12 = r11
            androidx.compose.ui.layout.w0 r12 = (androidx.compose.p004ui.layout.C15611w0) r12
            int r12 = r12.mo44468G0()
            int r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40443G(r0)
            if (r13 > r2) goto L_0x0097
        L_0x0083:
            java.lang.Object r4 = r0.get(r13)
            r5 = r4
            androidx.compose.ui.layout.w0 r5 = (androidx.compose.p004ui.layout.C15611w0) r5
            int r5 = r5.mo44468G0()
            if (r12 >= r5) goto L_0x0092
            r11 = r4
            r12 = r5
        L_0x0092:
            if (r13 == r2) goto L_0x0097
            int r13 = r13 + 1
            goto L_0x0083
        L_0x0097:
            r12 = r11
        L_0x0098:
            androidx.compose.ui.layout.w0 r12 = (androidx.compose.p004ui.layout.C15611w0) r12
            if (r12 == 0) goto L_0x00a0
            int r1 = r12.mo44468G0()
        L_0x00a0:
            r4 = r1
            androidx.compose.animation.c r11 = r9.f5206a
            androidx.compose.runtime.z0 r11 = r11.mo6594e()
            long r12 = androidx.compose.p004ui.unit.C16502r.m74668a(r3, r4)
            androidx.compose.ui.unit.q r12 = androidx.compose.p004ui.unit.C16500q.m74651b(r12)
            r11.setValue(r12)
            r5 = 0
            androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1 r6 = new androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            r6.<init>(r0)
            r7 = 4
            r8 = 0
            r2 = r10
            androidx.compose.ui.layout.g0 r10 = androidx.compose.p004ui.layout.C15568h0.m69206r2(r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedEnterExitMeasurePolicy.mo6397a(androidx.compose.ui.layout.h0, java.util.List, long):androidx.compose.ui.layout.g0");
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.m44633C1(SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(list), new AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.m44633C1(SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(list), new AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.m44633C1(SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(list), new AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.m44633C1(SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(list), new AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @C12579k
    /* renamed from: j */
    public final C1915c mo6462j() {
        return this.f5206a;
    }
}
