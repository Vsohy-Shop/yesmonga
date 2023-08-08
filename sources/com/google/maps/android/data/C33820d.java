package com.google.maps.android.data;

import com.google.android.gms.maps.C30412c;
import com.google.maps.android.data.geojson.C33830e;
import com.google.maps.android.data.geojson.C33837k;
import com.google.maps.android.data.geojson.C33839m;
import com.google.maps.android.data.geojson.C33840n;
import com.google.maps.android.data.kml.C33849b;
import com.google.maps.android.data.kml.C33853e;
import com.google.maps.android.data.kml.C33862n;

/* renamed from: com.google.maps.android.data.d */
public abstract class C33820d {

    /* renamed from: a */
    public C33845k f81998a;

    /* renamed from: com.google.maps.android.data.d$a */
    public interface C33821a {
        /* renamed from: a */
        void mo98256a(C33818b bVar);
    }

    /* renamed from: a */
    public void mo98235a(C33818b bVar) {
        this.f81998a.mo98409e(bVar);
    }

    /* renamed from: b */
    public void mo98236b() {
        C33845k kVar = this.f81998a;
        if (kVar instanceof C33840n) {
            ((C33840n) kVar).mo98377r0();
            return;
        }
        throw new UnsupportedOperationException("Stored renderer is not a GeoJsonRenderer");
    }

    /* renamed from: c */
    public void mo98237c() {
        C33845k kVar = this.f81998a;
        if (kVar instanceof C33862n) {
            ((C33862n) kVar).mo98498O0();
            return;
        }
        throw new UnsupportedOperationException("Stored renderer is not a KmlRenderer");
    }

    /* renamed from: d */
    public abstract void mo98238d();

    /* renamed from: e */
    public C33818b mo98239e(Object obj) {
        return this.f81998a.mo98384B(obj);
    }

    /* renamed from: f */
    public Iterable<C33849b> mo98240f() {
        C33845k kVar = this.f81998a;
        if (kVar instanceof C33862n) {
            return ((C33862n) kVar).mo98505W0();
        }
        return null;
    }

    /* renamed from: g */
    public C33830e mo98241g() {
        return this.f81998a.mo98386D();
    }

    /* renamed from: h */
    public C33837k mo98242h() {
        return this.f81998a.mo98387E();
    }

    /* renamed from: i */
    public C33839m mo98243i() {
        return this.f81998a.mo98388F();
    }

    /* renamed from: j */
    public C33818b mo98244j(Object obj) {
        return this.f81998a.mo98389G(obj);
    }

    /* renamed from: k */
    public Iterable<? extends C33818b> mo98245k() {
        return this.f81998a.mo98390H();
    }

    /* renamed from: l */
    public Iterable<C33853e> mo98246l() {
        C33845k kVar = this.f81998a;
        if (kVar instanceof C33862n) {
            return ((C33862n) kVar).mo98503U0();
        }
        return null;
    }

    /* renamed from: m */
    public C30412c mo98247m() {
        return this.f81998a.mo98392J();
    }

    /* renamed from: n */
    public boolean mo98248n() {
        C33845k kVar = this.f81998a;
        if (kVar instanceof C33862n) {
            return ((C33862n) kVar).mo98507Y0();
        }
        return false;
    }

    /* renamed from: o */
    public boolean mo98249o() {
        return this.f81998a.mo98398Q();
    }

    /* renamed from: p */
    public boolean mo98250p() {
        return this.f81998a.mo98399R();
    }

    /* renamed from: q */
    public void mo98251q(C33818b bVar) {
        this.f81998a.mo98406b0(bVar);
    }

    /* renamed from: r */
    public void mo98252r() {
        C33845k kVar = this.f81998a;
        if (kVar instanceof C33840n) {
            ((C33840n) kVar).mo98382v0();
        } else if (kVar instanceof C33862n) {
            ((C33862n) kVar).mo98510b1();
        }
    }

    /* renamed from: s */
    public void mo98253s(C30412c cVar) {
        this.f81998a.mo98375m0(cVar);
    }

    /* renamed from: t */
    public void mo98254t(C33821a aVar) {
        this.f81998a.mo98429o0(aVar);
    }

    /* renamed from: u */
    public void mo98255u(C33845k kVar) {
        this.f81998a = kVar;
    }
}
