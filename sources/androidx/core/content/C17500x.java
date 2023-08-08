package androidx.core.content;

import android.net.Uri;
import androidx.core.util.C18007x;

/* renamed from: androidx.core.content.x */
public final /* synthetic */ class C17500x implements C18007x {

    /* renamed from: a */
    public final /* synthetic */ String f45801a;

    public /* synthetic */ C17500x(String str) {
        this.f45801a = str;
    }

    public final boolean test(Object obj) {
        return this.f45801a.equals(((Uri) obj).getAuthority());
    }
}
