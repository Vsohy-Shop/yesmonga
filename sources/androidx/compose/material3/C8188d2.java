package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16497o;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.window.C16546g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.material3.d2 */
public final class C8188d2 implements C16546g {

    /* renamed from: a */
    public final int f20058a;

    public C8188d2(int i) {
        this.f20058a = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C8188d2 m27020d(C8188d2 d2Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = d2Var.f20058a;
        }
        return d2Var.mo12533c(i);
    }

    /* renamed from: a */
    public long mo9854a(@C12579k C16497o oVar, long j, @C12579k LayoutDirection layoutDirection, long j2) {
        Intrinsics.checkNotNullParameter(oVar, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int x = oVar.mo47890x();
        if (C16500q.m74662m(j2) + x > C16500q.m74662m(j) && (x = oVar.mo47886t() - C16500q.m74662m(j2)) < 0) {
            x = oVar.mo47886t() + ((oVar.mo47862G() - C16500q.m74662m(j2)) / 2);
        }
        int B = (oVar.mo47858B() - C16500q.m74659j(j2)) - this.f20058a;
        if (B < 0) {
            B = this.f20058a + oVar.mo47878j();
        }
        return C16496n.m74593a(x, B);
    }

    /* renamed from: b */
    public final int mo12532b() {
        return this.f20058a;
    }

    @C12579k
    /* renamed from: c */
    public final C8188d2 mo12533c(int i) {
        return new C8188d2(i);
    }

    /* renamed from: e */
    public final int mo12534e() {
        return this.f20058a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8188d2) && this.f20058a == ((C8188d2) obj).f20058a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f20058a);
    }

    @C12579k
    public String toString() {
        return "RichTooltipPositionProvider(tooltipAnchorPadding=" + this.f20058a + ')';
    }
}
