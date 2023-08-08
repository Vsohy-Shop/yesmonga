package androidx.compose.material;

import androidx.compose.animation.core.C2014v0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8547h2;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C3044g0
@C11363r0({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Defaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,655:1\n154#2:656\n154#2:657\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Defaults\n*L\n541#1:656\n548#1:657\n*E\n"})
/* renamed from: androidx.compose.material.o1 */
public final class C7888o1 {
    @C12579k

    /* renamed from: a */
    public static final C7888o1 f18893a = new C7888o1();
    @C12579k

    /* renamed from: b */
    public static final C2014v0<Float> f18894b = new C2014v0(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final float f18895c = C16483g.m74435M((float) 125);
    @C12579k

    /* renamed from: d */
    public static final C11304p<C16479d, Float, Float> f18896d = SwipeableV2Kt.m13992f(C16483g.m74435M((float) 56));

    /* renamed from: androidx.compose.material.o1$a */
    public static final class C7889a implements C3025a<T> {

        /* renamed from: a */
        public final /* synthetic */ C11304p<T, Float, C11079d2> f18897a;

        /* renamed from: b */
        public final /* synthetic */ SwipeableV2State<T> f18898b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<T, C11079d2> f18899c;

        public C7889a(C11304p<? super T, ? super Float, C11079d2> pVar, SwipeableV2State<T> swipeableV2State, C11300l<? super T, C11079d2> lVar) {
            this.f18897a = pVar;
            this.f18898b = swipeableV2State;
            this.f18899c = lVar;
        }

        /* renamed from: a */
        public final void mo10032a(T t, @C12579k Map<T, Float> map, @C12579k Map<T, Float> map2) {
            Intrinsics.checkNotNullParameter(map, "previousAnchors");
            Intrinsics.checkNotNullParameter(map2, "newAnchors");
            Float f = map2.get(t);
            if (Intrinsics.areEqual(map.get(t), f)) {
                return;
            }
            if (f != null) {
                this.f18897a.invoke(t, Float.valueOf(this.f18898b.mo10565q()));
            } else {
                this.f18899c.invoke(SwipeableV2Kt.m13991e(map2, this.f18898b.mo10545B(), false, 2, (Object) null));
            }
        }
    }

    @C3044g0
    /* renamed from: c */
    public static /* synthetic */ void m25083c() {
    }

    @C3044g0
    /* renamed from: e */
    public static /* synthetic */ void m25084e() {
    }

    @C3044g0
    /* renamed from: g */
    public static /* synthetic */ void m25085g() {
    }

    @C3044g0
    @C12579k
    /* renamed from: a */
    public final <T> C3025a<T> mo10900a(@C12579k SwipeableV2State<T> swipeableV2State, @C12579k C11304p<? super T, ? super Float, C11079d2> pVar, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(swipeableV2State, "state");
        Intrinsics.checkNotNullParameter(pVar, "animate");
        Intrinsics.checkNotNullParameter(lVar, "snap");
        return new C7889a(pVar, swipeableV2State, lVar);
    }

    @C12579k
    /* renamed from: b */
    public final C2014v0<Float> mo10901b() {
        return f18894b;
    }

    @C12579k
    /* renamed from: d */
    public final C11304p<C16479d, Float, Float> mo10902d() {
        return f18896d;
    }

    /* renamed from: f */
    public final float mo10903f() {
        return f18895c;
    }
}
