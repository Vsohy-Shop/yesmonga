package com.google.maps.android.collections;

import androidx.annotation.C0359n0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.C30577c;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.maps.android.collections.C33793c;
import java.util.Collection;

/* renamed from: com.google.maps.android.collections.a */
public class C33789a extends C33793c<C30577c, C33790a> implements C30412c.C30420h {

    /* renamed from: com.google.maps.android.collections.a$a */
    public class C33790a extends C33793c.C33795b {

        /* renamed from: c */
        public C30412c.C30420h f81973c;

        public C33790a() {
            super();
        }

        /* renamed from: f */
        public void mo98163f(Collection<CircleOptions> collection) {
            for (CircleOptions h : collection) {
                mo98165h(h);
            }
        }

        /* renamed from: g */
        public void mo98164g(Collection<CircleOptions> collection, boolean z) {
            for (CircleOptions h : collection) {
                mo98165h(h).mo86506u(z);
            }
        }

        /* renamed from: h */
        public C30577c mo98165h(CircleOptions circleOptions) {
            C30577c a = C33789a.this.f81977a.mo85896a(circleOptions);
            super.mo98182a(a);
            return a;
        }

        /* renamed from: i */
        public Collection<C30577c> mo98166i() {
            return mo98184c();
        }

        /* renamed from: j */
        public void mo98167j() {
            for (C30577c u : mo98166i()) {
                u.mo86506u(false);
            }
        }

        /* renamed from: k */
        public boolean mo98168k(C30577c cVar) {
            return super.mo98185d(cVar);
        }

        /* renamed from: l */
        public void mo98169l(C30412c.C30420h hVar) {
            this.f81973c = hVar;
        }

        /* renamed from: m */
        public void mo98170m() {
            for (C30577c u : mo98166i()) {
                u.mo86506u(true);
            }
        }
    }

    public C33789a(@C0359n0 C30412c cVar) {
        super(cVar);
    }

    /* renamed from: d */
    public void mo85939d(@C0359n0 C30577c cVar) {
        C33790a aVar = (C33790a) this.f81979c.get(cVar);
        if (aVar != null && aVar.f81973c != null) {
            aVar.f81973c.mo85939d(cVar);
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
            cVar.mo85884O(this);
        }
    }

    /* renamed from: r */
    public C33790a mo98156m() {
        return new C33790a();
    }

    /* renamed from: s */
    public void mo98159p(C30577c cVar) {
        cVar.mo86497l();
    }
}
