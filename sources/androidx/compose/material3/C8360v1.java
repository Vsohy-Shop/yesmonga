package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16496n;
import androidx.compose.p004ui.unit.C16497o;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.p004ui.window.C16546g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.material3.v1 */
public final class C8360v1 implements C16546g {

    /* renamed from: a */
    public final int f22439a;

    public C8360v1(int i) {
        this.f22439a = i;
    }

    /* renamed from: a */
    public long mo9854a(@C12579k C16497o oVar, long j, @C12579k LayoutDirection layoutDirection, long j2) {
        Intrinsics.checkNotNullParameter(oVar, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int t = oVar.mo47886t() + ((oVar.mo47862G() - C16500q.m74662m(j2)) / 2);
        int B = (oVar.mo47858B() - C16500q.m74659j(j2)) - this.f22439a;
        if (B < 0) {
            B = this.f22439a + oVar.mo47878j();
        }
        return C16496n.m74593a(t, B);
    }

    /* renamed from: b */
    public final int mo14740b() {
        return this.f22439a;
    }
}
