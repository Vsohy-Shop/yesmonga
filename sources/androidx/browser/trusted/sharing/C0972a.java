package androidx.browser.trusted.sharing;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.browser.trusted.sharing.a */
public final class C0972a {

    /* renamed from: d */
    public static final String f3021d = "androidx.browser.trusted.sharing.KEY_TITLE";

    /* renamed from: e */
    public static final String f3022e = "androidx.browser.trusted.sharing.KEY_TEXT";

    /* renamed from: f */
    public static final String f3023f = "androidx.browser.trusted.sharing.KEY_URIS";
    @C0363p0

    /* renamed from: a */
    public final String f3024a;
    @C0363p0

    /* renamed from: b */
    public final String f3025b;
    @C0363p0

    /* renamed from: c */
    public final List<Uri> f3026c;

    public C0972a(@C0363p0 String str, @C0363p0 String str2, @C0363p0 List<Uri> list) {
        this.f3024a = str;
        this.f3025b = str2;
        this.f3026c = list;
    }

    @C0359n0
    /* renamed from: a */
    public static C0972a m4328a(@C0359n0 Bundle bundle) {
        return new C0972a(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), bundle.getParcelableArrayList(f3023f));
    }

    @C0359n0
    /* renamed from: b */
    public Bundle mo4061b() {
        Bundle bundle = new Bundle();
        bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f3024a);
        bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f3025b);
        if (this.f3026c != null) {
            bundle.putParcelableArrayList(f3023f, new ArrayList(this.f3026c));
        }
        return bundle;
    }
}
