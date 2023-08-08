package androidx.compose.foundation;

import androidx.compose.animation.core.C1968g;
import androidx.compose.foundation.gestures.C2201l;
import androidx.compose.foundation.gestures.C2203n;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.foundation.interaction.C2242f;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,410:1\n76#2:411\n102#2,2:412\n76#2:414\n102#2,2:415\n76#2:417\n76#2:418\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n96#1:411\n96#1:412,2\n114#1:414\n114#1:415,2\n157#1:417\n159#1:418\n*E\n"})
public final class ScrollState implements C2203n {
    @C12579k

    /* renamed from: i */
    public static final C2099a f5779i = new C2099a((DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final int f5780j = 0;
    @C12579k

    /* renamed from: k */
    public static final C8628e<ScrollState, ?> f5781k = SaverKt.m31375a(ScrollState$Companion$Saver$1.f5790f, ScrollState$Companion$Saver$2.f5791f);
    @C12579k

    /* renamed from: a */
    public final C8700z0 f5782a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f5783b = C8415c2.m30241j(0, C8415c2.m30254w());
    @C12579k

    /* renamed from: c */
    public final C2243g f5784c = C2242f.m9684a();
    @C12579k

    /* renamed from: d */
    public C8700z0<Integer> f5785d = C8415c2.m30241j(Integer.MAX_VALUE, C8415c2.m30254w());

    /* renamed from: e */
    public float f5786e;
    @C12579k

    /* renamed from: f */
    public final C2203n f5787f = ScrollableStateKt.m9405a(new ScrollState$scrollableState$1(this));
    @C12579k

    /* renamed from: g */
    public final C8578k2 f5788g = C8415c2.m30235d(new ScrollState$canScrollForward$2(this));
    @C12579k

    /* renamed from: h */
    public final C8578k2 f5789h = C8415c2.m30235d(new ScrollState$canScrollBackward$2(this));

    /* renamed from: androidx.compose.foundation.ScrollState$a */
    public static final class C2099a {
        public /* synthetic */ C2099a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C8628e<ScrollState, ?> mo7264a() {
            return ScrollState.f5781k;
        }

        public C2099a() {
        }
    }

    public ScrollState(int i) {
        this.f5782a = C8415c2.m30241j(Integer.valueOf(i), C8415c2.m30254w());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: androidx.compose.animation.core.v0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.animation.core.v0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.animation.core.v0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m9070n(androidx.compose.foundation.ScrollState r6, int r7, androidx.compose.animation.core.C1968g r8, kotlin.coroutines.C11045c r9, int r10, java.lang.Object r11) {
        /*
            r10 = r10 & 2
            if (r10 == 0) goto L_0x000f
            androidx.compose.animation.core.v0 r8 = new androidx.compose.animation.core.v0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x000f:
            java.lang.Object r6 = r6.mo7254m(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollState.m9070n(androidx.compose.foundation.ScrollState, int, androidx.compose.animation.core.g, kotlin.coroutines.c, int, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public boolean mo7249a() {
        return ((Boolean) this.f5788g.getValue()).booleanValue();
    }

    /* renamed from: b */
    public float mo7250b(float f) {
        return this.f5787f.mo7250b(f);
    }

    /* renamed from: e */
    public boolean mo7251e() {
        return this.f5787f.mo7251e();
    }

    /* renamed from: f */
    public boolean mo7252f() {
        return ((Boolean) this.f5789h.getValue()).booleanValue();
    }

    @C12580l
    /* renamed from: g */
    public Object mo7253g(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2201l, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = this.f5787f.mo7253g(mutatePriority, pVar, cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: m */
    public final Object mo7254m(int i, @C12579k C1968g<Float> gVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = ScrollExtensionsKt.m9367a(this, (float) (i - mo7258r()), gVar, cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: o */
    public final C2241e mo7255o() {
        return this.f5784c;
    }

    @C12579k
    /* renamed from: p */
    public final C2243g mo7256p() {
        return this.f5784c;
    }

    /* renamed from: q */
    public final int mo7257q() {
        return this.f5785d.getValue().intValue();
    }

    /* renamed from: r */
    public final int mo7258r() {
        return ((Number) this.f5782a.getValue()).intValue();
    }

    /* renamed from: s */
    public final int mo7259s() {
        return ((Number) this.f5783b.getValue()).intValue();
    }

    @C12580l
    /* renamed from: t */
    public final Object mo7260t(int i, @C12579k C11045c<? super Float> cVar) {
        return ScrollExtensionsKt.m9369c(this, (float) (i - mo7258r()), cVar);
    }

    /* renamed from: u */
    public final void mo7261u(int i) {
        this.f5785d.setValue(Integer.valueOf(i));
        if (mo7258r() > i) {
            mo7262v(i);
        }
    }

    /* renamed from: v */
    public final void mo7262v(int i) {
        this.f5782a.setValue(Integer.valueOf(i));
    }

    /* renamed from: w */
    public final void mo7263w(int i) {
        this.f5783b.setValue(Integer.valueOf(i));
    }
}
