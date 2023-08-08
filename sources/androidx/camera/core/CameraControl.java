package androidx.camera.core;

import androidx.annotation.C0359n0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.C32487a;

public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@C0359n0 String str) {
            super(str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@C0359n0 String str, @C0359n0 Throwable th) {
            super(str, th);
        }
    }

    @C1410h0
    @C0359n0
    /* renamed from: a */
    C32487a<Integer> mo4675a(int i);

    @C0359n0
    /* renamed from: c */
    C32487a<Void> mo4677c(@C0379x(from = 0.0d, mo1016to = 1.0d) float f);

    @C0359n0
    /* renamed from: d */
    C32487a<Void> mo4678d();

    @C0359n0
    /* renamed from: e */
    C32487a<Void> mo4679e(float f);

    @C0359n0
    /* renamed from: h */
    C32487a<Void> mo4682h(boolean z);

    @C0359n0
    /* renamed from: j */
    C32487a<C1657o0> mo4686j(@C0359n0 C1650n0 n0Var);
}
