package com.google.android.play.core.review;

import android.app.PendingIntent;

/* renamed from: com.google.android.play.core.review.a */
final class C32119a extends ReviewInfo {

    /* renamed from: a */
    public final PendingIntent f78339a;

    public C32119a(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.f78339a = pendingIntent;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* renamed from: a */
    public final PendingIntent mo92871a() {
        return this.f78339a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f78339a.equals(((ReviewInfo) obj).mo92871a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f78339a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f78339a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 26);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
