package androidx.core.location;

import android.location.Location;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.location.r */
public final class C17725r {
    /* renamed from: a */
    public static final double m80993a(@C12579k Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLatitude();
    }

    /* renamed from: b */
    public static final double m80994b(@C12579k Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLongitude();
    }
}
