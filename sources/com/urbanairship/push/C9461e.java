package com.urbanairship.push;

import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.urbanairship.push.e */
public class C9461e {

    /* renamed from: a */
    public final PushMessage f25884a;

    /* renamed from: b */
    public final int f25885b;

    /* renamed from: c */
    public final String f25886c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9461e(@C0359n0 PushMessage pushMessage, int i, @C0363p0 String str) {
        this.f25884a = pushMessage;
        this.f25886c = str;
        this.f25885b = i;
    }

    @C0363p0
    /* renamed from: a */
    public static C9461e m35559a(@C0363p0 Intent intent) {
        PushMessage c = PushMessage.m35484c(intent);
        if (c == null) {
            return null;
        }
        return new C9461e(c, intent.getIntExtra(C9537t.f26068H, -1), intent.getStringExtra(C9537t.f26069I));
    }

    @C0359n0
    /* renamed from: b */
    public PushMessage mo19239b() {
        return this.f25884a;
    }

    /* renamed from: c */
    public int mo19240c() {
        return this.f25885b;
    }

    @C0363p0
    /* renamed from: d */
    public String mo19241d() {
        return this.f25886c;
    }

    @C0359n0
    public String toString() {
        return "NotificationInfo{alert=" + this.f25884a.mo19171f() + ", notificationId=" + this.f25885b + ", notificationTag='" + this.f25886c + '\'' + C12361b.f30259j;
    }
}
