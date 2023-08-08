package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import com.google.firebase.messaging.C33180f;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService extends C33200j {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    @C0344h1
    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    /* renamed from: g */
    public final boolean mo95953g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Received duplicate message: ");
            sb.append(str);
            return true;
        }
    }

    public Intent getStartCommandIntent(Intent intent) {
        return C33254w0.m134108b().mo96212c();
    }

    /* renamed from: h */
    public final void mo95955h(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C33209l0.m133960v(extras)) {
            C33209l0 l0Var = new C33209l0(extras);
            ExecutorService f = C33217o.m134017f();
            try {
                if (!new C33191g(this, l0Var, f).mo96082a()) {
                    f.shutdown();
                    if (C33202j0.m133916E(intent)) {
                        C33202j0.m133940w(intent);
                    }
                } else {
                    return;
                }
            } finally {
                f.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            mo95958j(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown intent action: ");
            sb.append(intent.getAction());
        }
    }

    /* renamed from: i */
    public final String mo95957i(Intent intent) {
        String stringExtra = intent.getStringExtra(C33180f.C33184d.f80615h);
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* renamed from: j */
    public final void mo95958j(Intent intent) {
        if (!mo95953g(intent.getStringExtra(C33180f.C33184d.f80615h))) {
            mo95959k(intent);
        }
    }

    /* renamed from: k */
    public final void mo95959k(Intent intent) {
        String stringExtra = intent.getStringExtra(C33180f.C33184d.f80611d);
        if (stringExtra == null) {
            stringExtra = C33180f.C33185e.f80624a;
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(C33180f.C33185e.f80625b)) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(C33180f.C33185e.f80624a)) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals(C33180f.C33185e.f80627d)) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals(C33180f.C33185e.f80626c)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                onDeletedMessages();
                return;
            case 1:
                C33202j0.m133942y(intent);
                mo95955h(intent);
                return;
            case 2:
                onSendError(mo95957i(intent), new SendException(intent.getStringExtra("error")));
                return;
            case 3:
                onMessageSent(intent.getStringExtra(C33180f.C33184d.f80615h));
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Received message with unknown type: ");
                sb.append(stringExtra);
                return;
        }
    }

    @C0348i1
    public void onDeletedMessages() {
    }

    @C0348i1
    public void onMessageReceived(@C0359n0 RemoteMessage remoteMessage) {
    }

    @C0348i1
    public void onMessageSent(@C0359n0 String str) {
    }

    @C0348i1
    public void onNewToken(@C0359n0 String str) {
    }

    @C0348i1
    public void onSendError(@C0359n0 String str, @C0359n0 Exception exc) {
    }
}
