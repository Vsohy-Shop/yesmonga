package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DefaultDraggableState implements C2193f {
    @C12579k

    /* renamed from: a */
    public final C11300l<Float, C11079d2> f5842a;
    @C12579k

    /* renamed from: b */
    public final C2192e f5843b = new C2134a(this);
    @C12579k

    /* renamed from: c */
    public final MutatorMutex f5844c = new MutatorMutex();

    /* renamed from: androidx.compose.foundation.gestures.DefaultDraggableState$a */
    public static final class C2134a implements C2192e {

        /* renamed from: a */
        public final /* synthetic */ DefaultDraggableState f5845a;

        public C2134a(DefaultDraggableState defaultDraggableState) {
            this.f5845a = defaultDraggableState;
        }

        /* renamed from: a */
        public void mo7352a(float f) {
            this.f5845a.mo7351f().invoke(Float.valueOf(f));
        }
    }

    public DefaultDraggableState(@C12579k C11300l<? super Float, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onDelta");
        this.f5842a = lVar;
    }

    /* renamed from: b */
    public void mo7349b(float f) {
        this.f5842a.invoke(Float.valueOf(f));
    }

    @C12580l
    /* renamed from: d */
    public Object mo7350d(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2192e, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new DefaultDraggableState$drag$2(this, mutatePriority, pVar, (C11045c<? super DefaultDraggableState$drag$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: f */
    public final C11300l<Float, C11079d2> mo7351f() {
        return this.f5842a;
    }
}
