package kotlin.p010io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.io.k */
public class C11158k extends FilesKt__FileReadWriteKt {
    @C12579k
    /* renamed from: J */
    public static final C11148h m43074J(@C12579k File file, @C12579k FileWalkDirection fileWalkDirection) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(fileWalkDirection, "direction");
        return new C11148h(file, fileWalkDirection);
    }

    /* renamed from: K */
    public static /* synthetic */ C11148h m43075K(File file, FileWalkDirection fileWalkDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return m43074J(file, fileWalkDirection);
    }

    @C12579k
    /* renamed from: L */
    public static final C11148h m43076L(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return m43074J(file, FileWalkDirection.BOTTOM_UP);
    }

    @C12579k
    /* renamed from: M */
    public static final C11148h m43077M(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return m43074J(file, FileWalkDirection.TOP_DOWN);
    }
}
