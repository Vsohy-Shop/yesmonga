package com.bumptech.glide.load.model;

import androidx.annotation.C0359n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.signature.C22613e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.model.b */
public class C22285b<Data> implements C22323n<byte[], Data> {

    /* renamed from: a */
    public final C22288b<Data> f57287a;

    /* renamed from: com.bumptech.glide.load.model.b$a */
    public static class C22286a implements C22325o<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.model.b$a$a */
        public class C22287a implements C22288b<ByteBuffer> {
            public C22287a() {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo66248a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo66249b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<byte[], ByteBuffer> mo66245c(@C0359n0 C22331r rVar) {
            return new C22285b(new C22287a());
        }
    }

    /* renamed from: com.bumptech.glide.load.model.b$b */
    public interface C22288b<Data> {
        /* renamed from: a */
        Class<Data> mo66248a();

        /* renamed from: b */
        Data mo66249b(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.model.b$c */
    public static class C22289c<Data> implements C22114d<Data> {

        /* renamed from: a */
        public final byte[] f57289a;

        /* renamed from: b */
        public final C22288b<Data> f57290b;

        public C22289c(byte[] bArr, C22288b<Data> bVar) {
            this.f57289a = bArr;
            this.f57290b = bVar;
        }

        @C0359n0
        /* renamed from: a */
        public Class<Data> mo65784a() {
            return this.f57290b.mo66248a();
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
        public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super Data> aVar) {
            aVar.mo65804f(this.f57290b.mo66249b(this.f57289a));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.b$d */
    public static class C22290d implements C22325o<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.model.b$d$a */
        public class C22291a implements C22288b<InputStream> {
            public C22291a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo66248a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo66249b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<byte[], InputStream> mo66245c(@C0359n0 C22331r rVar) {
            return new C22285b(new C22291a());
        }
    }

    public C22285b(C22288b<Data> bVar) {
        this.f57287a = bVar;
    }

    /* renamed from: c */
    public C22323n.C22324a<Data> mo66240b(@C0359n0 byte[] bArr, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22323n.C22324a<>(new C22613e(bArr), new C22289c(bArr, this.f57287a));
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 byte[] bArr) {
        return true;
    }
}
