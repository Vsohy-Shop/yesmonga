package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18098w0;
import androidx.customview.widget.C18553d;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C16977c<V> {

    /* renamed from: k */
    public static final int f74664k = 0;

    /* renamed from: l */
    public static final int f74665l = 1;

    /* renamed from: m */
    public static final int f74666m = 2;

    /* renamed from: n */
    public static final int f74667n = 0;

    /* renamed from: o */
    public static final int f74668o = 1;

    /* renamed from: p */
    public static final int f74669p = 2;

    /* renamed from: q */
    public static final float f74670q = 0.5f;

    /* renamed from: r */
    public static final float f74671r = 0.0f;

    /* renamed from: s */
    public static final float f74672s = 0.5f;

    /* renamed from: a */
    public C18553d f74673a;

    /* renamed from: b */
    public C31144c f74674b;

    /* renamed from: c */
    public boolean f74675c;

    /* renamed from: d */
    public float f74676d = 0.0f;

    /* renamed from: e */
    public boolean f74677e;

    /* renamed from: f */
    public int f74678f = 2;

    /* renamed from: g */
    public float f74679g = 0.5f;

    /* renamed from: h */
    public float f74680h = 0.0f;

    /* renamed from: i */
    public float f74681i = 0.5f;

    /* renamed from: j */
    public final C18553d.C18556c f74682j = new C31142a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C31142a extends C18553d.C18556c {

        /* renamed from: d */
        public static final int f74683d = -1;

        /* renamed from: a */
        public int f74684a;

        /* renamed from: b */
        public int f74685b = -1;

        public C31142a() {
        }

        /* renamed from: a */
        public int mo18293a(@C0359n0 View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int width;
            if (C18196h2.m82553Z(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i5 = SwipeDismissBehavior.this.f74678f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f74684a - view.getWidth();
                    i4 = view.getWidth() + this.f74684a;
                } else if (z) {
                    i3 = this.f74684a;
                    width = view.getWidth();
                } else {
                    i3 = this.f74684a - view.getWidth();
                    i4 = this.f74684a;
                }
                return SwipeDismissBehavior.m125089I(i3, i, i4);
            } else if (z) {
                i3 = this.f74684a - view.getWidth();
                i4 = this.f74684a;
                return SwipeDismissBehavior.m125089I(i3, i, i4);
            } else {
                i3 = this.f74684a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m125089I(i3, i, i4);
        }

        /* renamed from: b */
        public int mo18294b(@C0359n0 View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo53526d(@C0359n0 View view) {
            return view.getWidth();
        }

        /* renamed from: i */
        public void mo18295i(@C0359n0 View view, int i) {
            this.f74685b = i;
            this.f74684a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo18296j(int i) {
            C31144c cVar = SwipeDismissBehavior.this.f74674b;
            if (cVar != null) {
                cVar.mo88290a(i);
            }
        }

        /* renamed from: k */
        public void mo18297k(@C0359n0 View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f74684a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f74680h);
            float width2 = ((float) this.f74684a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f74681i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m125088H(0.0f, 1.0f - SwipeDismissBehavior.m125090K(width, width2, f), 1.0f));
            }
        }

        /* renamed from: l */
        public void mo18298l(@C0359n0 View view, float f, float f2) {
            boolean z;
            int i;
            C31144c cVar;
            this.f74685b = -1;
            int width = view.getWidth();
            if (mo88289n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f74684a;
                if (left < i2) {
                    i = i2 - width;
                } else {
                    i = i2 + width;
                }
                z = true;
            } else {
                i = this.f74684a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f74673a.mo53495V(i, view.getTop())) {
                C18196h2.m82618p1(view, new C31145d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.f74674b) != null) {
                cVar.mo88291b(view);
            }
        }

        /* renamed from: m */
        public boolean mo18299m(View view, int i) {
            int i2 = this.f74685b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo88278G(view)) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public final boolean mo88289n(@C0359n0 View view, float f) {
            boolean z;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                if (C18196h2.m82553Z(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.f74678f;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f74684a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f74679g)) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class C31143b implements C18098w0 {
        public C31143b() {
        }

        /* renamed from: a */
        public boolean mo19056a(@C0359n0 View view, @C0363p0 C18098w0.C18099a aVar) {
            boolean z;
            boolean z2 = false;
            if (!SwipeDismissBehavior.this.mo88278G(view)) {
                return false;
            }
            if (C18196h2.m82553Z(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = SwipeDismissBehavior.this.f74678f;
            if ((i == 0 && z) || (i == 1 && !z)) {
                z2 = true;
            }
            int width = view.getWidth();
            if (z2) {
                width = -width;
            }
            C18196h2.m82574e1(view, width);
            view.setAlpha(0.0f);
            C31144c cVar = SwipeDismissBehavior.this.f74674b;
            if (cVar != null) {
                cVar.mo88291b(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C31144c {
        /* renamed from: a */
        void mo88290a(int i);

        /* renamed from: b */
        void mo88291b(View view);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    public class C31145d implements Runnable {

        /* renamed from: a */
        public final View f74688a;

        /* renamed from: b */
        public final boolean f74689b;

        public C31145d(View view, boolean z) {
            this.f74688a = view;
            this.f74689b = z;
        }

        public void run() {
            C31144c cVar;
            C18553d dVar = SwipeDismissBehavior.this.f74673a;
            if (dVar != null && dVar.mo53513o(true)) {
                C18196h2.m82618p1(this.f74688a, this);
            } else if (this.f74689b && (cVar = SwipeDismissBehavior.this.f74674b) != null) {
                cVar.mo88291b(this.f74688a);
            }
        }
    }

    /* renamed from: H */
    public static float m125088H(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: I */
    public static int m125089I(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: K */
    public static float m125090K(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: E */
    public boolean mo51077E(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C18553d dVar = this.f74673a;
        if (dVar == null) {
            return false;
        }
        dVar.mo53486M(motionEvent);
        return true;
    }

    /* renamed from: G */
    public boolean mo88278G(@C0359n0 View view) {
        return true;
    }

    /* renamed from: J */
    public final void mo88279J(ViewGroup viewGroup) {
        C18553d dVar;
        if (this.f74673a == null) {
            if (this.f74677e) {
                dVar = C18553d.m83925p(viewGroup, this.f74676d, this.f74682j);
            } else {
                dVar = C18553d.m83926q(viewGroup, this.f74682j);
            }
            this.f74673a = dVar;
        }
    }

    /* renamed from: L */
    public int mo88280L() {
        C18553d dVar = this.f74673a;
        if (dVar != null) {
            return dVar.mo53479F();
        }
        return 0;
    }

    @C0363p0
    @C0344h1
    /* renamed from: M */
    public C31144c mo88281M() {
        return this.f74674b;
    }

    /* renamed from: N */
    public void mo88282N(float f) {
        this.f74679g = m125088H(0.0f, f, 1.0f);
    }

    /* renamed from: O */
    public void mo88283O(float f) {
        this.f74681i = m125088H(0.0f, f, 1.0f);
    }

    /* renamed from: P */
    public void mo88284P(@C0363p0 C31144c cVar) {
        this.f74674b = cVar;
    }

    /* renamed from: Q */
    public void mo88285Q(float f) {
        this.f74676d = f;
        this.f74677e = true;
    }

    /* renamed from: R */
    public void mo88286R(float f) {
        this.f74680h = m125088H(0.0f, f, 1.0f);
    }

    /* renamed from: S */
    public void mo88287S(int i) {
        this.f74678f = i;
    }

    /* renamed from: T */
    public final void mo88288T(View view) {
        C18196h2.m82626r1(view, 1048576);
        if (mo88278G(view)) {
            C18196h2.m82638u1(view, C18065l0.C18066a.f46689z, (CharSequence) null, new C31143b());
        }
    }

    /* renamed from: l */
    public boolean mo51088l(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 MotionEvent motionEvent) {
        boolean z = this.f74675c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo51005G(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f74675c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f74675c = false;
        }
        if (!z) {
            return false;
        }
        mo88279J(coordinatorLayout);
        return this.f74673a.mo53496W(motionEvent);
    }

    /* renamed from: m */
    public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, int i) {
        boolean m = super.mo51089m(coordinatorLayout, v, i);
        if (C18196h2.m82541V(v) == 0) {
            C18196h2.m82531R1(v, 1);
            mo88288T(v);
        }
        return m;
    }
}
