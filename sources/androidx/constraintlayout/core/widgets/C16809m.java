package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C16641c;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.m */
public class C16809m extends ConstraintWidget {

    /* renamed from: A1 */
    public ArrayList<ConstraintWidget> f43070A1 = new ArrayList<>();

    public C16809m() {
    }

    /* renamed from: Q1 */
    public void mo49497Q1(int i, int i2) {
        super.mo49497Q1(i, i2);
        int size = this.f43070A1.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f43070A1.get(i3).mo49497Q1(mo49519Y(), mo49522Z());
        }
    }

    /* renamed from: R0 */
    public void mo49499R0() {
        this.f43070A1.clear();
        super.mo49499R0();
    }

    /* renamed from: W0 */
    public void mo49514W0(C16641c cVar) {
        super.mo49514W0(cVar);
        int size = this.f43070A1.size();
        for (int i = 0; i < size; i++) {
            this.f43070A1.get(i).mo49514W0(cVar);
        }
    }

    /* renamed from: a */
    public void mo49841a(ConstraintWidget constraintWidget) {
        this.f43070A1.add(constraintWidget);
        if (constraintWidget.mo49507U() != null) {
            ((C16809m) constraintWidget.mo49507U()).mo49845o2(constraintWidget);
        }
        constraintWidget.mo49503S1(this);
    }

    /* renamed from: k2 */
    public void mo49842k2(ConstraintWidget... constraintWidgetArr) {
        for (ConstraintWidget a : constraintWidgetArr) {
            mo49841a(a);
        }
    }

    /* renamed from: l2 */
    public ArrayList<ConstraintWidget> mo49843l2() {
        return this.f43070A1;
    }

    /* renamed from: m2 */
    public C16798d mo49844m2() {
        C16798d dVar;
        ConstraintWidget U = mo49507U();
        if (this instanceof C16798d) {
            dVar = (C16798d) this;
        } else {
            dVar = null;
        }
        while (U != null) {
            ConstraintWidget U2 = U.mo49507U();
            if (U instanceof C16798d) {
                dVar = (C16798d) U;
            }
            U = U2;
        }
        return dVar;
    }

    /* renamed from: n2 */
    public void mo49743n2() {
        ArrayList<ConstraintWidget> arrayList = this.f43070A1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.f43070A1.get(i);
                if (constraintWidget instanceof C16809m) {
                    ((C16809m) constraintWidget).mo49743n2();
                }
            }
        }
    }

    /* renamed from: o2 */
    public void mo49845o2(ConstraintWidget constraintWidget) {
        this.f43070A1.remove(constraintWidget);
        constraintWidget.mo49499R0();
    }

    /* renamed from: p2 */
    public void mo49846p2() {
        this.f43070A1.clear();
    }

    public C16809m(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public C16809m(int i, int i2) {
        super(i, i2);
    }
}
