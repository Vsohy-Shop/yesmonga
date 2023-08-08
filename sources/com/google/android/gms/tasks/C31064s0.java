package com.google.android.gms.tasks;

import com.google.android.gms.internal.tasks.C30305a;

/* renamed from: com.google.android.gms.tasks.s0 */
public final /* synthetic */ class C31064s0 implements C31035e {

    /* renamed from: a */
    public final /* synthetic */ C30305a f74328a;

    /* renamed from: b */
    public final /* synthetic */ C31049l f74329b;

    /* renamed from: c */
    public final /* synthetic */ C31068v f74330c;

    public /* synthetic */ C31064s0(C30305a aVar, C31049l lVar, C31068v vVar) {
        this.f74328a = aVar;
        this.f74329b = lVar;
        this.f74330c = vVar;
    }

    public final void onComplete(C31047k kVar) {
        C30305a aVar = this.f74328a;
        C31049l lVar = this.f74329b;
        C31068v vVar = this.f74330c;
        aVar.removeCallbacksAndMessages((Object) null);
        if (kVar.mo87738v()) {
            lVar.mo87745e(kVar.mo87734r());
        } else if (kVar.mo87736t()) {
            vVar.mo87766c();
        } else {
            Exception q = kVar.mo87733q();
            q.getClass();
            lVar.mo87744d(q);
        }
    }
}
