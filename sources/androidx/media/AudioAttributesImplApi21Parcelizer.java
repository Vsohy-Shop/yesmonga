package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f50059a = (AudioAttributes) versionedParcel.mo62182W(audioAttributesImplApi21.f50059a, 1);
        audioAttributesImplApi21.f50060b = versionedParcel.mo62162M(audioAttributesImplApi21.f50060b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.mo62217j0(false, false);
        versionedParcel.mo62185X0(audioAttributesImplApi21.f50059a, 1);
        versionedParcel.mo62163M0(audioAttributesImplApi21.f50060b, 2);
    }
}
