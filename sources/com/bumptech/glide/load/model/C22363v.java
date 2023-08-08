package com.bumptech.glide.load.model;

import androidx.annotation.C0359n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.signature.C22613e;

/* renamed from: com.bumptech.glide.load.model.v */
public class C22363v<Model> implements C22323n<Model, Model> {

    /* renamed from: a */
    public static final C22363v<?> f57402a = new C22363v<>();

    /* renamed from: com.bumptech.glide.load.model.v$a */
    public static class C22364a<Model> implements C22325o<Model, Model> {

        /* renamed from: a */
        public static final C22364a<?> f57403a = new C22364a<>();

        /* renamed from: b */
        public static <T> C22364a<T> m101589b() {
            return f57403a;
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Model, Model> mo66245c(C22331r rVar) {
            return C22363v.m101586c();
        }
    }

    /* renamed from: com.bumptech.glide.load.model.v$b */
    public static class C22365b<Model> implements C22114d<Model> {

        /* renamed from: a */
        public final Model f57404a;

        public C22365b(Model model) {
            this.f57404a = model;
        }

        @C0359n0
        /* renamed from: a */
        public Class<Model> mo65784a() {
            return this.f57404a.getClass();
        }

        /* renamed from: b */
        public void mo65789b() {
        }

        public void cancel() {
        }

        @C0359n0
        /* renamed from: d */
        public DataSource mo65792d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super Model> aVar) {
            aVar.mo65804f(this.f57404a);
        }
    }

    /* renamed from: c */
    public static <T> C22363v<T> m101586c() {
        return f57402a;
    }

    /* renamed from: a */
    public boolean mo66239a(@C0359n0 Model model) {
        return true;
    }

    /* renamed from: b */
    public C22323n.C22324a<Model> mo66240b(@C0359n0 Model model, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22323n.C22324a<>(new C22613e(model), new C22365b(model));
    }
}
