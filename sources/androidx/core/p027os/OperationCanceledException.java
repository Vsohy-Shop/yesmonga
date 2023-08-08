package androidx.core.p027os;

import androidx.annotation.C0363p0;
import androidx.core.util.C17992m;

/* renamed from: androidx.core.os.OperationCanceledException */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this((String) null);
    }

    public OperationCanceledException(@C0363p0 String str) {
        super(C17992m.m81745f(str, "The operation has been canceled."));
    }
}
