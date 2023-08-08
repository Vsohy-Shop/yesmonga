package kotlinx.parcelize;

/* renamed from: kotlinx.parcelize.b */
public final class C12184b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.os.Parcelable$Creator<T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ <T extends android.os.Parcelable> android.os.Parcelable.Creator<T> m48772a() {
        /*
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.String r2 = "CREATOR"
            java.lang.Class<android.os.Parcelable> r3 = android.os.Parcelable.class
            java.lang.reflect.Field r2 = r3.getDeclaredField(r2)
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            boolean r5 = r2 instanceof android.os.Parcelable.Creator
            if (r5 == 0) goto L_0x001a
            r4 = r2
            android.os.Parcelable$Creator r4 = (android.os.Parcelable.Creator) r4
        L_0x001a:
            if (r4 == 0) goto L_0x001d
            return r4
        L_0x001d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not access CREATOR field in class "
            r4.append(r5)
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            kotlin.reflect.d r0 = kotlin.jvm.internal.C11342l0.m43547d(r3)
            java.lang.String r0 = r0.mo22848s()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.parcelize.C12184b.m48772a():android.os.Parcelable$Creator");
    }
}
