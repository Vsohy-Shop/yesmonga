package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;

@Deprecated
/* renamed from: androidx.browser.browseractions.a */
public class C0880a {

    /* renamed from: a */
    public final String f2729a;
    @C0363p0

    /* renamed from: b */
    public final PendingIntent f2730b;
    @C0375v

    /* renamed from: c */
    public int f2731c;
    @C0363p0

    /* renamed from: d */
    public Uri f2732d;
    @C0363p0

    /* renamed from: e */
    public Runnable f2733e;

    public C0880a(@C0359n0 String str, @C0359n0 PendingIntent pendingIntent, @C0375v int i) {
        this.f2729a = str;
        this.f2730b = pendingIntent;
        this.f2731c = i;
    }

    @C0359n0
    /* renamed from: a */
    public PendingIntent mo3844a() {
        PendingIntent pendingIntent = this.f2730b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    /* renamed from: b */
    public int mo3845b() {
        return this.f2731c;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public Uri mo3846c() {
        return this.f2732d;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public Runnable mo3847d() {
        return this.f2733e;
    }

    @C0359n0
    /* renamed from: e */
    public String mo3848e() {
        return this.f2729a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C0880a(@C0359n0 String str, @C0359n0 PendingIntent pendingIntent, @C0359n0 Uri uri) {
        this.f2729a = str;
        this.f2730b = pendingIntent;
        this.f2732d = uri;
    }

    public C0880a(@C0359n0 String str, @C0359n0 Runnable runnable) {
        this.f2729a = str;
        this.f2730b = null;
        this.f2733e = runnable;
    }

    public C0880a(@C0359n0 String str, @C0359n0 PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
