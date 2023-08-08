package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18196h2;
import androidx.core.view.C18294l0;
import androidx.recyclerview.C20030a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.n */
public class C20190n extends RecyclerView.C20075n implements RecyclerView.C20082q {

    /* renamed from: E */
    public static final int f52045E = 1;

    /* renamed from: F */
    public static final int f52046F = 2;

    /* renamed from: G */
    public static final int f52047G = 4;

    /* renamed from: H */
    public static final int f52048H = 8;

    /* renamed from: I */
    public static final int f52049I = 16;

    /* renamed from: J */
    public static final int f52050J = 32;

    /* renamed from: K */
    public static final int f52051K = 0;

    /* renamed from: L */
    public static final int f52052L = 1;

    /* renamed from: M */
    public static final int f52053M = 2;

    /* renamed from: N */
    public static final int f52054N = 2;

    /* renamed from: O */
    public static final int f52055O = 4;

    /* renamed from: P */
    public static final int f52056P = 8;

    /* renamed from: Q */
    public static final String f52057Q = "ItemTouchHelper";

    /* renamed from: R */
    public static final boolean f52058R = false;

    /* renamed from: S */
    public static final int f52059S = -1;

    /* renamed from: T */
    public static final int f52060T = 8;

    /* renamed from: U */
    public static final int f52061U = 255;

    /* renamed from: V */
    public static final int f52062V = 65280;

    /* renamed from: W */
    public static final int f52063W = 16711680;

    /* renamed from: X */
    public static final int f52064X = 1000;

    /* renamed from: A */
    public C20199g f52065A;

    /* renamed from: B */
    public final RecyclerView.C20084s f52066B = new C20192b();

    /* renamed from: C */
    public Rect f52067C;

    /* renamed from: D */
    public long f52068D;

    /* renamed from: a */
    public final List<View> f52069a = new ArrayList();

    /* renamed from: b */
    public final float[] f52070b = new float[2];

    /* renamed from: c */
    public RecyclerView.C20061e0 f52071c = null;

    /* renamed from: d */
    public float f52072d;

    /* renamed from: e */
    public float f52073e;

    /* renamed from: f */
    public float f52074f;

    /* renamed from: g */
    public float f52075g;

    /* renamed from: h */
    public float f52076h;

    /* renamed from: i */
    public float f52077i;

    /* renamed from: j */
    public float f52078j;

    /* renamed from: k */
    public float f52079k;

    /* renamed from: l */
    public int f52080l = -1;
    @C0359n0

    /* renamed from: m */
    public C20196f f52081m;

    /* renamed from: n */
    public int f52082n = 0;

    /* renamed from: o */
    public int f52083o;
    @C0344h1

    /* renamed from: p */
    public List<C20200h> f52084p = new ArrayList();

    /* renamed from: q */
    public int f52085q;

    /* renamed from: r */
    public RecyclerView f52086r;

    /* renamed from: s */
    public final Runnable f52087s = new C20191a();

    /* renamed from: t */
    public VelocityTracker f52088t;

    /* renamed from: u */
    public List<RecyclerView.C20061e0> f52089u;

    /* renamed from: v */
    public List<Integer> f52090v;

    /* renamed from: w */
    public RecyclerView.C20066j f52091w = null;

    /* renamed from: x */
    public View f52092x = null;

    /* renamed from: y */
    public int f52093y = -1;

    /* renamed from: z */
    public C18294l0 f52094z;

    /* renamed from: androidx.recyclerview.widget.n$a */
    public class C20191a implements Runnable {
        public C20191a() {
        }

