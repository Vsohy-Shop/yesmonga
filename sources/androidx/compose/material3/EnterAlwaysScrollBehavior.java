package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class EnterAlwaysScrollBehavior implements C8275r3 {
    @C12579k

    /* renamed from: a */
    public final TopAppBarState f19391a;
    @C12580l

    /* renamed from: b */
    public final C1968g<Float> f19392b;
    @C12580l

    /* renamed from: c */
    public final C2013v<Float> f19393c;
    @C12579k

    /* renamed from: d */
    public final C11289a<Boolean> f19394d;

    /* renamed from: e */
    public final boolean f19395e;
    @C12579k

    /* renamed from: f */
    public C15446a f19396f;

    public EnterAlwaysScrollBehavior(@C12579k TopAppBarState topAppBarState, @C12580l C1968g<Float> gVar, @C12580l C2013v<Float> vVar, @C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(topAppBarState, "state");
        Intrinsics.checkNotNullParameter(aVar, "canScroll");
        this.f19391a = topAppBarState;
        this.f19392b = gVar;
        this.f19393c = vVar;
        this.f19394d = aVar;
        this.f19396f = new EnterAlwaysScrollBehavior$nestedScrollConnection$1(this);
    }

    @C12579k
    /* renamed from: a */
    public C15446a mo11535a() {
        return this.f19396f;
    }

    /* renamed from: b */
    public boolean mo11536b() {
        return this.f19395e;
    }

    @C12580l
    /* renamed from: c */
    public C2013v<Float> mo11537c() {
        return this.f19393c;
    }

    @C12580l
    /* renamed from: d */
    public C1968g<Float> mo11538d() {
        return this.f19392b;
    }

    @C12579k
    /* renamed from: e */
    public final C11289a<Boolean> mo11539e() {
        return this.f19394d;
    }

    /* renamed from: f */
    public void mo11540f(@C12579k C15446a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f19396f = aVar;
    }

    @C12579k
    public TopAppBarState getState() {
        return this.f19391a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EnterAlwaysScrollBehavior(TopAppBarState topAppBarState, C1968g gVar, C2013v vVar, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(topAppBarState, gVar, vVar, (i & 8) != 0 ? C80171.f19397f : aVar);
    }
}
