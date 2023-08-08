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
import kotlin.jvm.internal.Ref;
import kotlin.math.C11409d;
import kotlin.ranges.C11457f;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$RangeSliderImpl$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1508:1\n223#2,2:1509\n223#2,2:1511\n223#2,2:1513\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$RangeSliderImpl$2\n*L\n781#1:1509,2\n787#1:1511,2\n793#1:1513,2\n*E\n"})
public final class SliderKt$RangeSliderImpl$2 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ Ref.ObjectRef<C8700z0<Boolean>> f19679a;

    /* renamed from: b */
    public final /* synthetic */ C8700z0<Float> f19680b;

    /* renamed from: c */
    public final /* synthetic */ C11457f<Float> f19681c;

    /* renamed from: d */
    public final /* synthetic */ C8700z0<Float> f19682d;

    /* renamed from: e */
    public final /* synthetic */ float f19683e;

    /* renamed from: f */
    public final /* synthetic */ float f19684f;

    /* renamed from: g */
    public final /* synthetic */ C8700z0<Float> f19685g;

    /* renamed from: h */
    public final /* synthetic */ C8700z0<Float> f19686h;

    /* renamed from: i */
    public final /* synthetic */ C8700z0<Integer> f19687i;

    /* renamed from: j */
    public final /* synthetic */ C11457f<Float> f19688j;

    public SliderKt$RangeSliderImpl$2(Ref.ObjectRef<C8700z0<Boolean>> objectRef, C8700z0<Float> z0Var, C11457f<Float> fVar, C8700z0<Float> z0Var2, float f, float f2, C8700z0<Float> z0Var3, C8700z0<Float> z0Var4, C8700z0<Integer> z0Var5, C11457f<Float> fVar2) {
        this.f19679a = objectRef;
        this.f19680b = z0Var;
        this.f19681c = fVar;
        this.f19682d = z0Var2;
        this.f19683e = f;
        this.f19684f = f2;
        this.f19685g = z0Var3;
        this.f19686h = z0Var4;
        this.f19687i = z0Var5;
        this.f19688j = fVar2;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        List<? extends C15557e0> list2 = list;
        long j2 = j;
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list2, "measurables");
        Iterable<C15557e0> iterable = list2;
        for (C15557e0 e0Var : iterable) {
            if (C15594q.m69317a(e0Var) == RangeSliderComponents.STARTTHUMB) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                C15611w0 t0 = e0Var.mo44324t0(j2);
                for (C15557e0 e0Var2 : iterable) {
                    if (C15594q.m69317a(e0Var2) == RangeSliderComponents.ENDTHUMB) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        C15611w0 t02 = e0Var2.mo44324t0(j2);
                        for (C15557e0 e0Var3 : iterable) {
                            if (C15594q.m69317a(e0Var3) == RangeSliderComponents.TRACK) {
                                z3 = true;
                                continue;
                            } else {
                                z3 = false;
                                continue;
                            }
                            if (z3) {
                                C15611w0 t03 = e0Var3.mo44324t0(C16476b.m74351e(C16478c.m74385j(j, (-(t0.mo44471K0() + t02.mo44471K0())) / 2, 0, 2, (Object) null), 0, 0, 0, 0, 11, (Object) null));
                                int K0 = t03.mo44471K0() + ((t0.mo44471K0() + t02.mo44471K0()) / 2);
                                int max = Math.max(t03.mo44468G0(), Math.max(t0.mo44468G0(), t02.mo44468G0()));
                                SliderKt.m26209e(this.f19685g, (float) t0.mo44471K0());
                                SliderKt.m26211g(this.f19686h, (float) t02.mo44471K0());
                                SliderKt.m26213i(this.f19687i, K0);
                                if (!((Boolean) ((C8700z0) this.f19679a.element).getValue()).booleanValue()) {
                                    float f = (float) 2;
                                    float max2 = Math.max(((float) SliderKt.m26212h(this.f19687i)) - (SliderKt.m26210f(this.f19686h) / f), 0.0f);
                                    float min = Math.min(SliderKt.m26208d(this.f19685g) / f, max2);
                                    this.f19680b.setValue(Float.valueOf(SliderKt.m26214j(this.f19688j, min, max2, this.f19681c.getStart().floatValue())));
                                    this.f19682d.setValue(Float.valueOf(SliderKt.m26214j(this.f19688j, min, max2, this.f19681c.mo23013q().floatValue())));
                                    ((C8700z0) this.f19679a.element).setValue(Boolean.TRUE);
                                }
                                return C15568h0.m69206r2(h0Var, K0, max, (Map) null, new SliderKt$RangeSliderImpl$2$measure$1(t03, t0.mo44471K0() / 2, (max - t03.mo44468G0()) / 2, t0, C11409d.m43851L0(((float) t03.mo44471K0()) * this.f19683e), (max - t0.mo44468G0()) / 2, t02, C11409d.m43851L0((((float) t03.mo44471K0()) * this.f19684f) + ((SliderKt.m26208d(this.f19685g) - SliderKt.m26210f(this.f19686h)) / ((float) 2))), (max - t02.mo44468G0()) / 2), 4, (Object) null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
