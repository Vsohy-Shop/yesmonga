package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2013v;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ExitUntilCollapsedScrollBehavior implements C8275r3 {
    @C12579k

    /* renamed from: a */
    public final TopAppBarState f19399a;
    @C12580l

    /* renamed from: b */
    public final C1968g<Float> f19400b;
    @C12580l

    /* renamed from: c */
    public final C2013v<Float> f19401c;
    @C12579k

    /* renamed from: d */
    public final C11289a<Boolean> f19402d;

    /* renamed from: e */
    public final boolean f19403e;
    @C12579k

    /* renamed from: f */
    public C15446a f19404f;

    public ExitUntilCollapsedScrollBehavior(@C12579k TopAppBarState topAppBarState, @C12580l C1968g<Float> gVar, @C12580l C2013v<Float> vVar, @C12579k C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(topAppBarState, "state");
        Intrinsics.checkNotNullParameter(aVar, "canScroll");
        this.f19399a = topAppBarState;
        this.f19400b = gVar;
        this.f19401c = vVar;
        this.f19402d = aVar;
        this.f19404f = new ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(this);
    }

    @C12579k
    /* renamed from: a */
    public C15446a mo11535a() {
        return this.f19404f;
    }

    /* renamed from: b */
    public boolean mo11536b() {
        return this.f19403e;
    }

    @C12580l
    /* renamed from: c */
    public C2013v<Float> mo11537c() {
        return this.f19401c;
    }

    @C12580l
    /* renamed from: d */
    public C1968g<Float> mo11538d() {
        return this.f19400b;
    }

    @C12579k
    /* renamed from: e */
    public final C11289a<Boolean> mo11542e() {
        return this.f19402d;
    }

    /* renamed from: f */
    public void mo11543f(@C12579k C15446a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f19404f = aVar;
    }

    @C12579k
    public TopAppBarState getState() {
        return this.f19399a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, C1968g gVar, C2013v vVar, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(topAppBarState, gVar, vVar, (i & 8) != 0 ? C80181.f19405f : aVar);
    }
}
