package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0363p0;
import androidx.camera.view.C1814q;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.base.C41084u;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.v3 */
public abstract class C40639v3 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public volatile boolean f103603b;

    /* renamed from: c */
    public final AtomicReference f103604c = new AtomicReference((Object) null);

    /* renamed from: d */
    public final Handler f103605d = new C41084u(Looper.getMainLooper());

    /* renamed from: e */
    public final C40713g f103606e;

    @C40974d0
    public C40639v3(C40587m mVar, C40713g gVar) {
        super(mVar);
        this.f103606e = gVar;
    }

    /* renamed from: q */
    public static final int m165458q(@C0363p0 C40623s3 s3Var) {
        if (s3Var == null) {
            return -1;
        }
        return s3Var.mo134025a();
    }

    /* renamed from: f */
    public final void mo133803f(int i, int i2, Intent intent) {
        C40623s3 s3Var = (C40623s3) this.f103604c.get();
        if (i != 1) {
            if (i == 2) {
                int j = this.f103606e.mo134208j(mo133802b());
                if (j == 0) {
                    mo134077p();
                    return;
                } else if (s3Var != null) {
                    if (s3Var.mo134026b().mo133591M() == 18 && j == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            mo134077p();
            return;
        } else if (i2 == 0) {
            if (s3Var != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                mo134075m(new ConnectionResult(i3, (PendingIntent) null, s3Var.mo134026b().toString()), m165458q(s3Var));
                return;
            }
            return;
        }
        if (s3Var != null) {
            mo134075m(s3Var.mo134026b(), s3Var.mo134025a());
        }
    }

    /* renamed from: g */
    public final void mo133804g(@C0363p0 Bundle bundle) {
        C40623s3 s3Var;
        super.mo133804g(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f103604c;
            if (bundle.getBoolean("resolving_error", false)) {
                s3Var = new C40623s3(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                s3Var = null;
            }
            atomicReference.set(s3Var);
        }
    }

    /* renamed from: j */
    public final void mo133807j(Bundle bundle) {
        super.mo133807j(bundle);
        C40623s3 s3Var = (C40623s3) this.f103604c.get();
        if (s3Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", s3Var.mo134025a());
            bundle.putInt("failed_status", s3Var.mo134026b().mo133591M());
            bundle.putParcelable("failed_resolution", s3Var.mo134026b().mo133593W());
        }
    }

    /* renamed from: k */
    public void mo133808k() {
        super.mo133808k();
        this.f103603b = true;
    }

    /* renamed from: l */
    public void mo87750l() {
        super.mo87750l();
        this.f103603b = false;
    }

    /* renamed from: m */
    public final void mo134075m(ConnectionResult connectionResult, int i) {
        this.f103604c.set((Object) null);
        mo133960n(connectionResult, i);
    }

    /* renamed from: n */
    public abstract void mo133960n(ConnectionResult connectionResult, int i);

    /* renamed from: o */
    public abstract void mo133961o();

    public final void onCancel(DialogInterface dialogInterface) {
        mo134075m(new ConnectionResult(13, (PendingIntent) null), m165458q((C40623s3) this.f103604c.get()));
    }

    /* renamed from: p */
    public final void mo134077p() {
        this.f103604c.set((Object) null);
        mo133961o();
    }

    /* renamed from: t */
    public final void mo134078t(ConnectionResult connectionResult, int i) {
        C40623s3 s3Var = new C40623s3(connectionResult, i);
        AtomicReference atomicReference = this.f103604c;
        while (!C1814q.m7242a(atomicReference, (Object) null, s3Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f103605d.post(new C40634u3(this, s3Var));
    }
}
