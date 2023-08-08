package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TimePickerKt$ClockText$2 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ C8700z0<C15094f> $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2(boolean z, C12074o0 o0Var, TimePickerState timePickerState, float f, boolean z2, C8700z0<C15094f> z0Var) {
        super(1);
        this.$selected = z;
        this.$scope = o0Var;
        this.$state = timePickerState;
        this.$maxDist = f;
        this.$autoSwitchToMinute = z2;
        this.$center$delegate = z0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        final C12074o0 o0Var = this.$scope;
        final TimePickerState timePickerState = this.$state;
        final float f = this.$maxDist;
        final boolean z = this.$autoSwitchToMinute;
        final C8700z0<C15094f> z0Var = this.$center$delegate;
        SemanticsPropertiesKt.m72017h0(qVar, (String) null, new C11289a<Boolean>() {

            @C11067d(mo22501c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1", mo22502f = "TimePicker.kt", mo22503i = {}, mo22504l = {1318}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
            @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
            /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1 */
            public static final class C81441 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
                int label;

                @C12579k
                public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                    return new C81441(timePickerState, f, z, z0Var, cVar);
                }

                @C12580l
                public final Object invokeSuspend(@C12579k Object obj) {
                    Object h = C11063b.m42612h();
                    int i = this.label;
                    if (i == 0) {
                        C11661u0.m45747n(obj);
                        TimePickerState timePickerState = timePickerState;
                        float p = C15094f.m64880p(TimePickerKt.m26743e(z0Var));
                        float r = C15094f.m64882r(TimePickerKt.m26743e(z0Var));
                        float f = f;
                        boolean z = z;
                        this.label = 1;
                        if (timePickerState.mo12362w(p, r, f, z, this) == h) {
                            return h;
                        }
                    } else if (i == 1) {
                        C11661u0.m45747n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C11079d2.f28267a;
                }

                @C12580l
                public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
                    return ((C81441) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                }
            }

            @C12579k
            public final Boolean invoke() {
                C12074o0 o0Var = o0Var;
                final TimePickerState timePickerState = timePickerState;
                final float f = f;
                final boolean z = z;
                final C8700z0<C15094f> z0Var = z0Var;
                C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C81441((C11045c<? super C81441>) null), 3, (Object) null);
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
        SemanticsPropertiesKt.m71983S0(qVar, this.$selected);
    }
}
