package androidx.compose.foundation.text;

import androidx.compose.p004ui.text.C16355n;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16406s;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16502r;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.u */
public final class C2847u {

    /* renamed from: a */
    public static final int f7472a = 10;
    @C12579k

    /* renamed from: b */
    public static final String f7473b = C11622t.repeat("H", 10);

    /* renamed from: a */
    public static final long m13129a(@C12579k C16361p0 p0Var, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar, @C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(p0Var, "style");
        Intrinsics.checkNotNullParameter(dVar, "density");
        C16242u.C16244b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "fontFamilyResolver");
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "text");
        List E = CollectionsKt__CollectionsKt.m40441E();
        C16355n h = C16406s.m74002h(str2, p0Var, C16478c.m74377b(0, 0, 0, 0, 15, (Object) null), dVar, bVar2, E, (List) null, i, false, 64, (Object) null);
        return C16502r.m74668a(C2787s.m12663a(h.mo46195b()), C2787s.m12663a(h.getHeight()));
    }

    /* renamed from: b */
    public static /* synthetic */ long m13130b(C16361p0 p0Var, C16479d dVar, C16242u.C16244b bVar, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = f7473b;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return m13129a(p0Var, dVar, bVar, str, i);
    }

    @C12579k
    /* renamed from: c */
    public static final String m13131c() {
        return f7473b;
    }
}
