package com.google.android.gms.common.api;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.api.b */
public final class C40492b extends BasePendingResult<C40495c> {

    /* renamed from: r */
    public int f103202r;

    /* renamed from: s */
    public boolean f103203s;

    /* renamed from: t */
    public boolean f103204t;

    /* renamed from: u */
    public final C40663m[] f103205u;

    /* renamed from: v */
    public final Object f103206v = new Object();

    /* renamed from: com.google.android.gms.common.api.b$a */
    public static final class C40493a {

        /* renamed from: a */
        public List f103207a = new ArrayList();

        /* renamed from: b */
        public C40507i f103208b;

        public C40493a(@C0359n0 C40507i iVar) {
            this.f103208b = iVar;
        }

        @C0359n0
        /* renamed from: a */
        public <R extends C40669r> C40497d<R> mo133690a(@C0359n0 C40663m<R> mVar) {
            C40497d<R> dVar = new C40497d<>(this.f103207a.size());
            this.f103207a.add(mVar);
            return dVar;
        }

        @C0359n0
        /* renamed from: b */
        public C40492b mo133691b() {
            return new C40492b(this.f103207a, this.f103208b, (C40676y) null);
        }
    }

    public /* synthetic */ C40492b(List list, C40507i iVar, C40676y yVar) {
        super(iVar);
        int size = list.size();
        this.f103202r = size;
        C40663m[] mVarArr = new C40663m[size];
        this.f103205u = mVarArr;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                C40663m mVar = (C40663m) list.get(i);
                this.f103205u[i] = mVar;
                mVar.mo133783c(new C40675x(this));
            }
            return;
        }
        mo133793o(new C40495c(Status.f103184g, mVarArr));
    }

    /* renamed from: f */
    public void mo133687f() {
        super.mo133687f();
        for (C40663m f : this.f103205u) {
            f.mo133687f();
        }
    }

    @C0359n0
    /* renamed from: w */
    public C40495c mo133688k(@C0359n0 Status status) {
        return new C40495c(status, this.f103205u);
    }
}
