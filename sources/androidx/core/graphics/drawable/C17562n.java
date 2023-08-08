package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.graphics.drawable.n */
public final class C17562n {
    @C0376v0(26)
    @C12579k
    /* renamed from: a */
    public static final Icon m80487a(@C12579k Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Icon a = Icon.createWithAdaptiveBitmap(bitmap);
        Intrinsics.checkNotNullExpressionValue(a, "createWithAdaptiveBitmap(this)");
        return a;
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: b */
    public static final Icon m80488b(@C12579k Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        Intrinsics.checkNotNullExpressionValue(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: c */
    public static final Icon m80489c(@C12579k Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        Intrinsics.checkNotNullExpressionValue(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: d */
    public static final Icon m80490d(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        Intrinsics.checkNotNullExpressionValue(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}
