package androidx.core.content;

import android.net.Uri;
import androidx.core.util.C18007x;

/* renamed from: androidx.core.content.t */
public final /* synthetic */ class C17489t implements C18007x {

    /* renamed from: a */
    public final /* synthetic */ String f45791a;

    public /* synthetic */ C17489t(String str) {
        this.f45791a = str;
    }

    public final boolean test(Object obj) {
        return this.f45791a.equals(((Uri) obj).getAuthority());
    }
}
