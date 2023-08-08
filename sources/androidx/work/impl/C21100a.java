package androidx.work.impl;

import android.content.Context;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import com.urbanairship.iam.events.C9175a;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(21)
/* renamed from: androidx.work.impl.a */
public final class C21100a {
    @C12579k

    /* renamed from: a */
    public static final C21100a f54461a = new C21100a();

    @C12579k
    @C0373u
    /* renamed from: a */
    public final File mo63211a(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
