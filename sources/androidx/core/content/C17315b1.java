package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.core.util.C18007x;

/* renamed from: androidx.core.content.b1 */
public class C17315b1 {
    @C0359n0
    /* renamed from: b */
    public static C18007x<Uri> m79715b(@C0359n0 UriMatcher uriMatcher) {
        return new C17311a1(uriMatcher);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m79716c(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
