package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0376v0;
import androidx.constraintlayout.motion.widget.C16900s;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.C16944e;
import java.util.ArrayList;
import java.util.Iterator;

public class Carousel extends MotionHelper {

    /* renamed from: Z0 */
    public static final boolean f43071Z0 = false;

    /* renamed from: a1 */
    public static final String f43072a1 = "Carousel";

    /* renamed from: b1 */
    public static final int f43073b1 = 1;

    /* renamed from: c1 */
    public static final int f43074c1 = 2;

    /* renamed from: F0 */
    public C16812b f43075F0 = null;

    /* renamed from: G0 */
    public final ArrayList<View> f43076G0 = new ArrayList<>();

    /* renamed from: H0 */
    public int f43077H0 = 0;

    /* renamed from: I0 */
    public int f43078I0 = 0;

    /* renamed from: J0 */
    public MotionLayout f43079J0;

    /* renamed from: K0 */
    public int f43080K0 = -1;

    /* renamed from: L0 */
    public boolean f43081L0 = false;

    /* renamed from: M0 */
    public int f43082M0 = -1;

    /* renamed from: N0 */
    public int f43083N0 = -1;

    /* renamed from: O0 */
    public int f43084O0 = -1;

    /* renamed from: P0 */
    public int f43085P0 = -1;

    /* renamed from: Q0 */
    public float f43086Q0 = 0.9f;

    /* renamed from: R0 */
    public int f43087R0 = 0;

    /* renamed from: S0 */
    public int f43088S0 = 4;

    /* renamed from: T0 */
    public int f43089T0 = 1;

    /* renamed from: U0 */
    public float f43090U0 = 2.0f;

    /* renamed from: V0 */
    public int f43091V0 = -1;

    /* renamed from: W0 */
    public int f43092W0 = 200;

    /* renamed from: X0 */
    public int f43093X0 = -1;

    /* renamed from: Y0 */
    public Runnable f43094Y0 = new C16810a();

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    public class C16810a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a */
        public class C16811a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ float f43096a;

            public C16811a(float f) {
                this.f43096a = f;
            }

