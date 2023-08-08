package androidx.core.text.util;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.net.C17767c;
import androidx.core.util.C17996p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.core.text.util.c */
public final class C17945c {

    /* renamed from: a */
    public static final String[] f46421a = new String[0];

    /* renamed from: b */
    public static final Comparator<C17947b> f46422b = new C17944b();

    @C0376v0(24)
    /* renamed from: androidx.core.text.util.c$a */
    public static class C17946a {
        @C0373u
        /* renamed from: a */
        public static void m81568a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        @C0373u
        /* renamed from: b */
        public static boolean m81569b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    /* renamed from: androidx.core.text.util.c$b */
    public static class C17947b {

        /* renamed from: a */
        public URLSpan f46423a;

        /* renamed from: b */
        public String f46424b;

        /* renamed from: c */
        public int f46425c;

        /* renamed from: d */
        public int f46426d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.text.util.c$c */
    public @interface C17948c {
    }

    /* renamed from: b */
    public static void m81551b(@C0359n0 TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: c */
    public static void m81552c(@C0359n0 TextView textView, @C0359n0 Pattern pattern, @C0363p0 String str) {
        if (m81567r()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            m81554e(textView, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
    }

    /* renamed from: d */
    public static void m81553d(@C0359n0 TextView textView, @C0359n0 Pattern pattern, @C0363p0 String str, @C0363p0 Linkify.MatchFilter matchFilter, @C0363p0 Linkify.TransformFilter transformFilter) {
        if (m81567r()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            m81554e(textView, pattern, str, (String[]) null, matchFilter, transformFilter);
        }
    }

    /* renamed from: e */
    public static void m81554e(@C0359n0 TextView textView, @C0359n0 Pattern pattern, @C0363p0 String str, @C0363p0 String[] strArr, @C0363p0 Linkify.MatchFilter matchFilter, @C0363p0 Linkify.TransformFilter transformFilter) {
        if (m81567r()) {
            C17946a.m81568a(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (m81558i(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            m81551b(textView);
        }
    }

    /* renamed from: f */
    public static boolean m81555f(@C0359n0 Spannable spannable, int i) {
        if (m81567r()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            m81562m(arrayList, spannable, C17996p.f46508w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, (Linkify.TransformFilter) null);
        }
        if ((i & 2) != 0) {
            m81562m(arrayList, spannable, C17996p.f46484A, new String[]{C17767c.f46167b}, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
        if ((i & 8) != 0) {
            m81563n(arrayList, spannable);
        }
        m81566q(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17947b bVar = (C17947b) it.next();
            if (bVar.f46423a == null) {
                m81560k(bVar.f46424b, bVar.f46425c, bVar.f46426d, spannable);
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m81556g(@C0359n0 Spannable spannable, @C0359n0 Pattern pattern, @C0363p0 String str) {
        if (m81567r()) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        return m81558i(spannable, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    /* renamed from: h */
    public static boolean m81557h(@C0359n0 Spannable spannable, @C0359n0 Pattern pattern, @C0363p0 String str, @C0363p0 Linkify.MatchFilter matchFilter, @C0363p0 Linkify.TransformFilter transformFilter) {
        if (m81567r()) {
            return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return m81558i(spannable, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    /* renamed from: i */
    public static boolean m81558i(@C0359n0 Spannable spannable, @C0359n0 Pattern pattern, @C0363p0 String str, @C0363p0 String[] strArr, @C0363p0 Linkify.MatchFilter matchFilter, @C0363p0 Linkify.TransformFilter transformFilter) {
        boolean z;
        String str2;
        if (m81567r()) {
            return C17946a.m81569b(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f46421a;
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            String str3 = strArr[i];
            i++;
            if (str3 == null) {
                str2 = "";
            } else {
                str2 = str3.toLowerCase(Locale.ROOT);
            }
            strArr2[i] = str2;
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z2 = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter != null) {
                z = matchFilter.acceptMatch(spannable, start, end);
            } else {
                z = true;
            }
            if (z && group != null) {
                m81560k(m81565p(group, strArr2, matcher, transformFilter), start, end, spannable);
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: j */
    public static boolean m81559j(@C0359n0 TextView textView, int i) {
        if (m81567r()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (m81555f(valueOf, i)) {
                m81551b(textView);
                textView.setText(valueOf);
                return true;
            }
        } else if (m81555f((Spannable) text, i)) {
            m81551b(textView);
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static void m81560k(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    /* renamed from: l */
    public static String m81561l(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return C17942a.m81542c(str);
    }

    /* renamed from: m */
    public static void m81562m(ArrayList<C17947b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) && group != null) {
                C17947b bVar = new C17947b();
                bVar.f46424b = m81565p(group, strArr, matcher, transformFilter);
                bVar.f46425c = start;
                bVar.f46426d = end;
                arrayList.add(bVar);
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:14:0x0005, LOOP_START, PHI: r0 r6 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v3 java.lang.String) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:1:0x0005] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m81563n(java.util.ArrayList<androidx.core.text.util.C17945c.C17947b> r5, android.text.Spannable r6) {
        /*
            java.lang.String r6 = r6.toString()
            r0 = 0
        L_0x0005:
            java.lang.String r1 = m81561l(r6)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r1 == 0) goto L_0x0043
            int r2 = r6.indexOf(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r2 >= 0) goto L_0x0012
            goto L_0x0043
        L_0x0012:
            androidx.core.text.util.c$b r3 = new androidx.core.text.util.c$b     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r1.length()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r4 + r2
            int r2 = r2 + r0
            r3.f46425c = r2     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r0 = r0 + r4
            r3.f46426d = r0     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r6 = r6.substring(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0005 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r4 = "geo:0,0?q="
            r2.append(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.append(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r1 = r2.toString()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.f46424b = r1     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r5.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            goto L_0x0005
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.util.C17945c.m81563n(java.util.ArrayList, android.text.Spannable):void");
    }

    /* renamed from: o */
    public static /* synthetic */ int m81564o(C17947b bVar, C17947b bVar2) {
        int i = bVar.f46425c;
        int i2 = bVar2.f46425c;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(bVar2.f46426d, bVar.f46426d);
    }

    /* renamed from: p */
    public static String m81565p(@C0359n0 String str, @C0359n0 String[] strArr, Matcher matcher, @C0363p0 Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str2 + str.substring(str2.length());
                }
            } else {
                i++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    /* renamed from: q */
    public static void m81566q(ArrayList<C17947b> arrayList, Spannable spannable) {
        int i;
        int i2;
        int i3 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            C17947b bVar = new C17947b();
            bVar.f46423a = uRLSpan;
            bVar.f46425c = spannable.getSpanStart(uRLSpan);
            bVar.f46426d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f46422b);
        int size = arrayList.size();
        while (i3 < size - 1) {
            C17947b bVar2 = arrayList.get(i3);
            int i4 = i3 + 1;
            C17947b bVar3 = arrayList.get(i4);
            int i5 = bVar2.f46425c;
            int i6 = bVar3.f46425c;
            if (i5 <= i6 && (i = bVar2.f46426d) > i6) {
                int i7 = bVar3.f46426d;
                if (i7 <= i || i - i5 > i7 - i6) {
                    i2 = i4;
                } else if (i - i5 < i7 - i6) {
                    i2 = i3;
                } else {
                    i2 = -1;
                }
                if (i2 != -1) {
                    URLSpan uRLSpan2 = arrayList.get(i2).f46423a;
                    if (uRLSpan2 != null) {
                        spannable.removeSpan(uRLSpan2);
                    }
                    arrayList.remove(i2);
                    size--;
                }
            }
            i3 = i4;
        }
    }

    /* renamed from: r */
    public static boolean m81567r() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
