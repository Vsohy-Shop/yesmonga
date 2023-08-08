package com.urbanairship.push;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface PushProvider {
    @C0359n0

    /* renamed from: a */
    public static final String f25852a = "adm";
    @C0359n0

    /* renamed from: b */
    public static final String f25853b = "fcm";
    @C0359n0

    /* renamed from: c */
    public static final String f25854c = "hms";

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.push.PushProvider$a */
    public @interface C9446a {
    }

    @C0359n0
    String getDeliveryType();

    int getPlatform();

    @C0363p0
    String getRegistrationToken(@C0359n0 Context context) throws RegistrationException;

    boolean isAvailable(@C0359n0 Context context);

    boolean isSupported(@C0359n0 Context context);

    public static class RegistrationException extends Exception {
        private final boolean isRecoverable;

        public RegistrationException(@C0359n0 String str, boolean z, @C0363p0 Throwable th) {
            super(str, th);
            this.isRecoverable = z;
        }

        /* renamed from: a */
        public boolean mo19203a() {
            return this.isRecoverable;
        }

        public RegistrationException(@C0359n0 String str, boolean z) {
            super(str);
            this.isRecoverable = z;
        }
    }
}
