package com.google.maps.android.collections;

import android.view.View;
import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.C30587h;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.collections.C33793c;
import java.util.Collection;

/* renamed from: com.google.maps.android.collections.d */
public class C33796d extends C33793c<C30587h, C33797a> implements C30412c.C30423k, C30412c.C30429q, C30412c.C30430r, C30412c.C30414b, C30412c.C30425m {

    /* renamed from: com.google.maps.android.collections.d$a */
    public class C33797a extends C33793c.C33795b {

        /* renamed from: c */
        public C30412c.C30423k f81983c;

        /* renamed from: d */
        public C30412c.C30425m f81984d;

        /* renamed from: e */
        public C30412c.C30429q f81985e;

        /* renamed from: f */
        public C30412c.C30430r f81986f;

        /* renamed from: g */
        public C30412c.C30414b f81987g;

        public C33797a() {
            super();
        }

        /* renamed from: j */
        public void mo98188j(Collection<MarkerOptions> collection) {
            for (MarkerOptions l : collection) {
                mo98190l(l);
            }
        }

        /* renamed from: k */
        public void mo98189k(Collection<MarkerOptions> collection, boolean z) {
            for (MarkerOptions l : collection) {
                mo98190l(l).mo86582z(z);
            }
        }

        /* renamed from: l */
        public C30587h mo98190l(MarkerOptions markerOptions) {
            C30587h c = C33796d.this.f81977a.mo85900c(markerOptions);
            super.mo98182a(c);
            return c;
        }

        /* renamed from: m */
        public Collection<C30587h> mo98191m() {
            return mo98184c();
        }

        /* renamed from: n */
        public void mo98192n() {
            for (C30587h z : mo98191m()) {
                z.mo86582z(false);
            }
        }

        /* renamed from: o */
        public boolean mo98193o(C30587h hVar) {
            return super.mo98185d(hVar);
        }

        /* renamed from: p */
        public void mo98194p(C30412c.C30414b bVar) {
            this.f81987g = bVar;
        }

        /* renamed from: q */
        public void mo98195q(C30412c.C30423k kVar) {
            this.f81983c = kVar;
        }

        /* renamed from: r */
        public void mo98196r(C30412c.C30425m mVar) {
            this.f81984d = mVar;
        }

        /* renamed from: s */
        public void mo98197s(C30412c.C30429q qVar) {
            this.f81985e = qVar;
        }

        /* renamed from: t */
        public void mo98198t(C30412c.C30430r rVar) {
            this.f81986f = rVar;
        }

        /* renamed from: u */
        public void mo98199u() {
            for (C30587h z : mo98191m()) {
                z.mo86582z(true);
            }
        }
    }

    public C33796d(C30412c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public void mo85943a(@C0359n0 C30587h hVar) {
        C33797a aVar = (C33797a) this.f81979c.get(hVar);
        if (aVar != null && aVar.f81983c != null) {
            aVar.f81983c.mo85943a(hVar);
        }
    }

    /* renamed from: c */
    public View mo85934c(@C0359n0 C30587h hVar) {
        C33797a aVar = (C33797a) this.f81979c.get(hVar);
        if (aVar == null || aVar.f81987g == null) {
            return null;
        }
        return aVar.f81987g.mo85934c(hVar);
    }

    /* renamed from: e */
    public void mo85948e(@C0359n0 C30587h hVar) {
        C33797a aVar = (C33797a) this.f81979c.get(hVar);
        if (aVar != null && aVar.f81986f != null) {
            aVar.f81986f.mo85948e(hVar);
        }
    }

    /* renamed from: f */
    public void mo85949f(@C0359n0 C30587h hVar) {
        C33797a aVar = (C33797a) this.f81979c.get(hVar);
        if (aVar != null && aVar.f81986f != null) {
            aVar.f81986f.mo85949f(hVar);
        }
    }

    /* renamed from: i */
    public View mo85935i(@C0359n0 C30587h hVar) {
        C33797a aVar = (C33797a) this.f81979c.get(hVar);
        if (aVar == null || aVar.f81987g == null) {
            return null;
        }
        return aVar.f81987g.mo85935i(hVar);
    }

    /* renamed from: j */
    public void mo85950j(@C0359n0 C30587h hVar) {
        C33797a aVar = (C33797a) this.f81979c.get(hVar);
        if (aVar != null && aVar.f81986f != null) {
            aVar.f81986f.mo85950j(hVar);
        }
    }

    /* renamed from: k */
    public void mo85945k(@C0359n0 C30587h hVar) {
        C33797a aVar = (C33797a) this.f81979c.get(hVar);
        if (aVar != null && aVar.f81984d != null) {
            aVar.f81984d.mo85945k(hVar);
        }
    }

    /* renamed from: l */
    public /* bridge */ /* synthetic */ C33793c.C33795b mo98155l(String str) {
        return super.mo98155l(str);
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ C33793c.C33795b mo98157n(String str) {
        return super.mo98157n(str);
    }

    /* renamed from: o */
    public /* bridge */ /* synthetic */ boolean mo98158o(Object obj) {
        return super.mo98158o(obj);
    }

    /* renamed from: p0 */
    public boolean mo69449p0(@C0359n0 C30587h hVar) {
        C33797a aVar = (C33797a) this.f81979c.get(hVar);
        if (aVar == null || aVar.f81985e == null) {
            return false;
        }
        return aVar.f81985e.mo69449p0(hVar);
    }

    /* renamed from: q */
    public void mo98160q() {
        C30412c cVar = this.f81977a;
        if (cVar != null) {
            cVar.mo85887R(this);
            this.f81977a.mo85889T(this);
            this.f81977a.mo85893X(this);
            this.f81977a.mo85894Y(this);
            this.f81977a.mo85871B(this);
        }
    }

    /* renamed from: r */
    public C33797a mo98156m() {
        return new C33797a();
    }

    /* renamed from: s */
    public void mo98159p(C30587h hVar) {
        hVar.mo86570n();
    }
}
