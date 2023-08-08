package androidx.work.impl;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: androidx.work.impl.p */
public final /* synthetic */ class C21284p implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C21286r f54908a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f54909b;

    /* renamed from: c */
    public final /* synthetic */ String f54910c;

    public /* synthetic */ C21284p(C21286r rVar, ArrayList arrayList, String str) {
        this.f54908a = rVar;
        this.f54909b = arrayList;
        this.f54910c = str;
    }

    public final Object call() {
        return this.f54908a.m98320n(this.f54909b, this.f54910c);
    }
}
