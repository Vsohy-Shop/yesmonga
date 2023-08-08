package androidx.camera.core;

import androidx.camera.core.C1363b4;

/* renamed from: androidx.camera.core.d4 */
public final /* synthetic */ class C1387d4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1363b4.C1373i f4029a;

    /* renamed from: b */
    public final /* synthetic */ int f4030b;

    /* renamed from: c */
    public final /* synthetic */ String f4031c;

    /* renamed from: d */
    public final /* synthetic */ Throwable f4032d;

    public /* synthetic */ C1387d4(C1363b4.C1373i iVar, int i, String str, Throwable th) {
        this.f4029a = iVar;
        this.f4030b = i;
        this.f4031c = str;
        this.f4032d = th;
    }

    public final void run() {
        this.f4029a.m5849e(this.f4030b, this.f4031c, this.f4032d);
    }
}
