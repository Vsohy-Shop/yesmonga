package com.urbanairship.push.notifications;

import android.app.Notification;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.urbanairship.push.notifications.o */
public class C9525o {

    /* renamed from: c */
    public static final int f26025c = 0;

    /* renamed from: d */
    public static final int f26026d = 1;

    /* renamed from: e */
    public static final int f26027e = 2;

    /* renamed from: a */
    public final Notification f26028a;

    /* renamed from: b */
    public final int f26029b;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.push.notifications.o$a */
    public @interface C9526a {
    }

    public C9525o(@C0363p0 Notification notification, int i) {
        this.f26028a = notification;
        if (notification == null && i == 0) {
            this.f26029b = 2;
        } else {
            this.f26029b = i;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C9525o m35730a() {
        return new C9525o((Notification) null, 2);
    }

    @C0359n0
    /* renamed from: d */
    public static C9525o m35731d(@C0359n0 Notification notification) {
        return new C9525o(notification, 0);
    }

    @C0359n0
    /* renamed from: e */
    public static C9525o m35732e() {
        return new C9525o((Notification) null, 1);
    }

    @C0363p0
    /* renamed from: b */
    public Notification mo19370b() {
        return this.f26028a;
    }

    /* renamed from: c */
    public int mo19371c() {
        return this.f26029b;
    }
}
