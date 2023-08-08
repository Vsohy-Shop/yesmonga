package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16258g0;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16454v;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.x */
public final class C2850x {
    /* renamed from: a */
    public static final boolean m13146a(@C12579k C16260h0 h0Var, @C12579k C16156d dVar, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16454v>> list, int i, boolean z, int i2, @C12579k C16479d dVar2, @C12579k LayoutDirection layoutDirection, @C12579k C16242u.C16244b bVar, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$canReuse");
        Intrinsics.checkNotNullParameter(dVar, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(list, "placeholders");
        Intrinsics.checkNotNullParameter(dVar2, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(bVar, "fontFamilyResolver");
        C16258g0 l = h0Var.mo47058l();
        if (h0Var.mo47069w().mo47407i().mo46229c() || !Intrinsics.areEqual((Object) l.mo47040n(), (Object) dVar) || !l.mo47039m().mo47489R(p0Var) || !Intrinsics.areEqual((Object) l.mo47036i(), (Object) list) || l.mo47033g() != i || l.mo47038l() != z || !C16449r.m74263g(l.mo47034h(), i2) || !Intrinsics.areEqual((Object) l.mo47029d(), (Object) dVar2) || l.mo47032f() != layoutDirection || !Intrinsics.areEqual((Object) l.mo47030e(), (Object) bVar) || C16476b.m74364r(j) != C16476b.m74364r(l.mo47028c())) {
            return false;
        }
        if (!z && !C16449r.m74263g(i2, C16449r.f40760b.mo47727c())) {
            return true;
        }
        if (C16476b.m74362p(j) == C16476b.m74362p(l.mo47028c()) && C16476b.m74361o(j) == C16476b.m74361o(l.mo47028c())) {
            return true;
        }
        return false;
    }
}
