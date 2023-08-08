package com.urbanairship.push.adm;

import androidx.annotation.RestrictTo;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.urbanairship.C36059m;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AdmPushReceiver extends ADMMessageReceiver {
    public AdmPushReceiver() {
        super(AdmHandlerBase.class);
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
            registerJobServiceClass(AdmHandlerJobBase.class, 3004);
        } catch (ClassNotFoundException e) {
            C36059m.m148421q("Using legacy ADM class : " + e.getMessage(), new Object[0]);
        }
    }
}
