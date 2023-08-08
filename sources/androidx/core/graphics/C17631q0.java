package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import androidx.annotation.C0376v0;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.graphics.q0 */
public final class C17631q0 {
    @C0376v0(19)
    @C12579k
    /* renamed from: a */
    public static final Path m80726a(@C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "p");
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: b */
    public static final Iterable<C17639s0> m80727b(@C12579k Path path, float f) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Collection<C17639s0> b = C17645u0.m80763b(path, f);
        Intrinsics.checkNotNullExpressionValue(b, "flatten(this, error)");
        return b;
    }

    /* renamed from: c */
    public static /* synthetic */ Iterable m80728c(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return m80727b(path, f);
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: d */
    public static final Path m80729d(@C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: e */
    public static final Path m80730e(@C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: f */
    public static final Path m80731f(@C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @C0376v0(19)
    @C12579k
    /* renamed from: g */
    public static final Path m80732g(@C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
