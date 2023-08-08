package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f50061a = versionedParcel.mo62162M(audioAttributesImplBase.f50061a, 1);
        audioAttributesImplBase.f50062b = versionedParcel.mo62162M(audioAttributesImplBase.f50062b, 2);
        audioAttributesImplBase.f50063c = versionedParcel.mo62162M(audioAttributesImplBase.f50063c, 3);
        audioAttributesImplBase.f50064d = versionedParcel.mo62162M(audioAttributesImplBase.f50064d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.mo62217j0(false, false);
        versionedParcel.mo62163M0(audioAttributesImplBase.f50061a, 1);
        versionedParcel.mo62163M0(audioAttributesImplBase.f50062b, 2);
        versionedParcel.mo62163M0(audioAttributesImplBase.f50063c, 3);
        versionedParcel.mo62163M0(audioAttributesImplBase.f50064d, 4);
    }
}
