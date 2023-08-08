package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.C0376v0;
import androidx.core.util.C17992m;
import androidx.media.C19616i;

@C0376v0(28)
/* renamed from: androidx.media.r */
public class C19628r extends C19620j {

    /* renamed from: h */
    public MediaSessionManager f50247h;

    public C19628r(Context context) {
        super(context);
        this.f50247h = (MediaSessionManager) context.getSystemService("media_session");
    }

    /* renamed from: a */
    public boolean mo57991a(C19616i.C19619c cVar) {
        if (cVar instanceof C19629a) {
            return this.f50247h.isTrustedForMediaControl(((C19629a) cVar).f50248a);
        }
        return false;
    }

    /* renamed from: androidx.media.r$a */
    public static final class C19629a implements C19616i.C19619c {

        /* renamed from: a */
        public final MediaSessionManager.RemoteUserInfo f50248a;

        public C19629a(String str, int i, int i2) {
            C19627q.m91246a();
            this.f50248a = C19626p.m91245a(str, i, i2);
        }

        /* renamed from: a */
        public int mo57998a() {
            return this.f50248a.getUid();
        }

        /* renamed from: b */
        public int mo57999b() {
            return this.f50248a.getPid();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19629a)) {
                return false;
            }
            return this.f50248a.equals(((C19629a) obj).f50248a);
        }

        public String getPackageName() {
            return this.f50248a.getPackageName();
        }

        public int hashCode() {
            return C17992m.m81741b(this.f50248a);
        }

        public C19629a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f50248a = remoteUserInfo;
        }
    }
}
