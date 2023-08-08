package androidx.core.content;

import android.net.Uri;
import androidx.core.util.C18007x;

/* renamed from: androidx.core.content.r */
public final /* synthetic */ class C17448r implements C18007x {

    /* renamed from: a */
    public final /* synthetic */ String f45713a;

    public /* synthetic */ C17448r(String str) {
        this.f45713a = str;
    }

    public final boolean test(Object obj) {
        return this.f45713a.equals(((Uri) obj).getAuthority());
    }
}
