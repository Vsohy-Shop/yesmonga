package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0325c;
import androidx.annotation.C0330d1;
import androidx.annotation.C0354l;
import androidx.annotation.C0366r;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.content.res.p */
public final class C17482p {
    /* renamed from: a */
    public static final void m80208a(TypedArray typedArray, @C0330d1 int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    /* renamed from: b */
    public static final boolean m80209b(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    @C0354l
    /* renamed from: c */
    public static final int m80210c(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    @C12579k
    /* renamed from: d */
    public static final ColorStateList m80211d(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    /* renamed from: e */
    public static final float m80212e(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    @C0366r
    /* renamed from: f */
    public static final int m80213f(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    @C0366r
    /* renamed from: g */
    public static final int m80214g(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    @C12579k
    /* renamed from: h */
    public static final Drawable m80215h(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    /* renamed from: i */
    public static final float m80216i(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    @C0376v0(26)
    @C12579k
    /* renamed from: j */
    public static final Typeface m80217j(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return C17481o.m80207a(typedArray, i);
    }

    /* renamed from: k */
    public static final int m80218k(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    /* renamed from: l */
    public static final int m80219l(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    @C0325c
    /* renamed from: m */
    public static final int m80220m(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    @C12579k
    /* renamed from: n */
    public static final String m80221n(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @C12579k
    /* renamed from: o */
    public static final CharSequence[] m80222o(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        CharSequence[] textArray = typedArray.getTextArray(i);
        Intrinsics.checkNotNullExpressionValue(textArray, "getTextArray(index)");
        return textArray;
    }

    @C12579k
    /* renamed from: p */
    public static final CharSequence m80223p(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        m80208a(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    /* renamed from: q */
    public static final <R> R m80224q(@C12579k TypedArray typedArray, @C12579k C11300l<? super TypedArray, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        R invoke = lVar.invoke(typedArray);
        typedArray.recycle();
        return invoke;
    }
}
