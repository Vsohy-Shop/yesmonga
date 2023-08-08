package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.runtime.C8547h2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C11363r0({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,163:1\n151#2,3:164\n33#2,4:167\n154#2,2:171\n38#2:173\n156#2:174\n151#2,3:175\n33#2,4:178\n154#2,2:182\n38#2:184\n156#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n151#2,3:197\n33#2,4:200\n154#2,2:204\n38#2:206\n156#2:207\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n102#1:164,3\n102#1:167,4\n102#1:171,2\n102#1:173\n102#1:174\n120#1:175,3\n120#1:178,4\n120#1:182,2\n120#1:184\n120#1:185\n137#1:186,3\n137#1:189,4\n137#1:193,2\n137#1:195\n137#1:196\n154#1:197,3\n154#1:200,4\n154#1:204,2\n154#1:206\n154#1:207\n*E\n"})
/* renamed from: androidx.compose.ui.layout.f0 */
public interface C15560f0 {

    /* renamed from: androidx.compose.ui.layout.f0$a */
    public static final class C15561a {
        @Deprecated
        /* renamed from: a */
        public static int m69173a(@C12579k C15560f0 f0Var, @C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "$receiver");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return C15560f0.super.mo6401e(mVar, list, i);
        }

        @Deprecated
        /* renamed from: b */
        public static int m69174b(@C12579k C15560f0 f0Var, @C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "$receiver");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return C15560f0.super.mo6398b(mVar, list, i);
        }

        @Deprecated
        /* renamed from: c */
        public static int m69175c(@C12579k C15560f0 f0Var, @C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "$receiver");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return C15560f0.super.mo6399c(mVar, list, i);
        }

        @Deprecated
        /* renamed from: d */
        public static int m69176d(@C12579k C15560f0 f0Var, @C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
            Intrinsics.checkNotNullParameter(mVar, "$receiver");
            Intrinsics.checkNotNullParameter(list, "measurables");
            return C15560f0.super.mo6400d(mVar, list, i);
        }
    }

    @C12579k
    /* renamed from: a */
    C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j);

    /* renamed from: b */
    int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C15556e((C15580l) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo6397a(new C15585n(mVar, mVar.getLayoutDirection()), arrayList, C16478c.m74377b(0, 0, 0, i, 7, (Object) null)).getWidth();
    }

    /* renamed from: c */
    int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C15556e((C15580l) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo6397a(new C15585n(mVar, mVar.getLayoutDirection()), arrayList, C16478c.m74377b(0, i, 0, 0, 13, (Object) null)).getHeight();
    }

    /* renamed from: d */
    int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C15556e((C15580l) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo6397a(new C15585n(mVar, mVar.getLayoutDirection()), arrayList, C16478c.m74377b(0, 0, 0, i, 7, (Object) null)).getWidth();
    }

    /* renamed from: e */
    int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C15556e((C15580l) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo6397a(new C15585n(mVar, mVar.getLayoutDirection()), arrayList, C16478c.m74377b(0, i, 0, 0, 13, (Object) null)).getHeight();
    }
}
