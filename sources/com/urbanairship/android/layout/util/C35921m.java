package com.urbanairship.android.layout.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.TypedValue;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import com.urbanairship.android.layout.property.Orientation;
import com.urbanairship.android.layout.property.WindowSize;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* renamed from: com.urbanairship.android.layout.util.m */
public final class C35921m {
    @C0366r
    /* renamed from: a */
    public static float m148111a(@C0359n0 Context context, @C0366r(unit = 0) int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static int m148112b(@C0359n0 Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: c */
    public static int m148113c(@C0359n0 Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    @C0363p0
    /* renamed from: d */
    public static Orientation m148114d(@C0359n0 Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            return Orientation.PORTRAIT;
        }
        if (i != 2) {
            return null;
        }
        return Orientation.LANDSCAPE;
    }

    @C0363p0
    /* renamed from: e */
    public static WindowSize m148115e(@C0359n0 Context context) {
        int i = context.getResources().getConfiguration().screenLayout & 15;
        if (i == 1) {
            return WindowSize.SMALL;
        }
        if (i == 2 || i == 3) {
            return WindowSize.MEDIUM;
        }
        if (i != 4) {
            return null;
        }
        return WindowSize.LARGE;
    }

    /* renamed from: f */
    public static boolean m148116f(@C0359n0 Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @C0359n0
    /* renamed from: g */
    public static List<String> m148117g(@C0359n0 Context context, @C0363p0 String str) {
        AssetManager assets = context.getResources().getAssets();
        if (str == null) {
            str = "";
        }
        try {
            String[] list = assets.list(str);
            ArrayList arrayList = new ArrayList();
            for (String str2 : list) {
                if (str2.endsWith(".json")) {
                    arrayList.add(str2);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: h */
    public static String m148118h(@C0359n0 Context context, @C0359n0 String str) throws IOException {
        return m148120j(context.getResources().getAssets().open(str));
    }

    @C0363p0
    /* renamed from: i */
    public static C9323b m148119i(@C0359n0 Context context, @C0359n0 String str) throws JsonException, IOException {
        return JsonValue.m34960C(m148118h(context, str)).mo18767j();
    }

    @C0359n0
    /* renamed from: j */
    public static String m148120j(@C0359n0 InputStream inputStream) {
        String str;
        Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
        try {
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            } else {
                str = "";
            }
            useDelimiter.close();
            return str;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
