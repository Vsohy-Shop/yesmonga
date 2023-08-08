package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.core.util.C17997q;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.data.C22116e;
import com.bumptech.glide.load.resource.transcode.C22499e;
import com.bumptech.glide.util.C22633m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.engine.g */
public class C22232g<DataType, ResourceType, Transcode> {

    /* renamed from: f */
    public static final String f57117f = "DecodePath";

    /* renamed from: a */
    public final Class<DataType> f57118a;

    /* renamed from: b */
    public final List<? extends C22278g<DataType, ResourceType>> f57119b;

    /* renamed from: c */
    public final C22499e<ResourceType, Transcode> f57120c;

    /* renamed from: d */
    public final C17997q.C17998a<List<Throwable>> f57121d;

    /* renamed from: e */
    public final String f57122e;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    public interface C22233a<ResourceType> {
        @C0359n0
        /* renamed from: a */
        C22270s<ResourceType> mo65880a(@C0359n0 C22270s<ResourceType> sVar);
    }

    public C22232g(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C22278g<DataType, ResourceType>> list, C22499e<ResourceType, Transcode> eVar, C17997q.C17998a<List<Throwable>> aVar) {
        this.f57118a = cls;
        this.f57119b = list;
        this.f57120c = eVar;
        this.f57121d = aVar;
        this.f57122e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public C22270s<Transcode> mo66117a(C22116e<DataType> eVar, int i, int i2, @C0359n0 C22277f fVar, C22233a<ResourceType> aVar) throws GlideException {
        return this.f57120c.mo66566a(aVar.mo65880a(mo66118b(eVar, i, i2, fVar)), fVar);
    }

    @C0359n0
    /* renamed from: b */
    public final C22270s<ResourceType> mo66118b(C22116e<DataType> eVar, int i, int i2, @C0359n0 C22277f fVar) throws GlideException {
        List list = (List) C22633m.m102624d(this.f57121d.mo52469b());
        try {
            return mo66119c(eVar, i, i2, fVar, list);
        } finally {
            this.f57121d.mo52468a(list);
        }
    }

    @C0359n0
    /* renamed from: c */
    public final C22270s<ResourceType> mo66119c(C22116e<DataType> eVar, int i, int i2, @C0359n0 C22277f fVar, List<Throwable> list) throws GlideException {
        int size = this.f57119b.size();
        C22270s<ResourceType> sVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C22278g gVar = (C22278g) this.f57119b.get(i3);
            try {
                if (gVar.mo66236a(eVar.mo65777a(), fVar)) {
                    sVar = gVar.mo66237b(eVar.mo65777a(), i, i2, fVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable(f57117f, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(gVar);
                }
                list.add(e);
            }
            if (sVar != null) {
                break;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new GlideException(this.f57122e, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f57118a + ", decoders=" + this.f57119b + ", transcoder=" + this.f57120c + C12361b.f30259j;
    }
}
