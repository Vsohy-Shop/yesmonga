package androidx.compose.material.pullrefresh;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class PullRefreshKt$pullRefresh$2$2 extends AdaptedFunctionReference implements C11304p<Float, C11045c<? super Float>, Object>, C11074j {
    public PullRefreshKt$pullRefresh$2$2(Object obj) {
        super(2, obj, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
    }

    @C12580l
    /* renamed from: b */
    public final Object mo10928b(float f, @C12579k C11045c<? super Float> cVar) {
        return C11064a.m42619e(((PullRefreshState) this.receiver).mo10942r(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo10928b(((Number) obj).floatValue(), (C11045c) obj2);
    }
}
