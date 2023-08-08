package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0327c1;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.C0373u;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.text.C17900a0;
import androidx.core.util.C18001r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.q */
public final class C18496q {

    /* renamed from: a */
    public static final String f47271a = "TextViewCompat";

    /* renamed from: b */
    public static final int f47272b = 0;

    /* renamed from: c */
    public static final int f47273c = 1;

    /* renamed from: d */
    public static Field f47274d = null;

    /* renamed from: e */
    public static boolean f47275e = false;

    /* renamed from: f */
    public static Field f47276f = null;

    /* renamed from: g */
    public static boolean f47277g = false;

    /* renamed from: h */
    public static Field f47278h = null;

    /* renamed from: i */
    public static boolean f47279i = false;

    /* renamed from: j */
    public static Field f47280j = null;

    /* renamed from: k */
    public static boolean f47281k = false;

    /* renamed from: l */
    public static final int f47282l = 1;

    @C0376v0(16)
    /* renamed from: androidx.core.widget.q$a */
    public static class C18497a {
        @C0373u
        /* renamed from: a */
        public static boolean m83753a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @C0373u
        /* renamed from: b */
        public static int m83754b(TextView textView) {
            return textView.getMaxLines();
        }

        @C0373u
        /* renamed from: c */
        public static int m83755c(TextView textView) {
            return textView.getMinLines();
        }
    }

    @C0376v0(17)
    /* renamed from: androidx.core.widget.q$b */
    public static class C18498b {
        @C0373u
        /* renamed from: a */
        public static Drawable[] m83756a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @C0373u
        /* renamed from: b */
        public static int m83757b(View view) {
            return view.getLayoutDirection();
        }

        @C0373u
        /* renamed from: c */
        public static int m83758c(View view) {
            return view.getTextDirection();
        }

        @C0373u
        /* renamed from: d */
        public static Locale m83759d(TextView textView) {
            return textView.getTextLocale();
        }

