package com.journeyapps.barcodescanner;

import com.google.zxing.C34644b;
import com.google.zxing.C34752e;
import com.google.zxing.C34753f;
import com.google.zxing.C34760j;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.C34763m;
import com.google.zxing.common.C34720i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.journeyapps.barcodescanner.k */
public class C34946k implements C34763m {

    /* renamed from: a */
    public C34760j f85017a;

    /* renamed from: b */
    public List<C34762l> f85018b = new ArrayList();

    public C34946k(C34760j jVar) {
        this.f85017a = jVar;
    }

    /* renamed from: a */
    public void mo102888a(C34762l lVar) {
        this.f85018b.add(lVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public C34761k mo103524b(C34644b bVar) {
        this.f85018b.clear();
        try {
            C34760j jVar = this.f85017a;
            if (jVar instanceof C34753f) {
                C34761k d = ((C34753f) jVar).mo102837d(bVar);
                this.f85017a.reset();
                return d;
            }
            C34761k c = jVar.mo102420c(bVar);
            this.f85017a.reset();
            return c;
        } catch (Exception unused) {
            this.f85017a.reset();
            return null;
        } catch (Throwable th) {
            this.f85017a.reset();
            throw th;
        }
    }

    /* renamed from: c */
    public C34761k mo103525c(C34752e eVar) {
        return mo103524b(mo103528f(eVar));
    }

    /* renamed from: d */
    public List<C34762l> mo103526d() {
        return new ArrayList(this.f85018b);
    }

    /* renamed from: e */
    public C34760j mo103527e() {
        return this.f85017a;
    }

    /* renamed from: f */
    public C34644b mo103528f(C34752e eVar) {
        return new C34644b(new C34720i(eVar));
    }
}
