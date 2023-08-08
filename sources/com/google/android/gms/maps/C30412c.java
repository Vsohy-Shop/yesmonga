package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0380x0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.internal.maps.C41816b0;
import com.google.android.gms.internal.maps.C41827h;
import com.google.android.gms.internal.maps.C41828h0;
import com.google.android.gms.internal.maps.C41847y;
import com.google.android.gms.maps.internal.C30460a0;
import com.google.android.gms.maps.internal.C30462a2;
import com.google.android.gms.maps.internal.C30463b;
import com.google.android.gms.maps.internal.C30467c;
import com.google.android.gms.maps.internal.C30468c0;
import com.google.android.gms.maps.internal.C30470c2;
import com.google.android.gms.maps.internal.C30478e2;
import com.google.android.gms.maps.internal.C30484g0;
import com.google.android.gms.maps.internal.C30486g2;
import com.google.android.gms.maps.internal.C30492i0;
import com.google.android.gms.maps.internal.C30494i2;
import com.google.android.gms.maps.internal.C30500k0;
import com.google.android.gms.maps.internal.C30502k2;
import com.google.android.gms.maps.internal.C30508m0;
import com.google.android.gms.maps.internal.C30510m2;
import com.google.android.gms.maps.internal.C30514o;
import com.google.android.gms.maps.internal.C30518p0;
import com.google.android.gms.maps.internal.C30520q;
import com.google.android.gms.maps.internal.C30524r0;
import com.google.android.gms.maps.internal.C30526s;
import com.google.android.gms.maps.internal.C30530t0;
import com.google.android.gms.maps.internal.C30532u;
import com.google.android.gms.maps.internal.C30536v0;
import com.google.android.gms.maps.internal.C30537v1;
import com.google.android.gms.maps.internal.C30544y;
import com.google.android.gms.maps.model.C30577c;
import com.google.android.gms.maps.model.C30579d;
import com.google.android.gms.maps.model.C30581e;
import com.google.android.gms.maps.model.C30587h;
import com.google.android.gms.maps.model.C30589i;
import com.google.android.gms.maps.model.C30591j;
import com.google.android.gms.maps.model.C30593k;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* renamed from: com.google.android.gms.maps.c */
public class C30412c {

    /* renamed from: c */
    public static final int f72936c = 0;

    /* renamed from: d */
    public static final int f72937d = 1;

    /* renamed from: e */
    public static final int f72938e = 2;

    /* renamed from: f */
    public static final int f72939f = 3;

    /* renamed from: g */
    public static final int f72940g = 4;

    /* renamed from: a */
    public final C30463b f72941a;

    /* renamed from: b */
    public C30609n f72942b;

    /* renamed from: com.google.android.gms.maps.c$a */
    public interface C30413a {
        /* renamed from: a */
        void mo85932a();

        void onCancel();
    }

    /* renamed from: com.google.android.gms.maps.c$b */
    public interface C30414b {
        @C0363p0
        /* renamed from: c */
        View mo85934c(@C0359n0 C30587h hVar);

        @C0363p0
        /* renamed from: i */
        View mo85935i(@C0359n0 C30587h hVar);
    }

    @Deprecated
    /* renamed from: com.google.android.gms.maps.c$c */
    public interface C30415c {
        /* renamed from: a */
        void mo85936a(@C0359n0 CameraPosition cameraPosition);
    }

    /* renamed from: com.google.android.gms.maps.c$d */
    public interface C30416d {
        void onCameraIdle();
    }

    /* renamed from: com.google.android.gms.maps.c$e */
    public interface C30417e {
        /* renamed from: a */
        void mo85937a();
    }

    /* renamed from: com.google.android.gms.maps.c$f */
    public interface C30418f {
        /* renamed from: a */
        void mo85938a();
    }

    /* renamed from: com.google.android.gms.maps.c$g */
    public interface C30419g {

        /* renamed from: T */
        public static final int f72943T = 1;

        /* renamed from: U */
        public static final int f72944U = 2;

        /* renamed from: V */
        public static final int f72945V = 3;

        void onCameraMoveStarted(int i);
    }

