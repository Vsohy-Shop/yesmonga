package okio;

import java.util.zip.Inflater;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "-InflaterSourceExtensions")
/* renamed from: okio.h */
public final class C12475h {
    @C12579k
    /* renamed from: a */
    public static final C12461a0 m50544a(@C12579k C12510p0 p0Var, @C12579k Inflater inflater) {
        Intrinsics.checkNotNullParameter(p0Var, "$this$inflate");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new C12461a0(p0Var, inflater);
    }

    /* renamed from: b */
    public static /* synthetic */ C12461a0 m50545b(C12510p0 p0Var, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        Intrinsics.checkNotNullParameter(p0Var, "$this$inflate");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return new C12461a0(p0Var, inflater);
    }
}
