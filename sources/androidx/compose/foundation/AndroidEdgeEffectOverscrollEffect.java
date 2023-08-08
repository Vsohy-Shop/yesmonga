package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.C0344h1;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15208f0;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.input.pointer.C15506v;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8700z0;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,589:1\n33#2,6:590\n101#2,2:597\n33#2,6:599\n103#2:605\n33#2,6:607\n135#3:596\n245#4:606\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n123#1:590,6\n266#1:597,2\n266#1:599,6\n266#1:605\n445#1:607,6\n341#1:596\n351#1:606\n*E\n"})
public final class AndroidEdgeEffectOverscrollEffect implements C2253k0 {
    @C12579k

    /* renamed from: a */
    public final C2251j0 f5702a;
    @C12580l

    /* renamed from: b */
    public C15094f f5703b;
    @C12579k

    /* renamed from: c */
    public final EdgeEffect f5704c;
    @C12579k

    /* renamed from: d */
    public final EdgeEffect f5705d;
    @C12579k

    /* renamed from: e */
    public final EdgeEffect f5706e;
    @C12579k

    /* renamed from: f */
    public final EdgeEffect f5707f;
    @C12579k

    /* renamed from: g */
    public final List<EdgeEffect> f5708g;
    @C12579k

    /* renamed from: h */
    public final EdgeEffect f5709h;
    @C12579k

    /* renamed from: i */
    public final EdgeEffect f5710i;
    @C12579k

    /* renamed from: j */
    public final EdgeEffect f5711j;
    @C12579k

    /* renamed from: k */
    public final EdgeEffect f5712k;
    @C12579k

    /* renamed from: l */
    public final C8700z0<C11079d2> f5713l;

    /* renamed from: m */
    public boolean f5714m;

    /* renamed from: n */
    public boolean f5715n;

    /* renamed from: o */
    public long f5716o;
    @C12579k

    /* renamed from: p */
    public final C11300l<C16500q, C11079d2> f5717p;
    @C12580l

    /* renamed from: q */
    public C15506v f5718q;
    @C12579k

    /* renamed from: r */
    public final C8767m f5719r;

