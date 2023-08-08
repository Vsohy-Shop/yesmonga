package androidx.room.util;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "FileUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.c */
public final class C20379c {
    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public static final void m95147a(@C12579k ReadableByteChannel readableByteChannel, @C12579k FileChannel fileChannel) throws IOException {
        Intrinsics.checkNotNullParameter(readableByteChannel, "input");
        Intrinsics.checkNotNullParameter(fileChannel, "output");
        try {
            fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
