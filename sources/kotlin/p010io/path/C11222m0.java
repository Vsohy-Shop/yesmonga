package kotlin.p010io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.io.path.m0 */
public final class C11222m0 {
    /* renamed from: c */
    public static final boolean m43272c(C11269y yVar) {
        for (C11269y c = yVar.mo22687c(); c != null; c = c.mo22687c()) {
            if (c.mo22686b() == null || yVar.mo22686b() == null) {
                try {
                    if (Files.isSameFile(c.mo22688d(), yVar.mo22688d())) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (Intrinsics.areEqual(c.mo22686b(), yVar.mo22686b())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final Object m43273d(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes a = Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            Intrinsics.checkNotNullExpressionValue(a, "readAttributes(this, A::class.java, *options)");
            return a.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }
}
