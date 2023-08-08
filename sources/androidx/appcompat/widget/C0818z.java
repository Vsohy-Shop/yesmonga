package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.core.view.C18196h2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.z */
public class C0818z {

    /* renamed from: l */
    public static final String f2629l = "ACTVAutoSizeHelper";

    /* renamed from: m */
    public static final RectF f2630m = new RectF();

    /* renamed from: n */
    public static final int f2631n = 12;

    /* renamed from: o */
    public static final int f2632o = 112;

    /* renamed from: p */
    public static final int f2633p = 1;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: q */
    public static ConcurrentHashMap<String, Method> f2634q = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: r */
    public static ConcurrentHashMap<String, Field> f2635r = new ConcurrentHashMap<>();

    /* renamed from: s */
    public static final float f2636s = -1.0f;

    /* renamed from: t */
    public static final int f2637t = 1048576;

    /* renamed from: a */
    public int f2638a = 0;

    /* renamed from: b */
    public boolean f2639b = false;

    /* renamed from: c */
    public float f2640c = -1.0f;

    /* renamed from: d */
    public float f2641d = -1.0f;

    /* renamed from: e */
    public float f2642e = -1.0f;

    /* renamed from: f */
    public int[] f2643f = new int[0];

    /* renamed from: g */
    public boolean f2644g = false;

    /* renamed from: h */
    public TextPaint f2645h;
    @C0359n0

    /* renamed from: i */
    public final TextView f2646i;

    /* renamed from: j */
    public final Context f2647j;

    /* renamed from: k */
    public final C0824f f2648k;

    @C0376v0(16)
    /* renamed from: androidx.appcompat.widget.z$a */
    public static final class C0819a {
        @C0359n0
        @C0373u
        /* renamed from: a */
        public static StaticLayout m3958a(@C0359n0 CharSequence charSequence, @C0359n0 Layout.Alignment alignment, int i, @C0359n0 TextView textView, @C0359n0 TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @C0373u
        /* renamed from: b */
        public static int m3959b(@C0359n0 TextView textView) {
            return textView.getMaxLines();
        }
    }

