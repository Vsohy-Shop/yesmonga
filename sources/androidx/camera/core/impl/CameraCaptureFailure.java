package androidx.camera.core.impl;

import androidx.annotation.C0359n0;

public final class CameraCaptureFailure {

    /* renamed from: a */
    public final Reason f4086a;

    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(@C0359n0 Reason reason) {
        this.f4086a = reason;
    }

    @C0359n0
    /* renamed from: a */
    public Reason mo5117a() {
        return this.f4086a;
    }
}
