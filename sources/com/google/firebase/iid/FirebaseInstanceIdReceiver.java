package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import com.google.android.gms.cloudmessaging.C40434a;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.messaging.C33202j0;
import com.google.firebase.messaging.C33215n;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends C40434a {
    private static final String TAG = "FirebaseMessaging";

    private static Intent createServiceIntent(@C0359n0 Context context, @C0359n0 String str, @C0359n0 Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @C0348i1
    public int onMessageReceive(@C0359n0 Context context, @C0359n0 CloudMessage cloudMessage) {
        try {
            return ((Integer) C31053n.m124519a(new C33215n(context).mo96144i(cloudMessage.mo133528X()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @C0348i1
    public void onNotificationDismissed(@C0359n0 Context context, @C0359n0 Bundle bundle) {
        Intent createServiceIntent = createServiceIntent(context, C40434a.C40435a.f103053b, bundle);
        if (C33202j0.m133916E(createServiceIntent)) {
            C33202j0.m133939v(createServiceIntent);
        }
    }
}
