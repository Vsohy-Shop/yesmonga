package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.draw.n */
public final class C8756n {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m32558a(@C12579k C8767m mVar, float f) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m32559b(mVar, f, f);
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C8767m m32559b(@C12579k C8767m mVar, float f, float f2) {
        boolean z;
        C8767m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar2, "<this>");
        boolean z2 = true;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f2 != 1.0f) {
                z2 = false;
            }
            if (z2) {
                return mVar2;
            }
        }
        return C15320t2.m66561e(mVar, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131068, (Object) null);
    }
}
