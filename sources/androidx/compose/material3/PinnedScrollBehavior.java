package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PinnedScrollBehavior implements C8275r3 {
    @C12579k

    /* renamed from: a */
    public final TopAppBarState f19548a;
    @C12579k

    /* renamed from: b */
    public final C11289a<Boolean> f19549b;

    /* renamed from: c */
    public final boolean f19550c;
    @C12580l

    /* renamed from: d */
    public final C1968g<Float> f19551d;
    @C12580l

    /* renamed from: e */
    public final C2013v<Float> f19552e;
    @C12579k

    /* renamed from: f */
    public C15446a f19553f;

    /* renamed from: androidx.compose.material3.PinnedScrollBehavior$a */
    public static final class C8083a implements C15446a {

        /* renamed from: a */
        public final /* synthetic */ PinnedScrollBehavior f19555a;

        public C8083a(PinnedScrollBehavior pinnedScrollBehavior) {
            this.f19555a = pinnedScrollBehavior;
        }

        /* renamed from: g */
        public long mo7456g(long j, long j2, int i) {
            boolean z;
            if (!this.f19555a.mo11777e().invoke().booleanValue()) {
                return C15094f.f37256b.mo42248e();
            }
            if (C15094f.m64882r(j) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z || C15094f.m64882r(j2) <= 0.0f) {
                TopAppBarState state = this.f19555a.getState();
                state.mo12416g(state.mo12412c() + C15094f.m64882r(j));
            } else {
                this.f19555a.getState().mo12416g(0.0f);
            }
            return C15094f.f37256b.mo42248e();
        }
    }

    public PinnedScrollBehavior(@C12579k TopAppBarState topAppBarState, @C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(topAppBarState, "state");
        Intrinsics.checkNotNullParameter(aVar, "canScroll");
        this.f19548a = topAppBarState;
        this.f19549b = aVar;
        this.f19550c = true;
        this.f19553f = new C8083a(this);
    }

    @C12579k
    /* renamed from: a */
    public C15446a mo11535a() {
        return this.f19553f;
    }

    /* renamed from: b */
    public boolean mo11536b() {
        return this.f19550c;
    }

    @C12580l
    /* renamed from: c */
    public C2013v<Float> mo11537c() {
        return this.f19552e;
    }

    @C12580l
    /* renamed from: d */
    public C1968g<Float> mo11538d() {
        return this.f19551d;
    }

    @C12579k
    /* renamed from: e */
    public final C11289a<Boolean> mo11777e() {
        return this.f19549b;
    }

    /* renamed from: f */
    public void mo11778f(@C12579k C15446a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f19553f = aVar;
    }

    @C12579k
    public TopAppBarState getState() {
        return this.f19548a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PinnedScrollBehavior(TopAppBarState topAppBarState, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(topAppBarState, (i & 2) != 0 ? C80821.f19554f : aVar);
    }
}
