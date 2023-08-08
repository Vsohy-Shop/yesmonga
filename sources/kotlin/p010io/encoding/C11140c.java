package kotlin.p010io.encoding;

import androidx.camera.core.ImageCapture;
import androidx.exifinterface.media.C19135a;
import kotlin.C11665v0;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,647:1\n13654#2,3:648\n13654#2,3:651\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n582#1:648,3\n601#1:651,3\n*E\n"})
/* renamed from: kotlin.io.encoding.c */
public final class C11140c {
    @C12579k

    /* renamed from: a */
    public static final byte[] f28313a;
    @C12579k

    /* renamed from: b */
    public static final int[] f28314b;
    @C12579k

    /* renamed from: c */
    public static final byte[] f28315c;
    @C12579k

    /* renamed from: d */
    public static final int[] f28316d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, ImageCapture.f3737X, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, C19135a.f48929d6};
        f28313a = bArr;
        int[] iArr = new int[256];
        int i = 0;
        C10956m.m41300u2(iArr, -1, 0, 0, 6, (Object) null);
        iArr[61] = -2;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            iArr[bArr[i2]] = i3;
            i2++;
            i3++;
        }
        f28314b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, ImageCapture.f3737X, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, ImageCapture.f3738Y};
        f28315c = bArr2;
        int[] iArr2 = new int[256];
        C10956m.m41300u2(iArr2, -1, 0, 0, 6, (Object) null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i4 = 0;
        while (i < length2) {
            iArr2[bArr2[i]] = i4;
            i++;
            i4++;
        }
        f28316d = iArr2;
    }

    @C11143f
    /* renamed from: e */
    public static /* synthetic */ void m43021e() {
    }

    /* renamed from: f */
    public static /* synthetic */ void m43022f() {
    }

    @C11143f
    /* renamed from: g */
    public static /* synthetic */ void m43023g() {
    }

    /* renamed from: h */
    public static /* synthetic */ void m43024h() {
    }

    @C11143f
    @C11665v0(version = "1.8")
    /* renamed from: i */
    public static final boolean m43025i(int i) {
        return (i >= 0 && i < f28314b.length) && f28314b[i] != -1;
    }
}
