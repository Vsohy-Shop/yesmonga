package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.cache.C22205j;
import com.bumptech.glide.util.C22629j;

/* renamed from: com.bumptech.glide.load.engine.cache.i */
public class C22204i extends C22629j<C22108c, C22270s<?>> implements C22205j {

    /* renamed from: e */
    public C22205j.C22206a f57033e;

    public C22204i(long j) {
        super(j);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo66036a(int i) {
        if (i >= 40) {
            mo66988b();
        } else if (i >= 20 || i == 15) {
            mo66998q(mo66991e() / 2);
        }
    }

    @C0363p0
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C22270s mo66037f(@C0359n0 C22108c cVar, @C0363p0 C22270s sVar) {
        return (C22270s) super.mo66996o(cVar, sVar);
    }

    @C0363p0
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C22270s mo66038g(@C0359n0 C22108c cVar) {
        return (C22270s) super.mo66997p(cVar);
    }

    /* renamed from: h */
    public void mo66039h(@C0359n0 C22205j.C22206a aVar) {
        this.f57033e = aVar;
    }

    /* renamed from: r */
    public int mo66040m(@C0363p0 C22270s<?> sVar) {
        if (sVar == null) {
            return super.mo66040m(null);
        }
        return sVar.getSize();
    }

    /* renamed from: s */
    public void mo66041n(@C0359n0 C22108c cVar, @C0363p0 C22270s<?> sVar) {
        C22205j.C22206a aVar = this.f57033e;
        if (aVar != null && sVar != null) {
            aVar.mo66048a(sVar);
        }
    }
}
