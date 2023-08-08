package com.contentsquare.android.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

/* renamed from: com.contentsquare.android.sdk.l4 */
public class C14493l4 {
    /* renamed from: a */
    public static String m62464a(Context context, int i, String str) {
        long j = (long) i;
        if (j == 16777215 || j == 0 || i == -1) {
            return str;
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return str;
        }
    }

    /* renamed from: b */
    public static String m62465b(View view, String str) {
        return m62464a(view.getContext(), view.getId(), str);
    }
}
