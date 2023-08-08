package androidx.startup;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class StartupException extends RuntimeException {
    public StartupException(@C0359n0 String str) {
        super(str);
    }

    public StartupException(@C0359n0 Throwable th) {
        super(th);
    }

    public StartupException(@C0359n0 String str, @C0359n0 Throwable th) {
        super(str, th);
    }
}
