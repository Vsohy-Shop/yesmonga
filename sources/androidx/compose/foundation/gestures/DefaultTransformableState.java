package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DefaultTransformableState implements C2211q {
    @C12579k

    /* renamed from: a */
    public final C11305q<Float, C15094f, Float, C11079d2> f5854a;
    @C12579k

    /* renamed from: b */
    public final C2209p f5855b = new C2138a(this);
    @C12579k

    /* renamed from: c */
    public final MutatorMutex f5856c = new MutatorMutex();
    @C12579k

    /* renamed from: d */
    public final C8700z0<Boolean> f5857d = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);

    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$a */
    public static final class C2138a implements C2209p {

        /* renamed from: a */
        public final /* synthetic */ DefaultTransformableState f5858a;

        public C2138a(DefaultTransformableState defaultTransformableState) {
            this.f5858a = defaultTransformableState;
        }

        /* renamed from: a */
        public void mo7366a(float f, long j, float f2) {
            this.f5858a.mo7365g().invoke(Float.valueOf(f), C15094f.m64868d(j), Float.valueOf(f2));
        }
    }

    public DefaultTransformableState(@C12579k C11305q<? super Float, ? super C15094f, ? super Float, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "onTransformation");
        this.f5854a = qVar;
    }

    /* renamed from: b */
    public boolean mo7363b() {
        return this.f5857d.getValue().booleanValue();
    }

    @C12580l
    /* renamed from: c */
    public Object mo7364c(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2209p, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new DefaultTransformableState$transform$2(this, mutatePriority, pVar, (C11045c<? super DefaultTransformableState$transform$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: g */
    public final C11305q<Float, C15094f, Float, C11079d2> mo7365g() {
        return this.f5854a;
    }
}
