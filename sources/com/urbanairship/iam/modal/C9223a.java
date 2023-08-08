package com.urbanairship.iam.modal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import com.urbanairship.iam.C9206k;
import com.urbanairship.iam.C9269z;
import com.urbanairship.iam.DisplayHandler;
import com.urbanairship.iam.InAppMessage;

/* renamed from: com.urbanairship.iam.modal.a */
public class C9223a extends C9269z {
    public C9223a(@C0359n0 InAppMessage inAppMessage, @C0359n0 C9225c cVar) {
        super(inAppMessage, cVar.mo18532v());
    }

    @C0359n0
    /* renamed from: h */
    public static C9223a m34628h(@C0359n0 InAppMessage inAppMessage) {
        C9225c cVar = (C9225c) inAppMessage.mo18182n();
        if (cVar != null) {
            return new C9223a(inAppMessage, cVar);
        }
        throw new IllegalArgumentException("Invalid message for adapter: " + inAppMessage);
    }

    /* renamed from: b */
    public void mo18322b(@C0359n0 Context context, @C0359n0 DisplayHandler displayHandler) {
        context.startActivity(new Intent(context, ModalActivity.class).setFlags(268435456).putExtra(C9206k.f25060Y0, displayHandler).putExtra("in_app_message", mo18650f()).putExtra(C9206k.f25062a1, mo18649e()));
    }
}
