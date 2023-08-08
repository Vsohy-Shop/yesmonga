package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.C0387a;
import androidx.core.content.C17318d;
import androidx.cursoradapter.widget.C18522c;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.b1 */
public class C0694b1 extends C18522c implements View.OnClickListener {

    /* renamed from: R0 */
    public static final boolean f2274R0 = false;

    /* renamed from: S0 */
    public static final String f2275S0 = "SuggestionsAdapter";

    /* renamed from: T0 */
    public static final int f2276T0 = 50;

    /* renamed from: U0 */
    public static final int f2277U0 = 0;

    /* renamed from: V0 */
    public static final int f2278V0 = 1;

    /* renamed from: W0 */
    public static final int f2279W0 = 2;

    /* renamed from: X0 */
    public static final int f2280X0 = -1;

    /* renamed from: E0 */
    public final SearchableInfo f2281E0;

    /* renamed from: F0 */
    public final Context f2282F0;

    /* renamed from: G0 */
    public final WeakHashMap<String, Drawable.ConstantState> f2283G0;

    /* renamed from: H0 */
    public final int f2284H0;

    /* renamed from: I0 */
    public boolean f2285I0 = false;

    /* renamed from: J0 */
    public int f2286J0 = 1;

    /* renamed from: K0 */
    public ColorStateList f2287K0;

    /* renamed from: L0 */
    public int f2288L0 = -1;

    /* renamed from: M0 */
    public int f2289M0 = -1;

    /* renamed from: N0 */
    public int f2290N0 = -1;

    /* renamed from: O0 */
    public int f2291O0 = -1;

    /* renamed from: P0 */
    public int f2292P0 = -1;

    /* renamed from: Q0 */
    public int f2293Q0 = -1;

    /* renamed from: Z */
    public final SearchView f2294Z;

    /* renamed from: androidx.appcompat.widget.b1$a */
    public static final class C0695a {

        /* renamed from: a */
        public final TextView f2295a;

        /* renamed from: b */
        public final TextView f2296b;

        /* renamed from: c */
        public final ImageView f2297c;

        /* renamed from: d */
        public final ImageView f2298d;

        /* renamed from: e */
        public final ImageView f2299e;

        public C0695a(View view) {
            this.f2295a = (TextView) view.findViewById(16908308);
            this.f2296b = (TextView) view.findViewById(16908309);
            this.f2297c = (ImageView) view.findViewById(16908295);
            this.f2298d = (ImageView) view.findViewById(16908296);
            this.f2299e = (ImageView) view.findViewById(C0387a.C0394g.edit_query);
        }
    }

