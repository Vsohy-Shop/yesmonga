package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;
import androidx.annotation.C0359n0;

/* renamed from: androidx.core.content.a */
public final class C17309a {
    @C0359n0
    /* renamed from: a */
    public static Context m79711a(@C0359n0 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
