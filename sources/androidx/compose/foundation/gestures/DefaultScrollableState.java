package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DefaultScrollableState implements C2203n {
    @C12579k

    /* renamed from: a */
    public final C11300l<Float, Float> f5849a;
    @C12579k

    /* renamed from: b */
    public final C2201l f5850b = new C2136a(this);
    @C12579k

    /* renamed from: c */
    public final MutatorMutex f5851c = new MutatorMutex();
    @C12579k

    /* renamed from: d */
    public final C8700z0<Boolean> f5852d = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);

    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$a */
    public static final class C2136a implements C2201l {

        /* renamed from: a */
        public final /* synthetic */ DefaultScrollableState f5853a;

        public C2136a(DefaultScrollableState defaultScrollableState) {
            this.f5853a = defaultScrollableState;
        }

        /* renamed from: a */
        public float mo7360a(float f) {
            return this.f5853a.mo7359l().invoke(Float.valueOf(f)).floatValue();
        }
    }

    public DefaultScrollableState(@C12579k C11300l<? super Float, Float> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onDelta");
        this.f5849a = lVar;
    }

    /* renamed from: b */
    public float mo7250b(float f) {
        return this.f5849a.invoke(Float.valueOf(f)).floatValue();
    }

    /* renamed from: e */
    public boolean mo7251e() {
        return this.f5852d.getValue().booleanValue();
    }

    @C12580l
    /* renamed from: g */
    public Object mo7253g(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new DefaultScrollableState$scroll$2(this, mutatePriority, pVar, (C11045c<? super DefaultScrollableState$scroll$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: l */
    public final C11300l<Float, Float> mo7359l() {
        return this.f5849a;
    }
}
