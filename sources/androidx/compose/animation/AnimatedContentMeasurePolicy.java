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

@C11363r0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,780:1\n49#2,6:781\n49#2,6:787\n14166#3,14:793\n14166#3,14:807\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n730#1:781,6\n737#1:787,6\n743#1:793,14\n744#1:807,14\n*E\n"})
public final class AnimatedContentMeasurePolicy implements C15560f0 {
    @C12579k

    /* renamed from: a */
    public final AnimatedContentScope<?> f5184a;

    public AnimatedContentMeasurePolicy(@C12579k AnimatedContentScope<?> animatedContentScope) {
        Intrinsics.checkNotNullParameter(animatedContentScope, "rootScope");
        this.f5184a = animatedContentScope;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: androidx.compose.animation.AnimatedContentScope$a} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [androidx.compose.ui.layout.w0] */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: type inference failed for: r10v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.p004ui.layout.C15564g0 mo6397a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15568h0 r16, @org.jetbrains.annotations.C12579k java.util.List<? extends androidx.compose.p004ui.layout.C15557e0> r17, long r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            r2 = r18
            java.lang.String r4 = "$this$measure"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            java.lang.String r4 = "measurables"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            int r4 = r17.size()
            androidx.compose.ui.layout.w0[] r6 = new androidx.compose.p004ui.layout.C15611w0[r4]
            int r7 = r17.size()
            r8 = 0
            r9 = r8
        L_0x001d:
            r10 = 0
            r11 = 1
            if (r9 >= r7) goto L_0x0047
            java.lang.Object r12 = r1.get(r9)
            androidx.compose.ui.layout.e0 r12 = (androidx.compose.p004ui.layout.C15557e0) r12
            java.lang.Object r13 = r12.mo44319c()
            boolean r14 = r13 instanceof androidx.compose.animation.AnimatedContentScope.C1897a
            if (r14 == 0) goto L_0x0032
            r10 = r13
            androidx.compose.animation.AnimatedContentScope$a r10 = (androidx.compose.animation.AnimatedContentScope.C1897a) r10
        L_0x0032:
            if (r10 == 0) goto L_0x003b
            boolean r10 = r10.mo6435g()
            if (r10 != r11) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r11 = r8
        L_0x003c:
            if (r11 == 0) goto L_0x0044
            androidx.compose.ui.layout.w0 r10 = r12.mo44324t0(r2)
            r6[r9] = r10
        L_0x0044:
            int r9 = r9 + 1
            goto L_0x001d
        L_0x0047:
            int r7 = r17.size()
            r9 = r8
        L_0x004c:
            if (r9 >= r7) goto L_0x0061
            java.lang.Object r12 = r1.get(r9)
            androidx.compose.ui.layout.e0 r12 = (androidx.compose.p004ui.layout.C15557e0) r12
            r13 = r6[r9]
            if (r13 != 0) goto L_0x005e
            androidx.compose.ui.layout.w0 r12 = r12.mo44324t0(r2)
            r6[r9] = r12
        L_0x005e:
            int r9 = r9 + 1
            goto L_0x004c
        L_0x0061:
            if (r4 != 0) goto L_0x0065
            r1 = r11
            goto L_0x0066
        L_0x0065:
            r1 = r8
        L_0x0066:
            if (r1 == 0) goto L_0x006a
            r1 = r10
            goto L_0x009d
        L_0x006a:
            r1 = r6[r8]
            int r2 = kotlin.collections.ArraysKt___ArraysKt.m39523Xe(r6)
            if (r2 != 0) goto L_0x0073
            goto L_0x009d
        L_0x0073:
            if (r1 == 0) goto L_0x007a
            int r3 = r1.mo44471K0()
            goto L_0x007b
        L_0x007a:
            r3 = r8
        L_0x007b:
            kotlin.ranges.l r7 = new kotlin.ranges.l
            r7.<init>(r11, r2)
            kotlin.collections.k0 r2 = r7.iterator()
        L_0x0084:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x009d
            int r7 = r2.mo6374c()
            r7 = r6[r7]
            if (r7 == 0) goto L_0x0097
            int r9 = r7.mo44471K0()
            goto L_0x0098
        L_0x0097:
            r9 = r8
        L_0x0098:
            if (r3 >= r9) goto L_0x0084
            r1 = r7
            r3 = r9
            goto L_0x0084
        L_0x009d:
            if (r1 == 0) goto L_0x00a4
            int r1 = r1.mo44471K0()
            goto L_0x00a5
        L_0x00a4:
            r1 = r8
        L_0x00a5:
            if (r4 != 0) goto L_0x00a9
            r2 = r11
            goto L_0x00aa
        L_0x00a9:
            r2 = r8
        L_0x00aa:
            if (r2 == 0) goto L_0x00ad
            goto L_0x00e0
        L_0x00ad:
            r10 = r6[r8]
            int r2 = kotlin.collections.ArraysKt___ArraysKt.m39523Xe(r6)
            if (r2 != 0) goto L_0x00b6
            goto L_0x00e0
        L_0x00b6:
            if (r10 == 0) goto L_0x00bd
            int r3 = r10.mo44468G0()
            goto L_0x00be
        L_0x00bd:
            r3 = r8
        L_0x00be:
            kotlin.ranges.l r4 = new kotlin.ranges.l
            r4.<init>(r11, r2)
            kotlin.collections.k0 r2 = r4.iterator()
        L_0x00c7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00e0
            int r4 = r2.mo6374c()
            r4 = r6[r4]
            if (r4 == 0) goto L_0x00da
            int r7 = r4.mo44468G0()
            goto L_0x00db
        L_0x00da:
            r7 = r8
        L_0x00db:
            if (r3 >= r7) goto L_0x00c7
            r10 = r4
            r3 = r7
            goto L_0x00c7
        L_0x00e0:
            if (r10 == 0) goto L_0x00e8
            int r2 = r10.mo44468G0()
            r7 = r2
            goto L_0x00e9
        L_0x00e8:
            r7 = r8
        L_0x00e9:
            androidx.compose.animation.AnimatedContentScope<?> r2 = r0.f5184a
            long r3 = androidx.compose.p004ui.unit.C16502r.m74668a(r1, r7)
            r2.mo6425w(r3)
            r8 = 0
            androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3 r9 = new androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            r9.<init>(r6, r15, r1, r7)
            r10 = 4
            r11 = 0
            r5 = r16
            r6 = r1
            androidx.compose.ui.layout.g0 r1 = androidx.compose.p004ui.layout.C15568h0.m69206r2(r5, r6, r7, r8, r9, r10, r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentMeasurePolicy.mo6397a(androidx.compose.ui.layout.h0, java.util.List, long):androidx.compose.ui.layout.g0");
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.m44633C1(SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(list), new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.m44633C1(SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(list), new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.m44633C1(SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(list), new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.m44633C1(SequencesKt___SequencesKt.m44761k1(CollectionsKt___CollectionsKt.m40700v1(list), new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @C12579k
    /* renamed from: j */
    public final AnimatedContentScope<?> mo6402j() {
        return this.f5184a;
    }
}
