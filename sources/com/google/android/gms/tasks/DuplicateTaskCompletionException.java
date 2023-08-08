package com.google.android.gms.tasks;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

public final class DuplicateTaskCompletionException extends IllegalStateException {
    public DuplicateTaskCompletionException(String str, @C0363p0 Throwable th) {
        super(str, th);
    }

    @C0359n0
    /* renamed from: a */
    public static IllegalStateException m124456a(@C0359n0 C31047k<?> kVar) {
        String str;
        if (!kVar.mo87737u()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception q = kVar.mo87733q();
        if (q != null) {
            str = "failure";
        } else if (kVar.mo87738v()) {
            str = "result ".concat(String.valueOf(kVar.mo87734r()));
        } else if (kVar.mo87736t()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), q);
    }
}
