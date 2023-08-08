package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.maps.internal.C30471d;
import com.google.android.gms.maps.internal.C30499k;
import com.google.android.gms.maps.internal.C30513n1;
import com.google.android.gms.maps.model.RuntimeRemoteException;

@C40974d0
/* renamed from: com.google.android.gms.maps.j0 */
public final class C30554j0 implements C30499k {

    /* renamed from: a */
    public final Fragment f72974a;

    /* renamed from: b */
    public final C30471d f72975b;

    public C30554j0(Fragment fragment, C30471d dVar) {
        this.f72975b = (C30471d) C40843u.m166202l(dVar);
        this.f72974a = (Fragment) C40843u.m166202l(fragment);
    }

    /* renamed from: L */
    public final void mo85958L() {
        try {
            this.f72975b.mo86105L();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: M */
    public final void mo85959M(Activity activity, Bundle bundle, @C0363p0 Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            C30513n1.m122777b(bundle2, bundle3);
            this.f72975b.mo86114q6(C41019f.m166811T6(activity), googleMapOptions, bundle3);
            C30513n1.m122777b(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: N */
    public final View mo85960N(LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            C41016d y0 = this.f72975b.mo86117y0(C41019f.m166811T6(layoutInflater), C41019f.m166811T6(viewGroup), bundle2);
            StrictMode.setThreadPolicy(threadPolicy);
            C30513n1.m122777b(bundle2, bundle);
            return (View) C41019f.m166810O0(y0);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo85961a() {
        try {
            this.f72975b.mo86107a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo85962b() {
        try {
            this.f72975b.mo86108b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final void mo85963c() {
        try {
            this.f72975b.mo86109c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final void mo86207e(C30447f fVar) {
        try {
            this.f72975b.mo86104K(new C30457i0(this, fVar));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public final void mo86234f(@C0363p0 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            this.f72975b.mo86103G(bundle2);
            C30513n1.m122777b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public final void mo85965g() {
        try {
            this.f72975b.mo86110g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public final void mo86235h() {
        try {
            this.f72975b.mo86106N();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public final void mo85966i(@C0363p0 Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            Bundle arguments = this.f72974a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C30513n1.m122778c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f72975b.mo86111i(bundle2);
            C30513n1.m122777b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public final void mo85967m(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            C30513n1.m122777b(bundle, bundle2);
            this.f72975b.mo86112m(bundle2);
            C30513n1.m122777b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void onLowMemory() {
        try {
            this.f72975b.onLowMemory();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public final void mo85969v() {
        try {
            this.f72975b.mo86115v();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
