package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.C40666o;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.C40670s;
import com.google.android.gms.common.api.C40671t;
import com.google.android.gms.common.api.C40672u;
import com.google.android.gms.common.api.C40673v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40843u;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.h3 */
public final class C40562h3<R extends C40669r> extends C40673v<R> implements C40670s<R> {
    @C0363p0

    /* renamed from: a */
    public C40672u f103385a = null;
    @C0363p0

    /* renamed from: b */
    public C40562h3 f103386b = null;
    @C0363p0

    /* renamed from: c */
    public volatile C40671t f103387c = null;
    @C0363p0

    /* renamed from: d */
    public C40663m f103388d = null;

    /* renamed from: e */
    public final Object f103389e = new Object();
    @C0363p0

    /* renamed from: f */
    public Status f103390f = null;

    /* renamed from: g */
    public final WeakReference f103391g;

    /* renamed from: h */
    public final C40550f3 f103392h;

    /* renamed from: i */
    public boolean f103393i = false;

    public C40562h3(WeakReference weakReference) {
        Looper looper;
        C40843u.m166203m(weakReference, "GoogleApiClient reference must not be null");
        this.f103391g = weakReference;
        C40507i iVar = (C40507i) weakReference.get();
        if (iVar != null) {
            looper = iVar.mo133757r();
        } else {
            looper = Looper.getMainLooper();
        }
        this.f103392h = new C40550f3(this, looper);
    }

    /* renamed from: q */
    public static final void m165066q(C40669r rVar) {
        if (rVar instanceof C40666o) {
            try {
                ((C40666o) rVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(rVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo133903a(C40669r rVar) {
        synchronized (this.f103389e) {
            if (!rVar.getStatus().mo133655p0()) {
                mo133922m(rVar.getStatus());
                m165066q(rVar);
            } else if (this.f103385a != null) {
                C40633u2.m165403a().submit(new C40544e3(this, rVar));
            } else if (mo133925p()) {
                ((C40671t) C40843u.m166202l(this.f103387c)).mo134098c(rVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo133918b(@C0359n0 C40671t<? super R> tVar) {
        boolean z;
        synchronized (this.f103389e) {
            boolean z2 = true;
            if (this.f103387c == null) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166209s(z, "Cannot call andFinally() twice.");
            if (this.f103385a != null) {
                z2 = false;
            }
            C40843u.m166209s(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f103387c = tVar;
            mo133923n();
        }
    }

    @C0359n0
    /* renamed from: c */
    public final <S extends C40669r> C40673v<S> mo133919c(@C0359n0 C40672u<? super R, ? extends S> uVar) {
        boolean z;
        C40562h3 h3Var;
        synchronized (this.f103389e) {
            boolean z2 = true;
            if (this.f103385a == null) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166209s(z, "Cannot call then() twice.");
            if (this.f103387c != null) {
                z2 = false;
            }
            C40843u.m166209s(z2, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f103385a = uVar;
            h3Var = new C40562h3(this.f103391g);
            this.f103386b = h3Var;
            mo133923n();
        }
        return h3Var;
    }

    /* renamed from: k */
    public final void mo133920k() {
        this.f103387c = null;
    }

    /* renamed from: l */
    public final void mo133921l(C40663m mVar) {
        synchronized (this.f103389e) {
            this.f103388d = mVar;
            mo133923n();
        }
    }

    /* renamed from: m */
    public final void mo133922m(Status status) {
        synchronized (this.f103389e) {
            this.f103390f = status;
            mo133924o(status);
        }
    }

    @GuardedBy("mSyncToken")
    /* renamed from: n */
    public final void mo133923n() {
        if (this.f103385a != null || this.f103387c != null) {
            C40507i iVar = (C40507i) this.f103391g.get();
            if (!(this.f103393i || this.f103385a == null || iVar == null)) {
                iVar.mo133743H(this);
                this.f103393i = true;
            }
            Status status = this.f103390f;
            if (status != null) {
                mo133924o(status);
                return;
            }
            C40663m mVar = this.f103388d;
            if (mVar != null) {
                mVar.mo133787h(this);
            }
        }
    }

    /* renamed from: o */
    public final void mo133924o(Status status) {
        synchronized (this.f103389e) {
            C40672u uVar = this.f103385a;
            if (uVar != null) {
                ((C40562h3) C40843u.m166202l(this.f103386b)).mo133922m((Status) C40843u.m166203m(uVar.mo134103b(status), "onFailure must not return null"));
            } else if (mo133925p()) {
                ((C40671t) C40843u.m166202l(this.f103387c)).mo134097b(status);
            }
        }
    }

    @GuardedBy("mSyncToken")
    /* renamed from: p */
    public final boolean mo133925p() {
        return (this.f103387c == null || ((C40507i) this.f103391g.get()) == null) ? false : true;
    }
}
