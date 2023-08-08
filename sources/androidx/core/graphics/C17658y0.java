package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.carrefour.fid.android.shared.constant.C28515a1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.y0 */
public final class C17658y0 {
    @C12579k
    /* renamed from: A */
    public static final Rect m80792A(@C12579k Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    @C12579k
    /* renamed from: B */
    public static final RectF m80793B(@C12579k RectF rectF, float f) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @C12579k
    /* renamed from: C */
    public static final RectF m80794C(@C12579k RectF rectF, int i) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        float f = (float) i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @C12579k
    /* renamed from: D */
    public static final Rect m80795D(@C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @C12579k
    /* renamed from: E */
    public static final RectF m80796E(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new RectF(rect);
    }

    @C12579k
    /* renamed from: F */
    public static final Region m80797F(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new Region(rect);
    }

    @C12579k
    /* renamed from: G */
    public static final Region m80798G(@C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @C12579k
    /* renamed from: H */
    public static final RectF m80799H(@C12579k RectF rectF, @C12579k Matrix matrix) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "m");
        matrix.mapRect(rectF);
        return rectF;
    }

    @C12579k
    /* renamed from: I */
    public static final Region m80800I(@C12579k Rect rect, @C12579k Rect rect2) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(rect2, C28515a1.f68703k);
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @C12579k
    /* renamed from: J */
    public static final Region m80801J(@C12579k RectF rectF, @C12579k RectF rectF2) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(rectF2, C28515a1.f68703k);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @SuppressLint({"CheckResult"})
    @C12579k
    /* renamed from: a */
    public static final Rect m80802a(@C12579k Rect rect, @C12579k Rect rect2) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(rect2, C28515a1.f68703k);
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @SuppressLint({"CheckResult"})
    @C12579k
    /* renamed from: b */
    public static final RectF m80803b(@C12579k RectF rectF, @C12579k RectF rectF2) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(rectF2, C28515a1.f68703k);
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    /* renamed from: c */
    public static final float m80804c(@C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.left;
    }

    /* renamed from: d */
    public static final int m80805d(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.left;
    }

    /* renamed from: e */
    public static final float m80806e(@C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.top;
    }

    /* renamed from: f */
    public static final int m80807f(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.top;
    }

    /* renamed from: g */
    public static final float m80808g(@C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.right;
    }

    /* renamed from: h */
    public static final int m80809h(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.right;
    }

    /* renamed from: i */
    public static final float m80810i(@C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.bottom;
    }

    /* renamed from: j */
    public static final int m80811j(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.bottom;
    }

    /* renamed from: k */
    public static final boolean m80812k(@C12579k Rect rect, @C12579k Point point) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(point, "p");
        return rect.contains(point.x, point.y);
    }

    /* renamed from: l */
    public static final boolean m80813l(@C12579k RectF rectF, @C12579k PointF pointF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(pointF, "p");
        return rectF.contains(pointF.x, pointF.y);
    }

    @C12579k
    /* renamed from: m */
    public static final Rect m80814m(@C12579k Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    @C12579k
    /* renamed from: n */
    public static final Rect m80815n(@C12579k Rect rect, @C12579k Point point) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @C12579k
    /* renamed from: o */
    public static final RectF m80816o(@C12579k RectF rectF, float f) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    @C12579k
    /* renamed from: p */
    public static final RectF m80817p(@C12579k RectF rectF, @C12579k PointF pointF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @C12579k
    /* renamed from: q */
    public static final Region m80818q(@C12579k Rect rect, @C12579k Rect rect2) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(rect2, C28515a1.f68703k);
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @C12579k
    /* renamed from: r */
    public static final Region m80819r(@C12579k RectF rectF, @C12579k RectF rectF2) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(rectF2, C28515a1.f68703k);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @C12579k
    /* renamed from: s */
    public static final Rect m80820s(@C12579k Rect rect, @C12579k Rect rect2) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(rect2, C28515a1.f68703k);
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @C12579k
    /* renamed from: t */
    public static final RectF m80821t(@C12579k RectF rectF, @C12579k RectF rectF2) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(rectF2, C28515a1.f68703k);
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @C12579k
    /* renamed from: u */
    public static final Rect m80822u(@C12579k Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    @C12579k
    /* renamed from: v */
    public static final Rect m80823v(@C12579k Rect rect, @C12579k Point point) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @C12579k
    /* renamed from: w */
    public static final Rect m80824w(@C12579k Rect rect, @C12579k Rect rect2) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(rect2, C28515a1.f68703k);
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @C12579k
    /* renamed from: x */
    public static final RectF m80825x(@C12579k RectF rectF, float f) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    @C12579k
    /* renamed from: y */
    public static final RectF m80826y(@C12579k RectF rectF, @C12579k PointF pointF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @C12579k
    /* renamed from: z */
    public static final RectF m80827z(@C12579k RectF rectF, @C12579k RectF rectF2) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(rectF2, C28515a1.f68703k);
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}
