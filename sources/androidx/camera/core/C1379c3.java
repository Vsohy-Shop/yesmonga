package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.camera.core.c3 */
public final class C1379c3 extends C1663p0 {

    /* renamed from: c */
    public final C1741z1 f4007c;
    @C0363p0

    /* renamed from: d */
    public Rect f4008d;

    /* renamed from: e */
    public final int f4009e;

    /* renamed from: f */
    public final int f4010f;

    public C1379c3(C1353a2 a2Var, C1741z1 z1Var) {
        this(a2Var, (Size) null, z1Var);
    }

    @C0359n0
    /* renamed from: I2 */
    public synchronized Rect mo4973I2() {
        if (this.f4008d == null) {
            return new Rect(0, 0, getWidth(), getHeight());
        }
        return new Rect(this.f4008d);
    }

    public synchronized int getHeight() {
        return this.f4010f;
    }

    public synchronized int getWidth() {
        return this.f4009e;
    }

    @C0359n0
    /* renamed from: q3 */
    public C1741z1 mo4977q3() {
        return this.f4007c;
    }

    /* renamed from: y1 */
    public synchronized void mo4978y1(@C0363p0 Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        this.f4008d = rect;
    }

    public C1379c3(C1353a2 a2Var, @C0363p0 Size size, C1741z1 z1Var) {
        super(a2Var);
        if (size == null) {
            this.f4009e = super.getWidth();
            this.f4010f = super.getHeight();
        } else {
            this.f4009e = size.getWidth();
            this.f4010f = size.getHeight();
        }
        this.f4007c = z1Var;
    }
}
