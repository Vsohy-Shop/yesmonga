package com.bumptech.glide.load.model;

import androidx.annotation.C0359n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.model.C22323n;
import com.bumptech.glide.signature.C22613e;
import com.bumptech.glide.util.C22614a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.model.d */
public class C22293d implements C22323n<File, ByteBuffer> {

    /* renamed from: a */
    public static final String f57293a = "ByteBufferFileLoader";

    /* renamed from: com.bumptech.glide.load.model.d$a */
    public static final class C22294a implements C22114d<ByteBuffer> {

        /* renamed from: a */
        public final File f57294a;

        public C22294a(File file) {
            this.f57294a = file;
        }

        @C0359n0
        /* renamed from: a */
        public Class<ByteBuffer> mo65784a() {
            return ByteBuffer.class;
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
        public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super ByteBuffer> aVar) {
            try {
                aVar.mo65804f(C22614a.m102574a(this.f57294a));
            } catch (IOException e) {
                aVar.mo65803c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.d$b */
    public static class C22295b implements C22325o<File, ByteBuffer> {
        /* renamed from: a */
        public void mo66244a() {
        }

        @C0359n0
        /* renamed from: c */
        public C22323n<File, ByteBuffer> mo66245c(@C0359n0 C22331r rVar) {
            return new C22293d();
        }
    }

    /* renamed from: c */
    public C22323n.C22324a<ByteBuffer> mo66240b(@C0359n0 File file, int i, int i2, @C0359n0 C22277f fVar) {
        return new C22323n.C22324a<>(new C22613e(file), new C22294a(file));
    }

    /* renamed from: d */
    public boolean mo66239a(@C0359n0 File file) {
        return true;
    }
}
