package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.C0344h1;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.engine.cache.C22205j;
import com.bumptech.glide.load.engine.prefill.C22265d;
import com.bumptech.glide.util.C22635o;
import java.util.HashMap;

/* renamed from: com.bumptech.glide.load.engine.prefill.b */
public final class C22263b {

    /* renamed from: a */
    public final C22205j f57221a;

    /* renamed from: b */
    public final C22162e f57222b;

    /* renamed from: c */
    public final DecodeFormat f57223c;

    /* renamed from: d */
    public C22260a f57224d;

    public C22263b(C22205j jVar, C22162e eVar, DecodeFormat decodeFormat) {
        this.f57221a = jVar;
        this.f57222b = eVar;
        this.f57223c = decodeFormat;
    }

    /* renamed from: b */
    public static int m101293b(C22265d dVar) {
        return C22635o.m102632g(dVar.mo66205d(), dVar.mo66203b(), dVar.mo66202a());
    }

    @C0344h1
    /* renamed from: a */
    public C22264c mo66197a(C22265d... dVarArr) {
        long e = (this.f57221a.mo66047e() - this.f57221a.mo66046d()) + this.f57222b.mo65957e();
        int i = 0;
        for (C22265d c : dVarArr) {
            i += c.mo66204c();
        }
        float f = ((float) e) / ((float) i);
        HashMap hashMap = new HashMap();
        for (C22265d dVar : dVarArr) {
            hashMap.put(dVar, Integer.valueOf(Math.round(((float) dVar.mo66204c()) * f) / m101293b(dVar)));
        }
        return new C22264c(hashMap);
    }

    /* renamed from: c */
    public void mo66198c(C22265d.C22266a... aVarArr) {
        Bitmap.Config config;
        C22260a aVar = this.f57224d;
        if (aVar != null) {
            aVar.mo66191c();
        }
        C22265d[] dVarArr = new C22265d[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            C22265d.C22266a aVar2 = aVarArr[i];
            if (aVar2.mo66210b() == null) {
                if (this.f57223c == DecodeFormat.PREFER_ARGB_8888) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                aVar2.mo66211c(config);
            }
            dVarArr[i] = aVar2.mo66209a();
        }
        C22260a aVar3 = new C22260a(this.f57222b, this.f57221a, mo66197a(dVarArr));
        this.f57224d = aVar3;
        C22635o.m102649x(aVar3);
    }
}
