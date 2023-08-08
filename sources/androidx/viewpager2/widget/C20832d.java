package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.C0341g1;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.viewpager2.widget.d */
public final class C20832d {

    /* renamed from: a */
    public final ViewPager2 f53863a;

    /* renamed from: b */
    public final C20835g f53864b;

    /* renamed from: c */
    public final RecyclerView f53865c;

    /* renamed from: d */
    public VelocityTracker f53866d;

    /* renamed from: e */
    public int f53867e;

    /* renamed from: f */
    public float f53868f;

    /* renamed from: g */
    public int f53869g;

    /* renamed from: h */
    public long f53870h;

    public C20832d(ViewPager2 viewPager2, C20835g gVar, RecyclerView recyclerView) {
        this.f53863a = viewPager2;
        this.f53864b = gVar;
        this.f53865c = recyclerView;
    }

    /* renamed from: a */
    public final void mo62539a(long j, int i, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(this.f53870h, j, i, f, f2, 0);
        this.f53866d.addMovement(obtain);
        obtain.recycle();
    }

    @C0341g1
    /* renamed from: b */
    public boolean mo62540b() {
        if (this.f53864b.mo62554i()) {
            return false;
        }
        this.f53869g = 0;
        this.f53868f = (float) 0;
        this.f53870h = SystemClock.uptimeMillis();
        mo62541c();
        this.f53864b.mo62558m();
        if (!this.f53864b.mo62556k()) {
            this.f53865c.mo59512R1();
        }
        mo62539a(this.f53870h, 0, 0.0f, 0.0f);
        return true;
    }

    /* renamed from: c */
    public final void mo62541c() {
        VelocityTracker velocityTracker = this.f53866d;
        if (velocityTracker == null) {
            this.f53866d = VelocityTracker.obtain();
            this.f53867e = ViewConfiguration.get(this.f53863a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    @C0341g1
    /* renamed from: d */
    public boolean mo62542d() {
        if (!this.f53864b.mo62555j()) {
            return false;
        }
        this.f53864b.mo62560o();
        VelocityTracker velocityTracker = this.f53866d;
        velocityTracker.computeCurrentVelocity(1000, (float) this.f53867e);
        if (this.f53865c.mo59587m0((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f53863a.mo62491u();
        return true;
    }

    @C0341g1
    /* renamed from: e */
    public boolean mo62543e(float f) {
        boolean z;
        int i;
        float f2;
        int i2 = 0;
        if (!this.f53864b.mo62555j()) {
            return false;
        }
        float f3 = this.f53868f - f;
        this.f53868f = f3;
        int round = Math.round(f3 - ((float) this.f53869g));
        this.f53869g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f53863a.getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = round;
        } else {
            i = 0;
        }
        if (!z) {
            i2 = round;
        }
        float f4 = 0.0f;
        if (z) {
            f2 = this.f53868f;
        } else {
            f2 = 0.0f;
        }
        if (!z) {
            f4 = this.f53868f;
        }
        this.f53865c.scrollBy(i, i2);
        mo62539a(uptimeMillis, 2, f2, f4);
        return true;
    }

    /* renamed from: f */
    public boolean mo62544f() {
        return this.f53864b.mo62555j();
    }
}
