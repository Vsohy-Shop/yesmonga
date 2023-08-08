package androidx.compose.material.pullrefresh;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class PullRefreshKt$pullRefresh$2$1 extends FunctionReferenceImpl implements C11300l<Float, Float> {
    public PullRefreshKt$pullRefresh$2$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
    }

    @C12579k
    /* renamed from: d */
    public final Float mo10927d(float f) {
        return Float.valueOf(((PullRefreshState) this.receiver).mo10941q(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo10927d(((Number) obj).floatValue());
    }
}
