package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "DataStoreFile")
/* renamed from: androidx.datastore.a */
public final class C18557a {
    @C12579k
    /* renamed from: a */
    public static final File m83995a(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), Intrinsics.stringPlus("datastore/", str));
    }
}
