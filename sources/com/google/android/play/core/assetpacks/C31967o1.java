package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.o1 */
public final /* synthetic */ class C31967o1 implements Runnable {

    /* renamed from: a */
    public final C31983s1 f78014a;

    /* renamed from: b */
    public final List f78015b;

    /* renamed from: c */
    public final C31895a0 f78016c;

    /* renamed from: d */
    public final C32239p f78017d;

    public C31967o1(C31983s1 s1Var, List list, C31895a0 a0Var, C32239p pVar) {
        this.f78014a = s1Var;
        this.f78015b = list;
        this.f78016c = a0Var;
        this.f78017d = pVar;
    }

    public final void run() {
        this.f78014a.mo92672l(this.f78015b, this.f78016c, this.f78017d);
    }
}