    /* renamed from: com.google.android.gms.maps.c$h */
    public interface C30420h {
        /* renamed from: d */
        void mo85939d(@C0359n0 C30577c cVar);
    }

    /* renamed from: com.google.android.gms.maps.c$i */
    public interface C30421i {
        /* renamed from: g */
        void mo85940g(@C0359n0 C30579d dVar);
    }

    /* renamed from: com.google.android.gms.maps.c$j */
    public interface C30422j {
        /* renamed from: a */
        void mo85941a(@C0359n0 C30581e eVar);

        /* renamed from: b */
        void mo85942b();
    }

    /* renamed from: com.google.android.gms.maps.c$k */
    public interface C30423k {
        /* renamed from: a */
        void mo85943a(@C0359n0 C30587h hVar);
    }

    /* renamed from: com.google.android.gms.maps.c$l */
    public interface C30424l {
        /* renamed from: a */
        void mo85944a(@C0359n0 C30587h hVar);
    }

    /* renamed from: com.google.android.gms.maps.c$m */
    public interface C30425m {
        /* renamed from: k */
        void mo85945k(@C0359n0 C30587h hVar);
    }

    /* renamed from: com.google.android.gms.maps.c$n */
    public interface C30426n {
        /* renamed from: a */
        void mo69480a(@C0359n0 LatLng latLng);
    }

    /* renamed from: com.google.android.gms.maps.c$o */
    public interface C30427o {
        /* renamed from: a */
        void mo85946a();
    }

    /* renamed from: com.google.android.gms.maps.c$p */
    public interface C30428p {
        /* renamed from: a */
        void mo85947a(@C0359n0 LatLng latLng);
    }

    /* renamed from: com.google.android.gms.maps.c$q */
    public interface C30429q {
        /* renamed from: p0 */
        boolean mo69449p0(@C0359n0 C30587h hVar);
    }

    /* renamed from: com.google.android.gms.maps.c$r */
    public interface C30430r {
        /* renamed from: e */
        void mo85948e(@C0359n0 C30587h hVar);

        /* renamed from: f */
        void mo85949f(@C0359n0 C30587h hVar);

        /* renamed from: j */
        void mo85950j(@C0359n0 C30587h hVar);
    }

    /* renamed from: com.google.android.gms.maps.c$s */
    public interface C30431s {
        /* renamed from: a */
        boolean mo85951a();
    }

    @Deprecated
    /* renamed from: com.google.android.gms.maps.c$t */
    public interface C30432t {
        /* renamed from: a */
        void mo85952a(@C0359n0 Location location);
    }

    /* renamed from: com.google.android.gms.maps.c$u */
    public interface C30433u {
        /* renamed from: a */
        void mo85953a(@C0359n0 Location location);
    }

    /* renamed from: com.google.android.gms.maps.c$v */
    public interface C30434v {
        /* renamed from: a */
        void mo85954a(@C0359n0 PointOfInterest pointOfInterest);
    }

    /* renamed from: com.google.android.gms.maps.c$w */
    public interface C30435w {
        /* renamed from: h */
        void mo85955h(@C0359n0 C30589i iVar);
    }

    /* renamed from: com.google.android.gms.maps.c$x */
    public interface C30436x {
        /* renamed from: b */
        void mo85956b(@C0359n0 C30591j jVar);
    }

    /* renamed from: com.google.android.gms.maps.c$y */
    public interface C30437y {
        /* renamed from: a */
        void mo85957a(@C0363p0 Bitmap bitmap);
    }

    public C30412c(@C0359n0 C30463b bVar) {
        this.f72941a = (C30463b) C40843u.m166202l(bVar);
    }

