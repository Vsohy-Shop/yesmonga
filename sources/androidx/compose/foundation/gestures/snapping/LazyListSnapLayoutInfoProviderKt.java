package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.C2044t;
import androidx.compose.animation.core.C2017x;
import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C2517l;
import androidx.compose.foundation.lazy.C2570o;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n36#2:131\n1114#3,6:132\n1#4:138\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n110#1:131\n110#1:132,6\n*E\n"})
public final class LazyListSnapLayoutInfoProviderKt {

    @C11363r0({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,130:1\n33#2,6:131\n132#2,3:137\n33#2,4:140\n135#2,2:144\n38#2:146\n137#2:147\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$2\n*L\n73#1:131,6\n93#1:137,3\n93#1:140,4\n93#1:144,2\n93#1:146\n93#1:147\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$a */
    public static final class C2213a implements C2218e {

        /* renamed from: a */
        public final /* synthetic */ LazyListState f5945a;

        /* renamed from: b */
        public final /* synthetic */ C11305q<C16479d, Float, Float, Float> f5946b;

        public C2213a(LazyListState lazyListState, C11305q<? super C16479d, ? super Float, ? super Float, Float> qVar) {
            this.f5945a = lazyListState;
            this.f5946b = qVar;
        }

        /* renamed from: a */
        public float mo7546a(@C12579k C16479d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            C2570o d = mo7549d();
            if (!(!d.mo8378i().isEmpty())) {
                return 0.0f;
            }
            List<C2517l> i = d.mo8378i();
            int size = i.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += i.get(i3).getSize();
            }
            return ((float) i2) / ((float) d.mo8378i().size());
        }

        @C12579k
        /* renamed from: b */
        public C11457f<Float> mo7547b(@C12579k C16479d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            List<C2517l> i = mo7549d().mo8378i();
            C11305q<C16479d, Float, Float, Float> qVar = this.f5946b;
            int size = i.size();
            float f = Float.NEGATIVE_INFINITY;
            float f2 = Float.POSITIVE_INFINITY;
            for (int i2 = 0; i2 < size; i2++) {
                float c = LazyListSnapLayoutInfoProviderKt.m9586c(dVar, mo7549d(), i.get(i2), qVar);
                if (c <= 0.0f && c > f) {
                    f = c;
                }
                if (c >= 0.0f && c < f2) {
                    f2 = c;
                }
            }
            return C11478t.m44305e(f, f2);
        }

        /* renamed from: c */
        public float mo7548c(@C12579k C16479d dVar, float f) {
            boolean z;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            float t = C11479u.m44444t(Math.abs(C2017x.m8654a(C2044t.m8757c(dVar), 0.0f, f)) - mo7546a(dVar), 0.0f);
            if (t == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return t;
            }
            return t * Math.signum(f);
        }

        /* renamed from: d */
        public final C2570o mo7549d() {
            return this.f5945a.mo8343u();
        }
    }

    @C2855v
    @C12579k
    /* renamed from: a */
    public static final C2218e m9584a(@C12579k LazyListState lazyListState, @C12579k C11305q<? super C16479d, ? super Float, ? super Float, Float> qVar) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(qVar, "positionInLayout");
        return new C2213a(lazyListState, qVar);
    }

    /* renamed from: b */
    public static /* synthetic */ C2218e m9585b(LazyListState lazyListState, C11305q qVar, int i, Object obj) {
        if ((i & 2) != 0) {
            qVar = LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1.f5947f;
        }
        return m9584a(lazyListState, qVar);
    }

    /* renamed from: c */
    public static final float m9586c(@C12579k C16479d dVar, @C12579k C2570o oVar, @C12579k C2517l lVar, @C12579k C11305q<? super C16479d, ? super Float, ? super Float, Float> qVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(oVar, "layoutInfo");
        Intrinsics.checkNotNullParameter(lVar, "item");
        Intrinsics.checkNotNullParameter(qVar, "positionInLayout");
        return ((float) lVar.getOffset()) - qVar.invoke(dVar, Float.valueOf((float) ((m9587d(oVar) - oVar.mo8375f()) - oVar.mo8372c())), Float.valueOf((float) lVar.getSize())).floatValue();
    }

    /* renamed from: d */
    public static final int m9587d(C2570o oVar) {
        return oVar.mo8370a() == Orientation.Vertical ? C16500q.m74659j(oVar.mo8371b()) : C16500q.m74662m(oVar.mo8371b());
    }

    @C8540g
    @C2855v
    @C12579k
    /* renamed from: e */
    public static final C2195g m9588e(@C12579k LazyListState lazyListState, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        oVar.mo14918M(1148456277);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1148456277, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:108)");
        }
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(lazyListState);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = m9585b(lazyListState, (C11305q) null, 2, (Object) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        SnapFlingBehavior q = SnapFlingBehaviorKt.m9628q((C2218e) N, oVar, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return q;
    }
}
