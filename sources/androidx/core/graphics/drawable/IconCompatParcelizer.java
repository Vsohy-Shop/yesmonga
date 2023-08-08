package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f45891a = versionedParcel.mo62162M(iconCompat.f45891a, 1);
        iconCompat.f45893c = versionedParcel.mo62241t(iconCompat.f45893c, 2);
        iconCompat.f45894d = versionedParcel.mo62182W(iconCompat.f45894d, 3);
        iconCompat.f45895e = versionedParcel.mo62162M(iconCompat.f45895e, 4);
        iconCompat.f45896f = versionedParcel.mo62162M(iconCompat.f45896f, 5);
        iconCompat.f45897g = (ColorStateList) versionedParcel.mo62182W(iconCompat.f45897g, 6);
        iconCompat.f45899i = versionedParcel.mo62200d0(iconCompat.f45899i, 7);
        iconCompat.f45900j = versionedParcel.mo62200d0(iconCompat.f45900j, 8);
        iconCompat.mo51941f();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo62217j0(true, true);
        iconCompat.mo51942g(versionedParcel.mo62213i());
        int i = iconCompat.f45891a;
        if (-1 != i) {
            versionedParcel.mo62163M0(i, 1);
        }
        byte[] bArr = iconCompat.f45893c;
        if (bArr != null) {
            versionedParcel.mo62244u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f45894d;
        if (parcelable != null) {
            versionedParcel.mo62185X0(parcelable, 3);
        }
        int i2 = iconCompat.f45895e;
        if (i2 != 0) {
            versionedParcel.mo62163M0(i2, 4);
        }
        int i3 = iconCompat.f45896f;
        if (i3 != 0) {
            versionedParcel.mo62163M0(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f45897g;
        if (colorStateList != null) {
            versionedParcel.mo62185X0(colorStateList, 6);
        }
        String str = iconCompat.f45899i;
        if (str != null) {
            versionedParcel.mo62206f1(str, 7);
        }
        String str2 = iconCompat.f45900j;
        if (str2 != null) {
            versionedParcel.mo62206f1(str2, 8);
        }
    }
}
