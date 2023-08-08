package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.C18557a;
import java.io.File;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "PreferenceDataStoreFile")
/* renamed from: androidx.datastore.preferences.a */
public final class C18598a {
    @C12579k
    /* renamed from: a */
    public static final File m84320a(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        return C18557a.m83995a(context, Intrinsics.stringPlus(str, ".preferences_pb"));
    }
}
