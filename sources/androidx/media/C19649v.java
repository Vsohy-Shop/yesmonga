package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: androidx.media.v */
public class C19649v {

    /* renamed from: androidx.media.v$a */
    public static class C19650a extends VolumeProvider {

        /* renamed from: a */
        public final /* synthetic */ C19651b f50273a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19650a(int i, int i2, int i3, C19651b bVar) {
            super(i, i2, i3);
            this.f50273a = bVar;
        }

        public void onAdjustVolume(int i) {
            this.f50273a.mo58020b(i);
        }

        public void onSetVolumeTo(int i) {
            this.f50273a.mo58019a(i);
        }
    }

    /* renamed from: androidx.media.v$b */
    public interface C19651b {
        /* renamed from: a */
        void mo58019a(int i);

        /* renamed from: b */
        void mo58020b(int i);
    }

    /* renamed from: a */
    public static Object m91277a(int i, int i2, int i3, C19651b bVar) {
        return new C19650a(i, i2, i3, bVar);
    }

    /* renamed from: b */
    public static void m91278b(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
