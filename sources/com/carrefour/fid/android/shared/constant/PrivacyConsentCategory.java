package com.carrefour.fid.android.shared.constant;

import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/constant/PrivacyConsentCategory;", "", "", "code", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "g", "v", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum PrivacyConsentCategory {
    APPS_FLYER("C0018"),
    USABILLA("C0021"),
    CONTENT_SQUARE("C0022"),
    AIRSHIP("C0026"),
    CRITEO("C0036"),
    CRITIZR("C0020"),
    FIREBASE_ANALYTICS("C0019"),
    LUCKY_CART("C0040");
    
    @C12579k
    private final String code;

    /* access modifiers changed from: public */
    PrivacyConsentCategory(String str) {
        this.code = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo83424q() {
        return this.code;
    }
}
