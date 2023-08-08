package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.signature.C22613e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.f */
public class C22301f<Data> implements C22323n<File, Data> {

    /* renamed from: b */
    public static final String f57303b = "FileLoader";

    /* renamed from: a */
    public final C22306d<Data> f57304a;

    /* renamed from: com.bumptech.glide.load.model.f$a */
    public static class C22302a<Data> implements C22325o<File, Data> {

        /* renamed from: a */
        public final C22306d<Data> f57305a;

        public C22302a(C22306d<Data> dVar) {
            this.f57305a = dVar;
        }

        /* renamed from: a */
        public final void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public final C22323n<File, Data> mo66245c(@C0359n0 C22331r rVar) {
            return new C22301f(this.f57305a);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.f$b */
    public static class C22303b extends C22302a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.model.f$b$a */
        public class C22304a implements C22306d<ParcelFileDescriptor> {
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo66262a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo66263b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo66264c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C22303b() {
            super(new C22304a());
        }
    }

    /* renamed from: com.bumptech.glide.load.model.f$c */
    public static final class C22305c<Data> implements C22114d<Data> {

        /* renamed from: a */
        public final File f57306a;

        /* renamed from: b */
        public final C22306d<Data> f57307b;

        /* renamed from: c */
        public Data f57308c;

        public C22305c(File file, C22306d<Data> dVar) {
            this.f57306a = file;
            this.f57307b = dVar;
        }

        @C0359n0
        /* renamed from: a */
        public Class<Data> mo65784a() {
            return this.f57307b.mo66262a();
        }

        /* renamed from: b */
        public void mo65789b() {
            Data data = this.f57308c;
            if (data != null) {
                try {
                    this.f57307b.mo66263b(data);
                } catch (IOException unused) {
                }
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
                Data c = this.f57307b.mo66264c(this.f57306a);
                this.f57308c = c;
                aVar.mo65804f(c);
            } catch (FileNotFoundException e) {
                aVar.mo65803c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.f$d */
    public interface C22306d<Data> {
        /* renamed from: a */
        Class<Data> mo66262a();

        /* renamed from: b */
        void mo66263b(Data data) throws IOException;

        /* renamed from: c */
        Data mo66264c(File file) throws FileNotFoundException;
    }

    /* renamed from: com.bumptech.glide.load.model.f$e */
    public static class C22307e extends C22302a<InputStream> {

        /* renamed from: com.bumptech.glide.load.model.f$e$a */
        public class C22308a implements C22306d<InputStream> {
            /* renamed from: a */
            public Class<InputStream> mo66262a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo66263b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo66264c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C22307e() {
            super(new C22308a());
        }
    }

    public C22301f(C22306d<Data> dVar) {
        this.f57304a = dVar;
    }

    /* renamed from: c */
    public C22323n.C22324a<Data> mo66240b(@C0359n0 File file, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22323n.C22324a<>(new C22613e(file), new C22305c(file, this.f57304a));
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 File file) {
        return true;
    }
}
