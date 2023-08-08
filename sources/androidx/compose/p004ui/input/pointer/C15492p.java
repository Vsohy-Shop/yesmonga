package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.input.pointer.p */
public final class C15492p {
    @C11395k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @C11587t0(expression = "isConsumed", imports = {}))
    /* renamed from: a */
    public static final boolean m68681a(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return wVar.mo44167A();
    }

    /* renamed from: b */
    public static final boolean m68682b(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (wVar.mo44167A() || wVar.mo44182v() || !wVar.mo44178r()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m68683c(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (wVar.mo44182v() || !wVar.mo44178r()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m68684d(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (wVar.mo44167A() || !wVar.mo44182v() || wVar.mo44178r()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m68685e(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (!wVar.mo44182v() || wVar.mo44178r()) {
            return false;
        }
        return true;
    }

    @C11395k(message = "Use consume() instead", replaceWith = @C11587t0(expression = "consume()", imports = {}))
    /* renamed from: f */
    public static final void m68686f(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        wVar.mo44168a();
    }

    @C11395k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @C11587t0(expression = "if (pressed != previousPressed) consume()", imports = {}))
    /* renamed from: g */
    public static final void m68687g(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (wVar.mo44178r() != wVar.mo44182v()) {
            wVar.mo44168a();
        }
    }

    @C11395k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @C11587t0(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    /* renamed from: h */
    public static final void m68688h(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (!C15094f.m64876l(m68691k(wVar), C15094f.f37256b.mo42248e())) {
            wVar.mo44168a();
        }
    }

    @C11395k(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @C11587t0(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* renamed from: i */
    public static final boolean m68689i(@C12579k C15507w wVar, long j) {
        Intrinsics.checkNotNullParameter(wVar, "$this$isOutOfBounds");
        long q = wVar.mo44177q();
        float p = C15094f.m64880p(q);
        float r = C15094f.m64882r(q);
        int m = C16500q.m74662m(j);
        int j2 = C16500q.m74659j(j);
        if (p < 0.0f || p > ((float) m) || r < 0.0f || r > ((float) j2)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m68690j(@C12579k C15507w wVar, long j, long j2) {
        Intrinsics.checkNotNullParameter(wVar, "$this$isOutOfBounds");
        if (!C15481i0.m68620i(wVar.mo44185y(), C15481i0.f38500b.mo44075d())) {
            return m68689i(wVar, j);
        }
        long q = wVar.mo44177q();
        float p = C15094f.m64880p(q);
        float r = C15094f.m64882r(q);
        float m = ((float) C16500q.m74662m(j)) + C15104m.m65023t(j2);
        float f = -C15104m.m65016m(j2);
        float j3 = ((float) C16500q.m74659j(j)) + C15104m.m65016m(j2);
        if (p < (-C15104m.m65023t(j2)) || p > m || r < f || r > j3) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final long m68691k(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return m68694n(wVar, false);
    }

    @C11395k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @C11587t0(expression = "isConsumed", imports = {}))
    /* renamed from: l */
    public static final boolean m68692l(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return wVar.mo44167A();
    }

    /* renamed from: m */
    public static final long m68693m(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return m68694n(wVar, true);
    }

    /* renamed from: n */
    public static final long m68694n(C15507w wVar, boolean z) {
        long u = C15094f.m64885u(wVar.mo44177q(), wVar.mo44181u());
        if (z || !wVar.mo44167A()) {
            return u;
        }
        return C15094f.f37256b.mo42248e();
    }

    /* renamed from: o */
    public static /* synthetic */ long m68695o(C15507w wVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m68694n(wVar, z);
    }

    /* renamed from: p */
    public static final boolean m68696p(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return !C15094f.m64876l(m68694n(wVar, false), C15094f.f37256b.mo42248e());
    }

    /* renamed from: q */
    public static final boolean m68697q(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return !C15094f.m64876l(m68694n(wVar, true), C15094f.f37256b.mo42248e());
    }
}
