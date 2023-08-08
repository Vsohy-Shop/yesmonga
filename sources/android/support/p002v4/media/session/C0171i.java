package android.support.p002v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.p002v4.media.session.C0166g;
import androidx.annotation.C0376v0;

@C0376v0(23)
/* renamed from: android.support.v4.media.session.i */
public class C0171i {

    /* renamed from: android.support.v4.media.session.i$a */
    public interface C0172a extends C0166g.C0167a {
        /* renamed from: e */
        void mo476e(Uri uri, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.i$b */
    public static class C0173b<T extends C0172a> extends C0166g.C0168b<T> {
        public C0173b(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m591b(bundle);
            ((C0172a) this.f617a).mo476e(uri, bundle);
        }
    }

    /* renamed from: a */
    public static Object m1143a(C0172a aVar) {
        return new C0173b(aVar);
    }
}
