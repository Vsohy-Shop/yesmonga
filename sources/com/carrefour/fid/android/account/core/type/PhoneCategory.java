package com.carrefour.fid.android.account.core.type;

import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\t¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/core/type/PhoneCategory;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum PhoneCategory {
    MOBILE("MOB");
    
    @C12579k
    private final String value;

    /* access modifiers changed from: public */
    PhoneCategory(String str) {
        this.value = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo31120q() {
        return this.value;
    }
}