            public void run() {
                Carousel.this.f43079J0.mo49971L0(5, 1.0f, this.f43096a);
            }
        }

        public C16810a() {
        }

        public void run() {
            Carousel.this.f43079J0.setProgress(0.0f);
            Carousel.this.mo49853Z();
            Carousel.this.f43075F0.mo49864a(Carousel.this.f43078I0);
            float velocity = Carousel.this.f43079J0.getVelocity();
            if (Carousel.this.f43089T0 == 2 && velocity > Carousel.this.f43090U0 && Carousel.this.f43078I0 < Carousel.this.f43075F0.count() - 1) {
                float Q = velocity * Carousel.this.f43086Q0;
                if (Carousel.this.f43078I0 == 0 && Carousel.this.f43077H0 > Carousel.this.f43078I0) {
                    return;
                }
                if (Carousel.this.f43078I0 != Carousel.this.f43075F0.count() - 1 || Carousel.this.f43077H0 >= Carousel.this.f43078I0) {
                    Carousel.this.f43079J0.post(new C16811a(Q));
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$b */
    public interface C16812b {
        /* renamed from: a */
        void mo49864a(int i);

        /* renamed from: b */
        void mo49865b(View view, int i);

        int count();
    }

    public Carousel(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m77286W() {
        this.f43079J0.setTransitionDuration(this.f43092W0);
        if (this.f43091V0 < this.f43078I0) {
            this.f43079J0.mo49977R0(this.f43084O0, this.f43092W0);
        } else {
            this.f43079J0.mo49977R0(this.f43085P0, this.f43092W0);
        }
    }

    /* renamed from: S */
    public final void mo49847S(boolean z) {
        Iterator<C16900s.C16902b> it = this.f43079J0.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().mo50373Q(z);
        }
    }

    /* renamed from: T */
    public final boolean mo49848T(int i, boolean z) {
        MotionLayout motionLayout;
        C16900s.C16902b r0;
        if (i == -1 || (motionLayout = this.f43079J0) == null || (r0 = motionLayout.mo50034r0(i)) == null || z == r0.mo50367K()) {
            return false;
        }
        r0.mo50373Q(z);
        return true;
    }

    /* renamed from: U */
    public final void mo49849U(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.Carousel_carousel_firstView) {
                    this.f43080K0 = obtainStyledAttributes.getResourceId(index, this.f43080K0);
                } else if (index == C16944e.C16957m.Carousel_carousel_backwardTransition) {
                    this.f43082M0 = obtainStyledAttributes.getResourceId(index, this.f43082M0);
                } else if (index == C16944e.C16957m.Carousel_carousel_forwardTransition) {
                    this.f43083N0 = obtainStyledAttributes.getResourceId(index, this.f43083N0);
                } else if (index == C16944e.C16957m.Carousel_carousel_emptyViewsBehavior) {
                    this.f43088S0 = obtainStyledAttributes.getInt(index, this.f43088S0);
                } else if (index == C16944e.C16957m.Carousel_carousel_previousState) {
                    this.f43084O0 = obtainStyledAttributes.getResourceId(index, this.f43084O0);
                } else if (index == C16944e.C16957m.Carousel_carousel_nextState) {
                    this.f43085P0 = obtainStyledAttributes.getResourceId(index, this.f43085P0);
                } else if (index == C16944e.C16957m.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f43086Q0 = obtainStyledAttributes.getFloat(index, this.f43086Q0);
                } else if (index == C16944e.C16957m.Carousel_carousel_touchUpMode) {
                    this.f43089T0 = obtainStyledAttributes.getInt(index, this.f43089T0);
                } else if (index == C16944e.C16957m.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f43090U0 = obtainStyledAttributes.getFloat(index, this.f43090U0);
                } else if (index == C16944e.C16957m.Carousel_carousel_infinite) {
                    this.f43081L0 = obtainStyledAttributes.getBoolean(index, this.f43081L0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: V */
    public void mo49850V(int i) {
        this.f43078I0 = Math.max(0, Math.min(getCount() - 1, i));
        mo49851X();
    }

    /* renamed from: X */
    public void mo49851X() {
        int size = this.f43076G0.size();
        for (int i = 0; i < size; i++) {
            View view = this.f43076G0.get(i);
            if (this.f43075F0.count() == 0) {
                mo49856b0(view, this.f43088S0);
            } else {
                mo49856b0(view, 0);
            }
        }
        this.f43079J0.mo49965F0();
        mo49853Z();
    }

    /* renamed from: Y */
    public void mo49852Y(int i, int i2) {
        this.f43091V0 = Math.max(0, Math.min(getCount() - 1, i));
        int max = Math.max(0, i2);
        this.f43092W0 = max;
        this.f43079J0.setTransitionDuration(max);
        if (i < this.f43078I0) {
            this.f43079J0.mo49977R0(this.f43084O0, this.f43092W0);
        } else {
            this.f43079J0.mo49977R0(this.f43085P0, this.f43092W0);
        }
    }

    /* renamed from: Z */
    public final void mo49853Z() {
        C16812b bVar = this.f43075F0;
        if (bVar != null && this.f43079J0 != null && bVar.count() != 0) {
            int size = this.f43076G0.size();
            for (int i = 0; i < size; i++) {
                View view = this.f43076G0.get(i);
                int i2 = (this.f43078I0 + i) - this.f43087R0;
                if (this.f43081L0) {
                    if (i2 < 0) {
                        int i3 = this.f43088S0;
                        if (i3 != 4) {
                            mo49856b0(view, i3);
                        } else {
                            mo49856b0(view, 0);
                        }
                        if (i2 % this.f43075F0.count() == 0) {
                            this.f43075F0.mo49865b(view, 0);
                        } else {
                            C16812b bVar2 = this.f43075F0;
                            bVar2.mo49865b(view, bVar2.count() + (i2 % this.f43075F0.count()));
                        }
                    } else if (i2 >= this.f43075F0.count()) {
                        if (i2 == this.f43075F0.count()) {
                            i2 = 0;
                        } else if (i2 > this.f43075F0.count()) {
                            i2 %= this.f43075F0.count();
                        }
                        int i4 = this.f43088S0;
                        if (i4 != 4) {
                            mo49856b0(view, i4);
                        } else {
                            mo49856b0(view, 0);
                        }
                        this.f43075F0.mo49865b(view, i2);
                    } else {
                        mo49856b0(view, 0);
                        this.f43075F0.mo49865b(view, i2);
                    }
                } else if (i2 < 0) {
                    mo49856b0(view, this.f43088S0);
                } else if (i2 >= this.f43075F0.count()) {
                    mo49856b0(view, this.f43088S0);
                } else {
                    mo49856b0(view, 0);
                    this.f43075F0.mo49865b(view, i2);
                }
            }
            int i5 = this.f43091V0;
            if (i5 != -1 && i5 != this.f43078I0) {
                this.f43079J0.post(new C16813a(this));
            } else if (i5 == this.f43078I0) {
                this.f43091V0 = -1;
            }
            if (this.f43082M0 != -1 && this.f43083N0 != -1 && !this.f43081L0) {
                int count = this.f43075F0.count();
                if (this.f43078I0 == 0) {
                    mo49848T(this.f43082M0, false);
                } else {
                    mo49848T(this.f43082M0, true);
                    this.f43079J0.setTransition(this.f43082M0);
                }
                if (this.f43078I0 == count - 1) {
                    mo49848T(this.f43083N0, false);
                    return;
                }
                mo49848T(this.f43083N0, true);
                this.f43079J0.setTransition(this.f43083N0);
            }
        }
    }

    /* renamed from: a */
    public void mo49854a(MotionLayout motionLayout, int i, int i2, float f) {
        this.f43093X0 = i;
    }

    /* renamed from: a0 */
    public final boolean mo49855a0(int i, View view, int i2) {
        C16934c.C16935a k0;
        C16934c n0 = this.f43079J0.mo50021n0(i);
        if (n0 == null || (k0 = n0.mo50882k0(view.getId())) == null) {
            return false;
        }
        k0.f44582c.f44774c = 1;
        view.setVisibility(i2);
        return true;
    }

    /* renamed from: b0 */
    public final boolean mo49856b0(View view, int i) {
        MotionLayout motionLayout = this.f43079J0;
        if (motionLayout == null) {
            return false;
        }
        int[] constraintSetIds = motionLayout.getConstraintSetIds();
        boolean z = false;
        for (int a0 : constraintSetIds) {
            z |= mo49855a0(a0, view, i);
        }
        return z;
    }

    /* renamed from: f */
    public void mo49857f(MotionLayout motionLayout, int i) {
        int i2 = this.f43078I0;
        this.f43077H0 = i2;
        if (i == this.f43085P0) {
            this.f43078I0 = i2 + 1;
        } else if (i == this.f43084O0) {
            this.f43078I0 = i2 - 1;
        }
        if (this.f43081L0) {
            if (this.f43078I0 >= this.f43075F0.count()) {
                this.f43078I0 = 0;
            }
            if (this.f43078I0 < 0) {
                this.f43078I0 = this.f43075F0.count() - 1;
            }
        } else {
            if (this.f43078I0 >= this.f43075F0.count()) {
                this.f43078I0 = this.f43075F0.count() - 1;
            }
            if (this.f43078I0 < 0) {
                this.f43078I0 = 0;
            }
        }
        if (this.f43077H0 != this.f43078I0) {
            this.f43079J0.post(this.f43094Y0);
        }
    }

    public int getCount() {
        C16812b bVar = this.f43075F0;
        if (bVar != null) {
            return bVar.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f43078I0;
    }

    @C0376v0(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f44191b; i++) {
                int i2 = this.f44190a[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.f43080K0 == i2) {
                    this.f43087R0 = i;
                }
                this.f43076G0.add(viewById);
            }
            this.f43079J0 = motionLayout;
            if (this.f43089T0 == 2) {
                C16900s.C16902b r0 = motionLayout.mo50034r0(this.f43083N0);
                if (r0 != null) {
                    r0.mo50377U(5);
                }
                C16900s.C16902b r02 = this.f43079J0.mo50034r0(this.f43082M0);
                if (r02 != null) {
                    r02.mo50377U(5);
                }
            }
            mo49853Z();
        }
    }

    public void setAdapter(C16812b bVar) {
        this.f43075F0 = bVar;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo49849U(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo49849U(context, attributeSet);
    }
}
