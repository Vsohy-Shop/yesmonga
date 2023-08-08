package androidx.compose.material;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p004ui.util.C16515d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/semantics/q;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/ui/semantics/q;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SliderKt$sliderSemantics$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ float $coerced;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11300l<Float, C11079d2> $onValueChange;
    final /* synthetic */ C11289a<C11079d2> $onValueChangeFinished;
    final /* synthetic */ int $steps;
    final /* synthetic */ C11457f<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderSemantics$1(boolean z, C11457f<Float> fVar, int i, float f, C11300l<? super Float, C11079d2> lVar, C11289a<C11079d2> aVar) {
        super(1);
        this.$enabled = z;
        this.$valueRange = fVar;
        this.$steps = i;
        this.$coerced = f;
        this.$onValueChange = lVar;
        this.$onValueChangeFinished = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        if (!this.$enabled) {
            SemanticsPropertiesKt.m72020j(qVar);
        }
        final C11457f<Float> fVar = this.$valueRange;
        final int i = this.$steps;
        final float f = this.$coerced;
        final C11300l<Float, C11079d2> lVar = this.$onValueChange;
        final C11289a<C11079d2> aVar = this.$onValueChangeFinished;
        SemanticsPropertiesKt.m71977P0(qVar, (String) null, new C11300l<Float, Boolean>() {
            @C12579k
            /* renamed from: a */
            public final Boolean mo10418a(float f) {
                boolean z;
                int i;
                float H = C11479u.m44331H(f, fVar.getStart().floatValue(), fVar.mo23013q().floatValue());
                int i2 = i;
                boolean z2 = false;
                if (i2 > 0 && (i = i2 + 1) >= 0) {
                    float f2 = H;
                    float f3 = f2;
                    int i3 = 0;
                    while (true) {
                        float a = C16515d.m74781a(fVar.getStart().floatValue(), fVar.mo23013q().floatValue(), ((float) i3) / ((float) (i + 1)));
                        float f4 = a - H;
                        if (Math.abs(f4) <= f2) {
                            f2 = Math.abs(f4);
                            f3 = a;
                        }
                        if (i3 == i) {
                            break;
                        }
                        i3++;
                    }
                    H = f3;
                }
                if (H == f) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    lVar.invoke(Float.valueOf(H));
                    C11289a<C11079d2> aVar = aVar;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo10418a(((Number) obj).floatValue());
            }
        }, 1, (Object) null);
    }
}
