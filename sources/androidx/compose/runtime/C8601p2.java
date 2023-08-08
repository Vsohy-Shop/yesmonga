package androidx.compose.runtime;

import android.os.Trace;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.p2 */
public final class C8601p2 {
    @C12579k

    /* renamed from: a */
    public static final C8601p2 f23036a = new C8601p2();

    @C12580l
    /* renamed from: a */
    public final Object mo16288a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Trace.beginSection(str);
        return null;
    }

    /* renamed from: b */
    public final void mo16289b(@C12580l Object obj) {
        Trace.endSection();
    }
}
