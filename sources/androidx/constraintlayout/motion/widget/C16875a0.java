package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.C16912z;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.C16958f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.a0 */
public class C16875a0 {

    /* renamed from: a */
    public final MotionLayout f43348a;

    /* renamed from: b */
    public ArrayList<C16912z> f43349b = new ArrayList<>();

    /* renamed from: c */
    public HashSet<View> f43350c;

    /* renamed from: d */
    public String f43351d = "ViewTransitionController";

    /* renamed from: e */
    public ArrayList<C16912z.C16914b> f43352e;

    /* renamed from: f */
    public ArrayList<C16912z.C16914b> f43353f = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.a0$a */
    public class C16876a implements C16958f.C16959a {

        /* renamed from: a */
        public final /* synthetic */ C16912z f43354a;

        /* renamed from: b */
        public final /* synthetic */ int f43355b;

        /* renamed from: c */
        public final /* synthetic */ boolean f43356c;

        /* renamed from: d */
        public final /* synthetic */ int f43357d;

        public C16876a(C16912z zVar, int i, boolean z, int i2) {
            this.f43354a = zVar;
            this.f43355b = i;
            this.f43356c = z;
            this.f43357d = i2;
        }

        /* renamed from: a */
        public void mo50124a(int i, int i2, int i3) {
            int h = this.f43354a.mo50473h();
            this.f43354a.mo50482r(i2);
            if (this.f43355b == i && h != i2) {
                if (this.f43356c) {
                    if (this.f43357d == i2) {
                        int childCount = C16875a0.this.f43348a.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = C16875a0.this.f43348a.getChildAt(i4);
                            if (this.f43354a.mo50477m(childAt)) {
                                int currentState = C16875a0.this.f43348a.getCurrentState();
                                C16934c n0 = C16875a0.this.f43348a.mo50021n0(currentState);
                                C16912z zVar = this.f43354a;
                                C16875a0 a0Var = C16875a0.this;
                                zVar.mo50468c(a0Var, a0Var.f43348a, currentState, n0, childAt);
                            }
                        }
                    }
                } else if (this.f43357d != i2) {
                    int childCount2 = C16875a0.this.f43348a.getChildCount();
                    for (int i5 = 0; i5 < childCount2; i5++) {
                        View childAt2 = C16875a0.this.f43348a.getChildAt(i5);
                        if (this.f43354a.mo50477m(childAt2)) {
                            int currentState2 = C16875a0.this.f43348a.getCurrentState();
                            C16934c n02 = C16875a0.this.f43348a.mo50021n0(currentState2);
                            C16912z zVar2 = this.f43354a;
                            C16875a0 a0Var2 = C16875a0.this;
                            zVar2.mo50468c(a0Var2, a0Var2.f43348a, currentState2, n02, childAt2);
                        }
                    }
                }
            }
        }
    }

    public C16875a0(MotionLayout motionLayout) {
        this.f43348a = motionLayout;
    }

    /* renamed from: b */
    public void mo50111b(C16912z zVar) {
        this.f43349b.add(zVar);
        this.f43350c = null;
        if (zVar.mo50475j() == 4) {
            mo50118i(zVar, true);
        } else if (zVar.mo50475j() == 5) {
            mo50118i(zVar, false);
        }
    }

    /* renamed from: c */
    public void mo50112c(C16912z.C16914b bVar) {
        if (this.f43352e == null) {
            this.f43352e = new ArrayList<>();
        }
        this.f43352e.add(bVar);
    }

    /* renamed from: d */
    public void mo50113d() {
        ArrayList<C16912z.C16914b> arrayList = this.f43352e;
        if (arrayList != null) {
            Iterator<C16912z.C16914b> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo50489a();
            }
            this.f43352e.removeAll(this.f43353f);
            this.f43353f.clear();
            if (this.f43352e.isEmpty()) {
                this.f43352e = null;
            }
        }
    }

    /* renamed from: e */
    public boolean mo50114e(int i, C16895o oVar) {
        Iterator<C16912z> it = this.f43349b.iterator();
        while (it.hasNext()) {
            C16912z next = it.next();
            if (next.mo50470e() == i) {
                next.f44006g.mo50174a(oVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo50115f(int i, boolean z) {
        Iterator<C16912z> it = this.f43349b.iterator();
        while (it.hasNext()) {
            C16912z next = it.next();
            if (next.mo50470e() == i) {
                next.mo50479o(z);
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo50116g() {
        this.f43348a.invalidate();
    }

    /* renamed from: h */
    public boolean mo50117h(int i) {
        Iterator<C16912z> it = this.f43349b.iterator();
        while (it.hasNext()) {
            C16912z next = it.next();
            if (next.mo50470e() == i) {
                return next.mo50476k();
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo50118i(C16912z zVar, boolean z) {
        ConstraintLayout.getSharedValues().mo50984a(zVar.mo50474i(), new C16876a(zVar, zVar.mo50474i(), z, zVar.mo50472g()));
    }

    /* renamed from: j */
    public void mo50119j(int i) {
        C16912z zVar;
        Iterator<C16912z> it = this.f43349b.iterator();
        while (true) {
            if (!it.hasNext()) {
                zVar = null;
                break;
            }
            zVar = it.next();
            if (zVar.mo50470e() == i) {
                break;
            }
        }
        if (zVar != null) {
            this.f43350c = null;
            this.f43349b.remove(zVar);
        }
    }

    /* renamed from: k */
    public void mo50120k(C16912z.C16914b bVar) {
        this.f43353f.add(bVar);
    }

    /* renamed from: l */
    public void mo50121l(MotionEvent motionEvent) {
        C16912z zVar;
        int currentState = this.f43348a.getCurrentState();
        if (currentState != -1) {
            if (this.f43350c == null) {
                this.f43350c = new HashSet<>();
                Iterator<C16912z> it = this.f43349b.iterator();
                while (it.hasNext()) {
                    C16912z next = it.next();
                    int childCount = this.f43348a.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.f43348a.getChildAt(i);
                        if (next.mo50477m(childAt)) {
                            childAt.getId();
                            this.f43350c.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<C16912z.C16914b> arrayList = this.f43352e;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C16912z.C16914b> it2 = this.f43352e.iterator();
                while (it2.hasNext()) {
                    it2.next().mo50492d(action, x, y);
                }
            }
            if (action == 0 || action == 1) {
                C16934c n0 = this.f43348a.mo50021n0(currentState);
                Iterator<C16912z> it3 = this.f43349b.iterator();
                while (it3.hasNext()) {
                    C16912z next2 = it3.next();
                    if (next2.mo50486u(action)) {
                        Iterator<View> it4 = this.f43350c.iterator();
                        while (it4.hasNext()) {
                            View next3 = it4.next();
                            if (next2.mo50477m(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    zVar = next2;
                                    next2.mo50468c(this, this.f43348a, currentState, n0, next3);
                                } else {
                                    zVar = next2;
                                }
                                next2 = zVar;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public void mo50122m(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<C16912z> it = this.f43349b.iterator();
        while (it.hasNext()) {
            C16912z next = it.next();
            if (next.mo50470e() == i) {
                for (View view : viewArr) {
                    if (next.mo50469d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    mo50123n(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo50123n(C16912z zVar, View... viewArr) {
        int currentState = this.f43348a.getCurrentState();
        if (zVar.f44005f == 2) {
            zVar.mo50468c(this, this.f43348a, currentState, (C16934c) null, viewArr);
        } else if (currentState == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("No support for ViewTransition within transition yet. Currently: ");
            sb.append(this.f43348a.toString());
        } else {
            C16934c n0 = this.f43348a.mo50021n0(currentState);
            if (n0 != null) {
                zVar.mo50468c(this, this.f43348a, currentState, n0, viewArr);
            }
        }
    }
}
