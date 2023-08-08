package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import androidx.navigation.C19761k0;
import androidx.navigation.C19844w0;
import androidx.navigation.NavDeepLink;
import androidx.navigation.common.C19696a;
import com.urbanairship.iam.events.C9175a;
import java.io.IOException;
import kotlin.C11079d2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.navigation.j0 */
public final class C19758j0 {
    @C12579k

    /* renamed from: c */
    public static final C19759a f50573c = new C19759a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final String f50574d = "argument";
    @C12579k

    /* renamed from: e */
    public static final String f50575e = "deepLink";
    @C12579k

    /* renamed from: f */
    public static final String f50576f = "action";
    @C12579k

    /* renamed from: g */
    public static final String f50577g = "include";
    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: h */
    public static final String f50578h = "${applicationId}";
    @C12579k

    /* renamed from: i */
    public static final ThreadLocal<TypedValue> f50579i = new ThreadLocal<>();
    @C12579k

    /* renamed from: a */
    public final Context f50580a;
    @C12579k

    /* renamed from: b */
    public final C19795r0 f50581b;

    /* renamed from: androidx.navigation.j0$a */
    public static final class C19759a {
        public /* synthetic */ C19759a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19769n0<?> mo58444a(@C12579k TypedValue typedValue, @C12580l C19769n0<?> n0Var, @C12579k C19769n0<?> n0Var2, @C12580l String str, @C12579k String str2) throws XmlPullParserException {
            Intrinsics.checkNotNullParameter(typedValue, "value");
            Intrinsics.checkNotNullParameter(n0Var2, "expectedNavType");
            Intrinsics.checkNotNullParameter(str2, "foundType");
            if (n0Var != null && n0Var != n0Var2) {
                throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
            } else if (n0Var == null) {
                return n0Var2;
            } else {
                return n0Var;
            }
        }

        public C19759a() {
        }
    }

