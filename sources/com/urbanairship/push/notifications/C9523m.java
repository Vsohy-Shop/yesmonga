package com.urbanairship.push.notifications;

import android.app.Notification;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.push.notifications.m */
public class C9523m {
    /* renamed from: a */
    public static void m35724a(@C0359n0 Notification notification, @C0359n0 C9515j jVar) {
        notification.priority = m35726c(jVar.mo19334i());
        if (jVar.mo19334i() < 3) {
            notification.vibrate = null;
            notification.sound = null;
            notification.ledARGB = 0;
            notification.flags &= -2;
            notification.defaults = 0;
            return;
        }
        if (jVar.mo19339n() != null) {
            notification.sound = jVar.mo19339n();
            notification.defaults &= -2;
        }
        if (jVar.mo19323B()) {
            notification.flags |= 1;
            if (jVar.mo19335j() != 0) {
                notification.ledARGB = jVar.mo19335j();
                notification.defaults &= -5;
            } else {
                notification.defaults |= 4;
            }
        }
        if (!jVar.mo19324C()) {
            return;
        }
        if (jVar.mo19340o() != null) {
            notification.vibrate = jVar.mo19340o();
            notification.defaults &= -3;
            return;
        }
        notification.defaults |= 2;
    }

    @C0348i1
    @C0359n0
    /* renamed from: b */
    public static String m35725b(@C0363p0 String str, @C0359n0 String str2) {
        if (str == null) {
            return str2;
        }
        if (str2.equals(str) || UAirship.m146188Y().mo106203E().mo19417b0().mo19357k(str) != null) {
            return str;
        }
        C36059m.m148409e("Notification channel %s does not exist. Falling back to %s", str, str2);
        return str2;
    }

    /* renamed from: c */
    public static int m35726c(int i) {
        if (i == 1) {
            return -2;
        }
        if (i == 3) {
            return 0;
        }
        if (i != 4) {
            return i != 5 ? -1 : 2;
        }
        return 1;
    }
}