    public C0694b1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f2294Z = searchView;
        this.f2281E0 = searchableInfo;
        this.f2284H0 = searchView.getSuggestionCommitIconResId();
        this.f2282F0 = context;
        this.f2283G0 = weakHashMap;
    }

    /* renamed from: D */
    public static String m3358D(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static String m3359u(Cursor cursor, String str) {
        return m3358D(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: A */
    public final Drawable mo3273A(Cursor cursor) {
        int i = this.f2292P0;
        if (i == -1) {
            return null;
        }
        return mo3300y(cursor.getString(i));
    }

    /* renamed from: B */
    public int mo3274B() {
        return this.f2286J0;
    }

    /* renamed from: C */
    public Cursor mo3275C(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f2282F0.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: E */
    public void mo3276E(int i) {
        this.f2286J0 = i;
    }

    /* renamed from: F */
    public final void mo3277F(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: G */
    public final void mo3278G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: H */
    public final void mo3279H(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2283G0.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: I */
    public final void mo3280I(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    /* renamed from: a */
    public CharSequence mo3281a(Cursor cursor) {
        String u;
        String u2;
        if (cursor == null) {
            return null;
        }
        String u3 = m3359u(cursor, "suggest_intent_query");
        if (u3 != null) {
            return u3;
        }
        if (this.f2281E0.shouldRewriteQueryFromData() && (u2 = m3359u(cursor, "suggest_intent_data")) != null) {
            return u2;
        }
        if (!this.f2281E0.shouldRewriteQueryFromText() || (u = m3359u(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return u;
    }

    /* renamed from: b */
    public void mo3282b(Cursor cursor) {
        if (!this.f2285I0) {
            try {
                super.mo3282b(cursor);
                if (cursor != null) {
                    this.f2288L0 = cursor.getColumnIndex("suggest_text_1");
                    this.f2289M0 = cursor.getColumnIndex("suggest_text_2");
                    this.f2290N0 = cursor.getColumnIndex("suggest_text_2_url");
                    this.f2291O0 = cursor.getColumnIndex("suggest_icon_1");
                    this.f2292P0 = cursor.getColumnIndex("suggest_icon_2");
                    this.f2293Q0 = cursor.getColumnIndex("suggest_flags");
                }
            } catch (Exception unused) {
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: c */
    public Cursor mo3283c(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        if (this.f2294Z.getVisibility() == 0 && this.f2294Z.getWindowVisibility() == 0) {
            try {
                Cursor C = mo3275C(this.f2281E0, str, 50);
                if (C != null) {
                    C.getCount();
                    return C;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo3284e(View view, Context context, Cursor cursor) {
        int i;
        CharSequence charSequence;
        C0695a aVar = (C0695a) view.getTag();
        int i2 = this.f2293Q0;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (aVar.f2295a != null) {
            mo3278G(aVar.f2295a, m3358D(cursor, this.f2288L0));
        }
        if (aVar.f2296b != null) {
            String D = m3358D(cursor, this.f2290N0);
            if (D != null) {
                charSequence = mo3294r(D);
            } else {
                charSequence = m3358D(cursor, this.f2289M0);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f2295a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f2295a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f2295a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f2295a.setMaxLines(1);
                }
            }
            mo3278G(aVar.f2296b, charSequence);
        }
        ImageView imageView = aVar.f2297c;
        if (imageView != null) {
            mo3277F(imageView, mo3301z(cursor), 4);
        }
        ImageView imageView2 = aVar.f2298d;
        if (imageView2 != null) {
            mo3277F(imageView2, mo3273A(cursor), 8);
        }
        int i3 = this.f2286J0;
        if (i3 == 2 || (i3 == 1 && (i & 1) != 0)) {
            aVar.f2299e.setVisibility(0);
            aVar.f2299e.setTag(aVar.f2295a.getText());
            aVar.f2299e.setOnClickListener(this);
            return;
        }
        aVar.f2299e.setVisibility(8);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View i2 = mo53391i(this.f2282F0, mo53383d(), viewGroup);
            if (i2 != null) {
                ((C0695a) i2.getTag()).f2295a.setText(e.toString());
            }
            return i2;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View j = mo3288j(this.f2282F0, mo53383d(), viewGroup);
            if (j != null) {
                ((C0695a) j.getTag()).f2295a.setText(e.toString());
            }
            return j;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: j */
    public View mo3288j(Context context, Cursor cursor, ViewGroup viewGroup) {
        View j = super.mo3288j(context, cursor, viewGroup);
        j.setTag(new C0695a(j));
        ((ImageView) j.findViewById(C0387a.C0394g.edit_query)).setImageResource(this.f2284H0);
        return j;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        mo3280I(mo53383d());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        mo3280I(mo53383d());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2294Z.mo2942a0((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final Drawable mo3292p(String str) {
        Drawable.ConstantState constantState = this.f2283G0.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: q */
    public void mo3293q() {
        mo3282b((Cursor) null);
        this.f2285I0 = true;
    }

    /* renamed from: r */
    public final CharSequence mo3294r(CharSequence charSequence) {
        if (this.f2287K0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f2282F0.getTheme().resolveAttribute(C0387a.C0389b.textColorSearchUrl, typedValue, true);
            this.f2287K0 = this.f2282F0.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f2287K0, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: s */
    public final Drawable mo3295s(ComponentName componentName) {
        PackageManager packageManager = this.f2282F0.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    /* renamed from: t */
    public final Drawable mo3296t(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f2283G0.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f2283G0.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f2282F0.getResources());
        }
        Drawable s = mo3295s(componentName);
        if (s != null) {
            constantState = s.getConstantState();
        }
        this.f2283G0.put(flattenToShortString, constantState);
        return s;
    }

    /* renamed from: v */
    public final Drawable mo3297v() {
        Drawable t = mo3296t(this.f2281E0.getSearchActivity());
        if (t != null) {
            return t;
        }
        return this.f2282F0.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0050=Splitter:B:22:0x0050, B:4:0x000f=Splitter:B:4:0x000f, B:16:0x003f=Splitter:B:16:0x003f} */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo3298w(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Error closing icon stream for "
            r1 = 0
            java.lang.String r2 = r5.getScheme()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r2 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r5 = r4.mo3299x(r5)     // Catch:{ NotFoundException -> 0x0014 }
            return r5
        L_0x0014:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "Resource does not exist: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0073 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x002b:
            android.content.Context r2 = r4.f2282F0     // Catch:{ FileNotFoundException -> 0x0073 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.io.InputStream r2 = r2.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r2 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r2, r1)     // Catch:{ all -> 0x004b }
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x004a
        L_0x003f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x004a:
            return r3
        L_0x004b:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x005b
        L_0x0050:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x005b:
            throw r3     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x005c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "Failed to open "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0073 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon not found: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0694b1.mo3298w(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: x */
    public Drawable mo3299x(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f2282F0.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* renamed from: y */
    public final Drawable mo3300y(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2282F0.getPackageName() + "/" + parseInt;
            Drawable p = mo3292p(str2);
            if (p != null) {
                return p;
            }
            Drawable i = C17318d.m79726i(this.f2282F0, parseInt);
            mo3279H(str2, i);
            return i;
        } catch (NumberFormatException unused) {
            Drawable p2 = mo3292p(str);
            if (p2 != null) {
                return p2;
            }
            Drawable w = mo3298w(Uri.parse(str));
            mo3279H(str, w);
            return w;
        } catch (Resources.NotFoundException unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Icon resource not found: ");
            sb.append(str);
            return null;
        }
    }

    /* renamed from: z */
    public final Drawable mo3301z(Cursor cursor) {
        int i = this.f2291O0;
        if (i == -1) {
            return null;
        }
        Drawable y = mo3300y(cursor.getString(i));
        if (y != null) {
            return y;
        }
        return mo3297v();
    }
}
