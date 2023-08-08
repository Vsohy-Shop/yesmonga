package androidx.transition;

import android.os.IBinder;

/* renamed from: androidx.transition.r1 */
public class C20670r1 implements C20676t1 {

    /* renamed from: a */
    public final IBinder f53336a;

    public C20670r1(IBinder iBinder) {
        this.f53336a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C20670r1) && ((C20670r1) obj).f53336a.equals(this.f53336a);
    }

    public int hashCode() {
        return this.f53336a.hashCode();
    }
}
