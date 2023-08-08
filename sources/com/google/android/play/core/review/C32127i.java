package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C32044e;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.review.i */
public class C32127i<T> extends C32044e {

    /* renamed from: n */
    public final C32062k f78346n;

    /* renamed from: o */
    public final C32239p<T> f78347o;

    /* renamed from: p */
    public final /* synthetic */ C32129k f78348p;

    public C32127i(C32129k kVar, C32062k kVar2, C32239p<T> pVar) {
        this.f78348p = kVar;
        this.f78346n = kVar2;
        this.f78347o = pVar;
    }

    /* renamed from: b0 */
    public void mo92765b0(Bundle bundle) throws RemoteException {
        this.f78348p.f78350a.mo92830b();
        this.f78346n.mo92778d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
