package androidx.core.content;

import android.net.Uri;
import androidx.core.util.C18007x;

/* renamed from: androidx.core.content.y */
public final /* synthetic */ class C17503y implements C18007x {

    /* renamed from: a */
    public final /* synthetic */ String f45805a;

    public /* synthetic */ C17503y(String str) {
        this.f45805a = str;
    }

    public final boolean test(Object obj) {
        return this.f45805a.equals(((Uri) obj).getAuthority());
    }
}
