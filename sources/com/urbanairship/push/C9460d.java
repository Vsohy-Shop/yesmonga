package com.urbanairship.push;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17230s5;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.urbanairship.push.d */
public class C9460d {

    /* renamed from: a */
    public final String f25880a;

    /* renamed from: b */
    public final boolean f25881b;

    /* renamed from: c */
    public final Bundle f25882c;

    /* renamed from: d */
    public final String f25883d;

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9460d(@C0359n0 String str, boolean z, @C0363p0 Bundle bundle, @C0363p0 String str2) {
        this.f25880a = str;
        this.f25881b = z;
        this.f25882c = bundle;
        this.f25883d = str2;
    }

    /* renamed from: a */
    public static C9460d m35554a(Intent intent) {
        String stringExtra = intent.getStringExtra(C9537t.f26071K);
        if (stringExtra == null) {
            return null;
        }
        return new C9460d(stringExtra, intent.getBooleanExtra(C9537t.f26072L, true), C17230s5.m79567p(intent), intent.getStringExtra(C9537t.f26075O));
    }

    @C0359n0
    /* renamed from: b */
    public String mo19234b() {
        return this.f25880a;
    }

    @C0363p0
    /* renamed from: c */
    public String mo19235c() {
        return this.f25883d;
    }

    @C0363p0
    /* renamed from: d */
    public Bundle mo19236d() {
        return this.f25882c;
    }

    /* renamed from: e */
    public boolean mo19237e() {
        return this.f25881b;
    }

    @C0359n0
    public String toString() {
        return "NotificationActionButtonInfo{buttonId='" + this.f25880a + '\'' + ", isForeground=" + this.f25881b + ", remoteInput=" + this.f25882c + ", description='" + this.f25883d + '\'' + C12361b.f30259j;
    }
}
