package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material3.tokens.C8306g1;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15594q;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$ClockFace$2 extends Lambda implements C11305q<List<? extends Integer>, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ C8212h3 $colors;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockFace$2(TimePickerState timePickerState, boolean z, C8212h3 h3Var, int i) {
        super(3);
        this.$state = timePickerState;
        this.$autoSwitchToMinute = z;
        this.$colors = h3Var;
        this.$$dirty = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo12273a(@C12579k List<Integer> list, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(list, "screen");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1628166511, i, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1140)");
        }
        C8767m V = TimePickerKt.m26754j0(SizeKt.m10087C(TimePickerKt.m26750h0(C8767m.f23478j, this.$state, this.$autoSwitchToMinute), C8306g1.f21226a.mo13630b()), this.$state, this.$colors);
        float c0 = TimePickerKt.f19896f;
        final C8212h3 h3Var = this.$colors;
        final TimePickerState timePickerState = this.$state;
        final boolean z = this.$autoSwitchToMinute;
        final int i2 = this.$$dirty;
        final List<Integer> list2 = list;
        TimePickerKt.m26735a(V, c0, C8553b.m31048b(oVar, -1385633737, true, new C11304p<C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((C8592o) obj, ((Number) obj2).intValue());
                return C11079d2.f28267a;
            }

            @C8540g
            @C8570j(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(@C12580l C8592o oVar, int i) {
                if ((i & 11) != 2 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(-1385633737, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1147)");
                    }
                    C8572j1[] j1VarArr = {ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(h3Var.mo12637a(false)))};
                    final List<Integer> list = list2;
                    final TimePickerState timePickerState = timePickerState;
                    final boolean z = z;
                    final int i2 = i2;
                    CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, -2018362505, true, new C11304p<C8592o, Integer, C11079d2>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((C8592o) obj, ((Number) obj2).intValue());
                            return C11079d2.f28267a;
                        }

                        @C8540g
                        @C8570j(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(@C12580l C8592o oVar, int i) {
                            int i2;
                            if ((i & 11) != 2 || !oVar.mo15011p()) {
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29845w0(-2018362505, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1150)");
                                }
                                oVar.mo14918M(-504302349);
                                int size = list.size();
                                TimePickerState timePickerState = timePickerState;
                                List<Integer> list = list;
                                boolean z = z;
                                int i3 = i2;
                                for (int i4 = 0; i4 < size; i4++) {
                                    if (!timePickerState.mo12355p() || C8241l2.m27284f(timePickerState.mo12351l(), C8241l2.f20286b.mo12785b())) {
                                        i2 = list.get(i4).intValue();
                                    } else {
                                        i2 = list.get(i4).intValue() % 12;
                                    }
                                    TimePickerKt.m26741d(timePickerState, i2, z, oVar, (i3 & 14) | (i3 & 896));
                                }
                                oVar.mo15002m0();
                                if (C8241l2.m27284f(timePickerState.mo12351l(), C8241l2.f20286b.mo12784a()) && timePickerState.mo12355p()) {
                                    C8767m c = BackgroundKt.m8824c(SizeKt.m10087C(C15594q.m69318b(C8767m.f23478j, LayoutId.InnerCircle), C8306g1.f21226a.mo13630b()), C15240j2.f37547b.mo42850s(), C2694o.m12169k());
                                    float Z = TimePickerKt.f19897g;
                                    final TimePickerState timePickerState2 = timePickerState;
                                    final boolean z2 = z;
                                    final int i5 = i2;
                                    TimePickerKt.m26735a(c, Z, C8553b.m31048b(oVar, -448649404, true, new C11304p<C8592o, Integer, C11079d2>() {
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((C8592o) obj, ((Number) obj2).intValue());
                                            return C11079d2.f28267a;
                                        }

                                        @C8540g
                                        @C8570j(applier = "androidx.compose.ui.UiComposable")
                                        public final void invoke(@C12580l C8592o oVar, int i) {
                                            if ((i & 11) != 2 || !oVar.mo15011p()) {
                                                if (ComposerKt.m29813g0()) {
                                                    ComposerKt.m29845w0(-448649404, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1167)");
                                                }
                                                int size = TimePickerKt.f19907q.size();
                                                TimePickerState timePickerState = timePickerState2;
                                                boolean z = z2;
                                                int i2 = i5;
                                                for (int i3 = 0; i3 < size; i3++) {
                                                    TimePickerKt.m26741d(timePickerState, ((Number) TimePickerKt.f19907q.get(i3)).intValue(), z, oVar, (i2 & 14) | (i2 & 896));
                                                }
                                                if (ComposerKt.m29813g0()) {
                                                    ComposerKt.m29843v0();
                                                    return;
                                                }
                                                return;
                                            }
                                            oVar.mo14958a0();
                                        }
                                    }), oVar, 432, 0);
                                }
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29843v0();
                                    return;
                                }
                                return;
                            }
                            oVar.mo14958a0();
                        }
                    }), oVar, 56);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }
        }), oVar, 432, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo12273a((List) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
