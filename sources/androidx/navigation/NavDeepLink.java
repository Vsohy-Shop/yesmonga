package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class NavDeepLink {
    @C12579k

    /* renamed from: m */
    public static final C19682b f50419m = new C19682b((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: n */
    public static final Pattern f50420n = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    @C12580l

    /* renamed from: a */
    public final String f50421a;
    @C12580l

    /* renamed from: b */
    public final String f50422b;
    @C12580l

    /* renamed from: c */
    public final String f50423c;
    @C12579k

    /* renamed from: d */
    public final List<String> f50424d;
    @C12579k

    /* renamed from: e */
    public final Map<String, C19684d> f50425e;
    @C12580l

    /* renamed from: f */
    public String f50426f;
    @C12579k

    /* renamed from: g */
    public final C11677z f50427g;

    /* renamed from: h */
    public boolean f50428h;

    /* renamed from: i */
    public boolean f50429i;
    @C12580l

    /* renamed from: j */
    public String f50430j;
    @C12579k

    /* renamed from: k */
    public final C11677z f50431k;

    /* renamed from: l */
    public boolean f50432l;

    /* renamed from: androidx.navigation.NavDeepLink$a */
    public static final class C19680a {
        @C12579k

        /* renamed from: d */
        public static final C19681a f50433d = new C19681a((DefaultConstructorMarker) null);
        @C12580l

        /* renamed from: a */
        public String f50434a;
        @C12580l

        /* renamed from: b */
        public String f50435b;
        @C12580l

        /* renamed from: c */
        public String f50436c;

        /* renamed from: androidx.navigation.NavDeepLink$a$a */
        public static final class C19681a {
            public /* synthetic */ C19681a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            @C11384m
            /* renamed from: a */
            public final C19680a mo58216a(@C12579k String str) {
                boolean z;
                Intrinsics.checkNotNullParameter(str, "action");
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C19680a aVar = new C19680a();
                    aVar.mo58213e(str);
                    return aVar;
                }
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }

            @C12579k
            @C11384m
            /* renamed from: b */
            public final C19680a mo58217b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "mimeType");
                C19680a aVar = new C19680a();
                aVar.mo58214f(str);
                return aVar;
            }

            @C12579k
            @C11384m
            /* renamed from: c */
            public final C19680a mo58218c(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "uriPattern");
                C19680a aVar = new C19680a();
                aVar.mo58215g(str);
                return aVar;
            }

            public C19681a() {
            }
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public static final C19680a m91522b(@C12579k String str) {
            return f50433d.mo58216a(str);
        }

        @C12579k
        @C11384m
        /* renamed from: c */
        public static final C19680a m91523c(@C12579k String str) {
            return f50433d.mo58217b(str);
        }

        @C12579k
        @C11384m
        /* renamed from: d */
        public static final C19680a m91524d(@C12579k String str) {
            return f50433d.mo58218c(str);
        }

        @C12579k
        /* renamed from: a */
        public final NavDeepLink mo58212a() {
            return new NavDeepLink(this.f50434a, this.f50435b, this.f50436c);
        }

        @C12579k
        /* renamed from: e */
        public final C19680a mo58213e(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "action");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f50435b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        @C12579k
        /* renamed from: f */
        public final C19680a mo58214f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "mimeType");
            this.f50436c = str;
            return this;
        }

        @C12579k
        /* renamed from: g */
        public final C19680a mo58215g(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "uriPattern");
            this.f50434a = str;
            return this;
        }
    }

    /* renamed from: androidx.navigation.NavDeepLink$b */
    public static final class C19682b {
        public /* synthetic */ C19682b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C19682b() {
        }
    }

    /* renamed from: androidx.navigation.NavDeepLink$c */
    public static final class C19683c implements Comparable<C19683c> {
        @C12579k

        /* renamed from: a */
        public String f50437a;
        @C12579k

        /* renamed from: b */
        public String f50438b;

        public C19683c(@C12579k String str) {
            List list;
            boolean z;
            Intrinsics.checkNotNullParameter(str, "mimeType");
            List<String> p = new Regex("/").mo23339p(str, 0);
            if (!p.isEmpty()) {
                ListIterator<String> listIterator = p.listIterator(p.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        list = CollectionsKt___CollectionsKt.m40497E5(p, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                this.f50437a = (String) list.get(0);
                this.f50438b = (String) list.get(1);
            }
            list = CollectionsKt__CollectionsKt.m40441E();
            this.f50437a = (String) list.get(0);
            this.f50438b = (String) list.get(1);
        }

        /* renamed from: b */
        public int compareTo(@C12579k C19683c cVar) {
            int i;
            Intrinsics.checkNotNullParameter(cVar, "other");
            if (Intrinsics.areEqual((Object) this.f50437a, (Object) cVar.f50437a)) {
                i = 2;
            } else {
                i = 0;
            }
            if (Intrinsics.areEqual((Object) this.f50438b, (Object) cVar.f50438b)) {
                return i + 1;
            }
            return i;
        }

        @C12579k
        /* renamed from: g */
        public final String mo58221g() {
            return this.f50438b;
        }

        @C12579k
        /* renamed from: q */
        public final String mo58222q() {
            return this.f50437a;
        }

        /* renamed from: r */
        public final void mo58223r(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f50438b = str;
        }

        /* renamed from: w */
        public final void mo58224w(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f50437a = str;
        }
    }

    /* renamed from: androidx.navigation.NavDeepLink$d */
    public static final class C19684d {
        @C12580l

        /* renamed from: a */
        public String f50439a;
        @C12579k

        /* renamed from: b */
        public final List<String> f50440b = new ArrayList();

        /* renamed from: a */
        public final void mo58225a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            this.f50440b.add(str);
        }

        @C12579k
        /* renamed from: b */
        public final String mo58226b(int i) {
            return this.f50440b.get(i);
        }

        @C12579k
        /* renamed from: c */
        public final List<String> mo58227c() {
            return this.f50440b;
        }

        @C12580l
        /* renamed from: d */
        public final String mo58228d() {
            return this.f50439a;
        }

        /* renamed from: e */
        public final void mo58229e(@C12580l String str) {
            this.f50439a = str;
        }

        /* renamed from: f */
        public final int mo58230f() {
            return this.f50440b.size();
        }
    }

    public NavDeepLink(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        String str4 = str;
        this.f50421a = str4;
        this.f50422b = str2;
        this.f50423c = str3;
        this.f50424d = new ArrayList();
        this.f50425e = new LinkedHashMap();
        this.f50427g = C10864b0.m38748c(new NavDeepLink$pattern$2(this));
        this.f50431k = C10864b0.m38748c(new NavDeepLink$mimeTypePattern$2(this));
        if (str4 != null) {
            Uri parse = Uri.parse(str);
            this.f50428h = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!f50420n.matcher(str4).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f50428h) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str4);
                if (matcher.find()) {
                    String substring = str4.substring(0, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Intrinsics.checkNotNullExpressionValue(compile, "fillInPattern");
                    this.f50432l = mo58193c(substring, sb, compile);
                }
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    if (queryParameter == null) {
                        this.f50429i = true;
                        queryParameter = next;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    C19684d dVar = new C19684d();
                    int i = 0;
                    while (matcher2.find()) {
                        String group = matcher2.group(1);
                        if (group != null) {
                            dVar.mo58225a(group);
                            Intrinsics.checkNotNullExpressionValue(queryParameter, "queryParam");
                            String substring2 = queryParameter.substring(i, matcher2.start());
                            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(Pattern.quote(substring2));
                            sb2.append("(.+?)?");
                            i = matcher2.end();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i < queryParameter.length()) {
                        Intrinsics.checkNotNullExpressionValue(queryParameter, "queryParam");
                        String substring3 = queryParameter.substring(i);
                        Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(Pattern.quote(substring3));
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "argRegex.toString()");
                    dVar.mo58229e(C11622t.replace$default(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null));
                    Map<String, C19684d> map = this.f50425e;
                    Intrinsics.checkNotNullExpressionValue(next, "paramName");
                    map.put(next, dVar);
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(compile, "fillInPattern");
                this.f50432l = mo58193c(str4, sb, compile);
            }
            String sb4 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "uriRegex.toString()");
            this.f50426f = C11622t.replace$default(sb4, ".*", "\\E.*\\Q", false, 4, (Object) null);
        }
        if (this.f50423c == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f50423c).matches()) {
            C19683c cVar = new C19683c(this.f50423c);
            this.f50430j = C11622t.replace$default("^(" + cVar.mo58222q() + "|[*]+)/(" + cVar.mo58221g() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
            return;
        }
        throw new IllegalArgumentException(("The given mimeType " + this.f50423c + " does not match to required \"type/subtype\" format").toString());
    }

    /* renamed from: c */
    public final boolean mo58193c(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ".*", false, 2, (Object) null);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f50424d.add(group);
                String substring = str.substring(i, matcher.start());
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
                sb.append("([^/]+?)");
                i = matcher.end();
                z = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    @C12580l
    /* renamed from: d */
    public final String mo58194d() {
        return this.f50422b;
    }

    @C12579k
    /* renamed from: e */
    public final List<String> mo58195e() {
        Collection collection = this.f50424d;
        ArrayList arrayList = new ArrayList();
        for (C19684d c : this.f50425e.values()) {
            C10994x.m42360n0(arrayList, c.mo58227c());
        }
        return CollectionsKt___CollectionsKt.m40718y4(collection, arrayList);
    }

    public boolean equals(@C12580l Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        if (!Intrinsics.areEqual((Object) this.f50421a, (Object) navDeepLink.f50421a) || !Intrinsics.areEqual((Object) this.f50422b, (Object) navDeepLink.f50422b) || !Intrinsics.areEqual((Object) this.f50423c, (Object) navDeepLink.f50423c)) {
            return false;
        }
        return true;
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public final Bundle mo58197f(@C12579k Uri uri, @C12579k Map<String, C19787o> map) {
        Matcher matcher;
        boolean z;
        Matcher matcher2;
        String str;
        Uri uri2 = uri;
        Map<String, C19787o> map2 = map;
        Intrinsics.checkNotNullParameter(uri2, C19758j0.f50575e);
        Intrinsics.checkNotNullParameter(map2, "arguments");
        Pattern j = mo58202j();
        if (j != null) {
            matcher = j.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f50424d.size();
        int i = 0;
        while (i < size) {
            String str2 = this.f50424d.get(i);
            i++;
            String decode = Uri.decode(matcher.group(i));
            C19787o oVar = map2.get(str2);
            try {
                Intrinsics.checkNotNullExpressionValue(decode, "value");
                if (mo58210r(bundle, str2, decode, oVar)) {
                    return null;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (this.f50428h) {
            for (String next : this.f50425e.keySet()) {
                C19684d dVar = this.f50425e.get(next);
                String queryParameter = uri2.getQueryParameter(next);
                if (this.f50429i) {
                    String uri3 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri3, "deepLink.toString()");
                    String substringAfter$default = StringsKt__StringsKt.substringAfter$default(uri3, '?', (String) null, 2, (Object) null);
                    if (!Intrinsics.areEqual((Object) substringAfter$default, (Object) uri3)) {
                        queryParameter = substringAfter$default;
                    }
                }
                if (queryParameter != null) {
                    Intrinsics.checkNotNull(dVar);
                    matcher2 = Pattern.compile(dVar.mo58228d(), 32).matcher(queryParameter);
                    if (!matcher2.matches()) {
                        return null;
                    }
                } else {
                    matcher2 = null;
                }
                Bundle bundle2 = new Bundle();
                try {
                    Intrinsics.checkNotNull(dVar);
                    int f = dVar.mo58230f();
                    for (int i2 = 0; i2 < f; i2++) {
                        if (matcher2 != null) {
                            str = matcher2.group(i2 + 1);
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = null;
                        }
                        String b = dVar.mo58226b(i2);
                        C19787o oVar2 = map2.get(b);
                        if (str != null) {
                            if (!Intrinsics.areEqual((Object) str, (Object) C12361b.f30258i + b + C12361b.f30259j) && mo58210r(bundle2, b, str, oVar2)) {
                                return null;
                            }
                        }
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        for (Map.Entry next2 : map.entrySet()) {
            String str3 = (String) next2.getKey();
            C19787o oVar3 = (C19787o) next2.getValue();
            if (oVar3 == null || oVar3.mo58539d() || oVar3.mo58538c()) {
                z = false;
            } else {
                z = true;
            }
            if (z && !bundle.containsKey(str3)) {
                return null;
            }
        }
        return bundle;
    }

    @C12580l
    /* renamed from: g */
    public final String mo58198g() {
        return this.f50423c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public final int mo58199h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "mimeType");
        if (this.f50423c != null) {
            Pattern i = mo58201i();
            Intrinsics.checkNotNull(i);
            if (i.matcher(str).matches()) {
                return new C19683c(this.f50423c).compareTo(new C19683c(str));
            }
        }
        return -1;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f50421a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 0) * 31;
        String str2 = this.f50422b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f50423c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    /* renamed from: i */
    public final Pattern mo58201i() {
        return (Pattern) this.f50431k.getValue();
    }

    /* renamed from: j */
    public final Pattern mo58202j() {
        return (Pattern) this.f50427g.getValue();
    }

    @C12580l
    /* renamed from: k */
    public final String mo58203k() {
        return this.f50421a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public final boolean mo58204l() {
        return this.f50432l;
    }

    /* renamed from: m */
    public final boolean mo58205m(String str) {
        boolean z;
        boolean z2;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f50422b;
        if (str2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2 && (str == null || Intrinsics.areEqual((Object) str2, (Object) str))) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo58206n(String str) {
        boolean z;
        boolean z2;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f50423c != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            if (str == null) {
                return true;
            }
            Pattern i = mo58201i();
            Intrinsics.checkNotNull(i);
            if (i.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo58207o(Uri uri) {
        boolean z;
        boolean z2;
        if (uri == null) {
            z = true;
        } else {
            z = false;
        }
        if (mo58202j() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            if (uri == null) {
                return true;
            }
            Pattern j = mo58202j();
            Intrinsics.checkNotNull(j);
            if (j.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo58208p(@C12579k Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return mo58209q(new C19848x(uri, (String) null, (String) null));
    }

    /* renamed from: q */
    public final boolean mo58209q(@C12579k C19848x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "deepLinkRequest");
        if (mo58207o(xVar.mo58626c()) && mo58205m(xVar.mo58624a())) {
            return mo58206n(xVar.mo58625b());
        }
        return false;
    }

    /* renamed from: r */
    public final boolean mo58210r(Bundle bundle, String str, String str2, C19787o oVar) {
        if (oVar != null) {
            oVar.mo58537b().mo58478g(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    /* renamed from: s */
    public final void mo58211s(boolean z) {
        this.f50432l = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(@C12579k String str) {
        this(str, (String) null, (String) null);
        Intrinsics.checkNotNullParameter(str, "uri");
    }
}
