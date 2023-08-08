package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.C0359n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
public abstract class C22112b<T> implements C22114d<T> {

    /* renamed from: d */
    public static final String f56795d = "AssetPathFetcher";

    /* renamed from: a */
    public final String f56796a;

    /* renamed from: b */
    public final AssetManager f56797b;

    /* renamed from: c */
    public T f56798c;

    public C22112b(AssetManager assetManager, String str) {
        this.f56797b = assetManager;
        this.f56796a = str;
    }

    /* renamed from: b */
    public void mo65789b() {
        T t = this.f56798c;
        if (t != null) {
            try {
                mo65790c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo65790c(T t) throws IOException;

    public void cancel() {
    }

    @C0359n0
    /* renamed from: d */
    public DataSource mo65792d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super T> aVar) {
        try {
            T f = mo65794f(this.f56797b, this.f56796a);
            this.f56798c = f;
            aVar.mo65804f(f);
        } catch (IOException e) {
            aVar.mo65803c(e);
        }
    }

    /* renamed from: f */
    public abstract T mo65794f(AssetManager assetManager, String str) throws IOException;
}
