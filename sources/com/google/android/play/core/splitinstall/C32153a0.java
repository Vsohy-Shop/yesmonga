package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C32239p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.a0 */
public final class C32153a0 extends C32159c0<List<C32167f>> {
    public C32153a0(C32162d0 d0Var, C32239p<List<C32167f>> pVar) {
        super(d0Var, pVar);
    }

    /* renamed from: V */
    public final void mo92808V(List<Bundle> list) throws RemoteException {
        super.mo92808V(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Bundle f : list) {
            arrayList.add(C32167f.m130175f(f));
        }
        this.f78395n.mo93034e(arrayList);
    }
}
