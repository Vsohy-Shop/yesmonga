package com.google.maps.android.collections;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.C30591j;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.collections.C33793c;
import java.util.Collection;

/* renamed from: com.google.maps.android.collections.f */
public class C33800f extends C33793c<C30591j, C33801a> implements C30412c.C30436x {

    /* renamed from: com.google.maps.android.collections.f$a */
    public class C33801a extends C33793c.C33795b {

        /* renamed from: c */
        public C30412c.C30436x f81991c;

        public C33801a() {
            super();
        }

        /* renamed from: f */
        public void mo98212f(Collection<PolylineOptions> collection) {
            for (PolylineOptions h : collection) {
                mo98214h(h);
            }
        }

        /* renamed from: g */
        public void mo98213g(Collection<PolylineOptions> collection, boolean z) {
            for (PolylineOptions h : collection) {
                mo98214h(h).mo86639x(z);
            }
        }

        /* renamed from: h */
        public C30591j mo98214h(PolylineOptions polylineOptions) {
            C30591j e = C33800f.this.f81977a.mo85904e(polylineOptions);
            super.mo98182a(e);
            return e;
        }

        /* renamed from: i */
        public Collection<C30591j> mo98215i() {
            return mo98184c();
        }

        /* renamed from: j */
        public void mo98216j() {
            for (C30591j x : mo98215i()) {
                x.mo86639x(false);
            }
        }

        /* renamed from: k */
        public boolean mo98217k(C30591j jVar) {
            return super.mo98185d(jVar);
        }

        /* renamed from: l */
        public void mo98218l(C30412c.C30436x xVar) {
            this.f81991c = xVar;
        }

        /* renamed from: m */
        public void mo98219m() {
            for (C30591j x : mo98215i()) {
                x.mo86639x(true);
            }
        }
    }

    public C33800f(@C0359n0 C30412c cVar) {
        super(cVar);
    }

    /* renamed from: b */
    public void mo85956b(@C0359n0 C30591j jVar) {
        C33801a aVar = (C33801a) this.f81979c.get(jVar);
        if (aVar != null && aVar.f81991c != null) {
            aVar.f81991c.mo85956b(jVar);
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
            cVar.mo85905e0(this);
        }
    }

    /* renamed from: r */
    public C33801a mo98156m() {
        return new C33801a();
    }

    /* renamed from: s */
    public void mo98159p(C30591j jVar) {
        jVar.mo86629n();
    }
}
