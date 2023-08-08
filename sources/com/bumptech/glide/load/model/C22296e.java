package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.C0359n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.signature.C22613e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.e */
public final class C22296e<Model, Data> implements C22323n<Model, Data> {

    /* renamed from: b */
    public static final String f57295b = "data:image";

    /* renamed from: c */
    public static final String f57296c = ";base64";

    /* renamed from: a */
    public final C22297a<Data> f57297a;

    /* renamed from: com.bumptech.glide.load.model.e$a */
    public interface C22297a<Data> {
        /* renamed from: a */
        Class<Data> mo66255a();

        /* renamed from: b */
        void mo66256b(Data data) throws IOException;

        /* renamed from: c */
        Data mo66257c(String str) throws IllegalArgumentException;
    }

    /* renamed from: com.bumptech.glide.load.model.e$b */
    public static final class C22298b<Data> implements C22114d<Data> {

        /* renamed from: a */
        public final String f57298a;

        /* renamed from: b */
        public final C22297a<Data> f57299b;

        /* renamed from: c */
        public Data f57300c;

        public C22298b(String str, C22297a<Data> aVar) {
            this.f57298a = str;
            this.f57299b = aVar;
        }

        @C0359n0
        /* renamed from: a */
        public Class<Data> mo65784a() {
            return this.f57299b.mo66255a();
        }

        /* renamed from: b */
        public void mo65789b() {
            try {
                this.f57299b.mo66256b(this.f57300c);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        @C0359n0
        /* renamed from: d */
        public DataSource mo65792d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super Data> aVar) {
            try {
                Data c = this.f57299b.mo66257c(this.f57298a);
                this.f57300c = c;
                aVar.mo65804f(c);
            } catch (IllegalArgumentException e) {
                aVar.mo65803c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.e$c */
    public static final class C22299c<Model> implements C22325o<Model, InputStream> {

        /* renamed from: a */
        public final C22297a<InputStream> f57301a = new C22300a();

        /* renamed from: com.bumptech.glide.load.model.e$c$a */
        public class C22300a implements C22297a<InputStream> {
            public C22300a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo66255a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo66256b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo66257c(String str) {
                if (str.startsWith(C22296e.f57295b)) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(C22296e.f57296c)) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<Model, InputStream> mo66245c(@C0359n0 C22331r rVar) {
            return new C22296e(this.f57301a);
        }
    }

    public C22296e(C22297a<Data> aVar) {
        this.f57297a = aVar;
    }

    /* renamed from: a */
    public boolean mo66239a(@C0359n0 Model model) {
        return model.toString().startsWith(f57295b);
    }

    /* renamed from: b */
    public C22323n.C22324a<Data> mo66240b(@C0359n0 Model model, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22323n.C22324a<>(new C22613e(model), new C22298b(model.toString(), this.f57297a));
    }
}
