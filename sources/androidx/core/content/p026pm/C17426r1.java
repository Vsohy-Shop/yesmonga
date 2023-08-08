package androidx.core.content.p026pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.core.content.pm.r1 */
public class C17426r1 {

    /* renamed from: a */
    public static final String f45667a = "ShortcutXmlParser";

    /* renamed from: b */
    public static final String f45668b = "android.app.shortcuts";

    /* renamed from: c */
    public static final String f45669c = "shortcut";

    /* renamed from: d */
    public static final String f45670d = "shortcutId";

    /* renamed from: e */
    public static volatile ArrayList<String> f45671e;

    /* renamed from: f */
    public static final Object f45672f = new Object();

    /* renamed from: a */
    public static String m80000a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue((String) null, str);
        }
        return attributeValue;
    }

    @C0348i1
    @C0359n0
    /* renamed from: b */
    public static List<String> m80001b(@C0359n0 Context context) {
        if (f45671e == null) {
            synchronized (f45672f) {
                if (f45671e == null) {
                    f45671e = new ArrayList<>();
                    f45671e.addAll(m80004e(context));
                }
            }
        }
        return f45671e;
    }

    @C0359n0
    /* renamed from: c */
    public static XmlResourceParser m80002c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f45668b);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @C0344h1
    @C0359n0
    /* renamed from: d */
    public static List<String> m80003d(@C0359n0 XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String a;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                return arrayList;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f45669c.equals(name) && (a = m80000a(xmlPullParser, f45670d)) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: e */
    public static Set<String> m80004e(@C0359n0 Context context) {
        XmlResourceParser c;
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (!(queryIntentActivities == null || queryIntentActivities.size() == 0)) {
            try {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f45668b)) {
                        c = m80002c(context, activityInfo);
                        hashSet.addAll(m80003d(c));
                        if (c != null) {
                            c.close();
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return hashSet;
        throw th;
    }
}
