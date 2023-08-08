package com.urbanairship.push.fcm;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.messaging.RemoteMessage;
import com.urbanairship.C36062p;
import com.urbanairship.push.C9539u;
import com.urbanairship.push.PushMessage;
import java.util.concurrent.Future;

/* renamed from: com.urbanairship.push.fcm.a */
public class C9466a {

    /* renamed from: com.urbanairship.push.fcm.a$a */
    public class C9467a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C36062p f25902a;

        public C9467a(C36062p pVar) {
            this.f25902a = pVar;
        }

        public void run() {
            this.f25902a.mo107828g(null);
        }
    }

    /* renamed from: a */
    public static boolean m35572a(@C0359n0 RemoteMessage remoteMessage) {
        return new PushMessage(remoteMessage.mo95969Q()).mo19160G();
    }

    @C0359n0
    /* renamed from: b */
    public static Future<Void> m35573b(@C0359n0 Context context, @C0359n0 RemoteMessage remoteMessage) {
        C36062p pVar = new C36062p();
        C9539u.m35826a(FcmPushProvider.class, new PushMessage(remoteMessage.mo95969Q())).mo19440b(context, new C9467a(pVar));
        return pVar;
    }

    /* renamed from: c */
    public static void m35574c(@C0359n0 Context context, @C0359n0 RemoteMessage remoteMessage) {
        C9539u.m35826a(FcmPushProvider.class, new PushMessage(remoteMessage.mo95969Q())).mo19441c(context);
    }

    @Deprecated
    /* renamed from: d */
    public static void m35575d(@C0359n0 Context context) {
        m35576e(context, (String) null);
    }

    /* renamed from: e */
    public static void m35576e(@C0359n0 Context context, @C0363p0 String str) {
        C9539u.m35828c(context, FcmPushProvider.class, str);
    }
}