        @C0373u
        /* renamed from: e */
        public static void m83760e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @C0373u
        /* renamed from: f */
        public static void m83761f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        @C0373u
        /* renamed from: g */
        public static void m83762g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @C0373u
        /* renamed from: h */
        public static void m83763h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.widget.q$c */
    public static class C18499c {
        @C0373u
        /* renamed from: a */
        public static int m83764a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @C0373u
        /* renamed from: b */
        public static ColorStateList m83765b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @C0373u
        /* renamed from: c */
        public static PorterDuff.Mode m83766c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @C0373u
        /* renamed from: d */
        public static int m83767d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @C0373u
        /* renamed from: e */
        public static void m83768e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @C0373u
        /* renamed from: f */
        public static void m83769f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @C0373u
        /* renamed from: g */
        public static void m83770g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @C0373u
        /* renamed from: h */
        public static void m83771h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.widget.q$d */
    public static class C18500d {
        @C0373u
        /* renamed from: a */
        public static DecimalFormatSymbols m83772a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.widget.q$e */
    public static class C18501e {
        @C0373u
        /* renamed from: a */
        public static int m83773a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @C0373u
        /* renamed from: b */
        public static int m83774b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @C0373u
        /* renamed from: c */
        public static int m83775c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @C0373u
        /* renamed from: d */
        public static int[] m83776d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @C0373u
        /* renamed from: e */
        public static int m83777e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @C0373u
        /* renamed from: f */
        public static void m83778f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @C0373u
        /* renamed from: g */
        public static void m83779g(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @C0373u
        /* renamed from: h */
        public static void m83780h(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.widget.q$f */
    public static class C18502f {
        @C0373u
        /* renamed from: a */
        public static String[] m83781a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @C0373u
        /* renamed from: b */
        public static PrecomputedText.Params m83782b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @C0373u
        /* renamed from: c */
        public static void m83783c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.widget.q$g */
    public @interface C18503g {
    }

    @C0376v0(26)
    /* renamed from: androidx.core.widget.q$h */
    public static class C18504h implements ActionMode.Callback {

        /* renamed from: g */
        public static final int f47283g = 100;

        /* renamed from: a */
        public final ActionMode.Callback f47284a;

        /* renamed from: b */
        public final TextView f47285b;

        /* renamed from: c */
        public Class<?> f47286c;

        /* renamed from: d */
        public Method f47287d;

        /* renamed from: e */
        public boolean f47288e;

        /* renamed from: f */
        public boolean f47289f = false;

        public C18504h(ActionMode.Callback callback, TextView textView) {
            this.f47284a = callback;
            this.f47285b = textView;
        }

        /* renamed from: a */
        public final Intent mo53372a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        public final Intent mo53373b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = mo53372a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !mo53376e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        public final List<ResolveInfo> mo53374c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(mo53372a(), 0)) {
                if (mo53377f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        @C0359n0
        /* renamed from: d */
        public ActionMode.Callback mo53375d() {
            return this.f47284a;
        }

        /* renamed from: e */
        public final boolean mo53376e(TextView textView) {
            if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo53377f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final void mo53378g(Menu menu) {
            Method method;
            Context context = this.f47285b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f47289f) {
                this.f47289f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f47286c = cls;
                    this.f47287d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f47288e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f47286c = null;
                    this.f47287d = null;
                    this.f47288e = false;
                }
            }
            try {
                if (!this.f47288e || !this.f47286c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f47287d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c = mo53374c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(mo53373b(resolveInfo, this.f47285b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f47284a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f47284a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f47284a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            mo53378g(menu);
            return this.f47284a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: A */
    public static void m83719A(@C0359n0 TextView textView, @C0372t0 @C0337f0(from = 0) int i) {
        int i2;
        C18001r.m81772i(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C18502f.m83783c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C18497a.m83753a(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: B */
    public static void m83720B(@C0359n0 TextView textView, @C0372t0 @C0337f0(from = 0) int i) {
        int i2;
        C18001r.m81772i(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C18497a.m83753a(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: C */
    public static void m83721C(@C0359n0 TextView textView, @C0372t0 @C0337f0(from = 0) int i) {
        C18001r.m81772i(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: D */
    public static void m83722D(@C0359n0 TextView textView, @C0359n0 C17900a0 a0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(a0Var.mo52336f());
        } else if (m83741o(textView).mo52347a(a0Var.mo52335e())) {
            textView.setText(a0Var);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: E */
    public static void m83723E(@C0359n0 TextView textView, @C0327c1 int i) {
        textView.setTextAppearance(i);
    }

    /* renamed from: F */
    public static void m83724F(@C0359n0 TextView textView, @C0359n0 C17900a0.C17901a aVar) {
        C18498b.m83763h(textView, m83739m(aVar.mo52350d()));
        textView.getPaint().set(aVar.mo52351e());
        C18499c.m83768e(textView, aVar.mo52348b());
        C18499c.m83771h(textView, aVar.mo52349c());
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: G */
    public static ActionMode.Callback m83725G(@C0363p0 ActionMode.Callback callback) {
        if (!(callback instanceof C18504h) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((C18504h) callback).mo53375d();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: H */
    public static ActionMode.Callback m83726H(@C0359n0 TextView textView, @C0363p0 ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof C18504h) || callback == null) {
            return callback;
        }
        return new C18504h(callback, textView);
    }

    /* renamed from: a */
    public static int m83727a(@C0359n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C18501e.m83773a(textView);
        }
        if (textView instanceof C18465b) {
            return ((C18465b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* renamed from: b */
    public static int m83728b(@C0359n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C18501e.m83774b(textView);
        }
        if (textView instanceof C18465b) {
            return ((C18465b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* renamed from: c */
    public static int m83729c(@C0359n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C18501e.m83775c(textView);
        }
        if (textView instanceof C18465b) {
            return ((C18465b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    @C0359n0
    /* renamed from: d */
    public static int[] m83730d(@C0359n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C18501e.m83776d(textView);
        }
        if (textView instanceof C18465b) {
            return ((C18465b) textView).getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }

    /* renamed from: e */
    public static int m83731e(@C0359n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C18501e.m83777e(textView);
        }
        if (textView instanceof C18465b) {
            return ((C18465b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @C0363p0
    /* renamed from: f */
    public static ColorStateList m83732f(@C0359n0 TextView textView) {
        C18001r.m81775l(textView);
        return C18499c.m83765b(textView);
    }

    @C0363p0
    /* renamed from: g */
    public static PorterDuff.Mode m83733g(@C0359n0 TextView textView) {
        C18001r.m81775l(textView);
        return C18499c.m83766c(textView);
    }

    @C0359n0
    /* renamed from: h */
    public static Drawable[] m83734h(@C0359n0 TextView textView) {
        return C18498b.m83756a(textView);
    }

    /* renamed from: i */
    public static int m83735i(@C0359n0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: j */
    public static int m83736j(@C0359n0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: k */
    public static int m83737k(@C0359n0 TextView textView) {
        return C18497a.m83754b(textView);
    }

    /* renamed from: l */
    public static int m83738l(@C0359n0 TextView textView) {
        return C18497a.m83755c(textView);
    }

    @C0376v0(18)
    /* renamed from: m */
    public static int m83739m(@C0359n0 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    @C0376v0(18)
    /* renamed from: n */
    public static TextDirectionHeuristic m83740n(@C0359n0 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (C18498b.m83757b(textView) == 1) {
                z = true;
            }
            switch (C18498b.m83758c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(C18502f.m83781a(C18500d.m83772a(C18498b.m83759d(textView)))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    @C0359n0
    /* renamed from: o */
    public static C17900a0.C17901a m83741o(@C0359n0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C17900a0.C17901a(C18502f.m83782b(textView));
        }
        C17900a0.C17901a.C17902a aVar = new C17900a0.C17901a.C17902a(new TextPaint(textView.getPaint()));
        aVar.mo52356b(C18499c.m83764a(textView));
        aVar.mo52357c(C18499c.m83767d(textView));
        aVar.mo52358d(m83740n(textView));
        return aVar.mo52355a();
    }

    /* renamed from: p */
    public static Field m83742p(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve ");
            sb.append(str);
            sb.append(" field.");
            return field;
        }
    }

    /* renamed from: q */
    public static int m83743q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve value of ");
            sb.append(field.getName());
            sb.append(" field.");
            return -1;
        }
    }

    /* renamed from: r */
    public static void m83744r(@C0359n0 TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C18501e.m83778f(textView, i, i2, i3, i4);
        } else if (textView instanceof C18465b) {
            ((C18465b) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    /* renamed from: s */
    public static void m83745s(@C0359n0 TextView textView, @C0359n0 int[] iArr, int i) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C18501e.m83779g(textView, iArr, i);
        } else if (textView instanceof C18465b) {
            ((C18465b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    /* renamed from: t */
    public static void m83746t(@C0359n0 TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C18501e.m83780h(textView, i);
        } else if (textView instanceof C18465b) {
            ((C18465b) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: u */
    public static void m83747u(@C0359n0 TextView textView, @C0363p0 ColorStateList colorStateList) {
        C18001r.m81775l(textView);
        C18499c.m83769f(textView, colorStateList);
    }

    /* renamed from: v */
    public static void m83748v(@C0359n0 TextView textView, @C0363p0 PorterDuff.Mode mode) {
        C18001r.m81775l(textView);
        C18499c.m83770g(textView, mode);
    }

    /* renamed from: w */
    public static void m83749w(@C0359n0 TextView textView, @C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        C18498b.m83760e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: x */
    public static void m83750x(@C0359n0 TextView textView, @C0375v int i, @C0375v int i2, @C0375v int i3, @C0375v int i4) {
        C18498b.m83761f(textView, i, i2, i3, i4);
    }

    /* renamed from: y */
    public static void m83751y(@C0359n0 TextView textView, @C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        C18498b.m83762g(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: z */
    public static void m83752z(@C0359n0 TextView textView, @C0359n0 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(m83726H(textView, callback));
    }
}
