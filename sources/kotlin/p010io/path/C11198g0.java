package kotlin.p010io.path;

import com.carrefour.fid.android.shared.constant.C28515a1;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.io.path.g0 */
public final class C11198g0 {
    @C12579k

    /* renamed from: a */
    public static final C11198g0 f28384a = new C11198g0();

    /* renamed from: b */
    public static final Path f28385b = Paths.get("", new String[0]);

    /* renamed from: c */
    public static final Path f28386c = Paths.get("..", new String[0]);

    @C12579k
    /* renamed from: a */
    public final Path mo22654a(@C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(path2, "base");
        Path a = path2.normalize();
        Path a2 = path.normalize();
        Path a3 = a.relativize(a2);
        int min = Math.min(a.getNameCount(), a2.getNameCount());
        int i = 0;
        while (i < min) {
            Path a4 = a.getName(i);
            Path path3 = f28386c;
            if (!Intrinsics.areEqual((Object) a4, (Object) path3)) {
                break;
            } else if (Intrinsics.areEqual((Object) a2.getName(i), (Object) path3)) {
                i++;
            } else {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual((Object) a2, (Object) a) || !Intrinsics.areEqual((Object) a, (Object) f28385b)) {
            String obj = a3.toString();
            String a5 = a3.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(a5, "rn.fileSystem.separator");
            if (C11622t.endsWith$default(obj, a5, false, 2, (Object) null)) {
                a2 = a3.getFileSystem().getPath(StringsKt___StringsKt.dropLast(obj, a3.getFileSystem().getSeparator().length()), new String[0]);
            } else {
                a2 = a3;
            }
        }
        Intrinsics.checkNotNullExpressionValue(a2, C28515a1.f68703k);
        return a2;
    }
}
