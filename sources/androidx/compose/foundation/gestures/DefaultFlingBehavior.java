package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C2013v;
import androidx.compose.p004ui.C8773n;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11965h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class DefaultFlingBehavior implements C2195g {
    @C12579k

    /* renamed from: a */
    public final C2013v<Float> f5846a;
    @C12579k

    /* renamed from: b */
    public final C8773n f5847b;

    /* renamed from: c */
    public int f5848c;

    public DefaultFlingBehavior(@C12579k C2013v<Float> vVar, @C12579k C8773n nVar) {
        Intrinsics.checkNotNullParameter(vVar, "flingDecay");
        Intrinsics.checkNotNullParameter(nVar, "motionDurationScale");
        this.f5846a = vVar;
        this.f5847b = nVar;
    }

    @C12580l
    /* renamed from: a */
    public Object mo7354a(@C12579k C2201l lVar, float f, @C12579k C11045c<? super Float> cVar) {
        this.f5848c = 0;
        return C11965h.m47673h(this.f5847b, new DefaultFlingBehavior$performFling$2(f, this, lVar, (C11045c<? super DefaultFlingBehavior$performFling$2>) null), cVar);
    }

    /* renamed from: c */
    public final int mo7355c() {
        return this.f5848c;
    }

    /* renamed from: d */
    public final void mo7356d(int i) {
        this.f5848c = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultFlingBehavior(C2013v vVar, C8773n nVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, (i & 2) != 0 ? ScrollableKt.m9381f() : nVar);
    }
}
