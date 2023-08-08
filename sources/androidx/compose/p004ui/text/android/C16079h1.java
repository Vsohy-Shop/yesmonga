package androidx.compose.p004ui.text.android;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.compose.ui.text.android.h1 */
public final class C16079h1 extends Canvas {

    /* renamed from: a */
    public Canvas f39965a;

    /* renamed from: a */
    public final void mo46352a(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f39965a = canvas;
    }

    @C0376v0(26)
    public boolean clipOutPath(@C12579k Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutPath(path);
    }

    @C0376v0(26)
    public boolean clipOutRect(@C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(rectF);
    }

    @C11395k(message = "Deprecated in Java")
    public boolean clipPath(@C12579k Path path, @C12579k Region.Op op) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op, "op");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @C11395k(message = "Deprecated in Java")
    public boolean clipRect(@C12579k RectF rectF, @C12579k Region.Op op) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    public void concat(@C12580l Matrix matrix) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @C0376v0(29)
    public void disableZ() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.disableZ();
    }

    public void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i, i2, i3, i4);
    }

    public void drawArc(@C12579k RectF rectF, float f, float f2, boolean z, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(rectF, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f, f2, z, paint);
    }

    public void drawBitmap(@C12579k Bitmap bitmap, float f, float f2, @C12580l Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f, f2, paint);
    }

    public void drawBitmapMesh(@C12579k Bitmap bitmap, int i, int i2, @C12579k float[] fArr, int i3, @C12580l int[] iArr, int i4, @C12580l Paint paint) {
        Bitmap bitmap2 = bitmap;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        float[] fArr2 = fArr;
        Intrinsics.checkNotNullParameter(fArr, "verts");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    public void drawCircle(float f, float f2, float f3, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f, f2, f3, paint);
    }

    public void drawColor(int i) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i);
    }

    @C0376v0(29)
    public void drawDoubleRoundRect(@C12579k RectF rectF, float f, float f2, @C12579k RectF rectF2, float f3, float f4, @C12579k Paint paint) {
        RectF rectF3 = rectF;
        Intrinsics.checkNotNullParameter(rectF, "outer");
        RectF rectF4 = rectF2;
        Intrinsics.checkNotNullParameter(rectF2, "inner");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    @C0376v0(31)
    public void drawGlyphs(@C12579k int[] iArr, int i, @C12579k float[] fArr, int i2, int i3, @C12579k Font font, @C12579k Paint paint) {
        int[] iArr2 = iArr;
        Intrinsics.checkNotNullParameter(iArr, "glyphIds");
        float[] fArr2 = fArr;
        Intrinsics.checkNotNullParameter(fArr, "positions");
        Font font2 = font;
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public void drawLine(float f, float f2, float f3, float f4, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f, f2, f3, f4, paint);
    }

    public void drawLines(@C12579k float[] fArr, int i, int i2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(fArr, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i, i2, paint);
    }

    public void drawOval(@C12579k RectF rectF, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(rectF, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    public void drawPaint(@C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @C0376v0(31)
    public void drawPatch(@C12579k NinePatch ninePatch, @C12579k Rect rect, @C12580l Paint paint) {
        Intrinsics.checkNotNullParameter(ninePatch, "patch");
        Intrinsics.checkNotNullParameter(rect, "dst");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public void drawPath(@C12579k Path path, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    public void drawPicture(@C12579k Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    public void drawPoint(float f, float f2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f, f2, paint);
    }

    public void drawPoints(@C12580l float[] fArr, int i, int i2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i, i2, paint);
    }

    @C11395k(message = "Deprecated in Java")
    public void drawPosText(@C12579k char[] cArr, int i, int i2, @C12579k float[] fArr, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(cArr, "text");
        Intrinsics.checkNotNullParameter(fArr, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i, i2, fArr, paint);
    }

    public void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i, i2, i3);
    }

    public void drawRect(@C12579k RectF rectF, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @C0376v0(29)
    public void drawRenderNode(@C12579k RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRenderNode(renderNode);
    }

    public void drawRoundRect(@C12579k RectF rectF, float f, float f2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f, f2, paint);
    }

    public void drawText(@C12579k char[] cArr, int i, int i2, float f, float f2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(cArr, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i, i2, f, f2, paint);
    }

    public void drawTextOnPath(@C12579k char[] cArr, int i, int i2, @C12579k Path path, float f, float f2, @C12579k Paint paint) {
        char[] cArr2 = cArr;
        Intrinsics.checkNotNullParameter(cArr, "text");
        Path path2 = path;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @C0376v0(23)
    public void drawTextRun(@C12579k char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, @C12579k Paint paint) {
        char[] cArr2 = cArr;
        Intrinsics.checkNotNullParameter(cArr, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    public void drawVertices(@C12579k Canvas.VertexMode vertexMode, int i, @C12579k float[] fArr, int i2, @C12580l float[] fArr2, int i3, @C12580l int[] iArr, int i4, @C12580l short[] sArr, int i5, int i6, @C12579k Paint paint) {
        Canvas.VertexMode vertexMode2 = vertexMode;
        Intrinsics.checkNotNullParameter(vertexMode, "mode");
        Intrinsics.checkNotNullParameter(fArr, "verts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @C0376v0(29)
    public void enableZ() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.enableZ();
    }

    public boolean getClipBounds(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "bounds");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    public int getDensity() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @C12580l
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    public int getHeight() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @C11395k(message = "Deprecated in Java")
    public void getMatrix(@C12579k Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "ctm");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    public int getMaximumBitmapHeight() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    public int getMaximumBitmapWidth() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    public int getSaveCount() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    public int getWidth() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    public boolean isOpaque() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @C11395k(message = "Deprecated in Java")
    public boolean quickReject(@C12579k RectF rectF, @C12579k Canvas.EdgeType edgeType) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        Intrinsics.checkNotNullParameter(edgeType, "type");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    public void restore() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    public void restoreToCount(int i) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i);
    }

    public void rotate(float f) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f);
    }

    public int save() {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @C11395k(message = "Deprecated in Java")
    public int saveLayer(@C12580l RectF rectF, @C12580l Paint paint, int i) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i);
    }

    @C11395k(message = "Deprecated in Java")
    public int saveLayerAlpha(@C12580l RectF rectF, int i, int i2) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i, i2);
    }

    public void scale(float f, float f2) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f, f2);
    }

    public void setBitmap(@C12580l Bitmap bitmap) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    public void setDensity(int i) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i);
    }

    public void setDrawFilter(@C12580l DrawFilter drawFilter) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    public void setMatrix(@C12580l Matrix matrix) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    public void skew(float f, float f2) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f, f2);
    }

    public void translate(float f, float f2) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f, f2);
    }

    @C0376v0(26)
    public boolean clipOutRect(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(rect);
    }

    public boolean clipPath(@C12579k Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @C11395k(message = "Deprecated in Java")
    public boolean clipRect(@C12579k Rect rect, @C12579k Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint);
    }

    public void drawBitmap(@C12579k Bitmap bitmap, @C12580l Rect rect, @C12579k RectF rectF, @C12580l Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(rectF, "dst");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @C0376v0(29)
    public void drawColor(long j) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j);
    }

    @C0376v0(29)
    public void drawDoubleRoundRect(@C12579k RectF rectF, @C12579k float[] fArr, @C12579k RectF rectF2, @C12579k float[] fArr2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(rectF, "outer");
        Intrinsics.checkNotNullParameter(fArr, "outerRadii");
        Intrinsics.checkNotNullParameter(rectF2, "inner");
        Intrinsics.checkNotNullParameter(fArr2, "innerRadii");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public void drawLines(@C12579k float[] fArr, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(fArr, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    public void drawOval(float f, float f2, float f3, float f4, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f, f2, f3, f4, paint);
    }

    @C0376v0(31)
    public void drawPatch(@C12579k NinePatch ninePatch, @C12579k RectF rectF, @C12580l Paint paint) {
        Intrinsics.checkNotNullParameter(ninePatch, "patch");
        Intrinsics.checkNotNullParameter(rectF, "dst");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public void drawPicture(@C12579k Picture picture, @C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(rectF, "dst");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    public void drawPoints(@C12579k float[] fArr, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(fArr, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @C11395k(message = "Deprecated in Java")
    public void drawPosText(@C12579k String str, @C12579k float[] fArr, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(fArr, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    public void drawRect(@C12579k Rect rect, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(rect, C28515a1.f68703k);
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    public void drawText(@C12579k String str, float f, float f2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f, f2, paint);
    }

    public void drawTextOnPath(@C12579k String str, @C12579k Path path, float f, float f2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f, f2, paint);
    }

    @C0376v0(23)
    public void drawTextRun(@C12579k CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, @C12579k Paint paint) {
        CharSequence charSequence2 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @C0376v0(30)
    public boolean quickReject(@C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF);
    }

    public int saveLayer(@C12580l RectF rectF, @C12580l Paint paint) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    public int saveLayerAlpha(@C12580l RectF rectF, int i) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i);
    }

    @C0376v0(26)
    public boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public boolean clipRect(@C12579k RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rect");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    public void drawBitmap(@C12579k Bitmap bitmap, @C12580l Rect rect, @C12579k Rect rect2, @C12580l Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(rect2, "dst");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    public void drawColor(int i, @C12579k PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i, mode);
    }

    public void drawPicture(@C12579k Picture picture, @C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(rect, "dst");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    public void drawRect(float f, float f2, float f3, float f4, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    public void drawText(@C12579k String str, int i, int i2, float f, float f2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i, i2, f, f2, paint);
    }

    @C0376v0(29)
    public void drawTextRun(@C12579k MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, @C12579k Paint paint) {
        MeasuredText measuredText2 = measuredText;
        Intrinsics.checkNotNullParameter(measuredText, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @C11395k(message = "Deprecated in Java")
    public boolean quickReject(@C12579k Path path, @C12579k Canvas.EdgeType edgeType) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(edgeType, "type");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @C11395k(message = "Deprecated in Java")
    public int saveLayer(float f, float f2, float f3, float f4, @C12580l Paint paint, int i) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint, i);
    }

    @C11395k(message = "Deprecated in Java")
    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @C0376v0(26)
    public boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public boolean clipRect(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @C11395k(message = "Deprecated in Java")
    public void drawBitmap(@C12579k int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, @C12580l Paint paint) {
        int[] iArr2 = iArr;
        Intrinsics.checkNotNullParameter(iArr, C9874a.f27063h);
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @C0376v0(29)
    public void drawColor(int i, @C12579k BlendMode blendMode) {
        Intrinsics.checkNotNullParameter(blendMode, "mode");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i, blendMode);
    }

    public void drawText(@C12579k CharSequence charSequence, int i, int i2, float f, float f2, @C12579k Paint paint) {
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }

    @C0376v0(30)
    public boolean quickReject(@C12579k Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path);
    }

    public int saveLayer(float f, float f2, float f3, float f4, @C12580l Paint paint) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f, f2, f3, f4, paint);
    }

    public int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    @C11395k(message = "Deprecated in Java")
    public boolean clipRect(float f, float f2, float f3, float f4, @C12579k Region.Op op) {
        Intrinsics.checkNotNullParameter(op, "op");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4, op);
    }

    @C11395k(message = "Deprecated in Java")
    public void drawBitmap(@C12579k int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, @C12580l Paint paint) {
        int[] iArr2 = iArr;
        Intrinsics.checkNotNullParameter(iArr, C9874a.f27063h);
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @C0376v0(29)
    public void drawColor(long j, @C12579k BlendMode blendMode) {
        Intrinsics.checkNotNullParameter(blendMode, "mode");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(j, blendMode);
    }

    @C11395k(message = "Deprecated in Java")
    public boolean quickReject(float f, float f2, float f3, float f4, @C12579k Canvas.EdgeType edgeType) {
        Intrinsics.checkNotNullParameter(edgeType, "type");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f, f2, f3, f4, edgeType);
    }

    public boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f, f2, f3, f4);
    }

    public void drawBitmap(@C12579k Bitmap bitmap, @C12579k Matrix matrix, @C12580l Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @C0376v0(30)
    public boolean quickReject(float f, float f2, float f3, float f4) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f, f2, f3, f4);
    }

    public boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.f39965a;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i, i2, i3, i4);
    }
}
