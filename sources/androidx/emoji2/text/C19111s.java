package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;

@C0376v0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.emoji2.text.s */
public final class C19111s extends C19091k {
    @C0363p0

    /* renamed from: g */
    public static Paint f48632g;
    @C0363p0

    /* renamed from: f */
    public TextPaint f48633f;

    public C19111s(@C0359n0 C19109r rVar) {
        super(rVar);
    }

    @C0359n0
    /* renamed from: h */
    public static Paint m89459h() {
        if (f48632g == null) {
            TextPaint textPaint = new TextPaint();
            f48632g = textPaint;
            textPaint.setColor(C19019f.m88864c().mo55963g());
            f48632g.setStyle(Paint.Style.FILL);
        }
        return f48632g;
    }

    public void draw(@C0359n0 Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, float f, int i3, int i4, int i5, @C0359n0 Paint paint) {
        float f2 = f;
        int i6 = i3;
        int i7 = i5;
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = paint;
        TextPaint f3 = mo56370f(charSequence, i, i2, textPaint);
        if (!(f3 == null || f3.bgColor == 0)) {
            mo56371g(canvas, f3, f, f2 + ((float) mo56280e()), (float) i6, (float) i7);
        }
        if (C19019f.m88864c().mo55968r()) {
            canvas.drawRect(f, (float) i6, f2 + ((float) mo56280e()), (float) i7, m89459h());
        }
        C19109r d = mo56279d();
        float f4 = (float) i4;
        Canvas canvas2 = canvas;
        if (f3 != null) {
            textPaint = f3;
        }
        d.mo56352a(canvas, f2, f4, textPaint);
    }

    @C0363p0
    /* renamed from: f */
    public final TextPaint mo56370f(@C0363p0 CharSequence charSequence, int i, int i2, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (!(characterStyleArr.length == 1 && characterStyleArr[0] == this)) {
                    TextPaint textPaint = this.f48633f;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.f48633f = textPaint;
                    }
                    textPaint.set(paint);
                    for (CharacterStyle updateDrawState : characterStyleArr) {
                        updateDrawState.updateDrawState(textPaint);
                    }
                    return textPaint;
                }
            }
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        } else if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        } else {
            return null;
        }
    }

    /* renamed from: g */
    public void mo56371g(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
