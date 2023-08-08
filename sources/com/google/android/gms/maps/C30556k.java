package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.maps.internal.C30465b1;
import com.google.android.gms.maps.internal.C30473d1;
import com.google.android.gms.maps.internal.C30483g;
import com.google.android.gms.maps.internal.C30542x0;
import com.google.android.gms.maps.internal.C30548z0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: com.google.android.gms.maps.k */
public class C30556k {

    /* renamed from: a */
    public final C30483g f72977a;

    /* renamed from: com.google.android.gms.maps.k$a */
    public interface C30557a {
        /* renamed from: a */
        void mo86258a(@C0359n0 StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    /* renamed from: com.google.android.gms.maps.k$b */
    public interface C30558b {
        /* renamed from: a */
        void mo86259a(@C0359n0 StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    /* renamed from: com.google.android.gms.maps.k$c */
    public interface C30559c {
        /* renamed from: a */
        void mo86260a(@C0359n0 StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    /* renamed from: com.google.android.gms.maps.k$d */
    public interface C30560d {
        /* renamed from: a */
        void mo86261a(@C0359n0 StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public C30556k(@C0359n0 C30483g gVar) {
        this.f72977a = (C30483g) C40843u.m166203m(gVar, "delegate");
    }

    /* renamed from: a */
    public void mo86236a(@C0359n0 StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        C40843u.m166202l(streetViewPanoramaCamera);
        try {
            this.f72977a.mo86149g7(streetViewPanoramaCamera, j);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: b */
    public StreetViewPanoramaLocation mo86237b() {
        try {
            return this.f72977a.mo86148c2();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: c */
    public StreetViewPanoramaCamera mo86238c() {
        try {
            return this.f72977a.mo86151k4();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public boolean mo86239d() {
        try {
            return this.f72977a.mo86147X4();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public boolean mo86240e() {
        try {
            return this.f72977a.mo86138D1();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public boolean mo86241f() {
        try {
            return this.f72977a.mo86150j5();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public boolean mo86242g() {
        try {
            return this.f72977a.mo86154u0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: h */
    public Point mo86243h(@C0359n0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            C41016d D4 = this.f72977a.mo86139D4(streetViewPanoramaOrientation);
            if (D4 == null) {
                return null;
            }
            return (Point) C41019f.m166810O0(D4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: i */
    public StreetViewPanoramaOrientation mo86244i(@C0359n0 Point point) {
        try {
            return this.f72977a.mo86142J7(C41019f.m166811T6(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public final void mo86245j(@C0363p0 C30557a aVar) {
        if (aVar == null) {
            try {
                this.f72977a.mo86146U2((C30542x0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72977a.mo86146U2(new C30631y(this, aVar));
        }
    }

    /* renamed from: k */
    public final void mo86246k(@C0363p0 C30558b bVar) {
        if (bVar == null) {
            try {
                this.f72977a.mo86145S4((C30548z0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72977a.mo86145S4(new C30629x(this, bVar));
        }
    }

    /* renamed from: l */
    public final void mo86247l(@C0363p0 C30559c cVar) {
        if (cVar == null) {
            try {
                this.f72977a.mo86156x6((C30465b1) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72977a.mo86156x6(new C30633z(this, cVar));
        }
    }

    /* renamed from: m */
    public final void mo86248m(@C0363p0 C30560d dVar) {
        if (dVar == null) {
            try {
                this.f72977a.mo86153t2((C30473d1) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72977a.mo86153t2(new C30407a0(this, dVar));
        }
    }

    /* renamed from: n */
    public void mo86249n(boolean z) {
        try {
            this.f72977a.mo86137C5(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public void mo86250o(@C0359n0 LatLng latLng) {
        try {
            this.f72977a.mo86140E1(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public void mo86251p(@C0359n0 LatLng latLng, int i) {
        try {
            this.f72977a.mo86136C3(latLng, i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: q */
    public void mo86252q(@C0359n0 LatLng latLng, int i, @C0363p0 StreetViewSource streetViewSource) {
        try {
            this.f72977a.mo86135C2(latLng, i, streetViewSource);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: r */
    public void mo86253r(@C0359n0 LatLng latLng, @C0363p0 StreetViewSource streetViewSource) {
        try {
            this.f72977a.mo86143M1(latLng, streetViewSource);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: s */
    public void mo86254s(@C0359n0 String str) {
        try {
            this.f72977a.mo86141G1(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: t */
    public void mo86255t(boolean z) {
        try {
            this.f72977a.mo86155w7(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: u */
    public void mo86256u(boolean z) {
        try {
            this.f72977a.mo86144N3(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public void mo86257v(boolean z) {
        try {
            this.f72977a.mo86152p6(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
