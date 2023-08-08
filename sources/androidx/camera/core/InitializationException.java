package androidx.camera.core;

import androidx.annotation.C0363p0;

public class InitializationException extends Exception {
    public InitializationException(@C0363p0 String str) {
        super(str);
    }

    public InitializationException(@C0363p0 String str, @C0363p0 Throwable th) {
        super(str, th);
    }

    public InitializationException(@C0363p0 Throwable th) {
        super(th);
    }
}
