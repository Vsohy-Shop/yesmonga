package androidx.compose.p004ui.graphics.painter;

import androidx.compose.p004ui.graphics.C15299q2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16502r;
import com.urbanairship.iam.C9127a0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.painter.b */
public final class C15293b {
    @C12579k
    /* renamed from: a */
    public static final C15292a m66420a(@C12579k C15403w2 w2Var, long j, long j2, int i) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        C15292a aVar = new C15292a(w2Var, j, j2, (DefaultConstructorMarker) null);
        aVar.mo42956p(i);
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C15292a m66421b(C15403w2 w2Var, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = C16494m.f40890b.mo47857a();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = C16502r.m74668a(w2Var.getWidth(), w2Var.getHeight());
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = C15299q2.f37647b.mo42973b();
        }
        return m66420a(w2Var, j3, j4, i);
    }
}
