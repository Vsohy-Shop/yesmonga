package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.model.C22309g;
import com.bumptech.glide.load.model.C22310h;
import com.bumptech.glide.load.model.C22320m;
import com.bumptech.glide.load.model.C22323n;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.model.stream.a */
public abstract class C22340a<Model> implements C22323n<Model, InputStream> {

    /* renamed from: a */
    public final C22323n<C22309g, InputStream> f57372a;
    @C0363p0

    /* renamed from: b */
    public final C22320m<Model, C22309g> f57373b;

    public C22340a(C22323n<C22309g, InputStream> nVar) {
        this(nVar, (C22320m) null);
    }

    /* renamed from: c */
    public static List<C22108c> m101526c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String gVar : collection) {
            arrayList.add(new C22309g(gVar));
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: b */
    public C22323n.C22324a<InputStream> mo66240b(@C0359n0 Model model, int i, int i2, @C0359n0 C22277f fVar) {
        C22309g gVar;
        C22320m<Model, C22309g> mVar = this.f57373b;
        if (mVar != null) {
            gVar = mVar.mo66299b(model, i, i2);
        } else {
            gVar = null;
        }
        if (gVar == null) {
            String f = mo66338f(model, i, i2, fVar);
            if (TextUtils.isEmpty(f)) {
                return null;
            }
            C22309g gVar2 = new C22309g(f, mo66337e(model, i, i2, fVar));
            C22320m<Model, C22309g> mVar2 = this.f57373b;
            if (mVar2 != null) {
                mVar2.mo66300c(model, i, i2, gVar2);
            }
            gVar = gVar2;
        }
        List<String> d = mo66336d(model, i, i2, fVar);
        C22323n.C22324a<InputStream> b = this.f57372a.mo66240b(gVar, i, i2, fVar);
        if (b == null || d.isEmpty()) {
            return b;
        }
        return new C22323n.C22324a<>(b.f57340a, m101526c(d), b.f57342c);
    }

    /* renamed from: d */
    public List<String> mo66336d(Model model, int i, int i2, C22277f fVar) {
        return Collections.emptyList();
    }

    @C0363p0
    /* renamed from: e */
    public C22310h mo66337e(Model model, int i, int i2, C22277f fVar) {
        return C22310h.f57318b;
    }

    /* renamed from: f */
    public abstract String mo66338f(Model model, int i, int i2, C22277f fVar);

    public C22340a(C22323n<C22309g, InputStream> nVar, @C0363p0 C22320m<Model, C22309g> mVar) {
        this.f57372a = nVar;
        this.f57373b = mVar;
    }
}
