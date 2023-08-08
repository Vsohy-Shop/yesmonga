package com.contentsquare.android.sdk;

import android.util.SparseArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.contentsquare.android.sdk.x6 */
public class C14850x6 {

    /* renamed from: a */
    public SparseArray<C14814w4> f36832a = new SparseArray<>();

    /* renamed from: a */
    public List<C14374ga> mo36811a(MotionEvent motionEvent, long j) {
        ArrayList arrayList = new ArrayList();
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount > 1) {
            motionEvent.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
            for (int i = 0; i < pointerCount; i++) {
                mo36812b(motionEvent.getPointerId(i), j, (int) motionEvent.getX(i), (int) motionEvent.getY(i));
            }
        } else {
            mo36812b(motionEvent.getPointerId(0), j, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            for (int i2 = 0; i2 < this.f36832a.size(); i2++) {
                arrayList.add(this.f36832a.get(this.f36832a.keyAt(i2)));
            }
            this.f36832a = new SparseArray<>();
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo36812b(int i, long j, int i2, int i3) {
        C14814w4 w4Var = this.f36832a.get(i);
        if (w4Var == null) {
            w4Var = new C14814w4();
        }
        w4Var.mo36674d(j, i2, i3);
        this.f36832a.put(i, w4Var);
    }
}