    public C19758j0(@C12579k Context context, @C12579k C19795r0 r0Var) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(r0Var, "navigatorProvider");
        this.f50580a = context;
        this.f50581b = r0Var;
    }

    /* renamed from: a */
    public final NavDestination mo58437a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        C19795r0 r0Var = this.f50581b;
        String name = xmlResourceParser.getName();
        Intrinsics.checkNotNullExpressionValue(name, "parser.name");
        NavDestination a = r0Var.mo58562f(name).mo58032a();
        a.mo58054p0(this.f50580a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return a;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (Intrinsics.areEqual((Object) f50574d, (Object) name2)) {
                    mo58442f(resources, a, attributeSet, i);
                } else if (Intrinsics.areEqual((Object) f50575e, (Object) name2)) {
                    mo58443g(resources, a, attributeSet);
                } else if (Intrinsics.areEqual((Object) "action", (Object) name2)) {
                    mo58439c(resources, a, attributeSet, xmlResourceParser, i);
                } else if (Intrinsics.areEqual((Object) "include", (Object) name2) && (a instanceof NavGraph)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C19844w0.C19847c.NavInclude);
                    Intrinsics.checkNotNullExpressionValue(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((NavGraph) a).mo58270G0(mo58438b(obtainAttributes.getResourceId(C19844w0.C19847c.NavInclude_graph, 0)));
                    C11079d2 d2Var = C11079d2.f28267a;
                    obtainAttributes.recycle();
                } else if (a instanceof NavGraph) {
                    ((NavGraph) a).mo58270G0(mo58437a(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b A[Catch:{ Exception -> 0x0065, all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[Catch:{ Exception -> 0x0065, all -> 0x0063 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.navigation.NavGraph mo58438b(@androidx.annotation.C0357m0 int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f50580a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            java.lang.String r2 = "res.getXml(graphResId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x0013:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0065 }
            r4 = 2
            if (r3 == r4) goto L_0x001d
            r5 = 1
            if (r3 != r5) goto L_0x0013
        L_0x001d:
            if (r3 != r4) goto L_0x005b
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "res"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch:{ Exception -> 0x0065 }
            androidx.navigation.NavDestination r2 = r6.mo58437a(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0065 }
            boolean r4 = r2 instanceof androidx.navigation.NavGraph     // Catch:{ Exception -> 0x0065 }
            if (r4 == 0) goto L_0x003b
            androidx.navigation.NavGraph r2 = (androidx.navigation.NavGraph) r2     // Catch:{ Exception -> 0x0065 }
            r1.close()
            return r2
        L_0x003b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065 }
            r2.<init>()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r4 = "Root element <"
            r2.append(r4)     // Catch:{ Exception -> 0x0065 }
            r2.append(r3)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r2.append(r3)     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0065 }
            throw r3     // Catch:{ Exception -> 0x0065 }
        L_0x005b:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0065 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0065 }
            throw r2     // Catch:{ Exception -> 0x0065 }
        L_0x0063:
            r7 = move-exception
            goto L_0x008d
        L_0x0065:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r4.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0063 }
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0063 }
            r4.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0063 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0063 }
            throw r3     // Catch:{ all -> 0x0063 }
        L_0x008d:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C19758j0.mo58438b(int):androidx.navigation.NavGraph");
    }

    /* renamed from: c */
    public final void mo58439c(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) throws IOException, XmlPullParserException {
        int depth;
        Context context = this.f50580a;
        int[] iArr = C19696a.C19698b.NavAction;
        Intrinsics.checkNotNullExpressionValue(iArr, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C19696a.C19698b.NavAction_android_id, 0);
        C19757j jVar = new C19757j(obtainStyledAttributes.getResourceId(C19696a.C19698b.NavAction_destination, 0), (C19761k0) null, (Bundle) null, 6, (DefaultConstructorMarker) null);
        C19761k0.C19762a aVar = new C19761k0.C19762a();
        aVar.mo58466d(obtainStyledAttributes.getBoolean(C19696a.C19698b.NavAction_launchSingleTop, false));
        aVar.mo58473m(obtainStyledAttributes.getBoolean(C19696a.C19698b.NavAction_restoreState, false));
        aVar.mo58470h(obtainStyledAttributes.getResourceId(C19696a.C19698b.NavAction_popUpTo, -1), obtainStyledAttributes.getBoolean(C19696a.C19698b.NavAction_popUpToInclusive, false), obtainStyledAttributes.getBoolean(C19696a.C19698b.NavAction_popUpToSaveState, false));
        aVar.mo58464b(obtainStyledAttributes.getResourceId(C19696a.C19698b.NavAction_enterAnim, -1));
        aVar.mo58465c(obtainStyledAttributes.getResourceId(C19696a.C19698b.NavAction_exitAnim, -1));
        aVar.mo58467e(obtainStyledAttributes.getResourceId(C19696a.C19698b.NavAction_popEnterAnim, -1));
        aVar.mo58468f(obtainStyledAttributes.getResourceId(C19696a.C19698b.NavAction_popExitAnim, -1));
        jVar.mo58436e(aVar.mo58463a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && ((depth = xmlResourceParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2 && Intrinsics.areEqual((Object) f50574d, (Object) xmlResourceParser.getName())) {
                    mo58441e(resources, bundle, attributeSet, i);
                }
            }
        }
        if (!bundle.isEmpty()) {
            jVar.mo58435d(bundle);
        }
        navDestination.mo58251u0(resourceId, jVar);
        obtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: androidx.navigation.n0<java.lang.Float>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: androidx.navigation.n0<java.lang.Integer>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: androidx.navigation.n0<java.lang.Boolean>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: androidx.navigation.n0<java.lang.Float>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: androidx.navigation.n0<java.lang.Integer>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: androidx.navigation.n0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: androidx.navigation.n0<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.navigation.C19787o mo58440d(android.content.res.TypedArray r11, android.content.res.Resources r12, int r13) throws org.xmlpull.v1.XmlPullParserException {
        /*
            r10 = this;
            androidx.navigation.o$a r0 = new androidx.navigation.o$a
            r0.<init>()
            int r1 = androidx.navigation.common.C19696a.C19698b.NavArgument_nullable
            r2 = 0
            boolean r1 = r11.getBoolean(r1, r2)
            r0.mo58547c(r1)
            java.lang.ThreadLocal<android.util.TypedValue> r1 = f50579i
            java.lang.Object r3 = r1.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0021
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r1.set(r3)
        L_0x0021:
            int r1 = androidx.navigation.common.C19696a.C19698b.NavArgument_argType
            java.lang.String r8 = r11.getString(r1)
            r1 = 0
            if (r8 == 0) goto L_0x0036
            androidx.navigation.n0$l r4 = androidx.navigation.C19769n0.f50610c
            java.lang.String r13 = r12.getResourcePackageName(r13)
            androidx.navigation.n0 r13 = r4.mo58515a(r8, r13)
            r6 = r13
            goto L_0x0037
        L_0x0036:
            r6 = r1
        L_0x0037:
            int r13 = androidx.navigation.common.C19696a.C19698b.NavArgument_android_defaultValue
            boolean r4 = r11.getValue(r13, r3)
            if (r4 == 0) goto L_0x0179
            androidx.navigation.n0<java.lang.Integer> r1 = androidx.navigation.C19769n0.f50612e
            java.lang.String r4 = "' for "
            java.lang.String r5 = "unsupported value '"
            r7 = 16
            if (r6 != r1) goto L_0x0083
            int r11 = r3.resourceId
            if (r11 == 0) goto L_0x004f
            r2 = r11
            goto L_0x0057
        L_0x004f:
            int r11 = r3.type
            if (r11 != r7) goto L_0x005d
            int r11 = r3.data
            if (r11 != 0) goto L_0x005d
        L_0x0057:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x0179
        L_0x005d:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.CharSequence r13 = r3.string
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = r6.mo58476c()
            r12.append(r13)
            java.lang.String r13 = ". Must be a reference to a resource."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0083:
            int r9 = r3.resourceId
            if (r9 == 0) goto L_0x00c3
            if (r6 != 0) goto L_0x0091
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r6 = r1
            r1 = r11
            goto L_0x0179
        L_0x0091:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.CharSequence r13 = r3.string
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = r6.mo58476c()
            r12.append(r13)
            java.lang.String r13 = ". You must use a \""
            r12.append(r13)
            java.lang.String r13 = r1.mo58476c()
            r12.append(r13)
            java.lang.String r13 = "\" type to reference other resources."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c3:
            androidx.navigation.n0<java.lang.String> r1 = androidx.navigation.C19769n0.f50620m
            if (r6 != r1) goto L_0x00cd
            java.lang.String r1 = r11.getString(r13)
            goto L_0x0179
        L_0x00cd:
            int r11 = r3.type
            r13 = 3
            if (r11 == r13) goto L_0x0166
            r13 = 4
            if (r11 == r13) goto L_0x0152
            r13 = 5
            if (r11 == r13) goto L_0x0139
            r12 = 18
            if (r11 == r12) goto L_0x0124
            if (r11 < r7) goto L_0x010b
            r12 = 31
            if (r11 > r12) goto L_0x010b
            androidx.navigation.n0<java.lang.Float> r7 = androidx.navigation.C19769n0.f50616i
            if (r6 != r7) goto L_0x00f8
            androidx.navigation.j0$a r4 = f50573c
            java.lang.String r9 = "float"
            r5 = r3
            androidx.navigation.n0 r6 = r4.mo58444a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            float r11 = (float) r11
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            goto L_0x0179
        L_0x00f8:
            androidx.navigation.j0$a r4 = f50573c
            androidx.navigation.n0<java.lang.Integer> r7 = androidx.navigation.C19769n0.f50611d
            java.lang.String r9 = "integer"
            r5 = r3
            androidx.navigation.n0 r6 = r4.mo58444a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0179
        L_0x010b:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "unsupported argument type "
            r12.append(r13)
            int r13 = r3.type
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0124:
            androidx.navigation.j0$a r4 = f50573c
            androidx.navigation.n0<java.lang.Boolean> r7 = androidx.navigation.C19769n0.f50618k
            java.lang.String r9 = "boolean"
            r5 = r3
            androidx.navigation.n0 r6 = r4.mo58444a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            if (r11 == 0) goto L_0x0134
            r2 = 1
        L_0x0134:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x0179
        L_0x0139:
            androidx.navigation.j0$a r4 = f50573c
            androidx.navigation.n0<java.lang.Integer> r7 = androidx.navigation.C19769n0.f50611d
            java.lang.String r9 = "dimension"
            r5 = r3
            androidx.navigation.n0 r6 = r4.mo58444a(r5, r6, r7, r8, r9)
            android.util.DisplayMetrics r11 = r12.getDisplayMetrics()
            float r11 = r3.getDimension(r11)
            int r11 = (int) r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x0179
        L_0x0152:
            androidx.navigation.j0$a r4 = f50573c
            androidx.navigation.n0<java.lang.Float> r7 = androidx.navigation.C19769n0.f50616i
            java.lang.String r9 = "float"
            r5 = r3
            androidx.navigation.n0 r6 = r4.mo58444a(r5, r6, r7, r8, r9)
            float r11 = r3.getFloat()
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            goto L_0x0179
        L_0x0166:
            java.lang.CharSequence r11 = r3.string
            java.lang.String r11 = r11.toString()
            if (r6 != 0) goto L_0x0175
            androidx.navigation.n0$l r12 = androidx.navigation.C19769n0.f50610c
            androidx.navigation.n0 r12 = r12.mo58516b(r11)
            r6 = r12
        L_0x0175:
            java.lang.Object r1 = r6.mo58479h(r11)
        L_0x0179:
            if (r1 == 0) goto L_0x017e
            r0.mo58546b(r1)
        L_0x017e:
            if (r6 == 0) goto L_0x0183
            r0.mo58548d(r6)
        L_0x0183:
            androidx.navigation.o r11 = r0.mo58545a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C19758j0.mo58440d(android.content.res.TypedArray, android.content.res.Resources, int):androidx.navigation.o");
    }

    /* renamed from: e */
    public final void mo58441e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C19696a.C19698b.NavArgument);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(C19696a.C19698b.NavArgument_android_name);
        if (string != null) {
            Intrinsics.checkNotNullExpressionValue(string, "array.getString(R.stylea…uments must have a name\")");
            C19787o d = mo58440d(obtainAttributes, resources, i);
            if (d.mo58538c()) {
                d.mo58540e(string, bundle);
            }
            C11079d2 d2Var = C11079d2.f28267a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: f */
    public final void mo58442f(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C19696a.C19698b.NavArgument);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(C19696a.C19698b.NavArgument_android_name);
        if (string != null) {
            Intrinsics.checkNotNullExpressionValue(string, "array.getString(R.stylea…uments must have a name\")");
            navDestination.mo58239h(string, mo58440d(obtainAttributes, resources, i));
            C11079d2 d2Var = C11079d2.f28267a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: g */
    public final void mo58443g(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        boolean z;
        boolean z2;
        boolean z3;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C19696a.C19698b.NavDeepLink);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(C19696a.C19698b.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(C19696a.C19698b.NavDeepLink_action);
        String string3 = obtainAttributes.getString(C19696a.C19698b.NavDeepLink_mimeType);
        boolean z4 = false;
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (string2 == null || string2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (string3 == null || string3.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        NavDeepLink.C19680a aVar = new NavDeepLink.C19680a();
        if (string != null) {
            String packageName = this.f50580a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            aVar.mo58215g(C11622t.replace$default(string, f50578h, packageName, false, 4, (Object) null));
        }
        if (string2 == null || string2.length() == 0) {
            z4 = true;
        }
        if (!z4) {
            String packageName2 = this.f50580a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
            aVar.mo58213e(C11622t.replace$default(string2, f50578h, packageName2, false, 4, (Object) null));
        }
        if (string3 != null) {
            String packageName3 = this.f50580a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName3, "context.packageName");
            aVar.mo58214f(C11622t.replace$default(string3, f50578h, packageName3, false, 4, (Object) null));
        }
        navDestination.mo58241i(aVar.mo58212a());
        C11079d2 d2Var = C11079d2.f28267a;
        obtainAttributes.recycle();
    }
}
