package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import androidx.annotation.C0354l;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.a0 */
public final class C17525a0 {
    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: A */
    public static final float m80308A(long j) {
        return Color.luminance(j);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: B */
    public static final float m80309B(long j) {
        return Color.red(j);
    }

    /* renamed from: C */
    public static final int m80310C(@C0354l int i) {
        return (i >> 16) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: D */
    public static final boolean m80311D(long j) {
        return Color.isSrgb(j);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: E */
    public static final boolean m80312E(long j) {
        return Color.isWideGamut(j);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    @C12579k
    /* renamed from: F */
    public static final Color m80313F(@C12579k Color color, @C12579k Color color2) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        Intrinsics.checkNotNullParameter(color2, "c");
        Color u = C17586h0.m80584u(color2, color);
        Intrinsics.checkNotNullExpressionValue(u, "compositeColors(c, this)");
        return u;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    @C12579k
    /* renamed from: G */
    public static final Color m80314G(@C0354l int i) {
        Color a = Color.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(a, "valueOf(this)");
        return a;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    @C12579k
    /* renamed from: H */
    public static final Color m80315H(long j) {
        Color a = Color.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(a, "valueOf(this)");
        return a;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0354l
    @C0376v0(26)
    /* renamed from: I */
    public static final int m80316I(long j) {
        return Color.toArgb(j);
    }

    @C0354l
    /* renamed from: J */
    public static final int m80317J(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Color.parseColor(str);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: K */
    public static final long m80318K(@C0354l int i) {
        return Color.pack(i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: a */
    public static final float m80319a(long j) {
        return Color.red(j);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: b */
    public static final float m80320b(@C12579k Color color) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        return color.getComponent(0);
    }

    /* renamed from: c */
    public static final int m80321c(@C0354l int i) {
        return (i >> 24) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: d */
    public static final float m80322d(long j) {
        return Color.green(j);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: e */
    public static final float m80323e(@C12579k Color color) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        return color.getComponent(1);
    }

    /* renamed from: f */
    public static final int m80324f(@C0354l int i) {
        return (i >> 16) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: g */
    public static final float m80325g(long j) {
        return Color.blue(j);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: h */
    public static final float m80326h(@C12579k Color color) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        return color.getComponent(2);
    }

    /* renamed from: i */
    public static final int m80327i(@C0354l int i) {
        return (i >> 8) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: j */
    public static final float m80328j(long j) {
        return Color.alpha(j);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: k */
    public static final float m80329k(@C12579k Color color) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        return color.getComponent(3);
    }

    /* renamed from: l */
    public static final int m80330l(@C0354l int i) {
        return i & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: m */
    public static final long m80331m(@C0354l int i, @C12579k ColorSpace.Named named) {
        Intrinsics.checkNotNullParameter(named, "colorSpace");
        return Color.convert(i, ColorSpace.get(named));
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: n */
    public static final long m80332n(@C0354l int i, @C12579k ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return Color.convert(i, colorSpace);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: o */
    public static final long m80333o(long j, @C12579k ColorSpace.Named named) {
        Intrinsics.checkNotNullParameter(named, "colorSpace");
        return Color.convert(j, ColorSpace.get(named));
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: p */
    public static final long m80334p(long j, @C12579k ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return Color.convert(j, colorSpace);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    @C12579k
    /* renamed from: q */
    public static final Color m80335q(@C12579k Color color, @C12579k ColorSpace.Named named) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        Intrinsics.checkNotNullParameter(named, "colorSpace");
        Color a = color.convert(ColorSpace.get(named));
        Intrinsics.checkNotNullExpressionValue(a, "convert(ColorSpace.get(colorSpace))");
        return a;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    @C12579k
    /* renamed from: r */
    public static final Color m80336r(@C12579k Color color, @C12579k ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Color a = color.convert(colorSpace);
        Intrinsics.checkNotNullExpressionValue(a, "convert(colorSpace)");
        return a;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: s */
    public static final float m80337s(long j) {
        return Color.alpha(j);
    }

    /* renamed from: t */
    public static final int m80338t(@C0354l int i) {
        return (i >> 24) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: u */
    public static final float m80339u(long j) {
        return Color.blue(j);
    }

    /* renamed from: v */
    public static final int m80340v(@C0354l int i) {
        return i & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    @C12579k
    /* renamed from: w */
    public static final ColorSpace m80341w(long j) {
        ColorSpace a = Color.colorSpace(j);
        Intrinsics.checkNotNullExpressionValue(a, "colorSpace(this)");
        return a;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: x */
    public static final float m80342x(long j) {
        return Color.green(j);
    }

    /* renamed from: y */
    public static final int m80343y(@C0354l int i) {
        return (i >> 8) & 255;
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    /* renamed from: z */
    public static final float m80344z(@C0354l int i) {
        return Color.luminance(i);
    }
}
