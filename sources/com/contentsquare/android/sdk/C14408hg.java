package com.contentsquare.android.sdk;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.C14893yb;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.contentsquare.android.sdk.hg */
public class C14408hg {

    /* renamed from: a */
    public final C14663r3<View> f35614a;

    public C14408hg(C14663r3<View> r3Var) {
        this.f35614a = r3Var;
    }

    /* renamed from: a */
    public C14749tb mo35508a(ViewGroup viewGroup, C14296e6 e6Var, C14893yb.C14895b bVar, C14450jc jcVar) {
        C14749tb tbVar = new C14749tb();
        tbVar.mo36521c(mo35510c(viewGroup, e6Var, bVar, jcVar));
        return tbVar;
    }

    /* renamed from: b */
    public final List<C14249c8> mo35509b(Queue<Pair<ViewGroup, C14249c8>> queue, ViewGroup viewGroup, C14296e6 e6Var, C14893yb.C14895b bVar, C14450jc jcVar) {
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!this.f35614a.mo34386b(childAt)) {
                C14249c8 a = C14669r8.m63250a(childAt, bVar, jcVar);
                arrayList.add(a);
                if (childAt instanceof ViewGroup) {
                    queue.add(new Pair((ViewGroup) childAt, a));
                }
                e6Var.mo35035e(childAt, a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<C14249c8> mo35510c(ViewGroup viewGroup, C14296e6 e6Var, C14893yb.C14895b bVar, C14450jc jcVar) {
        C14249c8 a = C14669r8.m63250a(viewGroup, bVar, jcVar);
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Pair(viewGroup, a));
        while (!linkedList.isEmpty()) {
            Pair pair = (Pair) linkedList.remove();
            C14249c8 c8Var = (C14249c8) pair.second;
            List<C14249c8> b = mo35509b(linkedList, (ViewGroup) pair.first, e6Var, bVar, jcVar);
            if (!C14258ce.m61352a(b)) {
                c8Var.mo34841d(b);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        return arrayList;
    }
}
