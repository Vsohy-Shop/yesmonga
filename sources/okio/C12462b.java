package okio;

import java.util.zip.Deflater;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "-DeflaterSinkExtensions")
/* renamed from: okio.b */
public final class C12462b {
    @C12579k
    /* renamed from: a */
    public static final C12515r m50464a(@C12579k C12506n0 n0Var, @C12579k Deflater deflater) {
        Intrinsics.checkNotNullParameter(n0Var, "$this$deflate");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        return new C12515r(n0Var, deflater);
    }

    /* renamed from: b */
    public static /* synthetic */ C12515r m50465b(C12506n0 n0Var, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        Intrinsics.checkNotNullParameter(n0Var, "$this$deflate");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        return new C12515r(n0Var, deflater);
    }
}
