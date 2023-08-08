package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.n1 */
public final /* synthetic */ class C31963n1 implements Runnable {

    /* renamed from: a */
    public final C31983s1 f78005a;

    /* renamed from: b */
    public final List f78006b;

    /* renamed from: c */
    public final C32239p f78007c;

    /* renamed from: d */
    public final List f78008d;

    public C31963n1(C31983s1 s1Var, List list, C32239p pVar, List list2) {
        this.f78005a = s1Var;
        this.f78006b = list;
        this.f78007c = pVar;
        this.f78008d = list2;
    }

    public final void run() {
        this.f78005a.mo92673m(this.f78006b, this.f78007c, this.f78008d);
    }
}
