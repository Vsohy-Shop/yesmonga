package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.C0329d0;
import androidx.annotation.C0346i;
import androidx.annotation.RestrictTo;
import androidx.collection.C1887m;
import androidx.collection.C1888n;
import androidx.navigation.NavDeepLink;
import androidx.navigation.common.C19696a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.iam.events.C9175a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.C10861c;
import kotlin.annotation.C10862d;
import kotlin.collections.C10944i;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public class NavDestination {
    @C12579k

    /* renamed from: x */
    public static final Companion f50441x = new Companion((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: y */
    public static final Map<String, Class<?>> f50442y = new LinkedHashMap();
    @C12579k

    /* renamed from: a */
    public final String f50443a;
    @C12580l

    /* renamed from: b */
    public NavGraph f50444b;
    @C12580l

    /* renamed from: c */
    public String f50445c;
    @C12580l

    /* renamed from: d */
    public CharSequence f50446d;
    @C12579k

    /* renamed from: e */
    public final List<NavDeepLink> f50447e;
    @C12579k

    /* renamed from: f */
    public final C1887m<C19757j> f50448f;
    @C12579k

    /* renamed from: g */
    public Map<String, C19787o> f50449g;

    /* renamed from: v */
    public int f50450v;
    @C12580l

    /* renamed from: w */
    public String f50451w;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11384m
        /* renamed from: d */
        public static /* synthetic */ void m91578d(NavDestination navDestination) {
        }

        @C12579k
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: a */
        public final String mo58258a(@C12580l String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        @C12579k
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C11384m
        /* renamed from: b */
        public final String mo58259b(@C12579k Context context, int i) {
            String str;
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                str = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                str = String.valueOf(i);
            }
            Intrinsics.checkNotNullExpressionValue(str, "try {\n                co….toString()\n            }");
            return str;
        }

        @C12579k
        /* renamed from: c */
        public final C11559m<NavDestination> mo58260c(@C12579k NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            return SequencesKt__SequencesKt.m44595l(navDestination, NavDestination$Companion$hierarchy$1.f50457f);
        }

        @C12579k
        @C11384m
        /* renamed from: e */
        public final <C> Class<? extends C> mo58261e(@C12579k Context context, @C12579k String str, @C12579k Class<? extends C> cls) {
            String str2;
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(cls, "expectedClassType");
            if (str.charAt(0) == '.') {
                str2 = context.getPackageName() + str;
            } else {
                str2 = str;
            }
            Class<?> cls2 = (Class) NavDestination.f50442y.get(str2);
            if (cls2 == null) {
                try {
                    cls2 = Class.forName(str2, true, context.getClassLoader());
                    NavDestination.f50442y.put(str, cls2);
                } catch (ClassNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            Intrinsics.checkNotNull(cls2);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            throw new IllegalArgumentException((str2 + " must be a subclass of " + cls).toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C12579k
        @C11384m
        /* renamed from: f */
        public final <C> Class<? extends C> mo58262f(@C12579k Context context, @C12579k String str, @C12579k Class<? extends C> cls) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(cls, "expectedClassType");
            return NavDestination.m91549r0(context, str, cls);
        }

        public Companion() {
        }
    }

    @C10862d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @C10861c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.navigation.NavDestination$a */
    public @interface C19685a {
        Class<?> value();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.navigation.NavDestination$b */
    public static final class C19686b implements Comparable<C19686b> {
        @C12579k

        /* renamed from: a */
        public final NavDestination f50452a;
        @C12580l

        /* renamed from: b */
        public final Bundle f50453b;

        /* renamed from: c */
        public final boolean f50454c;

        /* renamed from: d */
        public final boolean f50455d;

        /* renamed from: e */
        public final int f50456e;

        public C19686b(@C12579k NavDestination navDestination, @C12580l Bundle bundle, boolean z, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(navDestination, FirebaseAnalytics.C32532b.f78977z);
            this.f50452a = navDestination;
            this.f50453b = bundle;
            this.f50454c = z;
            this.f50455d = z2;
            this.f50456e = i;
        }

        /* renamed from: b */
        public int compareTo(@C12579k C19686b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "other");
            boolean z = this.f50454c;
            if (z && !bVar.f50454c) {
                return 1;
            }
            if (!z && bVar.f50454c) {
                return -1;
            }
            Bundle bundle = this.f50453b;
            if (bundle != null && bVar.f50453b == null) {
                return 1;
            }
            if (bundle == null && bVar.f50453b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = bVar.f50453b;
                Intrinsics.checkNotNull(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f50455d;
            if (z2 && !bVar.f50455d) {
                return 1;
            }
            if (z2 || !bVar.f50455d) {
                return this.f50456e - bVar.f50456e;
            }
            return -1;
        }

        @C12579k
        /* renamed from: g */
        public final NavDestination mo58266g() {
            return this.f50452a;
        }

        @C12580l
        /* renamed from: q */
        public final Bundle mo58267q() {
            return this.f50453b;
        }
    }

    public NavDestination(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "navigatorName");
        this.f50443a = str;
        this.f50447e = new ArrayList();
        this.f50448f = new C1887m<>();
        this.f50449g = new LinkedHashMap();
    }

    /* renamed from: H */
    public static /* synthetic */ int[] m91545H(NavDestination navDestination, NavDestination navDestination2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                navDestination2 = null;
            }
            return navDestination.mo58255y(navDestination2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C11384m
    /* renamed from: X */
    public static final String m91546X(@C12579k Context context, int i) {
        return f50441x.mo58259b(context, i);
    }

    @C12579k
    /* renamed from: e0 */
    public static final C11559m<NavDestination> m91548e0(@C12579k NavDestination navDestination) {
        return f50441x.mo58260c(navDestination);
    }

    @C12579k
    @C11384m
    /* renamed from: r0 */
    public static final <C> Class<? extends C> m91549r0(@C12579k Context context, @C12579k String str, @C12579k Class<? extends C> cls) {
        return f50441x.mo58261e(context, str, cls);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C12579k
    @C11384m
    /* renamed from: s0 */
    public static final <C> Class<? extends C> m91550s0(@C12579k Context context, @C12579k String str, @C12579k Class<? extends C> cls) {
        return f50441x.mo58262f(context, str, cls);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: A0 */
    public final void mo58233A0(@C12580l NavGraph navGraph) {
        this.f50444b = navGraph;
    }

    /* renamed from: B0 */
    public final void mo58234B0(@C12580l String str) {
        Object obj;
        if (str == null) {
            mo58256y0(0);
        } else if (!C11622t.isBlank(str)) {
            String a = f50441x.mo58258a(str);
            mo58256y0(a.hashCode());
            mo58248q(a);
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        List<NavDeepLink> list = this.f50447e;
        Collection collection = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((NavDeepLink) obj).mo58203k(), (Object) f50441x.mo58258a(this.f50451w))) {
                break;
            }
        }
        C11370u0.m43685a(collection).remove(obj);
        this.f50451w = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C0 */
    public boolean mo58039C0() {
        return true;
    }

    @C12580l
    /* renamed from: M */
    public final C19757j mo58235M(@C0329d0 int i) {
        C19757j jVar;
        if (this.f50448f.mo6367o()) {
            jVar = null;
        } else {
            jVar = this.f50448f.mo6363k(i);
        }
        if (jVar != null) {
            return jVar;
        }
        NavGraph navGraph = this.f50444b;
        if (navGraph != null) {
            return navGraph.mo58235M(i);
        }
        return null;
    }

    @C12579k
    /* renamed from: Q */
    public final Map<String, C19787o> mo58236Q() {
        return C10977s0.m41430D0(this.f50449g);
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: W */
    public String mo58237W() {
        String str = this.f50445c;
        return str == null ? String.valueOf(this.f50450v) : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.C12580l java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x013e
            boolean r1 = r9 instanceof androidx.navigation.NavDestination
            if (r1 != 0) goto L_0x0009
            goto L_0x013e
        L_0x0009:
            java.util.List<androidx.navigation.NavDeepLink> r1 = r8.f50447e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List<androidx.navigation.NavDeepLink> r2 = r9.f50447e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40619d3(r1, r2)
            int r1 = r1.size()
            java.util.List<androidx.navigation.NavDeepLink> r2 = r8.f50447e
            int r2 = r2.size()
            r3 = 1
            if (r1 != r2) goto L_0x0026
            r1 = r3
            goto L_0x0027
        L_0x0026:
            r1 = r0
        L_0x0027:
            androidx.collection.m<androidx.navigation.j> r2 = r8.f50448f
            int r2 = r2.mo6353G()
            androidx.collection.m<androidx.navigation.j> r4 = r9.f50448f
            int r4 = r4.mo6353G()
            if (r2 != r4) goto L_0x0085
            androidx.collection.m<androidx.navigation.j> r2 = r8.f50448f
            java.util.Iterator r2 = androidx.collection.C1888n.m7625k(r2)
            kotlin.sequences.m r2 = kotlin.sequences.SequencesKt__SequencesKt.m44588e(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0043:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r2.next()
            androidx.navigation.j r4 = (androidx.navigation.C19757j) r4
            androidx.collection.m<androidx.navigation.j> r5 = r9.f50448f
            boolean r4 = r5.mo6360h(r4)
            if (r4 != 0) goto L_0x0043
            r2 = r0
            goto L_0x005a
        L_0x0059:
            r2 = r3
        L_0x005a:
            if (r2 == 0) goto L_0x0085
            androidx.collection.m<androidx.navigation.j> r2 = r9.f50448f
            java.util.Iterator r2 = androidx.collection.C1888n.m7625k(r2)
            kotlin.sequences.m r2 = kotlin.sequences.SequencesKt__SequencesKt.m44588e(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x006a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r2.next()
            androidx.navigation.j r4 = (androidx.navigation.C19757j) r4
            androidx.collection.m<androidx.navigation.j> r5 = r8.f50448f
            boolean r4 = r5.mo6360h(r4)
            if (r4 != 0) goto L_0x006a
            r2 = r0
            goto L_0x0081
        L_0x0080:
            r2 = r3
        L_0x0081:
            if (r2 == 0) goto L_0x0085
            r2 = r3
            goto L_0x0086
        L_0x0085:
            r2 = r0
        L_0x0086:
            java.util.Map r4 = r8.mo58236Q()
            int r4 = r4.size()
            java.util.Map r5 = r9.mo58236Q()
            int r5 = r5.size()
            if (r4 != r5) goto L_0x0126
            java.util.Map r4 = r8.mo58236Q()
            kotlin.sequences.m r4 = kotlin.collections.C10983u0.m41518T0(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x00a4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.mo58236Q()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x00d6
            java.util.Map r6 = r9.mo58236Q()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x00d6
            r5 = r3
            goto L_0x00d7
        L_0x00d6:
            r5 = r0
        L_0x00d7:
            if (r5 != 0) goto L_0x00a4
            r4 = r0
            goto L_0x00dc
        L_0x00db:
            r4 = r3
        L_0x00dc:
            if (r4 == 0) goto L_0x0126
            java.util.Map r4 = r9.mo58236Q()
            kotlin.sequences.m r4 = kotlin.collections.C10983u0.m41518T0(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x00ea:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0121
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r8.mo58236Q()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x011c
            java.util.Map r6 = r8.mo58236Q()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x011c
            r5 = r3
            goto L_0x011d
        L_0x011c:
            r5 = r0
        L_0x011d:
            if (r5 != 0) goto L_0x00ea
            r4 = r0
            goto L_0x0122
        L_0x0121:
            r4 = r3
        L_0x0122:
            if (r4 == 0) goto L_0x0126
            r4 = r3
            goto L_0x0127
        L_0x0126:
            r4 = r0
        L_0x0127:
            int r5 = r8.f50450v
            int r6 = r9.f50450v
            if (r5 != r6) goto L_0x013e
            java.lang.String r5 = r8.f50451w
            java.lang.String r9 = r9.f50451w
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x013e
            if (r1 == 0) goto L_0x013e
            if (r2 == 0) goto L_0x013e
            if (r4 == 0) goto L_0x013e
            r0 = r3
        L_0x013e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    @C0329d0
    /* renamed from: f0 */
    public final int mo58238f0() {
        return this.f50450v;
    }

    /* renamed from: h */
    public final void mo58239h(@C12579k String str, @C12579k C19787o oVar) {
        Intrinsics.checkNotNullParameter(str, "argumentName");
        Intrinsics.checkNotNullParameter(oVar, C19758j0.f50574d);
        this.f50449g.put(str, oVar);
    }

    @C12580l
    /* renamed from: h0 */
    public final CharSequence mo58240h0() {
        return this.f50446d;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Set<String> keySet;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f50450v * 31;
        String str = this.f50451w;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = i9 + i;
        for (NavDeepLink navDeepLink : this.f50447e) {
            int i11 = i2 * 31;
            String k = navDeepLink.mo58203k();
            if (k != null) {
                i6 = k.hashCode();
            } else {
                i6 = 0;
            }
            int i12 = (i11 + i6) * 31;
            String d = navDeepLink.mo58194d();
            if (d != null) {
                i7 = d.hashCode();
            } else {
                i7 = 0;
            }
            int i13 = (i12 + i7) * 31;
            String g = navDeepLink.mo58198g();
            if (g != null) {
                i8 = g.hashCode();
            } else {
                i8 = 0;
            }
            i10 = i13 + i8;
        }
        Iterator<T> k2 = C1888n.m7625k(this.f50448f);
        while (k2.hasNext()) {
            C19757j jVar = (C19757j) k2.next();
            int b = ((i2 * 31) + jVar.mo58433b()) * 31;
            C19761k0 c = jVar.mo58434c();
            if (c != null) {
                i4 = c.hashCode();
            } else {
                i4 = 0;
            }
            i2 = b + i4;
            Bundle a = jVar.mo58432a();
            if (!(a == null || (keySet = a.keySet()) == null)) {
                Intrinsics.checkNotNullExpressionValue(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i14 = i2 * 31;
                    Bundle a2 = jVar.mo58432a();
                    Intrinsics.checkNotNull(a2);
                    Object obj = a2.get(str2);
                    if (obj != null) {
                        i5 = obj.hashCode();
                    } else {
                        i5 = 0;
                    }
                    i2 = i14 + i5;
                }
            }
        }
        for (String str3 : mo58236Q().keySet()) {
            int hashCode = ((i2 * 31) + str3.hashCode()) * 31;
            C19787o oVar = mo58236Q().get(str3);
            if (oVar != null) {
                i3 = oVar.hashCode();
            } else {
                i3 = 0;
            }
            i2 = hashCode + i3;
        }
        return i2;
    }

    /* renamed from: i */
    public final void mo58241i(@C12579k NavDeepLink navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        Map<String, C19787o> Q = mo58236Q();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, C19787o>> it = Q.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            C19787o oVar = (C19787o) next.getValue();
            if (oVar.mo58539d() || oVar.mo58538c()) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object next2 : linkedHashMap.keySet()) {
            if (!navDeepLink.mo58195e().contains((String) next2)) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            this.f50447e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.mo58203k() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    @C12579k
    /* renamed from: i0 */
    public final String mo58242i0() {
        return this.f50443a;
    }

    @C12580l
    /* renamed from: j0 */
    public final NavGraph mo58243j0() {
        return this.f50444b;
    }

    @C12580l
    /* renamed from: l0 */
    public final String mo58244l0() {
        return this.f50451w;
    }

    /* renamed from: m0 */
    public boolean mo58245m0(@C12579k Uri uri) {
        Intrinsics.checkNotNullParameter(uri, C19758j0.f50575e);
        return mo58246n0(new C19848x(uri, (String) null, (String) null));
    }

    /* renamed from: n0 */
    public boolean mo58246n0(@C12579k C19848x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "deepLinkRequest");
        if (mo58247o0(xVar) != null) {
            return true;
        }
        return false;
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: o0 */
    public C19686b mo58247o0(@C12579k C19848x xVar) {
        Bundle bundle;
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(xVar, "navDeepLinkRequest");
        if (this.f50447e.isEmpty()) {
            return null;
        }
        C19686b bVar = null;
        for (NavDeepLink next : this.f50447e) {
            Uri c = xVar.mo58626c();
            if (c != null) {
                bundle = next.mo58197f(c, mo58236Q());
            } else {
                bundle = null;
            }
            String a = xVar.mo58624a();
            if (a == null || !Intrinsics.areEqual((Object) a, (Object) next.mo58194d())) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = z;
            String b = xVar.mo58625b();
            if (b != null) {
                i = next.mo58199h(b);
            } else {
                i = -1;
            }
            if (bundle != null || z2 || i > -1) {
                C19686b bVar2 = new C19686b(this, bundle, next.mo58204l(), z2, i);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    @C0346i
    /* renamed from: p0 */
    public void mo58054p0(@C12579k Context context, @C12579k AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C19696a.C19698b.Navigator);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        mo58234B0(obtainAttributes.getString(C19696a.C19698b.Navigator_route));
        int i = C19696a.C19698b.Navigator_android_id;
        if (obtainAttributes.hasValue(i)) {
            mo58256y0(obtainAttributes.getResourceId(i, 0));
            this.f50445c = f50441x.mo58259b(context, this.f50450v);
        }
        this.f50446d = obtainAttributes.getText(C19696a.C19698b.Navigator_android_label);
        C11079d2 d2Var = C11079d2.f28267a;
        obtainAttributes.recycle();
    }

    /* renamed from: q */
    public final void mo58248q(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "uriPattern");
        mo58241i(new NavDeepLink.C19680a().mo58215g(str).mo58212a());
    }

    @C12580l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public final Bundle mo58249r(@C12580l Bundle bundle) {
        boolean z;
        if (bundle == null) {
            Map<String, C19787o> map = this.f50449g;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.f50449g.entrySet()) {
            ((C19787o) next.getValue()).mo58540e((String) next.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry next2 : this.f50449g.entrySet()) {
                String str = (String) next2.getKey();
                C19787o oVar = (C19787o) next2.getValue();
                if (!oVar.mo58542f(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + oVar.mo58537b().mo58476c() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    /* renamed from: t0 */
    public final void mo58250t0(@C0329d0 int i, @C0329d0 int i2) {
        mo58251u0(i, new C19757j(i2, (C19761k0) null, (Bundle) null, 6, (DefaultConstructorMarker) null));
    }

    @C12579k
    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f50445c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f50450v));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f50451w;
        if (str2 == null || C11622t.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            sb.append(" route=");
            sb.append(this.f50451w);
        }
        if (this.f50446d != null) {
            sb.append(" label=");
            sb.append(this.f50446d);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: u0 */
    public final void mo58251u0(@C0329d0 int i, @C12579k C19757j jVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(jVar, "action");
        if (mo58039C0()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f50448f.mo6369t(i, jVar);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    /* renamed from: v0 */
    public final void mo58252v0(@C0329d0 int i) {
        this.f50448f.mo6373x(i);
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C11315i
    /* renamed from: w */
    public final int[] mo58253w() {
        return m91545H(this, (NavDestination) null, 1, (Object) null);
    }

    /* renamed from: w0 */
    public final void mo58254w0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "argumentName");
        this.f50449g.remove(str);
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C11315i
    /* renamed from: y */
    public final int[] mo58255y(@C12580l NavDestination navDestination) {
        NavGraph navGraph;
        C10944i iVar = new C10944i();
        NavGraph navGraph2 = this;
        while (true) {
            Intrinsics.checkNotNull(navGraph2);
            NavGraph navGraph3 = navGraph2.f50444b;
            if (navDestination != null) {
                navGraph = navDestination.f50444b;
            } else {
                navGraph = null;
            }
            if (navGraph != null) {
                NavGraph navGraph4 = navDestination.f50444b;
                Intrinsics.checkNotNull(navGraph4);
                if (navGraph4.mo58273J0(navGraph2.f50450v) == navGraph2) {
                    iVar.mo22298i(navGraph2);
                    break;
                }
            }
            if (navGraph3 == null || navGraph3.mo58280S0() != navGraph2.f50450v) {
                iVar.mo22298i(navGraph2);
            }
            if (Intrinsics.areEqual((Object) navGraph3, (Object) navDestination) || navGraph3 == null) {
                break;
            }
            navGraph2 = navGraph3;
        }
        Iterable<NavDestination> Q5 = CollectionsKt___CollectionsKt.m40557Q5(iVar);
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(Q5, 10));
        for (NavDestination navDestination2 : Q5) {
            arrayList.add(Integer.valueOf(navDestination2.f50450v));
        }
        return CollectionsKt___CollectionsKt.m40552P5(arrayList);
    }

    /* renamed from: y0 */
    public final void mo58256y0(@C0329d0 int i) {
        this.f50450v = i;
        this.f50445c = null;
    }

    /* renamed from: z0 */
    public final void mo58257z0(@C12580l CharSequence charSequence) {
        this.f50446d = charSequence;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDestination(@C12579k Navigator<? extends NavDestination> navigator) {
        this(C19795r0.f50645b.mo58564a(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}
