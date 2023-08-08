package com.bumptech.glide;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17997q;
import com.bumptech.glide.load.C22098a;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.C22279h;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C22116e;
import com.bumptech.glide.load.data.C22118f;
import com.bumptech.glide.load.engine.C22232g;
import com.bumptech.glide.load.engine.C22267q;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.load.model.C22325o;
import com.bumptech.glide.load.model.C22326p;
import com.bumptech.glide.load.resource.transcode.C22499e;
import com.bumptech.glide.load.resource.transcode.C22500f;
import com.bumptech.glide.provider.C22544a;
import com.bumptech.glide.provider.C22546b;
import com.bumptech.glide.provider.C22547c;
import com.bumptech.glide.provider.C22548d;
import com.bumptech.glide.provider.C22549e;
import com.bumptech.glide.provider.C22551f;
import com.bumptech.glide.util.pool.C22639a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Registry {

    /* renamed from: k */
    public static final String f56501k = "Animation";
    @Deprecated

    /* renamed from: l */
    public static final String f56502l = "Animation";

    /* renamed from: m */
    public static final String f56503m = "Bitmap";

    /* renamed from: n */
    public static final String f56504n = "BitmapDrawable";

    /* renamed from: o */
    public static final String f56505o = "legacy_prepend_all";

    /* renamed from: p */
    public static final String f56506p = "legacy_append";

    /* renamed from: a */
    public final C22326p f56507a;

    /* renamed from: b */
    public final C22544a f56508b;

    /* renamed from: c */
    public final C22549e f56509c;

    /* renamed from: d */
    public final C22551f f56510d;

    /* renamed from: e */
    public final C22118f f56511e;

    /* renamed from: f */
    public final C22500f f56512f;

    /* renamed from: g */
    public final C22546b f56513g;

    /* renamed from: h */
    public final C22548d f56514h = new C22548d();

    /* renamed from: i */
    public final C22547c f56515i = new C22547c();

    /* renamed from: j */
    public final C17997q.C17998a<List<Throwable>> f56516j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@C0359n0 String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@C0359n0 Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@C0359n0 M m, @C0359n0 List<C22323n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@C0359n0 Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@C0359n0 Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        C17997q.C17998a<List<Throwable>> f = C22639a.m102663f();
        this.f56516j = f;
        this.f56507a = new C22326p(f);
        this.f56508b = new C22544a();
        this.f56509c = new C22549e();
        this.f56510d = new C22551f();
        this.f56511e = new C22118f();
        this.f56512f = new C22500f();
        this.f56513g = new C22546b();
        mo65465z(Arrays.asList(new String[]{"Animation", f56503m, f56504n}));
    }

    @C0359n0
    /* renamed from: a */
    public <Data> Registry mo65440a(@C0359n0 Class<Data> cls, @C0359n0 C22098a<Data> aVar) {
        this.f56508b.mo66670a(cls, aVar);
        return this;
    }

    @C0359n0
    /* renamed from: b */
    public <TResource> Registry mo65441b(@C0359n0 Class<TResource> cls, @C0359n0 C22279h<TResource> hVar) {
        this.f56510d.mo66690a(cls, hVar);
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public <Data, TResource> Registry mo65442c(@C0359n0 Class<Data> cls, @C0359n0 Class<TResource> cls2, @C0359n0 C22278g<Data, TResource> gVar) {
        mo65444e(f56506p, cls, cls2, gVar);
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public <Model, Data> Registry mo65443d(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<Model, Data> oVar) {
        this.f56507a.mo66306a(cls, cls2, oVar);
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public <Data, TResource> Registry mo65444e(@C0359n0 String str, @C0359n0 Class<Data> cls, @C0359n0 Class<TResource> cls2, @C0359n0 C22278g<Data, TResource> gVar) {
        this.f56509c.mo66683a(str, gVar, cls, cls2);
        return this;
    }

    @C0359n0
    /* renamed from: f */
    public final <Data, TResource, Transcode> List<C22232g<Data, TResource, Transcode>> mo65445f(@C0359n0 Class<Data> cls, @C0359n0 Class<TResource> cls2, @C0359n0 Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f56509c.mo66686d(cls, cls2)) {
            for (Class next2 : this.f56512f.mo66568b(next, cls3)) {
                arrayList.add(new C22232g(cls, next, next2, this.f56509c.mo66684b(cls, next), this.f56512f.mo66567a(next, next2), this.f56516j));
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: g */
    public List<ImageHeaderParser> mo65446g() {
        List<ImageHeaderParser> b = this.f56513g.mo66675b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new NoImageHeaderParserException();
    }

    @C0363p0
    /* renamed from: h */
    public <Data, TResource, Transcode> C22267q<Data, TResource, Transcode> mo65447h(@C0359n0 Class<Data> cls, @C0359n0 Class<TResource> cls2, @C0359n0 Class<Transcode> cls3) {
        C22267q<Data, TResource, Transcode> a = this.f56515i.mo66676a(cls, cls2, cls3);
        if (this.f56515i.mo66678c(a)) {
            return null;
        }
        if (a == null) {
            List<C22232g<Data, TResource, Transcode>> f = mo65445f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new C22267q<>(cls, cls2, cls3, f, this.f56516j);
            }
            this.f56515i.mo66679d(cls, cls2, cls3, a);
        }
        return a;
    }

    @C0359n0
    /* renamed from: i */
    public <Model> List<C22323n<Model, ?>> mo65448i(@C0359n0 Model model) {
        return this.f56507a.mo66309e(model);
    }

    @C0359n0
    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo65449j(@C0359n0 Class<Model> cls, @C0359n0 Class<TResource> cls2, @C0359n0 Class<Transcode> cls3) {
        List<Class<?>> b = this.f56514h.mo66681b(cls, cls2, cls3);
        if (b == null) {
            b = new ArrayList<>();
            for (Class<?> d : this.f56507a.mo66308d(cls)) {
                for (Class next : this.f56509c.mo66686d(d, cls2)) {
                    if (!this.f56512f.mo66568b(next, cls3).isEmpty() && !b.contains(next)) {
                        b.add(next);
                    }
                }
            }
            this.f56514h.mo66682c(cls, cls2, cls3, Collections.unmodifiableList(b));
        }
        return b;
    }

    @C0359n0
    /* renamed from: k */
    public <X> C22279h<X> mo65450k(@C0359n0 C22270s<X> sVar) throws NoResultEncoderAvailableException {
        C22279h<X> b = this.f56510d.mo66691b(sVar.mo66177c());
        if (b != null) {
            return b;
        }
        throw new NoResultEncoderAvailableException(sVar.mo66177c());
    }

    @C0359n0
    /* renamed from: l */
    public <X> C22116e<X> mo65451l(@C0359n0 X x) {
        return this.f56511e.mo65805a(x);
    }

    @C0359n0
    /* renamed from: m */
    public <X> C22098a<X> mo65452m(@C0359n0 X x) throws NoSourceEncoderAvailableException {
        C22098a<X> b = this.f56508b.mo66671b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean mo65453n(@C0359n0 C22270s<?> sVar) {
        return this.f56510d.mo66691b(sVar.mo66177c()) != null;
    }

    @C0359n0
    /* renamed from: o */
    public <Data> Registry mo65454o(@C0359n0 Class<Data> cls, @C0359n0 C22098a<Data> aVar) {
        this.f56508b.mo66672c(cls, aVar);
        return this;
    }

    @C0359n0
    /* renamed from: p */
    public <TResource> Registry mo65455p(@C0359n0 Class<TResource> cls, @C0359n0 C22279h<TResource> hVar) {
        this.f56510d.mo66692c(cls, hVar);
        return this;
    }

    @C0359n0
    /* renamed from: q */
    public <Data, TResource> Registry mo65456q(@C0359n0 Class<Data> cls, @C0359n0 Class<TResource> cls2, @C0359n0 C22278g<Data, TResource> gVar) {
        mo65458s(f56505o, cls, cls2, gVar);
        return this;
    }

    @C0359n0
    /* renamed from: r */
    public <Model, Data> Registry mo65457r(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<Model, Data> oVar) {
        this.f56507a.mo66311g(cls, cls2, oVar);
        return this;
    }

    @C0359n0
    /* renamed from: s */
    public <Data, TResource> Registry mo65458s(@C0359n0 String str, @C0359n0 Class<Data> cls, @C0359n0 Class<TResource> cls2, @C0359n0 C22278g<Data, TResource> gVar) {
        this.f56509c.mo66687e(str, gVar, cls, cls2);
        return this;
    }

    @C0359n0
    /* renamed from: t */
    public Registry mo65459t(@C0359n0 ImageHeaderParser imageHeaderParser) {
        this.f56513g.mo66674a(imageHeaderParser);
        return this;
    }

    @C0359n0
    /* renamed from: u */
    public Registry mo65460u(@C0359n0 C22116e.C22117a<?> aVar) {
        this.f56511e.mo65806b(aVar);
        return this;
    }

    @C0359n0
    @Deprecated
    /* renamed from: v */
    public <Data> Registry mo65461v(@C0359n0 Class<Data> cls, @C0359n0 C22098a<Data> aVar) {
        return mo65440a(cls, aVar);
    }

    @C0359n0
    @Deprecated
    /* renamed from: w */
    public <TResource> Registry mo65462w(@C0359n0 Class<TResource> cls, @C0359n0 C22279h<TResource> hVar) {
        return mo65441b(cls, hVar);
    }

    @C0359n0
    /* renamed from: x */
    public <TResource, Transcode> Registry mo65463x(@C0359n0 Class<TResource> cls, @C0359n0 Class<Transcode> cls2, @C0359n0 C22499e<TResource, Transcode> eVar) {
        this.f56512f.mo66569c(cls, cls2, eVar);
        return this;
    }

    @C0359n0
    /* renamed from: y */
    public <Model, Data> Registry mo65464y(@C0359n0 Class<Model> cls, @C0359n0 Class<Data> cls2, @C0359n0 C22325o<? extends Model, ? extends Data> oVar) {
        this.f56507a.mo66313i(cls, cls2, oVar);
        return this;
    }

    @C0359n0
    /* renamed from: z */
    public final Registry mo65465z(@C0359n0 List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(f56505o);
        for (String add : list) {
            arrayList.add(add);
        }
        arrayList.add(f56506p);
        this.f56509c.mo66688f(arrayList);
        return this;
    }
}
