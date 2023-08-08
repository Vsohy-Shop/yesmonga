package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.draw.a */
public final class C8740a {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m32500a(@C12579k C8767m mVar, float f) {
        boolean z;
        C8767m mVar2 = mVar;
        Intrinsics.checkNotNullParameter(mVar2, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C15320t2.m66561e(mVar, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, true, (C15329u3) null, 0, 0, 0, 126971, (Object) null);
        }
        return mVar2;
    }
}
