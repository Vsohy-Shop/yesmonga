package kotlin.p010io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.io.e */
public final class C11136e {
    /* renamed from: b */
    public static final String m42977b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
