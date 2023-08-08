package com.urbanairship.iam.fullscreen;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import com.urbanairship.iam.C9206k;
import com.urbanairship.iam.C9269z;
import com.urbanairship.iam.DisplayHandler;
import com.urbanairship.iam.InAppMessage;

/* renamed from: com.urbanairship.iam.fullscreen.a */
public class C9183a extends C9269z {
    public C9183a(@C0359n0 InAppMessage inAppMessage, @C0359n0 C9185c cVar) {
        super(inAppMessage, cVar.mo18431s());
    }

    @C0359n0
    /* renamed from: h */
    public static C9183a m34433h(@C0359n0 InAppMessage inAppMessage) {
        C9185c cVar = (C9185c) inAppMessage.mo18182n();
        if (cVar != null) {
            return new C9183a(inAppMessage, cVar);
        }
        throw new IllegalArgumentException("Invalid message for adapter: " + inAppMessage);
    }

    /* renamed from: b */
    public void mo18322b(@C0359n0 Context context, @C0359n0 DisplayHandler displayHandler) {
        context.startActivity(new Intent(context, FullScreenActivity.class).setFlags(268435456).putExtra(C9206k.f25060Y0, displayHandler).putExtra("in_app_message", mo18650f()).putExtra(C9206k.f25062a1, mo18649e()));
    }
}
