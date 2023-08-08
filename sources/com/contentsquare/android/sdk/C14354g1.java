package com.contentsquare.android.sdk;

import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/g1;", "", "", "g", "<init>", "(Ljava/lang/String;I)V", "library_release"}, mo22517k = 1, mo22518mv = {1, 4, 3})
/* renamed from: com.contentsquare.android.sdk.g1 */
public enum C14354g1 {
    START,
    STOP,
    NOP;

    /* renamed from: g */
    public final String mo35306g() {
        int i = C14733t2.f36461a[ordinal()];
        if (i == 1) {
            return "start the session replay";
        }
        if (i == 2) {
            return "stop the session replay";
        }
        if (i == 3) {
            return "do nothing";
        }
        throw new NoWhenBranchMatchedException();
    }
}
