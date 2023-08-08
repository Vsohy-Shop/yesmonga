package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.runtime.C8700z0;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$SliderImpl$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1508:1\n223#2,2:1509\n223#2,2:1511\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$SliderImpl$2\n*L\n588#1:1509,2\n592#1:1511,2\n*E\n"})
public final class SliderKt$SliderImpl$2 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ C8700z0<Float> f19689a;

    /* renamed from: b */
    public final /* synthetic */ C8700z0<Integer> f19690b;

    /* renamed from: c */
    public final /* synthetic */ float f19691c;

    public SliderKt$SliderImpl$2(C8700z0<Float> z0Var, C8700z0<Integer> z0Var2, float f) {
        this.f19689a = z0Var;
        this.f19690b = z0Var2;
        this.f19691c = f;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        boolean z;
        boolean z2;
        List<? extends C15557e0> list2 = list;
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<C15557e0> iterable = list2;
        for (C15557e0 e0Var : iterable) {
            if (C15594q.m69317a(e0Var) == SliderComponents.THUMB) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C15611w0 t0 = e0Var.mo44324t0(j);
                for (C15557e0 e0Var2 : iterable) {
                    if (C15594q.m69317a(e0Var2) == SliderComponents.TRACK) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        C15611w0 t02 = e0Var2.mo44324t0(C16476b.m74351e(C16478c.m74385j(j, -t0.mo44471K0(), 0, 2, (Object) null), 0, 0, 0, 0, 11, (Object) null));
                        int K0 = t02.mo44471K0() + t0.mo44471K0();
                        int max = Math.max(t02.mo44468G0(), t0.mo44468G0());
                        this.f19689a.setValue(Float.valueOf((float) t0.mo44471K0()));
                        this.f19690b.setValue(Integer.valueOf(K0));
                        return C15568h0.m69206r2(h0Var, K0, max, (Map) null, new SliderKt$SliderImpl$2$measure$1(t02, t0.mo44471K0() / 2, (max - t02.mo44468G0()) / 2, t0, C11409d.m43851L0(((float) t02.mo44471K0()) * this.f19691c), (max - t0.mo44468G0()) / 2), 4, (Object) null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            long j2 = j;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
