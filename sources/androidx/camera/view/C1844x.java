package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.annotation.C0359n0;

/* renamed from: androidx.camera.view.x */
public abstract class C1844x {

    /* renamed from: c */
    public static final int f5037c = -1;

    /* renamed from: a */
    public int f5038a = -1;

    /* renamed from: b */
    public final OrientationEventListener f5039b;

    /* renamed from: androidx.camera.view.x$a */
    public class C1845a extends OrientationEventListener {
        public C1845a(Context context) {
            super(context);
        }

        public void onOrientationChanged(int i) {
            int i2;
            if (i != -1) {
                if (i >= 315 || i < 45) {
                    i2 = 0;
                } else if (i >= 225) {
                    i2 = 1;
                } else if (i >= 135) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                C1844x xVar = C1844x.this;
                if (xVar.f5038a != i2) {
                    xVar.f5038a = i2;
                    xVar.mo5931d(i2);
                }
            }
        }
    }

    public C1844x(@C0359n0 Context context) {
        this.f5039b = new C1845a(context);
    }

    /* renamed from: a */
    public boolean mo6033a() {
        return this.f5039b.canDetectOrientation();
    }

    /* renamed from: b */
    public void mo6034b() {
        this.f5039b.disable();
    }

    /* renamed from: c */
    public void mo6035c() {
        this.f5039b.enable();
    }

    /* renamed from: d */
    public abstract void mo5931d(int i);
}
