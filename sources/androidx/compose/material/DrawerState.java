package androidx.compose.material;

import androidx.compose.animation.core.C1968g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
public final class DrawerState {
    @C12579k

    /* renamed from: b */
    public static final Companion f7650b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f7651c = 0;
    @C12579k

    /* renamed from: a */
    public final SwipeableV2State<DrawerValue> f7652a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<DrawerState, DrawerValue> mo10183a(@C12579k C11300l<? super DrawerValue, Boolean> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
            return SaverKt.m31375a(DrawerState$Companion$Saver$1.f7654f, new DrawerState$Companion$Saver$2(lVar));
        }

        public Companion() {
        }
    }

    public DrawerState(@C12579k DrawerValue drawerValue, @C12579k C11300l<? super DrawerValue, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(drawerValue, "initialValue");
        Intrinsics.checkNotNullParameter(lVar, "confirmStateChange");
        this.f7652a = new SwipeableV2State(drawerValue, DrawerKt.f7646c, lVar, (C11304p) null, DrawerKt.f7645b, 8, (DefaultConstructorMarker) null);
    }

    @C3044g0
    /* renamed from: e */
    public static /* synthetic */ void m13466e() {
    }

    @C3044g0
    /* renamed from: h */
    public static /* synthetic */ void m13467h() {
    }

    @C11395k(level = DeprecationLevel.f28050b, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @C12580l
    @C3044g0
    /* renamed from: a */
    public final Object mo10170a(@C12579k DrawerValue drawerValue, @C12579k C1968g<Float> gVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = SwipeableV2State.m14015g(this.f7652a, drawerValue, 0.0f, cVar, 2, (Object) null);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo10171b(@C12579k C11045c<? super C11079d2> cVar) {
        Object g = SwipeableV2State.m14015g(this.f7652a, DrawerValue.Closed, 0.0f, cVar, 2, (Object) null);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: c */
    public final DrawerValue mo10172c() {
        return this.f7652a.mo10562n();
    }

    @C12580l
    @C3044g0
    /* renamed from: d */
    public final Float mo10173d() {
        return this.f7652a.mo10568t();
    }

    @C12579k
    /* renamed from: f */
    public final SwipeableV2State<DrawerValue> mo10174f() {
        return this.f7652a;
    }

    @C3044g0
    @C12579k
    /* renamed from: g */
    public final DrawerValue mo10175g() {
        return this.f7652a.mo10571w();
    }

    /* renamed from: i */
    public final boolean mo10176i() {
        return this.f7652a.mo10574z();
    }

    /* renamed from: j */
    public final boolean mo10177j() {
        return mo10172c() == DrawerValue.Closed;
    }

    /* renamed from: k */
    public final boolean mo10178k() {
        return mo10172c() == DrawerValue.Open;
    }

    @C12580l
    /* renamed from: l */
    public final Object mo10179l(@C12579k C11045c<? super C11079d2> cVar) {
        Object g = SwipeableV2State.m14015g(this.f7652a, DrawerValue.Open, 0.0f, cVar, 2, (Object) null);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    /* renamed from: m */
    public final float mo10180m() {
        return this.f7652a.mo10545B();
    }

    @C12580l
    /* renamed from: n */
    public final Object mo10181n(@C12579k DrawerValue drawerValue, @C12579k C11045c<? super C11079d2> cVar) {
        Object J = this.f7652a.mo10553J(drawerValue, cVar);
        return J == C11063b.m42612h() ? J : C11079d2.f28267a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrawerState(DrawerValue drawerValue, C11300l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? C29261.f7653f : lVar);
    }
}
