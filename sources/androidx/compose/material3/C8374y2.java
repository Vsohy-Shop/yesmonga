package androidx.compose.material3;

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
@C8251n0
@C11363r0({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Defaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,692:1\n154#2:693\n154#2:694\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Defaults\n*L\n581#1:693\n588#1:694\n*E\n"})
/* renamed from: androidx.compose.material3.y2 */
public final class C8374y2 {
    @C12579k

    /* renamed from: a */
    public static final C8374y2 f22489a = new C8374y2();
    @C12579k

    /* renamed from: b */
    public static final C2014v0<Float> f22490b = new C2014v0(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final float f22491c = C16483g.m74435M((float) 125);
    @C12579k

    /* renamed from: d */
    public static final C11304p<C16479d, Float, Float> f22492d = SwipeableV2Kt.m26465f(C16483g.m74435M((float) 56));

    /* renamed from: androidx.compose.material3.y2$a */
    public static final class C8375a implements C8179c<T> {

        /* renamed from: a */
        public final /* synthetic */ C11304p<T, Float, C11079d2> f22493a;

        /* renamed from: b */
        public final /* synthetic */ SwipeableV2State<T> f22494b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<T, C11079d2> f22495c;

        public C8375a(C11304p<? super T, ? super Float, C11079d2> pVar, SwipeableV2State<T> swipeableV2State, C11300l<? super T, C11079d2> lVar) {
            this.f22493a = pVar;
            this.f22494b = swipeableV2State;
            this.f22495c = lVar;
        }

        /* renamed from: a */
        public final void mo11180a(T t, @C12579k Map<T, Float> map, @C12579k Map<T, Float> map2) {
            Intrinsics.checkNotNullParameter(map, "previousAnchors");
            Intrinsics.checkNotNullParameter(map2, "newAnchors");
            Float f = map2.get(t);
            if (Intrinsics.areEqual(map.get(t), f)) {
                return;
            }
            if (f != null) {
                this.f22493a.invoke(t, Float.valueOf(this.f22494b.mo12115s()));
            } else {
                this.f22495c.invoke(SwipeableV2Kt.m26464e(map2, this.f22494b.mo12093E(), false, 2, (Object) null));
            }
        }
    }

    @C8251n0
    /* renamed from: c */
    public static /* synthetic */ void m29406c() {
    }

    @C8251n0
    /* renamed from: e */
    public static /* synthetic */ void m29407e() {
    }

    @C8251n0
    /* renamed from: g */
    public static /* synthetic */ void m29408g() {
    }

    @C8251n0
    @C12579k
    /* renamed from: a */
    public final <T> C8179c<T> mo14798a(@C12579k SwipeableV2State<T> swipeableV2State, @C12579k C11304p<? super T, ? super Float, C11079d2> pVar, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(swipeableV2State, "state");
        Intrinsics.checkNotNullParameter(pVar, "animate");
        Intrinsics.checkNotNullParameter(lVar, "snap");
        return new C8375a(pVar, swipeableV2State, lVar);
    }

    @C12579k
    /* renamed from: b */
    public final C2014v0<Float> mo14799b() {
        return f22490b;
    }

    @C12579k
    /* renamed from: d */
    public final C11304p<C16479d, Float, Float> mo14800d() {
        return f22492d;
    }

    /* renamed from: f */
    public final float mo14801f() {
        return f22491c;
    }
}
