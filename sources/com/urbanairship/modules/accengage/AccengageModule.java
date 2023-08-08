package com.urbanairship.modules.accengage;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.modules.Module;
import java.util.Collections;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AccengageModule extends Module {

    /* renamed from: c */
    public final AccengageNotificationHandler f25736c;

    public AccengageModule(@C0359n0 C36040b bVar, @C0359n0 AccengageNotificationHandler accengageNotificationHandler) {
        super(Collections.singleton(bVar));
        this.f25736c = accengageNotificationHandler;
    }

    @C0359n0
    public AccengageNotificationHandler getAccengageNotificationHandler() {
        return this.f25736c;
    }
}
