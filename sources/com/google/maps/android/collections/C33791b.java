package com.google.maps.android.collections;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.C30579d;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.maps.android.collections.C33793c;
import java.util.Collection;

/* renamed from: com.google.maps.android.collections.b */
public class C33791b extends C33793c<C30579d, C33792a> implements C30412c.C30421i {

    /* renamed from: com.google.maps.android.collections.b$a */
    public class C33792a extends C33793c.C33795b {

        /* renamed from: c */
        public C30412c.C30421i f81975c;

        public C33792a() {
            super();
        }

        /* renamed from: f */
        public void mo98173f(Collection<GroundOverlayOptions> collection) {
            for (GroundOverlayOptions h : collection) {
                mo98175h(h);
            }
        }

        /* renamed from: g */
        public void mo98174g(Collection<GroundOverlayOptions> collection, boolean z) {
            for (GroundOverlayOptions h : collection) {
                mo98175h(h).mo86533v(z);
            }
        }

        /* renamed from: h */
        public C30579d mo98175h(GroundOverlayOptions groundOverlayOptions) {
            C30579d b = C33791b.this.f81977a.mo85898b(groundOverlayOptions);
            super.mo98182a(b);
            return b;
        }

        /* renamed from: i */
        public Collection<C30579d> mo98176i() {
            return mo98184c();
        }

        /* renamed from: j */
        public void mo98177j() {
            for (C30579d v : mo98176i()) {
                v.mo86533v(false);
            }
        }

        /* renamed from: k */
        public boolean mo98178k(C30579d dVar) {
            return super.mo98185d(dVar);
        }

        /* renamed from: l */
        public void mo98179l(C30412c.C30421i iVar) {
            this.f81975c = iVar;
        }

        /* renamed from: m */
        public void mo98180m() {
            for (C30579d v : mo98176i()) {
                v.mo86533v(true);
            }
        }
    }

    public C33791b(@C0359n0 C30412c cVar) {
        super(cVar);
    }

    /* renamed from: g */
    public void mo85940g(@C0359n0 C30579d dVar) {
        C33792a aVar = (C33792a) this.f81979c.get(dVar);
        if (aVar != null && aVar.f81975c != null) {
            aVar.f81975c.mo85940g(dVar);
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

    /* renamed from: q */
    public void mo98160q() {
        C30412c cVar = this.f81977a;
        if (cVar != null) {
            cVar.mo85885P(this);
        }
    }

    /* renamed from: r */
    public C33792a mo98156m() {
        return new C33792a();
    }

    /* renamed from: s */
    public void mo98159p(C30579d dVar) {
        dVar.mo86523l();
    }
}
