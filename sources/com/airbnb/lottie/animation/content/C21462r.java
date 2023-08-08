package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.keyframe.C21466a;
import com.airbnb.lottie.model.content.C21568h;
import com.airbnb.lottie.model.content.C21571k;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C21578a;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.r */
public class C21462r implements C21457n, C21466a.C21468b {

    /* renamed from: a */
    public final Path f55362a = new Path();

    /* renamed from: b */
    public final String f55363b;

    /* renamed from: c */
    public final boolean f55364c;

    /* renamed from: d */
    public final C21516j f55365d;

    /* renamed from: e */
    public final C21466a<?, Path> f55366e;

    /* renamed from: f */
    public boolean f55367f;

    /* renamed from: g */
    public C21444b f55368g = new C21444b();

    public C21462r(C21516j jVar, C21578a aVar, C21571k kVar) {
        this.f55363b = kVar.mo64423b();
        this.f55364c = kVar.mo64425d();
        this.f55365d = jVar;
        C21466a<C21568h, Path> a = kVar.mo64424c().mo64300a();
        this.f55366e = a;
        aVar.mo64481i(a);
        a.mo64057a(this);
    }

    /* renamed from: a */
    public void mo64019a() {
        mo64050c();
    }

    /* renamed from: b */
    public void mo64020b(List<C21445c> list, List<C21445c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C21445c cVar = list.get(i);
            if (cVar instanceof C21464t) {
                C21464t tVar = (C21464t) cVar;
                if (tVar.mo64055i() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f55368g.mo64027a(tVar);
                    tVar.mo64051c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo64050c() {
        this.f55367f = false;
        this.f55365d.invalidateSelf();
    }

    public String getName() {
        return this.f55363b;
    }

    public Path getPath() {
        if (this.f55367f) {
            return this.f55362a;
        }
        this.f55362a.reset();
        if (this.f55364c) {
            this.f55367f = true;
            return this.f55362a;
        }
        this.f55362a.set(this.f55366e.mo64064h());
        this.f55362a.setFillType(Path.FillType.EVEN_ODD);
        this.f55368g.mo64028b(this.f55362a);
        this.f55367f = true;
        return this.f55362a;
    }
}
