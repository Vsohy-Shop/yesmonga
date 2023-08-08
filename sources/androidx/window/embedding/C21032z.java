package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.C20985a;
import androidx.window.core.C20994d;
import com.google.firebase.remoteconfig.C33585u;
import com.urbanairship.iam.events.C9175a;
import java.util.Set;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.z */
public final class C21032z {
    /* renamed from: a */
    public final ComponentName mo62892a(String str, CharSequence charSequence) {
        boolean z;
        if (charSequence != null) {
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String obj = charSequence.toString();
                if (obj.charAt(0) == '.') {
                    return new ComponentName(str, Intrinsics.stringPlus(str, obj));
                }
                int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) obj, '/', 0, false, 6, (Object) null);
                if (indexOf$default > 0) {
                    str = obj.substring(0, indexOf$default);
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    obj = obj.substring(indexOf$default + 1);
                    Intrinsics.checkNotNullExpressionValue(obj, "this as java.lang.String).substring(startIndex)");
                }
                if (Intrinsics.areEqual((Object) obj, (Object) "*") || StringsKt__StringsKt.indexOf$default((CharSequence) obj, '.', 0, false, 6, (Object) null) >= 0) {
                    return new ComponentName(str, obj);
                }
                return new ComponentName(str, str + '.' + obj);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    /* renamed from: b */
    public final C20999a mo62893b(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C20985a.C20988c.ActivityFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C20985a.C20988c.ActivityFilter_activityName);
        String string2 = obtainStyledAttributes.getString(C20985a.C20988c.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, C33585u.C33587b.f81740v3);
        return new C20999a(mo62892a(packageName, string), string2);
    }

    /* renamed from: c */
    public final C21000b mo62894c(Context context, XmlResourceParser xmlResourceParser) {
        return new C21000b(C10930d1.m40892k(), context.getTheme().obtainStyledAttributes(xmlResourceParser, C20985a.C20988c.ActivityRule, 0, 0).getBoolean(C20985a.C20988c.ActivityRule_alwaysExpand, false));
    }

    /* renamed from: d */
    public final C21025u mo62895d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C20985a.C20988c.SplitPairFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C20985a.C20988c.SplitPairFilter_primaryActivityName);
        String string2 = obtainStyledAttributes.getString(C20985a.C20988c.SplitPairFilter_secondaryActivityName);
        String string3 = obtainStyledAttributes.getString(C20985a.C20988c.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, C33585u.C33587b.f81740v3);
        return new C21025u(mo62892a(packageName, string), mo62892a(packageName, string2), string3);
    }

    /* renamed from: e */
    public final C21026v mo62896e(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C20985a.C20988c.SplitPairRule, 0, 0);
        float f = obtainStyledAttributes.getFloat(C20985a.C20988c.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C20985a.C20988c.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C20985a.C20988c.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i = obtainStyledAttributes.getInt(C20985a.C20988c.SplitPairRule_splitLayoutDirection, 3);
        return new C21026v(C10930d1.m40892k(), obtainStyledAttributes.getBoolean(C20985a.C20988c.SplitPairRule_finishPrimaryWithSecondary, false), obtainStyledAttributes.getBoolean(C20985a.C20988c.SplitPairRule_finishSecondaryWithPrimary, true), obtainStyledAttributes.getBoolean(C20985a.C20988c.SplitPairRule_clearTop, false), dimension, dimension2, f, i);
    }

    /* renamed from: f */
    public final C21027w mo62897f(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C20985a.C20988c.SplitPlaceholderRule, 0, 0);
        String string = obtainStyledAttributes.getString(C20985a.C20988c.SplitPlaceholderRule_placeholderActivityName);
        float f = obtainStyledAttributes.getFloat(C20985a.C20988c.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C20985a.C20988c.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C20985a.C20988c.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i = obtainStyledAttributes.getInt(C20985a.C20988c.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, C33585u.C33587b.f81740v3);
        ComponentName a = mo62892a(packageName, string);
        Set k = C10930d1.m40892k();
        Intent component = new Intent().setComponent(a);
        Intrinsics.checkNotNullExpressionValue(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new C21027w(k, component, dimension, dimension2, f, i);
    }

    @C12580l
    /* renamed from: g */
    public final Set<C21013m> mo62898g(@C12579k Context context, int i) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return mo62899h(context, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r5 = r3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set<androidx.window.embedding.C21013m> mo62899h(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            r1 = 0
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch:{ NotFoundException -> 0x00f2 }
            java.lang.String r0 = "resources.getXml(splitResourceId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)     // Catch:{ NotFoundException -> 0x00f2 }
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r2 = r10.getDepth()
            int r3 = r10.next()
            r4 = r1
            r5 = r4
            r6 = r5
        L_0x001e:
            r7 = 1
            if (r3 == r7) goto L_0x00f1
            r7 = 3
            if (r3 != r7) goto L_0x002a
            int r3 = r10.getDepth()
            if (r3 <= r2) goto L_0x00f1
        L_0x002a:
            int r3 = r10.getEventType()
            r7 = 2
            if (r3 != r7) goto L_0x00eb
            java.lang.String r3 = "split-config"
            java.lang.String r7 = r10.getName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r7)
            if (r3 == 0) goto L_0x003f
            goto L_0x00eb
        L_0x003f:
            java.lang.String r3 = r10.getName()
            if (r3 == 0) goto L_0x00e5
            int r7 = r3.hashCode()
            switch(r7) {
                case 511422343: goto L_0x00b0;
                case 520447504: goto L_0x009c;
                case 1579230604: goto L_0x007a;
                case 1793077963: goto L_0x0064;
                case 2050988213: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x00e5
        L_0x004e:
            java.lang.String r7 = "SplitPlaceholderRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0058
            goto L_0x00e5
        L_0x0058:
            androidx.window.embedding.w r3 = r8.mo62897f(r9, r10)
            r0.add(r3)
            r4 = r1
            r5 = r4
        L_0x0061:
            r6 = r3
            goto L_0x00e5
        L_0x0064:
            java.lang.String r7 = "ActivityRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x006e
            goto L_0x00e5
        L_0x006e:
            androidx.window.embedding.b r3 = r8.mo62894c(r9, r10)
            r0.add(r3)
            r5 = r1
            r6 = r5
        L_0x0077:
            r4 = r3
            goto L_0x00e5
        L_0x007a:
            java.lang.String r7 = "SplitPairFilter"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0083
            goto L_0x00e5
        L_0x0083:
            if (r5 == 0) goto L_0x0094
            androidx.window.embedding.u r3 = r8.mo62895d(r9, r10)
            r0.remove(r5)
            androidx.window.embedding.v r3 = r5.mo62882j(r3)
            r0.add(r3)
            goto L_0x00ae
        L_0x0094:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Found orphaned SplitPairFilter outside of SplitPairRule"
            r9.<init>(r10)
            throw r9
        L_0x009c:
            java.lang.String r7 = "SplitPairRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x00a5
            goto L_0x00e5
        L_0x00a5:
            androidx.window.embedding.v r3 = r8.mo62896e(r9, r10)
            r0.add(r3)
            r4 = r1
            r6 = r4
        L_0x00ae:
            r5 = r3
            goto L_0x00e5
        L_0x00b0:
            java.lang.String r7 = "ActivityFilter"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x00b9
            goto L_0x00e5
        L_0x00b9:
            if (r4 != 0) goto L_0x00c6
            if (r6 == 0) goto L_0x00be
            goto L_0x00c6
        L_0x00be:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Found orphaned ActivityFilter"
            r9.<init>(r10)
            throw r9
        L_0x00c6:
            androidx.window.embedding.a r3 = r8.mo62893b(r9, r10)
            if (r4 == 0) goto L_0x00d7
            r0.remove(r4)
            androidx.window.embedding.b r3 = r4.mo62796c(r3)
            r0.add(r3)
            goto L_0x0077
        L_0x00d7:
            if (r6 == 0) goto L_0x00e5
            r0.remove(r6)
            androidx.window.embedding.w r3 = r6.mo62885h(r3)
            r0.add(r3)
            goto L_0x0061
        L_0x00e5:
            int r3 = r10.next()
            goto L_0x001e
        L_0x00eb:
            int r3 = r10.next()
            goto L_0x001e
        L_0x00f1:
            return r0
        L_0x00f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.C21032z.mo62899h(android.content.Context, int):java.util.Set");
    }
}
