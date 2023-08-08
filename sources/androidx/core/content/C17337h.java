package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.core.content.h */
public final class C17337h {
    /* renamed from: a */
    public static final /* synthetic */ <T> T m79764a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return C17318d.m79732o(context, Object.class);
    }

    /* renamed from: b */
    public static final void m79765b(@C12579k Context context, @C0327c1 int i, @C12579k int[] iArr, @C12579k C11300l<? super TypedArray, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "attrs");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static final void m79766c(@C12579k Context context, @C12580l AttributeSet attributeSet, @C12579k int[] iArr, @C0336f int i, @C0327c1 int i2, @C12579k C11300l<? super TypedArray, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "attrs");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public static /* synthetic */ void m79767d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, C11300l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "attrs");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