    public AndroidEdgeEffectOverscrollEffect(@C12579k Context context, @C12579k C2251j0 j0Var) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(j0Var, "overscrollConfig");
        this.f5702a = j0Var;
        C2658q qVar = C2658q.f7030a;
        EdgeEffect a = qVar.mo9119a(context, (AttributeSet) null);
        this.f5704c = a;
        EdgeEffect a2 = qVar.mo9119a(context, (AttributeSet) null);
        this.f5705d = a2;
        EdgeEffect a3 = qVar.mo9119a(context, (AttributeSet) null);
        this.f5706e = a3;
        EdgeEffect a4 = qVar.mo9119a(context, (AttributeSet) null);
        this.f5707f = a4;
        List<EdgeEffect> L = CollectionsKt__CollectionsKt.m40448L(a3, a, a4, a2);
        this.f5708g = L;
        this.f5709h = qVar.mo9119a(context, (AttributeSet) null);
        this.f5710i = qVar.mo9119a(context, (AttributeSet) null);
        this.f5711j = qVar.mo9119a(context, (AttributeSet) null);
        this.f5712k = qVar.mo9119a(context, (AttributeSet) null);
        int size = L.size();
        for (int i = 0; i < size; i++) {
            L.get(i).setColor(C15258l2.m66193r(this.f5702a.mo7611b()));
        }
        C11079d2 d2Var = C11079d2.f28267a;
        this.f5713l = C8415c2.m30241j(d2Var, C8415c2.m30243l());
        this.f5714m = true;
        this.f5716o = C15104m.f37280b.mo42317c();
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.f5717p = androidEdgeEffectOverscrollEffect$onNewSize$1;
        C8767m a5 = OnRemeasuredModifierKt.m69010a(SuspendingPointerInputFilterKt.m68437c(C8767m.f23478j.mo17224k3(AndroidOverscrollKt.f5720a), d2Var, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, (C11045c<? super AndroidEdgeEffectOverscrollEffect$effectModifier$1>) null)), androidEdgeEffectOverscrollEffect$onNewSize$1);
        if (InspectableValueKt.m71063e()) {
            lVar = new C2048x9a0aa7c(this);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        this.f5719r = a5.mo17224k3(new C2633p(this, lVar));
    }

    @C0344h1
    /* renamed from: A */
    public static /* synthetic */ void m8777A() {
    }

    /* renamed from: B */
    public final void mo7098B() {
        if (this.f5714m) {
            this.f5713l.setValue(C11079d2.f28267a);
        }
    }

    /* renamed from: C */
    public final float mo7099C(long j, long j2) {
        float p = C15094f.m64880p(j2) / C15104m.m65023t(this.f5716o);
        float r = C15094f.m64882r(j) / C15104m.m65016m(this.f5716o);
        C2658q qVar = C2658q.f7030a;
        boolean z = true;
        float m = (-qVar.mo9122d(this.f5705d, -r, ((float) 1) - p)) * C15104m.m65016m(this.f5716o);
        if (qVar.mo9120b(this.f5705d) != 0.0f) {
            z = false;
        }
        if (!z) {
            return C15094f.m64882r(j);
        }
        return m;
    }

    /* renamed from: D */
    public final float mo7100D(long j, long j2) {
        float r = C15094f.m64882r(j2) / C15104m.m65016m(this.f5716o);
        float p = C15094f.m64880p(j) / C15104m.m65023t(this.f5716o);
        C2658q qVar = C2658q.f7030a;
        boolean z = true;
        float d = qVar.mo9122d(this.f5706e, p, ((float) 1) - r) * C15104m.m65023t(this.f5716o);
        if (qVar.mo9120b(this.f5706e) != 0.0f) {
            z = false;
        }
        if (!z) {
            return C15094f.m64880p(j);
        }
        return d;
    }

    /* renamed from: E */
    public final float mo7101E(long j, long j2) {
        boolean z;
        float r = C15094f.m64882r(j2) / C15104m.m65016m(this.f5716o);
        float p = C15094f.m64880p(j) / C15104m.m65023t(this.f5716o);
        C2658q qVar = C2658q.f7030a;
        float t = (-qVar.mo9122d(this.f5707f, -p, r)) * C15104m.m65023t(this.f5716o);
        if (qVar.mo9120b(this.f5707f) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C15094f.m64880p(j);
        }
        return t;
    }

    /* renamed from: F */
    public final float mo7102F(long j, long j2) {
        boolean z;
        float p = C15094f.m64880p(j2) / C15104m.m65023t(this.f5716o);
        float r = C15094f.m64882r(j) / C15104m.m65016m(this.f5716o);
        C2658q qVar = C2658q.f7030a;
        float d = qVar.mo9122d(this.f5704c, r, p) * C15104m.m65016m(this.f5716o);
        if (qVar.mo9120b(this.f5704c) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C15094f.m64882r(j);
        }
        return d;
    }

    /* renamed from: G */
    public final boolean mo7103G(long j) {
        boolean z;
        boolean z2 = false;
        if (this.f5706e.isFinished() || C15094f.m64880p(j) >= 0.0f) {
            z = false;
        } else {
            C2658q.f7030a.mo9123e(this.f5706e, C15094f.m64880p(j));
            z = this.f5706e.isFinished();
        }
        if (!this.f5707f.isFinished() && C15094f.m64880p(j) > 0.0f) {
            C2658q.f7030a.mo9123e(this.f5707f, C15094f.m64880p(j));
            if (z || this.f5707f.isFinished()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!this.f5704c.isFinished() && C15094f.m64882r(j) < 0.0f) {
            C2658q.f7030a.mo9123e(this.f5704c, C15094f.m64882r(j));
            if (z || this.f5704c.isFinished()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.f5705d.isFinished() || C15094f.m64882r(j) <= 0.0f) {
            return z;
        }
        C2658q.f7030a.mo9123e(this.f5705d, C15094f.m64882r(j));
        if (z || this.f5705d.isFinished()) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: H */
    public final void mo7104H(boolean z) {
        this.f5714m = z;
    }

    /* renamed from: I */
    public final boolean mo7105I() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long b = C15106n.m65034b(this.f5716o);
        C2658q qVar = C2658q.f7030a;
        boolean z5 = false;
        if (qVar.mo9120b(this.f5706e) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo7100D(C15094f.f37256b.mo42248e(), b);
            z2 = true;
        } else {
            z2 = false;
        }
        if (qVar.mo9120b(this.f5707f) == 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            mo7101E(C15094f.f37256b.mo42248e(), b);
            z2 = true;
        }
        if (qVar.mo9120b(this.f5704c) == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            mo7102F(C15094f.f37256b.mo42248e(), b);
            z2 = true;
        }
        if (qVar.mo9120b(this.f5705d) == 0.0f) {
            z5 = true;
        }
        if (z5) {
            return z2;
        }
        mo7099C(C15094f.f37256b.mo42248e(), b);
        return true;
    }

    /* renamed from: a */
    public boolean mo7106a() {
        boolean z;
        List<EdgeEffect> list = this.f5708g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C2658q.f7030a.mo9120b(list.get(i)) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: b */
    public C8767m mo7107b() {
        return this.f5719r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0180  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo7108c(long r18, int r20, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.geometry.C15094f, androidx.compose.p004ui.geometry.C15094f> r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r21
            java.lang.String r4 = "performScroll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            long r4 = r0.f5716o
            boolean r4 = androidx.compose.p004ui.geometry.C15104m.m65025v(r4)
            if (r4 == 0) goto L_0x0022
            androidx.compose.ui.geometry.f r1 = androidx.compose.p004ui.geometry.C15094f.m64868d(r18)
            java.lang.Object r1 = r3.invoke(r1)
            androidx.compose.ui.geometry.f r1 = (androidx.compose.p004ui.geometry.C15094f) r1
            long r1 = r1.mo42242A()
            return r1
        L_0x0022:
            boolean r4 = r0.f5715n
            r5 = 1
            if (r4 != 0) goto L_0x002c
            r17.mo7105I()
            r0.f5715n = r5
        L_0x002c:
            androidx.compose.ui.geometry.f r4 = r0.f5703b
            if (r4 == 0) goto L_0x0035
            long r6 = r4.mo42242A()
            goto L_0x003b
        L_0x0035:
            long r6 = r0.f5716o
            long r6 = androidx.compose.p004ui.geometry.C15106n.m65034b(r6)
        L_0x003b:
            float r4 = androidx.compose.p004ui.geometry.C15094f.m64882r(r18)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r9 = 0
            if (r4 != 0) goto L_0x0047
            r4 = r5
            goto L_0x0048
        L_0x0047:
            r4 = r9
        L_0x0048:
            if (r4 == 0) goto L_0x004c
        L_0x004a:
            r10 = r8
            goto L_0x009d
        L_0x004c:
            androidx.compose.foundation.q r4 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r10 = r0.f5704c
            float r10 = r4.mo9120b(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x005a
            r10 = r5
            goto L_0x005b
        L_0x005a:
            r10 = r9
        L_0x005b:
            if (r10 != 0) goto L_0x0076
            float r10 = r0.mo7102F(r1, r6)
            android.widget.EdgeEffect r11 = r0.f5704c
            float r4 = r4.mo9120b(r11)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x006d
            r4 = r5
            goto L_0x006e
        L_0x006d:
            r4 = r9
        L_0x006e:
            if (r4 == 0) goto L_0x009d
            android.widget.EdgeEffect r4 = r0.f5704c
            r4.onRelease()
            goto L_0x009d
        L_0x0076:
            android.widget.EdgeEffect r10 = r0.f5705d
            float r10 = r4.mo9120b(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0082
            r10 = r5
            goto L_0x0083
        L_0x0082:
            r10 = r9
        L_0x0083:
            if (r10 != 0) goto L_0x004a
            float r10 = r0.mo7099C(r1, r6)
            android.widget.EdgeEffect r11 = r0.f5705d
            float r4 = r4.mo9120b(r11)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0095
            r4 = r5
            goto L_0x0096
        L_0x0095:
            r4 = r9
        L_0x0096:
            if (r4 == 0) goto L_0x009d
            android.widget.EdgeEffect r4 = r0.f5705d
            r4.onRelease()
        L_0x009d:
            float r4 = androidx.compose.p004ui.geometry.C15094f.m64880p(r18)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00a7
            r4 = r5
            goto L_0x00a8
        L_0x00a7:
            r4 = r9
        L_0x00a8:
            if (r4 == 0) goto L_0x00ab
            goto L_0x00fe
        L_0x00ab:
            androidx.compose.foundation.q r4 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r11 = r0.f5706e
            float r11 = r4.mo9120b(r11)
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x00b9
            r11 = r5
            goto L_0x00ba
        L_0x00b9:
            r11 = r9
        L_0x00ba:
            if (r11 != 0) goto L_0x00d6
            float r11 = r0.mo7100D(r1, r6)
            android.widget.EdgeEffect r12 = r0.f5706e
            float r4 = r4.mo9120b(r12)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00cc
            r4 = r5
            goto L_0x00cd
        L_0x00cc:
            r4 = r9
        L_0x00cd:
            if (r4 == 0) goto L_0x00d4
            android.widget.EdgeEffect r4 = r0.f5706e
            r4.onRelease()
        L_0x00d4:
            r8 = r11
            goto L_0x00fe
        L_0x00d6:
            android.widget.EdgeEffect r11 = r0.f5707f
            float r11 = r4.mo9120b(r11)
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x00e2
            r11 = r5
            goto L_0x00e3
        L_0x00e2:
            r11 = r9
        L_0x00e3:
            if (r11 != 0) goto L_0x00fe
            float r11 = r0.mo7101E(r1, r6)
            android.widget.EdgeEffect r12 = r0.f5707f
            float r4 = r4.mo9120b(r12)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00f5
            r4 = r5
            goto L_0x00f6
        L_0x00f5:
            r4 = r9
        L_0x00f6:
            if (r4 == 0) goto L_0x00d4
            android.widget.EdgeEffect r4 = r0.f5707f
            r4.onRelease()
            goto L_0x00d4
        L_0x00fe:
            long r10 = androidx.compose.p004ui.geometry.C15096g.m64898a(r8, r10)
            androidx.compose.ui.geometry.f$a r4 = androidx.compose.p004ui.geometry.C15094f.f37256b
            long r12 = r4.mo42248e()
            boolean r4 = androidx.compose.p004ui.geometry.C15094f.m64876l(r10, r12)
            if (r4 != 0) goto L_0x0111
            r17.mo7098B()
        L_0x0111:
            long r12 = androidx.compose.p004ui.geometry.C15094f.m64885u(r1, r10)
            androidx.compose.ui.geometry.f r4 = androidx.compose.p004ui.geometry.C15094f.m64868d(r12)
            java.lang.Object r3 = r3.invoke(r4)
            androidx.compose.ui.geometry.f r3 = (androidx.compose.p004ui.geometry.C15094f) r3
            long r3 = r3.mo42242A()
            long r12 = androidx.compose.p004ui.geometry.C15094f.m64885u(r12, r3)
            androidx.compose.ui.input.nestedscroll.b$a r8 = androidx.compose.p004ui.input.nestedscroll.C15448b.f38435b
            int r8 = r8.mo43964a()
            r14 = r20
            boolean r8 = androidx.compose.p004ui.input.nestedscroll.C15448b.m68343g(r14, r8)
            if (r8 == 0) goto L_0x0173
            float r8 = androidx.compose.p004ui.geometry.C15094f.m64880p(r12)
            r14 = 1056964608(0x3f000000, float:0.5)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r15 = -1090519040(0xffffffffbf000000, float:-0.5)
            if (r8 <= 0) goto L_0x0146
            r0.mo7100D(r12, r6)
        L_0x0144:
            r8 = r5
            goto L_0x0153
        L_0x0146:
            float r8 = androidx.compose.p004ui.geometry.C15094f.m64880p(r12)
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x0152
            r0.mo7101E(r12, r6)
            goto L_0x0144
        L_0x0152:
            r8 = r9
        L_0x0153:
            float r16 = androidx.compose.p004ui.geometry.C15094f.m64882r(r12)
            int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0160
            r0.mo7102F(r12, r6)
        L_0x015e:
            r6 = r5
            goto L_0x016d
        L_0x0160:
            float r14 = androidx.compose.p004ui.geometry.C15094f.m64882r(r12)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L_0x016c
            r0.mo7099C(r12, r6)
            goto L_0x015e
        L_0x016c:
            r6 = r9
        L_0x016d:
            if (r8 != 0) goto L_0x0171
            if (r6 == 0) goto L_0x0173
        L_0x0171:
            r6 = r5
            goto L_0x0174
        L_0x0173:
            r6 = r9
        L_0x0174:
            boolean r1 = r17.mo7103G(r18)
            if (r1 != 0) goto L_0x017e
            if (r6 == 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r5 = r9
        L_0x017e:
            if (r5 == 0) goto L_0x0183
            r17.mo7098B()
        L_0x0183:
            long r1 = androidx.compose.p004ui.geometry.C15094f.m64886v(r10, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo7108c(long, int, kotlin.jvm.functions.l):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo7109d(long r12, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.unit.C16509w, ? super kotlin.coroutines.C11045c<? super androidx.compose.p004ui.unit.C16509w>, ? extends java.lang.Object> r14, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1 r0 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1 r0 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            long r12 = r0.J$0
            java.lang.Object r14 = r0.L$0
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r14 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r14
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0134
        L_0x0035:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003d:
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0059
        L_0x0041:
            kotlin.C11661u0.m45747n(r15)
            long r7 = r11.f5716o
            boolean r15 = androidx.compose.p004ui.geometry.C15104m.m65025v(r7)
            if (r15 == 0) goto L_0x005c
            androidx.compose.ui.unit.w r12 = androidx.compose.p004ui.unit.C16509w.m74740b(r12)
            r0.label = r5
            java.lang.Object r12 = r14.invoke(r12, r0)
            if (r12 != r1) goto L_0x0059
            return r1
        L_0x0059:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x005c:
            float r15 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0087
            androidx.compose.foundation.q r15 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r2 = r11.f5706e
            float r2 = r15.mo9120b(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0072
            r2 = r5
            goto L_0x0073
        L_0x0072:
            r2 = r4
        L_0x0073:
            if (r2 != 0) goto L_0x0087
            android.widget.EdgeEffect r2 = r11.f5706e
            float r7 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            int r7 = kotlin.math.C11409d.m43851L0(r7)
            r15.mo9121c(r2, r7)
            float r15 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            goto L_0x00b4
        L_0x0087:
            float r15 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x00b3
            androidx.compose.foundation.q r15 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r2 = r11.f5707f
            float r2 = r15.mo9120b(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x009d
            r2 = r5
            goto L_0x009e
        L_0x009d:
            r2 = r4
        L_0x009e:
            if (r2 != 0) goto L_0x00b3
            android.widget.EdgeEffect r2 = r11.f5707f
            float r7 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            int r7 = kotlin.math.C11409d.m43851L0(r7)
            int r7 = -r7
            r15.mo9121c(r2, r7)
            float r15 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            goto L_0x00b4
        L_0x00b3:
            r15 = r6
        L_0x00b4:
            float r2 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x00df
            androidx.compose.foundation.q r2 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r7 = r11.f5704c
            float r7 = r2.mo9120b(r7)
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 != 0) goto L_0x00ca
            r7 = r5
            goto L_0x00cb
        L_0x00ca:
            r7 = r4
        L_0x00cb:
            if (r7 != 0) goto L_0x00df
            android.widget.EdgeEffect r5 = r11.f5704c
            float r7 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            int r7 = kotlin.math.C11409d.m43851L0(r7)
            r2.mo9121c(r5, r7)
            float r2 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            goto L_0x010b
        L_0x00df:
            float r2 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x010a
            androidx.compose.foundation.q r2 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r7 = r11.f5705d
            float r7 = r2.mo9120b(r7)
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 != 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r5 = r4
        L_0x00f5:
            if (r5 != 0) goto L_0x010a
            android.widget.EdgeEffect r5 = r11.f5705d
            float r7 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            int r7 = kotlin.math.C11409d.m43851L0(r7)
            int r7 = -r7
            r2.mo9121c(r5, r7)
            float r2 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            goto L_0x010b
        L_0x010a:
            r2 = r6
        L_0x010b:
            long r7 = androidx.compose.p004ui.unit.C16511x.m74763a(r15, r2)
            androidx.compose.ui.unit.w$a r15 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r9 = r15.mo47915a()
            boolean r15 = androidx.compose.p004ui.unit.C16509w.m74748j(r7, r9)
            if (r15 != 0) goto L_0x011e
            r11.mo7098B()
        L_0x011e:
            long r12 = androidx.compose.p004ui.unit.C16509w.m74754p(r12, r7)
            androidx.compose.ui.unit.w r15 = androidx.compose.p004ui.unit.C16509w.m74740b(r12)
            r0.L$0 = r11
            r0.J$0 = r12
            r0.label = r3
            java.lang.Object r15 = r14.invoke(r15, r0)
            if (r15 != r1) goto L_0x0133
            return r1
        L_0x0133:
            r14 = r11
        L_0x0134:
            androidx.compose.ui.unit.w r15 = (androidx.compose.p004ui.unit.C16509w) r15
            long r0 = r15.mo47914v()
            long r12 = androidx.compose.p004ui.unit.C16509w.m74754p(r12, r0)
            r14.f5715n = r4
            float r15 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0158
            androidx.compose.foundation.q r15 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r0 = r14.f5706e
            float r1 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            int r1 = kotlin.math.C11409d.m43851L0(r1)
            r15.mo9121c(r0, r1)
            goto L_0x0170
        L_0x0158:
            float r15 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x0170
            androidx.compose.foundation.q r15 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r0 = r14.f5707f
            float r1 = androidx.compose.p004ui.unit.C16509w.m74750l(r12)
            int r1 = kotlin.math.C11409d.m43851L0(r1)
            int r1 = -r1
            r15.mo9121c(r0, r1)
        L_0x0170:
            float r15 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0188
            androidx.compose.foundation.q r15 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r0 = r14.f5704c
            float r1 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            int r1 = kotlin.math.C11409d.m43851L0(r1)
            r15.mo9121c(r0, r1)
            goto L_0x01a0
        L_0x0188:
            float r15 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 >= 0) goto L_0x01a0
            androidx.compose.foundation.q r15 = androidx.compose.foundation.C2658q.f7030a
            android.widget.EdgeEffect r0 = r14.f5705d
            float r1 = androidx.compose.p004ui.unit.C16509w.m74752n(r12)
            int r1 = kotlin.math.C11409d.m43851L0(r1)
            int r1 = -r1
            r15.mo9121c(r0, r1)
        L_0x01a0:
            androidx.compose.ui.unit.w$a r15 = androidx.compose.p004ui.unit.C16509w.f40916b
            long r0 = r15.mo47915a()
            boolean r12 = androidx.compose.p004ui.unit.C16509w.m74748j(r12, r0)
            if (r12 != 0) goto L_0x01af
            r14.mo7098B()
        L_0x01af:
            r14.mo7110t()
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo7109d(long, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: t */
    public final void mo7110t() {
        List<EdgeEffect> list = this.f5708g;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            if (edgeEffect.isFinished() || z) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            mo7098B();
        }
    }

    /* renamed from: u */
    public final boolean mo7111u(C15187e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-C15104m.m65023t(this.f5716o), (-C15104m.m65016m(this.f5716o)) + eVar.mo7425g5(this.f5702a.mo7610a().mo8090a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: v */
    public final boolean mo7112v(C15187e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-C15104m.m65016m(this.f5716o), eVar.mo7425g5(this.f5702a.mo7610a().mo8091b(eVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: w */
    public final void mo7113w(@C12579k C15187e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (!C15104m.m65025v(this.f5716o)) {
            C15118b2 c = eVar.mo42683q5().mo42705c();
            this.f5713l.getValue();
            Canvas d = C15208f0.m65929d(c);
            C2658q qVar = C2658q.f7030a;
            boolean z8 = true;
            if (qVar.mo9120b(this.f5711j) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                mo7114x(eVar, this.f5711j, d);
                this.f5711j.finish();
            }
            if (!this.f5706e.isFinished()) {
                z2 = mo7112v(eVar, this.f5706e, d);
                qVar.mo9122d(this.f5711j, qVar.mo9120b(this.f5706e), 0.0f);
            } else {
                z2 = false;
            }
            if (qVar.mo9120b(this.f5709h) == 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                mo7111u(eVar, this.f5709h, d);
                this.f5709h.finish();
            }
            if (!this.f5704c.isFinished()) {
                if (mo7115y(eVar, this.f5704c, d) || z2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                qVar.mo9122d(this.f5709h, qVar.mo9120b(this.f5704c), 0.0f);
            }
            if (qVar.mo9120b(this.f5712k) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                mo7112v(eVar, this.f5712k, d);
                this.f5712k.finish();
            }
            if (!this.f5707f.isFinished()) {
                if (mo7114x(eVar, this.f5707f, d) || z2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                qVar.mo9122d(this.f5712k, qVar.mo9120b(this.f5707f), 0.0f);
            }
            if (qVar.mo9120b(this.f5710i) == 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                mo7115y(eVar, this.f5710i, d);
                this.f5710i.finish();
            }
            if (!this.f5705d.isFinished()) {
                if (!mo7111u(eVar, this.f5705d, d) && !z2) {
                    z8 = false;
                }
                qVar.mo9122d(this.f5710i, qVar.mo9120b(this.f5705d), 0.0f);
                z2 = z8;
            }
            if (z2) {
                mo7098B();
            }
        }
    }

    /* renamed from: x */
    public final boolean mo7114x(C15187e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int L0 = C11409d.m43851L0(C15104m.m65023t(this.f5716o));
        float c = this.f5702a.mo7610a().mo8092c(eVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-((float) L0)) + eVar.mo7425g5(c));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: y */
    public final boolean mo7115y(C15187e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, eVar.mo7425g5(this.f5702a.mo7610a().mo8093d()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: z */
    public final boolean mo7116z() {
        return this.f5714m;
    }
}