    @C0376v0(18)
    /* renamed from: androidx.appcompat.widget.z$b */
    public static final class C0820b {
        @C0373u
        /* renamed from: a */
        public static boolean m3960a(@C0359n0 View view) {
            return view.isInLayout();
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.appcompat.widget.z$c */
    public static final class C0821c {
        @C0359n0
        @C0373u
        /* renamed from: a */
        public static StaticLayout m3961a(@C0359n0 CharSequence charSequence, @C0359n0 Layout.Alignment alignment, int i, int i2, @C0359n0 TextView textView, @C0359n0 TextPaint textPaint, @C0359n0 C0824f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.mo3791a(obtain, textView);
            } catch (ClassCastException unused) {
            }
            return obtain.build();
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.appcompat.widget.z$d */
    public static class C0822d extends C0824f {
        /* renamed from: a */
        public void mo3791a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0818z.m3932p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.appcompat.widget.z$e */
    public static class C0823e extends C0822d {
        /* renamed from: a */
        public void mo3791a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* renamed from: b */
        public boolean mo3792b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.z$f */
    public static class C0824f {
        /* renamed from: a */
        public void mo3791a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        public boolean mo3792b(TextView textView) {
            return ((Boolean) C0818z.m3932p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C0818z(@C0359n0 TextView textView) {
        this.f2646i = textView;
        this.f2647j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2648k = new C0823e();
        } else {
            this.f2648k = new C0822d();
        }
    }

    /* renamed from: a */
    public static <T> T m3929a(@C0359n0 Object obj, @C0359n0 String str, @C0359n0 T t) {
        try {
            Field m = m3930m(str);
            if (m == null) {
                return t;
            }
            return m.get(obj);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            return t;
        }
    }

    @C0363p0
    /* renamed from: m */
    public static Field m3930m(@C0359n0 String str) {
        try {
            Field field = f2635r.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f2635r.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to access TextView#");
            sb.append(str);
            sb.append(" member");
            return null;
        }
    }

    @C0363p0
    /* renamed from: n */
    public static Method m3931n(@C0359n0 String str) {
        try {
            Method method = f2634q.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2634q.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Failed to invoke TextView#");
        r2.append(r3);
        r2.append("() method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m3932p(@androidx.annotation.C0359n0 java.lang.Object r2, @androidx.annotation.C0359n0 java.lang.String r3, @androidx.annotation.C0359n0 T r4) {
        /*
            java.lang.reflect.Method r0 = m3931n(r3)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            goto L_0x0020
        L_0x000c:
            r2 = move-exception
            throw r2
        L_0x000e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Failed to invoke TextView#"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = "() method"
            r2.append(r3)
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0818z.m3932p(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: A */
    public final boolean mo3766A(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2646i.getText();
        TransformationMethod transformationMethod = this.f2646i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f2646i)) == null)) {
            text = transformation;
        }
        int b = C0819a.m3959b(this.f2646i);
        mo3780o(i);
        StaticLayout e = mo3772e(text, (Layout.Alignment) m3932p(this.f2646i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b);
        if ((b == -1 || (e.getLineCount() <= b && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean mo3767B() {
        return !(this.f2646i instanceof AppCompatEditText);
    }

    /* renamed from: C */
    public final void mo3768C(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f2638a = 1;
            this.f2641d = f;
            this.f2642e = f2;
            this.f2640c = f3;
            this.f2644g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public void mo3769b() {
        int i;
        if (mo3781q()) {
            if (this.f2639b) {
                if (this.f2646i.getMeasuredHeight() > 0 && this.f2646i.getMeasuredWidth() > 0) {
                    if (this.f2648k.mo3792b(this.f2646i)) {
                        i = 1048576;
                    } else {
                        i = (this.f2646i.getMeasuredWidth() - this.f2646i.getTotalPaddingLeft()) - this.f2646i.getTotalPaddingRight();
                    }
                    int height = (this.f2646i.getHeight() - this.f2646i.getCompoundPaddingBottom()) - this.f2646i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f2630m;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float g = (float) mo3774g(rectF);
                            if (g != this.f2646i.getTextSize()) {
                                mo3787w(0, g);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f2639b = true;
        }
    }

    /* renamed from: c */
    public final int[] mo3770c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    public final void mo3771d() {
        this.f2638a = 0;
        this.f2641d = -1.0f;
        this.f2642e = -1.0f;
        this.f2640c = -1.0f;
        this.f2643f = new int[0];
        this.f2639b = false;
    }

    @C0344h1
    @C0359n0
    /* renamed from: e */
    public StaticLayout mo3772e(@C0359n0 CharSequence charSequence, @C0359n0 Layout.Alignment alignment, int i, int i2) {
        return C0821c.m3961a(charSequence, alignment, i, i2, this.f2646i, this.f2645h, this.f2648k);
    }

    /* renamed from: f */
    public final StaticLayout mo3773f(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f2645h, i, alignment, ((Float) m3929a(this.f2646i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m3929a(this.f2646i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m3929a(this.f2646i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: g */
    public final int mo3774g(RectF rectF) {
        int length = this.f2643f.length;
        if (length != 0) {
            int i = 1;
            int i2 = length - 1;
            int i3 = 0;
            while (i <= i2) {
                int i4 = (i + i2) / 2;
                if (mo3766A(this.f2643f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i;
                    i = i5;
                } else {
                    i3 = i4 - 1;
                    i2 = i3;
                }
            }
            return this.f2643f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: h */
    public int mo3775h() {
        return Math.round(this.f2642e);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: i */
    public int mo3776i() {
        return Math.round(this.f2641d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public int mo3777j() {
        return Math.round(this.f2640c);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public int[] mo3778k() {
        return this.f2643f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public int mo3779l() {
        return this.f2638a;
    }

    @C0344h1
    /* renamed from: o */
    public void mo3780o(int i) {
        TextPaint textPaint = this.f2645h;
        if (textPaint == null) {
            this.f2645h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2645h.set(this.f2646i.getPaint());
        this.f2645h.setTextSize((float) i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: q */
    public boolean mo3781q() {
        return mo3767B() && this.f2638a != 0;
    }

    /* renamed from: r */
    public void mo3782r(@C0363p0 AttributeSet attributeSet, int i) {
        float f;
        float f2;
        float f3;
        int resourceId;
        Context context = this.f2647j;
        int[] iArr = C0387a.C0400m.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f2646i;
        C18196h2.m82658z1(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C0387a.C0400m.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f2638a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C0387a.C0400m.AppCompatTextView_autoSizeStepGranularity;
        if (obtainStyledAttributes.hasValue(i3)) {
            f = obtainStyledAttributes.getDimension(i3, -1.0f);
        } else {
            f = -1.0f;
        }
        int i4 = C0387a.C0400m.AppCompatTextView_autoSizeMinTextSize;
        if (obtainStyledAttributes.hasValue(i4)) {
            f2 = obtainStyledAttributes.getDimension(i4, -1.0f);
        } else {
            f2 = -1.0f;
        }
        int i5 = C0387a.C0400m.AppCompatTextView_autoSizeMaxTextSize;
        if (obtainStyledAttributes.hasValue(i5)) {
            f3 = obtainStyledAttributes.getDimension(i5, -1.0f);
        } else {
            f3 = -1.0f;
        }
        int i6 = C0387a.C0400m.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            mo3789y(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!mo3767B()) {
            this.f2638a = 0;
        } else if (this.f2638a == 1) {
            if (!this.f2644g) {
                DisplayMetrics displayMetrics = this.f2647j.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f3 == -1.0f) {
                    f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                mo3768C(f2, f3, f);
            }
            mo3788x();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: s */
    public void mo3783s(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (mo3767B()) {
            DisplayMetrics displayMetrics = this.f2647j.getResources().getDisplayMetrics();
            mo3768C(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (mo3788x()) {
                mo3769b();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: t */
    public void mo3784t(@C0359n0 int[] iArr, int i) throws IllegalArgumentException {
        if (mo3767B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2647j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f2643f = mo3770c(iArr2);
                if (!mo3790z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2644g = false;
            }
            if (mo3788x()) {
                mo3769b();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: u */
    public void mo3785u(int i) {
        if (!mo3767B()) {
            return;
        }
        if (i == 0) {
            mo3771d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f2647j.getResources().getDisplayMetrics();
            mo3768C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (mo3788x()) {
                mo3769b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* renamed from: v */
    public final void mo3786v(float f) {
        if (f != this.f2646i.getPaint().getTextSize()) {
            this.f2646i.getPaint().setTextSize(f);
            boolean a = C0820b.m3960a(this.f2646i);
            if (this.f2646i.getLayout() != null) {
                this.f2639b = false;
                try {
                    Method n = m3931n("nullLayouts");
                    if (n != null) {
                        n.invoke(this.f2646i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!a) {
                    this.f2646i.requestLayout();
                } else {
                    this.f2646i.forceLayout();
                }
                this.f2646i.invalidate();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: w */
    public void mo3787w(int i, float f) {
        Resources resources;
        Context context = this.f2647j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        mo3786v(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: x */
    public final boolean mo3788x() {
        if (!mo3767B() || this.f2638a != 1) {
            this.f2639b = false;
        } else {
            if (!this.f2644g || this.f2643f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f2642e - this.f2641d) / this.f2640c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f2641d + (((float) i) * this.f2640c));
                }
                this.f2643f = mo3770c(iArr);
            }
            this.f2639b = true;
        }
        return this.f2639b;
    }

    /* renamed from: y */
    public final void mo3789y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f2643f = mo3770c(iArr);
            mo3790z();
        }
    }

    /* renamed from: z */
    public final boolean mo3790z() {
        boolean z;
        int[] iArr = this.f2643f;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2644g = z;
        if (z) {
            this.f2638a = 1;
            this.f2641d = (float) iArr[0];
            this.f2642e = (float) iArr[length - 1];
            this.f2640c = -1.0f;
        }
        return z;
    }
}
