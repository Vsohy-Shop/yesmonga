package com.google.android.gms.common.internal;

import androidx.annotation.C0363p0;

/* renamed from: com.google.android.gms.common.internal.q1 */
public abstract class C40804q1 {
    @C0363p0

    /* renamed from: a */
    public Object f103912a;

    /* renamed from: b */
    public boolean f103913b = false;

    /* renamed from: c */
    public final /* synthetic */ C40747e f103914c;

    public C40804q1(C40747e eVar, Object obj) {
        this.f103914c = eVar;
        this.f103912a = obj;
    }

    /* renamed from: a */
    public abstract void mo134376a(Object obj);

    /* renamed from: b */
    public abstract void mo134377b();

    /* renamed from: c */
    public final void mo134459c() {
        Object obj;
        synchronized (this) {
            obj = this.f103912a;
            if (this.f103913b) {
                String obj2 = toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Callback proxy ");
                sb.append(obj2);
                sb.append(" being reused. This is not safe.");
            }
        }
        if (obj != null) {
            mo134376a(obj);
        }
        synchronized (this) {
            this.f103913b = true;
        }
        mo134461e();
    }

    /* renamed from: d */
    public final void mo134460d() {
        synchronized (this) {
            this.f103912a = null;
        }
    }

    /* renamed from: e */
    public final void mo134461e() {
        mo134460d();
        synchronized (this.f103914c.f103832t) {
            this.f103914c.f103832t.remove(this);
        }
    }
}
