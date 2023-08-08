package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.view.C0538d;
import androidx.core.content.C17318d;
import androidx.core.content.res.C17465i;

/* renamed from: com.bumptech.glide.load.resource.drawable.h */
public final class C22462h {

    /* renamed from: a */
    public static volatile boolean f57597a = true;

    /* renamed from: a */
    public static Drawable m101922a(Context context, @C0375v int i, @C0363p0 Resources.Theme theme) {
        return m101924c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m101923b(Context context, Context context2, @C0375v int i) {
        return m101924c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    public static Drawable m101924c(Context context, Context context2, @C0375v int i, @C0363p0 Resources.Theme theme) {
        try {
            if (f57597a) {
                return m101926e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f57597a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C17318d.m79726i(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m101925d(context2, i, theme);
    }

    /* renamed from: d */
    public static Drawable m101925d(Context context, @C0375v int i, @C0363p0 Resources.Theme theme) {
        return C17465i.m80175g(context.getResources(), i, theme);
    }

    /* renamed from: e */
    public static Drawable m101926e(Context context, @C0375v int i, @C0363p0 Resources.Theme theme) {
        if (theme != null) {
            context = new C0538d(context, theme);
        }
        return C0507a.m2346b(context, i);
    }
}
