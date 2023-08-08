package androidx.compose.material3;

import androidx.compose.animation.core.C1968g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
public final class DrawerState {
    @C12579k

    /* renamed from: b */
    public static final Companion f19379b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f19380c = 0;
    @C12579k

    /* renamed from: a */
    public final SwipeableState<DrawerValue> f19381a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<DrawerState, DrawerValue> mo11521a(@C12579k C11300l<? super DrawerValue, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
            return SaverKt.m31375a(DrawerState$Companion$Saver$1.f19383f, new DrawerState$Companion$Saver$2(lVar));
        }

        public Companion() {
        }
    }

    public DrawerState(@C12579k DrawerValue drawerValue, @C12579k C11300l<? super DrawerValue, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(drawerValue, "initialValue");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        this.f19381a = new SwipeableState<>(drawerValue, NavigationDrawerKt.f19507c, lVar);
    }

    /* renamed from: d */
    public static /* synthetic */ void m25709d() {
    }

    /* renamed from: f */
    public static /* synthetic */ void m25710f() {
    }

    /* renamed from: h */
    public static /* synthetic */ void m25711h() {
    }

    /* renamed from: j */
    public static /* synthetic */ void m25712j() {
    }

    /* renamed from: l */
    public static /* synthetic */ void m25713l() {
    }

    @C12580l
    /* renamed from: a */
    public final Object mo11509a(@C12579k DrawerValue drawerValue, @C12579k C1968g<Float> gVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object j = this.f19381a.mo12053j(drawerValue, gVar, cVar);
        return j == C11063b.m42612h() ? j : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo11510b(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo11509a(DrawerValue.Closed, NavigationDrawerKt.f19507c, cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: c */
    public final DrawerValue mo11511c() {
        return this.f19381a.mo12058p();
    }

    @C12579k
    /* renamed from: e */
    public final C8578k2<Float> mo11512e() {
        return this.f19381a.mo12063v();
    }

    @C12579k
    /* renamed from: g */
    public final SwipeableState<DrawerValue> mo11513g() {
        return this.f19381a;
    }

    @C12579k
    /* renamed from: i */
    public final DrawerValue mo11514i() {
        return this.f19381a.mo12035A();
    }

    /* renamed from: k */
    public final boolean mo11515k() {
        return this.f19381a.mo12038E();
    }

    /* renamed from: m */
    public final boolean mo11516m() {
        return mo11511c() == DrawerValue.Closed;
    }

    /* renamed from: n */
    public final boolean mo11517n() {
        return mo11511c() == DrawerValue.Open;
    }

    @C12580l
    /* renamed from: o */
    public final Object mo11518o(@C12579k C11045c<? super C11079d2> cVar) {
        Object a = mo11509a(DrawerValue.Open, NavigationDrawerKt.f19507c, cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: p */
    public final Object mo11519p(@C12579k DrawerValue drawerValue, @C12579k C11045c<? super C11079d2> cVar) {
        Object R = this.f19381a.mo12051R(drawerValue, cVar);
        return R == C11063b.m42612h() ? R : C11079d2.f28267a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrawerState(DrawerValue drawerValue, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? C80151.f19382f : lVar);
    }
}
