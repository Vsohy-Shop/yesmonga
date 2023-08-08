package androidx.activity.compose;

import androidx.activity.C0251r;
import androidx.activity.C0308s;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.EffectsKt;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ReportDrawnKt {
    @C8540g
    /* renamed from: a */
    public static final void m1300a(@C12580l C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1357012904);
        if (i != 0 || !o.mo15011p()) {
            m1302c(ReportDrawnKt$ReportDrawn$1.f723f, o, 6);
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ReportDrawnKt$ReportDrawn$2(i));
        }
    }

    @C8540g
    /* renamed from: b */
    public static final void m1301b(@C12579k C11300l<? super C11045c<? super C11079d2>, ? extends Object> lVar, @C12580l C8592o oVar, int i) {
        C0251r c;
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C8592o o = oVar.mo15009o(945311272);
        C0308s a = LocalFullyDrawnReporterOwner.f710a.mo798a(o, 6);
        if (a == null || (c = a.mo704c()) == null) {
            C8678t1 s = o.mo15020s();
            if (s != null) {
                s.mo15202a(new ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1(lVar, i));
                return;
            }
            return;
        }
        EffectsKt.m29895g(lVar, c, new ReportDrawnKt$ReportDrawnAfter$1(c, lVar, (C11045c<? super ReportDrawnKt$ReportDrawnAfter$1>) null), o, 584);
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new ReportDrawnKt$ReportDrawnAfter$2(lVar, i));
        }
    }

    @C8540g
    /* renamed from: c */
    public static final void m1302c(@C12579k C11289a<Boolean> aVar, @C12580l C8592o oVar, int i) {
        int i2;
        C0251r c;
        int i3;
        Intrinsics.checkNotNullParameter(aVar, "predicate");
        C8592o o = oVar.mo15009o(-2047119994);
        if ((i & 14) == 0) {
            if (o.mo15006n0(aVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            C0308s a = LocalFullyDrawnReporterOwner.f710a.mo798a(o, 6);
            if (a == null || (c = a.mo704c()) == null) {
                C8678t1 s = o.mo15020s();
                if (s != null) {
                    s.mo15202a(new ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(aVar, i));
                    return;
                }
                return;
            }
            EffectsKt.m29890b(c, aVar, new ReportDrawnKt$ReportDrawnWhen$1(c, aVar), o, ((i2 << 3) & 112) | 8);
        } else {
            o.mo14958a0();
        }
        C8678t1 s2 = o.mo15020s();
        if (s2 != null) {
            s2.mo15202a(new ReportDrawnKt$ReportDrawnWhen$2(aVar, i));
        }
    }
}