        public void run() {
            C20190n nVar = C20190n.this;
            if (nVar.f52071c != null && nVar.mo60574E()) {
                C20190n nVar2 = C20190n.this;
                RecyclerView.C20061e0 e0Var = nVar2.f52071c;
                if (e0Var != null) {
                    nVar2.mo60596z(e0Var);
                }
                C20190n nVar3 = C20190n.this;
                nVar3.f52086r.removeCallbacks(nVar3.f52087s);
                C18196h2.m82618p1(C20190n.this.f52086r, this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    public class C20192b implements RecyclerView.C20084s {
        public C20192b() {
        }

        /* renamed from: a */
        public void mo60002a(@C0359n0 RecyclerView recyclerView, @C0359n0 MotionEvent motionEvent) {
            C20190n.this.f52094z.mo52968b(motionEvent);
            VelocityTracker velocityTracker = C20190n.this.f52088t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C20190n.this.f52080l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C20190n.this.f52080l);
                if (findPointerIndex >= 0) {
                    C20190n.this.mo60586o(actionMasked, motionEvent, findPointerIndex);
                }
                C20190n nVar = C20190n.this;
                RecyclerView.C20061e0 e0Var = nVar.f52071c;
                if (e0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = nVar.f52088t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                C20190n nVar2 = C20190n.this;
                                if (pointerId == nVar2.f52080l) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    nVar2.f52080l = motionEvent.getPointerId(i);
                                    C20190n nVar3 = C20190n.this;
                                    nVar3.mo60582M(motionEvent, nVar3.f52083o, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            nVar.mo60582M(motionEvent, nVar.f52083o, findPointerIndex);
                            C20190n.this.mo60596z(e0Var);
                            C20190n nVar4 = C20190n.this;
                            nVar4.f52086r.removeCallbacks(nVar4.f52087s);
                            C20190n.this.f52087s.run();
                            C20190n.this.f52086r.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    C20190n.this.mo60575F((RecyclerView.C20061e0) null, 0);
                    C20190n.this.f52080l = -1;
                }
            }
        }

        /* renamed from: c */
        public boolean mo60003c(@C0359n0 RecyclerView recyclerView, @C0359n0 MotionEvent motionEvent) {
            int findPointerIndex;
            C20200h s;
            C20190n.this.f52094z.mo52968b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C20190n.this.f52080l = motionEvent.getPointerId(0);
                C20190n.this.f52072d = motionEvent.getX();
                C20190n.this.f52073e = motionEvent.getY();
                C20190n.this.mo60570A();
                C20190n nVar = C20190n.this;
                if (nVar.f52071c == null && (s = nVar.mo60590s(motionEvent)) != null) {
                    C20190n nVar2 = C20190n.this;
                    nVar2.f52072d -= s.f52123j;
                    nVar2.f52073e -= s.f52124k;
                    nVar2.mo60589r(s.f52118e, true);
                    if (C20190n.this.f52069a.remove(s.f52118e.itemView)) {
                        C20190n nVar3 = C20190n.this;
                        nVar3.f52081m.mo60606c(nVar3.f52086r, s.f52118e);
                    }
                    C20190n.this.mo60575F(s.f52118e, s.f52119f);
                    C20190n nVar4 = C20190n.this;
                    nVar4.mo60582M(motionEvent, nVar4.f52083o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C20190n nVar5 = C20190n.this;
                nVar5.f52080l = -1;
                nVar5.mo60575F((RecyclerView.C20061e0) null, 0);
            } else {
                int i = C20190n.this.f52080l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C20190n.this.mo60586o(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = C20190n.this.f52088t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C20190n.this.f52071c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void mo60004e(boolean z) {
            if (z) {
                C20190n.this.mo60575F((RecyclerView.C20061e0) null, 0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$c */
    public class C20193c extends C20200h {

        /* renamed from: o */
        public final /* synthetic */ int f52097o;

        /* renamed from: p */
        public final /* synthetic */ RecyclerView.C20061e0 f52098p;

        /* renamed from: q */
        public final /* synthetic */ C20190n f52099q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20193c(C20190n nVar, RecyclerView.C20061e0 e0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.C20061e0 e0Var2) {
            super(e0Var, i, i2, f, f2, f3, f4);
            this.f52099q = nVar;
            this.f52097o = i3;
            this.f52098p = e0Var2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f52125l) {
                if (this.f52097o <= 0) {
                    C20190n nVar = this.f52099q;
                    nVar.f52081m.mo60606c(nVar.f52086r, this.f52098p);
                } else {
                    this.f52099q.f52069a.add(this.f52098p.itemView);
                    this.f52122i = true;
                    int i = this.f52097o;
                    if (i > 0) {
                        this.f52099q.mo60571B(this, i);
                    }
                }
                C20190n nVar2 = this.f52099q;
                View view = nVar2.f52092x;
                View view2 = this.f52098p.itemView;
                if (view == view2) {
                    nVar2.mo60573D(view2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$d */
    public class C20194d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C20200h f52100a;

        /* renamed from: b */
        public final /* synthetic */ int f52101b;

        public C20194d(C20200h hVar, int i) {
            this.f52100a = hVar;
            this.f52101b = i;
        }

        public void run() {
            RecyclerView recyclerView = C20190n.this.f52086r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C20200h hVar = this.f52100a;
                if (!hVar.f52125l && hVar.f52118e.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.C20069l itemAnimator = C20190n.this.f52086r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.mo59849r((RecyclerView.C20069l.C20071b) null)) && !C20190n.this.mo60595x()) {
                        C20190n.this.f52081m.mo60603D(this.f52100a.f52118e, this.f52101b);
                    } else {
                        C20190n.this.f52086r.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$e */
    public class C20195e implements RecyclerView.C20066j {
        public C20195e() {
        }

        /* renamed from: a */
        public int mo59828a(int i, int i2) {
            C20190n nVar = C20190n.this;
            View view = nVar.f52092x;
            if (view == null) {
                return i2;
            }
            int i3 = nVar.f52093y;
            if (i3 == -1) {
                i3 = nVar.f52086r.indexOfChild(view);
                C20190n.this.f52093y = i3;
            }
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 < i3) {
                return i2;
            }
            return i2 + 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$f */
    public static abstract class C20196f {

        /* renamed from: b */
        public static final int f52104b = 200;

        /* renamed from: c */
        public static final int f52105c = 250;

        /* renamed from: d */
        public static final int f52106d = 3158064;

        /* renamed from: e */
        public static final int f52107e = 789516;

        /* renamed from: f */
        public static final Interpolator f52108f = new C20197a();

        /* renamed from: g */
        public static final Interpolator f52109g = new C20198b();

        /* renamed from: h */
        public static final long f52110h = 2000;

        /* renamed from: a */
        public int f52111a = -1;

        /* renamed from: androidx.recyclerview.widget.n$f$a */
        public class C20197a implements Interpolator {
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.n$f$b */
        public class C20198b implements Interpolator {
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: e */
        public static int m94452e(int i, int i2) {
            int i3;
            int i4 = i & f52107e;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & f52107e) << 2;
            }
            return i5 | i3;
        }

        @C0359n0
        /* renamed from: i */
        public static C20204o m94453i() {
            return C20205p.f52131a;
        }

        /* renamed from: u */
        public static int m94454u(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: v */
        public static int m94455v(int i, int i2) {
            int u = m94454u(0, i2 | i);
            return m94454u(2, i) | m94454u(1, i2) | u;
        }

        /* renamed from: A */
        public abstract boolean mo60600A(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20061e0 e0Var, @C0359n0 RecyclerView.C20061e0 e0Var2);

        /* renamed from: B */
        public void mo60601B(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20061e0 e0Var, int i, @C0359n0 RecyclerView.C20061e0 e0Var2, int i2, int i3, int i4) {
            RecyclerView.C20076o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof C20203j) {
                ((C20203j) layoutManager).mo59398d(e0Var.itemView, e0Var2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo59428v()) {
                if (layoutManager.mo59939g0(e0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.mo59479G1(i2);
                }
                if (layoutManager.mo59953j0(e0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.mo59479G1(i2);
                }
            }
            if (layoutManager.mo59431w()) {
                if (layoutManager.mo59955k0(e0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.mo59479G1(i2);
                }
                if (layoutManager.mo59934e0(e0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.mo59479G1(i2);
                }
            }
        }

        /* renamed from: C */
        public void mo60602C(@C0363p0 RecyclerView.C20061e0 e0Var, int i) {
            if (e0Var != null) {
                C20205p.f52131a.mo60645b(e0Var.itemView);
            }
        }

        /* renamed from: D */
        public abstract void mo60603D(@C0359n0 RecyclerView.C20061e0 e0Var, int i);

        /* renamed from: a */
        public boolean mo60604a(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20061e0 e0Var, @C0359n0 RecyclerView.C20061e0 e0Var2) {
            return true;
        }

        /* renamed from: b */
        public RecyclerView.C20061e0 mo60605b(@C0359n0 RecyclerView.C20061e0 e0Var, @C0359n0 List<RecyclerView.C20061e0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.C20061e0 e0Var2 = e0Var;
            int width = i + e0Var2.itemView.getWidth();
            int height = i2 + e0Var2.itemView.getHeight();
            int left2 = i - e0Var2.itemView.getLeft();
            int top2 = i2 - e0Var2.itemView.getTop();
            int size = list.size();
            RecyclerView.C20061e0 e0Var3 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.C20061e0 e0Var4 = list.get(i4);
                if (left2 > 0 && (right = e0Var4.itemView.getRight() - width) < 0 && e0Var4.itemView.getRight() > e0Var2.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    e0Var3 = e0Var4;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = e0Var4.itemView.getLeft() - i) > 0 && e0Var4.itemView.getLeft() < e0Var2.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    e0Var3 = e0Var4;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = e0Var4.itemView.getTop() - i2) > 0 && e0Var4.itemView.getTop() < e0Var2.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    e0Var3 = e0Var4;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = e0Var4.itemView.getBottom() - height) < 0 && e0Var4.itemView.getBottom() > e0Var2.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    e0Var3 = e0Var4;
                    i3 = abs;
                }
            }
            return e0Var3;
        }

        /* renamed from: c */
        public void mo60606c(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20061e0 e0Var) {
            C20205p.f52131a.mo60644a(e0Var.itemView);
        }

        /* renamed from: d */
        public int mo60607d(int i, int i2) {
            int i3;
            int i4 = i & f52106d;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & f52106d) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: f */
        public final int mo60608f(RecyclerView recyclerView, RecyclerView.C20061e0 e0Var) {
            return mo60607d(mo60613l(recyclerView, e0Var), C18196h2.m82553Z(recyclerView));
        }

        /* renamed from: g */
        public long mo60609g(@C0359n0 RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.C20069l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200;
                }
                return 250;
            } else if (i == 8) {
                return itemAnimator.mo59846o();
            } else {
                return itemAnimator.mo59847p();
            }
        }

        /* renamed from: h */
        public int mo60610h() {
            return 0;
        }

        /* renamed from: j */
        public final int mo60611j(RecyclerView recyclerView) {
            if (this.f52111a == -1) {
                this.f52111a = recyclerView.getResources().getDimensionPixelSize(C20030a.C20033c.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f52111a;
        }

        /* renamed from: k */
        public float mo60612k(@C0359n0 RecyclerView.C20061e0 e0Var) {
            return 0.5f;
        }

        /* renamed from: l */
        public abstract int mo60613l(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20061e0 e0Var);

        /* renamed from: m */
        public float mo60614m(float f) {
            return f;
        }

        /* renamed from: n */
        public float mo60615n(@C0359n0 RecyclerView.C20061e0 e0Var) {
            return 0.5f;
        }

        /* renamed from: o */
        public float mo60616o(float f) {
            return f;
        }

        /* renamed from: p */
        public boolean mo60617p(RecyclerView recyclerView, RecyclerView.C20061e0 e0Var) {
            return (mo60608f(recyclerView, e0Var) & C20190n.f52063W) != 0;
        }

        /* renamed from: q */
        public boolean mo60618q(RecyclerView recyclerView, RecyclerView.C20061e0 e0Var) {
            return (mo60608f(recyclerView, e0Var) & 65280) != 0;
        }

        /* renamed from: r */
        public int mo60619r(@C0359n0 RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * mo60611j(recyclerView))) * f52109g.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f52108f.getInterpolation(f));
            if (interpolation != 0) {
                return interpolation;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        }

        /* renamed from: s */
        public boolean mo60620s() {
            return true;
        }

        /* renamed from: t */
        public boolean mo60621t() {
            return true;
        }

        /* renamed from: w */
        public void mo60622w(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20061e0 e0Var, float f, float f2, int i, boolean z) {
            C20205p.f52131a.mo60646c(canvas, recyclerView, e0Var.itemView, f, f2, i, z);
        }

        /* renamed from: x */
        public void mo60623x(@C0359n0 Canvas canvas, @C0359n0 RecyclerView recyclerView, RecyclerView.C20061e0 e0Var, float f, float f2, int i, boolean z) {
            C20205p.f52131a.mo60647d(canvas, recyclerView, e0Var.itemView, f, f2, i, z);
        }

        /* renamed from: y */
        public void mo60624y(Canvas canvas, RecyclerView recyclerView, RecyclerView.C20061e0 e0Var, List<C20200h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C20200h hVar = list.get(i2);
                hVar.mo60635e();
                int save = canvas.save();
                mo60622w(canvas, recyclerView, hVar.f52118e, hVar.f52123j, hVar.f52124k, hVar.f52119f, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                mo60622w(canvas, recyclerView, e0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: z */
        public void mo60625z(Canvas canvas, RecyclerView recyclerView, RecyclerView.C20061e0 e0Var, List<C20200h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<C20200h> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C20200h hVar = list2.get(i2);
                int save = canvas.save();
                mo60623x(canvas, recyclerView, hVar.f52118e, hVar.f52123j, hVar.f52124k, hVar.f52119f, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                mo60623x(canvas, recyclerView, e0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C20200h hVar2 = list2.get(i3);
                boolean z2 = hVar2.f52126m;
                if (z2 && !hVar2.f52122i) {
                    list2.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$g */
    public class C20199g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public boolean f52112a = true;

        public C20199g() {
        }

        /* renamed from: a */
        public void mo60628a() {
            this.f52112a = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View t;
            RecyclerView.C20061e0 t0;
            int i;
            if (this.f52112a && (t = C20190n.this.mo60591t(motionEvent)) != null && (t0 = C20190n.this.f52086r.mo59648t0(t)) != null) {
                C20190n nVar = C20190n.this;
                if (nVar.f52081m.mo60617p(nVar.f52086r, t0) && motionEvent.getPointerId(0) == (i = C20190n.this.f52080l)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C20190n nVar2 = C20190n.this;
                    nVar2.f52072d = x;
                    nVar2.f52073e = y;
                    nVar2.f52077i = 0.0f;
                    nVar2.f52076h = 0.0f;
                    if (nVar2.f52081m.mo60621t()) {
                        C20190n.this.mo60575F(t0, 2);
                    }
                }
            }
        }
    }

    @C0344h1
    /* renamed from: androidx.recyclerview.widget.n$h */
    public static class C20200h implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f52114a;

        /* renamed from: b */
        public final float f52115b;

        /* renamed from: c */
        public final float f52116c;

        /* renamed from: d */
        public final float f52117d;

        /* renamed from: e */
        public final RecyclerView.C20061e0 f52118e;

        /* renamed from: f */
        public final int f52119f;
        @C0344h1

        /* renamed from: g */
        public final ValueAnimator f52120g;

        /* renamed from: h */
        public final int f52121h;

        /* renamed from: i */
        public boolean f52122i;

        /* renamed from: j */
        public float f52123j;

        /* renamed from: k */
        public float f52124k;

        /* renamed from: l */
        public boolean f52125l = false;

        /* renamed from: m */
        public boolean f52126m = false;

        /* renamed from: n */
        public float f52127n;

        /* renamed from: androidx.recyclerview.widget.n$h$a */
        public class C20201a implements ValueAnimator.AnimatorUpdateListener {
            public C20201a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C20200h.this.mo60633c(valueAnimator.getAnimatedFraction());
            }
        }

        public C20200h(RecyclerView.C20061e0 e0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f52119f = i2;
            this.f52121h = i;
            this.f52118e = e0Var;
            this.f52114a = f;
            this.f52115b = f2;
            this.f52116c = f3;
            this.f52117d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f52120g = ofFloat;
            ofFloat.addUpdateListener(new C20201a());
            ofFloat.setTarget(e0Var.itemView);
            ofFloat.addListener(this);
            mo60633c(0.0f);
        }

        /* renamed from: a */
        public void mo60631a() {
            this.f52120g.cancel();
        }

        /* renamed from: b */
        public void mo60632b(long j) {
            this.f52120g.setDuration(j);
        }

        /* renamed from: c */
        public void mo60633c(float f) {
            this.f52127n = f;
        }

        /* renamed from: d */
        public void mo60634d() {
            this.f52118e.setIsRecyclable(false);
            this.f52120g.start();
        }

        /* renamed from: e */
        public void mo60635e() {
            float f = this.f52114a;
            float f2 = this.f52116c;
            if (f == f2) {
                this.f52123j = this.f52118e.itemView.getTranslationX();
            } else {
                this.f52123j = f + (this.f52127n * (f2 - f));
            }
            float f3 = this.f52115b;
            float f4 = this.f52117d;
            if (f3 == f4) {
                this.f52124k = this.f52118e.itemView.getTranslationY();
            } else {
                this.f52124k = f3 + (this.f52127n * (f4 - f3));
            }
        }

        public void onAnimationCancel(Animator animator) {
            mo60633c(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f52126m) {
                this.f52118e.setIsRecyclable(true);
            }
            this.f52126m = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$i */
    public static abstract class C20202i extends C20196f {

        /* renamed from: i */
        public int f52129i;

        /* renamed from: j */
        public int f52130j;

        public C20202i(int i, int i2) {
            this.f52129i = i2;
            this.f52130j = i;
        }

        /* renamed from: E */
        public int mo60640E(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20061e0 e0Var) {
            return this.f52130j;
        }

        /* renamed from: F */
        public int mo60641F(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20061e0 e0Var) {
            return this.f52129i;
        }

        /* renamed from: G */
        public void mo60642G(int i) {
            this.f52130j = i;
        }

        /* renamed from: H */
        public void mo60643H(int i) {
            this.f52129i = i;
        }

        /* renamed from: l */
        public int mo60613l(@C0359n0 RecyclerView recyclerView, @C0359n0 RecyclerView.C20061e0 e0Var) {
            return C20196f.m94455v(mo60640E(recyclerView, e0Var), mo60641F(recyclerView, e0Var));
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$j */
    public interface C20203j {
        /* renamed from: d */
        void mo59398d(@C0359n0 View view, @C0359n0 View view2, int i, int i2);
    }

    public C20190n(@C0359n0 C20196f fVar) {
        this.f52081m = fVar;
    }

    /* renamed from: y */
    public static boolean m94415y(View view, float f, float f2, float f3, float f4) {
        if (f < f3 || f > f3 + ((float) view.getWidth()) || f2 < f4 || f2 > f4 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public void mo60570A() {
        VelocityTracker velocityTracker = this.f52088t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f52088t = VelocityTracker.obtain();
    }

    /* renamed from: B */
    public void mo60571B(C20200h hVar, int i) {
        this.f52086r.post(new C20194d(hVar, i));
    }

    /* renamed from: C */
    public final void mo60572C() {
        VelocityTracker velocityTracker = this.f52088t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f52088t = null;
        }
    }

    /* renamed from: D */
    public void mo60573D(View view) {
        if (view == this.f52092x) {
            this.f52092x = null;
            if (this.f52091w != null) {
                this.f52086r.setChildDrawingOrderCallback((RecyclerView.C20066j) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        if (r1 > 0) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo60574E() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$e0 r1 = r0.f52071c
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.f52068D = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f52068D
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f52086r
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.f52067C
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.f52067C = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$e0 r9 = r0.f52071c
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r0.f52067C
            r1.mo59977u(r9, r10)
            boolean r9 = r1.mo59428v()
            r10 = 0
            if (r9 == 0) goto L_0x007d
            float r9 = r0.f52078j
            float r11 = r0.f52076h
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.f52067C
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.f52086r
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f52076h
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x007e
        L_0x0059:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007d
            androidx.recyclerview.widget.RecyclerView$e0 r11 = r0.f52071c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.f52067C
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.f52086r
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f52086r
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007d
            r12 = r9
            goto L_0x007e
        L_0x007d:
            r12 = r2
        L_0x007e:
            boolean r1 = r1.mo59431w()
            if (r1 == 0) goto L_0x00c4
            float r1 = r0.f52079k
            float r9 = r0.f52077i
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.f52067C
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.f52086r
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f52077i
            int r13 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a1
            if (r9 >= 0) goto L_0x00a1
            r1 = r9
            goto L_0x00c5
        L_0x00a1:
            int r9 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView$e0 r9 = r0.f52071c
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.f52067C
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.f52086r
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f52086r
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = r2
        L_0x00c5:
            if (r12 == 0) goto L_0x00de
            androidx.recyclerview.widget.n$f r9 = r0.f52081m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f52086r
            androidx.recyclerview.widget.RecyclerView$e0 r11 = r0.f52071c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f52086r
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.mo60619r(r10, r11, r12, r13, r14)
        L_0x00de:
            r14 = r12
            if (r1 == 0) goto L_0x00fd
            androidx.recyclerview.widget.n$f r9 = r0.f52081m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f52086r
            androidx.recyclerview.widget.RecyclerView$e0 r11 = r0.f52071c
            android.view.View r11 = r11.itemView
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f52086r
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.mo60619r(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x00fe
        L_0x00fd:
            r12 = r14
        L_0x00fe:
            if (r12 != 0) goto L_0x0106
            if (r1 == 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r0.f52068D = r3
            return r2
        L_0x0106:
            long r7 = r0.f52068D
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x010e
            r0.f52068D = r5
        L_0x010e:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f52086r
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C20190n.mo60574E():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60575F(@androidx.annotation.C0363p0 androidx.recyclerview.widget.RecyclerView.C20061e0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$e0 r0 = r11.f52071c
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f52082n
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f52068D = r0
            int r4 = r11.f52082n
            r14 = 1
            r11.mo60589r(r12, r14)
            r11.f52082n = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.itemView
            r11.f52092x = r0
            r23.mo60583l()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$e0 r9 = r11.f52071c
            r8 = 0
            if (r9 == 0) goto L_0x00ed
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00d9
            if (r4 != r15) goto L_0x004a
            r7 = r8
            goto L_0x004f
        L_0x004a:
            int r0 = r11.mo60581L(r9)
            r7 = r0
        L_0x004f:
            r23.mo60572C()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007c
            if (r7 == r15) goto L_0x007c
            if (r7 == r0) goto L_0x0069
            if (r7 == r10) goto L_0x0069
            r2 = 16
            if (r7 == r2) goto L_0x0069
            r2 = 32
            if (r7 == r2) goto L_0x0069
            r17 = r1
            r18 = r17
            goto L_0x008e
        L_0x0069:
            float r2 = r11.f52076h
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f52086r
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r1
            r17 = r2
            goto L_0x008e
        L_0x007c:
            float r2 = r11.f52077i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f52086r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r1
            r18 = r2
        L_0x008e:
            if (r4 != r15) goto L_0x0092
            r6 = r10
            goto L_0x0097
        L_0x0092:
            if (r7 <= 0) goto L_0x0096
            r6 = r15
            goto L_0x0097
        L_0x0096:
            r6 = r0
        L_0x0097:
            float[] r0 = r11.f52070b
            r11.mo60594w(r0)
            float[] r0 = r11.f52070b
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.n$c r5 = new androidx.recyclerview.widget.n$c
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.n$f r0 = r11.f52081m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f52086r
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.mo60609g(r1, r15, r2, r3)
            r14.mo60632b(r0)
            java.util.List<androidx.recyclerview.widget.n$h> r0 = r11.f52084p
            r0.add(r14)
            r14.mo60634d()
            r8 = 1
            goto L_0x00e9
        L_0x00d9:
            r0 = r9
            r21 = r10
            android.view.View r1 = r0.itemView
            r11.mo60573D(r1)
            androidx.recyclerview.widget.n$f r1 = r11.f52081m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f52086r
            r1.mo60606c(r2, r0)
            r8 = 0
        L_0x00e9:
            r0 = 0
            r11.f52071c = r0
            goto L_0x00f0
        L_0x00ed:
            r21 = r10
            r8 = 0
        L_0x00f0:
            if (r12 == 0) goto L_0x0121
            androidx.recyclerview.widget.n$f r0 = r11.f52081m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f52086r
            int r0 = r0.mo60608f(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f52082n
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f52083o = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f52078j = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f52079k = r0
            r11.f52071c = r12
            r0 = 2
            if (r13 != r0) goto L_0x0121
            android.view.View r0 = r12.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f52086r
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0134
            androidx.recyclerview.widget.RecyclerView$e0 r2 = r11.f52071c
            if (r2 == 0) goto L_0x0130
            r14 = 1
            goto L_0x0131
        L_0x0130:
            r14 = r1
        L_0x0131:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0134:
            if (r8 != 0) goto L_0x013f
            androidx.recyclerview.widget.RecyclerView r0 = r11.f52086r
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            r0.mo59901O1()
        L_0x013f:
            androidx.recyclerview.widget.n$f r0 = r11.f52081m
            androidx.recyclerview.widget.RecyclerView$e0 r1 = r11.f52071c
            int r2 = r11.f52082n
            r0.mo60602C(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f52086r
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C20190n.mo60575F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    /* renamed from: G */
    public final void mo60576G() {
        this.f52085q = ViewConfiguration.get(this.f52086r.getContext()).getScaledTouchSlop();
        this.f52086r.mo59589n(this);
        this.f52086r.mo59610q(this.f52066B);
        this.f52086r.mo59607p(this);
        mo60578I();
    }

    /* renamed from: H */
    public void mo60577H(@C0359n0 RecyclerView.C20061e0 e0Var) {
        if (this.f52081m.mo60617p(this.f52086r, e0Var) && e0Var.itemView.getParent() == this.f52086r) {
            mo60570A();
            this.f52077i = 0.0f;
            this.f52076h = 0.0f;
            mo60575F(e0Var, 2);
        }
    }

    /* renamed from: I */
    public final void mo60578I() {
        this.f52065A = new C20199g();
        this.f52094z = new C18294l0(this.f52086r.getContext(), this.f52065A);
    }

    /* renamed from: J */
    public void mo60579J(@C0359n0 RecyclerView.C20061e0 e0Var) {
        if (this.f52081m.mo60618q(this.f52086r, e0Var) && e0Var.itemView.getParent() == this.f52086r) {
            mo60570A();
            this.f52077i = 0.0f;
            this.f52076h = 0.0f;
            mo60575F(e0Var, 1);
        }
    }

    /* renamed from: K */
    public final void mo60580K() {
        C20199g gVar = this.f52065A;
        if (gVar != null) {
            gVar.mo60628a();
            this.f52065A = null;
        }
        if (this.f52094z != null) {
            this.f52094z = null;
        }
    }

    /* renamed from: L */
    public final int mo60581L(RecyclerView.C20061e0 e0Var) {
        if (this.f52082n == 2) {
            return 0;
        }
        int l = this.f52081m.mo60613l(this.f52086r, e0Var);
        int d = (this.f52081m.mo60607d(l, C18196h2.m82553Z(this.f52086r)) & 65280) >> 8;
        if (d == 0) {
            return 0;
        }
        int i = (l & 65280) >> 8;
        if (Math.abs(this.f52076h) > Math.abs(this.f52077i)) {
            int n = mo60585n(e0Var, d);
            if (n <= 0) {
                int p = mo60587p(e0Var, d);
                if (p > 0) {
                    return p;
                }
            } else if ((i & n) == 0) {
                return C20196f.m94452e(n, C18196h2.m82553Z(this.f52086r));
            } else {
                return n;
            }
        } else {
            int p2 = mo60587p(e0Var, d);
            if (p2 > 0) {
                return p2;
            }
            int n2 = mo60585n(e0Var, d);
            if (n2 > 0) {
                if ((i & n2) == 0) {
                    return C20196f.m94452e(n2, C18196h2.m82553Z(this.f52086r));
                }
                return n2;
            }
        }
        return 0;
    }

    /* renamed from: M */
    public void mo60582M(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f52072d;
        this.f52076h = f;
        this.f52077i = y - this.f52073e;
        if ((i & 4) == 0) {
            this.f52076h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f52076h = Math.min(0.0f, this.f52076h);
        }
        if ((i & 1) == 0) {
            this.f52077i = Math.max(0.0f, this.f52077i);
        }
        if ((i & 2) == 0) {
            this.f52077i = Math.min(0.0f, this.f52077i);
        }
    }

    /* renamed from: b */
    public void mo32759b(@C0359n0 View view) {
        mo60573D(view);
        RecyclerView.C20061e0 t0 = this.f52086r.mo59648t0(view);
        if (t0 != null) {
            RecyclerView.C20061e0 e0Var = this.f52071c;
            if (e0Var == null || t0 != e0Var) {
                mo60589r(t0, false);
                if (this.f52069a.remove(t0.itemView)) {
                    this.f52081m.mo60606c(this.f52086r, t0);
                    return;
                }
                return;
            }
            mo60575F((RecyclerView.C20061e0) null, 0);
        }
    }

    /* renamed from: d */
    public void mo32760d(@C0359n0 View view) {
    }

    /* renamed from: g */
    public void mo59102g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C20055b0 b0Var) {
        rect.setEmpty();
    }

    /* renamed from: i */
    public void mo59864i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C20055b0 b0Var) {
        float f;
        float f2;
        this.f52093y = -1;
        if (this.f52071c != null) {
            mo60594w(this.f52070b);
            float[] fArr = this.f52070b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f52081m.mo60624y(canvas, recyclerView, this.f52071c, this.f52084p, this.f52082n, f2, f);
    }

    /* renamed from: k */
    public void mo59103k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C20055b0 b0Var) {
        float f;
        float f2;
        if (this.f52071c != null) {
            mo60594w(this.f52070b);
            float[] fArr = this.f52070b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f52081m.mo60625z(canvas, recyclerView, this.f52071c, this.f52084p, this.f52082n, f2, f);
    }

    /* renamed from: l */
    public final void mo60583l() {
    }

    /* renamed from: m */
    public void mo60584m(@C0363p0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f52086r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo60588q();
            }
            this.f52086r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f52074f = resources.getDimension(C20030a.C20033c.item_touch_helper_swipe_escape_velocity);
                this.f52075g = resources.getDimension(C20030a.C20033c.item_touch_helper_swipe_escape_max_velocity);
                mo60576G();
            }
        }
    }

    /* renamed from: n */
    public final int mo60585n(RecyclerView.C20061e0 e0Var, int i) {
        int i2;
        if ((i & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        if (this.f52076h > 0.0f) {
            i2 = 8;
        } else {
            i2 = 4;
        }
        VelocityTracker velocityTracker = this.f52088t;
        if (velocityTracker != null && this.f52080l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f52081m.mo60616o(this.f52075g));
            float xVelocity = this.f52088t.getXVelocity(this.f52080l);
            float yVelocity = this.f52088t.getYVelocity(this.f52080l);
            if (xVelocity <= 0.0f) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.f52081m.mo60614m(this.f52074f) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = ((float) this.f52086r.getWidth()) * this.f52081m.mo60615n(e0Var);
        if ((i & i2) == 0 || Math.abs(this.f52076h) <= width) {
            return 0;
        }
        return i2;
    }

    /* renamed from: o */
    public void mo60586o(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.C20061e0 v;
        int f;
        if (this.f52071c == null && i == 2 && this.f52082n != 2 && this.f52081m.mo60620s() && this.f52086r.getScrollState() != 1 && (v = mo60593v(motionEvent)) != null && (f = (this.f52081m.mo60608f(this.f52086r, v) & 65280) >> 8) != 0) {
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f2 = x - this.f52072d;
            float f3 = y - this.f52073e;
            float abs = Math.abs(f2);
            float abs2 = Math.abs(f3);
            int i3 = this.f52085q;
            if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                if (abs > abs2) {
                    if (f2 < 0.0f && (f & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (f & 8) == 0) {
                        return;
                    }
                } else if (f3 < 0.0f && (f & 1) == 0) {
                    return;
                } else {
                    if (f3 > 0.0f && (f & 2) == 0) {
                        return;
                    }
                }
                this.f52077i = 0.0f;
                this.f52076h = 0.0f;
                this.f52080l = motionEvent.getPointerId(0);
                mo60575F(v, 1);
            }
        }
    }

    /* renamed from: p */
    public final int mo60587p(RecyclerView.C20061e0 e0Var, int i) {
        int i2;
        if ((i & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        if (this.f52077i > 0.0f) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        VelocityTracker velocityTracker = this.f52088t;
        if (velocityTracker != null && this.f52080l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f52081m.mo60616o(this.f52075g));
            float xVelocity = this.f52088t.getXVelocity(this.f52080l);
            float yVelocity = this.f52088t.getYVelocity(this.f52080l);
            if (yVelocity <= 0.0f) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.f52081m.mo60614m(this.f52074f) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = ((float) this.f52086r.getHeight()) * this.f52081m.mo60615n(e0Var);
        if ((i & i2) == 0 || Math.abs(this.f52077i) <= height) {
            return 0;
        }
        return i2;
    }

    /* renamed from: q */
    public final void mo60588q() {
        this.f52086r.mo59623s1(this);
        this.f52086r.mo59654v1(this.f52066B);
        this.f52086r.mo59651u1(this);
        for (int size = this.f52084p.size() - 1; size >= 0; size--) {
            C20200h hVar = this.f52084p.get(0);
            hVar.mo60631a();
            this.f52081m.mo60606c(this.f52086r, hVar.f52118e);
        }
        this.f52084p.clear();
        this.f52092x = null;
        this.f52093y = -1;
        mo60572C();
        mo60580K();
    }

    /* renamed from: r */
    public void mo60589r(RecyclerView.C20061e0 e0Var, boolean z) {
        for (int size = this.f52084p.size() - 1; size >= 0; size--) {
            C20200h hVar = this.f52084p.get(size);
            if (hVar.f52118e == e0Var) {
                hVar.f52125l |= z;
                if (!hVar.f52126m) {
                    hVar.mo60631a();
                }
                this.f52084p.remove(size);
                return;
            }
        }
    }

    /* renamed from: s */
    public C20200h mo60590s(MotionEvent motionEvent) {
        if (this.f52084p.isEmpty()) {
            return null;
        }
        View t = mo60591t(motionEvent);
        for (int size = this.f52084p.size() - 1; size >= 0; size--) {
            C20200h hVar = this.f52084p.get(size);
            if (hVar.f52118e.itemView == t) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: t */
    public View mo60591t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.C20061e0 e0Var = this.f52071c;
        if (e0Var != null) {
            View view = e0Var.itemView;
            if (m94415y(view, x, y, this.f52078j + this.f52076h, this.f52079k + this.f52077i)) {
                return view;
            }
        }
        for (int size = this.f52084p.size() - 1; size >= 0; size--) {
            C20200h hVar = this.f52084p.get(size);
            View view2 = hVar.f52118e.itemView;
            if (m94415y(view2, x, y, hVar.f52123j, hVar.f52124k)) {
                return view2;
            }
        }
        return this.f52086r.mo59532a0(x, y);
    }

    /* renamed from: u */
    public final List<RecyclerView.C20061e0> mo60592u(RecyclerView.C20061e0 e0Var) {
        RecyclerView.C20061e0 e0Var2 = e0Var;
        List<RecyclerView.C20061e0> list = this.f52089u;
        if (list == null) {
            this.f52089u = new ArrayList();
            this.f52090v = new ArrayList();
        } else {
            list.clear();
            this.f52090v.clear();
        }
        int h = this.f52081m.mo60610h();
        int round = Math.round(this.f52078j + this.f52076h) - h;
        int round2 = Math.round(this.f52079k + this.f52077i) - h;
        int i = h * 2;
        int width = e0Var2.itemView.getWidth() + round + i;
        int height = e0Var2.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.C20076o layoutManager = this.f52086r.getLayoutManager();
        int Y = layoutManager.mo59922Y();
        int i4 = 0;
        while (i4 < Y) {
            View X = layoutManager.mo59919X(i4);
            if (X != e0Var2.itemView && X.getBottom() >= round2 && X.getTop() <= height && X.getRight() >= round && X.getLeft() <= width) {
                RecyclerView.C20061e0 t0 = this.f52086r.mo59648t0(X);
                if (this.f52081m.mo60604a(this.f52086r, this.f52071c, t0)) {
                    int abs = Math.abs(i2 - ((X.getLeft() + X.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((X.getTop() + X.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f52089u.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i5 > this.f52090v.get(i6).intValue()) {
                        i7++;
                        i6++;
                        RecyclerView.C20061e0 e0Var3 = e0Var;
                    }
                    this.f52089u.add(i7, t0);
                    this.f52090v.add(i7, Integer.valueOf(i5));
                }
            }
            i4++;
            e0Var2 = e0Var;
        }
        return this.f52089u;
    }

    /* renamed from: v */
    public final RecyclerView.C20061e0 mo60593v(MotionEvent motionEvent) {
        View t;
        RecyclerView.C20076o layoutManager = this.f52086r.getLayoutManager();
        int i = this.f52080l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f52072d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f52073e);
        int i2 = this.f52085q;
        if (abs < ((float) i2) && abs2 < ((float) i2)) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo59428v()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.mo59431w()) && (t = mo60591t(motionEvent)) != null) {
            return this.f52086r.mo59648t0(t);
        }
        return null;
    }

    /* renamed from: w */
    public final void mo60594w(float[] fArr) {
        if ((this.f52083o & 12) != 0) {
            fArr[0] = (this.f52078j + this.f52076h) - ((float) this.f52071c.itemView.getLeft());
        } else {
            fArr[0] = this.f52071c.itemView.getTranslationX();
        }
        if ((this.f52083o & 3) != 0) {
            fArr[1] = (this.f52079k + this.f52077i) - ((float) this.f52071c.itemView.getTop());
        } else {
            fArr[1] = this.f52071c.itemView.getTranslationY();
        }
    }

    /* renamed from: x */
    public boolean mo60595x() {
        int size = this.f52084p.size();
        for (int i = 0; i < size; i++) {
            if (!this.f52084p.get(i).f52126m) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public void mo60596z(RecyclerView.C20061e0 e0Var) {
        if (!this.f52086r.isLayoutRequested() && this.f52082n == 2) {
            float k = this.f52081m.mo60612k(e0Var);
            int i = (int) (this.f52078j + this.f52076h);
            int i2 = (int) (this.f52079k + this.f52077i);
            if (((float) Math.abs(i2 - e0Var.itemView.getTop())) >= ((float) e0Var.itemView.getHeight()) * k || ((float) Math.abs(i - e0Var.itemView.getLeft())) >= ((float) e0Var.itemView.getWidth()) * k) {
                List<RecyclerView.C20061e0> u = mo60592u(e0Var);
                if (u.size() != 0) {
                    RecyclerView.C20061e0 b = this.f52081m.mo60605b(e0Var, u, i, i2);
                    if (b == null) {
                        this.f52089u.clear();
                        this.f52090v.clear();
                        return;
                    }
                    int absoluteAdapterPosition = b.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = e0Var.getAbsoluteAdapterPosition();
                    if (this.f52081m.mo60600A(this.f52086r, e0Var, b)) {
                        this.f52081m.mo60601B(this.f52086r, e0Var, absoluteAdapterPosition2, b, absoluteAdapterPosition, i, i2);
                    }
                }
            }
        }
    }
}
