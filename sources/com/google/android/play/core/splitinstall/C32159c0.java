package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C32075o0;
import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.c0 */
public class C32159c0<T> extends C32075o0 {

    /* renamed from: n */
    public final C32239p<T> f78395n;

    /* renamed from: o */
    public final /* synthetic */ C32162d0 f78396o;

    public C32159c0(C32162d0 d0Var, C32239p<T> pVar) {
        this.f78396o = d0Var;
        this.f78395n = pVar;
    }

    /* renamed from: D0 */
    public void mo92801D0(int i, Bundle bundle) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: D3 */
    public void mo92802D3(int i, Bundle bundle) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onStartInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: E6 */
    public void mo92803E6(int i, Bundle bundle) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: F0 */
    public void mo92804F0(Bundle bundle) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onDeferredLanguageUninstall", new Object[0]);
    }

    /* renamed from: G6 */
    public final void mo92805G6(Bundle bundle) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        int i = bundle.getInt("error_code");
        C32162d0.f78398c.mo92776b("onError(%d)", Integer.valueOf(i));
        this.f78395n.mo93033d(new SplitInstallException(i));
    }

    /* renamed from: H */
    public void mo92806H(Bundle bundle) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onDeferredInstall", new Object[0]);
    }

    /* renamed from: K0 */
    public void mo92807K0(Bundle bundle) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onDeferredLanguageInstall", new Object[0]);
    }

    /* renamed from: V */
    public void mo92808V(List<Bundle> list) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: l */
    public final void mo92809l() throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    /* renamed from: m */
    public final void mo92810m() throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onGetSplitsForAppUpdate", new Object[0]);
    }

    /* renamed from: r8 */
    public void mo92811r8(Bundle bundle) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onDeferredUninstall", new Object[0]);
    }

    /* renamed from: w3 */
    public final void mo92812w3(int i) throws RemoteException {
        this.f78396o.f78401b.mo92830b();
        C32162d0.f78398c.mo92778d("onCompleteInstall(%d)", Integer.valueOf(i));
    }
}
