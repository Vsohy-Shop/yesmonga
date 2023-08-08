package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.C0359n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
public abstract class C22129l<T> implements C22114d<T> {

    /* renamed from: d */
    public static final String f56826d = "LocalUriFetcher";

    /* renamed from: a */
    public final Uri f56827a;

    /* renamed from: b */
    public final ContentResolver f56828b;

    /* renamed from: c */
    public T f56829c;

    public C22129l(ContentResolver contentResolver, Uri uri) {
        this.f56828b = contentResolver;
        this.f56827a = uri;
    }

    /* renamed from: b */
    public void mo65789b() {
        T t = this.f56829c;
        if (t != null) {
            try {
                mo65785c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo65785c(T t) throws IOException;

    public void cancel() {
    }

    @C0359n0
    /* renamed from: d */
    public DataSource mo65792d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public final void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super T> aVar) {
        try {
            T f = mo65786f(this.f56827a, this.f56828b);
            this.f56829c = f;
            aVar.mo65804f(f);
        } catch (FileNotFoundException e) {
            aVar.mo65803c(e);
        }
    }

    /* renamed from: f */
    public abstract T mo65786f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
