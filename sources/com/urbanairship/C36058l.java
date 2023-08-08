package com.urbanairship;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.content.res.C17465i;
import androidx.core.graphics.C17598i1;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.urbanairship.l */
public class C36058l {

    /* renamed from: d */
    public static final String[] f89095d = {"serif", C17598i1.f45966D, "sans-serif-light", "sans-serif-condensed", "sans-serif-thin", UbInternalTheme.defaultFont};

    /* renamed from: e */
    public static final String[] f89096e = {UbInternalTheme.defaultFont, "sans-serif-black", "cursive", "casual"};

    /* renamed from: f */
    public static final String[] f89097f = {"sans-serif-smallcaps", "serif-monospace", "monospace"};
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: g */
    public static C36058l f89098g;

    /* renamed from: a */
    public final Set<String> f89099a;

    /* renamed from: b */
    public final Map<String, Typeface> f89100b = new HashMap();

    /* renamed from: c */
    public final Context f89101c;

    public C36058l(@C0359n0 Context context) {
        HashSet hashSet = new HashSet();
        this.f89099a = hashSet;
        this.f89101c = context.getApplicationContext();
        Collections.addAll(hashSet, f89095d);
        Collections.addAll(hashSet, f89096e);
        Collections.addAll(hashSet, f89097f);
    }

    @C0359n0
    /* renamed from: d */
    public static C36058l m148401d(@C0359n0 Context context) {
        synchronized (C36058l.class) {
            if (f89098g == null) {
                f89098g = new C36058l(context);
            }
        }
        return f89098g;
    }

    /* renamed from: a */
    public synchronized void mo107813a(@C0359n0 String str, @C0359n0 Typeface typeface) {
        this.f89100b.put(str, typeface);
    }

    @C0363p0
    /* renamed from: b */
    public synchronized Typeface mo107814b(@C0359n0 String str) {
        if (this.f89100b.containsKey(str)) {
            return this.f89100b.get(str);
        }
        int identifier = this.f89101c.getResources().getIdentifier(str, "font", this.f89101c.getPackageName());
        if (identifier != 0) {
            try {
                Typeface j = C17465i.m80178j(this.f89101c, identifier);
                if (j != null) {
                    this.f89100b.put(str, j);
                    return j;
                }
            } catch (Resources.NotFoundException e) {
                C36059m.m148411g(e, "Unable to load font from resources: %s", str);
            }
        }
        if (!mo107815c(str)) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        this.f89100b.put(str, create);
        return create;
    }

    /* renamed from: c */
    public boolean mo107815c(@C0359n0 String str) {
        return this.f89099a.contains(str);
    }
}
