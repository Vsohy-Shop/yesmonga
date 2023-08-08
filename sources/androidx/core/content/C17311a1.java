package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.C18007x;

/* renamed from: androidx.core.content.a1 */
public final /* synthetic */ class C17311a1 implements C18007x {

    /* renamed from: a */
    public final /* synthetic */ UriMatcher f45583a;

    public /* synthetic */ C17311a1(UriMatcher uriMatcher) {
        this.f45583a = uriMatcher;
    }

    public final boolean test(Object obj) {
        return C17315b1.m79716c(this.f45583a, (Uri) obj);
    }
}
