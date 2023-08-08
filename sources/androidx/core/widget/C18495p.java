package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* renamed from: androidx.core.widget.p */
public final class C18495p {

    /* renamed from: a */
    public OverScroller f47270a;

    public C18495p(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.f47270a = overScroller;
    }

    @Deprecated
    /* renamed from: c */
    public static C18495p m83701c(Context context) {
        return m83702d(context, (Interpolator) null);
    }

    @Deprecated
    /* renamed from: d */
    public static C18495p m83702d(Context context, Interpolator interpolator) {
        return new C18495p(context, interpolator);
    }

    @Deprecated
    /* renamed from: a */
    public void mo53356a() {
        this.f47270a.abortAnimation();
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo53357b() {
        return this.f47270a.computeScrollOffset();
    }

    @Deprecated
    /* renamed from: e */
    public void mo53358e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f47270a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    /* renamed from: f */
    public void mo53359f(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f47270a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    /* renamed from: g */
    public float mo53360g() {
        return this.f47270a.getCurrVelocity();
    }

    @Deprecated
    /* renamed from: h */
    public int mo53361h() {
        return this.f47270a.getCurrX();
    }

    @Deprecated
    /* renamed from: i */
    public int mo53362i() {
        return this.f47270a.getCurrY();
    }

    @Deprecated
    /* renamed from: j */
    public int mo53363j() {
        return this.f47270a.getFinalX();
    }

    @Deprecated
    /* renamed from: k */
    public int mo53364k() {
        return this.f47270a.getFinalY();
    }

    @Deprecated
    /* renamed from: l */
    public boolean mo53365l() {
        return this.f47270a.isFinished();
    }

    @Deprecated
    /* renamed from: m */
    public boolean mo53366m() {
        return this.f47270a.isOverScrolled();
    }

    @Deprecated
    /* renamed from: n */
    public void mo53367n(int i, int i2, int i3) {
        this.f47270a.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @Deprecated
    /* renamed from: o */
    public void mo53368o(int i, int i2, int i3) {
        this.f47270a.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    /* renamed from: p */
    public boolean mo53369p(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f47270a.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    /* renamed from: q */
    public void mo53370q(int i, int i2, int i3, int i4) {
        this.f47270a.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    /* renamed from: r */
    public void mo53371r(int i, int i2, int i3, int i4, int i5) {
        this.f47270a.startScroll(i, i2, i3, i4, i5);
    }
}
