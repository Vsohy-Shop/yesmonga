package androidx.compose.p004ui.graphics;

import android.graphics.Path;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.graphics.t0 */
public final class C15318t0 {
    @C12579k
    /* renamed from: a */
    public static final C15231i3 m66550a() {
        return new C15279o0((Path) null, 1, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: b */
    public static final Path m66551b(@C12579k C15231i3 i3Var) {
        Intrinsics.checkNotNullParameter(i3Var, "<this>");
        if (i3Var instanceof C15279o0) {
            return ((C15279o0) i3Var).mo42922y();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @C12579k
    /* renamed from: c */
    public static final C15231i3 m66552c(@C12579k Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return new C15279o0(path);
    }
}
