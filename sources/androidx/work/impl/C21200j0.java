package androidx.work.impl;

import androidx.work.impl.model.C21249u;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.work.impl.j0 */
public final /* synthetic */ class C21200j0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WorkDatabase f54712a;

    /* renamed from: b */
    public final /* synthetic */ C21249u f54713b;

    /* renamed from: c */
    public final /* synthetic */ C21249u f54714c;

    /* renamed from: d */
    public final /* synthetic */ List f54715d;

    /* renamed from: e */
    public final /* synthetic */ String f54716e;

    /* renamed from: f */
    public final /* synthetic */ Set f54717f;

    /* renamed from: g */
    public final /* synthetic */ boolean f54718g;

    public /* synthetic */ C21200j0(WorkDatabase workDatabase, C21249u uVar, C21249u uVar2, List list, String str, Set set, boolean z) {
        this.f54712a = workDatabase;
        this.f54713b = uVar;
        this.f54714c = uVar2;
        this.f54715d = list;
        this.f54716e = str;
        this.f54717f = set;
        this.f54718g = z;
    }

    public final void run() {
        WorkerUpdater.m97686i(this.f54712a, this.f54713b, this.f54714c, this.f54715d, this.f54716e, this.f54717f, this.f54718g);
    }
}
