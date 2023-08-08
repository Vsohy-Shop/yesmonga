package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C2830i;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15100j;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.C15591p;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.selection.m */
public final class C2835m {

    /* renamed from: androidx.compose.foundation.text.selection.m$a */
    public /* synthetic */ class C2836a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.Handle[] r0 = androidx.compose.foundation.text.Handle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionStart     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.Cursor     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C2835m.C2836a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final long m13093a(@C12579k SelectionManager selectionManager, long j) {
        int i;
        Intrinsics.checkNotNullParameter(selectionManager, "manager");
        C2830i F = selectionManager.mo9629F();
        if (F == null) {
            return C15094f.f37256b.mo42247c();
        }
        Handle x = selectionManager.mo9672x();
        if (x == null) {
            i = -1;
        } else {
            i = C2836a.$EnumSwitchMapping$0[x.ordinal()];
        }
        if (i == -1) {
            return C15094f.f37256b.mo42247c();
        }
        if (i == 1) {
            return m13094b(selectionManager, j, F.mo9872h(), true);
        }
        if (i == 2) {
            return m13094b(selectionManager, j, F.mo9870f(), false);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
    }

    /* renamed from: b */
    public static final long m13094b(SelectionManager selectionManager, long j, C2830i.C2831a aVar, boolean z) {
        C2829h q = selectionManager.mo9665q(aVar);
        if (q == null) {
            return C15094f.f37256b.mo42247c();
        }
        C15588o s = selectionManager.mo9667s();
        if (s == null) {
            return C15094f.f37256b.mo42247c();
        }
        C15588o e = q.mo9858e();
        if (e == null) {
            return C15094f.f37256b.mo42247c();
        }
        int g = aVar.mo9883g();
        if (!z) {
            g--;
        }
        if (g > q.mo9860g()) {
            return C15094f.f37256b.mo42247c();
        }
        C15094f u = selectionManager.mo9669u();
        Intrinsics.checkNotNull(u);
        float p = C15094f.m64880p(e.mo44430K(s, u.mo42242A()));
        long j2 = q.mo9863j(g);
        C15098i c = q.mo9857c(C16356n0.m73740l(j2));
        C15098i c2 = q.mo9857c(C11479u.m44447u(C16356n0.m73739k(j2) - 1, C16356n0.m73740l(j2)));
        float H = C11479u.m44331H(p, Math.min(c.mo42279t(), c2.mo42279t()), Math.max(c.mo42283x(), c2.mo42283x()));
        if (Math.abs(p - H) > ((float) (C16500q.m74662m(j) / 2))) {
            return C15094f.f37256b.mo42247c();
        }
        return s.mo44430K(e, C15096g.m64898a(H, C15094f.m64882r(q.mo9857c(g).mo42275o())));
    }

    /* renamed from: c */
    public static final boolean m13095c(@C12579k C15098i iVar, long j) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(iVar, "$this$containsInclusive");
        float t = iVar.mo42279t();
        float x = iVar.mo42283x();
        float p = C15094f.m64880p(j);
        if (t > p || p > x) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float B = iVar.mo42249B();
            float j2 = iVar.mo42271j();
            float r = C15094f.m64882r(j);
            if (B > r || r > j2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @C12579k
    /* renamed from: d */
    public static final C16156d m13096d(@C12579k C2829h hVar, @C12579k C2830i iVar) {
        Intrinsics.checkNotNullParameter(hVar, "selectable");
        Intrinsics.checkNotNullParameter(iVar, "selection");
        C16156d a = hVar.mo9855a();
        if (hVar.mo9861h() != iVar.mo9872h().mo9884h() && hVar.mo9861h() != iVar.mo9870f().mo9884h()) {
            return a;
        }
        if (hVar.mo9861h() == iVar.mo9872h().mo9884h() && hVar.mo9861h() == iVar.mo9870f().mo9884h()) {
            if (iVar.mo9871g()) {
                return a.subSequence(iVar.mo9870f().mo9883g(), iVar.mo9872h().mo9883g());
            }
            return a.subSequence(iVar.mo9872h().mo9883g(), iVar.mo9870f().mo9883g());
        } else if (hVar.mo9861h() == iVar.mo9872h().mo9884h()) {
            if (iVar.mo9871g()) {
                return a.subSequence(0, iVar.mo9872h().mo9883g());
            }
            return a.subSequence(iVar.mo9872h().mo9883g(), a.length());
        } else if (iVar.mo9871g()) {
            return a.subSequence(iVar.mo9870f().mo9883g(), a.length());
        } else {
            return a.subSequence(0, iVar.mo9870f().mo9883g());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.mo9874i(r1);
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.C2830i m13097e(@org.jetbrains.annotations.C12580l androidx.compose.foundation.text.selection.C2830i r0, @org.jetbrains.annotations.C12580l androidx.compose.foundation.text.selection.C2830i r1) {
        /*
            if (r0 == 0) goto L_0x000a
            androidx.compose.foundation.text.selection.i r0 = r0.mo9874i(r1)
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            r1 = r0
        L_0x000a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C2835m.m13097e(androidx.compose.foundation.text.selection.i, androidx.compose.foundation.text.selection.i):androidx.compose.foundation.text.selection.i");
    }

    @C12579k
    /* renamed from: f */
    public static final C15098i m13098f(@C12579k C15588o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        C15098i c = C15591p.m69301c(oVar);
        return C15100j.m64954a(oVar.mo44432T(c.mo42251E()), oVar.mo44432T(c.mo42274n()));
    }
}
