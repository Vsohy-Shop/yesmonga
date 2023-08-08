package androidx.core.location;

import android.os.Bundle;
import androidx.core.location.C17735w;

/* renamed from: androidx.core.location.r0 */
public final /* synthetic */ class C17726r0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17747l f46090a;

    /* renamed from: b */
    public final /* synthetic */ String f46091b;

    /* renamed from: c */
    public final /* synthetic */ int f46092c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f46093d;

    public /* synthetic */ C17726r0(C17735w.C17747l lVar, String str, int i, Bundle bundle) {
        this.f46090a = lVar;
        this.f46091b = str;
        this.f46092c = i;
        this.f46093d = bundle;
    }

    public final void run() {
        this.f46090a.m81059m(this.f46091b, this.f46092c, this.f46093d);
    }
}
