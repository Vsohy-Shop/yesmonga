package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.C2192e;
import androidx.compose.foundation.gestures.C2193f;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1508:1\n76#2:1509\n102#2,2:1510\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDraggableState\n*L\n1435#1:1509\n1435#1:1510,2\n*E\n"})
public final class SliderDraggableState implements C2193f {
    @C12579k

    /* renamed from: a */
    public final C11300l<Float, C11079d2> f19663a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f19664b = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: c */
    public final C2192e f19665c = new C8092a(this);
    @C12579k

    /* renamed from: d */
    public final MutatorMutex f19666d = new MutatorMutex();

    /* renamed from: androidx.compose.material3.SliderDraggableState$a */
    public static final class C8092a implements C2192e {

        /* renamed from: a */
        public final /* synthetic */ SliderDraggableState f19667a;

        public C8092a(SliderDraggableState sliderDraggableState) {
            this.f19667a = sliderDraggableState;
        }

        /* renamed from: a */
        public void mo7352a(float f) {
            this.f19667a.mo11884g().invoke(Float.valueOf(f));
        }
    }

    public SliderDraggableState(@C12579k C11300l<? super Float, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onDelta");
        this.f19663a = lVar;
    }

    /* renamed from: b */
    public void mo7349b(float f) {
        this.f19663a.invoke(Float.valueOf(f));
    }

    @C12580l
    /* renamed from: d */
    public Object mo7350d(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2192e, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new SliderDraggableState$drag$2(this, mutatePriority, pVar, (C11045c<? super SliderDraggableState$drag$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: g */
    public final C11300l<Float, C11079d2> mo11884g() {
        return this.f19663a;
    }

    /* renamed from: h */
    public final boolean mo11885h() {
        return ((Boolean) this.f19664b.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final void mo11886i(boolean z) {
        this.f19664b.setValue(Boolean.valueOf(z));
    }
}
