package com.google.maps.android.collections;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.C30589i;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.collections.C33793c;
import java.util.Collection;

/* renamed from: com.google.maps.android.collections.e */
public class C33798e extends C33793c<C30589i, C33799a> implements C30412c.C30435w {

    /* renamed from: com.google.maps.android.collections.e$a */
    public class C33799a extends C33793c.C33795b {

        /* renamed from: c */
        public C30412c.C30435w f81989c;

        public C33799a() {
            super();
        }

        /* renamed from: f */
        public void mo98202f(Collection<PolygonOptions> collection) {
            for (PolygonOptions h : collection) {
                mo98204h(h);
            }
        }

        /* renamed from: g */
        public void mo98203g(Collection<PolygonOptions> collection, boolean z) {
            for (PolygonOptions h : collection) {
                mo98204h(h).mo86610y(z);
            }
        }

        /* renamed from: h */
        public C30589i mo98204h(PolygonOptions polygonOptions) {
            C30589i d = C33798e.this.f81977a.mo85902d(polygonOptions);
            super.mo98182a(d);
            return d;
        }

        /* renamed from: i */
        public Collection<C30589i> mo98205i() {
            return mo98184c();
        }

        /* renamed from: j */
        public void mo98206j() {
            for (C30589i y : mo98205i()) {
                y.mo86610y(false);
            }
        }

        /* renamed from: k */
        public boolean mo98207k(C30589i iVar) {
            return super.mo98185d(iVar);
        }

        /* renamed from: l */
        public void mo98208l(C30412c.C30435w wVar) {
            this.f81989c = wVar;
        }

        /* renamed from: m */
        public void mo98209m() {
            for (C30589i y : mo98205i()) {
                y.mo86610y(true);
            }
        }
    }

    public C33798e(C30412c cVar) {
        super(cVar);
    }

    /* renamed from: h */
    public void mo85955h(@C0359n0 C30589i iVar) {
        C33799a aVar = (C33799a) this.f81979c.get(iVar);
        if (aVar != null && aVar.f81989c != null) {
            aVar.f81989c.mo85955h(iVar);
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
            cVar.mo85903d0(this);
        }
    }

    /* renamed from: r */
    public C33799a mo98156m() {
        return new C33799a();
    }

    /* renamed from: s */
    public void mo98159p(C30589i iVar) {
        iVar.mo86599n();
    }
}
