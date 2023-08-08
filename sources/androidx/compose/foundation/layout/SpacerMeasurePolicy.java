package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.unit.C16476b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class SpacerMeasurePolicy implements C15560f0 {
    @C12579k

    /* renamed from: a */
    public static final SpacerMeasurePolicy f6165a = new SpacerMeasurePolicy();

    @C12579k
    /* renamed from: a */
    public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        int i;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(list, "measurables");
        int i2 = 0;
        if (C16476b.m74360n(j)) {
            i = C16476b.m74362p(j);
        } else {
            i = 0;
        }
        if (C16476b.m74358l(j)) {
            i2 = C16476b.m74361o(j);
        }
        return C15568h0.m69206r2(h0Var, i, i2, (Map) null, SpacerMeasurePolicy$measure$1$1.f6166f, 4, (Object) null);
    }
}
