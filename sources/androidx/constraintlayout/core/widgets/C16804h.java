package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.C16786h;
import androidx.constraintlayout.core.widgets.analyzer.C16794n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.widgets.h */
public class C16804h extends ConstraintWidget implements C16803g {

    /* renamed from: A1 */
    public ConstraintWidget[] f43034A1 = new ConstraintWidget[4];

    /* renamed from: B1 */
    public int f43035B1 = 0;

    /* renamed from: a */
    public void mo49809a(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.f43035B1 + 1;
            ConstraintWidget[] constraintWidgetArr = this.f43034A1;
            if (i > constraintWidgetArr.length) {
                this.f43034A1 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.f43034A1;
            int i2 = this.f43035B1;
            constraintWidgetArr2[i2] = constraintWidget;
            this.f43035B1 = i2 + 1;
        }
    }

    /* renamed from: b */
    public void mo49810b() {
        this.f43035B1 = 0;
        Arrays.fill(this.f43034A1, (Object) null);
    }

    /* renamed from: c */
    public void mo49811c(C16798d dVar) {
    }

    /* renamed from: k2 */
    public void mo49812k2(ArrayList<C16794n> arrayList, int i, C16794n nVar) {
        for (int i2 = 0; i2 < this.f43035B1; i2++) {
            nVar.mo49688a(this.f43034A1[i2]);
        }
        for (int i3 = 0; i3 < this.f43035B1; i3++) {
            C16786h.m77029a(this.f43034A1[i3], i, arrayList, nVar);
        }
    }

    /* renamed from: l2 */
    public int mo49813l2(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f43035B1; i4++) {
            ConstraintWidget constraintWidget = this.f43034A1[i4];
            if (i == 0 && (i3 = constraintWidget.f42713S0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = constraintWidget.f42715T0) != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public void mo49571n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo49571n(constraintWidget, hashMap);
        C16804h hVar = (C16804h) constraintWidget;
        this.f43035B1 = 0;
        int i = hVar.f43035B1;
        for (int i2 = 0; i2 < i; i2++) {
            mo49809a(hashMap.get(hVar.f43034A1[i2]));
        }
    }
}
