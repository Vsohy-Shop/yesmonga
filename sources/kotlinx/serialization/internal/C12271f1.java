package kotlinx.serialization.internal;

import kotlin.C11532s0;

@C11532s0
/* renamed from: kotlinx.serialization.internal.f1 */
public abstract class C12271f1<Array> {
    /* renamed from: c */
    public static /* synthetic */ void m49284c(C12271f1 f1Var, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = f1Var.mo25045d() + 1;
            }
            f1Var.mo25044b(i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
    }

    /* renamed from: a */
    public abstract Array mo25043a();

    /* renamed from: b */
    public abstract void mo25044b(int i);

    /* renamed from: d */
    public abstract int mo25045d();
}