    /* renamed from: A */
    public final boolean mo85870A(boolean z) {
        try {
            return this.f72941a.mo86093v5(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: B */
    public final void mo85871B(@C0363p0 C30414b bVar) {
        if (bVar == null) {
            try {
                this.f72941a.mo86050W1((C30537v1) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86050W1(new C30620s0(this, bVar));
        }
    }

    /* renamed from: C */
    public void mo85872C(@C0363p0 LatLngBounds latLngBounds) {
        try {
            this.f72941a.mo86095w1(latLngBounds);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: D */
    public final void mo85873D(@C0363p0 C30440d dVar) {
        if (dVar == null) {
            try {
                this.f72941a.mo86047T5((C30467c) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86047T5(new C30449f1(this, dVar));
        }
    }

    /* renamed from: E */
    public boolean mo85874E(@C0363p0 MapStyleOptions mapStyleOptions) {
        try {
            return this.f72941a.mo86089t6(mapStyleOptions);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: F */
    public final void mo85875F(int i) {
        try {
            this.f72941a.mo86053Y2(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: G */
    public void mo85876G(float f) {
        try {
            this.f72941a.mo86036L2(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: H */
    public void mo85877H(float f) {
        try {
            this.f72941a.mo86052X6(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0380x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: I */
    public final void mo85878I(boolean z) {
        try {
            this.f72941a.mo86068f8(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    /* renamed from: J */
    public final void mo85879J(@C0363p0 C30415c cVar) {
        if (cVar == null) {
            try {
                this.f72941a.mo86025A4((C30462a2) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86025A4(new C30452g1(this, cVar));
        }
    }

    /* renamed from: K */
    public final void mo85880K(@C0363p0 C30416d dVar) {
        if (dVar == null) {
            try {
                this.f72941a.mo86073h6((C30470c2) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86073h6(new C30562k1(this, dVar));
        }
    }

    /* renamed from: L */
    public final void mo85881L(@C0363p0 C30417e eVar) {
        if (eVar == null) {
            try {
                this.f72941a.mo86027B5((C30478e2) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86027B5(new C30555j1(this, eVar));
        }
    }

    /* renamed from: M */
    public final void mo85882M(@C0363p0 C30418f fVar) {
        if (fVar == null) {
            try {
                this.f72941a.mo86040N2((C30486g2) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86040N2(new C30458i1(this, fVar));
        }
    }

    /* renamed from: N */
    public final void mo85883N(@C0363p0 C30419g gVar) {
        if (gVar == null) {
            try {
                this.f72941a.mo86085q2((C30494i2) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86085q2(new C30455h1(this, gVar));
        }
    }

    /* renamed from: O */
    public final void mo85884O(@C0363p0 C30420h hVar) {
        if (hVar == null) {
            try {
                this.f72941a.mo86067f7((C30502k2) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86067f7(new C30408a1(this, hVar));
        }
    }

    /* renamed from: P */
    public final void mo85885P(@C0363p0 C30421i iVar) {
        if (iVar == null) {
            try {
                this.f72941a.mo86037M3((C30510m2) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86037M3(new C30634z0(this, iVar));
        }
    }

    /* renamed from: Q */
    public final void mo85886Q(@C0363p0 C30422j jVar) {
        if (jVar == null) {
            try {
                this.f72941a.mo86096x1((C30514o) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86096x1(new C30630x0(this, jVar));
        }
    }

    /* renamed from: R */
    public final void mo85887R(@C0363p0 C30423k kVar) {
        if (kVar == null) {
            try {
                this.f72941a.mo86066f1((C30520q) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86066f1(new C30614p0(this, kVar));
        }
    }

    /* renamed from: S */
    public final void mo85888S(@C0363p0 C30424l lVar) {
        if (lVar == null) {
            try {
                this.f72941a.mo86087s1((C30526s) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86087s1(new C30618r0(this, lVar));
        }
    }

    /* renamed from: T */
    public final void mo85889T(@C0363p0 C30425m mVar) {
        if (mVar == null) {
            try {
                this.f72941a.mo86083o3((C30532u) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86083o3(new C30616q0(this, mVar));
        }
    }

    /* renamed from: U */
    public final void mo85890U(@C0363p0 C30426n nVar) {
        if (nVar == null) {
            try {
                this.f72941a.mo86032H6((C30544y) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86032H6(new C30565l1(this, nVar));
        }
    }

    /* renamed from: V */
    public void mo85891V(@C0363p0 C30427o oVar) {
        if (oVar == null) {
            try {
                this.f72941a.mo86029C8((C30460a0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86029C8(new C30628w0(this, oVar));
        }
    }

    /* renamed from: W */
    public final void mo85892W(@C0363p0 C30428p pVar) {
        if (pVar == null) {
            try {
                this.f72941a.mo86062c8((C30468c0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86062c8(new C30568m1(this, pVar));
        }
    }

    /* renamed from: X */
    public final void mo85893X(@C0363p0 C30429q qVar) {
        if (qVar == null) {
            try {
                this.f72941a.mo86031H3((C30484g0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86031H3(new C30611o(this, qVar));
        }
    }

    /* renamed from: Y */
    public final void mo85894Y(@C0363p0 C30430r rVar) {
        if (rVar == null) {
            try {
                this.f72941a.mo86051W5((C30492i0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86051W5(new C30612o0(this, rVar));
        }
    }

    /* renamed from: Z */
    public final void mo85895Z(@C0363p0 C30431s sVar) {
        if (sVar == null) {
            try {
                this.f72941a.mo86097y1((C30500k0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86097y1(new C30624u0(this, sVar));
        }
    }

    @C0359n0
    /* renamed from: a */
    public final C30577c mo85896a(@C0359n0 CircleOptions circleOptions) {
        try {
            C40843u.m166203m(circleOptions, "CircleOptions must not be null.");
            return new C30577c(this.f72941a.mo86024A1(circleOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    /* renamed from: a0 */
    public final void mo85897a0(@C0363p0 C30432t tVar) {
        if (tVar == null) {
            try {
                this.f72941a.mo86055Z3((C30508m0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86055Z3(new C30622t0(this, tVar));
        }
    }

    @C0363p0
    /* renamed from: b */
    public final C30579d mo85898b(@C0359n0 GroundOverlayOptions groundOverlayOptions) {
        try {
            C40843u.m166203m(groundOverlayOptions, "GroundOverlayOptions must not be null.");
            C41847y I2 = this.f72941a.mo86034I2(groundOverlayOptions);
            if (I2 != null) {
                return new C30579d(I2);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b0 */
    public final void mo85899b0(@C0363p0 C30433u uVar) {
        if (uVar == null) {
            try {
                this.f72941a.mo86045T1((C30518p0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86045T1(new C30626v0(this, uVar));
        }
    }

    @C0363p0
    /* renamed from: c */
    public final C30587h mo85900c(@C0359n0 MarkerOptions markerOptions) {
        try {
            C40843u.m166203m(markerOptions, "MarkerOptions must not be null.");
            C41828h0 O4 = this.f72941a.mo86042O4(markerOptions);
            if (O4 != null) {
                return new C30587h(O4);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c0 */
    public final void mo85901c0(@C0363p0 C30434v vVar) {
        if (vVar == null) {
            try {
                this.f72941a.mo86064d3((C30524r0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86064d3(new C30446e1(this, vVar));
        }
    }

    @C0359n0
    /* renamed from: d */
    public final C30589i mo85902d(@C0359n0 PolygonOptions polygonOptions) {
        try {
            C40843u.m166203m(polygonOptions, "PolygonOptions must not be null");
            return new C30589i(this.f72941a.mo86076i3(polygonOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d0 */
    public final void mo85903d0(@C0363p0 C30435w wVar) {
        if (wVar == null) {
            try {
                this.f72941a.mo86048V1((C30530t0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86048V1(new C30411b1(this, wVar));
        }
    }

    @C0359n0
    /* renamed from: e */
    public final C30591j mo85904e(@C0359n0 PolylineOptions polylineOptions) {
        try {
            C40843u.m166203m(polylineOptions, "PolylineOptions must not be null");
            return new C30591j(this.f72941a.mo86059b8(polylineOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e0 */
    public final void mo85905e0(@C0363p0 C30436x xVar) {
        if (xVar == null) {
            try {
                this.f72941a.mo86079k8((C30536v0) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f72941a.mo86079k8(new C30439c1(this, xVar));
        }
    }

    @C0363p0
    /* renamed from: f */
    public final C30593k mo85906f(@C0359n0 TileOverlayOptions tileOverlayOptions) {
        try {
            C40843u.m166203m(tileOverlayOptions, "TileOverlayOptions must not be null.");
            C41827h t8 = this.f72941a.mo86090t8(tileOverlayOptions);
            if (t8 != null) {
                return new C30593k(t8);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f0 */
    public final void mo85907f0(int i, int i2, int i3, int i4) {
        try {
            this.f72941a.mo86044R5(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public final void mo85908g(@C0359n0 C30406a aVar) {
        try {
            C40843u.m166203m(aVar, "CameraUpdate must not be null.");
            this.f72941a.mo86080l4(aVar.mo85865a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g0 */
    public final void mo85909g0(boolean z) {
        try {
            this.f72941a.mo86049V6(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public final void mo85910h(@C0359n0 C30406a aVar, int i, @C0363p0 C30413a aVar2) {
        C30613p pVar;
        try {
            C40843u.m166203m(aVar, "CameraUpdate must not be null.");
            C30463b bVar = this.f72941a;
            C41016d a = aVar.mo85865a();
            if (aVar2 == null) {
                pVar = null;
            } else {
                pVar = new C30613p(aVar2);
            }
            bVar.mo86094v6(a, i, pVar);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h0 */
    public final void mo85911h0(@C0359n0 C30437y yVar) {
        C40843u.m166203m(yVar, "Callback must not be null.");
        mo85913i0(yVar, (Bitmap) null);
    }

    /* renamed from: i */
    public final void mo85912i(@C0359n0 C30406a aVar, @C0363p0 C30413a aVar2) {
        C30613p pVar;
        try {
            C40843u.m166203m(aVar, "CameraUpdate must not be null.");
            C30463b bVar = this.f72941a;
            C41016d a = aVar.mo85865a();
            if (aVar2 == null) {
                pVar = null;
            } else {
                pVar = new C30613p(aVar2);
            }
            bVar.mo86072h5(a, pVar);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i0 */
    public final void mo85913i0(@C0359n0 C30437y yVar, @C0363p0 Bitmap bitmap) {
        C41016d dVar;
        C40843u.m166203m(yVar, "Callback must not be null.");
        if (bitmap != null) {
            dVar = C41019f.m166811T6(bitmap);
        } else {
            dVar = null;
        }
        try {
            this.f72941a.mo86071h1(new C30443d1(this, yVar), (C41019f) dVar);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public final void mo85914j() {
        try {
            this.f72941a.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j0 */
    public final void mo85915j0() {
        try {
            this.f72941a.mo86086r4();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: k */
    public final CameraPosition mo85916k() {
        try {
            return this.f72941a.mo86070g2();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0363p0
    /* renamed from: l */
    public C30581e mo85917l() {
        try {
            C41816b0 u8 = this.f72941a.mo86091u8();
            if (u8 != null) {
                return new C30581e(u8);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public final int mo85918m() {
        try {
            return this.f72941a.mo86088s5();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: n */
    public final float mo85919n() {
        try {
            return this.f72941a.mo86098z4();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public final float mo85920o() {
        try {
            return this.f72941a.mo86065d5();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    @Deprecated
    /* renamed from: p */
    public final Location mo85921p() {
        try {
            return this.f72941a.mo86028B8();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: q */
    public final C30456i mo85922q() {
        try {
            return new C30456i(this.f72941a.mo86054Y3());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @C0359n0
    /* renamed from: r */
    public final C30609n mo85923r() {
        try {
            if (this.f72942b == null) {
                this.f72942b = new C30609n(this.f72941a.mo86026A7());
            }
            return this.f72942b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: s */
    public final boolean mo85924s() {
        try {
            return this.f72941a.mo86033H7();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: t */
    public final boolean mo85925t() {
        try {
            return this.f72941a.mo86061c3();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: u */
    public final boolean mo85926u() {
        try {
            return this.f72941a.mo86043R1();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public final boolean mo85927v() {
        try {
            return this.f72941a.mo86038M6();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: w */
    public final void mo85928w(@C0359n0 C30406a aVar) {
        try {
            C40843u.m166203m(aVar, "CameraUpdate must not be null.");
            this.f72941a.mo86077i6(aVar.mo85865a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: x */
    public void mo85929x() {
        try {
            this.f72941a.mo86082m7();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: y */
    public final void mo85930y(boolean z) {
        try {
            this.f72941a.mo86057a5(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: z */
    public final void mo85931z(@C0363p0 String str) {
        try {
            this.f72941a.mo86046T4(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
