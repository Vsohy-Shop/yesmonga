package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import androidx.core.util.C17997q;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.data.C22116e;
import com.bumptech.glide.load.engine.C22232g;
import com.bumptech.glide.util.C22633m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.engine.q */
public class C22267q<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<Data> f57238a;

    /* renamed from: b */
    public final C17997q.C17998a<List<Throwable>> f57239b;

    /* renamed from: c */
    public final List<? extends C22232g<Data, ResourceType, Transcode>> f57240c;

    /* renamed from: d */
    public final String f57241d;

    public C22267q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C22232g<Data, ResourceType, Transcode>> list, C17997q.C17998a<List<Throwable>> aVar) {
        this.f57238a = cls;
        this.f57239b = aVar;
        this.f57240c = (List) C22633m.m102623c(list);
        this.f57241d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public Class<Data> mo66213a() {
        return this.f57238a;
    }

    /* renamed from: b */
    public C22270s<Transcode> mo66214b(C22116e<Data> eVar, @C0359n0 C22277f fVar, int i, int i2, C22232g.C22233a<ResourceType> aVar) throws GlideException {
        List list = (List) C22633m.m102624d(this.f57239b.mo52469b());
        try {
            return mo66215c(eVar, fVar, i, i2, aVar, list);
        } finally {
            this.f57239b.mo52468a(list);
        }
    }

    /* renamed from: c */
    public final C22270s<Transcode> mo66215c(C22116e<Data> eVar, @C0359n0 C22277f fVar, int i, int i2, C22232g.C22233a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        List<Throwable> list2 = list;
        int size = this.f57240c.size();
        C22270s<Transcode> sVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                sVar = ((C22232g) this.f57240c.get(i3)).mo66117a(eVar, i, i2, fVar, aVar);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (sVar != null) {
                break;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new GlideException(this.f57241d, (List<Throwable>) new ArrayList(list2));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f57240c.toArray()) + C12361b.f30259j;
    }
}
